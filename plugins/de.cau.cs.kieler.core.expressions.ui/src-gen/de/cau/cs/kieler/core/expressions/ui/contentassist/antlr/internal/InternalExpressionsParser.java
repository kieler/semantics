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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'pre'", "'or'", "'and'", "'not'", "'+'", "'-'", "'*'", "'mod'", "'/'", "'?'", "'='", "'<'", "'<='", "'>'", "'>='", "'<>'", "'('", "')'"
    };
    public static final int RULE_ML_COMMENT=9;
    public static final int RULE_ID=4;
    public static final int RULE_WS=11;
    public static final int EOF=-1;
    public static final int RULE_INT=6;
    public static final int RULE_BOOLEAN=8;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_FLOAT=7;
    public static final int RULE_SL_COMMENT=10;

        public InternalExpressionsParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[242+1];
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




    // $ANTLR start entryRuleExpression
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:62:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:63:1: ( ruleExpression EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:64:1: ruleExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression67);
            ruleExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression74); if (failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:71:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:75:2: ( ( ( rule__Expression__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:76:1: ( ( rule__Expression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:76:1: ( ( rule__Expression__Alternatives ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:77:1: ( rule__Expression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:78:1: ( rule__Expression__Alternatives )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:78:2: rule__Expression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Alternatives_in_ruleExpression100);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:90:1: entryRuleBooleanExpression : ruleBooleanExpression EOF ;
    public final void entryRuleBooleanExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:91:1: ( ruleBooleanExpression EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:92:1: ruleBooleanExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression127);
            ruleBooleanExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanExpression134); if (failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:99:1: ruleBooleanExpression : ( ruleOrExpression ) ;
    public final void ruleBooleanExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:103:2: ( ( ruleOrExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:104:1: ( ruleOrExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:104:1: ( ruleOrExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:105:1: ruleOrExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getOrExpressionParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_ruleBooleanExpression160);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:118:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:119:1: ( ruleOrExpression EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:120:1: ruleOrExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_entryRuleOrExpression186);
            ruleOrExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getOrExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrExpression193); if (failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:127:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:131:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:132:1: ( ( rule__OrExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:132:1: ( ( rule__OrExpression__Group__0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:133:1: ( rule__OrExpression__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:134:1: ( rule__OrExpression__Group__0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:134:2: rule__OrExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group__0_in_ruleOrExpression219);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:146:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:147:1: ( ruleAndExpression EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:148:1: ruleAndExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_entryRuleAndExpression246);
            ruleAndExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAndExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAndExpression253); if (failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:155:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:159:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:160:1: ( ( rule__AndExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:160:1: ( ( rule__AndExpression__Group__0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:161:1: ( rule__AndExpression__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:162:1: ( rule__AndExpression__Group__0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:162:2: rule__AndExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group__0_in_ruleAndExpression279);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:174:1: entryRuleCompareOperation : ruleCompareOperation EOF ;
    public final void entryRuleCompareOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:175:1: ( ruleCompareOperation EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:176:1: ruleCompareOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation306);
            ruleCompareOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getCompareOperationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompareOperation313); if (failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:183:1: ruleCompareOperation : ( ( rule__CompareOperation__Alternatives ) ) ;
    public final void ruleCompareOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:187:2: ( ( ( rule__CompareOperation__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:188:1: ( ( rule__CompareOperation__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:188:1: ( ( rule__CompareOperation__Alternatives ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:189:1: ( rule__CompareOperation__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:190:1: ( rule__CompareOperation__Alternatives )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:190:2: rule__CompareOperation__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Alternatives_in_ruleCompareOperation339);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:202:1: entryRuleNotOrValuedExpression : ruleNotOrValuedExpression EOF ;
    public final void entryRuleNotOrValuedExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:203:1: ( ruleNotOrValuedExpression EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:204:1: ruleNotOrValuedExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotOrValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression366);
            ruleNotOrValuedExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getNotOrValuedExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNotOrValuedExpression373); if (failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:211:1: ruleNotOrValuedExpression : ( ( rule__NotOrValuedExpression__Alternatives ) ) ;
    public final void ruleNotOrValuedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:215:2: ( ( ( rule__NotOrValuedExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:216:1: ( ( rule__NotOrValuedExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:216:1: ( ( rule__NotOrValuedExpression__Alternatives ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:217:1: ( rule__NotOrValuedExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotOrValuedExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:218:1: ( rule__NotOrValuedExpression__Alternatives )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:218:2: rule__NotOrValuedExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotOrValuedExpression__Alternatives_in_ruleNotOrValuedExpression399);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:230:1: entryRuleValuedExpression : ruleValuedExpression EOF ;
    public final void entryRuleValuedExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:231:1: ( ruleValuedExpression EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:232:1: ruleValuedExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression426);
            ruleValuedExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getValuedExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedExpression433); if (failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:239:1: ruleValuedExpression : ( ruleAddExpression ) ;
    public final void ruleValuedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:243:2: ( ( ruleAddExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:244:1: ( ruleAddExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:244:1: ( ruleAddExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:245:1: ruleAddExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedExpressionAccess().getAddExpressionParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_ruleValuedExpression459);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:258:1: entryRuleAddExpression : ruleAddExpression EOF ;
    public final void entryRuleAddExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:259:1: ( ruleAddExpression EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:260:1: ruleAddExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_entryRuleAddExpression485);
            ruleAddExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAddExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAddExpression492); if (failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:267:1: ruleAddExpression : ( ( rule__AddExpression__Group__0 ) ) ;
    public final void ruleAddExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:271:2: ( ( ( rule__AddExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:272:1: ( ( rule__AddExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:272:1: ( ( rule__AddExpression__Group__0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:273:1: ( rule__AddExpression__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:274:1: ( rule__AddExpression__Group__0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:274:2: rule__AddExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__0_in_ruleAddExpression518);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:286:1: entryRuleSubExpression : ruleSubExpression EOF ;
    public final void entryRuleSubExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:287:1: ( ruleSubExpression EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:288:1: ruleSubExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_entryRuleSubExpression545);
            ruleSubExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSubExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubExpression552); if (failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:295:1: ruleSubExpression : ( ( rule__SubExpression__Group__0 ) ) ;
    public final void ruleSubExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:299:2: ( ( ( rule__SubExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:300:1: ( ( rule__SubExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:300:1: ( ( rule__SubExpression__Group__0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:301:1: ( rule__SubExpression__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:302:1: ( rule__SubExpression__Group__0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:302:2: rule__SubExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group__0_in_ruleSubExpression578);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:314:1: entryRuleMultExpression : ruleMultExpression EOF ;
    public final void entryRuleMultExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:315:1: ( ruleMultExpression EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:316:1: ruleMultExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_entryRuleMultExpression605);
            ruleMultExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMultExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultExpression612); if (failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:323:1: ruleMultExpression : ( ( rule__MultExpression__Group__0 ) ) ;
    public final void ruleMultExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:327:2: ( ( ( rule__MultExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:328:1: ( ( rule__MultExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:328:1: ( ( rule__MultExpression__Group__0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:329:1: ( rule__MultExpression__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:330:1: ( rule__MultExpression__Group__0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:330:2: rule__MultExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__0_in_ruleMultExpression638);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:342:1: entryRuleModExpression : ruleModExpression EOF ;
    public final void entryRuleModExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:343:1: ( ruleModExpression EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:344:1: ruleModExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_entryRuleModExpression665);
            ruleModExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getModExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModExpression672); if (failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:351:1: ruleModExpression : ( ( rule__ModExpression__Group__0 ) ) ;
    public final void ruleModExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:355:2: ( ( ( rule__ModExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:356:1: ( ( rule__ModExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:356:1: ( ( rule__ModExpression__Group__0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:357:1: ( rule__ModExpression__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:358:1: ( rule__ModExpression__Group__0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:358:2: rule__ModExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group__0_in_ruleModExpression698);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:370:1: entryRuleNotExpression : ruleNotExpression EOF ;
    public final void entryRuleNotExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:371:1: ( ruleNotExpression EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:372:1: ruleNotExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_entryRuleNotExpression725);
            ruleNotExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getNotExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNotExpression732); if (failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:379:1: ruleNotExpression : ( ( rule__NotExpression__Alternatives ) ) ;
    public final void ruleNotExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:383:2: ( ( ( rule__NotExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:384:1: ( ( rule__NotExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:384:1: ( ( rule__NotExpression__Alternatives ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:385:1: ( rule__NotExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:386:1: ( rule__NotExpression__Alternatives )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:386:2: rule__NotExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Alternatives_in_ruleNotExpression758);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:398:1: entryRuleAtomicExpression : ruleAtomicExpression EOF ;
    public final void entryRuleAtomicExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:399:1: ( ruleAtomicExpression EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:400:1: ruleAtomicExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression785);
            ruleAtomicExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicExpression792); if (failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:407:1: ruleAtomicExpression : ( ( rule__AtomicExpression__Alternatives ) ) ;
    public final void ruleAtomicExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:411:2: ( ( ( rule__AtomicExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:412:1: ( ( rule__AtomicExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:412:1: ( ( rule__AtomicExpression__Alternatives ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:413:1: ( rule__AtomicExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:414:1: ( rule__AtomicExpression__Alternatives )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:414:2: rule__AtomicExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Alternatives_in_ruleAtomicExpression818);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:426:1: entryRuleAtomicValuedExpression : ruleAtomicValuedExpression EOF ;
    public final void entryRuleAtomicValuedExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:427:1: ( ruleAtomicValuedExpression EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:428:1: ruleAtomicValuedExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression845);
            ruleAtomicValuedExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicValuedExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicValuedExpression852); if (failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:435:1: ruleAtomicValuedExpression : ( ( rule__AtomicValuedExpression__Alternatives ) ) ;
    public final void ruleAtomicValuedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:439:2: ( ( ( rule__AtomicValuedExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:440:1: ( ( rule__AtomicValuedExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:440:1: ( ( rule__AtomicValuedExpression__Alternatives ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:441:1: ( rule__AtomicValuedExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:442:1: ( rule__AtomicValuedExpression__Alternatives )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:442:2: rule__AtomicValuedExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Alternatives_in_ruleAtomicValuedExpression878);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:454:1: entryRuleDivExpression : ruleDivExpression EOF ;
    public final void entryRuleDivExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:455:1: ( ruleDivExpression EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:456:1: ruleDivExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_entryRuleDivExpression905);
            ruleDivExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDivExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDivExpression912); if (failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:463:1: ruleDivExpression : ( ( rule__DivExpression__Group__0 ) ) ;
    public final void ruleDivExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:467:2: ( ( ( rule__DivExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:468:1: ( ( rule__DivExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:468:1: ( ( rule__DivExpression__Group__0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:469:1: ( rule__DivExpression__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:470:1: ( rule__DivExpression__Group__0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:470:2: rule__DivExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group__0_in_ruleDivExpression938);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:482:1: entryRuleValuedObjectTestExpression : ruleValuedObjectTestExpression EOF ;
    public final void entryRuleValuedObjectTestExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:483:1: ( ruleValuedObjectTestExpression EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:484:1: ruleValuedObjectTestExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression965);
            ruleValuedObjectTestExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getValuedObjectTestExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedObjectTestExpression972); if (failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:491:1: ruleValuedObjectTestExpression : ( ( rule__ValuedObjectTestExpression__Alternatives ) ) ;
    public final void ruleValuedObjectTestExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:495:2: ( ( ( rule__ValuedObjectTestExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:496:1: ( ( rule__ValuedObjectTestExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:496:1: ( ( rule__ValuedObjectTestExpression__Alternatives ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:497:1: ( rule__ValuedObjectTestExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:498:1: ( rule__ValuedObjectTestExpression__Alternatives )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:498:2: rule__ValuedObjectTestExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Alternatives_in_ruleValuedObjectTestExpression998);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:510:1: entryRuleValuedObjectReference : ruleValuedObjectReference EOF ;
    public final void entryRuleValuedObjectReference() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:511:1: ( ruleValuedObjectReference EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:512:1: ruleValuedObjectReference EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference1025);
            ruleValuedObjectReference();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getValuedObjectReferenceRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedObjectReference1032); if (failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:519:1: ruleValuedObjectReference : ( ( rule__ValuedObjectReference__ValuedObjectAssignment ) ) ;
    public final void ruleValuedObjectReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:523:2: ( ( ( rule__ValuedObjectReference__ValuedObjectAssignment ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:524:1: ( ( rule__ValuedObjectReference__ValuedObjectAssignment ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:524:1: ( ( rule__ValuedObjectReference__ValuedObjectAssignment ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:525:1: ( rule__ValuedObjectReference__ValuedObjectAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectAssignment()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:526:1: ( rule__ValuedObjectReference__ValuedObjectAssignment )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:526:2: rule__ValuedObjectReference__ValuedObjectAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectReference__ValuedObjectAssignment_in_ruleValuedObjectReference1058);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:538:1: entryRuleTextExpression : ruleTextExpression EOF ;
    public final void entryRuleTextExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:539:1: ( ruleTextExpression EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:540:1: ruleTextExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_entryRuleTextExpression1085);
            ruleTextExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTextExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextExpression1092); if (failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:547:1: ruleTextExpression : ( ( rule__TextExpression__Group__0 ) ) ;
    public final void ruleTextExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:551:2: ( ( ( rule__TextExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:552:1: ( ( rule__TextExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:552:1: ( ( rule__TextExpression__Group__0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:553:1: ( rule__TextExpression__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:554:1: ( rule__TextExpression__Group__0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:554:2: rule__TextExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group__0_in_ruleTextExpression1118);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:566:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:567:1: ( ruleIntValue EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:568:1: ruleIntValue EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIntValue_in_entryRuleIntValue1145);
            ruleIntValue();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getIntValueRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntValue1152); if (failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:575:1: ruleIntValue : ( ( rule__IntValue__ValueAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:579:2: ( ( ( rule__IntValue__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:580:1: ( ( rule__IntValue__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:580:1: ( ( rule__IntValue__ValueAssignment ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:581:1: ( rule__IntValue__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:582:1: ( rule__IntValue__ValueAssignment )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:582:2: rule__IntValue__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue1178);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:594:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:595:1: ( ruleFloatValue EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:596:1: ruleFloatValue EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFloatValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_entryRuleFloatValue1205);
            ruleFloatValue();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getFloatValueRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloatValue1212); if (failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:603:1: ruleFloatValue : ( ( rule__FloatValue__ValueAssignment ) ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:607:2: ( ( ( rule__FloatValue__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:608:1: ( ( rule__FloatValue__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:608:1: ( ( rule__FloatValue__ValueAssignment ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:609:1: ( rule__FloatValue__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:610:1: ( rule__FloatValue__ValueAssignment )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:610:2: rule__FloatValue__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue1238);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:622:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:623:1: ( ruleBooleanValue EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:624:1: ruleBooleanValue EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1265);
            ruleBooleanValue();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getBooleanValueRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanValue1272); if (failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:631:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:635:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:636:1: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:636:1: ( ( rule__BooleanValue__ValueAssignment ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:637:1: ( rule__BooleanValue__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:638:1: ( rule__BooleanValue__ValueAssignment )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:638:2: rule__BooleanValue__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__ValueAssignment_in_ruleBooleanValue1298);
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


    // $ANTLR start ruleCompareOperator
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:653:1: ruleCompareOperator : ( ( rule__CompareOperator__Alternatives ) ) ;
    public final void ruleCompareOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:657:1: ( ( ( rule__CompareOperator__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:658:1: ( ( rule__CompareOperator__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:658:1: ( ( rule__CompareOperator__Alternatives ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:659:1: ( rule__CompareOperator__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:660:1: ( rule__CompareOperator__Alternatives )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:660:2: rule__CompareOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperator__Alternatives_in_ruleCompareOperator1337);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:672:1: rulePreOperator : ( ( 'pre' ) ) ;
    public final void rulePreOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:676:1: ( ( ( 'pre' ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:677:1: ( ( 'pre' ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:677:1: ( ( 'pre' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:678:1: ( 'pre' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreOperatorAccess().getPREEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:679:1: ( 'pre' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:679:3: 'pre'
            {
            match(input,13,FollowSets000.FOLLOW_13_in_rulePreOperator1374); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:692:1: ruleOrOperator : ( ( 'or' ) ) ;
    public final void ruleOrOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:696:1: ( ( ( 'or' ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:697:1: ( ( 'or' ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:697:1: ( ( 'or' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:698:1: ( 'or' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperatorAccess().getOREnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:699:1: ( 'or' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:699:3: 'or'
            {
            match(input,14,FollowSets000.FOLLOW_14_in_ruleOrOperator1413); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:712:1: ruleAndOperator : ( ( 'and' ) ) ;
    public final void ruleAndOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:716:1: ( ( ( 'and' ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:717:1: ( ( 'and' ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:717:1: ( ( 'and' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:718:1: ( 'and' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperatorAccess().getANDEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:719:1: ( 'and' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:719:3: 'and'
            {
            match(input,15,FollowSets000.FOLLOW_15_in_ruleAndOperator1452); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:732:1: ruleNotOperator : ( ( 'not' ) ) ;
    public final void ruleNotOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:736:1: ( ( ( 'not' ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:737:1: ( ( 'not' ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:737:1: ( ( 'not' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:738:1: ( 'not' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:739:1: ( 'not' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:739:3: 'not'
            {
            match(input,16,FollowSets000.FOLLOW_16_in_ruleNotOperator1491); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:752:1: ruleAddOperator : ( ( '+' ) ) ;
    public final void ruleAddOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:756:1: ( ( ( '+' ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:757:1: ( ( '+' ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:757:1: ( ( '+' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:758:1: ( '+' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddOperatorAccess().getADDEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:759:1: ( '+' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:759:3: '+'
            {
            match(input,17,FollowSets000.FOLLOW_17_in_ruleAddOperator1530); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:772:1: ruleSubOperator : ( ( '-' ) ) ;
    public final void ruleSubOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:776:1: ( ( ( '-' ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:777:1: ( ( '-' ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:777:1: ( ( '-' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:778:1: ( '-' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubOperatorAccess().getSUBEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:779:1: ( '-' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:779:3: '-'
            {
            match(input,18,FollowSets000.FOLLOW_18_in_ruleSubOperator1569); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:792:1: ruleMultOperator : ( ( '*' ) ) ;
    public final void ruleMultOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:796:1: ( ( ( '*' ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:797:1: ( ( '*' ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:797:1: ( ( '*' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:798:1: ( '*' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:799:1: ( '*' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:799:3: '*'
            {
            match(input,19,FollowSets000.FOLLOW_19_in_ruleMultOperator1608); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:812:1: ruleModOperator : ( ( 'mod' ) ) ;
    public final void ruleModOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:816:1: ( ( ( 'mod' ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:817:1: ( ( 'mod' ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:817:1: ( ( 'mod' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:818:1: ( 'mod' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModOperatorAccess().getMODEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:819:1: ( 'mod' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:819:3: 'mod'
            {
            match(input,20,FollowSets000.FOLLOW_20_in_ruleModOperator1647); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:832:1: ruleDivOperator : ( ( '/' ) ) ;
    public final void ruleDivOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:836:1: ( ( ( '/' ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:837:1: ( ( '/' ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:837:1: ( ( '/' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:838:1: ( '/' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperatorAccess().getDIVEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:839:1: ( '/' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:839:3: '/'
            {
            match(input,21,FollowSets000.FOLLOW_21_in_ruleDivOperator1686); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:852:1: ruleValueTestOperator : ( ( '?' ) ) ;
    public final void ruleValueTestOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:856:1: ( ( ( '?' ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:857:1: ( ( '?' ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:857:1: ( ( '?' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:858:1: ( '?' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValueTestOperatorAccess().getVALEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:859:1: ( '?' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:859:3: '?'
            {
            match(input,22,FollowSets000.FOLLOW_22_in_ruleValueTestOperator1725); if (failed) return ;

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


    // $ANTLR start rule__Expression__Alternatives
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:875:1: rule__Expression__Alternatives : ( ( ruleBooleanExpression ) | ( ruleValuedExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:879:1: ( ( ruleBooleanExpression ) | ( ruleValuedExpression ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:880:1: ( ruleBooleanExpression )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:880:1: ( ruleBooleanExpression )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:881:1: ruleBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_rule__Expression__Alternatives1766);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:886:6: ( ruleValuedExpression )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:886:6: ( ruleValuedExpression )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:887:1: ruleValuedExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_rule__Expression__Alternatives1783);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:897:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );
    public final void rule__CompareOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:901:1: ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) )
            int alt2=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_FLOAT:
                {
                alt2=1;
                }
                break;
            case 29:
                {
                int LA2_2 = input.LA(2);

                if ( (synpred2()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("897:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BOOLEAN:
                {
                int LA2_3 = input.LA(2);

                if ( ((LA2_3>=17 && LA2_3<=20)||(LA2_3>=23 && LA2_3<=28)) ) {
                    alt2=1;
                }
                else if ( (LA2_3==EOF||(LA2_3>=14 && LA2_3<=15)||LA2_3==30) ) {
                    alt2=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("897:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            case 13:
                {
                int LA2_4 = input.LA(2);

                if ( (LA2_4==29) ) {
                    int LA2_11 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt2=1;
                    }
                    else if ( (true) ) {
                        alt2=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("897:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 2, 11, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("897:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 2, 4, input);

                    throw nvae;
                }
                }
                break;
            case 22:
                {
                int LA2_5 = input.LA(2);

                if ( (LA2_5==RULE_ID) ) {
                    int LA2_12 = input.LA(3);

                    if ( ((LA2_12>=17 && LA2_12<=20)||(LA2_12>=23 && LA2_12<=28)) ) {
                        alt2=1;
                    }
                    else if ( (LA2_12==EOF||(LA2_12>=14 && LA2_12<=15)||LA2_12==30) ) {
                        alt2=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("897:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 2, 12, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("897:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 2, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA2_6 = input.LA(2);

                if ( (LA2_6==EOF||(LA2_6>=14 && LA2_6<=15)||LA2_6==30) ) {
                    alt2=2;
                }
                else if ( ((LA2_6>=17 && LA2_6<=20)||(LA2_6>=23 && LA2_6<=28)) ) {
                    alt2=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("897:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 2, 6, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case 29:
                    {
                    int LA2_13 = input.LA(3);

                    if ( (LA2_13==RULE_ID) ) {
                        int LA2_14 = input.LA(4);

                        if ( (LA2_14==30) ) {
                            int LA2_15 = input.LA(5);

                            if ( ((LA2_15>=17 && LA2_15<=20)||(LA2_15>=23 && LA2_15<=28)) ) {
                                alt2=1;
                            }
                            else if ( (LA2_15==EOF||(LA2_15>=14 && LA2_15<=15)||LA2_15==30) ) {
                                alt2=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("897:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 2, 15, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("897:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 2, 14, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("897:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 2, 13, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case 14:
                case 15:
                case 30:
                    {
                    alt2=2;
                    }
                    break;
                case 17:
                case 18:
                case 19:
                case 20:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                    {
                    alt2=1;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("897:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 2, 7, input);

                    throw nvae;
                }

                }
                break;
            case 16:
                {
                int LA2_8 = input.LA(2);

                if ( (synpred2()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("897:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 2, 8, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("897:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:902:1: ( ( rule__CompareOperation__Group_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:902:1: ( ( rule__CompareOperation__Group_0__0 ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:903:1: ( rule__CompareOperation__Group_0__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperationAccess().getGroup_0()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:904:1: ( rule__CompareOperation__Group_0__0 )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:904:2: rule__CompareOperation__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0__0_in_rule__CompareOperation__Alternatives1815);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:908:6: ( ruleNotExpression )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:908:6: ( ruleNotExpression )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:909:1: ruleNotExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperationAccess().getNotExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_rule__CompareOperation__Alternatives1833);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:919:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );
    public final void rule__NotOrValuedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:923:1: ( ( ruleValuedExpression ) | ( ruleNotExpression ) )
            int alt3=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_FLOAT:
                {
                alt3=1;
                }
                break;
            case 29:
                {
                int LA3_2 = input.LA(2);

                if ( (synpred3()) ) {
                    alt3=1;
                }
                else if ( (true) ) {
                    alt3=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("919:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BOOLEAN:
                {
                int LA3_3 = input.LA(2);

                if ( (synpred3()) ) {
                    alt3=1;
                }
                else if ( (true) ) {
                    alt3=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("919:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case 13:
                {
                int LA3_4 = input.LA(2);

                if ( (LA3_4==29) ) {
                    int LA3_9 = input.LA(3);

                    if ( (synpred3()) ) {
                        alt3=1;
                    }
                    else if ( (true) ) {
                        alt3=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("919:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );", 3, 9, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("919:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );", 3, 4, input);

                    throw nvae;
                }
                }
                break;
            case 22:
                {
                int LA3_5 = input.LA(2);

                if ( (LA3_5==RULE_ID) ) {
                    int LA3_10 = input.LA(3);

                    if ( (synpred3()) ) {
                        alt3=1;
                    }
                    else if ( (true) ) {
                        alt3=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("919:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );", 3, 10, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("919:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );", 3, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA3_6 = input.LA(2);

                if ( (synpred3()) ) {
                    alt3=1;
                }
                else if ( (true) ) {
                    alt3=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("919:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );", 3, 6, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                int LA3_7 = input.LA(2);

                if ( (synpred3()) ) {
                    alt3=1;
                }
                else if ( (true) ) {
                    alt3=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("919:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );", 3, 7, input);

                    throw nvae;
                }
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("919:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:924:1: ( ruleValuedExpression )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:924:1: ( ruleValuedExpression )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:925:1: ruleValuedExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_rule__NotOrValuedExpression__Alternatives1865);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:930:6: ( ruleNotExpression )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:930:6: ( ruleNotExpression )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:931:1: ruleNotExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getNotOrValuedExpressionAccess().getNotExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_rule__NotOrValuedExpression__Alternatives1882);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:941:1: rule__NotExpression__Alternatives : ( ( ( rule__NotExpression__Group_0__0 ) ) | ( ruleAtomicExpression ) );
    public final void rule__NotExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:945:1: ( ( ( rule__NotExpression__Group_0__0 ) ) | ( ruleAtomicExpression ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_STRING)||LA4_0==RULE_BOOLEAN||LA4_0==13||LA4_0==22||LA4_0==29) ) {
                alt4=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("941:1: rule__NotExpression__Alternatives : ( ( ( rule__NotExpression__Group_0__0 ) ) | ( ruleAtomicExpression ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:946:1: ( ( rule__NotExpression__Group_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:946:1: ( ( rule__NotExpression__Group_0__0 ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:947:1: ( rule__NotExpression__Group_0__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getNotExpressionAccess().getGroup_0()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:948:1: ( rule__NotExpression__Group_0__0 )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:948:2: rule__NotExpression__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__0_in_rule__NotExpression__Alternatives1914);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:952:6: ( ruleAtomicExpression )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:952:6: ( ruleAtomicExpression )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:953:1: ruleAtomicExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getNotExpressionAccess().getAtomicExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_rule__NotExpression__Alternatives1932);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:963:1: rule__AtomicExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleValuedObjectTestExpression ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ruleTextExpression ) );
    public final void rule__AtomicExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:967:1: ( ( ruleBooleanValue ) | ( ruleValuedObjectTestExpression ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ruleTextExpression ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt5=1;
                }
                break;
            case RULE_ID:
            case 13:
            case 22:
                {
                alt5=2;
                }
                break;
            case 29:
                {
                alt5=3;
                }
                break;
            case RULE_STRING:
                {
                alt5=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("963:1: rule__AtomicExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleValuedObjectTestExpression ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ruleTextExpression ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:968:1: ( ruleBooleanValue )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:968:1: ( ruleBooleanValue )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:969:1: ruleBooleanValue
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getBooleanValueParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanValue_in_rule__AtomicExpression__Alternatives1964);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:974:6: ( ruleValuedObjectTestExpression )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:974:6: ( ruleValuedObjectTestExpression )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:975:1: ruleValuedObjectTestExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getValuedObjectTestExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_rule__AtomicExpression__Alternatives1981);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:980:6: ( ( rule__AtomicExpression__Group_2__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:980:6: ( ( rule__AtomicExpression__Group_2__0 ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:981:1: ( rule__AtomicExpression__Group_2__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getGroup_2()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:982:1: ( rule__AtomicExpression__Group_2__0 )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:982:2: rule__AtomicExpression__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__0_in_rule__AtomicExpression__Alternatives1998);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:986:6: ( ruleTextExpression )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:986:6: ( ruleTextExpression )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:987:1: ruleTextExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_rule__AtomicExpression__Alternatives2016);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:997:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ( rule__AtomicValuedExpression__Group_2__0 ) ) | ( ( rule__AtomicValuedExpression__Group_3__0 ) ) | ( ruleAtomicExpression ) );
    public final void rule__AtomicValuedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1001:1: ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ( rule__AtomicValuedExpression__Group_2__0 ) ) | ( ( rule__AtomicValuedExpression__Group_3__0 ) ) | ( ruleAtomicExpression ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt6=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt6=2;
                }
                break;
            case 29:
                {
                int LA6_3 = input.LA(2);

                if ( (synpred10()) ) {
                    alt6=3;
                }
                else if ( (synpred11()) ) {
                    alt6=4;
                }
                else if ( (true) ) {
                    alt6=5;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("997:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ( rule__AtomicValuedExpression__Group_2__0 ) ) | ( ( rule__AtomicValuedExpression__Group_3__0 ) ) | ( ruleAtomicExpression ) );", 6, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_BOOLEAN:
            case 13:
            case 22:
                {
                alt6=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("997:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ( rule__AtomicValuedExpression__Group_2__0 ) ) | ( ( rule__AtomicValuedExpression__Group_3__0 ) ) | ( ruleAtomicExpression ) );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1002:1: ( ruleIntValue )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1002:1: ( ruleIntValue )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1003:1: ruleIntValue
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getIntValueParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIntValue_in_rule__AtomicValuedExpression__Alternatives2048);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1008:6: ( ruleFloatValue )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1008:6: ( ruleFloatValue )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1009:1: ruleFloatValue
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_rule__AtomicValuedExpression__Alternatives2065);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1014:6: ( ( rule__AtomicValuedExpression__Group_2__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1014:6: ( ( rule__AtomicValuedExpression__Group_2__0 ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1015:1: ( rule__AtomicValuedExpression__Group_2__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_2()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1016:1: ( rule__AtomicValuedExpression__Group_2__0 )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1016:2: rule__AtomicValuedExpression__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_2__0_in_rule__AtomicValuedExpression__Alternatives2082);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1020:6: ( ( rule__AtomicValuedExpression__Group_3__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1020:6: ( ( rule__AtomicValuedExpression__Group_3__0 ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1021:1: ( rule__AtomicValuedExpression__Group_3__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_3()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1022:1: ( rule__AtomicValuedExpression__Group_3__0 )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1022:2: rule__AtomicValuedExpression__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_3__0_in_rule__AtomicValuedExpression__Alternatives2100);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1026:6: ( ruleAtomicExpression )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1026:6: ( ruleAtomicExpression )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1027:1: ruleAtomicExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getAtomicExpressionParserRuleCall_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_rule__AtomicValuedExpression__Alternatives2118);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1037:1: rule__ValuedObjectTestExpression__Alternatives : ( ( ( rule__ValuedObjectTestExpression__Group_0__0 ) ) | ( ( rule__ValuedObjectTestExpression__Group_1__0 ) ) | ( ruleValuedObjectReference ) );
    public final void rule__ValuedObjectTestExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1041:1: ( ( ( rule__ValuedObjectTestExpression__Group_0__0 ) ) | ( ( rule__ValuedObjectTestExpression__Group_1__0 ) ) | ( ruleValuedObjectReference ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt7=1;
                }
                break;
            case 22:
                {
                alt7=2;
                }
                break;
            case RULE_ID:
                {
                alt7=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1037:1: rule__ValuedObjectTestExpression__Alternatives : ( ( ( rule__ValuedObjectTestExpression__Group_0__0 ) ) | ( ( rule__ValuedObjectTestExpression__Group_1__0 ) ) | ( ruleValuedObjectReference ) );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1042:1: ( ( rule__ValuedObjectTestExpression__Group_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1042:1: ( ( rule__ValuedObjectTestExpression__Group_0__0 ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1043:1: ( rule__ValuedObjectTestExpression__Group_0__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getGroup_0()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1044:1: ( rule__ValuedObjectTestExpression__Group_0__0 )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1044:2: rule__ValuedObjectTestExpression__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__0_in_rule__ValuedObjectTestExpression__Alternatives2150);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1048:6: ( ( rule__ValuedObjectTestExpression__Group_1__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1048:6: ( ( rule__ValuedObjectTestExpression__Group_1__0 ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1049:1: ( rule__ValuedObjectTestExpression__Group_1__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getGroup_1()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1050:1: ( rule__ValuedObjectTestExpression__Group_1__0 )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1050:2: rule__ValuedObjectTestExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_1__0_in_rule__ValuedObjectTestExpression__Alternatives2168);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1054:6: ( ruleValuedObjectReference )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1054:6: ( ruleValuedObjectReference )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1055:1: ruleValuedObjectReference
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getValuedObjectReferenceParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectReference_in_rule__ValuedObjectTestExpression__Alternatives2186);
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


    // $ANTLR start rule__CompareOperator__Alternatives
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1066:1: rule__CompareOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1070:1: ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt8=1;
                }
                break;
            case 24:
                {
                alt8=2;
                }
                break;
            case 25:
                {
                alt8=3;
                }
                break;
            case 26:
                {
                alt8=4;
                }
                break;
            case 27:
                {
                alt8=5;
                }
                break;
            case 28:
                {
                alt8=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1066:1: rule__CompareOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) );", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1071:1: ( ( '=' ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1071:1: ( ( '=' ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1072:1: ( '=' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1073:1: ( '=' )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1073:3: '='
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__CompareOperator__Alternatives2220); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1078:6: ( ( '<' ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1078:6: ( ( '<' ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1079:1: ( '<' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1080:1: ( '<' )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1080:3: '<'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__CompareOperator__Alternatives2241); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1085:6: ( ( '<=' ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1085:6: ( ( '<=' ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1086:1: ( '<=' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1087:1: ( '<=' )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1087:3: '<='
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_rule__CompareOperator__Alternatives2262); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1092:6: ( ( '>' ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1092:6: ( ( '>' ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1093:1: ( '>' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1094:1: ( '>' )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1094:3: '>'
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_rule__CompareOperator__Alternatives2283); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1099:6: ( ( '>=' ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1099:6: ( ( '>=' ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1100:1: ( '>=' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1101:1: ( '>=' )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1101:3: '>='
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_rule__CompareOperator__Alternatives2304); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1106:6: ( ( '<>' ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1106:6: ( ( '<>' ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1107:1: ( '<>' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_5()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1108:1: ( '<>' )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1108:3: '<>'
                    {
                    match(input,28,FollowSets000.FOLLOW_28_in_rule__CompareOperator__Alternatives2325); if (failed) return ;

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


    // $ANTLR start rule__OrExpression__Group__0
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1122:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1126:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1127:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__02360);
            rule__OrExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__02363);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1134:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1138:1: ( ( ruleAndExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1139:1: ( ruleAndExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1139:1: ( ruleAndExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1140:1: ruleAndExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_rule__OrExpression__Group__0__Impl2390);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1151:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1155:1: ( rule__OrExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1156:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__12419);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1162:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1166:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1167:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1167:1: ( ( rule__OrExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1168:1: ( rule__OrExpression__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1169:1: ( rule__OrExpression__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==14) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1169:2: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl2446);
            	    rule__OrExpression__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1183:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1187:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1188:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__02481);
            rule__OrExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__02484);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1195:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1199:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1200:1: ( () )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1200:1: ( () )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1201:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1202:1: ()
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1204:1: 
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1214:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1218:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1219:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__12542);
            rule__OrExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__2_in_rule__OrExpression__Group_1__12545);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1226:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1230:1: ( ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1231:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1231:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1232:1: ( rule__OrExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1233:1: ( rule__OrExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1233:2: rule__OrExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__OperatorAssignment_1_1_in_rule__OrExpression__Group_1__1__Impl2572);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1243:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1247:1: ( rule__OrExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1248:2: rule__OrExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__2__Impl_in_rule__OrExpression__Group_1__22602);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1254:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1258:1: ( ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1259:1: ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1259:1: ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1260:1: ( rule__OrExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1261:1: ( rule__OrExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1261:2: rule__OrExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__SubExpressionsAssignment_1_2_in_rule__OrExpression__Group_1__2__Impl2629);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1277:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1281:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1282:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__02665);
            rule__AndExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__02668);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1289:1: rule__AndExpression__Group__0__Impl : ( ruleCompareOperation ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1293:1: ( ( ruleCompareOperation ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1294:1: ( ruleCompareOperation )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1294:1: ( ruleCompareOperation )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1295:1: ruleCompareOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getCompareOperationParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_rule__AndExpression__Group__0__Impl2695);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1306:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1310:1: ( rule__AndExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1311:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__12724);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1317:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1321:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1322:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1322:1: ( ( rule__AndExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1323:1: ( rule__AndExpression__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1324:1: ( rule__AndExpression__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1324:2: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl2751);
            	    rule__AndExpression__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1338:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1342:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1343:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__02786);
            rule__AndExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__02789);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1350:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1354:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1355:1: ( () )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1355:1: ( () )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1356:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1357:1: ()
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1359:1: 
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1369:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1373:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1374:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__12847);
            rule__AndExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__2_in_rule__AndExpression__Group_1__12850);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1381:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1385:1: ( ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1386:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1386:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1387:1: ( rule__AndExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1388:1: ( rule__AndExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1388:2: rule__AndExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__OperatorAssignment_1_1_in_rule__AndExpression__Group_1__1__Impl2877);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1398:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1402:1: ( rule__AndExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1403:2: rule__AndExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__2__Impl_in_rule__AndExpression__Group_1__22907);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1409:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1413:1: ( ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1414:1: ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1414:1: ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1415:1: ( rule__AndExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1416:1: ( rule__AndExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1416:2: rule__AndExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__SubExpressionsAssignment_1_2_in_rule__AndExpression__Group_1__2__Impl2934);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1432:1: rule__CompareOperation__Group_0__0 : rule__CompareOperation__Group_0__0__Impl rule__CompareOperation__Group_0__1 ;
    public final void rule__CompareOperation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1436:1: ( rule__CompareOperation__Group_0__0__Impl rule__CompareOperation__Group_0__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1437:2: rule__CompareOperation__Group_0__0__Impl rule__CompareOperation__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0__0__Impl_in_rule__CompareOperation__Group_0__02970);
            rule__CompareOperation__Group_0__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0__1_in_rule__CompareOperation__Group_0__02973);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1444:1: rule__CompareOperation__Group_0__0__Impl : ( ruleNotOrValuedExpression ) ;
    public final void rule__CompareOperation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1448:1: ( ( ruleNotOrValuedExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1449:1: ( ruleNotOrValuedExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1449:1: ( ruleNotOrValuedExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1450:1: ruleNotOrValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_rule__CompareOperation__Group_0__0__Impl3000);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1461:1: rule__CompareOperation__Group_0__1 : rule__CompareOperation__Group_0__1__Impl ;
    public final void rule__CompareOperation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1465:1: ( rule__CompareOperation__Group_0__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1466:2: rule__CompareOperation__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0__1__Impl_in_rule__CompareOperation__Group_0__13029);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1472:1: rule__CompareOperation__Group_0__1__Impl : ( ( rule__CompareOperation__Group_0_1__0 ) ) ;
    public final void rule__CompareOperation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1476:1: ( ( ( rule__CompareOperation__Group_0_1__0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1477:1: ( ( rule__CompareOperation__Group_0_1__0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1477:1: ( ( rule__CompareOperation__Group_0_1__0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1478:1: ( rule__CompareOperation__Group_0_1__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGroup_0_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1479:1: ( rule__CompareOperation__Group_0_1__0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1479:2: rule__CompareOperation__Group_0_1__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__0_in_rule__CompareOperation__Group_0__1__Impl3056);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1493:1: rule__CompareOperation__Group_0_1__0 : rule__CompareOperation__Group_0_1__0__Impl rule__CompareOperation__Group_0_1__1 ;
    public final void rule__CompareOperation__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1497:1: ( rule__CompareOperation__Group_0_1__0__Impl rule__CompareOperation__Group_0_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1498:2: rule__CompareOperation__Group_0_1__0__Impl rule__CompareOperation__Group_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__0__Impl_in_rule__CompareOperation__Group_0_1__03090);
            rule__CompareOperation__Group_0_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__1_in_rule__CompareOperation__Group_0_1__03093);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1505:1: rule__CompareOperation__Group_0_1__0__Impl : ( () ) ;
    public final void rule__CompareOperation__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1509:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1510:1: ( () )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1510:1: ( () )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1511:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_0_1_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1512:1: ()
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1514:1: 
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1524:1: rule__CompareOperation__Group_0_1__1 : rule__CompareOperation__Group_0_1__1__Impl rule__CompareOperation__Group_0_1__2 ;
    public final void rule__CompareOperation__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1528:1: ( rule__CompareOperation__Group_0_1__1__Impl rule__CompareOperation__Group_0_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1529:2: rule__CompareOperation__Group_0_1__1__Impl rule__CompareOperation__Group_0_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__1__Impl_in_rule__CompareOperation__Group_0_1__13151);
            rule__CompareOperation__Group_0_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__2_in_rule__CompareOperation__Group_0_1__13154);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1536:1: rule__CompareOperation__Group_0_1__1__Impl : ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) ) ;
    public final void rule__CompareOperation__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1540:1: ( ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1541:1: ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1541:1: ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1542:1: ( rule__CompareOperation__OperatorAssignment_0_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorAssignment_0_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1543:1: ( rule__CompareOperation__OperatorAssignment_0_1_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1543:2: rule__CompareOperation__OperatorAssignment_0_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__OperatorAssignment_0_1_1_in_rule__CompareOperation__Group_0_1__1__Impl3181);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1553:1: rule__CompareOperation__Group_0_1__2 : rule__CompareOperation__Group_0_1__2__Impl ;
    public final void rule__CompareOperation__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1557:1: ( rule__CompareOperation__Group_0_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1558:2: rule__CompareOperation__Group_0_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__2__Impl_in_rule__CompareOperation__Group_0_1__23211);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1564:1: rule__CompareOperation__Group_0_1__2__Impl : ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) ) ;
    public final void rule__CompareOperation__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1568:1: ( ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1569:1: ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1569:1: ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1570:1: ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsAssignment_0_1_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1571:1: ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1571:2: rule__CompareOperation__SubExpressionsAssignment_0_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__SubExpressionsAssignment_0_1_2_in_rule__CompareOperation__Group_0_1__2__Impl3238);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1587:1: rule__AddExpression__Group__0 : rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 ;
    public final void rule__AddExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1591:1: ( rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1592:2: rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__0__Impl_in_rule__AddExpression__Group__03274);
            rule__AddExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__1_in_rule__AddExpression__Group__03277);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1599:1: rule__AddExpression__Group__0__Impl : ( ruleSubExpression ) ;
    public final void rule__AddExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1603:1: ( ( ruleSubExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1604:1: ( ruleSubExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1604:1: ( ruleSubExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1605:1: ruleSubExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_rule__AddExpression__Group__0__Impl3304);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1616:1: rule__AddExpression__Group__1 : rule__AddExpression__Group__1__Impl ;
    public final void rule__AddExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1620:1: ( rule__AddExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1621:2: rule__AddExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__1__Impl_in_rule__AddExpression__Group__13333);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1627:1: rule__AddExpression__Group__1__Impl : ( ( rule__AddExpression__Group_1__0 )* ) ;
    public final void rule__AddExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1631:1: ( ( ( rule__AddExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1632:1: ( ( rule__AddExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1632:1: ( ( rule__AddExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1633:1: ( rule__AddExpression__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1634:1: ( rule__AddExpression__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==17) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1634:2: rule__AddExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__0_in_rule__AddExpression__Group__1__Impl3360);
            	    rule__AddExpression__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1648:1: rule__AddExpression__Group_1__0 : rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 ;
    public final void rule__AddExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1652:1: ( rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1653:2: rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__0__Impl_in_rule__AddExpression__Group_1__03395);
            rule__AddExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__1_in_rule__AddExpression__Group_1__03398);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1660:1: rule__AddExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AddExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1664:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1665:1: ( () )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1665:1: ( () )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1666:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1667:1: ()
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1669:1: 
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1679:1: rule__AddExpression__Group_1__1 : rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2 ;
    public final void rule__AddExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1683:1: ( rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1684:2: rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__1__Impl_in_rule__AddExpression__Group_1__13456);
            rule__AddExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__2_in_rule__AddExpression__Group_1__13459);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1691:1: rule__AddExpression__Group_1__1__Impl : ( ( rule__AddExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AddExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1695:1: ( ( ( rule__AddExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1696:1: ( ( rule__AddExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1696:1: ( ( rule__AddExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1697:1: ( rule__AddExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1698:1: ( rule__AddExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1698:2: rule__AddExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__OperatorAssignment_1_1_in_rule__AddExpression__Group_1__1__Impl3486);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1708:1: rule__AddExpression__Group_1__2 : rule__AddExpression__Group_1__2__Impl ;
    public final void rule__AddExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1712:1: ( rule__AddExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1713:2: rule__AddExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__2__Impl_in_rule__AddExpression__Group_1__23516);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1719:1: rule__AddExpression__Group_1__2__Impl : ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__AddExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1723:1: ( ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1724:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1724:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1725:1: ( rule__AddExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1726:1: ( rule__AddExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1726:2: rule__AddExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__SubExpressionsAssignment_1_2_in_rule__AddExpression__Group_1__2__Impl3543);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1742:1: rule__SubExpression__Group__0 : rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 ;
    public final void rule__SubExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1746:1: ( rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1747:2: rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group__0__Impl_in_rule__SubExpression__Group__03579);
            rule__SubExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group__1_in_rule__SubExpression__Group__03582);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1754:1: rule__SubExpression__Group__0__Impl : ( ruleMultExpression ) ;
    public final void rule__SubExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1758:1: ( ( ruleMultExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1759:1: ( ruleMultExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1759:1: ( ruleMultExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1760:1: ruleMultExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_rule__SubExpression__Group__0__Impl3609);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1771:1: rule__SubExpression__Group__1 : rule__SubExpression__Group__1__Impl ;
    public final void rule__SubExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1775:1: ( rule__SubExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1776:2: rule__SubExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group__1__Impl_in_rule__SubExpression__Group__13638);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1782:1: rule__SubExpression__Group__1__Impl : ( ( rule__SubExpression__Group_1__0 )* ) ;
    public final void rule__SubExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1786:1: ( ( ( rule__SubExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1787:1: ( ( rule__SubExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1787:1: ( ( rule__SubExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1788:1: ( rule__SubExpression__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1789:1: ( rule__SubExpression__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1789:2: rule__SubExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__0_in_rule__SubExpression__Group__1__Impl3665);
            	    rule__SubExpression__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1803:1: rule__SubExpression__Group_1__0 : rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 ;
    public final void rule__SubExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1807:1: ( rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1808:2: rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__0__Impl_in_rule__SubExpression__Group_1__03700);
            rule__SubExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__1_in_rule__SubExpression__Group_1__03703);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1815:1: rule__SubExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__SubExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1819:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1820:1: ( () )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1820:1: ( () )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1821:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1822:1: ()
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1824:1: 
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1834:1: rule__SubExpression__Group_1__1 : rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2 ;
    public final void rule__SubExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1838:1: ( rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1839:2: rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__1__Impl_in_rule__SubExpression__Group_1__13761);
            rule__SubExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__2_in_rule__SubExpression__Group_1__13764);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1846:1: rule__SubExpression__Group_1__1__Impl : ( ( rule__SubExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__SubExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1850:1: ( ( ( rule__SubExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1851:1: ( ( rule__SubExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1851:1: ( ( rule__SubExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1852:1: ( rule__SubExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1853:1: ( rule__SubExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1853:2: rule__SubExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__OperatorAssignment_1_1_in_rule__SubExpression__Group_1__1__Impl3791);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1863:1: rule__SubExpression__Group_1__2 : rule__SubExpression__Group_1__2__Impl ;
    public final void rule__SubExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1867:1: ( rule__SubExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1868:2: rule__SubExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__2__Impl_in_rule__SubExpression__Group_1__23821);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1874:1: rule__SubExpression__Group_1__2__Impl : ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__SubExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1878:1: ( ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1879:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1879:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1880:1: ( rule__SubExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1881:1: ( rule__SubExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1881:2: rule__SubExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__SubExpressionsAssignment_1_2_in_rule__SubExpression__Group_1__2__Impl3848);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1897:1: rule__MultExpression__Group__0 : rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 ;
    public final void rule__MultExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1901:1: ( rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1902:2: rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__0__Impl_in_rule__MultExpression__Group__03884);
            rule__MultExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__1_in_rule__MultExpression__Group__03887);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1909:1: rule__MultExpression__Group__0__Impl : ( ruleModExpression ) ;
    public final void rule__MultExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1913:1: ( ( ruleModExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1914:1: ( ruleModExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1914:1: ( ruleModExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1915:1: ruleModExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getModExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_rule__MultExpression__Group__0__Impl3914);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1926:1: rule__MultExpression__Group__1 : rule__MultExpression__Group__1__Impl ;
    public final void rule__MultExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1930:1: ( rule__MultExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1931:2: rule__MultExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__1__Impl_in_rule__MultExpression__Group__13943);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1937:1: rule__MultExpression__Group__1__Impl : ( ( rule__MultExpression__Group_1__0 )* ) ;
    public final void rule__MultExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1941:1: ( ( ( rule__MultExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1942:1: ( ( rule__MultExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1942:1: ( ( rule__MultExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1943:1: ( rule__MultExpression__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1944:1: ( rule__MultExpression__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==19) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1944:2: rule__MultExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__0_in_rule__MultExpression__Group__1__Impl3970);
            	    rule__MultExpression__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1958:1: rule__MultExpression__Group_1__0 : rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 ;
    public final void rule__MultExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1962:1: ( rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1963:2: rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__0__Impl_in_rule__MultExpression__Group_1__04005);
            rule__MultExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__1_in_rule__MultExpression__Group_1__04008);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1970:1: rule__MultExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1974:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1975:1: ( () )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1975:1: ( () )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1976:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1977:1: ()
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1979:1: 
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1989:1: rule__MultExpression__Group_1__1 : rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2 ;
    public final void rule__MultExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1993:1: ( rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1994:2: rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__1__Impl_in_rule__MultExpression__Group_1__14066);
            rule__MultExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__2_in_rule__MultExpression__Group_1__14069);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2001:1: rule__MultExpression__Group_1__1__Impl : ( ( rule__MultExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2005:1: ( ( ( rule__MultExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2006:1: ( ( rule__MultExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2006:1: ( ( rule__MultExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2007:1: ( rule__MultExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2008:1: ( rule__MultExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2008:2: rule__MultExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__OperatorAssignment_1_1_in_rule__MultExpression__Group_1__1__Impl4096);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2018:1: rule__MultExpression__Group_1__2 : rule__MultExpression__Group_1__2__Impl ;
    public final void rule__MultExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2022:1: ( rule__MultExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2023:2: rule__MultExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__2__Impl_in_rule__MultExpression__Group_1__24126);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2029:1: rule__MultExpression__Group_1__2__Impl : ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__MultExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2033:1: ( ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2034:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2034:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2035:1: ( rule__MultExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2036:1: ( rule__MultExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2036:2: rule__MultExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__SubExpressionsAssignment_1_2_in_rule__MultExpression__Group_1__2__Impl4153);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2052:1: rule__ModExpression__Group__0 : rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1 ;
    public final void rule__ModExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2056:1: ( rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2057:2: rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group__0__Impl_in_rule__ModExpression__Group__04189);
            rule__ModExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group__1_in_rule__ModExpression__Group__04192);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2064:1: rule__ModExpression__Group__0__Impl : ( ruleAtomicValuedExpression ) ;
    public final void rule__ModExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2068:1: ( ( ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2069:1: ( ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2069:1: ( ruleAtomicValuedExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2070:1: ruleAtomicValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getAtomicValuedExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_rule__ModExpression__Group__0__Impl4219);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2081:1: rule__ModExpression__Group__1 : rule__ModExpression__Group__1__Impl ;
    public final void rule__ModExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2085:1: ( rule__ModExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2086:2: rule__ModExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group__1__Impl_in_rule__ModExpression__Group__14248);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2092:1: rule__ModExpression__Group__1__Impl : ( ( rule__ModExpression__Group_1__0 )? ) ;
    public final void rule__ModExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2096:1: ( ( ( rule__ModExpression__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2097:1: ( ( rule__ModExpression__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2097:1: ( ( rule__ModExpression__Group_1__0 )? )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2098:1: ( rule__ModExpression__Group_1__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2099:1: ( rule__ModExpression__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2099:2: rule__ModExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__0_in_rule__ModExpression__Group__1__Impl4275);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2113:1: rule__ModExpression__Group_1__0 : rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1 ;
    public final void rule__ModExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2117:1: ( rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2118:2: rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__0__Impl_in_rule__ModExpression__Group_1__04310);
            rule__ModExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__1_in_rule__ModExpression__Group_1__04313);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2125:1: rule__ModExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ModExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2129:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2130:1: ( () )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2130:1: ( () )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2131:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2132:1: ()
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2134:1: 
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2144:1: rule__ModExpression__Group_1__1 : rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2 ;
    public final void rule__ModExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2148:1: ( rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2149:2: rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__1__Impl_in_rule__ModExpression__Group_1__14371);
            rule__ModExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__2_in_rule__ModExpression__Group_1__14374);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2156:1: rule__ModExpression__Group_1__1__Impl : ( ( rule__ModExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ModExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2160:1: ( ( ( rule__ModExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2161:1: ( ( rule__ModExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2161:1: ( ( rule__ModExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2162:1: ( rule__ModExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2163:1: ( rule__ModExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2163:2: rule__ModExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__OperatorAssignment_1_1_in_rule__ModExpression__Group_1__1__Impl4401);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2173:1: rule__ModExpression__Group_1__2 : rule__ModExpression__Group_1__2__Impl ;
    public final void rule__ModExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2177:1: ( rule__ModExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2178:2: rule__ModExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__2__Impl_in_rule__ModExpression__Group_1__24431);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2184:1: rule__ModExpression__Group_1__2__Impl : ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__ModExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2188:1: ( ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2189:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2189:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2190:1: ( rule__ModExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2191:1: ( rule__ModExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2191:2: rule__ModExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__SubExpressionsAssignment_1_2_in_rule__ModExpression__Group_1__2__Impl4458);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2207:1: rule__NotExpression__Group_0__0 : rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1 ;
    public final void rule__NotExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2211:1: ( rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2212:2: rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__0__Impl_in_rule__NotExpression__Group_0__04494);
            rule__NotExpression__Group_0__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__1_in_rule__NotExpression__Group_0__04497);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2219:1: rule__NotExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__NotExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2223:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2224:1: ( () )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2224:1: ( () )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2225:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2226:1: ()
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2228:1: 
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2238:1: rule__NotExpression__Group_0__1 : rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2 ;
    public final void rule__NotExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2242:1: ( rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2243:2: rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__1__Impl_in_rule__NotExpression__Group_0__14555);
            rule__NotExpression__Group_0__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__2_in_rule__NotExpression__Group_0__14558);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2250:1: rule__NotExpression__Group_0__1__Impl : ( ( rule__NotExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__NotExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2254:1: ( ( ( rule__NotExpression__OperatorAssignment_0_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2255:1: ( ( rule__NotExpression__OperatorAssignment_0_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2255:1: ( ( rule__NotExpression__OperatorAssignment_0_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2256:1: ( rule__NotExpression__OperatorAssignment_0_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2257:1: ( rule__NotExpression__OperatorAssignment_0_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2257:2: rule__NotExpression__OperatorAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__OperatorAssignment_0_1_in_rule__NotExpression__Group_0__1__Impl4585);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2267:1: rule__NotExpression__Group_0__2 : rule__NotExpression__Group_0__2__Impl ;
    public final void rule__NotExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2271:1: ( rule__NotExpression__Group_0__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2272:2: rule__NotExpression__Group_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__2__Impl_in_rule__NotExpression__Group_0__24615);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2278:1: rule__NotExpression__Group_0__2__Impl : ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) ) ;
    public final void rule__NotExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2282:1: ( ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2283:1: ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2283:1: ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2284:1: ( rule__NotExpression__SubExpressionsAssignment_0_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubExpressionsAssignment_0_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2285:1: ( rule__NotExpression__SubExpressionsAssignment_0_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2285:2: rule__NotExpression__SubExpressionsAssignment_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__SubExpressionsAssignment_0_2_in_rule__NotExpression__Group_0__2__Impl4642);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2301:1: rule__AtomicExpression__Group_2__0 : rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 ;
    public final void rule__AtomicExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2305:1: ( rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2306:2: rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__0__Impl_in_rule__AtomicExpression__Group_2__04678);
            rule__AtomicExpression__Group_2__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__1_in_rule__AtomicExpression__Group_2__04681);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2313:1: rule__AtomicExpression__Group_2__0__Impl : ( '(' ) ;
    public final void rule__AtomicExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2317:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2318:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2318:1: ( '(' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2319:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__AtomicExpression__Group_2__0__Impl4709); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2332:1: rule__AtomicExpression__Group_2__1 : rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2 ;
    public final void rule__AtomicExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2336:1: ( rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2337:2: rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__1__Impl_in_rule__AtomicExpression__Group_2__14740);
            rule__AtomicExpression__Group_2__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__2_in_rule__AtomicExpression__Group_2__14743);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2344:1: rule__AtomicExpression__Group_2__1__Impl : ( ruleBooleanExpression ) ;
    public final void rule__AtomicExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2348:1: ( ( ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2349:1: ( ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2349:1: ( ruleBooleanExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2350:1: ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getBooleanExpressionParserRuleCall_2_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_rule__AtomicExpression__Group_2__1__Impl4770);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2361:1: rule__AtomicExpression__Group_2__2 : rule__AtomicExpression__Group_2__2__Impl ;
    public final void rule__AtomicExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2365:1: ( rule__AtomicExpression__Group_2__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2366:2: rule__AtomicExpression__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__2__Impl_in_rule__AtomicExpression__Group_2__24799);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2372:1: rule__AtomicExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__AtomicExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2376:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2377:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2377:1: ( ')' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2378:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__AtomicExpression__Group_2__2__Impl4827); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2397:1: rule__AtomicValuedExpression__Group_2__0 : rule__AtomicValuedExpression__Group_2__0__Impl rule__AtomicValuedExpression__Group_2__1 ;
    public final void rule__AtomicValuedExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2401:1: ( rule__AtomicValuedExpression__Group_2__0__Impl rule__AtomicValuedExpression__Group_2__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2402:2: rule__AtomicValuedExpression__Group_2__0__Impl rule__AtomicValuedExpression__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_2__0__Impl_in_rule__AtomicValuedExpression__Group_2__04864);
            rule__AtomicValuedExpression__Group_2__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_2__1_in_rule__AtomicValuedExpression__Group_2__04867);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2409:1: rule__AtomicValuedExpression__Group_2__0__Impl : ( '(' ) ;
    public final void rule__AtomicValuedExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2413:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2414:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2414:1: ( '(' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2415:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__AtomicValuedExpression__Group_2__0__Impl4895); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2428:1: rule__AtomicValuedExpression__Group_2__1 : rule__AtomicValuedExpression__Group_2__1__Impl rule__AtomicValuedExpression__Group_2__2 ;
    public final void rule__AtomicValuedExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2432:1: ( rule__AtomicValuedExpression__Group_2__1__Impl rule__AtomicValuedExpression__Group_2__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2433:2: rule__AtomicValuedExpression__Group_2__1__Impl rule__AtomicValuedExpression__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_2__1__Impl_in_rule__AtomicValuedExpression__Group_2__14926);
            rule__AtomicValuedExpression__Group_2__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_2__2_in_rule__AtomicValuedExpression__Group_2__14929);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2440:1: rule__AtomicValuedExpression__Group_2__1__Impl : ( ruleDivExpression ) ;
    public final void rule__AtomicValuedExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2444:1: ( ( ruleDivExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2445:1: ( ruleDivExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2445:1: ( ruleDivExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2446:1: ruleDivExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getDivExpressionParserRuleCall_2_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_rule__AtomicValuedExpression__Group_2__1__Impl4956);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2457:1: rule__AtomicValuedExpression__Group_2__2 : rule__AtomicValuedExpression__Group_2__2__Impl ;
    public final void rule__AtomicValuedExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2461:1: ( rule__AtomicValuedExpression__Group_2__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2462:2: rule__AtomicValuedExpression__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_2__2__Impl_in_rule__AtomicValuedExpression__Group_2__24985);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2468:1: rule__AtomicValuedExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__AtomicValuedExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2472:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2473:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2473:1: ( ')' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2474:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__AtomicValuedExpression__Group_2__2__Impl5013); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2493:1: rule__AtomicValuedExpression__Group_3__0 : rule__AtomicValuedExpression__Group_3__0__Impl rule__AtomicValuedExpression__Group_3__1 ;
    public final void rule__AtomicValuedExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2497:1: ( rule__AtomicValuedExpression__Group_3__0__Impl rule__AtomicValuedExpression__Group_3__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2498:2: rule__AtomicValuedExpression__Group_3__0__Impl rule__AtomicValuedExpression__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_3__0__Impl_in_rule__AtomicValuedExpression__Group_3__05050);
            rule__AtomicValuedExpression__Group_3__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_3__1_in_rule__AtomicValuedExpression__Group_3__05053);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2505:1: rule__AtomicValuedExpression__Group_3__0__Impl : ( '(' ) ;
    public final void rule__AtomicValuedExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2509:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2510:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2510:1: ( '(' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2511:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__AtomicValuedExpression__Group_3__0__Impl5081); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2524:1: rule__AtomicValuedExpression__Group_3__1 : rule__AtomicValuedExpression__Group_3__1__Impl rule__AtomicValuedExpression__Group_3__2 ;
    public final void rule__AtomicValuedExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2528:1: ( rule__AtomicValuedExpression__Group_3__1__Impl rule__AtomicValuedExpression__Group_3__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2529:2: rule__AtomicValuedExpression__Group_3__1__Impl rule__AtomicValuedExpression__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_3__1__Impl_in_rule__AtomicValuedExpression__Group_3__15112);
            rule__AtomicValuedExpression__Group_3__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_3__2_in_rule__AtomicValuedExpression__Group_3__15115);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2536:1: rule__AtomicValuedExpression__Group_3__1__Impl : ( ruleValuedExpression ) ;
    public final void rule__AtomicValuedExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2540:1: ( ( ruleValuedExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2541:1: ( ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2541:1: ( ruleValuedExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2542:1: ruleValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_3_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_rule__AtomicValuedExpression__Group_3__1__Impl5142);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2553:1: rule__AtomicValuedExpression__Group_3__2 : rule__AtomicValuedExpression__Group_3__2__Impl ;
    public final void rule__AtomicValuedExpression__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2557:1: ( rule__AtomicValuedExpression__Group_3__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2558:2: rule__AtomicValuedExpression__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_3__2__Impl_in_rule__AtomicValuedExpression__Group_3__25171);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2564:1: rule__AtomicValuedExpression__Group_3__2__Impl : ( ')' ) ;
    public final void rule__AtomicValuedExpression__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2568:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2569:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2569:1: ( ')' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2570:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__AtomicValuedExpression__Group_3__2__Impl5199); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2589:1: rule__DivExpression__Group__0 : rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1 ;
    public final void rule__DivExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2593:1: ( rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2594:2: rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group__0__Impl_in_rule__DivExpression__Group__05236);
            rule__DivExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group__1_in_rule__DivExpression__Group__05239);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2601:1: rule__DivExpression__Group__0__Impl : ( ruleAtomicValuedExpression ) ;
    public final void rule__DivExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2605:1: ( ( ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2606:1: ( ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2606:1: ( ruleAtomicValuedExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2607:1: ruleAtomicValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getAtomicValuedExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_rule__DivExpression__Group__0__Impl5266);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2618:1: rule__DivExpression__Group__1 : rule__DivExpression__Group__1__Impl rule__DivExpression__Group__2 ;
    public final void rule__DivExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2622:1: ( rule__DivExpression__Group__1__Impl rule__DivExpression__Group__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2623:2: rule__DivExpression__Group__1__Impl rule__DivExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group__1__Impl_in_rule__DivExpression__Group__15295);
            rule__DivExpression__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group__2_in_rule__DivExpression__Group__15298);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2630:1: rule__DivExpression__Group__1__Impl : ( () ) ;
    public final void rule__DivExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2634:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2635:1: ( () )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2635:1: ( () )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2636:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2637:1: ()
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2639:1: 
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2649:1: rule__DivExpression__Group__2 : rule__DivExpression__Group__2__Impl rule__DivExpression__Group__3 ;
    public final void rule__DivExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2653:1: ( rule__DivExpression__Group__2__Impl rule__DivExpression__Group__3 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2654:2: rule__DivExpression__Group__2__Impl rule__DivExpression__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group__2__Impl_in_rule__DivExpression__Group__25356);
            rule__DivExpression__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group__3_in_rule__DivExpression__Group__25359);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2661:1: rule__DivExpression__Group__2__Impl : ( ( rule__DivExpression__OperatorAssignment_2 ) ) ;
    public final void rule__DivExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2665:1: ( ( ( rule__DivExpression__OperatorAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2666:1: ( ( rule__DivExpression__OperatorAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2666:1: ( ( rule__DivExpression__OperatorAssignment_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2667:1: ( rule__DivExpression__OperatorAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorAssignment_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2668:1: ( rule__DivExpression__OperatorAssignment_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2668:2: rule__DivExpression__OperatorAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__OperatorAssignment_2_in_rule__DivExpression__Group__2__Impl5386);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2678:1: rule__DivExpression__Group__3 : rule__DivExpression__Group__3__Impl ;
    public final void rule__DivExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2682:1: ( rule__DivExpression__Group__3__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2683:2: rule__DivExpression__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group__3__Impl_in_rule__DivExpression__Group__35416);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2689:1: rule__DivExpression__Group__3__Impl : ( ( rule__DivExpression__SubExpressionsAssignment_3 ) ) ;
    public final void rule__DivExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2693:1: ( ( ( rule__DivExpression__SubExpressionsAssignment_3 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2694:1: ( ( rule__DivExpression__SubExpressionsAssignment_3 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2694:1: ( ( rule__DivExpression__SubExpressionsAssignment_3 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2695:1: ( rule__DivExpression__SubExpressionsAssignment_3 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getSubExpressionsAssignment_3()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2696:1: ( rule__DivExpression__SubExpressionsAssignment_3 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2696:2: rule__DivExpression__SubExpressionsAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__SubExpressionsAssignment_3_in_rule__DivExpression__Group__3__Impl5443);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2714:1: rule__ValuedObjectTestExpression__Group_0__0 : rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1 ;
    public final void rule__ValuedObjectTestExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2718:1: ( rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2719:2: rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__0__Impl_in_rule__ValuedObjectTestExpression__Group_0__05481);
            rule__ValuedObjectTestExpression__Group_0__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__1_in_rule__ValuedObjectTestExpression__Group_0__05484);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2726:1: rule__ValuedObjectTestExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2730:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2731:1: ( () )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2731:1: ( () )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2732:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2733:1: ()
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2735:1: 
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2745:1: rule__ValuedObjectTestExpression__Group_0__1 : rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2 ;
    public final void rule__ValuedObjectTestExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2749:1: ( rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2750:2: rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__1__Impl_in_rule__ValuedObjectTestExpression__Group_0__15542);
            rule__ValuedObjectTestExpression__Group_0__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__2_in_rule__ValuedObjectTestExpression__Group_0__15545);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2757:1: rule__ValuedObjectTestExpression__Group_0__1__Impl : ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2761:1: ( ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2762:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2762:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2763:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2764:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2764:2: rule__ValuedObjectTestExpression__OperatorAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__OperatorAssignment_0_1_in_rule__ValuedObjectTestExpression__Group_0__1__Impl5572);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2774:1: rule__ValuedObjectTestExpression__Group_0__2 : rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3 ;
    public final void rule__ValuedObjectTestExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2778:1: ( rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2779:2: rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__2__Impl_in_rule__ValuedObjectTestExpression__Group_0__25602);
            rule__ValuedObjectTestExpression__Group_0__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__3_in_rule__ValuedObjectTestExpression__Group_0__25605);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2786:1: rule__ValuedObjectTestExpression__Group_0__2__Impl : ( '(' ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2790:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2791:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2791:1: ( '(' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2792:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__ValuedObjectTestExpression__Group_0__2__Impl5633); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2805:1: rule__ValuedObjectTestExpression__Group_0__3 : rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4 ;
    public final void rule__ValuedObjectTestExpression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2809:1: ( rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2810:2: rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__3__Impl_in_rule__ValuedObjectTestExpression__Group_0__35664);
            rule__ValuedObjectTestExpression__Group_0__3__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__4_in_rule__ValuedObjectTestExpression__Group_0__35667);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2817:1: rule__ValuedObjectTestExpression__Group_0__3__Impl : ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2821:1: ( ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2822:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2822:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2823:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsAssignment_0_3()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2824:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2824:2: rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3_in_rule__ValuedObjectTestExpression__Group_0__3__Impl5694);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2834:1: rule__ValuedObjectTestExpression__Group_0__4 : rule__ValuedObjectTestExpression__Group_0__4__Impl ;
    public final void rule__ValuedObjectTestExpression__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2838:1: ( rule__ValuedObjectTestExpression__Group_0__4__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2839:2: rule__ValuedObjectTestExpression__Group_0__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__4__Impl_in_rule__ValuedObjectTestExpression__Group_0__45724);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2845:1: rule__ValuedObjectTestExpression__Group_0__4__Impl : ( ')' ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2849:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2850:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2850:1: ( ')' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2851:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__ValuedObjectTestExpression__Group_0__4__Impl5752); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2874:1: rule__ValuedObjectTestExpression__Group_1__0 : rule__ValuedObjectTestExpression__Group_1__0__Impl rule__ValuedObjectTestExpression__Group_1__1 ;
    public final void rule__ValuedObjectTestExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2878:1: ( rule__ValuedObjectTestExpression__Group_1__0__Impl rule__ValuedObjectTestExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2879:2: rule__ValuedObjectTestExpression__Group_1__0__Impl rule__ValuedObjectTestExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_1__0__Impl_in_rule__ValuedObjectTestExpression__Group_1__05793);
            rule__ValuedObjectTestExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_1__1_in_rule__ValuedObjectTestExpression__Group_1__05796);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2886:1: rule__ValuedObjectTestExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ValuedObjectTestExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2890:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2891:1: ( () )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2891:1: ( () )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2892:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorExpressionAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2893:1: ()
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2895:1: 
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2905:1: rule__ValuedObjectTestExpression__Group_1__1 : rule__ValuedObjectTestExpression__Group_1__1__Impl rule__ValuedObjectTestExpression__Group_1__2 ;
    public final void rule__ValuedObjectTestExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2909:1: ( rule__ValuedObjectTestExpression__Group_1__1__Impl rule__ValuedObjectTestExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2910:2: rule__ValuedObjectTestExpression__Group_1__1__Impl rule__ValuedObjectTestExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_1__1__Impl_in_rule__ValuedObjectTestExpression__Group_1__15854);
            rule__ValuedObjectTestExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_1__2_in_rule__ValuedObjectTestExpression__Group_1__15857);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2917:1: rule__ValuedObjectTestExpression__Group_1__1__Impl : ( ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2921:1: ( ( ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2922:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2922:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2923:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2924:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2924:2: rule__ValuedObjectTestExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__OperatorAssignment_1_1_in_rule__ValuedObjectTestExpression__Group_1__1__Impl5884);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2934:1: rule__ValuedObjectTestExpression__Group_1__2 : rule__ValuedObjectTestExpression__Group_1__2__Impl ;
    public final void rule__ValuedObjectTestExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2938:1: ( rule__ValuedObjectTestExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2939:2: rule__ValuedObjectTestExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_1__2__Impl_in_rule__ValuedObjectTestExpression__Group_1__25914);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2945:1: rule__ValuedObjectTestExpression__Group_1__2__Impl : ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2949:1: ( ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2950:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2950:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2951:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2952:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2952:2: rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2_in_rule__ValuedObjectTestExpression__Group_1__2__Impl5941);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2968:1: rule__TextExpression__Group__0 : rule__TextExpression__Group__0__Impl rule__TextExpression__Group__1 ;
    public final void rule__TextExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2972:1: ( rule__TextExpression__Group__0__Impl rule__TextExpression__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2973:2: rule__TextExpression__Group__0__Impl rule__TextExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group__0__Impl_in_rule__TextExpression__Group__05977);
            rule__TextExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group__1_in_rule__TextExpression__Group__05980);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2980:1: rule__TextExpression__Group__0__Impl : ( ( rule__TextExpression__CodeAssignment_0 ) ) ;
    public final void rule__TextExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2984:1: ( ( ( rule__TextExpression__CodeAssignment_0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2985:1: ( ( rule__TextExpression__CodeAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2985:1: ( ( rule__TextExpression__CodeAssignment_0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2986:1: ( rule__TextExpression__CodeAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getCodeAssignment_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2987:1: ( rule__TextExpression__CodeAssignment_0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2987:2: rule__TextExpression__CodeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__CodeAssignment_0_in_rule__TextExpression__Group__0__Impl6007);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2997:1: rule__TextExpression__Group__1 : rule__TextExpression__Group__1__Impl ;
    public final void rule__TextExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3001:1: ( rule__TextExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3002:2: rule__TextExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group__1__Impl_in_rule__TextExpression__Group__16037);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3008:1: rule__TextExpression__Group__1__Impl : ( ( rule__TextExpression__Group_1__0 )? ) ;
    public final void rule__TextExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3012:1: ( ( ( rule__TextExpression__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3013:1: ( ( rule__TextExpression__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3013:1: ( ( rule__TextExpression__Group_1__0 )? )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3014:1: ( rule__TextExpression__Group_1__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3015:1: ( rule__TextExpression__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3015:2: rule__TextExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group_1__0_in_rule__TextExpression__Group__1__Impl6064);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3029:1: rule__TextExpression__Group_1__0 : rule__TextExpression__Group_1__0__Impl rule__TextExpression__Group_1__1 ;
    public final void rule__TextExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3033:1: ( rule__TextExpression__Group_1__0__Impl rule__TextExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3034:2: rule__TextExpression__Group_1__0__Impl rule__TextExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group_1__0__Impl_in_rule__TextExpression__Group_1__06099);
            rule__TextExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group_1__1_in_rule__TextExpression__Group_1__06102);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3041:1: rule__TextExpression__Group_1__0__Impl : ( '(' ) ;
    public final void rule__TextExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3045:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3046:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3046:1: ( '(' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3047:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__TextExpression__Group_1__0__Impl6130); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3060:1: rule__TextExpression__Group_1__1 : rule__TextExpression__Group_1__1__Impl rule__TextExpression__Group_1__2 ;
    public final void rule__TextExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3064:1: ( rule__TextExpression__Group_1__1__Impl rule__TextExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3065:2: rule__TextExpression__Group_1__1__Impl rule__TextExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group_1__1__Impl_in_rule__TextExpression__Group_1__16161);
            rule__TextExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group_1__2_in_rule__TextExpression__Group_1__16164);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3072:1: rule__TextExpression__Group_1__1__Impl : ( ( rule__TextExpression__TypeAssignment_1_1 ) ) ;
    public final void rule__TextExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3076:1: ( ( ( rule__TextExpression__TypeAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3077:1: ( ( rule__TextExpression__TypeAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3077:1: ( ( rule__TextExpression__TypeAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3078:1: ( rule__TextExpression__TypeAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getTypeAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3079:1: ( rule__TextExpression__TypeAssignment_1_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3079:2: rule__TextExpression__TypeAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__TypeAssignment_1_1_in_rule__TextExpression__Group_1__1__Impl6191);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3089:1: rule__TextExpression__Group_1__2 : rule__TextExpression__Group_1__2__Impl ;
    public final void rule__TextExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3093:1: ( rule__TextExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3094:2: rule__TextExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group_1__2__Impl_in_rule__TextExpression__Group_1__26221);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3100:1: rule__TextExpression__Group_1__2__Impl : ( ')' ) ;
    public final void rule__TextExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3104:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3105:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3105:1: ( ')' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3106:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__TextExpression__Group_1__2__Impl6249); if (failed) return ;
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


    // $ANTLR start rule__OrExpression__OperatorAssignment_1_1
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3126:1: rule__OrExpression__OperatorAssignment_1_1 : ( ruleOrOperator ) ;
    public final void rule__OrExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3130:1: ( ( ruleOrOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3131:1: ( ruleOrOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3131:1: ( ruleOrOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3132:1: ruleOrOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrOperator_in_rule__OrExpression__OperatorAssignment_1_16291);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3141:1: rule__OrExpression__SubExpressionsAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3145:1: ( ( ruleAndExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3146:1: ( ruleAndExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3146:1: ( ruleAndExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3147:1: ruleAndExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getSubExpressionsAndExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_rule__OrExpression__SubExpressionsAssignment_1_26322);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3156:1: rule__AndExpression__OperatorAssignment_1_1 : ( ruleAndOperator ) ;
    public final void rule__AndExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3160:1: ( ( ruleAndOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3161:1: ( ruleAndOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3161:1: ( ruleAndOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3162:1: ruleAndOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndOperator_in_rule__AndExpression__OperatorAssignment_1_16353);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3171:1: rule__AndExpression__SubExpressionsAssignment_1_2 : ( ruleCompareOperation ) ;
    public final void rule__AndExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3175:1: ( ( ruleCompareOperation ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3176:1: ( ruleCompareOperation )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3176:1: ( ruleCompareOperation )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3177:1: ruleCompareOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_rule__AndExpression__SubExpressionsAssignment_1_26384);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3186:1: rule__CompareOperation__OperatorAssignment_0_1_1 : ( ruleCompareOperator ) ;
    public final void rule__CompareOperation__OperatorAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3190:1: ( ( ruleCompareOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3191:1: ( ruleCompareOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3191:1: ( ruleCompareOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3192:1: ruleCompareOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_0_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperator_in_rule__CompareOperation__OperatorAssignment_0_1_16415);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3201:1: rule__CompareOperation__SubExpressionsAssignment_0_1_2 : ( ruleNotOrValuedExpression ) ;
    public final void rule__CompareOperation__SubExpressionsAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3205:1: ( ( ruleNotOrValuedExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3206:1: ( ruleNotOrValuedExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3206:1: ( ruleNotOrValuedExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3207:1: ruleNotOrValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_0_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_rule__CompareOperation__SubExpressionsAssignment_0_1_26446);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3216:1: rule__AddExpression__OperatorAssignment_1_1 : ( ruleAddOperator ) ;
    public final void rule__AddExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3220:1: ( ( ruleAddOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3221:1: ( ruleAddOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3221:1: ( ruleAddOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3222:1: ruleAddOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddOperator_in_rule__AddExpression__OperatorAssignment_1_16477);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3231:1: rule__AddExpression__SubExpressionsAssignment_1_2 : ( ruleSubExpression ) ;
    public final void rule__AddExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3235:1: ( ( ruleSubExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3236:1: ( ruleSubExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3236:1: ( ruleSubExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3237:1: ruleSubExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_rule__AddExpression__SubExpressionsAssignment_1_26508);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3246:1: rule__SubExpression__OperatorAssignment_1_1 : ( ruleSubOperator ) ;
    public final void rule__SubExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3250:1: ( ( ruleSubOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3251:1: ( ruleSubOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3251:1: ( ruleSubOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3252:1: ruleSubOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubOperator_in_rule__SubExpression__OperatorAssignment_1_16539);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3261:1: rule__SubExpression__SubExpressionsAssignment_1_2 : ( ruleMultExpression ) ;
    public final void rule__SubExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3265:1: ( ( ruleMultExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3266:1: ( ruleMultExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3266:1: ( ruleMultExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3267:1: ruleMultExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_rule__SubExpression__SubExpressionsAssignment_1_26570);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3276:1: rule__MultExpression__OperatorAssignment_1_1 : ( ruleMultOperator ) ;
    public final void rule__MultExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3280:1: ( ( ruleMultOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3281:1: ( ruleMultOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3281:1: ( ruleMultOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3282:1: ruleMultOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultOperator_in_rule__MultExpression__OperatorAssignment_1_16601);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3291:1: rule__MultExpression__SubExpressionsAssignment_1_2 : ( ruleModExpression ) ;
    public final void rule__MultExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3295:1: ( ( ruleModExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3296:1: ( ruleModExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3296:1: ( ruleModExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3297:1: ruleModExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_rule__MultExpression__SubExpressionsAssignment_1_26632);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3306:1: rule__ModExpression__OperatorAssignment_1_1 : ( ruleModOperator ) ;
    public final void rule__ModExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3310:1: ( ( ruleModOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3311:1: ( ruleModOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3311:1: ( ruleModOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3312:1: ruleModOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModOperator_in_rule__ModExpression__OperatorAssignment_1_16663);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3321:1: rule__ModExpression__SubExpressionsAssignment_1_2 : ( ruleAtomicValuedExpression ) ;
    public final void rule__ModExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3325:1: ( ( ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3326:1: ( ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3326:1: ( ruleAtomicValuedExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3327:1: ruleAtomicValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_rule__ModExpression__SubExpressionsAssignment_1_26694);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3336:1: rule__NotExpression__OperatorAssignment_0_1 : ( ruleNotOperator ) ;
    public final void rule__NotExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3340:1: ( ( ruleNotOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3341:1: ( ruleNotOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3341:1: ( ruleNotOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3342:1: ruleNotOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotOperator_in_rule__NotExpression__OperatorAssignment_0_16725);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3351:1: rule__NotExpression__SubExpressionsAssignment_0_2 : ( ruleNotExpression ) ;
    public final void rule__NotExpression__SubExpressionsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3355:1: ( ( ruleNotExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3356:1: ( ruleNotExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3356:1: ( ruleNotExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3357:1: ruleNotExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_rule__NotExpression__SubExpressionsAssignment_0_26756);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3366:1: rule__DivExpression__OperatorAssignment_2 : ( ruleDivOperator ) ;
    public final void rule__DivExpression__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3370:1: ( ( ruleDivOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3371:1: ( ruleDivOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3371:1: ( ruleDivOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3372:1: ruleDivOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivOperator_in_rule__DivExpression__OperatorAssignment_26787);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3381:1: rule__DivExpression__SubExpressionsAssignment_3 : ( ruleAtomicValuedExpression ) ;
    public final void rule__DivExpression__SubExpressionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3385:1: ( ( ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3386:1: ( ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3386:1: ( ruleAtomicValuedExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3387:1: ruleAtomicValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_rule__DivExpression__SubExpressionsAssignment_36818);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3396:1: rule__ValuedObjectTestExpression__OperatorAssignment_0_1 : ( rulePreOperator ) ;
    public final void rule__ValuedObjectTestExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3400:1: ( ( rulePreOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3401:1: ( rulePreOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3401:1: ( rulePreOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3402:1: rulePreOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePreOperator_in_rule__ValuedObjectTestExpression__OperatorAssignment_0_16849);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3411:1: rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 : ( ruleValuedObjectTestExpression ) ;
    public final void rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3415:1: ( ( ruleValuedObjectTestExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3416:1: ( ruleValuedObjectTestExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3416:1: ( ruleValuedObjectTestExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3417:1: ruleValuedObjectTestExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_36880);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3426:1: rule__ValuedObjectTestExpression__OperatorAssignment_1_1 : ( ruleValueTestOperator ) ;
    public final void rule__ValuedObjectTestExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3430:1: ( ( ruleValueTestOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3431:1: ( ruleValueTestOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3431:1: ( ruleValueTestOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3432:1: ruleValueTestOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValueTestOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValueTestOperator_in_rule__ValuedObjectTestExpression__OperatorAssignment_1_16911);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3441:1: rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 : ( ruleValuedObjectReference ) ;
    public final void rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3445:1: ( ( ruleValuedObjectReference ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3446:1: ( ruleValuedObjectReference )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3446:1: ( ruleValuedObjectReference )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3447:1: ruleValuedObjectReference
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectReferenceParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObjectReference_in_rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_26942);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3456:1: rule__ValuedObjectReference__ValuedObjectAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ValuedObjectReference__ValuedObjectAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3460:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3461:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3461:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3462:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3463:1: ( RULE_ID )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3464:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ValuedObjectReference__ValuedObjectAssignment6977); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3475:1: rule__TextExpression__CodeAssignment_0 : ( RULE_STRING ) ;
    public final void rule__TextExpression__CodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3479:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3480:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3480:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3481:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getCodeSTRINGTerminalRuleCall_0_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__TextExpression__CodeAssignment_07012); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3490:1: rule__TextExpression__TypeAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__TextExpression__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3494:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3495:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3495:1: ( RULE_ID )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3496:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getTypeIDTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__TextExpression__TypeAssignment_1_17043); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3505:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3509:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3510:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3510:1: ( RULE_INT )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3511:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment7074); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3520:1: rule__FloatValue__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3524:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3525:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3525:1: ( RULE_FLOAT )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3526:1: RULE_FLOAT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueFloatTerminalRuleCall_0()); 
            }
            match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_rule__FloatValue__ValueAssignment7105); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3535:1: rule__BooleanValue__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3539:1: ( ( RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3540:1: ( RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3540:1: ( RULE_BOOLEAN )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3541:1: RULE_BOOLEAN
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueBooleanTerminalRuleCall_0()); 
            }
            match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_rule__BooleanValue__ValueAssignment7136); if (failed) return ;
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

    // $ANTLR start synpred1
    public final void synpred1_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:880:1: ( ( ruleBooleanExpression ) )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:880:1: ( ruleBooleanExpression )
        {
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:880:1: ( ruleBooleanExpression )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:881:1: ruleBooleanExpression
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall_0()); 
        }
        pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_synpred11766);
        ruleBooleanExpression();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:902:1: ( ( ( rule__CompareOperation__Group_0__0 ) ) )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:902:1: ( ( rule__CompareOperation__Group_0__0 ) )
        {
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:902:1: ( ( rule__CompareOperation__Group_0__0 ) )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:903:1: ( rule__CompareOperation__Group_0__0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getCompareOperationAccess().getGroup_0()); 
        }
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:904:1: ( rule__CompareOperation__Group_0__0 )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:904:2: rule__CompareOperation__Group_0__0
        {
        pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0__0_in_synpred21815);
        rule__CompareOperation__Group_0__0();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred3
    public final void synpred3_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:924:1: ( ( ruleValuedExpression ) )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:924:1: ( ruleValuedExpression )
        {
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:924:1: ( ruleValuedExpression )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:925:1: ruleValuedExpression
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
        }
        pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_synpred31865);
        ruleValuedExpression();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred3

    // $ANTLR start synpred10
    public final void synpred10_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1014:6: ( ( ( rule__AtomicValuedExpression__Group_2__0 ) ) )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1014:6: ( ( rule__AtomicValuedExpression__Group_2__0 ) )
        {
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1014:6: ( ( rule__AtomicValuedExpression__Group_2__0 ) )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1015:1: ( rule__AtomicValuedExpression__Group_2__0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_2()); 
        }
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1016:1: ( rule__AtomicValuedExpression__Group_2__0 )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1016:2: rule__AtomicValuedExpression__Group_2__0
        {
        pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_2__0_in_synpred102082);
        rule__AtomicValuedExpression__Group_2__0();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred10

    // $ANTLR start synpred11
    public final void synpred11_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1020:6: ( ( ( rule__AtomicValuedExpression__Group_3__0 ) ) )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1020:6: ( ( rule__AtomicValuedExpression__Group_3__0 ) )
        {
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1020:6: ( ( rule__AtomicValuedExpression__Group_3__0 ) )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1021:1: ( rule__AtomicValuedExpression__Group_3__0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_3()); 
        }
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1022:1: ( rule__AtomicValuedExpression__Group_3__0 )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1022:2: rule__AtomicValuedExpression__Group_3__0
        {
        pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_3__0_in_synpred112100);
        rule__AtomicValuedExpression__Group_3__0();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred11

    public final boolean synpred2() {
        backtracking++;
        int start = input.mark();
        try {
            synpred2_fragment(); // can never throw exception
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
    public final boolean synpred1() {
        backtracking++;
        int start = input.mark();
        try {
            synpred1_fragment(); // can never throw exception
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


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\u00df\uffff";
    static final String DFA1_eofS =
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
    static final String DFA1_minS =
        "\1\4\2\21\2\0\1\35\1\4\2\0\1\uffff\4\4\1\uffff\2\0\2\21\1\0\1\21"+
        "\1\35\1\4\4\21\1\0\1\21\1\35\1\4\4\21\1\0\1\21\1\35\1\4\4\21\1\0"+
        "\1\21\1\35\1\4\2\21\1\0\1\21\2\4\1\0\1\21\3\4\1\0\1\21\4\4\1\0\1"+
        "\21\1\4\1\36\2\21\1\0\1\21\1\35\1\4\2\21\1\36\2\21\1\0\1\21\1\35"+
        "\1\4\4\21\1\0\1\21\1\35\1\4\2\21\1\36\2\21\1\0\1\21\1\35\1\4\4\21"+
        "\1\0\1\21\1\35\1\4\4\21\1\0\1\21\1\35\1\4\2\21\1\36\1\21\1\0\1\21"+
        "\1\4\1\21\1\0\1\21\2\4\1\0\1\21\1\4\1\21\1\0\1\21\2\4\1\0\1\21\3"+
        "\4\1\0\1\21\1\4\1\21\2\36\2\21\1\0\1\21\1\35\1\4\2\21\2\36\2\21"+
        "\1\0\1\21\1\35\1\4\2\21\1\36\2\21\1\0\1\21\1\35\1\4\4\21\1\0\1\21"+
        "\1\35\1\4\2\21\1\36\2\21\1\0\1\21\1\4\2\21\1\0\1\21\1\4\1\21\1\0"+
        "\1\21\2\4\1\0\1\21\1\4\1\21\3\36\2\21\1\0\1\21\1\35\1\4\2\21\1\36"+
        "\3\21\1\0\1\21\1\4\1\21\1\36\1\21";
    static final String DFA1_maxS =
        "\1\35\2\34\2\0\1\35\1\4\2\0\1\uffff\4\35\1\uffff\2\0\2\34\1\0\1"+
        "\34\1\35\1\4\1\34\1\35\2\34\1\0\1\34\1\35\1\4\1\34\1\35\2\34\1\0"+
        "\1\34\1\35\1\4\1\34\1\35\2\34\1\0\1\34\1\35\1\4\1\34\1\35\1\0\1"+
        "\34\1\4\1\35\1\0\1\34\1\4\2\35\1\0\1\34\1\4\3\35\1\0\1\34\1\4\1"+
        "\36\2\34\1\0\1\34\1\35\1\4\1\34\1\35\1\36\2\34\1\0\1\34\1\35\1\4"+
        "\1\34\1\35\2\34\1\0\1\34\1\35\1\4\1\34\1\35\1\36\2\34\1\0\1\34\1"+
        "\35\1\4\1\34\1\35\2\34\1\0\1\34\1\35\1\4\1\34\1\35\2\34\1\0\1\34"+
        "\1\35\1\4\1\34\1\35\1\36\1\34\1\0\1\34\1\4\1\34\1\0\1\34\1\4\1\35"+
        "\1\0\1\34\1\4\1\34\1\0\1\34\1\4\1\35\1\0\1\34\1\4\2\35\1\0\1\34"+
        "\1\4\1\34\2\36\2\34\1\0\1\34\1\35\1\4\1\34\1\35\2\36\2\34\1\0\1"+
        "\34\1\35\1\4\1\34\1\35\1\36\2\34\1\0\1\34\1\35\1\4\1\34\1\35\2\34"+
        "\1\0\1\34\1\35\1\4\1\34\1\35\1\36\2\34\1\0\1\34\1\4\2\34\1\0\1\34"+
        "\1\4\1\34\1\0\1\34\1\4\1\35\1\0\1\34\1\4\1\34\3\36\2\34\1\0\1\34"+
        "\1\35\1\4\1\34\1\35\1\36\3\34\1\0\1\34\1\4\1\34\1\36\1\34";
    static final String DFA1_acceptS =
        "\11\uffff\1\1\4\uffff\1\2\u00d0\uffff";
    static final String DFA1_specialS =
        "\3\uffff\1\31\1\30\2\uffff\1\16\1\43\6\uffff\1\36\1\17\2\uffff\1"+
        "\14\7\uffff\1\1\7\uffff\1\2\7\uffff\1\34\5\uffff\1\22\3\uffff\1"+
        "\6\4\uffff\1\5\5\uffff\1\4\5\uffff\1\0\10\uffff\1\40\7\uffff\1\37"+
        "\10\uffff\1\33\7\uffff\1\23\7\uffff\1\15\7\uffff\1\24\3\uffff\1"+
        "\7\3\uffff\1\25\3\uffff\1\26\3\uffff\1\10\4\uffff\1\11\7\uffff\1"+
        "\27\11\uffff\1\41\10\uffff\1\35\7\uffff\1\42\10\uffff\1\12\4\uffff"+
        "\1\13\3\uffff\1\21\3\uffff\1\20\10\uffff\1\32\11\uffff\1\3\5\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\7\1\10\1\1\1\2\1\4\4\uffff\1\5\2\uffff\1\11\5\uffff\1\6\6"+
            "\uffff\1\3",
            "\1\15\1\14\1\13\1\12\2\uffff\6\11",
            "\1\15\1\14\1\13\1\12\2\uffff\6\11",
            "\1\uffff",
            "\1\uffff",
            "\1\17",
            "\1\20",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\27\1\30\1\21\1\22\1\24\4\uffff\1\25\10\uffff\1\26\6\uffff"+
            "\1\23",
            "\1\37\1\40\1\31\1\32\1\34\4\uffff\1\35\10\uffff\1\36\6\uffff"+
            "\1\33",
            "\1\47\1\50\1\41\1\42\1\44\4\uffff\1\45\10\uffff\1\46\6\uffff"+
            "\1\43",
            "\1\57\1\60\1\51\1\52\1\54\4\uffff\1\55\10\uffff\1\56\6\uffff"+
            "\1\53",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\15\1\14\1\13\3\uffff\6\11",
            "\1\15\1\14\1\13\3\uffff\6\11",
            "\1\uffff",
            "\1\15\1\14\1\13\3\uffff\6\11",
            "\1\61",
            "\1\62",
            "\1\15\1\14\1\13\3\uffff\6\11",
            "\1\15\1\14\1\13\3\uffff\6\11\1\63",
            "\1\15\1\14\1\13\1\64\2\uffff\6\11",
            "\1\15\1\14\1\13\1\64\2\uffff\6\11",
            "\1\uffff",
            "\1\15\1\14\1\13\1\64\2\uffff\6\11",
            "\1\65",
            "\1\66",
            "\1\15\1\14\1\13\1\64\2\uffff\6\11",
            "\1\15\1\14\1\13\1\64\2\uffff\6\11\1\67",
            "\1\15\1\14\1\71\1\70\2\uffff\6\11",
            "\1\15\1\14\1\71\1\70\2\uffff\6\11",
            "\1\uffff",
            "\1\15\1\14\1\71\1\70\2\uffff\6\11",
            "\1\72",
            "\1\73",
            "\1\15\1\14\1\71\1\70\2\uffff\6\11",
            "\1\15\1\14\1\71\1\70\2\uffff\6\11\1\74",
            "\1\15\1\77\1\76\1\75\2\uffff\6\11",
            "\1\15\1\77\1\76\1\75\2\uffff\6\11",
            "\1\uffff",
            "\1\15\1\77\1\76\1\75\2\uffff\6\11",
            "\1\100",
            "\1\101",
            "\1\15\1\77\1\76\1\75\2\uffff\6\11",
            "\1\15\1\77\1\76\1\75\2\uffff\6\11\1\102",
            "\1\uffff",
            "\1\15\1\14\1\13\3\uffff\6\11",
            "\1\103",
            "\1\112\1\113\1\104\1\105\1\107\4\uffff\1\110\10\uffff\1\111"+
            "\6\uffff\1\106",
            "\1\uffff",
            "\1\15\1\14\1\13\1\64\2\uffff\6\11",
            "\1\114",
            "\1\123\1\124\1\115\1\116\1\120\4\uffff\1\121\10\uffff\1\122"+
            "\6\uffff\1\117",
            "\1\133\1\134\1\125\1\126\1\130\4\uffff\1\131\10\uffff\1\132"+
            "\6\uffff\1\127",
            "\1\uffff",
            "\1\15\1\14\1\71\1\70\2\uffff\6\11",
            "\1\135",
            "\1\144\1\145\1\136\1\137\1\141\4\uffff\1\142\10\uffff\1\143"+
            "\6\uffff\1\140",
            "\1\154\1\155\1\146\1\147\1\151\4\uffff\1\152\10\uffff\1\153"+
            "\6\uffff\1\150",
            "\1\164\1\165\1\156\1\157\1\161\4\uffff\1\162\10\uffff\1\163"+
            "\6\uffff\1\160",
            "\1\uffff",
            "\1\15\1\77\1\76\1\75\2\uffff\6\11",
            "\1\166",
            "\1\167",
            "\1\15\1\14\1\13\3\uffff\6\11",
            "\1\15\1\14\1\13\3\uffff\6\11",
            "\1\uffff",
            "\1\15\1\14\1\13\3\uffff\6\11",
            "\1\170",
            "\1\171",
            "\1\15\1\14\1\13\3\uffff\6\11",
            "\1\15\1\14\1\13\3\uffff\6\11\1\172",
            "\1\173",
            "\1\15\1\14\1\71\3\uffff\6\11",
            "\1\15\1\14\1\71\3\uffff\6\11",
            "\1\uffff",
            "\1\15\1\14\1\71\3\uffff\6\11",
            "\1\174",
            "\1\175",
            "\1\15\1\14\1\71\3\uffff\6\11",
            "\1\15\1\14\1\71\3\uffff\6\11\1\176",
            "\1\15\1\14\1\71\1\177\2\uffff\6\11",
            "\1\15\1\14\1\71\1\177\2\uffff\6\11",
            "\1\uffff",
            "\1\15\1\14\1\71\1\177\2\uffff\6\11",
            "\1\u0080",
            "\1\u0081",
            "\1\15\1\14\1\71\1\177\2\uffff\6\11",
            "\1\15\1\14\1\71\1\177\2\uffff\6\11\1\u0082",
            "\1\u0083",
            "\1\15\1\77\1\76\3\uffff\6\11",
            "\1\15\1\77\1\76\3\uffff\6\11",
            "\1\uffff",
            "\1\15\1\77\1\76\3\uffff\6\11",
            "\1\u0084",
            "\1\u0085",
            "\1\15\1\77\1\76\3\uffff\6\11",
            "\1\15\1\77\1\76\3\uffff\6\11\1\u0086",
            "\1\15\1\77\1\76\1\u0087\2\uffff\6\11",
            "\1\15\1\77\1\76\1\u0087\2\uffff\6\11",
            "\1\uffff",
            "\1\15\1\77\1\76\1\u0087\2\uffff\6\11",
            "\1\u0088",
            "\1\u0089",
            "\1\15\1\77\1\76\1\u0087\2\uffff\6\11",
            "\1\15\1\77\1\76\1\u0087\2\uffff\6\11\1\u008a",
            "\1\15\1\77\1\u008c\1\u008b\2\uffff\6\11",
            "\1\15\1\77\1\u008c\1\u008b\2\uffff\6\11",
            "\1\uffff",
            "\1\15\1\77\1\u008c\1\u008b\2\uffff\6\11",
            "\1\u008d",
            "\1\u008e",
            "\1\15\1\77\1\u008c\1\u008b\2\uffff\6\11",
            "\1\15\1\77\1\u008c\1\u008b\2\uffff\6\11\1\u008f",
            "\1\u0090",
            "\1\15\1\14\1\13\3\uffff\6\11",
            "\1\uffff",
            "\1\15\1\14\1\13\3\uffff\6\11",
            "\1\u0091",
            "\1\15\1\14\1\13\1\64\2\uffff\6\11",
            "\1\uffff",
            "\1\15\1\14\1\71\3\uffff\6\11",
            "\1\u0092",
            "\1\u0099\1\u009a\1\u0093\1\u0094\1\u0096\4\uffff\1\u0097\10"+
            "\uffff\1\u0098\6\uffff\1\u0095",
            "\1\uffff",
            "\1\15\1\14\1\71\1\177\2\uffff\6\11",
            "\1\u009b",
            "\1\15\1\14\1\71\1\70\2\uffff\6\11",
            "\1\uffff",
            "\1\15\1\77\1\76\3\uffff\6\11",
            "\1\u009c",
            "\1\u00a3\1\u00a4\1\u009d\1\u009e\1\u00a0\4\uffff\1\u00a1\10"+
            "\uffff\1\u00a2\6\uffff\1\u009f",
            "\1\uffff",
            "\1\15\1\77\1\76\1\u0087\2\uffff\6\11",
            "\1\u00a5",
            "\1\u00ac\1\u00ad\1\u00a6\1\u00a7\1\u00a9\4\uffff\1\u00aa\10"+
            "\uffff\1\u00ab\6\uffff\1\u00a8",
            "\1\u00b4\1\u00b5\1\u00ae\1\u00af\1\u00b1\4\uffff\1\u00b2\10"+
            "\uffff\1\u00b3\6\uffff\1\u00b0",
            "\1\uffff",
            "\1\15\1\77\1\u008c\1\u008b\2\uffff\6\11",
            "\1\u00b6",
            "\1\15\1\77\1\76\1\75\2\uffff\6\11",
            "\1\u00b7",
            "\1\u00b8",
            "\1\15\1\14\1\71\3\uffff\6\11",
            "\1\15\1\14\1\71\3\uffff\6\11",
            "\1\uffff",
            "\1\15\1\14\1\71\3\uffff\6\11",
            "\1\u00b9",
            "\1\u00ba",
            "\1\15\1\14\1\71\3\uffff\6\11",
            "\1\15\1\14\1\71\3\uffff\6\11\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\15\1\77\1\76\3\uffff\6\11",
            "\1\15\1\77\1\76\3\uffff\6\11",
            "\1\uffff",
            "\1\15\1\77\1\76\3\uffff\6\11",
            "\1\u00be",
            "\1\u00bf",
            "\1\15\1\77\1\76\3\uffff\6\11",
            "\1\15\1\77\1\76\3\uffff\6\11\1\u00c0",
            "\1\u00c1",
            "\1\15\1\77\1\u008c\3\uffff\6\11",
            "\1\15\1\77\1\u008c\3\uffff\6\11",
            "\1\uffff",
            "\1\15\1\77\1\u008c\3\uffff\6\11",
            "\1\u00c2",
            "\1\u00c3",
            "\1\15\1\77\1\u008c\3\uffff\6\11",
            "\1\15\1\77\1\u008c\3\uffff\6\11\1\u00c4",
            "\1\15\1\77\1\u008c\1\u00c5\2\uffff\6\11",
            "\1\15\1\77\1\u008c\1\u00c5\2\uffff\6\11",
            "\1\uffff",
            "\1\15\1\77\1\u008c\1\u00c5\2\uffff\6\11",
            "\1\u00c6",
            "\1\u00c7",
            "\1\15\1\77\1\u008c\1\u00c5\2\uffff\6\11",
            "\1\15\1\77\1\u008c\1\u00c5\2\uffff\6\11\1\u00c8",
            "\1\u00c9",
            "\1\15\1\14\1\13\3\uffff\6\11",
            "\1\15\1\14\1\71\3\uffff\6\11",
            "\1\uffff",
            "\1\15\1\14\1\71\3\uffff\6\11",
            "\1\u00ca",
            "\1\15\1\14\1\71\1\177\2\uffff\6\11",
            "\1\15\1\77\1\76\3\uffff\6\11",
            "\1\uffff",
            "\1\15\1\77\1\76\3\uffff\6\11",
            "\1\u00cb",
            "\1\15\1\77\1\76\1\u0087\2\uffff\6\11",
            "\1\uffff",
            "\1\15\1\77\1\u008c\3\uffff\6\11",
            "\1\u00cc",
            "\1\u00d3\1\u00d4\1\u00cd\1\u00ce\1\u00d0\4\uffff\1\u00d1\10"+
            "\uffff\1\u00d2\6\uffff\1\u00cf",
            "\1\uffff",
            "\1\15\1\77\1\u008c\1\u00c5\2\uffff\6\11",
            "\1\u00d5",
            "\1\15\1\77\1\u008c\1\u008b\2\uffff\6\11",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\15\1\77\1\u008c\3\uffff\6\11",
            "\1\15\1\77\1\u008c\3\uffff\6\11",
            "\1\uffff",
            "\1\15\1\77\1\u008c\3\uffff\6\11",
            "\1\u00d9",
            "\1\u00da",
            "\1\15\1\77\1\u008c\3\uffff\6\11",
            "\1\15\1\77\1\u008c\3\uffff\6\11\1\u00db",
            "\1\u00dc",
            "\1\15\1\14\1\71\3\uffff\6\11",
            "\1\15\1\77\1\76\3\uffff\6\11",
            "\1\15\1\77\1\u008c\3\uffff\6\11",
            "\1\uffff",
            "\1\15\1\77\1\u008c\3\uffff\6\11",
            "\1\u00dd",
            "\1\15\1\77\1\u008c\1\u00c5\2\uffff\6\11",
            "\1\u00de",
            "\1\15\1\77\1\u008c\3\uffff\6\11"
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "875:1: rule__Expression__Alternatives : ( ( ruleBooleanExpression ) | ( ruleValuedExpression ) );";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_70 = input.LA(1);

                         
                        int index1_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_70);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_27 = input.LA(1);

                         
                        int index1_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_27);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_35 = input.LA(1);

                         
                        int index1_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_35);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA1_217 = input.LA(1);

                         
                        int index1_217 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_217);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA1_64 = input.LA(1);

                         
                        int index1_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_64);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA1_58 = input.LA(1);

                         
                        int index1_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_58);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA1_53 = input.LA(1);

                         
                        int index1_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_53);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA1_124 = input.LA(1);

                         
                        int index1_124 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_124);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA1_136 = input.LA(1);

                         
                        int index1_136 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_136);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA1_141 = input.LA(1);

                         
                        int index1_141 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_141);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA1_185 = input.LA(1);

                         
                        int index1_185 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_185);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA1_190 = input.LA(1);

                         
                        int index1_190 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_190);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA1_19 = input.LA(1);

                         
                        int index1_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_19);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA1_112 = input.LA(1);

                         
                        int index1_112 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_112);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA1_7 = input.LA(1);

                         
                        int index1_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_7);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA1_16 = input.LA(1);

                         
                        int index1_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA1_198 = input.LA(1);

                         
                        int index1_198 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_198);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA1_194 = input.LA(1);

                         
                        int index1_194 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_194);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA1_49 = input.LA(1);

                         
                        int index1_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_49);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA1_104 = input.LA(1);

                         
                        int index1_104 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_104);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA1_120 = input.LA(1);

                         
                        int index1_120 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_120);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA1_128 = input.LA(1);

                         
                        int index1_128 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_128);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA1_132 = input.LA(1);

                         
                        int index1_132 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_132);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA1_149 = input.LA(1);

                         
                        int index1_149 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_149);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA1_4 = input.LA(1);

                         
                        int index1_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_4);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA1_3 = input.LA(1);

                         
                        int index1_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_3);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA1_207 = input.LA(1);

                         
                        int index1_207 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_207);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA1_96 = input.LA(1);

                         
                        int index1_96 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_96);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA1_43 = input.LA(1);

                         
                        int index1_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_43);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA1_168 = input.LA(1);

                         
                        int index1_168 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_168);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA1_15 = input.LA(1);

                         
                        int index1_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_15);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA1_87 = input.LA(1);

                         
                        int index1_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_87);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA1_79 = input.LA(1);

                         
                        int index1_79 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_79);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA1_159 = input.LA(1);

                         
                        int index1_159 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_159);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA1_176 = input.LA(1);

                         
                        int index1_176 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_176);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA1_8 = input.LA(1);

                         
                        int index1_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 1, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression67 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression74 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Alternatives_in_ruleExpression100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression127 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_ruleBooleanExpression160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression186 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group__0_in_ruleOrExpression219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression246 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group__0_in_ruleAndExpression279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation306 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Alternatives_in_ruleCompareOperation339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression366 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNotOrValuedExpression373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotOrValuedExpression__Alternatives_in_ruleNotOrValuedExpression399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression426 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedExpression433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_ruleValuedExpression459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_entryRuleAddExpression485 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAddExpression492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__0_in_ruleAddExpression518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubExpression_in_entryRuleSubExpression545 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubExpression552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group__0_in_ruleSubExpression578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_entryRuleMultExpression605 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultExpression612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__0_in_ruleMultExpression638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_entryRuleModExpression665 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModExpression672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group__0_in_ruleModExpression698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_entryRuleNotExpression725 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNotExpression732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__Alternatives_in_ruleNotExpression758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression785 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpression792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Alternatives_in_ruleAtomicExpression818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression845 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicValuedExpression852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Alternatives_in_ruleAtomicValuedExpression878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivExpression_in_entryRuleDivExpression905 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDivExpression912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group__0_in_ruleDivExpression938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression965 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectTestExpression972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Alternatives_in_ruleValuedObjectTestExpression998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference1025 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectReference1032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectReference__ValuedObjectAssignment_in_ruleValuedObjectReference1058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_entryRuleTextExpression1085 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextExpression1092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group__0_in_ruleTextExpression1118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue1145 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntValue1152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue1178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue1205 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue1212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue1238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1265 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue1272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__ValueAssignment_in_ruleBooleanValue1298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperator__Alternatives_in_ruleCompareOperator1337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rulePreOperator1374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleOrOperator1413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleAndOperator1452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleNotOperator1491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleAddOperator1530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleSubOperator1569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleMultOperator1608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleModOperator1647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleDivOperator1686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleValueTestOperator1725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__Expression__Alternatives1766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_rule__Expression__Alternatives1783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0__0_in_rule__CompareOperation__Alternatives1815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_rule__CompareOperation__Alternatives1833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_rule__NotOrValuedExpression__Alternatives1865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_rule__NotOrValuedExpression__Alternatives1882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__0_in_rule__NotExpression__Alternatives1914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_rule__NotExpression__Alternatives1932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanValue_in_rule__AtomicExpression__Alternatives1964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_rule__AtomicExpression__Alternatives1981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__0_in_rule__AtomicExpression__Alternatives1998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_rule__AtomicExpression__Alternatives2016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValue_in_rule__AtomicValuedExpression__Alternatives2048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_rule__AtomicValuedExpression__Alternatives2065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__0_in_rule__AtomicValuedExpression__Alternatives2082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_3__0_in_rule__AtomicValuedExpression__Alternatives2100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_rule__AtomicValuedExpression__Alternatives2118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__0_in_rule__ValuedObjectTestExpression__Alternatives2150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_1__0_in_rule__ValuedObjectTestExpression__Alternatives2168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectReference_in_rule__ValuedObjectTestExpression__Alternatives2186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__CompareOperator__Alternatives2220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__CompareOperator__Alternatives2241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__CompareOperator__Alternatives2262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__CompareOperator__Alternatives2283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__CompareOperator__Alternatives2304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__CompareOperator__Alternatives2325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__02360 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__02363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__Group__0__Impl2390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__12419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl2446 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__02481 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__02484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__12542 = new BitSet(new long[]{0x00000000204121F0L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__2_in_rule__OrExpression__Group_1__12545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__OperatorAssignment_1_1_in_rule__OrExpression__Group_1__1__Impl2572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__2__Impl_in_rule__OrExpression__Group_1__22602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__SubExpressionsAssignment_1_2_in_rule__OrExpression__Group_1__2__Impl2629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__02665 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__02668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_rule__AndExpression__Group__0__Impl2695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__12724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl2751 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__02786 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__02789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__12847 = new BitSet(new long[]{0x00000000204121F0L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__2_in_rule__AndExpression__Group_1__12850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__OperatorAssignment_1_1_in_rule__AndExpression__Group_1__1__Impl2877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__2__Impl_in_rule__AndExpression__Group_1__22907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__SubExpressionsAssignment_1_2_in_rule__AndExpression__Group_1__2__Impl2934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0__0__Impl_in_rule__CompareOperation__Group_0__02970 = new BitSet(new long[]{0x000000001F800000L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0__1_in_rule__CompareOperation__Group_0__02973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_rule__CompareOperation__Group_0__0__Impl3000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0__1__Impl_in_rule__CompareOperation__Group_0__13029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__0_in_rule__CompareOperation__Group_0__1__Impl3056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__0__Impl_in_rule__CompareOperation__Group_0_1__03090 = new BitSet(new long[]{0x000000001F800000L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__1_in_rule__CompareOperation__Group_0_1__03093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__1__Impl_in_rule__CompareOperation__Group_0_1__13151 = new BitSet(new long[]{0x00000000204121F0L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__2_in_rule__CompareOperation__Group_0_1__13154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__OperatorAssignment_0_1_1_in_rule__CompareOperation__Group_0_1__1__Impl3181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__2__Impl_in_rule__CompareOperation__Group_0_1__23211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__SubExpressionsAssignment_0_1_2_in_rule__CompareOperation__Group_0_1__2__Impl3238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__0__Impl_in_rule__AddExpression__Group__03274 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__1_in_rule__AddExpression__Group__03277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubExpression_in_rule__AddExpression__Group__0__Impl3304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__1__Impl_in_rule__AddExpression__Group__13333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__0_in_rule__AddExpression__Group__1__Impl3360 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__0__Impl_in_rule__AddExpression__Group_1__03395 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__1_in_rule__AddExpression__Group_1__03398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__1__Impl_in_rule__AddExpression__Group_1__13456 = new BitSet(new long[]{0x00000000204021F0L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__2_in_rule__AddExpression__Group_1__13459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__OperatorAssignment_1_1_in_rule__AddExpression__Group_1__1__Impl3486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__2__Impl_in_rule__AddExpression__Group_1__23516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__SubExpressionsAssignment_1_2_in_rule__AddExpression__Group_1__2__Impl3543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group__0__Impl_in_rule__SubExpression__Group__03579 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group__1_in_rule__SubExpression__Group__03582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_rule__SubExpression__Group__0__Impl3609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group__1__Impl_in_rule__SubExpression__Group__13638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__0_in_rule__SubExpression__Group__1__Impl3665 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__0__Impl_in_rule__SubExpression__Group_1__03700 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__1_in_rule__SubExpression__Group_1__03703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__1__Impl_in_rule__SubExpression__Group_1__13761 = new BitSet(new long[]{0x00000000204021F0L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__2_in_rule__SubExpression__Group_1__13764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__OperatorAssignment_1_1_in_rule__SubExpression__Group_1__1__Impl3791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__2__Impl_in_rule__SubExpression__Group_1__23821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__SubExpressionsAssignment_1_2_in_rule__SubExpression__Group_1__2__Impl3848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__0__Impl_in_rule__MultExpression__Group__03884 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__1_in_rule__MultExpression__Group__03887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_rule__MultExpression__Group__0__Impl3914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__1__Impl_in_rule__MultExpression__Group__13943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__0_in_rule__MultExpression__Group__1__Impl3970 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__0__Impl_in_rule__MultExpression__Group_1__04005 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__1_in_rule__MultExpression__Group_1__04008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__1__Impl_in_rule__MultExpression__Group_1__14066 = new BitSet(new long[]{0x00000000204021F0L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__2_in_rule__MultExpression__Group_1__14069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__OperatorAssignment_1_1_in_rule__MultExpression__Group_1__1__Impl4096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__2__Impl_in_rule__MultExpression__Group_1__24126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__SubExpressionsAssignment_1_2_in_rule__MultExpression__Group_1__2__Impl4153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group__0__Impl_in_rule__ModExpression__Group__04189 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group__1_in_rule__ModExpression__Group__04192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_rule__ModExpression__Group__0__Impl4219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group__1__Impl_in_rule__ModExpression__Group__14248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__0_in_rule__ModExpression__Group__1__Impl4275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__0__Impl_in_rule__ModExpression__Group_1__04310 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__1_in_rule__ModExpression__Group_1__04313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__1__Impl_in_rule__ModExpression__Group_1__14371 = new BitSet(new long[]{0x00000000204021F0L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__2_in_rule__ModExpression__Group_1__14374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__OperatorAssignment_1_1_in_rule__ModExpression__Group_1__1__Impl4401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__2__Impl_in_rule__ModExpression__Group_1__24431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__SubExpressionsAssignment_1_2_in_rule__ModExpression__Group_1__2__Impl4458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__0__Impl_in_rule__NotExpression__Group_0__04494 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__1_in_rule__NotExpression__Group_0__04497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__1__Impl_in_rule__NotExpression__Group_0__14555 = new BitSet(new long[]{0x0000000020412130L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__2_in_rule__NotExpression__Group_0__14558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__OperatorAssignment_0_1_in_rule__NotExpression__Group_0__1__Impl4585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__2__Impl_in_rule__NotExpression__Group_0__24615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__SubExpressionsAssignment_0_2_in_rule__NotExpression__Group_0__2__Impl4642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__0__Impl_in_rule__AtomicExpression__Group_2__04678 = new BitSet(new long[]{0x00000000204121F0L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__1_in_rule__AtomicExpression__Group_2__04681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__AtomicExpression__Group_2__0__Impl4709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__1__Impl_in_rule__AtomicExpression__Group_2__14740 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__2_in_rule__AtomicExpression__Group_2__14743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__AtomicExpression__Group_2__1__Impl4770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__2__Impl_in_rule__AtomicExpression__Group_2__24799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__AtomicExpression__Group_2__2__Impl4827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__0__Impl_in_rule__AtomicValuedExpression__Group_2__04864 = new BitSet(new long[]{0x00000000204021F0L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__1_in_rule__AtomicValuedExpression__Group_2__04867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__AtomicValuedExpression__Group_2__0__Impl4895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__1__Impl_in_rule__AtomicValuedExpression__Group_2__14926 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__2_in_rule__AtomicValuedExpression__Group_2__14929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivExpression_in_rule__AtomicValuedExpression__Group_2__1__Impl4956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__2__Impl_in_rule__AtomicValuedExpression__Group_2__24985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__AtomicValuedExpression__Group_2__2__Impl5013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_3__0__Impl_in_rule__AtomicValuedExpression__Group_3__05050 = new BitSet(new long[]{0x00000000204021F0L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_3__1_in_rule__AtomicValuedExpression__Group_3__05053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__AtomicValuedExpression__Group_3__0__Impl5081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_3__1__Impl_in_rule__AtomicValuedExpression__Group_3__15112 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_3__2_in_rule__AtomicValuedExpression__Group_3__15115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_rule__AtomicValuedExpression__Group_3__1__Impl5142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_3__2__Impl_in_rule__AtomicValuedExpression__Group_3__25171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__AtomicValuedExpression__Group_3__2__Impl5199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group__0__Impl_in_rule__DivExpression__Group__05236 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__DivExpression__Group__1_in_rule__DivExpression__Group__05239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_rule__DivExpression__Group__0__Impl5266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group__1__Impl_in_rule__DivExpression__Group__15295 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__DivExpression__Group__2_in_rule__DivExpression__Group__15298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group__2__Impl_in_rule__DivExpression__Group__25356 = new BitSet(new long[]{0x00000000204021F0L});
        public static final BitSet FOLLOW_rule__DivExpression__Group__3_in_rule__DivExpression__Group__25359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__OperatorAssignment_2_in_rule__DivExpression__Group__2__Impl5386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group__3__Impl_in_rule__DivExpression__Group__35416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__SubExpressionsAssignment_3_in_rule__DivExpression__Group__3__Impl5443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__0__Impl_in_rule__ValuedObjectTestExpression__Group_0__05481 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__1_in_rule__ValuedObjectTestExpression__Group_0__05484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__1__Impl_in_rule__ValuedObjectTestExpression__Group_0__15542 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__2_in_rule__ValuedObjectTestExpression__Group_0__15545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__OperatorAssignment_0_1_in_rule__ValuedObjectTestExpression__Group_0__1__Impl5572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__2__Impl_in_rule__ValuedObjectTestExpression__Group_0__25602 = new BitSet(new long[]{0x0000000000402010L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__3_in_rule__ValuedObjectTestExpression__Group_0__25605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__ValuedObjectTestExpression__Group_0__2__Impl5633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__3__Impl_in_rule__ValuedObjectTestExpression__Group_0__35664 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__4_in_rule__ValuedObjectTestExpression__Group_0__35667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3_in_rule__ValuedObjectTestExpression__Group_0__3__Impl5694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__4__Impl_in_rule__ValuedObjectTestExpression__Group_0__45724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__ValuedObjectTestExpression__Group_0__4__Impl5752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_1__0__Impl_in_rule__ValuedObjectTestExpression__Group_1__05793 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_1__1_in_rule__ValuedObjectTestExpression__Group_1__05796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_1__1__Impl_in_rule__ValuedObjectTestExpression__Group_1__15854 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_1__2_in_rule__ValuedObjectTestExpression__Group_1__15857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__OperatorAssignment_1_1_in_rule__ValuedObjectTestExpression__Group_1__1__Impl5884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_1__2__Impl_in_rule__ValuedObjectTestExpression__Group_1__25914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2_in_rule__ValuedObjectTestExpression__Group_1__2__Impl5941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group__0__Impl_in_rule__TextExpression__Group__05977 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group__1_in_rule__TextExpression__Group__05980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__CodeAssignment_0_in_rule__TextExpression__Group__0__Impl6007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group__1__Impl_in_rule__TextExpression__Group__16037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group_1__0_in_rule__TextExpression__Group__1__Impl6064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group_1__0__Impl_in_rule__TextExpression__Group_1__06099 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__TextExpression__Group_1__1_in_rule__TextExpression__Group_1__06102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__TextExpression__Group_1__0__Impl6130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group_1__1__Impl_in_rule__TextExpression__Group_1__16161 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__TextExpression__Group_1__2_in_rule__TextExpression__Group_1__16164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__TypeAssignment_1_1_in_rule__TextExpression__Group_1__1__Impl6191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group_1__2__Impl_in_rule__TextExpression__Group_1__26221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__TextExpression__Group_1__2__Impl6249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrOperator_in_rule__OrExpression__OperatorAssignment_1_16291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__SubExpressionsAssignment_1_26322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndOperator_in_rule__AndExpression__OperatorAssignment_1_16353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_rule__AndExpression__SubExpressionsAssignment_1_26384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperator_in_rule__CompareOperation__OperatorAssignment_0_1_16415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_rule__CompareOperation__SubExpressionsAssignment_0_1_26446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddOperator_in_rule__AddExpression__OperatorAssignment_1_16477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubExpression_in_rule__AddExpression__SubExpressionsAssignment_1_26508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubOperator_in_rule__SubExpression__OperatorAssignment_1_16539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_rule__SubExpression__SubExpressionsAssignment_1_26570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultOperator_in_rule__MultExpression__OperatorAssignment_1_16601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_rule__MultExpression__SubExpressionsAssignment_1_26632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModOperator_in_rule__ModExpression__OperatorAssignment_1_16663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_rule__ModExpression__SubExpressionsAssignment_1_26694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOperator_in_rule__NotExpression__OperatorAssignment_0_16725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_rule__NotExpression__SubExpressionsAssignment_0_26756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivOperator_in_rule__DivExpression__OperatorAssignment_26787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_rule__DivExpression__SubExpressionsAssignment_36818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePreOperator_in_rule__ValuedObjectTestExpression__OperatorAssignment_0_16849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_36880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValueTestOperator_in_rule__ValuedObjectTestExpression__OperatorAssignment_1_16911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectReference_in_rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_26942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ValuedObjectReference__ValuedObjectAssignment6977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__TextExpression__CodeAssignment_07012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__TextExpression__TypeAssignment_1_17043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment7074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_rule__FloatValue__ValueAssignment7105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__BooleanValue__ValueAssignment7136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_synpred11766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0__0_in_synpred21815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_synpred31865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__0_in_synpred102082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_3__0_in_synpred112100 = new BitSet(new long[]{0x0000000000000002L});
    }


}