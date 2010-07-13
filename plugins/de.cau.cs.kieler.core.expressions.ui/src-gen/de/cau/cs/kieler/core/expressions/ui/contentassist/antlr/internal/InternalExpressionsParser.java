package de.cau.cs.kieler.core.expressions.ui.contentassist.antlr.internal; 

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
import de.cau.cs.kieler.core.expressions.services.ExpressionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalExpressionsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'?'", "'not'", "'pre'", "'or'", "'and'", "'/'", "'='", "'<'", "'<='", "'>'", "'>='", "'<>'", "'+'", "'-'", "'*'", "'mod'", "'('", "')'", "','"
    };
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_ID=4;
    public static final int RULE_STRING=8;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=5;
    public static final int RULE_WS=11;
    public static final int RULE_FLOAT=6;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;

        public InternalExpressionsParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[278+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g"; }


     
     	private ExpressionsGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ExpressionsGrammarAccess grammarAccess) {
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




    // $ANTLR start entryRuleSignalReference
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:62:1: entryRuleSignalReference : ruleSignalReference EOF ;
    public final void entryRuleSignalReference() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:63:1: ( ruleSignalReference EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:64:1: ruleSignalReference EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSignalReference_in_entryRuleSignalReference67);
            ruleSignalReference();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSignalReferenceRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSignalReference74); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:71:1: ruleSignalReference : ( ( rule__SignalReference__Group__0 ) ) ;
    public final void ruleSignalReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:75:2: ( ( ( rule__SignalReference__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:76:1: ( ( rule__SignalReference__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:76:1: ( ( rule__SignalReference__Group__0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:77:1: ( rule__SignalReference__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:78:1: ( rule__SignalReference__Group__0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:78:2: rule__SignalReference__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SignalReference__Group__0_in_ruleSignalReference100);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:90:1: entryRuleVariableReference : ruleVariableReference EOF ;
    public final void entryRuleVariableReference() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:91:1: ( ruleVariableReference EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:92:1: ruleVariableReference EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariableReference_in_entryRuleVariableReference127);
            ruleVariableReference();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getVariableReferenceRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableReference134); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:99:1: ruleVariableReference : ( ( rule__VariableReference__Group__0 ) ) ;
    public final void ruleVariableReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:103:2: ( ( ( rule__VariableReference__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:104:1: ( ( rule__VariableReference__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:104:1: ( ( rule__VariableReference__Group__0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:105:1: ( rule__VariableReference__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:106:1: ( rule__VariableReference__Group__0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:106:2: rule__VariableReference__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group__0_in_ruleVariableReference160);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:122:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:123:1: ( ruleIntValue EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:124:1: ruleIntValue EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIntValue_in_entryRuleIntValue191);
            ruleIntValue();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getIntValueRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntValue198); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:131:1: ruleIntValue : ( ( rule__IntValue__ValueAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:135:2: ( ( ( rule__IntValue__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:136:1: ( ( rule__IntValue__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:136:1: ( ( rule__IntValue__ValueAssignment ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:137:1: ( rule__IntValue__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:138:1: ( rule__IntValue__ValueAssignment )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:138:2: rule__IntValue__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue224);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:150:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:151:1: ( ruleFloatValue EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:152:1: ruleFloatValue EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFloatValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_entryRuleFloatValue251);
            ruleFloatValue();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getFloatValueRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloatValue258); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:159:1: ruleFloatValue : ( ( rule__FloatValue__ValueAssignment ) ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:163:2: ( ( ( rule__FloatValue__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:164:1: ( ( rule__FloatValue__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:164:1: ( ( rule__FloatValue__ValueAssignment ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:165:1: ( rule__FloatValue__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:166:1: ( rule__FloatValue__ValueAssignment )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:166:2: rule__FloatValue__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue284);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:178:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:179:1: ( ruleBooleanValue EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:180:1: ruleBooleanValue EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue311);
            ruleBooleanValue();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getBooleanValueRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanValue318); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:187:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:191:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:192:1: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:192:1: ( ( rule__BooleanValue__ValueAssignment ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:193:1: ( rule__BooleanValue__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:194:1: ( rule__BooleanValue__ValueAssignment )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:194:2: rule__BooleanValue__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__ValueAssignment_in_ruleBooleanValue344);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:208:1: entryRuleValOperation : ruleValOperation EOF ;
    public final void entryRuleValOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:209:1: ( ruleValOperation EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:210:1: ruleValOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValOperationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValOperation_in_entryRuleValOperation373);
            ruleValOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getValOperationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValOperation380); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:217:1: ruleValOperation : ( ( rule__ValOperation__Group__0 ) ) ;
    public final void ruleValOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:221:2: ( ( ( rule__ValOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:222:1: ( ( rule__ValOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:222:1: ( ( rule__ValOperation__Group__0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:223:1: ( rule__ValOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:224:1: ( rule__ValOperation__Group__0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:224:2: rule__ValOperation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValOperation__Group__0_in_ruleValOperation406);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:236:1: entryRuleValuedExpression : ruleValuedExpression EOF ;
    public final void entryRuleValuedExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:237:1: ( ruleValuedExpression EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:238:1: ruleValuedExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression433);
            ruleValuedExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getValuedExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedExpression440); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:245:1: ruleValuedExpression : ( rulePlusOperation ) ;
    public final void ruleValuedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:249:2: ( ( rulePlusOperation ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:250:1: ( rulePlusOperation )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:250:1: ( rulePlusOperation )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:251:1: rulePlusOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedExpressionAccess().getPlusOperationParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePlusOperation_in_ruleValuedExpression466);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:264:1: entryRuleParanthesedValuedExpression : ruleParanthesedValuedExpression EOF ;
    public final void entryRuleParanthesedValuedExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:265:1: ( ruleParanthesedValuedExpression EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:266:1: ruleParanthesedValuedExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleParanthesedValuedExpression_in_entryRuleParanthesedValuedExpression492);
            ruleParanthesedValuedExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParanthesedValuedExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParanthesedValuedExpression499); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:273:1: ruleParanthesedValuedExpression : ( ( rule__ParanthesedValuedExpression__Alternatives ) ) ;
    public final void ruleParanthesedValuedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:277:2: ( ( ( rule__ParanthesedValuedExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:278:1: ( ( rule__ParanthesedValuedExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:278:1: ( ( rule__ParanthesedValuedExpression__Alternatives ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:279:1: ( rule__ParanthesedValuedExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedValuedExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:280:1: ( rule__ParanthesedValuedExpression__Alternatives )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:280:2: rule__ParanthesedValuedExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParanthesedValuedExpression__Alternatives_in_ruleParanthesedValuedExpression525);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:292:1: entryRulePlusOperation : rulePlusOperation EOF ;
    public final void entryRulePlusOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:293:1: ( rulePlusOperation EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:294:1: rulePlusOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePlusOperation_in_entryRulePlusOperation552);
            rulePlusOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPlusOperationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePlusOperation559); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:301:1: rulePlusOperation : ( ( rule__PlusOperation__Group__0 ) ) ;
    public final void rulePlusOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:305:2: ( ( ( rule__PlusOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:306:1: ( ( rule__PlusOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:306:1: ( ( rule__PlusOperation__Group__0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:307:1: ( rule__PlusOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:308:1: ( rule__PlusOperation__Group__0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:308:2: rule__PlusOperation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PlusOperation__Group__0_in_rulePlusOperation585);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:320:1: entryRuleMultOrDivOperation : ruleMultOrDivOperation EOF ;
    public final void entryRuleMultOrDivOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:321:1: ( ruleMultOrDivOperation EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:322:1: ruleMultOrDivOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOrDivOperationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultOrDivOperation_in_entryRuleMultOrDivOperation612);
            ruleMultOrDivOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMultOrDivOperationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultOrDivOperation619); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:329:1: ruleMultOrDivOperation : ( ( rule__MultOrDivOperation__Alternatives ) ) ;
    public final void ruleMultOrDivOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:333:2: ( ( ( rule__MultOrDivOperation__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:334:1: ( ( rule__MultOrDivOperation__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:334:1: ( ( rule__MultOrDivOperation__Alternatives ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:335:1: ( rule__MultOrDivOperation__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOrDivOperationAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:336:1: ( rule__MultOrDivOperation__Alternatives )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:336:2: rule__MultOrDivOperation__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultOrDivOperation__Alternatives_in_ruleMultOrDivOperation645);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:348:1: entryRuleMultOperation : ruleMultOperation EOF ;
    public final void entryRuleMultOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:349:1: ( ruleMultOperation EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:350:1: ruleMultOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultOperation_in_entryRuleMultOperation672);
            ruleMultOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMultOperationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultOperation679); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:357:1: ruleMultOperation : ( ( rule__MultOperation__Group__0 ) ) ;
    public final void ruleMultOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:361:2: ( ( ( rule__MultOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:362:1: ( ( rule__MultOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:362:1: ( ( rule__MultOperation__Group__0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:363:1: ( rule__MultOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:364:1: ( rule__MultOperation__Group__0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:364:2: rule__MultOperation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultOperation__Group__0_in_ruleMultOperation705);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:376:1: entryRuleDivOperation : ruleDivOperation EOF ;
    public final void entryRuleDivOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:377:1: ( ruleDivOperation EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:378:1: ruleDivOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivOperation_in_entryRuleDivOperation732);
            ruleDivOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDivOperationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDivOperation739); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:385:1: ruleDivOperation : ( ( rule__DivOperation__Group__0 ) ) ;
    public final void ruleDivOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:389:2: ( ( ( rule__DivOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:390:1: ( ( rule__DivOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:390:1: ( ( rule__DivOperation__Group__0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:391:1: ( rule__DivOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:392:1: ( rule__DivOperation__Group__0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:392:2: rule__DivOperation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivOperation__Group__0_in_ruleDivOperation765);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:404:1: entryRulePreArithmOperation : rulePreArithmOperation EOF ;
    public final void entryRulePreArithmOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:405:1: ( rulePreArithmOperation EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:406:1: rulePreArithmOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreArithmOperationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePreArithmOperation_in_entryRulePreArithmOperation792);
            rulePreArithmOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPreArithmOperationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePreArithmOperation799); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:413:1: rulePreArithmOperation : ( ( rule__PreArithmOperation__Group__0 ) ) ;
    public final void rulePreArithmOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:417:2: ( ( ( rule__PreArithmOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:418:1: ( ( rule__PreArithmOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:418:1: ( ( rule__PreArithmOperation__Group__0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:419:1: ( rule__PreArithmOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreArithmOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:420:1: ( rule__PreArithmOperation__Group__0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:420:2: rule__PreArithmOperation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PreArithmOperation__Group__0_in_rulePreArithmOperation825);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:432:1: entryRulePreOrNormalValuedExpression : rulePreOrNormalValuedExpression EOF ;
    public final void entryRulePreOrNormalValuedExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:433:1: ( rulePreOrNormalValuedExpression EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:434:1: rulePreOrNormalValuedExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreOrNormalValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePreOrNormalValuedExpression_in_entryRulePreOrNormalValuedExpression852);
            rulePreOrNormalValuedExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPreOrNormalValuedExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePreOrNormalValuedExpression859); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:441:1: rulePreOrNormalValuedExpression : ( ( rule__PreOrNormalValuedExpression__Alternatives ) ) ;
    public final void rulePreOrNormalValuedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:445:2: ( ( ( rule__PreOrNormalValuedExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:446:1: ( ( rule__PreOrNormalValuedExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:446:1: ( ( rule__PreOrNormalValuedExpression__Alternatives ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:447:1: ( rule__PreOrNormalValuedExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreOrNormalValuedExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:448:1: ( rule__PreOrNormalValuedExpression__Alternatives )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:448:2: rule__PreOrNormalValuedExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__PreOrNormalValuedExpression__Alternatives_in_rulePreOrNormalValuedExpression885);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:460:1: entryRuleCompareOperation : ruleCompareOperation EOF ;
    public final void entryRuleCompareOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:461:1: ( ruleCompareOperation EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:462:1: ruleCompareOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation912);
            ruleCompareOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getCompareOperationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompareOperation919); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:469:1: ruleCompareOperation : ( ( rule__CompareOperation__Group__0 ) ) ;
    public final void ruleCompareOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:473:2: ( ( ( rule__CompareOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:474:1: ( ( rule__CompareOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:474:1: ( ( rule__CompareOperation__Group__0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:475:1: ( rule__CompareOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:476:1: ( rule__CompareOperation__Group__0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:476:2: rule__CompareOperation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group__0_in_ruleCompareOperation945);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:488:1: entryRuleUnaryOperation : ruleUnaryOperation EOF ;
    public final void entryRuleUnaryOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:489:1: ( ruleUnaryOperation EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:490:1: ruleUnaryOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryOperationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation972);
            ruleUnaryOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getUnaryOperationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryOperation979); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:497:1: ruleUnaryOperation : ( ( rule__UnaryOperation__Group__0 ) ) ;
    public final void ruleUnaryOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:501:2: ( ( ( rule__UnaryOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:502:1: ( ( rule__UnaryOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:502:1: ( ( rule__UnaryOperation__Group__0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:503:1: ( rule__UnaryOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:504:1: ( rule__UnaryOperation__Group__0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:504:2: rule__UnaryOperation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__Group__0_in_ruleUnaryOperation1005);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:516:1: entryRuleUnaryParanthesedOperation : ruleUnaryParanthesedOperation EOF ;
    public final void entryRuleUnaryParanthesedOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:517:1: ( ruleUnaryParanthesedOperation EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:518:1: ruleUnaryParanthesedOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryParanthesedOperation_in_entryRuleUnaryParanthesedOperation1032);
            ruleUnaryParanthesedOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getUnaryParanthesedOperationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryParanthesedOperation1039); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:525:1: ruleUnaryParanthesedOperation : ( ( rule__UnaryParanthesedOperation__Group__0 ) ) ;
    public final void ruleUnaryParanthesedOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:529:2: ( ( ( rule__UnaryParanthesedOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:530:1: ( ( rule__UnaryParanthesedOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:530:1: ( ( rule__UnaryParanthesedOperation__Group__0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:531:1: ( rule__UnaryParanthesedOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:532:1: ( rule__UnaryParanthesedOperation__Group__0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:532:2: rule__UnaryParanthesedOperation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryParanthesedOperation__Group__0_in_ruleUnaryParanthesedOperation1065);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:544:1: entryRuleUnaryOrNormalExpression : ruleUnaryOrNormalExpression EOF ;
    public final void entryRuleUnaryOrNormalExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:545:1: ( ruleUnaryOrNormalExpression EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:546:1: ruleUnaryOrNormalExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryOrNormalExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOrNormalExpression_in_entryRuleUnaryOrNormalExpression1092);
            ruleUnaryOrNormalExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getUnaryOrNormalExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryOrNormalExpression1099); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:553:1: ruleUnaryOrNormalExpression : ( ( rule__UnaryOrNormalExpression__Alternatives ) ) ;
    public final void ruleUnaryOrNormalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:557:2: ( ( ( rule__UnaryOrNormalExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:558:1: ( ( rule__UnaryOrNormalExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:558:1: ( ( rule__UnaryOrNormalExpression__Alternatives ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:559:1: ( rule__UnaryOrNormalExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryOrNormalExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:560:1: ( rule__UnaryOrNormalExpression__Alternatives )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:560:2: rule__UnaryOrNormalExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOrNormalExpression__Alternatives_in_ruleUnaryOrNormalExpression1125);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:572:1: entryRuleAndOperation : ruleAndOperation EOF ;
    public final void entryRuleAndOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:573:1: ( ruleAndOperation EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:574:1: ruleAndOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndOperation_in_entryRuleAndOperation1152);
            ruleAndOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAndOperationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAndOperation1159); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:581:1: ruleAndOperation : ( ( rule__AndOperation__Group__0 ) ) ;
    public final void ruleAndOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:585:2: ( ( ( rule__AndOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:586:1: ( ( rule__AndOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:586:1: ( ( rule__AndOperation__Group__0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:587:1: ( rule__AndOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:588:1: ( rule__AndOperation__Group__0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:588:2: rule__AndOperation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndOperation__Group__0_in_ruleAndOperation1185);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:600:1: entryRuleOrOperation : ruleOrOperation EOF ;
    public final void entryRuleOrOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:601:1: ( ruleOrOperation EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:602:1: ruleOrOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrOperation_in_entryRuleOrOperation1212);
            ruleOrOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getOrOperationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrOperation1219); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:609:1: ruleOrOperation : ( ( rule__OrOperation__Group__0 ) ) ;
    public final void ruleOrOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:613:2: ( ( ( rule__OrOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:614:1: ( ( rule__OrOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:614:1: ( ( rule__OrOperation__Group__0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:615:1: ( rule__OrOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:616:1: ( rule__OrOperation__Group__0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:616:2: rule__OrOperation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrOperation__Group__0_in_ruleOrOperation1245);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:628:1: entryRuleParanthesedBooleanExpression : ruleParanthesedBooleanExpression EOF ;
    public final void entryRuleParanthesedBooleanExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:629:1: ( ruleParanthesedBooleanExpression EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:630:1: ruleParanthesedBooleanExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedBooleanExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleParanthesedBooleanExpression_in_entryRuleParanthesedBooleanExpression1272);
            ruleParanthesedBooleanExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParanthesedBooleanExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParanthesedBooleanExpression1279); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:637:1: ruleParanthesedBooleanExpression : ( ( rule__ParanthesedBooleanExpression__Alternatives ) ) ;
    public final void ruleParanthesedBooleanExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:641:2: ( ( ( rule__ParanthesedBooleanExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:642:1: ( ( rule__ParanthesedBooleanExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:642:1: ( ( rule__ParanthesedBooleanExpression__Alternatives ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:643:1: ( rule__ParanthesedBooleanExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedBooleanExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:644:1: ( rule__ParanthesedBooleanExpression__Alternatives )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:644:2: rule__ParanthesedBooleanExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParanthesedBooleanExpression__Alternatives_in_ruleParanthesedBooleanExpression1305);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:656:1: entryRuleBooleanExpression : ruleBooleanExpression EOF ;
    public final void entryRuleBooleanExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:657:1: ( ruleBooleanExpression EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:658:1: ruleBooleanExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression1332);
            ruleBooleanExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanExpression1339); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:665:1: ruleBooleanExpression : ( ruleOrOperation ) ;
    public final void ruleBooleanExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:669:2: ( ( ruleOrOperation ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:670:1: ( ruleOrOperation )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:670:1: ( ruleOrOperation )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:671:1: ruleOrOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getOrOperationParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrOperation_in_ruleBooleanExpression1365);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:684:1: entryRuleTextExpression : ruleTextExpression EOF ;
    public final void entryRuleTextExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:685:1: ( ruleTextExpression EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:686:1: ruleTextExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_entryRuleTextExpression1391);
            ruleTextExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTextExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextExpression1398); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:693:1: ruleTextExpression : ( ( rule__TextExpression__Group__0 ) ) ;
    public final void ruleTextExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:697:2: ( ( ( rule__TextExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:698:1: ( ( rule__TextExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:698:1: ( ( rule__TextExpression__Group__0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:699:1: ( rule__TextExpression__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:700:1: ( rule__TextExpression__Group__0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:700:2: rule__TextExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group__0_in_ruleTextExpression1424);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:712:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:713:1: ( ruleExpression EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:714:1: ruleExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression1451);
            ruleExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression1458); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:721:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:725:2: ( ( ( rule__Expression__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:726:1: ( ( rule__Expression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:726:1: ( ( rule__Expression__Alternatives ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:727:1: ( rule__Expression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:728:1: ( rule__Expression__Alternatives )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:728:2: rule__Expression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Alternatives_in_ruleExpression1484);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:743:1: ruleValOperator : ( ( '?' ) ) ;
    public final void ruleValOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:747:1: ( ( ( '?' ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:748:1: ( ( '?' ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:748:1: ( ( '?' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:749:1: ( '?' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValOperatorAccess().getVALEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:750:1: ( '?' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:750:3: '?'
            {
            match(input,13,FollowSets000.FOLLOW_13_in_ruleValOperator1524); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:763:1: ruleCompareOperator : ( ( rule__CompareOperator__Alternatives ) ) ;
    public final void ruleCompareOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:767:1: ( ( ( rule__CompareOperator__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:768:1: ( ( rule__CompareOperator__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:768:1: ( ( rule__CompareOperator__Alternatives ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:769:1: ( rule__CompareOperator__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:770:1: ( rule__CompareOperator__Alternatives )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:770:2: rule__CompareOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperator__Alternatives_in_ruleCompareOperator1562);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:782:1: ruleUnaryOperator : ( ( 'not' ) ) ;
    public final void ruleUnaryOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:786:1: ( ( ( 'not' ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:787:1: ( ( 'not' ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:787:1: ( ( 'not' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:788:1: ( 'not' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryOperatorAccess().getNOTEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:789:1: ( 'not' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:789:3: 'not'
            {
            match(input,14,FollowSets000.FOLLOW_14_in_ruleUnaryOperator1599); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:802:1: ruleUnaryParanthesedOperator : ( ( 'pre' ) ) ;
    public final void ruleUnaryParanthesedOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:806:1: ( ( ( 'pre' ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:807:1: ( ( 'pre' ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:807:1: ( ( 'pre' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:808:1: ( 'pre' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperatorAccess().getPREEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:809:1: ( 'pre' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:809:3: 'pre'
            {
            match(input,15,FollowSets000.FOLLOW_15_in_ruleUnaryParanthesedOperator1638); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:822:1: ruleOperatorOr : ( ( 'or' ) ) ;
    public final void ruleOperatorOr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:826:1: ( ( ( 'or' ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:827:1: ( ( 'or' ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:827:1: ( ( 'or' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:828:1: ( 'or' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOperatorOrAccess().getOREnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:829:1: ( 'or' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:829:3: 'or'
            {
            match(input,16,FollowSets000.FOLLOW_16_in_ruleOperatorOr1677); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:842:1: ruleOperatorAnd : ( ( 'and' ) ) ;
    public final void ruleOperatorAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:846:1: ( ( ( 'and' ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:847:1: ( ( 'and' ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:847:1: ( ( 'and' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:848:1: ( 'and' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOperatorAndAccess().getANDEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:849:1: ( 'and' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:849:3: 'and'
            {
            match(input,17,FollowSets000.FOLLOW_17_in_ruleOperatorAnd1716); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:864:1: rulePlusOperator : ( ( rule__PlusOperator__Alternatives ) ) ;
    public final void rulePlusOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:868:1: ( ( ( rule__PlusOperator__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:869:1: ( ( rule__PlusOperator__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:869:1: ( ( rule__PlusOperator__Alternatives ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:870:1: ( rule__PlusOperator__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperatorAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:871:1: ( rule__PlusOperator__Alternatives )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:871:2: rule__PlusOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__PlusOperator__Alternatives_in_rulePlusOperator1756);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:883:1: ruleMultOperator : ( ( rule__MultOperator__Alternatives ) ) ;
    public final void ruleMultOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:887:1: ( ( ( rule__MultOperator__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:888:1: ( ( rule__MultOperator__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:888:1: ( ( rule__MultOperator__Alternatives ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:889:1: ( rule__MultOperator__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperatorAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:890:1: ( rule__MultOperator__Alternatives )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:890:2: rule__MultOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultOperator__Alternatives_in_ruleMultOperator1792);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:902:1: ruleDivOperator : ( ( '/' ) ) ;
    public final void ruleDivOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:906:1: ( ( ( '/' ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:907:1: ( ( '/' ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:907:1: ( ( '/' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:908:1: ( '/' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperatorAccess().getDIVEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:909:1: ( '/' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:909:3: '/'
            {
            match(input,18,FollowSets000.FOLLOW_18_in_ruleDivOperator1829); if (failed) return ;

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


    // $ANTLR start rule__ParanthesedValuedExpression__Alternatives
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:926:1: rule__ParanthesedValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleValOperation ) | ( ruleVariableReference ) | ( ruleTextExpression ) | ( ( rule__ParanthesedValuedExpression__Group_5__0 ) ) | ( ( rule__ParanthesedValuedExpression__Group_6__0 ) ) );
    public final void rule__ParanthesedValuedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:930:1: ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleValOperation ) | ( ruleVariableReference ) | ( ruleTextExpression ) | ( ( rule__ParanthesedValuedExpression__Group_5__0 ) ) | ( ( rule__ParanthesedValuedExpression__Group_6__0 ) ) )
            int alt1=7;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt1=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case RULE_ID:
                {
                alt1=4;
                }
                break;
            case RULE_STRING:
                {
                alt1=5;
                }
                break;
            case 29:
                {
                int LA1_6 = input.LA(2);

                if ( (synpred6()) ) {
                    alt1=6;
                }
                else if ( (true) ) {
                    alt1=7;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("926:1: rule__ParanthesedValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleValOperation ) | ( ruleVariableReference ) | ( ruleTextExpression ) | ( ( rule__ParanthesedValuedExpression__Group_5__0 ) ) | ( ( rule__ParanthesedValuedExpression__Group_6__0 ) ) );", 1, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("926:1: rule__ParanthesedValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleValOperation ) | ( ruleVariableReference ) | ( ruleTextExpression ) | ( ( rule__ParanthesedValuedExpression__Group_5__0 ) ) | ( ( rule__ParanthesedValuedExpression__Group_6__0 ) ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:931:1: ( ruleIntValue )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:931:1: ( ruleIntValue )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:932:1: ruleIntValue
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedValuedExpressionAccess().getIntValueParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIntValue_in_rule__ParanthesedValuedExpression__Alternatives1871);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:937:6: ( ruleFloatValue )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:937:6: ( ruleFloatValue )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:938:1: ruleFloatValue
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedValuedExpressionAccess().getFloatValueParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_rule__ParanthesedValuedExpression__Alternatives1888);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:943:6: ( ruleValOperation )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:943:6: ( ruleValOperation )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:944:1: ruleValOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedValuedExpressionAccess().getValOperationParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValOperation_in_rule__ParanthesedValuedExpression__Alternatives1905);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:949:6: ( ruleVariableReference )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:949:6: ( ruleVariableReference )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:950:1: ruleVariableReference
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedValuedExpressionAccess().getVariableReferenceParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVariableReference_in_rule__ParanthesedValuedExpression__Alternatives1922);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:955:6: ( ruleTextExpression )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:955:6: ( ruleTextExpression )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:956:1: ruleTextExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedValuedExpressionAccess().getTextExpressionParserRuleCall_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_rule__ParanthesedValuedExpression__Alternatives1939);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:961:6: ( ( rule__ParanthesedValuedExpression__Group_5__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:961:6: ( ( rule__ParanthesedValuedExpression__Group_5__0 ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:962:1: ( rule__ParanthesedValuedExpression__Group_5__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedValuedExpressionAccess().getGroup_5()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:963:1: ( rule__ParanthesedValuedExpression__Group_5__0 )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:963:2: rule__ParanthesedValuedExpression__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ParanthesedValuedExpression__Group_5__0_in_rule__ParanthesedValuedExpression__Alternatives1956);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:967:6: ( ( rule__ParanthesedValuedExpression__Group_6__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:967:6: ( ( rule__ParanthesedValuedExpression__Group_6__0 ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:968:1: ( rule__ParanthesedValuedExpression__Group_6__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedValuedExpressionAccess().getGroup_6()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:969:1: ( rule__ParanthesedValuedExpression__Group_6__0 )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:969:2: rule__ParanthesedValuedExpression__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ParanthesedValuedExpression__Group_6__0_in_rule__ParanthesedValuedExpression__Alternatives1974);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:978:1: rule__MultOrDivOperation__Alternatives : ( ( ruleMultOperation ) | ( ( rule__MultOrDivOperation__Group_1__0 ) ) );
    public final void rule__MultOrDivOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:982:1: ( ( ruleMultOperation ) | ( ( rule__MultOrDivOperation__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_FLOAT)||LA2_0==RULE_STRING||LA2_0==13||LA2_0==15) ) {
                alt2=1;
            }
            else if ( (LA2_0==29) ) {
                int LA2_7 = input.LA(2);

                if ( (synpred7()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("978:1: rule__MultOrDivOperation__Alternatives : ( ( ruleMultOperation ) | ( ( rule__MultOrDivOperation__Group_1__0 ) ) );", 2, 7, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("978:1: rule__MultOrDivOperation__Alternatives : ( ( ruleMultOperation ) | ( ( rule__MultOrDivOperation__Group_1__0 ) ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:983:1: ( ruleMultOperation )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:983:1: ( ruleMultOperation )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:984:1: ruleMultOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMultOrDivOperationAccess().getMultOperationParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMultOperation_in_rule__MultOrDivOperation__Alternatives2007);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:989:6: ( ( rule__MultOrDivOperation__Group_1__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:989:6: ( ( rule__MultOrDivOperation__Group_1__0 ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:990:1: ( rule__MultOrDivOperation__Group_1__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMultOrDivOperationAccess().getGroup_1()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:991:1: ( rule__MultOrDivOperation__Group_1__0 )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:991:2: rule__MultOrDivOperation__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MultOrDivOperation__Group_1__0_in_rule__MultOrDivOperation__Alternatives2024);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1000:1: rule__PreOrNormalValuedExpression__Alternatives : ( ( rulePreArithmOperation ) | ( ruleParanthesedValuedExpression ) );
    public final void rule__PreOrNormalValuedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1004:1: ( ( rulePreArithmOperation ) | ( ruleParanthesedValuedExpression ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_FLOAT)||LA3_0==RULE_STRING||LA3_0==13||LA3_0==29) ) {
                alt3=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1000:1: rule__PreOrNormalValuedExpression__Alternatives : ( ( rulePreArithmOperation ) | ( ruleParanthesedValuedExpression ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1005:1: ( rulePreArithmOperation )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1005:1: ( rulePreArithmOperation )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1006:1: rulePreArithmOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPreOrNormalValuedExpressionAccess().getPreArithmOperationParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePreArithmOperation_in_rule__PreOrNormalValuedExpression__Alternatives2057);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1011:6: ( ruleParanthesedValuedExpression )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1011:6: ( ruleParanthesedValuedExpression )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1012:1: ruleParanthesedValuedExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPreOrNormalValuedExpressionAccess().getParanthesedValuedExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleParanthesedValuedExpression_in_rule__PreOrNormalValuedExpression__Alternatives2074);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1022:1: rule__UnaryOperation__SubExpressionsAlternatives_1_0 : ( ( ruleParanthesedBooleanExpression ) | ( ruleUnaryParanthesedOperation ) );
    public final void rule__UnaryOperation__SubExpressionsAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1026:1: ( ( ruleParanthesedBooleanExpression ) | ( ruleUnaryParanthesedOperation ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_STRING)||LA4_0==13||LA4_0==29) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==29) ) {
                    int LA4_3 = input.LA(3);

                    if ( ((LA4_3>=RULE_ID && LA4_3<=RULE_STRING)||(LA4_3>=14 && LA4_3<=15)||LA4_3==29) ) {
                        alt4=2;
                    }
                    else if ( (LA4_3==13) ) {
                        int LA4_5 = input.LA(4);

                        if ( (LA4_5==RULE_ID) ) {
                            switch ( input.LA(5) ) {
                            case 29:
                                {
                                int LA4_7 = input.LA(6);

                                if ( (synpred9()) ) {
                                    alt4=1;
                                }
                                else if ( (true) ) {
                                    alt4=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1022:1: rule__UnaryOperation__SubExpressionsAlternatives_1_0 : ( ( ruleParanthesedBooleanExpression ) | ( ruleUnaryParanthesedOperation ) );", 4, 7, input);

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
                                alt4=2;
                                }
                                break;
                            case 30:
                                {
                                int LA4_8 = input.LA(6);

                                if ( ((LA4_8>=19 && LA4_8<=28)) ) {
                                    alt4=1;
                                }
                                else if ( (LA4_8==EOF||(LA4_8>=RULE_ID && LA4_8<=RULE_STRING)||(LA4_8>=13 && LA4_8<=17)||(LA4_8>=29 && LA4_8<=31)) ) {
                                    alt4=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1022:1: rule__UnaryOperation__SubExpressionsAlternatives_1_0 : ( ( ruleParanthesedBooleanExpression ) | ( ruleUnaryParanthesedOperation ) );", 4, 8, input);

                                    throw nvae;
                                }
                                }
                                break;
                            default:
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1022:1: rule__UnaryOperation__SubExpressionsAlternatives_1_0 : ( ( ruleParanthesedBooleanExpression ) | ( ruleUnaryParanthesedOperation ) );", 4, 6, input);

                                throw nvae;
                            }

                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("1022:1: rule__UnaryOperation__SubExpressionsAlternatives_1_0 : ( ( ruleParanthesedBooleanExpression ) | ( ruleUnaryParanthesedOperation ) );", 4, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1022:1: rule__UnaryOperation__SubExpressionsAlternatives_1_0 : ( ( ruleParanthesedBooleanExpression ) | ( ruleUnaryParanthesedOperation ) );", 4, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1022:1: rule__UnaryOperation__SubExpressionsAlternatives_1_0 : ( ( ruleParanthesedBooleanExpression ) | ( ruleUnaryParanthesedOperation ) );", 4, 2, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1022:1: rule__UnaryOperation__SubExpressionsAlternatives_1_0 : ( ( ruleParanthesedBooleanExpression ) | ( ruleUnaryParanthesedOperation ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1027:1: ( ruleParanthesedBooleanExpression )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1027:1: ( ruleParanthesedBooleanExpression )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1028:1: ruleParanthesedBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getUnaryOperationAccess().getSubExpressionsParanthesedBooleanExpressionParserRuleCall_1_0_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleParanthesedBooleanExpression_in_rule__UnaryOperation__SubExpressionsAlternatives_1_02106);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1033:6: ( ruleUnaryParanthesedOperation )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1033:6: ( ruleUnaryParanthesedOperation )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1034:1: ruleUnaryParanthesedOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getUnaryOperationAccess().getSubExpressionsUnaryParanthesedOperationParserRuleCall_1_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryParanthesedOperation_in_rule__UnaryOperation__SubExpressionsAlternatives_1_02123);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1044:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );
    public final void rule__UnaryOrNormalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1048:1: ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt5=1;
                }
                break;
            case 15:
                {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==29) ) {
                    int LA5_4 = input.LA(3);

                    if ( ((LA5_4>=RULE_ID && LA5_4<=RULE_STRING)||(LA5_4>=14 && LA5_4<=15)||LA5_4==29) ) {
                        alt5=2;
                    }
                    else if ( (LA5_4==13) ) {
                        int LA5_6 = input.LA(4);

                        if ( (LA5_6==RULE_ID) ) {
                            switch ( input.LA(5) ) {
                            case 29:
                                {
                                int LA5_8 = input.LA(6);

                                if ( (synpred11()) ) {
                                    alt5=2;
                                }
                                else if ( (true) ) {
                                    alt5=3;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1044:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );", 5, 8, input);

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
                                alt5=2;
                                }
                                break;
                            case 30:
                                {
                                int LA5_9 = input.LA(6);

                                if ( (LA5_9==EOF||(LA5_9>=RULE_ID && LA5_9<=RULE_STRING)||(LA5_9>=13 && LA5_9<=17)||(LA5_9>=29 && LA5_9<=31)) ) {
                                    alt5=2;
                                }
                                else if ( ((LA5_9>=19 && LA5_9<=28)) ) {
                                    alt5=3;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1044:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );", 5, 9, input);

                                    throw nvae;
                                }
                                }
                                break;
                            default:
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1044:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );", 5, 7, input);

                                throw nvae;
                            }

                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("1044:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );", 5, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1044:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );", 5, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1044:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_FLOAT:
            case RULE_BOOLEAN:
            case RULE_STRING:
            case 13:
            case 29:
                {
                alt5=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1044:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1049:1: ( ruleUnaryOperation )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1049:1: ( ruleUnaryOperation )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1050:1: ruleUnaryOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getUnaryOrNormalExpressionAccess().getUnaryOperationParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryOperation_in_rule__UnaryOrNormalExpression__Alternatives2155);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1055:6: ( ruleUnaryParanthesedOperation )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1055:6: ( ruleUnaryParanthesedOperation )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1056:1: ruleUnaryParanthesedOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getUnaryOrNormalExpressionAccess().getUnaryParanthesedOperationParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryParanthesedOperation_in_rule__UnaryOrNormalExpression__Alternatives2172);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1061:6: ( ruleParanthesedBooleanExpression )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1061:6: ( ruleParanthesedBooleanExpression )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1062:1: ruleParanthesedBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getUnaryOrNormalExpressionAccess().getParanthesedBooleanExpressionParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleParanthesedBooleanExpression_in_rule__UnaryOrNormalExpression__Alternatives2189);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1072:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleTextExpression ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );
    public final void rule__ParanthesedBooleanExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1076:1: ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleTextExpression ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt6=1;
                }
                break;
            case RULE_INT:
            case RULE_FLOAT:
            case 15:
                {
                alt6=2;
                }
                break;
            case 13:
                {
                int LA6_3 = input.LA(2);

                if ( (LA6_3==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 29:
                        {
                        int LA6_13 = input.LA(4);

                        if ( (synpred13()) ) {
                            alt6=2;
                        }
                        else if ( (synpred15()) ) {
                            alt6=4;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("1072:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleTextExpression ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 6, 13, input);

                            throw nvae;
                        }
                        }
                        break;
                    case EOF:
                    case RULE_ID:
                    case RULE_INT:
                    case RULE_FLOAT:
                    case RULE_BOOLEAN:
                    case RULE_STRING:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 30:
                    case 31:
                        {
                        alt6=4;
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
                        alt6=2;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1072:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleTextExpression ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 6, 7, input);

                        throw nvae;
                    }

                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1072:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleTextExpression ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 6, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 29:
                    {
                    int LA6_8 = input.LA(3);

                    if ( (synpred13()) ) {
                        alt6=2;
                    }
                    else if ( (synpred14()) ) {
                        alt6=3;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1072:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleTextExpression ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 6, 8, input);

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
                    alt6=2;
                    }
                    break;
                case EOF:
                case RULE_ID:
                case RULE_INT:
                case RULE_FLOAT:
                case RULE_BOOLEAN:
                case RULE_STRING:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 30:
                case 31:
                    {
                    alt6=3;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1072:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleTextExpression ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 6, 4, input);

                    throw nvae;
                }

                }
                break;
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case 29:
                    {
                    int LA6_10 = input.LA(3);

                    if ( (synpred13()) ) {
                        alt6=2;
                    }
                    else if ( (synpred16()) ) {
                        alt6=5;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1072:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleTextExpression ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 6, 10, input);

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
                    alt6=2;
                    }
                    break;
                case EOF:
                case RULE_ID:
                case RULE_INT:
                case RULE_FLOAT:
                case RULE_BOOLEAN:
                case RULE_STRING:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 30:
                case 31:
                    {
                    alt6=5;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1072:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleTextExpression ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 6, 5, input);

                    throw nvae;
                }

                }
                break;
            case 29:
                {
                int LA6_6 = input.LA(2);

                if ( (synpred13()) ) {
                    alt6=2;
                }
                else if ( (true) ) {
                    alt6=6;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1072:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleTextExpression ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 6, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1072:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleTextExpression ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1077:1: ( ruleBooleanValue )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1077:1: ( ruleBooleanValue )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1078:1: ruleBooleanValue
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedBooleanExpressionAccess().getBooleanValueParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanValue_in_rule__ParanthesedBooleanExpression__Alternatives2221);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1083:6: ( ruleCompareOperation )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1083:6: ( ruleCompareOperation )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1084:1: ruleCompareOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedBooleanExpressionAccess().getCompareOperationParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_rule__ParanthesedBooleanExpression__Alternatives2238);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1089:6: ( ruleSignalReference )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1089:6: ( ruleSignalReference )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1090:1: ruleSignalReference
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedBooleanExpressionAccess().getSignalReferenceParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSignalReference_in_rule__ParanthesedBooleanExpression__Alternatives2255);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1095:6: ( ruleValOperation )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1095:6: ( ruleValOperation )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1096:1: ruleValOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedBooleanExpressionAccess().getValOperationParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValOperation_in_rule__ParanthesedBooleanExpression__Alternatives2272);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1101:6: ( ruleTextExpression )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1101:6: ( ruleTextExpression )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1102:1: ruleTextExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedBooleanExpressionAccess().getTextExpressionParserRuleCall_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_rule__ParanthesedBooleanExpression__Alternatives2289);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1107:6: ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1107:6: ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1108:1: ( rule__ParanthesedBooleanExpression__Group_5__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedBooleanExpressionAccess().getGroup_5()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1109:1: ( rule__ParanthesedBooleanExpression__Group_5__0 )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1109:2: rule__ParanthesedBooleanExpression__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ParanthesedBooleanExpression__Group_5__0_in_rule__ParanthesedBooleanExpression__Alternatives2306);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1118:1: rule__Expression__Alternatives : ( ( ruleValuedExpression ) | ( ruleBooleanExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1122:1: ( ( ruleValuedExpression ) | ( ruleBooleanExpression ) )
            int alt7=2;
            switch ( input.LA(1) ) {
            case 15:
                {
                int LA7_1 = input.LA(2);

                if ( (synpred17()) ) {
                    alt7=1;
                }
                else if ( (true) ) {
                    alt7=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1118:1: rule__Expression__Alternatives : ( ( ruleValuedExpression ) | ( ruleBooleanExpression ) );", 7, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA7_2 = input.LA(2);

                if ( (synpred17()) ) {
                    alt7=1;
                }
                else if ( (true) ) {
                    alt7=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1118:1: rule__Expression__Alternatives : ( ( ruleValuedExpression ) | ( ruleBooleanExpression ) );", 7, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_FLOAT:
                {
                int LA7_3 = input.LA(2);

                if ( (synpred17()) ) {
                    alt7=1;
                }
                else if ( (true) ) {
                    alt7=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1118:1: rule__Expression__Alternatives : ( ( ruleValuedExpression ) | ( ruleBooleanExpression ) );", 7, 3, input);

                    throw nvae;
                }
                }
                break;
            case 13:
                {
                int LA7_4 = input.LA(2);

                if ( (synpred17()) ) {
                    alt7=1;
                }
                else if ( (true) ) {
                    alt7=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1118:1: rule__Expression__Alternatives : ( ( ruleValuedExpression ) | ( ruleBooleanExpression ) );", 7, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA7_5 = input.LA(2);

                if ( (synpred17()) ) {
                    alt7=1;
                }
                else if ( (true) ) {
                    alt7=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1118:1: rule__Expression__Alternatives : ( ( ruleValuedExpression ) | ( ruleBooleanExpression ) );", 7, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                int LA7_6 = input.LA(2);

                if ( (synpred17()) ) {
                    alt7=1;
                }
                else if ( (true) ) {
                    alt7=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1118:1: rule__Expression__Alternatives : ( ( ruleValuedExpression ) | ( ruleBooleanExpression ) );", 7, 6, input);

                    throw nvae;
                }
                }
                break;
            case 29:
                {
                int LA7_7 = input.LA(2);

                if ( (synpred17()) ) {
                    alt7=1;
                }
                else if ( (true) ) {
                    alt7=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1118:1: rule__Expression__Alternatives : ( ( ruleValuedExpression ) | ( ruleBooleanExpression ) );", 7, 7, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BOOLEAN:
            case 14:
                {
                alt7=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1118:1: rule__Expression__Alternatives : ( ( ruleValuedExpression ) | ( ruleBooleanExpression ) );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1123:1: ( ruleValuedExpression )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1123:1: ( ruleValuedExpression )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1124:1: ruleValuedExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_rule__Expression__Alternatives2339);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1129:6: ( ruleBooleanExpression )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1129:6: ( ruleBooleanExpression )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1130:1: ruleBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_rule__Expression__Alternatives2356);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1141:1: rule__CompareOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1145:1: ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt8=1;
                }
                break;
            case 20:
                {
                alt8=2;
                }
                break;
            case 21:
                {
                alt8=3;
                }
                break;
            case 22:
                {
                alt8=4;
                }
                break;
            case 23:
                {
                alt8=5;
                }
                break;
            case 24:
                {
                alt8=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1141:1: rule__CompareOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) );", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1146:1: ( ( '=' ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1146:1: ( ( '=' ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1147:1: ( '=' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1148:1: ( '=' )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1148:3: '='
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__CompareOperator__Alternatives2390); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1153:6: ( ( '<' ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1153:6: ( ( '<' ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1154:1: ( '<' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1155:1: ( '<' )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1155:3: '<'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__CompareOperator__Alternatives2411); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1160:6: ( ( '<=' ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1160:6: ( ( '<=' ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1161:1: ( '<=' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1162:1: ( '<=' )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1162:3: '<='
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__CompareOperator__Alternatives2432); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1167:6: ( ( '>' ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1167:6: ( ( '>' ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1168:1: ( '>' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1169:1: ( '>' )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1169:3: '>'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__CompareOperator__Alternatives2453); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1174:6: ( ( '>=' ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1174:6: ( ( '>=' ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1175:1: ( '>=' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1176:1: ( '>=' )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1176:3: '>='
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__CompareOperator__Alternatives2474); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1181:6: ( ( '<>' ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1181:6: ( ( '<>' ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1182:1: ( '<>' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_5()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1183:1: ( '<>' )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1183:3: '<>'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__CompareOperator__Alternatives2495); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1193:1: rule__PlusOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__PlusOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1197:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            else if ( (LA9_0==26) ) {
                alt9=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1193:1: rule__PlusOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1198:1: ( ( '+' ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1198:1: ( ( '+' ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1199:1: ( '+' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPlusOperatorAccess().getADDEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1200:1: ( '+' )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1200:3: '+'
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_rule__PlusOperator__Alternatives2531); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getPlusOperatorAccess().getADDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1205:6: ( ( '-' ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1205:6: ( ( '-' ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1206:1: ( '-' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPlusOperatorAccess().getSUBEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1207:1: ( '-' )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1207:3: '-'
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_rule__PlusOperator__Alternatives2552); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1217:1: rule__MultOperator__Alternatives : ( ( ( '*' ) ) | ( ( 'mod' ) ) );
    public final void rule__MultOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1221:1: ( ( ( '*' ) ) | ( ( 'mod' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            else if ( (LA10_0==28) ) {
                alt10=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1217:1: rule__MultOperator__Alternatives : ( ( ( '*' ) ) | ( ( 'mod' ) ) );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1222:1: ( ( '*' ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1222:1: ( ( '*' ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1223:1: ( '*' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1224:1: ( '*' )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1224:3: '*'
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_rule__MultOperator__Alternatives2588); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1229:6: ( ( 'mod' ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1229:6: ( ( 'mod' ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1230:1: ( 'mod' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMultOperatorAccess().getMODEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1231:1: ( 'mod' )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1231:3: 'mod'
                    {
                    match(input,28,FollowSets000.FOLLOW_28_in_rule__MultOperator__Alternatives2609); if (failed) return ;

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


    // $ANTLR start rule__SignalReference__Group__0
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1245:1: rule__SignalReference__Group__0 : rule__SignalReference__Group__0__Impl rule__SignalReference__Group__1 ;
    public final void rule__SignalReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1249:1: ( rule__SignalReference__Group__0__Impl rule__SignalReference__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1250:2: rule__SignalReference__Group__0__Impl rule__SignalReference__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SignalReference__Group__0__Impl_in_rule__SignalReference__Group__02644);
            rule__SignalReference__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SignalReference__Group__1_in_rule__SignalReference__Group__02647);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1257:1: rule__SignalReference__Group__0__Impl : ( ( rule__SignalReference__SignalAssignment_0 ) ) ;
    public final void rule__SignalReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1261:1: ( ( ( rule__SignalReference__SignalAssignment_0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1262:1: ( ( rule__SignalReference__SignalAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1262:1: ( ( rule__SignalReference__SignalAssignment_0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1263:1: ( rule__SignalReference__SignalAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getSignalAssignment_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1264:1: ( rule__SignalReference__SignalAssignment_0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1264:2: rule__SignalReference__SignalAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SignalReference__SignalAssignment_0_in_rule__SignalReference__Group__0__Impl2674);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1274:1: rule__SignalReference__Group__1 : rule__SignalReference__Group__1__Impl ;
    public final void rule__SignalReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1278:1: ( rule__SignalReference__Group__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1279:2: rule__SignalReference__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SignalReference__Group__1__Impl_in_rule__SignalReference__Group__12704);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1285:1: rule__SignalReference__Group__1__Impl : ( ( rule__SignalReference__Group_1__0 )? ) ;
    public final void rule__SignalReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1289:1: ( ( ( rule__SignalReference__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1290:1: ( ( rule__SignalReference__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1290:1: ( ( rule__SignalReference__Group_1__0 )? )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1291:1: ( rule__SignalReference__Group_1__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1292:1: ( rule__SignalReference__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                int LA11_1 = input.LA(2);

                if ( (synpred25()) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1292:2: rule__SignalReference__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SignalReference__Group_1__0_in_rule__SignalReference__Group__1__Impl2731);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1306:1: rule__SignalReference__Group_1__0 : rule__SignalReference__Group_1__0__Impl rule__SignalReference__Group_1__1 ;
    public final void rule__SignalReference__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1310:1: ( rule__SignalReference__Group_1__0__Impl rule__SignalReference__Group_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1311:2: rule__SignalReference__Group_1__0__Impl rule__SignalReference__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SignalReference__Group_1__0__Impl_in_rule__SignalReference__Group_1__02766);
            rule__SignalReference__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SignalReference__Group_1__1_in_rule__SignalReference__Group_1__02769);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1318:1: rule__SignalReference__Group_1__0__Impl : ( '(' ) ;
    public final void rule__SignalReference__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1322:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1323:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1323:1: ( '(' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1324:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__SignalReference__Group_1__0__Impl2797); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1337:1: rule__SignalReference__Group_1__1 : rule__SignalReference__Group_1__1__Impl rule__SignalReference__Group_1__2 ;
    public final void rule__SignalReference__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1341:1: ( rule__SignalReference__Group_1__1__Impl rule__SignalReference__Group_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1342:2: rule__SignalReference__Group_1__1__Impl rule__SignalReference__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SignalReference__Group_1__1__Impl_in_rule__SignalReference__Group_1__12828);
            rule__SignalReference__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SignalReference__Group_1__2_in_rule__SignalReference__Group_1__12831);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1349:1: rule__SignalReference__Group_1__1__Impl : ( ( rule__SignalReference__Group_1_1__0 )* ) ;
    public final void rule__SignalReference__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1353:1: ( ( ( rule__SignalReference__Group_1_1__0 )* ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1354:1: ( ( rule__SignalReference__Group_1_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1354:1: ( ( rule__SignalReference__Group_1_1__0 )* )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1355:1: ( rule__SignalReference__Group_1_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getGroup_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1356:1: ( rule__SignalReference__Group_1_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_STRING)||(LA12_0>=13 && LA12_0<=15)||LA12_0==29) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1356:2: rule__SignalReference__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SignalReference__Group_1_1__0_in_rule__SignalReference__Group_1__1__Impl2858);
            	    rule__SignalReference__Group_1_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1366:1: rule__SignalReference__Group_1__2 : rule__SignalReference__Group_1__2__Impl ;
    public final void rule__SignalReference__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1370:1: ( rule__SignalReference__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1371:2: rule__SignalReference__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SignalReference__Group_1__2__Impl_in_rule__SignalReference__Group_1__22889);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1377:1: rule__SignalReference__Group_1__2__Impl : ( ')' ) ;
    public final void rule__SignalReference__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1381:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1382:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1382:1: ( ')' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1383:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__SignalReference__Group_1__2__Impl2917); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1402:1: rule__SignalReference__Group_1_1__0 : rule__SignalReference__Group_1_1__0__Impl rule__SignalReference__Group_1_1__1 ;
    public final void rule__SignalReference__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1406:1: ( rule__SignalReference__Group_1_1__0__Impl rule__SignalReference__Group_1_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1407:2: rule__SignalReference__Group_1_1__0__Impl rule__SignalReference__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SignalReference__Group_1_1__0__Impl_in_rule__SignalReference__Group_1_1__02954);
            rule__SignalReference__Group_1_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SignalReference__Group_1_1__1_in_rule__SignalReference__Group_1_1__02957);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1414:1: rule__SignalReference__Group_1_1__0__Impl : ( ( rule__SignalReference__SubExpressionsAssignment_1_1_0 ) ) ;
    public final void rule__SignalReference__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1418:1: ( ( ( rule__SignalReference__SubExpressionsAssignment_1_1_0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1419:1: ( ( rule__SignalReference__SubExpressionsAssignment_1_1_0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1419:1: ( ( rule__SignalReference__SubExpressionsAssignment_1_1_0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1420:1: ( rule__SignalReference__SubExpressionsAssignment_1_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getSubExpressionsAssignment_1_1_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1421:1: ( rule__SignalReference__SubExpressionsAssignment_1_1_0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1421:2: rule__SignalReference__SubExpressionsAssignment_1_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SignalReference__SubExpressionsAssignment_1_1_0_in_rule__SignalReference__Group_1_1__0__Impl2984);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1431:1: rule__SignalReference__Group_1_1__1 : rule__SignalReference__Group_1_1__1__Impl ;
    public final void rule__SignalReference__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1435:1: ( rule__SignalReference__Group_1_1__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1436:2: rule__SignalReference__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SignalReference__Group_1_1__1__Impl_in_rule__SignalReference__Group_1_1__13014);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1442:1: rule__SignalReference__Group_1_1__1__Impl : ( ( ',' )? ) ;
    public final void rule__SignalReference__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1446:1: ( ( ( ',' )? ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1447:1: ( ( ',' )? )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1447:1: ( ( ',' )? )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1448:1: ( ',' )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getCommaKeyword_1_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1449:1: ( ',' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1450:2: ','
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_rule__SignalReference__Group_1_1__1__Impl3043); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1465:1: rule__VariableReference__Group__0 : rule__VariableReference__Group__0__Impl rule__VariableReference__Group__1 ;
    public final void rule__VariableReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1469:1: ( rule__VariableReference__Group__0__Impl rule__VariableReference__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1470:2: rule__VariableReference__Group__0__Impl rule__VariableReference__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group__0__Impl_in_rule__VariableReference__Group__03080);
            rule__VariableReference__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group__1_in_rule__VariableReference__Group__03083);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1477:1: rule__VariableReference__Group__0__Impl : ( ( rule__VariableReference__VariableAssignment_0 ) ) ;
    public final void rule__VariableReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1481:1: ( ( ( rule__VariableReference__VariableAssignment_0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1482:1: ( ( rule__VariableReference__VariableAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1482:1: ( ( rule__VariableReference__VariableAssignment_0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1483:1: ( rule__VariableReference__VariableAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getVariableAssignment_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1484:1: ( rule__VariableReference__VariableAssignment_0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1484:2: rule__VariableReference__VariableAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__VariableAssignment_0_in_rule__VariableReference__Group__0__Impl3110);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1494:1: rule__VariableReference__Group__1 : rule__VariableReference__Group__1__Impl ;
    public final void rule__VariableReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1498:1: ( rule__VariableReference__Group__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1499:2: rule__VariableReference__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group__1__Impl_in_rule__VariableReference__Group__13140);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1505:1: rule__VariableReference__Group__1__Impl : ( ( rule__VariableReference__Group_1__0 )? ) ;
    public final void rule__VariableReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1509:1: ( ( ( rule__VariableReference__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1510:1: ( ( rule__VariableReference__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1510:1: ( ( rule__VariableReference__Group_1__0 )? )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1511:1: ( rule__VariableReference__Group_1__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1512:1: ( rule__VariableReference__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                int LA14_1 = input.LA(2);

                if ( (synpred28()) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1512:2: rule__VariableReference__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group_1__0_in_rule__VariableReference__Group__1__Impl3167);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1526:1: rule__VariableReference__Group_1__0 : rule__VariableReference__Group_1__0__Impl rule__VariableReference__Group_1__1 ;
    public final void rule__VariableReference__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1530:1: ( rule__VariableReference__Group_1__0__Impl rule__VariableReference__Group_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1531:2: rule__VariableReference__Group_1__0__Impl rule__VariableReference__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group_1__0__Impl_in_rule__VariableReference__Group_1__03202);
            rule__VariableReference__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group_1__1_in_rule__VariableReference__Group_1__03205);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1538:1: rule__VariableReference__Group_1__0__Impl : ( '(' ) ;
    public final void rule__VariableReference__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1542:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1543:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1543:1: ( '(' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1544:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__VariableReference__Group_1__0__Impl3233); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1557:1: rule__VariableReference__Group_1__1 : rule__VariableReference__Group_1__1__Impl rule__VariableReference__Group_1__2 ;
    public final void rule__VariableReference__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1561:1: ( rule__VariableReference__Group_1__1__Impl rule__VariableReference__Group_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1562:2: rule__VariableReference__Group_1__1__Impl rule__VariableReference__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group_1__1__Impl_in_rule__VariableReference__Group_1__13264);
            rule__VariableReference__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group_1__2_in_rule__VariableReference__Group_1__13267);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1569:1: rule__VariableReference__Group_1__1__Impl : ( ( rule__VariableReference__Group_1_1__0 )* ) ;
    public final void rule__VariableReference__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1573:1: ( ( ( rule__VariableReference__Group_1_1__0 )* ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1574:1: ( ( rule__VariableReference__Group_1_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1574:1: ( ( rule__VariableReference__Group_1_1__0 )* )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1575:1: ( rule__VariableReference__Group_1_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getGroup_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1576:1: ( rule__VariableReference__Group_1_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_STRING)||(LA15_0>=13 && LA15_0<=15)||LA15_0==29) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1576:2: rule__VariableReference__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group_1_1__0_in_rule__VariableReference__Group_1__1__Impl3294);
            	    rule__VariableReference__Group_1_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1586:1: rule__VariableReference__Group_1__2 : rule__VariableReference__Group_1__2__Impl ;
    public final void rule__VariableReference__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1590:1: ( rule__VariableReference__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1591:2: rule__VariableReference__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group_1__2__Impl_in_rule__VariableReference__Group_1__23325);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1597:1: rule__VariableReference__Group_1__2__Impl : ( ')' ) ;
    public final void rule__VariableReference__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1601:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1602:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1602:1: ( ')' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1603:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__VariableReference__Group_1__2__Impl3353); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1622:1: rule__VariableReference__Group_1_1__0 : rule__VariableReference__Group_1_1__0__Impl rule__VariableReference__Group_1_1__1 ;
    public final void rule__VariableReference__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1626:1: ( rule__VariableReference__Group_1_1__0__Impl rule__VariableReference__Group_1_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1627:2: rule__VariableReference__Group_1_1__0__Impl rule__VariableReference__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group_1_1__0__Impl_in_rule__VariableReference__Group_1_1__03390);
            rule__VariableReference__Group_1_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group_1_1__1_in_rule__VariableReference__Group_1_1__03393);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1634:1: rule__VariableReference__Group_1_1__0__Impl : ( ( rule__VariableReference__SubExpressionsAssignment_1_1_0 ) ) ;
    public final void rule__VariableReference__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1638:1: ( ( ( rule__VariableReference__SubExpressionsAssignment_1_1_0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1639:1: ( ( rule__VariableReference__SubExpressionsAssignment_1_1_0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1639:1: ( ( rule__VariableReference__SubExpressionsAssignment_1_1_0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1640:1: ( rule__VariableReference__SubExpressionsAssignment_1_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getSubExpressionsAssignment_1_1_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1641:1: ( rule__VariableReference__SubExpressionsAssignment_1_1_0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1641:2: rule__VariableReference__SubExpressionsAssignment_1_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__SubExpressionsAssignment_1_1_0_in_rule__VariableReference__Group_1_1__0__Impl3420);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1651:1: rule__VariableReference__Group_1_1__1 : rule__VariableReference__Group_1_1__1__Impl ;
    public final void rule__VariableReference__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1655:1: ( rule__VariableReference__Group_1_1__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1656:2: rule__VariableReference__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group_1_1__1__Impl_in_rule__VariableReference__Group_1_1__13450);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1662:1: rule__VariableReference__Group_1_1__1__Impl : ( ( ',' )? ) ;
    public final void rule__VariableReference__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1666:1: ( ( ( ',' )? ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1667:1: ( ( ',' )? )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1667:1: ( ( ',' )? )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1668:1: ( ',' )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getCommaKeyword_1_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1669:1: ( ',' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1670:2: ','
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_rule__VariableReference__Group_1_1__1__Impl3479); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1685:1: rule__ValOperation__Group__0 : rule__ValOperation__Group__0__Impl rule__ValOperation__Group__1 ;
    public final void rule__ValOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1689:1: ( rule__ValOperation__Group__0__Impl rule__ValOperation__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1690:2: rule__ValOperation__Group__0__Impl rule__ValOperation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValOperation__Group__0__Impl_in_rule__ValOperation__Group__03516);
            rule__ValOperation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValOperation__Group__1_in_rule__ValOperation__Group__03519);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1697:1: rule__ValOperation__Group__0__Impl : ( ( rule__ValOperation__OperatorAssignment_0 ) ) ;
    public final void rule__ValOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1701:1: ( ( ( rule__ValOperation__OperatorAssignment_0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1702:1: ( ( rule__ValOperation__OperatorAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1702:1: ( ( rule__ValOperation__OperatorAssignment_0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1703:1: ( rule__ValOperation__OperatorAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValOperationAccess().getOperatorAssignment_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1704:1: ( rule__ValOperation__OperatorAssignment_0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1704:2: rule__ValOperation__OperatorAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValOperation__OperatorAssignment_0_in_rule__ValOperation__Group__0__Impl3546);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1714:1: rule__ValOperation__Group__1 : rule__ValOperation__Group__1__Impl ;
    public final void rule__ValOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1718:1: ( rule__ValOperation__Group__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1719:2: rule__ValOperation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValOperation__Group__1__Impl_in_rule__ValOperation__Group__13576);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1725:1: rule__ValOperation__Group__1__Impl : ( ( rule__ValOperation__SubExpressionsAssignment_1 ) ) ;
    public final void rule__ValOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1729:1: ( ( ( rule__ValOperation__SubExpressionsAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1730:1: ( ( rule__ValOperation__SubExpressionsAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1730:1: ( ( rule__ValOperation__SubExpressionsAssignment_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1731:1: ( rule__ValOperation__SubExpressionsAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValOperationAccess().getSubExpressionsAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1732:1: ( rule__ValOperation__SubExpressionsAssignment_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1732:2: rule__ValOperation__SubExpressionsAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValOperation__SubExpressionsAssignment_1_in_rule__ValOperation__Group__1__Impl3603);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1746:1: rule__ParanthesedValuedExpression__Group_5__0 : rule__ParanthesedValuedExpression__Group_5__0__Impl rule__ParanthesedValuedExpression__Group_5__1 ;
    public final void rule__ParanthesedValuedExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1750:1: ( rule__ParanthesedValuedExpression__Group_5__0__Impl rule__ParanthesedValuedExpression__Group_5__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1751:2: rule__ParanthesedValuedExpression__Group_5__0__Impl rule__ParanthesedValuedExpression__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParanthesedValuedExpression__Group_5__0__Impl_in_rule__ParanthesedValuedExpression__Group_5__03637);
            rule__ParanthesedValuedExpression__Group_5__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ParanthesedValuedExpression__Group_5__1_in_rule__ParanthesedValuedExpression__Group_5__03640);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1758:1: rule__ParanthesedValuedExpression__Group_5__0__Impl : ( '(' ) ;
    public final void rule__ParanthesedValuedExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1762:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1763:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1763:1: ( '(' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1764:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedValuedExpressionAccess().getLeftParenthesisKeyword_5_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__ParanthesedValuedExpression__Group_5__0__Impl3668); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1777:1: rule__ParanthesedValuedExpression__Group_5__1 : rule__ParanthesedValuedExpression__Group_5__1__Impl rule__ParanthesedValuedExpression__Group_5__2 ;
    public final void rule__ParanthesedValuedExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1781:1: ( rule__ParanthesedValuedExpression__Group_5__1__Impl rule__ParanthesedValuedExpression__Group_5__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1782:2: rule__ParanthesedValuedExpression__Group_5__1__Impl rule__ParanthesedValuedExpression__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParanthesedValuedExpression__Group_5__1__Impl_in_rule__ParanthesedValuedExpression__Group_5__13699);
            rule__ParanthesedValuedExpression__Group_5__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ParanthesedValuedExpression__Group_5__2_in_rule__ParanthesedValuedExpression__Group_5__13702);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1789:1: rule__ParanthesedValuedExpression__Group_5__1__Impl : ( rulePlusOperation ) ;
    public final void rule__ParanthesedValuedExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1793:1: ( ( rulePlusOperation ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1794:1: ( rulePlusOperation )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1794:1: ( rulePlusOperation )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1795:1: rulePlusOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedValuedExpressionAccess().getPlusOperationParserRuleCall_5_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePlusOperation_in_rule__ParanthesedValuedExpression__Group_5__1__Impl3729);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1806:1: rule__ParanthesedValuedExpression__Group_5__2 : rule__ParanthesedValuedExpression__Group_5__2__Impl ;
    public final void rule__ParanthesedValuedExpression__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1810:1: ( rule__ParanthesedValuedExpression__Group_5__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1811:2: rule__ParanthesedValuedExpression__Group_5__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParanthesedValuedExpression__Group_5__2__Impl_in_rule__ParanthesedValuedExpression__Group_5__23758);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1817:1: rule__ParanthesedValuedExpression__Group_5__2__Impl : ( ')' ) ;
    public final void rule__ParanthesedValuedExpression__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1821:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1822:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1822:1: ( ')' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1823:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedValuedExpressionAccess().getRightParenthesisKeyword_5_2()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__ParanthesedValuedExpression__Group_5__2__Impl3786); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1842:1: rule__ParanthesedValuedExpression__Group_6__0 : rule__ParanthesedValuedExpression__Group_6__0__Impl rule__ParanthesedValuedExpression__Group_6__1 ;
    public final void rule__ParanthesedValuedExpression__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1846:1: ( rule__ParanthesedValuedExpression__Group_6__0__Impl rule__ParanthesedValuedExpression__Group_6__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1847:2: rule__ParanthesedValuedExpression__Group_6__0__Impl rule__ParanthesedValuedExpression__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParanthesedValuedExpression__Group_6__0__Impl_in_rule__ParanthesedValuedExpression__Group_6__03823);
            rule__ParanthesedValuedExpression__Group_6__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ParanthesedValuedExpression__Group_6__1_in_rule__ParanthesedValuedExpression__Group_6__03826);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1854:1: rule__ParanthesedValuedExpression__Group_6__0__Impl : ( '(' ) ;
    public final void rule__ParanthesedValuedExpression__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1858:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1859:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1859:1: ( '(' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1860:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedValuedExpressionAccess().getLeftParenthesisKeyword_6_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__ParanthesedValuedExpression__Group_6__0__Impl3854); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1873:1: rule__ParanthesedValuedExpression__Group_6__1 : rule__ParanthesedValuedExpression__Group_6__1__Impl rule__ParanthesedValuedExpression__Group_6__2 ;
    public final void rule__ParanthesedValuedExpression__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1877:1: ( rule__ParanthesedValuedExpression__Group_6__1__Impl rule__ParanthesedValuedExpression__Group_6__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1878:2: rule__ParanthesedValuedExpression__Group_6__1__Impl rule__ParanthesedValuedExpression__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParanthesedValuedExpression__Group_6__1__Impl_in_rule__ParanthesedValuedExpression__Group_6__13885);
            rule__ParanthesedValuedExpression__Group_6__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ParanthesedValuedExpression__Group_6__2_in_rule__ParanthesedValuedExpression__Group_6__13888);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1885:1: rule__ParanthesedValuedExpression__Group_6__1__Impl : ( ruleDivOperation ) ;
    public final void rule__ParanthesedValuedExpression__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1889:1: ( ( ruleDivOperation ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1890:1: ( ruleDivOperation )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1890:1: ( ruleDivOperation )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1891:1: ruleDivOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedValuedExpressionAccess().getDivOperationParserRuleCall_6_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivOperation_in_rule__ParanthesedValuedExpression__Group_6__1__Impl3915);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1902:1: rule__ParanthesedValuedExpression__Group_6__2 : rule__ParanthesedValuedExpression__Group_6__2__Impl ;
    public final void rule__ParanthesedValuedExpression__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1906:1: ( rule__ParanthesedValuedExpression__Group_6__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1907:2: rule__ParanthesedValuedExpression__Group_6__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParanthesedValuedExpression__Group_6__2__Impl_in_rule__ParanthesedValuedExpression__Group_6__23944);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1913:1: rule__ParanthesedValuedExpression__Group_6__2__Impl : ( ')' ) ;
    public final void rule__ParanthesedValuedExpression__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1917:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1918:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1918:1: ( ')' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1919:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedValuedExpressionAccess().getRightParenthesisKeyword_6_2()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__ParanthesedValuedExpression__Group_6__2__Impl3972); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1938:1: rule__PlusOperation__Group__0 : rule__PlusOperation__Group__0__Impl rule__PlusOperation__Group__1 ;
    public final void rule__PlusOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1942:1: ( rule__PlusOperation__Group__0__Impl rule__PlusOperation__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1943:2: rule__PlusOperation__Group__0__Impl rule__PlusOperation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PlusOperation__Group__0__Impl_in_rule__PlusOperation__Group__04009);
            rule__PlusOperation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PlusOperation__Group__1_in_rule__PlusOperation__Group__04012);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1950:1: rule__PlusOperation__Group__0__Impl : ( ruleMultOrDivOperation ) ;
    public final void rule__PlusOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1954:1: ( ( ruleMultOrDivOperation ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1955:1: ( ruleMultOrDivOperation )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1955:1: ( ruleMultOrDivOperation )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1956:1: ruleMultOrDivOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getMultOrDivOperationParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultOrDivOperation_in_rule__PlusOperation__Group__0__Impl4039);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1967:1: rule__PlusOperation__Group__1 : rule__PlusOperation__Group__1__Impl ;
    public final void rule__PlusOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1971:1: ( rule__PlusOperation__Group__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1972:2: rule__PlusOperation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PlusOperation__Group__1__Impl_in_rule__PlusOperation__Group__14068);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1978:1: rule__PlusOperation__Group__1__Impl : ( ( rule__PlusOperation__Group_1__0 )* ) ;
    public final void rule__PlusOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1982:1: ( ( ( rule__PlusOperation__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1983:1: ( ( rule__PlusOperation__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1983:1: ( ( rule__PlusOperation__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1984:1: ( rule__PlusOperation__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1985:1: ( rule__PlusOperation__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=25 && LA17_0<=26)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1985:2: rule__PlusOperation__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__PlusOperation__Group_1__0_in_rule__PlusOperation__Group__1__Impl4095);
            	    rule__PlusOperation__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1999:1: rule__PlusOperation__Group_1__0 : rule__PlusOperation__Group_1__0__Impl rule__PlusOperation__Group_1__1 ;
    public final void rule__PlusOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2003:1: ( rule__PlusOperation__Group_1__0__Impl rule__PlusOperation__Group_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2004:2: rule__PlusOperation__Group_1__0__Impl rule__PlusOperation__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PlusOperation__Group_1__0__Impl_in_rule__PlusOperation__Group_1__04130);
            rule__PlusOperation__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PlusOperation__Group_1__1_in_rule__PlusOperation__Group_1__04133);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2011:1: rule__PlusOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__PlusOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2015:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2016:1: ( () )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2016:1: ( () )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2017:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2018:1: ()
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2020:1: 
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2030:1: rule__PlusOperation__Group_1__1 : rule__PlusOperation__Group_1__1__Impl rule__PlusOperation__Group_1__2 ;
    public final void rule__PlusOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2034:1: ( rule__PlusOperation__Group_1__1__Impl rule__PlusOperation__Group_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2035:2: rule__PlusOperation__Group_1__1__Impl rule__PlusOperation__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PlusOperation__Group_1__1__Impl_in_rule__PlusOperation__Group_1__14191);
            rule__PlusOperation__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PlusOperation__Group_1__2_in_rule__PlusOperation__Group_1__14194);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2042:1: rule__PlusOperation__Group_1__1__Impl : ( ( rule__PlusOperation__OperatorAssignment_1_1 ) ) ;
    public final void rule__PlusOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2046:1: ( ( ( rule__PlusOperation__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2047:1: ( ( rule__PlusOperation__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2047:1: ( ( rule__PlusOperation__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2048:1: ( rule__PlusOperation__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2049:1: ( rule__PlusOperation__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2049:2: rule__PlusOperation__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PlusOperation__OperatorAssignment_1_1_in_rule__PlusOperation__Group_1__1__Impl4221);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2059:1: rule__PlusOperation__Group_1__2 : rule__PlusOperation__Group_1__2__Impl ;
    public final void rule__PlusOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2063:1: ( rule__PlusOperation__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2064:2: rule__PlusOperation__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PlusOperation__Group_1__2__Impl_in_rule__PlusOperation__Group_1__24251);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2070:1: rule__PlusOperation__Group_1__2__Impl : ( ( rule__PlusOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__PlusOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2074:1: ( ( ( rule__PlusOperation__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2075:1: ( ( rule__PlusOperation__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2075:1: ( ( rule__PlusOperation__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2076:1: ( rule__PlusOperation__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2077:1: ( rule__PlusOperation__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2077:2: rule__PlusOperation__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PlusOperation__SubExpressionsAssignment_1_2_in_rule__PlusOperation__Group_1__2__Impl4278);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2093:1: rule__MultOrDivOperation__Group_1__0 : rule__MultOrDivOperation__Group_1__0__Impl rule__MultOrDivOperation__Group_1__1 ;
    public final void rule__MultOrDivOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2097:1: ( rule__MultOrDivOperation__Group_1__0__Impl rule__MultOrDivOperation__Group_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2098:2: rule__MultOrDivOperation__Group_1__0__Impl rule__MultOrDivOperation__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultOrDivOperation__Group_1__0__Impl_in_rule__MultOrDivOperation__Group_1__04314);
            rule__MultOrDivOperation__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MultOrDivOperation__Group_1__1_in_rule__MultOrDivOperation__Group_1__04317);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2105:1: rule__MultOrDivOperation__Group_1__0__Impl : ( '(' ) ;
    public final void rule__MultOrDivOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2109:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2110:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2110:1: ( '(' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2111:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOrDivOperationAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__MultOrDivOperation__Group_1__0__Impl4345); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2124:1: rule__MultOrDivOperation__Group_1__1 : rule__MultOrDivOperation__Group_1__1__Impl rule__MultOrDivOperation__Group_1__2 ;
    public final void rule__MultOrDivOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2128:1: ( rule__MultOrDivOperation__Group_1__1__Impl rule__MultOrDivOperation__Group_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2129:2: rule__MultOrDivOperation__Group_1__1__Impl rule__MultOrDivOperation__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultOrDivOperation__Group_1__1__Impl_in_rule__MultOrDivOperation__Group_1__14376);
            rule__MultOrDivOperation__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MultOrDivOperation__Group_1__2_in_rule__MultOrDivOperation__Group_1__14379);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2136:1: rule__MultOrDivOperation__Group_1__1__Impl : ( ruleDivOperation ) ;
    public final void rule__MultOrDivOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2140:1: ( ( ruleDivOperation ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2141:1: ( ruleDivOperation )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2141:1: ( ruleDivOperation )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2142:1: ruleDivOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOrDivOperationAccess().getDivOperationParserRuleCall_1_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivOperation_in_rule__MultOrDivOperation__Group_1__1__Impl4406);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2153:1: rule__MultOrDivOperation__Group_1__2 : rule__MultOrDivOperation__Group_1__2__Impl ;
    public final void rule__MultOrDivOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2157:1: ( rule__MultOrDivOperation__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2158:2: rule__MultOrDivOperation__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultOrDivOperation__Group_1__2__Impl_in_rule__MultOrDivOperation__Group_1__24435);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2164:1: rule__MultOrDivOperation__Group_1__2__Impl : ( ')' ) ;
    public final void rule__MultOrDivOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2168:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2169:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2169:1: ( ')' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2170:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOrDivOperationAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__MultOrDivOperation__Group_1__2__Impl4463); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2189:1: rule__MultOperation__Group__0 : rule__MultOperation__Group__0__Impl rule__MultOperation__Group__1 ;
    public final void rule__MultOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2193:1: ( rule__MultOperation__Group__0__Impl rule__MultOperation__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2194:2: rule__MultOperation__Group__0__Impl rule__MultOperation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultOperation__Group__0__Impl_in_rule__MultOperation__Group__04500);
            rule__MultOperation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MultOperation__Group__1_in_rule__MultOperation__Group__04503);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2201:1: rule__MultOperation__Group__0__Impl : ( rulePreOrNormalValuedExpression ) ;
    public final void rule__MultOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2205:1: ( ( rulePreOrNormalValuedExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2206:1: ( rulePreOrNormalValuedExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2206:1: ( rulePreOrNormalValuedExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2207:1: rulePreOrNormalValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getPreOrNormalValuedExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePreOrNormalValuedExpression_in_rule__MultOperation__Group__0__Impl4530);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2218:1: rule__MultOperation__Group__1 : rule__MultOperation__Group__1__Impl ;
    public final void rule__MultOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2222:1: ( rule__MultOperation__Group__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2223:2: rule__MultOperation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultOperation__Group__1__Impl_in_rule__MultOperation__Group__14559);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2229:1: rule__MultOperation__Group__1__Impl : ( ( rule__MultOperation__Group_1__0 )* ) ;
    public final void rule__MultOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2233:1: ( ( ( rule__MultOperation__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2234:1: ( ( rule__MultOperation__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2234:1: ( ( rule__MultOperation__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2235:1: ( rule__MultOperation__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2236:1: ( rule__MultOperation__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=27 && LA18_0<=28)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2236:2: rule__MultOperation__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MultOperation__Group_1__0_in_rule__MultOperation__Group__1__Impl4586);
            	    rule__MultOperation__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2250:1: rule__MultOperation__Group_1__0 : rule__MultOperation__Group_1__0__Impl rule__MultOperation__Group_1__1 ;
    public final void rule__MultOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2254:1: ( rule__MultOperation__Group_1__0__Impl rule__MultOperation__Group_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2255:2: rule__MultOperation__Group_1__0__Impl rule__MultOperation__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultOperation__Group_1__0__Impl_in_rule__MultOperation__Group_1__04621);
            rule__MultOperation__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MultOperation__Group_1__1_in_rule__MultOperation__Group_1__04624);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2262:1: rule__MultOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__MultOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2266:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2267:1: ( () )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2267:1: ( () )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2268:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2269:1: ()
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2271:1: 
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2281:1: rule__MultOperation__Group_1__1 : rule__MultOperation__Group_1__1__Impl rule__MultOperation__Group_1__2 ;
    public final void rule__MultOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2285:1: ( rule__MultOperation__Group_1__1__Impl rule__MultOperation__Group_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2286:2: rule__MultOperation__Group_1__1__Impl rule__MultOperation__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultOperation__Group_1__1__Impl_in_rule__MultOperation__Group_1__14682);
            rule__MultOperation__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MultOperation__Group_1__2_in_rule__MultOperation__Group_1__14685);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2293:1: rule__MultOperation__Group_1__1__Impl : ( ( rule__MultOperation__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2297:1: ( ( ( rule__MultOperation__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2298:1: ( ( rule__MultOperation__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2298:1: ( ( rule__MultOperation__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2299:1: ( rule__MultOperation__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2300:1: ( rule__MultOperation__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2300:2: rule__MultOperation__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultOperation__OperatorAssignment_1_1_in_rule__MultOperation__Group_1__1__Impl4712);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2310:1: rule__MultOperation__Group_1__2 : rule__MultOperation__Group_1__2__Impl ;
    public final void rule__MultOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2314:1: ( rule__MultOperation__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2315:2: rule__MultOperation__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultOperation__Group_1__2__Impl_in_rule__MultOperation__Group_1__24742);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2321:1: rule__MultOperation__Group_1__2__Impl : ( ( rule__MultOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__MultOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2325:1: ( ( ( rule__MultOperation__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2326:1: ( ( rule__MultOperation__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2326:1: ( ( rule__MultOperation__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2327:1: ( rule__MultOperation__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2328:1: ( rule__MultOperation__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2328:2: rule__MultOperation__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultOperation__SubExpressionsAssignment_1_2_in_rule__MultOperation__Group_1__2__Impl4769);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2344:1: rule__DivOperation__Group__0 : rule__DivOperation__Group__0__Impl rule__DivOperation__Group__1 ;
    public final void rule__DivOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2348:1: ( rule__DivOperation__Group__0__Impl rule__DivOperation__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2349:2: rule__DivOperation__Group__0__Impl rule__DivOperation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivOperation__Group__0__Impl_in_rule__DivOperation__Group__04805);
            rule__DivOperation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DivOperation__Group__1_in_rule__DivOperation__Group__04808);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2356:1: rule__DivOperation__Group__0__Impl : ( rulePreOrNormalValuedExpression ) ;
    public final void rule__DivOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2360:1: ( ( rulePreOrNormalValuedExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2361:1: ( rulePreOrNormalValuedExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2361:1: ( rulePreOrNormalValuedExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2362:1: rulePreOrNormalValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getPreOrNormalValuedExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePreOrNormalValuedExpression_in_rule__DivOperation__Group__0__Impl4835);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2373:1: rule__DivOperation__Group__1 : rule__DivOperation__Group__1__Impl ;
    public final void rule__DivOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2377:1: ( rule__DivOperation__Group__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2378:2: rule__DivOperation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivOperation__Group__1__Impl_in_rule__DivOperation__Group__14864);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2384:1: rule__DivOperation__Group__1__Impl : ( ( rule__DivOperation__Group_1__0 )* ) ;
    public final void rule__DivOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2388:1: ( ( ( rule__DivOperation__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2389:1: ( ( rule__DivOperation__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2389:1: ( ( rule__DivOperation__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2390:1: ( rule__DivOperation__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2391:1: ( rule__DivOperation__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==18) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2391:2: rule__DivOperation__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__DivOperation__Group_1__0_in_rule__DivOperation__Group__1__Impl4891);
            	    rule__DivOperation__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2405:1: rule__DivOperation__Group_1__0 : rule__DivOperation__Group_1__0__Impl rule__DivOperation__Group_1__1 ;
    public final void rule__DivOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2409:1: ( rule__DivOperation__Group_1__0__Impl rule__DivOperation__Group_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2410:2: rule__DivOperation__Group_1__0__Impl rule__DivOperation__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivOperation__Group_1__0__Impl_in_rule__DivOperation__Group_1__04926);
            rule__DivOperation__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DivOperation__Group_1__1_in_rule__DivOperation__Group_1__04929);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2417:1: rule__DivOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__DivOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2421:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2422:1: ( () )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2422:1: ( () )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2423:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2424:1: ()
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2426:1: 
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2436:1: rule__DivOperation__Group_1__1 : rule__DivOperation__Group_1__1__Impl rule__DivOperation__Group_1__2 ;
    public final void rule__DivOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2440:1: ( rule__DivOperation__Group_1__1__Impl rule__DivOperation__Group_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2441:2: rule__DivOperation__Group_1__1__Impl rule__DivOperation__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivOperation__Group_1__1__Impl_in_rule__DivOperation__Group_1__14987);
            rule__DivOperation__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DivOperation__Group_1__2_in_rule__DivOperation__Group_1__14990);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2448:1: rule__DivOperation__Group_1__1__Impl : ( ( rule__DivOperation__OperatorAssignment_1_1 ) ) ;
    public final void rule__DivOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2452:1: ( ( ( rule__DivOperation__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2453:1: ( ( rule__DivOperation__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2453:1: ( ( rule__DivOperation__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2454:1: ( rule__DivOperation__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2455:1: ( rule__DivOperation__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2455:2: rule__DivOperation__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivOperation__OperatorAssignment_1_1_in_rule__DivOperation__Group_1__1__Impl5017);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2465:1: rule__DivOperation__Group_1__2 : rule__DivOperation__Group_1__2__Impl ;
    public final void rule__DivOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2469:1: ( rule__DivOperation__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2470:2: rule__DivOperation__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivOperation__Group_1__2__Impl_in_rule__DivOperation__Group_1__25047);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2476:1: rule__DivOperation__Group_1__2__Impl : ( ( rule__DivOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__DivOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2480:1: ( ( ( rule__DivOperation__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2481:1: ( ( rule__DivOperation__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2481:1: ( ( rule__DivOperation__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2482:1: ( rule__DivOperation__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2483:1: ( rule__DivOperation__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2483:2: rule__DivOperation__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivOperation__SubExpressionsAssignment_1_2_in_rule__DivOperation__Group_1__2__Impl5074);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2499:1: rule__PreArithmOperation__Group__0 : rule__PreArithmOperation__Group__0__Impl rule__PreArithmOperation__Group__1 ;
    public final void rule__PreArithmOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2503:1: ( rule__PreArithmOperation__Group__0__Impl rule__PreArithmOperation__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2504:2: rule__PreArithmOperation__Group__0__Impl rule__PreArithmOperation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PreArithmOperation__Group__0__Impl_in_rule__PreArithmOperation__Group__05110);
            rule__PreArithmOperation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PreArithmOperation__Group__1_in_rule__PreArithmOperation__Group__05113);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2511:1: rule__PreArithmOperation__Group__0__Impl : ( ( rule__PreArithmOperation__OperatorAssignment_0 ) ) ;
    public final void rule__PreArithmOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2515:1: ( ( ( rule__PreArithmOperation__OperatorAssignment_0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2516:1: ( ( rule__PreArithmOperation__OperatorAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2516:1: ( ( rule__PreArithmOperation__OperatorAssignment_0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2517:1: ( rule__PreArithmOperation__OperatorAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreArithmOperationAccess().getOperatorAssignment_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2518:1: ( rule__PreArithmOperation__OperatorAssignment_0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2518:2: rule__PreArithmOperation__OperatorAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PreArithmOperation__OperatorAssignment_0_in_rule__PreArithmOperation__Group__0__Impl5140);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2528:1: rule__PreArithmOperation__Group__1 : rule__PreArithmOperation__Group__1__Impl rule__PreArithmOperation__Group__2 ;
    public final void rule__PreArithmOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2532:1: ( rule__PreArithmOperation__Group__1__Impl rule__PreArithmOperation__Group__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2533:2: rule__PreArithmOperation__Group__1__Impl rule__PreArithmOperation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PreArithmOperation__Group__1__Impl_in_rule__PreArithmOperation__Group__15170);
            rule__PreArithmOperation__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PreArithmOperation__Group__2_in_rule__PreArithmOperation__Group__15173);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2540:1: rule__PreArithmOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__PreArithmOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2544:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2545:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2545:1: ( '(' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2546:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreArithmOperationAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__PreArithmOperation__Group__1__Impl5201); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2559:1: rule__PreArithmOperation__Group__2 : rule__PreArithmOperation__Group__2__Impl rule__PreArithmOperation__Group__3 ;
    public final void rule__PreArithmOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2563:1: ( rule__PreArithmOperation__Group__2__Impl rule__PreArithmOperation__Group__3 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2564:2: rule__PreArithmOperation__Group__2__Impl rule__PreArithmOperation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PreArithmOperation__Group__2__Impl_in_rule__PreArithmOperation__Group__25232);
            rule__PreArithmOperation__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PreArithmOperation__Group__3_in_rule__PreArithmOperation__Group__25235);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2571:1: rule__PreArithmOperation__Group__2__Impl : ( ( rule__PreArithmOperation__SubExpressionsAssignment_2 ) ) ;
    public final void rule__PreArithmOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2575:1: ( ( ( rule__PreArithmOperation__SubExpressionsAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2576:1: ( ( rule__PreArithmOperation__SubExpressionsAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2576:1: ( ( rule__PreArithmOperation__SubExpressionsAssignment_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2577:1: ( rule__PreArithmOperation__SubExpressionsAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreArithmOperationAccess().getSubExpressionsAssignment_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2578:1: ( rule__PreArithmOperation__SubExpressionsAssignment_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2578:2: rule__PreArithmOperation__SubExpressionsAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PreArithmOperation__SubExpressionsAssignment_2_in_rule__PreArithmOperation__Group__2__Impl5262);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2588:1: rule__PreArithmOperation__Group__3 : rule__PreArithmOperation__Group__3__Impl ;
    public final void rule__PreArithmOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2592:1: ( rule__PreArithmOperation__Group__3__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2593:2: rule__PreArithmOperation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PreArithmOperation__Group__3__Impl_in_rule__PreArithmOperation__Group__35292);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2599:1: rule__PreArithmOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__PreArithmOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2603:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2604:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2604:1: ( ')' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2605:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreArithmOperationAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__PreArithmOperation__Group__3__Impl5320); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2626:1: rule__CompareOperation__Group__0 : rule__CompareOperation__Group__0__Impl rule__CompareOperation__Group__1 ;
    public final void rule__CompareOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2630:1: ( rule__CompareOperation__Group__0__Impl rule__CompareOperation__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2631:2: rule__CompareOperation__Group__0__Impl rule__CompareOperation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group__0__Impl_in_rule__CompareOperation__Group__05359);
            rule__CompareOperation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group__1_in_rule__CompareOperation__Group__05362);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2638:1: rule__CompareOperation__Group__0__Impl : ( ruleValuedExpression ) ;
    public final void rule__CompareOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2642:1: ( ( ruleValuedExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2643:1: ( ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2643:1: ( ruleValuedExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2644:1: ruleValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getValuedExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_rule__CompareOperation__Group__0__Impl5389);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2655:1: rule__CompareOperation__Group__1 : rule__CompareOperation__Group__1__Impl ;
    public final void rule__CompareOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2659:1: ( rule__CompareOperation__Group__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2660:2: rule__CompareOperation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group__1__Impl_in_rule__CompareOperation__Group__15418);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2666:1: rule__CompareOperation__Group__1__Impl : ( ( rule__CompareOperation__Group_1__0 ) ) ;
    public final void rule__CompareOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2670:1: ( ( ( rule__CompareOperation__Group_1__0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2671:1: ( ( rule__CompareOperation__Group_1__0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2671:1: ( ( rule__CompareOperation__Group_1__0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2672:1: ( rule__CompareOperation__Group_1__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2673:1: ( rule__CompareOperation__Group_1__0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2673:2: rule__CompareOperation__Group_1__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_1__0_in_rule__CompareOperation__Group__1__Impl5445);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2687:1: rule__CompareOperation__Group_1__0 : rule__CompareOperation__Group_1__0__Impl rule__CompareOperation__Group_1__1 ;
    public final void rule__CompareOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2691:1: ( rule__CompareOperation__Group_1__0__Impl rule__CompareOperation__Group_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2692:2: rule__CompareOperation__Group_1__0__Impl rule__CompareOperation__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_1__0__Impl_in_rule__CompareOperation__Group_1__05479);
            rule__CompareOperation__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_1__1_in_rule__CompareOperation__Group_1__05482);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2699:1: rule__CompareOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__CompareOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2703:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2704:1: ( () )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2704:1: ( () )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2705:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2706:1: ()
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2708:1: 
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2718:1: rule__CompareOperation__Group_1__1 : rule__CompareOperation__Group_1__1__Impl rule__CompareOperation__Group_1__2 ;
    public final void rule__CompareOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2722:1: ( rule__CompareOperation__Group_1__1__Impl rule__CompareOperation__Group_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2723:2: rule__CompareOperation__Group_1__1__Impl rule__CompareOperation__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_1__1__Impl_in_rule__CompareOperation__Group_1__15540);
            rule__CompareOperation__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_1__2_in_rule__CompareOperation__Group_1__15543);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2730:1: rule__CompareOperation__Group_1__1__Impl : ( ( rule__CompareOperation__OperatorAssignment_1_1 ) ) ;
    public final void rule__CompareOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2734:1: ( ( ( rule__CompareOperation__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2735:1: ( ( rule__CompareOperation__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2735:1: ( ( rule__CompareOperation__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2736:1: ( rule__CompareOperation__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2737:1: ( rule__CompareOperation__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2737:2: rule__CompareOperation__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__OperatorAssignment_1_1_in_rule__CompareOperation__Group_1__1__Impl5570);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2747:1: rule__CompareOperation__Group_1__2 : rule__CompareOperation__Group_1__2__Impl ;
    public final void rule__CompareOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2751:1: ( rule__CompareOperation__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2752:2: rule__CompareOperation__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_1__2__Impl_in_rule__CompareOperation__Group_1__25600);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2758:1: rule__CompareOperation__Group_1__2__Impl : ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__CompareOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2762:1: ( ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2763:1: ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2763:1: ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2764:1: ( rule__CompareOperation__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2765:1: ( rule__CompareOperation__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2765:2: rule__CompareOperation__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__SubExpressionsAssignment_1_2_in_rule__CompareOperation__Group_1__2__Impl5627);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2781:1: rule__UnaryOperation__Group__0 : rule__UnaryOperation__Group__0__Impl rule__UnaryOperation__Group__1 ;
    public final void rule__UnaryOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2785:1: ( rule__UnaryOperation__Group__0__Impl rule__UnaryOperation__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2786:2: rule__UnaryOperation__Group__0__Impl rule__UnaryOperation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__Group__0__Impl_in_rule__UnaryOperation__Group__05663);
            rule__UnaryOperation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__Group__1_in_rule__UnaryOperation__Group__05666);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2793:1: rule__UnaryOperation__Group__0__Impl : ( ( rule__UnaryOperation__OperatorAssignment_0 ) ) ;
    public final void rule__UnaryOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2797:1: ( ( ( rule__UnaryOperation__OperatorAssignment_0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2798:1: ( ( rule__UnaryOperation__OperatorAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2798:1: ( ( rule__UnaryOperation__OperatorAssignment_0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2799:1: ( rule__UnaryOperation__OperatorAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getOperatorAssignment_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2800:1: ( rule__UnaryOperation__OperatorAssignment_0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2800:2: rule__UnaryOperation__OperatorAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__OperatorAssignment_0_in_rule__UnaryOperation__Group__0__Impl5693);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2810:1: rule__UnaryOperation__Group__1 : rule__UnaryOperation__Group__1__Impl ;
    public final void rule__UnaryOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2814:1: ( rule__UnaryOperation__Group__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2815:2: rule__UnaryOperation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__Group__1__Impl_in_rule__UnaryOperation__Group__15723);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2821:1: rule__UnaryOperation__Group__1__Impl : ( ( rule__UnaryOperation__SubExpressionsAssignment_1 ) ) ;
    public final void rule__UnaryOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2825:1: ( ( ( rule__UnaryOperation__SubExpressionsAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2826:1: ( ( rule__UnaryOperation__SubExpressionsAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2826:1: ( ( rule__UnaryOperation__SubExpressionsAssignment_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2827:1: ( rule__UnaryOperation__SubExpressionsAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getSubExpressionsAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2828:1: ( rule__UnaryOperation__SubExpressionsAssignment_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2828:2: rule__UnaryOperation__SubExpressionsAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__SubExpressionsAssignment_1_in_rule__UnaryOperation__Group__1__Impl5750);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2842:1: rule__UnaryParanthesedOperation__Group__0 : rule__UnaryParanthesedOperation__Group__0__Impl rule__UnaryParanthesedOperation__Group__1 ;
    public final void rule__UnaryParanthesedOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2846:1: ( rule__UnaryParanthesedOperation__Group__0__Impl rule__UnaryParanthesedOperation__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2847:2: rule__UnaryParanthesedOperation__Group__0__Impl rule__UnaryParanthesedOperation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryParanthesedOperation__Group__0__Impl_in_rule__UnaryParanthesedOperation__Group__05784);
            rule__UnaryParanthesedOperation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__UnaryParanthesedOperation__Group__1_in_rule__UnaryParanthesedOperation__Group__05787);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2854:1: rule__UnaryParanthesedOperation__Group__0__Impl : ( ( rule__UnaryParanthesedOperation__OperatorAssignment_0 ) ) ;
    public final void rule__UnaryParanthesedOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2858:1: ( ( ( rule__UnaryParanthesedOperation__OperatorAssignment_0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2859:1: ( ( rule__UnaryParanthesedOperation__OperatorAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2859:1: ( ( rule__UnaryParanthesedOperation__OperatorAssignment_0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2860:1: ( rule__UnaryParanthesedOperation__OperatorAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperationAccess().getOperatorAssignment_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2861:1: ( rule__UnaryParanthesedOperation__OperatorAssignment_0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2861:2: rule__UnaryParanthesedOperation__OperatorAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryParanthesedOperation__OperatorAssignment_0_in_rule__UnaryParanthesedOperation__Group__0__Impl5814);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2871:1: rule__UnaryParanthesedOperation__Group__1 : rule__UnaryParanthesedOperation__Group__1__Impl rule__UnaryParanthesedOperation__Group__2 ;
    public final void rule__UnaryParanthesedOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2875:1: ( rule__UnaryParanthesedOperation__Group__1__Impl rule__UnaryParanthesedOperation__Group__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2876:2: rule__UnaryParanthesedOperation__Group__1__Impl rule__UnaryParanthesedOperation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryParanthesedOperation__Group__1__Impl_in_rule__UnaryParanthesedOperation__Group__15844);
            rule__UnaryParanthesedOperation__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__UnaryParanthesedOperation__Group__2_in_rule__UnaryParanthesedOperation__Group__15847);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2883:1: rule__UnaryParanthesedOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__UnaryParanthesedOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2887:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2888:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2888:1: ( '(' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2889:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperationAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__UnaryParanthesedOperation__Group__1__Impl5875); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2902:1: rule__UnaryParanthesedOperation__Group__2 : rule__UnaryParanthesedOperation__Group__2__Impl rule__UnaryParanthesedOperation__Group__3 ;
    public final void rule__UnaryParanthesedOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2906:1: ( rule__UnaryParanthesedOperation__Group__2__Impl rule__UnaryParanthesedOperation__Group__3 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2907:2: rule__UnaryParanthesedOperation__Group__2__Impl rule__UnaryParanthesedOperation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryParanthesedOperation__Group__2__Impl_in_rule__UnaryParanthesedOperation__Group__25906);
            rule__UnaryParanthesedOperation__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__UnaryParanthesedOperation__Group__3_in_rule__UnaryParanthesedOperation__Group__25909);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2914:1: rule__UnaryParanthesedOperation__Group__2__Impl : ( ( rule__UnaryParanthesedOperation__SubExpressionsAssignment_2 ) ) ;
    public final void rule__UnaryParanthesedOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2918:1: ( ( ( rule__UnaryParanthesedOperation__SubExpressionsAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2919:1: ( ( rule__UnaryParanthesedOperation__SubExpressionsAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2919:1: ( ( rule__UnaryParanthesedOperation__SubExpressionsAssignment_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2920:1: ( rule__UnaryParanthesedOperation__SubExpressionsAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperationAccess().getSubExpressionsAssignment_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2921:1: ( rule__UnaryParanthesedOperation__SubExpressionsAssignment_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2921:2: rule__UnaryParanthesedOperation__SubExpressionsAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryParanthesedOperation__SubExpressionsAssignment_2_in_rule__UnaryParanthesedOperation__Group__2__Impl5936);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2931:1: rule__UnaryParanthesedOperation__Group__3 : rule__UnaryParanthesedOperation__Group__3__Impl ;
    public final void rule__UnaryParanthesedOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2935:1: ( rule__UnaryParanthesedOperation__Group__3__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2936:2: rule__UnaryParanthesedOperation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryParanthesedOperation__Group__3__Impl_in_rule__UnaryParanthesedOperation__Group__35966);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2942:1: rule__UnaryParanthesedOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__UnaryParanthesedOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2946:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2947:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2947:1: ( ')' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2948:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperationAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__UnaryParanthesedOperation__Group__3__Impl5994); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2969:1: rule__AndOperation__Group__0 : rule__AndOperation__Group__0__Impl rule__AndOperation__Group__1 ;
    public final void rule__AndOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2973:1: ( rule__AndOperation__Group__0__Impl rule__AndOperation__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2974:2: rule__AndOperation__Group__0__Impl rule__AndOperation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndOperation__Group__0__Impl_in_rule__AndOperation__Group__06033);
            rule__AndOperation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AndOperation__Group__1_in_rule__AndOperation__Group__06036);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2981:1: rule__AndOperation__Group__0__Impl : ( ruleUnaryOrNormalExpression ) ;
    public final void rule__AndOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2985:1: ( ( ruleUnaryOrNormalExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2986:1: ( ruleUnaryOrNormalExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2986:1: ( ruleUnaryOrNormalExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2987:1: ruleUnaryOrNormalExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getUnaryOrNormalExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOrNormalExpression_in_rule__AndOperation__Group__0__Impl6063);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2998:1: rule__AndOperation__Group__1 : rule__AndOperation__Group__1__Impl ;
    public final void rule__AndOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3002:1: ( rule__AndOperation__Group__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3003:2: rule__AndOperation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndOperation__Group__1__Impl_in_rule__AndOperation__Group__16092);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3009:1: rule__AndOperation__Group__1__Impl : ( ( rule__AndOperation__Group_1__0 )* ) ;
    public final void rule__AndOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3013:1: ( ( ( rule__AndOperation__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3014:1: ( ( rule__AndOperation__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3014:1: ( ( rule__AndOperation__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3015:1: ( rule__AndOperation__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3016:1: ( rule__AndOperation__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==17) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3016:2: rule__AndOperation__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__AndOperation__Group_1__0_in_rule__AndOperation__Group__1__Impl6119);
            	    rule__AndOperation__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3030:1: rule__AndOperation__Group_1__0 : rule__AndOperation__Group_1__0__Impl rule__AndOperation__Group_1__1 ;
    public final void rule__AndOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3034:1: ( rule__AndOperation__Group_1__0__Impl rule__AndOperation__Group_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3035:2: rule__AndOperation__Group_1__0__Impl rule__AndOperation__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndOperation__Group_1__0__Impl_in_rule__AndOperation__Group_1__06154);
            rule__AndOperation__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AndOperation__Group_1__1_in_rule__AndOperation__Group_1__06157);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3042:1: rule__AndOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__AndOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3046:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3047:1: ( () )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3047:1: ( () )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3048:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3049:1: ()
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3051:1: 
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3061:1: rule__AndOperation__Group_1__1 : rule__AndOperation__Group_1__1__Impl rule__AndOperation__Group_1__2 ;
    public final void rule__AndOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3065:1: ( rule__AndOperation__Group_1__1__Impl rule__AndOperation__Group_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3066:2: rule__AndOperation__Group_1__1__Impl rule__AndOperation__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndOperation__Group_1__1__Impl_in_rule__AndOperation__Group_1__16215);
            rule__AndOperation__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AndOperation__Group_1__2_in_rule__AndOperation__Group_1__16218);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3073:1: rule__AndOperation__Group_1__1__Impl : ( ( rule__AndOperation__OperatorAssignment_1_1 ) ) ;
    public final void rule__AndOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3077:1: ( ( ( rule__AndOperation__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3078:1: ( ( rule__AndOperation__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3078:1: ( ( rule__AndOperation__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3079:1: ( rule__AndOperation__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3080:1: ( rule__AndOperation__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3080:2: rule__AndOperation__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndOperation__OperatorAssignment_1_1_in_rule__AndOperation__Group_1__1__Impl6245);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3090:1: rule__AndOperation__Group_1__2 : rule__AndOperation__Group_1__2__Impl ;
    public final void rule__AndOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3094:1: ( rule__AndOperation__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3095:2: rule__AndOperation__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndOperation__Group_1__2__Impl_in_rule__AndOperation__Group_1__26275);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3101:1: rule__AndOperation__Group_1__2__Impl : ( ( rule__AndOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__AndOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3105:1: ( ( ( rule__AndOperation__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3106:1: ( ( rule__AndOperation__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3106:1: ( ( rule__AndOperation__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3107:1: ( rule__AndOperation__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3108:1: ( rule__AndOperation__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3108:2: rule__AndOperation__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndOperation__SubExpressionsAssignment_1_2_in_rule__AndOperation__Group_1__2__Impl6302);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3124:1: rule__OrOperation__Group__0 : rule__OrOperation__Group__0__Impl rule__OrOperation__Group__1 ;
    public final void rule__OrOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3128:1: ( rule__OrOperation__Group__0__Impl rule__OrOperation__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3129:2: rule__OrOperation__Group__0__Impl rule__OrOperation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrOperation__Group__0__Impl_in_rule__OrOperation__Group__06338);
            rule__OrOperation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OrOperation__Group__1_in_rule__OrOperation__Group__06341);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3136:1: rule__OrOperation__Group__0__Impl : ( ruleAndOperation ) ;
    public final void rule__OrOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3140:1: ( ( ruleAndOperation ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3141:1: ( ruleAndOperation )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3141:1: ( ruleAndOperation )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3142:1: ruleAndOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getAndOperationParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndOperation_in_rule__OrOperation__Group__0__Impl6368);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3153:1: rule__OrOperation__Group__1 : rule__OrOperation__Group__1__Impl ;
    public final void rule__OrOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3157:1: ( rule__OrOperation__Group__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3158:2: rule__OrOperation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrOperation__Group__1__Impl_in_rule__OrOperation__Group__16397);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3164:1: rule__OrOperation__Group__1__Impl : ( ( rule__OrOperation__Group_1__0 )* ) ;
    public final void rule__OrOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3168:1: ( ( ( rule__OrOperation__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3169:1: ( ( rule__OrOperation__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3169:1: ( ( rule__OrOperation__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3170:1: ( rule__OrOperation__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3171:1: ( rule__OrOperation__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==16) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3171:2: rule__OrOperation__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__OrOperation__Group_1__0_in_rule__OrOperation__Group__1__Impl6424);
            	    rule__OrOperation__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3185:1: rule__OrOperation__Group_1__0 : rule__OrOperation__Group_1__0__Impl rule__OrOperation__Group_1__1 ;
    public final void rule__OrOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3189:1: ( rule__OrOperation__Group_1__0__Impl rule__OrOperation__Group_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3190:2: rule__OrOperation__Group_1__0__Impl rule__OrOperation__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrOperation__Group_1__0__Impl_in_rule__OrOperation__Group_1__06459);
            rule__OrOperation__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OrOperation__Group_1__1_in_rule__OrOperation__Group_1__06462);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3197:1: rule__OrOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__OrOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3201:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3202:1: ( () )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3202:1: ( () )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3203:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3204:1: ()
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3206:1: 
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3216:1: rule__OrOperation__Group_1__1 : rule__OrOperation__Group_1__1__Impl rule__OrOperation__Group_1__2 ;
    public final void rule__OrOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3220:1: ( rule__OrOperation__Group_1__1__Impl rule__OrOperation__Group_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3221:2: rule__OrOperation__Group_1__1__Impl rule__OrOperation__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrOperation__Group_1__1__Impl_in_rule__OrOperation__Group_1__16520);
            rule__OrOperation__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OrOperation__Group_1__2_in_rule__OrOperation__Group_1__16523);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3228:1: rule__OrOperation__Group_1__1__Impl : ( ( rule__OrOperation__OperatorAssignment_1_1 ) ) ;
    public final void rule__OrOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3232:1: ( ( ( rule__OrOperation__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3233:1: ( ( rule__OrOperation__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3233:1: ( ( rule__OrOperation__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3234:1: ( rule__OrOperation__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3235:1: ( rule__OrOperation__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3235:2: rule__OrOperation__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrOperation__OperatorAssignment_1_1_in_rule__OrOperation__Group_1__1__Impl6550);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3245:1: rule__OrOperation__Group_1__2 : rule__OrOperation__Group_1__2__Impl ;
    public final void rule__OrOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3249:1: ( rule__OrOperation__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3250:2: rule__OrOperation__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrOperation__Group_1__2__Impl_in_rule__OrOperation__Group_1__26580);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3256:1: rule__OrOperation__Group_1__2__Impl : ( ( rule__OrOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__OrOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3260:1: ( ( ( rule__OrOperation__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3261:1: ( ( rule__OrOperation__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3261:1: ( ( rule__OrOperation__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3262:1: ( rule__OrOperation__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3263:1: ( rule__OrOperation__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3263:2: rule__OrOperation__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrOperation__SubExpressionsAssignment_1_2_in_rule__OrOperation__Group_1__2__Impl6607);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3279:1: rule__ParanthesedBooleanExpression__Group_5__0 : rule__ParanthesedBooleanExpression__Group_5__0__Impl rule__ParanthesedBooleanExpression__Group_5__1 ;
    public final void rule__ParanthesedBooleanExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3283:1: ( rule__ParanthesedBooleanExpression__Group_5__0__Impl rule__ParanthesedBooleanExpression__Group_5__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3284:2: rule__ParanthesedBooleanExpression__Group_5__0__Impl rule__ParanthesedBooleanExpression__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParanthesedBooleanExpression__Group_5__0__Impl_in_rule__ParanthesedBooleanExpression__Group_5__06643);
            rule__ParanthesedBooleanExpression__Group_5__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ParanthesedBooleanExpression__Group_5__1_in_rule__ParanthesedBooleanExpression__Group_5__06646);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3291:1: rule__ParanthesedBooleanExpression__Group_5__0__Impl : ( '(' ) ;
    public final void rule__ParanthesedBooleanExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3295:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3296:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3296:1: ( '(' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3297:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedBooleanExpressionAccess().getLeftParenthesisKeyword_5_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__ParanthesedBooleanExpression__Group_5__0__Impl6674); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3310:1: rule__ParanthesedBooleanExpression__Group_5__1 : rule__ParanthesedBooleanExpression__Group_5__1__Impl rule__ParanthesedBooleanExpression__Group_5__2 ;
    public final void rule__ParanthesedBooleanExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3314:1: ( rule__ParanthesedBooleanExpression__Group_5__1__Impl rule__ParanthesedBooleanExpression__Group_5__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3315:2: rule__ParanthesedBooleanExpression__Group_5__1__Impl rule__ParanthesedBooleanExpression__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParanthesedBooleanExpression__Group_5__1__Impl_in_rule__ParanthesedBooleanExpression__Group_5__16705);
            rule__ParanthesedBooleanExpression__Group_5__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ParanthesedBooleanExpression__Group_5__2_in_rule__ParanthesedBooleanExpression__Group_5__16708);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3322:1: rule__ParanthesedBooleanExpression__Group_5__1__Impl : ( ruleOrOperation ) ;
    public final void rule__ParanthesedBooleanExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3326:1: ( ( ruleOrOperation ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3327:1: ( ruleOrOperation )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3327:1: ( ruleOrOperation )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3328:1: ruleOrOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedBooleanExpressionAccess().getOrOperationParserRuleCall_5_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrOperation_in_rule__ParanthesedBooleanExpression__Group_5__1__Impl6735);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3339:1: rule__ParanthesedBooleanExpression__Group_5__2 : rule__ParanthesedBooleanExpression__Group_5__2__Impl ;
    public final void rule__ParanthesedBooleanExpression__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3343:1: ( rule__ParanthesedBooleanExpression__Group_5__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3344:2: rule__ParanthesedBooleanExpression__Group_5__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParanthesedBooleanExpression__Group_5__2__Impl_in_rule__ParanthesedBooleanExpression__Group_5__26764);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3350:1: rule__ParanthesedBooleanExpression__Group_5__2__Impl : ( ')' ) ;
    public final void rule__ParanthesedBooleanExpression__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3354:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3355:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3355:1: ( ')' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3356:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedBooleanExpressionAccess().getRightParenthesisKeyword_5_2()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__ParanthesedBooleanExpression__Group_5__2__Impl6792); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3375:1: rule__TextExpression__Group__0 : rule__TextExpression__Group__0__Impl rule__TextExpression__Group__1 ;
    public final void rule__TextExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3379:1: ( rule__TextExpression__Group__0__Impl rule__TextExpression__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3380:2: rule__TextExpression__Group__0__Impl rule__TextExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group__0__Impl_in_rule__TextExpression__Group__06829);
            rule__TextExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group__1_in_rule__TextExpression__Group__06832);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3387:1: rule__TextExpression__Group__0__Impl : ( ( rule__TextExpression__CodeAssignment_0 ) ) ;
    public final void rule__TextExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3391:1: ( ( ( rule__TextExpression__CodeAssignment_0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3392:1: ( ( rule__TextExpression__CodeAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3392:1: ( ( rule__TextExpression__CodeAssignment_0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3393:1: ( rule__TextExpression__CodeAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getCodeAssignment_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3394:1: ( rule__TextExpression__CodeAssignment_0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3394:2: rule__TextExpression__CodeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__CodeAssignment_0_in_rule__TextExpression__Group__0__Impl6859);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3404:1: rule__TextExpression__Group__1 : rule__TextExpression__Group__1__Impl ;
    public final void rule__TextExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3408:1: ( rule__TextExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3409:2: rule__TextExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group__1__Impl_in_rule__TextExpression__Group__16889);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3415:1: rule__TextExpression__Group__1__Impl : ( ( rule__TextExpression__Group_1__0 )? ) ;
    public final void rule__TextExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3419:1: ( ( ( rule__TextExpression__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3420:1: ( ( rule__TextExpression__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3420:1: ( ( rule__TextExpression__Group_1__0 )? )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3421:1: ( rule__TextExpression__Group_1__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3422:1: ( rule__TextExpression__Group_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==RULE_ID) ) {
                    int LA22_3 = input.LA(3);

                    if ( (LA22_3==30) ) {
                        int LA22_4 = input.LA(4);

                        if ( (synpred36()) ) {
                            alt22=1;
                        }
                    }
                }
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3422:2: rule__TextExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group_1__0_in_rule__TextExpression__Group__1__Impl6916);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3436:1: rule__TextExpression__Group_1__0 : rule__TextExpression__Group_1__0__Impl rule__TextExpression__Group_1__1 ;
    public final void rule__TextExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3440:1: ( rule__TextExpression__Group_1__0__Impl rule__TextExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3441:2: rule__TextExpression__Group_1__0__Impl rule__TextExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group_1__0__Impl_in_rule__TextExpression__Group_1__06951);
            rule__TextExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group_1__1_in_rule__TextExpression__Group_1__06954);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3448:1: rule__TextExpression__Group_1__0__Impl : ( '(' ) ;
    public final void rule__TextExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3452:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3453:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3453:1: ( '(' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3454:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__TextExpression__Group_1__0__Impl6982); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3467:1: rule__TextExpression__Group_1__1 : rule__TextExpression__Group_1__1__Impl rule__TextExpression__Group_1__2 ;
    public final void rule__TextExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3471:1: ( rule__TextExpression__Group_1__1__Impl rule__TextExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3472:2: rule__TextExpression__Group_1__1__Impl rule__TextExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group_1__1__Impl_in_rule__TextExpression__Group_1__17013);
            rule__TextExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group_1__2_in_rule__TextExpression__Group_1__17016);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3479:1: rule__TextExpression__Group_1__1__Impl : ( ( rule__TextExpression__TypeAssignment_1_1 ) ) ;
    public final void rule__TextExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3483:1: ( ( ( rule__TextExpression__TypeAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3484:1: ( ( rule__TextExpression__TypeAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3484:1: ( ( rule__TextExpression__TypeAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3485:1: ( rule__TextExpression__TypeAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getTypeAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3486:1: ( rule__TextExpression__TypeAssignment_1_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3486:2: rule__TextExpression__TypeAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__TypeAssignment_1_1_in_rule__TextExpression__Group_1__1__Impl7043);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3496:1: rule__TextExpression__Group_1__2 : rule__TextExpression__Group_1__2__Impl ;
    public final void rule__TextExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3500:1: ( rule__TextExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3501:2: rule__TextExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group_1__2__Impl_in_rule__TextExpression__Group_1__27073);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3507:1: rule__TextExpression__Group_1__2__Impl : ( ')' ) ;
    public final void rule__TextExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3511:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3512:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3512:1: ( ')' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3513:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__TextExpression__Group_1__2__Impl7101); if (failed) return ;
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


    // $ANTLR start rule__SignalReference__SignalAssignment_0
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3533:1: rule__SignalReference__SignalAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SignalReference__SignalAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3537:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3538:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3538:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3539:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getSignalSignalCrossReference_0_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3540:1: ( RULE_ID )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3541:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getSignalSignalIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__SignalReference__SignalAssignment_07147); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3552:1: rule__SignalReference__SubExpressionsAssignment_1_1_0 : ( ruleExpression ) ;
    public final void rule__SignalReference__SubExpressionsAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3556:1: ( ( ruleExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3557:1: ( ruleExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3557:1: ( ruleExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3558:1: ruleExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getSubExpressionsExpressionParserRuleCall_1_1_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__SignalReference__SubExpressionsAssignment_1_1_07182);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3567:1: rule__VariableReference__VariableAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__VariableReference__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3571:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3572:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3572:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3573:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getVariableVariableCrossReference_0_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3574:1: ( RULE_ID )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3575:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getVariableVariableIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__VariableReference__VariableAssignment_07217); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3586:1: rule__VariableReference__SubExpressionsAssignment_1_1_0 : ( ruleExpression ) ;
    public final void rule__VariableReference__SubExpressionsAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3590:1: ( ( ruleExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3591:1: ( ruleExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3591:1: ( ruleExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3592:1: ruleExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getSubExpressionsExpressionParserRuleCall_1_1_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__VariableReference__SubExpressionsAssignment_1_1_07252);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3603:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3607:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3608:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3608:1: ( RULE_INT )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3609:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment7285); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3618:1: rule__FloatValue__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3622:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3623:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3623:1: ( RULE_FLOAT )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3624:1: RULE_FLOAT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueFloatTerminalRuleCall_0()); 
            }
            match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_rule__FloatValue__ValueAssignment7316); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3633:1: rule__BooleanValue__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3637:1: ( ( RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3638:1: ( RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3638:1: ( RULE_BOOLEAN )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3639:1: RULE_BOOLEAN
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueBooleanTerminalRuleCall_0()); 
            }
            match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_rule__BooleanValue__ValueAssignment7347); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3648:1: rule__ValOperation__OperatorAssignment_0 : ( ruleValOperator ) ;
    public final void rule__ValOperation__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3652:1: ( ( ruleValOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3653:1: ( ruleValOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3653:1: ( ruleValOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3654:1: ruleValOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValOperationAccess().getOperatorValOperatorEnumRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValOperator_in_rule__ValOperation__OperatorAssignment_07378);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3663:1: rule__ValOperation__SubExpressionsAssignment_1 : ( ruleSignalReference ) ;
    public final void rule__ValOperation__SubExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3667:1: ( ( ruleSignalReference ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3668:1: ( ruleSignalReference )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3668:1: ( ruleSignalReference )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3669:1: ruleSignalReference
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValOperationAccess().getSubExpressionsSignalReferenceParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSignalReference_in_rule__ValOperation__SubExpressionsAssignment_17409);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3678:1: rule__PlusOperation__OperatorAssignment_1_1 : ( rulePlusOperator ) ;
    public final void rule__PlusOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3682:1: ( ( rulePlusOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3683:1: ( rulePlusOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3683:1: ( rulePlusOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3684:1: rulePlusOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getOperatorPlusOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePlusOperator_in_rule__PlusOperation__OperatorAssignment_1_17440);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3693:1: rule__PlusOperation__SubExpressionsAssignment_1_2 : ( ruleMultOrDivOperation ) ;
    public final void rule__PlusOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3697:1: ( ( ruleMultOrDivOperation ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3698:1: ( ruleMultOrDivOperation )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3698:1: ( ruleMultOrDivOperation )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3699:1: ruleMultOrDivOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getSubExpressionsMultOrDivOperationParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultOrDivOperation_in_rule__PlusOperation__SubExpressionsAssignment_1_27471);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3708:1: rule__MultOperation__OperatorAssignment_1_1 : ( ruleMultOperator ) ;
    public final void rule__MultOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3712:1: ( ( ruleMultOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3713:1: ( ruleMultOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3713:1: ( ruleMultOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3714:1: ruleMultOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getOperatorMultOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultOperator_in_rule__MultOperation__OperatorAssignment_1_17502);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3723:1: rule__MultOperation__SubExpressionsAssignment_1_2 : ( rulePreOrNormalValuedExpression ) ;
    public final void rule__MultOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3727:1: ( ( rulePreOrNormalValuedExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3728:1: ( rulePreOrNormalValuedExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3728:1: ( rulePreOrNormalValuedExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3729:1: rulePreOrNormalValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getSubExpressionsPreOrNormalValuedExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePreOrNormalValuedExpression_in_rule__MultOperation__SubExpressionsAssignment_1_27533);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3738:1: rule__DivOperation__OperatorAssignment_1_1 : ( ruleDivOperator ) ;
    public final void rule__DivOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3742:1: ( ( ruleDivOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3743:1: ( ruleDivOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3743:1: ( ruleDivOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3744:1: ruleDivOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getOperatorDivOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivOperator_in_rule__DivOperation__OperatorAssignment_1_17564);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3753:1: rule__DivOperation__SubExpressionsAssignment_1_2 : ( rulePreOrNormalValuedExpression ) ;
    public final void rule__DivOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3757:1: ( ( rulePreOrNormalValuedExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3758:1: ( rulePreOrNormalValuedExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3758:1: ( rulePreOrNormalValuedExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3759:1: rulePreOrNormalValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getSubExpressionsPreOrNormalValuedExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePreOrNormalValuedExpression_in_rule__DivOperation__SubExpressionsAssignment_1_27595);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3768:1: rule__PreArithmOperation__OperatorAssignment_0 : ( ruleUnaryParanthesedOperator ) ;
    public final void rule__PreArithmOperation__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3772:1: ( ( ruleUnaryParanthesedOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3773:1: ( ruleUnaryParanthesedOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3773:1: ( ruleUnaryParanthesedOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3774:1: ruleUnaryParanthesedOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreArithmOperationAccess().getOperatorUnaryParanthesedOperatorEnumRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryParanthesedOperator_in_rule__PreArithmOperation__OperatorAssignment_07626);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3783:1: rule__PreArithmOperation__SubExpressionsAssignment_2 : ( ruleValOperation ) ;
    public final void rule__PreArithmOperation__SubExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3787:1: ( ( ruleValOperation ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3788:1: ( ruleValOperation )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3788:1: ( ruleValOperation )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3789:1: ruleValOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreArithmOperationAccess().getSubExpressionsValOperationParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValOperation_in_rule__PreArithmOperation__SubExpressionsAssignment_27657);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3798:1: rule__CompareOperation__OperatorAssignment_1_1 : ( ruleCompareOperator ) ;
    public final void rule__CompareOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3802:1: ( ( ruleCompareOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3803:1: ( ruleCompareOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3803:1: ( ruleCompareOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3804:1: ruleCompareOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperator_in_rule__CompareOperation__OperatorAssignment_1_17688);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3813:1: rule__CompareOperation__SubExpressionsAssignment_1_2 : ( ruleValuedExpression ) ;
    public final void rule__CompareOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3817:1: ( ( ruleValuedExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3818:1: ( ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3818:1: ( ruleValuedExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3819:1: ruleValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsValuedExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_rule__CompareOperation__SubExpressionsAssignment_1_27719);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3828:1: rule__UnaryOperation__OperatorAssignment_0 : ( ruleUnaryOperator ) ;
    public final void rule__UnaryOperation__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3832:1: ( ( ruleUnaryOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3833:1: ( ruleUnaryOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3833:1: ( ruleUnaryOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3834:1: ruleUnaryOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getOperatorUnaryOperatorEnumRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperator_in_rule__UnaryOperation__OperatorAssignment_07750);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3843:1: rule__UnaryOperation__SubExpressionsAssignment_1 : ( ( rule__UnaryOperation__SubExpressionsAlternatives_1_0 ) ) ;
    public final void rule__UnaryOperation__SubExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3847:1: ( ( ( rule__UnaryOperation__SubExpressionsAlternatives_1_0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3848:1: ( ( rule__UnaryOperation__SubExpressionsAlternatives_1_0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3848:1: ( ( rule__UnaryOperation__SubExpressionsAlternatives_1_0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3849:1: ( rule__UnaryOperation__SubExpressionsAlternatives_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getSubExpressionsAlternatives_1_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3850:1: ( rule__UnaryOperation__SubExpressionsAlternatives_1_0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3850:2: rule__UnaryOperation__SubExpressionsAlternatives_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__SubExpressionsAlternatives_1_0_in_rule__UnaryOperation__SubExpressionsAssignment_17781);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3859:1: rule__UnaryParanthesedOperation__OperatorAssignment_0 : ( ruleUnaryParanthesedOperator ) ;
    public final void rule__UnaryParanthesedOperation__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3863:1: ( ( ruleUnaryParanthesedOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3864:1: ( ruleUnaryParanthesedOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3864:1: ( ruleUnaryParanthesedOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3865:1: ruleUnaryParanthesedOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperationAccess().getOperatorUnaryParanthesedOperatorEnumRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryParanthesedOperator_in_rule__UnaryParanthesedOperation__OperatorAssignment_07814);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3874:1: rule__UnaryParanthesedOperation__SubExpressionsAssignment_2 : ( ruleBooleanExpression ) ;
    public final void rule__UnaryParanthesedOperation__SubExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3878:1: ( ( ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3879:1: ( ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3879:1: ( ruleBooleanExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3880:1: ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperationAccess().getSubExpressionsBooleanExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_rule__UnaryParanthesedOperation__SubExpressionsAssignment_27845);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3889:1: rule__AndOperation__OperatorAssignment_1_1 : ( ruleOperatorAnd ) ;
    public final void rule__AndOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3893:1: ( ( ruleOperatorAnd ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3894:1: ( ruleOperatorAnd )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3894:1: ( ruleOperatorAnd )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3895:1: ruleOperatorAnd
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getOperatorOperatorAndEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOperatorAnd_in_rule__AndOperation__OperatorAssignment_1_17876);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3904:1: rule__AndOperation__SubExpressionsAssignment_1_2 : ( ruleUnaryOrNormalExpression ) ;
    public final void rule__AndOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3908:1: ( ( ruleUnaryOrNormalExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3909:1: ( ruleUnaryOrNormalExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3909:1: ( ruleUnaryOrNormalExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3910:1: ruleUnaryOrNormalExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getSubExpressionsUnaryOrNormalExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOrNormalExpression_in_rule__AndOperation__SubExpressionsAssignment_1_27907);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3919:1: rule__OrOperation__OperatorAssignment_1_1 : ( ruleOperatorOr ) ;
    public final void rule__OrOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3923:1: ( ( ruleOperatorOr ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3924:1: ( ruleOperatorOr )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3924:1: ( ruleOperatorOr )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3925:1: ruleOperatorOr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getOperatorOperatorOrEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOperatorOr_in_rule__OrOperation__OperatorAssignment_1_17938);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3934:1: rule__OrOperation__SubExpressionsAssignment_1_2 : ( ruleAndOperation ) ;
    public final void rule__OrOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3938:1: ( ( ruleAndOperation ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3939:1: ( ruleAndOperation )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3939:1: ( ruleAndOperation )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3940:1: ruleAndOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getSubExpressionsAndOperationParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndOperation_in_rule__OrOperation__SubExpressionsAssignment_1_27969);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3949:1: rule__TextExpression__CodeAssignment_0 : ( RULE_STRING ) ;
    public final void rule__TextExpression__CodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3953:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3954:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3954:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3955:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getCodeSTRINGTerminalRuleCall_0_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__TextExpression__CodeAssignment_08000); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3964:1: rule__TextExpression__TypeAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__TextExpression__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3968:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3969:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3969:1: ( RULE_ID )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3970:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getTypeIDTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__TextExpression__TypeAssignment_1_18031); if (failed) return ;
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

    // $ANTLR start synpred6
    public final void synpred6_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:961:6: ( ( ( rule__ParanthesedValuedExpression__Group_5__0 ) ) )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:961:6: ( ( rule__ParanthesedValuedExpression__Group_5__0 ) )
        {
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:961:6: ( ( rule__ParanthesedValuedExpression__Group_5__0 ) )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:962:1: ( rule__ParanthesedValuedExpression__Group_5__0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getParanthesedValuedExpressionAccess().getGroup_5()); 
        }
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:963:1: ( rule__ParanthesedValuedExpression__Group_5__0 )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:963:2: rule__ParanthesedValuedExpression__Group_5__0
        {
        pushFollow(FollowSets000.FOLLOW_rule__ParanthesedValuedExpression__Group_5__0_in_synpred61956);
        rule__ParanthesedValuedExpression__Group_5__0();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred6

    // $ANTLR start synpred7
    public final void synpred7_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:983:1: ( ( ruleMultOperation ) )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:983:1: ( ruleMultOperation )
        {
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:983:1: ( ruleMultOperation )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:984:1: ruleMultOperation
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getMultOrDivOperationAccess().getMultOperationParserRuleCall_0()); 
        }
        pushFollow(FollowSets000.FOLLOW_ruleMultOperation_in_synpred72007);
        ruleMultOperation();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred7

    // $ANTLR start synpred9
    public final void synpred9_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1027:1: ( ( ruleParanthesedBooleanExpression ) )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1027:1: ( ruleParanthesedBooleanExpression )
        {
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1027:1: ( ruleParanthesedBooleanExpression )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1028:1: ruleParanthesedBooleanExpression
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getUnaryOperationAccess().getSubExpressionsParanthesedBooleanExpressionParserRuleCall_1_0_0()); 
        }
        pushFollow(FollowSets000.FOLLOW_ruleParanthesedBooleanExpression_in_synpred92106);
        ruleParanthesedBooleanExpression();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred9

    // $ANTLR start synpred11
    public final void synpred11_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1055:6: ( ( ruleUnaryParanthesedOperation ) )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1055:6: ( ruleUnaryParanthesedOperation )
        {
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1055:6: ( ruleUnaryParanthesedOperation )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1056:1: ruleUnaryParanthesedOperation
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getUnaryOrNormalExpressionAccess().getUnaryParanthesedOperationParserRuleCall_1()); 
        }
        pushFollow(FollowSets000.FOLLOW_ruleUnaryParanthesedOperation_in_synpred112172);
        ruleUnaryParanthesedOperation();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred11

    // $ANTLR start synpred13
    public final void synpred13_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1083:6: ( ( ruleCompareOperation ) )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1083:6: ( ruleCompareOperation )
        {
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1083:6: ( ruleCompareOperation )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1084:1: ruleCompareOperation
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getParanthesedBooleanExpressionAccess().getCompareOperationParserRuleCall_1()); 
        }
        pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_synpred132238);
        ruleCompareOperation();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred13

    // $ANTLR start synpred14
    public final void synpred14_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1089:6: ( ( ruleSignalReference ) )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1089:6: ( ruleSignalReference )
        {
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1089:6: ( ruleSignalReference )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1090:1: ruleSignalReference
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getParanthesedBooleanExpressionAccess().getSignalReferenceParserRuleCall_2()); 
        }
        pushFollow(FollowSets000.FOLLOW_ruleSignalReference_in_synpred142255);
        ruleSignalReference();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred14

    // $ANTLR start synpred15
    public final void synpred15_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1095:6: ( ( ruleValOperation ) )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1095:6: ( ruleValOperation )
        {
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1095:6: ( ruleValOperation )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1096:1: ruleValOperation
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getParanthesedBooleanExpressionAccess().getValOperationParserRuleCall_3()); 
        }
        pushFollow(FollowSets000.FOLLOW_ruleValOperation_in_synpred152272);
        ruleValOperation();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred15

    // $ANTLR start synpred16
    public final void synpred16_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1101:6: ( ( ruleTextExpression ) )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1101:6: ( ruleTextExpression )
        {
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1101:6: ( ruleTextExpression )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1102:1: ruleTextExpression
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getParanthesedBooleanExpressionAccess().getTextExpressionParserRuleCall_4()); 
        }
        pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_synpred162289);
        ruleTextExpression();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred16

    // $ANTLR start synpred17
    public final void synpred17_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1123:1: ( ( ruleValuedExpression ) )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1123:1: ( ruleValuedExpression )
        {
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1123:1: ( ruleValuedExpression )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1124:1: ruleValuedExpression
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_0()); 
        }
        pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_synpred172339);
        ruleValuedExpression();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred17

    // $ANTLR start synpred25
    public final void synpred25_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1292:2: ( rule__SignalReference__Group_1__0 )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1292:2: rule__SignalReference__Group_1__0
        {
        pushFollow(FollowSets000.FOLLOW_rule__SignalReference__Group_1__0_in_synpred252731);
        rule__SignalReference__Group_1__0();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred25

    // $ANTLR start synpred28
    public final void synpred28_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1512:2: ( rule__VariableReference__Group_1__0 )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1512:2: rule__VariableReference__Group_1__0
        {
        pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group_1__0_in_synpred283167);
        rule__VariableReference__Group_1__0();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred28

    // $ANTLR start synpred36
    public final void synpred36_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3422:2: ( rule__TextExpression__Group_1__0 )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3422:2: rule__TextExpression__Group_1__0
        {
        pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group_1__0_in_synpred366916);
        rule__TextExpression__Group_1__0();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred36

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
    public final boolean synpred14() {
        backtracking++;
        int start = input.mark();
        try {
            synpred14_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred28() {
        backtracking++;
        int start = input.mark();
        try {
            synpred28_fragment(); // can never throw exception
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
    public final boolean synpred6() {
        backtracking++;
        int start = input.mark();
        try {
            synpred6_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred25() {
        backtracking++;
        int start = input.mark();
        try {
            synpred25_fragment(); // can never throw exception
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
    public final boolean synpred7() {
        backtracking++;
        int start = input.mark();
        try {
            synpred7_fragment(); // can never throw exception
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


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleSignalReference_in_entryRuleSignalReference67 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSignalReference74 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SignalReference__Group__0_in_ruleSignalReference100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference127 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__Group__0_in_ruleVariableReference160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue191 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntValue198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue251 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue311 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__ValueAssignment_in_ruleBooleanValue344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValOperation_in_entryRuleValOperation373 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValOperation380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValOperation__Group__0_in_ruleValOperation406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression433 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedExpression440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePlusOperation_in_ruleValuedExpression466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParanthesedValuedExpression_in_entryRuleParanthesedValuedExpression492 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParanthesedValuedExpression499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParanthesedValuedExpression__Alternatives_in_ruleParanthesedValuedExpression525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePlusOperation_in_entryRulePlusOperation552 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePlusOperation559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PlusOperation__Group__0_in_rulePlusOperation585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultOrDivOperation_in_entryRuleMultOrDivOperation612 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultOrDivOperation619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultOrDivOperation__Alternatives_in_ruleMultOrDivOperation645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultOperation_in_entryRuleMultOperation672 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultOperation679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultOperation__Group__0_in_ruleMultOperation705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivOperation_in_entryRuleDivOperation732 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDivOperation739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivOperation__Group__0_in_ruleDivOperation765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePreArithmOperation_in_entryRulePreArithmOperation792 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePreArithmOperation799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PreArithmOperation__Group__0_in_rulePreArithmOperation825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePreOrNormalValuedExpression_in_entryRulePreOrNormalValuedExpression852 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePreOrNormalValuedExpression859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PreOrNormalValuedExpression__Alternatives_in_rulePreOrNormalValuedExpression885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation912 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group__0_in_ruleCompareOperation945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation972 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOperation979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperation__Group__0_in_ruleUnaryOperation1005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryParanthesedOperation_in_entryRuleUnaryParanthesedOperation1032 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryParanthesedOperation1039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__Group__0_in_ruleUnaryParanthesedOperation1065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOrNormalExpression_in_entryRuleUnaryOrNormalExpression1092 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOrNormalExpression1099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOrNormalExpression__Alternatives_in_ruleUnaryOrNormalExpression1125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndOperation_in_entryRuleAndOperation1152 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAndOperation1159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndOperation__Group__0_in_ruleAndOperation1185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrOperation_in_entryRuleOrOperation1212 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrOperation1219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrOperation__Group__0_in_ruleOrOperation1245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParanthesedBooleanExpression_in_entryRuleParanthesedBooleanExpression1272 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParanthesedBooleanExpression1279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParanthesedBooleanExpression__Alternatives_in_ruleParanthesedBooleanExpression1305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression1332 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression1339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrOperation_in_ruleBooleanExpression1365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_entryRuleTextExpression1391 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextExpression1398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group__0_in_ruleTextExpression1424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1451 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression1458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Alternatives_in_ruleExpression1484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleValOperator1524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperator__Alternatives_in_ruleCompareOperator1562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleUnaryOperator1599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleUnaryParanthesedOperator1638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleOperatorOr1677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleOperatorAnd1716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PlusOperator__Alternatives_in_rulePlusOperator1756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultOperator__Alternatives_in_ruleMultOperator1792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleDivOperator1829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValue_in_rule__ParanthesedValuedExpression__Alternatives1871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_rule__ParanthesedValuedExpression__Alternatives1888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValOperation_in_rule__ParanthesedValuedExpression__Alternatives1905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableReference_in_rule__ParanthesedValuedExpression__Alternatives1922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_rule__ParanthesedValuedExpression__Alternatives1939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParanthesedValuedExpression__Group_5__0_in_rule__ParanthesedValuedExpression__Alternatives1956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParanthesedValuedExpression__Group_6__0_in_rule__ParanthesedValuedExpression__Alternatives1974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultOperation_in_rule__MultOrDivOperation__Alternatives2007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultOrDivOperation__Group_1__0_in_rule__MultOrDivOperation__Alternatives2024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePreArithmOperation_in_rule__PreOrNormalValuedExpression__Alternatives2057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParanthesedValuedExpression_in_rule__PreOrNormalValuedExpression__Alternatives2074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParanthesedBooleanExpression_in_rule__UnaryOperation__SubExpressionsAlternatives_1_02106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryParanthesedOperation_in_rule__UnaryOperation__SubExpressionsAlternatives_1_02123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperation_in_rule__UnaryOrNormalExpression__Alternatives2155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryParanthesedOperation_in_rule__UnaryOrNormalExpression__Alternatives2172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParanthesedBooleanExpression_in_rule__UnaryOrNormalExpression__Alternatives2189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanValue_in_rule__ParanthesedBooleanExpression__Alternatives2221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_rule__ParanthesedBooleanExpression__Alternatives2238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignalReference_in_rule__ParanthesedBooleanExpression__Alternatives2255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValOperation_in_rule__ParanthesedBooleanExpression__Alternatives2272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_rule__ParanthesedBooleanExpression__Alternatives2289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParanthesedBooleanExpression__Group_5__0_in_rule__ParanthesedBooleanExpression__Alternatives2306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_rule__Expression__Alternatives2339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__Expression__Alternatives2356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__CompareOperator__Alternatives2390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__CompareOperator__Alternatives2411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__CompareOperator__Alternatives2432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__CompareOperator__Alternatives2453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__CompareOperator__Alternatives2474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__CompareOperator__Alternatives2495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__PlusOperator__Alternatives2531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__PlusOperator__Alternatives2552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__MultOperator__Alternatives2588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__MultOperator__Alternatives2609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SignalReference__Group__0__Impl_in_rule__SignalReference__Group__02644 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_rule__SignalReference__Group__1_in_rule__SignalReference__Group__02647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SignalReference__SignalAssignment_0_in_rule__SignalReference__Group__0__Impl2674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SignalReference__Group__1__Impl_in_rule__SignalReference__Group__12704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SignalReference__Group_1__0_in_rule__SignalReference__Group__1__Impl2731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SignalReference__Group_1__0__Impl_in_rule__SignalReference__Group_1__02766 = new BitSet(new long[]{0x000000006000E1F0L});
        public static final BitSet FOLLOW_rule__SignalReference__Group_1__1_in_rule__SignalReference__Group_1__02769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__SignalReference__Group_1__0__Impl2797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SignalReference__Group_1__1__Impl_in_rule__SignalReference__Group_1__12828 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__SignalReference__Group_1__2_in_rule__SignalReference__Group_1__12831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SignalReference__Group_1_1__0_in_rule__SignalReference__Group_1__1__Impl2858 = new BitSet(new long[]{0x000000002000E1F2L});
        public static final BitSet FOLLOW_rule__SignalReference__Group_1__2__Impl_in_rule__SignalReference__Group_1__22889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__SignalReference__Group_1__2__Impl2917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SignalReference__Group_1_1__0__Impl_in_rule__SignalReference__Group_1_1__02954 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_rule__SignalReference__Group_1_1__1_in_rule__SignalReference__Group_1_1__02957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SignalReference__SubExpressionsAssignment_1_1_0_in_rule__SignalReference__Group_1_1__0__Impl2984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SignalReference__Group_1_1__1__Impl_in_rule__SignalReference__Group_1_1__13014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__SignalReference__Group_1_1__1__Impl3043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__Group__0__Impl_in_rule__VariableReference__Group__03080 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_rule__VariableReference__Group__1_in_rule__VariableReference__Group__03083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__VariableAssignment_0_in_rule__VariableReference__Group__0__Impl3110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__Group__1__Impl_in_rule__VariableReference__Group__13140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__Group_1__0_in_rule__VariableReference__Group__1__Impl3167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__Group_1__0__Impl_in_rule__VariableReference__Group_1__03202 = new BitSet(new long[]{0x000000006000E1F0L});
        public static final BitSet FOLLOW_rule__VariableReference__Group_1__1_in_rule__VariableReference__Group_1__03205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__VariableReference__Group_1__0__Impl3233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__Group_1__1__Impl_in_rule__VariableReference__Group_1__13264 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__VariableReference__Group_1__2_in_rule__VariableReference__Group_1__13267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__Group_1_1__0_in_rule__VariableReference__Group_1__1__Impl3294 = new BitSet(new long[]{0x000000002000E1F2L});
        public static final BitSet FOLLOW_rule__VariableReference__Group_1__2__Impl_in_rule__VariableReference__Group_1__23325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__VariableReference__Group_1__2__Impl3353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__Group_1_1__0__Impl_in_rule__VariableReference__Group_1_1__03390 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_rule__VariableReference__Group_1_1__1_in_rule__VariableReference__Group_1_1__03393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__SubExpressionsAssignment_1_1_0_in_rule__VariableReference__Group_1_1__0__Impl3420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__Group_1_1__1__Impl_in_rule__VariableReference__Group_1_1__13450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__VariableReference__Group_1_1__1__Impl3479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValOperation__Group__0__Impl_in_rule__ValOperation__Group__03516 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__ValOperation__Group__1_in_rule__ValOperation__Group__03519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValOperation__OperatorAssignment_0_in_rule__ValOperation__Group__0__Impl3546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValOperation__Group__1__Impl_in_rule__ValOperation__Group__13576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValOperation__SubExpressionsAssignment_1_in_rule__ValOperation__Group__1__Impl3603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParanthesedValuedExpression__Group_5__0__Impl_in_rule__ParanthesedValuedExpression__Group_5__03637 = new BitSet(new long[]{0x000000002000A170L});
        public static final BitSet FOLLOW_rule__ParanthesedValuedExpression__Group_5__1_in_rule__ParanthesedValuedExpression__Group_5__03640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__ParanthesedValuedExpression__Group_5__0__Impl3668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParanthesedValuedExpression__Group_5__1__Impl_in_rule__ParanthesedValuedExpression__Group_5__13699 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__ParanthesedValuedExpression__Group_5__2_in_rule__ParanthesedValuedExpression__Group_5__13702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePlusOperation_in_rule__ParanthesedValuedExpression__Group_5__1__Impl3729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParanthesedValuedExpression__Group_5__2__Impl_in_rule__ParanthesedValuedExpression__Group_5__23758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__ParanthesedValuedExpression__Group_5__2__Impl3786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParanthesedValuedExpression__Group_6__0__Impl_in_rule__ParanthesedValuedExpression__Group_6__03823 = new BitSet(new long[]{0x000000002000A170L});
        public static final BitSet FOLLOW_rule__ParanthesedValuedExpression__Group_6__1_in_rule__ParanthesedValuedExpression__Group_6__03826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__ParanthesedValuedExpression__Group_6__0__Impl3854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParanthesedValuedExpression__Group_6__1__Impl_in_rule__ParanthesedValuedExpression__Group_6__13885 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__ParanthesedValuedExpression__Group_6__2_in_rule__ParanthesedValuedExpression__Group_6__13888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivOperation_in_rule__ParanthesedValuedExpression__Group_6__1__Impl3915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParanthesedValuedExpression__Group_6__2__Impl_in_rule__ParanthesedValuedExpression__Group_6__23944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__ParanthesedValuedExpression__Group_6__2__Impl3972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PlusOperation__Group__0__Impl_in_rule__PlusOperation__Group__04009 = new BitSet(new long[]{0x0000000006000002L});
        public static final BitSet FOLLOW_rule__PlusOperation__Group__1_in_rule__PlusOperation__Group__04012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultOrDivOperation_in_rule__PlusOperation__Group__0__Impl4039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PlusOperation__Group__1__Impl_in_rule__PlusOperation__Group__14068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PlusOperation__Group_1__0_in_rule__PlusOperation__Group__1__Impl4095 = new BitSet(new long[]{0x0000000006000002L});
        public static final BitSet FOLLOW_rule__PlusOperation__Group_1__0__Impl_in_rule__PlusOperation__Group_1__04130 = new BitSet(new long[]{0x0000000006000000L});
        public static final BitSet FOLLOW_rule__PlusOperation__Group_1__1_in_rule__PlusOperation__Group_1__04133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PlusOperation__Group_1__1__Impl_in_rule__PlusOperation__Group_1__14191 = new BitSet(new long[]{0x000000002000A170L});
        public static final BitSet FOLLOW_rule__PlusOperation__Group_1__2_in_rule__PlusOperation__Group_1__14194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PlusOperation__OperatorAssignment_1_1_in_rule__PlusOperation__Group_1__1__Impl4221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PlusOperation__Group_1__2__Impl_in_rule__PlusOperation__Group_1__24251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PlusOperation__SubExpressionsAssignment_1_2_in_rule__PlusOperation__Group_1__2__Impl4278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultOrDivOperation__Group_1__0__Impl_in_rule__MultOrDivOperation__Group_1__04314 = new BitSet(new long[]{0x000000002000A170L});
        public static final BitSet FOLLOW_rule__MultOrDivOperation__Group_1__1_in_rule__MultOrDivOperation__Group_1__04317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__MultOrDivOperation__Group_1__0__Impl4345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultOrDivOperation__Group_1__1__Impl_in_rule__MultOrDivOperation__Group_1__14376 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__MultOrDivOperation__Group_1__2_in_rule__MultOrDivOperation__Group_1__14379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivOperation_in_rule__MultOrDivOperation__Group_1__1__Impl4406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultOrDivOperation__Group_1__2__Impl_in_rule__MultOrDivOperation__Group_1__24435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__MultOrDivOperation__Group_1__2__Impl4463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultOperation__Group__0__Impl_in_rule__MultOperation__Group__04500 = new BitSet(new long[]{0x0000000018000002L});
        public static final BitSet FOLLOW_rule__MultOperation__Group__1_in_rule__MultOperation__Group__04503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePreOrNormalValuedExpression_in_rule__MultOperation__Group__0__Impl4530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultOperation__Group__1__Impl_in_rule__MultOperation__Group__14559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultOperation__Group_1__0_in_rule__MultOperation__Group__1__Impl4586 = new BitSet(new long[]{0x0000000018000002L});
        public static final BitSet FOLLOW_rule__MultOperation__Group_1__0__Impl_in_rule__MultOperation__Group_1__04621 = new BitSet(new long[]{0x0000000018000000L});
        public static final BitSet FOLLOW_rule__MultOperation__Group_1__1_in_rule__MultOperation__Group_1__04624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultOperation__Group_1__1__Impl_in_rule__MultOperation__Group_1__14682 = new BitSet(new long[]{0x000000002000A170L});
        public static final BitSet FOLLOW_rule__MultOperation__Group_1__2_in_rule__MultOperation__Group_1__14685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultOperation__OperatorAssignment_1_1_in_rule__MultOperation__Group_1__1__Impl4712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultOperation__Group_1__2__Impl_in_rule__MultOperation__Group_1__24742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultOperation__SubExpressionsAssignment_1_2_in_rule__MultOperation__Group_1__2__Impl4769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivOperation__Group__0__Impl_in_rule__DivOperation__Group__04805 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__DivOperation__Group__1_in_rule__DivOperation__Group__04808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePreOrNormalValuedExpression_in_rule__DivOperation__Group__0__Impl4835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivOperation__Group__1__Impl_in_rule__DivOperation__Group__14864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivOperation__Group_1__0_in_rule__DivOperation__Group__1__Impl4891 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__DivOperation__Group_1__0__Impl_in_rule__DivOperation__Group_1__04926 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__DivOperation__Group_1__1_in_rule__DivOperation__Group_1__04929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivOperation__Group_1__1__Impl_in_rule__DivOperation__Group_1__14987 = new BitSet(new long[]{0x000000002000A170L});
        public static final BitSet FOLLOW_rule__DivOperation__Group_1__2_in_rule__DivOperation__Group_1__14990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivOperation__OperatorAssignment_1_1_in_rule__DivOperation__Group_1__1__Impl5017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivOperation__Group_1__2__Impl_in_rule__DivOperation__Group_1__25047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivOperation__SubExpressionsAssignment_1_2_in_rule__DivOperation__Group_1__2__Impl5074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PreArithmOperation__Group__0__Impl_in_rule__PreArithmOperation__Group__05110 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__PreArithmOperation__Group__1_in_rule__PreArithmOperation__Group__05113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PreArithmOperation__OperatorAssignment_0_in_rule__PreArithmOperation__Group__0__Impl5140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PreArithmOperation__Group__1__Impl_in_rule__PreArithmOperation__Group__15170 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__PreArithmOperation__Group__2_in_rule__PreArithmOperation__Group__15173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__PreArithmOperation__Group__1__Impl5201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PreArithmOperation__Group__2__Impl_in_rule__PreArithmOperation__Group__25232 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__PreArithmOperation__Group__3_in_rule__PreArithmOperation__Group__25235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PreArithmOperation__SubExpressionsAssignment_2_in_rule__PreArithmOperation__Group__2__Impl5262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PreArithmOperation__Group__3__Impl_in_rule__PreArithmOperation__Group__35292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__PreArithmOperation__Group__3__Impl5320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group__0__Impl_in_rule__CompareOperation__Group__05359 = new BitSet(new long[]{0x0000000001F80000L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group__1_in_rule__CompareOperation__Group__05362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_rule__CompareOperation__Group__0__Impl5389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group__1__Impl_in_rule__CompareOperation__Group__15418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_1__0_in_rule__CompareOperation__Group__1__Impl5445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_1__0__Impl_in_rule__CompareOperation__Group_1__05479 = new BitSet(new long[]{0x0000000001F80000L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_1__1_in_rule__CompareOperation__Group_1__05482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_1__1__Impl_in_rule__CompareOperation__Group_1__15540 = new BitSet(new long[]{0x000000002000A170L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_1__2_in_rule__CompareOperation__Group_1__15543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__OperatorAssignment_1_1_in_rule__CompareOperation__Group_1__1__Impl5570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_1__2__Impl_in_rule__CompareOperation__Group_1__25600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__SubExpressionsAssignment_1_2_in_rule__CompareOperation__Group_1__2__Impl5627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperation__Group__0__Impl_in_rule__UnaryOperation__Group__05663 = new BitSet(new long[]{0x000000002000A1F0L});
        public static final BitSet FOLLOW_rule__UnaryOperation__Group__1_in_rule__UnaryOperation__Group__05666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperation__OperatorAssignment_0_in_rule__UnaryOperation__Group__0__Impl5693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperation__Group__1__Impl_in_rule__UnaryOperation__Group__15723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperation__SubExpressionsAssignment_1_in_rule__UnaryOperation__Group__1__Impl5750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__Group__0__Impl_in_rule__UnaryParanthesedOperation__Group__05784 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__Group__1_in_rule__UnaryParanthesedOperation__Group__05787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__OperatorAssignment_0_in_rule__UnaryParanthesedOperation__Group__0__Impl5814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__Group__1__Impl_in_rule__UnaryParanthesedOperation__Group__15844 = new BitSet(new long[]{0x000000002000E1F0L});
        public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__Group__2_in_rule__UnaryParanthesedOperation__Group__15847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__UnaryParanthesedOperation__Group__1__Impl5875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__Group__2__Impl_in_rule__UnaryParanthesedOperation__Group__25906 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__Group__3_in_rule__UnaryParanthesedOperation__Group__25909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__SubExpressionsAssignment_2_in_rule__UnaryParanthesedOperation__Group__2__Impl5936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__Group__3__Impl_in_rule__UnaryParanthesedOperation__Group__35966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__UnaryParanthesedOperation__Group__3__Impl5994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndOperation__Group__0__Impl_in_rule__AndOperation__Group__06033 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__AndOperation__Group__1_in_rule__AndOperation__Group__06036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOrNormalExpression_in_rule__AndOperation__Group__0__Impl6063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndOperation__Group__1__Impl_in_rule__AndOperation__Group__16092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndOperation__Group_1__0_in_rule__AndOperation__Group__1__Impl6119 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__AndOperation__Group_1__0__Impl_in_rule__AndOperation__Group_1__06154 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__AndOperation__Group_1__1_in_rule__AndOperation__Group_1__06157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndOperation__Group_1__1__Impl_in_rule__AndOperation__Group_1__16215 = new BitSet(new long[]{0x000000002000E1F0L});
        public static final BitSet FOLLOW_rule__AndOperation__Group_1__2_in_rule__AndOperation__Group_1__16218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndOperation__OperatorAssignment_1_1_in_rule__AndOperation__Group_1__1__Impl6245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndOperation__Group_1__2__Impl_in_rule__AndOperation__Group_1__26275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndOperation__SubExpressionsAssignment_1_2_in_rule__AndOperation__Group_1__2__Impl6302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrOperation__Group__0__Impl_in_rule__OrOperation__Group__06338 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__OrOperation__Group__1_in_rule__OrOperation__Group__06341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndOperation_in_rule__OrOperation__Group__0__Impl6368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrOperation__Group__1__Impl_in_rule__OrOperation__Group__16397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrOperation__Group_1__0_in_rule__OrOperation__Group__1__Impl6424 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__OrOperation__Group_1__0__Impl_in_rule__OrOperation__Group_1__06459 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__OrOperation__Group_1__1_in_rule__OrOperation__Group_1__06462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrOperation__Group_1__1__Impl_in_rule__OrOperation__Group_1__16520 = new BitSet(new long[]{0x000000002000E1F0L});
        public static final BitSet FOLLOW_rule__OrOperation__Group_1__2_in_rule__OrOperation__Group_1__16523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrOperation__OperatorAssignment_1_1_in_rule__OrOperation__Group_1__1__Impl6550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrOperation__Group_1__2__Impl_in_rule__OrOperation__Group_1__26580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrOperation__SubExpressionsAssignment_1_2_in_rule__OrOperation__Group_1__2__Impl6607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParanthesedBooleanExpression__Group_5__0__Impl_in_rule__ParanthesedBooleanExpression__Group_5__06643 = new BitSet(new long[]{0x000000002000E1F0L});
        public static final BitSet FOLLOW_rule__ParanthesedBooleanExpression__Group_5__1_in_rule__ParanthesedBooleanExpression__Group_5__06646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__ParanthesedBooleanExpression__Group_5__0__Impl6674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParanthesedBooleanExpression__Group_5__1__Impl_in_rule__ParanthesedBooleanExpression__Group_5__16705 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__ParanthesedBooleanExpression__Group_5__2_in_rule__ParanthesedBooleanExpression__Group_5__16708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrOperation_in_rule__ParanthesedBooleanExpression__Group_5__1__Impl6735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParanthesedBooleanExpression__Group_5__2__Impl_in_rule__ParanthesedBooleanExpression__Group_5__26764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__ParanthesedBooleanExpression__Group_5__2__Impl6792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group__0__Impl_in_rule__TextExpression__Group__06829 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group__1_in_rule__TextExpression__Group__06832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__CodeAssignment_0_in_rule__TextExpression__Group__0__Impl6859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group__1__Impl_in_rule__TextExpression__Group__16889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group_1__0_in_rule__TextExpression__Group__1__Impl6916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group_1__0__Impl_in_rule__TextExpression__Group_1__06951 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__TextExpression__Group_1__1_in_rule__TextExpression__Group_1__06954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__TextExpression__Group_1__0__Impl6982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group_1__1__Impl_in_rule__TextExpression__Group_1__17013 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__TextExpression__Group_1__2_in_rule__TextExpression__Group_1__17016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__TypeAssignment_1_1_in_rule__TextExpression__Group_1__1__Impl7043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group_1__2__Impl_in_rule__TextExpression__Group_1__27073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__TextExpression__Group_1__2__Impl7101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__SignalReference__SignalAssignment_07147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__SignalReference__SubExpressionsAssignment_1_1_07182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__VariableReference__VariableAssignment_07217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__VariableReference__SubExpressionsAssignment_1_1_07252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment7285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_rule__FloatValue__ValueAssignment7316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__BooleanValue__ValueAssignment7347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValOperator_in_rule__ValOperation__OperatorAssignment_07378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignalReference_in_rule__ValOperation__SubExpressionsAssignment_17409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePlusOperator_in_rule__PlusOperation__OperatorAssignment_1_17440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultOrDivOperation_in_rule__PlusOperation__SubExpressionsAssignment_1_27471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultOperator_in_rule__MultOperation__OperatorAssignment_1_17502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePreOrNormalValuedExpression_in_rule__MultOperation__SubExpressionsAssignment_1_27533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivOperator_in_rule__DivOperation__OperatorAssignment_1_17564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePreOrNormalValuedExpression_in_rule__DivOperation__SubExpressionsAssignment_1_27595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryParanthesedOperator_in_rule__PreArithmOperation__OperatorAssignment_07626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValOperation_in_rule__PreArithmOperation__SubExpressionsAssignment_27657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperator_in_rule__CompareOperation__OperatorAssignment_1_17688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_rule__CompareOperation__SubExpressionsAssignment_1_27719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperator_in_rule__UnaryOperation__OperatorAssignment_07750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperation__SubExpressionsAlternatives_1_0_in_rule__UnaryOperation__SubExpressionsAssignment_17781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryParanthesedOperator_in_rule__UnaryParanthesedOperation__OperatorAssignment_07814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__UnaryParanthesedOperation__SubExpressionsAssignment_27845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperatorAnd_in_rule__AndOperation__OperatorAssignment_1_17876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOrNormalExpression_in_rule__AndOperation__SubExpressionsAssignment_1_27907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperatorOr_in_rule__OrOperation__OperatorAssignment_1_17938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndOperation_in_rule__OrOperation__SubExpressionsAssignment_1_27969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__TextExpression__CodeAssignment_08000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__TextExpression__TypeAssignment_1_18031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParanthesedValuedExpression__Group_5__0_in_synpred61956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultOperation_in_synpred72007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParanthesedBooleanExpression_in_synpred92106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryParanthesedOperation_in_synpred112172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_synpred132238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignalReference_in_synpred142255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValOperation_in_synpred152272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_synpred162289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_synpred172339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SignalReference__Group_1__0_in_synpred252731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__Group_1__0_in_synpred283167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group_1__0_in_synpred366916 = new BitSet(new long[]{0x0000000000000002L});
    }


}