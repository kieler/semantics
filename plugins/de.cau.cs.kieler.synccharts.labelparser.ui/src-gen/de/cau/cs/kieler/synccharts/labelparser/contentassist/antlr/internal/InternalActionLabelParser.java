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
            ruleMemo = new HashMap[227+1];
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

                if ( (LA1_1==EOF||LA1_1==RULE_ID||LA1_1==RULE_STRING||(LA1_1>=28 && LA1_1<=29)) ) {
                    alt1=1;
                }
                else if ( (LA1_1==31) ) {
                    alt1=2;
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


    // $ANTLR start rule__UnaryOrNormalExpression__Alternatives
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1173:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );
    public final void rule__UnaryOrNormalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1177:1: ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt7=1;
                }
                break;
            case 15:
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==29) ) {
                    int LA7_4 = input.LA(3);

                    if ( ((LA7_4>=RULE_INT && LA7_4<=RULE_STRING)||(LA7_4>=14 && LA7_4<=15)||LA7_4==29) ) {
                        alt7=2;
                    }
                    else if ( (LA7_4==13) ) {
                        int LA7_6 = input.LA(4);

                        if ( (LA7_6==RULE_ID) ) {
                            int LA7_7 = input.LA(5);

                            if ( ((LA7_7>=16 && LA7_7<=17)||(LA7_7>=19 && LA7_7<=27)) ) {
                                alt7=2;
                            }
                            else if ( (LA7_7==30) ) {
                                int LA7_8 = input.LA(6);

                                if ( (LA7_8==EOF||LA7_8==RULE_ID||LA7_8==RULE_STRING||(LA7_8>=16 && LA7_8<=18)||LA7_8==28||LA7_8==30) ) {
                                    alt7=2;
                                }
                                else if ( ((LA7_8>=19 && LA7_8<=27)) ) {
                                    alt7=3;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1173:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );", 7, 8, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1173:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );", 7, 7, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("1173:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );", 7, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1173:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );", 7, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1173:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );", 7, 2, input);

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
                alt7=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1173:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1178:1: ( ruleUnaryOperation )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1178:1: ( ruleUnaryOperation )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1179:1: ruleUnaryOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getUnaryOrNormalExpressionAccess().getUnaryOperationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleUnaryOperation_in_rule__UnaryOrNormalExpression__Alternatives2477);
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
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1184:6: ( ruleUnaryParanthesedOperation )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1184:6: ( ruleUnaryParanthesedOperation )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1185:1: ruleUnaryParanthesedOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getUnaryOrNormalExpressionAccess().getUnaryParanthesedOperationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleUnaryParanthesedOperation_in_rule__UnaryOrNormalExpression__Alternatives2494);
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
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1190:6: ( ruleParanthesedBooleanExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1190:6: ( ruleParanthesedBooleanExpression )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1191:1: ruleParanthesedBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getUnaryOrNormalExpressionAccess().getParanthesedBooleanExpressionParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleParanthesedBooleanExpression_in_rule__UnaryOrNormalExpression__Alternatives2511);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1201:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleHostCode ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );
    public final void rule__ParanthesedBooleanExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1205:1: ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleHostCode ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt8=1;
                }
                break;
            case RULE_INT:
            case RULE_FLOAT:
            case 15:
                {
                alt8=2;
                }
                break;
            case 13:
                {
                int LA8_3 = input.LA(2);

                if ( (LA8_3==RULE_ID) ) {
                    int LA8_7 = input.LA(3);

                    if ( (LA8_7==EOF||LA8_7==RULE_ID||LA8_7==RULE_STRING||(LA8_7>=16 && LA8_7<=18)||LA8_7==28||LA8_7==30) ) {
                        alt8=4;
                    }
                    else if ( ((LA8_7>=19 && LA8_7<=27)) ) {
                        alt8=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1201:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleHostCode ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 8, 7, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1201:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleHostCode ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 8, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA8_4 = input.LA(2);

                if ( ((LA8_4>=19 && LA8_4<=27)) ) {
                    alt8=2;
                }
                else if ( (LA8_4==EOF||LA8_4==RULE_ID||LA8_4==RULE_STRING||(LA8_4>=16 && LA8_4<=18)||LA8_4==28||LA8_4==30) ) {
                    alt8=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1201:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleHostCode ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 8, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case 29:
                    {
                    int LA8_9 = input.LA(3);

                    if ( (LA8_9==RULE_ID) ) {
                        int LA8_13 = input.LA(4);

                        if ( (LA8_13==30) ) {
                            int LA8_14 = input.LA(5);

                            if ( (LA8_14==EOF||LA8_14==RULE_ID||LA8_14==RULE_STRING||(LA8_14>=16 && LA8_14<=18)||LA8_14==28||LA8_14==30) ) {
                                alt8=5;
                            }
                            else if ( ((LA8_14>=19 && LA8_14<=27)) ) {
                                alt8=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1201:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleHostCode ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 8, 14, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("1201:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleHostCode ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 8, 13, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1201:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleHostCode ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 8, 9, input);

                        throw nvae;
                    }
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
                    alt8=5;
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
                    alt8=2;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1201:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleHostCode ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 8, 5, input);

                    throw nvae;
                }

                }
                break;
            case 29:
                {
                int LA8_6 = input.LA(2);

                if ( (synpred16()) ) {
                    alt8=2;
                }
                else if ( (true) ) {
                    alt8=6;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1201:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleHostCode ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 8, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1201:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleHostCode ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1206:1: ( ruleBooleanValue )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1206:1: ( ruleBooleanValue )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1207:1: ruleBooleanValue
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedBooleanExpressionAccess().getBooleanValueParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanValue_in_rule__ParanthesedBooleanExpression__Alternatives2543);
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
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1212:6: ( ruleCompareOperation )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1212:6: ( ruleCompareOperation )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1213:1: ruleCompareOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedBooleanExpressionAccess().getCompareOperationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleCompareOperation_in_rule__ParanthesedBooleanExpression__Alternatives2560);
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
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1218:6: ( ruleSignalReference )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1218:6: ( ruleSignalReference )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1219:1: ruleSignalReference
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedBooleanExpressionAccess().getSignalReferenceParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleSignalReference_in_rule__ParanthesedBooleanExpression__Alternatives2577);
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
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1224:6: ( ruleValOperation )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1224:6: ( ruleValOperation )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1225:1: ruleValOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedBooleanExpressionAccess().getValOperationParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleValOperation_in_rule__ParanthesedBooleanExpression__Alternatives2594);
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
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1230:6: ( ruleHostCode )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1230:6: ( ruleHostCode )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1231:1: ruleHostCode
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedBooleanExpressionAccess().getHostCodeParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleHostCode_in_rule__ParanthesedBooleanExpression__Alternatives2611);
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
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1236:6: ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1236:6: ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1237:1: ( rule__ParanthesedBooleanExpression__Group_5__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedBooleanExpressionAccess().getGroup_5()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1238:1: ( rule__ParanthesedBooleanExpression__Group_5__0 )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1238:2: rule__ParanthesedBooleanExpression__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__ParanthesedBooleanExpression__Group_5__0_in_rule__ParanthesedBooleanExpression__Alternatives2628);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1248:1: rule__CompareOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1252:1: ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt9=1;
                }
                break;
            case 20:
                {
                alt9=2;
                }
                break;
            case 21:
                {
                alt9=3;
                }
                break;
            case 22:
                {
                alt9=4;
                }
                break;
            case 23:
                {
                alt9=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1248:1: rule__CompareOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1253:1: ( ( '=' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1253:1: ( ( '=' ) )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1254:1: ( '=' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1255:1: ( '=' )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1255:3: '='
                    {
                    match(input,19,FOLLOW_19_in_rule__CompareOperator__Alternatives2663); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1260:6: ( ( '<' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1260:6: ( ( '<' ) )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1261:1: ( '<' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1262:1: ( '<' )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1262:3: '<'
                    {
                    match(input,20,FOLLOW_20_in_rule__CompareOperator__Alternatives2684); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1267:6: ( ( '<=' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1267:6: ( ( '<=' ) )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1268:1: ( '<=' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1269:1: ( '<=' )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1269:3: '<='
                    {
                    match(input,21,FOLLOW_21_in_rule__CompareOperator__Alternatives2705); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1274:6: ( ( '>' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1274:6: ( ( '>' ) )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1275:1: ( '>' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1276:1: ( '>' )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1276:3: '>'
                    {
                    match(input,22,FOLLOW_22_in_rule__CompareOperator__Alternatives2726); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1281:6: ( ( '>=' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1281:6: ( ( '>=' ) )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1282:1: ( '>=' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1283:1: ( '>=' )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1283:3: '>='
                    {
                    match(input,23,FOLLOW_23_in_rule__CompareOperator__Alternatives2747); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1293:1: rule__PlusOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__PlusOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1297:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            else if ( (LA10_0==25) ) {
                alt10=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1293:1: rule__PlusOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1298:1: ( ( '+' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1298:1: ( ( '+' ) )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1299:1: ( '+' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPlusOperatorAccess().getADDEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1300:1: ( '+' )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1300:3: '+'
                    {
                    match(input,24,FOLLOW_24_in_rule__PlusOperator__Alternatives2783); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getPlusOperatorAccess().getADDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1305:6: ( ( '-' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1305:6: ( ( '-' ) )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1306:1: ( '-' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPlusOperatorAccess().getSUBEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1307:1: ( '-' )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1307:3: '-'
                    {
                    match(input,25,FOLLOW_25_in_rule__PlusOperator__Alternatives2804); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1317:1: rule__MultOperator__Alternatives : ( ( ( '*' ) ) | ( ( 'mod' ) ) );
    public final void rule__MultOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1321:1: ( ( ( '*' ) ) | ( ( 'mod' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            else if ( (LA11_0==27) ) {
                alt11=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1317:1: rule__MultOperator__Alternatives : ( ( ( '*' ) ) | ( ( 'mod' ) ) );", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1322:1: ( ( '*' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1322:1: ( ( '*' ) )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1323:1: ( '*' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1324:1: ( '*' )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1324:3: '*'
                    {
                    match(input,26,FOLLOW_26_in_rule__MultOperator__Alternatives2840); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1329:6: ( ( 'mod' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1329:6: ( ( 'mod' ) )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1330:1: ( 'mod' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMultOperatorAccess().getMODEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1331:1: ( 'mod' )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1331:3: 'mod'
                    {
                    match(input,27,FOLLOW_27_in_rule__MultOperator__Alternatives2861); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1343:1: rule__Action__Group__0 : ( ( rule__Action__IsImmediateAssignment_0 )? ) rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1347:1: ( ( ( rule__Action__IsImmediateAssignment_0 )? ) rule__Action__Group__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1348:1: ( ( rule__Action__IsImmediateAssignment_0 )? ) rule__Action__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1348:1: ( ( rule__Action__IsImmediateAssignment_0 )? )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1349:1: ( rule__Action__IsImmediateAssignment_0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getIsImmediateAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1350:1: ( rule__Action__IsImmediateAssignment_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1350:2: rule__Action__IsImmediateAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Action__IsImmediateAssignment_0_in_rule__Action__Group__02898);
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

            pushFollow(FOLLOW_rule__Action__Group__1_in_rule__Action__Group__02908);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1361:1: rule__Action__Group__1 : ( ( rule__Action__DelayAssignment_1 )? ) rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1365:1: ( ( ( rule__Action__DelayAssignment_1 )? ) rule__Action__Group__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1366:1: ( ( rule__Action__DelayAssignment_1 )? ) rule__Action__Group__2
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1366:1: ( ( rule__Action__DelayAssignment_1 )? )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1367:1: ( rule__Action__DelayAssignment_1 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getDelayAssignment_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1368:1: ( rule__Action__DelayAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==EOF||(LA13_1>=RULE_INT && LA13_1<=RULE_STRING)||(LA13_1>=13 && LA13_1<=15)||LA13_1==18||LA13_1==29) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1368:2: rule__Action__DelayAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Action__DelayAssignment_1_in_rule__Action__Group__12936);
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

            pushFollow(FOLLOW_rule__Action__Group__2_in_rule__Action__Group__12946);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1379:1: rule__Action__Group__2 : ( ( rule__Action__TriggerAssignment_2 )? ) rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1383:1: ( ( ( rule__Action__TriggerAssignment_2 )? ) rule__Action__Group__3 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1384:1: ( ( rule__Action__TriggerAssignment_2 )? ) rule__Action__Group__3
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1384:1: ( ( rule__Action__TriggerAssignment_2 )? )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1385:1: ( rule__Action__TriggerAssignment_2 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getTriggerAssignment_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1386:1: ( rule__Action__TriggerAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_INT && LA14_0<=RULE_STRING)||(LA14_0>=13 && LA14_0<=15)||LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1386:2: rule__Action__TriggerAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Action__TriggerAssignment_2_in_rule__Action__Group__22974);
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

            pushFollow(FOLLOW_rule__Action__Group__3_in_rule__Action__Group__22984);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1397:1: rule__Action__Group__3 : ( ( rule__Action__Group_3__0 )? ) ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1401:1: ( ( ( rule__Action__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1402:1: ( ( rule__Action__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1402:1: ( ( rule__Action__Group_3__0 )? )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1403:1: ( rule__Action__Group_3__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getGroup_3()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1404:1: ( rule__Action__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1404:2: rule__Action__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Action__Group_3__0_in_rule__Action__Group__33012);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1422:1: rule__Action__Group_3__0 : ( '/' ) rule__Action__Group_3__1 ;
    public final void rule__Action__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1426:1: ( ( '/' ) rule__Action__Group_3__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1427:1: ( '/' ) rule__Action__Group_3__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1427:1: ( '/' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1428:1: '/'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getSolidusKeyword_3_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__Action__Group_3__03056); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getActionAccess().getSolidusKeyword_3_0()); 
            }

            }

            pushFollow(FOLLOW_rule__Action__Group_3__1_in_rule__Action__Group_3__03066);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1442:1: rule__Action__Group_3__1 : ( ( rule__Action__Group_3_1__0 )* ) ;
    public final void rule__Action__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1446:1: ( ( ( rule__Action__Group_3_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1447:1: ( ( rule__Action__Group_3_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1447:1: ( ( rule__Action__Group_3_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1448:1: ( rule__Action__Group_3_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getGroup_3_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1449:1: ( rule__Action__Group_3_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||LA16_0==RULE_STRING) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1449:2: rule__Action__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Action__Group_3_1__0_in_rule__Action__Group_3__13094);
            	    rule__Action__Group_3_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1463:1: rule__Action__Group_3_1__0 : ( ( rule__Action__EffectsAssignment_3_1_0 ) ) rule__Action__Group_3_1__1 ;
    public final void rule__Action__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1467:1: ( ( ( rule__Action__EffectsAssignment_3_1_0 ) ) rule__Action__Group_3_1__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1468:1: ( ( rule__Action__EffectsAssignment_3_1_0 ) ) rule__Action__Group_3_1__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1468:1: ( ( rule__Action__EffectsAssignment_3_1_0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1469:1: ( rule__Action__EffectsAssignment_3_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getEffectsAssignment_3_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1470:1: ( rule__Action__EffectsAssignment_3_1_0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1470:2: rule__Action__EffectsAssignment_3_1_0
            {
            pushFollow(FOLLOW_rule__Action__EffectsAssignment_3_1_0_in_rule__Action__Group_3_1__03133);
            rule__Action__EffectsAssignment_3_1_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getActionAccess().getEffectsAssignment_3_1_0()); 
            }

            }

            pushFollow(FOLLOW_rule__Action__Group_3_1__1_in_rule__Action__Group_3_1__03142);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1481:1: rule__Action__Group_3_1__1 : ( ( ',' )? ) ;
    public final void rule__Action__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1485:1: ( ( ( ',' )? ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1486:1: ( ( ',' )? )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1486:1: ( ( ',' )? )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1487:1: ( ',' )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getCommaKeyword_3_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1488:1: ( ',' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1489:2: ','
                    {
                    match(input,28,FOLLOW_28_in_rule__Action__Group_3_1__13172); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1504:1: rule__Emission__Group__0 : ( ( rule__Emission__SignalAssignment_0 ) ) rule__Emission__Group__1 ;
    public final void rule__Emission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1508:1: ( ( ( rule__Emission__SignalAssignment_0 ) ) rule__Emission__Group__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1509:1: ( ( rule__Emission__SignalAssignment_0 ) ) rule__Emission__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1509:1: ( ( rule__Emission__SignalAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1510:1: ( rule__Emission__SignalAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getSignalAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1511:1: ( rule__Emission__SignalAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1511:2: rule__Emission__SignalAssignment_0
            {
            pushFollow(FOLLOW_rule__Emission__SignalAssignment_0_in_rule__Emission__Group__03213);
            rule__Emission__SignalAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getSignalAssignment_0()); 
            }

            }

            pushFollow(FOLLOW_rule__Emission__Group__1_in_rule__Emission__Group__03222);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1522:1: rule__Emission__Group__1 : ( ( rule__Emission__Alternatives_1 )? ) ;
    public final void rule__Emission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1526:1: ( ( ( rule__Emission__Alternatives_1 )? ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1527:1: ( ( rule__Emission__Alternatives_1 )? )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1527:1: ( ( rule__Emission__Alternatives_1 )? )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1528:1: ( rule__Emission__Alternatives_1 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getAlternatives_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1529:1: ( rule__Emission__Alternatives_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1529:2: rule__Emission__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__Emission__Alternatives_1_in_rule__Emission__Group__13250);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1543:1: rule__Emission__Group_1_0__0 : ( '(' ) rule__Emission__Group_1_0__1 ;
    public final void rule__Emission__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1547:1: ( ( '(' ) rule__Emission__Group_1_0__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1548:1: ( '(' ) rule__Emission__Group_1_0__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1548:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1549:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_0_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__Emission__Group_1_0__03290); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_0_0()); 
            }

            }

            pushFollow(FOLLOW_rule__Emission__Group_1_0__1_in_rule__Emission__Group_1_0__03300);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1563:1: rule__Emission__Group_1_0__1 : ( ( rule__Emission__NewValueAssignment_1_0_1 ) ) rule__Emission__Group_1_0__2 ;
    public final void rule__Emission__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1567:1: ( ( ( rule__Emission__NewValueAssignment_1_0_1 ) ) rule__Emission__Group_1_0__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1568:1: ( ( rule__Emission__NewValueAssignment_1_0_1 ) ) rule__Emission__Group_1_0__2
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1568:1: ( ( rule__Emission__NewValueAssignment_1_0_1 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1569:1: ( rule__Emission__NewValueAssignment_1_0_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getNewValueAssignment_1_0_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1570:1: ( rule__Emission__NewValueAssignment_1_0_1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1570:2: rule__Emission__NewValueAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__Emission__NewValueAssignment_1_0_1_in_rule__Emission__Group_1_0__13328);
            rule__Emission__NewValueAssignment_1_0_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getNewValueAssignment_1_0_1()); 
            }

            }

            pushFollow(FOLLOW_rule__Emission__Group_1_0__2_in_rule__Emission__Group_1_0__13337);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1581:1: rule__Emission__Group_1_0__2 : ( ')' ) ;
    public final void rule__Emission__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1585:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1586:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1586:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1587:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getRightParenthesisKeyword_1_0_2()); 
            }
            match(input,30,FOLLOW_30_in_rule__Emission__Group_1_0__23366); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1606:1: rule__Emission__Group_1_1__0 : ( '(' ) rule__Emission__Group_1_1__1 ;
    public final void rule__Emission__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1610:1: ( ( '(' ) rule__Emission__Group_1_1__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1611:1: ( '(' ) rule__Emission__Group_1_1__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1611:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1612:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_1_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__Emission__Group_1_1__03408); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_1_0()); 
            }

            }

            pushFollow(FOLLOW_rule__Emission__Group_1_1__1_in_rule__Emission__Group_1_1__03418);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1626:1: rule__Emission__Group_1_1__1 : ( ( rule__Emission__NewValueAssignment_1_1_1 ) ) rule__Emission__Group_1_1__2 ;
    public final void rule__Emission__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1630:1: ( ( ( rule__Emission__NewValueAssignment_1_1_1 ) ) rule__Emission__Group_1_1__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1631:1: ( ( rule__Emission__NewValueAssignment_1_1_1 ) ) rule__Emission__Group_1_1__2
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1631:1: ( ( rule__Emission__NewValueAssignment_1_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1632:1: ( rule__Emission__NewValueAssignment_1_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getNewValueAssignment_1_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1633:1: ( rule__Emission__NewValueAssignment_1_1_1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1633:2: rule__Emission__NewValueAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__Emission__NewValueAssignment_1_1_1_in_rule__Emission__Group_1_1__13446);
            rule__Emission__NewValueAssignment_1_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getNewValueAssignment_1_1_1()); 
            }

            }

            pushFollow(FOLLOW_rule__Emission__Group_1_1__2_in_rule__Emission__Group_1_1__13455);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1644:1: rule__Emission__Group_1_1__2 : ( ')' ) ;
    public final void rule__Emission__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1648:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1649:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1649:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1650:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getRightParenthesisKeyword_1_1_2()); 
            }
            match(input,30,FOLLOW_30_in_rule__Emission__Group_1_1__23484); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1669:1: rule__Assignment__Group__0 : ( ( rule__Assignment__VariableAssignment_0 ) ) rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1673:1: ( ( ( rule__Assignment__VariableAssignment_0 ) ) rule__Assignment__Group__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1674:1: ( ( rule__Assignment__VariableAssignment_0 ) ) rule__Assignment__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1674:1: ( ( rule__Assignment__VariableAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1675:1: ( rule__Assignment__VariableAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariableAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1676:1: ( rule__Assignment__VariableAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1676:2: rule__Assignment__VariableAssignment_0
            {
            pushFollow(FOLLOW_rule__Assignment__VariableAssignment_0_in_rule__Assignment__Group__03525);
            rule__Assignment__VariableAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getVariableAssignment_0()); 
            }

            }

            pushFollow(FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__03534);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1687:1: rule__Assignment__Group__1 : ( ':=' ) rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1691:1: ( ( ':=' ) rule__Assignment__Group__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1692:1: ( ':=' ) rule__Assignment__Group__2
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1692:1: ( ':=' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1693:1: ':='
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1()); 
            }
            match(input,31,FOLLOW_31_in_rule__Assignment__Group__13563); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1()); 
            }

            }

            pushFollow(FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__13573);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1707:1: rule__Assignment__Group__2 : ( ( rule__Assignment__Alternatives_2 ) ) ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1711:1: ( ( ( rule__Assignment__Alternatives_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1712:1: ( ( rule__Assignment__Alternatives_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1712:1: ( ( rule__Assignment__Alternatives_2 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1713:1: ( rule__Assignment__Alternatives_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getAlternatives_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1714:1: ( rule__Assignment__Alternatives_2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1714:2: rule__Assignment__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Assignment__Alternatives_2_in_rule__Assignment__Group__23601);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1730:1: rule__ValOperation__Group__0 : ( ( rule__ValOperation__OperatorAssignment_0 ) ) rule__ValOperation__Group__1 ;
    public final void rule__ValOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1734:1: ( ( ( rule__ValOperation__OperatorAssignment_0 ) ) rule__ValOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1735:1: ( ( rule__ValOperation__OperatorAssignment_0 ) ) rule__ValOperation__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1735:1: ( ( rule__ValOperation__OperatorAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1736:1: ( rule__ValOperation__OperatorAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValOperationAccess().getOperatorAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1737:1: ( rule__ValOperation__OperatorAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1737:2: rule__ValOperation__OperatorAssignment_0
            {
            pushFollow(FOLLOW_rule__ValOperation__OperatorAssignment_0_in_rule__ValOperation__Group__03641);
            rule__ValOperation__OperatorAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getValOperationAccess().getOperatorAssignment_0()); 
            }

            }

            pushFollow(FOLLOW_rule__ValOperation__Group__1_in_rule__ValOperation__Group__03650);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1748:1: rule__ValOperation__Group__1 : ( ( rule__ValOperation__SubExpressionsAssignment_1 ) ) ;
    public final void rule__ValOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1752:1: ( ( ( rule__ValOperation__SubExpressionsAssignment_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1753:1: ( ( rule__ValOperation__SubExpressionsAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1753:1: ( ( rule__ValOperation__SubExpressionsAssignment_1 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1754:1: ( rule__ValOperation__SubExpressionsAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValOperationAccess().getSubExpressionsAssignment_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1755:1: ( rule__ValOperation__SubExpressionsAssignment_1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1755:2: rule__ValOperation__SubExpressionsAssignment_1
            {
            pushFollow(FOLLOW_rule__ValOperation__SubExpressionsAssignment_1_in_rule__ValOperation__Group__13678);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1769:1: rule__ParanthesedValueExpression__Group_5__0 : ( '(' ) rule__ParanthesedValueExpression__Group_5__1 ;
    public final void rule__ParanthesedValueExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1773:1: ( ( '(' ) rule__ParanthesedValueExpression__Group_5__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1774:1: ( '(' ) rule__ParanthesedValueExpression__Group_5__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1774:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1775:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedValueExpressionAccess().getLeftParenthesisKeyword_5_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__ParanthesedValueExpression__Group_5__03717); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParanthesedValueExpressionAccess().getLeftParenthesisKeyword_5_0()); 
            }

            }

            pushFollow(FOLLOW_rule__ParanthesedValueExpression__Group_5__1_in_rule__ParanthesedValueExpression__Group_5__03727);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1789:1: rule__ParanthesedValueExpression__Group_5__1 : ( rulePlusOperation ) rule__ParanthesedValueExpression__Group_5__2 ;
    public final void rule__ParanthesedValueExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1793:1: ( ( rulePlusOperation ) rule__ParanthesedValueExpression__Group_5__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1794:1: ( rulePlusOperation ) rule__ParanthesedValueExpression__Group_5__2
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1794:1: ( rulePlusOperation )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1795:1: rulePlusOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedValueExpressionAccess().getPlusOperationParserRuleCall_5_1()); 
            }
            pushFollow(FOLLOW_rulePlusOperation_in_rule__ParanthesedValueExpression__Group_5__13755);
            rulePlusOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParanthesedValueExpressionAccess().getPlusOperationParserRuleCall_5_1()); 
            }

            }

            pushFollow(FOLLOW_rule__ParanthesedValueExpression__Group_5__2_in_rule__ParanthesedValueExpression__Group_5__13763);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1807:1: rule__ParanthesedValueExpression__Group_5__2 : ( ')' ) ;
    public final void rule__ParanthesedValueExpression__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1811:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1812:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1812:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1813:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedValueExpressionAccess().getRightParenthesisKeyword_5_2()); 
            }
            match(input,30,FOLLOW_30_in_rule__ParanthesedValueExpression__Group_5__23792); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1832:1: rule__ParanthesedValueExpression__Group_6__0 : ( '(' ) rule__ParanthesedValueExpression__Group_6__1 ;
    public final void rule__ParanthesedValueExpression__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1836:1: ( ( '(' ) rule__ParanthesedValueExpression__Group_6__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1837:1: ( '(' ) rule__ParanthesedValueExpression__Group_6__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1837:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1838:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedValueExpressionAccess().getLeftParenthesisKeyword_6_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__ParanthesedValueExpression__Group_6__03834); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParanthesedValueExpressionAccess().getLeftParenthesisKeyword_6_0()); 
            }

            }

            pushFollow(FOLLOW_rule__ParanthesedValueExpression__Group_6__1_in_rule__ParanthesedValueExpression__Group_6__03844);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1852:1: rule__ParanthesedValueExpression__Group_6__1 : ( ruleDivOperation ) rule__ParanthesedValueExpression__Group_6__2 ;
    public final void rule__ParanthesedValueExpression__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1856:1: ( ( ruleDivOperation ) rule__ParanthesedValueExpression__Group_6__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1857:1: ( ruleDivOperation ) rule__ParanthesedValueExpression__Group_6__2
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1857:1: ( ruleDivOperation )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1858:1: ruleDivOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedValueExpressionAccess().getDivOperationParserRuleCall_6_1()); 
            }
            pushFollow(FOLLOW_ruleDivOperation_in_rule__ParanthesedValueExpression__Group_6__13872);
            ruleDivOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParanthesedValueExpressionAccess().getDivOperationParserRuleCall_6_1()); 
            }

            }

            pushFollow(FOLLOW_rule__ParanthesedValueExpression__Group_6__2_in_rule__ParanthesedValueExpression__Group_6__13880);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1870:1: rule__ParanthesedValueExpression__Group_6__2 : ( ')' ) ;
    public final void rule__ParanthesedValueExpression__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1874:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1875:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1875:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1876:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedValueExpressionAccess().getRightParenthesisKeyword_6_2()); 
            }
            match(input,30,FOLLOW_30_in_rule__ParanthesedValueExpression__Group_6__23909); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1895:1: rule__PlusOperation__Group__0 : ( ruleMultOrDivOperation ) rule__PlusOperation__Group__1 ;
    public final void rule__PlusOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1899:1: ( ( ruleMultOrDivOperation ) rule__PlusOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1900:1: ( ruleMultOrDivOperation ) rule__PlusOperation__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1900:1: ( ruleMultOrDivOperation )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1901:1: ruleMultOrDivOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getMultOrDivOperationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleMultOrDivOperation_in_rule__PlusOperation__Group__03950);
            ruleMultOrDivOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPlusOperationAccess().getMultOrDivOperationParserRuleCall_0()); 
            }

            }

            pushFollow(FOLLOW_rule__PlusOperation__Group__1_in_rule__PlusOperation__Group__03958);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1913:1: rule__PlusOperation__Group__1 : ( ( rule__PlusOperation__Group_1__0 )* ) ;
    public final void rule__PlusOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1917:1: ( ( ( rule__PlusOperation__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1918:1: ( ( rule__PlusOperation__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1918:1: ( ( rule__PlusOperation__Group_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1919:1: ( rule__PlusOperation__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1920:1: ( rule__PlusOperation__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=24 && LA19_0<=25)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1920:2: rule__PlusOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PlusOperation__Group_1__0_in_rule__PlusOperation__Group__13986);
            	    rule__PlusOperation__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1934:1: rule__PlusOperation__Group_1__0 : ( () ) rule__PlusOperation__Group_1__1 ;
    public final void rule__PlusOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1938:1: ( ( () ) rule__PlusOperation__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1939:1: ( () ) rule__PlusOperation__Group_1__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1939:1: ( () )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1940:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getComplexExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1941:1: ()
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1943:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPlusOperationAccess().getComplexExpressionSubExpressionsAction_1_0()); 
            }

            }

            pushFollow(FOLLOW_rule__PlusOperation__Group_1__1_in_rule__PlusOperation__Group_1__04035);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1954:1: rule__PlusOperation__Group_1__1 : ( ( rule__PlusOperation__OperatorAssignment_1_1 ) ) rule__PlusOperation__Group_1__2 ;
    public final void rule__PlusOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1958:1: ( ( ( rule__PlusOperation__OperatorAssignment_1_1 ) ) rule__PlusOperation__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1959:1: ( ( rule__PlusOperation__OperatorAssignment_1_1 ) ) rule__PlusOperation__Group_1__2
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1959:1: ( ( rule__PlusOperation__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1960:1: ( rule__PlusOperation__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1961:1: ( rule__PlusOperation__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1961:2: rule__PlusOperation__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__PlusOperation__OperatorAssignment_1_1_in_rule__PlusOperation__Group_1__14063);
            rule__PlusOperation__OperatorAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPlusOperationAccess().getOperatorAssignment_1_1()); 
            }

            }

            pushFollow(FOLLOW_rule__PlusOperation__Group_1__2_in_rule__PlusOperation__Group_1__14072);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1972:1: rule__PlusOperation__Group_1__2 : ( ( rule__PlusOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__PlusOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1976:1: ( ( ( rule__PlusOperation__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1977:1: ( ( rule__PlusOperation__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1977:1: ( ( rule__PlusOperation__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1978:1: ( rule__PlusOperation__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1979:1: ( rule__PlusOperation__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1979:2: rule__PlusOperation__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__PlusOperation__SubExpressionsAssignment_1_2_in_rule__PlusOperation__Group_1__24100);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1995:1: rule__MultOrDivOperation__Group_1__0 : ( '(' ) rule__MultOrDivOperation__Group_1__1 ;
    public final void rule__MultOrDivOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1999:1: ( ( '(' ) rule__MultOrDivOperation__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2000:1: ( '(' ) rule__MultOrDivOperation__Group_1__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2000:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2001:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOrDivOperationAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__MultOrDivOperation__Group_1__04141); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMultOrDivOperationAccess().getLeftParenthesisKeyword_1_0()); 
            }

            }

            pushFollow(FOLLOW_rule__MultOrDivOperation__Group_1__1_in_rule__MultOrDivOperation__Group_1__04151);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2015:1: rule__MultOrDivOperation__Group_1__1 : ( ruleDivOperation ) rule__MultOrDivOperation__Group_1__2 ;
    public final void rule__MultOrDivOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2019:1: ( ( ruleDivOperation ) rule__MultOrDivOperation__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2020:1: ( ruleDivOperation ) rule__MultOrDivOperation__Group_1__2
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2020:1: ( ruleDivOperation )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2021:1: ruleDivOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOrDivOperationAccess().getDivOperationParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleDivOperation_in_rule__MultOrDivOperation__Group_1__14179);
            ruleDivOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMultOrDivOperationAccess().getDivOperationParserRuleCall_1_1()); 
            }

            }

            pushFollow(FOLLOW_rule__MultOrDivOperation__Group_1__2_in_rule__MultOrDivOperation__Group_1__14187);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2033:1: rule__MultOrDivOperation__Group_1__2 : ( ')' ) ;
    public final void rule__MultOrDivOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2037:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2038:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2038:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2039:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOrDivOperationAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,30,FOLLOW_30_in_rule__MultOrDivOperation__Group_1__24216); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2058:1: rule__MultOperation__Group__0 : ( rulePreOrNormalValueExpression ) rule__MultOperation__Group__1 ;
    public final void rule__MultOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2062:1: ( ( rulePreOrNormalValueExpression ) rule__MultOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2063:1: ( rulePreOrNormalValueExpression ) rule__MultOperation__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2063:1: ( rulePreOrNormalValueExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2064:1: rulePreOrNormalValueExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getPreOrNormalValueExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulePreOrNormalValueExpression_in_rule__MultOperation__Group__04257);
            rulePreOrNormalValueExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMultOperationAccess().getPreOrNormalValueExpressionParserRuleCall_0()); 
            }

            }

            pushFollow(FOLLOW_rule__MultOperation__Group__1_in_rule__MultOperation__Group__04265);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2076:1: rule__MultOperation__Group__1 : ( ( rule__MultOperation__Group_1__0 )* ) ;
    public final void rule__MultOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2080:1: ( ( ( rule__MultOperation__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2081:1: ( ( rule__MultOperation__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2081:1: ( ( rule__MultOperation__Group_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2082:1: ( rule__MultOperation__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2083:1: ( rule__MultOperation__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=26 && LA20_0<=27)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2083:2: rule__MultOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__MultOperation__Group_1__0_in_rule__MultOperation__Group__14293);
            	    rule__MultOperation__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2097:1: rule__MultOperation__Group_1__0 : ( () ) rule__MultOperation__Group_1__1 ;
    public final void rule__MultOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2101:1: ( ( () ) rule__MultOperation__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2102:1: ( () ) rule__MultOperation__Group_1__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2102:1: ( () )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2103:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getComplexExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2104:1: ()
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2106:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMultOperationAccess().getComplexExpressionSubExpressionsAction_1_0()); 
            }

            }

            pushFollow(FOLLOW_rule__MultOperation__Group_1__1_in_rule__MultOperation__Group_1__04342);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2117:1: rule__MultOperation__Group_1__1 : ( ( rule__MultOperation__OperatorAssignment_1_1 ) ) rule__MultOperation__Group_1__2 ;
    public final void rule__MultOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2121:1: ( ( ( rule__MultOperation__OperatorAssignment_1_1 ) ) rule__MultOperation__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2122:1: ( ( rule__MultOperation__OperatorAssignment_1_1 ) ) rule__MultOperation__Group_1__2
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2122:1: ( ( rule__MultOperation__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2123:1: ( rule__MultOperation__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2124:1: ( rule__MultOperation__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2124:2: rule__MultOperation__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MultOperation__OperatorAssignment_1_1_in_rule__MultOperation__Group_1__14370);
            rule__MultOperation__OperatorAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMultOperationAccess().getOperatorAssignment_1_1()); 
            }

            }

            pushFollow(FOLLOW_rule__MultOperation__Group_1__2_in_rule__MultOperation__Group_1__14379);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2135:1: rule__MultOperation__Group_1__2 : ( ( rule__MultOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__MultOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2139:1: ( ( ( rule__MultOperation__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2140:1: ( ( rule__MultOperation__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2140:1: ( ( rule__MultOperation__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2141:1: ( rule__MultOperation__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2142:1: ( rule__MultOperation__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2142:2: rule__MultOperation__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__MultOperation__SubExpressionsAssignment_1_2_in_rule__MultOperation__Group_1__24407);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2158:1: rule__DivOperation__Group__0 : ( rulePreOrNormalValueExpression ) rule__DivOperation__Group__1 ;
    public final void rule__DivOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2162:1: ( ( rulePreOrNormalValueExpression ) rule__DivOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2163:1: ( rulePreOrNormalValueExpression ) rule__DivOperation__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2163:1: ( rulePreOrNormalValueExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2164:1: rulePreOrNormalValueExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getPreOrNormalValueExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulePreOrNormalValueExpression_in_rule__DivOperation__Group__04447);
            rulePreOrNormalValueExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDivOperationAccess().getPreOrNormalValueExpressionParserRuleCall_0()); 
            }

            }

            pushFollow(FOLLOW_rule__DivOperation__Group__1_in_rule__DivOperation__Group__04455);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2176:1: rule__DivOperation__Group__1 : ( ( rule__DivOperation__Group_1__0 )* ) ;
    public final void rule__DivOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2180:1: ( ( ( rule__DivOperation__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2181:1: ( ( rule__DivOperation__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2181:1: ( ( rule__DivOperation__Group_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2182:1: ( rule__DivOperation__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2183:1: ( rule__DivOperation__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==18) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2183:2: rule__DivOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__DivOperation__Group_1__0_in_rule__DivOperation__Group__14483);
            	    rule__DivOperation__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2197:1: rule__DivOperation__Group_1__0 : ( () ) rule__DivOperation__Group_1__1 ;
    public final void rule__DivOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2201:1: ( ( () ) rule__DivOperation__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2202:1: ( () ) rule__DivOperation__Group_1__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2202:1: ( () )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2203:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getComplexExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2204:1: ()
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2206:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getDivOperationAccess().getComplexExpressionSubExpressionsAction_1_0()); 
            }

            }

            pushFollow(FOLLOW_rule__DivOperation__Group_1__1_in_rule__DivOperation__Group_1__04532);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2217:1: rule__DivOperation__Group_1__1 : ( ( rule__DivOperation__OperatorAssignment_1_1 ) ) rule__DivOperation__Group_1__2 ;
    public final void rule__DivOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2221:1: ( ( ( rule__DivOperation__OperatorAssignment_1_1 ) ) rule__DivOperation__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2222:1: ( ( rule__DivOperation__OperatorAssignment_1_1 ) ) rule__DivOperation__Group_1__2
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2222:1: ( ( rule__DivOperation__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2223:1: ( rule__DivOperation__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2224:1: ( rule__DivOperation__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2224:2: rule__DivOperation__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__DivOperation__OperatorAssignment_1_1_in_rule__DivOperation__Group_1__14560);
            rule__DivOperation__OperatorAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getDivOperationAccess().getOperatorAssignment_1_1()); 
            }

            }

            pushFollow(FOLLOW_rule__DivOperation__Group_1__2_in_rule__DivOperation__Group_1__14569);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2235:1: rule__DivOperation__Group_1__2 : ( ( rule__DivOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__DivOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2239:1: ( ( ( rule__DivOperation__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2240:1: ( ( rule__DivOperation__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2240:1: ( ( rule__DivOperation__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2241:1: ( rule__DivOperation__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2242:1: ( rule__DivOperation__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2242:2: rule__DivOperation__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__DivOperation__SubExpressionsAssignment_1_2_in_rule__DivOperation__Group_1__24597);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2258:1: rule__PreArithmOperation__Group__0 : ( ( rule__PreArithmOperation__OperatorAssignment_0 ) ) rule__PreArithmOperation__Group__1 ;
    public final void rule__PreArithmOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2262:1: ( ( ( rule__PreArithmOperation__OperatorAssignment_0 ) ) rule__PreArithmOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2263:1: ( ( rule__PreArithmOperation__OperatorAssignment_0 ) ) rule__PreArithmOperation__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2263:1: ( ( rule__PreArithmOperation__OperatorAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2264:1: ( rule__PreArithmOperation__OperatorAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreArithmOperationAccess().getOperatorAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2265:1: ( rule__PreArithmOperation__OperatorAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2265:2: rule__PreArithmOperation__OperatorAssignment_0
            {
            pushFollow(FOLLOW_rule__PreArithmOperation__OperatorAssignment_0_in_rule__PreArithmOperation__Group__04637);
            rule__PreArithmOperation__OperatorAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPreArithmOperationAccess().getOperatorAssignment_0()); 
            }

            }

            pushFollow(FOLLOW_rule__PreArithmOperation__Group__1_in_rule__PreArithmOperation__Group__04646);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2276:1: rule__PreArithmOperation__Group__1 : ( '(' ) rule__PreArithmOperation__Group__2 ;
    public final void rule__PreArithmOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2280:1: ( ( '(' ) rule__PreArithmOperation__Group__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2281:1: ( '(' ) rule__PreArithmOperation__Group__2
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2281:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2282:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreArithmOperationAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,29,FOLLOW_29_in_rule__PreArithmOperation__Group__14675); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPreArithmOperationAccess().getLeftParenthesisKeyword_1()); 
            }

            }

            pushFollow(FOLLOW_rule__PreArithmOperation__Group__2_in_rule__PreArithmOperation__Group__14685);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2296:1: rule__PreArithmOperation__Group__2 : ( ( rule__PreArithmOperation__SubExpressionsAssignment_2 ) ) rule__PreArithmOperation__Group__3 ;
    public final void rule__PreArithmOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2300:1: ( ( ( rule__PreArithmOperation__SubExpressionsAssignment_2 ) ) rule__PreArithmOperation__Group__3 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2301:1: ( ( rule__PreArithmOperation__SubExpressionsAssignment_2 ) ) rule__PreArithmOperation__Group__3
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2301:1: ( ( rule__PreArithmOperation__SubExpressionsAssignment_2 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2302:1: ( rule__PreArithmOperation__SubExpressionsAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreArithmOperationAccess().getSubExpressionsAssignment_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2303:1: ( rule__PreArithmOperation__SubExpressionsAssignment_2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2303:2: rule__PreArithmOperation__SubExpressionsAssignment_2
            {
            pushFollow(FOLLOW_rule__PreArithmOperation__SubExpressionsAssignment_2_in_rule__PreArithmOperation__Group__24713);
            rule__PreArithmOperation__SubExpressionsAssignment_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPreArithmOperationAccess().getSubExpressionsAssignment_2()); 
            }

            }

            pushFollow(FOLLOW_rule__PreArithmOperation__Group__3_in_rule__PreArithmOperation__Group__24722);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2314:1: rule__PreArithmOperation__Group__3 : ( ')' ) ;
    public final void rule__PreArithmOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2318:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2319:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2319:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2320:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreArithmOperationAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,30,FOLLOW_30_in_rule__PreArithmOperation__Group__34751); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2341:1: rule__CompareOperation__Group__0 : ( ruleValueExpression ) rule__CompareOperation__Group__1 ;
    public final void rule__CompareOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2345:1: ( ( ruleValueExpression ) rule__CompareOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2346:1: ( ruleValueExpression ) rule__CompareOperation__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2346:1: ( ruleValueExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2347:1: ruleValueExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getValueExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleValueExpression_in_rule__CompareOperation__Group__04794);
            ruleValueExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getValueExpressionParserRuleCall_0()); 
            }

            }

            pushFollow(FOLLOW_rule__CompareOperation__Group__1_in_rule__CompareOperation__Group__04802);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2359:1: rule__CompareOperation__Group__1 : ( ( rule__CompareOperation__Group_1__0 ) ) ;
    public final void rule__CompareOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2363:1: ( ( ( rule__CompareOperation__Group_1__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2364:1: ( ( rule__CompareOperation__Group_1__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2364:1: ( ( rule__CompareOperation__Group_1__0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2365:1: ( rule__CompareOperation__Group_1__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2366:1: ( rule__CompareOperation__Group_1__0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2366:2: rule__CompareOperation__Group_1__0
            {
            pushFollow(FOLLOW_rule__CompareOperation__Group_1__0_in_rule__CompareOperation__Group__14830);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2380:1: rule__CompareOperation__Group_1__0 : ( () ) rule__CompareOperation__Group_1__1 ;
    public final void rule__CompareOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2384:1: ( ( () ) rule__CompareOperation__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2385:1: ( () ) rule__CompareOperation__Group_1__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2385:1: ( () )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2386:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getComplexExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2387:1: ()
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2389:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getComplexExpressionSubExpressionsAction_1_0()); 
            }

            }

            pushFollow(FOLLOW_rule__CompareOperation__Group_1__1_in_rule__CompareOperation__Group_1__04878);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2400:1: rule__CompareOperation__Group_1__1 : ( ( rule__CompareOperation__OperatorAssignment_1_1 ) ) rule__CompareOperation__Group_1__2 ;
    public final void rule__CompareOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2404:1: ( ( ( rule__CompareOperation__OperatorAssignment_1_1 ) ) rule__CompareOperation__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2405:1: ( ( rule__CompareOperation__OperatorAssignment_1_1 ) ) rule__CompareOperation__Group_1__2
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2405:1: ( ( rule__CompareOperation__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2406:1: ( rule__CompareOperation__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2407:1: ( rule__CompareOperation__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2407:2: rule__CompareOperation__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__CompareOperation__OperatorAssignment_1_1_in_rule__CompareOperation__Group_1__14906);
            rule__CompareOperation__OperatorAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getOperatorAssignment_1_1()); 
            }

            }

            pushFollow(FOLLOW_rule__CompareOperation__Group_1__2_in_rule__CompareOperation__Group_1__14915);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2418:1: rule__CompareOperation__Group_1__2 : ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__CompareOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2422:1: ( ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2423:1: ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2423:1: ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2424:1: ( rule__CompareOperation__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2425:1: ( rule__CompareOperation__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2425:2: rule__CompareOperation__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__CompareOperation__SubExpressionsAssignment_1_2_in_rule__CompareOperation__Group_1__24943);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2441:1: rule__UnaryOperation__Group__0 : ( ( rule__UnaryOperation__OperatorAssignment_0 ) ) rule__UnaryOperation__Group__1 ;
    public final void rule__UnaryOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2445:1: ( ( ( rule__UnaryOperation__OperatorAssignment_0 ) ) rule__UnaryOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2446:1: ( ( rule__UnaryOperation__OperatorAssignment_0 ) ) rule__UnaryOperation__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2446:1: ( ( rule__UnaryOperation__OperatorAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2447:1: ( rule__UnaryOperation__OperatorAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getOperatorAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2448:1: ( rule__UnaryOperation__OperatorAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2448:2: rule__UnaryOperation__OperatorAssignment_0
            {
            pushFollow(FOLLOW_rule__UnaryOperation__OperatorAssignment_0_in_rule__UnaryOperation__Group__04983);
            rule__UnaryOperation__OperatorAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getUnaryOperationAccess().getOperatorAssignment_0()); 
            }

            }

            pushFollow(FOLLOW_rule__UnaryOperation__Group__1_in_rule__UnaryOperation__Group__04992);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2459:1: rule__UnaryOperation__Group__1 : ( ( rule__UnaryOperation__SubExpressionsAssignment_1 ) ) ;
    public final void rule__UnaryOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2463:1: ( ( ( rule__UnaryOperation__SubExpressionsAssignment_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2464:1: ( ( rule__UnaryOperation__SubExpressionsAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2464:1: ( ( rule__UnaryOperation__SubExpressionsAssignment_1 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2465:1: ( rule__UnaryOperation__SubExpressionsAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getSubExpressionsAssignment_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2466:1: ( rule__UnaryOperation__SubExpressionsAssignment_1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2466:2: rule__UnaryOperation__SubExpressionsAssignment_1
            {
            pushFollow(FOLLOW_rule__UnaryOperation__SubExpressionsAssignment_1_in_rule__UnaryOperation__Group__15020);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2480:1: rule__UnaryParanthesedOperation__Group__0 : ( ( rule__UnaryParanthesedOperation__OperatorAssignment_0 ) ) rule__UnaryParanthesedOperation__Group__1 ;
    public final void rule__UnaryParanthesedOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2484:1: ( ( ( rule__UnaryParanthesedOperation__OperatorAssignment_0 ) ) rule__UnaryParanthesedOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2485:1: ( ( rule__UnaryParanthesedOperation__OperatorAssignment_0 ) ) rule__UnaryParanthesedOperation__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2485:1: ( ( rule__UnaryParanthesedOperation__OperatorAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2486:1: ( rule__UnaryParanthesedOperation__OperatorAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperationAccess().getOperatorAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2487:1: ( rule__UnaryParanthesedOperation__OperatorAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2487:2: rule__UnaryParanthesedOperation__OperatorAssignment_0
            {
            pushFollow(FOLLOW_rule__UnaryParanthesedOperation__OperatorAssignment_0_in_rule__UnaryParanthesedOperation__Group__05058);
            rule__UnaryParanthesedOperation__OperatorAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getUnaryParanthesedOperationAccess().getOperatorAssignment_0()); 
            }

            }

            pushFollow(FOLLOW_rule__UnaryParanthesedOperation__Group__1_in_rule__UnaryParanthesedOperation__Group__05067);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2498:1: rule__UnaryParanthesedOperation__Group__1 : ( '(' ) rule__UnaryParanthesedOperation__Group__2 ;
    public final void rule__UnaryParanthesedOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2502:1: ( ( '(' ) rule__UnaryParanthesedOperation__Group__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2503:1: ( '(' ) rule__UnaryParanthesedOperation__Group__2
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2503:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2504:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperationAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,29,FOLLOW_29_in_rule__UnaryParanthesedOperation__Group__15096); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getUnaryParanthesedOperationAccess().getLeftParenthesisKeyword_1()); 
            }

            }

            pushFollow(FOLLOW_rule__UnaryParanthesedOperation__Group__2_in_rule__UnaryParanthesedOperation__Group__15106);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2518:1: rule__UnaryParanthesedOperation__Group__2 : ( ( rule__UnaryParanthesedOperation__SubExpressionsAssignment_2 ) ) rule__UnaryParanthesedOperation__Group__3 ;
    public final void rule__UnaryParanthesedOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2522:1: ( ( ( rule__UnaryParanthesedOperation__SubExpressionsAssignment_2 ) ) rule__UnaryParanthesedOperation__Group__3 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2523:1: ( ( rule__UnaryParanthesedOperation__SubExpressionsAssignment_2 ) ) rule__UnaryParanthesedOperation__Group__3
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2523:1: ( ( rule__UnaryParanthesedOperation__SubExpressionsAssignment_2 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2524:1: ( rule__UnaryParanthesedOperation__SubExpressionsAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperationAccess().getSubExpressionsAssignment_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2525:1: ( rule__UnaryParanthesedOperation__SubExpressionsAssignment_2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2525:2: rule__UnaryParanthesedOperation__SubExpressionsAssignment_2
            {
            pushFollow(FOLLOW_rule__UnaryParanthesedOperation__SubExpressionsAssignment_2_in_rule__UnaryParanthesedOperation__Group__25134);
            rule__UnaryParanthesedOperation__SubExpressionsAssignment_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getUnaryParanthesedOperationAccess().getSubExpressionsAssignment_2()); 
            }

            }

            pushFollow(FOLLOW_rule__UnaryParanthesedOperation__Group__3_in_rule__UnaryParanthesedOperation__Group__25143);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2536:1: rule__UnaryParanthesedOperation__Group__3 : ( ')' ) ;
    public final void rule__UnaryParanthesedOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2540:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2541:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2541:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2542:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperationAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,30,FOLLOW_30_in_rule__UnaryParanthesedOperation__Group__35172); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2563:1: rule__AndOperation__Group__0 : ( ruleUnaryOrNormalExpression ) rule__AndOperation__Group__1 ;
    public final void rule__AndOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2567:1: ( ( ruleUnaryOrNormalExpression ) rule__AndOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2568:1: ( ruleUnaryOrNormalExpression ) rule__AndOperation__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2568:1: ( ruleUnaryOrNormalExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2569:1: ruleUnaryOrNormalExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getUnaryOrNormalExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleUnaryOrNormalExpression_in_rule__AndOperation__Group__05215);
            ruleUnaryOrNormalExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAndOperationAccess().getUnaryOrNormalExpressionParserRuleCall_0()); 
            }

            }

            pushFollow(FOLLOW_rule__AndOperation__Group__1_in_rule__AndOperation__Group__05223);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2581:1: rule__AndOperation__Group__1 : ( ( rule__AndOperation__Group_1__0 )* ) ;
    public final void rule__AndOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2585:1: ( ( ( rule__AndOperation__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2586:1: ( ( rule__AndOperation__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2586:1: ( ( rule__AndOperation__Group_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2587:1: ( rule__AndOperation__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2588:1: ( rule__AndOperation__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==17) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2588:2: rule__AndOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AndOperation__Group_1__0_in_rule__AndOperation__Group__15251);
            	    rule__AndOperation__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2602:1: rule__AndOperation__Group_1__0 : ( () ) rule__AndOperation__Group_1__1 ;
    public final void rule__AndOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2606:1: ( ( () ) rule__AndOperation__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2607:1: ( () ) rule__AndOperation__Group_1__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2607:1: ( () )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2608:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getComplexExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2609:1: ()
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2611:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAndOperationAccess().getComplexExpressionSubExpressionsAction_1_0()); 
            }

            }

            pushFollow(FOLLOW_rule__AndOperation__Group_1__1_in_rule__AndOperation__Group_1__05300);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2622:1: rule__AndOperation__Group_1__1 : ( ( rule__AndOperation__OperatorAssignment_1_1 ) ) rule__AndOperation__Group_1__2 ;
    public final void rule__AndOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2626:1: ( ( ( rule__AndOperation__OperatorAssignment_1_1 ) ) rule__AndOperation__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2627:1: ( ( rule__AndOperation__OperatorAssignment_1_1 ) ) rule__AndOperation__Group_1__2
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2627:1: ( ( rule__AndOperation__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2628:1: ( rule__AndOperation__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2629:1: ( rule__AndOperation__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2629:2: rule__AndOperation__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AndOperation__OperatorAssignment_1_1_in_rule__AndOperation__Group_1__15328);
            rule__AndOperation__OperatorAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAndOperationAccess().getOperatorAssignment_1_1()); 
            }

            }

            pushFollow(FOLLOW_rule__AndOperation__Group_1__2_in_rule__AndOperation__Group_1__15337);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2640:1: rule__AndOperation__Group_1__2 : ( ( rule__AndOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__AndOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2644:1: ( ( ( rule__AndOperation__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2645:1: ( ( rule__AndOperation__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2645:1: ( ( rule__AndOperation__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2646:1: ( rule__AndOperation__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2647:1: ( rule__AndOperation__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2647:2: rule__AndOperation__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__AndOperation__SubExpressionsAssignment_1_2_in_rule__AndOperation__Group_1__25365);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2663:1: rule__OrOperation__Group__0 : ( ruleAndOperation ) rule__OrOperation__Group__1 ;
    public final void rule__OrOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2667:1: ( ( ruleAndOperation ) rule__OrOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2668:1: ( ruleAndOperation ) rule__OrOperation__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2668:1: ( ruleAndOperation )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2669:1: ruleAndOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getAndOperationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAndOperation_in_rule__OrOperation__Group__05405);
            ruleAndOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getOrOperationAccess().getAndOperationParserRuleCall_0()); 
            }

            }

            pushFollow(FOLLOW_rule__OrOperation__Group__1_in_rule__OrOperation__Group__05413);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2681:1: rule__OrOperation__Group__1 : ( ( rule__OrOperation__Group_1__0 )* ) ;
    public final void rule__OrOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2685:1: ( ( ( rule__OrOperation__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2686:1: ( ( rule__OrOperation__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2686:1: ( ( rule__OrOperation__Group_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2687:1: ( rule__OrOperation__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2688:1: ( rule__OrOperation__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==16) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2688:2: rule__OrOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__OrOperation__Group_1__0_in_rule__OrOperation__Group__15441);
            	    rule__OrOperation__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2702:1: rule__OrOperation__Group_1__0 : ( () ) rule__OrOperation__Group_1__1 ;
    public final void rule__OrOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2706:1: ( ( () ) rule__OrOperation__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2707:1: ( () ) rule__OrOperation__Group_1__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2707:1: ( () )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2708:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getComplexExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2709:1: ()
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2711:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getOrOperationAccess().getComplexExpressionSubExpressionsAction_1_0()); 
            }

            }

            pushFollow(FOLLOW_rule__OrOperation__Group_1__1_in_rule__OrOperation__Group_1__05490);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2722:1: rule__OrOperation__Group_1__1 : ( ( rule__OrOperation__OperatorAssignment_1_1 ) ) rule__OrOperation__Group_1__2 ;
    public final void rule__OrOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2726:1: ( ( ( rule__OrOperation__OperatorAssignment_1_1 ) ) rule__OrOperation__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2727:1: ( ( rule__OrOperation__OperatorAssignment_1_1 ) ) rule__OrOperation__Group_1__2
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2727:1: ( ( rule__OrOperation__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2728:1: ( rule__OrOperation__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2729:1: ( rule__OrOperation__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2729:2: rule__OrOperation__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__OrOperation__OperatorAssignment_1_1_in_rule__OrOperation__Group_1__15518);
            rule__OrOperation__OperatorAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getOrOperationAccess().getOperatorAssignment_1_1()); 
            }

            }

            pushFollow(FOLLOW_rule__OrOperation__Group_1__2_in_rule__OrOperation__Group_1__15527);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2740:1: rule__OrOperation__Group_1__2 : ( ( rule__OrOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__OrOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2744:1: ( ( ( rule__OrOperation__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2745:1: ( ( rule__OrOperation__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2745:1: ( ( rule__OrOperation__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2746:1: ( rule__OrOperation__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2747:1: ( rule__OrOperation__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2747:2: rule__OrOperation__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__OrOperation__SubExpressionsAssignment_1_2_in_rule__OrOperation__Group_1__25555);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2763:1: rule__ParanthesedBooleanExpression__Group_5__0 : ( '(' ) rule__ParanthesedBooleanExpression__Group_5__1 ;
    public final void rule__ParanthesedBooleanExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2767:1: ( ( '(' ) rule__ParanthesedBooleanExpression__Group_5__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2768:1: ( '(' ) rule__ParanthesedBooleanExpression__Group_5__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2768:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2769:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedBooleanExpressionAccess().getLeftParenthesisKeyword_5_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__ParanthesedBooleanExpression__Group_5__05596); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParanthesedBooleanExpressionAccess().getLeftParenthesisKeyword_5_0()); 
            }

            }

            pushFollow(FOLLOW_rule__ParanthesedBooleanExpression__Group_5__1_in_rule__ParanthesedBooleanExpression__Group_5__05606);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2783:1: rule__ParanthesedBooleanExpression__Group_5__1 : ( ruleOrOperation ) rule__ParanthesedBooleanExpression__Group_5__2 ;
    public final void rule__ParanthesedBooleanExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2787:1: ( ( ruleOrOperation ) rule__ParanthesedBooleanExpression__Group_5__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2788:1: ( ruleOrOperation ) rule__ParanthesedBooleanExpression__Group_5__2
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2788:1: ( ruleOrOperation )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2789:1: ruleOrOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedBooleanExpressionAccess().getOrOperationParserRuleCall_5_1()); 
            }
            pushFollow(FOLLOW_ruleOrOperation_in_rule__ParanthesedBooleanExpression__Group_5__15634);
            ruleOrOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParanthesedBooleanExpressionAccess().getOrOperationParserRuleCall_5_1()); 
            }

            }

            pushFollow(FOLLOW_rule__ParanthesedBooleanExpression__Group_5__2_in_rule__ParanthesedBooleanExpression__Group_5__15642);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2801:1: rule__ParanthesedBooleanExpression__Group_5__2 : ( ')' ) ;
    public final void rule__ParanthesedBooleanExpression__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2805:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2806:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2806:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2807:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedBooleanExpressionAccess().getRightParenthesisKeyword_5_2()); 
            }
            match(input,30,FOLLOW_30_in_rule__ParanthesedBooleanExpression__Group_5__25671); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2826:1: rule__HostCode__Group__0 : ( ( rule__HostCode__CodeAssignment_0 ) ) rule__HostCode__Group__1 ;
    public final void rule__HostCode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2830:1: ( ( ( rule__HostCode__CodeAssignment_0 ) ) rule__HostCode__Group__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2831:1: ( ( rule__HostCode__CodeAssignment_0 ) ) rule__HostCode__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2831:1: ( ( rule__HostCode__CodeAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2832:1: ( rule__HostCode__CodeAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getHostCodeAccess().getCodeAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2833:1: ( rule__HostCode__CodeAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2833:2: rule__HostCode__CodeAssignment_0
            {
            pushFollow(FOLLOW_rule__HostCode__CodeAssignment_0_in_rule__HostCode__Group__05712);
            rule__HostCode__CodeAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getHostCodeAccess().getCodeAssignment_0()); 
            }

            }

            pushFollow(FOLLOW_rule__HostCode__Group__1_in_rule__HostCode__Group__05721);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2844:1: rule__HostCode__Group__1 : ( ( rule__HostCode__Group_1__0 )? ) ;
    public final void rule__HostCode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2848:1: ( ( ( rule__HostCode__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2849:1: ( ( rule__HostCode__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2849:1: ( ( rule__HostCode__Group_1__0 )? )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2850:1: ( rule__HostCode__Group_1__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getHostCodeAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2851:1: ( rule__HostCode__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==29) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2851:2: rule__HostCode__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__HostCode__Group_1__0_in_rule__HostCode__Group__15749);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2865:1: rule__HostCode__Group_1__0 : ( '(' ) rule__HostCode__Group_1__1 ;
    public final void rule__HostCode__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2869:1: ( ( '(' ) rule__HostCode__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2870:1: ( '(' ) rule__HostCode__Group_1__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2870:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2871:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getHostCodeAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__HostCode__Group_1__05789); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getHostCodeAccess().getLeftParenthesisKeyword_1_0()); 
            }

            }

            pushFollow(FOLLOW_rule__HostCode__Group_1__1_in_rule__HostCode__Group_1__05799);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2885:1: rule__HostCode__Group_1__1 : ( ( rule__HostCode__TypeAssignment_1_1 ) ) rule__HostCode__Group_1__2 ;
    public final void rule__HostCode__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2889:1: ( ( ( rule__HostCode__TypeAssignment_1_1 ) ) rule__HostCode__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2890:1: ( ( rule__HostCode__TypeAssignment_1_1 ) ) rule__HostCode__Group_1__2
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2890:1: ( ( rule__HostCode__TypeAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2891:1: ( rule__HostCode__TypeAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getHostCodeAccess().getTypeAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2892:1: ( rule__HostCode__TypeAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2892:2: rule__HostCode__TypeAssignment_1_1
            {
            pushFollow(FOLLOW_rule__HostCode__TypeAssignment_1_1_in_rule__HostCode__Group_1__15827);
            rule__HostCode__TypeAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getHostCodeAccess().getTypeAssignment_1_1()); 
            }

            }

            pushFollow(FOLLOW_rule__HostCode__Group_1__2_in_rule__HostCode__Group_1__15836);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2903:1: rule__HostCode__Group_1__2 : ( ')' ) ;
    public final void rule__HostCode__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2907:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2908:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2908:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2909:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getHostCodeAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,30,FOLLOW_30_in_rule__HostCode__Group_1__25865); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2928:1: rule__Action__IsImmediateAssignment_0 : ( ( '#' ) ) ;
    public final void rule__Action__IsImmediateAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2932:1: ( ( ( '#' ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2933:1: ( ( '#' ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2933:1: ( ( '#' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2934:1: ( '#' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getIsImmediateNumberSignKeyword_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2935:1: ( '#' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2936:1: '#'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getIsImmediateNumberSignKeyword_0_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__Action__IsImmediateAssignment_05911); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2951:1: rule__Action__DelayAssignment_1 : ( RULE_INT ) ;
    public final void rule__Action__DelayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2955:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2956:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2956:1: ( RULE_INT )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2957:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getDelayINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Action__DelayAssignment_15950); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2966:1: rule__Action__TriggerAssignment_2 : ( ruleBooleanExpression ) ;
    public final void rule__Action__TriggerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2970:1: ( ( ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2971:1: ( ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2971:1: ( ruleBooleanExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2972:1: ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getTriggerBooleanExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_rule__Action__TriggerAssignment_25981);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2981:1: rule__Action__EffectsAssignment_3_1_0 : ( ruleEffect ) ;
    public final void rule__Action__EffectsAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2985:1: ( ( ruleEffect ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2986:1: ( ruleEffect )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2986:1: ( ruleEffect )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2987:1: ruleEffect
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getEffectsEffectParserRuleCall_3_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleEffect_in_rule__Action__EffectsAssignment_3_1_06012);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2996:1: rule__Emission__SignalAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Emission__SignalAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3000:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3001:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3001:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3002:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getSignalSignalCrossReference_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3003:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3004:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getSignalSignalIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Emission__SignalAssignment_06047); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3015:1: rule__Emission__NewValueAssignment_1_0_1 : ( ruleValueExpression ) ;
    public final void rule__Emission__NewValueAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3019:1: ( ( ruleValueExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3020:1: ( ruleValueExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3020:1: ( ruleValueExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3021:1: ruleValueExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getNewValueValueExpressionParserRuleCall_1_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleValueExpression_in_rule__Emission__NewValueAssignment_1_0_16082);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3030:1: rule__Emission__NewValueAssignment_1_1_1 : ( ruleBooleanExpression ) ;
    public final void rule__Emission__NewValueAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3034:1: ( ( ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3035:1: ( ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3035:1: ( ruleBooleanExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3036:1: ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getNewValueBooleanExpressionParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_rule__Emission__NewValueAssignment_1_1_16113);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3045:1: rule__Assignment__VariableAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Assignment__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3049:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3050:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3050:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3051:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariableVariableCrossReference_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3052:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3053:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariableVariableIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Assignment__VariableAssignment_06148); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3064:1: rule__Assignment__ExpressionAssignment_2_0 : ( ruleValueExpression ) ;
    public final void rule__Assignment__ExpressionAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3068:1: ( ( ruleValueExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3069:1: ( ruleValueExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3069:1: ( ruleValueExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3070:1: ruleValueExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getExpressionValueExpressionParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleValueExpression_in_rule__Assignment__ExpressionAssignment_2_06183);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3079:1: rule__Assignment__ExpressionAssignment_2_1 : ( ruleBooleanExpression ) ;
    public final void rule__Assignment__ExpressionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3083:1: ( ( ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3084:1: ( ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3084:1: ( ruleBooleanExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3085:1: ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getExpressionBooleanExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_rule__Assignment__ExpressionAssignment_2_16214);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3094:1: rule__SignalReference__SignalAssignment : ( ( RULE_ID ) ) ;
    public final void rule__SignalReference__SignalAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3098:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3099:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3099:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3100:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getSignalSignalCrossReference_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3101:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3102:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getSignalSignalIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SignalReference__SignalAssignment6249); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3113:1: rule__VariableReference__VariableAssignment : ( ( RULE_ID ) ) ;
    public final void rule__VariableReference__VariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3117:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3118:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3118:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3119:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getVariableVariableCrossReference_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3120:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3121:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getVariableVariableIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableReference__VariableAssignment6288); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3134:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3138:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3139:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3139:1: ( RULE_INT )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3140:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment6325); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3149:1: rule__FloatValue__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3153:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3154:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3154:1: ( RULE_FLOAT )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3155:1: RULE_FLOAT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueFloatTerminalRuleCall_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__FloatValue__ValueAssignment6356); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3164:1: rule__BooleanValue__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3168:1: ( ( RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3169:1: ( RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3169:1: ( RULE_BOOLEAN )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3170:1: RULE_BOOLEAN
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueBooleanTerminalRuleCall_0()); 
            }
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__BooleanValue__ValueAssignment6387); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3179:1: rule__ValOperation__OperatorAssignment_0 : ( ruleValOperator ) ;
    public final void rule__ValOperation__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3183:1: ( ( ruleValOperator ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3184:1: ( ruleValOperator )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3184:1: ( ruleValOperator )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3185:1: ruleValOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValOperationAccess().getOperatorValOperatorEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleValOperator_in_rule__ValOperation__OperatorAssignment_06418);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3194:1: rule__ValOperation__SubExpressionsAssignment_1 : ( ruleSignalReference ) ;
    public final void rule__ValOperation__SubExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3198:1: ( ( ruleSignalReference ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3199:1: ( ruleSignalReference )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3199:1: ( ruleSignalReference )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3200:1: ruleSignalReference
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValOperationAccess().getSubExpressionsSignalReferenceParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleSignalReference_in_rule__ValOperation__SubExpressionsAssignment_16449);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3209:1: rule__PlusOperation__OperatorAssignment_1_1 : ( rulePlusOperator ) ;
    public final void rule__PlusOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3213:1: ( ( rulePlusOperator ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3214:1: ( rulePlusOperator )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3214:1: ( rulePlusOperator )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3215:1: rulePlusOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getOperatorPlusOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_rulePlusOperator_in_rule__PlusOperation__OperatorAssignment_1_16480);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3224:1: rule__PlusOperation__SubExpressionsAssignment_1_2 : ( ruleMultOrDivOperation ) ;
    public final void rule__PlusOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3228:1: ( ( ruleMultOrDivOperation ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3229:1: ( ruleMultOrDivOperation )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3229:1: ( ruleMultOrDivOperation )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3230:1: ruleMultOrDivOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getSubExpressionsMultOrDivOperationParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleMultOrDivOperation_in_rule__PlusOperation__SubExpressionsAssignment_1_26511);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3239:1: rule__MultOperation__OperatorAssignment_1_1 : ( ruleMultOperator ) ;
    public final void rule__MultOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3243:1: ( ( ruleMultOperator ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3244:1: ( ruleMultOperator )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3244:1: ( ruleMultOperator )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3245:1: ruleMultOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getOperatorMultOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleMultOperator_in_rule__MultOperation__OperatorAssignment_1_16542);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3254:1: rule__MultOperation__SubExpressionsAssignment_1_2 : ( rulePreOrNormalValueExpression ) ;
    public final void rule__MultOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3258:1: ( ( rulePreOrNormalValueExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3259:1: ( rulePreOrNormalValueExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3259:1: ( rulePreOrNormalValueExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3260:1: rulePreOrNormalValueExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getSubExpressionsPreOrNormalValueExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_rulePreOrNormalValueExpression_in_rule__MultOperation__SubExpressionsAssignment_1_26573);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3269:1: rule__DivOperation__OperatorAssignment_1_1 : ( ruleDivOperator ) ;
    public final void rule__DivOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3273:1: ( ( ruleDivOperator ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3274:1: ( ruleDivOperator )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3274:1: ( ruleDivOperator )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3275:1: ruleDivOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getOperatorDivOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleDivOperator_in_rule__DivOperation__OperatorAssignment_1_16604);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3284:1: rule__DivOperation__SubExpressionsAssignment_1_2 : ( rulePreOrNormalValueExpression ) ;
    public final void rule__DivOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3288:1: ( ( rulePreOrNormalValueExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3289:1: ( rulePreOrNormalValueExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3289:1: ( rulePreOrNormalValueExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3290:1: rulePreOrNormalValueExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getSubExpressionsPreOrNormalValueExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_rulePreOrNormalValueExpression_in_rule__DivOperation__SubExpressionsAssignment_1_26635);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3299:1: rule__PreArithmOperation__OperatorAssignment_0 : ( ruleUnaryParanthesedOperator ) ;
    public final void rule__PreArithmOperation__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3303:1: ( ( ruleUnaryParanthesedOperator ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3304:1: ( ruleUnaryParanthesedOperator )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3304:1: ( ruleUnaryParanthesedOperator )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3305:1: ruleUnaryParanthesedOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreArithmOperationAccess().getOperatorUnaryParanthesedOperatorEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleUnaryParanthesedOperator_in_rule__PreArithmOperation__OperatorAssignment_06666);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3314:1: rule__PreArithmOperation__SubExpressionsAssignment_2 : ( ruleValOperation ) ;
    public final void rule__PreArithmOperation__SubExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3318:1: ( ( ruleValOperation ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3319:1: ( ruleValOperation )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3319:1: ( ruleValOperation )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3320:1: ruleValOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreArithmOperationAccess().getSubExpressionsValOperationParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleValOperation_in_rule__PreArithmOperation__SubExpressionsAssignment_26697);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3329:1: rule__CompareOperation__OperatorAssignment_1_1 : ( ruleCompareOperator ) ;
    public final void rule__CompareOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3333:1: ( ( ruleCompareOperator ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3334:1: ( ruleCompareOperator )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3334:1: ( ruleCompareOperator )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3335:1: ruleCompareOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleCompareOperator_in_rule__CompareOperation__OperatorAssignment_1_16728);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3344:1: rule__CompareOperation__SubExpressionsAssignment_1_2 : ( ruleValueExpression ) ;
    public final void rule__CompareOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3348:1: ( ( ruleValueExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3349:1: ( ruleValueExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3349:1: ( ruleValueExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3350:1: ruleValueExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsValueExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleValueExpression_in_rule__CompareOperation__SubExpressionsAssignment_1_26759);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3359:1: rule__UnaryOperation__OperatorAssignment_0 : ( ruleUnaryOperator ) ;
    public final void rule__UnaryOperation__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3363:1: ( ( ruleUnaryOperator ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3364:1: ( ruleUnaryOperator )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3364:1: ( ruleUnaryOperator )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3365:1: ruleUnaryOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getOperatorUnaryOperatorEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleUnaryOperator_in_rule__UnaryOperation__OperatorAssignment_06790);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3374:1: rule__UnaryOperation__SubExpressionsAssignment_1 : ( ruleParanthesedBooleanExpression ) ;
    public final void rule__UnaryOperation__SubExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3378:1: ( ( ruleParanthesedBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3379:1: ( ruleParanthesedBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3379:1: ( ruleParanthesedBooleanExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3380:1: ruleParanthesedBooleanExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getSubExpressionsParanthesedBooleanExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleParanthesedBooleanExpression_in_rule__UnaryOperation__SubExpressionsAssignment_16821);
            ruleParanthesedBooleanExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getUnaryOperationAccess().getSubExpressionsParanthesedBooleanExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3389:1: rule__UnaryParanthesedOperation__OperatorAssignment_0 : ( ruleUnaryParanthesedOperator ) ;
    public final void rule__UnaryParanthesedOperation__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3393:1: ( ( ruleUnaryParanthesedOperator ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3394:1: ( ruleUnaryParanthesedOperator )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3394:1: ( ruleUnaryParanthesedOperator )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3395:1: ruleUnaryParanthesedOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperationAccess().getOperatorUnaryParanthesedOperatorEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleUnaryParanthesedOperator_in_rule__UnaryParanthesedOperation__OperatorAssignment_06852);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3404:1: rule__UnaryParanthesedOperation__SubExpressionsAssignment_2 : ( ruleBooleanExpression ) ;
    public final void rule__UnaryParanthesedOperation__SubExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3408:1: ( ( ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3409:1: ( ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3409:1: ( ruleBooleanExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3410:1: ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperationAccess().getSubExpressionsBooleanExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_rule__UnaryParanthesedOperation__SubExpressionsAssignment_26883);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3419:1: rule__AndOperation__OperatorAssignment_1_1 : ( ruleOperatorAnd ) ;
    public final void rule__AndOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3423:1: ( ( ruleOperatorAnd ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3424:1: ( ruleOperatorAnd )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3424:1: ( ruleOperatorAnd )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3425:1: ruleOperatorAnd
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getOperatorOperatorAndEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleOperatorAnd_in_rule__AndOperation__OperatorAssignment_1_16914);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3434:1: rule__AndOperation__SubExpressionsAssignment_1_2 : ( ruleUnaryOrNormalExpression ) ;
    public final void rule__AndOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3438:1: ( ( ruleUnaryOrNormalExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3439:1: ( ruleUnaryOrNormalExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3439:1: ( ruleUnaryOrNormalExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3440:1: ruleUnaryOrNormalExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getSubExpressionsUnaryOrNormalExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleUnaryOrNormalExpression_in_rule__AndOperation__SubExpressionsAssignment_1_26945);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3449:1: rule__OrOperation__OperatorAssignment_1_1 : ( ruleOperatorOr ) ;
    public final void rule__OrOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3453:1: ( ( ruleOperatorOr ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3454:1: ( ruleOperatorOr )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3454:1: ( ruleOperatorOr )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3455:1: ruleOperatorOr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getOperatorOperatorOrEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleOperatorOr_in_rule__OrOperation__OperatorAssignment_1_16976);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3464:1: rule__OrOperation__SubExpressionsAssignment_1_2 : ( ruleAndOperation ) ;
    public final void rule__OrOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3468:1: ( ( ruleAndOperation ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3469:1: ( ruleAndOperation )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3469:1: ( ruleAndOperation )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3470:1: ruleAndOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getSubExpressionsAndOperationParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleAndOperation_in_rule__OrOperation__SubExpressionsAssignment_1_27007);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3479:1: rule__HostCode__CodeAssignment_0 : ( RULE_STRING ) ;
    public final void rule__HostCode__CodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3483:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3484:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3484:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3485:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getHostCodeAccess().getCodeSTRINGTerminalRuleCall_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__HostCode__CodeAssignment_07038); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3494:1: rule__HostCode__TypeAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__HostCode__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3498:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3499:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3499:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3500:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getHostCodeAccess().getTypeIDTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HostCode__TypeAssignment_1_17069); if (failed) return ;
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

    // $ANTLR start synpred16
    public final void synpred16_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1212:6: ( ( ruleCompareOperation ) )
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1212:6: ( ruleCompareOperation )
        {
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1212:6: ( ruleCompareOperation )
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1213:1: ruleCompareOperation
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getParanthesedBooleanExpressionAccess().getCompareOperationParserRuleCall_1()); 
        }
        pushFollow(FOLLOW_ruleCompareOperation_in_synpred162560);
        ruleCompareOperation();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred16

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
    public static final BitSet FOLLOW_ruleUnaryOperation_in_rule__UnaryOrNormalExpression__Alternatives2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryParanthesedOperation_in_rule__UnaryOrNormalExpression__Alternatives2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParanthesedBooleanExpression_in_rule__UnaryOrNormalExpression__Alternatives2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_rule__ParanthesedBooleanExpression__Alternatives2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_rule__ParanthesedBooleanExpression__Alternatives2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_rule__ParanthesedBooleanExpression__Alternatives2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperation_in_rule__ParanthesedBooleanExpression__Alternatives2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostCode_in_rule__ParanthesedBooleanExpression__Alternatives2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanthesedBooleanExpression__Group_5__0_in_rule__ParanthesedBooleanExpression__Alternatives2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CompareOperator__Alternatives2663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__CompareOperator__Alternatives2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__CompareOperator__Alternatives2705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__CompareOperator__Alternatives2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CompareOperator__Alternatives2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__PlusOperator__Alternatives2783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__PlusOperator__Alternatives2804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MultOperator__Alternatives2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__MultOperator__Alternatives2861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__IsImmediateAssignment_0_in_rule__Action__Group__02898 = new BitSet(new long[]{0x000000002004E1F2L});
    public static final BitSet FOLLOW_rule__Action__Group__1_in_rule__Action__Group__02908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__DelayAssignment_1_in_rule__Action__Group__12936 = new BitSet(new long[]{0x000000002004E1F2L});
    public static final BitSet FOLLOW_rule__Action__Group__2_in_rule__Action__Group__12946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__TriggerAssignment_2_in_rule__Action__Group__22974 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Action__Group__3_in_rule__Action__Group__22984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_3__0_in_rule__Action__Group__33012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Action__Group_3__03056 = new BitSet(new long[]{0x0000000000000122L});
    public static final BitSet FOLLOW_rule__Action__Group_3__1_in_rule__Action__Group_3__03066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_3_1__0_in_rule__Action__Group_3__13094 = new BitSet(new long[]{0x0000000000000122L});
    public static final BitSet FOLLOW_rule__Action__EffectsAssignment_3_1_0_in_rule__Action__Group_3_1__03133 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__Action__Group_3_1__1_in_rule__Action__Group_3_1__03142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Action__Group_3_1__13172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__SignalAssignment_0_in_rule__Emission__Group__03213 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Emission__Group__1_in_rule__Emission__Group__03222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Alternatives_1_in_rule__Emission__Group__13250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Emission__Group_1_0__03290 = new BitSet(new long[]{0x000000002000A170L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_0__1_in_rule__Emission__Group_1_0__03300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__NewValueAssignment_1_0_1_in_rule__Emission__Group_1_0__13328 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_0__2_in_rule__Emission__Group_1_0__13337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Emission__Group_1_0__23366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Emission__Group_1_1__03408 = new BitSet(new long[]{0x000000002000E1F0L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_1__1_in_rule__Emission__Group_1_1__03418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__NewValueAssignment_1_1_1_in_rule__Emission__Group_1_1__13446 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_1__2_in_rule__Emission__Group_1_1__13455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Emission__Group_1_1__23484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__VariableAssignment_0_in_rule__Assignment__Group__03525 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__03534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Assignment__Group__13563 = new BitSet(new long[]{0x000000002000E1F0L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__13573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Alternatives_2_in_rule__Assignment__Group__23601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValOperation__OperatorAssignment_0_in_rule__ValOperation__Group__03641 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ValOperation__Group__1_in_rule__ValOperation__Group__03650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValOperation__SubExpressionsAssignment_1_in_rule__ValOperation__Group__13678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ParanthesedValueExpression__Group_5__03717 = new BitSet(new long[]{0x000000002000A170L});
    public static final BitSet FOLLOW_rule__ParanthesedValueExpression__Group_5__1_in_rule__ParanthesedValueExpression__Group_5__03727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOperation_in_rule__ParanthesedValueExpression__Group_5__13755 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ParanthesedValueExpression__Group_5__2_in_rule__ParanthesedValueExpression__Group_5__13763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ParanthesedValueExpression__Group_5__23792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ParanthesedValueExpression__Group_6__03834 = new BitSet(new long[]{0x000000002000A170L});
    public static final BitSet FOLLOW_rule__ParanthesedValueExpression__Group_6__1_in_rule__ParanthesedValueExpression__Group_6__03844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivOperation_in_rule__ParanthesedValueExpression__Group_6__13872 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ParanthesedValueExpression__Group_6__2_in_rule__ParanthesedValueExpression__Group_6__13880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ParanthesedValueExpression__Group_6__23909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOrDivOperation_in_rule__PlusOperation__Group__03950 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_rule__PlusOperation__Group__1_in_rule__PlusOperation__Group__03958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOperation__Group_1__0_in_rule__PlusOperation__Group__13986 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_rule__PlusOperation__Group_1__1_in_rule__PlusOperation__Group_1__04035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOperation__OperatorAssignment_1_1_in_rule__PlusOperation__Group_1__14063 = new BitSet(new long[]{0x000000002000A170L});
    public static final BitSet FOLLOW_rule__PlusOperation__Group_1__2_in_rule__PlusOperation__Group_1__14072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOperation__SubExpressionsAssignment_1_2_in_rule__PlusOperation__Group_1__24100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__MultOrDivOperation__Group_1__04141 = new BitSet(new long[]{0x000000002000A170L});
    public static final BitSet FOLLOW_rule__MultOrDivOperation__Group_1__1_in_rule__MultOrDivOperation__Group_1__04151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivOperation_in_rule__MultOrDivOperation__Group_1__14179 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__MultOrDivOperation__Group_1__2_in_rule__MultOrDivOperation__Group_1__14187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__MultOrDivOperation__Group_1__24216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOrNormalValueExpression_in_rule__MultOperation__Group__04257 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_rule__MultOperation__Group__1_in_rule__MultOperation__Group__04265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultOperation__Group_1__0_in_rule__MultOperation__Group__14293 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_rule__MultOperation__Group_1__1_in_rule__MultOperation__Group_1__04342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultOperation__OperatorAssignment_1_1_in_rule__MultOperation__Group_1__14370 = new BitSet(new long[]{0x000000002000A170L});
    public static final BitSet FOLLOW_rule__MultOperation__Group_1__2_in_rule__MultOperation__Group_1__14379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultOperation__SubExpressionsAssignment_1_2_in_rule__MultOperation__Group_1__24407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOrNormalValueExpression_in_rule__DivOperation__Group__04447 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__DivOperation__Group__1_in_rule__DivOperation__Group__04455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivOperation__Group_1__0_in_rule__DivOperation__Group__14483 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__DivOperation__Group_1__1_in_rule__DivOperation__Group_1__04532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivOperation__OperatorAssignment_1_1_in_rule__DivOperation__Group_1__14560 = new BitSet(new long[]{0x000000002000A170L});
    public static final BitSet FOLLOW_rule__DivOperation__Group_1__2_in_rule__DivOperation__Group_1__14569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivOperation__SubExpressionsAssignment_1_2_in_rule__DivOperation__Group_1__24597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreArithmOperation__OperatorAssignment_0_in_rule__PreArithmOperation__Group__04637 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__PreArithmOperation__Group__1_in_rule__PreArithmOperation__Group__04646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__PreArithmOperation__Group__14675 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__PreArithmOperation__Group__2_in_rule__PreArithmOperation__Group__14685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreArithmOperation__SubExpressionsAssignment_2_in_rule__PreArithmOperation__Group__24713 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__PreArithmOperation__Group__3_in_rule__PreArithmOperation__Group__24722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__PreArithmOperation__Group__34751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_rule__CompareOperation__Group__04794 = new BitSet(new long[]{0x0000000000F80000L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group__1_in_rule__CompareOperation__Group__04802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_1__0_in_rule__CompareOperation__Group__14830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_1__1_in_rule__CompareOperation__Group_1__04878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__OperatorAssignment_1_1_in_rule__CompareOperation__Group_1__14906 = new BitSet(new long[]{0x000000002000A170L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_1__2_in_rule__CompareOperation__Group_1__14915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__SubExpressionsAssignment_1_2_in_rule__CompareOperation__Group_1__24943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryOperation__OperatorAssignment_0_in_rule__UnaryOperation__Group__04983 = new BitSet(new long[]{0x000000002000A1F0L});
    public static final BitSet FOLLOW_rule__UnaryOperation__Group__1_in_rule__UnaryOperation__Group__04992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryOperation__SubExpressionsAssignment_1_in_rule__UnaryOperation__Group__15020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__OperatorAssignment_0_in_rule__UnaryParanthesedOperation__Group__05058 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__Group__1_in_rule__UnaryParanthesedOperation__Group__05067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__UnaryParanthesedOperation__Group__15096 = new BitSet(new long[]{0x000000002000E1F0L});
    public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__Group__2_in_rule__UnaryParanthesedOperation__Group__15106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__SubExpressionsAssignment_2_in_rule__UnaryParanthesedOperation__Group__25134 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__Group__3_in_rule__UnaryParanthesedOperation__Group__25143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__UnaryParanthesedOperation__Group__35172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOrNormalExpression_in_rule__AndOperation__Group__05215 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__AndOperation__Group__1_in_rule__AndOperation__Group__05223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndOperation__Group_1__0_in_rule__AndOperation__Group__15251 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__AndOperation__Group_1__1_in_rule__AndOperation__Group_1__05300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndOperation__OperatorAssignment_1_1_in_rule__AndOperation__Group_1__15328 = new BitSet(new long[]{0x000000002000E1F0L});
    public static final BitSet FOLLOW_rule__AndOperation__Group_1__2_in_rule__AndOperation__Group_1__15337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndOperation__SubExpressionsAssignment_1_2_in_rule__AndOperation__Group_1__25365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperation_in_rule__OrOperation__Group__05405 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__OrOperation__Group__1_in_rule__OrOperation__Group__05413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrOperation__Group_1__0_in_rule__OrOperation__Group__15441 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__OrOperation__Group_1__1_in_rule__OrOperation__Group_1__05490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrOperation__OperatorAssignment_1_1_in_rule__OrOperation__Group_1__15518 = new BitSet(new long[]{0x000000002000E1F0L});
    public static final BitSet FOLLOW_rule__OrOperation__Group_1__2_in_rule__OrOperation__Group_1__15527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrOperation__SubExpressionsAssignment_1_2_in_rule__OrOperation__Group_1__25555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ParanthesedBooleanExpression__Group_5__05596 = new BitSet(new long[]{0x000000002000E1F0L});
    public static final BitSet FOLLOW_rule__ParanthesedBooleanExpression__Group_5__1_in_rule__ParanthesedBooleanExpression__Group_5__05606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrOperation_in_rule__ParanthesedBooleanExpression__Group_5__15634 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ParanthesedBooleanExpression__Group_5__2_in_rule__ParanthesedBooleanExpression__Group_5__15642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ParanthesedBooleanExpression__Group_5__25671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HostCode__CodeAssignment_0_in_rule__HostCode__Group__05712 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__HostCode__Group__1_in_rule__HostCode__Group__05721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HostCode__Group_1__0_in_rule__HostCode__Group__15749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__HostCode__Group_1__05789 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__HostCode__Group_1__1_in_rule__HostCode__Group_1__05799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HostCode__TypeAssignment_1_1_in_rule__HostCode__Group_1__15827 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__HostCode__Group_1__2_in_rule__HostCode__Group_1__15836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__HostCode__Group_1__25865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Action__IsImmediateAssignment_05911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Action__DelayAssignment_15950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__Action__TriggerAssignment_25981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffect_in_rule__Action__EffectsAssignment_3_1_06012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Emission__SignalAssignment_06047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_rule__Emission__NewValueAssignment_1_0_16082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__Emission__NewValueAssignment_1_1_16113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Assignment__VariableAssignment_06148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_rule__Assignment__ExpressionAssignment_2_06183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__Assignment__ExpressionAssignment_2_16214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SignalReference__SignalAssignment6249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableReference__VariableAssignment6288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment6325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__FloatValue__ValueAssignment6356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__BooleanValue__ValueAssignment6387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperator_in_rule__ValOperation__OperatorAssignment_06418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_rule__ValOperation__SubExpressionsAssignment_16449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOperator_in_rule__PlusOperation__OperatorAssignment_1_16480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOrDivOperation_in_rule__PlusOperation__SubExpressionsAssignment_1_26511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOperator_in_rule__MultOperation__OperatorAssignment_1_16542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOrNormalValueExpression_in_rule__MultOperation__SubExpressionsAssignment_1_26573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivOperator_in_rule__DivOperation__OperatorAssignment_1_16604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOrNormalValueExpression_in_rule__DivOperation__SubExpressionsAssignment_1_26635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryParanthesedOperator_in_rule__PreArithmOperation__OperatorAssignment_06666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperation_in_rule__PreArithmOperation__SubExpressionsAssignment_26697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperator_in_rule__CompareOperation__OperatorAssignment_1_16728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_rule__CompareOperation__SubExpressionsAssignment_1_26759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperator_in_rule__UnaryOperation__OperatorAssignment_06790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParanthesedBooleanExpression_in_rule__UnaryOperation__SubExpressionsAssignment_16821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryParanthesedOperator_in_rule__UnaryParanthesedOperation__OperatorAssignment_06852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__UnaryParanthesedOperation__SubExpressionsAssignment_26883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorAnd_in_rule__AndOperation__OperatorAssignment_1_16914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOrNormalExpression_in_rule__AndOperation__SubExpressionsAssignment_1_26945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorOr_in_rule__OrOperation__OperatorAssignment_1_16976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperation_in_rule__OrOperation__SubExpressionsAssignment_1_27007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__HostCode__CodeAssignment_07038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HostCode__TypeAssignment_1_17069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_0__0_in_synpred32139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ExpressionAssignment_2_0_in_synpred42190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanthesedValueExpression__Group_5__0_in_synpred102327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOperation_in_synpred112378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_synpred162560 = new BitSet(new long[]{0x0000000000000002L});

}