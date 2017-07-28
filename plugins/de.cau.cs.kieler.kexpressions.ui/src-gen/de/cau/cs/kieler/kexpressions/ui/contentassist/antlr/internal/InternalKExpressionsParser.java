package de.cau.cs.kieler.kexpressions.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.cau.cs.kieler.kexpressions.services.KExpressionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalKExpressionsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_BOOLEAN", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_HOSTCODE", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'pre'", "'|'", "'&'", "'!'", "'+'", "'-'", "'*'", "'%'", "'/'", "'val'", "'||'", "'&&'", "'()'", "'=='", "'<'", "'<='", "'>'", "'>='", "'!='", "'('", "')'", "'['", "']'", "','", "'@'", "'.'", "'#'"
    };
    public static final int RULE_COMMENT_ANNOTATION=10;
    public static final int RULE_BOOLEAN=5;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__19=19;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int RULE_NUMBER=12;
    public static final int T__26=26;
    public static final int RULE_HOSTCODE=9;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int RULE_FLOAT=8;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalKExpressionsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKExpressionsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKExpressionsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalKExpressions.g"; }


     
     	private KExpressionsGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(KExpressionsGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleRoot"
    // InternalKExpressions.g:61:1: entryRuleRoot : ruleRoot EOF ;
    public final void entryRuleRoot() throws RecognitionException {
        try {
            // InternalKExpressions.g:62:1: ( ruleRoot EOF )
            // InternalKExpressions.g:63:1: ruleRoot EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRootRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleRoot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRootRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalKExpressions.g:70:1: ruleRoot : ( ruleExpression ) ;
    public final void ruleRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:74:2: ( ( ruleExpression ) )
            // InternalKExpressions.g:75:1: ( ruleExpression )
            {
            // InternalKExpressions.g:75:1: ( ruleExpression )
            // InternalKExpressions.g:76:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRootAccess().getExpressionParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRootAccess().getExpressionParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleExpression"
    // InternalKExpressions.g:89:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalKExpressions.g:90:1: ( ruleExpression EOF )
            // InternalKExpressions.g:91:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalKExpressions.g:98:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:102:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalKExpressions.g:103:1: ( ( rule__Expression__Alternatives ) )
            {
            // InternalKExpressions.g:103:1: ( ( rule__Expression__Alternatives ) )
            // InternalKExpressions.g:104:1: ( rule__Expression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives()); 
            }
            // InternalKExpressions.g:105:1: ( rule__Expression__Alternatives )
            // InternalKExpressions.g:105:2: rule__Expression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleBoolExpression"
    // InternalKExpressions.g:117:1: entryRuleBoolExpression : ruleBoolExpression EOF ;
    public final void entryRuleBoolExpression() throws RecognitionException {
        try {
            // InternalKExpressions.g:118:1: ( ruleBoolExpression EOF )
            // InternalKExpressions.g:119:1: ruleBoolExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleBoolExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoolExpression"


    // $ANTLR start "ruleBoolExpression"
    // InternalKExpressions.g:126:1: ruleBoolExpression : ( ruleLogicalOrExpression ) ;
    public final void ruleBoolExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:130:2: ( ( ruleLogicalOrExpression ) )
            // InternalKExpressions.g:131:1: ( ruleLogicalOrExpression )
            {
            // InternalKExpressions.g:131:1: ( ruleLogicalOrExpression )
            // InternalKExpressions.g:132:1: ruleLogicalOrExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolExpressionAccess().getLogicalOrExpressionParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolExpressionAccess().getLogicalOrExpressionParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolExpression"


    // $ANTLR start "entryRuleLogicalOrExpression"
    // InternalKExpressions.g:145:1: entryRuleLogicalOrExpression : ruleLogicalOrExpression EOF ;
    public final void entryRuleLogicalOrExpression() throws RecognitionException {
        try {
            // InternalKExpressions.g:146:1: ( ruleLogicalOrExpression EOF )
            // InternalKExpressions.g:147:1: ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLogicalOrExpression"


    // $ANTLR start "ruleLogicalOrExpression"
    // InternalKExpressions.g:154:1: ruleLogicalOrExpression : ( ( rule__LogicalOrExpression__Group__0 ) ) ;
    public final void ruleLogicalOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:158:2: ( ( ( rule__LogicalOrExpression__Group__0 ) ) )
            // InternalKExpressions.g:159:1: ( ( rule__LogicalOrExpression__Group__0 ) )
            {
            // InternalKExpressions.g:159:1: ( ( rule__LogicalOrExpression__Group__0 ) )
            // InternalKExpressions.g:160:1: ( rule__LogicalOrExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExpressionAccess().getGroup()); 
            }
            // InternalKExpressions.g:161:1: ( rule__LogicalOrExpression__Group__0 )
            // InternalKExpressions.g:161:2: rule__LogicalOrExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalOrExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicalOrExpression"


    // $ANTLR start "entryRuleLogicalAndExpression"
    // InternalKExpressions.g:173:1: entryRuleLogicalAndExpression : ruleLogicalAndExpression EOF ;
    public final void entryRuleLogicalAndExpression() throws RecognitionException {
        try {
            // InternalKExpressions.g:174:1: ( ruleLogicalAndExpression EOF )
            // InternalKExpressions.g:175:1: ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLogicalAndExpression"


    // $ANTLR start "ruleLogicalAndExpression"
    // InternalKExpressions.g:182:1: ruleLogicalAndExpression : ( ( rule__LogicalAndExpression__Group__0 ) ) ;
    public final void ruleLogicalAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:186:2: ( ( ( rule__LogicalAndExpression__Group__0 ) ) )
            // InternalKExpressions.g:187:1: ( ( rule__LogicalAndExpression__Group__0 ) )
            {
            // InternalKExpressions.g:187:1: ( ( rule__LogicalAndExpression__Group__0 ) )
            // InternalKExpressions.g:188:1: ( rule__LogicalAndExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExpressionAccess().getGroup()); 
            }
            // InternalKExpressions.g:189:1: ( rule__LogicalAndExpression__Group__0 )
            // InternalKExpressions.g:189:2: rule__LogicalAndExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalAndExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleBitwiseOrExpression"
    // InternalKExpressions.g:201:1: entryRuleBitwiseOrExpression : ruleBitwiseOrExpression EOF ;
    public final void entryRuleBitwiseOrExpression() throws RecognitionException {
        try {
            // InternalKExpressions.g:202:1: ( ruleBitwiseOrExpression EOF )
            // InternalKExpressions.g:203:1: ruleBitwiseOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBitwiseOrExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBitwiseOrExpression"


    // $ANTLR start "ruleBitwiseOrExpression"
    // InternalKExpressions.g:210:1: ruleBitwiseOrExpression : ( ( rule__BitwiseOrExpression__Group__0 ) ) ;
    public final void ruleBitwiseOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:214:2: ( ( ( rule__BitwiseOrExpression__Group__0 ) ) )
            // InternalKExpressions.g:215:1: ( ( rule__BitwiseOrExpression__Group__0 ) )
            {
            // InternalKExpressions.g:215:1: ( ( rule__BitwiseOrExpression__Group__0 ) )
            // InternalKExpressions.g:216:1: ( rule__BitwiseOrExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrExpressionAccess().getGroup()); 
            }
            // InternalKExpressions.g:217:1: ( rule__BitwiseOrExpression__Group__0 )
            // InternalKExpressions.g:217:2: rule__BitwiseOrExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BitwiseOrExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBitwiseOrExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBitwiseOrExpression"


    // $ANTLR start "entryRuleBitwiseAndExpression"
    // InternalKExpressions.g:229:1: entryRuleBitwiseAndExpression : ruleBitwiseAndExpression EOF ;
    public final void entryRuleBitwiseAndExpression() throws RecognitionException {
        try {
            // InternalKExpressions.g:230:1: ( ruleBitwiseAndExpression EOF )
            // InternalKExpressions.g:231:1: ruleBitwiseAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBitwiseAndExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBitwiseAndExpression"


    // $ANTLR start "ruleBitwiseAndExpression"
    // InternalKExpressions.g:238:1: ruleBitwiseAndExpression : ( ( rule__BitwiseAndExpression__Group__0 ) ) ;
    public final void ruleBitwiseAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:242:2: ( ( ( rule__BitwiseAndExpression__Group__0 ) ) )
            // InternalKExpressions.g:243:1: ( ( rule__BitwiseAndExpression__Group__0 ) )
            {
            // InternalKExpressions.g:243:1: ( ( rule__BitwiseAndExpression__Group__0 ) )
            // InternalKExpressions.g:244:1: ( rule__BitwiseAndExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndExpressionAccess().getGroup()); 
            }
            // InternalKExpressions.g:245:1: ( rule__BitwiseAndExpression__Group__0 )
            // InternalKExpressions.g:245:2: rule__BitwiseAndExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BitwiseAndExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBitwiseAndExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBitwiseAndExpression"


    // $ANTLR start "entryRuleCompareOperation"
    // InternalKExpressions.g:257:1: entryRuleCompareOperation : ruleCompareOperation EOF ;
    public final void entryRuleCompareOperation() throws RecognitionException {
        try {
            // InternalKExpressions.g:258:1: ( ruleCompareOperation EOF )
            // InternalKExpressions.g:259:1: ruleCompareOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleCompareOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompareOperation"


    // $ANTLR start "ruleCompareOperation"
    // InternalKExpressions.g:266:1: ruleCompareOperation : ( ( rule__CompareOperation__Group__0 ) ) ;
    public final void ruleCompareOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:270:2: ( ( ( rule__CompareOperation__Group__0 ) ) )
            // InternalKExpressions.g:271:1: ( ( rule__CompareOperation__Group__0 ) )
            {
            // InternalKExpressions.g:271:1: ( ( rule__CompareOperation__Group__0 ) )
            // InternalKExpressions.g:272:1: ( rule__CompareOperation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGroup()); 
            }
            // InternalKExpressions.g:273:1: ( rule__CompareOperation__Group__0 )
            // InternalKExpressions.g:273:2: rule__CompareOperation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CompareOperation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "ruleCompareOperation"


    // $ANTLR start "entryRuleNotOrValuedExpression"
    // InternalKExpressions.g:285:1: entryRuleNotOrValuedExpression : ruleNotOrValuedExpression EOF ;
    public final void entryRuleNotOrValuedExpression() throws RecognitionException {
        try {
            // InternalKExpressions.g:286:1: ( ruleNotOrValuedExpression EOF )
            // InternalKExpressions.g:287:1: ruleNotOrValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotOrValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotOrValuedExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNotOrValuedExpression"


    // $ANTLR start "ruleNotOrValuedExpression"
    // InternalKExpressions.g:294:1: ruleNotOrValuedExpression : ( ( rule__NotOrValuedExpression__Alternatives ) ) ;
    public final void ruleNotOrValuedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:298:2: ( ( ( rule__NotOrValuedExpression__Alternatives ) ) )
            // InternalKExpressions.g:299:1: ( ( rule__NotOrValuedExpression__Alternatives ) )
            {
            // InternalKExpressions.g:299:1: ( ( rule__NotOrValuedExpression__Alternatives ) )
            // InternalKExpressions.g:300:1: ( rule__NotOrValuedExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotOrValuedExpressionAccess().getAlternatives()); 
            }
            // InternalKExpressions.g:301:1: ( rule__NotOrValuedExpression__Alternatives )
            // InternalKExpressions.g:301:2: rule__NotOrValuedExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NotOrValuedExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "ruleNotOrValuedExpression"


    // $ANTLR start "entryRuleNotExpression"
    // InternalKExpressions.g:313:1: entryRuleNotExpression : ruleNotExpression EOF ;
    public final void entryRuleNotExpression() throws RecognitionException {
        try {
            // InternalKExpressions.g:314:1: ( ruleNotExpression EOF )
            // InternalKExpressions.g:315:1: ruleNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleNotExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNotExpression"


    // $ANTLR start "ruleNotExpression"
    // InternalKExpressions.g:322:1: ruleNotExpression : ( ( rule__NotExpression__Alternatives ) ) ;
    public final void ruleNotExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:326:2: ( ( ( rule__NotExpression__Alternatives ) ) )
            // InternalKExpressions.g:327:1: ( ( rule__NotExpression__Alternatives ) )
            {
            // InternalKExpressions.g:327:1: ( ( rule__NotExpression__Alternatives ) )
            // InternalKExpressions.g:328:1: ( rule__NotExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getAlternatives()); 
            }
            // InternalKExpressions.g:329:1: ( rule__NotExpression__Alternatives )
            // InternalKExpressions.g:329:2: rule__NotExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NotExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "ruleNotExpression"


    // $ANTLR start "entryRuleValuedExpression"
    // InternalKExpressions.g:341:1: entryRuleValuedExpression : ruleValuedExpression EOF ;
    public final void entryRuleValuedExpression() throws RecognitionException {
        try {
            // InternalKExpressions.g:342:1: ( ruleValuedExpression EOF )
            // InternalKExpressions.g:343:1: ruleValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleValuedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuedExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValuedExpression"


    // $ANTLR start "ruleValuedExpression"
    // InternalKExpressions.g:350:1: ruleValuedExpression : ( ruleAddExpression ) ;
    public final void ruleValuedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:354:2: ( ( ruleAddExpression ) )
            // InternalKExpressions.g:355:1: ( ruleAddExpression )
            {
            // InternalKExpressions.g:355:1: ( ruleAddExpression )
            // InternalKExpressions.g:356:1: ruleAddExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedExpressionAccess().getAddExpressionParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAddExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
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
    // $ANTLR end "ruleValuedExpression"


    // $ANTLR start "entryRuleAddExpression"
    // InternalKExpressions.g:369:1: entryRuleAddExpression : ruleAddExpression EOF ;
    public final void entryRuleAddExpression() throws RecognitionException {
        try {
            // InternalKExpressions.g:370:1: ( ruleAddExpression EOF )
            // InternalKExpressions.g:371:1: ruleAddExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAddExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddExpression"


    // $ANTLR start "ruleAddExpression"
    // InternalKExpressions.g:378:1: ruleAddExpression : ( ( rule__AddExpression__Group__0 ) ) ;
    public final void ruleAddExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:382:2: ( ( ( rule__AddExpression__Group__0 ) ) )
            // InternalKExpressions.g:383:1: ( ( rule__AddExpression__Group__0 ) )
            {
            // InternalKExpressions.g:383:1: ( ( rule__AddExpression__Group__0 ) )
            // InternalKExpressions.g:384:1: ( rule__AddExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup()); 
            }
            // InternalKExpressions.g:385:1: ( rule__AddExpression__Group__0 )
            // InternalKExpressions.g:385:2: rule__AddExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AddExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "ruleAddExpression"


    // $ANTLR start "entryRuleSubExpression"
    // InternalKExpressions.g:397:1: entryRuleSubExpression : ruleSubExpression EOF ;
    public final void entryRuleSubExpression() throws RecognitionException {
        try {
            // InternalKExpressions.g:398:1: ( ruleSubExpression EOF )
            // InternalKExpressions.g:399:1: ruleSubExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleSubExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubExpression"


    // $ANTLR start "ruleSubExpression"
    // InternalKExpressions.g:406:1: ruleSubExpression : ( ( rule__SubExpression__Group__0 ) ) ;
    public final void ruleSubExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:410:2: ( ( ( rule__SubExpression__Group__0 ) ) )
            // InternalKExpressions.g:411:1: ( ( rule__SubExpression__Group__0 ) )
            {
            // InternalKExpressions.g:411:1: ( ( rule__SubExpression__Group__0 ) )
            // InternalKExpressions.g:412:1: ( rule__SubExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup()); 
            }
            // InternalKExpressions.g:413:1: ( rule__SubExpression__Group__0 )
            // InternalKExpressions.g:413:2: rule__SubExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SubExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "ruleSubExpression"


    // $ANTLR start "entryRuleMultExpression"
    // InternalKExpressions.g:425:1: entryRuleMultExpression : ruleMultExpression EOF ;
    public final void entryRuleMultExpression() throws RecognitionException {
        try {
            // InternalKExpressions.g:426:1: ( ruleMultExpression EOF )
            // InternalKExpressions.g:427:1: ruleMultExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMultExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultExpression"


    // $ANTLR start "ruleMultExpression"
    // InternalKExpressions.g:434:1: ruleMultExpression : ( ( rule__MultExpression__Group__0 ) ) ;
    public final void ruleMultExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:438:2: ( ( ( rule__MultExpression__Group__0 ) ) )
            // InternalKExpressions.g:439:1: ( ( rule__MultExpression__Group__0 ) )
            {
            // InternalKExpressions.g:439:1: ( ( rule__MultExpression__Group__0 ) )
            // InternalKExpressions.g:440:1: ( rule__MultExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getGroup()); 
            }
            // InternalKExpressions.g:441:1: ( rule__MultExpression__Group__0 )
            // InternalKExpressions.g:441:2: rule__MultExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "ruleMultExpression"


    // $ANTLR start "entryRuleDivExpression"
    // InternalKExpressions.g:453:1: entryRuleDivExpression : ruleDivExpression EOF ;
    public final void entryRuleDivExpression() throws RecognitionException {
        try {
            // InternalKExpressions.g:454:1: ( ruleDivExpression EOF )
            // InternalKExpressions.g:455:1: ruleDivExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDivExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDivExpression"


    // $ANTLR start "ruleDivExpression"
    // InternalKExpressions.g:462:1: ruleDivExpression : ( ( rule__DivExpression__Group__0 ) ) ;
    public final void ruleDivExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:466:2: ( ( ( rule__DivExpression__Group__0 ) ) )
            // InternalKExpressions.g:467:1: ( ( rule__DivExpression__Group__0 ) )
            {
            // InternalKExpressions.g:467:1: ( ( rule__DivExpression__Group__0 ) )
            // InternalKExpressions.g:468:1: ( rule__DivExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getGroup()); 
            }
            // InternalKExpressions.g:469:1: ( rule__DivExpression__Group__0 )
            // InternalKExpressions.g:469:2: rule__DivExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DivExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "ruleDivExpression"


    // $ANTLR start "entryRuleModExpression"
    // InternalKExpressions.g:481:1: entryRuleModExpression : ruleModExpression EOF ;
    public final void entryRuleModExpression() throws RecognitionException {
        try {
            // InternalKExpressions.g:482:1: ( ruleModExpression EOF )
            // InternalKExpressions.g:483:1: ruleModExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleModExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModExpression"


    // $ANTLR start "ruleModExpression"
    // InternalKExpressions.g:490:1: ruleModExpression : ( ( rule__ModExpression__Group__0 ) ) ;
    public final void ruleModExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:494:2: ( ( ( rule__ModExpression__Group__0 ) ) )
            // InternalKExpressions.g:495:1: ( ( rule__ModExpression__Group__0 ) )
            {
            // InternalKExpressions.g:495:1: ( ( rule__ModExpression__Group__0 ) )
            // InternalKExpressions.g:496:1: ( rule__ModExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getGroup()); 
            }
            // InternalKExpressions.g:497:1: ( rule__ModExpression__Group__0 )
            // InternalKExpressions.g:497:2: rule__ModExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ModExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "ruleModExpression"


    // $ANTLR start "entryRuleNegExpression"
    // InternalKExpressions.g:509:1: entryRuleNegExpression : ruleNegExpression EOF ;
    public final void entryRuleNegExpression() throws RecognitionException {
        try {
            // InternalKExpressions.g:510:1: ( ruleNegExpression EOF )
            // InternalKExpressions.g:511:1: ruleNegExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleNegExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNegExpression"


    // $ANTLR start "ruleNegExpression"
    // InternalKExpressions.g:518:1: ruleNegExpression : ( ( rule__NegExpression__Alternatives ) ) ;
    public final void ruleNegExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:522:2: ( ( ( rule__NegExpression__Alternatives ) ) )
            // InternalKExpressions.g:523:1: ( ( rule__NegExpression__Alternatives ) )
            {
            // InternalKExpressions.g:523:1: ( ( rule__NegExpression__Alternatives ) )
            // InternalKExpressions.g:524:1: ( rule__NegExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getAlternatives()); 
            }
            // InternalKExpressions.g:525:1: ( rule__NegExpression__Alternatives )
            // InternalKExpressions.g:525:2: rule__NegExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NegExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNegExpression"


    // $ANTLR start "entryRuleAtomicExpression"
    // InternalKExpressions.g:537:1: entryRuleAtomicExpression : ruleAtomicExpression EOF ;
    public final void entryRuleAtomicExpression() throws RecognitionException {
        try {
            // InternalKExpressions.g:538:1: ( ruleAtomicExpression EOF )
            // InternalKExpressions.g:539:1: ruleAtomicExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAtomicExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtomicExpression"


    // $ANTLR start "ruleAtomicExpression"
    // InternalKExpressions.g:546:1: ruleAtomicExpression : ( ( rule__AtomicExpression__Alternatives ) ) ;
    public final void ruleAtomicExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:550:2: ( ( ( rule__AtomicExpression__Alternatives ) ) )
            // InternalKExpressions.g:551:1: ( ( rule__AtomicExpression__Alternatives ) )
            {
            // InternalKExpressions.g:551:1: ( ( rule__AtomicExpression__Alternatives ) )
            // InternalKExpressions.g:552:1: ( rule__AtomicExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getAlternatives()); 
            }
            // InternalKExpressions.g:553:1: ( rule__AtomicExpression__Alternatives )
            // InternalKExpressions.g:553:2: rule__AtomicExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AtomicExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "ruleAtomicExpression"


    // $ANTLR start "entryRuleAtomicValuedExpression"
    // InternalKExpressions.g:565:1: entryRuleAtomicValuedExpression : ruleAtomicValuedExpression EOF ;
    public final void entryRuleAtomicValuedExpression() throws RecognitionException {
        try {
            // InternalKExpressions.g:566:1: ( ruleAtomicValuedExpression EOF )
            // InternalKExpressions.g:567:1: ruleAtomicValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAtomicValuedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicValuedExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtomicValuedExpression"


    // $ANTLR start "ruleAtomicValuedExpression"
    // InternalKExpressions.g:574:1: ruleAtomicValuedExpression : ( ( rule__AtomicValuedExpression__Alternatives ) ) ;
    public final void ruleAtomicValuedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:578:2: ( ( ( rule__AtomicValuedExpression__Alternatives ) ) )
            // InternalKExpressions.g:579:1: ( ( rule__AtomicValuedExpression__Alternatives ) )
            {
            // InternalKExpressions.g:579:1: ( ( rule__AtomicValuedExpression__Alternatives ) )
            // InternalKExpressions.g:580:1: ( rule__AtomicValuedExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getAlternatives()); 
            }
            // InternalKExpressions.g:581:1: ( rule__AtomicValuedExpression__Alternatives )
            // InternalKExpressions.g:581:2: rule__AtomicValuedExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AtomicValuedExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "ruleAtomicValuedExpression"


    // $ANTLR start "entryRuleValuedObjectTestExpression"
    // InternalKExpressions.g:593:1: entryRuleValuedObjectTestExpression : ruleValuedObjectTestExpression EOF ;
    public final void entryRuleValuedObjectTestExpression() throws RecognitionException {
        try {
            // InternalKExpressions.g:594:1: ( ruleValuedObjectTestExpression EOF )
            // InternalKExpressions.g:595:1: ruleValuedObjectTestExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleValuedObjectTestExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuedObjectTestExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValuedObjectTestExpression"


    // $ANTLR start "ruleValuedObjectTestExpression"
    // InternalKExpressions.g:602:1: ruleValuedObjectTestExpression : ( ( rule__ValuedObjectTestExpression__Alternatives ) ) ;
    public final void ruleValuedObjectTestExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:606:2: ( ( ( rule__ValuedObjectTestExpression__Alternatives ) ) )
            // InternalKExpressions.g:607:1: ( ( rule__ValuedObjectTestExpression__Alternatives ) )
            {
            // InternalKExpressions.g:607:1: ( ( rule__ValuedObjectTestExpression__Alternatives ) )
            // InternalKExpressions.g:608:1: ( rule__ValuedObjectTestExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getAlternatives()); 
            }
            // InternalKExpressions.g:609:1: ( rule__ValuedObjectTestExpression__Alternatives )
            // InternalKExpressions.g:609:2: rule__ValuedObjectTestExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ValuedObjectTestExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "ruleValuedObjectTestExpression"


    // $ANTLR start "entryRuleValuedObjectReference"
    // InternalKExpressions.g:621:1: entryRuleValuedObjectReference : ruleValuedObjectReference EOF ;
    public final void entryRuleValuedObjectReference() throws RecognitionException {
        try {
            // InternalKExpressions.g:622:1: ( ruleValuedObjectReference EOF )
            // InternalKExpressions.g:623:1: ruleValuedObjectReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleValuedObjectReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuedObjectReferenceRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValuedObjectReference"


    // $ANTLR start "ruleValuedObjectReference"
    // InternalKExpressions.g:630:1: ruleValuedObjectReference : ( ( rule__ValuedObjectReference__Group__0 ) ) ;
    public final void ruleValuedObjectReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:634:2: ( ( ( rule__ValuedObjectReference__Group__0 ) ) )
            // InternalKExpressions.g:635:1: ( ( rule__ValuedObjectReference__Group__0 ) )
            {
            // InternalKExpressions.g:635:1: ( ( rule__ValuedObjectReference__Group__0 ) )
            // InternalKExpressions.g:636:1: ( rule__ValuedObjectReference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getGroup()); 
            }
            // InternalKExpressions.g:637:1: ( rule__ValuedObjectReference__Group__0 )
            // InternalKExpressions.g:637:2: rule__ValuedObjectReference__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ValuedObjectReference__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuedObjectReferenceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValuedObjectReference"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalKExpressions.g:649:1: entryRuleFunctionCall : ruleFunctionCall EOF ;
    public final void entryRuleFunctionCall() throws RecognitionException {
        try {
            // InternalKExpressions.g:650:1: ( ruleFunctionCall EOF )
            // InternalKExpressions.g:651:1: ruleFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleFunctionCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // InternalKExpressions.g:658:1: ruleFunctionCall : ( ( rule__FunctionCall__Group__0 ) ) ;
    public final void ruleFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:662:2: ( ( ( rule__FunctionCall__Group__0 ) ) )
            // InternalKExpressions.g:663:1: ( ( rule__FunctionCall__Group__0 ) )
            {
            // InternalKExpressions.g:663:1: ( ( rule__FunctionCall__Group__0 ) )
            // InternalKExpressions.g:664:1: ( rule__FunctionCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGroup()); 
            }
            // InternalKExpressions.g:665:1: ( rule__FunctionCall__Group__0 )
            // InternalKExpressions.g:665:2: rule__FunctionCall__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCall__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleParameter"
    // InternalKExpressions.g:677:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalKExpressions.g:678:1: ( ruleParameter EOF )
            // InternalKExpressions.g:679:1: ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalKExpressions.g:686:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:690:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalKExpressions.g:691:1: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalKExpressions.g:691:1: ( ( rule__Parameter__Group__0 ) )
            // InternalKExpressions.g:692:1: ( rule__Parameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getGroup()); 
            }
            // InternalKExpressions.g:693:1: ( rule__Parameter__Group__0 )
            // InternalKExpressions.g:693:2: rule__Parameter__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleTextExpression"
    // InternalKExpressions.g:705:1: entryRuleTextExpression : ruleTextExpression EOF ;
    public final void entryRuleTextExpression() throws RecognitionException {
        try {
            // InternalKExpressions.g:706:1: ( ruleTextExpression EOF )
            // InternalKExpressions.g:707:1: ruleTextExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTextExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTextExpression"


    // $ANTLR start "ruleTextExpression"
    // InternalKExpressions.g:714:1: ruleTextExpression : ( ( rule__TextExpression__TextAssignment ) ) ;
    public final void ruleTextExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:718:2: ( ( ( rule__TextExpression__TextAssignment ) ) )
            // InternalKExpressions.g:719:1: ( ( rule__TextExpression__TextAssignment ) )
            {
            // InternalKExpressions.g:719:1: ( ( rule__TextExpression__TextAssignment ) )
            // InternalKExpressions.g:720:1: ( rule__TextExpression__TextAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getTextAssignment()); 
            }
            // InternalKExpressions.g:721:1: ( rule__TextExpression__TextAssignment )
            // InternalKExpressions.g:721:2: rule__TextExpression__TextAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TextExpression__TextAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextExpressionAccess().getTextAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextExpression"


    // $ANTLR start "entryRuleIntValue"
    // InternalKExpressions.g:733:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // InternalKExpressions.g:734:1: ( ruleIntValue EOF )
            // InternalKExpressions.g:735:1: ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleIntValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntValueRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalKExpressions.g:742:1: ruleIntValue : ( ( rule__IntValue__ValueAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:746:2: ( ( ( rule__IntValue__ValueAssignment ) ) )
            // InternalKExpressions.g:747:1: ( ( rule__IntValue__ValueAssignment ) )
            {
            // InternalKExpressions.g:747:1: ( ( rule__IntValue__ValueAssignment ) )
            // InternalKExpressions.g:748:1: ( rule__IntValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            }
            // InternalKExpressions.g:749:1: ( rule__IntValue__ValueAssignment )
            // InternalKExpressions.g:749:2: rule__IntValue__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntValue__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleFloatValue"
    // InternalKExpressions.g:761:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // InternalKExpressions.g:762:1: ( ruleFloatValue EOF )
            // InternalKExpressions.g:763:1: ruleFloatValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleFloatValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatValueRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFloatValue"


    // $ANTLR start "ruleFloatValue"
    // InternalKExpressions.g:770:1: ruleFloatValue : ( ( rule__FloatValue__ValueAssignment ) ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:774:2: ( ( ( rule__FloatValue__ValueAssignment ) ) )
            // InternalKExpressions.g:775:1: ( ( rule__FloatValue__ValueAssignment ) )
            {
            // InternalKExpressions.g:775:1: ( ( rule__FloatValue__ValueAssignment ) )
            // InternalKExpressions.g:776:1: ( rule__FloatValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueAssignment()); 
            }
            // InternalKExpressions.g:777:1: ( rule__FloatValue__ValueAssignment )
            // InternalKExpressions.g:777:2: rule__FloatValue__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FloatValue__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "ruleFloatValue"


    // $ANTLR start "entryRuleBoolValue"
    // InternalKExpressions.g:789:1: entryRuleBoolValue : ruleBoolValue EOF ;
    public final void entryRuleBoolValue() throws RecognitionException {
        try {
            // InternalKExpressions.g:790:1: ( ruleBoolValue EOF )
            // InternalKExpressions.g:791:1: ruleBoolValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleBoolValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolValueRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoolValue"


    // $ANTLR start "ruleBoolValue"
    // InternalKExpressions.g:798:1: ruleBoolValue : ( ( rule__BoolValue__ValueAssignment ) ) ;
    public final void ruleBoolValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:802:2: ( ( ( rule__BoolValue__ValueAssignment ) ) )
            // InternalKExpressions.g:803:1: ( ( rule__BoolValue__ValueAssignment ) )
            {
            // InternalKExpressions.g:803:1: ( ( rule__BoolValue__ValueAssignment ) )
            // InternalKExpressions.g:804:1: ( rule__BoolValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolValueAccess().getValueAssignment()); 
            }
            // InternalKExpressions.g:805:1: ( rule__BoolValue__ValueAssignment )
            // InternalKExpressions.g:805:2: rule__BoolValue__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BoolValue__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolValueAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalKExpressions.g:817:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalKExpressions.g:818:1: ( ruleStringValue EOF )
            // InternalKExpressions.g:819:1: ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleStringValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalKExpressions.g:826:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:830:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // InternalKExpressions.g:831:1: ( ( rule__StringValue__ValueAssignment ) )
            {
            // InternalKExpressions.g:831:1: ( ( rule__StringValue__ValueAssignment ) )
            // InternalKExpressions.g:832:1: ( rule__StringValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            }
            // InternalKExpressions.g:833:1: ( rule__StringValue__ValueAssignment )
            // InternalKExpressions.g:833:2: rule__StringValue__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringValue__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleCommentAnnotation"
    // InternalKExpressions.g:855:1: entryRuleCommentAnnotation : ruleCommentAnnotation EOF ;
    public final void entryRuleCommentAnnotation() throws RecognitionException {
        try {
            // InternalKExpressions.g:856:1: ( ruleCommentAnnotation EOF )
            // InternalKExpressions.g:857:1: ruleCommentAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleCommentAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommentAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommentAnnotation"


    // $ANTLR start "ruleCommentAnnotation"
    // InternalKExpressions.g:864:1: ruleCommentAnnotation : ( ( rule__CommentAnnotation__ValuesAssignment ) ) ;
    public final void ruleCommentAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:868:2: ( ( ( rule__CommentAnnotation__ValuesAssignment ) ) )
            // InternalKExpressions.g:869:1: ( ( rule__CommentAnnotation__ValuesAssignment ) )
            {
            // InternalKExpressions.g:869:1: ( ( rule__CommentAnnotation__ValuesAssignment ) )
            // InternalKExpressions.g:870:1: ( rule__CommentAnnotation__ValuesAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationAccess().getValuesAssignment()); 
            }
            // InternalKExpressions.g:871:1: ( rule__CommentAnnotation__ValuesAssignment )
            // InternalKExpressions.g:871:2: rule__CommentAnnotation__ValuesAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CommentAnnotation__ValuesAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommentAnnotationAccess().getValuesAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommentAnnotation"


    // $ANTLR start "entryRuleTagAnnotation"
    // InternalKExpressions.g:883:1: entryRuleTagAnnotation : ruleTagAnnotation EOF ;
    public final void entryRuleTagAnnotation() throws RecognitionException {
        try {
            // InternalKExpressions.g:884:1: ( ruleTagAnnotation EOF )
            // InternalKExpressions.g:885:1: ruleTagAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTagAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTagAnnotation"


    // $ANTLR start "ruleTagAnnotation"
    // InternalKExpressions.g:892:1: ruleTagAnnotation : ( ( rule__TagAnnotation__Group__0 ) ) ;
    public final void ruleTagAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:896:2: ( ( ( rule__TagAnnotation__Group__0 ) ) )
            // InternalKExpressions.g:897:1: ( ( rule__TagAnnotation__Group__0 ) )
            {
            // InternalKExpressions.g:897:1: ( ( rule__TagAnnotation__Group__0 ) )
            // InternalKExpressions.g:898:1: ( rule__TagAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getGroup()); 
            }
            // InternalKExpressions.g:899:1: ( rule__TagAnnotation__Group__0 )
            // InternalKExpressions.g:899:2: rule__TagAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TagAnnotation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagAnnotationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTagAnnotation"


    // $ANTLR start "entryRuleKeyStringValueAnnotation"
    // InternalKExpressions.g:911:1: entryRuleKeyStringValueAnnotation : ruleKeyStringValueAnnotation EOF ;
    public final void entryRuleKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKExpressions.g:912:1: ( ruleKeyStringValueAnnotation EOF )
            // InternalKExpressions.g:913:1: ruleKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKeyStringValueAnnotation"


    // $ANTLR start "ruleKeyStringValueAnnotation"
    // InternalKExpressions.g:920:1: ruleKeyStringValueAnnotation : ( ( rule__KeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:924:2: ( ( ( rule__KeyStringValueAnnotation__Group__0 ) ) )
            // InternalKExpressions.g:925:1: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKExpressions.g:925:1: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            // InternalKExpressions.g:926:1: ( rule__KeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKExpressions.g:927:1: ( rule__KeyStringValueAnnotation__Group__0 )
            // InternalKExpressions.g:927:2: rule__KeyStringValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__KeyStringValueAnnotation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKeyStringValueAnnotation"


    // $ANTLR start "entryRuleTypedKeyStringValueAnnotation"
    // InternalKExpressions.g:939:1: entryRuleTypedKeyStringValueAnnotation : ruleTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKExpressions.g:940:1: ( ruleTypedKeyStringValueAnnotation EOF )
            // InternalKExpressions.g:941:1: ruleTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypedKeyStringValueAnnotation"


    // $ANTLR start "ruleTypedKeyStringValueAnnotation"
    // InternalKExpressions.g:948:1: ruleTypedKeyStringValueAnnotation : ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:952:2: ( ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKExpressions.g:953:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKExpressions.g:953:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            // InternalKExpressions.g:954:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKExpressions.g:955:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            // InternalKExpressions.g:955:2: rule__TypedKeyStringValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypedKeyStringValueAnnotation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleQuotedKeyStringValueAnnotation"
    // InternalKExpressions.g:967:1: entryRuleQuotedKeyStringValueAnnotation : ruleQuotedKeyStringValueAnnotation EOF ;
    public final void entryRuleQuotedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKExpressions.g:968:1: ( ruleQuotedKeyStringValueAnnotation EOF )
            // InternalKExpressions.g:969:1: ruleQuotedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleQuotedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuotedKeyStringValueAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuotedKeyStringValueAnnotation"


    // $ANTLR start "ruleQuotedKeyStringValueAnnotation"
    // InternalKExpressions.g:976:1: ruleQuotedKeyStringValueAnnotation : ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleQuotedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:980:2: ( ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKExpressions.g:981:1: ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKExpressions.g:981:1: ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) )
            // InternalKExpressions.g:982:1: ( rule__QuotedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKExpressions.g:983:1: ( rule__QuotedKeyStringValueAnnotation__Group__0 )
            // InternalKExpressions.g:983:2: rule__QuotedKeyStringValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedKeyStringValueAnnotation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuotedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleQuotedTypedKeyStringValueAnnotation"
    // InternalKExpressions.g:995:1: entryRuleQuotedTypedKeyStringValueAnnotation : ruleQuotedTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKExpressions.g:996:1: ( ruleQuotedTypedKeyStringValueAnnotation EOF )
            // InternalKExpressions.g:997:1: ruleQuotedTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleQuotedTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuotedTypedKeyStringValueAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuotedTypedKeyStringValueAnnotation"


    // $ANTLR start "ruleQuotedTypedKeyStringValueAnnotation"
    // InternalKExpressions.g:1004:1: ruleQuotedTypedKeyStringValueAnnotation : ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1008:2: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKExpressions.g:1009:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKExpressions.g:1009:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) )
            // InternalKExpressions.g:1010:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKExpressions.g:1011:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 )
            // InternalKExpressions.g:1011:2: rule__QuotedTypedKeyStringValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedTypedKeyStringValueAnnotation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuotedTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleKeyBooleanValueAnnotation"
    // InternalKExpressions.g:1023:1: entryRuleKeyBooleanValueAnnotation : ruleKeyBooleanValueAnnotation EOF ;
    public final void entryRuleKeyBooleanValueAnnotation() throws RecognitionException {
        try {
            // InternalKExpressions.g:1024:1: ( ruleKeyBooleanValueAnnotation EOF )
            // InternalKExpressions.g:1025:1: ruleKeyBooleanValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleKeyBooleanValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKeyBooleanValueAnnotation"


    // $ANTLR start "ruleKeyBooleanValueAnnotation"
    // InternalKExpressions.g:1032:1: ruleKeyBooleanValueAnnotation : ( ( rule__KeyBooleanValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyBooleanValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1036:2: ( ( ( rule__KeyBooleanValueAnnotation__Group__0 ) ) )
            // InternalKExpressions.g:1037:1: ( ( rule__KeyBooleanValueAnnotation__Group__0 ) )
            {
            // InternalKExpressions.g:1037:1: ( ( rule__KeyBooleanValueAnnotation__Group__0 ) )
            // InternalKExpressions.g:1038:1: ( rule__KeyBooleanValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getGroup()); 
            }
            // InternalKExpressions.g:1039:1: ( rule__KeyBooleanValueAnnotation__Group__0 )
            // InternalKExpressions.g:1039:2: rule__KeyBooleanValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__KeyBooleanValueAnnotation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyBooleanValueAnnotationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKeyBooleanValueAnnotation"


    // $ANTLR start "entryRuleKeyIntValueAnnotation"
    // InternalKExpressions.g:1051:1: entryRuleKeyIntValueAnnotation : ruleKeyIntValueAnnotation EOF ;
    public final void entryRuleKeyIntValueAnnotation() throws RecognitionException {
        try {
            // InternalKExpressions.g:1052:1: ( ruleKeyIntValueAnnotation EOF )
            // InternalKExpressions.g:1053:1: ruleKeyIntValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleKeyIntValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKeyIntValueAnnotation"


    // $ANTLR start "ruleKeyIntValueAnnotation"
    // InternalKExpressions.g:1060:1: ruleKeyIntValueAnnotation : ( ( rule__KeyIntValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyIntValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1064:2: ( ( ( rule__KeyIntValueAnnotation__Group__0 ) ) )
            // InternalKExpressions.g:1065:1: ( ( rule__KeyIntValueAnnotation__Group__0 ) )
            {
            // InternalKExpressions.g:1065:1: ( ( rule__KeyIntValueAnnotation__Group__0 ) )
            // InternalKExpressions.g:1066:1: ( rule__KeyIntValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getGroup()); 
            }
            // InternalKExpressions.g:1067:1: ( rule__KeyIntValueAnnotation__Group__0 )
            // InternalKExpressions.g:1067:2: rule__KeyIntValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__KeyIntValueAnnotation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKeyIntValueAnnotation"


    // $ANTLR start "entryRuleKeyFloatValueAnnotation"
    // InternalKExpressions.g:1079:1: entryRuleKeyFloatValueAnnotation : ruleKeyFloatValueAnnotation EOF ;
    public final void entryRuleKeyFloatValueAnnotation() throws RecognitionException {
        try {
            // InternalKExpressions.g:1080:1: ( ruleKeyFloatValueAnnotation EOF )
            // InternalKExpressions.g:1081:1: ruleKeyFloatValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleKeyFloatValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKeyFloatValueAnnotation"


    // $ANTLR start "ruleKeyFloatValueAnnotation"
    // InternalKExpressions.g:1088:1: ruleKeyFloatValueAnnotation : ( ( rule__KeyFloatValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyFloatValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1092:2: ( ( ( rule__KeyFloatValueAnnotation__Group__0 ) ) )
            // InternalKExpressions.g:1093:1: ( ( rule__KeyFloatValueAnnotation__Group__0 ) )
            {
            // InternalKExpressions.g:1093:1: ( ( rule__KeyFloatValueAnnotation__Group__0 ) )
            // InternalKExpressions.g:1094:1: ( rule__KeyFloatValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getGroup()); 
            }
            // InternalKExpressions.g:1095:1: ( rule__KeyFloatValueAnnotation__Group__0 )
            // InternalKExpressions.g:1095:2: rule__KeyFloatValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__KeyFloatValueAnnotation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKeyFloatValueAnnotation"


    // $ANTLR start "entryRuleEString"
    // InternalKExpressions.g:1107:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalKExpressions.g:1108:1: ( ruleEString EOF )
            // InternalKExpressions.g:1109:1: ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalKExpressions.g:1116:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1120:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalKExpressions.g:1121:1: ( ( rule__EString__Alternatives ) )
            {
            // InternalKExpressions.g:1121:1: ( ( rule__EString__Alternatives ) )
            // InternalKExpressions.g:1122:1: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // InternalKExpressions.g:1123:1: ( rule__EString__Alternatives )
            // InternalKExpressions.g:1123:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEStringBoolean"
    // InternalKExpressions.g:1135:1: entryRuleEStringBoolean : ruleEStringBoolean EOF ;
    public final void entryRuleEStringBoolean() throws RecognitionException {
        try {
            // InternalKExpressions.g:1136:1: ( ruleEStringBoolean EOF )
            // InternalKExpressions.g:1137:1: ruleEStringBoolean EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringBooleanRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEStringBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringBooleanRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEStringBoolean"


    // $ANTLR start "ruleEStringBoolean"
    // InternalKExpressions.g:1144:1: ruleEStringBoolean : ( ( rule__EStringBoolean__Alternatives ) ) ;
    public final void ruleEStringBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1148:2: ( ( ( rule__EStringBoolean__Alternatives ) ) )
            // InternalKExpressions.g:1149:1: ( ( rule__EStringBoolean__Alternatives ) )
            {
            // InternalKExpressions.g:1149:1: ( ( rule__EStringBoolean__Alternatives ) )
            // InternalKExpressions.g:1150:1: ( rule__EStringBoolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringBooleanAccess().getAlternatives()); 
            }
            // InternalKExpressions.g:1151:1: ( rule__EStringBoolean__Alternatives )
            // InternalKExpressions.g:1151:2: rule__EStringBoolean__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EStringBoolean__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringBooleanAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEStringBoolean"


    // $ANTLR start "entryRuleExtendedID"
    // InternalKExpressions.g:1163:1: entryRuleExtendedID : ruleExtendedID EOF ;
    public final void entryRuleExtendedID() throws RecognitionException {
        try {
            // InternalKExpressions.g:1164:1: ( ruleExtendedID EOF )
            // InternalKExpressions.g:1165:1: ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendedIDRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExtendedID"


    // $ANTLR start "ruleExtendedID"
    // InternalKExpressions.g:1172:1: ruleExtendedID : ( ( rule__ExtendedID__Group__0 ) ) ;
    public final void ruleExtendedID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1176:2: ( ( ( rule__ExtendedID__Group__0 ) ) )
            // InternalKExpressions.g:1177:1: ( ( rule__ExtendedID__Group__0 ) )
            {
            // InternalKExpressions.g:1177:1: ( ( rule__ExtendedID__Group__0 ) )
            // InternalKExpressions.g:1178:1: ( rule__ExtendedID__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup()); 
            }
            // InternalKExpressions.g:1179:1: ( rule__ExtendedID__Group__0 )
            // InternalKExpressions.g:1179:2: rule__ExtendedID__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExtendedID__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendedIDAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExtendedID"


    // $ANTLR start "entryRuleInteger"
    // InternalKExpressions.g:1191:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // InternalKExpressions.g:1192:1: ( ruleInteger EOF )
            // InternalKExpressions.g:1193:1: ruleInteger EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalKExpressions.g:1200:1: ruleInteger : ( ( rule__Integer__Group__0 ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1204:2: ( ( ( rule__Integer__Group__0 ) ) )
            // InternalKExpressions.g:1205:1: ( ( rule__Integer__Group__0 ) )
            {
            // InternalKExpressions.g:1205:1: ( ( rule__Integer__Group__0 ) )
            // InternalKExpressions.g:1206:1: ( rule__Integer__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getGroup()); 
            }
            // InternalKExpressions.g:1207:1: ( rule__Integer__Group__0 )
            // InternalKExpressions.g:1207:2: rule__Integer__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Integer__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleFloateger"
    // InternalKExpressions.g:1219:1: entryRuleFloateger : ruleFloateger EOF ;
    public final void entryRuleFloateger() throws RecognitionException {
        try {
            // InternalKExpressions.g:1220:1: ( ruleFloateger EOF )
            // InternalKExpressions.g:1221:1: ruleFloateger EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloategerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleFloateger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloategerRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFloateger"


    // $ANTLR start "ruleFloateger"
    // InternalKExpressions.g:1228:1: ruleFloateger : ( ( rule__Floateger__Group__0 ) ) ;
    public final void ruleFloateger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1232:2: ( ( ( rule__Floateger__Group__0 ) ) )
            // InternalKExpressions.g:1233:1: ( ( rule__Floateger__Group__0 ) )
            {
            // InternalKExpressions.g:1233:1: ( ( rule__Floateger__Group__0 ) )
            // InternalKExpressions.g:1234:1: ( rule__Floateger__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloategerAccess().getGroup()); 
            }
            // InternalKExpressions.g:1235:1: ( rule__Floateger__Group__0 )
            // InternalKExpressions.g:1235:2: rule__Floateger__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Floateger__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloategerAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFloateger"


    // $ANTLR start "ruleCompareOperator"
    // InternalKExpressions.g:1248:1: ruleCompareOperator : ( ( rule__CompareOperator__Alternatives ) ) ;
    public final void ruleCompareOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1252:1: ( ( ( rule__CompareOperator__Alternatives ) ) )
            // InternalKExpressions.g:1253:1: ( ( rule__CompareOperator__Alternatives ) )
            {
            // InternalKExpressions.g:1253:1: ( ( rule__CompareOperator__Alternatives ) )
            // InternalKExpressions.g:1254:1: ( rule__CompareOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            }
            // InternalKExpressions.g:1255:1: ( rule__CompareOperator__Alternatives )
            // InternalKExpressions.g:1255:2: rule__CompareOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CompareOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "ruleCompareOperator"


    // $ANTLR start "rulePreOperator"
    // InternalKExpressions.g:1267:1: rulePreOperator : ( ( 'pre' ) ) ;
    public final void rulePreOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1271:1: ( ( ( 'pre' ) ) )
            // InternalKExpressions.g:1272:1: ( ( 'pre' ) )
            {
            // InternalKExpressions.g:1272:1: ( ( 'pre' ) )
            // InternalKExpressions.g:1273:1: ( 'pre' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreOperatorAccess().getPREEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1274:1: ( 'pre' )
            // InternalKExpressions.g:1274:3: 'pre'
            {
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rulePreOperator"


    // $ANTLR start "ruleBitwiseOrOperator"
    // InternalKExpressions.g:1287:1: ruleBitwiseOrOperator : ( ( '|' ) ) ;
    public final void ruleBitwiseOrOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1291:1: ( ( ( '|' ) ) )
            // InternalKExpressions.g:1292:1: ( ( '|' ) )
            {
            // InternalKExpressions.g:1292:1: ( ( '|' ) )
            // InternalKExpressions.g:1293:1: ( '|' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrOperatorAccess().getBITWISE_OREnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1294:1: ( '|' )
            // InternalKExpressions.g:1294:3: '|'
            {
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBitwiseOrOperatorAccess().getBITWISE_OREnumLiteralDeclaration()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBitwiseOrOperator"


    // $ANTLR start "ruleBitwiseAndOperator"
    // InternalKExpressions.g:1307:1: ruleBitwiseAndOperator : ( ( '&' ) ) ;
    public final void ruleBitwiseAndOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1311:1: ( ( ( '&' ) ) )
            // InternalKExpressions.g:1312:1: ( ( '&' ) )
            {
            // InternalKExpressions.g:1312:1: ( ( '&' ) )
            // InternalKExpressions.g:1313:1: ( '&' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndOperatorAccess().getBITWISE_ANDEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1314:1: ( '&' )
            // InternalKExpressions.g:1314:3: '&'
            {
            match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBitwiseAndOperatorAccess().getBITWISE_ANDEnumLiteralDeclaration()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBitwiseAndOperator"


    // $ANTLR start "ruleNotOperator"
    // InternalKExpressions.g:1327:1: ruleNotOperator : ( ( '!' ) ) ;
    public final void ruleNotOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1331:1: ( ( ( '!' ) ) )
            // InternalKExpressions.g:1332:1: ( ( '!' ) )
            {
            // InternalKExpressions.g:1332:1: ( ( '!' ) )
            // InternalKExpressions.g:1333:1: ( '!' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1334:1: ( '!' )
            // InternalKExpressions.g:1334:3: '!'
            {
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "ruleNotOperator"


    // $ANTLR start "ruleAddOperator"
    // InternalKExpressions.g:1347:1: ruleAddOperator : ( ( '+' ) ) ;
    public final void ruleAddOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1351:1: ( ( ( '+' ) ) )
            // InternalKExpressions.g:1352:1: ( ( '+' ) )
            {
            // InternalKExpressions.g:1352:1: ( ( '+' ) )
            // InternalKExpressions.g:1353:1: ( '+' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddOperatorAccess().getADDEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1354:1: ( '+' )
            // InternalKExpressions.g:1354:3: '+'
            {
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "ruleAddOperator"


    // $ANTLR start "ruleSubOperator"
    // InternalKExpressions.g:1367:1: ruleSubOperator : ( ( '-' ) ) ;
    public final void ruleSubOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1371:1: ( ( ( '-' ) ) )
            // InternalKExpressions.g:1372:1: ( ( '-' ) )
            {
            // InternalKExpressions.g:1372:1: ( ( '-' ) )
            // InternalKExpressions.g:1373:1: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubOperatorAccess().getSUBEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1374:1: ( '-' )
            // InternalKExpressions.g:1374:3: '-'
            {
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "ruleSubOperator"


    // $ANTLR start "ruleMultOperator"
    // InternalKExpressions.g:1387:1: ruleMultOperator : ( ( '*' ) ) ;
    public final void ruleMultOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1391:1: ( ( ( '*' ) ) )
            // InternalKExpressions.g:1392:1: ( ( '*' ) )
            {
            // InternalKExpressions.g:1392:1: ( ( '*' ) )
            // InternalKExpressions.g:1393:1: ( '*' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1394:1: ( '*' )
            // InternalKExpressions.g:1394:3: '*'
            {
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "ruleMultOperator"


    // $ANTLR start "ruleModOperator"
    // InternalKExpressions.g:1407:1: ruleModOperator : ( ( '%' ) ) ;
    public final void ruleModOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1411:1: ( ( ( '%' ) ) )
            // InternalKExpressions.g:1412:1: ( ( '%' ) )
            {
            // InternalKExpressions.g:1412:1: ( ( '%' ) )
            // InternalKExpressions.g:1413:1: ( '%' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModOperatorAccess().getMODEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1414:1: ( '%' )
            // InternalKExpressions.g:1414:3: '%'
            {
            match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "ruleModOperator"


    // $ANTLR start "ruleDivOperator"
    // InternalKExpressions.g:1427:1: ruleDivOperator : ( ( '/' ) ) ;
    public final void ruleDivOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1431:1: ( ( ( '/' ) ) )
            // InternalKExpressions.g:1432:1: ( ( '/' ) )
            {
            // InternalKExpressions.g:1432:1: ( ( '/' ) )
            // InternalKExpressions.g:1433:1: ( '/' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivOperatorAccess().getDIVEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1434:1: ( '/' )
            // InternalKExpressions.g:1434:3: '/'
            {
            match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "ruleDivOperator"


    // $ANTLR start "ruleValOperator"
    // InternalKExpressions.g:1447:1: ruleValOperator : ( ( 'val' ) ) ;
    public final void ruleValOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1451:1: ( ( ( 'val' ) ) )
            // InternalKExpressions.g:1452:1: ( ( 'val' ) )
            {
            // InternalKExpressions.g:1452:1: ( ( 'val' ) )
            // InternalKExpressions.g:1453:1: ( 'val' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValOperatorAccess().getVALEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1454:1: ( 'val' )
            // InternalKExpressions.g:1454:3: 'val'
            {
            match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "ruleValOperator"


    // $ANTLR start "ruleLogicalOrOperator"
    // InternalKExpressions.g:1467:1: ruleLogicalOrOperator : ( ( '||' ) ) ;
    public final void ruleLogicalOrOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1471:1: ( ( ( '||' ) ) )
            // InternalKExpressions.g:1472:1: ( ( '||' ) )
            {
            // InternalKExpressions.g:1472:1: ( ( '||' ) )
            // InternalKExpressions.g:1473:1: ( '||' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrOperatorAccess().getLOGICAL_OREnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1474:1: ( '||' )
            // InternalKExpressions.g:1474:3: '||'
            {
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrOperatorAccess().getLOGICAL_OREnumLiteralDeclaration()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicalOrOperator"


    // $ANTLR start "ruleLogicalAndOperator"
    // InternalKExpressions.g:1487:1: ruleLogicalAndOperator : ( ( '&&' ) ) ;
    public final void ruleLogicalAndOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1491:1: ( ( ( '&&' ) ) )
            // InternalKExpressions.g:1492:1: ( ( '&&' ) )
            {
            // InternalKExpressions.g:1492:1: ( ( '&&' ) )
            // InternalKExpressions.g:1493:1: ( '&&' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndOperatorAccess().getLOGICAL_ANDEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1494:1: ( '&&' )
            // InternalKExpressions.g:1494:3: '&&'
            {
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndOperatorAccess().getLOGICAL_ANDEnumLiteralDeclaration()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicalAndOperator"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalKExpressions.g:1516:1: rule__Expression__Alternatives : ( ( ruleBoolExpression ) | ( ruleValuedExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1520:1: ( ( ruleBoolExpression ) | ( ruleValuedExpression ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalKExpressions.g:1521:1: ( ruleBoolExpression )
                    {
                    // InternalKExpressions.g:1521:1: ( ruleBoolExpression )
                    // InternalKExpressions.g:1522:1: ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getBoolExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getBoolExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:1527:6: ( ruleValuedExpression )
                    {
                    // InternalKExpressions.g:1527:6: ( ruleValuedExpression )
                    // InternalKExpressions.g:1528:1: ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__NotOrValuedExpression__Alternatives"
    // InternalKExpressions.g:1538:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );
    public final void rule__NotOrValuedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1542:1: ( ( ruleValuedExpression ) | ( ruleNotExpression ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalKExpressions.g:1543:1: ( ruleValuedExpression )
                    {
                    // InternalKExpressions.g:1543:1: ( ruleValuedExpression )
                    // InternalKExpressions.g:1544:1: ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:1549:6: ( ruleNotExpression )
                    {
                    // InternalKExpressions.g:1549:6: ( ruleNotExpression )
                    // InternalKExpressions.g:1550:1: ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNotOrValuedExpressionAccess().getNotExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleNotExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__NotOrValuedExpression__Alternatives"


    // $ANTLR start "rule__NotExpression__Alternatives"
    // InternalKExpressions.g:1560:1: rule__NotExpression__Alternatives : ( ( ( rule__NotExpression__Group_0__0 ) ) | ( ruleAtomicExpression ) );
    public final void rule__NotExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1564:1: ( ( ( rule__NotExpression__Group_0__0 ) ) | ( ruleAtomicExpression ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=RULE_BOOLEAN && LA3_0<=RULE_ID)||LA3_0==RULE_HOSTCODE||LA3_0==16||LA3_0==25||LA3_0==30||LA3_0==35) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalKExpressions.g:1565:1: ( ( rule__NotExpression__Group_0__0 ) )
                    {
                    // InternalKExpressions.g:1565:1: ( ( rule__NotExpression__Group_0__0 ) )
                    // InternalKExpressions.g:1566:1: ( rule__NotExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNotExpressionAccess().getGroup_0()); 
                    }
                    // InternalKExpressions.g:1567:1: ( rule__NotExpression__Group_0__0 )
                    // InternalKExpressions.g:1567:2: rule__NotExpression__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__NotExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNotExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:1571:6: ( ruleAtomicExpression )
                    {
                    // InternalKExpressions.g:1571:6: ( ruleAtomicExpression )
                    // InternalKExpressions.g:1572:1: ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNotExpressionAccess().getAtomicExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAtomicExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__NotExpression__Alternatives"


    // $ANTLR start "rule__NegExpression__Alternatives"
    // InternalKExpressions.g:1582:1: rule__NegExpression__Alternatives : ( ( ( rule__NegExpression__Group_0__0 ) ) | ( ruleAtomicValuedExpression ) );
    public final void rule__NegExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1586:1: ( ( ( rule__NegExpression__Group_0__0 ) ) | ( ruleAtomicValuedExpression ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_HOSTCODE)||LA4_0==16||LA4_0==25||LA4_0==30||LA4_0==35) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalKExpressions.g:1587:1: ( ( rule__NegExpression__Group_0__0 ) )
                    {
                    // InternalKExpressions.g:1587:1: ( ( rule__NegExpression__Group_0__0 ) )
                    // InternalKExpressions.g:1588:1: ( rule__NegExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNegExpressionAccess().getGroup_0()); 
                    }
                    // InternalKExpressions.g:1589:1: ( rule__NegExpression__Group_0__0 )
                    // InternalKExpressions.g:1589:2: rule__NegExpression__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__NegExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNegExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:1593:6: ( ruleAtomicValuedExpression )
                    {
                    // InternalKExpressions.g:1593:6: ( ruleAtomicValuedExpression )
                    // InternalKExpressions.g:1594:1: ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNegExpressionAccess().getAtomicValuedExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAtomicValuedExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNegExpressionAccess().getAtomicValuedExpressionParserRuleCall_1()); 
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
    // $ANTLR end "rule__NegExpression__Alternatives"


    // $ANTLR start "rule__AtomicExpression__Alternatives"
    // InternalKExpressions.g:1604:1: rule__AtomicExpression__Alternatives : ( ( ruleBoolValue ) | ( ruleValuedObjectTestExpression ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ruleFunctionCall ) | ( ruleTextExpression ) );
    public final void rule__AtomicExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1608:1: ( ( ruleBoolValue ) | ( ruleValuedObjectTestExpression ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ruleFunctionCall ) | ( ruleTextExpression ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt5=1;
                }
                break;
            case RULE_ID:
            case 16:
            case 25:
                {
                alt5=2;
                }
                break;
            case 35:
                {
                alt5=3;
                }
                break;
            case 30:
                {
                alt5=4;
                }
                break;
            case RULE_HOSTCODE:
                {
                alt5=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalKExpressions.g:1609:1: ( ruleBoolValue )
                    {
                    // InternalKExpressions.g:1609:1: ( ruleBoolValue )
                    // InternalKExpressions.g:1610:1: ruleBoolValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getBoolValueParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleBoolValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicExpressionAccess().getBoolValueParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:1615:6: ( ruleValuedObjectTestExpression )
                    {
                    // InternalKExpressions.g:1615:6: ( ruleValuedObjectTestExpression )
                    // InternalKExpressions.g:1616:1: ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getValuedObjectTestExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleValuedObjectTestExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicExpressionAccess().getValuedObjectTestExpressionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKExpressions.g:1621:6: ( ( rule__AtomicExpression__Group_2__0 ) )
                    {
                    // InternalKExpressions.g:1621:6: ( ( rule__AtomicExpression__Group_2__0 ) )
                    // InternalKExpressions.g:1622:1: ( rule__AtomicExpression__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getGroup_2()); 
                    }
                    // InternalKExpressions.g:1623:1: ( rule__AtomicExpression__Group_2__0 )
                    // InternalKExpressions.g:1623:2: rule__AtomicExpression__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__AtomicExpression__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicExpressionAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKExpressions.g:1627:6: ( ruleFunctionCall )
                    {
                    // InternalKExpressions.g:1627:6: ( ruleFunctionCall )
                    // InternalKExpressions.g:1628:1: ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getFunctionCallParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicExpressionAccess().getFunctionCallParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKExpressions.g:1633:6: ( ruleTextExpression )
                    {
                    // InternalKExpressions.g:1633:6: ( ruleTextExpression )
                    // InternalKExpressions.g:1634:1: ruleTextExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTextExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_4()); 
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
    // $ANTLR end "rule__AtomicExpression__Alternatives"


    // $ANTLR start "rule__AtomicValuedExpression__Alternatives"
    // InternalKExpressions.g:1644:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleStringValue ) | ( ( rule__AtomicValuedExpression__Group_3__0 ) ) | ( ruleAtomicExpression ) );
    public final void rule__AtomicValuedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1648:1: ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleStringValue ) | ( ( rule__AtomicValuedExpression__Group_3__0 ) ) | ( ruleAtomicExpression ) )
            int alt6=5;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalKExpressions.g:1649:1: ( ruleIntValue )
                    {
                    // InternalKExpressions.g:1649:1: ( ruleIntValue )
                    // InternalKExpressions.g:1650:1: ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getIntValueParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleIntValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicValuedExpressionAccess().getIntValueParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:1655:6: ( ruleFloatValue )
                    {
                    // InternalKExpressions.g:1655:6: ( ruleFloatValue )
                    // InternalKExpressions.g:1656:1: ruleFloatValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleFloatValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKExpressions.g:1661:6: ( ruleStringValue )
                    {
                    // InternalKExpressions.g:1661:6: ( ruleStringValue )
                    // InternalKExpressions.g:1662:1: ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getStringValueParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleStringValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicValuedExpressionAccess().getStringValueParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKExpressions.g:1667:6: ( ( rule__AtomicValuedExpression__Group_3__0 ) )
                    {
                    // InternalKExpressions.g:1667:6: ( ( rule__AtomicValuedExpression__Group_3__0 ) )
                    // InternalKExpressions.g:1668:1: ( rule__AtomicValuedExpression__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_3()); 
                    }
                    // InternalKExpressions.g:1669:1: ( rule__AtomicValuedExpression__Group_3__0 )
                    // InternalKExpressions.g:1669:2: rule__AtomicValuedExpression__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__AtomicValuedExpression__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicValuedExpressionAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKExpressions.g:1673:6: ( ruleAtomicExpression )
                    {
                    // InternalKExpressions.g:1673:6: ( ruleAtomicExpression )
                    // InternalKExpressions.g:1674:1: ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getAtomicExpressionParserRuleCall_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAtomicExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__AtomicValuedExpression__Alternatives"


    // $ANTLR start "rule__ValuedObjectTestExpression__Alternatives"
    // InternalKExpressions.g:1684:1: rule__ValuedObjectTestExpression__Alternatives : ( ( ( rule__ValuedObjectTestExpression__Group_0__0 ) ) | ( ruleValuedObjectReference ) );
    public final void rule__ValuedObjectTestExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1688:1: ( ( ( rule__ValuedObjectTestExpression__Group_0__0 ) ) | ( ruleValuedObjectReference ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16||LA7_0==25) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalKExpressions.g:1689:1: ( ( rule__ValuedObjectTestExpression__Group_0__0 ) )
                    {
                    // InternalKExpressions.g:1689:1: ( ( rule__ValuedObjectTestExpression__Group_0__0 ) )
                    // InternalKExpressions.g:1690:1: ( rule__ValuedObjectTestExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getGroup_0()); 
                    }
                    // InternalKExpressions.g:1691:1: ( rule__ValuedObjectTestExpression__Group_0__0 )
                    // InternalKExpressions.g:1691:2: rule__ValuedObjectTestExpression__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ValuedObjectTestExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValuedObjectTestExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:1695:6: ( ruleValuedObjectReference )
                    {
                    // InternalKExpressions.g:1695:6: ( ruleValuedObjectReference )
                    // InternalKExpressions.g:1696:1: ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getValuedObjectReferenceParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleValuedObjectReference();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValuedObjectTestExpressionAccess().getValuedObjectReferenceParserRuleCall_1()); 
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
    // $ANTLR end "rule__ValuedObjectTestExpression__Alternatives"


    // $ANTLR start "rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0"
    // InternalKExpressions.g:1706:1: rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 : ( ( rulePreOperator ) | ( ruleValOperator ) );
    public final void rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1710:1: ( ( rulePreOperator ) | ( ruleValOperator ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            else if ( (LA8_0==25) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalKExpressions.g:1711:1: ( rulePreOperator )
                    {
                    // InternalKExpressions.g:1711:1: ( rulePreOperator )
                    // InternalKExpressions.g:1712:1: rulePreOperator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    rulePreOperator();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:1717:6: ( ruleValOperator )
                    {
                    // InternalKExpressions.g:1717:6: ( ruleValOperator )
                    // InternalKExpressions.g:1718:1: ruleValOperator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValOperatorEnumRuleCall_0_1_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleValOperator();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValOperatorEnumRuleCall_0_1_0_1()); 
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
    // $ANTLR end "rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0"


    // $ANTLR start "rule__FunctionCall__Alternatives_2"
    // InternalKExpressions.g:1728:1: rule__FunctionCall__Alternatives_2 : ( ( ( rule__FunctionCall__Group_2_0__0 ) ) | ( '()' ) );
    public final void rule__FunctionCall__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1732:1: ( ( ( rule__FunctionCall__Group_2_0__0 ) ) | ( '()' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==35) ) {
                alt9=1;
            }
            else if ( (LA9_0==28) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalKExpressions.g:1733:1: ( ( rule__FunctionCall__Group_2_0__0 ) )
                    {
                    // InternalKExpressions.g:1733:1: ( ( rule__FunctionCall__Group_2_0__0 ) )
                    // InternalKExpressions.g:1734:1: ( rule__FunctionCall__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctionCallAccess().getGroup_2_0()); 
                    }
                    // InternalKExpressions.g:1735:1: ( rule__FunctionCall__Group_2_0__0 )
                    // InternalKExpressions.g:1735:2: rule__FunctionCall__Group_2_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__FunctionCall__Group_2_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFunctionCallAccess().getGroup_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:1739:6: ( '()' )
                    {
                    // InternalKExpressions.g:1739:6: ( '()' )
                    // InternalKExpressions.g:1740:1: '()'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctionCallAccess().getLeftParenthesisRightParenthesisKeyword_2_1()); 
                    }
                    match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFunctionCallAccess().getLeftParenthesisRightParenthesisKeyword_2_1()); 
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
    // $ANTLR end "rule__FunctionCall__Alternatives_2"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalKExpressions.g:1757:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( ruleExtendedID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1761:1: ( ( RULE_STRING ) | ( ruleExtendedID ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalKExpressions.g:1762:1: ( RULE_STRING )
                    {
                    // InternalKExpressions.g:1762:1: ( RULE_STRING )
                    // InternalKExpressions.g:1763:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:1768:6: ( ruleExtendedID )
                    {
                    // InternalKExpressions.g:1768:6: ( ruleExtendedID )
                    // InternalKExpressions.g:1769:1: ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getExtendedIDParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleExtendedID();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getExtendedIDParserRuleCall_1()); 
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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EStringBoolean__Alternatives"
    // InternalKExpressions.g:1779:1: rule__EStringBoolean__Alternatives : ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) );
    public final void rule__EStringBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1783:1: ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt11=1;
                }
                break;
            case RULE_ID:
                {
                alt11=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt11=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalKExpressions.g:1784:1: ( RULE_STRING )
                    {
                    // InternalKExpressions.g:1784:1: ( RULE_STRING )
                    // InternalKExpressions.g:1785:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringBooleanAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringBooleanAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:1790:6: ( ruleExtendedID )
                    {
                    // InternalKExpressions.g:1790:6: ( ruleExtendedID )
                    // InternalKExpressions.g:1791:1: ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringBooleanAccess().getExtendedIDParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleExtendedID();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringBooleanAccess().getExtendedIDParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKExpressions.g:1796:6: ( RULE_BOOLEAN )
                    {
                    // InternalKExpressions.g:1796:6: ( RULE_BOOLEAN )
                    // InternalKExpressions.g:1797:1: RULE_BOOLEAN
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringBooleanAccess().getBOOLEANTerminalRuleCall_2()); 
                    }
                    match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringBooleanAccess().getBOOLEANTerminalRuleCall_2()); 
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
    // $ANTLR end "rule__EStringBoolean__Alternatives"


    // $ANTLR start "rule__CompareOperator__Alternatives"
    // InternalKExpressions.g:1807:1: rule__CompareOperator__Alternatives : ( ( ( '==' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '!=' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1811:1: ( ( ( '==' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '!=' ) ) )
            int alt12=6;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt12=1;
                }
                break;
            case 30:
                {
                alt12=2;
                }
                break;
            case 31:
                {
                alt12=3;
                }
                break;
            case 32:
                {
                alt12=4;
                }
                break;
            case 33:
                {
                alt12=5;
                }
                break;
            case 34:
                {
                alt12=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalKExpressions.g:1812:1: ( ( '==' ) )
                    {
                    // InternalKExpressions.g:1812:1: ( ( '==' ) )
                    // InternalKExpressions.g:1813:1: ( '==' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // InternalKExpressions.g:1814:1: ( '==' )
                    // InternalKExpressions.g:1814:3: '=='
                    {
                    match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:1819:6: ( ( '<' ) )
                    {
                    // InternalKExpressions.g:1819:6: ( ( '<' ) )
                    // InternalKExpressions.g:1820:1: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }
                    // InternalKExpressions.g:1821:1: ( '<' )
                    // InternalKExpressions.g:1821:3: '<'
                    {
                    match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKExpressions.g:1826:6: ( ( '<=' ) )
                    {
                    // InternalKExpressions.g:1826:6: ( ( '<=' ) )
                    // InternalKExpressions.g:1827:1: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }
                    // InternalKExpressions.g:1828:1: ( '<=' )
                    // InternalKExpressions.g:1828:3: '<='
                    {
                    match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKExpressions.g:1833:6: ( ( '>' ) )
                    {
                    // InternalKExpressions.g:1833:6: ( ( '>' ) )
                    // InternalKExpressions.g:1834:1: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }
                    // InternalKExpressions.g:1835:1: ( '>' )
                    // InternalKExpressions.g:1835:3: '>'
                    {
                    match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKExpressions.g:1840:6: ( ( '>=' ) )
                    {
                    // InternalKExpressions.g:1840:6: ( ( '>=' ) )
                    // InternalKExpressions.g:1841:1: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }
                    // InternalKExpressions.g:1842:1: ( '>=' )
                    // InternalKExpressions.g:1842:3: '>='
                    {
                    match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKExpressions.g:1847:6: ( ( '!=' ) )
                    {
                    // InternalKExpressions.g:1847:6: ( ( '!=' ) )
                    // InternalKExpressions.g:1848:1: ( '!=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_5()); 
                    }
                    // InternalKExpressions.g:1849:1: ( '!=' )
                    // InternalKExpressions.g:1849:3: '!='
                    {
                    match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__CompareOperator__Alternatives"


    // $ANTLR start "rule__LogicalOrExpression__Group__0"
    // InternalKExpressions.g:1863:1: rule__LogicalOrExpression__Group__0 : rule__LogicalOrExpression__Group__0__Impl rule__LogicalOrExpression__Group__1 ;
    public final void rule__LogicalOrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1867:1: ( rule__LogicalOrExpression__Group__0__Impl rule__LogicalOrExpression__Group__1 )
            // InternalKExpressions.g:1868:2: rule__LogicalOrExpression__Group__0__Impl rule__LogicalOrExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__LogicalOrExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalOrExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpression__Group__0"


    // $ANTLR start "rule__LogicalOrExpression__Group__0__Impl"
    // InternalKExpressions.g:1875:1: rule__LogicalOrExpression__Group__0__Impl : ( ruleLogicalAndExpression ) ;
    public final void rule__LogicalOrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1879:1: ( ( ruleLogicalAndExpression ) )
            // InternalKExpressions.g:1880:1: ( ruleLogicalAndExpression )
            {
            // InternalKExpressions.g:1880:1: ( ruleLogicalAndExpression )
            // InternalKExpressions.g:1881:1: ruleLogicalAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpression__Group__0__Impl"


    // $ANTLR start "rule__LogicalOrExpression__Group__1"
    // InternalKExpressions.g:1892:1: rule__LogicalOrExpression__Group__1 : rule__LogicalOrExpression__Group__1__Impl ;
    public final void rule__LogicalOrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1896:1: ( rule__LogicalOrExpression__Group__1__Impl )
            // InternalKExpressions.g:1897:2: rule__LogicalOrExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalOrExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpression__Group__1"


    // $ANTLR start "rule__LogicalOrExpression__Group__1__Impl"
    // InternalKExpressions.g:1903:1: rule__LogicalOrExpression__Group__1__Impl : ( ( rule__LogicalOrExpression__Group_1__0 )? ) ;
    public final void rule__LogicalOrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1907:1: ( ( ( rule__LogicalOrExpression__Group_1__0 )? ) )
            // InternalKExpressions.g:1908:1: ( ( rule__LogicalOrExpression__Group_1__0 )? )
            {
            // InternalKExpressions.g:1908:1: ( ( rule__LogicalOrExpression__Group_1__0 )? )
            // InternalKExpressions.g:1909:1: ( rule__LogicalOrExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:1910:1: ( rule__LogicalOrExpression__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalKExpressions.g:1910:2: rule__LogicalOrExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__LogicalOrExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpression__Group__1__Impl"


    // $ANTLR start "rule__LogicalOrExpression__Group_1__0"
    // InternalKExpressions.g:1924:1: rule__LogicalOrExpression__Group_1__0 : rule__LogicalOrExpression__Group_1__0__Impl rule__LogicalOrExpression__Group_1__1 ;
    public final void rule__LogicalOrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1928:1: ( rule__LogicalOrExpression__Group_1__0__Impl rule__LogicalOrExpression__Group_1__1 )
            // InternalKExpressions.g:1929:2: rule__LogicalOrExpression__Group_1__0__Impl rule__LogicalOrExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__LogicalOrExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalOrExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpression__Group_1__0"


    // $ANTLR start "rule__LogicalOrExpression__Group_1__0__Impl"
    // InternalKExpressions.g:1936:1: rule__LogicalOrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__LogicalOrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1940:1: ( ( () ) )
            // InternalKExpressions.g:1941:1: ( () )
            {
            // InternalKExpressions.g:1941:1: ( () )
            // InternalKExpressions.g:1942:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:1943:1: ()
            // InternalKExpressions.g:1945:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpression__Group_1__0__Impl"


    // $ANTLR start "rule__LogicalOrExpression__Group_1__1"
    // InternalKExpressions.g:1955:1: rule__LogicalOrExpression__Group_1__1 : rule__LogicalOrExpression__Group_1__1__Impl rule__LogicalOrExpression__Group_1__2 ;
    public final void rule__LogicalOrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1959:1: ( rule__LogicalOrExpression__Group_1__1__Impl rule__LogicalOrExpression__Group_1__2 )
            // InternalKExpressions.g:1960:2: rule__LogicalOrExpression__Group_1__1__Impl rule__LogicalOrExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__LogicalOrExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalOrExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpression__Group_1__1"


    // $ANTLR start "rule__LogicalOrExpression__Group_1__1__Impl"
    // InternalKExpressions.g:1967:1: rule__LogicalOrExpression__Group_1__1__Impl : ( ( rule__LogicalOrExpression__Group_1_1__0 ) ) ;
    public final void rule__LogicalOrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1971:1: ( ( ( rule__LogicalOrExpression__Group_1_1__0 ) ) )
            // InternalKExpressions.g:1972:1: ( ( rule__LogicalOrExpression__Group_1_1__0 ) )
            {
            // InternalKExpressions.g:1972:1: ( ( rule__LogicalOrExpression__Group_1_1__0 ) )
            // InternalKExpressions.g:1973:1: ( rule__LogicalOrExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExpressionAccess().getGroup_1_1()); 
            }
            // InternalKExpressions.g:1974:1: ( rule__LogicalOrExpression__Group_1_1__0 )
            // InternalKExpressions.g:1974:2: rule__LogicalOrExpression__Group_1_1__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalOrExpression__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrExpressionAccess().getGroup_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpression__Group_1__1__Impl"


    // $ANTLR start "rule__LogicalOrExpression__Group_1__2"
    // InternalKExpressions.g:1984:1: rule__LogicalOrExpression__Group_1__2 : rule__LogicalOrExpression__Group_1__2__Impl ;
    public final void rule__LogicalOrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1988:1: ( rule__LogicalOrExpression__Group_1__2__Impl )
            // InternalKExpressions.g:1989:2: rule__LogicalOrExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalOrExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpression__Group_1__2"


    // $ANTLR start "rule__LogicalOrExpression__Group_1__2__Impl"
    // InternalKExpressions.g:1995:1: rule__LogicalOrExpression__Group_1__2__Impl : ( ( rule__LogicalOrExpression__Group_1_2__0 )* ) ;
    public final void rule__LogicalOrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1999:1: ( ( ( rule__LogicalOrExpression__Group_1_2__0 )* ) )
            // InternalKExpressions.g:2000:1: ( ( rule__LogicalOrExpression__Group_1_2__0 )* )
            {
            // InternalKExpressions.g:2000:1: ( ( rule__LogicalOrExpression__Group_1_2__0 )* )
            // InternalKExpressions.g:2001:1: ( rule__LogicalOrExpression__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExpressionAccess().getGroup_1_2()); 
            }
            // InternalKExpressions.g:2002:1: ( rule__LogicalOrExpression__Group_1_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalKExpressions.g:2002:2: rule__LogicalOrExpression__Group_1_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    rule__LogicalOrExpression__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrExpressionAccess().getGroup_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpression__Group_1__2__Impl"


    // $ANTLR start "rule__LogicalOrExpression__Group_1_1__0"
    // InternalKExpressions.g:2018:1: rule__LogicalOrExpression__Group_1_1__0 : rule__LogicalOrExpression__Group_1_1__0__Impl rule__LogicalOrExpression__Group_1_1__1 ;
    public final void rule__LogicalOrExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2022:1: ( rule__LogicalOrExpression__Group_1_1__0__Impl rule__LogicalOrExpression__Group_1_1__1 )
            // InternalKExpressions.g:2023:2: rule__LogicalOrExpression__Group_1_1__0__Impl rule__LogicalOrExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__LogicalOrExpression__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalOrExpression__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpression__Group_1_1__0"


    // $ANTLR start "rule__LogicalOrExpression__Group_1_1__0__Impl"
    // InternalKExpressions.g:2030:1: rule__LogicalOrExpression__Group_1_1__0__Impl : ( ( rule__LogicalOrExpression__OperatorAssignment_1_1_0 ) ) ;
    public final void rule__LogicalOrExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2034:1: ( ( ( rule__LogicalOrExpression__OperatorAssignment_1_1_0 ) ) )
            // InternalKExpressions.g:2035:1: ( ( rule__LogicalOrExpression__OperatorAssignment_1_1_0 ) )
            {
            // InternalKExpressions.g:2035:1: ( ( rule__LogicalOrExpression__OperatorAssignment_1_1_0 ) )
            // InternalKExpressions.g:2036:1: ( rule__LogicalOrExpression__OperatorAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExpressionAccess().getOperatorAssignment_1_1_0()); 
            }
            // InternalKExpressions.g:2037:1: ( rule__LogicalOrExpression__OperatorAssignment_1_1_0 )
            // InternalKExpressions.g:2037:2: rule__LogicalOrExpression__OperatorAssignment_1_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalOrExpression__OperatorAssignment_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrExpressionAccess().getOperatorAssignment_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpression__Group_1_1__0__Impl"


    // $ANTLR start "rule__LogicalOrExpression__Group_1_1__1"
    // InternalKExpressions.g:2047:1: rule__LogicalOrExpression__Group_1_1__1 : rule__LogicalOrExpression__Group_1_1__1__Impl ;
    public final void rule__LogicalOrExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2051:1: ( rule__LogicalOrExpression__Group_1_1__1__Impl )
            // InternalKExpressions.g:2052:2: rule__LogicalOrExpression__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalOrExpression__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpression__Group_1_1__1"


    // $ANTLR start "rule__LogicalOrExpression__Group_1_1__1__Impl"
    // InternalKExpressions.g:2058:1: rule__LogicalOrExpression__Group_1_1__1__Impl : ( ( rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__LogicalOrExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2062:1: ( ( ( rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1 ) ) )
            // InternalKExpressions.g:2063:1: ( ( rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1 ) )
            {
            // InternalKExpressions.g:2063:1: ( ( rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1 ) )
            // InternalKExpressions.g:2064:1: ( rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }
            // InternalKExpressions.g:2065:1: ( rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1 )
            // InternalKExpressions.g:2065:2: rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpression__Group_1_1__1__Impl"


    // $ANTLR start "rule__LogicalOrExpression__Group_1_2__0"
    // InternalKExpressions.g:2079:1: rule__LogicalOrExpression__Group_1_2__0 : rule__LogicalOrExpression__Group_1_2__0__Impl rule__LogicalOrExpression__Group_1_2__1 ;
    public final void rule__LogicalOrExpression__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2083:1: ( rule__LogicalOrExpression__Group_1_2__0__Impl rule__LogicalOrExpression__Group_1_2__1 )
            // InternalKExpressions.g:2084:2: rule__LogicalOrExpression__Group_1_2__0__Impl rule__LogicalOrExpression__Group_1_2__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__LogicalOrExpression__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalOrExpression__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpression__Group_1_2__0"


    // $ANTLR start "rule__LogicalOrExpression__Group_1_2__0__Impl"
    // InternalKExpressions.g:2091:1: rule__LogicalOrExpression__Group_1_2__0__Impl : ( '||' ) ;
    public final void rule__LogicalOrExpression__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2095:1: ( ( '||' ) )
            // InternalKExpressions.g:2096:1: ( '||' )
            {
            // InternalKExpressions.g:2096:1: ( '||' )
            // InternalKExpressions.g:2097:1: '||'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_2_0()); 
            }
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpression__Group_1_2__0__Impl"


    // $ANTLR start "rule__LogicalOrExpression__Group_1_2__1"
    // InternalKExpressions.g:2110:1: rule__LogicalOrExpression__Group_1_2__1 : rule__LogicalOrExpression__Group_1_2__1__Impl ;
    public final void rule__LogicalOrExpression__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2114:1: ( rule__LogicalOrExpression__Group_1_2__1__Impl )
            // InternalKExpressions.g:2115:2: rule__LogicalOrExpression__Group_1_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalOrExpression__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpression__Group_1_2__1"


    // $ANTLR start "rule__LogicalOrExpression__Group_1_2__1__Impl"
    // InternalKExpressions.g:2121:1: rule__LogicalOrExpression__Group_1_2__1__Impl : ( ( rule__LogicalOrExpression__SubExpressionsAssignment_1_2_1 ) ) ;
    public final void rule__LogicalOrExpression__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2125:1: ( ( ( rule__LogicalOrExpression__SubExpressionsAssignment_1_2_1 ) ) )
            // InternalKExpressions.g:2126:1: ( ( rule__LogicalOrExpression__SubExpressionsAssignment_1_2_1 ) )
            {
            // InternalKExpressions.g:2126:1: ( ( rule__LogicalOrExpression__SubExpressionsAssignment_1_2_1 ) )
            // InternalKExpressions.g:2127:1: ( rule__LogicalOrExpression__SubExpressionsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsAssignment_1_2_1()); 
            }
            // InternalKExpressions.g:2128:1: ( rule__LogicalOrExpression__SubExpressionsAssignment_1_2_1 )
            // InternalKExpressions.g:2128:2: rule__LogicalOrExpression__SubExpressionsAssignment_1_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalOrExpression__SubExpressionsAssignment_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsAssignment_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpression__Group_1_2__1__Impl"


    // $ANTLR start "rule__LogicalAndExpression__Group__0"
    // InternalKExpressions.g:2142:1: rule__LogicalAndExpression__Group__0 : rule__LogicalAndExpression__Group__0__Impl rule__LogicalAndExpression__Group__1 ;
    public final void rule__LogicalAndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2146:1: ( rule__LogicalAndExpression__Group__0__Impl rule__LogicalAndExpression__Group__1 )
            // InternalKExpressions.g:2147:2: rule__LogicalAndExpression__Group__0__Impl rule__LogicalAndExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__LogicalAndExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalAndExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpression__Group__0"


    // $ANTLR start "rule__LogicalAndExpression__Group__0__Impl"
    // InternalKExpressions.g:2154:1: rule__LogicalAndExpression__Group__0__Impl : ( ruleBitwiseOrExpression ) ;
    public final void rule__LogicalAndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2158:1: ( ( ruleBitwiseOrExpression ) )
            // InternalKExpressions.g:2159:1: ( ruleBitwiseOrExpression )
            {
            // InternalKExpressions.g:2159:1: ( ruleBitwiseOrExpression )
            // InternalKExpressions.g:2160:1: ruleBitwiseOrExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpression__Group__0__Impl"


    // $ANTLR start "rule__LogicalAndExpression__Group__1"
    // InternalKExpressions.g:2171:1: rule__LogicalAndExpression__Group__1 : rule__LogicalAndExpression__Group__1__Impl ;
    public final void rule__LogicalAndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2175:1: ( rule__LogicalAndExpression__Group__1__Impl )
            // InternalKExpressions.g:2176:2: rule__LogicalAndExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalAndExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpression__Group__1"


    // $ANTLR start "rule__LogicalAndExpression__Group__1__Impl"
    // InternalKExpressions.g:2182:1: rule__LogicalAndExpression__Group__1__Impl : ( ( rule__LogicalAndExpression__Group_1__0 )? ) ;
    public final void rule__LogicalAndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2186:1: ( ( ( rule__LogicalAndExpression__Group_1__0 )? ) )
            // InternalKExpressions.g:2187:1: ( ( rule__LogicalAndExpression__Group_1__0 )? )
            {
            // InternalKExpressions.g:2187:1: ( ( rule__LogicalAndExpression__Group_1__0 )? )
            // InternalKExpressions.g:2188:1: ( rule__LogicalAndExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:2189:1: ( rule__LogicalAndExpression__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalKExpressions.g:2189:2: rule__LogicalAndExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__LogicalAndExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpression__Group__1__Impl"


    // $ANTLR start "rule__LogicalAndExpression__Group_1__0"
    // InternalKExpressions.g:2203:1: rule__LogicalAndExpression__Group_1__0 : rule__LogicalAndExpression__Group_1__0__Impl rule__LogicalAndExpression__Group_1__1 ;
    public final void rule__LogicalAndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2207:1: ( rule__LogicalAndExpression__Group_1__0__Impl rule__LogicalAndExpression__Group_1__1 )
            // InternalKExpressions.g:2208:2: rule__LogicalAndExpression__Group_1__0__Impl rule__LogicalAndExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__LogicalAndExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalAndExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpression__Group_1__0"


    // $ANTLR start "rule__LogicalAndExpression__Group_1__0__Impl"
    // InternalKExpressions.g:2215:1: rule__LogicalAndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__LogicalAndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2219:1: ( ( () ) )
            // InternalKExpressions.g:2220:1: ( () )
            {
            // InternalKExpressions.g:2220:1: ( () )
            // InternalKExpressions.g:2221:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:2222:1: ()
            // InternalKExpressions.g:2224:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpression__Group_1__0__Impl"


    // $ANTLR start "rule__LogicalAndExpression__Group_1__1"
    // InternalKExpressions.g:2234:1: rule__LogicalAndExpression__Group_1__1 : rule__LogicalAndExpression__Group_1__1__Impl rule__LogicalAndExpression__Group_1__2 ;
    public final void rule__LogicalAndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2238:1: ( rule__LogicalAndExpression__Group_1__1__Impl rule__LogicalAndExpression__Group_1__2 )
            // InternalKExpressions.g:2239:2: rule__LogicalAndExpression__Group_1__1__Impl rule__LogicalAndExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__LogicalAndExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalAndExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpression__Group_1__1"


    // $ANTLR start "rule__LogicalAndExpression__Group_1__1__Impl"
    // InternalKExpressions.g:2246:1: rule__LogicalAndExpression__Group_1__1__Impl : ( ( rule__LogicalAndExpression__Group_1_1__0 ) ) ;
    public final void rule__LogicalAndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2250:1: ( ( ( rule__LogicalAndExpression__Group_1_1__0 ) ) )
            // InternalKExpressions.g:2251:1: ( ( rule__LogicalAndExpression__Group_1_1__0 ) )
            {
            // InternalKExpressions.g:2251:1: ( ( rule__LogicalAndExpression__Group_1_1__0 ) )
            // InternalKExpressions.g:2252:1: ( rule__LogicalAndExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExpressionAccess().getGroup_1_1()); 
            }
            // InternalKExpressions.g:2253:1: ( rule__LogicalAndExpression__Group_1_1__0 )
            // InternalKExpressions.g:2253:2: rule__LogicalAndExpression__Group_1_1__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalAndExpression__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndExpressionAccess().getGroup_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__LogicalAndExpression__Group_1__2"
    // InternalKExpressions.g:2263:1: rule__LogicalAndExpression__Group_1__2 : rule__LogicalAndExpression__Group_1__2__Impl ;
    public final void rule__LogicalAndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2267:1: ( rule__LogicalAndExpression__Group_1__2__Impl )
            // InternalKExpressions.g:2268:2: rule__LogicalAndExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalAndExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpression__Group_1__2"


    // $ANTLR start "rule__LogicalAndExpression__Group_1__2__Impl"
    // InternalKExpressions.g:2274:1: rule__LogicalAndExpression__Group_1__2__Impl : ( ( rule__LogicalAndExpression__Group_1_2__0 )* ) ;
    public final void rule__LogicalAndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2278:1: ( ( ( rule__LogicalAndExpression__Group_1_2__0 )* ) )
            // InternalKExpressions.g:2279:1: ( ( rule__LogicalAndExpression__Group_1_2__0 )* )
            {
            // InternalKExpressions.g:2279:1: ( ( rule__LogicalAndExpression__Group_1_2__0 )* )
            // InternalKExpressions.g:2280:1: ( rule__LogicalAndExpression__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExpressionAccess().getGroup_1_2()); 
            }
            // InternalKExpressions.g:2281:1: ( rule__LogicalAndExpression__Group_1_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==27) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalKExpressions.g:2281:2: rule__LogicalAndExpression__Group_1_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    rule__LogicalAndExpression__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndExpressionAccess().getGroup_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpression__Group_1__2__Impl"


    // $ANTLR start "rule__LogicalAndExpression__Group_1_1__0"
    // InternalKExpressions.g:2297:1: rule__LogicalAndExpression__Group_1_1__0 : rule__LogicalAndExpression__Group_1_1__0__Impl rule__LogicalAndExpression__Group_1_1__1 ;
    public final void rule__LogicalAndExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2301:1: ( rule__LogicalAndExpression__Group_1_1__0__Impl rule__LogicalAndExpression__Group_1_1__1 )
            // InternalKExpressions.g:2302:2: rule__LogicalAndExpression__Group_1_1__0__Impl rule__LogicalAndExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__LogicalAndExpression__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalAndExpression__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpression__Group_1_1__0"


    // $ANTLR start "rule__LogicalAndExpression__Group_1_1__0__Impl"
    // InternalKExpressions.g:2309:1: rule__LogicalAndExpression__Group_1_1__0__Impl : ( ( rule__LogicalAndExpression__OperatorAssignment_1_1_0 ) ) ;
    public final void rule__LogicalAndExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2313:1: ( ( ( rule__LogicalAndExpression__OperatorAssignment_1_1_0 ) ) )
            // InternalKExpressions.g:2314:1: ( ( rule__LogicalAndExpression__OperatorAssignment_1_1_0 ) )
            {
            // InternalKExpressions.g:2314:1: ( ( rule__LogicalAndExpression__OperatorAssignment_1_1_0 ) )
            // InternalKExpressions.g:2315:1: ( rule__LogicalAndExpression__OperatorAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExpressionAccess().getOperatorAssignment_1_1_0()); 
            }
            // InternalKExpressions.g:2316:1: ( rule__LogicalAndExpression__OperatorAssignment_1_1_0 )
            // InternalKExpressions.g:2316:2: rule__LogicalAndExpression__OperatorAssignment_1_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalAndExpression__OperatorAssignment_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndExpressionAccess().getOperatorAssignment_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpression__Group_1_1__0__Impl"


    // $ANTLR start "rule__LogicalAndExpression__Group_1_1__1"
    // InternalKExpressions.g:2326:1: rule__LogicalAndExpression__Group_1_1__1 : rule__LogicalAndExpression__Group_1_1__1__Impl ;
    public final void rule__LogicalAndExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2330:1: ( rule__LogicalAndExpression__Group_1_1__1__Impl )
            // InternalKExpressions.g:2331:2: rule__LogicalAndExpression__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalAndExpression__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpression__Group_1_1__1"


    // $ANTLR start "rule__LogicalAndExpression__Group_1_1__1__Impl"
    // InternalKExpressions.g:2337:1: rule__LogicalAndExpression__Group_1_1__1__Impl : ( ( rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__LogicalAndExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2341:1: ( ( ( rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1 ) ) )
            // InternalKExpressions.g:2342:1: ( ( rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1 ) )
            {
            // InternalKExpressions.g:2342:1: ( ( rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1 ) )
            // InternalKExpressions.g:2343:1: ( rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }
            // InternalKExpressions.g:2344:1: ( rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1 )
            // InternalKExpressions.g:2344:2: rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpression__Group_1_1__1__Impl"


    // $ANTLR start "rule__LogicalAndExpression__Group_1_2__0"
    // InternalKExpressions.g:2358:1: rule__LogicalAndExpression__Group_1_2__0 : rule__LogicalAndExpression__Group_1_2__0__Impl rule__LogicalAndExpression__Group_1_2__1 ;
    public final void rule__LogicalAndExpression__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2362:1: ( rule__LogicalAndExpression__Group_1_2__0__Impl rule__LogicalAndExpression__Group_1_2__1 )
            // InternalKExpressions.g:2363:2: rule__LogicalAndExpression__Group_1_2__0__Impl rule__LogicalAndExpression__Group_1_2__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__LogicalAndExpression__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalAndExpression__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpression__Group_1_2__0"


    // $ANTLR start "rule__LogicalAndExpression__Group_1_2__0__Impl"
    // InternalKExpressions.g:2370:1: rule__LogicalAndExpression__Group_1_2__0__Impl : ( '&&' ) ;
    public final void rule__LogicalAndExpression__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2374:1: ( ( '&&' ) )
            // InternalKExpressions.g:2375:1: ( '&&' )
            {
            // InternalKExpressions.g:2375:1: ( '&&' )
            // InternalKExpressions.g:2376:1: '&&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExpressionAccess().getAmpersandAmpersandKeyword_1_2_0()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndExpressionAccess().getAmpersandAmpersandKeyword_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpression__Group_1_2__0__Impl"


    // $ANTLR start "rule__LogicalAndExpression__Group_1_2__1"
    // InternalKExpressions.g:2389:1: rule__LogicalAndExpression__Group_1_2__1 : rule__LogicalAndExpression__Group_1_2__1__Impl ;
    public final void rule__LogicalAndExpression__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2393:1: ( rule__LogicalAndExpression__Group_1_2__1__Impl )
            // InternalKExpressions.g:2394:2: rule__LogicalAndExpression__Group_1_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalAndExpression__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpression__Group_1_2__1"


    // $ANTLR start "rule__LogicalAndExpression__Group_1_2__1__Impl"
    // InternalKExpressions.g:2400:1: rule__LogicalAndExpression__Group_1_2__1__Impl : ( ( rule__LogicalAndExpression__SubExpressionsAssignment_1_2_1 ) ) ;
    public final void rule__LogicalAndExpression__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2404:1: ( ( ( rule__LogicalAndExpression__SubExpressionsAssignment_1_2_1 ) ) )
            // InternalKExpressions.g:2405:1: ( ( rule__LogicalAndExpression__SubExpressionsAssignment_1_2_1 ) )
            {
            // InternalKExpressions.g:2405:1: ( ( rule__LogicalAndExpression__SubExpressionsAssignment_1_2_1 ) )
            // InternalKExpressions.g:2406:1: ( rule__LogicalAndExpression__SubExpressionsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsAssignment_1_2_1()); 
            }
            // InternalKExpressions.g:2407:1: ( rule__LogicalAndExpression__SubExpressionsAssignment_1_2_1 )
            // InternalKExpressions.g:2407:2: rule__LogicalAndExpression__SubExpressionsAssignment_1_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalAndExpression__SubExpressionsAssignment_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsAssignment_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpression__Group_1_2__1__Impl"


    // $ANTLR start "rule__BitwiseOrExpression__Group__0"
    // InternalKExpressions.g:2421:1: rule__BitwiseOrExpression__Group__0 : rule__BitwiseOrExpression__Group__0__Impl rule__BitwiseOrExpression__Group__1 ;
    public final void rule__BitwiseOrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2425:1: ( rule__BitwiseOrExpression__Group__0__Impl rule__BitwiseOrExpression__Group__1 )
            // InternalKExpressions.g:2426:2: rule__BitwiseOrExpression__Group__0__Impl rule__BitwiseOrExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__BitwiseOrExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BitwiseOrExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitwiseOrExpression__Group__0"


    // $ANTLR start "rule__BitwiseOrExpression__Group__0__Impl"
    // InternalKExpressions.g:2433:1: rule__BitwiseOrExpression__Group__0__Impl : ( ruleBitwiseAndExpression ) ;
    public final void rule__BitwiseOrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2437:1: ( ( ruleBitwiseAndExpression ) )
            // InternalKExpressions.g:2438:1: ( ruleBitwiseAndExpression )
            {
            // InternalKExpressions.g:2438:1: ( ruleBitwiseAndExpression )
            // InternalKExpressions.g:2439:1: ruleBitwiseAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitwiseOrExpression__Group__0__Impl"


    // $ANTLR start "rule__BitwiseOrExpression__Group__1"
    // InternalKExpressions.g:2450:1: rule__BitwiseOrExpression__Group__1 : rule__BitwiseOrExpression__Group__1__Impl ;
    public final void rule__BitwiseOrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2454:1: ( rule__BitwiseOrExpression__Group__1__Impl )
            // InternalKExpressions.g:2455:2: rule__BitwiseOrExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BitwiseOrExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitwiseOrExpression__Group__1"


    // $ANTLR start "rule__BitwiseOrExpression__Group__1__Impl"
    // InternalKExpressions.g:2461:1: rule__BitwiseOrExpression__Group__1__Impl : ( ( rule__BitwiseOrExpression__Group_1__0 )? ) ;
    public final void rule__BitwiseOrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2465:1: ( ( ( rule__BitwiseOrExpression__Group_1__0 )? ) )
            // InternalKExpressions.g:2466:1: ( ( rule__BitwiseOrExpression__Group_1__0 )? )
            {
            // InternalKExpressions.g:2466:1: ( ( rule__BitwiseOrExpression__Group_1__0 )? )
            // InternalKExpressions.g:2467:1: ( rule__BitwiseOrExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:2468:1: ( rule__BitwiseOrExpression__Group_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==17) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalKExpressions.g:2468:2: rule__BitwiseOrExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__BitwiseOrExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBitwiseOrExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitwiseOrExpression__Group__1__Impl"


    // $ANTLR start "rule__BitwiseOrExpression__Group_1__0"
    // InternalKExpressions.g:2482:1: rule__BitwiseOrExpression__Group_1__0 : rule__BitwiseOrExpression__Group_1__0__Impl rule__BitwiseOrExpression__Group_1__1 ;
    public final void rule__BitwiseOrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2486:1: ( rule__BitwiseOrExpression__Group_1__0__Impl rule__BitwiseOrExpression__Group_1__1 )
            // InternalKExpressions.g:2487:2: rule__BitwiseOrExpression__Group_1__0__Impl rule__BitwiseOrExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__BitwiseOrExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BitwiseOrExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitwiseOrExpression__Group_1__0"


    // $ANTLR start "rule__BitwiseOrExpression__Group_1__0__Impl"
    // InternalKExpressions.g:2494:1: rule__BitwiseOrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__BitwiseOrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2498:1: ( ( () ) )
            // InternalKExpressions.g:2499:1: ( () )
            {
            // InternalKExpressions.g:2499:1: ( () )
            // InternalKExpressions.g:2500:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:2501:1: ()
            // InternalKExpressions.g:2503:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBitwiseOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitwiseOrExpression__Group_1__0__Impl"


    // $ANTLR start "rule__BitwiseOrExpression__Group_1__1"
    // InternalKExpressions.g:2513:1: rule__BitwiseOrExpression__Group_1__1 : rule__BitwiseOrExpression__Group_1__1__Impl rule__BitwiseOrExpression__Group_1__2 ;
    public final void rule__BitwiseOrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2517:1: ( rule__BitwiseOrExpression__Group_1__1__Impl rule__BitwiseOrExpression__Group_1__2 )
            // InternalKExpressions.g:2518:2: rule__BitwiseOrExpression__Group_1__1__Impl rule__BitwiseOrExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__BitwiseOrExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BitwiseOrExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitwiseOrExpression__Group_1__1"


    // $ANTLR start "rule__BitwiseOrExpression__Group_1__1__Impl"
    // InternalKExpressions.g:2525:1: rule__BitwiseOrExpression__Group_1__1__Impl : ( ( rule__BitwiseOrExpression__Group_1_1__0 ) ) ;
    public final void rule__BitwiseOrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2529:1: ( ( ( rule__BitwiseOrExpression__Group_1_1__0 ) ) )
            // InternalKExpressions.g:2530:1: ( ( rule__BitwiseOrExpression__Group_1_1__0 ) )
            {
            // InternalKExpressions.g:2530:1: ( ( rule__BitwiseOrExpression__Group_1_1__0 ) )
            // InternalKExpressions.g:2531:1: ( rule__BitwiseOrExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrExpressionAccess().getGroup_1_1()); 
            }
            // InternalKExpressions.g:2532:1: ( rule__BitwiseOrExpression__Group_1_1__0 )
            // InternalKExpressions.g:2532:2: rule__BitwiseOrExpression__Group_1_1__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BitwiseOrExpression__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBitwiseOrExpressionAccess().getGroup_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitwiseOrExpression__Group_1__1__Impl"


    // $ANTLR start "rule__BitwiseOrExpression__Group_1__2"
    // InternalKExpressions.g:2542:1: rule__BitwiseOrExpression__Group_1__2 : rule__BitwiseOrExpression__Group_1__2__Impl ;
    public final void rule__BitwiseOrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2546:1: ( rule__BitwiseOrExpression__Group_1__2__Impl )
            // InternalKExpressions.g:2547:2: rule__BitwiseOrExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BitwiseOrExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitwiseOrExpression__Group_1__2"


    // $ANTLR start "rule__BitwiseOrExpression__Group_1__2__Impl"
    // InternalKExpressions.g:2553:1: rule__BitwiseOrExpression__Group_1__2__Impl : ( ( rule__BitwiseOrExpression__Group_1_2__0 )* ) ;
    public final void rule__BitwiseOrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2557:1: ( ( ( rule__BitwiseOrExpression__Group_1_2__0 )* ) )
            // InternalKExpressions.g:2558:1: ( ( rule__BitwiseOrExpression__Group_1_2__0 )* )
            {
            // InternalKExpressions.g:2558:1: ( ( rule__BitwiseOrExpression__Group_1_2__0 )* )
            // InternalKExpressions.g:2559:1: ( rule__BitwiseOrExpression__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrExpressionAccess().getGroup_1_2()); 
            }
            // InternalKExpressions.g:2560:1: ( rule__BitwiseOrExpression__Group_1_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==17) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalKExpressions.g:2560:2: rule__BitwiseOrExpression__Group_1_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    rule__BitwiseOrExpression__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBitwiseOrExpressionAccess().getGroup_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitwiseOrExpression__Group_1__2__Impl"


    // $ANTLR start "rule__BitwiseOrExpression__Group_1_1__0"
    // InternalKExpressions.g:2576:1: rule__BitwiseOrExpression__Group_1_1__0 : rule__BitwiseOrExpression__Group_1_1__0__Impl rule__BitwiseOrExpression__Group_1_1__1 ;
    public final void rule__BitwiseOrExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2580:1: ( rule__BitwiseOrExpression__Group_1_1__0__Impl rule__BitwiseOrExpression__Group_1_1__1 )
            // InternalKExpressions.g:2581:2: rule__BitwiseOrExpression__Group_1_1__0__Impl rule__BitwiseOrExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__BitwiseOrExpression__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BitwiseOrExpression__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitwiseOrExpression__Group_1_1__0"


    // $ANTLR start "rule__BitwiseOrExpression__Group_1_1__0__Impl"
    // InternalKExpressions.g:2588:1: rule__BitwiseOrExpression__Group_1_1__0__Impl : ( ( rule__BitwiseOrExpression__OperatorAssignment_1_1_0 ) ) ;
    public final void rule__BitwiseOrExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2592:1: ( ( ( rule__BitwiseOrExpression__OperatorAssignment_1_1_0 ) ) )
            // InternalKExpressions.g:2593:1: ( ( rule__BitwiseOrExpression__OperatorAssignment_1_1_0 ) )
            {
            // InternalKExpressions.g:2593:1: ( ( rule__BitwiseOrExpression__OperatorAssignment_1_1_0 ) )
            // InternalKExpressions.g:2594:1: ( rule__BitwiseOrExpression__OperatorAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrExpressionAccess().getOperatorAssignment_1_1_0()); 
            }
            // InternalKExpressions.g:2595:1: ( rule__BitwiseOrExpression__OperatorAssignment_1_1_0 )
            // InternalKExpressions.g:2595:2: rule__BitwiseOrExpression__OperatorAssignment_1_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BitwiseOrExpression__OperatorAssignment_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBitwiseOrExpressionAccess().getOperatorAssignment_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitwiseOrExpression__Group_1_1__0__Impl"


    // $ANTLR start "rule__BitwiseOrExpression__Group_1_1__1"
    // InternalKExpressions.g:2605:1: rule__BitwiseOrExpression__Group_1_1__1 : rule__BitwiseOrExpression__Group_1_1__1__Impl ;
    public final void rule__BitwiseOrExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2609:1: ( rule__BitwiseOrExpression__Group_1_1__1__Impl )
            // InternalKExpressions.g:2610:2: rule__BitwiseOrExpression__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BitwiseOrExpression__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitwiseOrExpression__Group_1_1__1"


    // $ANTLR start "rule__BitwiseOrExpression__Group_1_1__1__Impl"
    // InternalKExpressions.g:2616:1: rule__BitwiseOrExpression__Group_1_1__1__Impl : ( ( rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__BitwiseOrExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2620:1: ( ( ( rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1 ) ) )
            // InternalKExpressions.g:2621:1: ( ( rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1 ) )
            {
            // InternalKExpressions.g:2621:1: ( ( rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1 ) )
            // InternalKExpressions.g:2622:1: ( rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }
            // InternalKExpressions.g:2623:1: ( rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1 )
            // InternalKExpressions.g:2623:2: rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitwiseOrExpression__Group_1_1__1__Impl"


    // $ANTLR start "rule__BitwiseOrExpression__Group_1_2__0"
    // InternalKExpressions.g:2637:1: rule__BitwiseOrExpression__Group_1_2__0 : rule__BitwiseOrExpression__Group_1_2__0__Impl rule__BitwiseOrExpression__Group_1_2__1 ;
    public final void rule__BitwiseOrExpression__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2641:1: ( rule__BitwiseOrExpression__Group_1_2__0__Impl rule__BitwiseOrExpression__Group_1_2__1 )
            // InternalKExpressions.g:2642:2: rule__BitwiseOrExpression__Group_1_2__0__Impl rule__BitwiseOrExpression__Group_1_2__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__BitwiseOrExpression__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BitwiseOrExpression__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitwiseOrExpression__Group_1_2__0"


    // $ANTLR start "rule__BitwiseOrExpression__Group_1_2__0__Impl"
    // InternalKExpressions.g:2649:1: rule__BitwiseOrExpression__Group_1_2__0__Impl : ( '|' ) ;
    public final void rule__BitwiseOrExpression__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2653:1: ( ( '|' ) )
            // InternalKExpressions.g:2654:1: ( '|' )
            {
            // InternalKExpressions.g:2654:1: ( '|' )
            // InternalKExpressions.g:2655:1: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrExpressionAccess().getVerticalLineKeyword_1_2_0()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBitwiseOrExpressionAccess().getVerticalLineKeyword_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitwiseOrExpression__Group_1_2__0__Impl"


    // $ANTLR start "rule__BitwiseOrExpression__Group_1_2__1"
    // InternalKExpressions.g:2668:1: rule__BitwiseOrExpression__Group_1_2__1 : rule__BitwiseOrExpression__Group_1_2__1__Impl ;
    public final void rule__BitwiseOrExpression__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2672:1: ( rule__BitwiseOrExpression__Group_1_2__1__Impl )
            // InternalKExpressions.g:2673:2: rule__BitwiseOrExpression__Group_1_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BitwiseOrExpression__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitwiseOrExpression__Group_1_2__1"


    // $ANTLR start "rule__BitwiseOrExpression__Group_1_2__1__Impl"
    // InternalKExpressions.g:2679:1: rule__BitwiseOrExpression__Group_1_2__1__Impl : ( ( rule__BitwiseOrExpression__SubExpressionsAssignment_1_2_1 ) ) ;
    public final void rule__BitwiseOrExpression__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2683:1: ( ( ( rule__BitwiseOrExpression__SubExpressionsAssignment_1_2_1 ) ) )
            // InternalKExpressions.g:2684:1: ( ( rule__BitwiseOrExpression__SubExpressionsAssignment_1_2_1 ) )
            {
            // InternalKExpressions.g:2684:1: ( ( rule__BitwiseOrExpression__SubExpressionsAssignment_1_2_1 ) )
            // InternalKExpressions.g:2685:1: ( rule__BitwiseOrExpression__SubExpressionsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsAssignment_1_2_1()); 
            }
            // InternalKExpressions.g:2686:1: ( rule__BitwiseOrExpression__SubExpressionsAssignment_1_2_1 )
            // InternalKExpressions.g:2686:2: rule__BitwiseOrExpression__SubExpressionsAssignment_1_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BitwiseOrExpression__SubExpressionsAssignment_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsAssignment_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitwiseOrExpression__Group_1_2__1__Impl"


    // $ANTLR start "rule__BitwiseAndExpression__Group__0"
    // InternalKExpressions.g:2700:1: rule__BitwiseAndExpression__Group__0 : rule__BitwiseAndExpression__Group__0__Impl rule__BitwiseAndExpression__Group__1 ;
    public final void rule__BitwiseAndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2704:1: ( rule__BitwiseAndExpression__Group__0__Impl rule__BitwiseAndExpression__Group__1 )
            // InternalKExpressions.g:2705:2: rule__BitwiseAndExpression__Group__0__Impl rule__BitwiseAndExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__BitwiseAndExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BitwiseAndExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitwiseAndExpression__Group__0"


    // $ANTLR start "rule__BitwiseAndExpression__Group__0__Impl"
    // InternalKExpressions.g:2712:1: rule__BitwiseAndExpression__Group__0__Impl : ( ruleCompareOperation ) ;
    public final void rule__BitwiseAndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2716:1: ( ( ruleCompareOperation ) )
            // InternalKExpressions.g:2717:1: ( ruleCompareOperation )
            {
            // InternalKExpressions.g:2717:1: ( ruleCompareOperation )
            // InternalKExpressions.g:2718:1: ruleCompareOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndExpressionAccess().getCompareOperationParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleCompareOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBitwiseAndExpressionAccess().getCompareOperationParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitwiseAndExpression__Group__0__Impl"


    // $ANTLR start "rule__BitwiseAndExpression__Group__1"
    // InternalKExpressions.g:2729:1: rule__BitwiseAndExpression__Group__1 : rule__BitwiseAndExpression__Group__1__Impl ;
    public final void rule__BitwiseAndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2733:1: ( rule__BitwiseAndExpression__Group__1__Impl )
            // InternalKExpressions.g:2734:2: rule__BitwiseAndExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BitwiseAndExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitwiseAndExpression__Group__1"


    // $ANTLR start "rule__BitwiseAndExpression__Group__1__Impl"
    // InternalKExpressions.g:2740:1: rule__BitwiseAndExpression__Group__1__Impl : ( ( rule__BitwiseAndExpression__Group_1__0 )? ) ;
    public final void rule__BitwiseAndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2744:1: ( ( ( rule__BitwiseAndExpression__Group_1__0 )? ) )
            // InternalKExpressions.g:2745:1: ( ( rule__BitwiseAndExpression__Group_1__0 )? )
            {
            // InternalKExpressions.g:2745:1: ( ( rule__BitwiseAndExpression__Group_1__0 )? )
            // InternalKExpressions.g:2746:1: ( rule__BitwiseAndExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:2747:1: ( rule__BitwiseAndExpression__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==18) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalKExpressions.g:2747:2: rule__BitwiseAndExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__BitwiseAndExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBitwiseAndExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitwiseAndExpression__Group__1__Impl"


    // $ANTLR start "rule__BitwiseAndExpression__Group_1__0"
    // InternalKExpressions.g:2761:1: rule__BitwiseAndExpression__Group_1__0 : rule__BitwiseAndExpression__Group_1__0__Impl rule__BitwiseAndExpression__Group_1__1 ;
    public final void rule__BitwiseAndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2765:1: ( rule__BitwiseAndExpression__Group_1__0__Impl rule__BitwiseAndExpression__Group_1__1 )
            // InternalKExpressions.g:2766:2: rule__BitwiseAndExpression__Group_1__0__Impl rule__BitwiseAndExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__BitwiseAndExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BitwiseAndExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitwiseAndExpression__Group_1__0"


    // $ANTLR start "rule__BitwiseAndExpression__Group_1__0__Impl"
    // InternalKExpressions.g:2773:1: rule__BitwiseAndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__BitwiseAndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2777:1: ( ( () ) )
            // InternalKExpressions.g:2778:1: ( () )
            {
            // InternalKExpressions.g:2778:1: ( () )
            // InternalKExpressions.g:2779:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:2780:1: ()
            // InternalKExpressions.g:2782:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBitwiseAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitwiseAndExpression__Group_1__0__Impl"


    // $ANTLR start "rule__BitwiseAndExpression__Group_1__1"
    // InternalKExpressions.g:2792:1: rule__BitwiseAndExpression__Group_1__1 : rule__BitwiseAndExpression__Group_1__1__Impl rule__BitwiseAndExpression__Group_1__2 ;
    public final void rule__BitwiseAndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2796:1: ( rule__BitwiseAndExpression__Group_1__1__Impl rule__BitwiseAndExpression__Group_1__2 )
            // InternalKExpressions.g:2797:2: rule__BitwiseAndExpression__Group_1__1__Impl rule__BitwiseAndExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__BitwiseAndExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BitwiseAndExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitwiseAndExpression__Group_1__1"


    // $ANTLR start "rule__BitwiseAndExpression__Group_1__1__Impl"
    // InternalKExpressions.g:2804:1: rule__BitwiseAndExpression__Group_1__1__Impl : ( ( rule__BitwiseAndExpression__Group_1_1__0 ) ) ;
    public final void rule__BitwiseAndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2808:1: ( ( ( rule__BitwiseAndExpression__Group_1_1__0 ) ) )
            // InternalKExpressions.g:2809:1: ( ( rule__BitwiseAndExpression__Group_1_1__0 ) )
            {
            // InternalKExpressions.g:2809:1: ( ( rule__BitwiseAndExpression__Group_1_1__0 ) )
            // InternalKExpressions.g:2810:1: ( rule__BitwiseAndExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndExpressionAccess().getGroup_1_1()); 
            }
            // InternalKExpressions.g:2811:1: ( rule__BitwiseAndExpression__Group_1_1__0 )
            // InternalKExpressions.g:2811:2: rule__BitwiseAndExpression__Group_1_1__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BitwiseAndExpression__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBitwiseAndExpressionAccess().getGroup_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitwiseAndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__BitwiseAndExpression__Group_1__2"
    // InternalKExpressions.g:2821:1: rule__BitwiseAndExpression__Group_1__2 : rule__BitwiseAndExpression__Group_1__2__Impl ;
    public final void rule__BitwiseAndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2825:1: ( rule__BitwiseAndExpression__Group_1__2__Impl )
            // InternalKExpressions.g:2826:2: rule__BitwiseAndExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BitwiseAndExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitwiseAndExpression__Group_1__2"


    // $ANTLR start "rule__BitwiseAndExpression__Group_1__2__Impl"
    // InternalKExpressions.g:2832:1: rule__BitwiseAndExpression__Group_1__2__Impl : ( ( rule__BitwiseAndExpression__Group_1_2__0 )* ) ;
    public final void rule__BitwiseAndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2836:1: ( ( ( rule__BitwiseAndExpression__Group_1_2__0 )* ) )
            // InternalKExpressions.g:2837:1: ( ( rule__BitwiseAndExpression__Group_1_2__0 )* )
            {
            // InternalKExpressions.g:2837:1: ( ( rule__BitwiseAndExpression__Group_1_2__0 )* )
            // InternalKExpressions.g:2838:1: ( rule__BitwiseAndExpression__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndExpressionAccess().getGroup_1_2()); 
            }
            // InternalKExpressions.g:2839:1: ( rule__BitwiseAndExpression__Group_1_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==18) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalKExpressions.g:2839:2: rule__BitwiseAndExpression__Group_1_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_11);
            	    rule__BitwiseAndExpression__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBitwiseAndExpressionAccess().getGroup_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitwiseAndExpression__Group_1__2__Impl"


    // $ANTLR start "rule__BitwiseAndExpression__Group_1_1__0"
    // InternalKExpressions.g:2855:1: rule__BitwiseAndExpression__Group_1_1__0 : rule__BitwiseAndExpression__Group_1_1__0__Impl rule__BitwiseAndExpression__Group_1_1__1 ;
    public final void rule__BitwiseAndExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2859:1: ( rule__BitwiseAndExpression__Group_1_1__0__Impl rule__BitwiseAndExpression__Group_1_1__1 )
            // InternalKExpressions.g:2860:2: rule__BitwiseAndExpression__Group_1_1__0__Impl rule__BitwiseAndExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__BitwiseAndExpression__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BitwiseAndExpression__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitwiseAndExpression__Group_1_1__0"


    // $ANTLR start "rule__BitwiseAndExpression__Group_1_1__0__Impl"
    // InternalKExpressions.g:2867:1: rule__BitwiseAndExpression__Group_1_1__0__Impl : ( ( rule__BitwiseAndExpression__OperatorAssignment_1_1_0 ) ) ;
    public final void rule__BitwiseAndExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2871:1: ( ( ( rule__BitwiseAndExpression__OperatorAssignment_1_1_0 ) ) )
            // InternalKExpressions.g:2872:1: ( ( rule__BitwiseAndExpression__OperatorAssignment_1_1_0 ) )
            {
            // InternalKExpressions.g:2872:1: ( ( rule__BitwiseAndExpression__OperatorAssignment_1_1_0 ) )
            // InternalKExpressions.g:2873:1: ( rule__BitwiseAndExpression__OperatorAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndExpressionAccess().getOperatorAssignment_1_1_0()); 
            }
            // InternalKExpressions.g:2874:1: ( rule__BitwiseAndExpression__OperatorAssignment_1_1_0 )
            // InternalKExpressions.g:2874:2: rule__BitwiseAndExpression__OperatorAssignment_1_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BitwiseAndExpression__OperatorAssignment_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBitwiseAndExpressionAccess().getOperatorAssignment_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitwiseAndExpression__Group_1_1__0__Impl"


    // $ANTLR start "rule__BitwiseAndExpression__Group_1_1__1"
    // InternalKExpressions.g:2884:1: rule__BitwiseAndExpression__Group_1_1__1 : rule__BitwiseAndExpression__Group_1_1__1__Impl ;
    public final void rule__BitwiseAndExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2888:1: ( rule__BitwiseAndExpression__Group_1_1__1__Impl )
            // InternalKExpressions.g:2889:2: rule__BitwiseAndExpression__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BitwiseAndExpression__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitwiseAndExpression__Group_1_1__1"


    // $ANTLR start "rule__BitwiseAndExpression__Group_1_1__1__Impl"
    // InternalKExpressions.g:2895:1: rule__BitwiseAndExpression__Group_1_1__1__Impl : ( ( rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__BitwiseAndExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2899:1: ( ( ( rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1 ) ) )
            // InternalKExpressions.g:2900:1: ( ( rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1 ) )
            {
            // InternalKExpressions.g:2900:1: ( ( rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1 ) )
            // InternalKExpressions.g:2901:1: ( rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }
            // InternalKExpressions.g:2902:1: ( rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1 )
            // InternalKExpressions.g:2902:2: rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitwiseAndExpression__Group_1_1__1__Impl"


    // $ANTLR start "rule__BitwiseAndExpression__Group_1_2__0"
    // InternalKExpressions.g:2916:1: rule__BitwiseAndExpression__Group_1_2__0 : rule__BitwiseAndExpression__Group_1_2__0__Impl rule__BitwiseAndExpression__Group_1_2__1 ;
    public final void rule__BitwiseAndExpression__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2920:1: ( rule__BitwiseAndExpression__Group_1_2__0__Impl rule__BitwiseAndExpression__Group_1_2__1 )
            // InternalKExpressions.g:2921:2: rule__BitwiseAndExpression__Group_1_2__0__Impl rule__BitwiseAndExpression__Group_1_2__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__BitwiseAndExpression__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BitwiseAndExpression__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitwiseAndExpression__Group_1_2__0"


    // $ANTLR start "rule__BitwiseAndExpression__Group_1_2__0__Impl"
    // InternalKExpressions.g:2928:1: rule__BitwiseAndExpression__Group_1_2__0__Impl : ( '&' ) ;
    public final void rule__BitwiseAndExpression__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2932:1: ( ( '&' ) )
            // InternalKExpressions.g:2933:1: ( '&' )
            {
            // InternalKExpressions.g:2933:1: ( '&' )
            // InternalKExpressions.g:2934:1: '&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndExpressionAccess().getAmpersandKeyword_1_2_0()); 
            }
            match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBitwiseAndExpressionAccess().getAmpersandKeyword_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitwiseAndExpression__Group_1_2__0__Impl"


    // $ANTLR start "rule__BitwiseAndExpression__Group_1_2__1"
    // InternalKExpressions.g:2947:1: rule__BitwiseAndExpression__Group_1_2__1 : rule__BitwiseAndExpression__Group_1_2__1__Impl ;
    public final void rule__BitwiseAndExpression__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2951:1: ( rule__BitwiseAndExpression__Group_1_2__1__Impl )
            // InternalKExpressions.g:2952:2: rule__BitwiseAndExpression__Group_1_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BitwiseAndExpression__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitwiseAndExpression__Group_1_2__1"


    // $ANTLR start "rule__BitwiseAndExpression__Group_1_2__1__Impl"
    // InternalKExpressions.g:2958:1: rule__BitwiseAndExpression__Group_1_2__1__Impl : ( ( rule__BitwiseAndExpression__SubExpressionsAssignment_1_2_1 ) ) ;
    public final void rule__BitwiseAndExpression__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2962:1: ( ( ( rule__BitwiseAndExpression__SubExpressionsAssignment_1_2_1 ) ) )
            // InternalKExpressions.g:2963:1: ( ( rule__BitwiseAndExpression__SubExpressionsAssignment_1_2_1 ) )
            {
            // InternalKExpressions.g:2963:1: ( ( rule__BitwiseAndExpression__SubExpressionsAssignment_1_2_1 ) )
            // InternalKExpressions.g:2964:1: ( rule__BitwiseAndExpression__SubExpressionsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsAssignment_1_2_1()); 
            }
            // InternalKExpressions.g:2965:1: ( rule__BitwiseAndExpression__SubExpressionsAssignment_1_2_1 )
            // InternalKExpressions.g:2965:2: rule__BitwiseAndExpression__SubExpressionsAssignment_1_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BitwiseAndExpression__SubExpressionsAssignment_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsAssignment_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitwiseAndExpression__Group_1_2__1__Impl"


    // $ANTLR start "rule__CompareOperation__Group__0"
    // InternalKExpressions.g:2979:1: rule__CompareOperation__Group__0 : rule__CompareOperation__Group__0__Impl rule__CompareOperation__Group__1 ;
    public final void rule__CompareOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2983:1: ( rule__CompareOperation__Group__0__Impl rule__CompareOperation__Group__1 )
            // InternalKExpressions.g:2984:2: rule__CompareOperation__Group__0__Impl rule__CompareOperation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__CompareOperation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CompareOperation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group__0"


    // $ANTLR start "rule__CompareOperation__Group__0__Impl"
    // InternalKExpressions.g:2991:1: rule__CompareOperation__Group__0__Impl : ( ruleNotOrValuedExpression ) ;
    public final void rule__CompareOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2995:1: ( ( ruleNotOrValuedExpression ) )
            // InternalKExpressions.g:2996:1: ( ruleNotOrValuedExpression )
            {
            // InternalKExpressions.g:2996:1: ( ruleNotOrValuedExpression )
            // InternalKExpressions.g:2997:1: ruleNotOrValuedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group__0__Impl"


    // $ANTLR start "rule__CompareOperation__Group__1"
    // InternalKExpressions.g:3008:1: rule__CompareOperation__Group__1 : rule__CompareOperation__Group__1__Impl ;
    public final void rule__CompareOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3012:1: ( rule__CompareOperation__Group__1__Impl )
            // InternalKExpressions.g:3013:2: rule__CompareOperation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CompareOperation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group__1"


    // $ANTLR start "rule__CompareOperation__Group__1__Impl"
    // InternalKExpressions.g:3019:1: rule__CompareOperation__Group__1__Impl : ( ( rule__CompareOperation__Group_1__0 )? ) ;
    public final void rule__CompareOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3023:1: ( ( ( rule__CompareOperation__Group_1__0 )? ) )
            // InternalKExpressions.g:3024:1: ( ( rule__CompareOperation__Group_1__0 )? )
            {
            // InternalKExpressions.g:3024:1: ( ( rule__CompareOperation__Group_1__0 )? )
            // InternalKExpressions.g:3025:1: ( rule__CompareOperation__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:3026:1: ( rule__CompareOperation__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=29 && LA21_0<=34)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalKExpressions.g:3026:2: rule__CompareOperation__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__CompareOperation__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__CompareOperation__Group__1__Impl"


    // $ANTLR start "rule__CompareOperation__Group_1__0"
    // InternalKExpressions.g:3040:1: rule__CompareOperation__Group_1__0 : rule__CompareOperation__Group_1__0__Impl rule__CompareOperation__Group_1__1 ;
    public final void rule__CompareOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3044:1: ( rule__CompareOperation__Group_1__0__Impl rule__CompareOperation__Group_1__1 )
            // InternalKExpressions.g:3045:2: rule__CompareOperation__Group_1__0__Impl rule__CompareOperation__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__CompareOperation__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CompareOperation__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group_1__0"


    // $ANTLR start "rule__CompareOperation__Group_1__0__Impl"
    // InternalKExpressions.g:3052:1: rule__CompareOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__CompareOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3056:1: ( ( () ) )
            // InternalKExpressions.g:3057:1: ( () )
            {
            // InternalKExpressions.g:3057:1: ( () )
            // InternalKExpressions.g:3058:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:3059:1: ()
            // InternalKExpressions.g:3061:1: 
            {
            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__CompareOperation__Group_1__0__Impl"


    // $ANTLR start "rule__CompareOperation__Group_1__1"
    // InternalKExpressions.g:3071:1: rule__CompareOperation__Group_1__1 : rule__CompareOperation__Group_1__1__Impl rule__CompareOperation__Group_1__2 ;
    public final void rule__CompareOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3075:1: ( rule__CompareOperation__Group_1__1__Impl rule__CompareOperation__Group_1__2 )
            // InternalKExpressions.g:3076:2: rule__CompareOperation__Group_1__1__Impl rule__CompareOperation__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__CompareOperation__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CompareOperation__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group_1__1"


    // $ANTLR start "rule__CompareOperation__Group_1__1__Impl"
    // InternalKExpressions.g:3083:1: rule__CompareOperation__Group_1__1__Impl : ( ( rule__CompareOperation__OperatorAssignment_1_1 ) ) ;
    public final void rule__CompareOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3087:1: ( ( ( rule__CompareOperation__OperatorAssignment_1_1 ) ) )
            // InternalKExpressions.g:3088:1: ( ( rule__CompareOperation__OperatorAssignment_1_1 ) )
            {
            // InternalKExpressions.g:3088:1: ( ( rule__CompareOperation__OperatorAssignment_1_1 ) )
            // InternalKExpressions.g:3089:1: ( rule__CompareOperation__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKExpressions.g:3090:1: ( rule__CompareOperation__OperatorAssignment_1_1 )
            // InternalKExpressions.g:3090:2: rule__CompareOperation__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CompareOperation__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__CompareOperation__Group_1__1__Impl"


    // $ANTLR start "rule__CompareOperation__Group_1__2"
    // InternalKExpressions.g:3100:1: rule__CompareOperation__Group_1__2 : rule__CompareOperation__Group_1__2__Impl ;
    public final void rule__CompareOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3104:1: ( rule__CompareOperation__Group_1__2__Impl )
            // InternalKExpressions.g:3105:2: rule__CompareOperation__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CompareOperation__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group_1__2"


    // $ANTLR start "rule__CompareOperation__Group_1__2__Impl"
    // InternalKExpressions.g:3111:1: rule__CompareOperation__Group_1__2__Impl : ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__CompareOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3115:1: ( ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) ) )
            // InternalKExpressions.g:3116:1: ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) )
            {
            // InternalKExpressions.g:3116:1: ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) )
            // InternalKExpressions.g:3117:1: ( rule__CompareOperation__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // InternalKExpressions.g:3118:1: ( rule__CompareOperation__SubExpressionsAssignment_1_2 )
            // InternalKExpressions.g:3118:2: rule__CompareOperation__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CompareOperation__SubExpressionsAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__CompareOperation__Group_1__2__Impl"


    // $ANTLR start "rule__NotExpression__Group_0__0"
    // InternalKExpressions.g:3134:1: rule__NotExpression__Group_0__0 : rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1 ;
    public final void rule__NotExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3138:1: ( rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1 )
            // InternalKExpressions.g:3139:2: rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__NotExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NotExpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotExpression__Group_0__0"


    // $ANTLR start "rule__NotExpression__Group_0__0__Impl"
    // InternalKExpressions.g:3146:1: rule__NotExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__NotExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3150:1: ( ( () ) )
            // InternalKExpressions.g:3151:1: ( () )
            {
            // InternalKExpressions.g:3151:1: ( () )
            // InternalKExpressions.g:3152:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // InternalKExpressions.g:3153:1: ()
            // InternalKExpressions.g:3155:1: 
            {
            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__NotExpression__Group_0__0__Impl"


    // $ANTLR start "rule__NotExpression__Group_0__1"
    // InternalKExpressions.g:3165:1: rule__NotExpression__Group_0__1 : rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2 ;
    public final void rule__NotExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3169:1: ( rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2 )
            // InternalKExpressions.g:3170:2: rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__NotExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NotExpression__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotExpression__Group_0__1"


    // $ANTLR start "rule__NotExpression__Group_0__1__Impl"
    // InternalKExpressions.g:3177:1: rule__NotExpression__Group_0__1__Impl : ( ( rule__NotExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__NotExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3181:1: ( ( ( rule__NotExpression__OperatorAssignment_0_1 ) ) )
            // InternalKExpressions.g:3182:1: ( ( rule__NotExpression__OperatorAssignment_0_1 ) )
            {
            // InternalKExpressions.g:3182:1: ( ( rule__NotExpression__OperatorAssignment_0_1 ) )
            // InternalKExpressions.g:3183:1: ( rule__NotExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // InternalKExpressions.g:3184:1: ( rule__NotExpression__OperatorAssignment_0_1 )
            // InternalKExpressions.g:3184:2: rule__NotExpression__OperatorAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NotExpression__OperatorAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__NotExpression__Group_0__1__Impl"


    // $ANTLR start "rule__NotExpression__Group_0__2"
    // InternalKExpressions.g:3194:1: rule__NotExpression__Group_0__2 : rule__NotExpression__Group_0__2__Impl ;
    public final void rule__NotExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3198:1: ( rule__NotExpression__Group_0__2__Impl )
            // InternalKExpressions.g:3199:2: rule__NotExpression__Group_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NotExpression__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotExpression__Group_0__2"


    // $ANTLR start "rule__NotExpression__Group_0__2__Impl"
    // InternalKExpressions.g:3205:1: rule__NotExpression__Group_0__2__Impl : ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) ) ;
    public final void rule__NotExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3209:1: ( ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) ) )
            // InternalKExpressions.g:3210:1: ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) )
            {
            // InternalKExpressions.g:3210:1: ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) )
            // InternalKExpressions.g:3211:1: ( rule__NotExpression__SubExpressionsAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubExpressionsAssignment_0_2()); 
            }
            // InternalKExpressions.g:3212:1: ( rule__NotExpression__SubExpressionsAssignment_0_2 )
            // InternalKExpressions.g:3212:2: rule__NotExpression__SubExpressionsAssignment_0_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NotExpression__SubExpressionsAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__NotExpression__Group_0__2__Impl"


    // $ANTLR start "rule__AddExpression__Group__0"
    // InternalKExpressions.g:3228:1: rule__AddExpression__Group__0 : rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 ;
    public final void rule__AddExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3232:1: ( rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 )
            // InternalKExpressions.g:3233:2: rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__AddExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AddExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group__0"


    // $ANTLR start "rule__AddExpression__Group__0__Impl"
    // InternalKExpressions.g:3240:1: rule__AddExpression__Group__0__Impl : ( ruleSubExpression ) ;
    public final void rule__AddExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3244:1: ( ( ruleSubExpression ) )
            // InternalKExpressions.g:3245:1: ( ruleSubExpression )
            {
            // InternalKExpressions.g:3245:1: ( ruleSubExpression )
            // InternalKExpressions.g:3246:1: ruleSubExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSubExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__AddExpression__Group__0__Impl"


    // $ANTLR start "rule__AddExpression__Group__1"
    // InternalKExpressions.g:3257:1: rule__AddExpression__Group__1 : rule__AddExpression__Group__1__Impl ;
    public final void rule__AddExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3261:1: ( rule__AddExpression__Group__1__Impl )
            // InternalKExpressions.g:3262:2: rule__AddExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AddExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group__1"


    // $ANTLR start "rule__AddExpression__Group__1__Impl"
    // InternalKExpressions.g:3268:1: rule__AddExpression__Group__1__Impl : ( ( rule__AddExpression__Group_1__0 )? ) ;
    public final void rule__AddExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3272:1: ( ( ( rule__AddExpression__Group_1__0 )? ) )
            // InternalKExpressions.g:3273:1: ( ( rule__AddExpression__Group_1__0 )? )
            {
            // InternalKExpressions.g:3273:1: ( ( rule__AddExpression__Group_1__0 )? )
            // InternalKExpressions.g:3274:1: ( rule__AddExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:3275:1: ( rule__AddExpression__Group_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==20) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalKExpressions.g:3275:2: rule__AddExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__AddExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__AddExpression__Group__1__Impl"


    // $ANTLR start "rule__AddExpression__Group_1__0"
    // InternalKExpressions.g:3289:1: rule__AddExpression__Group_1__0 : rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 ;
    public final void rule__AddExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3293:1: ( rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 )
            // InternalKExpressions.g:3294:2: rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__AddExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AddExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1__0"


    // $ANTLR start "rule__AddExpression__Group_1__0__Impl"
    // InternalKExpressions.g:3301:1: rule__AddExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AddExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3305:1: ( ( () ) )
            // InternalKExpressions.g:3306:1: ( () )
            {
            // InternalKExpressions.g:3306:1: ( () )
            // InternalKExpressions.g:3307:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:3308:1: ()
            // InternalKExpressions.g:3310:1: 
            {
            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__AddExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AddExpression__Group_1__1"
    // InternalKExpressions.g:3320:1: rule__AddExpression__Group_1__1 : rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2 ;
    public final void rule__AddExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3324:1: ( rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2 )
            // InternalKExpressions.g:3325:2: rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__AddExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AddExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1__1"


    // $ANTLR start "rule__AddExpression__Group_1__1__Impl"
    // InternalKExpressions.g:3332:1: rule__AddExpression__Group_1__1__Impl : ( ( rule__AddExpression__Group_1_1__0 ) ) ;
    public final void rule__AddExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3336:1: ( ( ( rule__AddExpression__Group_1_1__0 ) ) )
            // InternalKExpressions.g:3337:1: ( ( rule__AddExpression__Group_1_1__0 ) )
            {
            // InternalKExpressions.g:3337:1: ( ( rule__AddExpression__Group_1_1__0 ) )
            // InternalKExpressions.g:3338:1: ( rule__AddExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1_1()); 
            }
            // InternalKExpressions.g:3339:1: ( rule__AddExpression__Group_1_1__0 )
            // InternalKExpressions.g:3339:2: rule__AddExpression__Group_1_1__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AddExpression__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getGroup_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AddExpression__Group_1__2"
    // InternalKExpressions.g:3349:1: rule__AddExpression__Group_1__2 : rule__AddExpression__Group_1__2__Impl ;
    public final void rule__AddExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3353:1: ( rule__AddExpression__Group_1__2__Impl )
            // InternalKExpressions.g:3354:2: rule__AddExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AddExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1__2"


    // $ANTLR start "rule__AddExpression__Group_1__2__Impl"
    // InternalKExpressions.g:3360:1: rule__AddExpression__Group_1__2__Impl : ( ( rule__AddExpression__Group_1_2__0 )* ) ;
    public final void rule__AddExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3364:1: ( ( ( rule__AddExpression__Group_1_2__0 )* ) )
            // InternalKExpressions.g:3365:1: ( ( rule__AddExpression__Group_1_2__0 )* )
            {
            // InternalKExpressions.g:3365:1: ( ( rule__AddExpression__Group_1_2__0 )* )
            // InternalKExpressions.g:3366:1: ( rule__AddExpression__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1_2()); 
            }
            // InternalKExpressions.g:3367:1: ( rule__AddExpression__Group_1_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==20) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalKExpressions.g:3367:2: rule__AddExpression__Group_1_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_15);
            	    rule__AddExpression__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getGroup_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1__2__Impl"


    // $ANTLR start "rule__AddExpression__Group_1_1__0"
    // InternalKExpressions.g:3383:1: rule__AddExpression__Group_1_1__0 : rule__AddExpression__Group_1_1__0__Impl rule__AddExpression__Group_1_1__1 ;
    public final void rule__AddExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3387:1: ( rule__AddExpression__Group_1_1__0__Impl rule__AddExpression__Group_1_1__1 )
            // InternalKExpressions.g:3388:2: rule__AddExpression__Group_1_1__0__Impl rule__AddExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__AddExpression__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AddExpression__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1_1__0"


    // $ANTLR start "rule__AddExpression__Group_1_1__0__Impl"
    // InternalKExpressions.g:3395:1: rule__AddExpression__Group_1_1__0__Impl : ( ( rule__AddExpression__OperatorAssignment_1_1_0 ) ) ;
    public final void rule__AddExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3399:1: ( ( ( rule__AddExpression__OperatorAssignment_1_1_0 ) ) )
            // InternalKExpressions.g:3400:1: ( ( rule__AddExpression__OperatorAssignment_1_1_0 ) )
            {
            // InternalKExpressions.g:3400:1: ( ( rule__AddExpression__OperatorAssignment_1_1_0 ) )
            // InternalKExpressions.g:3401:1: ( rule__AddExpression__OperatorAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorAssignment_1_1_0()); 
            }
            // InternalKExpressions.g:3402:1: ( rule__AddExpression__OperatorAssignment_1_1_0 )
            // InternalKExpressions.g:3402:2: rule__AddExpression__OperatorAssignment_1_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AddExpression__OperatorAssignment_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getOperatorAssignment_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1_1__0__Impl"


    // $ANTLR start "rule__AddExpression__Group_1_1__1"
    // InternalKExpressions.g:3412:1: rule__AddExpression__Group_1_1__1 : rule__AddExpression__Group_1_1__1__Impl ;
    public final void rule__AddExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3416:1: ( rule__AddExpression__Group_1_1__1__Impl )
            // InternalKExpressions.g:3417:2: rule__AddExpression__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AddExpression__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1_1__1"


    // $ANTLR start "rule__AddExpression__Group_1_1__1__Impl"
    // InternalKExpressions.g:3423:1: rule__AddExpression__Group_1_1__1__Impl : ( ( rule__AddExpression__SubExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__AddExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3427:1: ( ( ( rule__AddExpression__SubExpressionsAssignment_1_1_1 ) ) )
            // InternalKExpressions.g:3428:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_1_1 ) )
            {
            // InternalKExpressions.g:3428:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_1_1 ) )
            // InternalKExpressions.g:3429:1: ( rule__AddExpression__SubExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }
            // InternalKExpressions.g:3430:1: ( rule__AddExpression__SubExpressionsAssignment_1_1_1 )
            // InternalKExpressions.g:3430:2: rule__AddExpression__SubExpressionsAssignment_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AddExpression__SubExpressionsAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1_1__1__Impl"


    // $ANTLR start "rule__AddExpression__Group_1_2__0"
    // InternalKExpressions.g:3444:1: rule__AddExpression__Group_1_2__0 : rule__AddExpression__Group_1_2__0__Impl rule__AddExpression__Group_1_2__1 ;
    public final void rule__AddExpression__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3448:1: ( rule__AddExpression__Group_1_2__0__Impl rule__AddExpression__Group_1_2__1 )
            // InternalKExpressions.g:3449:2: rule__AddExpression__Group_1_2__0__Impl rule__AddExpression__Group_1_2__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__AddExpression__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AddExpression__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1_2__0"


    // $ANTLR start "rule__AddExpression__Group_1_2__0__Impl"
    // InternalKExpressions.g:3456:1: rule__AddExpression__Group_1_2__0__Impl : ( '+' ) ;
    public final void rule__AddExpression__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3460:1: ( ( '+' ) )
            // InternalKExpressions.g:3461:1: ( '+' )
            {
            // InternalKExpressions.g:3461:1: ( '+' )
            // InternalKExpressions.g:3462:1: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getPlusSignKeyword_1_2_0()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getPlusSignKeyword_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1_2__0__Impl"


    // $ANTLR start "rule__AddExpression__Group_1_2__1"
    // InternalKExpressions.g:3475:1: rule__AddExpression__Group_1_2__1 : rule__AddExpression__Group_1_2__1__Impl ;
    public final void rule__AddExpression__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3479:1: ( rule__AddExpression__Group_1_2__1__Impl )
            // InternalKExpressions.g:3480:2: rule__AddExpression__Group_1_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AddExpression__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1_2__1"


    // $ANTLR start "rule__AddExpression__Group_1_2__1__Impl"
    // InternalKExpressions.g:3486:1: rule__AddExpression__Group_1_2__1__Impl : ( ( rule__AddExpression__SubExpressionsAssignment_1_2_1 ) ) ;
    public final void rule__AddExpression__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3490:1: ( ( ( rule__AddExpression__SubExpressionsAssignment_1_2_1 ) ) )
            // InternalKExpressions.g:3491:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_2_1 ) )
            {
            // InternalKExpressions.g:3491:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_2_1 ) )
            // InternalKExpressions.g:3492:1: ( rule__AddExpression__SubExpressionsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionsAssignment_1_2_1()); 
            }
            // InternalKExpressions.g:3493:1: ( rule__AddExpression__SubExpressionsAssignment_1_2_1 )
            // InternalKExpressions.g:3493:2: rule__AddExpression__SubExpressionsAssignment_1_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AddExpression__SubExpressionsAssignment_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getSubExpressionsAssignment_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1_2__1__Impl"


    // $ANTLR start "rule__SubExpression__Group__0"
    // InternalKExpressions.g:3507:1: rule__SubExpression__Group__0 : rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 ;
    public final void rule__SubExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3511:1: ( rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 )
            // InternalKExpressions.g:3512:2: rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__SubExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SubExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubExpression__Group__0"


    // $ANTLR start "rule__SubExpression__Group__0__Impl"
    // InternalKExpressions.g:3519:1: rule__SubExpression__Group__0__Impl : ( ruleMultExpression ) ;
    public final void rule__SubExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3523:1: ( ( ruleMultExpression ) )
            // InternalKExpressions.g:3524:1: ( ruleMultExpression )
            {
            // InternalKExpressions.g:3524:1: ( ruleMultExpression )
            // InternalKExpressions.g:3525:1: ruleMultExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMultExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__SubExpression__Group__0__Impl"


    // $ANTLR start "rule__SubExpression__Group__1"
    // InternalKExpressions.g:3536:1: rule__SubExpression__Group__1 : rule__SubExpression__Group__1__Impl ;
    public final void rule__SubExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3540:1: ( rule__SubExpression__Group__1__Impl )
            // InternalKExpressions.g:3541:2: rule__SubExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SubExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubExpression__Group__1"


    // $ANTLR start "rule__SubExpression__Group__1__Impl"
    // InternalKExpressions.g:3547:1: rule__SubExpression__Group__1__Impl : ( ( rule__SubExpression__Group_1__0 )? ) ;
    public final void rule__SubExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3551:1: ( ( ( rule__SubExpression__Group_1__0 )? ) )
            // InternalKExpressions.g:3552:1: ( ( rule__SubExpression__Group_1__0 )? )
            {
            // InternalKExpressions.g:3552:1: ( ( rule__SubExpression__Group_1__0 )? )
            // InternalKExpressions.g:3553:1: ( rule__SubExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:3554:1: ( rule__SubExpression__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==21) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalKExpressions.g:3554:2: rule__SubExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__SubExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__SubExpression__Group__1__Impl"


    // $ANTLR start "rule__SubExpression__Group_1__0"
    // InternalKExpressions.g:3568:1: rule__SubExpression__Group_1__0 : rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 ;
    public final void rule__SubExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3572:1: ( rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 )
            // InternalKExpressions.g:3573:2: rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__SubExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SubExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubExpression__Group_1__0"


    // $ANTLR start "rule__SubExpression__Group_1__0__Impl"
    // InternalKExpressions.g:3580:1: rule__SubExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__SubExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3584:1: ( ( () ) )
            // InternalKExpressions.g:3585:1: ( () )
            {
            // InternalKExpressions.g:3585:1: ( () )
            // InternalKExpressions.g:3586:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:3587:1: ()
            // InternalKExpressions.g:3589:1: 
            {
            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__SubExpression__Group_1__0__Impl"


    // $ANTLR start "rule__SubExpression__Group_1__1"
    // InternalKExpressions.g:3599:1: rule__SubExpression__Group_1__1 : rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2 ;
    public final void rule__SubExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3603:1: ( rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2 )
            // InternalKExpressions.g:3604:2: rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__SubExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SubExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubExpression__Group_1__1"


    // $ANTLR start "rule__SubExpression__Group_1__1__Impl"
    // InternalKExpressions.g:3611:1: rule__SubExpression__Group_1__1__Impl : ( ( rule__SubExpression__Group_1_1__0 ) ) ;
    public final void rule__SubExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3615:1: ( ( ( rule__SubExpression__Group_1_1__0 ) ) )
            // InternalKExpressions.g:3616:1: ( ( rule__SubExpression__Group_1_1__0 ) )
            {
            // InternalKExpressions.g:3616:1: ( ( rule__SubExpression__Group_1_1__0 ) )
            // InternalKExpressions.g:3617:1: ( rule__SubExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup_1_1()); 
            }
            // InternalKExpressions.g:3618:1: ( rule__SubExpression__Group_1_1__0 )
            // InternalKExpressions.g:3618:2: rule__SubExpression__Group_1_1__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SubExpression__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubExpressionAccess().getGroup_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubExpression__Group_1__1__Impl"


    // $ANTLR start "rule__SubExpression__Group_1__2"
    // InternalKExpressions.g:3628:1: rule__SubExpression__Group_1__2 : rule__SubExpression__Group_1__2__Impl ;
    public final void rule__SubExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3632:1: ( rule__SubExpression__Group_1__2__Impl )
            // InternalKExpressions.g:3633:2: rule__SubExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SubExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubExpression__Group_1__2"


    // $ANTLR start "rule__SubExpression__Group_1__2__Impl"
    // InternalKExpressions.g:3639:1: rule__SubExpression__Group_1__2__Impl : ( ( rule__SubExpression__Group_1_2__0 )* ) ;
    public final void rule__SubExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3643:1: ( ( ( rule__SubExpression__Group_1_2__0 )* ) )
            // InternalKExpressions.g:3644:1: ( ( rule__SubExpression__Group_1_2__0 )* )
            {
            // InternalKExpressions.g:3644:1: ( ( rule__SubExpression__Group_1_2__0 )* )
            // InternalKExpressions.g:3645:1: ( rule__SubExpression__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup_1_2()); 
            }
            // InternalKExpressions.g:3646:1: ( rule__SubExpression__Group_1_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==21) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalKExpressions.g:3646:2: rule__SubExpression__Group_1_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    rule__SubExpression__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubExpressionAccess().getGroup_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubExpression__Group_1__2__Impl"


    // $ANTLR start "rule__SubExpression__Group_1_1__0"
    // InternalKExpressions.g:3662:1: rule__SubExpression__Group_1_1__0 : rule__SubExpression__Group_1_1__0__Impl rule__SubExpression__Group_1_1__1 ;
    public final void rule__SubExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3666:1: ( rule__SubExpression__Group_1_1__0__Impl rule__SubExpression__Group_1_1__1 )
            // InternalKExpressions.g:3667:2: rule__SubExpression__Group_1_1__0__Impl rule__SubExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__SubExpression__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SubExpression__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubExpression__Group_1_1__0"


    // $ANTLR start "rule__SubExpression__Group_1_1__0__Impl"
    // InternalKExpressions.g:3674:1: rule__SubExpression__Group_1_1__0__Impl : ( ( rule__SubExpression__OperatorAssignment_1_1_0 ) ) ;
    public final void rule__SubExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3678:1: ( ( ( rule__SubExpression__OperatorAssignment_1_1_0 ) ) )
            // InternalKExpressions.g:3679:1: ( ( rule__SubExpression__OperatorAssignment_1_1_0 ) )
            {
            // InternalKExpressions.g:3679:1: ( ( rule__SubExpression__OperatorAssignment_1_1_0 ) )
            // InternalKExpressions.g:3680:1: ( rule__SubExpression__OperatorAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorAssignment_1_1_0()); 
            }
            // InternalKExpressions.g:3681:1: ( rule__SubExpression__OperatorAssignment_1_1_0 )
            // InternalKExpressions.g:3681:2: rule__SubExpression__OperatorAssignment_1_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SubExpression__OperatorAssignment_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubExpressionAccess().getOperatorAssignment_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubExpression__Group_1_1__0__Impl"


    // $ANTLR start "rule__SubExpression__Group_1_1__1"
    // InternalKExpressions.g:3691:1: rule__SubExpression__Group_1_1__1 : rule__SubExpression__Group_1_1__1__Impl ;
    public final void rule__SubExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3695:1: ( rule__SubExpression__Group_1_1__1__Impl )
            // InternalKExpressions.g:3696:2: rule__SubExpression__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SubExpression__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubExpression__Group_1_1__1"


    // $ANTLR start "rule__SubExpression__Group_1_1__1__Impl"
    // InternalKExpressions.g:3702:1: rule__SubExpression__Group_1_1__1__Impl : ( ( rule__SubExpression__SubExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__SubExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3706:1: ( ( ( rule__SubExpression__SubExpressionsAssignment_1_1_1 ) ) )
            // InternalKExpressions.g:3707:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_1_1 ) )
            {
            // InternalKExpressions.g:3707:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_1_1 ) )
            // InternalKExpressions.g:3708:1: ( rule__SubExpression__SubExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }
            // InternalKExpressions.g:3709:1: ( rule__SubExpression__SubExpressionsAssignment_1_1_1 )
            // InternalKExpressions.g:3709:2: rule__SubExpression__SubExpressionsAssignment_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SubExpression__SubExpressionsAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubExpression__Group_1_1__1__Impl"


    // $ANTLR start "rule__SubExpression__Group_1_2__0"
    // InternalKExpressions.g:3723:1: rule__SubExpression__Group_1_2__0 : rule__SubExpression__Group_1_2__0__Impl rule__SubExpression__Group_1_2__1 ;
    public final void rule__SubExpression__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3727:1: ( rule__SubExpression__Group_1_2__0__Impl rule__SubExpression__Group_1_2__1 )
            // InternalKExpressions.g:3728:2: rule__SubExpression__Group_1_2__0__Impl rule__SubExpression__Group_1_2__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__SubExpression__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SubExpression__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubExpression__Group_1_2__0"


    // $ANTLR start "rule__SubExpression__Group_1_2__0__Impl"
    // InternalKExpressions.g:3735:1: rule__SubExpression__Group_1_2__0__Impl : ( '-' ) ;
    public final void rule__SubExpression__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3739:1: ( ( '-' ) )
            // InternalKExpressions.g:3740:1: ( '-' )
            {
            // InternalKExpressions.g:3740:1: ( '-' )
            // InternalKExpressions.g:3741:1: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getHyphenMinusKeyword_1_2_0()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubExpressionAccess().getHyphenMinusKeyword_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubExpression__Group_1_2__0__Impl"


    // $ANTLR start "rule__SubExpression__Group_1_2__1"
    // InternalKExpressions.g:3754:1: rule__SubExpression__Group_1_2__1 : rule__SubExpression__Group_1_2__1__Impl ;
    public final void rule__SubExpression__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3758:1: ( rule__SubExpression__Group_1_2__1__Impl )
            // InternalKExpressions.g:3759:2: rule__SubExpression__Group_1_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SubExpression__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubExpression__Group_1_2__1"


    // $ANTLR start "rule__SubExpression__Group_1_2__1__Impl"
    // InternalKExpressions.g:3765:1: rule__SubExpression__Group_1_2__1__Impl : ( ( rule__SubExpression__SubExpressionsAssignment_1_2_1 ) ) ;
    public final void rule__SubExpression__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3769:1: ( ( ( rule__SubExpression__SubExpressionsAssignment_1_2_1 ) ) )
            // InternalKExpressions.g:3770:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_2_1 ) )
            {
            // InternalKExpressions.g:3770:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_2_1 ) )
            // InternalKExpressions.g:3771:1: ( rule__SubExpression__SubExpressionsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getSubExpressionsAssignment_1_2_1()); 
            }
            // InternalKExpressions.g:3772:1: ( rule__SubExpression__SubExpressionsAssignment_1_2_1 )
            // InternalKExpressions.g:3772:2: rule__SubExpression__SubExpressionsAssignment_1_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SubExpression__SubExpressionsAssignment_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubExpressionAccess().getSubExpressionsAssignment_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubExpression__Group_1_2__1__Impl"


    // $ANTLR start "rule__MultExpression__Group__0"
    // InternalKExpressions.g:3786:1: rule__MultExpression__Group__0 : rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 ;
    public final void rule__MultExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3790:1: ( rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 )
            // InternalKExpressions.g:3791:2: rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__MultExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group__0"


    // $ANTLR start "rule__MultExpression__Group__0__Impl"
    // InternalKExpressions.g:3798:1: rule__MultExpression__Group__0__Impl : ( ruleDivExpression ) ;
    public final void rule__MultExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3802:1: ( ( ruleDivExpression ) )
            // InternalKExpressions.g:3803:1: ( ruleDivExpression )
            {
            // InternalKExpressions.g:3803:1: ( ruleDivExpression )
            // InternalKExpressions.g:3804:1: ruleDivExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getDivExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDivExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultExpressionAccess().getDivExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group__0__Impl"


    // $ANTLR start "rule__MultExpression__Group__1"
    // InternalKExpressions.g:3815:1: rule__MultExpression__Group__1 : rule__MultExpression__Group__1__Impl ;
    public final void rule__MultExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3819:1: ( rule__MultExpression__Group__1__Impl )
            // InternalKExpressions.g:3820:2: rule__MultExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group__1"


    // $ANTLR start "rule__MultExpression__Group__1__Impl"
    // InternalKExpressions.g:3826:1: rule__MultExpression__Group__1__Impl : ( ( rule__MultExpression__Group_1__0 )? ) ;
    public final void rule__MultExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3830:1: ( ( ( rule__MultExpression__Group_1__0 )? ) )
            // InternalKExpressions.g:3831:1: ( ( rule__MultExpression__Group_1__0 )? )
            {
            // InternalKExpressions.g:3831:1: ( ( rule__MultExpression__Group_1__0 )? )
            // InternalKExpressions.g:3832:1: ( rule__MultExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:3833:1: ( rule__MultExpression__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==22) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalKExpressions.g:3833:2: rule__MultExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__MultExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__MultExpression__Group__1__Impl"


    // $ANTLR start "rule__MultExpression__Group_1__0"
    // InternalKExpressions.g:3847:1: rule__MultExpression__Group_1__0 : rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 ;
    public final void rule__MultExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3851:1: ( rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 )
            // InternalKExpressions.g:3852:2: rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__MultExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1__0"


    // $ANTLR start "rule__MultExpression__Group_1__0__Impl"
    // InternalKExpressions.g:3859:1: rule__MultExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3863:1: ( ( () ) )
            // InternalKExpressions.g:3864:1: ( () )
            {
            // InternalKExpressions.g:3864:1: ( () )
            // InternalKExpressions.g:3865:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:3866:1: ()
            // InternalKExpressions.g:3868:1: 
            {
            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__MultExpression__Group_1__0__Impl"


    // $ANTLR start "rule__MultExpression__Group_1__1"
    // InternalKExpressions.g:3878:1: rule__MultExpression__Group_1__1 : rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2 ;
    public final void rule__MultExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3882:1: ( rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2 )
            // InternalKExpressions.g:3883:2: rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__MultExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1__1"


    // $ANTLR start "rule__MultExpression__Group_1__1__Impl"
    // InternalKExpressions.g:3890:1: rule__MultExpression__Group_1__1__Impl : ( ( rule__MultExpression__Group_1_1__0 ) ) ;
    public final void rule__MultExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3894:1: ( ( ( rule__MultExpression__Group_1_1__0 ) ) )
            // InternalKExpressions.g:3895:1: ( ( rule__MultExpression__Group_1_1__0 ) )
            {
            // InternalKExpressions.g:3895:1: ( ( rule__MultExpression__Group_1_1__0 ) )
            // InternalKExpressions.g:3896:1: ( rule__MultExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getGroup_1_1()); 
            }
            // InternalKExpressions.g:3897:1: ( rule__MultExpression__Group_1_1__0 )
            // InternalKExpressions.g:3897:2: rule__MultExpression__Group_1_1__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultExpression__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultExpressionAccess().getGroup_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1__1__Impl"


    // $ANTLR start "rule__MultExpression__Group_1__2"
    // InternalKExpressions.g:3907:1: rule__MultExpression__Group_1__2 : rule__MultExpression__Group_1__2__Impl ;
    public final void rule__MultExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3911:1: ( rule__MultExpression__Group_1__2__Impl )
            // InternalKExpressions.g:3912:2: rule__MultExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1__2"


    // $ANTLR start "rule__MultExpression__Group_1__2__Impl"
    // InternalKExpressions.g:3918:1: rule__MultExpression__Group_1__2__Impl : ( ( rule__MultExpression__Group_1_2__0 )* ) ;
    public final void rule__MultExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3922:1: ( ( ( rule__MultExpression__Group_1_2__0 )* ) )
            // InternalKExpressions.g:3923:1: ( ( rule__MultExpression__Group_1_2__0 )* )
            {
            // InternalKExpressions.g:3923:1: ( ( rule__MultExpression__Group_1_2__0 )* )
            // InternalKExpressions.g:3924:1: ( rule__MultExpression__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getGroup_1_2()); 
            }
            // InternalKExpressions.g:3925:1: ( rule__MultExpression__Group_1_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==22) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalKExpressions.g:3925:2: rule__MultExpression__Group_1_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_20);
            	    rule__MultExpression__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultExpressionAccess().getGroup_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1__2__Impl"


    // $ANTLR start "rule__MultExpression__Group_1_1__0"
    // InternalKExpressions.g:3941:1: rule__MultExpression__Group_1_1__0 : rule__MultExpression__Group_1_1__0__Impl rule__MultExpression__Group_1_1__1 ;
    public final void rule__MultExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3945:1: ( rule__MultExpression__Group_1_1__0__Impl rule__MultExpression__Group_1_1__1 )
            // InternalKExpressions.g:3946:2: rule__MultExpression__Group_1_1__0__Impl rule__MultExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__MultExpression__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultExpression__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1_1__0"


    // $ANTLR start "rule__MultExpression__Group_1_1__0__Impl"
    // InternalKExpressions.g:3953:1: rule__MultExpression__Group_1_1__0__Impl : ( ( rule__MultExpression__OperatorAssignment_1_1_0 ) ) ;
    public final void rule__MultExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3957:1: ( ( ( rule__MultExpression__OperatorAssignment_1_1_0 ) ) )
            // InternalKExpressions.g:3958:1: ( ( rule__MultExpression__OperatorAssignment_1_1_0 ) )
            {
            // InternalKExpressions.g:3958:1: ( ( rule__MultExpression__OperatorAssignment_1_1_0 ) )
            // InternalKExpressions.g:3959:1: ( rule__MultExpression__OperatorAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorAssignment_1_1_0()); 
            }
            // InternalKExpressions.g:3960:1: ( rule__MultExpression__OperatorAssignment_1_1_0 )
            // InternalKExpressions.g:3960:2: rule__MultExpression__OperatorAssignment_1_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultExpression__OperatorAssignment_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultExpressionAccess().getOperatorAssignment_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1_1__0__Impl"


    // $ANTLR start "rule__MultExpression__Group_1_1__1"
    // InternalKExpressions.g:3970:1: rule__MultExpression__Group_1_1__1 : rule__MultExpression__Group_1_1__1__Impl ;
    public final void rule__MultExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3974:1: ( rule__MultExpression__Group_1_1__1__Impl )
            // InternalKExpressions.g:3975:2: rule__MultExpression__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultExpression__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1_1__1"


    // $ANTLR start "rule__MultExpression__Group_1_1__1__Impl"
    // InternalKExpressions.g:3981:1: rule__MultExpression__Group_1_1__1__Impl : ( ( rule__MultExpression__SubExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__MultExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3985:1: ( ( ( rule__MultExpression__SubExpressionsAssignment_1_1_1 ) ) )
            // InternalKExpressions.g:3986:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_1_1 ) )
            {
            // InternalKExpressions.g:3986:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_1_1 ) )
            // InternalKExpressions.g:3987:1: ( rule__MultExpression__SubExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }
            // InternalKExpressions.g:3988:1: ( rule__MultExpression__SubExpressionsAssignment_1_1_1 )
            // InternalKExpressions.g:3988:2: rule__MultExpression__SubExpressionsAssignment_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultExpression__SubExpressionsAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1_1__1__Impl"


    // $ANTLR start "rule__MultExpression__Group_1_2__0"
    // InternalKExpressions.g:4002:1: rule__MultExpression__Group_1_2__0 : rule__MultExpression__Group_1_2__0__Impl rule__MultExpression__Group_1_2__1 ;
    public final void rule__MultExpression__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4006:1: ( rule__MultExpression__Group_1_2__0__Impl rule__MultExpression__Group_1_2__1 )
            // InternalKExpressions.g:4007:2: rule__MultExpression__Group_1_2__0__Impl rule__MultExpression__Group_1_2__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__MultExpression__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultExpression__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1_2__0"


    // $ANTLR start "rule__MultExpression__Group_1_2__0__Impl"
    // InternalKExpressions.g:4014:1: rule__MultExpression__Group_1_2__0__Impl : ( '*' ) ;
    public final void rule__MultExpression__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4018:1: ( ( '*' ) )
            // InternalKExpressions.g:4019:1: ( '*' )
            {
            // InternalKExpressions.g:4019:1: ( '*' )
            // InternalKExpressions.g:4020:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getAsteriskKeyword_1_2_0()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultExpressionAccess().getAsteriskKeyword_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1_2__0__Impl"


    // $ANTLR start "rule__MultExpression__Group_1_2__1"
    // InternalKExpressions.g:4033:1: rule__MultExpression__Group_1_2__1 : rule__MultExpression__Group_1_2__1__Impl ;
    public final void rule__MultExpression__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4037:1: ( rule__MultExpression__Group_1_2__1__Impl )
            // InternalKExpressions.g:4038:2: rule__MultExpression__Group_1_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultExpression__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1_2__1"


    // $ANTLR start "rule__MultExpression__Group_1_2__1__Impl"
    // InternalKExpressions.g:4044:1: rule__MultExpression__Group_1_2__1__Impl : ( ( rule__MultExpression__SubExpressionsAssignment_1_2_1 ) ) ;
    public final void rule__MultExpression__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4048:1: ( ( ( rule__MultExpression__SubExpressionsAssignment_1_2_1 ) ) )
            // InternalKExpressions.g:4049:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_2_1 ) )
            {
            // InternalKExpressions.g:4049:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_2_1 ) )
            // InternalKExpressions.g:4050:1: ( rule__MultExpression__SubExpressionsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getSubExpressionsAssignment_1_2_1()); 
            }
            // InternalKExpressions.g:4051:1: ( rule__MultExpression__SubExpressionsAssignment_1_2_1 )
            // InternalKExpressions.g:4051:2: rule__MultExpression__SubExpressionsAssignment_1_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultExpression__SubExpressionsAssignment_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultExpressionAccess().getSubExpressionsAssignment_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1_2__1__Impl"


    // $ANTLR start "rule__DivExpression__Group__0"
    // InternalKExpressions.g:4065:1: rule__DivExpression__Group__0 : rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1 ;
    public final void rule__DivExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4069:1: ( rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1 )
            // InternalKExpressions.g:4070:2: rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__DivExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DivExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DivExpression__Group__0"


    // $ANTLR start "rule__DivExpression__Group__0__Impl"
    // InternalKExpressions.g:4077:1: rule__DivExpression__Group__0__Impl : ( ruleModExpression ) ;
    public final void rule__DivExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4081:1: ( ( ruleModExpression ) )
            // InternalKExpressions.g:4082:1: ( ruleModExpression )
            {
            // InternalKExpressions.g:4082:1: ( ruleModExpression )
            // InternalKExpressions.g:4083:1: ruleModExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getModExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleModExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivExpressionAccess().getModExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DivExpression__Group__0__Impl"


    // $ANTLR start "rule__DivExpression__Group__1"
    // InternalKExpressions.g:4094:1: rule__DivExpression__Group__1 : rule__DivExpression__Group__1__Impl ;
    public final void rule__DivExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4098:1: ( rule__DivExpression__Group__1__Impl )
            // InternalKExpressions.g:4099:2: rule__DivExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DivExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DivExpression__Group__1"


    // $ANTLR start "rule__DivExpression__Group__1__Impl"
    // InternalKExpressions.g:4105:1: rule__DivExpression__Group__1__Impl : ( ( rule__DivExpression__Group_1__0 )? ) ;
    public final void rule__DivExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4109:1: ( ( ( rule__DivExpression__Group_1__0 )? ) )
            // InternalKExpressions.g:4110:1: ( ( rule__DivExpression__Group_1__0 )? )
            {
            // InternalKExpressions.g:4110:1: ( ( rule__DivExpression__Group_1__0 )? )
            // InternalKExpressions.g:4111:1: ( rule__DivExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:4112:1: ( rule__DivExpression__Group_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==24) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalKExpressions.g:4112:2: rule__DivExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__DivExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DivExpression__Group__1__Impl"


    // $ANTLR start "rule__DivExpression__Group_1__0"
    // InternalKExpressions.g:4126:1: rule__DivExpression__Group_1__0 : rule__DivExpression__Group_1__0__Impl rule__DivExpression__Group_1__1 ;
    public final void rule__DivExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4130:1: ( rule__DivExpression__Group_1__0__Impl rule__DivExpression__Group_1__1 )
            // InternalKExpressions.g:4131:2: rule__DivExpression__Group_1__0__Impl rule__DivExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__DivExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DivExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DivExpression__Group_1__0"


    // $ANTLR start "rule__DivExpression__Group_1__0__Impl"
    // InternalKExpressions.g:4138:1: rule__DivExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__DivExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4142:1: ( ( () ) )
            // InternalKExpressions.g:4143:1: ( () )
            {
            // InternalKExpressions.g:4143:1: ( () )
            // InternalKExpressions.g:4144:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:4145:1: ()
            // InternalKExpressions.g:4147:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DivExpression__Group_1__0__Impl"


    // $ANTLR start "rule__DivExpression__Group_1__1"
    // InternalKExpressions.g:4157:1: rule__DivExpression__Group_1__1 : rule__DivExpression__Group_1__1__Impl rule__DivExpression__Group_1__2 ;
    public final void rule__DivExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4161:1: ( rule__DivExpression__Group_1__1__Impl rule__DivExpression__Group_1__2 )
            // InternalKExpressions.g:4162:2: rule__DivExpression__Group_1__1__Impl rule__DivExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__DivExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DivExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DivExpression__Group_1__1"


    // $ANTLR start "rule__DivExpression__Group_1__1__Impl"
    // InternalKExpressions.g:4169:1: rule__DivExpression__Group_1__1__Impl : ( ( rule__DivExpression__Group_1_1__0 ) ) ;
    public final void rule__DivExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4173:1: ( ( ( rule__DivExpression__Group_1_1__0 ) ) )
            // InternalKExpressions.g:4174:1: ( ( rule__DivExpression__Group_1_1__0 ) )
            {
            // InternalKExpressions.g:4174:1: ( ( rule__DivExpression__Group_1_1__0 ) )
            // InternalKExpressions.g:4175:1: ( rule__DivExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getGroup_1_1()); 
            }
            // InternalKExpressions.g:4176:1: ( rule__DivExpression__Group_1_1__0 )
            // InternalKExpressions.g:4176:2: rule__DivExpression__Group_1_1__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DivExpression__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivExpressionAccess().getGroup_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DivExpression__Group_1__1__Impl"


    // $ANTLR start "rule__DivExpression__Group_1__2"
    // InternalKExpressions.g:4186:1: rule__DivExpression__Group_1__2 : rule__DivExpression__Group_1__2__Impl ;
    public final void rule__DivExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4190:1: ( rule__DivExpression__Group_1__2__Impl )
            // InternalKExpressions.g:4191:2: rule__DivExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DivExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DivExpression__Group_1__2"


    // $ANTLR start "rule__DivExpression__Group_1__2__Impl"
    // InternalKExpressions.g:4197:1: rule__DivExpression__Group_1__2__Impl : ( ( rule__DivExpression__Group_1_2__0 )* ) ;
    public final void rule__DivExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4201:1: ( ( ( rule__DivExpression__Group_1_2__0 )* ) )
            // InternalKExpressions.g:4202:1: ( ( rule__DivExpression__Group_1_2__0 )* )
            {
            // InternalKExpressions.g:4202:1: ( ( rule__DivExpression__Group_1_2__0 )* )
            // InternalKExpressions.g:4203:1: ( rule__DivExpression__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getGroup_1_2()); 
            }
            // InternalKExpressions.g:4204:1: ( rule__DivExpression__Group_1_2__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==24) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalKExpressions.g:4204:2: rule__DivExpression__Group_1_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_22);
            	    rule__DivExpression__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivExpressionAccess().getGroup_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DivExpression__Group_1__2__Impl"


    // $ANTLR start "rule__DivExpression__Group_1_1__0"
    // InternalKExpressions.g:4220:1: rule__DivExpression__Group_1_1__0 : rule__DivExpression__Group_1_1__0__Impl rule__DivExpression__Group_1_1__1 ;
    public final void rule__DivExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4224:1: ( rule__DivExpression__Group_1_1__0__Impl rule__DivExpression__Group_1_1__1 )
            // InternalKExpressions.g:4225:2: rule__DivExpression__Group_1_1__0__Impl rule__DivExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__DivExpression__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DivExpression__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DivExpression__Group_1_1__0"


    // $ANTLR start "rule__DivExpression__Group_1_1__0__Impl"
    // InternalKExpressions.g:4232:1: rule__DivExpression__Group_1_1__0__Impl : ( ( rule__DivExpression__OperatorAssignment_1_1_0 ) ) ;
    public final void rule__DivExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4236:1: ( ( ( rule__DivExpression__OperatorAssignment_1_1_0 ) ) )
            // InternalKExpressions.g:4237:1: ( ( rule__DivExpression__OperatorAssignment_1_1_0 ) )
            {
            // InternalKExpressions.g:4237:1: ( ( rule__DivExpression__OperatorAssignment_1_1_0 ) )
            // InternalKExpressions.g:4238:1: ( rule__DivExpression__OperatorAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorAssignment_1_1_0()); 
            }
            // InternalKExpressions.g:4239:1: ( rule__DivExpression__OperatorAssignment_1_1_0 )
            // InternalKExpressions.g:4239:2: rule__DivExpression__OperatorAssignment_1_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DivExpression__OperatorAssignment_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivExpressionAccess().getOperatorAssignment_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DivExpression__Group_1_1__0__Impl"


    // $ANTLR start "rule__DivExpression__Group_1_1__1"
    // InternalKExpressions.g:4249:1: rule__DivExpression__Group_1_1__1 : rule__DivExpression__Group_1_1__1__Impl ;
    public final void rule__DivExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4253:1: ( rule__DivExpression__Group_1_1__1__Impl )
            // InternalKExpressions.g:4254:2: rule__DivExpression__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DivExpression__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DivExpression__Group_1_1__1"


    // $ANTLR start "rule__DivExpression__Group_1_1__1__Impl"
    // InternalKExpressions.g:4260:1: rule__DivExpression__Group_1_1__1__Impl : ( ( rule__DivExpression__SubExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__DivExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4264:1: ( ( ( rule__DivExpression__SubExpressionsAssignment_1_1_1 ) ) )
            // InternalKExpressions.g:4265:1: ( ( rule__DivExpression__SubExpressionsAssignment_1_1_1 ) )
            {
            // InternalKExpressions.g:4265:1: ( ( rule__DivExpression__SubExpressionsAssignment_1_1_1 ) )
            // InternalKExpressions.g:4266:1: ( rule__DivExpression__SubExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }
            // InternalKExpressions.g:4267:1: ( rule__DivExpression__SubExpressionsAssignment_1_1_1 )
            // InternalKExpressions.g:4267:2: rule__DivExpression__SubExpressionsAssignment_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DivExpression__SubExpressionsAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DivExpression__Group_1_1__1__Impl"


    // $ANTLR start "rule__DivExpression__Group_1_2__0"
    // InternalKExpressions.g:4281:1: rule__DivExpression__Group_1_2__0 : rule__DivExpression__Group_1_2__0__Impl rule__DivExpression__Group_1_2__1 ;
    public final void rule__DivExpression__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4285:1: ( rule__DivExpression__Group_1_2__0__Impl rule__DivExpression__Group_1_2__1 )
            // InternalKExpressions.g:4286:2: rule__DivExpression__Group_1_2__0__Impl rule__DivExpression__Group_1_2__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__DivExpression__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DivExpression__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DivExpression__Group_1_2__0"


    // $ANTLR start "rule__DivExpression__Group_1_2__0__Impl"
    // InternalKExpressions.g:4293:1: rule__DivExpression__Group_1_2__0__Impl : ( '/' ) ;
    public final void rule__DivExpression__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4297:1: ( ( '/' ) )
            // InternalKExpressions.g:4298:1: ( '/' )
            {
            // InternalKExpressions.g:4298:1: ( '/' )
            // InternalKExpressions.g:4299:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getSolidusKeyword_1_2_0()); 
            }
            match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivExpressionAccess().getSolidusKeyword_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DivExpression__Group_1_2__0__Impl"


    // $ANTLR start "rule__DivExpression__Group_1_2__1"
    // InternalKExpressions.g:4312:1: rule__DivExpression__Group_1_2__1 : rule__DivExpression__Group_1_2__1__Impl ;
    public final void rule__DivExpression__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4316:1: ( rule__DivExpression__Group_1_2__1__Impl )
            // InternalKExpressions.g:4317:2: rule__DivExpression__Group_1_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DivExpression__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DivExpression__Group_1_2__1"


    // $ANTLR start "rule__DivExpression__Group_1_2__1__Impl"
    // InternalKExpressions.g:4323:1: rule__DivExpression__Group_1_2__1__Impl : ( ( rule__DivExpression__SubExpressionsAssignment_1_2_1 ) ) ;
    public final void rule__DivExpression__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4327:1: ( ( ( rule__DivExpression__SubExpressionsAssignment_1_2_1 ) ) )
            // InternalKExpressions.g:4328:1: ( ( rule__DivExpression__SubExpressionsAssignment_1_2_1 ) )
            {
            // InternalKExpressions.g:4328:1: ( ( rule__DivExpression__SubExpressionsAssignment_1_2_1 ) )
            // InternalKExpressions.g:4329:1: ( rule__DivExpression__SubExpressionsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getSubExpressionsAssignment_1_2_1()); 
            }
            // InternalKExpressions.g:4330:1: ( rule__DivExpression__SubExpressionsAssignment_1_2_1 )
            // InternalKExpressions.g:4330:2: rule__DivExpression__SubExpressionsAssignment_1_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DivExpression__SubExpressionsAssignment_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivExpressionAccess().getSubExpressionsAssignment_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DivExpression__Group_1_2__1__Impl"


    // $ANTLR start "rule__ModExpression__Group__0"
    // InternalKExpressions.g:4344:1: rule__ModExpression__Group__0 : rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1 ;
    public final void rule__ModExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4348:1: ( rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1 )
            // InternalKExpressions.g:4349:2: rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__ModExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ModExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModExpression__Group__0"


    // $ANTLR start "rule__ModExpression__Group__0__Impl"
    // InternalKExpressions.g:4356:1: rule__ModExpression__Group__0__Impl : ( ruleNegExpression ) ;
    public final void rule__ModExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4360:1: ( ( ruleNegExpression ) )
            // InternalKExpressions.g:4361:1: ( ruleNegExpression )
            {
            // InternalKExpressions.g:4361:1: ( ruleNegExpression )
            // InternalKExpressions.g:4362:1: ruleNegExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getNegExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleNegExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModExpressionAccess().getNegExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModExpression__Group__0__Impl"


    // $ANTLR start "rule__ModExpression__Group__1"
    // InternalKExpressions.g:4373:1: rule__ModExpression__Group__1 : rule__ModExpression__Group__1__Impl ;
    public final void rule__ModExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4377:1: ( rule__ModExpression__Group__1__Impl )
            // InternalKExpressions.g:4378:2: rule__ModExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ModExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModExpression__Group__1"


    // $ANTLR start "rule__ModExpression__Group__1__Impl"
    // InternalKExpressions.g:4384:1: rule__ModExpression__Group__1__Impl : ( ( rule__ModExpression__Group_1__0 )? ) ;
    public final void rule__ModExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4388:1: ( ( ( rule__ModExpression__Group_1__0 )? ) )
            // InternalKExpressions.g:4389:1: ( ( rule__ModExpression__Group_1__0 )? )
            {
            // InternalKExpressions.g:4389:1: ( ( rule__ModExpression__Group_1__0 )? )
            // InternalKExpressions.g:4390:1: ( rule__ModExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:4391:1: ( rule__ModExpression__Group_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==23) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalKExpressions.g:4391:2: rule__ModExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ModExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__ModExpression__Group__1__Impl"


    // $ANTLR start "rule__ModExpression__Group_1__0"
    // InternalKExpressions.g:4405:1: rule__ModExpression__Group_1__0 : rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1 ;
    public final void rule__ModExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4409:1: ( rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1 )
            // InternalKExpressions.g:4410:2: rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__ModExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ModExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModExpression__Group_1__0"


    // $ANTLR start "rule__ModExpression__Group_1__0__Impl"
    // InternalKExpressions.g:4417:1: rule__ModExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ModExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4421:1: ( ( () ) )
            // InternalKExpressions.g:4422:1: ( () )
            {
            // InternalKExpressions.g:4422:1: ( () )
            // InternalKExpressions.g:4423:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:4424:1: ()
            // InternalKExpressions.g:4426:1: 
            {
            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__ModExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ModExpression__Group_1__1"
    // InternalKExpressions.g:4436:1: rule__ModExpression__Group_1__1 : rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2 ;
    public final void rule__ModExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4440:1: ( rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2 )
            // InternalKExpressions.g:4441:2: rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__ModExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ModExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModExpression__Group_1__1"


    // $ANTLR start "rule__ModExpression__Group_1__1__Impl"
    // InternalKExpressions.g:4448:1: rule__ModExpression__Group_1__1__Impl : ( ( rule__ModExpression__Group_1_1__0 ) ) ;
    public final void rule__ModExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4452:1: ( ( ( rule__ModExpression__Group_1_1__0 ) ) )
            // InternalKExpressions.g:4453:1: ( ( rule__ModExpression__Group_1_1__0 ) )
            {
            // InternalKExpressions.g:4453:1: ( ( rule__ModExpression__Group_1_1__0 ) )
            // InternalKExpressions.g:4454:1: ( rule__ModExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getGroup_1_1()); 
            }
            // InternalKExpressions.g:4455:1: ( rule__ModExpression__Group_1_1__0 )
            // InternalKExpressions.g:4455:2: rule__ModExpression__Group_1_1__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ModExpression__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModExpressionAccess().getGroup_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ModExpression__Group_1__2"
    // InternalKExpressions.g:4465:1: rule__ModExpression__Group_1__2 : rule__ModExpression__Group_1__2__Impl ;
    public final void rule__ModExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4469:1: ( rule__ModExpression__Group_1__2__Impl )
            // InternalKExpressions.g:4470:2: rule__ModExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ModExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModExpression__Group_1__2"


    // $ANTLR start "rule__ModExpression__Group_1__2__Impl"
    // InternalKExpressions.g:4476:1: rule__ModExpression__Group_1__2__Impl : ( ( rule__ModExpression__Group_1_2__0 )* ) ;
    public final void rule__ModExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4480:1: ( ( ( rule__ModExpression__Group_1_2__0 )* ) )
            // InternalKExpressions.g:4481:1: ( ( rule__ModExpression__Group_1_2__0 )* )
            {
            // InternalKExpressions.g:4481:1: ( ( rule__ModExpression__Group_1_2__0 )* )
            // InternalKExpressions.g:4482:1: ( rule__ModExpression__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getGroup_1_2()); 
            }
            // InternalKExpressions.g:4483:1: ( rule__ModExpression__Group_1_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==23) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalKExpressions.g:4483:2: rule__ModExpression__Group_1_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_24);
            	    rule__ModExpression__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModExpressionAccess().getGroup_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModExpression__Group_1__2__Impl"


    // $ANTLR start "rule__ModExpression__Group_1_1__0"
    // InternalKExpressions.g:4499:1: rule__ModExpression__Group_1_1__0 : rule__ModExpression__Group_1_1__0__Impl rule__ModExpression__Group_1_1__1 ;
    public final void rule__ModExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4503:1: ( rule__ModExpression__Group_1_1__0__Impl rule__ModExpression__Group_1_1__1 )
            // InternalKExpressions.g:4504:2: rule__ModExpression__Group_1_1__0__Impl rule__ModExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__ModExpression__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ModExpression__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModExpression__Group_1_1__0"


    // $ANTLR start "rule__ModExpression__Group_1_1__0__Impl"
    // InternalKExpressions.g:4511:1: rule__ModExpression__Group_1_1__0__Impl : ( ( rule__ModExpression__OperatorAssignment_1_1_0 ) ) ;
    public final void rule__ModExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4515:1: ( ( ( rule__ModExpression__OperatorAssignment_1_1_0 ) ) )
            // InternalKExpressions.g:4516:1: ( ( rule__ModExpression__OperatorAssignment_1_1_0 ) )
            {
            // InternalKExpressions.g:4516:1: ( ( rule__ModExpression__OperatorAssignment_1_1_0 ) )
            // InternalKExpressions.g:4517:1: ( rule__ModExpression__OperatorAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorAssignment_1_1_0()); 
            }
            // InternalKExpressions.g:4518:1: ( rule__ModExpression__OperatorAssignment_1_1_0 )
            // InternalKExpressions.g:4518:2: rule__ModExpression__OperatorAssignment_1_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ModExpression__OperatorAssignment_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModExpressionAccess().getOperatorAssignment_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModExpression__Group_1_1__0__Impl"


    // $ANTLR start "rule__ModExpression__Group_1_1__1"
    // InternalKExpressions.g:4528:1: rule__ModExpression__Group_1_1__1 : rule__ModExpression__Group_1_1__1__Impl ;
    public final void rule__ModExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4532:1: ( rule__ModExpression__Group_1_1__1__Impl )
            // InternalKExpressions.g:4533:2: rule__ModExpression__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ModExpression__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModExpression__Group_1_1__1"


    // $ANTLR start "rule__ModExpression__Group_1_1__1__Impl"
    // InternalKExpressions.g:4539:1: rule__ModExpression__Group_1_1__1__Impl : ( ( rule__ModExpression__SubExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__ModExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4543:1: ( ( ( rule__ModExpression__SubExpressionsAssignment_1_1_1 ) ) )
            // InternalKExpressions.g:4544:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_1_1 ) )
            {
            // InternalKExpressions.g:4544:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_1_1 ) )
            // InternalKExpressions.g:4545:1: ( rule__ModExpression__SubExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }
            // InternalKExpressions.g:4546:1: ( rule__ModExpression__SubExpressionsAssignment_1_1_1 )
            // InternalKExpressions.g:4546:2: rule__ModExpression__SubExpressionsAssignment_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ModExpression__SubExpressionsAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModExpression__Group_1_1__1__Impl"


    // $ANTLR start "rule__ModExpression__Group_1_2__0"
    // InternalKExpressions.g:4560:1: rule__ModExpression__Group_1_2__0 : rule__ModExpression__Group_1_2__0__Impl rule__ModExpression__Group_1_2__1 ;
    public final void rule__ModExpression__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4564:1: ( rule__ModExpression__Group_1_2__0__Impl rule__ModExpression__Group_1_2__1 )
            // InternalKExpressions.g:4565:2: rule__ModExpression__Group_1_2__0__Impl rule__ModExpression__Group_1_2__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__ModExpression__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ModExpression__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModExpression__Group_1_2__0"


    // $ANTLR start "rule__ModExpression__Group_1_2__0__Impl"
    // InternalKExpressions.g:4572:1: rule__ModExpression__Group_1_2__0__Impl : ( '%' ) ;
    public final void rule__ModExpression__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4576:1: ( ( '%' ) )
            // InternalKExpressions.g:4577:1: ( '%' )
            {
            // InternalKExpressions.g:4577:1: ( '%' )
            // InternalKExpressions.g:4578:1: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getPercentSignKeyword_1_2_0()); 
            }
            match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModExpressionAccess().getPercentSignKeyword_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModExpression__Group_1_2__0__Impl"


    // $ANTLR start "rule__ModExpression__Group_1_2__1"
    // InternalKExpressions.g:4591:1: rule__ModExpression__Group_1_2__1 : rule__ModExpression__Group_1_2__1__Impl ;
    public final void rule__ModExpression__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4595:1: ( rule__ModExpression__Group_1_2__1__Impl )
            // InternalKExpressions.g:4596:2: rule__ModExpression__Group_1_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ModExpression__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModExpression__Group_1_2__1"


    // $ANTLR start "rule__ModExpression__Group_1_2__1__Impl"
    // InternalKExpressions.g:4602:1: rule__ModExpression__Group_1_2__1__Impl : ( ( rule__ModExpression__SubExpressionsAssignment_1_2_1 ) ) ;
    public final void rule__ModExpression__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4606:1: ( ( ( rule__ModExpression__SubExpressionsAssignment_1_2_1 ) ) )
            // InternalKExpressions.g:4607:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_2_1 ) )
            {
            // InternalKExpressions.g:4607:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_2_1 ) )
            // InternalKExpressions.g:4608:1: ( rule__ModExpression__SubExpressionsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getSubExpressionsAssignment_1_2_1()); 
            }
            // InternalKExpressions.g:4609:1: ( rule__ModExpression__SubExpressionsAssignment_1_2_1 )
            // InternalKExpressions.g:4609:2: rule__ModExpression__SubExpressionsAssignment_1_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ModExpression__SubExpressionsAssignment_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModExpressionAccess().getSubExpressionsAssignment_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModExpression__Group_1_2__1__Impl"


    // $ANTLR start "rule__NegExpression__Group_0__0"
    // InternalKExpressions.g:4623:1: rule__NegExpression__Group_0__0 : rule__NegExpression__Group_0__0__Impl rule__NegExpression__Group_0__1 ;
    public final void rule__NegExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4627:1: ( rule__NegExpression__Group_0__0__Impl rule__NegExpression__Group_0__1 )
            // InternalKExpressions.g:4628:2: rule__NegExpression__Group_0__0__Impl rule__NegExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__NegExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NegExpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegExpression__Group_0__0"


    // $ANTLR start "rule__NegExpression__Group_0__0__Impl"
    // InternalKExpressions.g:4635:1: rule__NegExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__NegExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4639:1: ( ( () ) )
            // InternalKExpressions.g:4640:1: ( () )
            {
            // InternalKExpressions.g:4640:1: ( () )
            // InternalKExpressions.g:4641:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // InternalKExpressions.g:4642:1: ()
            // InternalKExpressions.g:4644:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegExpressionAccess().getOperatorExpressionAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegExpression__Group_0__0__Impl"


    // $ANTLR start "rule__NegExpression__Group_0__1"
    // InternalKExpressions.g:4654:1: rule__NegExpression__Group_0__1 : rule__NegExpression__Group_0__1__Impl rule__NegExpression__Group_0__2 ;
    public final void rule__NegExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4658:1: ( rule__NegExpression__Group_0__1__Impl rule__NegExpression__Group_0__2 )
            // InternalKExpressions.g:4659:2: rule__NegExpression__Group_0__1__Impl rule__NegExpression__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__NegExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NegExpression__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegExpression__Group_0__1"


    // $ANTLR start "rule__NegExpression__Group_0__1__Impl"
    // InternalKExpressions.g:4666:1: rule__NegExpression__Group_0__1__Impl : ( ( rule__NegExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__NegExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4670:1: ( ( ( rule__NegExpression__OperatorAssignment_0_1 ) ) )
            // InternalKExpressions.g:4671:1: ( ( rule__NegExpression__OperatorAssignment_0_1 ) )
            {
            // InternalKExpressions.g:4671:1: ( ( rule__NegExpression__OperatorAssignment_0_1 ) )
            // InternalKExpressions.g:4672:1: ( rule__NegExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // InternalKExpressions.g:4673:1: ( rule__NegExpression__OperatorAssignment_0_1 )
            // InternalKExpressions.g:4673:2: rule__NegExpression__OperatorAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NegExpression__OperatorAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegExpressionAccess().getOperatorAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegExpression__Group_0__1__Impl"


    // $ANTLR start "rule__NegExpression__Group_0__2"
    // InternalKExpressions.g:4683:1: rule__NegExpression__Group_0__2 : rule__NegExpression__Group_0__2__Impl ;
    public final void rule__NegExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4687:1: ( rule__NegExpression__Group_0__2__Impl )
            // InternalKExpressions.g:4688:2: rule__NegExpression__Group_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NegExpression__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegExpression__Group_0__2"


    // $ANTLR start "rule__NegExpression__Group_0__2__Impl"
    // InternalKExpressions.g:4694:1: rule__NegExpression__Group_0__2__Impl : ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) ) ;
    public final void rule__NegExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4698:1: ( ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) ) )
            // InternalKExpressions.g:4699:1: ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) )
            {
            // InternalKExpressions.g:4699:1: ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) )
            // InternalKExpressions.g:4700:1: ( rule__NegExpression__SubExpressionsAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getSubExpressionsAssignment_0_2()); 
            }
            // InternalKExpressions.g:4701:1: ( rule__NegExpression__SubExpressionsAssignment_0_2 )
            // InternalKExpressions.g:4701:2: rule__NegExpression__SubExpressionsAssignment_0_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NegExpression__SubExpressionsAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegExpressionAccess().getSubExpressionsAssignment_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegExpression__Group_0__2__Impl"


    // $ANTLR start "rule__AtomicExpression__Group_2__0"
    // InternalKExpressions.g:4717:1: rule__AtomicExpression__Group_2__0 : rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 ;
    public final void rule__AtomicExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4721:1: ( rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 )
            // InternalKExpressions.g:4722:2: rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__AtomicExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AtomicExpression__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpression__Group_2__0"


    // $ANTLR start "rule__AtomicExpression__Group_2__0__Impl"
    // InternalKExpressions.g:4729:1: rule__AtomicExpression__Group_2__0__Impl : ( '(' ) ;
    public final void rule__AtomicExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4733:1: ( ( '(' ) )
            // InternalKExpressions.g:4734:1: ( '(' )
            {
            // InternalKExpressions.g:4734:1: ( '(' )
            // InternalKExpressions.g:4735:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__AtomicExpression__Group_2__0__Impl"


    // $ANTLR start "rule__AtomicExpression__Group_2__1"
    // InternalKExpressions.g:4748:1: rule__AtomicExpression__Group_2__1 : rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2 ;
    public final void rule__AtomicExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4752:1: ( rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2 )
            // InternalKExpressions.g:4753:2: rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__AtomicExpression__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AtomicExpression__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpression__Group_2__1"


    // $ANTLR start "rule__AtomicExpression__Group_2__1__Impl"
    // InternalKExpressions.g:4760:1: rule__AtomicExpression__Group_2__1__Impl : ( ruleBoolExpression ) ;
    public final void rule__AtomicExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4764:1: ( ( ruleBoolExpression ) )
            // InternalKExpressions.g:4765:1: ( ruleBoolExpression )
            {
            // InternalKExpressions.g:4765:1: ( ruleBoolExpression )
            // InternalKExpressions.g:4766:1: ruleBoolExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getBoolExpressionParserRuleCall_2_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleBoolExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExpressionAccess().getBoolExpressionParserRuleCall_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpression__Group_2__1__Impl"


    // $ANTLR start "rule__AtomicExpression__Group_2__2"
    // InternalKExpressions.g:4777:1: rule__AtomicExpression__Group_2__2 : rule__AtomicExpression__Group_2__2__Impl ;
    public final void rule__AtomicExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4781:1: ( rule__AtomicExpression__Group_2__2__Impl )
            // InternalKExpressions.g:4782:2: rule__AtomicExpression__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AtomicExpression__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpression__Group_2__2"


    // $ANTLR start "rule__AtomicExpression__Group_2__2__Impl"
    // InternalKExpressions.g:4788:1: rule__AtomicExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__AtomicExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4792:1: ( ( ')' ) )
            // InternalKExpressions.g:4793:1: ( ')' )
            {
            // InternalKExpressions.g:4793:1: ( ')' )
            // InternalKExpressions.g:4794:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__AtomicExpression__Group_2__2__Impl"


    // $ANTLR start "rule__AtomicValuedExpression__Group_3__0"
    // InternalKExpressions.g:4813:1: rule__AtomicValuedExpression__Group_3__0 : rule__AtomicValuedExpression__Group_3__0__Impl rule__AtomicValuedExpression__Group_3__1 ;
    public final void rule__AtomicValuedExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4817:1: ( rule__AtomicValuedExpression__Group_3__0__Impl rule__AtomicValuedExpression__Group_3__1 )
            // InternalKExpressions.g:4818:2: rule__AtomicValuedExpression__Group_3__0__Impl rule__AtomicValuedExpression__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__AtomicValuedExpression__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AtomicValuedExpression__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicValuedExpression__Group_3__0"


    // $ANTLR start "rule__AtomicValuedExpression__Group_3__0__Impl"
    // InternalKExpressions.g:4825:1: rule__AtomicValuedExpression__Group_3__0__Impl : ( '(' ) ;
    public final void rule__AtomicValuedExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4829:1: ( ( '(' ) )
            // InternalKExpressions.g:4830:1: ( '(' )
            {
            // InternalKExpressions.g:4830:1: ( '(' )
            // InternalKExpressions.g:4831:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__AtomicValuedExpression__Group_3__0__Impl"


    // $ANTLR start "rule__AtomicValuedExpression__Group_3__1"
    // InternalKExpressions.g:4844:1: rule__AtomicValuedExpression__Group_3__1 : rule__AtomicValuedExpression__Group_3__1__Impl rule__AtomicValuedExpression__Group_3__2 ;
    public final void rule__AtomicValuedExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4848:1: ( rule__AtomicValuedExpression__Group_3__1__Impl rule__AtomicValuedExpression__Group_3__2 )
            // InternalKExpressions.g:4849:2: rule__AtomicValuedExpression__Group_3__1__Impl rule__AtomicValuedExpression__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__AtomicValuedExpression__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AtomicValuedExpression__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicValuedExpression__Group_3__1"


    // $ANTLR start "rule__AtomicValuedExpression__Group_3__1__Impl"
    // InternalKExpressions.g:4856:1: rule__AtomicValuedExpression__Group_3__1__Impl : ( ruleValuedExpression ) ;
    public final void rule__AtomicValuedExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4860:1: ( ( ruleValuedExpression ) )
            // InternalKExpressions.g:4861:1: ( ruleValuedExpression )
            {
            // InternalKExpressions.g:4861:1: ( ruleValuedExpression )
            // InternalKExpressions.g:4862:1: ruleValuedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_3_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValuedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__AtomicValuedExpression__Group_3__1__Impl"


    // $ANTLR start "rule__AtomicValuedExpression__Group_3__2"
    // InternalKExpressions.g:4873:1: rule__AtomicValuedExpression__Group_3__2 : rule__AtomicValuedExpression__Group_3__2__Impl ;
    public final void rule__AtomicValuedExpression__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4877:1: ( rule__AtomicValuedExpression__Group_3__2__Impl )
            // InternalKExpressions.g:4878:2: rule__AtomicValuedExpression__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AtomicValuedExpression__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicValuedExpression__Group_3__2"


    // $ANTLR start "rule__AtomicValuedExpression__Group_3__2__Impl"
    // InternalKExpressions.g:4884:1: rule__AtomicValuedExpression__Group_3__2__Impl : ( ')' ) ;
    public final void rule__AtomicValuedExpression__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4888:1: ( ( ')' ) )
            // InternalKExpressions.g:4889:1: ( ')' )
            {
            // InternalKExpressions.g:4889:1: ( ')' )
            // InternalKExpressions.g:4890:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__AtomicValuedExpression__Group_3__2__Impl"


    // $ANTLR start "rule__ValuedObjectTestExpression__Group_0__0"
    // InternalKExpressions.g:4909:1: rule__ValuedObjectTestExpression__Group_0__0 : rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1 ;
    public final void rule__ValuedObjectTestExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4913:1: ( rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1 )
            // InternalKExpressions.g:4914:2: rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__ValuedObjectTestExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ValuedObjectTestExpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValuedObjectTestExpression__Group_0__0"


    // $ANTLR start "rule__ValuedObjectTestExpression__Group_0__0__Impl"
    // InternalKExpressions.g:4921:1: rule__ValuedObjectTestExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4925:1: ( ( () ) )
            // InternalKExpressions.g:4926:1: ( () )
            {
            // InternalKExpressions.g:4926:1: ( () )
            // InternalKExpressions.g:4927:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // InternalKExpressions.g:4928:1: ()
            // InternalKExpressions.g:4930:1: 
            {
            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__ValuedObjectTestExpression__Group_0__0__Impl"


    // $ANTLR start "rule__ValuedObjectTestExpression__Group_0__1"
    // InternalKExpressions.g:4940:1: rule__ValuedObjectTestExpression__Group_0__1 : rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2 ;
    public final void rule__ValuedObjectTestExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4944:1: ( rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2 )
            // InternalKExpressions.g:4945:2: rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__ValuedObjectTestExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ValuedObjectTestExpression__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValuedObjectTestExpression__Group_0__1"


    // $ANTLR start "rule__ValuedObjectTestExpression__Group_0__1__Impl"
    // InternalKExpressions.g:4952:1: rule__ValuedObjectTestExpression__Group_0__1__Impl : ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4956:1: ( ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) ) )
            // InternalKExpressions.g:4957:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) )
            {
            // InternalKExpressions.g:4957:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) )
            // InternalKExpressions.g:4958:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // InternalKExpressions.g:4959:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 )
            // InternalKExpressions.g:4959:2: rule__ValuedObjectTestExpression__OperatorAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ValuedObjectTestExpression__OperatorAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__ValuedObjectTestExpression__Group_0__1__Impl"


    // $ANTLR start "rule__ValuedObjectTestExpression__Group_0__2"
    // InternalKExpressions.g:4969:1: rule__ValuedObjectTestExpression__Group_0__2 : rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3 ;
    public final void rule__ValuedObjectTestExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4973:1: ( rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3 )
            // InternalKExpressions.g:4974:2: rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3
            {
            pushFollow(FollowSets000.FOLLOW_28);
            rule__ValuedObjectTestExpression__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ValuedObjectTestExpression__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValuedObjectTestExpression__Group_0__2"


    // $ANTLR start "rule__ValuedObjectTestExpression__Group_0__2__Impl"
    // InternalKExpressions.g:4981:1: rule__ValuedObjectTestExpression__Group_0__2__Impl : ( '(' ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4985:1: ( ( '(' ) )
            // InternalKExpressions.g:4986:1: ( '(' )
            {
            // InternalKExpressions.g:4986:1: ( '(' )
            // InternalKExpressions.g:4987:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__ValuedObjectTestExpression__Group_0__2__Impl"


    // $ANTLR start "rule__ValuedObjectTestExpression__Group_0__3"
    // InternalKExpressions.g:5000:1: rule__ValuedObjectTestExpression__Group_0__3 : rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4 ;
    public final void rule__ValuedObjectTestExpression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5004:1: ( rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4 )
            // InternalKExpressions.g:5005:2: rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__ValuedObjectTestExpression__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ValuedObjectTestExpression__Group_0__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValuedObjectTestExpression__Group_0__3"


    // $ANTLR start "rule__ValuedObjectTestExpression__Group_0__3__Impl"
    // InternalKExpressions.g:5012:1: rule__ValuedObjectTestExpression__Group_0__3__Impl : ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5016:1: ( ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) ) )
            // InternalKExpressions.g:5017:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) )
            {
            // InternalKExpressions.g:5017:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) )
            // InternalKExpressions.g:5018:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsAssignment_0_3()); 
            }
            // InternalKExpressions.g:5019:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 )
            // InternalKExpressions.g:5019:2: rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__ValuedObjectTestExpression__Group_0__3__Impl"


    // $ANTLR start "rule__ValuedObjectTestExpression__Group_0__4"
    // InternalKExpressions.g:5029:1: rule__ValuedObjectTestExpression__Group_0__4 : rule__ValuedObjectTestExpression__Group_0__4__Impl ;
    public final void rule__ValuedObjectTestExpression__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5033:1: ( rule__ValuedObjectTestExpression__Group_0__4__Impl )
            // InternalKExpressions.g:5034:2: rule__ValuedObjectTestExpression__Group_0__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ValuedObjectTestExpression__Group_0__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValuedObjectTestExpression__Group_0__4"


    // $ANTLR start "rule__ValuedObjectTestExpression__Group_0__4__Impl"
    // InternalKExpressions.g:5040:1: rule__ValuedObjectTestExpression__Group_0__4__Impl : ( ')' ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5044:1: ( ( ')' ) )
            // InternalKExpressions.g:5045:1: ( ')' )
            {
            // InternalKExpressions.g:5045:1: ( ')' )
            // InternalKExpressions.g:5046:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__ValuedObjectTestExpression__Group_0__4__Impl"


    // $ANTLR start "rule__ValuedObjectReference__Group__0"
    // InternalKExpressions.g:5069:1: rule__ValuedObjectReference__Group__0 : rule__ValuedObjectReference__Group__0__Impl rule__ValuedObjectReference__Group__1 ;
    public final void rule__ValuedObjectReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5073:1: ( rule__ValuedObjectReference__Group__0__Impl rule__ValuedObjectReference__Group__1 )
            // InternalKExpressions.g:5074:2: rule__ValuedObjectReference__Group__0__Impl rule__ValuedObjectReference__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__ValuedObjectReference__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ValuedObjectReference__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValuedObjectReference__Group__0"


    // $ANTLR start "rule__ValuedObjectReference__Group__0__Impl"
    // InternalKExpressions.g:5081:1: rule__ValuedObjectReference__Group__0__Impl : ( ( rule__ValuedObjectReference__ValuedObjectAssignment_0 ) ) ;
    public final void rule__ValuedObjectReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5085:1: ( ( ( rule__ValuedObjectReference__ValuedObjectAssignment_0 ) ) )
            // InternalKExpressions.g:5086:1: ( ( rule__ValuedObjectReference__ValuedObjectAssignment_0 ) )
            {
            // InternalKExpressions.g:5086:1: ( ( rule__ValuedObjectReference__ValuedObjectAssignment_0 ) )
            // InternalKExpressions.g:5087:1: ( rule__ValuedObjectReference__ValuedObjectAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectAssignment_0()); 
            }
            // InternalKExpressions.g:5088:1: ( rule__ValuedObjectReference__ValuedObjectAssignment_0 )
            // InternalKExpressions.g:5088:2: rule__ValuedObjectReference__ValuedObjectAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ValuedObjectReference__ValuedObjectAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValuedObjectReference__Group__0__Impl"


    // $ANTLR start "rule__ValuedObjectReference__Group__1"
    // InternalKExpressions.g:5098:1: rule__ValuedObjectReference__Group__1 : rule__ValuedObjectReference__Group__1__Impl ;
    public final void rule__ValuedObjectReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5102:1: ( rule__ValuedObjectReference__Group__1__Impl )
            // InternalKExpressions.g:5103:2: rule__ValuedObjectReference__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ValuedObjectReference__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValuedObjectReference__Group__1"


    // $ANTLR start "rule__ValuedObjectReference__Group__1__Impl"
    // InternalKExpressions.g:5109:1: rule__ValuedObjectReference__Group__1__Impl : ( ( rule__ValuedObjectReference__Group_1__0 )* ) ;
    public final void rule__ValuedObjectReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5113:1: ( ( ( rule__ValuedObjectReference__Group_1__0 )* ) )
            // InternalKExpressions.g:5114:1: ( ( rule__ValuedObjectReference__Group_1__0 )* )
            {
            // InternalKExpressions.g:5114:1: ( ( rule__ValuedObjectReference__Group_1__0 )* )
            // InternalKExpressions.g:5115:1: ( rule__ValuedObjectReference__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:5116:1: ( rule__ValuedObjectReference__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==37) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalKExpressions.g:5116:2: rule__ValuedObjectReference__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_30);
            	    rule__ValuedObjectReference__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuedObjectReferenceAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValuedObjectReference__Group__1__Impl"


    // $ANTLR start "rule__ValuedObjectReference__Group_1__0"
    // InternalKExpressions.g:5130:1: rule__ValuedObjectReference__Group_1__0 : rule__ValuedObjectReference__Group_1__0__Impl rule__ValuedObjectReference__Group_1__1 ;
    public final void rule__ValuedObjectReference__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5134:1: ( rule__ValuedObjectReference__Group_1__0__Impl rule__ValuedObjectReference__Group_1__1 )
            // InternalKExpressions.g:5135:2: rule__ValuedObjectReference__Group_1__0__Impl rule__ValuedObjectReference__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__ValuedObjectReference__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ValuedObjectReference__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValuedObjectReference__Group_1__0"


    // $ANTLR start "rule__ValuedObjectReference__Group_1__0__Impl"
    // InternalKExpressions.g:5142:1: rule__ValuedObjectReference__Group_1__0__Impl : ( '[' ) ;
    public final void rule__ValuedObjectReference__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5146:1: ( ( '[' ) )
            // InternalKExpressions.g:5147:1: ( '[' )
            {
            // InternalKExpressions.g:5147:1: ( '[' )
            // InternalKExpressions.g:5148:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getLeftSquareBracketKeyword_1_0()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuedObjectReferenceAccess().getLeftSquareBracketKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValuedObjectReference__Group_1__0__Impl"


    // $ANTLR start "rule__ValuedObjectReference__Group_1__1"
    // InternalKExpressions.g:5161:1: rule__ValuedObjectReference__Group_1__1 : rule__ValuedObjectReference__Group_1__1__Impl rule__ValuedObjectReference__Group_1__2 ;
    public final void rule__ValuedObjectReference__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5165:1: ( rule__ValuedObjectReference__Group_1__1__Impl rule__ValuedObjectReference__Group_1__2 )
            // InternalKExpressions.g:5166:2: rule__ValuedObjectReference__Group_1__1__Impl rule__ValuedObjectReference__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__ValuedObjectReference__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ValuedObjectReference__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValuedObjectReference__Group_1__1"


    // $ANTLR start "rule__ValuedObjectReference__Group_1__1__Impl"
    // InternalKExpressions.g:5173:1: rule__ValuedObjectReference__Group_1__1__Impl : ( ( rule__ValuedObjectReference__IndicesAssignment_1_1 ) ) ;
    public final void rule__ValuedObjectReference__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5177:1: ( ( ( rule__ValuedObjectReference__IndicesAssignment_1_1 ) ) )
            // InternalKExpressions.g:5178:1: ( ( rule__ValuedObjectReference__IndicesAssignment_1_1 ) )
            {
            // InternalKExpressions.g:5178:1: ( ( rule__ValuedObjectReference__IndicesAssignment_1_1 ) )
            // InternalKExpressions.g:5179:1: ( rule__ValuedObjectReference__IndicesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getIndicesAssignment_1_1()); 
            }
            // InternalKExpressions.g:5180:1: ( rule__ValuedObjectReference__IndicesAssignment_1_1 )
            // InternalKExpressions.g:5180:2: rule__ValuedObjectReference__IndicesAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ValuedObjectReference__IndicesAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuedObjectReferenceAccess().getIndicesAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValuedObjectReference__Group_1__1__Impl"


    // $ANTLR start "rule__ValuedObjectReference__Group_1__2"
    // InternalKExpressions.g:5190:1: rule__ValuedObjectReference__Group_1__2 : rule__ValuedObjectReference__Group_1__2__Impl ;
    public final void rule__ValuedObjectReference__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5194:1: ( rule__ValuedObjectReference__Group_1__2__Impl )
            // InternalKExpressions.g:5195:2: rule__ValuedObjectReference__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ValuedObjectReference__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValuedObjectReference__Group_1__2"


    // $ANTLR start "rule__ValuedObjectReference__Group_1__2__Impl"
    // InternalKExpressions.g:5201:1: rule__ValuedObjectReference__Group_1__2__Impl : ( ']' ) ;
    public final void rule__ValuedObjectReference__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5205:1: ( ( ']' ) )
            // InternalKExpressions.g:5206:1: ( ']' )
            {
            // InternalKExpressions.g:5206:1: ( ']' )
            // InternalKExpressions.g:5207:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getRightSquareBracketKeyword_1_2()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuedObjectReferenceAccess().getRightSquareBracketKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValuedObjectReference__Group_1__2__Impl"


    // $ANTLR start "rule__FunctionCall__Group__0"
    // InternalKExpressions.g:5226:1: rule__FunctionCall__Group__0 : rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 ;
    public final void rule__FunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5230:1: ( rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 )
            // InternalKExpressions.g:5231:2: rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__FunctionCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCall__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__0"


    // $ANTLR start "rule__FunctionCall__Group__0__Impl"
    // InternalKExpressions.g:5238:1: rule__FunctionCall__Group__0__Impl : ( '<' ) ;
    public final void rule__FunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5242:1: ( ( '<' ) )
            // InternalKExpressions.g:5243:1: ( '<' )
            {
            // InternalKExpressions.g:5243:1: ( '<' )
            // InternalKExpressions.g:5244:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getLessThanSignKeyword_0()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getLessThanSignKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group__1"
    // InternalKExpressions.g:5257:1: rule__FunctionCall__Group__1 : rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 ;
    public final void rule__FunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5261:1: ( rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 )
            // InternalKExpressions.g:5262:2: rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_33);
            rule__FunctionCall__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCall__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__1"


    // $ANTLR start "rule__FunctionCall__Group__1__Impl"
    // InternalKExpressions.g:5269:1: rule__FunctionCall__Group__1__Impl : ( ( rule__FunctionCall__FunctionNameAssignment_1 ) ) ;
    public final void rule__FunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5273:1: ( ( ( rule__FunctionCall__FunctionNameAssignment_1 ) ) )
            // InternalKExpressions.g:5274:1: ( ( rule__FunctionCall__FunctionNameAssignment_1 ) )
            {
            // InternalKExpressions.g:5274:1: ( ( rule__FunctionCall__FunctionNameAssignment_1 ) )
            // InternalKExpressions.g:5275:1: ( rule__FunctionCall__FunctionNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFunctionNameAssignment_1()); 
            }
            // InternalKExpressions.g:5276:1: ( rule__FunctionCall__FunctionNameAssignment_1 )
            // InternalKExpressions.g:5276:2: rule__FunctionCall__FunctionNameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCall__FunctionNameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getFunctionNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__1__Impl"


    // $ANTLR start "rule__FunctionCall__Group__2"
    // InternalKExpressions.g:5286:1: rule__FunctionCall__Group__2 : rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 ;
    public final void rule__FunctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5290:1: ( rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 )
            // InternalKExpressions.g:5291:2: rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_33);
            rule__FunctionCall__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCall__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__2"


    // $ANTLR start "rule__FunctionCall__Group__2__Impl"
    // InternalKExpressions.g:5298:1: rule__FunctionCall__Group__2__Impl : ( ( rule__FunctionCall__Alternatives_2 )? ) ;
    public final void rule__FunctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5302:1: ( ( ( rule__FunctionCall__Alternatives_2 )? ) )
            // InternalKExpressions.g:5303:1: ( ( rule__FunctionCall__Alternatives_2 )? )
            {
            // InternalKExpressions.g:5303:1: ( ( rule__FunctionCall__Alternatives_2 )? )
            // InternalKExpressions.g:5304:1: ( rule__FunctionCall__Alternatives_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getAlternatives_2()); 
            }
            // InternalKExpressions.g:5305:1: ( rule__FunctionCall__Alternatives_2 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==28||LA33_0==35) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalKExpressions.g:5305:2: rule__FunctionCall__Alternatives_2
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__FunctionCall__Alternatives_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getAlternatives_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__2__Impl"


    // $ANTLR start "rule__FunctionCall__Group__3"
    // InternalKExpressions.g:5315:1: rule__FunctionCall__Group__3 : rule__FunctionCall__Group__3__Impl ;
    public final void rule__FunctionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5319:1: ( rule__FunctionCall__Group__3__Impl )
            // InternalKExpressions.g:5320:2: rule__FunctionCall__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCall__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__3"


    // $ANTLR start "rule__FunctionCall__Group__3__Impl"
    // InternalKExpressions.g:5326:1: rule__FunctionCall__Group__3__Impl : ( '>' ) ;
    public final void rule__FunctionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5330:1: ( ( '>' ) )
            // InternalKExpressions.g:5331:1: ( '>' )
            {
            // InternalKExpressions.g:5331:1: ( '>' )
            // InternalKExpressions.g:5332:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGreaterThanSignKeyword_3()); 
            }
            match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getGreaterThanSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__3__Impl"


    // $ANTLR start "rule__FunctionCall__Group_2_0__0"
    // InternalKExpressions.g:5353:1: rule__FunctionCall__Group_2_0__0 : rule__FunctionCall__Group_2_0__0__Impl rule__FunctionCall__Group_2_0__1 ;
    public final void rule__FunctionCall__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5357:1: ( rule__FunctionCall__Group_2_0__0__Impl rule__FunctionCall__Group_2_0__1 )
            // InternalKExpressions.g:5358:2: rule__FunctionCall__Group_2_0__0__Impl rule__FunctionCall__Group_2_0__1
            {
            pushFollow(FollowSets000.FOLLOW_34);
            rule__FunctionCall__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCall__Group_2_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_2_0__0"


    // $ANTLR start "rule__FunctionCall__Group_2_0__0__Impl"
    // InternalKExpressions.g:5365:1: rule__FunctionCall__Group_2_0__0__Impl : ( '(' ) ;
    public final void rule__FunctionCall__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5369:1: ( ( '(' ) )
            // InternalKExpressions.g:5370:1: ( '(' )
            {
            // InternalKExpressions.g:5370:1: ( '(' )
            // InternalKExpressions.g:5371:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2_0_0()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_2_0__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group_2_0__1"
    // InternalKExpressions.g:5384:1: rule__FunctionCall__Group_2_0__1 : rule__FunctionCall__Group_2_0__1__Impl rule__FunctionCall__Group_2_0__2 ;
    public final void rule__FunctionCall__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5388:1: ( rule__FunctionCall__Group_2_0__1__Impl rule__FunctionCall__Group_2_0__2 )
            // InternalKExpressions.g:5389:2: rule__FunctionCall__Group_2_0__1__Impl rule__FunctionCall__Group_2_0__2
            {
            pushFollow(FollowSets000.FOLLOW_35);
            rule__FunctionCall__Group_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCall__Group_2_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_2_0__1"


    // $ANTLR start "rule__FunctionCall__Group_2_0__1__Impl"
    // InternalKExpressions.g:5396:1: rule__FunctionCall__Group_2_0__1__Impl : ( ( rule__FunctionCall__ParametersAssignment_2_0_1 ) ) ;
    public final void rule__FunctionCall__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5400:1: ( ( ( rule__FunctionCall__ParametersAssignment_2_0_1 ) ) )
            // InternalKExpressions.g:5401:1: ( ( rule__FunctionCall__ParametersAssignment_2_0_1 ) )
            {
            // InternalKExpressions.g:5401:1: ( ( rule__FunctionCall__ParametersAssignment_2_0_1 ) )
            // InternalKExpressions.g:5402:1: ( rule__FunctionCall__ParametersAssignment_2_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getParametersAssignment_2_0_1()); 
            }
            // InternalKExpressions.g:5403:1: ( rule__FunctionCall__ParametersAssignment_2_0_1 )
            // InternalKExpressions.g:5403:2: rule__FunctionCall__ParametersAssignment_2_0_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCall__ParametersAssignment_2_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getParametersAssignment_2_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_2_0__1__Impl"


    // $ANTLR start "rule__FunctionCall__Group_2_0__2"
    // InternalKExpressions.g:5413:1: rule__FunctionCall__Group_2_0__2 : rule__FunctionCall__Group_2_0__2__Impl rule__FunctionCall__Group_2_0__3 ;
    public final void rule__FunctionCall__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5417:1: ( rule__FunctionCall__Group_2_0__2__Impl rule__FunctionCall__Group_2_0__3 )
            // InternalKExpressions.g:5418:2: rule__FunctionCall__Group_2_0__2__Impl rule__FunctionCall__Group_2_0__3
            {
            pushFollow(FollowSets000.FOLLOW_35);
            rule__FunctionCall__Group_2_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCall__Group_2_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_2_0__2"


    // $ANTLR start "rule__FunctionCall__Group_2_0__2__Impl"
    // InternalKExpressions.g:5425:1: rule__FunctionCall__Group_2_0__2__Impl : ( ( rule__FunctionCall__Group_2_0_2__0 )* ) ;
    public final void rule__FunctionCall__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5429:1: ( ( ( rule__FunctionCall__Group_2_0_2__0 )* ) )
            // InternalKExpressions.g:5430:1: ( ( rule__FunctionCall__Group_2_0_2__0 )* )
            {
            // InternalKExpressions.g:5430:1: ( ( rule__FunctionCall__Group_2_0_2__0 )* )
            // InternalKExpressions.g:5431:1: ( rule__FunctionCall__Group_2_0_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGroup_2_0_2()); 
            }
            // InternalKExpressions.g:5432:1: ( rule__FunctionCall__Group_2_0_2__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==39) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalKExpressions.g:5432:2: rule__FunctionCall__Group_2_0_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_36);
            	    rule__FunctionCall__Group_2_0_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getGroup_2_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_2_0__2__Impl"


    // $ANTLR start "rule__FunctionCall__Group_2_0__3"
    // InternalKExpressions.g:5442:1: rule__FunctionCall__Group_2_0__3 : rule__FunctionCall__Group_2_0__3__Impl ;
    public final void rule__FunctionCall__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5446:1: ( rule__FunctionCall__Group_2_0__3__Impl )
            // InternalKExpressions.g:5447:2: rule__FunctionCall__Group_2_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCall__Group_2_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_2_0__3"


    // $ANTLR start "rule__FunctionCall__Group_2_0__3__Impl"
    // InternalKExpressions.g:5453:1: rule__FunctionCall__Group_2_0__3__Impl : ( ')' ) ;
    public final void rule__FunctionCall__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5457:1: ( ( ')' ) )
            // InternalKExpressions.g:5458:1: ( ')' )
            {
            // InternalKExpressions.g:5458:1: ( ')' )
            // InternalKExpressions.g:5459:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_2_0_3()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_2_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_2_0__3__Impl"


    // $ANTLR start "rule__FunctionCall__Group_2_0_2__0"
    // InternalKExpressions.g:5480:1: rule__FunctionCall__Group_2_0_2__0 : rule__FunctionCall__Group_2_0_2__0__Impl rule__FunctionCall__Group_2_0_2__1 ;
    public final void rule__FunctionCall__Group_2_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5484:1: ( rule__FunctionCall__Group_2_0_2__0__Impl rule__FunctionCall__Group_2_0_2__1 )
            // InternalKExpressions.g:5485:2: rule__FunctionCall__Group_2_0_2__0__Impl rule__FunctionCall__Group_2_0_2__1
            {
            pushFollow(FollowSets000.FOLLOW_34);
            rule__FunctionCall__Group_2_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCall__Group_2_0_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_2_0_2__0"


    // $ANTLR start "rule__FunctionCall__Group_2_0_2__0__Impl"
    // InternalKExpressions.g:5492:1: rule__FunctionCall__Group_2_0_2__0__Impl : ( ',' ) ;
    public final void rule__FunctionCall__Group_2_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5496:1: ( ( ',' ) )
            // InternalKExpressions.g:5497:1: ( ',' )
            {
            // InternalKExpressions.g:5497:1: ( ',' )
            // InternalKExpressions.g:5498:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getCommaKeyword_2_0_2_0()); 
            }
            match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getCommaKeyword_2_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_2_0_2__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group_2_0_2__1"
    // InternalKExpressions.g:5511:1: rule__FunctionCall__Group_2_0_2__1 : rule__FunctionCall__Group_2_0_2__1__Impl ;
    public final void rule__FunctionCall__Group_2_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5515:1: ( rule__FunctionCall__Group_2_0_2__1__Impl )
            // InternalKExpressions.g:5516:2: rule__FunctionCall__Group_2_0_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCall__Group_2_0_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_2_0_2__1"


    // $ANTLR start "rule__FunctionCall__Group_2_0_2__1__Impl"
    // InternalKExpressions.g:5522:1: rule__FunctionCall__Group_2_0_2__1__Impl : ( ( rule__FunctionCall__ParametersAssignment_2_0_2_1 ) ) ;
    public final void rule__FunctionCall__Group_2_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5526:1: ( ( ( rule__FunctionCall__ParametersAssignment_2_0_2_1 ) ) )
            // InternalKExpressions.g:5527:1: ( ( rule__FunctionCall__ParametersAssignment_2_0_2_1 ) )
            {
            // InternalKExpressions.g:5527:1: ( ( rule__FunctionCall__ParametersAssignment_2_0_2_1 ) )
            // InternalKExpressions.g:5528:1: ( rule__FunctionCall__ParametersAssignment_2_0_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getParametersAssignment_2_0_2_1()); 
            }
            // InternalKExpressions.g:5529:1: ( rule__FunctionCall__ParametersAssignment_2_0_2_1 )
            // InternalKExpressions.g:5529:2: rule__FunctionCall__ParametersAssignment_2_0_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCall__ParametersAssignment_2_0_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getParametersAssignment_2_0_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_2_0_2__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalKExpressions.g:5543:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5547:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalKExpressions.g:5548:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_34);
            rule__Parameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Parameter__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalKExpressions.g:5555:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__Group_0__0 )? ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5559:1: ( ( ( rule__Parameter__Group_0__0 )? ) )
            // InternalKExpressions.g:5560:1: ( ( rule__Parameter__Group_0__0 )? )
            {
            // InternalKExpressions.g:5560:1: ( ( rule__Parameter__Group_0__0 )? )
            // InternalKExpressions.g:5561:1: ( rule__Parameter__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getGroup_0()); 
            }
            // InternalKExpressions.g:5562:1: ( rule__Parameter__Group_0__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==19) ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==18) ) {
                    alt35=1;
                }
            }
            else if ( (LA35_0==18) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalKExpressions.g:5562:2: rule__Parameter__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Parameter__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getGroup_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalKExpressions.g:5572:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5576:1: ( rule__Parameter__Group__1__Impl )
            // InternalKExpressions.g:5577:2: rule__Parameter__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Parameter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalKExpressions.g:5583:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__ExpressionAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5587:1: ( ( ( rule__Parameter__ExpressionAssignment_1 ) ) )
            // InternalKExpressions.g:5588:1: ( ( rule__Parameter__ExpressionAssignment_1 ) )
            {
            // InternalKExpressions.g:5588:1: ( ( rule__Parameter__ExpressionAssignment_1 ) )
            // InternalKExpressions.g:5589:1: ( rule__Parameter__ExpressionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getExpressionAssignment_1()); 
            }
            // InternalKExpressions.g:5590:1: ( rule__Parameter__ExpressionAssignment_1 )
            // InternalKExpressions.g:5590:2: rule__Parameter__ExpressionAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Parameter__ExpressionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getExpressionAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group_0__0"
    // InternalKExpressions.g:5604:1: rule__Parameter__Group_0__0 : rule__Parameter__Group_0__0__Impl rule__Parameter__Group_0__1 ;
    public final void rule__Parameter__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5608:1: ( rule__Parameter__Group_0__0__Impl rule__Parameter__Group_0__1 )
            // InternalKExpressions.g:5609:2: rule__Parameter__Group_0__0__Impl rule__Parameter__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_37);
            rule__Parameter__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Parameter__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_0__0"


    // $ANTLR start "rule__Parameter__Group_0__0__Impl"
    // InternalKExpressions.g:5616:1: rule__Parameter__Group_0__0__Impl : ( ( rule__Parameter__PureOutputAssignment_0_0 )? ) ;
    public final void rule__Parameter__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5620:1: ( ( ( rule__Parameter__PureOutputAssignment_0_0 )? ) )
            // InternalKExpressions.g:5621:1: ( ( rule__Parameter__PureOutputAssignment_0_0 )? )
            {
            // InternalKExpressions.g:5621:1: ( ( rule__Parameter__PureOutputAssignment_0_0 )? )
            // InternalKExpressions.g:5622:1: ( rule__Parameter__PureOutputAssignment_0_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getPureOutputAssignment_0_0()); 
            }
            // InternalKExpressions.g:5623:1: ( rule__Parameter__PureOutputAssignment_0_0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==19) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalKExpressions.g:5623:2: rule__Parameter__PureOutputAssignment_0_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Parameter__PureOutputAssignment_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getPureOutputAssignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_0__0__Impl"


    // $ANTLR start "rule__Parameter__Group_0__1"
    // InternalKExpressions.g:5633:1: rule__Parameter__Group_0__1 : rule__Parameter__Group_0__1__Impl ;
    public final void rule__Parameter__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5637:1: ( rule__Parameter__Group_0__1__Impl )
            // InternalKExpressions.g:5638:2: rule__Parameter__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Parameter__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_0__1"


    // $ANTLR start "rule__Parameter__Group_0__1__Impl"
    // InternalKExpressions.g:5644:1: rule__Parameter__Group_0__1__Impl : ( ( rule__Parameter__CallByReferenceAssignment_0_1 ) ) ;
    public final void rule__Parameter__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5648:1: ( ( ( rule__Parameter__CallByReferenceAssignment_0_1 ) ) )
            // InternalKExpressions.g:5649:1: ( ( rule__Parameter__CallByReferenceAssignment_0_1 ) )
            {
            // InternalKExpressions.g:5649:1: ( ( rule__Parameter__CallByReferenceAssignment_0_1 ) )
            // InternalKExpressions.g:5650:1: ( rule__Parameter__CallByReferenceAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getCallByReferenceAssignment_0_1()); 
            }
            // InternalKExpressions.g:5651:1: ( rule__Parameter__CallByReferenceAssignment_0_1 )
            // InternalKExpressions.g:5651:2: rule__Parameter__CallByReferenceAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Parameter__CallByReferenceAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getCallByReferenceAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_0__1__Impl"


    // $ANTLR start "rule__TagAnnotation__Group__0"
    // InternalKExpressions.g:5665:1: rule__TagAnnotation__Group__0 : rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 ;
    public final void rule__TagAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5669:1: ( rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 )
            // InternalKExpressions.g:5670:2: rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__TagAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TagAnnotation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagAnnotation__Group__0"


    // $ANTLR start "rule__TagAnnotation__Group__0__Impl"
    // InternalKExpressions.g:5677:1: rule__TagAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TagAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5681:1: ( ( '@' ) )
            // InternalKExpressions.g:5682:1: ( '@' )
            {
            // InternalKExpressions.g:5682:1: ( '@' )
            // InternalKExpressions.g:5683:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagAnnotation__Group__0__Impl"


    // $ANTLR start "rule__TagAnnotation__Group__1"
    // InternalKExpressions.g:5696:1: rule__TagAnnotation__Group__1 : rule__TagAnnotation__Group__1__Impl ;
    public final void rule__TagAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5700:1: ( rule__TagAnnotation__Group__1__Impl )
            // InternalKExpressions.g:5701:2: rule__TagAnnotation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TagAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagAnnotation__Group__1"


    // $ANTLR start "rule__TagAnnotation__Group__1__Impl"
    // InternalKExpressions.g:5707:1: rule__TagAnnotation__Group__1__Impl : ( ( rule__TagAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TagAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5711:1: ( ( ( rule__TagAnnotation__NameAssignment_1 ) ) )
            // InternalKExpressions.g:5712:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:5712:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            // InternalKExpressions.g:5713:1: ( rule__TagAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:5714:1: ( rule__TagAnnotation__NameAssignment_1 )
            // InternalKExpressions.g:5714:2: rule__TagAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TagAnnotation__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagAnnotationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagAnnotation__Group__1__Impl"


    // $ANTLR start "rule__KeyStringValueAnnotation__Group__0"
    // InternalKExpressions.g:5728:1: rule__KeyStringValueAnnotation__Group__0 : rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 ;
    public final void rule__KeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5732:1: ( rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 )
            // InternalKExpressions.g:5733:2: rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__KeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__KeyStringValueAnnotation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringValueAnnotation__Group__0"


    // $ANTLR start "rule__KeyStringValueAnnotation__Group__0__Impl"
    // InternalKExpressions.g:5740:1: rule__KeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5744:1: ( ( '@' ) )
            // InternalKExpressions.g:5745:1: ( '@' )
            {
            // InternalKExpressions.g:5745:1: ( '@' )
            // InternalKExpressions.g:5746:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringValueAnnotation__Group__0__Impl"


    // $ANTLR start "rule__KeyStringValueAnnotation__Group__1"
    // InternalKExpressions.g:5759:1: rule__KeyStringValueAnnotation__Group__1 : rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 ;
    public final void rule__KeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5763:1: ( rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 )
            // InternalKExpressions.g:5764:2: rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_38);
            rule__KeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__KeyStringValueAnnotation__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringValueAnnotation__Group__1"


    // $ANTLR start "rule__KeyStringValueAnnotation__Group__1__Impl"
    // InternalKExpressions.g:5771:1: rule__KeyStringValueAnnotation__Group__1__Impl : ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5775:1: ( ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKExpressions.g:5776:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:5776:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKExpressions.g:5777:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:5778:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            // InternalKExpressions.g:5778:2: rule__KeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__KeyStringValueAnnotation__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringValueAnnotation__Group__1__Impl"


    // $ANTLR start "rule__KeyStringValueAnnotation__Group__2"
    // InternalKExpressions.g:5788:1: rule__KeyStringValueAnnotation__Group__2 : rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 ;
    public final void rule__KeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5792:1: ( rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 )
            // InternalKExpressions.g:5793:2: rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__KeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__KeyStringValueAnnotation__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringValueAnnotation__Group__2"


    // $ANTLR start "rule__KeyStringValueAnnotation__Group__2__Impl"
    // InternalKExpressions.g:5800:1: rule__KeyStringValueAnnotation__Group__2__Impl : ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5804:1: ( ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalKExpressions.g:5805:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalKExpressions.g:5805:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalKExpressions.g:5806:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            }
            // InternalKExpressions.g:5807:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalKExpressions.g:5807:2: rule__KeyStringValueAnnotation__ValuesAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__KeyStringValueAnnotation__ValuesAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringValueAnnotation__Group__2__Impl"


    // $ANTLR start "rule__KeyStringValueAnnotation__Group__3"
    // InternalKExpressions.g:5817:1: rule__KeyStringValueAnnotation__Group__3 : rule__KeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__KeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5821:1: ( rule__KeyStringValueAnnotation__Group__3__Impl )
            // InternalKExpressions.g:5822:2: rule__KeyStringValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__KeyStringValueAnnotation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringValueAnnotation__Group__3"


    // $ANTLR start "rule__KeyStringValueAnnotation__Group__3__Impl"
    // InternalKExpressions.g:5828:1: rule__KeyStringValueAnnotation__Group__3__Impl : ( ( rule__KeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__KeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5832:1: ( ( ( rule__KeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalKExpressions.g:5833:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalKExpressions.g:5833:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )* )
            // InternalKExpressions.g:5834:1: ( rule__KeyStringValueAnnotation__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // InternalKExpressions.g:5835:1: ( rule__KeyStringValueAnnotation__Group_3__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==39) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalKExpressions.g:5835:2: rule__KeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_36);
            	    rule__KeyStringValueAnnotation__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringValueAnnotation__Group__3__Impl"


    // $ANTLR start "rule__KeyStringValueAnnotation__Group_3__0"
    // InternalKExpressions.g:5853:1: rule__KeyStringValueAnnotation__Group_3__0 : rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 ;
    public final void rule__KeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5857:1: ( rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 )
            // InternalKExpressions.g:5858:2: rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_38);
            rule__KeyStringValueAnnotation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__KeyStringValueAnnotation__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringValueAnnotation__Group_3__0"


    // $ANTLR start "rule__KeyStringValueAnnotation__Group_3__0__Impl"
    // InternalKExpressions.g:5865:1: rule__KeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5869:1: ( ( ',' ) )
            // InternalKExpressions.g:5870:1: ( ',' )
            {
            // InternalKExpressions.g:5870:1: ( ',' )
            // InternalKExpressions.g:5871:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            }
            match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringValueAnnotation__Group_3__0__Impl"


    // $ANTLR start "rule__KeyStringValueAnnotation__Group_3__1"
    // InternalKExpressions.g:5884:1: rule__KeyStringValueAnnotation__Group_3__1 : rule__KeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__KeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5888:1: ( rule__KeyStringValueAnnotation__Group_3__1__Impl )
            // InternalKExpressions.g:5889:2: rule__KeyStringValueAnnotation__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__KeyStringValueAnnotation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringValueAnnotation__Group_3__1"


    // $ANTLR start "rule__KeyStringValueAnnotation__Group_3__1__Impl"
    // InternalKExpressions.g:5895:1: rule__KeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5899:1: ( ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalKExpressions.g:5900:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalKExpressions.g:5900:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalKExpressions.g:5901:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            }
            // InternalKExpressions.g:5902:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalKExpressions.g:5902:2: rule__KeyStringValueAnnotation__ValuesAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__KeyStringValueAnnotation__ValuesAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringValueAnnotation__Group_3__1__Impl"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group__0"
    // InternalKExpressions.g:5916:1: rule__TypedKeyStringValueAnnotation__Group__0 : rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5920:1: ( rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 )
            // InternalKExpressions.g:5921:2: rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__TypedKeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypedKeyStringValueAnnotation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__Group__0"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group__0__Impl"
    // InternalKExpressions.g:5928:1: rule__TypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5932:1: ( ( '@' ) )
            // InternalKExpressions.g:5933:1: ( '@' )
            {
            // InternalKExpressions.g:5933:1: ( '@' )
            // InternalKExpressions.g:5934:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__Group__0__Impl"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group__1"
    // InternalKExpressions.g:5947:1: rule__TypedKeyStringValueAnnotation__Group__1 : rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5951:1: ( rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 )
            // InternalKExpressions.g:5952:2: rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__TypedKeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypedKeyStringValueAnnotation__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__Group__1"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group__1__Impl"
    // InternalKExpressions.g:5959:1: rule__TypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5963:1: ( ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKExpressions.g:5964:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:5964:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKExpressions.g:5965:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:5966:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKExpressions.g:5966:2: rule__TypedKeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypedKeyStringValueAnnotation__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__Group__1__Impl"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group__2"
    // InternalKExpressions.g:5976:1: rule__TypedKeyStringValueAnnotation__Group__2 : rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5980:1: ( rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 )
            // InternalKExpressions.g:5981:2: rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__TypedKeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypedKeyStringValueAnnotation__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__Group__2"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group__2__Impl"
    // InternalKExpressions.g:5988:1: rule__TypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5992:1: ( ( '[' ) )
            // InternalKExpressions.g:5993:1: ( '[' )
            {
            // InternalKExpressions.g:5993:1: ( '[' )
            // InternalKExpressions.g:5994:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__Group__2__Impl"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group__3"
    // InternalKExpressions.g:6007:1: rule__TypedKeyStringValueAnnotation__Group__3 : rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6011:1: ( rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 )
            // InternalKExpressions.g:6012:2: rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__TypedKeyStringValueAnnotation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypedKeyStringValueAnnotation__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__Group__3"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group__3__Impl"
    // InternalKExpressions.g:6019:1: rule__TypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6023:1: ( ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalKExpressions.g:6024:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalKExpressions.g:6024:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalKExpressions.g:6025:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // InternalKExpressions.g:6026:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalKExpressions.g:6026:2: rule__TypedKeyStringValueAnnotation__TypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypedKeyStringValueAnnotation__TypeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__Group__3__Impl"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group__4"
    // InternalKExpressions.g:6036:1: rule__TypedKeyStringValueAnnotation__Group__4 : rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6040:1: ( rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 )
            // InternalKExpressions.g:6041:2: rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_40);
            rule__TypedKeyStringValueAnnotation__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypedKeyStringValueAnnotation__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__Group__4"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group__4__Impl"
    // InternalKExpressions.g:6048:1: rule__TypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6052:1: ( ( ']' ) )
            // InternalKExpressions.g:6053:1: ( ']' )
            {
            // InternalKExpressions.g:6053:1: ( ']' )
            // InternalKExpressions.g:6054:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__Group__4__Impl"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group__5"
    // InternalKExpressions.g:6067:1: rule__TypedKeyStringValueAnnotation__Group__5 : rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6071:1: ( rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 )
            // InternalKExpressions.g:6072:2: rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__TypedKeyStringValueAnnotation__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypedKeyStringValueAnnotation__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__Group__5"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group__5__Impl"
    // InternalKExpressions.g:6079:1: rule__TypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6083:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalKExpressions.g:6084:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalKExpressions.g:6084:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalKExpressions.g:6085:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            }
            // InternalKExpressions.g:6086:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalKExpressions.g:6086:2: rule__TypedKeyStringValueAnnotation__ValuesAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypedKeyStringValueAnnotation__ValuesAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__Group__5__Impl"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group__6"
    // InternalKExpressions.g:6096:1: rule__TypedKeyStringValueAnnotation__Group__6 : rule__TypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6100:1: ( rule__TypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalKExpressions.g:6101:2: rule__TypedKeyStringValueAnnotation__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypedKeyStringValueAnnotation__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__Group__6"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group__6__Impl"
    // InternalKExpressions.g:6107:1: rule__TypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6111:1: ( ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalKExpressions.g:6112:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalKExpressions.g:6112:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalKExpressions.g:6113:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // InternalKExpressions.g:6114:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==39) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalKExpressions.g:6114:2: rule__TypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_36);
            	    rule__TypedKeyStringValueAnnotation__Group_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__Group__6__Impl"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group_6__0"
    // InternalKExpressions.g:6138:1: rule__TypedKeyStringValueAnnotation__Group_6__0 : rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6142:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 )
            // InternalKExpressions.g:6143:2: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_40);
            rule__TypedKeyStringValueAnnotation__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypedKeyStringValueAnnotation__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__Group_6__0"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group_6__0__Impl"
    // InternalKExpressions.g:6150:1: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6154:1: ( ( ',' ) )
            // InternalKExpressions.g:6155:1: ( ',' )
            {
            // InternalKExpressions.g:6155:1: ( ',' )
            // InternalKExpressions.g:6156:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            }
            match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__Group_6__0__Impl"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group_6__1"
    // InternalKExpressions.g:6169:1: rule__TypedKeyStringValueAnnotation__Group_6__1 : rule__TypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6173:1: ( rule__TypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalKExpressions.g:6174:2: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypedKeyStringValueAnnotation__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__Group_6__1"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group_6__1__Impl"
    // InternalKExpressions.g:6180:1: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6184:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalKExpressions.g:6185:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalKExpressions.g:6185:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalKExpressions.g:6186:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            }
            // InternalKExpressions.g:6187:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalKExpressions.g:6187:2: rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__Group_6__1__Impl"


    // $ANTLR start "rule__QuotedKeyStringValueAnnotation__Group__0"
    // InternalKExpressions.g:6201:1: rule__QuotedKeyStringValueAnnotation__Group__0 : rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6205:1: ( rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1 )
            // InternalKExpressions.g:6206:2: rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__QuotedKeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedKeyStringValueAnnotation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedKeyStringValueAnnotation__Group__0"


    // $ANTLR start "rule__QuotedKeyStringValueAnnotation__Group__0__Impl"
    // InternalKExpressions.g:6213:1: rule__QuotedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6217:1: ( ( '@' ) )
            // InternalKExpressions.g:6218:1: ( '@' )
            {
            // InternalKExpressions.g:6218:1: ( '@' )
            // InternalKExpressions.g:6219:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedKeyStringValueAnnotation__Group__0__Impl"


    // $ANTLR start "rule__QuotedKeyStringValueAnnotation__Group__1"
    // InternalKExpressions.g:6232:1: rule__QuotedKeyStringValueAnnotation__Group__1 : rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6236:1: ( rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2 )
            // InternalKExpressions.g:6237:2: rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_41);
            rule__QuotedKeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedKeyStringValueAnnotation__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedKeyStringValueAnnotation__Group__1"


    // $ANTLR start "rule__QuotedKeyStringValueAnnotation__Group__1__Impl"
    // InternalKExpressions.g:6244:1: rule__QuotedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6248:1: ( ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKExpressions.g:6249:1: ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:6249:1: ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKExpressions.g:6250:1: ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:6251:1: ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKExpressions.g:6251:2: rule__QuotedKeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedKeyStringValueAnnotation__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedKeyStringValueAnnotation__Group__1__Impl"


    // $ANTLR start "rule__QuotedKeyStringValueAnnotation__Group__2"
    // InternalKExpressions.g:6261:1: rule__QuotedKeyStringValueAnnotation__Group__2 : rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6265:1: ( rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3 )
            // InternalKExpressions.g:6266:2: rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__QuotedKeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedKeyStringValueAnnotation__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedKeyStringValueAnnotation__Group__2"


    // $ANTLR start "rule__QuotedKeyStringValueAnnotation__Group__2__Impl"
    // InternalKExpressions.g:6273:1: rule__QuotedKeyStringValueAnnotation__Group__2__Impl : ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6277:1: ( ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalKExpressions.g:6278:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalKExpressions.g:6278:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalKExpressions.g:6279:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            }
            // InternalKExpressions.g:6280:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalKExpressions.g:6280:2: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedKeyStringValueAnnotation__Group__2__Impl"


    // $ANTLR start "rule__QuotedKeyStringValueAnnotation__Group__3"
    // InternalKExpressions.g:6290:1: rule__QuotedKeyStringValueAnnotation__Group__3 : rule__QuotedKeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6294:1: ( rule__QuotedKeyStringValueAnnotation__Group__3__Impl )
            // InternalKExpressions.g:6295:2: rule__QuotedKeyStringValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedKeyStringValueAnnotation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedKeyStringValueAnnotation__Group__3"


    // $ANTLR start "rule__QuotedKeyStringValueAnnotation__Group__3__Impl"
    // InternalKExpressions.g:6301:1: rule__QuotedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6305:1: ( ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalKExpressions.g:6306:1: ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalKExpressions.g:6306:1: ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* )
            // InternalKExpressions.g:6307:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // InternalKExpressions.g:6308:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==39) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalKExpressions.g:6308:2: rule__QuotedKeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_36);
            	    rule__QuotedKeyStringValueAnnotation__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedKeyStringValueAnnotation__Group__3__Impl"


    // $ANTLR start "rule__QuotedKeyStringValueAnnotation__Group_3__0"
    // InternalKExpressions.g:6326:1: rule__QuotedKeyStringValueAnnotation__Group_3__0 : rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6330:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1 )
            // InternalKExpressions.g:6331:2: rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_41);
            rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedKeyStringValueAnnotation__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedKeyStringValueAnnotation__Group_3__0"


    // $ANTLR start "rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl"
    // InternalKExpressions.g:6338:1: rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6342:1: ( ( ',' ) )
            // InternalKExpressions.g:6343:1: ( ',' )
            {
            // InternalKExpressions.g:6343:1: ( ',' )
            // InternalKExpressions.g:6344:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            }
            match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl"


    // $ANTLR start "rule__QuotedKeyStringValueAnnotation__Group_3__1"
    // InternalKExpressions.g:6357:1: rule__QuotedKeyStringValueAnnotation__Group_3__1 : rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6361:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl )
            // InternalKExpressions.g:6362:2: rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedKeyStringValueAnnotation__Group_3__1"


    // $ANTLR start "rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl"
    // InternalKExpressions.g:6368:1: rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6372:1: ( ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalKExpressions.g:6373:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalKExpressions.g:6373:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalKExpressions.g:6374:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            }
            // InternalKExpressions.g:6375:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalKExpressions.g:6375:2: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl"


    // $ANTLR start "rule__QuotedTypedKeyStringValueAnnotation__Group__0"
    // InternalKExpressions.g:6389:1: rule__QuotedTypedKeyStringValueAnnotation__Group__0 : rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6393:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1 )
            // InternalKExpressions.g:6394:2: rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedTypedKeyStringValueAnnotation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedTypedKeyStringValueAnnotation__Group__0"


    // $ANTLR start "rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl"
    // InternalKExpressions.g:6401:1: rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6405:1: ( ( '@' ) )
            // InternalKExpressions.g:6406:1: ( '@' )
            {
            // InternalKExpressions.g:6406:1: ( '@' )
            // InternalKExpressions.g:6407:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl"


    // $ANTLR start "rule__QuotedTypedKeyStringValueAnnotation__Group__1"
    // InternalKExpressions.g:6420:1: rule__QuotedTypedKeyStringValueAnnotation__Group__1 : rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6424:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2 )
            // InternalKExpressions.g:6425:2: rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedTypedKeyStringValueAnnotation__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedTypedKeyStringValueAnnotation__Group__1"


    // $ANTLR start "rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl"
    // InternalKExpressions.g:6432:1: rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6436:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKExpressions.g:6437:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:6437:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKExpressions.g:6438:1: ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:6439:1: ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKExpressions.g:6439:2: rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl"


    // $ANTLR start "rule__QuotedTypedKeyStringValueAnnotation__Group__2"
    // InternalKExpressions.g:6449:1: rule__QuotedTypedKeyStringValueAnnotation__Group__2 : rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6453:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3 )
            // InternalKExpressions.g:6454:2: rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedTypedKeyStringValueAnnotation__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedTypedKeyStringValueAnnotation__Group__2"


    // $ANTLR start "rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl"
    // InternalKExpressions.g:6461:1: rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6465:1: ( ( '[' ) )
            // InternalKExpressions.g:6466:1: ( '[' )
            {
            // InternalKExpressions.g:6466:1: ( '[' )
            // InternalKExpressions.g:6467:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl"


    // $ANTLR start "rule__QuotedTypedKeyStringValueAnnotation__Group__3"
    // InternalKExpressions.g:6480:1: rule__QuotedTypedKeyStringValueAnnotation__Group__3 : rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6484:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4 )
            // InternalKExpressions.g:6485:2: rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedTypedKeyStringValueAnnotation__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedTypedKeyStringValueAnnotation__Group__3"


    // $ANTLR start "rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl"
    // InternalKExpressions.g:6492:1: rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6496:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalKExpressions.g:6497:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalKExpressions.g:6497:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalKExpressions.g:6498:1: ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // InternalKExpressions.g:6499:1: ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalKExpressions.g:6499:2: rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl"


    // $ANTLR start "rule__QuotedTypedKeyStringValueAnnotation__Group__4"
    // InternalKExpressions.g:6509:1: rule__QuotedTypedKeyStringValueAnnotation__Group__4 : rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6513:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5 )
            // InternalKExpressions.g:6514:2: rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_41);
            rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedTypedKeyStringValueAnnotation__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedTypedKeyStringValueAnnotation__Group__4"


    // $ANTLR start "rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl"
    // InternalKExpressions.g:6521:1: rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6525:1: ( ( ']' ) )
            // InternalKExpressions.g:6526:1: ( ']' )
            {
            // InternalKExpressions.g:6526:1: ( ']' )
            // InternalKExpressions.g:6527:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl"


    // $ANTLR start "rule__QuotedTypedKeyStringValueAnnotation__Group__5"
    // InternalKExpressions.g:6540:1: rule__QuotedTypedKeyStringValueAnnotation__Group__5 : rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6544:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6 )
            // InternalKExpressions.g:6545:2: rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedTypedKeyStringValueAnnotation__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedTypedKeyStringValueAnnotation__Group__5"


    // $ANTLR start "rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl"
    // InternalKExpressions.g:6552:1: rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6556:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalKExpressions.g:6557:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalKExpressions.g:6557:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalKExpressions.g:6558:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            }
            // InternalKExpressions.g:6559:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalKExpressions.g:6559:2: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl"


    // $ANTLR start "rule__QuotedTypedKeyStringValueAnnotation__Group__6"
    // InternalKExpressions.g:6569:1: rule__QuotedTypedKeyStringValueAnnotation__Group__6 : rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6573:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalKExpressions.g:6574:2: rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedTypedKeyStringValueAnnotation__Group__6"


    // $ANTLR start "rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl"
    // InternalKExpressions.g:6580:1: rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6584:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalKExpressions.g:6585:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalKExpressions.g:6585:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalKExpressions.g:6586:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // InternalKExpressions.g:6587:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==39) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalKExpressions.g:6587:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_36);
            	    rule__QuotedTypedKeyStringValueAnnotation__Group_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl"


    // $ANTLR start "rule__QuotedTypedKeyStringValueAnnotation__Group_6__0"
    // InternalKExpressions.g:6611:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 : rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6615:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 )
            // InternalKExpressions.g:6616:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_41);
            rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedTypedKeyStringValueAnnotation__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedTypedKeyStringValueAnnotation__Group_6__0"


    // $ANTLR start "rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl"
    // InternalKExpressions.g:6623:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6627:1: ( ( ',' ) )
            // InternalKExpressions.g:6628:1: ( ',' )
            {
            // InternalKExpressions.g:6628:1: ( ',' )
            // InternalKExpressions.g:6629:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            }
            match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl"


    // $ANTLR start "rule__QuotedTypedKeyStringValueAnnotation__Group_6__1"
    // InternalKExpressions.g:6642:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 : rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6646:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalKExpressions.g:6647:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedTypedKeyStringValueAnnotation__Group_6__1"


    // $ANTLR start "rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl"
    // InternalKExpressions.g:6653:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6657:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalKExpressions.g:6658:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalKExpressions.g:6658:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalKExpressions.g:6659:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            }
            // InternalKExpressions.g:6660:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalKExpressions.g:6660:2: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__Group__0"
    // InternalKExpressions.g:6674:1: rule__KeyBooleanValueAnnotation__Group__0 : rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1 ;
    public final void rule__KeyBooleanValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6678:1: ( rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1 )
            // InternalKExpressions.g:6679:2: rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__KeyBooleanValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__KeyBooleanValueAnnotation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyBooleanValueAnnotation__Group__0"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__Group__0__Impl"
    // InternalKExpressions.g:6686:1: rule__KeyBooleanValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6690:1: ( ( '@' ) )
            // InternalKExpressions.g:6691:1: ( '@' )
            {
            // InternalKExpressions.g:6691:1: ( '@' )
            // InternalKExpressions.g:6692:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyBooleanValueAnnotation__Group__0__Impl"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__Group__1"
    // InternalKExpressions.g:6705:1: rule__KeyBooleanValueAnnotation__Group__1 : rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2 ;
    public final void rule__KeyBooleanValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6709:1: ( rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2 )
            // InternalKExpressions.g:6710:2: rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_42);
            rule__KeyBooleanValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__KeyBooleanValueAnnotation__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyBooleanValueAnnotation__Group__1"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__Group__1__Impl"
    // InternalKExpressions.g:6717:1: rule__KeyBooleanValueAnnotation__Group__1__Impl : ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6721:1: ( ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) ) )
            // InternalKExpressions.g:6722:1: ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:6722:1: ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) )
            // InternalKExpressions.g:6723:1: ( rule__KeyBooleanValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:6724:1: ( rule__KeyBooleanValueAnnotation__NameAssignment_1 )
            // InternalKExpressions.g:6724:2: rule__KeyBooleanValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__KeyBooleanValueAnnotation__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyBooleanValueAnnotation__Group__1__Impl"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__Group__2"
    // InternalKExpressions.g:6734:1: rule__KeyBooleanValueAnnotation__Group__2 : rule__KeyBooleanValueAnnotation__Group__2__Impl ;
    public final void rule__KeyBooleanValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6738:1: ( rule__KeyBooleanValueAnnotation__Group__2__Impl )
            // InternalKExpressions.g:6739:2: rule__KeyBooleanValueAnnotation__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__KeyBooleanValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyBooleanValueAnnotation__Group__2"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__Group__2__Impl"
    // InternalKExpressions.g:6745:1: rule__KeyBooleanValueAnnotation__Group__2__Impl : ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6749:1: ( ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) ) )
            // InternalKExpressions.g:6750:1: ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) )
            {
            // InternalKExpressions.g:6750:1: ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) )
            // InternalKExpressions.g:6751:1: ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getValueAssignment_2()); 
            }
            // InternalKExpressions.g:6752:1: ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 )
            // InternalKExpressions.g:6752:2: rule__KeyBooleanValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__KeyBooleanValueAnnotation__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyBooleanValueAnnotationAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyBooleanValueAnnotation__Group__2__Impl"


    // $ANTLR start "rule__KeyIntValueAnnotation__Group__0"
    // InternalKExpressions.g:6768:1: rule__KeyIntValueAnnotation__Group__0 : rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1 ;
    public final void rule__KeyIntValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6772:1: ( rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1 )
            // InternalKExpressions.g:6773:2: rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__KeyIntValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__KeyIntValueAnnotation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyIntValueAnnotation__Group__0"


    // $ANTLR start "rule__KeyIntValueAnnotation__Group__0__Impl"
    // InternalKExpressions.g:6780:1: rule__KeyIntValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyIntValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6784:1: ( ( '@' ) )
            // InternalKExpressions.g:6785:1: ( '@' )
            {
            // InternalKExpressions.g:6785:1: ( '@' )
            // InternalKExpressions.g:6786:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyIntValueAnnotation__Group__0__Impl"


    // $ANTLR start "rule__KeyIntValueAnnotation__Group__1"
    // InternalKExpressions.g:6799:1: rule__KeyIntValueAnnotation__Group__1 : rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2 ;
    public final void rule__KeyIntValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6803:1: ( rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2 )
            // InternalKExpressions.g:6804:2: rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_43);
            rule__KeyIntValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__KeyIntValueAnnotation__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyIntValueAnnotation__Group__1"


    // $ANTLR start "rule__KeyIntValueAnnotation__Group__1__Impl"
    // InternalKExpressions.g:6811:1: rule__KeyIntValueAnnotation__Group__1__Impl : ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyIntValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6815:1: ( ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) ) )
            // InternalKExpressions.g:6816:1: ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:6816:1: ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) )
            // InternalKExpressions.g:6817:1: ( rule__KeyIntValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:6818:1: ( rule__KeyIntValueAnnotation__NameAssignment_1 )
            // InternalKExpressions.g:6818:2: rule__KeyIntValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__KeyIntValueAnnotation__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyIntValueAnnotation__Group__1__Impl"


    // $ANTLR start "rule__KeyIntValueAnnotation__Group__2"
    // InternalKExpressions.g:6828:1: rule__KeyIntValueAnnotation__Group__2 : rule__KeyIntValueAnnotation__Group__2__Impl ;
    public final void rule__KeyIntValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6832:1: ( rule__KeyIntValueAnnotation__Group__2__Impl )
            // InternalKExpressions.g:6833:2: rule__KeyIntValueAnnotation__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__KeyIntValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyIntValueAnnotation__Group__2"


    // $ANTLR start "rule__KeyIntValueAnnotation__Group__2__Impl"
    // InternalKExpressions.g:6839:1: rule__KeyIntValueAnnotation__Group__2__Impl : ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyIntValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6843:1: ( ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) ) )
            // InternalKExpressions.g:6844:1: ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) )
            {
            // InternalKExpressions.g:6844:1: ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) )
            // InternalKExpressions.g:6845:1: ( rule__KeyIntValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getValueAssignment_2()); 
            }
            // InternalKExpressions.g:6846:1: ( rule__KeyIntValueAnnotation__ValueAssignment_2 )
            // InternalKExpressions.g:6846:2: rule__KeyIntValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__KeyIntValueAnnotation__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyIntValueAnnotation__Group__2__Impl"


    // $ANTLR start "rule__KeyFloatValueAnnotation__Group__0"
    // InternalKExpressions.g:6862:1: rule__KeyFloatValueAnnotation__Group__0 : rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1 ;
    public final void rule__KeyFloatValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6866:1: ( rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1 )
            // InternalKExpressions.g:6867:2: rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__KeyFloatValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__KeyFloatValueAnnotation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyFloatValueAnnotation__Group__0"


    // $ANTLR start "rule__KeyFloatValueAnnotation__Group__0__Impl"
    // InternalKExpressions.g:6874:1: rule__KeyFloatValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyFloatValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6878:1: ( ( '@' ) )
            // InternalKExpressions.g:6879:1: ( '@' )
            {
            // InternalKExpressions.g:6879:1: ( '@' )
            // InternalKExpressions.g:6880:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyFloatValueAnnotation__Group__0__Impl"


    // $ANTLR start "rule__KeyFloatValueAnnotation__Group__1"
    // InternalKExpressions.g:6893:1: rule__KeyFloatValueAnnotation__Group__1 : rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2 ;
    public final void rule__KeyFloatValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6897:1: ( rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2 )
            // InternalKExpressions.g:6898:2: rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_44);
            rule__KeyFloatValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__KeyFloatValueAnnotation__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyFloatValueAnnotation__Group__1"


    // $ANTLR start "rule__KeyFloatValueAnnotation__Group__1__Impl"
    // InternalKExpressions.g:6905:1: rule__KeyFloatValueAnnotation__Group__1__Impl : ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyFloatValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6909:1: ( ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) ) )
            // InternalKExpressions.g:6910:1: ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:6910:1: ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) )
            // InternalKExpressions.g:6911:1: ( rule__KeyFloatValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:6912:1: ( rule__KeyFloatValueAnnotation__NameAssignment_1 )
            // InternalKExpressions.g:6912:2: rule__KeyFloatValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__KeyFloatValueAnnotation__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyFloatValueAnnotation__Group__1__Impl"


    // $ANTLR start "rule__KeyFloatValueAnnotation__Group__2"
    // InternalKExpressions.g:6922:1: rule__KeyFloatValueAnnotation__Group__2 : rule__KeyFloatValueAnnotation__Group__2__Impl ;
    public final void rule__KeyFloatValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6926:1: ( rule__KeyFloatValueAnnotation__Group__2__Impl )
            // InternalKExpressions.g:6927:2: rule__KeyFloatValueAnnotation__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__KeyFloatValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyFloatValueAnnotation__Group__2"


    // $ANTLR start "rule__KeyFloatValueAnnotation__Group__2__Impl"
    // InternalKExpressions.g:6933:1: rule__KeyFloatValueAnnotation__Group__2__Impl : ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyFloatValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6937:1: ( ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) ) )
            // InternalKExpressions.g:6938:1: ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) )
            {
            // InternalKExpressions.g:6938:1: ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) )
            // InternalKExpressions.g:6939:1: ( rule__KeyFloatValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getValueAssignment_2()); 
            }
            // InternalKExpressions.g:6940:1: ( rule__KeyFloatValueAnnotation__ValueAssignment_2 )
            // InternalKExpressions.g:6940:2: rule__KeyFloatValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__KeyFloatValueAnnotation__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyFloatValueAnnotation__Group__2__Impl"


    // $ANTLR start "rule__ExtendedID__Group__0"
    // InternalKExpressions.g:6956:1: rule__ExtendedID__Group__0 : rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 ;
    public final void rule__ExtendedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6960:1: ( rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 )
            // InternalKExpressions.g:6961:2: rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_45);
            rule__ExtendedID__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExtendedID__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedID__Group__0"


    // $ANTLR start "rule__ExtendedID__Group__0__Impl"
    // InternalKExpressions.g:6968:1: rule__ExtendedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6972:1: ( ( RULE_ID ) )
            // InternalKExpressions.g:6973:1: ( RULE_ID )
            {
            // InternalKExpressions.g:6973:1: ( RULE_ID )
            // InternalKExpressions.g:6974:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedID__Group__0__Impl"


    // $ANTLR start "rule__ExtendedID__Group__1"
    // InternalKExpressions.g:6985:1: rule__ExtendedID__Group__1 : rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2 ;
    public final void rule__ExtendedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6989:1: ( rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2 )
            // InternalKExpressions.g:6990:2: rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_45);
            rule__ExtendedID__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExtendedID__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedID__Group__1"


    // $ANTLR start "rule__ExtendedID__Group__1__Impl"
    // InternalKExpressions.g:6997:1: rule__ExtendedID__Group__1__Impl : ( ( rule__ExtendedID__Group_1__0 )* ) ;
    public final void rule__ExtendedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7001:1: ( ( ( rule__ExtendedID__Group_1__0 )* ) )
            // InternalKExpressions.g:7002:1: ( ( rule__ExtendedID__Group_1__0 )* )
            {
            // InternalKExpressions.g:7002:1: ( ( rule__ExtendedID__Group_1__0 )* )
            // InternalKExpressions.g:7003:1: ( rule__ExtendedID__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:7004:1: ( rule__ExtendedID__Group_1__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==41) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalKExpressions.g:7004:2: rule__ExtendedID__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_46);
            	    rule__ExtendedID__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendedIDAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedID__Group__1__Impl"


    // $ANTLR start "rule__ExtendedID__Group__2"
    // InternalKExpressions.g:7014:1: rule__ExtendedID__Group__2 : rule__ExtendedID__Group__2__Impl ;
    public final void rule__ExtendedID__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7018:1: ( rule__ExtendedID__Group__2__Impl )
            // InternalKExpressions.g:7019:2: rule__ExtendedID__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExtendedID__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedID__Group__2"


    // $ANTLR start "rule__ExtendedID__Group__2__Impl"
    // InternalKExpressions.g:7025:1: rule__ExtendedID__Group__2__Impl : ( ( rule__ExtendedID__Group_2__0 )? ) ;
    public final void rule__ExtendedID__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7029:1: ( ( ( rule__ExtendedID__Group_2__0 )? ) )
            // InternalKExpressions.g:7030:1: ( ( rule__ExtendedID__Group_2__0 )? )
            {
            // InternalKExpressions.g:7030:1: ( ( rule__ExtendedID__Group_2__0 )? )
            // InternalKExpressions.g:7031:1: ( rule__ExtendedID__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup_2()); 
            }
            // InternalKExpressions.g:7032:1: ( rule__ExtendedID__Group_2__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==42) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalKExpressions.g:7032:2: rule__ExtendedID__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ExtendedID__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendedIDAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedID__Group__2__Impl"


    // $ANTLR start "rule__ExtendedID__Group_1__0"
    // InternalKExpressions.g:7048:1: rule__ExtendedID__Group_1__0 : rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 ;
    public final void rule__ExtendedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7052:1: ( rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 )
            // InternalKExpressions.g:7053:2: rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__ExtendedID__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExtendedID__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedID__Group_1__0"


    // $ANTLR start "rule__ExtendedID__Group_1__0__Impl"
    // InternalKExpressions.g:7060:1: rule__ExtendedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__ExtendedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7064:1: ( ( '.' ) )
            // InternalKExpressions.g:7065:1: ( '.' )
            {
            // InternalKExpressions.g:7065:1: ( '.' )
            // InternalKExpressions.g:7066:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            }
            match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedID__Group_1__0__Impl"


    // $ANTLR start "rule__ExtendedID__Group_1__1"
    // InternalKExpressions.g:7079:1: rule__ExtendedID__Group_1__1 : rule__ExtendedID__Group_1__1__Impl ;
    public final void rule__ExtendedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7083:1: ( rule__ExtendedID__Group_1__1__Impl )
            // InternalKExpressions.g:7084:2: rule__ExtendedID__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExtendedID__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedID__Group_1__1"


    // $ANTLR start "rule__ExtendedID__Group_1__1__Impl"
    // InternalKExpressions.g:7090:1: rule__ExtendedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7094:1: ( ( RULE_ID ) )
            // InternalKExpressions.g:7095:1: ( RULE_ID )
            {
            // InternalKExpressions.g:7095:1: ( RULE_ID )
            // InternalKExpressions.g:7096:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedID__Group_1__1__Impl"


    // $ANTLR start "rule__ExtendedID__Group_2__0"
    // InternalKExpressions.g:7111:1: rule__ExtendedID__Group_2__0 : rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1 ;
    public final void rule__ExtendedID__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7115:1: ( rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1 )
            // InternalKExpressions.g:7116:2: rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_47);
            rule__ExtendedID__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExtendedID__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedID__Group_2__0"


    // $ANTLR start "rule__ExtendedID__Group_2__0__Impl"
    // InternalKExpressions.g:7123:1: rule__ExtendedID__Group_2__0__Impl : ( '#' ) ;
    public final void rule__ExtendedID__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7127:1: ( ( '#' ) )
            // InternalKExpressions.g:7128:1: ( '#' )
            {
            // InternalKExpressions.g:7128:1: ( '#' )
            // InternalKExpressions.g:7129:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getNumberSignKeyword_2_0()); 
            }
            match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendedIDAccess().getNumberSignKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedID__Group_2__0__Impl"


    // $ANTLR start "rule__ExtendedID__Group_2__1"
    // InternalKExpressions.g:7142:1: rule__ExtendedID__Group_2__1 : rule__ExtendedID__Group_2__1__Impl ;
    public final void rule__ExtendedID__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7146:1: ( rule__ExtendedID__Group_2__1__Impl )
            // InternalKExpressions.g:7147:2: rule__ExtendedID__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExtendedID__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedID__Group_2__1"


    // $ANTLR start "rule__ExtendedID__Group_2__1__Impl"
    // InternalKExpressions.g:7153:1: rule__ExtendedID__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__ExtendedID__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7157:1: ( ( RULE_INT ) )
            // InternalKExpressions.g:7158:1: ( RULE_INT )
            {
            // InternalKExpressions.g:7158:1: ( RULE_INT )
            // InternalKExpressions.g:7159:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getINTTerminalRuleCall_2_1()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendedIDAccess().getINTTerminalRuleCall_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedID__Group_2__1__Impl"


    // $ANTLR start "rule__Integer__Group__0"
    // InternalKExpressions.g:7174:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7178:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // InternalKExpressions.g:7179:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_43);
            rule__Integer__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Integer__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__0"


    // $ANTLR start "rule__Integer__Group__0__Impl"
    // InternalKExpressions.g:7186:1: rule__Integer__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7190:1: ( ( ( '-' )? ) )
            // InternalKExpressions.g:7191:1: ( ( '-' )? )
            {
            // InternalKExpressions.g:7191:1: ( ( '-' )? )
            // InternalKExpressions.g:7192:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalKExpressions.g:7193:1: ( '-' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==21) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalKExpressions.g:7194:2: '-'
                    {
                    match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__0__Impl"


    // $ANTLR start "rule__Integer__Group__1"
    // InternalKExpressions.g:7205:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7209:1: ( rule__Integer__Group__1__Impl )
            // InternalKExpressions.g:7210:2: rule__Integer__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Integer__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__1"


    // $ANTLR start "rule__Integer__Group__1__Impl"
    // InternalKExpressions.g:7216:1: rule__Integer__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7220:1: ( ( RULE_INT ) )
            // InternalKExpressions.g:7221:1: ( RULE_INT )
            {
            // InternalKExpressions.g:7221:1: ( RULE_INT )
            // InternalKExpressions.g:7222:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getINTTerminalRuleCall_1()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerAccess().getINTTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__1__Impl"


    // $ANTLR start "rule__Floateger__Group__0"
    // InternalKExpressions.g:7237:1: rule__Floateger__Group__0 : rule__Floateger__Group__0__Impl rule__Floateger__Group__1 ;
    public final void rule__Floateger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7241:1: ( rule__Floateger__Group__0__Impl rule__Floateger__Group__1 )
            // InternalKExpressions.g:7242:2: rule__Floateger__Group__0__Impl rule__Floateger__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_44);
            rule__Floateger__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Floateger__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floateger__Group__0"


    // $ANTLR start "rule__Floateger__Group__0__Impl"
    // InternalKExpressions.g:7249:1: rule__Floateger__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Floateger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7253:1: ( ( ( '-' )? ) )
            // InternalKExpressions.g:7254:1: ( ( '-' )? )
            {
            // InternalKExpressions.g:7254:1: ( ( '-' )? )
            // InternalKExpressions.g:7255:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloategerAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalKExpressions.g:7256:1: ( '-' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==21) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalKExpressions.g:7257:2: '-'
                    {
                    match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloategerAccess().getHyphenMinusKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floateger__Group__0__Impl"


    // $ANTLR start "rule__Floateger__Group__1"
    // InternalKExpressions.g:7268:1: rule__Floateger__Group__1 : rule__Floateger__Group__1__Impl ;
    public final void rule__Floateger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7272:1: ( rule__Floateger__Group__1__Impl )
            // InternalKExpressions.g:7273:2: rule__Floateger__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Floateger__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floateger__Group__1"


    // $ANTLR start "rule__Floateger__Group__1__Impl"
    // InternalKExpressions.g:7279:1: rule__Floateger__Group__1__Impl : ( RULE_FLOAT ) ;
    public final void rule__Floateger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7283:1: ( ( RULE_FLOAT ) )
            // InternalKExpressions.g:7284:1: ( RULE_FLOAT )
            {
            // InternalKExpressions.g:7284:1: ( RULE_FLOAT )
            // InternalKExpressions.g:7285:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloategerAccess().getFLOATTerminalRuleCall_1()); 
            }
            match(input,RULE_FLOAT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloategerAccess().getFLOATTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floateger__Group__1__Impl"


    // $ANTLR start "rule__LogicalOrExpression__OperatorAssignment_1_1_0"
    // InternalKExpressions.g:7301:1: rule__LogicalOrExpression__OperatorAssignment_1_1_0 : ( ruleLogicalOrOperator ) ;
    public final void rule__LogicalOrExpression__OperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7305:1: ( ( ruleLogicalOrOperator ) )
            // InternalKExpressions.g:7306:1: ( ruleLogicalOrOperator )
            {
            // InternalKExpressions.g:7306:1: ( ruleLogicalOrOperator )
            // InternalKExpressions.g:7307:1: ruleLogicalOrOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExpressionAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_1_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleLogicalOrOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrExpressionAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpression__OperatorAssignment_1_1_0"


    // $ANTLR start "rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1"
    // InternalKExpressions.g:7316:1: rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1 : ( ruleLogicalAndExpression ) ;
    public final void rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7320:1: ( ( ruleLogicalAndExpression ) )
            // InternalKExpressions.g:7321:1: ( ruleLogicalAndExpression )
            {
            // InternalKExpressions.g:7321:1: ( ruleLogicalAndExpression )
            // InternalKExpressions.g:7322:1: ruleLogicalAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsLogicalAndExpressionParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsLogicalAndExpressionParserRuleCall_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1"


    // $ANTLR start "rule__LogicalOrExpression__SubExpressionsAssignment_1_2_1"
    // InternalKExpressions.g:7331:1: rule__LogicalOrExpression__SubExpressionsAssignment_1_2_1 : ( ruleLogicalAndExpression ) ;
    public final void rule__LogicalOrExpression__SubExpressionsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7335:1: ( ( ruleLogicalAndExpression ) )
            // InternalKExpressions.g:7336:1: ( ruleLogicalAndExpression )
            {
            // InternalKExpressions.g:7336:1: ( ruleLogicalAndExpression )
            // InternalKExpressions.g:7337:1: ruleLogicalAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsLogicalAndExpressionParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsLogicalAndExpressionParserRuleCall_1_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpression__SubExpressionsAssignment_1_2_1"


    // $ANTLR start "rule__LogicalAndExpression__OperatorAssignment_1_1_0"
    // InternalKExpressions.g:7346:1: rule__LogicalAndExpression__OperatorAssignment_1_1_0 : ( ruleLogicalAndOperator ) ;
    public final void rule__LogicalAndExpression__OperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7350:1: ( ( ruleLogicalAndOperator ) )
            // InternalKExpressions.g:7351:1: ( ruleLogicalAndOperator )
            {
            // InternalKExpressions.g:7351:1: ( ruleLogicalAndOperator )
            // InternalKExpressions.g:7352:1: ruleLogicalAndOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExpressionAccess().getOperatorLogicalAndOperatorEnumRuleCall_1_1_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleLogicalAndOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndExpressionAccess().getOperatorLogicalAndOperatorEnumRuleCall_1_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpression__OperatorAssignment_1_1_0"


    // $ANTLR start "rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1"
    // InternalKExpressions.g:7361:1: rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1 : ( ruleBitwiseOrExpression ) ;
    public final void rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7365:1: ( ( ruleBitwiseOrExpression ) )
            // InternalKExpressions.g:7366:1: ( ruleBitwiseOrExpression )
            {
            // InternalKExpressions.g:7366:1: ( ruleBitwiseOrExpression )
            // InternalKExpressions.g:7367:1: ruleBitwiseOrExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsBitwiseOrExpressionParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsBitwiseOrExpressionParserRuleCall_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1"


    // $ANTLR start "rule__LogicalAndExpression__SubExpressionsAssignment_1_2_1"
    // InternalKExpressions.g:7376:1: rule__LogicalAndExpression__SubExpressionsAssignment_1_2_1 : ( ruleBitwiseOrExpression ) ;
    public final void rule__LogicalAndExpression__SubExpressionsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7380:1: ( ( ruleBitwiseOrExpression ) )
            // InternalKExpressions.g:7381:1: ( ruleBitwiseOrExpression )
            {
            // InternalKExpressions.g:7381:1: ( ruleBitwiseOrExpression )
            // InternalKExpressions.g:7382:1: ruleBitwiseOrExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsBitwiseOrExpressionParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsBitwiseOrExpressionParserRuleCall_1_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpression__SubExpressionsAssignment_1_2_1"


    // $ANTLR start "rule__BitwiseOrExpression__OperatorAssignment_1_1_0"
    // InternalKExpressions.g:7391:1: rule__BitwiseOrExpression__OperatorAssignment_1_1_0 : ( ruleBitwiseOrOperator ) ;
    public final void rule__BitwiseOrExpression__OperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7395:1: ( ( ruleBitwiseOrOperator ) )
            // InternalKExpressions.g:7396:1: ( ruleBitwiseOrOperator )
            {
            // InternalKExpressions.g:7396:1: ( ruleBitwiseOrOperator )
            // InternalKExpressions.g:7397:1: ruleBitwiseOrOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrExpressionAccess().getOperatorBitwiseOrOperatorEnumRuleCall_1_1_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleBitwiseOrOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBitwiseOrExpressionAccess().getOperatorBitwiseOrOperatorEnumRuleCall_1_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitwiseOrExpression__OperatorAssignment_1_1_0"


    // $ANTLR start "rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1"
    // InternalKExpressions.g:7406:1: rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1 : ( ruleBitwiseAndExpression ) ;
    public final void rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7410:1: ( ( ruleBitwiseAndExpression ) )
            // InternalKExpressions.g:7411:1: ( ruleBitwiseAndExpression )
            {
            // InternalKExpressions.g:7411:1: ( ruleBitwiseAndExpression )
            // InternalKExpressions.g:7412:1: ruleBitwiseAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsBitwiseAndExpressionParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsBitwiseAndExpressionParserRuleCall_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1"


    // $ANTLR start "rule__BitwiseOrExpression__SubExpressionsAssignment_1_2_1"
    // InternalKExpressions.g:7421:1: rule__BitwiseOrExpression__SubExpressionsAssignment_1_2_1 : ( ruleBitwiseAndExpression ) ;
    public final void rule__BitwiseOrExpression__SubExpressionsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7425:1: ( ( ruleBitwiseAndExpression ) )
            // InternalKExpressions.g:7426:1: ( ruleBitwiseAndExpression )
            {
            // InternalKExpressions.g:7426:1: ( ruleBitwiseAndExpression )
            // InternalKExpressions.g:7427:1: ruleBitwiseAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsBitwiseAndExpressionParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsBitwiseAndExpressionParserRuleCall_1_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitwiseOrExpression__SubExpressionsAssignment_1_2_1"


    // $ANTLR start "rule__BitwiseAndExpression__OperatorAssignment_1_1_0"
    // InternalKExpressions.g:7436:1: rule__BitwiseAndExpression__OperatorAssignment_1_1_0 : ( ruleBitwiseAndOperator ) ;
    public final void rule__BitwiseAndExpression__OperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7440:1: ( ( ruleBitwiseAndOperator ) )
            // InternalKExpressions.g:7441:1: ( ruleBitwiseAndOperator )
            {
            // InternalKExpressions.g:7441:1: ( ruleBitwiseAndOperator )
            // InternalKExpressions.g:7442:1: ruleBitwiseAndOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndExpressionAccess().getOperatorBitwiseAndOperatorEnumRuleCall_1_1_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleBitwiseAndOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBitwiseAndExpressionAccess().getOperatorBitwiseAndOperatorEnumRuleCall_1_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitwiseAndExpression__OperatorAssignment_1_1_0"


    // $ANTLR start "rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1"
    // InternalKExpressions.g:7451:1: rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1 : ( ruleCompareOperation ) ;
    public final void rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7455:1: ( ( ruleCompareOperation ) )
            // InternalKExpressions.g:7456:1: ( ruleCompareOperation )
            {
            // InternalKExpressions.g:7456:1: ( ruleCompareOperation )
            // InternalKExpressions.g:7457:1: ruleCompareOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleCompareOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1"


    // $ANTLR start "rule__BitwiseAndExpression__SubExpressionsAssignment_1_2_1"
    // InternalKExpressions.g:7466:1: rule__BitwiseAndExpression__SubExpressionsAssignment_1_2_1 : ( ruleCompareOperation ) ;
    public final void rule__BitwiseAndExpression__SubExpressionsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7470:1: ( ( ruleCompareOperation ) )
            // InternalKExpressions.g:7471:1: ( ruleCompareOperation )
            {
            // InternalKExpressions.g:7471:1: ( ruleCompareOperation )
            // InternalKExpressions.g:7472:1: ruleCompareOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleCompareOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitwiseAndExpression__SubExpressionsAssignment_1_2_1"


    // $ANTLR start "rule__CompareOperation__OperatorAssignment_1_1"
    // InternalKExpressions.g:7481:1: rule__CompareOperation__OperatorAssignment_1_1 : ( ruleCompareOperator ) ;
    public final void rule__CompareOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7485:1: ( ( ruleCompareOperator ) )
            // InternalKExpressions.g:7486:1: ( ruleCompareOperator )
            {
            // InternalKExpressions.g:7486:1: ( ruleCompareOperator )
            // InternalKExpressions.g:7487:1: ruleCompareOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleCompareOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__CompareOperation__OperatorAssignment_1_1"


    // $ANTLR start "rule__CompareOperation__SubExpressionsAssignment_1_2"
    // InternalKExpressions.g:7496:1: rule__CompareOperation__SubExpressionsAssignment_1_2 : ( ruleNotOrValuedExpression ) ;
    public final void rule__CompareOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7500:1: ( ( ruleNotOrValuedExpression ) )
            // InternalKExpressions.g:7501:1: ( ruleNotOrValuedExpression )
            {
            // InternalKExpressions.g:7501:1: ( ruleNotOrValuedExpression )
            // InternalKExpressions.g:7502:1: ruleNotOrValuedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__SubExpressionsAssignment_1_2"


    // $ANTLR start "rule__NotExpression__OperatorAssignment_0_1"
    // InternalKExpressions.g:7511:1: rule__NotExpression__OperatorAssignment_0_1 : ( ruleNotOperator ) ;
    public final void rule__NotExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7515:1: ( ( ruleNotOperator ) )
            // InternalKExpressions.g:7516:1: ( ruleNotOperator )
            {
            // InternalKExpressions.g:7516:1: ( ruleNotOperator )
            // InternalKExpressions.g:7517:1: ruleNotOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleNotOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__NotExpression__OperatorAssignment_0_1"


    // $ANTLR start "rule__NotExpression__SubExpressionsAssignment_0_2"
    // InternalKExpressions.g:7526:1: rule__NotExpression__SubExpressionsAssignment_0_2 : ( ruleNotExpression ) ;
    public final void rule__NotExpression__SubExpressionsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7530:1: ( ( ruleNotExpression ) )
            // InternalKExpressions.g:7531:1: ( ruleNotExpression )
            {
            // InternalKExpressions.g:7531:1: ( ruleNotExpression )
            // InternalKExpressions.g:7532:1: ruleNotExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleNotExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__NotExpression__SubExpressionsAssignment_0_2"


    // $ANTLR start "rule__AddExpression__OperatorAssignment_1_1_0"
    // InternalKExpressions.g:7541:1: rule__AddExpression__OperatorAssignment_1_1_0 : ( ruleAddOperator ) ;
    public final void rule__AddExpression__OperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7545:1: ( ( ruleAddOperator ) )
            // InternalKExpressions.g:7546:1: ( ruleAddOperator )
            {
            // InternalKExpressions.g:7546:1: ( ruleAddOperator )
            // InternalKExpressions.g:7547:1: ruleAddOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAddOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__OperatorAssignment_1_1_0"


    // $ANTLR start "rule__AddExpression__SubExpressionsAssignment_1_1_1"
    // InternalKExpressions.g:7556:1: rule__AddExpression__SubExpressionsAssignment_1_1_1 : ( ruleSubExpression ) ;
    public final void rule__AddExpression__SubExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7560:1: ( ( ruleSubExpression ) )
            // InternalKExpressions.g:7561:1: ( ruleSubExpression )
            {
            // InternalKExpressions.g:7561:1: ( ruleSubExpression )
            // InternalKExpressions.g:7562:1: ruleSubExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSubExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__SubExpressionsAssignment_1_1_1"


    // $ANTLR start "rule__AddExpression__SubExpressionsAssignment_1_2_1"
    // InternalKExpressions.g:7571:1: rule__AddExpression__SubExpressionsAssignment_1_2_1 : ( ruleSubExpression ) ;
    public final void rule__AddExpression__SubExpressionsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7575:1: ( ( ruleSubExpression ) )
            // InternalKExpressions.g:7576:1: ( ruleSubExpression )
            {
            // InternalKExpressions.g:7576:1: ( ruleSubExpression )
            // InternalKExpressions.g:7577:1: ruleSubExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSubExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__SubExpressionsAssignment_1_2_1"


    // $ANTLR start "rule__SubExpression__OperatorAssignment_1_1_0"
    // InternalKExpressions.g:7586:1: rule__SubExpression__OperatorAssignment_1_1_0 : ( ruleSubOperator ) ;
    public final void rule__SubExpression__OperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7590:1: ( ( ruleSubOperator ) )
            // InternalKExpressions.g:7591:1: ( ruleSubOperator )
            {
            // InternalKExpressions.g:7591:1: ( ruleSubOperator )
            // InternalKExpressions.g:7592:1: ruleSubOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSubOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubExpression__OperatorAssignment_1_1_0"


    // $ANTLR start "rule__SubExpression__SubExpressionsAssignment_1_1_1"
    // InternalKExpressions.g:7601:1: rule__SubExpression__SubExpressionsAssignment_1_1_1 : ( ruleMultExpression ) ;
    public final void rule__SubExpression__SubExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7605:1: ( ( ruleMultExpression ) )
            // InternalKExpressions.g:7606:1: ( ruleMultExpression )
            {
            // InternalKExpressions.g:7606:1: ( ruleMultExpression )
            // InternalKExpressions.g:7607:1: ruleMultExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMultExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubExpression__SubExpressionsAssignment_1_1_1"


    // $ANTLR start "rule__SubExpression__SubExpressionsAssignment_1_2_1"
    // InternalKExpressions.g:7616:1: rule__SubExpression__SubExpressionsAssignment_1_2_1 : ( ruleMultExpression ) ;
    public final void rule__SubExpression__SubExpressionsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7620:1: ( ( ruleMultExpression ) )
            // InternalKExpressions.g:7621:1: ( ruleMultExpression )
            {
            // InternalKExpressions.g:7621:1: ( ruleMultExpression )
            // InternalKExpressions.g:7622:1: ruleMultExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMultExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubExpression__SubExpressionsAssignment_1_2_1"


    // $ANTLR start "rule__MultExpression__OperatorAssignment_1_1_0"
    // InternalKExpressions.g:7631:1: rule__MultExpression__OperatorAssignment_1_1_0 : ( ruleMultOperator ) ;
    public final void rule__MultExpression__OperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7635:1: ( ( ruleMultOperator ) )
            // InternalKExpressions.g:7636:1: ( ruleMultOperator )
            {
            // InternalKExpressions.g:7636:1: ( ruleMultOperator )
            // InternalKExpressions.g:7637:1: ruleMultOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMultOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__OperatorAssignment_1_1_0"


    // $ANTLR start "rule__MultExpression__SubExpressionsAssignment_1_1_1"
    // InternalKExpressions.g:7646:1: rule__MultExpression__SubExpressionsAssignment_1_1_1 : ( ruleDivExpression ) ;
    public final void rule__MultExpression__SubExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7650:1: ( ( ruleDivExpression ) )
            // InternalKExpressions.g:7651:1: ( ruleDivExpression )
            {
            // InternalKExpressions.g:7651:1: ( ruleDivExpression )
            // InternalKExpressions.g:7652:1: ruleDivExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDivExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__SubExpressionsAssignment_1_1_1"


    // $ANTLR start "rule__MultExpression__SubExpressionsAssignment_1_2_1"
    // InternalKExpressions.g:7661:1: rule__MultExpression__SubExpressionsAssignment_1_2_1 : ( ruleDivExpression ) ;
    public final void rule__MultExpression__SubExpressionsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7665:1: ( ( ruleDivExpression ) )
            // InternalKExpressions.g:7666:1: ( ruleDivExpression )
            {
            // InternalKExpressions.g:7666:1: ( ruleDivExpression )
            // InternalKExpressions.g:7667:1: ruleDivExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDivExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__SubExpressionsAssignment_1_2_1"


    // $ANTLR start "rule__DivExpression__OperatorAssignment_1_1_0"
    // InternalKExpressions.g:7676:1: rule__DivExpression__OperatorAssignment_1_1_0 : ( ruleDivOperator ) ;
    public final void rule__DivExpression__OperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7680:1: ( ( ruleDivOperator ) )
            // InternalKExpressions.g:7681:1: ( ruleDivOperator )
            {
            // InternalKExpressions.g:7681:1: ( ruleDivOperator )
            // InternalKExpressions.g:7682:1: ruleDivOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDivOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DivExpression__OperatorAssignment_1_1_0"


    // $ANTLR start "rule__DivExpression__SubExpressionsAssignment_1_1_1"
    // InternalKExpressions.g:7691:1: rule__DivExpression__SubExpressionsAssignment_1_1_1 : ( ruleModExpression ) ;
    public final void rule__DivExpression__SubExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7695:1: ( ( ruleModExpression ) )
            // InternalKExpressions.g:7696:1: ( ruleModExpression )
            {
            // InternalKExpressions.g:7696:1: ( ruleModExpression )
            // InternalKExpressions.g:7697:1: ruleModExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleModExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DivExpression__SubExpressionsAssignment_1_1_1"


    // $ANTLR start "rule__DivExpression__SubExpressionsAssignment_1_2_1"
    // InternalKExpressions.g:7706:1: rule__DivExpression__SubExpressionsAssignment_1_2_1 : ( ruleModExpression ) ;
    public final void rule__DivExpression__SubExpressionsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7710:1: ( ( ruleModExpression ) )
            // InternalKExpressions.g:7711:1: ( ruleModExpression )
            {
            // InternalKExpressions.g:7711:1: ( ruleModExpression )
            // InternalKExpressions.g:7712:1: ruleModExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleModExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DivExpression__SubExpressionsAssignment_1_2_1"


    // $ANTLR start "rule__ModExpression__OperatorAssignment_1_1_0"
    // InternalKExpressions.g:7721:1: rule__ModExpression__OperatorAssignment_1_1_0 : ( ruleModOperator ) ;
    public final void rule__ModExpression__OperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7725:1: ( ( ruleModOperator ) )
            // InternalKExpressions.g:7726:1: ( ruleModOperator )
            {
            // InternalKExpressions.g:7726:1: ( ruleModOperator )
            // InternalKExpressions.g:7727:1: ruleModOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleModOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModExpression__OperatorAssignment_1_1_0"


    // $ANTLR start "rule__ModExpression__SubExpressionsAssignment_1_1_1"
    // InternalKExpressions.g:7736:1: rule__ModExpression__SubExpressionsAssignment_1_1_1 : ( ruleAtomicValuedExpression ) ;
    public final void rule__ModExpression__SubExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7740:1: ( ( ruleAtomicValuedExpression ) )
            // InternalKExpressions.g:7741:1: ( ruleAtomicValuedExpression )
            {
            // InternalKExpressions.g:7741:1: ( ruleAtomicValuedExpression )
            // InternalKExpressions.g:7742:1: ruleAtomicValuedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAtomicValuedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModExpression__SubExpressionsAssignment_1_1_1"


    // $ANTLR start "rule__ModExpression__SubExpressionsAssignment_1_2_1"
    // InternalKExpressions.g:7751:1: rule__ModExpression__SubExpressionsAssignment_1_2_1 : ( ruleAtomicValuedExpression ) ;
    public final void rule__ModExpression__SubExpressionsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7755:1: ( ( ruleAtomicValuedExpression ) )
            // InternalKExpressions.g:7756:1: ( ruleAtomicValuedExpression )
            {
            // InternalKExpressions.g:7756:1: ( ruleAtomicValuedExpression )
            // InternalKExpressions.g:7757:1: ruleAtomicValuedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAtomicValuedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModExpression__SubExpressionsAssignment_1_2_1"


    // $ANTLR start "rule__NegExpression__OperatorAssignment_0_1"
    // InternalKExpressions.g:7766:1: rule__NegExpression__OperatorAssignment_0_1 : ( ruleSubOperator ) ;
    public final void rule__NegExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7770:1: ( ( ruleSubOperator ) )
            // InternalKExpressions.g:7771:1: ( ruleSubOperator )
            {
            // InternalKExpressions.g:7771:1: ( ruleSubOperator )
            // InternalKExpressions.g:7772:1: ruleSubOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getOperatorSubOperatorEnumRuleCall_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSubOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegExpressionAccess().getOperatorSubOperatorEnumRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegExpression__OperatorAssignment_0_1"


    // $ANTLR start "rule__NegExpression__SubExpressionsAssignment_0_2"
    // InternalKExpressions.g:7781:1: rule__NegExpression__SubExpressionsAssignment_0_2 : ( ruleNegExpression ) ;
    public final void rule__NegExpression__SubExpressionsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7785:1: ( ( ruleNegExpression ) )
            // InternalKExpressions.g:7786:1: ( ruleNegExpression )
            {
            // InternalKExpressions.g:7786:1: ( ruleNegExpression )
            // InternalKExpressions.g:7787:1: ruleNegExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleNegExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegExpression__SubExpressionsAssignment_0_2"


    // $ANTLR start "rule__ValuedObjectTestExpression__OperatorAssignment_0_1"
    // InternalKExpressions.g:7796:1: rule__ValuedObjectTestExpression__OperatorAssignment_0_1 : ( ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 ) ) ;
    public final void rule__ValuedObjectTestExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7800:1: ( ( ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 ) ) )
            // InternalKExpressions.g:7801:1: ( ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 ) )
            {
            // InternalKExpressions.g:7801:1: ( ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 ) )
            // InternalKExpressions.g:7802:1: ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorAlternatives_0_1_0()); 
            }
            // InternalKExpressions.g:7803:1: ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 )
            // InternalKExpressions.g:7803:2: rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorAlternatives_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValuedObjectTestExpression__OperatorAssignment_0_1"


    // $ANTLR start "rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3"
    // InternalKExpressions.g:7812:1: rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 : ( ruleValuedObjectTestExpression ) ;
    public final void rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7816:1: ( ( ruleValuedObjectTestExpression ) )
            // InternalKExpressions.g:7817:1: ( ruleValuedObjectTestExpression )
            {
            // InternalKExpressions.g:7817:1: ( ruleValuedObjectTestExpression )
            // InternalKExpressions.g:7818:1: ruleValuedObjectTestExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValuedObjectTestExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3"


    // $ANTLR start "rule__ValuedObjectReference__ValuedObjectAssignment_0"
    // InternalKExpressions.g:7827:1: rule__ValuedObjectReference__ValuedObjectAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ValuedObjectReference__ValuedObjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7831:1: ( ( ( RULE_ID ) ) )
            // InternalKExpressions.g:7832:1: ( ( RULE_ID ) )
            {
            // InternalKExpressions.g:7832:1: ( ( RULE_ID ) )
            // InternalKExpressions.g:7833:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
            }
            // InternalKExpressions.g:7834:1: ( RULE_ID )
            // InternalKExpressions.g:7835:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValuedObjectReference__ValuedObjectAssignment_0"


    // $ANTLR start "rule__ValuedObjectReference__IndicesAssignment_1_1"
    // InternalKExpressions.g:7846:1: rule__ValuedObjectReference__IndicesAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__ValuedObjectReference__IndicesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7850:1: ( ( ruleExpression ) )
            // InternalKExpressions.g:7851:1: ( ruleExpression )
            {
            // InternalKExpressions.g:7851:1: ( ruleExpression )
            // InternalKExpressions.g:7852:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getIndicesExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuedObjectReferenceAccess().getIndicesExpressionParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValuedObjectReference__IndicesAssignment_1_1"


    // $ANTLR start "rule__FunctionCall__FunctionNameAssignment_1"
    // InternalKExpressions.g:7861:1: rule__FunctionCall__FunctionNameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__FunctionCall__FunctionNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7865:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:7866:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:7866:1: ( ruleExtendedID )
            // InternalKExpressions.g:7867:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFunctionNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getFunctionNameExtendedIDParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__FunctionNameAssignment_1"


    // $ANTLR start "rule__FunctionCall__ParametersAssignment_2_0_1"
    // InternalKExpressions.g:7876:1: rule__FunctionCall__ParametersAssignment_2_0_1 : ( ruleParameter ) ;
    public final void rule__FunctionCall__ParametersAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7880:1: ( ( ruleParameter ) )
            // InternalKExpressions.g:7881:1: ( ruleParameter )
            {
            // InternalKExpressions.g:7881:1: ( ruleParameter )
            // InternalKExpressions.g:7882:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__ParametersAssignment_2_0_1"


    // $ANTLR start "rule__FunctionCall__ParametersAssignment_2_0_2_1"
    // InternalKExpressions.g:7891:1: rule__FunctionCall__ParametersAssignment_2_0_2_1 : ( ruleParameter ) ;
    public final void rule__FunctionCall__ParametersAssignment_2_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7895:1: ( ( ruleParameter ) )
            // InternalKExpressions.g:7896:1: ( ruleParameter )
            {
            // InternalKExpressions.g:7896:1: ( ruleParameter )
            // InternalKExpressions.g:7897:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__ParametersAssignment_2_0_2_1"


    // $ANTLR start "rule__Parameter__PureOutputAssignment_0_0"
    // InternalKExpressions.g:7906:1: rule__Parameter__PureOutputAssignment_0_0 : ( ( '!' ) ) ;
    public final void rule__Parameter__PureOutputAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7910:1: ( ( ( '!' ) ) )
            // InternalKExpressions.g:7911:1: ( ( '!' ) )
            {
            // InternalKExpressions.g:7911:1: ( ( '!' ) )
            // InternalKExpressions.g:7912:1: ( '!' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getPureOutputExclamationMarkKeyword_0_0_0()); 
            }
            // InternalKExpressions.g:7913:1: ( '!' )
            // InternalKExpressions.g:7914:1: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getPureOutputExclamationMarkKeyword_0_0_0()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getPureOutputExclamationMarkKeyword_0_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getPureOutputExclamationMarkKeyword_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__PureOutputAssignment_0_0"


    // $ANTLR start "rule__Parameter__CallByReferenceAssignment_0_1"
    // InternalKExpressions.g:7929:1: rule__Parameter__CallByReferenceAssignment_0_1 : ( ( '&' ) ) ;
    public final void rule__Parameter__CallByReferenceAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7933:1: ( ( ( '&' ) ) )
            // InternalKExpressions.g:7934:1: ( ( '&' ) )
            {
            // InternalKExpressions.g:7934:1: ( ( '&' ) )
            // InternalKExpressions.g:7935:1: ( '&' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getCallByReferenceAmpersandKeyword_0_1_0()); 
            }
            // InternalKExpressions.g:7936:1: ( '&' )
            // InternalKExpressions.g:7937:1: '&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getCallByReferenceAmpersandKeyword_0_1_0()); 
            }
            match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getCallByReferenceAmpersandKeyword_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getCallByReferenceAmpersandKeyword_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__CallByReferenceAssignment_0_1"


    // $ANTLR start "rule__Parameter__ExpressionAssignment_1"
    // InternalKExpressions.g:7952:1: rule__Parameter__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__Parameter__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7956:1: ( ( ruleExpression ) )
            // InternalKExpressions.g:7957:1: ( ruleExpression )
            {
            // InternalKExpressions.g:7957:1: ( ruleExpression )
            // InternalKExpressions.g:7958:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getExpressionExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getExpressionExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__ExpressionAssignment_1"


    // $ANTLR start "rule__TextExpression__TextAssignment"
    // InternalKExpressions.g:7967:1: rule__TextExpression__TextAssignment : ( RULE_HOSTCODE ) ;
    public final void rule__TextExpression__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7971:1: ( ( RULE_HOSTCODE ) )
            // InternalKExpressions.g:7972:1: ( RULE_HOSTCODE )
            {
            // InternalKExpressions.g:7972:1: ( RULE_HOSTCODE )
            // InternalKExpressions.g:7973:1: RULE_HOSTCODE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getTextHOSTCODETerminalRuleCall_0()); 
            }
            match(input,RULE_HOSTCODE,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextExpressionAccess().getTextHOSTCODETerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextExpression__TextAssignment"


    // $ANTLR start "rule__IntValue__ValueAssignment"
    // InternalKExpressions.g:7982:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7986:1: ( ( RULE_INT ) )
            // InternalKExpressions.g:7987:1: ( RULE_INT )
            {
            // InternalKExpressions.g:7987:1: ( RULE_INT )
            // InternalKExpressions.g:7988:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__IntValue__ValueAssignment"


    // $ANTLR start "rule__FloatValue__ValueAssignment"
    // InternalKExpressions.g:7997:1: rule__FloatValue__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8001:1: ( ( RULE_FLOAT ) )
            // InternalKExpressions.g:8002:1: ( RULE_FLOAT )
            {
            // InternalKExpressions.g:8002:1: ( RULE_FLOAT )
            // InternalKExpressions.g:8003:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueFLOATTerminalRuleCall_0()); 
            }
            match(input,RULE_FLOAT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatValueAccess().getValueFLOATTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatValue__ValueAssignment"


    // $ANTLR start "rule__BoolValue__ValueAssignment"
    // InternalKExpressions.g:8012:1: rule__BoolValue__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BoolValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8016:1: ( ( RULE_BOOLEAN ) )
            // InternalKExpressions.g:8017:1: ( RULE_BOOLEAN )
            {
            // InternalKExpressions.g:8017:1: ( RULE_BOOLEAN )
            // InternalKExpressions.g:8018:1: RULE_BOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolValueAccess().getValueBOOLEANTerminalRuleCall_0()); 
            }
            match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolValueAccess().getValueBOOLEANTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolValue__ValueAssignment"


    // $ANTLR start "rule__StringValue__ValueAssignment"
    // InternalKExpressions.g:8027:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8031:1: ( ( RULE_STRING ) )
            // InternalKExpressions.g:8032:1: ( RULE_STRING )
            {
            // InternalKExpressions.g:8032:1: ( RULE_STRING )
            // InternalKExpressions.g:8033:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__ValueAssignment"


    // $ANTLR start "rule__CommentAnnotation__ValuesAssignment"
    // InternalKExpressions.g:8042:1: rule__CommentAnnotation__ValuesAssignment : ( RULE_COMMENT_ANNOTATION ) ;
    public final void rule__CommentAnnotation__ValuesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8046:1: ( ( RULE_COMMENT_ANNOTATION ) )
            // InternalKExpressions.g:8047:1: ( RULE_COMMENT_ANNOTATION )
            {
            // InternalKExpressions.g:8047:1: ( RULE_COMMENT_ANNOTATION )
            // InternalKExpressions.g:8048:1: RULE_COMMENT_ANNOTATION
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationAccess().getValuesCOMMENT_ANNOTATIONTerminalRuleCall_0()); 
            }
            match(input,RULE_COMMENT_ANNOTATION,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommentAnnotationAccess().getValuesCOMMENT_ANNOTATIONTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommentAnnotation__ValuesAssignment"


    // $ANTLR start "rule__TagAnnotation__NameAssignment_1"
    // InternalKExpressions.g:8057:1: rule__TagAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TagAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8061:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:8062:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:8062:1: ( ruleExtendedID )
            // InternalKExpressions.g:8063:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagAnnotation__NameAssignment_1"


    // $ANTLR start "rule__KeyStringValueAnnotation__NameAssignment_1"
    // InternalKExpressions.g:8072:1: rule__KeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8076:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:8077:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:8077:1: ( ruleExtendedID )
            // InternalKExpressions.g:8078:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringValueAnnotation__NameAssignment_1"


    // $ANTLR start "rule__KeyStringValueAnnotation__ValuesAssignment_2"
    // InternalKExpressions.g:8087:1: rule__KeyStringValueAnnotation__ValuesAssignment_2 : ( ruleEString ) ;
    public final void rule__KeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8091:1: ( ( ruleEString ) )
            // InternalKExpressions.g:8092:1: ( ruleEString )
            {
            // InternalKExpressions.g:8092:1: ( ruleEString )
            // InternalKExpressions.g:8093:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringValueAnnotation__ValuesAssignment_2"


    // $ANTLR start "rule__KeyStringValueAnnotation__ValuesAssignment_3_1"
    // InternalKExpressions.g:8102:1: rule__KeyStringValueAnnotation__ValuesAssignment_3_1 : ( ruleEString ) ;
    public final void rule__KeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8106:1: ( ( ruleEString ) )
            // InternalKExpressions.g:8107:1: ( ruleEString )
            {
            // InternalKExpressions.g:8107:1: ( ruleEString )
            // InternalKExpressions.g:8108:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringValueAnnotation__ValuesAssignment_3_1"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__NameAssignment_1"
    // InternalKExpressions.g:8117:1: rule__TypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8121:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:8122:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:8122:1: ( ruleExtendedID )
            // InternalKExpressions.g:8123:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__NameAssignment_1"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__TypeAssignment_3"
    // InternalKExpressions.g:8132:1: rule__TypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8136:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:8137:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:8137:1: ( ruleExtendedID )
            // InternalKExpressions.g:8138:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__TypeAssignment_3"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__ValuesAssignment_5"
    // InternalKExpressions.g:8147:1: rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 : ( ruleEStringBoolean ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8151:1: ( ( ruleEStringBoolean ) )
            // InternalKExpressions.g:8152:1: ( ruleEStringBoolean )
            {
            // InternalKExpressions.g:8152:1: ( ruleEStringBoolean )
            // InternalKExpressions.g:8153:1: ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEStringBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__ValuesAssignment_5"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1"
    // InternalKExpressions.g:8162:1: rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( ruleEStringBoolean ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8166:1: ( ( ruleEStringBoolean ) )
            // InternalKExpressions.g:8167:1: ( ruleEStringBoolean )
            {
            // InternalKExpressions.g:8167:1: ( ruleEStringBoolean )
            // InternalKExpressions.g:8168:1: ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_6_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEStringBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1"


    // $ANTLR start "rule__QuotedKeyStringValueAnnotation__NameAssignment_1"
    // InternalKExpressions.g:8177:1: rule__QuotedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__QuotedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8181:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:8182:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:8182:1: ( ruleExtendedID )
            // InternalKExpressions.g:8183:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedKeyStringValueAnnotation__NameAssignment_1"


    // $ANTLR start "rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2"
    // InternalKExpressions.g:8192:1: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 : ( RULE_STRING ) ;
    public final void rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8196:1: ( ( RULE_STRING ) )
            // InternalKExpressions.g:8197:1: ( RULE_STRING )
            {
            // InternalKExpressions.g:8197:1: ( RULE_STRING )
            // InternalKExpressions.g:8198:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2"


    // $ANTLR start "rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1"
    // InternalKExpressions.g:8207:1: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8211:1: ( ( RULE_STRING ) )
            // InternalKExpressions.g:8212:1: ( RULE_STRING )
            {
            // InternalKExpressions.g:8212:1: ( RULE_STRING )
            // InternalKExpressions.g:8213:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_3_1_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1"


    // $ANTLR start "rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1"
    // InternalKExpressions.g:8222:1: rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8226:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:8227:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:8227:1: ( ruleExtendedID )
            // InternalKExpressions.g:8228:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1"


    // $ANTLR start "rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3"
    // InternalKExpressions.g:8237:1: rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8241:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:8242:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:8242:1: ( ruleExtendedID )
            // InternalKExpressions.g:8243:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3"


    // $ANTLR start "rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5"
    // InternalKExpressions.g:8252:1: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 : ( RULE_STRING ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8256:1: ( ( RULE_STRING ) )
            // InternalKExpressions.g:8257:1: ( RULE_STRING )
            {
            // InternalKExpressions.g:8257:1: ( RULE_STRING )
            // InternalKExpressions.g:8258:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_5_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5"


    // $ANTLR start "rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1"
    // InternalKExpressions.g:8267:1: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8271:1: ( ( RULE_STRING ) )
            // InternalKExpressions.g:8272:1: ( RULE_STRING )
            {
            // InternalKExpressions.g:8272:1: ( RULE_STRING )
            // InternalKExpressions.g:8273:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_6_1_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__NameAssignment_1"
    // InternalKExpressions.g:8282:1: rule__KeyBooleanValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyBooleanValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8286:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:8287:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:8287:1: ( ruleExtendedID )
            // InternalKExpressions.g:8288:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyBooleanValueAnnotation__NameAssignment_1"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__ValueAssignment_2"
    // InternalKExpressions.g:8297:1: rule__KeyBooleanValueAnnotation__ValueAssignment_2 : ( RULE_BOOLEAN ) ;
    public final void rule__KeyBooleanValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8301:1: ( ( RULE_BOOLEAN ) )
            // InternalKExpressions.g:8302:1: ( RULE_BOOLEAN )
            {
            // InternalKExpressions.g:8302:1: ( RULE_BOOLEAN )
            // InternalKExpressions.g:8303:1: RULE_BOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getValueBOOLEANTerminalRuleCall_2_0()); 
            }
            match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyBooleanValueAnnotationAccess().getValueBOOLEANTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyBooleanValueAnnotation__ValueAssignment_2"


    // $ANTLR start "rule__KeyIntValueAnnotation__NameAssignment_1"
    // InternalKExpressions.g:8312:1: rule__KeyIntValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyIntValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8316:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:8317:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:8317:1: ( ruleExtendedID )
            // InternalKExpressions.g:8318:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyIntValueAnnotation__NameAssignment_1"


    // $ANTLR start "rule__KeyIntValueAnnotation__ValueAssignment_2"
    // InternalKExpressions.g:8327:1: rule__KeyIntValueAnnotation__ValueAssignment_2 : ( ruleInteger ) ;
    public final void rule__KeyIntValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8331:1: ( ( ruleInteger ) )
            // InternalKExpressions.g:8332:1: ( ruleInteger )
            {
            // InternalKExpressions.g:8332:1: ( ruleInteger )
            // InternalKExpressions.g:8333:1: ruleInteger
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getValueIntegerParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationAccess().getValueIntegerParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyIntValueAnnotation__ValueAssignment_2"


    // $ANTLR start "rule__KeyFloatValueAnnotation__NameAssignment_1"
    // InternalKExpressions.g:8342:1: rule__KeyFloatValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyFloatValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8346:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:8347:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:8347:1: ( ruleExtendedID )
            // InternalKExpressions.g:8348:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyFloatValueAnnotation__NameAssignment_1"


    // $ANTLR start "rule__KeyFloatValueAnnotation__ValueAssignment_2"
    // InternalKExpressions.g:8357:1: rule__KeyFloatValueAnnotation__ValueAssignment_2 : ( ruleFloateger ) ;
    public final void rule__KeyFloatValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8361:1: ( ( ruleFloateger ) )
            // InternalKExpressions.g:8362:1: ( ruleFloateger )
            {
            // InternalKExpressions.g:8362:1: ( ruleFloateger )
            // InternalKExpressions.g:8363:1: ruleFloateger
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getValueFloategerParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleFloateger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationAccess().getValueFloategerParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyFloatValueAnnotation__ValueAssignment_2"

    // $ANTLR start synpred1_InternalKExpressions
    public final void synpred1_InternalKExpressions_fragment() throws RecognitionException {   
        // InternalKExpressions.g:1521:1: ( ( ruleBoolExpression ) )
        // InternalKExpressions.g:1521:1: ( ruleBoolExpression )
        {
        // InternalKExpressions.g:1521:1: ( ruleBoolExpression )
        // InternalKExpressions.g:1522:1: ruleBoolExpression
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExpressionAccess().getBoolExpressionParserRuleCall_0()); 
        }
        pushFollow(FollowSets000.FOLLOW_2);
        ruleBoolExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalKExpressions

    // $ANTLR start synpred2_InternalKExpressions
    public final void synpred2_InternalKExpressions_fragment() throws RecognitionException {   
        // InternalKExpressions.g:1543:1: ( ( ruleValuedExpression ) )
        // InternalKExpressions.g:1543:1: ( ruleValuedExpression )
        {
        // InternalKExpressions.g:1543:1: ( ruleValuedExpression )
        // InternalKExpressions.g:1544:1: ruleValuedExpression
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
        }
        pushFollow(FollowSets000.FOLLOW_2);
        ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalKExpressions

    // $ANTLR start synpred12_InternalKExpressions
    public final void synpred12_InternalKExpressions_fragment() throws RecognitionException {   
        // InternalKExpressions.g:1667:6: ( ( ( rule__AtomicValuedExpression__Group_3__0 ) ) )
        // InternalKExpressions.g:1667:6: ( ( rule__AtomicValuedExpression__Group_3__0 ) )
        {
        // InternalKExpressions.g:1667:6: ( ( rule__AtomicValuedExpression__Group_3__0 ) )
        // InternalKExpressions.g:1668:1: ( rule__AtomicValuedExpression__Group_3__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_3()); 
        }
        // InternalKExpressions.g:1669:1: ( rule__AtomicValuedExpression__Group_3__0 )
        // InternalKExpressions.g:1669:2: rule__AtomicValuedExpression__Group_3__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__AtomicValuedExpression__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred12_InternalKExpressions

    // Delegated rules

    public final boolean synpred12_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalKExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalKExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalKExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\4\13\0\2\uffff";
    static final String dfa_3s = "\1\43\13\0\2\uffff";
    static final String dfa_4s = "\14\uffff\1\1\1\2";
    static final String dfa_5s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\1\6\1\11\1\2\1\3\1\13\6\uffff\1\7\2\uffff\1\14\1\uffff\1\1\3\uffff\1\10\4\uffff\1\12\4\uffff\1\5",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1516:1: rule__Expression__Alternatives : ( ( ruleBoolExpression ) | ( ruleValuedExpression ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_1 = input.LA(1);

                         
                        int index1_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index1_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_2 = input.LA(1);

                         
                        int index1_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index1_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_3 = input.LA(1);

                         
                        int index1_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index1_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA1_4 = input.LA(1);

                         
                        int index1_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index1_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA1_5 = input.LA(1);

                         
                        int index1_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index1_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA1_6 = input.LA(1);

                         
                        int index1_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index1_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA1_7 = input.LA(1);

                         
                        int index1_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index1_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA1_8 = input.LA(1);

                         
                        int index1_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index1_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA1_9 = input.LA(1);

                         
                        int index1_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index1_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA1_10 = input.LA(1);

                         
                        int index1_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index1_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA1_11 = input.LA(1);

                         
                        int index1_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index1_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 1, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\15\uffff";
    static final String dfa_8s = "\1\4\4\uffff\7\0\1\uffff";
    static final String dfa_9s = "\1\43\4\uffff\7\0\1\uffff";
    static final String dfa_10s = "\1\uffff\1\1\12\uffff\1\2";
    static final String dfa_11s = "\5\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\1\6\1\11\2\1\1\13\6\uffff\1\7\2\uffff\1\14\1\uffff\1\1\3\uffff\1\10\4\uffff\1\12\4\uffff\1\5",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1538:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_5 = input.LA(1);

                         
                        int index2_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index2_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_6 = input.LA(1);

                         
                        int index2_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index2_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_7 = input.LA(1);

                         
                        int index2_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index2_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA2_8 = input.LA(1);

                         
                        int index2_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index2_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA2_9 = input.LA(1);

                         
                        int index2_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index2_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA2_10 = input.LA(1);

                         
                        int index2_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index2_10);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA2_11 = input.LA(1);

                         
                        int index2_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index2_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_13s = "\14\uffff";
    static final String dfa_14s = "\1\4\3\uffff\1\0\7\uffff";
    static final String dfa_15s = "\1\43\3\uffff\1\0\7\uffff";
    static final String dfa_16s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\5\uffff\1\4";
    static final String dfa_17s = "\4\uffff\1\0\7\uffff}>";
    static final String[] dfa_18s = {
            "\1\3\2\5\1\1\1\2\1\5\6\uffff\1\5\10\uffff\1\5\4\uffff\1\5\4\uffff\1\4",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "1644:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleStringValue ) | ( ( rule__AtomicValuedExpression__Group_3__0 ) ) | ( ruleAtomicExpression ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_4 = input.LA(1);

                         
                        int index6_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalKExpressions()) ) {s = 11;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index6_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000008422903F0L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000007E0000000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000008422103F0L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000002010000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000002010040L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000910000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000008422D03F0L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000009000000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000000002L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000200080L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000200100L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000060000000000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000080L});
    }


}