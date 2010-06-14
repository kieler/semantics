package de.cau.cs.kieler.synccharts.labelparser.ui.contentassist.antlr.internal; 

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
import de.cau.cs.kieler.synccharts.labelparser.services.ActionLabelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalActionLabelParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'?'", "'not'", "'pre'", "'or'", "'and'", "'/'", "'='", "'<'", "'<='", "'>'", "'>='", "'<>'", "'+'", "'-'", "'*'", "'mod'", "','", "'('", "')'", "':='", "'#'"
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
            ruleMemo = new HashMap[348+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g"; }


     
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:62:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:63:1: ( ruleAction EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:64:1: ruleAction EOF
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:71:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:75:2: ( ( ( rule__Action__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:76:1: ( ( rule__Action__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:76:1: ( ( rule__Action__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:77:1: ( rule__Action__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:78:1: ( rule__Action__Group__0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:78:2: rule__Action__Group__0
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:90:1: entryRuleEffect : ruleEffect EOF ;
    public final void entryRuleEffect() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:91:1: ( ruleEffect EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:92:1: ruleEffect EOF
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:99:1: ruleEffect : ( ( rule__Effect__Alternatives ) ) ;
    public final void ruleEffect() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:103:2: ( ( ( rule__Effect__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:104:1: ( ( rule__Effect__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:104:1: ( ( rule__Effect__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:105:1: ( rule__Effect__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEffectAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:106:1: ( rule__Effect__Alternatives )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:106:2: rule__Effect__Alternatives
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:118:1: entryRuleEmission : ruleEmission EOF ;
    public final void entryRuleEmission() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:119:1: ( ruleEmission EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:120:1: ruleEmission EOF
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:127:1: ruleEmission : ( ( rule__Emission__Group__0 ) ) ;
    public final void ruleEmission() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:131:2: ( ( ( rule__Emission__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:132:1: ( ( rule__Emission__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:132:1: ( ( rule__Emission__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:133:1: ( rule__Emission__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:134:1: ( rule__Emission__Group__0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:134:2: rule__Emission__Group__0
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:146:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:147:1: ( ruleAssignment EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:148:1: ruleAssignment EOF
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:155:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:159:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:160:1: ( ( rule__Assignment__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:160:1: ( ( rule__Assignment__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:161:1: ( rule__Assignment__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:162:1: ( rule__Assignment__Group__0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:162:2: rule__Assignment__Group__0
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


    // $ANTLR start entryRuleSignalReference
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:174:1: entryRuleSignalReference : ruleSignalReference EOF ;
    public final void entryRuleSignalReference() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:175:1: ( ruleSignalReference EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:176:1: ruleSignalReference EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleSignalReference_in_entryRuleSignalReference307);
            ruleSignalReference();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSignalReferenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalReference314); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:183:1: ruleSignalReference : ( ( rule__SignalReference__Group__0 ) ) ;
    public final void ruleSignalReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:187:2: ( ( ( rule__SignalReference__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:188:1: ( ( rule__SignalReference__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:188:1: ( ( rule__SignalReference__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:189:1: ( rule__SignalReference__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:190:1: ( rule__SignalReference__Group__0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:190:2: rule__SignalReference__Group__0
            {
            pushFollow(FOLLOW_rule__SignalReference__Group__0_in_ruleSignalReference340);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:202:1: entryRuleVariableReference : ruleVariableReference EOF ;
    public final void entryRuleVariableReference() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:203:1: ( ruleVariableReference EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:204:1: ruleVariableReference EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleVariableReference_in_entryRuleVariableReference367);
            ruleVariableReference();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getVariableReferenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableReference374); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:211:1: ruleVariableReference : ( ( rule__VariableReference__Group__0 ) ) ;
    public final void ruleVariableReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:215:2: ( ( ( rule__VariableReference__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:216:1: ( ( rule__VariableReference__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:216:1: ( ( rule__VariableReference__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:217:1: ( rule__VariableReference__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:218:1: ( rule__VariableReference__Group__0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:218:2: rule__VariableReference__Group__0
            {
            pushFollow(FOLLOW_rule__VariableReference__Group__0_in_ruleVariableReference400);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:234:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:235:1: ( ruleIntValue EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:236:1: ruleIntValue EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue431);
            ruleIntValue();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getIntValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue438); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:243:1: ruleIntValue : ( ( rule__IntValue__ValueAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:247:2: ( ( ( rule__IntValue__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:248:1: ( ( rule__IntValue__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:248:1: ( ( rule__IntValue__ValueAssignment ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:249:1: ( rule__IntValue__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:250:1: ( rule__IntValue__ValueAssignment )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:250:2: rule__IntValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue464);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:262:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:263:1: ( ruleFloatValue EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:264:1: ruleFloatValue EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFloatValueRule()); 
            }
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue491);
            ruleFloatValue();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getFloatValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue498); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:271:1: ruleFloatValue : ( ( rule__FloatValue__ValueAssignment ) ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:275:2: ( ( ( rule__FloatValue__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:276:1: ( ( rule__FloatValue__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:276:1: ( ( rule__FloatValue__ValueAssignment ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:277:1: ( rule__FloatValue__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:278:1: ( rule__FloatValue__ValueAssignment )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:278:2: rule__FloatValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue524);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:290:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:291:1: ( ruleBooleanValue EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:292:1: ruleBooleanValue EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanValueRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue551);
            ruleBooleanValue();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getBooleanValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue558); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:299:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:303:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:304:1: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:304:1: ( ( rule__BooleanValue__ValueAssignment ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:305:1: ( rule__BooleanValue__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:306:1: ( rule__BooleanValue__ValueAssignment )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:306:2: rule__BooleanValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__BooleanValue__ValueAssignment_in_ruleBooleanValue584);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:320:1: entryRuleValOperation : ruleValOperation EOF ;
    public final void entryRuleValOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:321:1: ( ruleValOperation EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:322:1: ruleValOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValOperationRule()); 
            }
            pushFollow(FOLLOW_ruleValOperation_in_entryRuleValOperation613);
            ruleValOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getValOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValOperation620); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:329:1: ruleValOperation : ( ( rule__ValOperation__Group__0 ) ) ;
    public final void ruleValOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:333:2: ( ( ( rule__ValOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:334:1: ( ( rule__ValOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:334:1: ( ( rule__ValOperation__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:335:1: ( rule__ValOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:336:1: ( rule__ValOperation__Group__0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:336:2: rule__ValOperation__Group__0
            {
            pushFollow(FOLLOW_rule__ValOperation__Group__0_in_ruleValOperation646);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:348:1: entryRuleValueExpression : ruleValueExpression EOF ;
    public final void entryRuleValueExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:349:1: ( ruleValueExpression EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:350:1: ruleValueExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValueExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleValueExpression_in_entryRuleValueExpression673);
            ruleValueExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getValueExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueExpression680); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:357:1: ruleValueExpression : ( rulePlusOperation ) ;
    public final void ruleValueExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:361:2: ( ( rulePlusOperation ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:362:1: ( rulePlusOperation )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:362:1: ( rulePlusOperation )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:363:1: rulePlusOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValueExpressionAccess().getPlusOperationParserRuleCall()); 
            }
            pushFollow(FOLLOW_rulePlusOperation_in_ruleValueExpression706);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:376:1: entryRuleParanthesedValueExpression : ruleParanthesedValueExpression EOF ;
    public final void entryRuleParanthesedValueExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:377:1: ( ruleParanthesedValueExpression EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:378:1: ruleParanthesedValueExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedValueExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParanthesedValueExpression_in_entryRuleParanthesedValueExpression732);
            ruleParanthesedValueExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParanthesedValueExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParanthesedValueExpression739); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:385:1: ruleParanthesedValueExpression : ( ( rule__ParanthesedValueExpression__Alternatives ) ) ;
    public final void ruleParanthesedValueExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:389:2: ( ( ( rule__ParanthesedValueExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:390:1: ( ( rule__ParanthesedValueExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:390:1: ( ( rule__ParanthesedValueExpression__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:391:1: ( rule__ParanthesedValueExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedValueExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:392:1: ( rule__ParanthesedValueExpression__Alternatives )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:392:2: rule__ParanthesedValueExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__ParanthesedValueExpression__Alternatives_in_ruleParanthesedValueExpression765);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:404:1: entryRulePlusOperation : rulePlusOperation EOF ;
    public final void entryRulePlusOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:405:1: ( rulePlusOperation EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:406:1: rulePlusOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationRule()); 
            }
            pushFollow(FOLLOW_rulePlusOperation_in_entryRulePlusOperation792);
            rulePlusOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPlusOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePlusOperation799); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:413:1: rulePlusOperation : ( ( rule__PlusOperation__Group__0 ) ) ;
    public final void rulePlusOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:417:2: ( ( ( rule__PlusOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:418:1: ( ( rule__PlusOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:418:1: ( ( rule__PlusOperation__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:419:1: ( rule__PlusOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:420:1: ( rule__PlusOperation__Group__0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:420:2: rule__PlusOperation__Group__0
            {
            pushFollow(FOLLOW_rule__PlusOperation__Group__0_in_rulePlusOperation825);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:432:1: entryRuleMultOrDivOperation : ruleMultOrDivOperation EOF ;
    public final void entryRuleMultOrDivOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:433:1: ( ruleMultOrDivOperation EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:434:1: ruleMultOrDivOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOrDivOperationRule()); 
            }
            pushFollow(FOLLOW_ruleMultOrDivOperation_in_entryRuleMultOrDivOperation852);
            ruleMultOrDivOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMultOrDivOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultOrDivOperation859); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:441:1: ruleMultOrDivOperation : ( ( rule__MultOrDivOperation__Alternatives ) ) ;
    public final void ruleMultOrDivOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:445:2: ( ( ( rule__MultOrDivOperation__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:446:1: ( ( rule__MultOrDivOperation__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:446:1: ( ( rule__MultOrDivOperation__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:447:1: ( rule__MultOrDivOperation__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOrDivOperationAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:448:1: ( rule__MultOrDivOperation__Alternatives )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:448:2: rule__MultOrDivOperation__Alternatives
            {
            pushFollow(FOLLOW_rule__MultOrDivOperation__Alternatives_in_ruleMultOrDivOperation885);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:460:1: entryRuleMultOperation : ruleMultOperation EOF ;
    public final void entryRuleMultOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:461:1: ( ruleMultOperation EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:462:1: ruleMultOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationRule()); 
            }
            pushFollow(FOLLOW_ruleMultOperation_in_entryRuleMultOperation912);
            ruleMultOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMultOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultOperation919); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:469:1: ruleMultOperation : ( ( rule__MultOperation__Group__0 ) ) ;
    public final void ruleMultOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:473:2: ( ( ( rule__MultOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:474:1: ( ( rule__MultOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:474:1: ( ( rule__MultOperation__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:475:1: ( rule__MultOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:476:1: ( rule__MultOperation__Group__0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:476:2: rule__MultOperation__Group__0
            {
            pushFollow(FOLLOW_rule__MultOperation__Group__0_in_ruleMultOperation945);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:488:1: entryRuleDivOperation : ruleDivOperation EOF ;
    public final void entryRuleDivOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:489:1: ( ruleDivOperation EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:490:1: ruleDivOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationRule()); 
            }
            pushFollow(FOLLOW_ruleDivOperation_in_entryRuleDivOperation972);
            ruleDivOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDivOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivOperation979); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:497:1: ruleDivOperation : ( ( rule__DivOperation__Group__0 ) ) ;
    public final void ruleDivOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:501:2: ( ( ( rule__DivOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:502:1: ( ( rule__DivOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:502:1: ( ( rule__DivOperation__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:503:1: ( rule__DivOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:504:1: ( rule__DivOperation__Group__0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:504:2: rule__DivOperation__Group__0
            {
            pushFollow(FOLLOW_rule__DivOperation__Group__0_in_ruleDivOperation1005);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:516:1: entryRulePreArithmOperation : rulePreArithmOperation EOF ;
    public final void entryRulePreArithmOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:517:1: ( rulePreArithmOperation EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:518:1: rulePreArithmOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreArithmOperationRule()); 
            }
            pushFollow(FOLLOW_rulePreArithmOperation_in_entryRulePreArithmOperation1032);
            rulePreArithmOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPreArithmOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePreArithmOperation1039); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:525:1: rulePreArithmOperation : ( ( rule__PreArithmOperation__Group__0 ) ) ;
    public final void rulePreArithmOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:529:2: ( ( ( rule__PreArithmOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:530:1: ( ( rule__PreArithmOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:530:1: ( ( rule__PreArithmOperation__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:531:1: ( rule__PreArithmOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreArithmOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:532:1: ( rule__PreArithmOperation__Group__0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:532:2: rule__PreArithmOperation__Group__0
            {
            pushFollow(FOLLOW_rule__PreArithmOperation__Group__0_in_rulePreArithmOperation1065);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:544:1: entryRulePreOrNormalValueExpression : rulePreOrNormalValueExpression EOF ;
    public final void entryRulePreOrNormalValueExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:545:1: ( rulePreOrNormalValueExpression EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:546:1: rulePreOrNormalValueExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreOrNormalValueExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePreOrNormalValueExpression_in_entryRulePreOrNormalValueExpression1092);
            rulePreOrNormalValueExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPreOrNormalValueExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePreOrNormalValueExpression1099); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:553:1: rulePreOrNormalValueExpression : ( ( rule__PreOrNormalValueExpression__Alternatives ) ) ;
    public final void rulePreOrNormalValueExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:557:2: ( ( ( rule__PreOrNormalValueExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:558:1: ( ( rule__PreOrNormalValueExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:558:1: ( ( rule__PreOrNormalValueExpression__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:559:1: ( rule__PreOrNormalValueExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreOrNormalValueExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:560:1: ( rule__PreOrNormalValueExpression__Alternatives )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:560:2: rule__PreOrNormalValueExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__PreOrNormalValueExpression__Alternatives_in_rulePreOrNormalValueExpression1125);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:572:1: entryRuleCompareOperation : ruleCompareOperation EOF ;
    public final void entryRuleCompareOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:573:1: ( ruleCompareOperation EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:574:1: ruleCompareOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationRule()); 
            }
            pushFollow(FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation1152);
            ruleCompareOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getCompareOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareOperation1159); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:581:1: ruleCompareOperation : ( ( rule__CompareOperation__Group__0 ) ) ;
    public final void ruleCompareOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:585:2: ( ( ( rule__CompareOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:586:1: ( ( rule__CompareOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:586:1: ( ( rule__CompareOperation__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:587:1: ( rule__CompareOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:588:1: ( rule__CompareOperation__Group__0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:588:2: rule__CompareOperation__Group__0
            {
            pushFollow(FOLLOW_rule__CompareOperation__Group__0_in_ruleCompareOperation1185);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:600:1: entryRuleUnaryOperation : ruleUnaryOperation EOF ;
    public final void entryRuleUnaryOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:601:1: ( ruleUnaryOperation EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:602:1: ruleUnaryOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation1212);
            ruleUnaryOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getUnaryOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryOperation1219); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:609:1: ruleUnaryOperation : ( ( rule__UnaryOperation__Group__0 ) ) ;
    public final void ruleUnaryOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:613:2: ( ( ( rule__UnaryOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:614:1: ( ( rule__UnaryOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:614:1: ( ( rule__UnaryOperation__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:615:1: ( rule__UnaryOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:616:1: ( rule__UnaryOperation__Group__0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:616:2: rule__UnaryOperation__Group__0
            {
            pushFollow(FOLLOW_rule__UnaryOperation__Group__0_in_ruleUnaryOperation1245);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:628:1: entryRuleUnaryParanthesedOperation : ruleUnaryParanthesedOperation EOF ;
    public final void entryRuleUnaryParanthesedOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:629:1: ( ruleUnaryParanthesedOperation EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:630:1: ruleUnaryParanthesedOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperationRule()); 
            }
            pushFollow(FOLLOW_ruleUnaryParanthesedOperation_in_entryRuleUnaryParanthesedOperation1272);
            ruleUnaryParanthesedOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getUnaryParanthesedOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryParanthesedOperation1279); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:637:1: ruleUnaryParanthesedOperation : ( ( rule__UnaryParanthesedOperation__Group__0 ) ) ;
    public final void ruleUnaryParanthesedOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:641:2: ( ( ( rule__UnaryParanthesedOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:642:1: ( ( rule__UnaryParanthesedOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:642:1: ( ( rule__UnaryParanthesedOperation__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:643:1: ( rule__UnaryParanthesedOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:644:1: ( rule__UnaryParanthesedOperation__Group__0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:644:2: rule__UnaryParanthesedOperation__Group__0
            {
            pushFollow(FOLLOW_rule__UnaryParanthesedOperation__Group__0_in_ruleUnaryParanthesedOperation1305);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:656:1: entryRuleUnaryOrNormalExpression : ruleUnaryOrNormalExpression EOF ;
    public final void entryRuleUnaryOrNormalExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:657:1: ( ruleUnaryOrNormalExpression EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:658:1: ruleUnaryOrNormalExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryOrNormalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleUnaryOrNormalExpression_in_entryRuleUnaryOrNormalExpression1332);
            ruleUnaryOrNormalExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getUnaryOrNormalExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryOrNormalExpression1339); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:665:1: ruleUnaryOrNormalExpression : ( ( rule__UnaryOrNormalExpression__Alternatives ) ) ;
    public final void ruleUnaryOrNormalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:669:2: ( ( ( rule__UnaryOrNormalExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:670:1: ( ( rule__UnaryOrNormalExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:670:1: ( ( rule__UnaryOrNormalExpression__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:671:1: ( rule__UnaryOrNormalExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryOrNormalExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:672:1: ( rule__UnaryOrNormalExpression__Alternatives )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:672:2: rule__UnaryOrNormalExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__UnaryOrNormalExpression__Alternatives_in_ruleUnaryOrNormalExpression1365);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:684:1: entryRuleAndOperation : ruleAndOperation EOF ;
    public final void entryRuleAndOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:685:1: ( ruleAndOperation EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:686:1: ruleAndOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationRule()); 
            }
            pushFollow(FOLLOW_ruleAndOperation_in_entryRuleAndOperation1392);
            ruleAndOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAndOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndOperation1399); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:693:1: ruleAndOperation : ( ( rule__AndOperation__Group__0 ) ) ;
    public final void ruleAndOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:697:2: ( ( ( rule__AndOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:698:1: ( ( rule__AndOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:698:1: ( ( rule__AndOperation__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:699:1: ( rule__AndOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:700:1: ( rule__AndOperation__Group__0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:700:2: rule__AndOperation__Group__0
            {
            pushFollow(FOLLOW_rule__AndOperation__Group__0_in_ruleAndOperation1425);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:712:1: entryRuleOrOperation : ruleOrOperation EOF ;
    public final void entryRuleOrOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:713:1: ( ruleOrOperation EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:714:1: ruleOrOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationRule()); 
            }
            pushFollow(FOLLOW_ruleOrOperation_in_entryRuleOrOperation1452);
            ruleOrOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getOrOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrOperation1459); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:721:1: ruleOrOperation : ( ( rule__OrOperation__Group__0 ) ) ;
    public final void ruleOrOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:725:2: ( ( ( rule__OrOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:726:1: ( ( rule__OrOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:726:1: ( ( rule__OrOperation__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:727:1: ( rule__OrOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:728:1: ( rule__OrOperation__Group__0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:728:2: rule__OrOperation__Group__0
            {
            pushFollow(FOLLOW_rule__OrOperation__Group__0_in_ruleOrOperation1485);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:740:1: entryRuleParanthesedBooleanExpression : ruleParanthesedBooleanExpression EOF ;
    public final void entryRuleParanthesedBooleanExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:741:1: ( ruleParanthesedBooleanExpression EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:742:1: ruleParanthesedBooleanExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedBooleanExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParanthesedBooleanExpression_in_entryRuleParanthesedBooleanExpression1512);
            ruleParanthesedBooleanExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParanthesedBooleanExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParanthesedBooleanExpression1519); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:749:1: ruleParanthesedBooleanExpression : ( ( rule__ParanthesedBooleanExpression__Alternatives ) ) ;
    public final void ruleParanthesedBooleanExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:753:2: ( ( ( rule__ParanthesedBooleanExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:754:1: ( ( rule__ParanthesedBooleanExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:754:1: ( ( rule__ParanthesedBooleanExpression__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:755:1: ( rule__ParanthesedBooleanExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedBooleanExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:756:1: ( rule__ParanthesedBooleanExpression__Alternatives )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:756:2: rule__ParanthesedBooleanExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__ParanthesedBooleanExpression__Alternatives_in_ruleParanthesedBooleanExpression1545);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:768:1: entryRuleBooleanExpression : ruleBooleanExpression EOF ;
    public final void entryRuleBooleanExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:769:1: ( ruleBooleanExpression EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:770:1: ruleBooleanExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression1572);
            ruleBooleanExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanExpression1579); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:777:1: ruleBooleanExpression : ( ruleOrOperation ) ;
    public final void ruleBooleanExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:781:2: ( ( ruleOrOperation ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:782:1: ( ruleOrOperation )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:782:1: ( ruleOrOperation )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:783:1: ruleOrOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getOrOperationParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleOrOperation_in_ruleBooleanExpression1605);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:796:1: entryRuleHostCode : ruleHostCode EOF ;
    public final void entryRuleHostCode() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:797:1: ( ruleHostCode EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:798:1: ruleHostCode EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getHostCodeRule()); 
            }
            pushFollow(FOLLOW_ruleHostCode_in_entryRuleHostCode1631);
            ruleHostCode();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getHostCodeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHostCode1638); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:805:1: ruleHostCode : ( ( rule__HostCode__Group__0 ) ) ;
    public final void ruleHostCode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:809:2: ( ( ( rule__HostCode__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:810:1: ( ( rule__HostCode__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:810:1: ( ( rule__HostCode__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:811:1: ( rule__HostCode__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getHostCodeAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:812:1: ( rule__HostCode__Group__0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:812:2: rule__HostCode__Group__0
            {
            pushFollow(FOLLOW_rule__HostCode__Group__0_in_ruleHostCode1664);
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


    // $ANTLR start entryRuleExpression
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:824:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:825:1: ( ruleExpression EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:826:1: ruleExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1691);
            ruleExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1698); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:833:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:837:2: ( ( ( rule__Expression__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:838:1: ( ( rule__Expression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:838:1: ( ( rule__Expression__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:839:1: ( rule__Expression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:840:1: ( rule__Expression__Alternatives )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:840:2: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_rule__Expression__Alternatives_in_ruleExpression1724);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:855:1: ruleValOperator : ( ( '?' ) ) ;
    public final void ruleValOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:859:1: ( ( ( '?' ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:860:1: ( ( '?' ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:860:1: ( ( '?' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:861:1: ( '?' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValOperatorAccess().getVALEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:862:1: ( '?' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:862:3: '?'
            {
            match(input,13,FOLLOW_13_in_ruleValOperator1764); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:875:1: ruleCompareOperator : ( ( rule__CompareOperator__Alternatives ) ) ;
    public final void ruleCompareOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:879:1: ( ( ( rule__CompareOperator__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:880:1: ( ( rule__CompareOperator__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:880:1: ( ( rule__CompareOperator__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:881:1: ( rule__CompareOperator__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:882:1: ( rule__CompareOperator__Alternatives )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:882:2: rule__CompareOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__CompareOperator__Alternatives_in_ruleCompareOperator1802);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:894:1: ruleUnaryOperator : ( ( 'not' ) ) ;
    public final void ruleUnaryOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:898:1: ( ( ( 'not' ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:899:1: ( ( 'not' ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:899:1: ( ( 'not' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:900:1: ( 'not' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryOperatorAccess().getNOTEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:901:1: ( 'not' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:901:3: 'not'
            {
            match(input,14,FOLLOW_14_in_ruleUnaryOperator1839); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:914:1: ruleUnaryParanthesedOperator : ( ( 'pre' ) ) ;
    public final void ruleUnaryParanthesedOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:918:1: ( ( ( 'pre' ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:919:1: ( ( 'pre' ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:919:1: ( ( 'pre' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:920:1: ( 'pre' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperatorAccess().getPREEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:921:1: ( 'pre' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:921:3: 'pre'
            {
            match(input,15,FOLLOW_15_in_ruleUnaryParanthesedOperator1878); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:934:1: ruleOperatorOr : ( ( 'or' ) ) ;
    public final void ruleOperatorOr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:938:1: ( ( ( 'or' ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:939:1: ( ( 'or' ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:939:1: ( ( 'or' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:940:1: ( 'or' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOperatorOrAccess().getOREnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:941:1: ( 'or' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:941:3: 'or'
            {
            match(input,16,FOLLOW_16_in_ruleOperatorOr1917); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:954:1: ruleOperatorAnd : ( ( 'and' ) ) ;
    public final void ruleOperatorAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:958:1: ( ( ( 'and' ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:959:1: ( ( 'and' ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:959:1: ( ( 'and' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:960:1: ( 'and' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOperatorAndAccess().getANDEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:961:1: ( 'and' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:961:3: 'and'
            {
            match(input,17,FOLLOW_17_in_ruleOperatorAnd1956); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:976:1: rulePlusOperator : ( ( rule__PlusOperator__Alternatives ) ) ;
    public final void rulePlusOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:980:1: ( ( ( rule__PlusOperator__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:981:1: ( ( rule__PlusOperator__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:981:1: ( ( rule__PlusOperator__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:982:1: ( rule__PlusOperator__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperatorAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:983:1: ( rule__PlusOperator__Alternatives )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:983:2: rule__PlusOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__PlusOperator__Alternatives_in_rulePlusOperator1996);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:995:1: ruleMultOperator : ( ( rule__MultOperator__Alternatives ) ) ;
    public final void ruleMultOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:999:1: ( ( ( rule__MultOperator__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1000:1: ( ( rule__MultOperator__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1000:1: ( ( rule__MultOperator__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1001:1: ( rule__MultOperator__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperatorAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1002:1: ( rule__MultOperator__Alternatives )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1002:2: rule__MultOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__MultOperator__Alternatives_in_ruleMultOperator2032);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1014:1: ruleDivOperator : ( ( '/' ) ) ;
    public final void ruleDivOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1018:1: ( ( ( '/' ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1019:1: ( ( '/' ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1019:1: ( ( '/' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1020:1: ( '/' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperatorAccess().getDIVEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1021:1: ( '/' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1021:3: '/'
            {
            match(input,18,FOLLOW_18_in_ruleDivOperator2069); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1033:1: rule__Effect__Alternatives : ( ( ruleEmission ) | ( ruleAssignment ) | ( ruleHostCode ) );
    public final void rule__Effect__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1037:1: ( ( ruleEmission ) | ( ruleAssignment ) | ( ruleHostCode ) )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==32) ) {
                    alt1=2;
                }
                else if ( (LA1_1==EOF||LA1_1==RULE_ID||LA1_1==RULE_STRING||(LA1_1>=29 && LA1_1<=30)) ) {
                    alt1=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1033:1: rule__Effect__Alternatives : ( ( ruleEmission ) | ( ruleAssignment ) | ( ruleHostCode ) );", 1, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA1_0==RULE_STRING) ) {
                alt1=3;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1033:1: rule__Effect__Alternatives : ( ( ruleEmission ) | ( ruleAssignment ) | ( ruleHostCode ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1038:1: ( ruleEmission )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1038:1: ( ruleEmission )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1039:1: ruleEmission
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEffectAccess().getEmissionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleEmission_in_rule__Effect__Alternatives2106);
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
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1044:6: ( ruleAssignment )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1044:6: ( ruleAssignment )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1045:1: ruleAssignment
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEffectAccess().getAssignmentParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_rule__Effect__Alternatives2123);
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
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1050:6: ( ruleHostCode )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1050:6: ( ruleHostCode )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1051:1: ruleHostCode
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEffectAccess().getHostCodeParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleHostCode_in_rule__Effect__Alternatives2140);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1061:1: rule__Emission__Alternatives_1 : ( ( ( rule__Emission__Group_1_0__0 ) ) | ( ( rule__Emission__Group_1_1__0 ) ) );
    public final void rule__Emission__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1065:1: ( ( ( rule__Emission__Group_1_0__0 ) ) | ( ( rule__Emission__Group_1_1__0 ) ) )
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
                        new NoViableAltException("1061:1: rule__Emission__Alternatives_1 : ( ( ( rule__Emission__Group_1_0__0 ) ) | ( ( rule__Emission__Group_1_1__0 ) ) );", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1061:1: rule__Emission__Alternatives_1 : ( ( ( rule__Emission__Group_1_0__0 ) ) | ( ( rule__Emission__Group_1_1__0 ) ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1066:1: ( ( rule__Emission__Group_1_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1066:1: ( ( rule__Emission__Group_1_0__0 ) )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1067:1: ( rule__Emission__Group_1_0__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEmissionAccess().getGroup_1_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1068:1: ( rule__Emission__Group_1_0__0 )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1068:2: rule__Emission__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Emission__Group_1_0__0_in_rule__Emission__Alternatives_12172);
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
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1072:6: ( ( rule__Emission__Group_1_1__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1072:6: ( ( rule__Emission__Group_1_1__0 ) )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1073:1: ( rule__Emission__Group_1_1__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEmissionAccess().getGroup_1_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1074:1: ( rule__Emission__Group_1_1__0 )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1074:2: rule__Emission__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Emission__Group_1_1__0_in_rule__Emission__Alternatives_12190);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1083:1: rule__Assignment__Alternatives_2 : ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) );
    public final void rule__Assignment__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1087:1: ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) )
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
                        new NoViableAltException("1083:1: rule__Assignment__Alternatives_2 : ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) );", 3, 1, input);

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
                        new NoViableAltException("1083:1: rule__Assignment__Alternatives_2 : ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) );", 3, 2, input);

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
                        new NoViableAltException("1083:1: rule__Assignment__Alternatives_2 : ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) );", 3, 3, input);

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
                        new NoViableAltException("1083:1: rule__Assignment__Alternatives_2 : ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) );", 3, 4, input);

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
                        new NoViableAltException("1083:1: rule__Assignment__Alternatives_2 : ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) );", 3, 5, input);

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
                        new NoViableAltException("1083:1: rule__Assignment__Alternatives_2 : ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) );", 3, 6, input);

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
                        new NoViableAltException("1083:1: rule__Assignment__Alternatives_2 : ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) );", 3, 7, input);

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
                    new NoViableAltException("1083:1: rule__Assignment__Alternatives_2 : ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1088:1: ( ( rule__Assignment__ExpressionAssignment_2_0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1088:1: ( ( rule__Assignment__ExpressionAssignment_2_0 ) )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1089:1: ( rule__Assignment__ExpressionAssignment_2_0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAssignmentAccess().getExpressionAssignment_2_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1090:1: ( rule__Assignment__ExpressionAssignment_2_0 )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1090:2: rule__Assignment__ExpressionAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__Assignment__ExpressionAssignment_2_0_in_rule__Assignment__Alternatives_22223);
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
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1094:6: ( ( rule__Assignment__ExpressionAssignment_2_1 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1094:6: ( ( rule__Assignment__ExpressionAssignment_2_1 ) )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1095:1: ( rule__Assignment__ExpressionAssignment_2_1 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAssignmentAccess().getExpressionAssignment_2_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1096:1: ( rule__Assignment__ExpressionAssignment_2_1 )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1096:2: rule__Assignment__ExpressionAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__Assignment__ExpressionAssignment_2_1_in_rule__Assignment__Alternatives_22241);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1106:1: rule__ParanthesedValueExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleValOperation ) | ( ruleVariableReference ) | ( ruleHostCode ) | ( ( rule__ParanthesedValueExpression__Group_5__0 ) ) | ( ( rule__ParanthesedValueExpression__Group_6__0 ) ) );
    public final void rule__ParanthesedValueExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1110:1: ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleValOperation ) | ( ruleVariableReference ) | ( ruleHostCode ) | ( ( rule__ParanthesedValueExpression__Group_5__0 ) ) | ( ( rule__ParanthesedValueExpression__Group_6__0 ) ) )
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
                        new NoViableAltException("1106:1: rule__ParanthesedValueExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleValOperation ) | ( ruleVariableReference ) | ( ruleHostCode ) | ( ( rule__ParanthesedValueExpression__Group_5__0 ) ) | ( ( rule__ParanthesedValueExpression__Group_6__0 ) ) );", 4, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1106:1: rule__ParanthesedValueExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleValOperation ) | ( ruleVariableReference ) | ( ruleHostCode ) | ( ( rule__ParanthesedValueExpression__Group_5__0 ) ) | ( ( rule__ParanthesedValueExpression__Group_6__0 ) ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1111:1: ( ruleIntValue )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1111:1: ( ruleIntValue )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1112:1: ruleIntValue
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedValueExpressionAccess().getIntValueParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleIntValue_in_rule__ParanthesedValueExpression__Alternatives2275);
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
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1117:6: ( ruleFloatValue )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1117:6: ( ruleFloatValue )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1118:1: ruleFloatValue
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedValueExpressionAccess().getFloatValueParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleFloatValue_in_rule__ParanthesedValueExpression__Alternatives2292);
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
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1123:6: ( ruleValOperation )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1123:6: ( ruleValOperation )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1124:1: ruleValOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedValueExpressionAccess().getValOperationParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleValOperation_in_rule__ParanthesedValueExpression__Alternatives2309);
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
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1129:6: ( ruleVariableReference )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1129:6: ( ruleVariableReference )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1130:1: ruleVariableReference
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedValueExpressionAccess().getVariableReferenceParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleVariableReference_in_rule__ParanthesedValueExpression__Alternatives2326);
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
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1135:6: ( ruleHostCode )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1135:6: ( ruleHostCode )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1136:1: ruleHostCode
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedValueExpressionAccess().getHostCodeParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleHostCode_in_rule__ParanthesedValueExpression__Alternatives2343);
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
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1141:6: ( ( rule__ParanthesedValueExpression__Group_5__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1141:6: ( ( rule__ParanthesedValueExpression__Group_5__0 ) )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1142:1: ( rule__ParanthesedValueExpression__Group_5__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedValueExpressionAccess().getGroup_5()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1143:1: ( rule__ParanthesedValueExpression__Group_5__0 )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1143:2: rule__ParanthesedValueExpression__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__ParanthesedValueExpression__Group_5__0_in_rule__ParanthesedValueExpression__Alternatives2360);
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
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1147:6: ( ( rule__ParanthesedValueExpression__Group_6__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1147:6: ( ( rule__ParanthesedValueExpression__Group_6__0 ) )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1148:1: ( rule__ParanthesedValueExpression__Group_6__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedValueExpressionAccess().getGroup_6()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1149:1: ( rule__ParanthesedValueExpression__Group_6__0 )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1149:2: rule__ParanthesedValueExpression__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__ParanthesedValueExpression__Group_6__0_in_rule__ParanthesedValueExpression__Alternatives2378);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1158:1: rule__MultOrDivOperation__Alternatives : ( ( ruleMultOperation ) | ( ( rule__MultOrDivOperation__Group_1__0 ) ) );
    public final void rule__MultOrDivOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1162:1: ( ( ruleMultOperation ) | ( ( rule__MultOrDivOperation__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_INT && LA5_0<=RULE_FLOAT)||LA5_0==RULE_STRING||LA5_0==13||LA5_0==15) ) {
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
                        new NoViableAltException("1158:1: rule__MultOrDivOperation__Alternatives : ( ( ruleMultOperation ) | ( ( rule__MultOrDivOperation__Group_1__0 ) ) );", 5, 7, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1158:1: rule__MultOrDivOperation__Alternatives : ( ( ruleMultOperation ) | ( ( rule__MultOrDivOperation__Group_1__0 ) ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1163:1: ( ruleMultOperation )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1163:1: ( ruleMultOperation )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1164:1: ruleMultOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMultOrDivOperationAccess().getMultOperationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleMultOperation_in_rule__MultOrDivOperation__Alternatives2411);
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
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1169:6: ( ( rule__MultOrDivOperation__Group_1__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1169:6: ( ( rule__MultOrDivOperation__Group_1__0 ) )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1170:1: ( rule__MultOrDivOperation__Group_1__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMultOrDivOperationAccess().getGroup_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1171:1: ( rule__MultOrDivOperation__Group_1__0 )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1171:2: rule__MultOrDivOperation__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__MultOrDivOperation__Group_1__0_in_rule__MultOrDivOperation__Alternatives2428);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1180:1: rule__PreOrNormalValueExpression__Alternatives : ( ( rulePreArithmOperation ) | ( ruleParanthesedValueExpression ) );
    public final void rule__PreOrNormalValueExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1184:1: ( ( rulePreArithmOperation ) | ( ruleParanthesedValueExpression ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_INT && LA6_0<=RULE_FLOAT)||LA6_0==RULE_STRING||LA6_0==13||LA6_0==30) ) {
                alt6=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1180:1: rule__PreOrNormalValueExpression__Alternatives : ( ( rulePreArithmOperation ) | ( ruleParanthesedValueExpression ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1185:1: ( rulePreArithmOperation )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1185:1: ( rulePreArithmOperation )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1186:1: rulePreArithmOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPreOrNormalValueExpressionAccess().getPreArithmOperationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_rulePreArithmOperation_in_rule__PreOrNormalValueExpression__Alternatives2461);
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
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1191:6: ( ruleParanthesedValueExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1191:6: ( ruleParanthesedValueExpression )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1192:1: ruleParanthesedValueExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPreOrNormalValueExpressionAccess().getParanthesedValueExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleParanthesedValueExpression_in_rule__PreOrNormalValueExpression__Alternatives2478);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1202:1: rule__UnaryOperation__SubExpressionsAlternatives_1_0 : ( ( ruleParanthesedBooleanExpression ) | ( ruleUnaryParanthesedOperation ) );
    public final void rule__UnaryOperation__SubExpressionsAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1206:1: ( ( ruleParanthesedBooleanExpression ) | ( ruleUnaryParanthesedOperation ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_INT && LA7_0<=RULE_STRING)||LA7_0==13||LA7_0==30) ) {
                alt7=1;
            }
            else if ( (LA7_0==15) ) {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==30) ) {
                    int LA7_3 = input.LA(3);

                    if ( ((LA7_3>=RULE_INT && LA7_3<=RULE_STRING)||(LA7_3>=14 && LA7_3<=15)||LA7_3==30) ) {
                        alt7=2;
                    }
                    else if ( (LA7_3==13) ) {
                        int LA7_5 = input.LA(4);

                        if ( (LA7_5==RULE_ID) ) {
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
                                        new NoViableAltException("1202:1: rule__UnaryOperation__SubExpressionsAlternatives_1_0 : ( ( ruleParanthesedBooleanExpression ) | ( ruleUnaryParanthesedOperation ) );", 7, 7, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case 31:
                                {
                                int LA7_8 = input.LA(6);

                                if ( ((LA7_8>=19 && LA7_8<=28)) ) {
                                    alt7=1;
                                }
                                else if ( (LA7_8==EOF||(LA7_8>=RULE_INT && LA7_8<=RULE_STRING)||(LA7_8>=13 && LA7_8<=18)||(LA7_8>=29 && LA7_8<=31)) ) {
                                    alt7=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1202:1: rule__UnaryOperation__SubExpressionsAlternatives_1_0 : ( ( ruleParanthesedBooleanExpression ) | ( ruleUnaryParanthesedOperation ) );", 7, 8, input);

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
                                    new NoViableAltException("1202:1: rule__UnaryOperation__SubExpressionsAlternatives_1_0 : ( ( ruleParanthesedBooleanExpression ) | ( ruleUnaryParanthesedOperation ) );", 7, 6, input);

                                throw nvae;
                            }

                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("1202:1: rule__UnaryOperation__SubExpressionsAlternatives_1_0 : ( ( ruleParanthesedBooleanExpression ) | ( ruleUnaryParanthesedOperation ) );", 7, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1202:1: rule__UnaryOperation__SubExpressionsAlternatives_1_0 : ( ( ruleParanthesedBooleanExpression ) | ( ruleUnaryParanthesedOperation ) );", 7, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1202:1: rule__UnaryOperation__SubExpressionsAlternatives_1_0 : ( ( ruleParanthesedBooleanExpression ) | ( ruleUnaryParanthesedOperation ) );", 7, 2, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1202:1: rule__UnaryOperation__SubExpressionsAlternatives_1_0 : ( ( ruleParanthesedBooleanExpression ) | ( ruleUnaryParanthesedOperation ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1207:1: ( ruleParanthesedBooleanExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1207:1: ( ruleParanthesedBooleanExpression )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1208:1: ruleParanthesedBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getUnaryOperationAccess().getSubExpressionsParanthesedBooleanExpressionParserRuleCall_1_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleParanthesedBooleanExpression_in_rule__UnaryOperation__SubExpressionsAlternatives_1_02510);
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
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1213:6: ( ruleUnaryParanthesedOperation )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1213:6: ( ruleUnaryParanthesedOperation )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1214:1: ruleUnaryParanthesedOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getUnaryOperationAccess().getSubExpressionsUnaryParanthesedOperationParserRuleCall_1_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleUnaryParanthesedOperation_in_rule__UnaryOperation__SubExpressionsAlternatives_1_02527);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1224:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );
    public final void rule__UnaryOrNormalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1228:1: ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) )
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

                    if ( (LA8_4==13) ) {
                        int LA8_5 = input.LA(4);

                        if ( (LA8_5==RULE_ID) ) {
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
                                        new NoViableAltException("1224:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );", 8, 8, input);

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
                            case 31:
                                {
                                int LA8_9 = input.LA(6);

                                if ( (LA8_9==EOF||(LA8_9>=RULE_INT && LA8_9<=RULE_STRING)||(LA8_9>=13 && LA8_9<=18)||(LA8_9>=29 && LA8_9<=31)) ) {
                                    alt8=2;
                                }
                                else if ( ((LA8_9>=19 && LA8_9<=28)) ) {
                                    alt8=3;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1224:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );", 8, 9, input);

                                    throw nvae;
                                }
                                }
                                break;
                            default:
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1224:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );", 8, 7, input);

                                throw nvae;
                            }

                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("1224:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );", 8, 5, input);

                            throw nvae;
                        }
                    }
                    else if ( ((LA8_4>=RULE_INT && LA8_4<=RULE_STRING)||(LA8_4>=14 && LA8_4<=15)||LA8_4==30) ) {
                        alt8=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1224:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );", 8, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1224:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );", 8, 2, input);

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
            case 30:
                {
                alt8=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1224:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1229:1: ( ruleUnaryOperation )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1229:1: ( ruleUnaryOperation )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1230:1: ruleUnaryOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getUnaryOrNormalExpressionAccess().getUnaryOperationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleUnaryOperation_in_rule__UnaryOrNormalExpression__Alternatives2559);
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
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1235:6: ( ruleUnaryParanthesedOperation )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1235:6: ( ruleUnaryParanthesedOperation )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1236:1: ruleUnaryParanthesedOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getUnaryOrNormalExpressionAccess().getUnaryParanthesedOperationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleUnaryParanthesedOperation_in_rule__UnaryOrNormalExpression__Alternatives2576);
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
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1241:6: ( ruleParanthesedBooleanExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1241:6: ( ruleParanthesedBooleanExpression )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1242:1: ruleParanthesedBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getUnaryOrNormalExpressionAccess().getParanthesedBooleanExpressionParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleParanthesedBooleanExpression_in_rule__UnaryOrNormalExpression__Alternatives2593);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1252:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleHostCode ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );
    public final void rule__ParanthesedBooleanExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1256:1: ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleHostCode ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) )
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
                                new NoViableAltException("1252:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleHostCode ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 9, 13, input);

                            throw nvae;
                        }
                        }
                        break;
                    case EOF:
                    case RULE_INT:
                    case RULE_ID:
                    case RULE_FLOAT:
                    case RULE_BOOLEAN:
                    case RULE_STRING:
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
                            new NoViableAltException("1252:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleHostCode ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 9, 7, input);

                        throw nvae;
                    }

                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1252:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleHostCode ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 9, 3, input);

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
                            new NoViableAltException("1252:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleHostCode ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 9, 8, input);

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
                case RULE_FLOAT:
                case RULE_BOOLEAN:
                case RULE_STRING:
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
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1252:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleHostCode ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 9, 4, input);

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
                            new NoViableAltException("1252:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleHostCode ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 9, 10, input);

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
                case RULE_FLOAT:
                case RULE_BOOLEAN:
                case RULE_STRING:
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
                        new NoViableAltException("1252:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleHostCode ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 9, 5, input);

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
                        new NoViableAltException("1252:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleHostCode ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 9, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1252:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleHostCode ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1257:1: ( ruleBooleanValue )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1257:1: ( ruleBooleanValue )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1258:1: ruleBooleanValue
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedBooleanExpressionAccess().getBooleanValueParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanValue_in_rule__ParanthesedBooleanExpression__Alternatives2625);
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
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1263:6: ( ruleCompareOperation )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1263:6: ( ruleCompareOperation )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1264:1: ruleCompareOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedBooleanExpressionAccess().getCompareOperationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleCompareOperation_in_rule__ParanthesedBooleanExpression__Alternatives2642);
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
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1269:6: ( ruleSignalReference )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1269:6: ( ruleSignalReference )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1270:1: ruleSignalReference
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedBooleanExpressionAccess().getSignalReferenceParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleSignalReference_in_rule__ParanthesedBooleanExpression__Alternatives2659);
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
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1275:6: ( ruleValOperation )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1275:6: ( ruleValOperation )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1276:1: ruleValOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedBooleanExpressionAccess().getValOperationParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleValOperation_in_rule__ParanthesedBooleanExpression__Alternatives2676);
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
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1281:6: ( ruleHostCode )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1281:6: ( ruleHostCode )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1282:1: ruleHostCode
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedBooleanExpressionAccess().getHostCodeParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleHostCode_in_rule__ParanthesedBooleanExpression__Alternatives2693);
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
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1287:6: ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1287:6: ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1288:1: ( rule__ParanthesedBooleanExpression__Group_5__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedBooleanExpressionAccess().getGroup_5()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1289:1: ( rule__ParanthesedBooleanExpression__Group_5__0 )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1289:2: rule__ParanthesedBooleanExpression__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__ParanthesedBooleanExpression__Group_5__0_in_rule__ParanthesedBooleanExpression__Alternatives2710);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1298:1: rule__Expression__Alternatives : ( ( ruleValueExpression ) | ( ruleBooleanExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1302:1: ( ( ruleValueExpression ) | ( ruleBooleanExpression ) )
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
                        new NoViableAltException("1298:1: rule__Expression__Alternatives : ( ( ruleValueExpression ) | ( ruleBooleanExpression ) );", 10, 1, input);

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
                        new NoViableAltException("1298:1: rule__Expression__Alternatives : ( ( ruleValueExpression ) | ( ruleBooleanExpression ) );", 10, 2, input);

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
                        new NoViableAltException("1298:1: rule__Expression__Alternatives : ( ( ruleValueExpression ) | ( ruleBooleanExpression ) );", 10, 3, input);

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
                        new NoViableAltException("1298:1: rule__Expression__Alternatives : ( ( ruleValueExpression ) | ( ruleBooleanExpression ) );", 10, 4, input);

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
                        new NoViableAltException("1298:1: rule__Expression__Alternatives : ( ( ruleValueExpression ) | ( ruleBooleanExpression ) );", 10, 5, input);

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
                        new NoViableAltException("1298:1: rule__Expression__Alternatives : ( ( ruleValueExpression ) | ( ruleBooleanExpression ) );", 10, 6, input);

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
                        new NoViableAltException("1298:1: rule__Expression__Alternatives : ( ( ruleValueExpression ) | ( ruleBooleanExpression ) );", 10, 7, input);

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
                    new NoViableAltException("1298:1: rule__Expression__Alternatives : ( ( ruleValueExpression ) | ( ruleBooleanExpression ) );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1303:1: ( ruleValueExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1303:1: ( ruleValueExpression )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1304:1: ruleValueExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getValueExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleValueExpression_in_rule__Expression__Alternatives2743);
                    ruleValueExpression();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getValueExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1309:6: ( ruleBooleanExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1309:6: ( ruleBooleanExpression )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1310:1: ruleBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanExpression_in_rule__Expression__Alternatives2760);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1321:1: rule__CompareOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1325:1: ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) )
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
                    new NoViableAltException("1321:1: rule__CompareOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) );", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1326:1: ( ( '=' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1326:1: ( ( '=' ) )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1327:1: ( '=' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1328:1: ( '=' )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1328:3: '='
                    {
                    match(input,19,FOLLOW_19_in_rule__CompareOperator__Alternatives2794); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1333:6: ( ( '<' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1333:6: ( ( '<' ) )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1334:1: ( '<' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1335:1: ( '<' )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1335:3: '<'
                    {
                    match(input,20,FOLLOW_20_in_rule__CompareOperator__Alternatives2815); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1340:6: ( ( '<=' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1340:6: ( ( '<=' ) )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1341:1: ( '<=' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1342:1: ( '<=' )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1342:3: '<='
                    {
                    match(input,21,FOLLOW_21_in_rule__CompareOperator__Alternatives2836); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1347:6: ( ( '>' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1347:6: ( ( '>' ) )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1348:1: ( '>' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1349:1: ( '>' )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1349:3: '>'
                    {
                    match(input,22,FOLLOW_22_in_rule__CompareOperator__Alternatives2857); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1354:6: ( ( '>=' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1354:6: ( ( '>=' ) )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1355:1: ( '>=' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1356:1: ( '>=' )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1356:3: '>='
                    {
                    match(input,23,FOLLOW_23_in_rule__CompareOperator__Alternatives2878); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1361:6: ( ( '<>' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1361:6: ( ( '<>' ) )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1362:1: ( '<>' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_5()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1363:1: ( '<>' )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1363:3: '<>'
                    {
                    match(input,24,FOLLOW_24_in_rule__CompareOperator__Alternatives2899); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1373:1: rule__PlusOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__PlusOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1377:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
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
                    new NoViableAltException("1373:1: rule__PlusOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1378:1: ( ( '+' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1378:1: ( ( '+' ) )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1379:1: ( '+' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPlusOperatorAccess().getADDEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1380:1: ( '+' )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1380:3: '+'
                    {
                    match(input,25,FOLLOW_25_in_rule__PlusOperator__Alternatives2935); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getPlusOperatorAccess().getADDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1385:6: ( ( '-' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1385:6: ( ( '-' ) )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1386:1: ( '-' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPlusOperatorAccess().getSUBEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1387:1: ( '-' )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1387:3: '-'
                    {
                    match(input,26,FOLLOW_26_in_rule__PlusOperator__Alternatives2956); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1397:1: rule__MultOperator__Alternatives : ( ( ( '*' ) ) | ( ( 'mod' ) ) );
    public final void rule__MultOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1401:1: ( ( ( '*' ) ) | ( ( 'mod' ) ) )
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
                    new NoViableAltException("1397:1: rule__MultOperator__Alternatives : ( ( ( '*' ) ) | ( ( 'mod' ) ) );", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1402:1: ( ( '*' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1402:1: ( ( '*' ) )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1403:1: ( '*' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1404:1: ( '*' )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1404:3: '*'
                    {
                    match(input,27,FOLLOW_27_in_rule__MultOperator__Alternatives2992); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1409:6: ( ( 'mod' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1409:6: ( ( 'mod' ) )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1410:1: ( 'mod' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMultOperatorAccess().getMODEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1411:1: ( 'mod' )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1411:3: 'mod'
                    {
                    match(input,28,FOLLOW_28_in_rule__MultOperator__Alternatives3013); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1423:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1427:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1428:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__03046);
            rule__Action__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Action__Group__1_in_rule__Action__Group__03049);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1435:1: rule__Action__Group__0__Impl : ( ( rule__Action__IsImmediateAssignment_0 )? ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1439:1: ( ( ( rule__Action__IsImmediateAssignment_0 )? ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1440:1: ( ( rule__Action__IsImmediateAssignment_0 )? )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1440:1: ( ( rule__Action__IsImmediateAssignment_0 )? )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1441:1: ( rule__Action__IsImmediateAssignment_0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getIsImmediateAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1442:1: ( rule__Action__IsImmediateAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1442:2: rule__Action__IsImmediateAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Action__IsImmediateAssignment_0_in_rule__Action__Group__0__Impl3076);
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


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group__0__Impl


    // $ANTLR start rule__Action__Group__1
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1452:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1456:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1457:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__13107);
            rule__Action__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Action__Group__2_in_rule__Action__Group__13110);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1464:1: rule__Action__Group__1__Impl : ( ( rule__Action__DelayAssignment_1 )? ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1468:1: ( ( ( rule__Action__DelayAssignment_1 )? ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1469:1: ( ( rule__Action__DelayAssignment_1 )? )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1469:1: ( ( rule__Action__DelayAssignment_1 )? )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1470:1: ( rule__Action__DelayAssignment_1 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getDelayAssignment_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1471:1: ( rule__Action__DelayAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==EOF||(LA15_1>=RULE_INT && LA15_1<=RULE_STRING)||(LA15_1>=13 && LA15_1<=15)||LA15_1==18||LA15_1==30) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1471:2: rule__Action__DelayAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Action__DelayAssignment_1_in_rule__Action__Group__1__Impl3137);
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


            }

        }
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1481:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1485:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1486:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FOLLOW_rule__Action__Group__2__Impl_in_rule__Action__Group__23168);
            rule__Action__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Action__Group__3_in_rule__Action__Group__23171);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1493:1: rule__Action__Group__2__Impl : ( ( rule__Action__TriggerAssignment_2 )? ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1497:1: ( ( ( rule__Action__TriggerAssignment_2 )? ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1498:1: ( ( rule__Action__TriggerAssignment_2 )? )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1498:1: ( ( rule__Action__TriggerAssignment_2 )? )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1499:1: ( rule__Action__TriggerAssignment_2 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getTriggerAssignment_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1500:1: ( rule__Action__TriggerAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_INT && LA16_0<=RULE_STRING)||(LA16_0>=13 && LA16_0<=15)||LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1500:2: rule__Action__TriggerAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Action__TriggerAssignment_2_in_rule__Action__Group__2__Impl3198);
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


            }

        }
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1510:1: rule__Action__Group__3 : rule__Action__Group__3__Impl ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1514:1: ( rule__Action__Group__3__Impl )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1515:2: rule__Action__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Action__Group__3__Impl_in_rule__Action__Group__33229);
            rule__Action__Group__3__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1521:1: rule__Action__Group__3__Impl : ( ( rule__Action__Group_3__0 )? ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1525:1: ( ( ( rule__Action__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1526:1: ( ( rule__Action__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1526:1: ( ( rule__Action__Group_3__0 )? )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1527:1: ( rule__Action__Group_3__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getGroup_3()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1528:1: ( rule__Action__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==18) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1528:2: rule__Action__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Action__Group_3__0_in_rule__Action__Group__3__Impl3256);
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
    // $ANTLR end rule__Action__Group__3__Impl


    // $ANTLR start rule__Action__Group_3__0
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1546:1: rule__Action__Group_3__0 : rule__Action__Group_3__0__Impl rule__Action__Group_3__1 ;
    public final void rule__Action__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1550:1: ( rule__Action__Group_3__0__Impl rule__Action__Group_3__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1551:2: rule__Action__Group_3__0__Impl rule__Action__Group_3__1
            {
            pushFollow(FOLLOW_rule__Action__Group_3__0__Impl_in_rule__Action__Group_3__03295);
            rule__Action__Group_3__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Action__Group_3__1_in_rule__Action__Group_3__03298);
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


    // $ANTLR start rule__Action__Group_3__0__Impl
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1558:1: rule__Action__Group_3__0__Impl : ( '/' ) ;
    public final void rule__Action__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1562:1: ( ( '/' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1563:1: ( '/' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1563:1: ( '/' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1564:1: '/'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getSolidusKeyword_3_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__Action__Group_3__0__Impl3326); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getActionAccess().getSolidusKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group_3__0__Impl


    // $ANTLR start rule__Action__Group_3__1
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1577:1: rule__Action__Group_3__1 : rule__Action__Group_3__1__Impl ;
    public final void rule__Action__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1581:1: ( rule__Action__Group_3__1__Impl )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1582:2: rule__Action__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Action__Group_3__1__Impl_in_rule__Action__Group_3__13357);
            rule__Action__Group_3__1__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
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


    // $ANTLR start rule__Action__Group_3__1__Impl
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1588:1: rule__Action__Group_3__1__Impl : ( ( rule__Action__Group_3_1__0 )* ) ;
    public final void rule__Action__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1592:1: ( ( ( rule__Action__Group_3_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1593:1: ( ( rule__Action__Group_3_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1593:1: ( ( rule__Action__Group_3_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1594:1: ( rule__Action__Group_3_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getGroup_3_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1595:1: ( rule__Action__Group_3_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||LA18_0==RULE_STRING) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1595:2: rule__Action__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Action__Group_3_1__0_in_rule__Action__Group_3__1__Impl3384);
            	    rule__Action__Group_3_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // $ANTLR end rule__Action__Group_3__1__Impl


    // $ANTLR start rule__Action__Group_3_1__0
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1609:1: rule__Action__Group_3_1__0 : rule__Action__Group_3_1__0__Impl rule__Action__Group_3_1__1 ;
    public final void rule__Action__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1613:1: ( rule__Action__Group_3_1__0__Impl rule__Action__Group_3_1__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1614:2: rule__Action__Group_3_1__0__Impl rule__Action__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Action__Group_3_1__0__Impl_in_rule__Action__Group_3_1__03419);
            rule__Action__Group_3_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Action__Group_3_1__1_in_rule__Action__Group_3_1__03422);
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


    // $ANTLR start rule__Action__Group_3_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1621:1: rule__Action__Group_3_1__0__Impl : ( ( rule__Action__EffectsAssignment_3_1_0 ) ) ;
    public final void rule__Action__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1625:1: ( ( ( rule__Action__EffectsAssignment_3_1_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1626:1: ( ( rule__Action__EffectsAssignment_3_1_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1626:1: ( ( rule__Action__EffectsAssignment_3_1_0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1627:1: ( rule__Action__EffectsAssignment_3_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getEffectsAssignment_3_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1628:1: ( rule__Action__EffectsAssignment_3_1_0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1628:2: rule__Action__EffectsAssignment_3_1_0
            {
            pushFollow(FOLLOW_rule__Action__EffectsAssignment_3_1_0_in_rule__Action__Group_3_1__0__Impl3449);
            rule__Action__EffectsAssignment_3_1_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getActionAccess().getEffectsAssignment_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group_3_1__0__Impl


    // $ANTLR start rule__Action__Group_3_1__1
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1638:1: rule__Action__Group_3_1__1 : rule__Action__Group_3_1__1__Impl ;
    public final void rule__Action__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1642:1: ( rule__Action__Group_3_1__1__Impl )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1643:2: rule__Action__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Action__Group_3_1__1__Impl_in_rule__Action__Group_3_1__13479);
            rule__Action__Group_3_1__1__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
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


    // $ANTLR start rule__Action__Group_3_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1649:1: rule__Action__Group_3_1__1__Impl : ( ( ',' )? ) ;
    public final void rule__Action__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1653:1: ( ( ( ',' )? ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1654:1: ( ( ',' )? )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1654:1: ( ( ',' )? )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1655:1: ( ',' )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getCommaKeyword_3_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1656:1: ( ',' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1657:2: ','
                    {
                    match(input,29,FOLLOW_29_in_rule__Action__Group_3_1__1__Impl3508); if (failed) return ;

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
    // $ANTLR end rule__Action__Group_3_1__1__Impl


    // $ANTLR start rule__Emission__Group__0
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1672:1: rule__Emission__Group__0 : rule__Emission__Group__0__Impl rule__Emission__Group__1 ;
    public final void rule__Emission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1676:1: ( rule__Emission__Group__0__Impl rule__Emission__Group__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1677:2: rule__Emission__Group__0__Impl rule__Emission__Group__1
            {
            pushFollow(FOLLOW_rule__Emission__Group__0__Impl_in_rule__Emission__Group__03545);
            rule__Emission__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Emission__Group__1_in_rule__Emission__Group__03548);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1684:1: rule__Emission__Group__0__Impl : ( ( rule__Emission__SignalAssignment_0 ) ) ;
    public final void rule__Emission__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1688:1: ( ( ( rule__Emission__SignalAssignment_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1689:1: ( ( rule__Emission__SignalAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1689:1: ( ( rule__Emission__SignalAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1690:1: ( rule__Emission__SignalAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getSignalAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1691:1: ( rule__Emission__SignalAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1691:2: rule__Emission__SignalAssignment_0
            {
            pushFollow(FOLLOW_rule__Emission__SignalAssignment_0_in_rule__Emission__Group__0__Impl3575);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1701:1: rule__Emission__Group__1 : rule__Emission__Group__1__Impl ;
    public final void rule__Emission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1705:1: ( rule__Emission__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1706:2: rule__Emission__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Emission__Group__1__Impl_in_rule__Emission__Group__13605);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1712:1: rule__Emission__Group__1__Impl : ( ( rule__Emission__Alternatives_1 )? ) ;
    public final void rule__Emission__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1716:1: ( ( ( rule__Emission__Alternatives_1 )? ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1717:1: ( ( rule__Emission__Alternatives_1 )? )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1717:1: ( ( rule__Emission__Alternatives_1 )? )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1718:1: ( rule__Emission__Alternatives_1 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getAlternatives_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1719:1: ( rule__Emission__Alternatives_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1719:2: rule__Emission__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__Emission__Alternatives_1_in_rule__Emission__Group__1__Impl3632);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1733:1: rule__Emission__Group_1_0__0 : rule__Emission__Group_1_0__0__Impl rule__Emission__Group_1_0__1 ;
    public final void rule__Emission__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1737:1: ( rule__Emission__Group_1_0__0__Impl rule__Emission__Group_1_0__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1738:2: rule__Emission__Group_1_0__0__Impl rule__Emission__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Emission__Group_1_0__0__Impl_in_rule__Emission__Group_1_0__03667);
            rule__Emission__Group_1_0__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Emission__Group_1_0__1_in_rule__Emission__Group_1_0__03670);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1745:1: rule__Emission__Group_1_0__0__Impl : ( '(' ) ;
    public final void rule__Emission__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1749:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1750:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1750:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1751:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_0_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__Emission__Group_1_0__0__Impl3698); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1764:1: rule__Emission__Group_1_0__1 : rule__Emission__Group_1_0__1__Impl rule__Emission__Group_1_0__2 ;
    public final void rule__Emission__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1768:1: ( rule__Emission__Group_1_0__1__Impl rule__Emission__Group_1_0__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1769:2: rule__Emission__Group_1_0__1__Impl rule__Emission__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__Emission__Group_1_0__1__Impl_in_rule__Emission__Group_1_0__13729);
            rule__Emission__Group_1_0__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Emission__Group_1_0__2_in_rule__Emission__Group_1_0__13732);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1776:1: rule__Emission__Group_1_0__1__Impl : ( ( rule__Emission__NewValueAssignment_1_0_1 ) ) ;
    public final void rule__Emission__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1780:1: ( ( ( rule__Emission__NewValueAssignment_1_0_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1781:1: ( ( rule__Emission__NewValueAssignment_1_0_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1781:1: ( ( rule__Emission__NewValueAssignment_1_0_1 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1782:1: ( rule__Emission__NewValueAssignment_1_0_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getNewValueAssignment_1_0_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1783:1: ( rule__Emission__NewValueAssignment_1_0_1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1783:2: rule__Emission__NewValueAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__Emission__NewValueAssignment_1_0_1_in_rule__Emission__Group_1_0__1__Impl3759);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1793:1: rule__Emission__Group_1_0__2 : rule__Emission__Group_1_0__2__Impl ;
    public final void rule__Emission__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1797:1: ( rule__Emission__Group_1_0__2__Impl )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1798:2: rule__Emission__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Emission__Group_1_0__2__Impl_in_rule__Emission__Group_1_0__23789);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1804:1: rule__Emission__Group_1_0__2__Impl : ( ')' ) ;
    public final void rule__Emission__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1808:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1809:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1809:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1810:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getRightParenthesisKeyword_1_0_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__Emission__Group_1_0__2__Impl3817); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1829:1: rule__Emission__Group_1_1__0 : rule__Emission__Group_1_1__0__Impl rule__Emission__Group_1_1__1 ;
    public final void rule__Emission__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1833:1: ( rule__Emission__Group_1_1__0__Impl rule__Emission__Group_1_1__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1834:2: rule__Emission__Group_1_1__0__Impl rule__Emission__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Emission__Group_1_1__0__Impl_in_rule__Emission__Group_1_1__03854);
            rule__Emission__Group_1_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Emission__Group_1_1__1_in_rule__Emission__Group_1_1__03857);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1841:1: rule__Emission__Group_1_1__0__Impl : ( '(' ) ;
    public final void rule__Emission__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1845:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1846:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1846:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1847:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_1_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__Emission__Group_1_1__0__Impl3885); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1860:1: rule__Emission__Group_1_1__1 : rule__Emission__Group_1_1__1__Impl rule__Emission__Group_1_1__2 ;
    public final void rule__Emission__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1864:1: ( rule__Emission__Group_1_1__1__Impl rule__Emission__Group_1_1__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1865:2: rule__Emission__Group_1_1__1__Impl rule__Emission__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__Emission__Group_1_1__1__Impl_in_rule__Emission__Group_1_1__13916);
            rule__Emission__Group_1_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Emission__Group_1_1__2_in_rule__Emission__Group_1_1__13919);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1872:1: rule__Emission__Group_1_1__1__Impl : ( ( rule__Emission__NewValueAssignment_1_1_1 ) ) ;
    public final void rule__Emission__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1876:1: ( ( ( rule__Emission__NewValueAssignment_1_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1877:1: ( ( rule__Emission__NewValueAssignment_1_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1877:1: ( ( rule__Emission__NewValueAssignment_1_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1878:1: ( rule__Emission__NewValueAssignment_1_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getNewValueAssignment_1_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1879:1: ( rule__Emission__NewValueAssignment_1_1_1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1879:2: rule__Emission__NewValueAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__Emission__NewValueAssignment_1_1_1_in_rule__Emission__Group_1_1__1__Impl3946);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1889:1: rule__Emission__Group_1_1__2 : rule__Emission__Group_1_1__2__Impl ;
    public final void rule__Emission__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1893:1: ( rule__Emission__Group_1_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1894:2: rule__Emission__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Emission__Group_1_1__2__Impl_in_rule__Emission__Group_1_1__23976);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1900:1: rule__Emission__Group_1_1__2__Impl : ( ')' ) ;
    public final void rule__Emission__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1904:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1905:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1905:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1906:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getRightParenthesisKeyword_1_1_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__Emission__Group_1_1__2__Impl4004); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1925:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1929:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1930:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__04041);
            rule__Assignment__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__04044);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1937:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__VariableAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1941:1: ( ( ( rule__Assignment__VariableAssignment_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1942:1: ( ( rule__Assignment__VariableAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1942:1: ( ( rule__Assignment__VariableAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1943:1: ( rule__Assignment__VariableAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariableAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1944:1: ( rule__Assignment__VariableAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1944:2: rule__Assignment__VariableAssignment_0
            {
            pushFollow(FOLLOW_rule__Assignment__VariableAssignment_0_in_rule__Assignment__Group__0__Impl4071);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1954:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1958:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1959:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__14101);
            rule__Assignment__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__14104);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1966:1: rule__Assignment__Group__1__Impl : ( ':=' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1970:1: ( ( ':=' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1971:1: ( ':=' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1971:1: ( ':=' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1972:1: ':='
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1()); 
            }
            match(input,32,FOLLOW_32_in_rule__Assignment__Group__1__Impl4132); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1985:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1989:1: ( rule__Assignment__Group__2__Impl )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1990:2: rule__Assignment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__24163);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1996:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__Alternatives_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2000:1: ( ( ( rule__Assignment__Alternatives_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2001:1: ( ( rule__Assignment__Alternatives_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2001:1: ( ( rule__Assignment__Alternatives_2 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2002:1: ( rule__Assignment__Alternatives_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getAlternatives_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2003:1: ( rule__Assignment__Alternatives_2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2003:2: rule__Assignment__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Assignment__Alternatives_2_in_rule__Assignment__Group__2__Impl4190);
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


    // $ANTLR start rule__SignalReference__Group__0
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2019:1: rule__SignalReference__Group__0 : rule__SignalReference__Group__0__Impl rule__SignalReference__Group__1 ;
    public final void rule__SignalReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2023:1: ( rule__SignalReference__Group__0__Impl rule__SignalReference__Group__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2024:2: rule__SignalReference__Group__0__Impl rule__SignalReference__Group__1
            {
            pushFollow(FOLLOW_rule__SignalReference__Group__0__Impl_in_rule__SignalReference__Group__04226);
            rule__SignalReference__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SignalReference__Group__1_in_rule__SignalReference__Group__04229);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2031:1: rule__SignalReference__Group__0__Impl : ( ( rule__SignalReference__SignalAssignment_0 ) ) ;
    public final void rule__SignalReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2035:1: ( ( ( rule__SignalReference__SignalAssignment_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2036:1: ( ( rule__SignalReference__SignalAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2036:1: ( ( rule__SignalReference__SignalAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2037:1: ( rule__SignalReference__SignalAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getSignalAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2038:1: ( rule__SignalReference__SignalAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2038:2: rule__SignalReference__SignalAssignment_0
            {
            pushFollow(FOLLOW_rule__SignalReference__SignalAssignment_0_in_rule__SignalReference__Group__0__Impl4256);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2048:1: rule__SignalReference__Group__1 : rule__SignalReference__Group__1__Impl ;
    public final void rule__SignalReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2052:1: ( rule__SignalReference__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2053:2: rule__SignalReference__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SignalReference__Group__1__Impl_in_rule__SignalReference__Group__14286);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2059:1: rule__SignalReference__Group__1__Impl : ( ( rule__SignalReference__Group_1__0 )? ) ;
    public final void rule__SignalReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2063:1: ( ( ( rule__SignalReference__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2064:1: ( ( rule__SignalReference__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2064:1: ( ( rule__SignalReference__Group_1__0 )? )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2065:1: ( rule__SignalReference__Group_1__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2066:1: ( rule__SignalReference__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                int LA21_1 = input.LA(2);

                if ( (synpred36()) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2066:2: rule__SignalReference__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__SignalReference__Group_1__0_in_rule__SignalReference__Group__1__Impl4313);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2080:1: rule__SignalReference__Group_1__0 : rule__SignalReference__Group_1__0__Impl rule__SignalReference__Group_1__1 ;
    public final void rule__SignalReference__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2084:1: ( rule__SignalReference__Group_1__0__Impl rule__SignalReference__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2085:2: rule__SignalReference__Group_1__0__Impl rule__SignalReference__Group_1__1
            {
            pushFollow(FOLLOW_rule__SignalReference__Group_1__0__Impl_in_rule__SignalReference__Group_1__04348);
            rule__SignalReference__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SignalReference__Group_1__1_in_rule__SignalReference__Group_1__04351);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2092:1: rule__SignalReference__Group_1__0__Impl : ( '(' ) ;
    public final void rule__SignalReference__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2096:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2097:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2097:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2098:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__SignalReference__Group_1__0__Impl4379); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2111:1: rule__SignalReference__Group_1__1 : rule__SignalReference__Group_1__1__Impl rule__SignalReference__Group_1__2 ;
    public final void rule__SignalReference__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2115:1: ( rule__SignalReference__Group_1__1__Impl rule__SignalReference__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2116:2: rule__SignalReference__Group_1__1__Impl rule__SignalReference__Group_1__2
            {
            pushFollow(FOLLOW_rule__SignalReference__Group_1__1__Impl_in_rule__SignalReference__Group_1__14410);
            rule__SignalReference__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SignalReference__Group_1__2_in_rule__SignalReference__Group_1__14413);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2123:1: rule__SignalReference__Group_1__1__Impl : ( ( rule__SignalReference__Group_1_1__0 )* ) ;
    public final void rule__SignalReference__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2127:1: ( ( ( rule__SignalReference__Group_1_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2128:1: ( ( rule__SignalReference__Group_1_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2128:1: ( ( rule__SignalReference__Group_1_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2129:1: ( rule__SignalReference__Group_1_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getGroup_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2130:1: ( rule__SignalReference__Group_1_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_INT && LA22_0<=RULE_STRING)||(LA22_0>=13 && LA22_0<=15)||LA22_0==30) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2130:2: rule__SignalReference__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SignalReference__Group_1_1__0_in_rule__SignalReference__Group_1__1__Impl4440);
            	    rule__SignalReference__Group_1_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2140:1: rule__SignalReference__Group_1__2 : rule__SignalReference__Group_1__2__Impl ;
    public final void rule__SignalReference__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2144:1: ( rule__SignalReference__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2145:2: rule__SignalReference__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__SignalReference__Group_1__2__Impl_in_rule__SignalReference__Group_1__24471);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2151:1: rule__SignalReference__Group_1__2__Impl : ( ')' ) ;
    public final void rule__SignalReference__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2155:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2156:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2156:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2157:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__SignalReference__Group_1__2__Impl4499); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2176:1: rule__SignalReference__Group_1_1__0 : rule__SignalReference__Group_1_1__0__Impl rule__SignalReference__Group_1_1__1 ;
    public final void rule__SignalReference__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2180:1: ( rule__SignalReference__Group_1_1__0__Impl rule__SignalReference__Group_1_1__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2181:2: rule__SignalReference__Group_1_1__0__Impl rule__SignalReference__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__SignalReference__Group_1_1__0__Impl_in_rule__SignalReference__Group_1_1__04536);
            rule__SignalReference__Group_1_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SignalReference__Group_1_1__1_in_rule__SignalReference__Group_1_1__04539);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2188:1: rule__SignalReference__Group_1_1__0__Impl : ( ( rule__SignalReference__SubExpressionsAssignment_1_1_0 ) ) ;
    public final void rule__SignalReference__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2192:1: ( ( ( rule__SignalReference__SubExpressionsAssignment_1_1_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2193:1: ( ( rule__SignalReference__SubExpressionsAssignment_1_1_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2193:1: ( ( rule__SignalReference__SubExpressionsAssignment_1_1_0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2194:1: ( rule__SignalReference__SubExpressionsAssignment_1_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getSubExpressionsAssignment_1_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2195:1: ( rule__SignalReference__SubExpressionsAssignment_1_1_0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2195:2: rule__SignalReference__SubExpressionsAssignment_1_1_0
            {
            pushFollow(FOLLOW_rule__SignalReference__SubExpressionsAssignment_1_1_0_in_rule__SignalReference__Group_1_1__0__Impl4566);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2205:1: rule__SignalReference__Group_1_1__1 : rule__SignalReference__Group_1_1__1__Impl ;
    public final void rule__SignalReference__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2209:1: ( rule__SignalReference__Group_1_1__1__Impl )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2210:2: rule__SignalReference__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SignalReference__Group_1_1__1__Impl_in_rule__SignalReference__Group_1_1__14596);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2216:1: rule__SignalReference__Group_1_1__1__Impl : ( ( ',' )? ) ;
    public final void rule__SignalReference__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2220:1: ( ( ( ',' )? ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2221:1: ( ( ',' )? )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2221:1: ( ( ',' )? )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2222:1: ( ',' )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getCommaKeyword_1_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2223:1: ( ',' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==29) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2224:2: ','
                    {
                    match(input,29,FOLLOW_29_in_rule__SignalReference__Group_1_1__1__Impl4625); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2239:1: rule__VariableReference__Group__0 : rule__VariableReference__Group__0__Impl rule__VariableReference__Group__1 ;
    public final void rule__VariableReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2243:1: ( rule__VariableReference__Group__0__Impl rule__VariableReference__Group__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2244:2: rule__VariableReference__Group__0__Impl rule__VariableReference__Group__1
            {
            pushFollow(FOLLOW_rule__VariableReference__Group__0__Impl_in_rule__VariableReference__Group__04662);
            rule__VariableReference__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__VariableReference__Group__1_in_rule__VariableReference__Group__04665);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2251:1: rule__VariableReference__Group__0__Impl : ( ( rule__VariableReference__VariableAssignment_0 ) ) ;
    public final void rule__VariableReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2255:1: ( ( ( rule__VariableReference__VariableAssignment_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2256:1: ( ( rule__VariableReference__VariableAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2256:1: ( ( rule__VariableReference__VariableAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2257:1: ( rule__VariableReference__VariableAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getVariableAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2258:1: ( rule__VariableReference__VariableAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2258:2: rule__VariableReference__VariableAssignment_0
            {
            pushFollow(FOLLOW_rule__VariableReference__VariableAssignment_0_in_rule__VariableReference__Group__0__Impl4692);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2268:1: rule__VariableReference__Group__1 : rule__VariableReference__Group__1__Impl ;
    public final void rule__VariableReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2272:1: ( rule__VariableReference__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2273:2: rule__VariableReference__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VariableReference__Group__1__Impl_in_rule__VariableReference__Group__14722);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2279:1: rule__VariableReference__Group__1__Impl : ( ( rule__VariableReference__Group_1__0 )? ) ;
    public final void rule__VariableReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2283:1: ( ( ( rule__VariableReference__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2284:1: ( ( rule__VariableReference__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2284:1: ( ( rule__VariableReference__Group_1__0 )? )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2285:1: ( rule__VariableReference__Group_1__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2286:1: ( rule__VariableReference__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==30) ) {
                int LA24_1 = input.LA(2);

                if ( (synpred39()) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2286:2: rule__VariableReference__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__VariableReference__Group_1__0_in_rule__VariableReference__Group__1__Impl4749);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2300:1: rule__VariableReference__Group_1__0 : rule__VariableReference__Group_1__0__Impl rule__VariableReference__Group_1__1 ;
    public final void rule__VariableReference__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2304:1: ( rule__VariableReference__Group_1__0__Impl rule__VariableReference__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2305:2: rule__VariableReference__Group_1__0__Impl rule__VariableReference__Group_1__1
            {
            pushFollow(FOLLOW_rule__VariableReference__Group_1__0__Impl_in_rule__VariableReference__Group_1__04784);
            rule__VariableReference__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__VariableReference__Group_1__1_in_rule__VariableReference__Group_1__04787);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2312:1: rule__VariableReference__Group_1__0__Impl : ( '(' ) ;
    public final void rule__VariableReference__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2316:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2317:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2317:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2318:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__VariableReference__Group_1__0__Impl4815); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2331:1: rule__VariableReference__Group_1__1 : rule__VariableReference__Group_1__1__Impl rule__VariableReference__Group_1__2 ;
    public final void rule__VariableReference__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2335:1: ( rule__VariableReference__Group_1__1__Impl rule__VariableReference__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2336:2: rule__VariableReference__Group_1__1__Impl rule__VariableReference__Group_1__2
            {
            pushFollow(FOLLOW_rule__VariableReference__Group_1__1__Impl_in_rule__VariableReference__Group_1__14846);
            rule__VariableReference__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__VariableReference__Group_1__2_in_rule__VariableReference__Group_1__14849);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2343:1: rule__VariableReference__Group_1__1__Impl : ( ( rule__VariableReference__Group_1_1__0 )* ) ;
    public final void rule__VariableReference__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2347:1: ( ( ( rule__VariableReference__Group_1_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2348:1: ( ( rule__VariableReference__Group_1_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2348:1: ( ( rule__VariableReference__Group_1_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2349:1: ( rule__VariableReference__Group_1_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getGroup_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2350:1: ( rule__VariableReference__Group_1_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_INT && LA25_0<=RULE_STRING)||(LA25_0>=13 && LA25_0<=15)||LA25_0==30) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2350:2: rule__VariableReference__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__VariableReference__Group_1_1__0_in_rule__VariableReference__Group_1__1__Impl4876);
            	    rule__VariableReference__Group_1_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2360:1: rule__VariableReference__Group_1__2 : rule__VariableReference__Group_1__2__Impl ;
    public final void rule__VariableReference__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2364:1: ( rule__VariableReference__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2365:2: rule__VariableReference__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__VariableReference__Group_1__2__Impl_in_rule__VariableReference__Group_1__24907);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2371:1: rule__VariableReference__Group_1__2__Impl : ( ')' ) ;
    public final void rule__VariableReference__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2375:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2376:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2376:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2377:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__VariableReference__Group_1__2__Impl4935); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2396:1: rule__VariableReference__Group_1_1__0 : rule__VariableReference__Group_1_1__0__Impl rule__VariableReference__Group_1_1__1 ;
    public final void rule__VariableReference__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2400:1: ( rule__VariableReference__Group_1_1__0__Impl rule__VariableReference__Group_1_1__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2401:2: rule__VariableReference__Group_1_1__0__Impl rule__VariableReference__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__VariableReference__Group_1_1__0__Impl_in_rule__VariableReference__Group_1_1__04972);
            rule__VariableReference__Group_1_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__VariableReference__Group_1_1__1_in_rule__VariableReference__Group_1_1__04975);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2408:1: rule__VariableReference__Group_1_1__0__Impl : ( ( rule__VariableReference__SubExpressionsAssignment_1_1_0 ) ) ;
    public final void rule__VariableReference__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2412:1: ( ( ( rule__VariableReference__SubExpressionsAssignment_1_1_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2413:1: ( ( rule__VariableReference__SubExpressionsAssignment_1_1_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2413:1: ( ( rule__VariableReference__SubExpressionsAssignment_1_1_0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2414:1: ( rule__VariableReference__SubExpressionsAssignment_1_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getSubExpressionsAssignment_1_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2415:1: ( rule__VariableReference__SubExpressionsAssignment_1_1_0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2415:2: rule__VariableReference__SubExpressionsAssignment_1_1_0
            {
            pushFollow(FOLLOW_rule__VariableReference__SubExpressionsAssignment_1_1_0_in_rule__VariableReference__Group_1_1__0__Impl5002);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2425:1: rule__VariableReference__Group_1_1__1 : rule__VariableReference__Group_1_1__1__Impl ;
    public final void rule__VariableReference__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2429:1: ( rule__VariableReference__Group_1_1__1__Impl )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2430:2: rule__VariableReference__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__VariableReference__Group_1_1__1__Impl_in_rule__VariableReference__Group_1_1__15032);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2436:1: rule__VariableReference__Group_1_1__1__Impl : ( ( ',' )? ) ;
    public final void rule__VariableReference__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2440:1: ( ( ( ',' )? ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2441:1: ( ( ',' )? )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2441:1: ( ( ',' )? )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2442:1: ( ',' )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getCommaKeyword_1_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2443:1: ( ',' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==29) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2444:2: ','
                    {
                    match(input,29,FOLLOW_29_in_rule__VariableReference__Group_1_1__1__Impl5061); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2459:1: rule__ValOperation__Group__0 : rule__ValOperation__Group__0__Impl rule__ValOperation__Group__1 ;
    public final void rule__ValOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2463:1: ( rule__ValOperation__Group__0__Impl rule__ValOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2464:2: rule__ValOperation__Group__0__Impl rule__ValOperation__Group__1
            {
            pushFollow(FOLLOW_rule__ValOperation__Group__0__Impl_in_rule__ValOperation__Group__05098);
            rule__ValOperation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__ValOperation__Group__1_in_rule__ValOperation__Group__05101);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2471:1: rule__ValOperation__Group__0__Impl : ( ( rule__ValOperation__OperatorAssignment_0 ) ) ;
    public final void rule__ValOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2475:1: ( ( ( rule__ValOperation__OperatorAssignment_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2476:1: ( ( rule__ValOperation__OperatorAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2476:1: ( ( rule__ValOperation__OperatorAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2477:1: ( rule__ValOperation__OperatorAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValOperationAccess().getOperatorAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2478:1: ( rule__ValOperation__OperatorAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2478:2: rule__ValOperation__OperatorAssignment_0
            {
            pushFollow(FOLLOW_rule__ValOperation__OperatorAssignment_0_in_rule__ValOperation__Group__0__Impl5128);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2488:1: rule__ValOperation__Group__1 : rule__ValOperation__Group__1__Impl ;
    public final void rule__ValOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2492:1: ( rule__ValOperation__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2493:2: rule__ValOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ValOperation__Group__1__Impl_in_rule__ValOperation__Group__15158);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2499:1: rule__ValOperation__Group__1__Impl : ( ( rule__ValOperation__SubExpressionsAssignment_1 ) ) ;
    public final void rule__ValOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2503:1: ( ( ( rule__ValOperation__SubExpressionsAssignment_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2504:1: ( ( rule__ValOperation__SubExpressionsAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2504:1: ( ( rule__ValOperation__SubExpressionsAssignment_1 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2505:1: ( rule__ValOperation__SubExpressionsAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValOperationAccess().getSubExpressionsAssignment_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2506:1: ( rule__ValOperation__SubExpressionsAssignment_1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2506:2: rule__ValOperation__SubExpressionsAssignment_1
            {
            pushFollow(FOLLOW_rule__ValOperation__SubExpressionsAssignment_1_in_rule__ValOperation__Group__1__Impl5185);
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


    // $ANTLR start rule__ParanthesedValueExpression__Group_5__0
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2520:1: rule__ParanthesedValueExpression__Group_5__0 : rule__ParanthesedValueExpression__Group_5__0__Impl rule__ParanthesedValueExpression__Group_5__1 ;
    public final void rule__ParanthesedValueExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2524:1: ( rule__ParanthesedValueExpression__Group_5__0__Impl rule__ParanthesedValueExpression__Group_5__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2525:2: rule__ParanthesedValueExpression__Group_5__0__Impl rule__ParanthesedValueExpression__Group_5__1
            {
            pushFollow(FOLLOW_rule__ParanthesedValueExpression__Group_5__0__Impl_in_rule__ParanthesedValueExpression__Group_5__05219);
            rule__ParanthesedValueExpression__Group_5__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__ParanthesedValueExpression__Group_5__1_in_rule__ParanthesedValueExpression__Group_5__05222);
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


    // $ANTLR start rule__ParanthesedValueExpression__Group_5__0__Impl
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2532:1: rule__ParanthesedValueExpression__Group_5__0__Impl : ( '(' ) ;
    public final void rule__ParanthesedValueExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2536:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2537:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2537:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2538:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedValueExpressionAccess().getLeftParenthesisKeyword_5_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__ParanthesedValueExpression__Group_5__0__Impl5250); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParanthesedValueExpressionAccess().getLeftParenthesisKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ParanthesedValueExpression__Group_5__0__Impl


    // $ANTLR start rule__ParanthesedValueExpression__Group_5__1
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2551:1: rule__ParanthesedValueExpression__Group_5__1 : rule__ParanthesedValueExpression__Group_5__1__Impl rule__ParanthesedValueExpression__Group_5__2 ;
    public final void rule__ParanthesedValueExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2555:1: ( rule__ParanthesedValueExpression__Group_5__1__Impl rule__ParanthesedValueExpression__Group_5__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2556:2: rule__ParanthesedValueExpression__Group_5__1__Impl rule__ParanthesedValueExpression__Group_5__2
            {
            pushFollow(FOLLOW_rule__ParanthesedValueExpression__Group_5__1__Impl_in_rule__ParanthesedValueExpression__Group_5__15281);
            rule__ParanthesedValueExpression__Group_5__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__ParanthesedValueExpression__Group_5__2_in_rule__ParanthesedValueExpression__Group_5__15284);
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


    // $ANTLR start rule__ParanthesedValueExpression__Group_5__1__Impl
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2563:1: rule__ParanthesedValueExpression__Group_5__1__Impl : ( rulePlusOperation ) ;
    public final void rule__ParanthesedValueExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2567:1: ( ( rulePlusOperation ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2568:1: ( rulePlusOperation )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2568:1: ( rulePlusOperation )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2569:1: rulePlusOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedValueExpressionAccess().getPlusOperationParserRuleCall_5_1()); 
            }
            pushFollow(FOLLOW_rulePlusOperation_in_rule__ParanthesedValueExpression__Group_5__1__Impl5311);
            rulePlusOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParanthesedValueExpressionAccess().getPlusOperationParserRuleCall_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ParanthesedValueExpression__Group_5__1__Impl


    // $ANTLR start rule__ParanthesedValueExpression__Group_5__2
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2580:1: rule__ParanthesedValueExpression__Group_5__2 : rule__ParanthesedValueExpression__Group_5__2__Impl ;
    public final void rule__ParanthesedValueExpression__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2584:1: ( rule__ParanthesedValueExpression__Group_5__2__Impl )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2585:2: rule__ParanthesedValueExpression__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__ParanthesedValueExpression__Group_5__2__Impl_in_rule__ParanthesedValueExpression__Group_5__25340);
            rule__ParanthesedValueExpression__Group_5__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
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


    // $ANTLR start rule__ParanthesedValueExpression__Group_5__2__Impl
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2591:1: rule__ParanthesedValueExpression__Group_5__2__Impl : ( ')' ) ;
    public final void rule__ParanthesedValueExpression__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2595:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2596:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2596:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2597:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedValueExpressionAccess().getRightParenthesisKeyword_5_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__ParanthesedValueExpression__Group_5__2__Impl5368); if (failed) return ;
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
    // $ANTLR end rule__ParanthesedValueExpression__Group_5__2__Impl


    // $ANTLR start rule__ParanthesedValueExpression__Group_6__0
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2616:1: rule__ParanthesedValueExpression__Group_6__0 : rule__ParanthesedValueExpression__Group_6__0__Impl rule__ParanthesedValueExpression__Group_6__1 ;
    public final void rule__ParanthesedValueExpression__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2620:1: ( rule__ParanthesedValueExpression__Group_6__0__Impl rule__ParanthesedValueExpression__Group_6__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2621:2: rule__ParanthesedValueExpression__Group_6__0__Impl rule__ParanthesedValueExpression__Group_6__1
            {
            pushFollow(FOLLOW_rule__ParanthesedValueExpression__Group_6__0__Impl_in_rule__ParanthesedValueExpression__Group_6__05405);
            rule__ParanthesedValueExpression__Group_6__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__ParanthesedValueExpression__Group_6__1_in_rule__ParanthesedValueExpression__Group_6__05408);
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


    // $ANTLR start rule__ParanthesedValueExpression__Group_6__0__Impl
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2628:1: rule__ParanthesedValueExpression__Group_6__0__Impl : ( '(' ) ;
    public final void rule__ParanthesedValueExpression__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2632:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2633:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2633:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2634:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedValueExpressionAccess().getLeftParenthesisKeyword_6_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__ParanthesedValueExpression__Group_6__0__Impl5436); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParanthesedValueExpressionAccess().getLeftParenthesisKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ParanthesedValueExpression__Group_6__0__Impl


    // $ANTLR start rule__ParanthesedValueExpression__Group_6__1
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2647:1: rule__ParanthesedValueExpression__Group_6__1 : rule__ParanthesedValueExpression__Group_6__1__Impl rule__ParanthesedValueExpression__Group_6__2 ;
    public final void rule__ParanthesedValueExpression__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2651:1: ( rule__ParanthesedValueExpression__Group_6__1__Impl rule__ParanthesedValueExpression__Group_6__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2652:2: rule__ParanthesedValueExpression__Group_6__1__Impl rule__ParanthesedValueExpression__Group_6__2
            {
            pushFollow(FOLLOW_rule__ParanthesedValueExpression__Group_6__1__Impl_in_rule__ParanthesedValueExpression__Group_6__15467);
            rule__ParanthesedValueExpression__Group_6__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__ParanthesedValueExpression__Group_6__2_in_rule__ParanthesedValueExpression__Group_6__15470);
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


    // $ANTLR start rule__ParanthesedValueExpression__Group_6__1__Impl
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2659:1: rule__ParanthesedValueExpression__Group_6__1__Impl : ( ruleDivOperation ) ;
    public final void rule__ParanthesedValueExpression__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2663:1: ( ( ruleDivOperation ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2664:1: ( ruleDivOperation )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2664:1: ( ruleDivOperation )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2665:1: ruleDivOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedValueExpressionAccess().getDivOperationParserRuleCall_6_1()); 
            }
            pushFollow(FOLLOW_ruleDivOperation_in_rule__ParanthesedValueExpression__Group_6__1__Impl5497);
            ruleDivOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParanthesedValueExpressionAccess().getDivOperationParserRuleCall_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ParanthesedValueExpression__Group_6__1__Impl


    // $ANTLR start rule__ParanthesedValueExpression__Group_6__2
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2676:1: rule__ParanthesedValueExpression__Group_6__2 : rule__ParanthesedValueExpression__Group_6__2__Impl ;
    public final void rule__ParanthesedValueExpression__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2680:1: ( rule__ParanthesedValueExpression__Group_6__2__Impl )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2681:2: rule__ParanthesedValueExpression__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__ParanthesedValueExpression__Group_6__2__Impl_in_rule__ParanthesedValueExpression__Group_6__25526);
            rule__ParanthesedValueExpression__Group_6__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
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


    // $ANTLR start rule__ParanthesedValueExpression__Group_6__2__Impl
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2687:1: rule__ParanthesedValueExpression__Group_6__2__Impl : ( ')' ) ;
    public final void rule__ParanthesedValueExpression__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2691:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2692:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2692:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2693:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedValueExpressionAccess().getRightParenthesisKeyword_6_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__ParanthesedValueExpression__Group_6__2__Impl5554); if (failed) return ;
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
    // $ANTLR end rule__ParanthesedValueExpression__Group_6__2__Impl


    // $ANTLR start rule__PlusOperation__Group__0
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2712:1: rule__PlusOperation__Group__0 : rule__PlusOperation__Group__0__Impl rule__PlusOperation__Group__1 ;
    public final void rule__PlusOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2716:1: ( rule__PlusOperation__Group__0__Impl rule__PlusOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2717:2: rule__PlusOperation__Group__0__Impl rule__PlusOperation__Group__1
            {
            pushFollow(FOLLOW_rule__PlusOperation__Group__0__Impl_in_rule__PlusOperation__Group__05591);
            rule__PlusOperation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PlusOperation__Group__1_in_rule__PlusOperation__Group__05594);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2724:1: rule__PlusOperation__Group__0__Impl : ( ruleMultOrDivOperation ) ;
    public final void rule__PlusOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2728:1: ( ( ruleMultOrDivOperation ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2729:1: ( ruleMultOrDivOperation )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2729:1: ( ruleMultOrDivOperation )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2730:1: ruleMultOrDivOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getMultOrDivOperationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleMultOrDivOperation_in_rule__PlusOperation__Group__0__Impl5621);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2741:1: rule__PlusOperation__Group__1 : rule__PlusOperation__Group__1__Impl ;
    public final void rule__PlusOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2745:1: ( rule__PlusOperation__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2746:2: rule__PlusOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOperation__Group__1__Impl_in_rule__PlusOperation__Group__15650);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2752:1: rule__PlusOperation__Group__1__Impl : ( ( rule__PlusOperation__Group_1__0 )* ) ;
    public final void rule__PlusOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2756:1: ( ( ( rule__PlusOperation__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2757:1: ( ( rule__PlusOperation__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2757:1: ( ( rule__PlusOperation__Group_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2758:1: ( rule__PlusOperation__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2759:1: ( rule__PlusOperation__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=25 && LA27_0<=26)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2759:2: rule__PlusOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PlusOperation__Group_1__0_in_rule__PlusOperation__Group__1__Impl5677);
            	    rule__PlusOperation__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2773:1: rule__PlusOperation__Group_1__0 : rule__PlusOperation__Group_1__0__Impl rule__PlusOperation__Group_1__1 ;
    public final void rule__PlusOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2777:1: ( rule__PlusOperation__Group_1__0__Impl rule__PlusOperation__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2778:2: rule__PlusOperation__Group_1__0__Impl rule__PlusOperation__Group_1__1
            {
            pushFollow(FOLLOW_rule__PlusOperation__Group_1__0__Impl_in_rule__PlusOperation__Group_1__05712);
            rule__PlusOperation__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PlusOperation__Group_1__1_in_rule__PlusOperation__Group_1__05715);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2785:1: rule__PlusOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__PlusOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2789:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2790:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2790:1: ( () )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2791:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2792:1: ()
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2794:1: 
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2804:1: rule__PlusOperation__Group_1__1 : rule__PlusOperation__Group_1__1__Impl rule__PlusOperation__Group_1__2 ;
    public final void rule__PlusOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2808:1: ( rule__PlusOperation__Group_1__1__Impl rule__PlusOperation__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2809:2: rule__PlusOperation__Group_1__1__Impl rule__PlusOperation__Group_1__2
            {
            pushFollow(FOLLOW_rule__PlusOperation__Group_1__1__Impl_in_rule__PlusOperation__Group_1__15773);
            rule__PlusOperation__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PlusOperation__Group_1__2_in_rule__PlusOperation__Group_1__15776);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2816:1: rule__PlusOperation__Group_1__1__Impl : ( ( rule__PlusOperation__OperatorAssignment_1_1 ) ) ;
    public final void rule__PlusOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2820:1: ( ( ( rule__PlusOperation__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2821:1: ( ( rule__PlusOperation__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2821:1: ( ( rule__PlusOperation__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2822:1: ( rule__PlusOperation__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2823:1: ( rule__PlusOperation__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2823:2: rule__PlusOperation__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__PlusOperation__OperatorAssignment_1_1_in_rule__PlusOperation__Group_1__1__Impl5803);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2833:1: rule__PlusOperation__Group_1__2 : rule__PlusOperation__Group_1__2__Impl ;
    public final void rule__PlusOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2837:1: ( rule__PlusOperation__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2838:2: rule__PlusOperation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__PlusOperation__Group_1__2__Impl_in_rule__PlusOperation__Group_1__25833);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2844:1: rule__PlusOperation__Group_1__2__Impl : ( ( rule__PlusOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__PlusOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2848:1: ( ( ( rule__PlusOperation__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2849:1: ( ( rule__PlusOperation__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2849:1: ( ( rule__PlusOperation__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2850:1: ( rule__PlusOperation__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2851:1: ( rule__PlusOperation__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2851:2: rule__PlusOperation__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__PlusOperation__SubExpressionsAssignment_1_2_in_rule__PlusOperation__Group_1__2__Impl5860);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2867:1: rule__MultOrDivOperation__Group_1__0 : rule__MultOrDivOperation__Group_1__0__Impl rule__MultOrDivOperation__Group_1__1 ;
    public final void rule__MultOrDivOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2871:1: ( rule__MultOrDivOperation__Group_1__0__Impl rule__MultOrDivOperation__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2872:2: rule__MultOrDivOperation__Group_1__0__Impl rule__MultOrDivOperation__Group_1__1
            {
            pushFollow(FOLLOW_rule__MultOrDivOperation__Group_1__0__Impl_in_rule__MultOrDivOperation__Group_1__05896);
            rule__MultOrDivOperation__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MultOrDivOperation__Group_1__1_in_rule__MultOrDivOperation__Group_1__05899);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2879:1: rule__MultOrDivOperation__Group_1__0__Impl : ( '(' ) ;
    public final void rule__MultOrDivOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2883:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2884:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2884:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2885:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOrDivOperationAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__MultOrDivOperation__Group_1__0__Impl5927); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2898:1: rule__MultOrDivOperation__Group_1__1 : rule__MultOrDivOperation__Group_1__1__Impl rule__MultOrDivOperation__Group_1__2 ;
    public final void rule__MultOrDivOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2902:1: ( rule__MultOrDivOperation__Group_1__1__Impl rule__MultOrDivOperation__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2903:2: rule__MultOrDivOperation__Group_1__1__Impl rule__MultOrDivOperation__Group_1__2
            {
            pushFollow(FOLLOW_rule__MultOrDivOperation__Group_1__1__Impl_in_rule__MultOrDivOperation__Group_1__15958);
            rule__MultOrDivOperation__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MultOrDivOperation__Group_1__2_in_rule__MultOrDivOperation__Group_1__15961);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2910:1: rule__MultOrDivOperation__Group_1__1__Impl : ( ruleDivOperation ) ;
    public final void rule__MultOrDivOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2914:1: ( ( ruleDivOperation ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2915:1: ( ruleDivOperation )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2915:1: ( ruleDivOperation )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2916:1: ruleDivOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOrDivOperationAccess().getDivOperationParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleDivOperation_in_rule__MultOrDivOperation__Group_1__1__Impl5988);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2927:1: rule__MultOrDivOperation__Group_1__2 : rule__MultOrDivOperation__Group_1__2__Impl ;
    public final void rule__MultOrDivOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2931:1: ( rule__MultOrDivOperation__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2932:2: rule__MultOrDivOperation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__MultOrDivOperation__Group_1__2__Impl_in_rule__MultOrDivOperation__Group_1__26017);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2938:1: rule__MultOrDivOperation__Group_1__2__Impl : ( ')' ) ;
    public final void rule__MultOrDivOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2942:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2943:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2943:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2944:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOrDivOperationAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__MultOrDivOperation__Group_1__2__Impl6045); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2963:1: rule__MultOperation__Group__0 : rule__MultOperation__Group__0__Impl rule__MultOperation__Group__1 ;
    public final void rule__MultOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2967:1: ( rule__MultOperation__Group__0__Impl rule__MultOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2968:2: rule__MultOperation__Group__0__Impl rule__MultOperation__Group__1
            {
            pushFollow(FOLLOW_rule__MultOperation__Group__0__Impl_in_rule__MultOperation__Group__06082);
            rule__MultOperation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MultOperation__Group__1_in_rule__MultOperation__Group__06085);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2975:1: rule__MultOperation__Group__0__Impl : ( rulePreOrNormalValueExpression ) ;
    public final void rule__MultOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2979:1: ( ( rulePreOrNormalValueExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2980:1: ( rulePreOrNormalValueExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2980:1: ( rulePreOrNormalValueExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2981:1: rulePreOrNormalValueExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getPreOrNormalValueExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulePreOrNormalValueExpression_in_rule__MultOperation__Group__0__Impl6112);
            rulePreOrNormalValueExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMultOperationAccess().getPreOrNormalValueExpressionParserRuleCall_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2992:1: rule__MultOperation__Group__1 : rule__MultOperation__Group__1__Impl ;
    public final void rule__MultOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2996:1: ( rule__MultOperation__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2997:2: rule__MultOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MultOperation__Group__1__Impl_in_rule__MultOperation__Group__16141);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3003:1: rule__MultOperation__Group__1__Impl : ( ( rule__MultOperation__Group_1__0 )* ) ;
    public final void rule__MultOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3007:1: ( ( ( rule__MultOperation__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3008:1: ( ( rule__MultOperation__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3008:1: ( ( rule__MultOperation__Group_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3009:1: ( rule__MultOperation__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3010:1: ( rule__MultOperation__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=27 && LA28_0<=28)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3010:2: rule__MultOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__MultOperation__Group_1__0_in_rule__MultOperation__Group__1__Impl6168);
            	    rule__MultOperation__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3024:1: rule__MultOperation__Group_1__0 : rule__MultOperation__Group_1__0__Impl rule__MultOperation__Group_1__1 ;
    public final void rule__MultOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3028:1: ( rule__MultOperation__Group_1__0__Impl rule__MultOperation__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3029:2: rule__MultOperation__Group_1__0__Impl rule__MultOperation__Group_1__1
            {
            pushFollow(FOLLOW_rule__MultOperation__Group_1__0__Impl_in_rule__MultOperation__Group_1__06203);
            rule__MultOperation__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MultOperation__Group_1__1_in_rule__MultOperation__Group_1__06206);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3036:1: rule__MultOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__MultOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3040:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3041:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3041:1: ( () )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3042:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3043:1: ()
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3045:1: 
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3055:1: rule__MultOperation__Group_1__1 : rule__MultOperation__Group_1__1__Impl rule__MultOperation__Group_1__2 ;
    public final void rule__MultOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3059:1: ( rule__MultOperation__Group_1__1__Impl rule__MultOperation__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3060:2: rule__MultOperation__Group_1__1__Impl rule__MultOperation__Group_1__2
            {
            pushFollow(FOLLOW_rule__MultOperation__Group_1__1__Impl_in_rule__MultOperation__Group_1__16264);
            rule__MultOperation__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MultOperation__Group_1__2_in_rule__MultOperation__Group_1__16267);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3067:1: rule__MultOperation__Group_1__1__Impl : ( ( rule__MultOperation__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3071:1: ( ( ( rule__MultOperation__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3072:1: ( ( rule__MultOperation__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3072:1: ( ( rule__MultOperation__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3073:1: ( rule__MultOperation__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3074:1: ( rule__MultOperation__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3074:2: rule__MultOperation__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MultOperation__OperatorAssignment_1_1_in_rule__MultOperation__Group_1__1__Impl6294);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3084:1: rule__MultOperation__Group_1__2 : rule__MultOperation__Group_1__2__Impl ;
    public final void rule__MultOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3088:1: ( rule__MultOperation__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3089:2: rule__MultOperation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__MultOperation__Group_1__2__Impl_in_rule__MultOperation__Group_1__26324);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3095:1: rule__MultOperation__Group_1__2__Impl : ( ( rule__MultOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__MultOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3099:1: ( ( ( rule__MultOperation__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3100:1: ( ( rule__MultOperation__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3100:1: ( ( rule__MultOperation__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3101:1: ( rule__MultOperation__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3102:1: ( rule__MultOperation__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3102:2: rule__MultOperation__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__MultOperation__SubExpressionsAssignment_1_2_in_rule__MultOperation__Group_1__2__Impl6351);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3118:1: rule__DivOperation__Group__0 : rule__DivOperation__Group__0__Impl rule__DivOperation__Group__1 ;
    public final void rule__DivOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3122:1: ( rule__DivOperation__Group__0__Impl rule__DivOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3123:2: rule__DivOperation__Group__0__Impl rule__DivOperation__Group__1
            {
            pushFollow(FOLLOW_rule__DivOperation__Group__0__Impl_in_rule__DivOperation__Group__06387);
            rule__DivOperation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__DivOperation__Group__1_in_rule__DivOperation__Group__06390);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3130:1: rule__DivOperation__Group__0__Impl : ( rulePreOrNormalValueExpression ) ;
    public final void rule__DivOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3134:1: ( ( rulePreOrNormalValueExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3135:1: ( rulePreOrNormalValueExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3135:1: ( rulePreOrNormalValueExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3136:1: rulePreOrNormalValueExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getPreOrNormalValueExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulePreOrNormalValueExpression_in_rule__DivOperation__Group__0__Impl6417);
            rulePreOrNormalValueExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDivOperationAccess().getPreOrNormalValueExpressionParserRuleCall_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3147:1: rule__DivOperation__Group__1 : rule__DivOperation__Group__1__Impl ;
    public final void rule__DivOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3151:1: ( rule__DivOperation__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3152:2: rule__DivOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DivOperation__Group__1__Impl_in_rule__DivOperation__Group__16446);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3158:1: rule__DivOperation__Group__1__Impl : ( ( rule__DivOperation__Group_1__0 )* ) ;
    public final void rule__DivOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3162:1: ( ( ( rule__DivOperation__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3163:1: ( ( rule__DivOperation__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3163:1: ( ( rule__DivOperation__Group_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3164:1: ( rule__DivOperation__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3165:1: ( rule__DivOperation__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==18) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3165:2: rule__DivOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__DivOperation__Group_1__0_in_rule__DivOperation__Group__1__Impl6473);
            	    rule__DivOperation__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3179:1: rule__DivOperation__Group_1__0 : rule__DivOperation__Group_1__0__Impl rule__DivOperation__Group_1__1 ;
    public final void rule__DivOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3183:1: ( rule__DivOperation__Group_1__0__Impl rule__DivOperation__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3184:2: rule__DivOperation__Group_1__0__Impl rule__DivOperation__Group_1__1
            {
            pushFollow(FOLLOW_rule__DivOperation__Group_1__0__Impl_in_rule__DivOperation__Group_1__06508);
            rule__DivOperation__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__DivOperation__Group_1__1_in_rule__DivOperation__Group_1__06511);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3191:1: rule__DivOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__DivOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3195:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3196:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3196:1: ( () )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3197:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3198:1: ()
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3200:1: 
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3210:1: rule__DivOperation__Group_1__1 : rule__DivOperation__Group_1__1__Impl rule__DivOperation__Group_1__2 ;
    public final void rule__DivOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3214:1: ( rule__DivOperation__Group_1__1__Impl rule__DivOperation__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3215:2: rule__DivOperation__Group_1__1__Impl rule__DivOperation__Group_1__2
            {
            pushFollow(FOLLOW_rule__DivOperation__Group_1__1__Impl_in_rule__DivOperation__Group_1__16569);
            rule__DivOperation__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__DivOperation__Group_1__2_in_rule__DivOperation__Group_1__16572);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3222:1: rule__DivOperation__Group_1__1__Impl : ( ( rule__DivOperation__OperatorAssignment_1_1 ) ) ;
    public final void rule__DivOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3226:1: ( ( ( rule__DivOperation__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3227:1: ( ( rule__DivOperation__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3227:1: ( ( rule__DivOperation__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3228:1: ( rule__DivOperation__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3229:1: ( rule__DivOperation__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3229:2: rule__DivOperation__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__DivOperation__OperatorAssignment_1_1_in_rule__DivOperation__Group_1__1__Impl6599);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3239:1: rule__DivOperation__Group_1__2 : rule__DivOperation__Group_1__2__Impl ;
    public final void rule__DivOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3243:1: ( rule__DivOperation__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3244:2: rule__DivOperation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__DivOperation__Group_1__2__Impl_in_rule__DivOperation__Group_1__26629);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3250:1: rule__DivOperation__Group_1__2__Impl : ( ( rule__DivOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__DivOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3254:1: ( ( ( rule__DivOperation__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3255:1: ( ( rule__DivOperation__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3255:1: ( ( rule__DivOperation__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3256:1: ( rule__DivOperation__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3257:1: ( rule__DivOperation__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3257:2: rule__DivOperation__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__DivOperation__SubExpressionsAssignment_1_2_in_rule__DivOperation__Group_1__2__Impl6656);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3273:1: rule__PreArithmOperation__Group__0 : rule__PreArithmOperation__Group__0__Impl rule__PreArithmOperation__Group__1 ;
    public final void rule__PreArithmOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3277:1: ( rule__PreArithmOperation__Group__0__Impl rule__PreArithmOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3278:2: rule__PreArithmOperation__Group__0__Impl rule__PreArithmOperation__Group__1
            {
            pushFollow(FOLLOW_rule__PreArithmOperation__Group__0__Impl_in_rule__PreArithmOperation__Group__06692);
            rule__PreArithmOperation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PreArithmOperation__Group__1_in_rule__PreArithmOperation__Group__06695);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3285:1: rule__PreArithmOperation__Group__0__Impl : ( ( rule__PreArithmOperation__OperatorAssignment_0 ) ) ;
    public final void rule__PreArithmOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3289:1: ( ( ( rule__PreArithmOperation__OperatorAssignment_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3290:1: ( ( rule__PreArithmOperation__OperatorAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3290:1: ( ( rule__PreArithmOperation__OperatorAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3291:1: ( rule__PreArithmOperation__OperatorAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreArithmOperationAccess().getOperatorAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3292:1: ( rule__PreArithmOperation__OperatorAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3292:2: rule__PreArithmOperation__OperatorAssignment_0
            {
            pushFollow(FOLLOW_rule__PreArithmOperation__OperatorAssignment_0_in_rule__PreArithmOperation__Group__0__Impl6722);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3302:1: rule__PreArithmOperation__Group__1 : rule__PreArithmOperation__Group__1__Impl rule__PreArithmOperation__Group__2 ;
    public final void rule__PreArithmOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3306:1: ( rule__PreArithmOperation__Group__1__Impl rule__PreArithmOperation__Group__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3307:2: rule__PreArithmOperation__Group__1__Impl rule__PreArithmOperation__Group__2
            {
            pushFollow(FOLLOW_rule__PreArithmOperation__Group__1__Impl_in_rule__PreArithmOperation__Group__16752);
            rule__PreArithmOperation__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PreArithmOperation__Group__2_in_rule__PreArithmOperation__Group__16755);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3314:1: rule__PreArithmOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__PreArithmOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3318:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3319:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3319:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3320:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreArithmOperationAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,30,FOLLOW_30_in_rule__PreArithmOperation__Group__1__Impl6783); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3333:1: rule__PreArithmOperation__Group__2 : rule__PreArithmOperation__Group__2__Impl rule__PreArithmOperation__Group__3 ;
    public final void rule__PreArithmOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3337:1: ( rule__PreArithmOperation__Group__2__Impl rule__PreArithmOperation__Group__3 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3338:2: rule__PreArithmOperation__Group__2__Impl rule__PreArithmOperation__Group__3
            {
            pushFollow(FOLLOW_rule__PreArithmOperation__Group__2__Impl_in_rule__PreArithmOperation__Group__26814);
            rule__PreArithmOperation__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PreArithmOperation__Group__3_in_rule__PreArithmOperation__Group__26817);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3345:1: rule__PreArithmOperation__Group__2__Impl : ( ( rule__PreArithmOperation__SubExpressionsAssignment_2 ) ) ;
    public final void rule__PreArithmOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3349:1: ( ( ( rule__PreArithmOperation__SubExpressionsAssignment_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3350:1: ( ( rule__PreArithmOperation__SubExpressionsAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3350:1: ( ( rule__PreArithmOperation__SubExpressionsAssignment_2 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3351:1: ( rule__PreArithmOperation__SubExpressionsAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreArithmOperationAccess().getSubExpressionsAssignment_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3352:1: ( rule__PreArithmOperation__SubExpressionsAssignment_2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3352:2: rule__PreArithmOperation__SubExpressionsAssignment_2
            {
            pushFollow(FOLLOW_rule__PreArithmOperation__SubExpressionsAssignment_2_in_rule__PreArithmOperation__Group__2__Impl6844);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3362:1: rule__PreArithmOperation__Group__3 : rule__PreArithmOperation__Group__3__Impl ;
    public final void rule__PreArithmOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3366:1: ( rule__PreArithmOperation__Group__3__Impl )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3367:2: rule__PreArithmOperation__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__PreArithmOperation__Group__3__Impl_in_rule__PreArithmOperation__Group__36874);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3373:1: rule__PreArithmOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__PreArithmOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3377:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3378:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3378:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3379:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreArithmOperationAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,31,FOLLOW_31_in_rule__PreArithmOperation__Group__3__Impl6902); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3400:1: rule__CompareOperation__Group__0 : rule__CompareOperation__Group__0__Impl rule__CompareOperation__Group__1 ;
    public final void rule__CompareOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3404:1: ( rule__CompareOperation__Group__0__Impl rule__CompareOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3405:2: rule__CompareOperation__Group__0__Impl rule__CompareOperation__Group__1
            {
            pushFollow(FOLLOW_rule__CompareOperation__Group__0__Impl_in_rule__CompareOperation__Group__06941);
            rule__CompareOperation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__CompareOperation__Group__1_in_rule__CompareOperation__Group__06944);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3412:1: rule__CompareOperation__Group__0__Impl : ( ruleValueExpression ) ;
    public final void rule__CompareOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3416:1: ( ( ruleValueExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3417:1: ( ruleValueExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3417:1: ( ruleValueExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3418:1: ruleValueExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getValueExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleValueExpression_in_rule__CompareOperation__Group__0__Impl6971);
            ruleValueExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getValueExpressionParserRuleCall_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3429:1: rule__CompareOperation__Group__1 : rule__CompareOperation__Group__1__Impl ;
    public final void rule__CompareOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3433:1: ( rule__CompareOperation__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3434:2: rule__CompareOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CompareOperation__Group__1__Impl_in_rule__CompareOperation__Group__17000);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3440:1: rule__CompareOperation__Group__1__Impl : ( ( rule__CompareOperation__Group_1__0 ) ) ;
    public final void rule__CompareOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3444:1: ( ( ( rule__CompareOperation__Group_1__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3445:1: ( ( rule__CompareOperation__Group_1__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3445:1: ( ( rule__CompareOperation__Group_1__0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3446:1: ( rule__CompareOperation__Group_1__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3447:1: ( rule__CompareOperation__Group_1__0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3447:2: rule__CompareOperation__Group_1__0
            {
            pushFollow(FOLLOW_rule__CompareOperation__Group_1__0_in_rule__CompareOperation__Group__1__Impl7027);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3461:1: rule__CompareOperation__Group_1__0 : rule__CompareOperation__Group_1__0__Impl rule__CompareOperation__Group_1__1 ;
    public final void rule__CompareOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3465:1: ( rule__CompareOperation__Group_1__0__Impl rule__CompareOperation__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3466:2: rule__CompareOperation__Group_1__0__Impl rule__CompareOperation__Group_1__1
            {
            pushFollow(FOLLOW_rule__CompareOperation__Group_1__0__Impl_in_rule__CompareOperation__Group_1__07061);
            rule__CompareOperation__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__CompareOperation__Group_1__1_in_rule__CompareOperation__Group_1__07064);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3473:1: rule__CompareOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__CompareOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3477:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3478:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3478:1: ( () )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3479:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3480:1: ()
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3482:1: 
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3492:1: rule__CompareOperation__Group_1__1 : rule__CompareOperation__Group_1__1__Impl rule__CompareOperation__Group_1__2 ;
    public final void rule__CompareOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3496:1: ( rule__CompareOperation__Group_1__1__Impl rule__CompareOperation__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3497:2: rule__CompareOperation__Group_1__1__Impl rule__CompareOperation__Group_1__2
            {
            pushFollow(FOLLOW_rule__CompareOperation__Group_1__1__Impl_in_rule__CompareOperation__Group_1__17122);
            rule__CompareOperation__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__CompareOperation__Group_1__2_in_rule__CompareOperation__Group_1__17125);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3504:1: rule__CompareOperation__Group_1__1__Impl : ( ( rule__CompareOperation__OperatorAssignment_1_1 ) ) ;
    public final void rule__CompareOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3508:1: ( ( ( rule__CompareOperation__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3509:1: ( ( rule__CompareOperation__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3509:1: ( ( rule__CompareOperation__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3510:1: ( rule__CompareOperation__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3511:1: ( rule__CompareOperation__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3511:2: rule__CompareOperation__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__CompareOperation__OperatorAssignment_1_1_in_rule__CompareOperation__Group_1__1__Impl7152);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3521:1: rule__CompareOperation__Group_1__2 : rule__CompareOperation__Group_1__2__Impl ;
    public final void rule__CompareOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3525:1: ( rule__CompareOperation__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3526:2: rule__CompareOperation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__CompareOperation__Group_1__2__Impl_in_rule__CompareOperation__Group_1__27182);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3532:1: rule__CompareOperation__Group_1__2__Impl : ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__CompareOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3536:1: ( ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3537:1: ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3537:1: ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3538:1: ( rule__CompareOperation__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3539:1: ( rule__CompareOperation__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3539:2: rule__CompareOperation__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__CompareOperation__SubExpressionsAssignment_1_2_in_rule__CompareOperation__Group_1__2__Impl7209);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3555:1: rule__UnaryOperation__Group__0 : rule__UnaryOperation__Group__0__Impl rule__UnaryOperation__Group__1 ;
    public final void rule__UnaryOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3559:1: ( rule__UnaryOperation__Group__0__Impl rule__UnaryOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3560:2: rule__UnaryOperation__Group__0__Impl rule__UnaryOperation__Group__1
            {
            pushFollow(FOLLOW_rule__UnaryOperation__Group__0__Impl_in_rule__UnaryOperation__Group__07245);
            rule__UnaryOperation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__UnaryOperation__Group__1_in_rule__UnaryOperation__Group__07248);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3567:1: rule__UnaryOperation__Group__0__Impl : ( ( rule__UnaryOperation__OperatorAssignment_0 ) ) ;
    public final void rule__UnaryOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3571:1: ( ( ( rule__UnaryOperation__OperatorAssignment_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3572:1: ( ( rule__UnaryOperation__OperatorAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3572:1: ( ( rule__UnaryOperation__OperatorAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3573:1: ( rule__UnaryOperation__OperatorAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getOperatorAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3574:1: ( rule__UnaryOperation__OperatorAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3574:2: rule__UnaryOperation__OperatorAssignment_0
            {
            pushFollow(FOLLOW_rule__UnaryOperation__OperatorAssignment_0_in_rule__UnaryOperation__Group__0__Impl7275);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3584:1: rule__UnaryOperation__Group__1 : rule__UnaryOperation__Group__1__Impl ;
    public final void rule__UnaryOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3588:1: ( rule__UnaryOperation__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3589:2: rule__UnaryOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__UnaryOperation__Group__1__Impl_in_rule__UnaryOperation__Group__17305);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3595:1: rule__UnaryOperation__Group__1__Impl : ( ( rule__UnaryOperation__SubExpressionsAssignment_1 ) ) ;
    public final void rule__UnaryOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3599:1: ( ( ( rule__UnaryOperation__SubExpressionsAssignment_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3600:1: ( ( rule__UnaryOperation__SubExpressionsAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3600:1: ( ( rule__UnaryOperation__SubExpressionsAssignment_1 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3601:1: ( rule__UnaryOperation__SubExpressionsAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getSubExpressionsAssignment_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3602:1: ( rule__UnaryOperation__SubExpressionsAssignment_1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3602:2: rule__UnaryOperation__SubExpressionsAssignment_1
            {
            pushFollow(FOLLOW_rule__UnaryOperation__SubExpressionsAssignment_1_in_rule__UnaryOperation__Group__1__Impl7332);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3616:1: rule__UnaryParanthesedOperation__Group__0 : rule__UnaryParanthesedOperation__Group__0__Impl rule__UnaryParanthesedOperation__Group__1 ;
    public final void rule__UnaryParanthesedOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3620:1: ( rule__UnaryParanthesedOperation__Group__0__Impl rule__UnaryParanthesedOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3621:2: rule__UnaryParanthesedOperation__Group__0__Impl rule__UnaryParanthesedOperation__Group__1
            {
            pushFollow(FOLLOW_rule__UnaryParanthesedOperation__Group__0__Impl_in_rule__UnaryParanthesedOperation__Group__07366);
            rule__UnaryParanthesedOperation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__UnaryParanthesedOperation__Group__1_in_rule__UnaryParanthesedOperation__Group__07369);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3628:1: rule__UnaryParanthesedOperation__Group__0__Impl : ( ( rule__UnaryParanthesedOperation__OperatorAssignment_0 ) ) ;
    public final void rule__UnaryParanthesedOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3632:1: ( ( ( rule__UnaryParanthesedOperation__OperatorAssignment_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3633:1: ( ( rule__UnaryParanthesedOperation__OperatorAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3633:1: ( ( rule__UnaryParanthesedOperation__OperatorAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3634:1: ( rule__UnaryParanthesedOperation__OperatorAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperationAccess().getOperatorAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3635:1: ( rule__UnaryParanthesedOperation__OperatorAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3635:2: rule__UnaryParanthesedOperation__OperatorAssignment_0
            {
            pushFollow(FOLLOW_rule__UnaryParanthesedOperation__OperatorAssignment_0_in_rule__UnaryParanthesedOperation__Group__0__Impl7396);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3645:1: rule__UnaryParanthesedOperation__Group__1 : rule__UnaryParanthesedOperation__Group__1__Impl rule__UnaryParanthesedOperation__Group__2 ;
    public final void rule__UnaryParanthesedOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3649:1: ( rule__UnaryParanthesedOperation__Group__1__Impl rule__UnaryParanthesedOperation__Group__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3650:2: rule__UnaryParanthesedOperation__Group__1__Impl rule__UnaryParanthesedOperation__Group__2
            {
            pushFollow(FOLLOW_rule__UnaryParanthesedOperation__Group__1__Impl_in_rule__UnaryParanthesedOperation__Group__17426);
            rule__UnaryParanthesedOperation__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__UnaryParanthesedOperation__Group__2_in_rule__UnaryParanthesedOperation__Group__17429);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3657:1: rule__UnaryParanthesedOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__UnaryParanthesedOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3661:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3662:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3662:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3663:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperationAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,30,FOLLOW_30_in_rule__UnaryParanthesedOperation__Group__1__Impl7457); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3676:1: rule__UnaryParanthesedOperation__Group__2 : rule__UnaryParanthesedOperation__Group__2__Impl rule__UnaryParanthesedOperation__Group__3 ;
    public final void rule__UnaryParanthesedOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3680:1: ( rule__UnaryParanthesedOperation__Group__2__Impl rule__UnaryParanthesedOperation__Group__3 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3681:2: rule__UnaryParanthesedOperation__Group__2__Impl rule__UnaryParanthesedOperation__Group__3
            {
            pushFollow(FOLLOW_rule__UnaryParanthesedOperation__Group__2__Impl_in_rule__UnaryParanthesedOperation__Group__27488);
            rule__UnaryParanthesedOperation__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__UnaryParanthesedOperation__Group__3_in_rule__UnaryParanthesedOperation__Group__27491);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3688:1: rule__UnaryParanthesedOperation__Group__2__Impl : ( ( rule__UnaryParanthesedOperation__SubExpressionsAssignment_2 ) ) ;
    public final void rule__UnaryParanthesedOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3692:1: ( ( ( rule__UnaryParanthesedOperation__SubExpressionsAssignment_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3693:1: ( ( rule__UnaryParanthesedOperation__SubExpressionsAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3693:1: ( ( rule__UnaryParanthesedOperation__SubExpressionsAssignment_2 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3694:1: ( rule__UnaryParanthesedOperation__SubExpressionsAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperationAccess().getSubExpressionsAssignment_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3695:1: ( rule__UnaryParanthesedOperation__SubExpressionsAssignment_2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3695:2: rule__UnaryParanthesedOperation__SubExpressionsAssignment_2
            {
            pushFollow(FOLLOW_rule__UnaryParanthesedOperation__SubExpressionsAssignment_2_in_rule__UnaryParanthesedOperation__Group__2__Impl7518);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3705:1: rule__UnaryParanthesedOperation__Group__3 : rule__UnaryParanthesedOperation__Group__3__Impl ;
    public final void rule__UnaryParanthesedOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3709:1: ( rule__UnaryParanthesedOperation__Group__3__Impl )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3710:2: rule__UnaryParanthesedOperation__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__UnaryParanthesedOperation__Group__3__Impl_in_rule__UnaryParanthesedOperation__Group__37548);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3716:1: rule__UnaryParanthesedOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__UnaryParanthesedOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3720:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3721:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3721:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3722:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperationAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,31,FOLLOW_31_in_rule__UnaryParanthesedOperation__Group__3__Impl7576); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3743:1: rule__AndOperation__Group__0 : rule__AndOperation__Group__0__Impl rule__AndOperation__Group__1 ;
    public final void rule__AndOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3747:1: ( rule__AndOperation__Group__0__Impl rule__AndOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3748:2: rule__AndOperation__Group__0__Impl rule__AndOperation__Group__1
            {
            pushFollow(FOLLOW_rule__AndOperation__Group__0__Impl_in_rule__AndOperation__Group__07615);
            rule__AndOperation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AndOperation__Group__1_in_rule__AndOperation__Group__07618);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3755:1: rule__AndOperation__Group__0__Impl : ( ruleUnaryOrNormalExpression ) ;
    public final void rule__AndOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3759:1: ( ( ruleUnaryOrNormalExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3760:1: ( ruleUnaryOrNormalExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3760:1: ( ruleUnaryOrNormalExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3761:1: ruleUnaryOrNormalExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getUnaryOrNormalExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleUnaryOrNormalExpression_in_rule__AndOperation__Group__0__Impl7645);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3772:1: rule__AndOperation__Group__1 : rule__AndOperation__Group__1__Impl ;
    public final void rule__AndOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3776:1: ( rule__AndOperation__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3777:2: rule__AndOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AndOperation__Group__1__Impl_in_rule__AndOperation__Group__17674);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3783:1: rule__AndOperation__Group__1__Impl : ( ( rule__AndOperation__Group_1__0 )* ) ;
    public final void rule__AndOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3787:1: ( ( ( rule__AndOperation__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3788:1: ( ( rule__AndOperation__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3788:1: ( ( rule__AndOperation__Group_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3789:1: ( rule__AndOperation__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3790:1: ( rule__AndOperation__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==17) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3790:2: rule__AndOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AndOperation__Group_1__0_in_rule__AndOperation__Group__1__Impl7701);
            	    rule__AndOperation__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3804:1: rule__AndOperation__Group_1__0 : rule__AndOperation__Group_1__0__Impl rule__AndOperation__Group_1__1 ;
    public final void rule__AndOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3808:1: ( rule__AndOperation__Group_1__0__Impl rule__AndOperation__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3809:2: rule__AndOperation__Group_1__0__Impl rule__AndOperation__Group_1__1
            {
            pushFollow(FOLLOW_rule__AndOperation__Group_1__0__Impl_in_rule__AndOperation__Group_1__07736);
            rule__AndOperation__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AndOperation__Group_1__1_in_rule__AndOperation__Group_1__07739);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3816:1: rule__AndOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__AndOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3820:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3821:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3821:1: ( () )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3822:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3823:1: ()
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3825:1: 
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3835:1: rule__AndOperation__Group_1__1 : rule__AndOperation__Group_1__1__Impl rule__AndOperation__Group_1__2 ;
    public final void rule__AndOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3839:1: ( rule__AndOperation__Group_1__1__Impl rule__AndOperation__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3840:2: rule__AndOperation__Group_1__1__Impl rule__AndOperation__Group_1__2
            {
            pushFollow(FOLLOW_rule__AndOperation__Group_1__1__Impl_in_rule__AndOperation__Group_1__17797);
            rule__AndOperation__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AndOperation__Group_1__2_in_rule__AndOperation__Group_1__17800);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3847:1: rule__AndOperation__Group_1__1__Impl : ( ( rule__AndOperation__OperatorAssignment_1_1 ) ) ;
    public final void rule__AndOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3851:1: ( ( ( rule__AndOperation__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3852:1: ( ( rule__AndOperation__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3852:1: ( ( rule__AndOperation__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3853:1: ( rule__AndOperation__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3854:1: ( rule__AndOperation__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3854:2: rule__AndOperation__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AndOperation__OperatorAssignment_1_1_in_rule__AndOperation__Group_1__1__Impl7827);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3864:1: rule__AndOperation__Group_1__2 : rule__AndOperation__Group_1__2__Impl ;
    public final void rule__AndOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3868:1: ( rule__AndOperation__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3869:2: rule__AndOperation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AndOperation__Group_1__2__Impl_in_rule__AndOperation__Group_1__27857);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3875:1: rule__AndOperation__Group_1__2__Impl : ( ( rule__AndOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__AndOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3879:1: ( ( ( rule__AndOperation__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3880:1: ( ( rule__AndOperation__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3880:1: ( ( rule__AndOperation__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3881:1: ( rule__AndOperation__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3882:1: ( rule__AndOperation__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3882:2: rule__AndOperation__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__AndOperation__SubExpressionsAssignment_1_2_in_rule__AndOperation__Group_1__2__Impl7884);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3898:1: rule__OrOperation__Group__0 : rule__OrOperation__Group__0__Impl rule__OrOperation__Group__1 ;
    public final void rule__OrOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3902:1: ( rule__OrOperation__Group__0__Impl rule__OrOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3903:2: rule__OrOperation__Group__0__Impl rule__OrOperation__Group__1
            {
            pushFollow(FOLLOW_rule__OrOperation__Group__0__Impl_in_rule__OrOperation__Group__07920);
            rule__OrOperation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__OrOperation__Group__1_in_rule__OrOperation__Group__07923);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3910:1: rule__OrOperation__Group__0__Impl : ( ruleAndOperation ) ;
    public final void rule__OrOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3914:1: ( ( ruleAndOperation ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3915:1: ( ruleAndOperation )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3915:1: ( ruleAndOperation )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3916:1: ruleAndOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getAndOperationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAndOperation_in_rule__OrOperation__Group__0__Impl7950);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3927:1: rule__OrOperation__Group__1 : rule__OrOperation__Group__1__Impl ;
    public final void rule__OrOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3931:1: ( rule__OrOperation__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3932:2: rule__OrOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OrOperation__Group__1__Impl_in_rule__OrOperation__Group__17979);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3938:1: rule__OrOperation__Group__1__Impl : ( ( rule__OrOperation__Group_1__0 )* ) ;
    public final void rule__OrOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3942:1: ( ( ( rule__OrOperation__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3943:1: ( ( rule__OrOperation__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3943:1: ( ( rule__OrOperation__Group_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3944:1: ( rule__OrOperation__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3945:1: ( rule__OrOperation__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==16) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3945:2: rule__OrOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__OrOperation__Group_1__0_in_rule__OrOperation__Group__1__Impl8006);
            	    rule__OrOperation__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3959:1: rule__OrOperation__Group_1__0 : rule__OrOperation__Group_1__0__Impl rule__OrOperation__Group_1__1 ;
    public final void rule__OrOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3963:1: ( rule__OrOperation__Group_1__0__Impl rule__OrOperation__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3964:2: rule__OrOperation__Group_1__0__Impl rule__OrOperation__Group_1__1
            {
            pushFollow(FOLLOW_rule__OrOperation__Group_1__0__Impl_in_rule__OrOperation__Group_1__08041);
            rule__OrOperation__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__OrOperation__Group_1__1_in_rule__OrOperation__Group_1__08044);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3971:1: rule__OrOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__OrOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3975:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3976:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3976:1: ( () )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3977:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3978:1: ()
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3980:1: 
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3990:1: rule__OrOperation__Group_1__1 : rule__OrOperation__Group_1__1__Impl rule__OrOperation__Group_1__2 ;
    public final void rule__OrOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3994:1: ( rule__OrOperation__Group_1__1__Impl rule__OrOperation__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:3995:2: rule__OrOperation__Group_1__1__Impl rule__OrOperation__Group_1__2
            {
            pushFollow(FOLLOW_rule__OrOperation__Group_1__1__Impl_in_rule__OrOperation__Group_1__18102);
            rule__OrOperation__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__OrOperation__Group_1__2_in_rule__OrOperation__Group_1__18105);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4002:1: rule__OrOperation__Group_1__1__Impl : ( ( rule__OrOperation__OperatorAssignment_1_1 ) ) ;
    public final void rule__OrOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4006:1: ( ( ( rule__OrOperation__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4007:1: ( ( rule__OrOperation__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4007:1: ( ( rule__OrOperation__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4008:1: ( rule__OrOperation__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4009:1: ( rule__OrOperation__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4009:2: rule__OrOperation__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__OrOperation__OperatorAssignment_1_1_in_rule__OrOperation__Group_1__1__Impl8132);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4019:1: rule__OrOperation__Group_1__2 : rule__OrOperation__Group_1__2__Impl ;
    public final void rule__OrOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4023:1: ( rule__OrOperation__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4024:2: rule__OrOperation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__OrOperation__Group_1__2__Impl_in_rule__OrOperation__Group_1__28162);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4030:1: rule__OrOperation__Group_1__2__Impl : ( ( rule__OrOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__OrOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4034:1: ( ( ( rule__OrOperation__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4035:1: ( ( rule__OrOperation__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4035:1: ( ( rule__OrOperation__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4036:1: ( rule__OrOperation__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4037:1: ( rule__OrOperation__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4037:2: rule__OrOperation__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__OrOperation__SubExpressionsAssignment_1_2_in_rule__OrOperation__Group_1__2__Impl8189);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4053:1: rule__ParanthesedBooleanExpression__Group_5__0 : rule__ParanthesedBooleanExpression__Group_5__0__Impl rule__ParanthesedBooleanExpression__Group_5__1 ;
    public final void rule__ParanthesedBooleanExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4057:1: ( rule__ParanthesedBooleanExpression__Group_5__0__Impl rule__ParanthesedBooleanExpression__Group_5__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4058:2: rule__ParanthesedBooleanExpression__Group_5__0__Impl rule__ParanthesedBooleanExpression__Group_5__1
            {
            pushFollow(FOLLOW_rule__ParanthesedBooleanExpression__Group_5__0__Impl_in_rule__ParanthesedBooleanExpression__Group_5__08225);
            rule__ParanthesedBooleanExpression__Group_5__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__ParanthesedBooleanExpression__Group_5__1_in_rule__ParanthesedBooleanExpression__Group_5__08228);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4065:1: rule__ParanthesedBooleanExpression__Group_5__0__Impl : ( '(' ) ;
    public final void rule__ParanthesedBooleanExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4069:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4070:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4070:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4071:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedBooleanExpressionAccess().getLeftParenthesisKeyword_5_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__ParanthesedBooleanExpression__Group_5__0__Impl8256); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4084:1: rule__ParanthesedBooleanExpression__Group_5__1 : rule__ParanthesedBooleanExpression__Group_5__1__Impl rule__ParanthesedBooleanExpression__Group_5__2 ;
    public final void rule__ParanthesedBooleanExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4088:1: ( rule__ParanthesedBooleanExpression__Group_5__1__Impl rule__ParanthesedBooleanExpression__Group_5__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4089:2: rule__ParanthesedBooleanExpression__Group_5__1__Impl rule__ParanthesedBooleanExpression__Group_5__2
            {
            pushFollow(FOLLOW_rule__ParanthesedBooleanExpression__Group_5__1__Impl_in_rule__ParanthesedBooleanExpression__Group_5__18287);
            rule__ParanthesedBooleanExpression__Group_5__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__ParanthesedBooleanExpression__Group_5__2_in_rule__ParanthesedBooleanExpression__Group_5__18290);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4096:1: rule__ParanthesedBooleanExpression__Group_5__1__Impl : ( ruleOrOperation ) ;
    public final void rule__ParanthesedBooleanExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4100:1: ( ( ruleOrOperation ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4101:1: ( ruleOrOperation )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4101:1: ( ruleOrOperation )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4102:1: ruleOrOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedBooleanExpressionAccess().getOrOperationParserRuleCall_5_1()); 
            }
            pushFollow(FOLLOW_ruleOrOperation_in_rule__ParanthesedBooleanExpression__Group_5__1__Impl8317);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4113:1: rule__ParanthesedBooleanExpression__Group_5__2 : rule__ParanthesedBooleanExpression__Group_5__2__Impl ;
    public final void rule__ParanthesedBooleanExpression__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4117:1: ( rule__ParanthesedBooleanExpression__Group_5__2__Impl )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4118:2: rule__ParanthesedBooleanExpression__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__ParanthesedBooleanExpression__Group_5__2__Impl_in_rule__ParanthesedBooleanExpression__Group_5__28346);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4124:1: rule__ParanthesedBooleanExpression__Group_5__2__Impl : ( ')' ) ;
    public final void rule__ParanthesedBooleanExpression__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4128:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4129:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4129:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4130:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedBooleanExpressionAccess().getRightParenthesisKeyword_5_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__ParanthesedBooleanExpression__Group_5__2__Impl8374); if (failed) return ;
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


    // $ANTLR start rule__HostCode__Group__0
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4149:1: rule__HostCode__Group__0 : rule__HostCode__Group__0__Impl rule__HostCode__Group__1 ;
    public final void rule__HostCode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4153:1: ( rule__HostCode__Group__0__Impl rule__HostCode__Group__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4154:2: rule__HostCode__Group__0__Impl rule__HostCode__Group__1
            {
            pushFollow(FOLLOW_rule__HostCode__Group__0__Impl_in_rule__HostCode__Group__08411);
            rule__HostCode__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__HostCode__Group__1_in_rule__HostCode__Group__08414);
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


    // $ANTLR start rule__HostCode__Group__0__Impl
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4161:1: rule__HostCode__Group__0__Impl : ( ( rule__HostCode__CodeAssignment_0 ) ) ;
    public final void rule__HostCode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4165:1: ( ( ( rule__HostCode__CodeAssignment_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4166:1: ( ( rule__HostCode__CodeAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4166:1: ( ( rule__HostCode__CodeAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4167:1: ( rule__HostCode__CodeAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getHostCodeAccess().getCodeAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4168:1: ( rule__HostCode__CodeAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4168:2: rule__HostCode__CodeAssignment_0
            {
            pushFollow(FOLLOW_rule__HostCode__CodeAssignment_0_in_rule__HostCode__Group__0__Impl8441);
            rule__HostCode__CodeAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getHostCodeAccess().getCodeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HostCode__Group__0__Impl


    // $ANTLR start rule__HostCode__Group__1
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4178:1: rule__HostCode__Group__1 : rule__HostCode__Group__1__Impl ;
    public final void rule__HostCode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4182:1: ( rule__HostCode__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4183:2: rule__HostCode__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__HostCode__Group__1__Impl_in_rule__HostCode__Group__18471);
            rule__HostCode__Group__1__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
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


    // $ANTLR start rule__HostCode__Group__1__Impl
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4189:1: rule__HostCode__Group__1__Impl : ( ( rule__HostCode__Group_1__0 )? ) ;
    public final void rule__HostCode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4193:1: ( ( ( rule__HostCode__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4194:1: ( ( rule__HostCode__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4194:1: ( ( rule__HostCode__Group_1__0 )? )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4195:1: ( rule__HostCode__Group_1__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getHostCodeAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4196:1: ( rule__HostCode__Group_1__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==30) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==RULE_ID) ) {
                    int LA32_3 = input.LA(3);

                    if ( (LA32_3==31) ) {
                        int LA32_4 = input.LA(4);

                        if ( (synpred47()) ) {
                            alt32=1;
                        }
                    }
                }
            }
            switch (alt32) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4196:2: rule__HostCode__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__HostCode__Group_1__0_in_rule__HostCode__Group__1__Impl8498);
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
    // $ANTLR end rule__HostCode__Group__1__Impl


    // $ANTLR start rule__HostCode__Group_1__0
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4210:1: rule__HostCode__Group_1__0 : rule__HostCode__Group_1__0__Impl rule__HostCode__Group_1__1 ;
    public final void rule__HostCode__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4214:1: ( rule__HostCode__Group_1__0__Impl rule__HostCode__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4215:2: rule__HostCode__Group_1__0__Impl rule__HostCode__Group_1__1
            {
            pushFollow(FOLLOW_rule__HostCode__Group_1__0__Impl_in_rule__HostCode__Group_1__08533);
            rule__HostCode__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__HostCode__Group_1__1_in_rule__HostCode__Group_1__08536);
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


    // $ANTLR start rule__HostCode__Group_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4222:1: rule__HostCode__Group_1__0__Impl : ( '(' ) ;
    public final void rule__HostCode__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4226:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4227:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4227:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4228:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getHostCodeAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__HostCode__Group_1__0__Impl8564); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getHostCodeAccess().getLeftParenthesisKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HostCode__Group_1__0__Impl


    // $ANTLR start rule__HostCode__Group_1__1
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4241:1: rule__HostCode__Group_1__1 : rule__HostCode__Group_1__1__Impl rule__HostCode__Group_1__2 ;
    public final void rule__HostCode__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4245:1: ( rule__HostCode__Group_1__1__Impl rule__HostCode__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4246:2: rule__HostCode__Group_1__1__Impl rule__HostCode__Group_1__2
            {
            pushFollow(FOLLOW_rule__HostCode__Group_1__1__Impl_in_rule__HostCode__Group_1__18595);
            rule__HostCode__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__HostCode__Group_1__2_in_rule__HostCode__Group_1__18598);
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


    // $ANTLR start rule__HostCode__Group_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4253:1: rule__HostCode__Group_1__1__Impl : ( ( rule__HostCode__TypeAssignment_1_1 ) ) ;
    public final void rule__HostCode__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4257:1: ( ( ( rule__HostCode__TypeAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4258:1: ( ( rule__HostCode__TypeAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4258:1: ( ( rule__HostCode__TypeAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4259:1: ( rule__HostCode__TypeAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getHostCodeAccess().getTypeAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4260:1: ( rule__HostCode__TypeAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4260:2: rule__HostCode__TypeAssignment_1_1
            {
            pushFollow(FOLLOW_rule__HostCode__TypeAssignment_1_1_in_rule__HostCode__Group_1__1__Impl8625);
            rule__HostCode__TypeAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getHostCodeAccess().getTypeAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HostCode__Group_1__1__Impl


    // $ANTLR start rule__HostCode__Group_1__2
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4270:1: rule__HostCode__Group_1__2 : rule__HostCode__Group_1__2__Impl ;
    public final void rule__HostCode__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4274:1: ( rule__HostCode__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4275:2: rule__HostCode__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__HostCode__Group_1__2__Impl_in_rule__HostCode__Group_1__28655);
            rule__HostCode__Group_1__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
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


    // $ANTLR start rule__HostCode__Group_1__2__Impl
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4281:1: rule__HostCode__Group_1__2__Impl : ( ')' ) ;
    public final void rule__HostCode__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4285:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4286:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4286:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4287:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getHostCodeAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__HostCode__Group_1__2__Impl8683); if (failed) return ;
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
    // $ANTLR end rule__HostCode__Group_1__2__Impl


    // $ANTLR start rule__Action__IsImmediateAssignment_0
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4307:1: rule__Action__IsImmediateAssignment_0 : ( ( '#' ) ) ;
    public final void rule__Action__IsImmediateAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4311:1: ( ( ( '#' ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4312:1: ( ( '#' ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4312:1: ( ( '#' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4313:1: ( '#' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getIsImmediateNumberSignKeyword_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4314:1: ( '#' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4315:1: '#'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getIsImmediateNumberSignKeyword_0_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__Action__IsImmediateAssignment_08730); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4330:1: rule__Action__DelayAssignment_1 : ( RULE_INT ) ;
    public final void rule__Action__DelayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4334:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4335:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4335:1: ( RULE_INT )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4336:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getDelayINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Action__DelayAssignment_18769); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4345:1: rule__Action__TriggerAssignment_2 : ( ruleBooleanExpression ) ;
    public final void rule__Action__TriggerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4349:1: ( ( ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4350:1: ( ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4350:1: ( ruleBooleanExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4351:1: ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getTriggerBooleanExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_rule__Action__TriggerAssignment_28800);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4360:1: rule__Action__EffectsAssignment_3_1_0 : ( ruleEffect ) ;
    public final void rule__Action__EffectsAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4364:1: ( ( ruleEffect ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4365:1: ( ruleEffect )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4365:1: ( ruleEffect )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4366:1: ruleEffect
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getEffectsEffectParserRuleCall_3_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleEffect_in_rule__Action__EffectsAssignment_3_1_08831);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4375:1: rule__Emission__SignalAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Emission__SignalAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4379:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4380:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4380:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4381:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getSignalSignalCrossReference_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4382:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4383:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getSignalSignalIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Emission__SignalAssignment_08866); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4394:1: rule__Emission__NewValueAssignment_1_0_1 : ( ruleValueExpression ) ;
    public final void rule__Emission__NewValueAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4398:1: ( ( ruleValueExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4399:1: ( ruleValueExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4399:1: ( ruleValueExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4400:1: ruleValueExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getNewValueValueExpressionParserRuleCall_1_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleValueExpression_in_rule__Emission__NewValueAssignment_1_0_18901);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4409:1: rule__Emission__NewValueAssignment_1_1_1 : ( ruleBooleanExpression ) ;
    public final void rule__Emission__NewValueAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4413:1: ( ( ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4414:1: ( ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4414:1: ( ruleBooleanExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4415:1: ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getNewValueBooleanExpressionParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_rule__Emission__NewValueAssignment_1_1_18932);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4424:1: rule__Assignment__VariableAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Assignment__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4428:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4429:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4429:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4430:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariableVariableCrossReference_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4431:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4432:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariableVariableIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Assignment__VariableAssignment_08967); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4443:1: rule__Assignment__ExpressionAssignment_2_0 : ( ruleValueExpression ) ;
    public final void rule__Assignment__ExpressionAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4447:1: ( ( ruleValueExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4448:1: ( ruleValueExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4448:1: ( ruleValueExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4449:1: ruleValueExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getExpressionValueExpressionParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleValueExpression_in_rule__Assignment__ExpressionAssignment_2_09002);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4458:1: rule__Assignment__ExpressionAssignment_2_1 : ( ruleBooleanExpression ) ;
    public final void rule__Assignment__ExpressionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4462:1: ( ( ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4463:1: ( ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4463:1: ( ruleBooleanExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4464:1: ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getExpressionBooleanExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_rule__Assignment__ExpressionAssignment_2_19033);
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


    // $ANTLR start rule__SignalReference__SignalAssignment_0
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4473:1: rule__SignalReference__SignalAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SignalReference__SignalAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4477:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4478:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4478:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4479:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getSignalSignalCrossReference_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4480:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4481:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getSignalSignalIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SignalReference__SignalAssignment_09068); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4492:1: rule__SignalReference__SubExpressionsAssignment_1_1_0 : ( ruleExpression ) ;
    public final void rule__SignalReference__SubExpressionsAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4496:1: ( ( ruleExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4497:1: ( ruleExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4497:1: ( ruleExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4498:1: ruleExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getSubExpressionsExpressionParserRuleCall_1_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__SignalReference__SubExpressionsAssignment_1_1_09103);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4507:1: rule__VariableReference__VariableAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__VariableReference__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4511:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4512:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4512:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4513:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getVariableVariableCrossReference_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4514:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4515:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getVariableVariableIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableReference__VariableAssignment_09138); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4526:1: rule__VariableReference__SubExpressionsAssignment_1_1_0 : ( ruleExpression ) ;
    public final void rule__VariableReference__SubExpressionsAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4530:1: ( ( ruleExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4531:1: ( ruleExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4531:1: ( ruleExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4532:1: ruleExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getSubExpressionsExpressionParserRuleCall_1_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__VariableReference__SubExpressionsAssignment_1_1_09173);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4543:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4547:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4548:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4548:1: ( RULE_INT )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4549:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment9206); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4558:1: rule__FloatValue__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4562:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4563:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4563:1: ( RULE_FLOAT )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4564:1: RULE_FLOAT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueFloatTerminalRuleCall_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__FloatValue__ValueAssignment9237); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4573:1: rule__BooleanValue__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4577:1: ( ( RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4578:1: ( RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4578:1: ( RULE_BOOLEAN )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4579:1: RULE_BOOLEAN
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueBooleanTerminalRuleCall_0()); 
            }
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__BooleanValue__ValueAssignment9268); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4588:1: rule__ValOperation__OperatorAssignment_0 : ( ruleValOperator ) ;
    public final void rule__ValOperation__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4592:1: ( ( ruleValOperator ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4593:1: ( ruleValOperator )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4593:1: ( ruleValOperator )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4594:1: ruleValOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValOperationAccess().getOperatorValOperatorEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleValOperator_in_rule__ValOperation__OperatorAssignment_09299);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4603:1: rule__ValOperation__SubExpressionsAssignment_1 : ( ruleSignalReference ) ;
    public final void rule__ValOperation__SubExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4607:1: ( ( ruleSignalReference ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4608:1: ( ruleSignalReference )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4608:1: ( ruleSignalReference )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4609:1: ruleSignalReference
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValOperationAccess().getSubExpressionsSignalReferenceParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleSignalReference_in_rule__ValOperation__SubExpressionsAssignment_19330);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4618:1: rule__PlusOperation__OperatorAssignment_1_1 : ( rulePlusOperator ) ;
    public final void rule__PlusOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4622:1: ( ( rulePlusOperator ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4623:1: ( rulePlusOperator )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4623:1: ( rulePlusOperator )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4624:1: rulePlusOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getOperatorPlusOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_rulePlusOperator_in_rule__PlusOperation__OperatorAssignment_1_19361);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4633:1: rule__PlusOperation__SubExpressionsAssignment_1_2 : ( ruleMultOrDivOperation ) ;
    public final void rule__PlusOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4637:1: ( ( ruleMultOrDivOperation ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4638:1: ( ruleMultOrDivOperation )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4638:1: ( ruleMultOrDivOperation )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4639:1: ruleMultOrDivOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getSubExpressionsMultOrDivOperationParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleMultOrDivOperation_in_rule__PlusOperation__SubExpressionsAssignment_1_29392);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4648:1: rule__MultOperation__OperatorAssignment_1_1 : ( ruleMultOperator ) ;
    public final void rule__MultOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4652:1: ( ( ruleMultOperator ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4653:1: ( ruleMultOperator )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4653:1: ( ruleMultOperator )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4654:1: ruleMultOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getOperatorMultOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleMultOperator_in_rule__MultOperation__OperatorAssignment_1_19423);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4663:1: rule__MultOperation__SubExpressionsAssignment_1_2 : ( rulePreOrNormalValueExpression ) ;
    public final void rule__MultOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4667:1: ( ( rulePreOrNormalValueExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4668:1: ( rulePreOrNormalValueExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4668:1: ( rulePreOrNormalValueExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4669:1: rulePreOrNormalValueExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getSubExpressionsPreOrNormalValueExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_rulePreOrNormalValueExpression_in_rule__MultOperation__SubExpressionsAssignment_1_29454);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4678:1: rule__DivOperation__OperatorAssignment_1_1 : ( ruleDivOperator ) ;
    public final void rule__DivOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4682:1: ( ( ruleDivOperator ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4683:1: ( ruleDivOperator )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4683:1: ( ruleDivOperator )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4684:1: ruleDivOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getOperatorDivOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleDivOperator_in_rule__DivOperation__OperatorAssignment_1_19485);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4693:1: rule__DivOperation__SubExpressionsAssignment_1_2 : ( rulePreOrNormalValueExpression ) ;
    public final void rule__DivOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4697:1: ( ( rulePreOrNormalValueExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4698:1: ( rulePreOrNormalValueExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4698:1: ( rulePreOrNormalValueExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4699:1: rulePreOrNormalValueExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getSubExpressionsPreOrNormalValueExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_rulePreOrNormalValueExpression_in_rule__DivOperation__SubExpressionsAssignment_1_29516);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4708:1: rule__PreArithmOperation__OperatorAssignment_0 : ( ruleUnaryParanthesedOperator ) ;
    public final void rule__PreArithmOperation__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4712:1: ( ( ruleUnaryParanthesedOperator ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4713:1: ( ruleUnaryParanthesedOperator )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4713:1: ( ruleUnaryParanthesedOperator )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4714:1: ruleUnaryParanthesedOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreArithmOperationAccess().getOperatorUnaryParanthesedOperatorEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleUnaryParanthesedOperator_in_rule__PreArithmOperation__OperatorAssignment_09547);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4723:1: rule__PreArithmOperation__SubExpressionsAssignment_2 : ( ruleValOperation ) ;
    public final void rule__PreArithmOperation__SubExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4727:1: ( ( ruleValOperation ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4728:1: ( ruleValOperation )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4728:1: ( ruleValOperation )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4729:1: ruleValOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreArithmOperationAccess().getSubExpressionsValOperationParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleValOperation_in_rule__PreArithmOperation__SubExpressionsAssignment_29578);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4738:1: rule__CompareOperation__OperatorAssignment_1_1 : ( ruleCompareOperator ) ;
    public final void rule__CompareOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4742:1: ( ( ruleCompareOperator ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4743:1: ( ruleCompareOperator )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4743:1: ( ruleCompareOperator )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4744:1: ruleCompareOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleCompareOperator_in_rule__CompareOperation__OperatorAssignment_1_19609);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4753:1: rule__CompareOperation__SubExpressionsAssignment_1_2 : ( ruleValueExpression ) ;
    public final void rule__CompareOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4757:1: ( ( ruleValueExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4758:1: ( ruleValueExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4758:1: ( ruleValueExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4759:1: ruleValueExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsValueExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleValueExpression_in_rule__CompareOperation__SubExpressionsAssignment_1_29640);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4768:1: rule__UnaryOperation__OperatorAssignment_0 : ( ruleUnaryOperator ) ;
    public final void rule__UnaryOperation__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4772:1: ( ( ruleUnaryOperator ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4773:1: ( ruleUnaryOperator )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4773:1: ( ruleUnaryOperator )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4774:1: ruleUnaryOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getOperatorUnaryOperatorEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleUnaryOperator_in_rule__UnaryOperation__OperatorAssignment_09671);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4783:1: rule__UnaryOperation__SubExpressionsAssignment_1 : ( ( rule__UnaryOperation__SubExpressionsAlternatives_1_0 ) ) ;
    public final void rule__UnaryOperation__SubExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4787:1: ( ( ( rule__UnaryOperation__SubExpressionsAlternatives_1_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4788:1: ( ( rule__UnaryOperation__SubExpressionsAlternatives_1_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4788:1: ( ( rule__UnaryOperation__SubExpressionsAlternatives_1_0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4789:1: ( rule__UnaryOperation__SubExpressionsAlternatives_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getSubExpressionsAlternatives_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4790:1: ( rule__UnaryOperation__SubExpressionsAlternatives_1_0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4790:2: rule__UnaryOperation__SubExpressionsAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__UnaryOperation__SubExpressionsAlternatives_1_0_in_rule__UnaryOperation__SubExpressionsAssignment_19702);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4799:1: rule__UnaryParanthesedOperation__OperatorAssignment_0 : ( ruleUnaryParanthesedOperator ) ;
    public final void rule__UnaryParanthesedOperation__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4803:1: ( ( ruleUnaryParanthesedOperator ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4804:1: ( ruleUnaryParanthesedOperator )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4804:1: ( ruleUnaryParanthesedOperator )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4805:1: ruleUnaryParanthesedOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperationAccess().getOperatorUnaryParanthesedOperatorEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleUnaryParanthesedOperator_in_rule__UnaryParanthesedOperation__OperatorAssignment_09735);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4814:1: rule__UnaryParanthesedOperation__SubExpressionsAssignment_2 : ( ruleBooleanExpression ) ;
    public final void rule__UnaryParanthesedOperation__SubExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4818:1: ( ( ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4819:1: ( ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4819:1: ( ruleBooleanExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4820:1: ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperationAccess().getSubExpressionsBooleanExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_rule__UnaryParanthesedOperation__SubExpressionsAssignment_29766);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4829:1: rule__AndOperation__OperatorAssignment_1_1 : ( ruleOperatorAnd ) ;
    public final void rule__AndOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4833:1: ( ( ruleOperatorAnd ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4834:1: ( ruleOperatorAnd )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4834:1: ( ruleOperatorAnd )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4835:1: ruleOperatorAnd
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getOperatorOperatorAndEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleOperatorAnd_in_rule__AndOperation__OperatorAssignment_1_19797);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4844:1: rule__AndOperation__SubExpressionsAssignment_1_2 : ( ruleUnaryOrNormalExpression ) ;
    public final void rule__AndOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4848:1: ( ( ruleUnaryOrNormalExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4849:1: ( ruleUnaryOrNormalExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4849:1: ( ruleUnaryOrNormalExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4850:1: ruleUnaryOrNormalExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getSubExpressionsUnaryOrNormalExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleUnaryOrNormalExpression_in_rule__AndOperation__SubExpressionsAssignment_1_29828);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4859:1: rule__OrOperation__OperatorAssignment_1_1 : ( ruleOperatorOr ) ;
    public final void rule__OrOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4863:1: ( ( ruleOperatorOr ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4864:1: ( ruleOperatorOr )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4864:1: ( ruleOperatorOr )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4865:1: ruleOperatorOr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getOperatorOperatorOrEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleOperatorOr_in_rule__OrOperation__OperatorAssignment_1_19859);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4874:1: rule__OrOperation__SubExpressionsAssignment_1_2 : ( ruleAndOperation ) ;
    public final void rule__OrOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4878:1: ( ( ruleAndOperation ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4879:1: ( ruleAndOperation )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4879:1: ( ruleAndOperation )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4880:1: ruleAndOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getSubExpressionsAndOperationParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleAndOperation_in_rule__OrOperation__SubExpressionsAssignment_1_29890);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4889:1: rule__HostCode__CodeAssignment_0 : ( RULE_STRING ) ;
    public final void rule__HostCode__CodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4893:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4894:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4894:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4895:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getHostCodeAccess().getCodeSTRINGTerminalRuleCall_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__HostCode__CodeAssignment_09921); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4904:1: rule__HostCode__TypeAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__HostCode__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4908:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4909:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4909:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4910:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getHostCodeAccess().getTypeIDTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HostCode__TypeAssignment_1_19952); if (failed) return ;
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
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1066:1: ( ( ( rule__Emission__Group_1_0__0 ) ) )
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1066:1: ( ( rule__Emission__Group_1_0__0 ) )
        {
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1066:1: ( ( rule__Emission__Group_1_0__0 ) )
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1067:1: ( rule__Emission__Group_1_0__0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getEmissionAccess().getGroup_1_0()); 
        }
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1068:1: ( rule__Emission__Group_1_0__0 )
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1068:2: rule__Emission__Group_1_0__0
        {
        pushFollow(FOLLOW_rule__Emission__Group_1_0__0_in_synpred32172);
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
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1088:1: ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) )
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1088:1: ( ( rule__Assignment__ExpressionAssignment_2_0 ) )
        {
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1088:1: ( ( rule__Assignment__ExpressionAssignment_2_0 ) )
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1089:1: ( rule__Assignment__ExpressionAssignment_2_0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getAssignmentAccess().getExpressionAssignment_2_0()); 
        }
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1090:1: ( rule__Assignment__ExpressionAssignment_2_0 )
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1090:2: rule__Assignment__ExpressionAssignment_2_0
        {
        pushFollow(FOLLOW_rule__Assignment__ExpressionAssignment_2_0_in_synpred42223);
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
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1141:6: ( ( ( rule__ParanthesedValueExpression__Group_5__0 ) ) )
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1141:6: ( ( rule__ParanthesedValueExpression__Group_5__0 ) )
        {
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1141:6: ( ( rule__ParanthesedValueExpression__Group_5__0 ) )
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1142:1: ( rule__ParanthesedValueExpression__Group_5__0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getParanthesedValueExpressionAccess().getGroup_5()); 
        }
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1143:1: ( rule__ParanthesedValueExpression__Group_5__0 )
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1143:2: rule__ParanthesedValueExpression__Group_5__0
        {
        pushFollow(FOLLOW_rule__ParanthesedValueExpression__Group_5__0_in_synpred102360);
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
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1163:1: ( ( ruleMultOperation ) )
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1163:1: ( ruleMultOperation )
        {
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1163:1: ( ruleMultOperation )
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1164:1: ruleMultOperation
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getMultOrDivOperationAccess().getMultOperationParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_ruleMultOperation_in_synpred112411);
        ruleMultOperation();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred11

    // $ANTLR start synpred13
    public final void synpred13_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1207:1: ( ( ruleParanthesedBooleanExpression ) )
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1207:1: ( ruleParanthesedBooleanExpression )
        {
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1207:1: ( ruleParanthesedBooleanExpression )
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1208:1: ruleParanthesedBooleanExpression
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getUnaryOperationAccess().getSubExpressionsParanthesedBooleanExpressionParserRuleCall_1_0_0()); 
        }
        pushFollow(FOLLOW_ruleParanthesedBooleanExpression_in_synpred132510);
        ruleParanthesedBooleanExpression();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred13

    // $ANTLR start synpred15
    public final void synpred15_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1235:6: ( ( ruleUnaryParanthesedOperation ) )
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1235:6: ( ruleUnaryParanthesedOperation )
        {
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1235:6: ( ruleUnaryParanthesedOperation )
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1236:1: ruleUnaryParanthesedOperation
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getUnaryOrNormalExpressionAccess().getUnaryParanthesedOperationParserRuleCall_1()); 
        }
        pushFollow(FOLLOW_ruleUnaryParanthesedOperation_in_synpred152576);
        ruleUnaryParanthesedOperation();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred15

    // $ANTLR start synpred17
    public final void synpred17_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1263:6: ( ( ruleCompareOperation ) )
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1263:6: ( ruleCompareOperation )
        {
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1263:6: ( ruleCompareOperation )
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1264:1: ruleCompareOperation
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getParanthesedBooleanExpressionAccess().getCompareOperationParserRuleCall_1()); 
        }
        pushFollow(FOLLOW_ruleCompareOperation_in_synpred172642);
        ruleCompareOperation();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred17

    // $ANTLR start synpred18
    public final void synpred18_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1269:6: ( ( ruleSignalReference ) )
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1269:6: ( ruleSignalReference )
        {
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1269:6: ( ruleSignalReference )
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1270:1: ruleSignalReference
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getParanthesedBooleanExpressionAccess().getSignalReferenceParserRuleCall_2()); 
        }
        pushFollow(FOLLOW_ruleSignalReference_in_synpred182659);
        ruleSignalReference();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred18

    // $ANTLR start synpred19
    public final void synpred19_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1275:6: ( ( ruleValOperation ) )
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1275:6: ( ruleValOperation )
        {
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1275:6: ( ruleValOperation )
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1276:1: ruleValOperation
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getParanthesedBooleanExpressionAccess().getValOperationParserRuleCall_3()); 
        }
        pushFollow(FOLLOW_ruleValOperation_in_synpred192676);
        ruleValOperation();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred19

    // $ANTLR start synpred20
    public final void synpred20_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1281:6: ( ( ruleHostCode ) )
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1281:6: ( ruleHostCode )
        {
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1281:6: ( ruleHostCode )
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1282:1: ruleHostCode
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getParanthesedBooleanExpressionAccess().getHostCodeParserRuleCall_4()); 
        }
        pushFollow(FOLLOW_ruleHostCode_in_synpred202693);
        ruleHostCode();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred20

    // $ANTLR start synpred21
    public final void synpred21_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1303:1: ( ( ruleValueExpression ) )
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1303:1: ( ruleValueExpression )
        {
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1303:1: ( ruleValueExpression )
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:1304:1: ruleValueExpression
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getExpressionAccess().getValueExpressionParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_ruleValueExpression_in_synpred212743);
        ruleValueExpression();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred21

    // $ANTLR start synpred36
    public final void synpred36_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2066:2: ( rule__SignalReference__Group_1__0 )
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2066:2: rule__SignalReference__Group_1__0
        {
        pushFollow(FOLLOW_rule__SignalReference__Group_1__0_in_synpred364313);
        rule__SignalReference__Group_1__0();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred36

    // $ANTLR start synpred39
    public final void synpred39_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2286:2: ( rule__VariableReference__Group_1__0 )
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:2286:2: rule__VariableReference__Group_1__0
        {
        pushFollow(FOLLOW_rule__VariableReference__Group_1__0_in_synpred394749);
        rule__VariableReference__Group_1__0();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred39

    // $ANTLR start synpred47
    public final void synpred47_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4196:2: ( rule__HostCode__Group_1__0 )
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/ui/contentassist/antlr/internal/InternalActionLabel.g:4196:2: rule__HostCode__Group_1__0
        {
        pushFollow(FOLLOW_rule__HostCode__Group_1__0_in_synpred478498);
        rule__HostCode__Group_1__0();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred47

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
    public final boolean synpred47() {
        backtracking++;
        int start = input.mark();
        try {
            synpred47_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_ruleSignalReference_in_entryRuleSignalReference307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalReference314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignalReference__Group__0_in_ruleSignalReference340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__Group__0_in_ruleVariableReference400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue551 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanValue__ValueAssignment_in_ruleBooleanValue584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperation_in_entryRuleValOperation613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValOperation620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValOperation__Group__0_in_ruleValOperation646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_entryRuleValueExpression673 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueExpression680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOperation_in_ruleValueExpression706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParanthesedValueExpression_in_entryRuleParanthesedValueExpression732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParanthesedValueExpression739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanthesedValueExpression__Alternatives_in_ruleParanthesedValueExpression765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOperation_in_entryRulePlusOperation792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlusOperation799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOperation__Group__0_in_rulePlusOperation825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOrDivOperation_in_entryRuleMultOrDivOperation852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultOrDivOperation859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultOrDivOperation__Alternatives_in_ruleMultOrDivOperation885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOperation_in_entryRuleMultOperation912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultOperation919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultOperation__Group__0_in_ruleMultOperation945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivOperation_in_entryRuleDivOperation972 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivOperation979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivOperation__Group__0_in_ruleDivOperation1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreArithmOperation_in_entryRulePreArithmOperation1032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreArithmOperation1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreArithmOperation__Group__0_in_rulePreArithmOperation1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOrNormalValueExpression_in_entryRulePreOrNormalValueExpression1092 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreOrNormalValueExpression1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreOrNormalValueExpression__Alternatives_in_rulePreOrNormalValueExpression1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation1152 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group__0_in_ruleCompareOperation1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation1212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOperation1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryOperation__Group__0_in_ruleUnaryOperation1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryParanthesedOperation_in_entryRuleUnaryParanthesedOperation1272 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryParanthesedOperation1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__Group__0_in_ruleUnaryParanthesedOperation1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOrNormalExpression_in_entryRuleUnaryOrNormalExpression1332 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOrNormalExpression1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryOrNormalExpression__Alternatives_in_ruleUnaryOrNormalExpression1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperation_in_entryRuleAndOperation1392 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndOperation1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndOperation__Group__0_in_ruleAndOperation1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrOperation_in_entryRuleOrOperation1452 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrOperation1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrOperation__Group__0_in_ruleOrOperation1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParanthesedBooleanExpression_in_entryRuleParanthesedBooleanExpression1512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParanthesedBooleanExpression1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanthesedBooleanExpression__Alternatives_in_ruleParanthesedBooleanExpression1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression1572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrOperation_in_ruleBooleanExpression1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostCode_in_entryRuleHostCode1631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHostCode1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HostCode__Group__0_in_ruleHostCode1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Alternatives_in_ruleExpression1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleValOperator1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperator__Alternatives_in_ruleCompareOperator1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleUnaryOperator1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleUnaryParanthesedOperator1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleOperatorOr1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOperatorAnd1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOperator__Alternatives_in_rulePlusOperator1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultOperator__Alternatives_in_ruleMultOperator2032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleDivOperator2069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_rule__Effect__Alternatives2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_rule__Effect__Alternatives2123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostCode_in_rule__Effect__Alternatives2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_0__0_in_rule__Emission__Alternatives_12172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_1__0_in_rule__Emission__Alternatives_12190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ExpressionAssignment_2_0_in_rule__Assignment__Alternatives_22223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ExpressionAssignment_2_1_in_rule__Assignment__Alternatives_22241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_rule__ParanthesedValueExpression__Alternatives2275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_rule__ParanthesedValueExpression__Alternatives2292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperation_in_rule__ParanthesedValueExpression__Alternatives2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_rule__ParanthesedValueExpression__Alternatives2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostCode_in_rule__ParanthesedValueExpression__Alternatives2343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanthesedValueExpression__Group_5__0_in_rule__ParanthesedValueExpression__Alternatives2360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanthesedValueExpression__Group_6__0_in_rule__ParanthesedValueExpression__Alternatives2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOperation_in_rule__MultOrDivOperation__Alternatives2411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultOrDivOperation__Group_1__0_in_rule__MultOrDivOperation__Alternatives2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreArithmOperation_in_rule__PreOrNormalValueExpression__Alternatives2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParanthesedValueExpression_in_rule__PreOrNormalValueExpression__Alternatives2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParanthesedBooleanExpression_in_rule__UnaryOperation__SubExpressionsAlternatives_1_02510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryParanthesedOperation_in_rule__UnaryOperation__SubExpressionsAlternatives_1_02527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperation_in_rule__UnaryOrNormalExpression__Alternatives2559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryParanthesedOperation_in_rule__UnaryOrNormalExpression__Alternatives2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParanthesedBooleanExpression_in_rule__UnaryOrNormalExpression__Alternatives2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_rule__ParanthesedBooleanExpression__Alternatives2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_rule__ParanthesedBooleanExpression__Alternatives2642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_rule__ParanthesedBooleanExpression__Alternatives2659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperation_in_rule__ParanthesedBooleanExpression__Alternatives2676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostCode_in_rule__ParanthesedBooleanExpression__Alternatives2693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanthesedBooleanExpression__Group_5__0_in_rule__ParanthesedBooleanExpression__Alternatives2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_rule__Expression__Alternatives2743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__Expression__Alternatives2760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CompareOperator__Alternatives2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__CompareOperator__Alternatives2815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__CompareOperator__Alternatives2836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__CompareOperator__Alternatives2857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CompareOperator__Alternatives2878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CompareOperator__Alternatives2899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__PlusOperator__Alternatives2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__PlusOperator__Alternatives2956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__MultOperator__Alternatives2992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__MultOperator__Alternatives3013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__03046 = new BitSet(new long[]{0x000000004004E1F2L});
    public static final BitSet FOLLOW_rule__Action__Group__1_in_rule__Action__Group__03049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__IsImmediateAssignment_0_in_rule__Action__Group__0__Impl3076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__13107 = new BitSet(new long[]{0x000000004004E1F2L});
    public static final BitSet FOLLOW_rule__Action__Group__2_in_rule__Action__Group__13110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__DelayAssignment_1_in_rule__Action__Group__1__Impl3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__2__Impl_in_rule__Action__Group__23168 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Action__Group__3_in_rule__Action__Group__23171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__TriggerAssignment_2_in_rule__Action__Group__2__Impl3198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__3__Impl_in_rule__Action__Group__33229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_3__0_in_rule__Action__Group__3__Impl3256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_3__0__Impl_in_rule__Action__Group_3__03295 = new BitSet(new long[]{0x0000000000000122L});
    public static final BitSet FOLLOW_rule__Action__Group_3__1_in_rule__Action__Group_3__03298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Action__Group_3__0__Impl3326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_3__1__Impl_in_rule__Action__Group_3__13357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_3_1__0_in_rule__Action__Group_3__1__Impl3384 = new BitSet(new long[]{0x0000000000000122L});
    public static final BitSet FOLLOW_rule__Action__Group_3_1__0__Impl_in_rule__Action__Group_3_1__03419 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Action__Group_3_1__1_in_rule__Action__Group_3_1__03422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__EffectsAssignment_3_1_0_in_rule__Action__Group_3_1__0__Impl3449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_3_1__1__Impl_in_rule__Action__Group_3_1__13479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Action__Group_3_1__1__Impl3508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group__0__Impl_in_rule__Emission__Group__03545 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Emission__Group__1_in_rule__Emission__Group__03548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__SignalAssignment_0_in_rule__Emission__Group__0__Impl3575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group__1__Impl_in_rule__Emission__Group__13605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Alternatives_1_in_rule__Emission__Group__1__Impl3632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_0__0__Impl_in_rule__Emission__Group_1_0__03667 = new BitSet(new long[]{0x000000004000A170L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_0__1_in_rule__Emission__Group_1_0__03670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Emission__Group_1_0__0__Impl3698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_0__1__Impl_in_rule__Emission__Group_1_0__13729 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_0__2_in_rule__Emission__Group_1_0__13732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__NewValueAssignment_1_0_1_in_rule__Emission__Group_1_0__1__Impl3759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_0__2__Impl_in_rule__Emission__Group_1_0__23789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Emission__Group_1_0__2__Impl3817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_1__0__Impl_in_rule__Emission__Group_1_1__03854 = new BitSet(new long[]{0x000000004000E1F0L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_1__1_in_rule__Emission__Group_1_1__03857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Emission__Group_1_1__0__Impl3885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_1__1__Impl_in_rule__Emission__Group_1_1__13916 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_1__2_in_rule__Emission__Group_1_1__13919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__NewValueAssignment_1_1_1_in_rule__Emission__Group_1_1__1__Impl3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_1__2__Impl_in_rule__Emission__Group_1_1__23976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Emission__Group_1_1__2__Impl4004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__04041 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__04044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__VariableAssignment_0_in_rule__Assignment__Group__0__Impl4071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__14101 = new BitSet(new long[]{0x000000004000E1F0L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__14104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Assignment__Group__1__Impl4132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__24163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Alternatives_2_in_rule__Assignment__Group__2__Impl4190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignalReference__Group__0__Impl_in_rule__SignalReference__Group__04226 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__SignalReference__Group__1_in_rule__SignalReference__Group__04229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignalReference__SignalAssignment_0_in_rule__SignalReference__Group__0__Impl4256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignalReference__Group__1__Impl_in_rule__SignalReference__Group__14286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignalReference__Group_1__0_in_rule__SignalReference__Group__1__Impl4313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignalReference__Group_1__0__Impl_in_rule__SignalReference__Group_1__04348 = new BitSet(new long[]{0x00000000C000E1F0L});
    public static final BitSet FOLLOW_rule__SignalReference__Group_1__1_in_rule__SignalReference__Group_1__04351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__SignalReference__Group_1__0__Impl4379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignalReference__Group_1__1__Impl_in_rule__SignalReference__Group_1__14410 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__SignalReference__Group_1__2_in_rule__SignalReference__Group_1__14413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignalReference__Group_1_1__0_in_rule__SignalReference__Group_1__1__Impl4440 = new BitSet(new long[]{0x000000004000E1F2L});
    public static final BitSet FOLLOW_rule__SignalReference__Group_1__2__Impl_in_rule__SignalReference__Group_1__24471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__SignalReference__Group_1__2__Impl4499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignalReference__Group_1_1__0__Impl_in_rule__SignalReference__Group_1_1__04536 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__SignalReference__Group_1_1__1_in_rule__SignalReference__Group_1_1__04539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignalReference__SubExpressionsAssignment_1_1_0_in_rule__SignalReference__Group_1_1__0__Impl4566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignalReference__Group_1_1__1__Impl_in_rule__SignalReference__Group_1_1__14596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__SignalReference__Group_1_1__1__Impl4625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__Group__0__Impl_in_rule__VariableReference__Group__04662 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__VariableReference__Group__1_in_rule__VariableReference__Group__04665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__VariableAssignment_0_in_rule__VariableReference__Group__0__Impl4692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__Group__1__Impl_in_rule__VariableReference__Group__14722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__Group_1__0_in_rule__VariableReference__Group__1__Impl4749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__Group_1__0__Impl_in_rule__VariableReference__Group_1__04784 = new BitSet(new long[]{0x00000000C000E1F0L});
    public static final BitSet FOLLOW_rule__VariableReference__Group_1__1_in_rule__VariableReference__Group_1__04787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__VariableReference__Group_1__0__Impl4815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__Group_1__1__Impl_in_rule__VariableReference__Group_1__14846 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__VariableReference__Group_1__2_in_rule__VariableReference__Group_1__14849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__Group_1_1__0_in_rule__VariableReference__Group_1__1__Impl4876 = new BitSet(new long[]{0x000000004000E1F2L});
    public static final BitSet FOLLOW_rule__VariableReference__Group_1__2__Impl_in_rule__VariableReference__Group_1__24907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__VariableReference__Group_1__2__Impl4935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__Group_1_1__0__Impl_in_rule__VariableReference__Group_1_1__04972 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__VariableReference__Group_1_1__1_in_rule__VariableReference__Group_1_1__04975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__SubExpressionsAssignment_1_1_0_in_rule__VariableReference__Group_1_1__0__Impl5002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__Group_1_1__1__Impl_in_rule__VariableReference__Group_1_1__15032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__VariableReference__Group_1_1__1__Impl5061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValOperation__Group__0__Impl_in_rule__ValOperation__Group__05098 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ValOperation__Group__1_in_rule__ValOperation__Group__05101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValOperation__OperatorAssignment_0_in_rule__ValOperation__Group__0__Impl5128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValOperation__Group__1__Impl_in_rule__ValOperation__Group__15158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValOperation__SubExpressionsAssignment_1_in_rule__ValOperation__Group__1__Impl5185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanthesedValueExpression__Group_5__0__Impl_in_rule__ParanthesedValueExpression__Group_5__05219 = new BitSet(new long[]{0x000000004000A170L});
    public static final BitSet FOLLOW_rule__ParanthesedValueExpression__Group_5__1_in_rule__ParanthesedValueExpression__Group_5__05222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ParanthesedValueExpression__Group_5__0__Impl5250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanthesedValueExpression__Group_5__1__Impl_in_rule__ParanthesedValueExpression__Group_5__15281 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ParanthesedValueExpression__Group_5__2_in_rule__ParanthesedValueExpression__Group_5__15284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOperation_in_rule__ParanthesedValueExpression__Group_5__1__Impl5311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanthesedValueExpression__Group_5__2__Impl_in_rule__ParanthesedValueExpression__Group_5__25340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ParanthesedValueExpression__Group_5__2__Impl5368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanthesedValueExpression__Group_6__0__Impl_in_rule__ParanthesedValueExpression__Group_6__05405 = new BitSet(new long[]{0x000000004000A170L});
    public static final BitSet FOLLOW_rule__ParanthesedValueExpression__Group_6__1_in_rule__ParanthesedValueExpression__Group_6__05408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ParanthesedValueExpression__Group_6__0__Impl5436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanthesedValueExpression__Group_6__1__Impl_in_rule__ParanthesedValueExpression__Group_6__15467 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ParanthesedValueExpression__Group_6__2_in_rule__ParanthesedValueExpression__Group_6__15470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivOperation_in_rule__ParanthesedValueExpression__Group_6__1__Impl5497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanthesedValueExpression__Group_6__2__Impl_in_rule__ParanthesedValueExpression__Group_6__25526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ParanthesedValueExpression__Group_6__2__Impl5554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOperation__Group__0__Impl_in_rule__PlusOperation__Group__05591 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_rule__PlusOperation__Group__1_in_rule__PlusOperation__Group__05594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOrDivOperation_in_rule__PlusOperation__Group__0__Impl5621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOperation__Group__1__Impl_in_rule__PlusOperation__Group__15650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOperation__Group_1__0_in_rule__PlusOperation__Group__1__Impl5677 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_rule__PlusOperation__Group_1__0__Impl_in_rule__PlusOperation__Group_1__05712 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__PlusOperation__Group_1__1_in_rule__PlusOperation__Group_1__05715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOperation__Group_1__1__Impl_in_rule__PlusOperation__Group_1__15773 = new BitSet(new long[]{0x000000004000A170L});
    public static final BitSet FOLLOW_rule__PlusOperation__Group_1__2_in_rule__PlusOperation__Group_1__15776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOperation__OperatorAssignment_1_1_in_rule__PlusOperation__Group_1__1__Impl5803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOperation__Group_1__2__Impl_in_rule__PlusOperation__Group_1__25833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOperation__SubExpressionsAssignment_1_2_in_rule__PlusOperation__Group_1__2__Impl5860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultOrDivOperation__Group_1__0__Impl_in_rule__MultOrDivOperation__Group_1__05896 = new BitSet(new long[]{0x000000004000A170L});
    public static final BitSet FOLLOW_rule__MultOrDivOperation__Group_1__1_in_rule__MultOrDivOperation__Group_1__05899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__MultOrDivOperation__Group_1__0__Impl5927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultOrDivOperation__Group_1__1__Impl_in_rule__MultOrDivOperation__Group_1__15958 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__MultOrDivOperation__Group_1__2_in_rule__MultOrDivOperation__Group_1__15961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivOperation_in_rule__MultOrDivOperation__Group_1__1__Impl5988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultOrDivOperation__Group_1__2__Impl_in_rule__MultOrDivOperation__Group_1__26017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__MultOrDivOperation__Group_1__2__Impl6045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultOperation__Group__0__Impl_in_rule__MultOperation__Group__06082 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_rule__MultOperation__Group__1_in_rule__MultOperation__Group__06085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOrNormalValueExpression_in_rule__MultOperation__Group__0__Impl6112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultOperation__Group__1__Impl_in_rule__MultOperation__Group__16141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultOperation__Group_1__0_in_rule__MultOperation__Group__1__Impl6168 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_rule__MultOperation__Group_1__0__Impl_in_rule__MultOperation__Group_1__06203 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__MultOperation__Group_1__1_in_rule__MultOperation__Group_1__06206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultOperation__Group_1__1__Impl_in_rule__MultOperation__Group_1__16264 = new BitSet(new long[]{0x000000004000A170L});
    public static final BitSet FOLLOW_rule__MultOperation__Group_1__2_in_rule__MultOperation__Group_1__16267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultOperation__OperatorAssignment_1_1_in_rule__MultOperation__Group_1__1__Impl6294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultOperation__Group_1__2__Impl_in_rule__MultOperation__Group_1__26324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultOperation__SubExpressionsAssignment_1_2_in_rule__MultOperation__Group_1__2__Impl6351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivOperation__Group__0__Impl_in_rule__DivOperation__Group__06387 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__DivOperation__Group__1_in_rule__DivOperation__Group__06390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOrNormalValueExpression_in_rule__DivOperation__Group__0__Impl6417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivOperation__Group__1__Impl_in_rule__DivOperation__Group__16446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivOperation__Group_1__0_in_rule__DivOperation__Group__1__Impl6473 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__DivOperation__Group_1__0__Impl_in_rule__DivOperation__Group_1__06508 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__DivOperation__Group_1__1_in_rule__DivOperation__Group_1__06511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivOperation__Group_1__1__Impl_in_rule__DivOperation__Group_1__16569 = new BitSet(new long[]{0x000000004000A170L});
    public static final BitSet FOLLOW_rule__DivOperation__Group_1__2_in_rule__DivOperation__Group_1__16572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivOperation__OperatorAssignment_1_1_in_rule__DivOperation__Group_1__1__Impl6599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivOperation__Group_1__2__Impl_in_rule__DivOperation__Group_1__26629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivOperation__SubExpressionsAssignment_1_2_in_rule__DivOperation__Group_1__2__Impl6656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreArithmOperation__Group__0__Impl_in_rule__PreArithmOperation__Group__06692 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__PreArithmOperation__Group__1_in_rule__PreArithmOperation__Group__06695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreArithmOperation__OperatorAssignment_0_in_rule__PreArithmOperation__Group__0__Impl6722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreArithmOperation__Group__1__Impl_in_rule__PreArithmOperation__Group__16752 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__PreArithmOperation__Group__2_in_rule__PreArithmOperation__Group__16755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__PreArithmOperation__Group__1__Impl6783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreArithmOperation__Group__2__Impl_in_rule__PreArithmOperation__Group__26814 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__PreArithmOperation__Group__3_in_rule__PreArithmOperation__Group__26817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreArithmOperation__SubExpressionsAssignment_2_in_rule__PreArithmOperation__Group__2__Impl6844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreArithmOperation__Group__3__Impl_in_rule__PreArithmOperation__Group__36874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__PreArithmOperation__Group__3__Impl6902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group__0__Impl_in_rule__CompareOperation__Group__06941 = new BitSet(new long[]{0x0000000001F80000L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group__1_in_rule__CompareOperation__Group__06944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_rule__CompareOperation__Group__0__Impl6971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group__1__Impl_in_rule__CompareOperation__Group__17000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_1__0_in_rule__CompareOperation__Group__1__Impl7027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_1__0__Impl_in_rule__CompareOperation__Group_1__07061 = new BitSet(new long[]{0x0000000001F80000L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_1__1_in_rule__CompareOperation__Group_1__07064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_1__1__Impl_in_rule__CompareOperation__Group_1__17122 = new BitSet(new long[]{0x000000004000A170L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_1__2_in_rule__CompareOperation__Group_1__17125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__OperatorAssignment_1_1_in_rule__CompareOperation__Group_1__1__Impl7152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_1__2__Impl_in_rule__CompareOperation__Group_1__27182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__SubExpressionsAssignment_1_2_in_rule__CompareOperation__Group_1__2__Impl7209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryOperation__Group__0__Impl_in_rule__UnaryOperation__Group__07245 = new BitSet(new long[]{0x000000004000A1F0L});
    public static final BitSet FOLLOW_rule__UnaryOperation__Group__1_in_rule__UnaryOperation__Group__07248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryOperation__OperatorAssignment_0_in_rule__UnaryOperation__Group__0__Impl7275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryOperation__Group__1__Impl_in_rule__UnaryOperation__Group__17305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryOperation__SubExpressionsAssignment_1_in_rule__UnaryOperation__Group__1__Impl7332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__Group__0__Impl_in_rule__UnaryParanthesedOperation__Group__07366 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__Group__1_in_rule__UnaryParanthesedOperation__Group__07369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__OperatorAssignment_0_in_rule__UnaryParanthesedOperation__Group__0__Impl7396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__Group__1__Impl_in_rule__UnaryParanthesedOperation__Group__17426 = new BitSet(new long[]{0x000000004000E1F0L});
    public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__Group__2_in_rule__UnaryParanthesedOperation__Group__17429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__UnaryParanthesedOperation__Group__1__Impl7457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__Group__2__Impl_in_rule__UnaryParanthesedOperation__Group__27488 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__Group__3_in_rule__UnaryParanthesedOperation__Group__27491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__SubExpressionsAssignment_2_in_rule__UnaryParanthesedOperation__Group__2__Impl7518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__Group__3__Impl_in_rule__UnaryParanthesedOperation__Group__37548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__UnaryParanthesedOperation__Group__3__Impl7576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndOperation__Group__0__Impl_in_rule__AndOperation__Group__07615 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__AndOperation__Group__1_in_rule__AndOperation__Group__07618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOrNormalExpression_in_rule__AndOperation__Group__0__Impl7645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndOperation__Group__1__Impl_in_rule__AndOperation__Group__17674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndOperation__Group_1__0_in_rule__AndOperation__Group__1__Impl7701 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__AndOperation__Group_1__0__Impl_in_rule__AndOperation__Group_1__07736 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__AndOperation__Group_1__1_in_rule__AndOperation__Group_1__07739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndOperation__Group_1__1__Impl_in_rule__AndOperation__Group_1__17797 = new BitSet(new long[]{0x000000004000E1F0L});
    public static final BitSet FOLLOW_rule__AndOperation__Group_1__2_in_rule__AndOperation__Group_1__17800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndOperation__OperatorAssignment_1_1_in_rule__AndOperation__Group_1__1__Impl7827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndOperation__Group_1__2__Impl_in_rule__AndOperation__Group_1__27857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndOperation__SubExpressionsAssignment_1_2_in_rule__AndOperation__Group_1__2__Impl7884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrOperation__Group__0__Impl_in_rule__OrOperation__Group__07920 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__OrOperation__Group__1_in_rule__OrOperation__Group__07923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperation_in_rule__OrOperation__Group__0__Impl7950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrOperation__Group__1__Impl_in_rule__OrOperation__Group__17979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrOperation__Group_1__0_in_rule__OrOperation__Group__1__Impl8006 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__OrOperation__Group_1__0__Impl_in_rule__OrOperation__Group_1__08041 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__OrOperation__Group_1__1_in_rule__OrOperation__Group_1__08044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrOperation__Group_1__1__Impl_in_rule__OrOperation__Group_1__18102 = new BitSet(new long[]{0x000000004000E1F0L});
    public static final BitSet FOLLOW_rule__OrOperation__Group_1__2_in_rule__OrOperation__Group_1__18105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrOperation__OperatorAssignment_1_1_in_rule__OrOperation__Group_1__1__Impl8132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrOperation__Group_1__2__Impl_in_rule__OrOperation__Group_1__28162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrOperation__SubExpressionsAssignment_1_2_in_rule__OrOperation__Group_1__2__Impl8189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanthesedBooleanExpression__Group_5__0__Impl_in_rule__ParanthesedBooleanExpression__Group_5__08225 = new BitSet(new long[]{0x000000004000E1F0L});
    public static final BitSet FOLLOW_rule__ParanthesedBooleanExpression__Group_5__1_in_rule__ParanthesedBooleanExpression__Group_5__08228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ParanthesedBooleanExpression__Group_5__0__Impl8256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanthesedBooleanExpression__Group_5__1__Impl_in_rule__ParanthesedBooleanExpression__Group_5__18287 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ParanthesedBooleanExpression__Group_5__2_in_rule__ParanthesedBooleanExpression__Group_5__18290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrOperation_in_rule__ParanthesedBooleanExpression__Group_5__1__Impl8317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanthesedBooleanExpression__Group_5__2__Impl_in_rule__ParanthesedBooleanExpression__Group_5__28346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ParanthesedBooleanExpression__Group_5__2__Impl8374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HostCode__Group__0__Impl_in_rule__HostCode__Group__08411 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__HostCode__Group__1_in_rule__HostCode__Group__08414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HostCode__CodeAssignment_0_in_rule__HostCode__Group__0__Impl8441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HostCode__Group__1__Impl_in_rule__HostCode__Group__18471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HostCode__Group_1__0_in_rule__HostCode__Group__1__Impl8498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HostCode__Group_1__0__Impl_in_rule__HostCode__Group_1__08533 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__HostCode__Group_1__1_in_rule__HostCode__Group_1__08536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__HostCode__Group_1__0__Impl8564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HostCode__Group_1__1__Impl_in_rule__HostCode__Group_1__18595 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__HostCode__Group_1__2_in_rule__HostCode__Group_1__18598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HostCode__TypeAssignment_1_1_in_rule__HostCode__Group_1__1__Impl8625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HostCode__Group_1__2__Impl_in_rule__HostCode__Group_1__28655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__HostCode__Group_1__2__Impl8683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Action__IsImmediateAssignment_08730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Action__DelayAssignment_18769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__Action__TriggerAssignment_28800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffect_in_rule__Action__EffectsAssignment_3_1_08831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Emission__SignalAssignment_08866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_rule__Emission__NewValueAssignment_1_0_18901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__Emission__NewValueAssignment_1_1_18932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Assignment__VariableAssignment_08967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_rule__Assignment__ExpressionAssignment_2_09002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__Assignment__ExpressionAssignment_2_19033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SignalReference__SignalAssignment_09068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__SignalReference__SubExpressionsAssignment_1_1_09103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableReference__VariableAssignment_09138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__VariableReference__SubExpressionsAssignment_1_1_09173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment9206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__FloatValue__ValueAssignment9237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__BooleanValue__ValueAssignment9268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperator_in_rule__ValOperation__OperatorAssignment_09299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_rule__ValOperation__SubExpressionsAssignment_19330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOperator_in_rule__PlusOperation__OperatorAssignment_1_19361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOrDivOperation_in_rule__PlusOperation__SubExpressionsAssignment_1_29392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOperator_in_rule__MultOperation__OperatorAssignment_1_19423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOrNormalValueExpression_in_rule__MultOperation__SubExpressionsAssignment_1_29454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivOperator_in_rule__DivOperation__OperatorAssignment_1_19485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOrNormalValueExpression_in_rule__DivOperation__SubExpressionsAssignment_1_29516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryParanthesedOperator_in_rule__PreArithmOperation__OperatorAssignment_09547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperation_in_rule__PreArithmOperation__SubExpressionsAssignment_29578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperator_in_rule__CompareOperation__OperatorAssignment_1_19609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_rule__CompareOperation__SubExpressionsAssignment_1_29640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperator_in_rule__UnaryOperation__OperatorAssignment_09671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryOperation__SubExpressionsAlternatives_1_0_in_rule__UnaryOperation__SubExpressionsAssignment_19702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryParanthesedOperator_in_rule__UnaryParanthesedOperation__OperatorAssignment_09735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__UnaryParanthesedOperation__SubExpressionsAssignment_29766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorAnd_in_rule__AndOperation__OperatorAssignment_1_19797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOrNormalExpression_in_rule__AndOperation__SubExpressionsAssignment_1_29828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorOr_in_rule__OrOperation__OperatorAssignment_1_19859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperation_in_rule__OrOperation__SubExpressionsAssignment_1_29890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__HostCode__CodeAssignment_09921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HostCode__TypeAssignment_1_19952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_0__0_in_synpred32172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ExpressionAssignment_2_0_in_synpred42223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanthesedValueExpression__Group_5__0_in_synpred102360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOperation_in_synpred112411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParanthesedBooleanExpression_in_synpred132510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryParanthesedOperation_in_synpred152576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_synpred172642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_synpred182659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperation_in_synpred192676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostCode_in_synpred202693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_synpred212743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignalReference__Group_1__0_in_synpred364313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__Group_1__0_in_synpred394749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HostCode__Group_1__0_in_synpred478498 = new BitSet(new long[]{0x0000000000000002L});

}