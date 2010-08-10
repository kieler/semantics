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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'pre'", "'or'", "'and'", "'not'", "'+'", "'-'", "'*'", "'mod'", "'/'", "'?'", "'='", "'<'", "'<='", "'>'", "'>='", "'<>'", "'('", "')'", "'@'"
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

        public InternalExpressionsParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[259+1];
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


    // $ANTLR start entryRuleCommentAnnotation
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:654:1: entryRuleCommentAnnotation : ruleCommentAnnotation EOF ;
    public final void entryRuleCommentAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:655:1: ( ruleCommentAnnotation EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:656:1: ruleCommentAnnotation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation1329);
            ruleCommentAnnotation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getCommentAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCommentAnnotation1336); if (failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:663:1: ruleCommentAnnotation : ( ( rule__CommentAnnotation__ValueAssignment ) ) ;
    public final void ruleCommentAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:667:2: ( ( ( rule__CommentAnnotation__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:668:1: ( ( rule__CommentAnnotation__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:668:1: ( ( rule__CommentAnnotation__ValueAssignment ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:669:1: ( rule__CommentAnnotation__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:670:1: ( rule__CommentAnnotation__ValueAssignment )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:670:2: rule__CommentAnnotation__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__CommentAnnotation__ValueAssignment_in_ruleCommentAnnotation1362);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:682:1: entryRuleKeyValueAnnotation : ruleKeyValueAnnotation EOF ;
    public final void entryRuleKeyValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:683:1: ( ruleKeyValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:684:1: ruleKeyValueAnnotation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyValueAnnotation_in_entryRuleKeyValueAnnotation1389);
            ruleKeyValueAnnotation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getKeyValueAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyValueAnnotation1396); if (failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:691:1: ruleKeyValueAnnotation : ( ( rule__KeyValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:695:2: ( ( ( rule__KeyValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:696:1: ( ( rule__KeyValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:696:1: ( ( rule__KeyValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:697:1: ( rule__KeyValueAnnotation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyValueAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:698:1: ( rule__KeyValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:698:2: rule__KeyValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyValueAnnotation__Group__0_in_ruleKeyValueAnnotation1422);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:710:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:711:1: ( ruleEString EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:712:1: ruleEString EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1449);
            ruleEString();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEStringRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1456); if (failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:719:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:723:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:724:1: ( ( rule__EString__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:724:1: ( ( rule__EString__Alternatives ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:725:1: ( rule__EString__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:726:1: ( rule__EString__Alternatives )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:726:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString1482);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:739:1: ruleCompareOperator : ( ( rule__CompareOperator__Alternatives ) ) ;
    public final void ruleCompareOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:743:1: ( ( ( rule__CompareOperator__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:744:1: ( ( rule__CompareOperator__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:744:1: ( ( rule__CompareOperator__Alternatives ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:745:1: ( rule__CompareOperator__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:746:1: ( rule__CompareOperator__Alternatives )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:746:2: rule__CompareOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperator__Alternatives_in_ruleCompareOperator1519);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:758:1: rulePreOperator : ( ( 'pre' ) ) ;
    public final void rulePreOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:762:1: ( ( ( 'pre' ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:763:1: ( ( 'pre' ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:763:1: ( ( 'pre' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:764:1: ( 'pre' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreOperatorAccess().getPREEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:765:1: ( 'pre' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:765:3: 'pre'
            {
            match(input,14,FollowSets000.FOLLOW_14_in_rulePreOperator1556); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:778:1: ruleOrOperator : ( ( 'or' ) ) ;
    public final void ruleOrOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:782:1: ( ( ( 'or' ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:783:1: ( ( 'or' ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:783:1: ( ( 'or' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:784:1: ( 'or' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperatorAccess().getOREnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:785:1: ( 'or' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:785:3: 'or'
            {
            match(input,15,FollowSets000.FOLLOW_15_in_ruleOrOperator1595); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:798:1: ruleAndOperator : ( ( 'and' ) ) ;
    public final void ruleAndOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:802:1: ( ( ( 'and' ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:803:1: ( ( 'and' ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:803:1: ( ( 'and' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:804:1: ( 'and' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperatorAccess().getANDEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:805:1: ( 'and' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:805:3: 'and'
            {
            match(input,16,FollowSets000.FOLLOW_16_in_ruleAndOperator1634); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:818:1: ruleNotOperator : ( ( 'not' ) ) ;
    public final void ruleNotOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:822:1: ( ( ( 'not' ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:823:1: ( ( 'not' ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:823:1: ( ( 'not' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:824:1: ( 'not' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:825:1: ( 'not' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:825:3: 'not'
            {
            match(input,17,FollowSets000.FOLLOW_17_in_ruleNotOperator1673); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:838:1: ruleAddOperator : ( ( '+' ) ) ;
    public final void ruleAddOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:842:1: ( ( ( '+' ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:843:1: ( ( '+' ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:843:1: ( ( '+' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:844:1: ( '+' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddOperatorAccess().getADDEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:845:1: ( '+' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:845:3: '+'
            {
            match(input,18,FollowSets000.FOLLOW_18_in_ruleAddOperator1712); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:858:1: ruleSubOperator : ( ( '-' ) ) ;
    public final void ruleSubOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:862:1: ( ( ( '-' ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:863:1: ( ( '-' ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:863:1: ( ( '-' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:864:1: ( '-' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubOperatorAccess().getSUBEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:865:1: ( '-' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:865:3: '-'
            {
            match(input,19,FollowSets000.FOLLOW_19_in_ruleSubOperator1751); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:878:1: ruleMultOperator : ( ( '*' ) ) ;
    public final void ruleMultOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:882:1: ( ( ( '*' ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:883:1: ( ( '*' ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:883:1: ( ( '*' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:884:1: ( '*' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:885:1: ( '*' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:885:3: '*'
            {
            match(input,20,FollowSets000.FOLLOW_20_in_ruleMultOperator1790); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:898:1: ruleModOperator : ( ( 'mod' ) ) ;
    public final void ruleModOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:902:1: ( ( ( 'mod' ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:903:1: ( ( 'mod' ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:903:1: ( ( 'mod' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:904:1: ( 'mod' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModOperatorAccess().getMODEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:905:1: ( 'mod' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:905:3: 'mod'
            {
            match(input,21,FollowSets000.FOLLOW_21_in_ruleModOperator1829); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:918:1: ruleDivOperator : ( ( '/' ) ) ;
    public final void ruleDivOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:922:1: ( ( ( '/' ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:923:1: ( ( '/' ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:923:1: ( ( '/' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:924:1: ( '/' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperatorAccess().getDIVEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:925:1: ( '/' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:925:3: '/'
            {
            match(input,22,FollowSets000.FOLLOW_22_in_ruleDivOperator1868); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:938:1: ruleValueTestOperator : ( ( '?' ) ) ;
    public final void ruleValueTestOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:942:1: ( ( ( '?' ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:943:1: ( ( '?' ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:943:1: ( ( '?' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:944:1: ( '?' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValueTestOperatorAccess().getVALEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:945:1: ( '?' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:945:3: '?'
            {
            match(input,23,FollowSets000.FOLLOW_23_in_ruleValueTestOperator1907); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:961:1: rule__Expression__Alternatives : ( ( ruleBooleanExpression ) | ( ruleValuedExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:965:1: ( ( ruleBooleanExpression ) | ( ruleValuedExpression ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:966:1: ( ruleBooleanExpression )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:966:1: ( ruleBooleanExpression )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:967:1: ruleBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_rule__Expression__Alternatives1948);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:972:6: ( ruleValuedExpression )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:972:6: ( ruleValuedExpression )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:973:1: ruleValuedExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_rule__Expression__Alternatives1965);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:983:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );
    public final void rule__CompareOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:987:1: ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) )
            int alt2=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_FLOAT:
                {
                alt2=1;
                }
                break;
            case 30:
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
                        new NoViableAltException("983:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BOOLEAN:
                {
                int LA2_3 = input.LA(2);

                if ( ((LA2_3>=18 && LA2_3<=21)||(LA2_3>=24 && LA2_3<=29)) ) {
                    alt2=1;
                }
                else if ( (LA2_3==EOF||(LA2_3>=15 && LA2_3<=16)||LA2_3==31) ) {
                    alt2=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("983:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            case 14:
                {
                int LA2_4 = input.LA(2);

                if ( (LA2_4==30) ) {
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
                            new NoViableAltException("983:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 2, 11, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("983:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 2, 4, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                int LA2_5 = input.LA(2);

                if ( (LA2_5==RULE_ID) ) {
                    int LA2_12 = input.LA(3);

                    if ( ((LA2_12>=18 && LA2_12<=21)||(LA2_12>=24 && LA2_12<=29)) ) {
                        alt2=1;
                    }
                    else if ( (LA2_12==EOF||(LA2_12>=15 && LA2_12<=16)||LA2_12==31) ) {
                        alt2=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("983:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 2, 12, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("983:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 2, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA2_6 = input.LA(2);

                if ( ((LA2_6>=18 && LA2_6<=21)||(LA2_6>=24 && LA2_6<=29)) ) {
                    alt2=1;
                }
                else if ( (LA2_6==EOF||(LA2_6>=15 && LA2_6<=16)||LA2_6==31) ) {
                    alt2=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("983:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 2, 6, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case 30:
                    {
                    int LA2_13 = input.LA(3);

                    if ( (LA2_13==RULE_ID) ) {
                        int LA2_14 = input.LA(4);

                        if ( (LA2_14==31) ) {
                            int LA2_15 = input.LA(5);

                            if ( ((LA2_15>=18 && LA2_15<=21)||(LA2_15>=24 && LA2_15<=29)) ) {
                                alt2=1;
                            }
                            else if ( (LA2_15==EOF||(LA2_15>=15 && LA2_15<=16)||LA2_15==31) ) {
                                alt2=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("983:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 2, 15, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("983:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 2, 14, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("983:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 2, 13, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case 15:
                case 16:
                case 31:
                    {
                    alt2=2;
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
                    alt2=1;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("983:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 2, 7, input);

                    throw nvae;
                }

                }
                break;
            case 17:
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
                        new NoViableAltException("983:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 2, 8, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("983:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:988:1: ( ( rule__CompareOperation__Group_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:988:1: ( ( rule__CompareOperation__Group_0__0 ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:989:1: ( rule__CompareOperation__Group_0__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperationAccess().getGroup_0()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:990:1: ( rule__CompareOperation__Group_0__0 )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:990:2: rule__CompareOperation__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0__0_in_rule__CompareOperation__Alternatives1997);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:994:6: ( ruleNotExpression )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:994:6: ( ruleNotExpression )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:995:1: ruleNotExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperationAccess().getNotExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_rule__CompareOperation__Alternatives2015);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1005:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );
    public final void rule__NotOrValuedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1009:1: ( ( ruleValuedExpression ) | ( ruleNotExpression ) )
            int alt3=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_FLOAT:
                {
                alt3=1;
                }
                break;
            case 30:
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
                        new NoViableAltException("1005:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );", 3, 2, input);

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
                        new NoViableAltException("1005:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case 14:
                {
                int LA3_4 = input.LA(2);

                if ( (LA3_4==30) ) {
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
                            new NoViableAltException("1005:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );", 3, 9, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1005:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );", 3, 4, input);

                    throw nvae;
                }
                }
                break;
            case 23:
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
                            new NoViableAltException("1005:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );", 3, 10, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1005:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );", 3, 5, input);

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
                        new NoViableAltException("1005:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );", 3, 6, input);

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
                        new NoViableAltException("1005:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );", 3, 7, input);

                    throw nvae;
                }
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1005:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1010:1: ( ruleValuedExpression )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1010:1: ( ruleValuedExpression )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1011:1: ruleValuedExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_rule__NotOrValuedExpression__Alternatives2047);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1016:6: ( ruleNotExpression )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1016:6: ( ruleNotExpression )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1017:1: ruleNotExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getNotOrValuedExpressionAccess().getNotExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_rule__NotOrValuedExpression__Alternatives2064);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1027:1: rule__NotExpression__Alternatives : ( ( ( rule__NotExpression__Group_0__0 ) ) | ( ruleAtomicExpression ) );
    public final void rule__NotExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1031:1: ( ( ( rule__NotExpression__Group_0__0 ) ) | ( ruleAtomicExpression ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)||LA4_0==RULE_BOOLEAN||LA4_0==14||LA4_0==23||LA4_0==30) ) {
                alt4=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1027:1: rule__NotExpression__Alternatives : ( ( ( rule__NotExpression__Group_0__0 ) ) | ( ruleAtomicExpression ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1032:1: ( ( rule__NotExpression__Group_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1032:1: ( ( rule__NotExpression__Group_0__0 ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1033:1: ( rule__NotExpression__Group_0__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getNotExpressionAccess().getGroup_0()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1034:1: ( rule__NotExpression__Group_0__0 )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1034:2: rule__NotExpression__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__0_in_rule__NotExpression__Alternatives2096);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1038:6: ( ruleAtomicExpression )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1038:6: ( ruleAtomicExpression )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1039:1: ruleAtomicExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getNotExpressionAccess().getAtomicExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_rule__NotExpression__Alternatives2114);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1049:1: rule__AtomicExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleValuedObjectTestExpression ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ruleTextExpression ) );
    public final void rule__AtomicExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1053:1: ( ( ruleBooleanValue ) | ( ruleValuedObjectTestExpression ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ruleTextExpression ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt5=1;
                }
                break;
            case RULE_ID:
            case 14:
            case 23:
                {
                alt5=2;
                }
                break;
            case 30:
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
                    new NoViableAltException("1049:1: rule__AtomicExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleValuedObjectTestExpression ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ruleTextExpression ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1054:1: ( ruleBooleanValue )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1054:1: ( ruleBooleanValue )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1055:1: ruleBooleanValue
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getBooleanValueParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanValue_in_rule__AtomicExpression__Alternatives2146);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1060:6: ( ruleValuedObjectTestExpression )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1060:6: ( ruleValuedObjectTestExpression )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1061:1: ruleValuedObjectTestExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getValuedObjectTestExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_rule__AtomicExpression__Alternatives2163);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1066:6: ( ( rule__AtomicExpression__Group_2__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1066:6: ( ( rule__AtomicExpression__Group_2__0 ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1067:1: ( rule__AtomicExpression__Group_2__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getGroup_2()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1068:1: ( rule__AtomicExpression__Group_2__0 )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1068:2: rule__AtomicExpression__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__0_in_rule__AtomicExpression__Alternatives2180);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1072:6: ( ruleTextExpression )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1072:6: ( ruleTextExpression )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1073:1: ruleTextExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_rule__AtomicExpression__Alternatives2198);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1083:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ( rule__AtomicValuedExpression__Group_2__0 ) ) | ( ( rule__AtomicValuedExpression__Group_3__0 ) ) | ( ruleAtomicExpression ) );
    public final void rule__AtomicValuedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1087:1: ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ( rule__AtomicValuedExpression__Group_2__0 ) ) | ( ( rule__AtomicValuedExpression__Group_3__0 ) ) | ( ruleAtomicExpression ) )
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
            case 30:
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
                        new NoViableAltException("1083:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ( rule__AtomicValuedExpression__Group_2__0 ) ) | ( ( rule__AtomicValuedExpression__Group_3__0 ) ) | ( ruleAtomicExpression ) );", 6, 3, input);

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
                alt6=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1083:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ( rule__AtomicValuedExpression__Group_2__0 ) ) | ( ( rule__AtomicValuedExpression__Group_3__0 ) ) | ( ruleAtomicExpression ) );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1088:1: ( ruleIntValue )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1088:1: ( ruleIntValue )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1089:1: ruleIntValue
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getIntValueParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIntValue_in_rule__AtomicValuedExpression__Alternatives2230);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1094:6: ( ruleFloatValue )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1094:6: ( ruleFloatValue )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1095:1: ruleFloatValue
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_rule__AtomicValuedExpression__Alternatives2247);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1100:6: ( ( rule__AtomicValuedExpression__Group_2__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1100:6: ( ( rule__AtomicValuedExpression__Group_2__0 ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1101:1: ( rule__AtomicValuedExpression__Group_2__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_2()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1102:1: ( rule__AtomicValuedExpression__Group_2__0 )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1102:2: rule__AtomicValuedExpression__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_2__0_in_rule__AtomicValuedExpression__Alternatives2264);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1106:6: ( ( rule__AtomicValuedExpression__Group_3__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1106:6: ( ( rule__AtomicValuedExpression__Group_3__0 ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1107:1: ( rule__AtomicValuedExpression__Group_3__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_3()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1108:1: ( rule__AtomicValuedExpression__Group_3__0 )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1108:2: rule__AtomicValuedExpression__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_3__0_in_rule__AtomicValuedExpression__Alternatives2282);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1112:6: ( ruleAtomicExpression )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1112:6: ( ruleAtomicExpression )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1113:1: ruleAtomicExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getAtomicExpressionParserRuleCall_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_rule__AtomicValuedExpression__Alternatives2300);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1123:1: rule__ValuedObjectTestExpression__Alternatives : ( ( ( rule__ValuedObjectTestExpression__Group_0__0 ) ) | ( ( rule__ValuedObjectTestExpression__Group_1__0 ) ) | ( ruleValuedObjectReference ) );
    public final void rule__ValuedObjectTestExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1127:1: ( ( ( rule__ValuedObjectTestExpression__Group_0__0 ) ) | ( ( rule__ValuedObjectTestExpression__Group_1__0 ) ) | ( ruleValuedObjectReference ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt7=1;
                }
                break;
            case 23:
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
                    new NoViableAltException("1123:1: rule__ValuedObjectTestExpression__Alternatives : ( ( ( rule__ValuedObjectTestExpression__Group_0__0 ) ) | ( ( rule__ValuedObjectTestExpression__Group_1__0 ) ) | ( ruleValuedObjectReference ) );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1128:1: ( ( rule__ValuedObjectTestExpression__Group_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1128:1: ( ( rule__ValuedObjectTestExpression__Group_0__0 ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1129:1: ( rule__ValuedObjectTestExpression__Group_0__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getGroup_0()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1130:1: ( rule__ValuedObjectTestExpression__Group_0__0 )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1130:2: rule__ValuedObjectTestExpression__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__0_in_rule__ValuedObjectTestExpression__Alternatives2332);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1134:6: ( ( rule__ValuedObjectTestExpression__Group_1__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1134:6: ( ( rule__ValuedObjectTestExpression__Group_1__0 ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1135:1: ( rule__ValuedObjectTestExpression__Group_1__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getGroup_1()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1136:1: ( rule__ValuedObjectTestExpression__Group_1__0 )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1136:2: rule__ValuedObjectTestExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_1__0_in_rule__ValuedObjectTestExpression__Alternatives2350);
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
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1140:6: ( ruleValuedObjectReference )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1140:6: ( ruleValuedObjectReference )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1141:1: ruleValuedObjectReference
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getValuedObjectReferenceParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectReference_in_rule__ValuedObjectTestExpression__Alternatives2368);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1153:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1157:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1153:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1158:1: ( RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1158:1: ( RULE_STRING )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1159:1: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives2402); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1164:6: ( RULE_ID )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1164:6: ( RULE_ID )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1165:1: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives2419); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1175:1: rule__CompareOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1179:1: ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) )
            int alt9=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt9=1;
                }
                break;
            case 25:
                {
                alt9=2;
                }
                break;
            case 26:
                {
                alt9=3;
                }
                break;
            case 27:
                {
                alt9=4;
                }
                break;
            case 28:
                {
                alt9=5;
                }
                break;
            case 29:
                {
                alt9=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1175:1: rule__CompareOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1180:1: ( ( '=' ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1180:1: ( ( '=' ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1181:1: ( '=' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1182:1: ( '=' )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1182:3: '='
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__CompareOperator__Alternatives2452); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1187:6: ( ( '<' ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1187:6: ( ( '<' ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1188:1: ( '<' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1189:1: ( '<' )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1189:3: '<'
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_rule__CompareOperator__Alternatives2473); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1194:6: ( ( '<=' ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1194:6: ( ( '<=' ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1195:1: ( '<=' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1196:1: ( '<=' )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1196:3: '<='
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_rule__CompareOperator__Alternatives2494); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1201:6: ( ( '>' ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1201:6: ( ( '>' ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1202:1: ( '>' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1203:1: ( '>' )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1203:3: '>'
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_rule__CompareOperator__Alternatives2515); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1208:6: ( ( '>=' ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1208:6: ( ( '>=' ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1209:1: ( '>=' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1210:1: ( '>=' )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1210:3: '>='
                    {
                    match(input,28,FollowSets000.FOLLOW_28_in_rule__CompareOperator__Alternatives2536); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1215:6: ( ( '<>' ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1215:6: ( ( '<>' ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1216:1: ( '<>' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_5()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1217:1: ( '<>' )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1217:3: '<>'
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_rule__CompareOperator__Alternatives2557); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1231:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1235:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1236:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__02592);
            rule__OrExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__02595);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1243:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1247:1: ( ( ruleAndExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1248:1: ( ruleAndExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1248:1: ( ruleAndExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1249:1: ruleAndExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_rule__OrExpression__Group__0__Impl2622);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1260:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1264:1: ( rule__OrExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1265:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__12651);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1271:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1275:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1276:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1276:1: ( ( rule__OrExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1277:1: ( rule__OrExpression__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1278:1: ( rule__OrExpression__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1278:2: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl2678);
            	    rule__OrExpression__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1292:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1296:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1297:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__02713);
            rule__OrExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__02716);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1304:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1308:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1309:1: ( () )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1309:1: ( () )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1310:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1311:1: ()
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1313:1: 
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1323:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1327:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1328:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__12774);
            rule__OrExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__2_in_rule__OrExpression__Group_1__12777);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1335:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1339:1: ( ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1340:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1340:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1341:1: ( rule__OrExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1342:1: ( rule__OrExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1342:2: rule__OrExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__OperatorAssignment_1_1_in_rule__OrExpression__Group_1__1__Impl2804);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1352:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1356:1: ( rule__OrExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1357:2: rule__OrExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__2__Impl_in_rule__OrExpression__Group_1__22834);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1363:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1367:1: ( ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1368:1: ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1368:1: ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1369:1: ( rule__OrExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1370:1: ( rule__OrExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1370:2: rule__OrExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__SubExpressionsAssignment_1_2_in_rule__OrExpression__Group_1__2__Impl2861);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1386:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1390:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1391:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__02897);
            rule__AndExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__02900);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1398:1: rule__AndExpression__Group__0__Impl : ( ruleCompareOperation ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1402:1: ( ( ruleCompareOperation ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1403:1: ( ruleCompareOperation )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1403:1: ( ruleCompareOperation )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1404:1: ruleCompareOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getCompareOperationParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_rule__AndExpression__Group__0__Impl2927);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1415:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1419:1: ( rule__AndExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1420:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__12956);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1426:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1430:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1431:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1431:1: ( ( rule__AndExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1432:1: ( rule__AndExpression__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1433:1: ( rule__AndExpression__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1433:2: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl2983);
            	    rule__AndExpression__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1447:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1451:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1452:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__03018);
            rule__AndExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__03021);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1459:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1463:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1464:1: ( () )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1464:1: ( () )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1465:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1466:1: ()
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1468:1: 
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1478:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1482:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1483:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__13079);
            rule__AndExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__2_in_rule__AndExpression__Group_1__13082);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1490:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1494:1: ( ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1495:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1495:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1496:1: ( rule__AndExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1497:1: ( rule__AndExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1497:2: rule__AndExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__OperatorAssignment_1_1_in_rule__AndExpression__Group_1__1__Impl3109);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1507:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1511:1: ( rule__AndExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1512:2: rule__AndExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__2__Impl_in_rule__AndExpression__Group_1__23139);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1518:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1522:1: ( ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1523:1: ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1523:1: ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1524:1: ( rule__AndExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1525:1: ( rule__AndExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1525:2: rule__AndExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__SubExpressionsAssignment_1_2_in_rule__AndExpression__Group_1__2__Impl3166);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1541:1: rule__CompareOperation__Group_0__0 : rule__CompareOperation__Group_0__0__Impl rule__CompareOperation__Group_0__1 ;
    public final void rule__CompareOperation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1545:1: ( rule__CompareOperation__Group_0__0__Impl rule__CompareOperation__Group_0__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1546:2: rule__CompareOperation__Group_0__0__Impl rule__CompareOperation__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0__0__Impl_in_rule__CompareOperation__Group_0__03202);
            rule__CompareOperation__Group_0__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0__1_in_rule__CompareOperation__Group_0__03205);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1553:1: rule__CompareOperation__Group_0__0__Impl : ( ruleNotOrValuedExpression ) ;
    public final void rule__CompareOperation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1557:1: ( ( ruleNotOrValuedExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1558:1: ( ruleNotOrValuedExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1558:1: ( ruleNotOrValuedExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1559:1: ruleNotOrValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_rule__CompareOperation__Group_0__0__Impl3232);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1570:1: rule__CompareOperation__Group_0__1 : rule__CompareOperation__Group_0__1__Impl ;
    public final void rule__CompareOperation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1574:1: ( rule__CompareOperation__Group_0__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1575:2: rule__CompareOperation__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0__1__Impl_in_rule__CompareOperation__Group_0__13261);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1581:1: rule__CompareOperation__Group_0__1__Impl : ( ( rule__CompareOperation__Group_0_1__0 ) ) ;
    public final void rule__CompareOperation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1585:1: ( ( ( rule__CompareOperation__Group_0_1__0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1586:1: ( ( rule__CompareOperation__Group_0_1__0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1586:1: ( ( rule__CompareOperation__Group_0_1__0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1587:1: ( rule__CompareOperation__Group_0_1__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGroup_0_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1588:1: ( rule__CompareOperation__Group_0_1__0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1588:2: rule__CompareOperation__Group_0_1__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__0_in_rule__CompareOperation__Group_0__1__Impl3288);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1602:1: rule__CompareOperation__Group_0_1__0 : rule__CompareOperation__Group_0_1__0__Impl rule__CompareOperation__Group_0_1__1 ;
    public final void rule__CompareOperation__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1606:1: ( rule__CompareOperation__Group_0_1__0__Impl rule__CompareOperation__Group_0_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1607:2: rule__CompareOperation__Group_0_1__0__Impl rule__CompareOperation__Group_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__0__Impl_in_rule__CompareOperation__Group_0_1__03322);
            rule__CompareOperation__Group_0_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__1_in_rule__CompareOperation__Group_0_1__03325);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1614:1: rule__CompareOperation__Group_0_1__0__Impl : ( () ) ;
    public final void rule__CompareOperation__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1618:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1619:1: ( () )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1619:1: ( () )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1620:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_0_1_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1621:1: ()
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1623:1: 
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1633:1: rule__CompareOperation__Group_0_1__1 : rule__CompareOperation__Group_0_1__1__Impl rule__CompareOperation__Group_0_1__2 ;
    public final void rule__CompareOperation__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1637:1: ( rule__CompareOperation__Group_0_1__1__Impl rule__CompareOperation__Group_0_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1638:2: rule__CompareOperation__Group_0_1__1__Impl rule__CompareOperation__Group_0_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__1__Impl_in_rule__CompareOperation__Group_0_1__13383);
            rule__CompareOperation__Group_0_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__2_in_rule__CompareOperation__Group_0_1__13386);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1645:1: rule__CompareOperation__Group_0_1__1__Impl : ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) ) ;
    public final void rule__CompareOperation__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1649:1: ( ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1650:1: ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1650:1: ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1651:1: ( rule__CompareOperation__OperatorAssignment_0_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorAssignment_0_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1652:1: ( rule__CompareOperation__OperatorAssignment_0_1_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1652:2: rule__CompareOperation__OperatorAssignment_0_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__OperatorAssignment_0_1_1_in_rule__CompareOperation__Group_0_1__1__Impl3413);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1662:1: rule__CompareOperation__Group_0_1__2 : rule__CompareOperation__Group_0_1__2__Impl ;
    public final void rule__CompareOperation__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1666:1: ( rule__CompareOperation__Group_0_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1667:2: rule__CompareOperation__Group_0_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__2__Impl_in_rule__CompareOperation__Group_0_1__23443);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1673:1: rule__CompareOperation__Group_0_1__2__Impl : ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) ) ;
    public final void rule__CompareOperation__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1677:1: ( ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1678:1: ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1678:1: ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1679:1: ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsAssignment_0_1_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1680:1: ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1680:2: rule__CompareOperation__SubExpressionsAssignment_0_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__SubExpressionsAssignment_0_1_2_in_rule__CompareOperation__Group_0_1__2__Impl3470);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1696:1: rule__AddExpression__Group__0 : rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 ;
    public final void rule__AddExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1700:1: ( rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1701:2: rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__0__Impl_in_rule__AddExpression__Group__03506);
            rule__AddExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__1_in_rule__AddExpression__Group__03509);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1708:1: rule__AddExpression__Group__0__Impl : ( ruleSubExpression ) ;
    public final void rule__AddExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1712:1: ( ( ruleSubExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1713:1: ( ruleSubExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1713:1: ( ruleSubExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1714:1: ruleSubExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_rule__AddExpression__Group__0__Impl3536);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1725:1: rule__AddExpression__Group__1 : rule__AddExpression__Group__1__Impl ;
    public final void rule__AddExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1729:1: ( rule__AddExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1730:2: rule__AddExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__1__Impl_in_rule__AddExpression__Group__13565);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1736:1: rule__AddExpression__Group__1__Impl : ( ( rule__AddExpression__Group_1__0 )* ) ;
    public final void rule__AddExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1740:1: ( ( ( rule__AddExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1741:1: ( ( rule__AddExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1741:1: ( ( rule__AddExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1742:1: ( rule__AddExpression__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1743:1: ( rule__AddExpression__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1743:2: rule__AddExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__0_in_rule__AddExpression__Group__1__Impl3592);
            	    rule__AddExpression__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1757:1: rule__AddExpression__Group_1__0 : rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 ;
    public final void rule__AddExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1761:1: ( rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1762:2: rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__0__Impl_in_rule__AddExpression__Group_1__03627);
            rule__AddExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__1_in_rule__AddExpression__Group_1__03630);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1769:1: rule__AddExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AddExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1773:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1774:1: ( () )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1774:1: ( () )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1775:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1776:1: ()
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1778:1: 
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1788:1: rule__AddExpression__Group_1__1 : rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2 ;
    public final void rule__AddExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1792:1: ( rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1793:2: rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__1__Impl_in_rule__AddExpression__Group_1__13688);
            rule__AddExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__2_in_rule__AddExpression__Group_1__13691);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1800:1: rule__AddExpression__Group_1__1__Impl : ( ( rule__AddExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AddExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1804:1: ( ( ( rule__AddExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1805:1: ( ( rule__AddExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1805:1: ( ( rule__AddExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1806:1: ( rule__AddExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1807:1: ( rule__AddExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1807:2: rule__AddExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__OperatorAssignment_1_1_in_rule__AddExpression__Group_1__1__Impl3718);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1817:1: rule__AddExpression__Group_1__2 : rule__AddExpression__Group_1__2__Impl ;
    public final void rule__AddExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1821:1: ( rule__AddExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1822:2: rule__AddExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__2__Impl_in_rule__AddExpression__Group_1__23748);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1828:1: rule__AddExpression__Group_1__2__Impl : ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__AddExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1832:1: ( ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1833:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1833:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1834:1: ( rule__AddExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1835:1: ( rule__AddExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1835:2: rule__AddExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__SubExpressionsAssignment_1_2_in_rule__AddExpression__Group_1__2__Impl3775);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1851:1: rule__SubExpression__Group__0 : rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 ;
    public final void rule__SubExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1855:1: ( rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1856:2: rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group__0__Impl_in_rule__SubExpression__Group__03811);
            rule__SubExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group__1_in_rule__SubExpression__Group__03814);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1863:1: rule__SubExpression__Group__0__Impl : ( ruleMultExpression ) ;
    public final void rule__SubExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1867:1: ( ( ruleMultExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1868:1: ( ruleMultExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1868:1: ( ruleMultExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1869:1: ruleMultExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_rule__SubExpression__Group__0__Impl3841);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1880:1: rule__SubExpression__Group__1 : rule__SubExpression__Group__1__Impl ;
    public final void rule__SubExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1884:1: ( rule__SubExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1885:2: rule__SubExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group__1__Impl_in_rule__SubExpression__Group__13870);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1891:1: rule__SubExpression__Group__1__Impl : ( ( rule__SubExpression__Group_1__0 )* ) ;
    public final void rule__SubExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1895:1: ( ( ( rule__SubExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1896:1: ( ( rule__SubExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1896:1: ( ( rule__SubExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1897:1: ( rule__SubExpression__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1898:1: ( rule__SubExpression__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==19) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1898:2: rule__SubExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__0_in_rule__SubExpression__Group__1__Impl3897);
            	    rule__SubExpression__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1912:1: rule__SubExpression__Group_1__0 : rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 ;
    public final void rule__SubExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1916:1: ( rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1917:2: rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__0__Impl_in_rule__SubExpression__Group_1__03932);
            rule__SubExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__1_in_rule__SubExpression__Group_1__03935);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1924:1: rule__SubExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__SubExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1928:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1929:1: ( () )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1929:1: ( () )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1930:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1931:1: ()
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1933:1: 
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1943:1: rule__SubExpression__Group_1__1 : rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2 ;
    public final void rule__SubExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1947:1: ( rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1948:2: rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__1__Impl_in_rule__SubExpression__Group_1__13993);
            rule__SubExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__2_in_rule__SubExpression__Group_1__13996);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1955:1: rule__SubExpression__Group_1__1__Impl : ( ( rule__SubExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__SubExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1959:1: ( ( ( rule__SubExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1960:1: ( ( rule__SubExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1960:1: ( ( rule__SubExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1961:1: ( rule__SubExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1962:1: ( rule__SubExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1962:2: rule__SubExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__OperatorAssignment_1_1_in_rule__SubExpression__Group_1__1__Impl4023);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1972:1: rule__SubExpression__Group_1__2 : rule__SubExpression__Group_1__2__Impl ;
    public final void rule__SubExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1976:1: ( rule__SubExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1977:2: rule__SubExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__2__Impl_in_rule__SubExpression__Group_1__24053);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1983:1: rule__SubExpression__Group_1__2__Impl : ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__SubExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1987:1: ( ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1988:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1988:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1989:1: ( rule__SubExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1990:1: ( rule__SubExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1990:2: rule__SubExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__SubExpressionsAssignment_1_2_in_rule__SubExpression__Group_1__2__Impl4080);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2006:1: rule__MultExpression__Group__0 : rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 ;
    public final void rule__MultExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2010:1: ( rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2011:2: rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__0__Impl_in_rule__MultExpression__Group__04116);
            rule__MultExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__1_in_rule__MultExpression__Group__04119);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2018:1: rule__MultExpression__Group__0__Impl : ( ruleModExpression ) ;
    public final void rule__MultExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2022:1: ( ( ruleModExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2023:1: ( ruleModExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2023:1: ( ruleModExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2024:1: ruleModExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getModExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_rule__MultExpression__Group__0__Impl4146);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2035:1: rule__MultExpression__Group__1 : rule__MultExpression__Group__1__Impl ;
    public final void rule__MultExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2039:1: ( rule__MultExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2040:2: rule__MultExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__1__Impl_in_rule__MultExpression__Group__14175);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2046:1: rule__MultExpression__Group__1__Impl : ( ( rule__MultExpression__Group_1__0 )* ) ;
    public final void rule__MultExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2050:1: ( ( ( rule__MultExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2051:1: ( ( rule__MultExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2051:1: ( ( rule__MultExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2052:1: ( rule__MultExpression__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2053:1: ( rule__MultExpression__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==20) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2053:2: rule__MultExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__0_in_rule__MultExpression__Group__1__Impl4202);
            	    rule__MultExpression__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2067:1: rule__MultExpression__Group_1__0 : rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 ;
    public final void rule__MultExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2071:1: ( rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2072:2: rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__0__Impl_in_rule__MultExpression__Group_1__04237);
            rule__MultExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__1_in_rule__MultExpression__Group_1__04240);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2079:1: rule__MultExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2083:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2084:1: ( () )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2084:1: ( () )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2085:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2086:1: ()
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2088:1: 
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2098:1: rule__MultExpression__Group_1__1 : rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2 ;
    public final void rule__MultExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2102:1: ( rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2103:2: rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__1__Impl_in_rule__MultExpression__Group_1__14298);
            rule__MultExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__2_in_rule__MultExpression__Group_1__14301);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2110:1: rule__MultExpression__Group_1__1__Impl : ( ( rule__MultExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2114:1: ( ( ( rule__MultExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2115:1: ( ( rule__MultExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2115:1: ( ( rule__MultExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2116:1: ( rule__MultExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2117:1: ( rule__MultExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2117:2: rule__MultExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__OperatorAssignment_1_1_in_rule__MultExpression__Group_1__1__Impl4328);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2127:1: rule__MultExpression__Group_1__2 : rule__MultExpression__Group_1__2__Impl ;
    public final void rule__MultExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2131:1: ( rule__MultExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2132:2: rule__MultExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__2__Impl_in_rule__MultExpression__Group_1__24358);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2138:1: rule__MultExpression__Group_1__2__Impl : ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__MultExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2142:1: ( ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2143:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2143:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2144:1: ( rule__MultExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2145:1: ( rule__MultExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2145:2: rule__MultExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__SubExpressionsAssignment_1_2_in_rule__MultExpression__Group_1__2__Impl4385);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2161:1: rule__ModExpression__Group__0 : rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1 ;
    public final void rule__ModExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2165:1: ( rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2166:2: rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group__0__Impl_in_rule__ModExpression__Group__04421);
            rule__ModExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group__1_in_rule__ModExpression__Group__04424);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2173:1: rule__ModExpression__Group__0__Impl : ( ruleAtomicValuedExpression ) ;
    public final void rule__ModExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2177:1: ( ( ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2178:1: ( ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2178:1: ( ruleAtomicValuedExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2179:1: ruleAtomicValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getAtomicValuedExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_rule__ModExpression__Group__0__Impl4451);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2190:1: rule__ModExpression__Group__1 : rule__ModExpression__Group__1__Impl ;
    public final void rule__ModExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2194:1: ( rule__ModExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2195:2: rule__ModExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group__1__Impl_in_rule__ModExpression__Group__14480);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2201:1: rule__ModExpression__Group__1__Impl : ( ( rule__ModExpression__Group_1__0 )? ) ;
    public final void rule__ModExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2205:1: ( ( ( rule__ModExpression__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2206:1: ( ( rule__ModExpression__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2206:1: ( ( rule__ModExpression__Group_1__0 )? )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2207:1: ( rule__ModExpression__Group_1__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2208:1: ( rule__ModExpression__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2208:2: rule__ModExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__0_in_rule__ModExpression__Group__1__Impl4507);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2222:1: rule__ModExpression__Group_1__0 : rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1 ;
    public final void rule__ModExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2226:1: ( rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2227:2: rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__0__Impl_in_rule__ModExpression__Group_1__04542);
            rule__ModExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__1_in_rule__ModExpression__Group_1__04545);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2234:1: rule__ModExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ModExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2238:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2239:1: ( () )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2239:1: ( () )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2240:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2241:1: ()
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2243:1: 
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2253:1: rule__ModExpression__Group_1__1 : rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2 ;
    public final void rule__ModExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2257:1: ( rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2258:2: rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__1__Impl_in_rule__ModExpression__Group_1__14603);
            rule__ModExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__2_in_rule__ModExpression__Group_1__14606);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2265:1: rule__ModExpression__Group_1__1__Impl : ( ( rule__ModExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ModExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2269:1: ( ( ( rule__ModExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2270:1: ( ( rule__ModExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2270:1: ( ( rule__ModExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2271:1: ( rule__ModExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2272:1: ( rule__ModExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2272:2: rule__ModExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__OperatorAssignment_1_1_in_rule__ModExpression__Group_1__1__Impl4633);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2282:1: rule__ModExpression__Group_1__2 : rule__ModExpression__Group_1__2__Impl ;
    public final void rule__ModExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2286:1: ( rule__ModExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2287:2: rule__ModExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__2__Impl_in_rule__ModExpression__Group_1__24663);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2293:1: rule__ModExpression__Group_1__2__Impl : ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__ModExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2297:1: ( ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2298:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2298:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2299:1: ( rule__ModExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2300:1: ( rule__ModExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2300:2: rule__ModExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__SubExpressionsAssignment_1_2_in_rule__ModExpression__Group_1__2__Impl4690);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2316:1: rule__NotExpression__Group_0__0 : rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1 ;
    public final void rule__NotExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2320:1: ( rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2321:2: rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__0__Impl_in_rule__NotExpression__Group_0__04726);
            rule__NotExpression__Group_0__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__1_in_rule__NotExpression__Group_0__04729);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2328:1: rule__NotExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__NotExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2332:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2333:1: ( () )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2333:1: ( () )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2334:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2335:1: ()
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2337:1: 
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2347:1: rule__NotExpression__Group_0__1 : rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2 ;
    public final void rule__NotExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2351:1: ( rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2352:2: rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__1__Impl_in_rule__NotExpression__Group_0__14787);
            rule__NotExpression__Group_0__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__2_in_rule__NotExpression__Group_0__14790);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2359:1: rule__NotExpression__Group_0__1__Impl : ( ( rule__NotExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__NotExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2363:1: ( ( ( rule__NotExpression__OperatorAssignment_0_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2364:1: ( ( rule__NotExpression__OperatorAssignment_0_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2364:1: ( ( rule__NotExpression__OperatorAssignment_0_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2365:1: ( rule__NotExpression__OperatorAssignment_0_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2366:1: ( rule__NotExpression__OperatorAssignment_0_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2366:2: rule__NotExpression__OperatorAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__OperatorAssignment_0_1_in_rule__NotExpression__Group_0__1__Impl4817);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2376:1: rule__NotExpression__Group_0__2 : rule__NotExpression__Group_0__2__Impl ;
    public final void rule__NotExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2380:1: ( rule__NotExpression__Group_0__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2381:2: rule__NotExpression__Group_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__2__Impl_in_rule__NotExpression__Group_0__24847);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2387:1: rule__NotExpression__Group_0__2__Impl : ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) ) ;
    public final void rule__NotExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2391:1: ( ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2392:1: ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2392:1: ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2393:1: ( rule__NotExpression__SubExpressionsAssignment_0_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubExpressionsAssignment_0_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2394:1: ( rule__NotExpression__SubExpressionsAssignment_0_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2394:2: rule__NotExpression__SubExpressionsAssignment_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__SubExpressionsAssignment_0_2_in_rule__NotExpression__Group_0__2__Impl4874);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2410:1: rule__AtomicExpression__Group_2__0 : rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 ;
    public final void rule__AtomicExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2414:1: ( rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2415:2: rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__0__Impl_in_rule__AtomicExpression__Group_2__04910);
            rule__AtomicExpression__Group_2__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__1_in_rule__AtomicExpression__Group_2__04913);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2422:1: rule__AtomicExpression__Group_2__0__Impl : ( '(' ) ;
    public final void rule__AtomicExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2426:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2427:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2427:1: ( '(' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2428:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__AtomicExpression__Group_2__0__Impl4941); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2441:1: rule__AtomicExpression__Group_2__1 : rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2 ;
    public final void rule__AtomicExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2445:1: ( rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2446:2: rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__1__Impl_in_rule__AtomicExpression__Group_2__14972);
            rule__AtomicExpression__Group_2__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__2_in_rule__AtomicExpression__Group_2__14975);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2453:1: rule__AtomicExpression__Group_2__1__Impl : ( ruleBooleanExpression ) ;
    public final void rule__AtomicExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2457:1: ( ( ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2458:1: ( ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2458:1: ( ruleBooleanExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2459:1: ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getBooleanExpressionParserRuleCall_2_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_rule__AtomicExpression__Group_2__1__Impl5002);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2470:1: rule__AtomicExpression__Group_2__2 : rule__AtomicExpression__Group_2__2__Impl ;
    public final void rule__AtomicExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2474:1: ( rule__AtomicExpression__Group_2__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2475:2: rule__AtomicExpression__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__2__Impl_in_rule__AtomicExpression__Group_2__25031);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2481:1: rule__AtomicExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__AtomicExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2485:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2486:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2486:1: ( ')' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2487:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,31,FollowSets000.FOLLOW_31_in_rule__AtomicExpression__Group_2__2__Impl5059); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2506:1: rule__AtomicValuedExpression__Group_2__0 : rule__AtomicValuedExpression__Group_2__0__Impl rule__AtomicValuedExpression__Group_2__1 ;
    public final void rule__AtomicValuedExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2510:1: ( rule__AtomicValuedExpression__Group_2__0__Impl rule__AtomicValuedExpression__Group_2__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2511:2: rule__AtomicValuedExpression__Group_2__0__Impl rule__AtomicValuedExpression__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_2__0__Impl_in_rule__AtomicValuedExpression__Group_2__05096);
            rule__AtomicValuedExpression__Group_2__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_2__1_in_rule__AtomicValuedExpression__Group_2__05099);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2518:1: rule__AtomicValuedExpression__Group_2__0__Impl : ( '(' ) ;
    public final void rule__AtomicValuedExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2522:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2523:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2523:1: ( '(' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2524:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__AtomicValuedExpression__Group_2__0__Impl5127); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2537:1: rule__AtomicValuedExpression__Group_2__1 : rule__AtomicValuedExpression__Group_2__1__Impl rule__AtomicValuedExpression__Group_2__2 ;
    public final void rule__AtomicValuedExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2541:1: ( rule__AtomicValuedExpression__Group_2__1__Impl rule__AtomicValuedExpression__Group_2__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2542:2: rule__AtomicValuedExpression__Group_2__1__Impl rule__AtomicValuedExpression__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_2__1__Impl_in_rule__AtomicValuedExpression__Group_2__15158);
            rule__AtomicValuedExpression__Group_2__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_2__2_in_rule__AtomicValuedExpression__Group_2__15161);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2549:1: rule__AtomicValuedExpression__Group_2__1__Impl : ( ruleDivExpression ) ;
    public final void rule__AtomicValuedExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2553:1: ( ( ruleDivExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2554:1: ( ruleDivExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2554:1: ( ruleDivExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2555:1: ruleDivExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getDivExpressionParserRuleCall_2_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_rule__AtomicValuedExpression__Group_2__1__Impl5188);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2566:1: rule__AtomicValuedExpression__Group_2__2 : rule__AtomicValuedExpression__Group_2__2__Impl ;
    public final void rule__AtomicValuedExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2570:1: ( rule__AtomicValuedExpression__Group_2__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2571:2: rule__AtomicValuedExpression__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_2__2__Impl_in_rule__AtomicValuedExpression__Group_2__25217);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2577:1: rule__AtomicValuedExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__AtomicValuedExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2581:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2582:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2582:1: ( ')' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2583:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,31,FollowSets000.FOLLOW_31_in_rule__AtomicValuedExpression__Group_2__2__Impl5245); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2602:1: rule__AtomicValuedExpression__Group_3__0 : rule__AtomicValuedExpression__Group_3__0__Impl rule__AtomicValuedExpression__Group_3__1 ;
    public final void rule__AtomicValuedExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2606:1: ( rule__AtomicValuedExpression__Group_3__0__Impl rule__AtomicValuedExpression__Group_3__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2607:2: rule__AtomicValuedExpression__Group_3__0__Impl rule__AtomicValuedExpression__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_3__0__Impl_in_rule__AtomicValuedExpression__Group_3__05282);
            rule__AtomicValuedExpression__Group_3__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_3__1_in_rule__AtomicValuedExpression__Group_3__05285);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2614:1: rule__AtomicValuedExpression__Group_3__0__Impl : ( '(' ) ;
    public final void rule__AtomicValuedExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2618:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2619:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2619:1: ( '(' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2620:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__AtomicValuedExpression__Group_3__0__Impl5313); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2633:1: rule__AtomicValuedExpression__Group_3__1 : rule__AtomicValuedExpression__Group_3__1__Impl rule__AtomicValuedExpression__Group_3__2 ;
    public final void rule__AtomicValuedExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2637:1: ( rule__AtomicValuedExpression__Group_3__1__Impl rule__AtomicValuedExpression__Group_3__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2638:2: rule__AtomicValuedExpression__Group_3__1__Impl rule__AtomicValuedExpression__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_3__1__Impl_in_rule__AtomicValuedExpression__Group_3__15344);
            rule__AtomicValuedExpression__Group_3__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_3__2_in_rule__AtomicValuedExpression__Group_3__15347);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2645:1: rule__AtomicValuedExpression__Group_3__1__Impl : ( ruleValuedExpression ) ;
    public final void rule__AtomicValuedExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2649:1: ( ( ruleValuedExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2650:1: ( ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2650:1: ( ruleValuedExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2651:1: ruleValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_3_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_rule__AtomicValuedExpression__Group_3__1__Impl5374);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2662:1: rule__AtomicValuedExpression__Group_3__2 : rule__AtomicValuedExpression__Group_3__2__Impl ;
    public final void rule__AtomicValuedExpression__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2666:1: ( rule__AtomicValuedExpression__Group_3__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2667:2: rule__AtomicValuedExpression__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_3__2__Impl_in_rule__AtomicValuedExpression__Group_3__25403);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2673:1: rule__AtomicValuedExpression__Group_3__2__Impl : ( ')' ) ;
    public final void rule__AtomicValuedExpression__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2677:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2678:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2678:1: ( ')' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2679:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,31,FollowSets000.FOLLOW_31_in_rule__AtomicValuedExpression__Group_3__2__Impl5431); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2698:1: rule__DivExpression__Group__0 : rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1 ;
    public final void rule__DivExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2702:1: ( rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2703:2: rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group__0__Impl_in_rule__DivExpression__Group__05468);
            rule__DivExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group__1_in_rule__DivExpression__Group__05471);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2710:1: rule__DivExpression__Group__0__Impl : ( ruleAtomicValuedExpression ) ;
    public final void rule__DivExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2714:1: ( ( ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2715:1: ( ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2715:1: ( ruleAtomicValuedExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2716:1: ruleAtomicValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getAtomicValuedExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_rule__DivExpression__Group__0__Impl5498);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2727:1: rule__DivExpression__Group__1 : rule__DivExpression__Group__1__Impl rule__DivExpression__Group__2 ;
    public final void rule__DivExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2731:1: ( rule__DivExpression__Group__1__Impl rule__DivExpression__Group__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2732:2: rule__DivExpression__Group__1__Impl rule__DivExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group__1__Impl_in_rule__DivExpression__Group__15527);
            rule__DivExpression__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group__2_in_rule__DivExpression__Group__15530);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2739:1: rule__DivExpression__Group__1__Impl : ( () ) ;
    public final void rule__DivExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2743:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2744:1: ( () )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2744:1: ( () )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2745:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2746:1: ()
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2748:1: 
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2758:1: rule__DivExpression__Group__2 : rule__DivExpression__Group__2__Impl rule__DivExpression__Group__3 ;
    public final void rule__DivExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2762:1: ( rule__DivExpression__Group__2__Impl rule__DivExpression__Group__3 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2763:2: rule__DivExpression__Group__2__Impl rule__DivExpression__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group__2__Impl_in_rule__DivExpression__Group__25588);
            rule__DivExpression__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group__3_in_rule__DivExpression__Group__25591);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2770:1: rule__DivExpression__Group__2__Impl : ( ( rule__DivExpression__OperatorAssignment_2 ) ) ;
    public final void rule__DivExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2774:1: ( ( ( rule__DivExpression__OperatorAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2775:1: ( ( rule__DivExpression__OperatorAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2775:1: ( ( rule__DivExpression__OperatorAssignment_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2776:1: ( rule__DivExpression__OperatorAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorAssignment_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2777:1: ( rule__DivExpression__OperatorAssignment_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2777:2: rule__DivExpression__OperatorAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__OperatorAssignment_2_in_rule__DivExpression__Group__2__Impl5618);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2787:1: rule__DivExpression__Group__3 : rule__DivExpression__Group__3__Impl ;
    public final void rule__DivExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2791:1: ( rule__DivExpression__Group__3__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2792:2: rule__DivExpression__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group__3__Impl_in_rule__DivExpression__Group__35648);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2798:1: rule__DivExpression__Group__3__Impl : ( ( rule__DivExpression__SubExpressionsAssignment_3 ) ) ;
    public final void rule__DivExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2802:1: ( ( ( rule__DivExpression__SubExpressionsAssignment_3 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2803:1: ( ( rule__DivExpression__SubExpressionsAssignment_3 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2803:1: ( ( rule__DivExpression__SubExpressionsAssignment_3 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2804:1: ( rule__DivExpression__SubExpressionsAssignment_3 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getSubExpressionsAssignment_3()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2805:1: ( rule__DivExpression__SubExpressionsAssignment_3 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2805:2: rule__DivExpression__SubExpressionsAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__SubExpressionsAssignment_3_in_rule__DivExpression__Group__3__Impl5675);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2823:1: rule__ValuedObjectTestExpression__Group_0__0 : rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1 ;
    public final void rule__ValuedObjectTestExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2827:1: ( rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2828:2: rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__0__Impl_in_rule__ValuedObjectTestExpression__Group_0__05713);
            rule__ValuedObjectTestExpression__Group_0__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__1_in_rule__ValuedObjectTestExpression__Group_0__05716);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2835:1: rule__ValuedObjectTestExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2839:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2840:1: ( () )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2840:1: ( () )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2841:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2842:1: ()
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2844:1: 
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2854:1: rule__ValuedObjectTestExpression__Group_0__1 : rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2 ;
    public final void rule__ValuedObjectTestExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2858:1: ( rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2859:2: rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__1__Impl_in_rule__ValuedObjectTestExpression__Group_0__15774);
            rule__ValuedObjectTestExpression__Group_0__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__2_in_rule__ValuedObjectTestExpression__Group_0__15777);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2866:1: rule__ValuedObjectTestExpression__Group_0__1__Impl : ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2870:1: ( ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2871:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2871:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2872:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2873:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2873:2: rule__ValuedObjectTestExpression__OperatorAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__OperatorAssignment_0_1_in_rule__ValuedObjectTestExpression__Group_0__1__Impl5804);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2883:1: rule__ValuedObjectTestExpression__Group_0__2 : rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3 ;
    public final void rule__ValuedObjectTestExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2887:1: ( rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2888:2: rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__2__Impl_in_rule__ValuedObjectTestExpression__Group_0__25834);
            rule__ValuedObjectTestExpression__Group_0__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__3_in_rule__ValuedObjectTestExpression__Group_0__25837);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2895:1: rule__ValuedObjectTestExpression__Group_0__2__Impl : ( '(' ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2899:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2900:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2900:1: ( '(' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2901:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__ValuedObjectTestExpression__Group_0__2__Impl5865); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2914:1: rule__ValuedObjectTestExpression__Group_0__3 : rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4 ;
    public final void rule__ValuedObjectTestExpression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2918:1: ( rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2919:2: rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__3__Impl_in_rule__ValuedObjectTestExpression__Group_0__35896);
            rule__ValuedObjectTestExpression__Group_0__3__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__4_in_rule__ValuedObjectTestExpression__Group_0__35899);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2926:1: rule__ValuedObjectTestExpression__Group_0__3__Impl : ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2930:1: ( ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2931:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2931:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2932:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsAssignment_0_3()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2933:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2933:2: rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3_in_rule__ValuedObjectTestExpression__Group_0__3__Impl5926);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2943:1: rule__ValuedObjectTestExpression__Group_0__4 : rule__ValuedObjectTestExpression__Group_0__4__Impl ;
    public final void rule__ValuedObjectTestExpression__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2947:1: ( rule__ValuedObjectTestExpression__Group_0__4__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2948:2: rule__ValuedObjectTestExpression__Group_0__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__4__Impl_in_rule__ValuedObjectTestExpression__Group_0__45956);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2954:1: rule__ValuedObjectTestExpression__Group_0__4__Impl : ( ')' ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2958:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2959:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2959:1: ( ')' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2960:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4()); 
            }
            match(input,31,FollowSets000.FOLLOW_31_in_rule__ValuedObjectTestExpression__Group_0__4__Impl5984); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2983:1: rule__ValuedObjectTestExpression__Group_1__0 : rule__ValuedObjectTestExpression__Group_1__0__Impl rule__ValuedObjectTestExpression__Group_1__1 ;
    public final void rule__ValuedObjectTestExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2987:1: ( rule__ValuedObjectTestExpression__Group_1__0__Impl rule__ValuedObjectTestExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2988:2: rule__ValuedObjectTestExpression__Group_1__0__Impl rule__ValuedObjectTestExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_1__0__Impl_in_rule__ValuedObjectTestExpression__Group_1__06025);
            rule__ValuedObjectTestExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_1__1_in_rule__ValuedObjectTestExpression__Group_1__06028);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2995:1: rule__ValuedObjectTestExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ValuedObjectTestExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2999:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3000:1: ( () )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3000:1: ( () )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3001:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorExpressionAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3002:1: ()
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3004:1: 
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3014:1: rule__ValuedObjectTestExpression__Group_1__1 : rule__ValuedObjectTestExpression__Group_1__1__Impl rule__ValuedObjectTestExpression__Group_1__2 ;
    public final void rule__ValuedObjectTestExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3018:1: ( rule__ValuedObjectTestExpression__Group_1__1__Impl rule__ValuedObjectTestExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3019:2: rule__ValuedObjectTestExpression__Group_1__1__Impl rule__ValuedObjectTestExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_1__1__Impl_in_rule__ValuedObjectTestExpression__Group_1__16086);
            rule__ValuedObjectTestExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_1__2_in_rule__ValuedObjectTestExpression__Group_1__16089);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3026:1: rule__ValuedObjectTestExpression__Group_1__1__Impl : ( ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3030:1: ( ( ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3031:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3031:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3032:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3033:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3033:2: rule__ValuedObjectTestExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__OperatorAssignment_1_1_in_rule__ValuedObjectTestExpression__Group_1__1__Impl6116);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3043:1: rule__ValuedObjectTestExpression__Group_1__2 : rule__ValuedObjectTestExpression__Group_1__2__Impl ;
    public final void rule__ValuedObjectTestExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3047:1: ( rule__ValuedObjectTestExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3048:2: rule__ValuedObjectTestExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_1__2__Impl_in_rule__ValuedObjectTestExpression__Group_1__26146);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3054:1: rule__ValuedObjectTestExpression__Group_1__2__Impl : ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3058:1: ( ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3059:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3059:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3060:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3061:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3061:2: rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2_in_rule__ValuedObjectTestExpression__Group_1__2__Impl6173);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3077:1: rule__TextExpression__Group__0 : rule__TextExpression__Group__0__Impl rule__TextExpression__Group__1 ;
    public final void rule__TextExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3081:1: ( rule__TextExpression__Group__0__Impl rule__TextExpression__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3082:2: rule__TextExpression__Group__0__Impl rule__TextExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group__0__Impl_in_rule__TextExpression__Group__06209);
            rule__TextExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group__1_in_rule__TextExpression__Group__06212);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3089:1: rule__TextExpression__Group__0__Impl : ( ( rule__TextExpression__CodeAssignment_0 ) ) ;
    public final void rule__TextExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3093:1: ( ( ( rule__TextExpression__CodeAssignment_0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3094:1: ( ( rule__TextExpression__CodeAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3094:1: ( ( rule__TextExpression__CodeAssignment_0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3095:1: ( rule__TextExpression__CodeAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getCodeAssignment_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3096:1: ( rule__TextExpression__CodeAssignment_0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3096:2: rule__TextExpression__CodeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__CodeAssignment_0_in_rule__TextExpression__Group__0__Impl6239);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3106:1: rule__TextExpression__Group__1 : rule__TextExpression__Group__1__Impl ;
    public final void rule__TextExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3110:1: ( rule__TextExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3111:2: rule__TextExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group__1__Impl_in_rule__TextExpression__Group__16269);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3117:1: rule__TextExpression__Group__1__Impl : ( ( rule__TextExpression__Group_1__0 )? ) ;
    public final void rule__TextExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3121:1: ( ( ( rule__TextExpression__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3122:1: ( ( rule__TextExpression__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3122:1: ( ( rule__TextExpression__Group_1__0 )? )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3123:1: ( rule__TextExpression__Group_1__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3124:1: ( rule__TextExpression__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3124:2: rule__TextExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group_1__0_in_rule__TextExpression__Group__1__Impl6296);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3138:1: rule__TextExpression__Group_1__0 : rule__TextExpression__Group_1__0__Impl rule__TextExpression__Group_1__1 ;
    public final void rule__TextExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3142:1: ( rule__TextExpression__Group_1__0__Impl rule__TextExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3143:2: rule__TextExpression__Group_1__0__Impl rule__TextExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group_1__0__Impl_in_rule__TextExpression__Group_1__06331);
            rule__TextExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group_1__1_in_rule__TextExpression__Group_1__06334);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3150:1: rule__TextExpression__Group_1__0__Impl : ( '(' ) ;
    public final void rule__TextExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3154:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3155:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3155:1: ( '(' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3156:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__TextExpression__Group_1__0__Impl6362); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3169:1: rule__TextExpression__Group_1__1 : rule__TextExpression__Group_1__1__Impl rule__TextExpression__Group_1__2 ;
    public final void rule__TextExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3173:1: ( rule__TextExpression__Group_1__1__Impl rule__TextExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3174:2: rule__TextExpression__Group_1__1__Impl rule__TextExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group_1__1__Impl_in_rule__TextExpression__Group_1__16393);
            rule__TextExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group_1__2_in_rule__TextExpression__Group_1__16396);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3181:1: rule__TextExpression__Group_1__1__Impl : ( ( rule__TextExpression__TypeAssignment_1_1 ) ) ;
    public final void rule__TextExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3185:1: ( ( ( rule__TextExpression__TypeAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3186:1: ( ( rule__TextExpression__TypeAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3186:1: ( ( rule__TextExpression__TypeAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3187:1: ( rule__TextExpression__TypeAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getTypeAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3188:1: ( rule__TextExpression__TypeAssignment_1_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3188:2: rule__TextExpression__TypeAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__TypeAssignment_1_1_in_rule__TextExpression__Group_1__1__Impl6423);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3198:1: rule__TextExpression__Group_1__2 : rule__TextExpression__Group_1__2__Impl ;
    public final void rule__TextExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3202:1: ( rule__TextExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3203:2: rule__TextExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group_1__2__Impl_in_rule__TextExpression__Group_1__26453);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3209:1: rule__TextExpression__Group_1__2__Impl : ( ')' ) ;
    public final void rule__TextExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3213:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3214:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3214:1: ( ')' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3215:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,31,FollowSets000.FOLLOW_31_in_rule__TextExpression__Group_1__2__Impl6481); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3234:1: rule__KeyValueAnnotation__Group__0 : rule__KeyValueAnnotation__Group__0__Impl rule__KeyValueAnnotation__Group__1 ;
    public final void rule__KeyValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3238:1: ( rule__KeyValueAnnotation__Group__0__Impl rule__KeyValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3239:2: rule__KeyValueAnnotation__Group__0__Impl rule__KeyValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyValueAnnotation__Group__0__Impl_in_rule__KeyValueAnnotation__Group__06518);
            rule__KeyValueAnnotation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyValueAnnotation__Group__1_in_rule__KeyValueAnnotation__Group__06521);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3246:1: rule__KeyValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3250:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3251:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3251:1: ( '@' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3252:1: '@'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__KeyValueAnnotation__Group__0__Impl6549); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3265:1: rule__KeyValueAnnotation__Group__1 : rule__KeyValueAnnotation__Group__1__Impl rule__KeyValueAnnotation__Group__2 ;
    public final void rule__KeyValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3269:1: ( rule__KeyValueAnnotation__Group__1__Impl rule__KeyValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3270:2: rule__KeyValueAnnotation__Group__1__Impl rule__KeyValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyValueAnnotation__Group__1__Impl_in_rule__KeyValueAnnotation__Group__16580);
            rule__KeyValueAnnotation__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyValueAnnotation__Group__2_in_rule__KeyValueAnnotation__Group__16583);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3277:1: rule__KeyValueAnnotation__Group__1__Impl : ( ( rule__KeyValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3281:1: ( ( ( rule__KeyValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3282:1: ( ( rule__KeyValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3282:1: ( ( rule__KeyValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3283:1: ( rule__KeyValueAnnotation__NameAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3284:1: ( rule__KeyValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3284:2: rule__KeyValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyValueAnnotation__NameAssignment_1_in_rule__KeyValueAnnotation__Group__1__Impl6610);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3294:1: rule__KeyValueAnnotation__Group__2 : rule__KeyValueAnnotation__Group__2__Impl ;
    public final void rule__KeyValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3298:1: ( rule__KeyValueAnnotation__Group__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3299:2: rule__KeyValueAnnotation__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyValueAnnotation__Group__2__Impl_in_rule__KeyValueAnnotation__Group__26640);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3305:1: rule__KeyValueAnnotation__Group__2__Impl : ( ( rule__KeyValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3309:1: ( ( ( rule__KeyValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3310:1: ( ( rule__KeyValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3310:1: ( ( rule__KeyValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3311:1: ( rule__KeyValueAnnotation__ValueAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyValueAnnotationAccess().getValueAssignment_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3312:1: ( rule__KeyValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3312:2: rule__KeyValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyValueAnnotation__ValueAssignment_2_in_rule__KeyValueAnnotation__Group__2__Impl6667);
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


    // $ANTLR start rule__OrExpression__OperatorAssignment_1_1
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3329:1: rule__OrExpression__OperatorAssignment_1_1 : ( ruleOrOperator ) ;
    public final void rule__OrExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3333:1: ( ( ruleOrOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3334:1: ( ruleOrOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3334:1: ( ruleOrOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3335:1: ruleOrOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrOperator_in_rule__OrExpression__OperatorAssignment_1_16708);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3344:1: rule__OrExpression__SubExpressionsAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3348:1: ( ( ruleAndExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3349:1: ( ruleAndExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3349:1: ( ruleAndExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3350:1: ruleAndExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getSubExpressionsAndExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_rule__OrExpression__SubExpressionsAssignment_1_26739);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3359:1: rule__AndExpression__OperatorAssignment_1_1 : ( ruleAndOperator ) ;
    public final void rule__AndExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3363:1: ( ( ruleAndOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3364:1: ( ruleAndOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3364:1: ( ruleAndOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3365:1: ruleAndOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndOperator_in_rule__AndExpression__OperatorAssignment_1_16770);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3374:1: rule__AndExpression__SubExpressionsAssignment_1_2 : ( ruleCompareOperation ) ;
    public final void rule__AndExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3378:1: ( ( ruleCompareOperation ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3379:1: ( ruleCompareOperation )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3379:1: ( ruleCompareOperation )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3380:1: ruleCompareOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_rule__AndExpression__SubExpressionsAssignment_1_26801);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3389:1: rule__CompareOperation__OperatorAssignment_0_1_1 : ( ruleCompareOperator ) ;
    public final void rule__CompareOperation__OperatorAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3393:1: ( ( ruleCompareOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3394:1: ( ruleCompareOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3394:1: ( ruleCompareOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3395:1: ruleCompareOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_0_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperator_in_rule__CompareOperation__OperatorAssignment_0_1_16832);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3404:1: rule__CompareOperation__SubExpressionsAssignment_0_1_2 : ( ruleNotOrValuedExpression ) ;
    public final void rule__CompareOperation__SubExpressionsAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3408:1: ( ( ruleNotOrValuedExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3409:1: ( ruleNotOrValuedExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3409:1: ( ruleNotOrValuedExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3410:1: ruleNotOrValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_0_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_rule__CompareOperation__SubExpressionsAssignment_0_1_26863);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3419:1: rule__AddExpression__OperatorAssignment_1_1 : ( ruleAddOperator ) ;
    public final void rule__AddExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3423:1: ( ( ruleAddOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3424:1: ( ruleAddOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3424:1: ( ruleAddOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3425:1: ruleAddOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddOperator_in_rule__AddExpression__OperatorAssignment_1_16894);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3434:1: rule__AddExpression__SubExpressionsAssignment_1_2 : ( ruleSubExpression ) ;
    public final void rule__AddExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3438:1: ( ( ruleSubExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3439:1: ( ruleSubExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3439:1: ( ruleSubExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3440:1: ruleSubExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_rule__AddExpression__SubExpressionsAssignment_1_26925);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3449:1: rule__SubExpression__OperatorAssignment_1_1 : ( ruleSubOperator ) ;
    public final void rule__SubExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3453:1: ( ( ruleSubOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3454:1: ( ruleSubOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3454:1: ( ruleSubOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3455:1: ruleSubOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubOperator_in_rule__SubExpression__OperatorAssignment_1_16956);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3464:1: rule__SubExpression__SubExpressionsAssignment_1_2 : ( ruleMultExpression ) ;
    public final void rule__SubExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3468:1: ( ( ruleMultExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3469:1: ( ruleMultExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3469:1: ( ruleMultExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3470:1: ruleMultExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_rule__SubExpression__SubExpressionsAssignment_1_26987);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3479:1: rule__MultExpression__OperatorAssignment_1_1 : ( ruleMultOperator ) ;
    public final void rule__MultExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3483:1: ( ( ruleMultOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3484:1: ( ruleMultOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3484:1: ( ruleMultOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3485:1: ruleMultOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultOperator_in_rule__MultExpression__OperatorAssignment_1_17018);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3494:1: rule__MultExpression__SubExpressionsAssignment_1_2 : ( ruleModExpression ) ;
    public final void rule__MultExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3498:1: ( ( ruleModExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3499:1: ( ruleModExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3499:1: ( ruleModExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3500:1: ruleModExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_rule__MultExpression__SubExpressionsAssignment_1_27049);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3509:1: rule__ModExpression__OperatorAssignment_1_1 : ( ruleModOperator ) ;
    public final void rule__ModExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3513:1: ( ( ruleModOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3514:1: ( ruleModOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3514:1: ( ruleModOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3515:1: ruleModOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModOperator_in_rule__ModExpression__OperatorAssignment_1_17080);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3524:1: rule__ModExpression__SubExpressionsAssignment_1_2 : ( ruleAtomicValuedExpression ) ;
    public final void rule__ModExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3528:1: ( ( ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3529:1: ( ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3529:1: ( ruleAtomicValuedExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3530:1: ruleAtomicValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_rule__ModExpression__SubExpressionsAssignment_1_27111);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3539:1: rule__NotExpression__OperatorAssignment_0_1 : ( ruleNotOperator ) ;
    public final void rule__NotExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3543:1: ( ( ruleNotOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3544:1: ( ruleNotOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3544:1: ( ruleNotOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3545:1: ruleNotOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotOperator_in_rule__NotExpression__OperatorAssignment_0_17142);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3554:1: rule__NotExpression__SubExpressionsAssignment_0_2 : ( ruleNotExpression ) ;
    public final void rule__NotExpression__SubExpressionsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3558:1: ( ( ruleNotExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3559:1: ( ruleNotExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3559:1: ( ruleNotExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3560:1: ruleNotExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_rule__NotExpression__SubExpressionsAssignment_0_27173);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3569:1: rule__DivExpression__OperatorAssignment_2 : ( ruleDivOperator ) ;
    public final void rule__DivExpression__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3573:1: ( ( ruleDivOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3574:1: ( ruleDivOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3574:1: ( ruleDivOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3575:1: ruleDivOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivOperator_in_rule__DivExpression__OperatorAssignment_27204);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3584:1: rule__DivExpression__SubExpressionsAssignment_3 : ( ruleAtomicValuedExpression ) ;
    public final void rule__DivExpression__SubExpressionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3588:1: ( ( ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3589:1: ( ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3589:1: ( ruleAtomicValuedExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3590:1: ruleAtomicValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_rule__DivExpression__SubExpressionsAssignment_37235);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3599:1: rule__ValuedObjectTestExpression__OperatorAssignment_0_1 : ( rulePreOperator ) ;
    public final void rule__ValuedObjectTestExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3603:1: ( ( rulePreOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3604:1: ( rulePreOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3604:1: ( rulePreOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3605:1: rulePreOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePreOperator_in_rule__ValuedObjectTestExpression__OperatorAssignment_0_17266);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3614:1: rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 : ( ruleValuedObjectTestExpression ) ;
    public final void rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3618:1: ( ( ruleValuedObjectTestExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3619:1: ( ruleValuedObjectTestExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3619:1: ( ruleValuedObjectTestExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3620:1: ruleValuedObjectTestExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_37297);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3629:1: rule__ValuedObjectTestExpression__OperatorAssignment_1_1 : ( ruleValueTestOperator ) ;
    public final void rule__ValuedObjectTestExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3633:1: ( ( ruleValueTestOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3634:1: ( ruleValueTestOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3634:1: ( ruleValueTestOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3635:1: ruleValueTestOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValueTestOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValueTestOperator_in_rule__ValuedObjectTestExpression__OperatorAssignment_1_17328);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3644:1: rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 : ( ruleValuedObjectReference ) ;
    public final void rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3648:1: ( ( ruleValuedObjectReference ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3649:1: ( ruleValuedObjectReference )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3649:1: ( ruleValuedObjectReference )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3650:1: ruleValuedObjectReference
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectReferenceParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObjectReference_in_rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_27359);
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3659:1: rule__ValuedObjectReference__ValuedObjectAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ValuedObjectReference__ValuedObjectAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3663:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3664:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3664:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3665:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3666:1: ( RULE_ID )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3667:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ValuedObjectReference__ValuedObjectAssignment7394); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3678:1: rule__TextExpression__CodeAssignment_0 : ( RULE_STRING ) ;
    public final void rule__TextExpression__CodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3682:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3683:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3683:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3684:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getCodeSTRINGTerminalRuleCall_0_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__TextExpression__CodeAssignment_07429); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3693:1: rule__TextExpression__TypeAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__TextExpression__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3697:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3698:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3698:1: ( RULE_ID )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3699:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getTypeIDTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__TextExpression__TypeAssignment_1_17460); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3708:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3712:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3713:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3713:1: ( RULE_INT )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3714:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment7491); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3723:1: rule__FloatValue__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3727:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3728:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3728:1: ( RULE_FLOAT )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3729:1: RULE_FLOAT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueFloatTerminalRuleCall_0()); 
            }
            match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_rule__FloatValue__ValueAssignment7522); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3738:1: rule__BooleanValue__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3742:1: ( ( RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3743:1: ( RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3743:1: ( RULE_BOOLEAN )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3744:1: RULE_BOOLEAN
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueBooleanTerminalRuleCall_0()); 
            }
            match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_rule__BooleanValue__ValueAssignment7553); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3753:1: rule__CommentAnnotation__ValueAssignment : ( RULE_COMMENT_ANNOTATION ) ;
    public final void rule__CommentAnnotation__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3757:1: ( ( RULE_COMMENT_ANNOTATION ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3758:1: ( RULE_COMMENT_ANNOTATION )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3758:1: ( RULE_COMMENT_ANNOTATION )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3759:1: RULE_COMMENT_ANNOTATION
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationAccess().getValueCOMMENT_ANNOTATIONTerminalRuleCall_0()); 
            }
            match(input,RULE_COMMENT_ANNOTATION,FollowSets000.FOLLOW_RULE_COMMENT_ANNOTATION_in_rule__CommentAnnotation__ValueAssignment7584); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3768:1: rule__KeyValueAnnotation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__KeyValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3772:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3773:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3773:1: ( RULE_ID )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3774:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyValueAnnotationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__KeyValueAnnotation__NameAssignment_17615); if (failed) return ;
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
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3783:1: rule__KeyValueAnnotation__ValueAssignment_2 : ( ruleEString ) ;
    public final void rule__KeyValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3787:1: ( ( ruleEString ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3788:1: ( ruleEString )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3788:1: ( ruleEString )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3789:1: ruleEString
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyValueAnnotationAccess().getValueEStringParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__KeyValueAnnotation__ValueAssignment_27646);
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

    // $ANTLR start synpred1
    public final void synpred1_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:966:1: ( ( ruleBooleanExpression ) )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:966:1: ( ruleBooleanExpression )
        {
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:966:1: ( ruleBooleanExpression )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:967:1: ruleBooleanExpression
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall_0()); 
        }
        pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_synpred11948);
        ruleBooleanExpression();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:988:1: ( ( ( rule__CompareOperation__Group_0__0 ) ) )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:988:1: ( ( rule__CompareOperation__Group_0__0 ) )
        {
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:988:1: ( ( rule__CompareOperation__Group_0__0 ) )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:989:1: ( rule__CompareOperation__Group_0__0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getCompareOperationAccess().getGroup_0()); 
        }
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:990:1: ( rule__CompareOperation__Group_0__0 )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:990:2: rule__CompareOperation__Group_0__0
        {
        pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0__0_in_synpred21997);
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
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1010:1: ( ( ruleValuedExpression ) )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1010:1: ( ruleValuedExpression )
        {
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1010:1: ( ruleValuedExpression )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1011:1: ruleValuedExpression
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
        }
        pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_synpred32047);
        ruleValuedExpression();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred3

    // $ANTLR start synpred10
    public final void synpred10_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1100:6: ( ( ( rule__AtomicValuedExpression__Group_2__0 ) ) )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1100:6: ( ( rule__AtomicValuedExpression__Group_2__0 ) )
        {
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1100:6: ( ( rule__AtomicValuedExpression__Group_2__0 ) )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1101:1: ( rule__AtomicValuedExpression__Group_2__0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_2()); 
        }
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1102:1: ( rule__AtomicValuedExpression__Group_2__0 )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1102:2: rule__AtomicValuedExpression__Group_2__0
        {
        pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_2__0_in_synpred102264);
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
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1106:6: ( ( ( rule__AtomicValuedExpression__Group_3__0 ) ) )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1106:6: ( ( rule__AtomicValuedExpression__Group_3__0 ) )
        {
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1106:6: ( ( rule__AtomicValuedExpression__Group_3__0 ) )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1107:1: ( rule__AtomicValuedExpression__Group_3__0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_3()); 
        }
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1108:1: ( rule__AtomicValuedExpression__Group_3__0 )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1108:2: rule__AtomicValuedExpression__Group_3__0
        {
        pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_3__0_in_synpred112282);
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
        "\1\4\2\22\2\0\1\36\1\5\2\0\1\uffff\4\4\1\uffff\2\0\2\22\1\0\1\22"+
        "\1\36\1\5\4\22\1\0\1\22\1\36\1\5\4\22\1\0\1\22\1\36\1\5\4\22\1\0"+
        "\1\22\1\36\1\5\2\22\1\0\1\22\1\5\1\4\1\0\1\22\1\5\2\4\1\0\1\22\1"+
        "\5\3\4\1\0\1\22\1\5\1\37\2\22\1\0\1\22\1\36\1\5\2\22\1\37\2\22\1"+
        "\0\1\22\1\36\1\5\4\22\1\0\1\22\1\36\1\5\2\22\1\37\2\22\1\0\1\22"+
        "\1\36\1\5\4\22\1\0\1\22\1\36\1\5\4\22\1\0\1\22\1\36\1\5\2\22\1\37"+
        "\1\22\1\0\1\22\1\5\1\22\1\0\1\22\1\5\1\4\1\0\1\22\1\5\1\22\1\0\1"+
        "\22\1\5\1\4\1\0\1\22\1\5\2\4\1\0\1\22\1\5\1\22\2\37\2\22\1\0\1\22"+
        "\1\36\1\5\2\22\2\37\2\22\1\0\1\22\1\36\1\5\2\22\1\37\2\22\1\0\1"+
        "\22\1\36\1\5\4\22\1\0\1\22\1\36\1\5\2\22\1\37\2\22\1\0\1\22\1\5"+
        "\2\22\1\0\1\22\1\5\1\22\1\0\1\22\1\5\1\4\1\0\1\22\1\5\1\22\3\37"+
        "\2\22\1\0\1\22\1\36\1\5\2\22\1\37\3\22\1\0\1\22\1\5\1\22\1\37\1"+
        "\22";
    static final String DFA1_maxS =
        "\1\36\2\35\2\0\1\36\1\5\2\0\1\uffff\4\36\1\uffff\2\0\2\35\1\0\1"+
        "\35\1\36\1\5\1\35\1\36\2\35\1\0\1\35\1\36\1\5\1\35\1\36\2\35\1\0"+
        "\1\35\1\36\1\5\1\35\1\36\2\35\1\0\1\35\1\36\1\5\1\35\1\36\1\0\1"+
        "\35\1\5\1\36\1\0\1\35\1\5\2\36\1\0\1\35\1\5\3\36\1\0\1\35\1\5\1"+
        "\37\2\35\1\0\1\35\1\36\1\5\1\35\1\36\1\37\2\35\1\0\1\35\1\36\1\5"+
        "\1\35\1\36\2\35\1\0\1\35\1\36\1\5\1\35\1\36\1\37\2\35\1\0\1\35\1"+
        "\36\1\5\1\35\1\36\2\35\1\0\1\35\1\36\1\5\1\35\1\36\2\35\1\0\1\35"+
        "\1\36\1\5\1\35\1\36\1\37\1\35\1\0\1\35\1\5\1\35\1\0\1\35\1\5\1\36"+
        "\1\0\1\35\1\5\1\35\1\0\1\35\1\5\1\36\1\0\1\35\1\5\2\36\1\0\1\35"+
        "\1\5\1\35\2\37\2\35\1\0\1\35\1\36\1\5\1\35\1\36\2\37\2\35\1\0\1"+
        "\35\1\36\1\5\1\35\1\36\1\37\2\35\1\0\1\35\1\36\1\5\1\35\1\36\2\35"+
        "\1\0\1\35\1\36\1\5\1\35\1\36\1\37\2\35\1\0\1\35\1\5\2\35\1\0\1\35"+
        "\1\5\1\35\1\0\1\35\1\5\1\36\1\0\1\35\1\5\1\35\3\37\2\35\1\0\1\35"+
        "\1\36\1\5\1\35\1\36\1\37\3\35\1\0\1\35\1\5\1\35\1\37\1\35";
    static final String DFA1_acceptS =
        "\11\uffff\1\1\4\uffff\1\2\u00d0\uffff";
    static final String DFA1_specialS =
        "\3\uffff\1\15\1\32\2\uffff\1\1\1\21\6\uffff\1\11\1\20\2\uffff\1"+
        "\37\7\uffff\1\40\7\uffff\1\13\7\uffff\1\17\5\uffff\1\4\3\uffff\1"+
        "\25\4\uffff\1\24\5\uffff\1\23\5\uffff\1\42\10\uffff\1\36\7\uffff"+
        "\1\12\10\uffff\1\35\7\uffff\1\33\7\uffff\1\14\7\uffff\1\5\3\uffff"+
        "\1\26\3\uffff\1\6\3\uffff\1\27\3\uffff\1\7\4\uffff\1\30\7\uffff"+
        "\1\34\11\uffff\1\43\10\uffff\1\0\7\uffff\1\41\10\uffff\1\10\4\uffff"+
        "\1\31\3\uffff\1\3\3\uffff\1\2\10\uffff\1\16\11\uffff\1\22\5\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\10\1\7\1\1\1\2\1\4\5\uffff\1\5\2\uffff\1\11\5\uffff\1\6\6"+
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
            "\1\30\1\27\1\21\1\22\1\24\5\uffff\1\25\10\uffff\1\26\6\uffff"+
            "\1\23",
            "\1\40\1\37\1\31\1\32\1\34\5\uffff\1\35\10\uffff\1\36\6\uffff"+
            "\1\33",
            "\1\50\1\47\1\41\1\42\1\44\5\uffff\1\45\10\uffff\1\46\6\uffff"+
            "\1\43",
            "\1\60\1\57\1\51\1\52\1\54\5\uffff\1\55\10\uffff\1\56\6\uffff"+
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
            "\1\113\1\112\1\104\1\105\1\107\5\uffff\1\110\10\uffff\1\111"+
            "\6\uffff\1\106",
            "\1\uffff",
            "\1\15\1\14\1\13\1\64\2\uffff\6\11",
            "\1\114",
            "\1\124\1\123\1\115\1\116\1\120\5\uffff\1\121\10\uffff\1\122"+
            "\6\uffff\1\117",
            "\1\134\1\133\1\125\1\126\1\130\5\uffff\1\131\10\uffff\1\132"+
            "\6\uffff\1\127",
            "\1\uffff",
            "\1\15\1\14\1\71\1\70\2\uffff\6\11",
            "\1\135",
            "\1\145\1\144\1\136\1\137\1\141\5\uffff\1\142\10\uffff\1\143"+
            "\6\uffff\1\140",
            "\1\155\1\154\1\146\1\147\1\151\5\uffff\1\152\10\uffff\1\153"+
            "\6\uffff\1\150",
            "\1\165\1\164\1\156\1\157\1\161\5\uffff\1\162\10\uffff\1\163"+
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
            "\1\u009a\1\u0099\1\u0093\1\u0094\1\u0096\5\uffff\1\u0097\10"+
            "\uffff\1\u0098\6\uffff\1\u0095",
            "\1\uffff",
            "\1\15\1\14\1\71\1\177\2\uffff\6\11",
            "\1\u009b",
            "\1\15\1\14\1\71\1\70\2\uffff\6\11",
            "\1\uffff",
            "\1\15\1\77\1\76\3\uffff\6\11",
            "\1\u009c",
            "\1\u00a4\1\u00a3\1\u009d\1\u009e\1\u00a0\5\uffff\1\u00a1\10"+
            "\uffff\1\u00a2\6\uffff\1\u009f",
            "\1\uffff",
            "\1\15\1\77\1\76\1\u0087\2\uffff\6\11",
            "\1\u00a5",
            "\1\u00ad\1\u00ac\1\u00a6\1\u00a7\1\u00a9\5\uffff\1\u00aa\10"+
            "\uffff\1\u00ab\6\uffff\1\u00a8",
            "\1\u00b5\1\u00b4\1\u00ae\1\u00af\1\u00b1\5\uffff\1\u00b2\10"+
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
            "\1\u00d4\1\u00d3\1\u00cd\1\u00ce\1\u00d0\5\uffff\1\u00d1\10"+
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
            return "961:1: rule__Expression__Alternatives : ( ( ruleBooleanExpression ) | ( ruleValuedExpression ) );";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_168 = input.LA(1);

                         
                        int index1_168 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_168);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_7 = input.LA(1);

                         
                        int index1_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_198 = input.LA(1);

                         
                        int index1_198 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_198);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA1_194 = input.LA(1);

                         
                        int index1_194 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_194);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA1_49 = input.LA(1);

                         
                        int index1_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_49);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA1_120 = input.LA(1);

                         
                        int index1_120 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_120);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA1_128 = input.LA(1);

                         
                        int index1_128 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_128);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA1_136 = input.LA(1);

                         
                        int index1_136 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_136);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA1_185 = input.LA(1);

                         
                        int index1_185 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_185);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA1_15 = input.LA(1);

                         
                        int index1_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_15);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA1_87 = input.LA(1);

                         
                        int index1_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_87);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA1_35 = input.LA(1);

                         
                        int index1_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_35);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA1_112 = input.LA(1);

                         
                        int index1_112 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_112);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA1_3 = input.LA(1);

                         
                        int index1_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_3);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA1_207 = input.LA(1);

                         
                        int index1_207 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_207);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA1_43 = input.LA(1);

                         
                        int index1_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_43);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA1_16 = input.LA(1);

                         
                        int index1_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_16);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA1_8 = input.LA(1);

                         
                        int index1_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_8);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA1_217 = input.LA(1);

                         
                        int index1_217 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_217);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA1_64 = input.LA(1);

                         
                        int index1_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_64);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA1_58 = input.LA(1);

                         
                        int index1_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_58);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA1_53 = input.LA(1);

                         
                        int index1_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_53);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA1_124 = input.LA(1);

                         
                        int index1_124 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_124);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA1_132 = input.LA(1);

                         
                        int index1_132 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_132);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA1_141 = input.LA(1);

                         
                        int index1_141 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_141);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA1_190 = input.LA(1);

                         
                        int index1_190 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_190);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA1_4 = input.LA(1);

                         
                        int index1_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_4);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA1_104 = input.LA(1);

                         
                        int index1_104 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_104);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA1_149 = input.LA(1);

                         
                        int index1_149 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_149);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA1_96 = input.LA(1);

                         
                        int index1_96 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_96);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA1_79 = input.LA(1);

                         
                        int index1_79 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_79);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA1_19 = input.LA(1);

                         
                        int index1_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_19);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA1_27 = input.LA(1);

                         
                        int index1_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_27);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA1_176 = input.LA(1);

                         
                        int index1_176 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_176);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA1_70 = input.LA(1);

                         
                        int index1_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_70);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA1_159 = input.LA(1);

                         
                        int index1_159 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_159);
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
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation1329 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCommentAnnotation1336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CommentAnnotation__ValueAssignment_in_ruleCommentAnnotation1362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyValueAnnotation_in_entryRuleKeyValueAnnotation1389 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyValueAnnotation1396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyValueAnnotation__Group__0_in_ruleKeyValueAnnotation1422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1449 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString1482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperator__Alternatives_in_ruleCompareOperator1519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rulePreOperator1556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleOrOperator1595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleAndOperator1634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleNotOperator1673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleAddOperator1712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleSubOperator1751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleMultOperator1790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleModOperator1829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleDivOperator1868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleValueTestOperator1907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__Expression__Alternatives1948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_rule__Expression__Alternatives1965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0__0_in_rule__CompareOperation__Alternatives1997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_rule__CompareOperation__Alternatives2015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_rule__NotOrValuedExpression__Alternatives2047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_rule__NotOrValuedExpression__Alternatives2064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__0_in_rule__NotExpression__Alternatives2096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_rule__NotExpression__Alternatives2114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanValue_in_rule__AtomicExpression__Alternatives2146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_rule__AtomicExpression__Alternatives2163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__0_in_rule__AtomicExpression__Alternatives2180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_rule__AtomicExpression__Alternatives2198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValue_in_rule__AtomicValuedExpression__Alternatives2230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_rule__AtomicValuedExpression__Alternatives2247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__0_in_rule__AtomicValuedExpression__Alternatives2264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_3__0_in_rule__AtomicValuedExpression__Alternatives2282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_rule__AtomicValuedExpression__Alternatives2300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__0_in_rule__ValuedObjectTestExpression__Alternatives2332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_1__0_in_rule__ValuedObjectTestExpression__Alternatives2350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectReference_in_rule__ValuedObjectTestExpression__Alternatives2368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives2402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives2419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__CompareOperator__Alternatives2452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__CompareOperator__Alternatives2473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__CompareOperator__Alternatives2494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__CompareOperator__Alternatives2515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__CompareOperator__Alternatives2536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__CompareOperator__Alternatives2557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__02592 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__02595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__Group__0__Impl2622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__12651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl2678 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__02713 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__02716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__12774 = new BitSet(new long[]{0x00000000408241F0L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__2_in_rule__OrExpression__Group_1__12777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__OperatorAssignment_1_1_in_rule__OrExpression__Group_1__1__Impl2804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__2__Impl_in_rule__OrExpression__Group_1__22834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__SubExpressionsAssignment_1_2_in_rule__OrExpression__Group_1__2__Impl2861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__02897 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__02900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_rule__AndExpression__Group__0__Impl2927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__12956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl2983 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__03018 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__03021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__13079 = new BitSet(new long[]{0x00000000408241F0L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__2_in_rule__AndExpression__Group_1__13082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__OperatorAssignment_1_1_in_rule__AndExpression__Group_1__1__Impl3109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__2__Impl_in_rule__AndExpression__Group_1__23139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__SubExpressionsAssignment_1_2_in_rule__AndExpression__Group_1__2__Impl3166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0__0__Impl_in_rule__CompareOperation__Group_0__03202 = new BitSet(new long[]{0x000000003F000000L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0__1_in_rule__CompareOperation__Group_0__03205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_rule__CompareOperation__Group_0__0__Impl3232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0__1__Impl_in_rule__CompareOperation__Group_0__13261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__0_in_rule__CompareOperation__Group_0__1__Impl3288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__0__Impl_in_rule__CompareOperation__Group_0_1__03322 = new BitSet(new long[]{0x000000003F000000L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__1_in_rule__CompareOperation__Group_0_1__03325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__1__Impl_in_rule__CompareOperation__Group_0_1__13383 = new BitSet(new long[]{0x00000000408241F0L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__2_in_rule__CompareOperation__Group_0_1__13386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__OperatorAssignment_0_1_1_in_rule__CompareOperation__Group_0_1__1__Impl3413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__2__Impl_in_rule__CompareOperation__Group_0_1__23443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__SubExpressionsAssignment_0_1_2_in_rule__CompareOperation__Group_0_1__2__Impl3470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__0__Impl_in_rule__AddExpression__Group__03506 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__1_in_rule__AddExpression__Group__03509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubExpression_in_rule__AddExpression__Group__0__Impl3536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__1__Impl_in_rule__AddExpression__Group__13565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__0_in_rule__AddExpression__Group__1__Impl3592 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__0__Impl_in_rule__AddExpression__Group_1__03627 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__1_in_rule__AddExpression__Group_1__03630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__1__Impl_in_rule__AddExpression__Group_1__13688 = new BitSet(new long[]{0x00000000408041F0L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__2_in_rule__AddExpression__Group_1__13691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__OperatorAssignment_1_1_in_rule__AddExpression__Group_1__1__Impl3718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__2__Impl_in_rule__AddExpression__Group_1__23748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__SubExpressionsAssignment_1_2_in_rule__AddExpression__Group_1__2__Impl3775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group__0__Impl_in_rule__SubExpression__Group__03811 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group__1_in_rule__SubExpression__Group__03814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_rule__SubExpression__Group__0__Impl3841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group__1__Impl_in_rule__SubExpression__Group__13870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__0_in_rule__SubExpression__Group__1__Impl3897 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__0__Impl_in_rule__SubExpression__Group_1__03932 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__1_in_rule__SubExpression__Group_1__03935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__1__Impl_in_rule__SubExpression__Group_1__13993 = new BitSet(new long[]{0x00000000408041F0L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__2_in_rule__SubExpression__Group_1__13996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__OperatorAssignment_1_1_in_rule__SubExpression__Group_1__1__Impl4023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__2__Impl_in_rule__SubExpression__Group_1__24053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__SubExpressionsAssignment_1_2_in_rule__SubExpression__Group_1__2__Impl4080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__0__Impl_in_rule__MultExpression__Group__04116 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__1_in_rule__MultExpression__Group__04119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_rule__MultExpression__Group__0__Impl4146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__1__Impl_in_rule__MultExpression__Group__14175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__0_in_rule__MultExpression__Group__1__Impl4202 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__0__Impl_in_rule__MultExpression__Group_1__04237 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__1_in_rule__MultExpression__Group_1__04240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__1__Impl_in_rule__MultExpression__Group_1__14298 = new BitSet(new long[]{0x00000000408041F0L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__2_in_rule__MultExpression__Group_1__14301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__OperatorAssignment_1_1_in_rule__MultExpression__Group_1__1__Impl4328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__2__Impl_in_rule__MultExpression__Group_1__24358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__SubExpressionsAssignment_1_2_in_rule__MultExpression__Group_1__2__Impl4385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group__0__Impl_in_rule__ModExpression__Group__04421 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group__1_in_rule__ModExpression__Group__04424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_rule__ModExpression__Group__0__Impl4451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group__1__Impl_in_rule__ModExpression__Group__14480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__0_in_rule__ModExpression__Group__1__Impl4507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__0__Impl_in_rule__ModExpression__Group_1__04542 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__1_in_rule__ModExpression__Group_1__04545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__1__Impl_in_rule__ModExpression__Group_1__14603 = new BitSet(new long[]{0x00000000408041F0L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__2_in_rule__ModExpression__Group_1__14606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__OperatorAssignment_1_1_in_rule__ModExpression__Group_1__1__Impl4633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__2__Impl_in_rule__ModExpression__Group_1__24663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__SubExpressionsAssignment_1_2_in_rule__ModExpression__Group_1__2__Impl4690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__0__Impl_in_rule__NotExpression__Group_0__04726 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__1_in_rule__NotExpression__Group_0__04729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__1__Impl_in_rule__NotExpression__Group_0__14787 = new BitSet(new long[]{0x0000000040824130L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__2_in_rule__NotExpression__Group_0__14790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__OperatorAssignment_0_1_in_rule__NotExpression__Group_0__1__Impl4817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__2__Impl_in_rule__NotExpression__Group_0__24847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__SubExpressionsAssignment_0_2_in_rule__NotExpression__Group_0__2__Impl4874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__0__Impl_in_rule__AtomicExpression__Group_2__04910 = new BitSet(new long[]{0x00000000408241F0L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__1_in_rule__AtomicExpression__Group_2__04913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__AtomicExpression__Group_2__0__Impl4941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__1__Impl_in_rule__AtomicExpression__Group_2__14972 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__2_in_rule__AtomicExpression__Group_2__14975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__AtomicExpression__Group_2__1__Impl5002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__2__Impl_in_rule__AtomicExpression__Group_2__25031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__AtomicExpression__Group_2__2__Impl5059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__0__Impl_in_rule__AtomicValuedExpression__Group_2__05096 = new BitSet(new long[]{0x00000000408041F0L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__1_in_rule__AtomicValuedExpression__Group_2__05099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__AtomicValuedExpression__Group_2__0__Impl5127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__1__Impl_in_rule__AtomicValuedExpression__Group_2__15158 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__2_in_rule__AtomicValuedExpression__Group_2__15161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivExpression_in_rule__AtomicValuedExpression__Group_2__1__Impl5188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__2__Impl_in_rule__AtomicValuedExpression__Group_2__25217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__AtomicValuedExpression__Group_2__2__Impl5245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_3__0__Impl_in_rule__AtomicValuedExpression__Group_3__05282 = new BitSet(new long[]{0x00000000408041F0L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_3__1_in_rule__AtomicValuedExpression__Group_3__05285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__AtomicValuedExpression__Group_3__0__Impl5313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_3__1__Impl_in_rule__AtomicValuedExpression__Group_3__15344 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_3__2_in_rule__AtomicValuedExpression__Group_3__15347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_rule__AtomicValuedExpression__Group_3__1__Impl5374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_3__2__Impl_in_rule__AtomicValuedExpression__Group_3__25403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__AtomicValuedExpression__Group_3__2__Impl5431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group__0__Impl_in_rule__DivExpression__Group__05468 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__DivExpression__Group__1_in_rule__DivExpression__Group__05471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_rule__DivExpression__Group__0__Impl5498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group__1__Impl_in_rule__DivExpression__Group__15527 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__DivExpression__Group__2_in_rule__DivExpression__Group__15530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group__2__Impl_in_rule__DivExpression__Group__25588 = new BitSet(new long[]{0x00000000408041F0L});
        public static final BitSet FOLLOW_rule__DivExpression__Group__3_in_rule__DivExpression__Group__25591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__OperatorAssignment_2_in_rule__DivExpression__Group__2__Impl5618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group__3__Impl_in_rule__DivExpression__Group__35648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__SubExpressionsAssignment_3_in_rule__DivExpression__Group__3__Impl5675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__0__Impl_in_rule__ValuedObjectTestExpression__Group_0__05713 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__1_in_rule__ValuedObjectTestExpression__Group_0__05716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__1__Impl_in_rule__ValuedObjectTestExpression__Group_0__15774 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__2_in_rule__ValuedObjectTestExpression__Group_0__15777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__OperatorAssignment_0_1_in_rule__ValuedObjectTestExpression__Group_0__1__Impl5804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__2__Impl_in_rule__ValuedObjectTestExpression__Group_0__25834 = new BitSet(new long[]{0x0000000000804020L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__3_in_rule__ValuedObjectTestExpression__Group_0__25837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__ValuedObjectTestExpression__Group_0__2__Impl5865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__3__Impl_in_rule__ValuedObjectTestExpression__Group_0__35896 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__4_in_rule__ValuedObjectTestExpression__Group_0__35899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3_in_rule__ValuedObjectTestExpression__Group_0__3__Impl5926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__4__Impl_in_rule__ValuedObjectTestExpression__Group_0__45956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__ValuedObjectTestExpression__Group_0__4__Impl5984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_1__0__Impl_in_rule__ValuedObjectTestExpression__Group_1__06025 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_1__1_in_rule__ValuedObjectTestExpression__Group_1__06028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_1__1__Impl_in_rule__ValuedObjectTestExpression__Group_1__16086 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_1__2_in_rule__ValuedObjectTestExpression__Group_1__16089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__OperatorAssignment_1_1_in_rule__ValuedObjectTestExpression__Group_1__1__Impl6116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_1__2__Impl_in_rule__ValuedObjectTestExpression__Group_1__26146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2_in_rule__ValuedObjectTestExpression__Group_1__2__Impl6173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group__0__Impl_in_rule__TextExpression__Group__06209 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group__1_in_rule__TextExpression__Group__06212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__CodeAssignment_0_in_rule__TextExpression__Group__0__Impl6239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group__1__Impl_in_rule__TextExpression__Group__16269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group_1__0_in_rule__TextExpression__Group__1__Impl6296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group_1__0__Impl_in_rule__TextExpression__Group_1__06331 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TextExpression__Group_1__1_in_rule__TextExpression__Group_1__06334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__TextExpression__Group_1__0__Impl6362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group_1__1__Impl_in_rule__TextExpression__Group_1__16393 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__TextExpression__Group_1__2_in_rule__TextExpression__Group_1__16396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__TypeAssignment_1_1_in_rule__TextExpression__Group_1__1__Impl6423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group_1__2__Impl_in_rule__TextExpression__Group_1__26453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__TextExpression__Group_1__2__Impl6481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyValueAnnotation__Group__0__Impl_in_rule__KeyValueAnnotation__Group__06518 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__KeyValueAnnotation__Group__1_in_rule__KeyValueAnnotation__Group__06521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__KeyValueAnnotation__Group__0__Impl6549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyValueAnnotation__Group__1__Impl_in_rule__KeyValueAnnotation__Group__16580 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__KeyValueAnnotation__Group__2_in_rule__KeyValueAnnotation__Group__16583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyValueAnnotation__NameAssignment_1_in_rule__KeyValueAnnotation__Group__1__Impl6610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyValueAnnotation__Group__2__Impl_in_rule__KeyValueAnnotation__Group__26640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyValueAnnotation__ValueAssignment_2_in_rule__KeyValueAnnotation__Group__2__Impl6667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrOperator_in_rule__OrExpression__OperatorAssignment_1_16708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__SubExpressionsAssignment_1_26739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndOperator_in_rule__AndExpression__OperatorAssignment_1_16770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_rule__AndExpression__SubExpressionsAssignment_1_26801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperator_in_rule__CompareOperation__OperatorAssignment_0_1_16832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_rule__CompareOperation__SubExpressionsAssignment_0_1_26863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddOperator_in_rule__AddExpression__OperatorAssignment_1_16894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubExpression_in_rule__AddExpression__SubExpressionsAssignment_1_26925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubOperator_in_rule__SubExpression__OperatorAssignment_1_16956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_rule__SubExpression__SubExpressionsAssignment_1_26987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultOperator_in_rule__MultExpression__OperatorAssignment_1_17018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_rule__MultExpression__SubExpressionsAssignment_1_27049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModOperator_in_rule__ModExpression__OperatorAssignment_1_17080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_rule__ModExpression__SubExpressionsAssignment_1_27111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOperator_in_rule__NotExpression__OperatorAssignment_0_17142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_rule__NotExpression__SubExpressionsAssignment_0_27173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivOperator_in_rule__DivExpression__OperatorAssignment_27204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_rule__DivExpression__SubExpressionsAssignment_37235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePreOperator_in_rule__ValuedObjectTestExpression__OperatorAssignment_0_17266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_37297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValueTestOperator_in_rule__ValuedObjectTestExpression__OperatorAssignment_1_17328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectReference_in_rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_27359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ValuedObjectReference__ValuedObjectAssignment7394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__TextExpression__CodeAssignment_07429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__TextExpression__TypeAssignment_1_17460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment7491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_rule__FloatValue__ValueAssignment7522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__BooleanValue__ValueAssignment7553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_COMMENT_ANNOTATION_in_rule__CommentAnnotation__ValueAssignment7584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__KeyValueAnnotation__NameAssignment_17615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__KeyValueAnnotation__ValueAssignment_27646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_synpred11948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0__0_in_synpred21997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_synpred32047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__0_in_synpred102264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_3__0_in_synpred112282 = new BitSet(new long[]{0x0000000000000002L});
    }


}