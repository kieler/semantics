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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:686:1: entryRuleTextExpression : ruleTextExpression EOF ;
    public final void entryRuleTextExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:687:1: ( ruleTextExpression EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:688:1: ruleTextExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_entryRuleTextExpression1393);
            ruleTextExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTextExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextExpression1400); if (failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:695:1: ruleTextExpression : ( ( rule__TextExpression__Group__0 ) ) ;
    public final void ruleTextExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:699:2: ( ( ( rule__TextExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:700:1: ( ( rule__TextExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:700:1: ( ( rule__TextExpression__Group__0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:701:1: ( rule__TextExpression__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:702:1: ( rule__TextExpression__Group__0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:702:2: rule__TextExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group__0_in_ruleTextExpression1426);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:714:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:715:1: ( ruleExpression EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:716:1: ruleExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression1453);
            ruleExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression1460); if (failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:723:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:727:2: ( ( ( rule__Expression__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:728:1: ( ( rule__Expression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:728:1: ( ( rule__Expression__Alternatives ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:729:1: ( rule__Expression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:730:1: ( rule__Expression__Alternatives )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:730:2: rule__Expression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Alternatives_in_ruleExpression1486);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:745:1: ruleValOperator : ( ( '?' ) ) ;
    public final void ruleValOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:749:1: ( ( ( '?' ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:750:1: ( ( '?' ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:750:1: ( ( '?' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:751:1: ( '?' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValOperatorAccess().getVALEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:752:1: ( '?' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:752:3: '?'
            {
            match(input,13,FollowSets000.FOLLOW_13_in_ruleValOperator1526); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:765:1: ruleCompareOperator : ( ( rule__CompareOperator__Alternatives ) ) ;
    public final void ruleCompareOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:769:1: ( ( ( rule__CompareOperator__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:770:1: ( ( rule__CompareOperator__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:770:1: ( ( rule__CompareOperator__Alternatives ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:771:1: ( rule__CompareOperator__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:772:1: ( rule__CompareOperator__Alternatives )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:772:2: rule__CompareOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperator__Alternatives_in_ruleCompareOperator1564);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:784:1: ruleUnaryOperator : ( ( 'not' ) ) ;
    public final void ruleUnaryOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:788:1: ( ( ( 'not' ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:789:1: ( ( 'not' ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:789:1: ( ( 'not' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:790:1: ( 'not' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryOperatorAccess().getNOTEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:791:1: ( 'not' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:791:3: 'not'
            {
            match(input,14,FollowSets000.FOLLOW_14_in_ruleUnaryOperator1601); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:804:1: ruleUnaryParanthesedOperator : ( ( 'pre' ) ) ;
    public final void ruleUnaryParanthesedOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:808:1: ( ( ( 'pre' ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:809:1: ( ( 'pre' ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:809:1: ( ( 'pre' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:810:1: ( 'pre' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperatorAccess().getPREEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:811:1: ( 'pre' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:811:3: 'pre'
            {
            match(input,15,FollowSets000.FOLLOW_15_in_ruleUnaryParanthesedOperator1640); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:824:1: ruleOperatorOr : ( ( 'or' ) ) ;
    public final void ruleOperatorOr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:828:1: ( ( ( 'or' ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:829:1: ( ( 'or' ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:829:1: ( ( 'or' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:830:1: ( 'or' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOperatorOrAccess().getOREnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:831:1: ( 'or' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:831:3: 'or'
            {
            match(input,16,FollowSets000.FOLLOW_16_in_ruleOperatorOr1679); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:844:1: ruleOperatorAnd : ( ( 'and' ) ) ;
    public final void ruleOperatorAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:848:1: ( ( ( 'and' ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:849:1: ( ( 'and' ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:849:1: ( ( 'and' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:850:1: ( 'and' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOperatorAndAccess().getANDEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:851:1: ( 'and' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:851:3: 'and'
            {
            match(input,17,FollowSets000.FOLLOW_17_in_ruleOperatorAnd1718); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:866:1: rulePlusOperator : ( ( rule__PlusOperator__Alternatives ) ) ;
    public final void rulePlusOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:870:1: ( ( ( rule__PlusOperator__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:871:1: ( ( rule__PlusOperator__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:871:1: ( ( rule__PlusOperator__Alternatives ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:872:1: ( rule__PlusOperator__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperatorAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:873:1: ( rule__PlusOperator__Alternatives )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:873:2: rule__PlusOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__PlusOperator__Alternatives_in_rulePlusOperator1758);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:885:1: ruleMultOperator : ( ( rule__MultOperator__Alternatives ) ) ;
    public final void ruleMultOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:889:1: ( ( ( rule__MultOperator__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:890:1: ( ( rule__MultOperator__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:890:1: ( ( rule__MultOperator__Alternatives ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:891:1: ( rule__MultOperator__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperatorAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:892:1: ( rule__MultOperator__Alternatives )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:892:2: rule__MultOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultOperator__Alternatives_in_ruleMultOperator1794);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:904:1: ruleDivOperator : ( ( '/' ) ) ;
    public final void ruleDivOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:908:1: ( ( ( '/' ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:909:1: ( ( '/' ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:909:1: ( ( '/' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:910:1: ( '/' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperatorAccess().getDIVEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:911:1: ( '/' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:911:3: '/'
            {
            match(input,18,FollowSets000.FOLLOW_18_in_ruleDivOperator1831); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:928:1: rule__ParanthesedValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleValOperation ) | ( ruleVariableReference ) | ( ruleTextExpression ) | ( ( rule__ParanthesedValuedExpression__Group_5__0 ) ) | ( ( rule__ParanthesedValuedExpression__Group_6__0 ) ) );
    public final void rule__ParanthesedValuedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:932:1: ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleValOperation ) | ( ruleVariableReference ) | ( ruleTextExpression ) | ( ( rule__ParanthesedValuedExpression__Group_5__0 ) ) | ( ( rule__ParanthesedValuedExpression__Group_6__0 ) ) )
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
                        new NoViableAltException("928:1: rule__ParanthesedValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleValOperation ) | ( ruleVariableReference ) | ( ruleTextExpression ) | ( ( rule__ParanthesedValuedExpression__Group_5__0 ) ) | ( ( rule__ParanthesedValuedExpression__Group_6__0 ) ) );", 1, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("928:1: rule__ParanthesedValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleValOperation ) | ( ruleVariableReference ) | ( ruleTextExpression ) | ( ( rule__ParanthesedValuedExpression__Group_5__0 ) ) | ( ( rule__ParanthesedValuedExpression__Group_6__0 ) ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:933:1: ( ruleIntValue )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:933:1: ( ruleIntValue )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:934:1: ruleIntValue
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedValuedExpressionAccess().getIntValueParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIntValue_in_rule__ParanthesedValuedExpression__Alternatives1873);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:939:6: ( ruleFloatValue )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:939:6: ( ruleFloatValue )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:940:1: ruleFloatValue
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedValuedExpressionAccess().getFloatValueParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_rule__ParanthesedValuedExpression__Alternatives1890);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:945:6: ( ruleValOperation )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:945:6: ( ruleValOperation )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:946:1: ruleValOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedValuedExpressionAccess().getValOperationParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValOperation_in_rule__ParanthesedValuedExpression__Alternatives1907);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:951:6: ( ruleVariableReference )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:951:6: ( ruleVariableReference )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:952:1: ruleVariableReference
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedValuedExpressionAccess().getVariableReferenceParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVariableReference_in_rule__ParanthesedValuedExpression__Alternatives1924);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:957:6: ( ruleTextExpression )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:957:6: ( ruleTextExpression )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:958:1: ruleTextExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedValuedExpressionAccess().getTextExpressionParserRuleCall_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_rule__ParanthesedValuedExpression__Alternatives1941);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:963:6: ( ( rule__ParanthesedValuedExpression__Group_5__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:963:6: ( ( rule__ParanthesedValuedExpression__Group_5__0 ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:964:1: ( rule__ParanthesedValuedExpression__Group_5__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedValuedExpressionAccess().getGroup_5()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:965:1: ( rule__ParanthesedValuedExpression__Group_5__0 )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:965:2: rule__ParanthesedValuedExpression__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ParanthesedValuedExpression__Group_5__0_in_rule__ParanthesedValuedExpression__Alternatives1958);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:969:6: ( ( rule__ParanthesedValuedExpression__Group_6__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:969:6: ( ( rule__ParanthesedValuedExpression__Group_6__0 ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:970:1: ( rule__ParanthesedValuedExpression__Group_6__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedValuedExpressionAccess().getGroup_6()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:971:1: ( rule__ParanthesedValuedExpression__Group_6__0 )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:971:2: rule__ParanthesedValuedExpression__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ParanthesedValuedExpression__Group_6__0_in_rule__ParanthesedValuedExpression__Alternatives1976);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:980:1: rule__MultOrDivOperation__Alternatives : ( ( ruleMultOperation ) | ( ( rule__MultOrDivOperation__Group_1__0 ) ) );
    public final void rule__MultOrDivOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:984:1: ( ( ruleMultOperation ) | ( ( rule__MultOrDivOperation__Group_1__0 ) ) )
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
                        new NoViableAltException("980:1: rule__MultOrDivOperation__Alternatives : ( ( ruleMultOperation ) | ( ( rule__MultOrDivOperation__Group_1__0 ) ) );", 2, 7, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("980:1: rule__MultOrDivOperation__Alternatives : ( ( ruleMultOperation ) | ( ( rule__MultOrDivOperation__Group_1__0 ) ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:985:1: ( ruleMultOperation )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:985:1: ( ruleMultOperation )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:986:1: ruleMultOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMultOrDivOperationAccess().getMultOperationParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMultOperation_in_rule__MultOrDivOperation__Alternatives2009);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:991:6: ( ( rule__MultOrDivOperation__Group_1__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:991:6: ( ( rule__MultOrDivOperation__Group_1__0 ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:992:1: ( rule__MultOrDivOperation__Group_1__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMultOrDivOperationAccess().getGroup_1()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:993:1: ( rule__MultOrDivOperation__Group_1__0 )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:993:2: rule__MultOrDivOperation__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MultOrDivOperation__Group_1__0_in_rule__MultOrDivOperation__Alternatives2026);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1002:1: rule__PreOrNormalValuedExpression__Alternatives : ( ( rulePreArithmOperation ) | ( ruleParanthesedValuedExpression ) );
    public final void rule__PreOrNormalValuedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1006:1: ( ( rulePreArithmOperation ) | ( ruleParanthesedValuedExpression ) )
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
                    new NoViableAltException("1002:1: rule__PreOrNormalValuedExpression__Alternatives : ( ( rulePreArithmOperation ) | ( ruleParanthesedValuedExpression ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1007:1: ( rulePreArithmOperation )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1007:1: ( rulePreArithmOperation )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1008:1: rulePreArithmOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPreOrNormalValuedExpressionAccess().getPreArithmOperationParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePreArithmOperation_in_rule__PreOrNormalValuedExpression__Alternatives2059);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1013:6: ( ruleParanthesedValuedExpression )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1013:6: ( ruleParanthesedValuedExpression )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1014:1: ruleParanthesedValuedExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPreOrNormalValuedExpressionAccess().getParanthesedValuedExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleParanthesedValuedExpression_in_rule__PreOrNormalValuedExpression__Alternatives2076);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1024:1: rule__UnaryOperation__SubExpressionsAlternatives_1_0 : ( ( ruleParanthesedBooleanExpression ) | ( ruleUnaryParanthesedOperation ) );
    public final void rule__UnaryOperation__SubExpressionsAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1028:1: ( ( ruleParanthesedBooleanExpression ) | ( ruleUnaryParanthesedOperation ) )
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
                                        new NoViableAltException("1024:1: rule__UnaryOperation__SubExpressionsAlternatives_1_0 : ( ( ruleParanthesedBooleanExpression ) | ( ruleUnaryParanthesedOperation ) );", 4, 7, input);

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
                                        new NoViableAltException("1024:1: rule__UnaryOperation__SubExpressionsAlternatives_1_0 : ( ( ruleParanthesedBooleanExpression ) | ( ruleUnaryParanthesedOperation ) );", 4, 8, input);

                                    throw nvae;
                                }
                                }
                                break;
                            default:
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1024:1: rule__UnaryOperation__SubExpressionsAlternatives_1_0 : ( ( ruleParanthesedBooleanExpression ) | ( ruleUnaryParanthesedOperation ) );", 4, 6, input);

                                throw nvae;
                            }

                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("1024:1: rule__UnaryOperation__SubExpressionsAlternatives_1_0 : ( ( ruleParanthesedBooleanExpression ) | ( ruleUnaryParanthesedOperation ) );", 4, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1024:1: rule__UnaryOperation__SubExpressionsAlternatives_1_0 : ( ( ruleParanthesedBooleanExpression ) | ( ruleUnaryParanthesedOperation ) );", 4, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1024:1: rule__UnaryOperation__SubExpressionsAlternatives_1_0 : ( ( ruleParanthesedBooleanExpression ) | ( ruleUnaryParanthesedOperation ) );", 4, 2, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1024:1: rule__UnaryOperation__SubExpressionsAlternatives_1_0 : ( ( ruleParanthesedBooleanExpression ) | ( ruleUnaryParanthesedOperation ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1029:1: ( ruleParanthesedBooleanExpression )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1029:1: ( ruleParanthesedBooleanExpression )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1030:1: ruleParanthesedBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getUnaryOperationAccess().getSubExpressionsParanthesedBooleanExpressionParserRuleCall_1_0_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleParanthesedBooleanExpression_in_rule__UnaryOperation__SubExpressionsAlternatives_1_02108);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1035:6: ( ruleUnaryParanthesedOperation )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1035:6: ( ruleUnaryParanthesedOperation )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1036:1: ruleUnaryParanthesedOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getUnaryOperationAccess().getSubExpressionsUnaryParanthesedOperationParserRuleCall_1_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryParanthesedOperation_in_rule__UnaryOperation__SubExpressionsAlternatives_1_02125);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1046:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );
    public final void rule__UnaryOrNormalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1050:1: ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) )
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
                                        new NoViableAltException("1046:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );", 5, 8, input);

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
                                        new NoViableAltException("1046:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );", 5, 9, input);

                                    throw nvae;
                                }
                                }
                                break;
                            default:
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1046:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );", 5, 7, input);

                                throw nvae;
                            }

                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("1046:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );", 5, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1046:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );", 5, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1046:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );", 5, 2, input);

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
                    new NoViableAltException("1046:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1051:1: ( ruleUnaryOperation )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1051:1: ( ruleUnaryOperation )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1052:1: ruleUnaryOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getUnaryOrNormalExpressionAccess().getUnaryOperationParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryOperation_in_rule__UnaryOrNormalExpression__Alternatives2157);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1057:6: ( ruleUnaryParanthesedOperation )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1057:6: ( ruleUnaryParanthesedOperation )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1058:1: ruleUnaryParanthesedOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getUnaryOrNormalExpressionAccess().getUnaryParanthesedOperationParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryParanthesedOperation_in_rule__UnaryOrNormalExpression__Alternatives2174);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1063:6: ( ruleParanthesedBooleanExpression )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1063:6: ( ruleParanthesedBooleanExpression )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1064:1: ruleParanthesedBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getUnaryOrNormalExpressionAccess().getParanthesedBooleanExpressionParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleParanthesedBooleanExpression_in_rule__UnaryOrNormalExpression__Alternatives2191);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1074:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleTextExpression ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );
    public final void rule__ParanthesedBooleanExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1078:1: ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleTextExpression ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) )
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
                                new NoViableAltException("1074:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleTextExpression ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 6, 13, input);

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
                            new NoViableAltException("1074:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleTextExpression ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 6, 7, input);

                        throw nvae;
                    }

                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1074:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleTextExpression ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 6, 3, input);

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
                            new NoViableAltException("1074:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleTextExpression ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 6, 8, input);

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
                        new NoViableAltException("1074:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleTextExpression ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 6, 4, input);

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
                            new NoViableAltException("1074:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleTextExpression ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 6, 10, input);

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
                        new NoViableAltException("1074:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleTextExpression ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 6, 5, input);

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
                        new NoViableAltException("1074:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleTextExpression ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 6, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1074:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleTextExpression ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1079:1: ( ruleBooleanValue )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1079:1: ( ruleBooleanValue )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1080:1: ruleBooleanValue
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedBooleanExpressionAccess().getBooleanValueParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanValue_in_rule__ParanthesedBooleanExpression__Alternatives2223);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1085:6: ( ruleCompareOperation )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1085:6: ( ruleCompareOperation )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1086:1: ruleCompareOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedBooleanExpressionAccess().getCompareOperationParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_rule__ParanthesedBooleanExpression__Alternatives2240);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1091:6: ( ruleSignalReference )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1091:6: ( ruleSignalReference )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1092:1: ruleSignalReference
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedBooleanExpressionAccess().getSignalReferenceParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSignalReference_in_rule__ParanthesedBooleanExpression__Alternatives2257);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1097:6: ( ruleValOperation )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1097:6: ( ruleValOperation )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1098:1: ruleValOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedBooleanExpressionAccess().getValOperationParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValOperation_in_rule__ParanthesedBooleanExpression__Alternatives2274);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1103:6: ( ruleTextExpression )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1103:6: ( ruleTextExpression )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1104:1: ruleTextExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedBooleanExpressionAccess().getTextExpressionParserRuleCall_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_rule__ParanthesedBooleanExpression__Alternatives2291);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1109:6: ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1109:6: ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1110:1: ( rule__ParanthesedBooleanExpression__Group_5__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedBooleanExpressionAccess().getGroup_5()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1111:1: ( rule__ParanthesedBooleanExpression__Group_5__0 )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1111:2: rule__ParanthesedBooleanExpression__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ParanthesedBooleanExpression__Group_5__0_in_rule__ParanthesedBooleanExpression__Alternatives2308);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1121:1: rule__Expression__Alternatives : ( ( ruleValuedExpression ) | ( ruleBooleanExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1125:1: ( ( ruleValuedExpression ) | ( ruleBooleanExpression ) )
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
                        new NoViableAltException("1121:1: rule__Expression__Alternatives : ( ( ruleValuedExpression ) | ( ruleBooleanExpression ) );", 7, 1, input);

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
                        new NoViableAltException("1121:1: rule__Expression__Alternatives : ( ( ruleValuedExpression ) | ( ruleBooleanExpression ) );", 7, 2, input);

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
                        new NoViableAltException("1121:1: rule__Expression__Alternatives : ( ( ruleValuedExpression ) | ( ruleBooleanExpression ) );", 7, 3, input);

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
                        new NoViableAltException("1121:1: rule__Expression__Alternatives : ( ( ruleValuedExpression ) | ( ruleBooleanExpression ) );", 7, 4, input);

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
                        new NoViableAltException("1121:1: rule__Expression__Alternatives : ( ( ruleValuedExpression ) | ( ruleBooleanExpression ) );", 7, 5, input);

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
                        new NoViableAltException("1121:1: rule__Expression__Alternatives : ( ( ruleValuedExpression ) | ( ruleBooleanExpression ) );", 7, 6, input);

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
                        new NoViableAltException("1121:1: rule__Expression__Alternatives : ( ( ruleValuedExpression ) | ( ruleBooleanExpression ) );", 7, 7, input);

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
                    new NoViableAltException("1121:1: rule__Expression__Alternatives : ( ( ruleValuedExpression ) | ( ruleBooleanExpression ) );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1126:1: ( ruleValuedExpression )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1126:1: ( ruleValuedExpression )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1127:1: ruleValuedExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_rule__Expression__Alternatives2342);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1132:6: ( ruleBooleanExpression )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1132:6: ( ruleBooleanExpression )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1133:1: ruleBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_rule__Expression__Alternatives2359);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1144:1: rule__CompareOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1148:1: ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) )
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
                    new NoViableAltException("1144:1: rule__CompareOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) );", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1149:1: ( ( '=' ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1149:1: ( ( '=' ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1150:1: ( '=' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1151:1: ( '=' )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1151:3: '='
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__CompareOperator__Alternatives2393); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1156:6: ( ( '<' ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1156:6: ( ( '<' ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1157:1: ( '<' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1158:1: ( '<' )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1158:3: '<'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__CompareOperator__Alternatives2414); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1163:6: ( ( '<=' ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1163:6: ( ( '<=' ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1164:1: ( '<=' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1165:1: ( '<=' )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1165:3: '<='
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__CompareOperator__Alternatives2435); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1170:6: ( ( '>' ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1170:6: ( ( '>' ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1171:1: ( '>' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1172:1: ( '>' )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1172:3: '>'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__CompareOperator__Alternatives2456); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1177:6: ( ( '>=' ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1177:6: ( ( '>=' ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1178:1: ( '>=' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1179:1: ( '>=' )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1179:3: '>='
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__CompareOperator__Alternatives2477); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1184:6: ( ( '<>' ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1184:6: ( ( '<>' ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1185:1: ( '<>' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_5()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1186:1: ( '<>' )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1186:3: '<>'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__CompareOperator__Alternatives2498); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1196:1: rule__PlusOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__PlusOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1200:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
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
                    new NoViableAltException("1196:1: rule__PlusOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1201:1: ( ( '+' ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1201:1: ( ( '+' ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1202:1: ( '+' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPlusOperatorAccess().getADDEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1203:1: ( '+' )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1203:3: '+'
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_rule__PlusOperator__Alternatives2534); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getPlusOperatorAccess().getADDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1208:6: ( ( '-' ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1208:6: ( ( '-' ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1209:1: ( '-' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPlusOperatorAccess().getSUBEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1210:1: ( '-' )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1210:3: '-'
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_rule__PlusOperator__Alternatives2555); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1220:1: rule__MultOperator__Alternatives : ( ( ( '*' ) ) | ( ( 'mod' ) ) );
    public final void rule__MultOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1224:1: ( ( ( '*' ) ) | ( ( 'mod' ) ) )
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
                    new NoViableAltException("1220:1: rule__MultOperator__Alternatives : ( ( ( '*' ) ) | ( ( 'mod' ) ) );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1225:1: ( ( '*' ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1225:1: ( ( '*' ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1226:1: ( '*' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1227:1: ( '*' )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1227:3: '*'
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_rule__MultOperator__Alternatives2591); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1232:6: ( ( 'mod' ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1232:6: ( ( 'mod' ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1233:1: ( 'mod' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMultOperatorAccess().getMODEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1234:1: ( 'mod' )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1234:3: 'mod'
                    {
                    match(input,28,FollowSets000.FOLLOW_28_in_rule__MultOperator__Alternatives2612); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1248:1: rule__SignalReference__Group__0 : rule__SignalReference__Group__0__Impl rule__SignalReference__Group__1 ;
    public final void rule__SignalReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1252:1: ( rule__SignalReference__Group__0__Impl rule__SignalReference__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1253:2: rule__SignalReference__Group__0__Impl rule__SignalReference__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SignalReference__Group__0__Impl_in_rule__SignalReference__Group__02647);
            rule__SignalReference__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SignalReference__Group__1_in_rule__SignalReference__Group__02650);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1260:1: rule__SignalReference__Group__0__Impl : ( ( rule__SignalReference__SignalAssignment_0 ) ) ;
    public final void rule__SignalReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1264:1: ( ( ( rule__SignalReference__SignalAssignment_0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1265:1: ( ( rule__SignalReference__SignalAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1265:1: ( ( rule__SignalReference__SignalAssignment_0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1266:1: ( rule__SignalReference__SignalAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getSignalAssignment_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1267:1: ( rule__SignalReference__SignalAssignment_0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1267:2: rule__SignalReference__SignalAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SignalReference__SignalAssignment_0_in_rule__SignalReference__Group__0__Impl2677);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1277:1: rule__SignalReference__Group__1 : rule__SignalReference__Group__1__Impl ;
    public final void rule__SignalReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1281:1: ( rule__SignalReference__Group__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1282:2: rule__SignalReference__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SignalReference__Group__1__Impl_in_rule__SignalReference__Group__12707);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1288:1: rule__SignalReference__Group__1__Impl : ( ( rule__SignalReference__Group_1__0 )? ) ;
    public final void rule__SignalReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1292:1: ( ( ( rule__SignalReference__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1293:1: ( ( rule__SignalReference__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1293:1: ( ( rule__SignalReference__Group_1__0 )? )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1294:1: ( rule__SignalReference__Group_1__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1295:1: ( rule__SignalReference__Group_1__0 )?
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1295:2: rule__SignalReference__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SignalReference__Group_1__0_in_rule__SignalReference__Group__1__Impl2734);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1309:1: rule__SignalReference__Group_1__0 : rule__SignalReference__Group_1__0__Impl rule__SignalReference__Group_1__1 ;
    public final void rule__SignalReference__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1313:1: ( rule__SignalReference__Group_1__0__Impl rule__SignalReference__Group_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1314:2: rule__SignalReference__Group_1__0__Impl rule__SignalReference__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SignalReference__Group_1__0__Impl_in_rule__SignalReference__Group_1__02769);
            rule__SignalReference__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SignalReference__Group_1__1_in_rule__SignalReference__Group_1__02772);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1321:1: rule__SignalReference__Group_1__0__Impl : ( '(' ) ;
    public final void rule__SignalReference__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1325:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1326:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1326:1: ( '(' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1327:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__SignalReference__Group_1__0__Impl2800); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1340:1: rule__SignalReference__Group_1__1 : rule__SignalReference__Group_1__1__Impl rule__SignalReference__Group_1__2 ;
    public final void rule__SignalReference__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1344:1: ( rule__SignalReference__Group_1__1__Impl rule__SignalReference__Group_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1345:2: rule__SignalReference__Group_1__1__Impl rule__SignalReference__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SignalReference__Group_1__1__Impl_in_rule__SignalReference__Group_1__12831);
            rule__SignalReference__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SignalReference__Group_1__2_in_rule__SignalReference__Group_1__12834);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1352:1: rule__SignalReference__Group_1__1__Impl : ( ( rule__SignalReference__Group_1_1__0 )* ) ;
    public final void rule__SignalReference__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1356:1: ( ( ( rule__SignalReference__Group_1_1__0 )* ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1357:1: ( ( rule__SignalReference__Group_1_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1357:1: ( ( rule__SignalReference__Group_1_1__0 )* )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1358:1: ( rule__SignalReference__Group_1_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getGroup_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1359:1: ( rule__SignalReference__Group_1_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_STRING)||(LA12_0>=13 && LA12_0<=15)||LA12_0==29) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1359:2: rule__SignalReference__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SignalReference__Group_1_1__0_in_rule__SignalReference__Group_1__1__Impl2861);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1369:1: rule__SignalReference__Group_1__2 : rule__SignalReference__Group_1__2__Impl ;
    public final void rule__SignalReference__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1373:1: ( rule__SignalReference__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1374:2: rule__SignalReference__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SignalReference__Group_1__2__Impl_in_rule__SignalReference__Group_1__22892);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1380:1: rule__SignalReference__Group_1__2__Impl : ( ')' ) ;
    public final void rule__SignalReference__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1384:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1385:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1385:1: ( ')' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1386:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__SignalReference__Group_1__2__Impl2920); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1405:1: rule__SignalReference__Group_1_1__0 : rule__SignalReference__Group_1_1__0__Impl rule__SignalReference__Group_1_1__1 ;
    public final void rule__SignalReference__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1409:1: ( rule__SignalReference__Group_1_1__0__Impl rule__SignalReference__Group_1_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1410:2: rule__SignalReference__Group_1_1__0__Impl rule__SignalReference__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SignalReference__Group_1_1__0__Impl_in_rule__SignalReference__Group_1_1__02957);
            rule__SignalReference__Group_1_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SignalReference__Group_1_1__1_in_rule__SignalReference__Group_1_1__02960);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1417:1: rule__SignalReference__Group_1_1__0__Impl : ( ( rule__SignalReference__SubExpressionsAssignment_1_1_0 ) ) ;
    public final void rule__SignalReference__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1421:1: ( ( ( rule__SignalReference__SubExpressionsAssignment_1_1_0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1422:1: ( ( rule__SignalReference__SubExpressionsAssignment_1_1_0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1422:1: ( ( rule__SignalReference__SubExpressionsAssignment_1_1_0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1423:1: ( rule__SignalReference__SubExpressionsAssignment_1_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getSubExpressionsAssignment_1_1_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1424:1: ( rule__SignalReference__SubExpressionsAssignment_1_1_0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1424:2: rule__SignalReference__SubExpressionsAssignment_1_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SignalReference__SubExpressionsAssignment_1_1_0_in_rule__SignalReference__Group_1_1__0__Impl2987);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1434:1: rule__SignalReference__Group_1_1__1 : rule__SignalReference__Group_1_1__1__Impl ;
    public final void rule__SignalReference__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1438:1: ( rule__SignalReference__Group_1_1__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1439:2: rule__SignalReference__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SignalReference__Group_1_1__1__Impl_in_rule__SignalReference__Group_1_1__13017);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1445:1: rule__SignalReference__Group_1_1__1__Impl : ( ( ',' )? ) ;
    public final void rule__SignalReference__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1449:1: ( ( ( ',' )? ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1450:1: ( ( ',' )? )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1450:1: ( ( ',' )? )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1451:1: ( ',' )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getCommaKeyword_1_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1452:1: ( ',' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1453:2: ','
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_rule__SignalReference__Group_1_1__1__Impl3046); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1468:1: rule__VariableReference__Group__0 : rule__VariableReference__Group__0__Impl rule__VariableReference__Group__1 ;
    public final void rule__VariableReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1472:1: ( rule__VariableReference__Group__0__Impl rule__VariableReference__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1473:2: rule__VariableReference__Group__0__Impl rule__VariableReference__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group__0__Impl_in_rule__VariableReference__Group__03083);
            rule__VariableReference__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group__1_in_rule__VariableReference__Group__03086);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1480:1: rule__VariableReference__Group__0__Impl : ( ( rule__VariableReference__VariableAssignment_0 ) ) ;
    public final void rule__VariableReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1484:1: ( ( ( rule__VariableReference__VariableAssignment_0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1485:1: ( ( rule__VariableReference__VariableAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1485:1: ( ( rule__VariableReference__VariableAssignment_0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1486:1: ( rule__VariableReference__VariableAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getVariableAssignment_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1487:1: ( rule__VariableReference__VariableAssignment_0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1487:2: rule__VariableReference__VariableAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__VariableAssignment_0_in_rule__VariableReference__Group__0__Impl3113);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1497:1: rule__VariableReference__Group__1 : rule__VariableReference__Group__1__Impl ;
    public final void rule__VariableReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1501:1: ( rule__VariableReference__Group__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1502:2: rule__VariableReference__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group__1__Impl_in_rule__VariableReference__Group__13143);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1508:1: rule__VariableReference__Group__1__Impl : ( ( rule__VariableReference__Group_1__0 )? ) ;
    public final void rule__VariableReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1512:1: ( ( ( rule__VariableReference__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1513:1: ( ( rule__VariableReference__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1513:1: ( ( rule__VariableReference__Group_1__0 )? )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1514:1: ( rule__VariableReference__Group_1__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1515:1: ( rule__VariableReference__Group_1__0 )?
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1515:2: rule__VariableReference__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group_1__0_in_rule__VariableReference__Group__1__Impl3170);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1529:1: rule__VariableReference__Group_1__0 : rule__VariableReference__Group_1__0__Impl rule__VariableReference__Group_1__1 ;
    public final void rule__VariableReference__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1533:1: ( rule__VariableReference__Group_1__0__Impl rule__VariableReference__Group_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1534:2: rule__VariableReference__Group_1__0__Impl rule__VariableReference__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group_1__0__Impl_in_rule__VariableReference__Group_1__03205);
            rule__VariableReference__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group_1__1_in_rule__VariableReference__Group_1__03208);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1541:1: rule__VariableReference__Group_1__0__Impl : ( '(' ) ;
    public final void rule__VariableReference__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1545:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1546:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1546:1: ( '(' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1547:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__VariableReference__Group_1__0__Impl3236); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1560:1: rule__VariableReference__Group_1__1 : rule__VariableReference__Group_1__1__Impl rule__VariableReference__Group_1__2 ;
    public final void rule__VariableReference__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1564:1: ( rule__VariableReference__Group_1__1__Impl rule__VariableReference__Group_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1565:2: rule__VariableReference__Group_1__1__Impl rule__VariableReference__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group_1__1__Impl_in_rule__VariableReference__Group_1__13267);
            rule__VariableReference__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group_1__2_in_rule__VariableReference__Group_1__13270);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1572:1: rule__VariableReference__Group_1__1__Impl : ( ( rule__VariableReference__Group_1_1__0 )* ) ;
    public final void rule__VariableReference__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1576:1: ( ( ( rule__VariableReference__Group_1_1__0 )* ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1577:1: ( ( rule__VariableReference__Group_1_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1577:1: ( ( rule__VariableReference__Group_1_1__0 )* )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1578:1: ( rule__VariableReference__Group_1_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getGroup_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1579:1: ( rule__VariableReference__Group_1_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_STRING)||(LA15_0>=13 && LA15_0<=15)||LA15_0==29) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1579:2: rule__VariableReference__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group_1_1__0_in_rule__VariableReference__Group_1__1__Impl3297);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1589:1: rule__VariableReference__Group_1__2 : rule__VariableReference__Group_1__2__Impl ;
    public final void rule__VariableReference__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1593:1: ( rule__VariableReference__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1594:2: rule__VariableReference__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group_1__2__Impl_in_rule__VariableReference__Group_1__23328);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1600:1: rule__VariableReference__Group_1__2__Impl : ( ')' ) ;
    public final void rule__VariableReference__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1604:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1605:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1605:1: ( ')' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1606:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__VariableReference__Group_1__2__Impl3356); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1625:1: rule__VariableReference__Group_1_1__0 : rule__VariableReference__Group_1_1__0__Impl rule__VariableReference__Group_1_1__1 ;
    public final void rule__VariableReference__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1629:1: ( rule__VariableReference__Group_1_1__0__Impl rule__VariableReference__Group_1_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1630:2: rule__VariableReference__Group_1_1__0__Impl rule__VariableReference__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group_1_1__0__Impl_in_rule__VariableReference__Group_1_1__03393);
            rule__VariableReference__Group_1_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group_1_1__1_in_rule__VariableReference__Group_1_1__03396);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1637:1: rule__VariableReference__Group_1_1__0__Impl : ( ( rule__VariableReference__SubExpressionsAssignment_1_1_0 ) ) ;
    public final void rule__VariableReference__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1641:1: ( ( ( rule__VariableReference__SubExpressionsAssignment_1_1_0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1642:1: ( ( rule__VariableReference__SubExpressionsAssignment_1_1_0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1642:1: ( ( rule__VariableReference__SubExpressionsAssignment_1_1_0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1643:1: ( rule__VariableReference__SubExpressionsAssignment_1_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getSubExpressionsAssignment_1_1_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1644:1: ( rule__VariableReference__SubExpressionsAssignment_1_1_0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1644:2: rule__VariableReference__SubExpressionsAssignment_1_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__SubExpressionsAssignment_1_1_0_in_rule__VariableReference__Group_1_1__0__Impl3423);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1654:1: rule__VariableReference__Group_1_1__1 : rule__VariableReference__Group_1_1__1__Impl ;
    public final void rule__VariableReference__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1658:1: ( rule__VariableReference__Group_1_1__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1659:2: rule__VariableReference__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group_1_1__1__Impl_in_rule__VariableReference__Group_1_1__13453);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1665:1: rule__VariableReference__Group_1_1__1__Impl : ( ( ',' )? ) ;
    public final void rule__VariableReference__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1669:1: ( ( ( ',' )? ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1670:1: ( ( ',' )? )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1670:1: ( ( ',' )? )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1671:1: ( ',' )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getCommaKeyword_1_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1672:1: ( ',' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1673:2: ','
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_rule__VariableReference__Group_1_1__1__Impl3482); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1688:1: rule__ValOperation__Group__0 : rule__ValOperation__Group__0__Impl rule__ValOperation__Group__1 ;
    public final void rule__ValOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1692:1: ( rule__ValOperation__Group__0__Impl rule__ValOperation__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1693:2: rule__ValOperation__Group__0__Impl rule__ValOperation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValOperation__Group__0__Impl_in_rule__ValOperation__Group__03519);
            rule__ValOperation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValOperation__Group__1_in_rule__ValOperation__Group__03522);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1700:1: rule__ValOperation__Group__0__Impl : ( ( rule__ValOperation__OperatorAssignment_0 ) ) ;
    public final void rule__ValOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1704:1: ( ( ( rule__ValOperation__OperatorAssignment_0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1705:1: ( ( rule__ValOperation__OperatorAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1705:1: ( ( rule__ValOperation__OperatorAssignment_0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1706:1: ( rule__ValOperation__OperatorAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValOperationAccess().getOperatorAssignment_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1707:1: ( rule__ValOperation__OperatorAssignment_0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1707:2: rule__ValOperation__OperatorAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValOperation__OperatorAssignment_0_in_rule__ValOperation__Group__0__Impl3549);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1717:1: rule__ValOperation__Group__1 : rule__ValOperation__Group__1__Impl ;
    public final void rule__ValOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1721:1: ( rule__ValOperation__Group__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1722:2: rule__ValOperation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValOperation__Group__1__Impl_in_rule__ValOperation__Group__13579);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1728:1: rule__ValOperation__Group__1__Impl : ( ( rule__ValOperation__SubExpressionsAssignment_1 ) ) ;
    public final void rule__ValOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1732:1: ( ( ( rule__ValOperation__SubExpressionsAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1733:1: ( ( rule__ValOperation__SubExpressionsAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1733:1: ( ( rule__ValOperation__SubExpressionsAssignment_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1734:1: ( rule__ValOperation__SubExpressionsAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValOperationAccess().getSubExpressionsAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1735:1: ( rule__ValOperation__SubExpressionsAssignment_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1735:2: rule__ValOperation__SubExpressionsAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValOperation__SubExpressionsAssignment_1_in_rule__ValOperation__Group__1__Impl3606);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1749:1: rule__ParanthesedValuedExpression__Group_5__0 : rule__ParanthesedValuedExpression__Group_5__0__Impl rule__ParanthesedValuedExpression__Group_5__1 ;
    public final void rule__ParanthesedValuedExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1753:1: ( rule__ParanthesedValuedExpression__Group_5__0__Impl rule__ParanthesedValuedExpression__Group_5__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1754:2: rule__ParanthesedValuedExpression__Group_5__0__Impl rule__ParanthesedValuedExpression__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParanthesedValuedExpression__Group_5__0__Impl_in_rule__ParanthesedValuedExpression__Group_5__03640);
            rule__ParanthesedValuedExpression__Group_5__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ParanthesedValuedExpression__Group_5__1_in_rule__ParanthesedValuedExpression__Group_5__03643);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1761:1: rule__ParanthesedValuedExpression__Group_5__0__Impl : ( '(' ) ;
    public final void rule__ParanthesedValuedExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1765:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1766:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1766:1: ( '(' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1767:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedValuedExpressionAccess().getLeftParenthesisKeyword_5_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__ParanthesedValuedExpression__Group_5__0__Impl3671); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1780:1: rule__ParanthesedValuedExpression__Group_5__1 : rule__ParanthesedValuedExpression__Group_5__1__Impl rule__ParanthesedValuedExpression__Group_5__2 ;
    public final void rule__ParanthesedValuedExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1784:1: ( rule__ParanthesedValuedExpression__Group_5__1__Impl rule__ParanthesedValuedExpression__Group_5__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1785:2: rule__ParanthesedValuedExpression__Group_5__1__Impl rule__ParanthesedValuedExpression__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParanthesedValuedExpression__Group_5__1__Impl_in_rule__ParanthesedValuedExpression__Group_5__13702);
            rule__ParanthesedValuedExpression__Group_5__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ParanthesedValuedExpression__Group_5__2_in_rule__ParanthesedValuedExpression__Group_5__13705);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1792:1: rule__ParanthesedValuedExpression__Group_5__1__Impl : ( rulePlusOperation ) ;
    public final void rule__ParanthesedValuedExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1796:1: ( ( rulePlusOperation ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1797:1: ( rulePlusOperation )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1797:1: ( rulePlusOperation )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1798:1: rulePlusOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedValuedExpressionAccess().getPlusOperationParserRuleCall_5_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePlusOperation_in_rule__ParanthesedValuedExpression__Group_5__1__Impl3732);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1809:1: rule__ParanthesedValuedExpression__Group_5__2 : rule__ParanthesedValuedExpression__Group_5__2__Impl ;
    public final void rule__ParanthesedValuedExpression__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1813:1: ( rule__ParanthesedValuedExpression__Group_5__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1814:2: rule__ParanthesedValuedExpression__Group_5__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParanthesedValuedExpression__Group_5__2__Impl_in_rule__ParanthesedValuedExpression__Group_5__23761);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1820:1: rule__ParanthesedValuedExpression__Group_5__2__Impl : ( ')' ) ;
    public final void rule__ParanthesedValuedExpression__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1824:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1825:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1825:1: ( ')' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1826:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedValuedExpressionAccess().getRightParenthesisKeyword_5_2()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__ParanthesedValuedExpression__Group_5__2__Impl3789); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1845:1: rule__ParanthesedValuedExpression__Group_6__0 : rule__ParanthesedValuedExpression__Group_6__0__Impl rule__ParanthesedValuedExpression__Group_6__1 ;
    public final void rule__ParanthesedValuedExpression__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1849:1: ( rule__ParanthesedValuedExpression__Group_6__0__Impl rule__ParanthesedValuedExpression__Group_6__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1850:2: rule__ParanthesedValuedExpression__Group_6__0__Impl rule__ParanthesedValuedExpression__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParanthesedValuedExpression__Group_6__0__Impl_in_rule__ParanthesedValuedExpression__Group_6__03826);
            rule__ParanthesedValuedExpression__Group_6__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ParanthesedValuedExpression__Group_6__1_in_rule__ParanthesedValuedExpression__Group_6__03829);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1857:1: rule__ParanthesedValuedExpression__Group_6__0__Impl : ( '(' ) ;
    public final void rule__ParanthesedValuedExpression__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1861:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1862:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1862:1: ( '(' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1863:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedValuedExpressionAccess().getLeftParenthesisKeyword_6_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__ParanthesedValuedExpression__Group_6__0__Impl3857); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1876:1: rule__ParanthesedValuedExpression__Group_6__1 : rule__ParanthesedValuedExpression__Group_6__1__Impl rule__ParanthesedValuedExpression__Group_6__2 ;
    public final void rule__ParanthesedValuedExpression__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1880:1: ( rule__ParanthesedValuedExpression__Group_6__1__Impl rule__ParanthesedValuedExpression__Group_6__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1881:2: rule__ParanthesedValuedExpression__Group_6__1__Impl rule__ParanthesedValuedExpression__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParanthesedValuedExpression__Group_6__1__Impl_in_rule__ParanthesedValuedExpression__Group_6__13888);
            rule__ParanthesedValuedExpression__Group_6__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ParanthesedValuedExpression__Group_6__2_in_rule__ParanthesedValuedExpression__Group_6__13891);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1888:1: rule__ParanthesedValuedExpression__Group_6__1__Impl : ( ruleDivOperation ) ;
    public final void rule__ParanthesedValuedExpression__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1892:1: ( ( ruleDivOperation ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1893:1: ( ruleDivOperation )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1893:1: ( ruleDivOperation )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1894:1: ruleDivOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedValuedExpressionAccess().getDivOperationParserRuleCall_6_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivOperation_in_rule__ParanthesedValuedExpression__Group_6__1__Impl3918);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1905:1: rule__ParanthesedValuedExpression__Group_6__2 : rule__ParanthesedValuedExpression__Group_6__2__Impl ;
    public final void rule__ParanthesedValuedExpression__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1909:1: ( rule__ParanthesedValuedExpression__Group_6__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1910:2: rule__ParanthesedValuedExpression__Group_6__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParanthesedValuedExpression__Group_6__2__Impl_in_rule__ParanthesedValuedExpression__Group_6__23947);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1916:1: rule__ParanthesedValuedExpression__Group_6__2__Impl : ( ')' ) ;
    public final void rule__ParanthesedValuedExpression__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1920:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1921:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1921:1: ( ')' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1922:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedValuedExpressionAccess().getRightParenthesisKeyword_6_2()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__ParanthesedValuedExpression__Group_6__2__Impl3975); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1941:1: rule__PlusOperation__Group__0 : rule__PlusOperation__Group__0__Impl rule__PlusOperation__Group__1 ;
    public final void rule__PlusOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1945:1: ( rule__PlusOperation__Group__0__Impl rule__PlusOperation__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1946:2: rule__PlusOperation__Group__0__Impl rule__PlusOperation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PlusOperation__Group__0__Impl_in_rule__PlusOperation__Group__04012);
            rule__PlusOperation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PlusOperation__Group__1_in_rule__PlusOperation__Group__04015);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1953:1: rule__PlusOperation__Group__0__Impl : ( ruleMultOrDivOperation ) ;
    public final void rule__PlusOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1957:1: ( ( ruleMultOrDivOperation ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1958:1: ( ruleMultOrDivOperation )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1958:1: ( ruleMultOrDivOperation )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1959:1: ruleMultOrDivOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getMultOrDivOperationParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultOrDivOperation_in_rule__PlusOperation__Group__0__Impl4042);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1970:1: rule__PlusOperation__Group__1 : rule__PlusOperation__Group__1__Impl ;
    public final void rule__PlusOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1974:1: ( rule__PlusOperation__Group__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1975:2: rule__PlusOperation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PlusOperation__Group__1__Impl_in_rule__PlusOperation__Group__14071);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1981:1: rule__PlusOperation__Group__1__Impl : ( ( rule__PlusOperation__Group_1__0 )* ) ;
    public final void rule__PlusOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1985:1: ( ( ( rule__PlusOperation__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1986:1: ( ( rule__PlusOperation__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1986:1: ( ( rule__PlusOperation__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1987:1: ( rule__PlusOperation__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1988:1: ( rule__PlusOperation__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=25 && LA17_0<=26)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1988:2: rule__PlusOperation__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__PlusOperation__Group_1__0_in_rule__PlusOperation__Group__1__Impl4098);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2002:1: rule__PlusOperation__Group_1__0 : rule__PlusOperation__Group_1__0__Impl rule__PlusOperation__Group_1__1 ;
    public final void rule__PlusOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2006:1: ( rule__PlusOperation__Group_1__0__Impl rule__PlusOperation__Group_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2007:2: rule__PlusOperation__Group_1__0__Impl rule__PlusOperation__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PlusOperation__Group_1__0__Impl_in_rule__PlusOperation__Group_1__04133);
            rule__PlusOperation__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PlusOperation__Group_1__1_in_rule__PlusOperation__Group_1__04136);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2014:1: rule__PlusOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__PlusOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2018:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2019:1: ( () )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2019:1: ( () )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2020:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2021:1: ()
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2023:1: 
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2033:1: rule__PlusOperation__Group_1__1 : rule__PlusOperation__Group_1__1__Impl rule__PlusOperation__Group_1__2 ;
    public final void rule__PlusOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2037:1: ( rule__PlusOperation__Group_1__1__Impl rule__PlusOperation__Group_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2038:2: rule__PlusOperation__Group_1__1__Impl rule__PlusOperation__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PlusOperation__Group_1__1__Impl_in_rule__PlusOperation__Group_1__14194);
            rule__PlusOperation__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PlusOperation__Group_1__2_in_rule__PlusOperation__Group_1__14197);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2045:1: rule__PlusOperation__Group_1__1__Impl : ( ( rule__PlusOperation__OperatorAssignment_1_1 ) ) ;
    public final void rule__PlusOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2049:1: ( ( ( rule__PlusOperation__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2050:1: ( ( rule__PlusOperation__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2050:1: ( ( rule__PlusOperation__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2051:1: ( rule__PlusOperation__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2052:1: ( rule__PlusOperation__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2052:2: rule__PlusOperation__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PlusOperation__OperatorAssignment_1_1_in_rule__PlusOperation__Group_1__1__Impl4224);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2062:1: rule__PlusOperation__Group_1__2 : rule__PlusOperation__Group_1__2__Impl ;
    public final void rule__PlusOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2066:1: ( rule__PlusOperation__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2067:2: rule__PlusOperation__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PlusOperation__Group_1__2__Impl_in_rule__PlusOperation__Group_1__24254);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2073:1: rule__PlusOperation__Group_1__2__Impl : ( ( rule__PlusOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__PlusOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2077:1: ( ( ( rule__PlusOperation__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2078:1: ( ( rule__PlusOperation__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2078:1: ( ( rule__PlusOperation__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2079:1: ( rule__PlusOperation__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2080:1: ( rule__PlusOperation__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2080:2: rule__PlusOperation__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PlusOperation__SubExpressionsAssignment_1_2_in_rule__PlusOperation__Group_1__2__Impl4281);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2096:1: rule__MultOrDivOperation__Group_1__0 : rule__MultOrDivOperation__Group_1__0__Impl rule__MultOrDivOperation__Group_1__1 ;
    public final void rule__MultOrDivOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2100:1: ( rule__MultOrDivOperation__Group_1__0__Impl rule__MultOrDivOperation__Group_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2101:2: rule__MultOrDivOperation__Group_1__0__Impl rule__MultOrDivOperation__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultOrDivOperation__Group_1__0__Impl_in_rule__MultOrDivOperation__Group_1__04317);
            rule__MultOrDivOperation__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MultOrDivOperation__Group_1__1_in_rule__MultOrDivOperation__Group_1__04320);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2108:1: rule__MultOrDivOperation__Group_1__0__Impl : ( '(' ) ;
    public final void rule__MultOrDivOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2112:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2113:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2113:1: ( '(' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2114:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOrDivOperationAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__MultOrDivOperation__Group_1__0__Impl4348); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2127:1: rule__MultOrDivOperation__Group_1__1 : rule__MultOrDivOperation__Group_1__1__Impl rule__MultOrDivOperation__Group_1__2 ;
    public final void rule__MultOrDivOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2131:1: ( rule__MultOrDivOperation__Group_1__1__Impl rule__MultOrDivOperation__Group_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2132:2: rule__MultOrDivOperation__Group_1__1__Impl rule__MultOrDivOperation__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultOrDivOperation__Group_1__1__Impl_in_rule__MultOrDivOperation__Group_1__14379);
            rule__MultOrDivOperation__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MultOrDivOperation__Group_1__2_in_rule__MultOrDivOperation__Group_1__14382);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2139:1: rule__MultOrDivOperation__Group_1__1__Impl : ( ruleDivOperation ) ;
    public final void rule__MultOrDivOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2143:1: ( ( ruleDivOperation ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2144:1: ( ruleDivOperation )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2144:1: ( ruleDivOperation )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2145:1: ruleDivOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOrDivOperationAccess().getDivOperationParserRuleCall_1_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivOperation_in_rule__MultOrDivOperation__Group_1__1__Impl4409);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2156:1: rule__MultOrDivOperation__Group_1__2 : rule__MultOrDivOperation__Group_1__2__Impl ;
    public final void rule__MultOrDivOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2160:1: ( rule__MultOrDivOperation__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2161:2: rule__MultOrDivOperation__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultOrDivOperation__Group_1__2__Impl_in_rule__MultOrDivOperation__Group_1__24438);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2167:1: rule__MultOrDivOperation__Group_1__2__Impl : ( ')' ) ;
    public final void rule__MultOrDivOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2171:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2172:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2172:1: ( ')' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2173:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOrDivOperationAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__MultOrDivOperation__Group_1__2__Impl4466); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2192:1: rule__MultOperation__Group__0 : rule__MultOperation__Group__0__Impl rule__MultOperation__Group__1 ;
    public final void rule__MultOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2196:1: ( rule__MultOperation__Group__0__Impl rule__MultOperation__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2197:2: rule__MultOperation__Group__0__Impl rule__MultOperation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultOperation__Group__0__Impl_in_rule__MultOperation__Group__04503);
            rule__MultOperation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MultOperation__Group__1_in_rule__MultOperation__Group__04506);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2204:1: rule__MultOperation__Group__0__Impl : ( rulePreOrNormalValuedExpression ) ;
    public final void rule__MultOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2208:1: ( ( rulePreOrNormalValuedExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2209:1: ( rulePreOrNormalValuedExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2209:1: ( rulePreOrNormalValuedExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2210:1: rulePreOrNormalValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getPreOrNormalValuedExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePreOrNormalValuedExpression_in_rule__MultOperation__Group__0__Impl4533);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2221:1: rule__MultOperation__Group__1 : rule__MultOperation__Group__1__Impl ;
    public final void rule__MultOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2225:1: ( rule__MultOperation__Group__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2226:2: rule__MultOperation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultOperation__Group__1__Impl_in_rule__MultOperation__Group__14562);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2232:1: rule__MultOperation__Group__1__Impl : ( ( rule__MultOperation__Group_1__0 )* ) ;
    public final void rule__MultOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2236:1: ( ( ( rule__MultOperation__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2237:1: ( ( rule__MultOperation__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2237:1: ( ( rule__MultOperation__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2238:1: ( rule__MultOperation__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2239:1: ( rule__MultOperation__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=27 && LA18_0<=28)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2239:2: rule__MultOperation__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MultOperation__Group_1__0_in_rule__MultOperation__Group__1__Impl4589);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2253:1: rule__MultOperation__Group_1__0 : rule__MultOperation__Group_1__0__Impl rule__MultOperation__Group_1__1 ;
    public final void rule__MultOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2257:1: ( rule__MultOperation__Group_1__0__Impl rule__MultOperation__Group_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2258:2: rule__MultOperation__Group_1__0__Impl rule__MultOperation__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultOperation__Group_1__0__Impl_in_rule__MultOperation__Group_1__04624);
            rule__MultOperation__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MultOperation__Group_1__1_in_rule__MultOperation__Group_1__04627);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2265:1: rule__MultOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__MultOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2269:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2270:1: ( () )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2270:1: ( () )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2271:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2272:1: ()
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2274:1: 
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2284:1: rule__MultOperation__Group_1__1 : rule__MultOperation__Group_1__1__Impl rule__MultOperation__Group_1__2 ;
    public final void rule__MultOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2288:1: ( rule__MultOperation__Group_1__1__Impl rule__MultOperation__Group_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2289:2: rule__MultOperation__Group_1__1__Impl rule__MultOperation__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultOperation__Group_1__1__Impl_in_rule__MultOperation__Group_1__14685);
            rule__MultOperation__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MultOperation__Group_1__2_in_rule__MultOperation__Group_1__14688);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2296:1: rule__MultOperation__Group_1__1__Impl : ( ( rule__MultOperation__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2300:1: ( ( ( rule__MultOperation__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2301:1: ( ( rule__MultOperation__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2301:1: ( ( rule__MultOperation__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2302:1: ( rule__MultOperation__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2303:1: ( rule__MultOperation__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2303:2: rule__MultOperation__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultOperation__OperatorAssignment_1_1_in_rule__MultOperation__Group_1__1__Impl4715);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2313:1: rule__MultOperation__Group_1__2 : rule__MultOperation__Group_1__2__Impl ;
    public final void rule__MultOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2317:1: ( rule__MultOperation__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2318:2: rule__MultOperation__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultOperation__Group_1__2__Impl_in_rule__MultOperation__Group_1__24745);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2324:1: rule__MultOperation__Group_1__2__Impl : ( ( rule__MultOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__MultOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2328:1: ( ( ( rule__MultOperation__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2329:1: ( ( rule__MultOperation__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2329:1: ( ( rule__MultOperation__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2330:1: ( rule__MultOperation__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2331:1: ( rule__MultOperation__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2331:2: rule__MultOperation__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultOperation__SubExpressionsAssignment_1_2_in_rule__MultOperation__Group_1__2__Impl4772);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2347:1: rule__DivOperation__Group__0 : rule__DivOperation__Group__0__Impl rule__DivOperation__Group__1 ;
    public final void rule__DivOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2351:1: ( rule__DivOperation__Group__0__Impl rule__DivOperation__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2352:2: rule__DivOperation__Group__0__Impl rule__DivOperation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivOperation__Group__0__Impl_in_rule__DivOperation__Group__04808);
            rule__DivOperation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DivOperation__Group__1_in_rule__DivOperation__Group__04811);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2359:1: rule__DivOperation__Group__0__Impl : ( rulePreOrNormalValuedExpression ) ;
    public final void rule__DivOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2363:1: ( ( rulePreOrNormalValuedExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2364:1: ( rulePreOrNormalValuedExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2364:1: ( rulePreOrNormalValuedExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2365:1: rulePreOrNormalValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getPreOrNormalValuedExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePreOrNormalValuedExpression_in_rule__DivOperation__Group__0__Impl4838);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2376:1: rule__DivOperation__Group__1 : rule__DivOperation__Group__1__Impl ;
    public final void rule__DivOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2380:1: ( rule__DivOperation__Group__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2381:2: rule__DivOperation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivOperation__Group__1__Impl_in_rule__DivOperation__Group__14867);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2387:1: rule__DivOperation__Group__1__Impl : ( ( rule__DivOperation__Group_1__0 )* ) ;
    public final void rule__DivOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2391:1: ( ( ( rule__DivOperation__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2392:1: ( ( rule__DivOperation__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2392:1: ( ( rule__DivOperation__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2393:1: ( rule__DivOperation__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2394:1: ( rule__DivOperation__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==18) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2394:2: rule__DivOperation__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__DivOperation__Group_1__0_in_rule__DivOperation__Group__1__Impl4894);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2408:1: rule__DivOperation__Group_1__0 : rule__DivOperation__Group_1__0__Impl rule__DivOperation__Group_1__1 ;
    public final void rule__DivOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2412:1: ( rule__DivOperation__Group_1__0__Impl rule__DivOperation__Group_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2413:2: rule__DivOperation__Group_1__0__Impl rule__DivOperation__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivOperation__Group_1__0__Impl_in_rule__DivOperation__Group_1__04929);
            rule__DivOperation__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DivOperation__Group_1__1_in_rule__DivOperation__Group_1__04932);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2420:1: rule__DivOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__DivOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2424:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2425:1: ( () )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2425:1: ( () )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2426:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2427:1: ()
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2429:1: 
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2439:1: rule__DivOperation__Group_1__1 : rule__DivOperation__Group_1__1__Impl rule__DivOperation__Group_1__2 ;
    public final void rule__DivOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2443:1: ( rule__DivOperation__Group_1__1__Impl rule__DivOperation__Group_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2444:2: rule__DivOperation__Group_1__1__Impl rule__DivOperation__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivOperation__Group_1__1__Impl_in_rule__DivOperation__Group_1__14990);
            rule__DivOperation__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DivOperation__Group_1__2_in_rule__DivOperation__Group_1__14993);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2451:1: rule__DivOperation__Group_1__1__Impl : ( ( rule__DivOperation__OperatorAssignment_1_1 ) ) ;
    public final void rule__DivOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2455:1: ( ( ( rule__DivOperation__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2456:1: ( ( rule__DivOperation__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2456:1: ( ( rule__DivOperation__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2457:1: ( rule__DivOperation__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2458:1: ( rule__DivOperation__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2458:2: rule__DivOperation__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivOperation__OperatorAssignment_1_1_in_rule__DivOperation__Group_1__1__Impl5020);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2468:1: rule__DivOperation__Group_1__2 : rule__DivOperation__Group_1__2__Impl ;
    public final void rule__DivOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2472:1: ( rule__DivOperation__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2473:2: rule__DivOperation__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivOperation__Group_1__2__Impl_in_rule__DivOperation__Group_1__25050);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2479:1: rule__DivOperation__Group_1__2__Impl : ( ( rule__DivOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__DivOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2483:1: ( ( ( rule__DivOperation__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2484:1: ( ( rule__DivOperation__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2484:1: ( ( rule__DivOperation__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2485:1: ( rule__DivOperation__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2486:1: ( rule__DivOperation__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2486:2: rule__DivOperation__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivOperation__SubExpressionsAssignment_1_2_in_rule__DivOperation__Group_1__2__Impl5077);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2502:1: rule__PreArithmOperation__Group__0 : rule__PreArithmOperation__Group__0__Impl rule__PreArithmOperation__Group__1 ;
    public final void rule__PreArithmOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2506:1: ( rule__PreArithmOperation__Group__0__Impl rule__PreArithmOperation__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2507:2: rule__PreArithmOperation__Group__0__Impl rule__PreArithmOperation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PreArithmOperation__Group__0__Impl_in_rule__PreArithmOperation__Group__05113);
            rule__PreArithmOperation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PreArithmOperation__Group__1_in_rule__PreArithmOperation__Group__05116);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2514:1: rule__PreArithmOperation__Group__0__Impl : ( ( rule__PreArithmOperation__OperatorAssignment_0 ) ) ;
    public final void rule__PreArithmOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2518:1: ( ( ( rule__PreArithmOperation__OperatorAssignment_0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2519:1: ( ( rule__PreArithmOperation__OperatorAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2519:1: ( ( rule__PreArithmOperation__OperatorAssignment_0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2520:1: ( rule__PreArithmOperation__OperatorAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreArithmOperationAccess().getOperatorAssignment_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2521:1: ( rule__PreArithmOperation__OperatorAssignment_0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2521:2: rule__PreArithmOperation__OperatorAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PreArithmOperation__OperatorAssignment_0_in_rule__PreArithmOperation__Group__0__Impl5143);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2531:1: rule__PreArithmOperation__Group__1 : rule__PreArithmOperation__Group__1__Impl rule__PreArithmOperation__Group__2 ;
    public final void rule__PreArithmOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2535:1: ( rule__PreArithmOperation__Group__1__Impl rule__PreArithmOperation__Group__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2536:2: rule__PreArithmOperation__Group__1__Impl rule__PreArithmOperation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PreArithmOperation__Group__1__Impl_in_rule__PreArithmOperation__Group__15173);
            rule__PreArithmOperation__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PreArithmOperation__Group__2_in_rule__PreArithmOperation__Group__15176);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2543:1: rule__PreArithmOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__PreArithmOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2547:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2548:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2548:1: ( '(' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2549:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreArithmOperationAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__PreArithmOperation__Group__1__Impl5204); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2562:1: rule__PreArithmOperation__Group__2 : rule__PreArithmOperation__Group__2__Impl rule__PreArithmOperation__Group__3 ;
    public final void rule__PreArithmOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2566:1: ( rule__PreArithmOperation__Group__2__Impl rule__PreArithmOperation__Group__3 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2567:2: rule__PreArithmOperation__Group__2__Impl rule__PreArithmOperation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PreArithmOperation__Group__2__Impl_in_rule__PreArithmOperation__Group__25235);
            rule__PreArithmOperation__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PreArithmOperation__Group__3_in_rule__PreArithmOperation__Group__25238);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2574:1: rule__PreArithmOperation__Group__2__Impl : ( ( rule__PreArithmOperation__SubExpressionsAssignment_2 ) ) ;
    public final void rule__PreArithmOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2578:1: ( ( ( rule__PreArithmOperation__SubExpressionsAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2579:1: ( ( rule__PreArithmOperation__SubExpressionsAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2579:1: ( ( rule__PreArithmOperation__SubExpressionsAssignment_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2580:1: ( rule__PreArithmOperation__SubExpressionsAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreArithmOperationAccess().getSubExpressionsAssignment_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2581:1: ( rule__PreArithmOperation__SubExpressionsAssignment_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2581:2: rule__PreArithmOperation__SubExpressionsAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PreArithmOperation__SubExpressionsAssignment_2_in_rule__PreArithmOperation__Group__2__Impl5265);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2591:1: rule__PreArithmOperation__Group__3 : rule__PreArithmOperation__Group__3__Impl ;
    public final void rule__PreArithmOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2595:1: ( rule__PreArithmOperation__Group__3__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2596:2: rule__PreArithmOperation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PreArithmOperation__Group__3__Impl_in_rule__PreArithmOperation__Group__35295);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2602:1: rule__PreArithmOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__PreArithmOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2606:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2607:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2607:1: ( ')' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2608:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreArithmOperationAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__PreArithmOperation__Group__3__Impl5323); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2629:1: rule__CompareOperation__Group__0 : rule__CompareOperation__Group__0__Impl rule__CompareOperation__Group__1 ;
    public final void rule__CompareOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2633:1: ( rule__CompareOperation__Group__0__Impl rule__CompareOperation__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2634:2: rule__CompareOperation__Group__0__Impl rule__CompareOperation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group__0__Impl_in_rule__CompareOperation__Group__05362);
            rule__CompareOperation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group__1_in_rule__CompareOperation__Group__05365);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2641:1: rule__CompareOperation__Group__0__Impl : ( ruleValuedExpression ) ;
    public final void rule__CompareOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2645:1: ( ( ruleValuedExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2646:1: ( ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2646:1: ( ruleValuedExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2647:1: ruleValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getValuedExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_rule__CompareOperation__Group__0__Impl5392);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2658:1: rule__CompareOperation__Group__1 : rule__CompareOperation__Group__1__Impl ;
    public final void rule__CompareOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2662:1: ( rule__CompareOperation__Group__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2663:2: rule__CompareOperation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group__1__Impl_in_rule__CompareOperation__Group__15421);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2669:1: rule__CompareOperation__Group__1__Impl : ( ( rule__CompareOperation__Group_1__0 ) ) ;
    public final void rule__CompareOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2673:1: ( ( ( rule__CompareOperation__Group_1__0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2674:1: ( ( rule__CompareOperation__Group_1__0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2674:1: ( ( rule__CompareOperation__Group_1__0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2675:1: ( rule__CompareOperation__Group_1__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2676:1: ( rule__CompareOperation__Group_1__0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2676:2: rule__CompareOperation__Group_1__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_1__0_in_rule__CompareOperation__Group__1__Impl5448);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2690:1: rule__CompareOperation__Group_1__0 : rule__CompareOperation__Group_1__0__Impl rule__CompareOperation__Group_1__1 ;
    public final void rule__CompareOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2694:1: ( rule__CompareOperation__Group_1__0__Impl rule__CompareOperation__Group_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2695:2: rule__CompareOperation__Group_1__0__Impl rule__CompareOperation__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_1__0__Impl_in_rule__CompareOperation__Group_1__05482);
            rule__CompareOperation__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_1__1_in_rule__CompareOperation__Group_1__05485);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2702:1: rule__CompareOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__CompareOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2706:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2707:1: ( () )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2707:1: ( () )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2708:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2709:1: ()
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2711:1: 
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2721:1: rule__CompareOperation__Group_1__1 : rule__CompareOperation__Group_1__1__Impl rule__CompareOperation__Group_1__2 ;
    public final void rule__CompareOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2725:1: ( rule__CompareOperation__Group_1__1__Impl rule__CompareOperation__Group_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2726:2: rule__CompareOperation__Group_1__1__Impl rule__CompareOperation__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_1__1__Impl_in_rule__CompareOperation__Group_1__15543);
            rule__CompareOperation__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_1__2_in_rule__CompareOperation__Group_1__15546);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2733:1: rule__CompareOperation__Group_1__1__Impl : ( ( rule__CompareOperation__OperatorAssignment_1_1 ) ) ;
    public final void rule__CompareOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2737:1: ( ( ( rule__CompareOperation__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2738:1: ( ( rule__CompareOperation__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2738:1: ( ( rule__CompareOperation__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2739:1: ( rule__CompareOperation__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2740:1: ( rule__CompareOperation__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2740:2: rule__CompareOperation__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__OperatorAssignment_1_1_in_rule__CompareOperation__Group_1__1__Impl5573);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2750:1: rule__CompareOperation__Group_1__2 : rule__CompareOperation__Group_1__2__Impl ;
    public final void rule__CompareOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2754:1: ( rule__CompareOperation__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2755:2: rule__CompareOperation__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_1__2__Impl_in_rule__CompareOperation__Group_1__25603);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2761:1: rule__CompareOperation__Group_1__2__Impl : ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__CompareOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2765:1: ( ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2766:1: ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2766:1: ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2767:1: ( rule__CompareOperation__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2768:1: ( rule__CompareOperation__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2768:2: rule__CompareOperation__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__SubExpressionsAssignment_1_2_in_rule__CompareOperation__Group_1__2__Impl5630);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2784:1: rule__UnaryOperation__Group__0 : rule__UnaryOperation__Group__0__Impl rule__UnaryOperation__Group__1 ;
    public final void rule__UnaryOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2788:1: ( rule__UnaryOperation__Group__0__Impl rule__UnaryOperation__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2789:2: rule__UnaryOperation__Group__0__Impl rule__UnaryOperation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__Group__0__Impl_in_rule__UnaryOperation__Group__05666);
            rule__UnaryOperation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__Group__1_in_rule__UnaryOperation__Group__05669);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2796:1: rule__UnaryOperation__Group__0__Impl : ( ( rule__UnaryOperation__OperatorAssignment_0 ) ) ;
    public final void rule__UnaryOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2800:1: ( ( ( rule__UnaryOperation__OperatorAssignment_0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2801:1: ( ( rule__UnaryOperation__OperatorAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2801:1: ( ( rule__UnaryOperation__OperatorAssignment_0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2802:1: ( rule__UnaryOperation__OperatorAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getOperatorAssignment_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2803:1: ( rule__UnaryOperation__OperatorAssignment_0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2803:2: rule__UnaryOperation__OperatorAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__OperatorAssignment_0_in_rule__UnaryOperation__Group__0__Impl5696);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2813:1: rule__UnaryOperation__Group__1 : rule__UnaryOperation__Group__1__Impl ;
    public final void rule__UnaryOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2817:1: ( rule__UnaryOperation__Group__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2818:2: rule__UnaryOperation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__Group__1__Impl_in_rule__UnaryOperation__Group__15726);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2824:1: rule__UnaryOperation__Group__1__Impl : ( ( rule__UnaryOperation__SubExpressionsAssignment_1 ) ) ;
    public final void rule__UnaryOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2828:1: ( ( ( rule__UnaryOperation__SubExpressionsAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2829:1: ( ( rule__UnaryOperation__SubExpressionsAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2829:1: ( ( rule__UnaryOperation__SubExpressionsAssignment_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2830:1: ( rule__UnaryOperation__SubExpressionsAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getSubExpressionsAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2831:1: ( rule__UnaryOperation__SubExpressionsAssignment_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2831:2: rule__UnaryOperation__SubExpressionsAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__SubExpressionsAssignment_1_in_rule__UnaryOperation__Group__1__Impl5753);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2845:1: rule__UnaryParanthesedOperation__Group__0 : rule__UnaryParanthesedOperation__Group__0__Impl rule__UnaryParanthesedOperation__Group__1 ;
    public final void rule__UnaryParanthesedOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2849:1: ( rule__UnaryParanthesedOperation__Group__0__Impl rule__UnaryParanthesedOperation__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2850:2: rule__UnaryParanthesedOperation__Group__0__Impl rule__UnaryParanthesedOperation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryParanthesedOperation__Group__0__Impl_in_rule__UnaryParanthesedOperation__Group__05787);
            rule__UnaryParanthesedOperation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__UnaryParanthesedOperation__Group__1_in_rule__UnaryParanthesedOperation__Group__05790);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2857:1: rule__UnaryParanthesedOperation__Group__0__Impl : ( ( rule__UnaryParanthesedOperation__OperatorAssignment_0 ) ) ;
    public final void rule__UnaryParanthesedOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2861:1: ( ( ( rule__UnaryParanthesedOperation__OperatorAssignment_0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2862:1: ( ( rule__UnaryParanthesedOperation__OperatorAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2862:1: ( ( rule__UnaryParanthesedOperation__OperatorAssignment_0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2863:1: ( rule__UnaryParanthesedOperation__OperatorAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperationAccess().getOperatorAssignment_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2864:1: ( rule__UnaryParanthesedOperation__OperatorAssignment_0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2864:2: rule__UnaryParanthesedOperation__OperatorAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryParanthesedOperation__OperatorAssignment_0_in_rule__UnaryParanthesedOperation__Group__0__Impl5817);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2874:1: rule__UnaryParanthesedOperation__Group__1 : rule__UnaryParanthesedOperation__Group__1__Impl rule__UnaryParanthesedOperation__Group__2 ;
    public final void rule__UnaryParanthesedOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2878:1: ( rule__UnaryParanthesedOperation__Group__1__Impl rule__UnaryParanthesedOperation__Group__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2879:2: rule__UnaryParanthesedOperation__Group__1__Impl rule__UnaryParanthesedOperation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryParanthesedOperation__Group__1__Impl_in_rule__UnaryParanthesedOperation__Group__15847);
            rule__UnaryParanthesedOperation__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__UnaryParanthesedOperation__Group__2_in_rule__UnaryParanthesedOperation__Group__15850);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2886:1: rule__UnaryParanthesedOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__UnaryParanthesedOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2890:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2891:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2891:1: ( '(' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2892:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperationAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__UnaryParanthesedOperation__Group__1__Impl5878); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2905:1: rule__UnaryParanthesedOperation__Group__2 : rule__UnaryParanthesedOperation__Group__2__Impl rule__UnaryParanthesedOperation__Group__3 ;
    public final void rule__UnaryParanthesedOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2909:1: ( rule__UnaryParanthesedOperation__Group__2__Impl rule__UnaryParanthesedOperation__Group__3 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2910:2: rule__UnaryParanthesedOperation__Group__2__Impl rule__UnaryParanthesedOperation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryParanthesedOperation__Group__2__Impl_in_rule__UnaryParanthesedOperation__Group__25909);
            rule__UnaryParanthesedOperation__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__UnaryParanthesedOperation__Group__3_in_rule__UnaryParanthesedOperation__Group__25912);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2917:1: rule__UnaryParanthesedOperation__Group__2__Impl : ( ( rule__UnaryParanthesedOperation__SubExpressionsAssignment_2 ) ) ;
    public final void rule__UnaryParanthesedOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2921:1: ( ( ( rule__UnaryParanthesedOperation__SubExpressionsAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2922:1: ( ( rule__UnaryParanthesedOperation__SubExpressionsAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2922:1: ( ( rule__UnaryParanthesedOperation__SubExpressionsAssignment_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2923:1: ( rule__UnaryParanthesedOperation__SubExpressionsAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperationAccess().getSubExpressionsAssignment_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2924:1: ( rule__UnaryParanthesedOperation__SubExpressionsAssignment_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2924:2: rule__UnaryParanthesedOperation__SubExpressionsAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryParanthesedOperation__SubExpressionsAssignment_2_in_rule__UnaryParanthesedOperation__Group__2__Impl5939);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2934:1: rule__UnaryParanthesedOperation__Group__3 : rule__UnaryParanthesedOperation__Group__3__Impl ;
    public final void rule__UnaryParanthesedOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2938:1: ( rule__UnaryParanthesedOperation__Group__3__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2939:2: rule__UnaryParanthesedOperation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryParanthesedOperation__Group__3__Impl_in_rule__UnaryParanthesedOperation__Group__35969);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2945:1: rule__UnaryParanthesedOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__UnaryParanthesedOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2949:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2950:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2950:1: ( ')' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2951:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperationAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__UnaryParanthesedOperation__Group__3__Impl5997); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2972:1: rule__AndOperation__Group__0 : rule__AndOperation__Group__0__Impl rule__AndOperation__Group__1 ;
    public final void rule__AndOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2976:1: ( rule__AndOperation__Group__0__Impl rule__AndOperation__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2977:2: rule__AndOperation__Group__0__Impl rule__AndOperation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndOperation__Group__0__Impl_in_rule__AndOperation__Group__06036);
            rule__AndOperation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AndOperation__Group__1_in_rule__AndOperation__Group__06039);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2984:1: rule__AndOperation__Group__0__Impl : ( ruleUnaryOrNormalExpression ) ;
    public final void rule__AndOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2988:1: ( ( ruleUnaryOrNormalExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2989:1: ( ruleUnaryOrNormalExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2989:1: ( ruleUnaryOrNormalExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2990:1: ruleUnaryOrNormalExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getUnaryOrNormalExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOrNormalExpression_in_rule__AndOperation__Group__0__Impl6066);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3001:1: rule__AndOperation__Group__1 : rule__AndOperation__Group__1__Impl ;
    public final void rule__AndOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3005:1: ( rule__AndOperation__Group__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3006:2: rule__AndOperation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndOperation__Group__1__Impl_in_rule__AndOperation__Group__16095);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3012:1: rule__AndOperation__Group__1__Impl : ( ( rule__AndOperation__Group_1__0 )* ) ;
    public final void rule__AndOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3016:1: ( ( ( rule__AndOperation__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3017:1: ( ( rule__AndOperation__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3017:1: ( ( rule__AndOperation__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3018:1: ( rule__AndOperation__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3019:1: ( rule__AndOperation__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==17) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3019:2: rule__AndOperation__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__AndOperation__Group_1__0_in_rule__AndOperation__Group__1__Impl6122);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3033:1: rule__AndOperation__Group_1__0 : rule__AndOperation__Group_1__0__Impl rule__AndOperation__Group_1__1 ;
    public final void rule__AndOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3037:1: ( rule__AndOperation__Group_1__0__Impl rule__AndOperation__Group_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3038:2: rule__AndOperation__Group_1__0__Impl rule__AndOperation__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndOperation__Group_1__0__Impl_in_rule__AndOperation__Group_1__06157);
            rule__AndOperation__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AndOperation__Group_1__1_in_rule__AndOperation__Group_1__06160);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3045:1: rule__AndOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__AndOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3049:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3050:1: ( () )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3050:1: ( () )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3051:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3052:1: ()
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3054:1: 
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3064:1: rule__AndOperation__Group_1__1 : rule__AndOperation__Group_1__1__Impl rule__AndOperation__Group_1__2 ;
    public final void rule__AndOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3068:1: ( rule__AndOperation__Group_1__1__Impl rule__AndOperation__Group_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3069:2: rule__AndOperation__Group_1__1__Impl rule__AndOperation__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndOperation__Group_1__1__Impl_in_rule__AndOperation__Group_1__16218);
            rule__AndOperation__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AndOperation__Group_1__2_in_rule__AndOperation__Group_1__16221);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3076:1: rule__AndOperation__Group_1__1__Impl : ( ( rule__AndOperation__OperatorAssignment_1_1 ) ) ;
    public final void rule__AndOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3080:1: ( ( ( rule__AndOperation__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3081:1: ( ( rule__AndOperation__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3081:1: ( ( rule__AndOperation__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3082:1: ( rule__AndOperation__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3083:1: ( rule__AndOperation__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3083:2: rule__AndOperation__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndOperation__OperatorAssignment_1_1_in_rule__AndOperation__Group_1__1__Impl6248);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3093:1: rule__AndOperation__Group_1__2 : rule__AndOperation__Group_1__2__Impl ;
    public final void rule__AndOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3097:1: ( rule__AndOperation__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3098:2: rule__AndOperation__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndOperation__Group_1__2__Impl_in_rule__AndOperation__Group_1__26278);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3104:1: rule__AndOperation__Group_1__2__Impl : ( ( rule__AndOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__AndOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3108:1: ( ( ( rule__AndOperation__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3109:1: ( ( rule__AndOperation__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3109:1: ( ( rule__AndOperation__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3110:1: ( rule__AndOperation__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3111:1: ( rule__AndOperation__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3111:2: rule__AndOperation__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndOperation__SubExpressionsAssignment_1_2_in_rule__AndOperation__Group_1__2__Impl6305);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3127:1: rule__OrOperation__Group__0 : rule__OrOperation__Group__0__Impl rule__OrOperation__Group__1 ;
    public final void rule__OrOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3131:1: ( rule__OrOperation__Group__0__Impl rule__OrOperation__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3132:2: rule__OrOperation__Group__0__Impl rule__OrOperation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrOperation__Group__0__Impl_in_rule__OrOperation__Group__06341);
            rule__OrOperation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OrOperation__Group__1_in_rule__OrOperation__Group__06344);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3139:1: rule__OrOperation__Group__0__Impl : ( ruleAndOperation ) ;
    public final void rule__OrOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3143:1: ( ( ruleAndOperation ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3144:1: ( ruleAndOperation )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3144:1: ( ruleAndOperation )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3145:1: ruleAndOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getAndOperationParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndOperation_in_rule__OrOperation__Group__0__Impl6371);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3156:1: rule__OrOperation__Group__1 : rule__OrOperation__Group__1__Impl ;
    public final void rule__OrOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3160:1: ( rule__OrOperation__Group__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3161:2: rule__OrOperation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrOperation__Group__1__Impl_in_rule__OrOperation__Group__16400);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3167:1: rule__OrOperation__Group__1__Impl : ( ( rule__OrOperation__Group_1__0 )* ) ;
    public final void rule__OrOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3171:1: ( ( ( rule__OrOperation__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3172:1: ( ( rule__OrOperation__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3172:1: ( ( rule__OrOperation__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3173:1: ( rule__OrOperation__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3174:1: ( rule__OrOperation__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==16) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3174:2: rule__OrOperation__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__OrOperation__Group_1__0_in_rule__OrOperation__Group__1__Impl6427);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3188:1: rule__OrOperation__Group_1__0 : rule__OrOperation__Group_1__0__Impl rule__OrOperation__Group_1__1 ;
    public final void rule__OrOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3192:1: ( rule__OrOperation__Group_1__0__Impl rule__OrOperation__Group_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3193:2: rule__OrOperation__Group_1__0__Impl rule__OrOperation__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrOperation__Group_1__0__Impl_in_rule__OrOperation__Group_1__06462);
            rule__OrOperation__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OrOperation__Group_1__1_in_rule__OrOperation__Group_1__06465);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3200:1: rule__OrOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__OrOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3204:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3205:1: ( () )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3205:1: ( () )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3206:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3207:1: ()
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3209:1: 
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3219:1: rule__OrOperation__Group_1__1 : rule__OrOperation__Group_1__1__Impl rule__OrOperation__Group_1__2 ;
    public final void rule__OrOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3223:1: ( rule__OrOperation__Group_1__1__Impl rule__OrOperation__Group_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3224:2: rule__OrOperation__Group_1__1__Impl rule__OrOperation__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrOperation__Group_1__1__Impl_in_rule__OrOperation__Group_1__16523);
            rule__OrOperation__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OrOperation__Group_1__2_in_rule__OrOperation__Group_1__16526);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3231:1: rule__OrOperation__Group_1__1__Impl : ( ( rule__OrOperation__OperatorAssignment_1_1 ) ) ;
    public final void rule__OrOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3235:1: ( ( ( rule__OrOperation__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3236:1: ( ( rule__OrOperation__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3236:1: ( ( rule__OrOperation__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3237:1: ( rule__OrOperation__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3238:1: ( rule__OrOperation__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3238:2: rule__OrOperation__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrOperation__OperatorAssignment_1_1_in_rule__OrOperation__Group_1__1__Impl6553);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3248:1: rule__OrOperation__Group_1__2 : rule__OrOperation__Group_1__2__Impl ;
    public final void rule__OrOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3252:1: ( rule__OrOperation__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3253:2: rule__OrOperation__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrOperation__Group_1__2__Impl_in_rule__OrOperation__Group_1__26583);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3259:1: rule__OrOperation__Group_1__2__Impl : ( ( rule__OrOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__OrOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3263:1: ( ( ( rule__OrOperation__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3264:1: ( ( rule__OrOperation__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3264:1: ( ( rule__OrOperation__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3265:1: ( rule__OrOperation__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3266:1: ( rule__OrOperation__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3266:2: rule__OrOperation__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrOperation__SubExpressionsAssignment_1_2_in_rule__OrOperation__Group_1__2__Impl6610);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3282:1: rule__ParanthesedBooleanExpression__Group_5__0 : rule__ParanthesedBooleanExpression__Group_5__0__Impl rule__ParanthesedBooleanExpression__Group_5__1 ;
    public final void rule__ParanthesedBooleanExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3286:1: ( rule__ParanthesedBooleanExpression__Group_5__0__Impl rule__ParanthesedBooleanExpression__Group_5__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3287:2: rule__ParanthesedBooleanExpression__Group_5__0__Impl rule__ParanthesedBooleanExpression__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParanthesedBooleanExpression__Group_5__0__Impl_in_rule__ParanthesedBooleanExpression__Group_5__06646);
            rule__ParanthesedBooleanExpression__Group_5__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ParanthesedBooleanExpression__Group_5__1_in_rule__ParanthesedBooleanExpression__Group_5__06649);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3294:1: rule__ParanthesedBooleanExpression__Group_5__0__Impl : ( '(' ) ;
    public final void rule__ParanthesedBooleanExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3298:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3299:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3299:1: ( '(' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3300:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedBooleanExpressionAccess().getLeftParenthesisKeyword_5_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__ParanthesedBooleanExpression__Group_5__0__Impl6677); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3313:1: rule__ParanthesedBooleanExpression__Group_5__1 : rule__ParanthesedBooleanExpression__Group_5__1__Impl rule__ParanthesedBooleanExpression__Group_5__2 ;
    public final void rule__ParanthesedBooleanExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3317:1: ( rule__ParanthesedBooleanExpression__Group_5__1__Impl rule__ParanthesedBooleanExpression__Group_5__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3318:2: rule__ParanthesedBooleanExpression__Group_5__1__Impl rule__ParanthesedBooleanExpression__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParanthesedBooleanExpression__Group_5__1__Impl_in_rule__ParanthesedBooleanExpression__Group_5__16708);
            rule__ParanthesedBooleanExpression__Group_5__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ParanthesedBooleanExpression__Group_5__2_in_rule__ParanthesedBooleanExpression__Group_5__16711);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3325:1: rule__ParanthesedBooleanExpression__Group_5__1__Impl : ( ruleOrOperation ) ;
    public final void rule__ParanthesedBooleanExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3329:1: ( ( ruleOrOperation ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3330:1: ( ruleOrOperation )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3330:1: ( ruleOrOperation )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3331:1: ruleOrOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedBooleanExpressionAccess().getOrOperationParserRuleCall_5_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrOperation_in_rule__ParanthesedBooleanExpression__Group_5__1__Impl6738);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3342:1: rule__ParanthesedBooleanExpression__Group_5__2 : rule__ParanthesedBooleanExpression__Group_5__2__Impl ;
    public final void rule__ParanthesedBooleanExpression__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3346:1: ( rule__ParanthesedBooleanExpression__Group_5__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3347:2: rule__ParanthesedBooleanExpression__Group_5__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParanthesedBooleanExpression__Group_5__2__Impl_in_rule__ParanthesedBooleanExpression__Group_5__26767);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3353:1: rule__ParanthesedBooleanExpression__Group_5__2__Impl : ( ')' ) ;
    public final void rule__ParanthesedBooleanExpression__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3357:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3358:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3358:1: ( ')' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3359:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedBooleanExpressionAccess().getRightParenthesisKeyword_5_2()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__ParanthesedBooleanExpression__Group_5__2__Impl6795); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3378:1: rule__TextExpression__Group__0 : rule__TextExpression__Group__0__Impl rule__TextExpression__Group__1 ;
    public final void rule__TextExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3382:1: ( rule__TextExpression__Group__0__Impl rule__TextExpression__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3383:2: rule__TextExpression__Group__0__Impl rule__TextExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group__0__Impl_in_rule__TextExpression__Group__06832);
            rule__TextExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group__1_in_rule__TextExpression__Group__06835);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3390:1: rule__TextExpression__Group__0__Impl : ( ( rule__TextExpression__CodeAssignment_0 ) ) ;
    public final void rule__TextExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3394:1: ( ( ( rule__TextExpression__CodeAssignment_0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3395:1: ( ( rule__TextExpression__CodeAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3395:1: ( ( rule__TextExpression__CodeAssignment_0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3396:1: ( rule__TextExpression__CodeAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getCodeAssignment_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3397:1: ( rule__TextExpression__CodeAssignment_0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3397:2: rule__TextExpression__CodeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__CodeAssignment_0_in_rule__TextExpression__Group__0__Impl6862);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3407:1: rule__TextExpression__Group__1 : rule__TextExpression__Group__1__Impl ;
    public final void rule__TextExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3411:1: ( rule__TextExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3412:2: rule__TextExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group__1__Impl_in_rule__TextExpression__Group__16892);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3418:1: rule__TextExpression__Group__1__Impl : ( ( rule__TextExpression__Group_1__0 )? ) ;
    public final void rule__TextExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3422:1: ( ( ( rule__TextExpression__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3423:1: ( ( rule__TextExpression__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3423:1: ( ( rule__TextExpression__Group_1__0 )? )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3424:1: ( rule__TextExpression__Group_1__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3425:1: ( rule__TextExpression__Group_1__0 )?
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3425:2: rule__TextExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group_1__0_in_rule__TextExpression__Group__1__Impl6919);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3439:1: rule__TextExpression__Group_1__0 : rule__TextExpression__Group_1__0__Impl rule__TextExpression__Group_1__1 ;
    public final void rule__TextExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3443:1: ( rule__TextExpression__Group_1__0__Impl rule__TextExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3444:2: rule__TextExpression__Group_1__0__Impl rule__TextExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group_1__0__Impl_in_rule__TextExpression__Group_1__06954);
            rule__TextExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group_1__1_in_rule__TextExpression__Group_1__06957);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3451:1: rule__TextExpression__Group_1__0__Impl : ( '(' ) ;
    public final void rule__TextExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3455:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3456:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3456:1: ( '(' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3457:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__TextExpression__Group_1__0__Impl6985); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3470:1: rule__TextExpression__Group_1__1 : rule__TextExpression__Group_1__1__Impl rule__TextExpression__Group_1__2 ;
    public final void rule__TextExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3474:1: ( rule__TextExpression__Group_1__1__Impl rule__TextExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3475:2: rule__TextExpression__Group_1__1__Impl rule__TextExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group_1__1__Impl_in_rule__TextExpression__Group_1__17016);
            rule__TextExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group_1__2_in_rule__TextExpression__Group_1__17019);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3482:1: rule__TextExpression__Group_1__1__Impl : ( ( rule__TextExpression__TypeAssignment_1_1 ) ) ;
    public final void rule__TextExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3486:1: ( ( ( rule__TextExpression__TypeAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3487:1: ( ( rule__TextExpression__TypeAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3487:1: ( ( rule__TextExpression__TypeAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3488:1: ( rule__TextExpression__TypeAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getTypeAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3489:1: ( rule__TextExpression__TypeAssignment_1_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3489:2: rule__TextExpression__TypeAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__TypeAssignment_1_1_in_rule__TextExpression__Group_1__1__Impl7046);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3499:1: rule__TextExpression__Group_1__2 : rule__TextExpression__Group_1__2__Impl ;
    public final void rule__TextExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3503:1: ( rule__TextExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3504:2: rule__TextExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group_1__2__Impl_in_rule__TextExpression__Group_1__27076);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3510:1: rule__TextExpression__Group_1__2__Impl : ( ')' ) ;
    public final void rule__TextExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3514:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3515:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3515:1: ( ')' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3516:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__TextExpression__Group_1__2__Impl7104); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3536:1: rule__SignalReference__SignalAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SignalReference__SignalAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3540:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3541:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3541:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3542:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getSignalSignalCrossReference_0_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3543:1: ( RULE_ID )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3544:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getSignalSignalIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__SignalReference__SignalAssignment_07150); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3555:1: rule__SignalReference__SubExpressionsAssignment_1_1_0 : ( ruleExpression ) ;
    public final void rule__SignalReference__SubExpressionsAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3559:1: ( ( ruleExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3560:1: ( ruleExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3560:1: ( ruleExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3561:1: ruleExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getSubExpressionsExpressionParserRuleCall_1_1_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__SignalReference__SubExpressionsAssignment_1_1_07185);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3570:1: rule__VariableReference__VariableAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__VariableReference__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3574:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3575:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3575:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3576:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getVariableVariableCrossReference_0_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3577:1: ( RULE_ID )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3578:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getVariableVariableIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__VariableReference__VariableAssignment_07220); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3589:1: rule__VariableReference__SubExpressionsAssignment_1_1_0 : ( ruleExpression ) ;
    public final void rule__VariableReference__SubExpressionsAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3593:1: ( ( ruleExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3594:1: ( ruleExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3594:1: ( ruleExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3595:1: ruleExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getSubExpressionsExpressionParserRuleCall_1_1_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__VariableReference__SubExpressionsAssignment_1_1_07255);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3606:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3610:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3611:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3611:1: ( RULE_INT )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3612:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment7288); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3621:1: rule__FloatValue__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3625:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3626:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3626:1: ( RULE_FLOAT )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3627:1: RULE_FLOAT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueFloatTerminalRuleCall_0()); 
            }
            match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_rule__FloatValue__ValueAssignment7319); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3636:1: rule__BooleanValue__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3640:1: ( ( RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3641:1: ( RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3641:1: ( RULE_BOOLEAN )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3642:1: RULE_BOOLEAN
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueBooleanTerminalRuleCall_0()); 
            }
            match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_rule__BooleanValue__ValueAssignment7350); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3651:1: rule__ValOperation__OperatorAssignment_0 : ( ruleValOperator ) ;
    public final void rule__ValOperation__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3655:1: ( ( ruleValOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3656:1: ( ruleValOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3656:1: ( ruleValOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3657:1: ruleValOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValOperationAccess().getOperatorValOperatorEnumRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValOperator_in_rule__ValOperation__OperatorAssignment_07381);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3666:1: rule__ValOperation__SubExpressionsAssignment_1 : ( ruleSignalReference ) ;
    public final void rule__ValOperation__SubExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3670:1: ( ( ruleSignalReference ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3671:1: ( ruleSignalReference )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3671:1: ( ruleSignalReference )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3672:1: ruleSignalReference
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValOperationAccess().getSubExpressionsSignalReferenceParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSignalReference_in_rule__ValOperation__SubExpressionsAssignment_17412);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3681:1: rule__PlusOperation__OperatorAssignment_1_1 : ( rulePlusOperator ) ;
    public final void rule__PlusOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3685:1: ( ( rulePlusOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3686:1: ( rulePlusOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3686:1: ( rulePlusOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3687:1: rulePlusOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getOperatorPlusOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePlusOperator_in_rule__PlusOperation__OperatorAssignment_1_17443);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3696:1: rule__PlusOperation__SubExpressionsAssignment_1_2 : ( ruleMultOrDivOperation ) ;
    public final void rule__PlusOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3700:1: ( ( ruleMultOrDivOperation ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3701:1: ( ruleMultOrDivOperation )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3701:1: ( ruleMultOrDivOperation )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3702:1: ruleMultOrDivOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getSubExpressionsMultOrDivOperationParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultOrDivOperation_in_rule__PlusOperation__SubExpressionsAssignment_1_27474);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3711:1: rule__MultOperation__OperatorAssignment_1_1 : ( ruleMultOperator ) ;
    public final void rule__MultOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3715:1: ( ( ruleMultOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3716:1: ( ruleMultOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3716:1: ( ruleMultOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3717:1: ruleMultOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getOperatorMultOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultOperator_in_rule__MultOperation__OperatorAssignment_1_17505);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3726:1: rule__MultOperation__SubExpressionsAssignment_1_2 : ( rulePreOrNormalValuedExpression ) ;
    public final void rule__MultOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3730:1: ( ( rulePreOrNormalValuedExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3731:1: ( rulePreOrNormalValuedExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3731:1: ( rulePreOrNormalValuedExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3732:1: rulePreOrNormalValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getSubExpressionsPreOrNormalValuedExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePreOrNormalValuedExpression_in_rule__MultOperation__SubExpressionsAssignment_1_27536);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3741:1: rule__DivOperation__OperatorAssignment_1_1 : ( ruleDivOperator ) ;
    public final void rule__DivOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3745:1: ( ( ruleDivOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3746:1: ( ruleDivOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3746:1: ( ruleDivOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3747:1: ruleDivOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getOperatorDivOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivOperator_in_rule__DivOperation__OperatorAssignment_1_17567);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3756:1: rule__DivOperation__SubExpressionsAssignment_1_2 : ( rulePreOrNormalValuedExpression ) ;
    public final void rule__DivOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3760:1: ( ( rulePreOrNormalValuedExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3761:1: ( rulePreOrNormalValuedExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3761:1: ( rulePreOrNormalValuedExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3762:1: rulePreOrNormalValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getSubExpressionsPreOrNormalValuedExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePreOrNormalValuedExpression_in_rule__DivOperation__SubExpressionsAssignment_1_27598);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3771:1: rule__PreArithmOperation__OperatorAssignment_0 : ( ruleUnaryParanthesedOperator ) ;
    public final void rule__PreArithmOperation__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3775:1: ( ( ruleUnaryParanthesedOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3776:1: ( ruleUnaryParanthesedOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3776:1: ( ruleUnaryParanthesedOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3777:1: ruleUnaryParanthesedOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreArithmOperationAccess().getOperatorUnaryParanthesedOperatorEnumRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryParanthesedOperator_in_rule__PreArithmOperation__OperatorAssignment_07629);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3786:1: rule__PreArithmOperation__SubExpressionsAssignment_2 : ( ruleValOperation ) ;
    public final void rule__PreArithmOperation__SubExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3790:1: ( ( ruleValOperation ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3791:1: ( ruleValOperation )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3791:1: ( ruleValOperation )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3792:1: ruleValOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreArithmOperationAccess().getSubExpressionsValOperationParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValOperation_in_rule__PreArithmOperation__SubExpressionsAssignment_27660);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3801:1: rule__CompareOperation__OperatorAssignment_1_1 : ( ruleCompareOperator ) ;
    public final void rule__CompareOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3805:1: ( ( ruleCompareOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3806:1: ( ruleCompareOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3806:1: ( ruleCompareOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3807:1: ruleCompareOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperator_in_rule__CompareOperation__OperatorAssignment_1_17691);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3816:1: rule__CompareOperation__SubExpressionsAssignment_1_2 : ( ruleValuedExpression ) ;
    public final void rule__CompareOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3820:1: ( ( ruleValuedExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3821:1: ( ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3821:1: ( ruleValuedExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3822:1: ruleValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsValuedExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_rule__CompareOperation__SubExpressionsAssignment_1_27722);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3831:1: rule__UnaryOperation__OperatorAssignment_0 : ( ruleUnaryOperator ) ;
    public final void rule__UnaryOperation__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3835:1: ( ( ruleUnaryOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3836:1: ( ruleUnaryOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3836:1: ( ruleUnaryOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3837:1: ruleUnaryOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getOperatorUnaryOperatorEnumRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperator_in_rule__UnaryOperation__OperatorAssignment_07753);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3846:1: rule__UnaryOperation__SubExpressionsAssignment_1 : ( ( rule__UnaryOperation__SubExpressionsAlternatives_1_0 ) ) ;
    public final void rule__UnaryOperation__SubExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3850:1: ( ( ( rule__UnaryOperation__SubExpressionsAlternatives_1_0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3851:1: ( ( rule__UnaryOperation__SubExpressionsAlternatives_1_0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3851:1: ( ( rule__UnaryOperation__SubExpressionsAlternatives_1_0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3852:1: ( rule__UnaryOperation__SubExpressionsAlternatives_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getSubExpressionsAlternatives_1_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3853:1: ( rule__UnaryOperation__SubExpressionsAlternatives_1_0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3853:2: rule__UnaryOperation__SubExpressionsAlternatives_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__SubExpressionsAlternatives_1_0_in_rule__UnaryOperation__SubExpressionsAssignment_17784);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3862:1: rule__UnaryParanthesedOperation__OperatorAssignment_0 : ( ruleUnaryParanthesedOperator ) ;
    public final void rule__UnaryParanthesedOperation__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3866:1: ( ( ruleUnaryParanthesedOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3867:1: ( ruleUnaryParanthesedOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3867:1: ( ruleUnaryParanthesedOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3868:1: ruleUnaryParanthesedOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperationAccess().getOperatorUnaryParanthesedOperatorEnumRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryParanthesedOperator_in_rule__UnaryParanthesedOperation__OperatorAssignment_07817);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3877:1: rule__UnaryParanthesedOperation__SubExpressionsAssignment_2 : ( ruleBooleanExpression ) ;
    public final void rule__UnaryParanthesedOperation__SubExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3881:1: ( ( ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3882:1: ( ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3882:1: ( ruleBooleanExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3883:1: ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperationAccess().getSubExpressionsBooleanExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_rule__UnaryParanthesedOperation__SubExpressionsAssignment_27848);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3892:1: rule__AndOperation__OperatorAssignment_1_1 : ( ruleOperatorAnd ) ;
    public final void rule__AndOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3896:1: ( ( ruleOperatorAnd ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3897:1: ( ruleOperatorAnd )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3897:1: ( ruleOperatorAnd )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3898:1: ruleOperatorAnd
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getOperatorOperatorAndEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOperatorAnd_in_rule__AndOperation__OperatorAssignment_1_17879);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3907:1: rule__AndOperation__SubExpressionsAssignment_1_2 : ( ruleUnaryOrNormalExpression ) ;
    public final void rule__AndOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3911:1: ( ( ruleUnaryOrNormalExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3912:1: ( ruleUnaryOrNormalExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3912:1: ( ruleUnaryOrNormalExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3913:1: ruleUnaryOrNormalExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getSubExpressionsUnaryOrNormalExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOrNormalExpression_in_rule__AndOperation__SubExpressionsAssignment_1_27910);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3922:1: rule__OrOperation__OperatorAssignment_1_1 : ( ruleOperatorOr ) ;
    public final void rule__OrOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3926:1: ( ( ruleOperatorOr ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3927:1: ( ruleOperatorOr )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3927:1: ( ruleOperatorOr )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3928:1: ruleOperatorOr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getOperatorOperatorOrEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOperatorOr_in_rule__OrOperation__OperatorAssignment_1_17941);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3937:1: rule__OrOperation__SubExpressionsAssignment_1_2 : ( ruleAndOperation ) ;
    public final void rule__OrOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3941:1: ( ( ruleAndOperation ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3942:1: ( ruleAndOperation )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3942:1: ( ruleAndOperation )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3943:1: ruleAndOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getSubExpressionsAndOperationParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndOperation_in_rule__OrOperation__SubExpressionsAssignment_1_27972);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3952:1: rule__TextExpression__CodeAssignment_0 : ( RULE_STRING ) ;
    public final void rule__TextExpression__CodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3956:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3957:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3957:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3958:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getCodeSTRINGTerminalRuleCall_0_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__TextExpression__CodeAssignment_08003); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3967:1: rule__TextExpression__TypeAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__TextExpression__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3971:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3972:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3972:1: ( RULE_ID )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3973:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getTypeIDTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__TextExpression__TypeAssignment_1_18034); if (failed) return ;
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
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:963:6: ( ( ( rule__ParanthesedValuedExpression__Group_5__0 ) ) )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:963:6: ( ( rule__ParanthesedValuedExpression__Group_5__0 ) )
        {
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:963:6: ( ( rule__ParanthesedValuedExpression__Group_5__0 ) )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:964:1: ( rule__ParanthesedValuedExpression__Group_5__0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getParanthesedValuedExpressionAccess().getGroup_5()); 
        }
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:965:1: ( rule__ParanthesedValuedExpression__Group_5__0 )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:965:2: rule__ParanthesedValuedExpression__Group_5__0
        {
        pushFollow(FollowSets000.FOLLOW_rule__ParanthesedValuedExpression__Group_5__0_in_synpred61958);
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
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:985:1: ( ( ruleMultOperation ) )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:985:1: ( ruleMultOperation )
        {
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:985:1: ( ruleMultOperation )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:986:1: ruleMultOperation
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getMultOrDivOperationAccess().getMultOperationParserRuleCall_0()); 
        }
        pushFollow(FollowSets000.FOLLOW_ruleMultOperation_in_synpred72009);
        ruleMultOperation();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred7

    // $ANTLR start synpred9
    public final void synpred9_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1029:1: ( ( ruleParanthesedBooleanExpression ) )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1029:1: ( ruleParanthesedBooleanExpression )
        {
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1029:1: ( ruleParanthesedBooleanExpression )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1030:1: ruleParanthesedBooleanExpression
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getUnaryOperationAccess().getSubExpressionsParanthesedBooleanExpressionParserRuleCall_1_0_0()); 
        }
        pushFollow(FollowSets000.FOLLOW_ruleParanthesedBooleanExpression_in_synpred92108);
        ruleParanthesedBooleanExpression();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred9

    // $ANTLR start synpred11
    public final void synpred11_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1057:6: ( ( ruleUnaryParanthesedOperation ) )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1057:6: ( ruleUnaryParanthesedOperation )
        {
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1057:6: ( ruleUnaryParanthesedOperation )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1058:1: ruleUnaryParanthesedOperation
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getUnaryOrNormalExpressionAccess().getUnaryParanthesedOperationParserRuleCall_1()); 
        }
        pushFollow(FollowSets000.FOLLOW_ruleUnaryParanthesedOperation_in_synpred112174);
        ruleUnaryParanthesedOperation();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred11

    // $ANTLR start synpred13
    public final void synpred13_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1085:6: ( ( ruleCompareOperation ) )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1085:6: ( ruleCompareOperation )
        {
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1085:6: ( ruleCompareOperation )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1086:1: ruleCompareOperation
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getParanthesedBooleanExpressionAccess().getCompareOperationParserRuleCall_1()); 
        }
        pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_synpred132240);
        ruleCompareOperation();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred13

    // $ANTLR start synpred14
    public final void synpred14_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1091:6: ( ( ruleSignalReference ) )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1091:6: ( ruleSignalReference )
        {
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1091:6: ( ruleSignalReference )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1092:1: ruleSignalReference
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getParanthesedBooleanExpressionAccess().getSignalReferenceParserRuleCall_2()); 
        }
        pushFollow(FollowSets000.FOLLOW_ruleSignalReference_in_synpred142257);
        ruleSignalReference();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred14

    // $ANTLR start synpred15
    public final void synpred15_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1097:6: ( ( ruleValOperation ) )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1097:6: ( ruleValOperation )
        {
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1097:6: ( ruleValOperation )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1098:1: ruleValOperation
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getParanthesedBooleanExpressionAccess().getValOperationParserRuleCall_3()); 
        }
        pushFollow(FollowSets000.FOLLOW_ruleValOperation_in_synpred152274);
        ruleValOperation();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred15

    // $ANTLR start synpred16
    public final void synpred16_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1103:6: ( ( ruleTextExpression ) )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1103:6: ( ruleTextExpression )
        {
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1103:6: ( ruleTextExpression )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1104:1: ruleTextExpression
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getParanthesedBooleanExpressionAccess().getTextExpressionParserRuleCall_4()); 
        }
        pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_synpred162291);
        ruleTextExpression();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred16

    // $ANTLR start synpred17
    public final void synpred17_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1126:1: ( ( ruleValuedExpression ) )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1126:1: ( ruleValuedExpression )
        {
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1126:1: ( ruleValuedExpression )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1127:1: ruleValuedExpression
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_0()); 
        }
        pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_synpred172342);
        ruleValuedExpression();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred17

    // $ANTLR start synpred25
    public final void synpred25_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1295:2: ( rule__SignalReference__Group_1__0 )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1295:2: rule__SignalReference__Group_1__0
        {
        pushFollow(FollowSets000.FOLLOW_rule__SignalReference__Group_1__0_in_synpred252734);
        rule__SignalReference__Group_1__0();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred25

    // $ANTLR start synpred28
    public final void synpred28_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1515:2: ( rule__VariableReference__Group_1__0 )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1515:2: rule__VariableReference__Group_1__0
        {
        pushFollow(FollowSets000.FOLLOW_rule__VariableReference__Group_1__0_in_synpred283170);
        rule__VariableReference__Group_1__0();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred28

    // $ANTLR start synpred36
    public final void synpred36_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3425:2: ( rule__TextExpression__Group_1__0 )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3425:2: rule__TextExpression__Group_1__0
        {
        pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group_1__0_in_synpred366919);
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
        public static final BitSet FOLLOW_ruleTextExpression_in_entryRuleTextExpression1393 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextExpression1400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group__0_in_ruleTextExpression1426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1453 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression1460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Alternatives_in_ruleExpression1486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleValOperator1526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperator__Alternatives_in_ruleCompareOperator1564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleUnaryOperator1601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleUnaryParanthesedOperator1640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleOperatorOr1679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleOperatorAnd1718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PlusOperator__Alternatives_in_rulePlusOperator1758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultOperator__Alternatives_in_ruleMultOperator1794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleDivOperator1831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValue_in_rule__ParanthesedValuedExpression__Alternatives1873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_rule__ParanthesedValuedExpression__Alternatives1890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValOperation_in_rule__ParanthesedValuedExpression__Alternatives1907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableReference_in_rule__ParanthesedValuedExpression__Alternatives1924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_rule__ParanthesedValuedExpression__Alternatives1941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParanthesedValuedExpression__Group_5__0_in_rule__ParanthesedValuedExpression__Alternatives1958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParanthesedValuedExpression__Group_6__0_in_rule__ParanthesedValuedExpression__Alternatives1976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultOperation_in_rule__MultOrDivOperation__Alternatives2009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultOrDivOperation__Group_1__0_in_rule__MultOrDivOperation__Alternatives2026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePreArithmOperation_in_rule__PreOrNormalValuedExpression__Alternatives2059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParanthesedValuedExpression_in_rule__PreOrNormalValuedExpression__Alternatives2076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParanthesedBooleanExpression_in_rule__UnaryOperation__SubExpressionsAlternatives_1_02108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryParanthesedOperation_in_rule__UnaryOperation__SubExpressionsAlternatives_1_02125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperation_in_rule__UnaryOrNormalExpression__Alternatives2157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryParanthesedOperation_in_rule__UnaryOrNormalExpression__Alternatives2174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParanthesedBooleanExpression_in_rule__UnaryOrNormalExpression__Alternatives2191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanValue_in_rule__ParanthesedBooleanExpression__Alternatives2223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_rule__ParanthesedBooleanExpression__Alternatives2240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignalReference_in_rule__ParanthesedBooleanExpression__Alternatives2257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValOperation_in_rule__ParanthesedBooleanExpression__Alternatives2274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_rule__ParanthesedBooleanExpression__Alternatives2291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParanthesedBooleanExpression__Group_5__0_in_rule__ParanthesedBooleanExpression__Alternatives2308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_rule__Expression__Alternatives2342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__Expression__Alternatives2359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__CompareOperator__Alternatives2393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__CompareOperator__Alternatives2414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__CompareOperator__Alternatives2435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__CompareOperator__Alternatives2456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__CompareOperator__Alternatives2477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__CompareOperator__Alternatives2498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__PlusOperator__Alternatives2534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__PlusOperator__Alternatives2555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__MultOperator__Alternatives2591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__MultOperator__Alternatives2612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SignalReference__Group__0__Impl_in_rule__SignalReference__Group__02647 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_rule__SignalReference__Group__1_in_rule__SignalReference__Group__02650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SignalReference__SignalAssignment_0_in_rule__SignalReference__Group__0__Impl2677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SignalReference__Group__1__Impl_in_rule__SignalReference__Group__12707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SignalReference__Group_1__0_in_rule__SignalReference__Group__1__Impl2734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SignalReference__Group_1__0__Impl_in_rule__SignalReference__Group_1__02769 = new BitSet(new long[]{0x000000006000E1F0L});
        public static final BitSet FOLLOW_rule__SignalReference__Group_1__1_in_rule__SignalReference__Group_1__02772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__SignalReference__Group_1__0__Impl2800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SignalReference__Group_1__1__Impl_in_rule__SignalReference__Group_1__12831 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__SignalReference__Group_1__2_in_rule__SignalReference__Group_1__12834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SignalReference__Group_1_1__0_in_rule__SignalReference__Group_1__1__Impl2861 = new BitSet(new long[]{0x000000002000E1F2L});
        public static final BitSet FOLLOW_rule__SignalReference__Group_1__2__Impl_in_rule__SignalReference__Group_1__22892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__SignalReference__Group_1__2__Impl2920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SignalReference__Group_1_1__0__Impl_in_rule__SignalReference__Group_1_1__02957 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_rule__SignalReference__Group_1_1__1_in_rule__SignalReference__Group_1_1__02960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SignalReference__SubExpressionsAssignment_1_1_0_in_rule__SignalReference__Group_1_1__0__Impl2987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SignalReference__Group_1_1__1__Impl_in_rule__SignalReference__Group_1_1__13017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__SignalReference__Group_1_1__1__Impl3046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__Group__0__Impl_in_rule__VariableReference__Group__03083 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_rule__VariableReference__Group__1_in_rule__VariableReference__Group__03086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__VariableAssignment_0_in_rule__VariableReference__Group__0__Impl3113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__Group__1__Impl_in_rule__VariableReference__Group__13143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__Group_1__0_in_rule__VariableReference__Group__1__Impl3170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__Group_1__0__Impl_in_rule__VariableReference__Group_1__03205 = new BitSet(new long[]{0x000000006000E1F0L});
        public static final BitSet FOLLOW_rule__VariableReference__Group_1__1_in_rule__VariableReference__Group_1__03208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__VariableReference__Group_1__0__Impl3236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__Group_1__1__Impl_in_rule__VariableReference__Group_1__13267 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__VariableReference__Group_1__2_in_rule__VariableReference__Group_1__13270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__Group_1_1__0_in_rule__VariableReference__Group_1__1__Impl3297 = new BitSet(new long[]{0x000000002000E1F2L});
        public static final BitSet FOLLOW_rule__VariableReference__Group_1__2__Impl_in_rule__VariableReference__Group_1__23328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__VariableReference__Group_1__2__Impl3356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__Group_1_1__0__Impl_in_rule__VariableReference__Group_1_1__03393 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_rule__VariableReference__Group_1_1__1_in_rule__VariableReference__Group_1_1__03396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__SubExpressionsAssignment_1_1_0_in_rule__VariableReference__Group_1_1__0__Impl3423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__Group_1_1__1__Impl_in_rule__VariableReference__Group_1_1__13453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__VariableReference__Group_1_1__1__Impl3482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValOperation__Group__0__Impl_in_rule__ValOperation__Group__03519 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__ValOperation__Group__1_in_rule__ValOperation__Group__03522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValOperation__OperatorAssignment_0_in_rule__ValOperation__Group__0__Impl3549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValOperation__Group__1__Impl_in_rule__ValOperation__Group__13579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValOperation__SubExpressionsAssignment_1_in_rule__ValOperation__Group__1__Impl3606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParanthesedValuedExpression__Group_5__0__Impl_in_rule__ParanthesedValuedExpression__Group_5__03640 = new BitSet(new long[]{0x000000002000A170L});
        public static final BitSet FOLLOW_rule__ParanthesedValuedExpression__Group_5__1_in_rule__ParanthesedValuedExpression__Group_5__03643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__ParanthesedValuedExpression__Group_5__0__Impl3671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParanthesedValuedExpression__Group_5__1__Impl_in_rule__ParanthesedValuedExpression__Group_5__13702 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__ParanthesedValuedExpression__Group_5__2_in_rule__ParanthesedValuedExpression__Group_5__13705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePlusOperation_in_rule__ParanthesedValuedExpression__Group_5__1__Impl3732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParanthesedValuedExpression__Group_5__2__Impl_in_rule__ParanthesedValuedExpression__Group_5__23761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__ParanthesedValuedExpression__Group_5__2__Impl3789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParanthesedValuedExpression__Group_6__0__Impl_in_rule__ParanthesedValuedExpression__Group_6__03826 = new BitSet(new long[]{0x000000002000A170L});
        public static final BitSet FOLLOW_rule__ParanthesedValuedExpression__Group_6__1_in_rule__ParanthesedValuedExpression__Group_6__03829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__ParanthesedValuedExpression__Group_6__0__Impl3857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParanthesedValuedExpression__Group_6__1__Impl_in_rule__ParanthesedValuedExpression__Group_6__13888 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__ParanthesedValuedExpression__Group_6__2_in_rule__ParanthesedValuedExpression__Group_6__13891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivOperation_in_rule__ParanthesedValuedExpression__Group_6__1__Impl3918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParanthesedValuedExpression__Group_6__2__Impl_in_rule__ParanthesedValuedExpression__Group_6__23947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__ParanthesedValuedExpression__Group_6__2__Impl3975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PlusOperation__Group__0__Impl_in_rule__PlusOperation__Group__04012 = new BitSet(new long[]{0x0000000006000002L});
        public static final BitSet FOLLOW_rule__PlusOperation__Group__1_in_rule__PlusOperation__Group__04015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultOrDivOperation_in_rule__PlusOperation__Group__0__Impl4042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PlusOperation__Group__1__Impl_in_rule__PlusOperation__Group__14071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PlusOperation__Group_1__0_in_rule__PlusOperation__Group__1__Impl4098 = new BitSet(new long[]{0x0000000006000002L});
        public static final BitSet FOLLOW_rule__PlusOperation__Group_1__0__Impl_in_rule__PlusOperation__Group_1__04133 = new BitSet(new long[]{0x0000000006000000L});
        public static final BitSet FOLLOW_rule__PlusOperation__Group_1__1_in_rule__PlusOperation__Group_1__04136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PlusOperation__Group_1__1__Impl_in_rule__PlusOperation__Group_1__14194 = new BitSet(new long[]{0x000000002000A170L});
        public static final BitSet FOLLOW_rule__PlusOperation__Group_1__2_in_rule__PlusOperation__Group_1__14197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PlusOperation__OperatorAssignment_1_1_in_rule__PlusOperation__Group_1__1__Impl4224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PlusOperation__Group_1__2__Impl_in_rule__PlusOperation__Group_1__24254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PlusOperation__SubExpressionsAssignment_1_2_in_rule__PlusOperation__Group_1__2__Impl4281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultOrDivOperation__Group_1__0__Impl_in_rule__MultOrDivOperation__Group_1__04317 = new BitSet(new long[]{0x000000002000A170L});
        public static final BitSet FOLLOW_rule__MultOrDivOperation__Group_1__1_in_rule__MultOrDivOperation__Group_1__04320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__MultOrDivOperation__Group_1__0__Impl4348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultOrDivOperation__Group_1__1__Impl_in_rule__MultOrDivOperation__Group_1__14379 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__MultOrDivOperation__Group_1__2_in_rule__MultOrDivOperation__Group_1__14382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivOperation_in_rule__MultOrDivOperation__Group_1__1__Impl4409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultOrDivOperation__Group_1__2__Impl_in_rule__MultOrDivOperation__Group_1__24438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__MultOrDivOperation__Group_1__2__Impl4466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultOperation__Group__0__Impl_in_rule__MultOperation__Group__04503 = new BitSet(new long[]{0x0000000018000002L});
        public static final BitSet FOLLOW_rule__MultOperation__Group__1_in_rule__MultOperation__Group__04506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePreOrNormalValuedExpression_in_rule__MultOperation__Group__0__Impl4533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultOperation__Group__1__Impl_in_rule__MultOperation__Group__14562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultOperation__Group_1__0_in_rule__MultOperation__Group__1__Impl4589 = new BitSet(new long[]{0x0000000018000002L});
        public static final BitSet FOLLOW_rule__MultOperation__Group_1__0__Impl_in_rule__MultOperation__Group_1__04624 = new BitSet(new long[]{0x0000000018000000L});
        public static final BitSet FOLLOW_rule__MultOperation__Group_1__1_in_rule__MultOperation__Group_1__04627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultOperation__Group_1__1__Impl_in_rule__MultOperation__Group_1__14685 = new BitSet(new long[]{0x000000002000A170L});
        public static final BitSet FOLLOW_rule__MultOperation__Group_1__2_in_rule__MultOperation__Group_1__14688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultOperation__OperatorAssignment_1_1_in_rule__MultOperation__Group_1__1__Impl4715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultOperation__Group_1__2__Impl_in_rule__MultOperation__Group_1__24745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultOperation__SubExpressionsAssignment_1_2_in_rule__MultOperation__Group_1__2__Impl4772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivOperation__Group__0__Impl_in_rule__DivOperation__Group__04808 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__DivOperation__Group__1_in_rule__DivOperation__Group__04811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePreOrNormalValuedExpression_in_rule__DivOperation__Group__0__Impl4838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivOperation__Group__1__Impl_in_rule__DivOperation__Group__14867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivOperation__Group_1__0_in_rule__DivOperation__Group__1__Impl4894 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__DivOperation__Group_1__0__Impl_in_rule__DivOperation__Group_1__04929 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__DivOperation__Group_1__1_in_rule__DivOperation__Group_1__04932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivOperation__Group_1__1__Impl_in_rule__DivOperation__Group_1__14990 = new BitSet(new long[]{0x000000002000A170L});
        public static final BitSet FOLLOW_rule__DivOperation__Group_1__2_in_rule__DivOperation__Group_1__14993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivOperation__OperatorAssignment_1_1_in_rule__DivOperation__Group_1__1__Impl5020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivOperation__Group_1__2__Impl_in_rule__DivOperation__Group_1__25050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivOperation__SubExpressionsAssignment_1_2_in_rule__DivOperation__Group_1__2__Impl5077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PreArithmOperation__Group__0__Impl_in_rule__PreArithmOperation__Group__05113 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__PreArithmOperation__Group__1_in_rule__PreArithmOperation__Group__05116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PreArithmOperation__OperatorAssignment_0_in_rule__PreArithmOperation__Group__0__Impl5143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PreArithmOperation__Group__1__Impl_in_rule__PreArithmOperation__Group__15173 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__PreArithmOperation__Group__2_in_rule__PreArithmOperation__Group__15176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__PreArithmOperation__Group__1__Impl5204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PreArithmOperation__Group__2__Impl_in_rule__PreArithmOperation__Group__25235 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__PreArithmOperation__Group__3_in_rule__PreArithmOperation__Group__25238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PreArithmOperation__SubExpressionsAssignment_2_in_rule__PreArithmOperation__Group__2__Impl5265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PreArithmOperation__Group__3__Impl_in_rule__PreArithmOperation__Group__35295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__PreArithmOperation__Group__3__Impl5323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group__0__Impl_in_rule__CompareOperation__Group__05362 = new BitSet(new long[]{0x0000000001F80000L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group__1_in_rule__CompareOperation__Group__05365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_rule__CompareOperation__Group__0__Impl5392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group__1__Impl_in_rule__CompareOperation__Group__15421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_1__0_in_rule__CompareOperation__Group__1__Impl5448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_1__0__Impl_in_rule__CompareOperation__Group_1__05482 = new BitSet(new long[]{0x0000000001F80000L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_1__1_in_rule__CompareOperation__Group_1__05485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_1__1__Impl_in_rule__CompareOperation__Group_1__15543 = new BitSet(new long[]{0x000000002000A170L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_1__2_in_rule__CompareOperation__Group_1__15546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__OperatorAssignment_1_1_in_rule__CompareOperation__Group_1__1__Impl5573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_1__2__Impl_in_rule__CompareOperation__Group_1__25603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__SubExpressionsAssignment_1_2_in_rule__CompareOperation__Group_1__2__Impl5630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperation__Group__0__Impl_in_rule__UnaryOperation__Group__05666 = new BitSet(new long[]{0x000000002000A1F0L});
        public static final BitSet FOLLOW_rule__UnaryOperation__Group__1_in_rule__UnaryOperation__Group__05669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperation__OperatorAssignment_0_in_rule__UnaryOperation__Group__0__Impl5696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperation__Group__1__Impl_in_rule__UnaryOperation__Group__15726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperation__SubExpressionsAssignment_1_in_rule__UnaryOperation__Group__1__Impl5753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__Group__0__Impl_in_rule__UnaryParanthesedOperation__Group__05787 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__Group__1_in_rule__UnaryParanthesedOperation__Group__05790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__OperatorAssignment_0_in_rule__UnaryParanthesedOperation__Group__0__Impl5817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__Group__1__Impl_in_rule__UnaryParanthesedOperation__Group__15847 = new BitSet(new long[]{0x000000002000E1F0L});
        public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__Group__2_in_rule__UnaryParanthesedOperation__Group__15850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__UnaryParanthesedOperation__Group__1__Impl5878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__Group__2__Impl_in_rule__UnaryParanthesedOperation__Group__25909 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__Group__3_in_rule__UnaryParanthesedOperation__Group__25912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__SubExpressionsAssignment_2_in_rule__UnaryParanthesedOperation__Group__2__Impl5939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__Group__3__Impl_in_rule__UnaryParanthesedOperation__Group__35969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__UnaryParanthesedOperation__Group__3__Impl5997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndOperation__Group__0__Impl_in_rule__AndOperation__Group__06036 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__AndOperation__Group__1_in_rule__AndOperation__Group__06039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOrNormalExpression_in_rule__AndOperation__Group__0__Impl6066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndOperation__Group__1__Impl_in_rule__AndOperation__Group__16095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndOperation__Group_1__0_in_rule__AndOperation__Group__1__Impl6122 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__AndOperation__Group_1__0__Impl_in_rule__AndOperation__Group_1__06157 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__AndOperation__Group_1__1_in_rule__AndOperation__Group_1__06160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndOperation__Group_1__1__Impl_in_rule__AndOperation__Group_1__16218 = new BitSet(new long[]{0x000000002000E1F0L});
        public static final BitSet FOLLOW_rule__AndOperation__Group_1__2_in_rule__AndOperation__Group_1__16221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndOperation__OperatorAssignment_1_1_in_rule__AndOperation__Group_1__1__Impl6248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndOperation__Group_1__2__Impl_in_rule__AndOperation__Group_1__26278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndOperation__SubExpressionsAssignment_1_2_in_rule__AndOperation__Group_1__2__Impl6305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrOperation__Group__0__Impl_in_rule__OrOperation__Group__06341 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__OrOperation__Group__1_in_rule__OrOperation__Group__06344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndOperation_in_rule__OrOperation__Group__0__Impl6371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrOperation__Group__1__Impl_in_rule__OrOperation__Group__16400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrOperation__Group_1__0_in_rule__OrOperation__Group__1__Impl6427 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__OrOperation__Group_1__0__Impl_in_rule__OrOperation__Group_1__06462 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__OrOperation__Group_1__1_in_rule__OrOperation__Group_1__06465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrOperation__Group_1__1__Impl_in_rule__OrOperation__Group_1__16523 = new BitSet(new long[]{0x000000002000E1F0L});
        public static final BitSet FOLLOW_rule__OrOperation__Group_1__2_in_rule__OrOperation__Group_1__16526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrOperation__OperatorAssignment_1_1_in_rule__OrOperation__Group_1__1__Impl6553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrOperation__Group_1__2__Impl_in_rule__OrOperation__Group_1__26583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrOperation__SubExpressionsAssignment_1_2_in_rule__OrOperation__Group_1__2__Impl6610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParanthesedBooleanExpression__Group_5__0__Impl_in_rule__ParanthesedBooleanExpression__Group_5__06646 = new BitSet(new long[]{0x000000002000E1F0L});
        public static final BitSet FOLLOW_rule__ParanthesedBooleanExpression__Group_5__1_in_rule__ParanthesedBooleanExpression__Group_5__06649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__ParanthesedBooleanExpression__Group_5__0__Impl6677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParanthesedBooleanExpression__Group_5__1__Impl_in_rule__ParanthesedBooleanExpression__Group_5__16708 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__ParanthesedBooleanExpression__Group_5__2_in_rule__ParanthesedBooleanExpression__Group_5__16711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrOperation_in_rule__ParanthesedBooleanExpression__Group_5__1__Impl6738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParanthesedBooleanExpression__Group_5__2__Impl_in_rule__ParanthesedBooleanExpression__Group_5__26767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__ParanthesedBooleanExpression__Group_5__2__Impl6795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group__0__Impl_in_rule__TextExpression__Group__06832 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group__1_in_rule__TextExpression__Group__06835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__CodeAssignment_0_in_rule__TextExpression__Group__0__Impl6862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group__1__Impl_in_rule__TextExpression__Group__16892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group_1__0_in_rule__TextExpression__Group__1__Impl6919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group_1__0__Impl_in_rule__TextExpression__Group_1__06954 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__TextExpression__Group_1__1_in_rule__TextExpression__Group_1__06957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__TextExpression__Group_1__0__Impl6985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group_1__1__Impl_in_rule__TextExpression__Group_1__17016 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__TextExpression__Group_1__2_in_rule__TextExpression__Group_1__17019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__TypeAssignment_1_1_in_rule__TextExpression__Group_1__1__Impl7046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group_1__2__Impl_in_rule__TextExpression__Group_1__27076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__TextExpression__Group_1__2__Impl7104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__SignalReference__SignalAssignment_07150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__SignalReference__SubExpressionsAssignment_1_1_07185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__VariableReference__VariableAssignment_07220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__VariableReference__SubExpressionsAssignment_1_1_07255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment7288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_rule__FloatValue__ValueAssignment7319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__BooleanValue__ValueAssignment7350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValOperator_in_rule__ValOperation__OperatorAssignment_07381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignalReference_in_rule__ValOperation__SubExpressionsAssignment_17412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePlusOperator_in_rule__PlusOperation__OperatorAssignment_1_17443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultOrDivOperation_in_rule__PlusOperation__SubExpressionsAssignment_1_27474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultOperator_in_rule__MultOperation__OperatorAssignment_1_17505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePreOrNormalValuedExpression_in_rule__MultOperation__SubExpressionsAssignment_1_27536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivOperator_in_rule__DivOperation__OperatorAssignment_1_17567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePreOrNormalValuedExpression_in_rule__DivOperation__SubExpressionsAssignment_1_27598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryParanthesedOperator_in_rule__PreArithmOperation__OperatorAssignment_07629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValOperation_in_rule__PreArithmOperation__SubExpressionsAssignment_27660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperator_in_rule__CompareOperation__OperatorAssignment_1_17691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_rule__CompareOperation__SubExpressionsAssignment_1_27722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperator_in_rule__UnaryOperation__OperatorAssignment_07753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperation__SubExpressionsAlternatives_1_0_in_rule__UnaryOperation__SubExpressionsAssignment_17784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryParanthesedOperator_in_rule__UnaryParanthesedOperation__OperatorAssignment_07817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__UnaryParanthesedOperation__SubExpressionsAssignment_27848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperatorAnd_in_rule__AndOperation__OperatorAssignment_1_17879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOrNormalExpression_in_rule__AndOperation__SubExpressionsAssignment_1_27910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperatorOr_in_rule__OrOperation__OperatorAssignment_1_17941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndOperation_in_rule__OrOperation__SubExpressionsAssignment_1_27972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__TextExpression__CodeAssignment_08003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__TextExpression__TypeAssignment_1_18034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParanthesedValuedExpression__Group_5__0_in_synpred61958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultOperation_in_synpred72009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParanthesedBooleanExpression_in_synpred92108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryParanthesedOperation_in_synpred112174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_synpred132240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignalReference_in_synpred142257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValOperation_in_synpred152274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_synpred162291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_synpred172342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SignalReference__Group_1__0_in_synpred252734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__Group_1__0_in_synpred283170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group_1__0_in_synpred366919 = new BitSet(new long[]{0x0000000000000002L});
    }


}