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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_BOOLEAN", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_HOSTCODE", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_SL_COMMENT_ANNOTATION", "RULE_SL_COMMENT", "RULE_NUMBER", "RULE_WS", "RULE_ANY_OTHER", "'pre'", "'|'", "'&'", "'!'", "'+'", "'-'", "'*'", "'%'", "'/'", "'val'", "'||'", "'&&'", "'()'", "'.'", "'=='", "'<'", "'<='", "'>'", "'>='", "'!='", "'schedule'", "'('", "')'", "'\\''", "'['", "']'", "','", "'extern'", "'@'", "'#'"
    };
    public static final int RULE_BOOLEAN=5;
    public static final int T__19=19;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int RULE_HOSTCODE=9;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_COMMENT_ANNOTATION=10;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__37=37;
    public static final int RULE_SL_COMMENT_ANNOTATION=12;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=15;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_NUMBER=14;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=8;
    public static final int T__46=46;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
    // InternalKExpressions.g:98:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:102:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalKExpressions.g:103:1: ( ( rule__Expression__Group__0 ) )
            {
            // InternalKExpressions.g:103:1: ( ( rule__Expression__Group__0 ) )
            // InternalKExpressions.g:104:1: ( rule__Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getGroup()); 
            }
            // InternalKExpressions.g:105:1: ( rule__Expression__Group__0 )
            // InternalKExpressions.g:105:2: rule__Expression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Expression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getGroup()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRulePrimeID"
    // InternalKExpressions.g:621:1: entryRulePrimeID : rulePrimeID EOF ;
    public final void entryRulePrimeID() throws RecognitionException {
        try {
            // InternalKExpressions.g:622:1: ( rulePrimeID EOF )
            // InternalKExpressions.g:623:1: rulePrimeID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimeIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimeIDRule()); 
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
    // $ANTLR end "entryRulePrimeID"


    // $ANTLR start "rulePrimeID"
    // InternalKExpressions.g:630:1: rulePrimeID : ( ( rule__PrimeID__Group__0 ) ) ;
    public final void rulePrimeID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:634:2: ( ( ( rule__PrimeID__Group__0 ) ) )
            // InternalKExpressions.g:635:1: ( ( rule__PrimeID__Group__0 ) )
            {
            // InternalKExpressions.g:635:1: ( ( rule__PrimeID__Group__0 ) )
            // InternalKExpressions.g:636:1: ( rule__PrimeID__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimeIDAccess().getGroup()); 
            }
            // InternalKExpressions.g:637:1: ( rule__PrimeID__Group__0 )
            // InternalKExpressions.g:637:2: rule__PrimeID__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PrimeID__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimeIDAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimeID"


    // $ANTLR start "entryRuleValuedObjectReference"
    // InternalKExpressions.g:649:1: entryRuleValuedObjectReference : ruleValuedObjectReference EOF ;
    public final void entryRuleValuedObjectReference() throws RecognitionException {
        try {
            // InternalKExpressions.g:650:1: ( ruleValuedObjectReference EOF )
            // InternalKExpressions.g:651:1: ruleValuedObjectReference EOF
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
    // InternalKExpressions.g:658:1: ruleValuedObjectReference : ( ( rule__ValuedObjectReference__Group__0 ) ) ;
    public final void ruleValuedObjectReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:662:2: ( ( ( rule__ValuedObjectReference__Group__0 ) ) )
            // InternalKExpressions.g:663:1: ( ( rule__ValuedObjectReference__Group__0 ) )
            {
            // InternalKExpressions.g:663:1: ( ( rule__ValuedObjectReference__Group__0 ) )
            // InternalKExpressions.g:664:1: ( rule__ValuedObjectReference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getGroup()); 
            }
            // InternalKExpressions.g:665:1: ( rule__ValuedObjectReference__Group__0 )
            // InternalKExpressions.g:665:2: rule__ValuedObjectReference__Group__0
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


    // $ANTLR start "entryRuleScheduleObjectReference"
    // InternalKExpressions.g:677:1: entryRuleScheduleObjectReference : ruleScheduleObjectReference EOF ;
    public final void entryRuleScheduleObjectReference() throws RecognitionException {
        try {
            // InternalKExpressions.g:678:1: ( ruleScheduleObjectReference EOF )
            // InternalKExpressions.g:679:1: ruleScheduleObjectReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScheduleObjectReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleScheduleObjectReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScheduleObjectReferenceRule()); 
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
    // $ANTLR end "entryRuleScheduleObjectReference"


    // $ANTLR start "ruleScheduleObjectReference"
    // InternalKExpressions.g:686:1: ruleScheduleObjectReference : ( ( rule__ScheduleObjectReference__Group__0 ) ) ;
    public final void ruleScheduleObjectReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:690:2: ( ( ( rule__ScheduleObjectReference__Group__0 ) ) )
            // InternalKExpressions.g:691:1: ( ( rule__ScheduleObjectReference__Group__0 ) )
            {
            // InternalKExpressions.g:691:1: ( ( rule__ScheduleObjectReference__Group__0 ) )
            // InternalKExpressions.g:692:1: ( rule__ScheduleObjectReference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScheduleObjectReferenceAccess().getGroup()); 
            }
            // InternalKExpressions.g:693:1: ( rule__ScheduleObjectReference__Group__0 )
            // InternalKExpressions.g:693:2: rule__ScheduleObjectReference__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ScheduleObjectReference__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScheduleObjectReferenceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScheduleObjectReference"


    // $ANTLR start "entryRuleReferenceCall"
    // InternalKExpressions.g:705:1: entryRuleReferenceCall : ruleReferenceCall EOF ;
    public final void entryRuleReferenceCall() throws RecognitionException {
        try {
            // InternalKExpressions.g:706:1: ( ruleReferenceCall EOF )
            // InternalKExpressions.g:707:1: ruleReferenceCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceCallRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleReferenceCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceCallRule()); 
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
    // $ANTLR end "entryRuleReferenceCall"


    // $ANTLR start "ruleReferenceCall"
    // InternalKExpressions.g:714:1: ruleReferenceCall : ( ( rule__ReferenceCall__Group__0 ) ) ;
    public final void ruleReferenceCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:718:2: ( ( ( rule__ReferenceCall__Group__0 ) ) )
            // InternalKExpressions.g:719:1: ( ( rule__ReferenceCall__Group__0 ) )
            {
            // InternalKExpressions.g:719:1: ( ( rule__ReferenceCall__Group__0 ) )
            // InternalKExpressions.g:720:1: ( rule__ReferenceCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceCallAccess().getGroup()); 
            }
            // InternalKExpressions.g:721:1: ( rule__ReferenceCall__Group__0 )
            // InternalKExpressions.g:721:2: rule__ReferenceCall__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ReferenceCall__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceCallAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReferenceCall"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalKExpressions.g:733:1: entryRuleFunctionCall : ruleFunctionCall EOF ;
    public final void entryRuleFunctionCall() throws RecognitionException {
        try {
            // InternalKExpressions.g:734:1: ( ruleFunctionCall EOF )
            // InternalKExpressions.g:735:1: ruleFunctionCall EOF
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
    // InternalKExpressions.g:742:1: ruleFunctionCall : ( ( rule__FunctionCall__Alternatives ) ) ;
    public final void ruleFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:746:2: ( ( ( rule__FunctionCall__Alternatives ) ) )
            // InternalKExpressions.g:747:1: ( ( rule__FunctionCall__Alternatives ) )
            {
            // InternalKExpressions.g:747:1: ( ( rule__FunctionCall__Alternatives ) )
            // InternalKExpressions.g:748:1: ( rule__FunctionCall__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getAlternatives()); 
            }
            // InternalKExpressions.g:749:1: ( rule__FunctionCall__Alternatives )
            // InternalKExpressions.g:749:2: rule__FunctionCall__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCall__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getAlternatives()); 
            }

            }


            }

        }
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
    // InternalKExpressions.g:761:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalKExpressions.g:762:1: ( ruleParameter EOF )
            // InternalKExpressions.g:763:1: ruleParameter EOF
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
    // InternalKExpressions.g:770:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:774:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalKExpressions.g:775:1: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalKExpressions.g:775:1: ( ( rule__Parameter__Group__0 ) )
            // InternalKExpressions.g:776:1: ( rule__Parameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getGroup()); 
            }
            // InternalKExpressions.g:777:1: ( rule__Parameter__Group__0 )
            // InternalKExpressions.g:777:2: rule__Parameter__Group__0
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
    // InternalKExpressions.g:789:1: entryRuleTextExpression : ruleTextExpression EOF ;
    public final void entryRuleTextExpression() throws RecognitionException {
        try {
            // InternalKExpressions.g:790:1: ( ruleTextExpression EOF )
            // InternalKExpressions.g:791:1: ruleTextExpression EOF
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
    // InternalKExpressions.g:798:1: ruleTextExpression : ( ( rule__TextExpression__TextAssignment ) ) ;
    public final void ruleTextExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:802:2: ( ( ( rule__TextExpression__TextAssignment ) ) )
            // InternalKExpressions.g:803:1: ( ( rule__TextExpression__TextAssignment ) )
            {
            // InternalKExpressions.g:803:1: ( ( rule__TextExpression__TextAssignment ) )
            // InternalKExpressions.g:804:1: ( rule__TextExpression__TextAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getTextAssignment()); 
            }
            // InternalKExpressions.g:805:1: ( rule__TextExpression__TextAssignment )
            // InternalKExpressions.g:805:2: rule__TextExpression__TextAssignment
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
    // InternalKExpressions.g:817:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // InternalKExpressions.g:818:1: ( ruleIntValue EOF )
            // InternalKExpressions.g:819:1: ruleIntValue EOF
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
    // InternalKExpressions.g:826:1: ruleIntValue : ( ( rule__IntValue__ValueAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:830:2: ( ( ( rule__IntValue__ValueAssignment ) ) )
            // InternalKExpressions.g:831:1: ( ( rule__IntValue__ValueAssignment ) )
            {
            // InternalKExpressions.g:831:1: ( ( rule__IntValue__ValueAssignment ) )
            // InternalKExpressions.g:832:1: ( rule__IntValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            }
            // InternalKExpressions.g:833:1: ( rule__IntValue__ValueAssignment )
            // InternalKExpressions.g:833:2: rule__IntValue__ValueAssignment
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
    // InternalKExpressions.g:845:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // InternalKExpressions.g:846:1: ( ruleFloatValue EOF )
            // InternalKExpressions.g:847:1: ruleFloatValue EOF
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
    // InternalKExpressions.g:854:1: ruleFloatValue : ( ( rule__FloatValue__ValueAssignment ) ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:858:2: ( ( ( rule__FloatValue__ValueAssignment ) ) )
            // InternalKExpressions.g:859:1: ( ( rule__FloatValue__ValueAssignment ) )
            {
            // InternalKExpressions.g:859:1: ( ( rule__FloatValue__ValueAssignment ) )
            // InternalKExpressions.g:860:1: ( rule__FloatValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueAssignment()); 
            }
            // InternalKExpressions.g:861:1: ( rule__FloatValue__ValueAssignment )
            // InternalKExpressions.g:861:2: rule__FloatValue__ValueAssignment
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
    // InternalKExpressions.g:873:1: entryRuleBoolValue : ruleBoolValue EOF ;
    public final void entryRuleBoolValue() throws RecognitionException {
        try {
            // InternalKExpressions.g:874:1: ( ruleBoolValue EOF )
            // InternalKExpressions.g:875:1: ruleBoolValue EOF
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
    // InternalKExpressions.g:882:1: ruleBoolValue : ( ( rule__BoolValue__ValueAssignment ) ) ;
    public final void ruleBoolValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:886:2: ( ( ( rule__BoolValue__ValueAssignment ) ) )
            // InternalKExpressions.g:887:1: ( ( rule__BoolValue__ValueAssignment ) )
            {
            // InternalKExpressions.g:887:1: ( ( rule__BoolValue__ValueAssignment ) )
            // InternalKExpressions.g:888:1: ( rule__BoolValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolValueAccess().getValueAssignment()); 
            }
            // InternalKExpressions.g:889:1: ( rule__BoolValue__ValueAssignment )
            // InternalKExpressions.g:889:2: rule__BoolValue__ValueAssignment
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
    // InternalKExpressions.g:901:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalKExpressions.g:902:1: ( ruleStringValue EOF )
            // InternalKExpressions.g:903:1: ruleStringValue EOF
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
    // InternalKExpressions.g:910:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:914:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // InternalKExpressions.g:915:1: ( ( rule__StringValue__ValueAssignment ) )
            {
            // InternalKExpressions.g:915:1: ( ( rule__StringValue__ValueAssignment ) )
            // InternalKExpressions.g:916:1: ( rule__StringValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            }
            // InternalKExpressions.g:917:1: ( rule__StringValue__ValueAssignment )
            // InternalKExpressions.g:917:2: rule__StringValue__ValueAssignment
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
    // InternalKExpressions.g:943:1: entryRuleCommentAnnotation : ruleCommentAnnotation EOF ;
    public final void entryRuleCommentAnnotation() throws RecognitionException {
        try {
            // InternalKExpressions.g:944:1: ( ruleCommentAnnotation EOF )
            // InternalKExpressions.g:945:1: ruleCommentAnnotation EOF
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
    // InternalKExpressions.g:952:1: ruleCommentAnnotation : ( ( rule__CommentAnnotation__ValuesAssignment ) ) ;
    public final void ruleCommentAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:956:2: ( ( ( rule__CommentAnnotation__ValuesAssignment ) ) )
            // InternalKExpressions.g:957:1: ( ( rule__CommentAnnotation__ValuesAssignment ) )
            {
            // InternalKExpressions.g:957:1: ( ( rule__CommentAnnotation__ValuesAssignment ) )
            // InternalKExpressions.g:958:1: ( rule__CommentAnnotation__ValuesAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationAccess().getValuesAssignment()); 
            }
            // InternalKExpressions.g:959:1: ( rule__CommentAnnotation__ValuesAssignment )
            // InternalKExpressions.g:959:2: rule__CommentAnnotation__ValuesAssignment
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
    // InternalKExpressions.g:973:1: entryRuleTagAnnotation : ruleTagAnnotation EOF ;
    public final void entryRuleTagAnnotation() throws RecognitionException {
        try {
            // InternalKExpressions.g:974:1: ( ruleTagAnnotation EOF )
            // InternalKExpressions.g:975:1: ruleTagAnnotation EOF
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
    // InternalKExpressions.g:982:1: ruleTagAnnotation : ( ( rule__TagAnnotation__Group__0 ) ) ;
    public final void ruleTagAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:986:2: ( ( ( rule__TagAnnotation__Group__0 ) ) )
            // InternalKExpressions.g:987:1: ( ( rule__TagAnnotation__Group__0 ) )
            {
            // InternalKExpressions.g:987:1: ( ( rule__TagAnnotation__Group__0 ) )
            // InternalKExpressions.g:988:1: ( rule__TagAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getGroup()); 
            }
            // InternalKExpressions.g:989:1: ( rule__TagAnnotation__Group__0 )
            // InternalKExpressions.g:989:2: rule__TagAnnotation__Group__0
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


    // $ANTLR start "entryRulePragmaTag"
    // InternalKExpressions.g:1001:1: entryRulePragmaTag : rulePragmaTag EOF ;
    public final void entryRulePragmaTag() throws RecognitionException {
        try {
            // InternalKExpressions.g:1002:1: ( rulePragmaTag EOF )
            // InternalKExpressions.g:1003:1: rulePragmaTag EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPragmaTagRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            rulePragmaTag();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPragmaTagRule()); 
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
    // $ANTLR end "entryRulePragmaTag"


    // $ANTLR start "rulePragmaTag"
    // InternalKExpressions.g:1010:1: rulePragmaTag : ( ( rule__PragmaTag__Group__0 ) ) ;
    public final void rulePragmaTag() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1014:2: ( ( ( rule__PragmaTag__Group__0 ) ) )
            // InternalKExpressions.g:1015:1: ( ( rule__PragmaTag__Group__0 ) )
            {
            // InternalKExpressions.g:1015:1: ( ( rule__PragmaTag__Group__0 ) )
            // InternalKExpressions.g:1016:1: ( rule__PragmaTag__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPragmaTagAccess().getGroup()); 
            }
            // InternalKExpressions.g:1017:1: ( rule__PragmaTag__Group__0 )
            // InternalKExpressions.g:1017:2: rule__PragmaTag__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PragmaTag__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPragmaTagAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePragmaTag"


    // $ANTLR start "entryRuleKeyStringValueAnnotation"
    // InternalKExpressions.g:1029:1: entryRuleKeyStringValueAnnotation : ruleKeyStringValueAnnotation EOF ;
    public final void entryRuleKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKExpressions.g:1030:1: ( ruleKeyStringValueAnnotation EOF )
            // InternalKExpressions.g:1031:1: ruleKeyStringValueAnnotation EOF
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
    // InternalKExpressions.g:1038:1: ruleKeyStringValueAnnotation : ( ( rule__KeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1042:2: ( ( ( rule__KeyStringValueAnnotation__Group__0 ) ) )
            // InternalKExpressions.g:1043:1: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKExpressions.g:1043:1: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            // InternalKExpressions.g:1044:1: ( rule__KeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKExpressions.g:1045:1: ( rule__KeyStringValueAnnotation__Group__0 )
            // InternalKExpressions.g:1045:2: rule__KeyStringValueAnnotation__Group__0
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


    // $ANTLR start "entryRuleRestrictedKeyStringValueAnnotation"
    // InternalKExpressions.g:1057:1: entryRuleRestrictedKeyStringValueAnnotation : ruleRestrictedKeyStringValueAnnotation EOF ;
    public final void entryRuleRestrictedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKExpressions.g:1058:1: ( ruleRestrictedKeyStringValueAnnotation EOF )
            // InternalKExpressions.g:1059:1: ruleRestrictedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleRestrictedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedKeyStringValueAnnotationRule()); 
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
    // $ANTLR end "entryRuleRestrictedKeyStringValueAnnotation"


    // $ANTLR start "ruleRestrictedKeyStringValueAnnotation"
    // InternalKExpressions.g:1066:1: ruleRestrictedKeyStringValueAnnotation : ( ( rule__RestrictedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleRestrictedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1070:2: ( ( ( rule__RestrictedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKExpressions.g:1071:1: ( ( rule__RestrictedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKExpressions.g:1071:1: ( ( rule__RestrictedKeyStringValueAnnotation__Group__0 ) )
            // InternalKExpressions.g:1072:1: ( rule__RestrictedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKExpressions.g:1073:1: ( rule__RestrictedKeyStringValueAnnotation__Group__0 )
            // InternalKExpressions.g:1073:2: rule__RestrictedKeyStringValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedKeyStringValueAnnotation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRestrictedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleStringPragma"
    // InternalKExpressions.g:1085:1: entryRuleStringPragma : ruleStringPragma EOF ;
    public final void entryRuleStringPragma() throws RecognitionException {
        try {
            // InternalKExpressions.g:1086:1: ( ruleStringPragma EOF )
            // InternalKExpressions.g:1087:1: ruleStringPragma EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPragmaRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleStringPragma();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringPragmaRule()); 
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
    // $ANTLR end "entryRuleStringPragma"


    // $ANTLR start "ruleStringPragma"
    // InternalKExpressions.g:1094:1: ruleStringPragma : ( ( rule__StringPragma__Group__0 ) ) ;
    public final void ruleStringPragma() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1098:2: ( ( ( rule__StringPragma__Group__0 ) ) )
            // InternalKExpressions.g:1099:1: ( ( rule__StringPragma__Group__0 ) )
            {
            // InternalKExpressions.g:1099:1: ( ( rule__StringPragma__Group__0 ) )
            // InternalKExpressions.g:1100:1: ( rule__StringPragma__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPragmaAccess().getGroup()); 
            }
            // InternalKExpressions.g:1101:1: ( rule__StringPragma__Group__0 )
            // InternalKExpressions.g:1101:2: rule__StringPragma__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringPragma__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringPragmaAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringPragma"


    // $ANTLR start "entryRuleTypedKeyStringValueAnnotation"
    // InternalKExpressions.g:1113:1: entryRuleTypedKeyStringValueAnnotation : ruleTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKExpressions.g:1114:1: ( ruleTypedKeyStringValueAnnotation EOF )
            // InternalKExpressions.g:1115:1: ruleTypedKeyStringValueAnnotation EOF
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
    // InternalKExpressions.g:1122:1: ruleTypedKeyStringValueAnnotation : ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1126:2: ( ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKExpressions.g:1127:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKExpressions.g:1127:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            // InternalKExpressions.g:1128:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKExpressions.g:1129:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            // InternalKExpressions.g:1129:2: rule__TypedKeyStringValueAnnotation__Group__0
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


    // $ANTLR start "entryRuleRestrictedTypedKeyStringValueAnnotation"
    // InternalKExpressions.g:1141:1: entryRuleRestrictedTypedKeyStringValueAnnotation : ruleRestrictedTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleRestrictedTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKExpressions.g:1142:1: ( ruleRestrictedTypedKeyStringValueAnnotation EOF )
            // InternalKExpressions.g:1143:1: ruleRestrictedTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleRestrictedTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationRule()); 
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
    // $ANTLR end "entryRuleRestrictedTypedKeyStringValueAnnotation"


    // $ANTLR start "ruleRestrictedTypedKeyStringValueAnnotation"
    // InternalKExpressions.g:1150:1: ruleRestrictedTypedKeyStringValueAnnotation : ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleRestrictedTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1154:2: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKExpressions.g:1155:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKExpressions.g:1155:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 ) )
            // InternalKExpressions.g:1156:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKExpressions.g:1157:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 )
            // InternalKExpressions.g:1157:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRestrictedTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleQuotedKeyStringValueAnnotation"
    // InternalKExpressions.g:1169:1: entryRuleQuotedKeyStringValueAnnotation : ruleQuotedKeyStringValueAnnotation EOF ;
    public final void entryRuleQuotedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKExpressions.g:1170:1: ( ruleQuotedKeyStringValueAnnotation EOF )
            // InternalKExpressions.g:1171:1: ruleQuotedKeyStringValueAnnotation EOF
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
    // InternalKExpressions.g:1178:1: ruleQuotedKeyStringValueAnnotation : ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleQuotedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1182:2: ( ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKExpressions.g:1183:1: ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKExpressions.g:1183:1: ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) )
            // InternalKExpressions.g:1184:1: ( rule__QuotedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKExpressions.g:1185:1: ( rule__QuotedKeyStringValueAnnotation__Group__0 )
            // InternalKExpressions.g:1185:2: rule__QuotedKeyStringValueAnnotation__Group__0
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
    // InternalKExpressions.g:1197:1: entryRuleQuotedTypedKeyStringValueAnnotation : ruleQuotedTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKExpressions.g:1198:1: ( ruleQuotedTypedKeyStringValueAnnotation EOF )
            // InternalKExpressions.g:1199:1: ruleQuotedTypedKeyStringValueAnnotation EOF
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
    // InternalKExpressions.g:1206:1: ruleQuotedTypedKeyStringValueAnnotation : ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1210:2: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKExpressions.g:1211:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKExpressions.g:1211:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) )
            // InternalKExpressions.g:1212:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKExpressions.g:1213:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 )
            // InternalKExpressions.g:1213:2: rule__QuotedTypedKeyStringValueAnnotation__Group__0
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


    // $ANTLR start "entryRuleEStringBoolean"
    // InternalKExpressions.g:1227:1: entryRuleEStringBoolean : ruleEStringBoolean EOF ;
    public final void entryRuleEStringBoolean() throws RecognitionException {
        try {
            // InternalKExpressions.g:1228:1: ( ruleEStringBoolean EOF )
            // InternalKExpressions.g:1229:1: ruleEStringBoolean EOF
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
    // InternalKExpressions.g:1236:1: ruleEStringBoolean : ( ( rule__EStringBoolean__Alternatives ) ) ;
    public final void ruleEStringBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1240:2: ( ( ( rule__EStringBoolean__Alternatives ) ) )
            // InternalKExpressions.g:1241:1: ( ( rule__EStringBoolean__Alternatives ) )
            {
            // InternalKExpressions.g:1241:1: ( ( rule__EStringBoolean__Alternatives ) )
            // InternalKExpressions.g:1242:1: ( rule__EStringBoolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringBooleanAccess().getAlternatives()); 
            }
            // InternalKExpressions.g:1243:1: ( rule__EStringBoolean__Alternatives )
            // InternalKExpressions.g:1243:2: rule__EStringBoolean__Alternatives
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


    // $ANTLR start "entryRuleEStringAllTypes"
    // InternalKExpressions.g:1255:1: entryRuleEStringAllTypes : ruleEStringAllTypes EOF ;
    public final void entryRuleEStringAllTypes() throws RecognitionException {
        try {
            // InternalKExpressions.g:1256:1: ( ruleEStringAllTypes EOF )
            // InternalKExpressions.g:1257:1: ruleEStringAllTypes EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAllTypesRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEStringAllTypes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringAllTypesRule()); 
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
    // $ANTLR end "entryRuleEStringAllTypes"


    // $ANTLR start "ruleEStringAllTypes"
    // InternalKExpressions.g:1264:1: ruleEStringAllTypes : ( ( rule__EStringAllTypes__Alternatives ) ) ;
    public final void ruleEStringAllTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1268:2: ( ( ( rule__EStringAllTypes__Alternatives ) ) )
            // InternalKExpressions.g:1269:1: ( ( rule__EStringAllTypes__Alternatives ) )
            {
            // InternalKExpressions.g:1269:1: ( ( rule__EStringAllTypes__Alternatives ) )
            // InternalKExpressions.g:1270:1: ( rule__EStringAllTypes__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAllTypesAccess().getAlternatives()); 
            }
            // InternalKExpressions.g:1271:1: ( rule__EStringAllTypes__Alternatives )
            // InternalKExpressions.g:1271:2: rule__EStringAllTypes__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EStringAllTypes__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringAllTypesAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEStringAllTypes"


    // $ANTLR start "entryRuleExtendedID"
    // InternalKExpressions.g:1283:1: entryRuleExtendedID : ruleExtendedID EOF ;
    public final void entryRuleExtendedID() throws RecognitionException {
        try {
            // InternalKExpressions.g:1284:1: ( ruleExtendedID EOF )
            // InternalKExpressions.g:1285:1: ruleExtendedID EOF
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
    // InternalKExpressions.g:1292:1: ruleExtendedID : ( ( rule__ExtendedID__Group__0 ) ) ;
    public final void ruleExtendedID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1296:2: ( ( ( rule__ExtendedID__Group__0 ) ) )
            // InternalKExpressions.g:1297:1: ( ( rule__ExtendedID__Group__0 ) )
            {
            // InternalKExpressions.g:1297:1: ( ( rule__ExtendedID__Group__0 ) )
            // InternalKExpressions.g:1298:1: ( rule__ExtendedID__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup()); 
            }
            // InternalKExpressions.g:1299:1: ( rule__ExtendedID__Group__0 )
            // InternalKExpressions.g:1299:2: rule__ExtendedID__Group__0
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
    // InternalKExpressions.g:1313:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // InternalKExpressions.g:1314:1: ( ruleInteger EOF )
            // InternalKExpressions.g:1315:1: ruleInteger EOF
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
    // InternalKExpressions.g:1322:1: ruleInteger : ( ( rule__Integer__Group__0 ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1326:2: ( ( ( rule__Integer__Group__0 ) ) )
            // InternalKExpressions.g:1327:1: ( ( rule__Integer__Group__0 ) )
            {
            // InternalKExpressions.g:1327:1: ( ( rule__Integer__Group__0 ) )
            // InternalKExpressions.g:1328:1: ( rule__Integer__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getGroup()); 
            }
            // InternalKExpressions.g:1329:1: ( rule__Integer__Group__0 )
            // InternalKExpressions.g:1329:2: rule__Integer__Group__0
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
    // InternalKExpressions.g:1341:1: entryRuleFloateger : ruleFloateger EOF ;
    public final void entryRuleFloateger() throws RecognitionException {
        try {
            // InternalKExpressions.g:1342:1: ( ruleFloateger EOF )
            // InternalKExpressions.g:1343:1: ruleFloateger EOF
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
    // InternalKExpressions.g:1350:1: ruleFloateger : ( ( rule__Floateger__Group__0 ) ) ;
    public final void ruleFloateger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1354:2: ( ( ( rule__Floateger__Group__0 ) ) )
            // InternalKExpressions.g:1355:1: ( ( rule__Floateger__Group__0 ) )
            {
            // InternalKExpressions.g:1355:1: ( ( rule__Floateger__Group__0 ) )
            // InternalKExpressions.g:1356:1: ( rule__Floateger__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloategerAccess().getGroup()); 
            }
            // InternalKExpressions.g:1357:1: ( rule__Floateger__Group__0 )
            // InternalKExpressions.g:1357:2: rule__Floateger__Group__0
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
    // InternalKExpressions.g:1370:1: ruleCompareOperator : ( ( rule__CompareOperator__Alternatives ) ) ;
    public final void ruleCompareOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1374:1: ( ( ( rule__CompareOperator__Alternatives ) ) )
            // InternalKExpressions.g:1375:1: ( ( rule__CompareOperator__Alternatives ) )
            {
            // InternalKExpressions.g:1375:1: ( ( rule__CompareOperator__Alternatives ) )
            // InternalKExpressions.g:1376:1: ( rule__CompareOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            }
            // InternalKExpressions.g:1377:1: ( rule__CompareOperator__Alternatives )
            // InternalKExpressions.g:1377:2: rule__CompareOperator__Alternatives
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
    // InternalKExpressions.g:1389:1: rulePreOperator : ( ( 'pre' ) ) ;
    public final void rulePreOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1393:1: ( ( ( 'pre' ) ) )
            // InternalKExpressions.g:1394:1: ( ( 'pre' ) )
            {
            // InternalKExpressions.g:1394:1: ( ( 'pre' ) )
            // InternalKExpressions.g:1395:1: ( 'pre' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreOperatorAccess().getPREEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1396:1: ( 'pre' )
            // InternalKExpressions.g:1396:3: 'pre'
            {
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalKExpressions.g:1409:1: ruleBitwiseOrOperator : ( ( '|' ) ) ;
    public final void ruleBitwiseOrOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1413:1: ( ( ( '|' ) ) )
            // InternalKExpressions.g:1414:1: ( ( '|' ) )
            {
            // InternalKExpressions.g:1414:1: ( ( '|' ) )
            // InternalKExpressions.g:1415:1: ( '|' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrOperatorAccess().getBITWISE_OREnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1416:1: ( '|' )
            // InternalKExpressions.g:1416:3: '|'
            {
            match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalKExpressions.g:1429:1: ruleBitwiseAndOperator : ( ( '&' ) ) ;
    public final void ruleBitwiseAndOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1433:1: ( ( ( '&' ) ) )
            // InternalKExpressions.g:1434:1: ( ( '&' ) )
            {
            // InternalKExpressions.g:1434:1: ( ( '&' ) )
            // InternalKExpressions.g:1435:1: ( '&' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndOperatorAccess().getBITWISE_ANDEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1436:1: ( '&' )
            // InternalKExpressions.g:1436:3: '&'
            {
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalKExpressions.g:1449:1: ruleNotOperator : ( ( '!' ) ) ;
    public final void ruleNotOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1453:1: ( ( ( '!' ) ) )
            // InternalKExpressions.g:1454:1: ( ( '!' ) )
            {
            // InternalKExpressions.g:1454:1: ( ( '!' ) )
            // InternalKExpressions.g:1455:1: ( '!' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1456:1: ( '!' )
            // InternalKExpressions.g:1456:3: '!'
            {
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalKExpressions.g:1469:1: ruleAddOperator : ( ( '+' ) ) ;
    public final void ruleAddOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1473:1: ( ( ( '+' ) ) )
            // InternalKExpressions.g:1474:1: ( ( '+' ) )
            {
            // InternalKExpressions.g:1474:1: ( ( '+' ) )
            // InternalKExpressions.g:1475:1: ( '+' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddOperatorAccess().getADDEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1476:1: ( '+' )
            // InternalKExpressions.g:1476:3: '+'
            {
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalKExpressions.g:1489:1: ruleSubOperator : ( ( '-' ) ) ;
    public final void ruleSubOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1493:1: ( ( ( '-' ) ) )
            // InternalKExpressions.g:1494:1: ( ( '-' ) )
            {
            // InternalKExpressions.g:1494:1: ( ( '-' ) )
            // InternalKExpressions.g:1495:1: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubOperatorAccess().getSUBEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1496:1: ( '-' )
            // InternalKExpressions.g:1496:3: '-'
            {
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalKExpressions.g:1509:1: ruleMultOperator : ( ( '*' ) ) ;
    public final void ruleMultOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1513:1: ( ( ( '*' ) ) )
            // InternalKExpressions.g:1514:1: ( ( '*' ) )
            {
            // InternalKExpressions.g:1514:1: ( ( '*' ) )
            // InternalKExpressions.g:1515:1: ( '*' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1516:1: ( '*' )
            // InternalKExpressions.g:1516:3: '*'
            {
            match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalKExpressions.g:1529:1: ruleModOperator : ( ( '%' ) ) ;
    public final void ruleModOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1533:1: ( ( ( '%' ) ) )
            // InternalKExpressions.g:1534:1: ( ( '%' ) )
            {
            // InternalKExpressions.g:1534:1: ( ( '%' ) )
            // InternalKExpressions.g:1535:1: ( '%' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModOperatorAccess().getMODEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1536:1: ( '%' )
            // InternalKExpressions.g:1536:3: '%'
            {
            match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalKExpressions.g:1549:1: ruleDivOperator : ( ( '/' ) ) ;
    public final void ruleDivOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1553:1: ( ( ( '/' ) ) )
            // InternalKExpressions.g:1554:1: ( ( '/' ) )
            {
            // InternalKExpressions.g:1554:1: ( ( '/' ) )
            // InternalKExpressions.g:1555:1: ( '/' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivOperatorAccess().getDIVEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1556:1: ( '/' )
            // InternalKExpressions.g:1556:3: '/'
            {
            match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalKExpressions.g:1569:1: ruleValOperator : ( ( 'val' ) ) ;
    public final void ruleValOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1573:1: ( ( ( 'val' ) ) )
            // InternalKExpressions.g:1574:1: ( ( 'val' ) )
            {
            // InternalKExpressions.g:1574:1: ( ( 'val' ) )
            // InternalKExpressions.g:1575:1: ( 'val' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValOperatorAccess().getVALEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1576:1: ( 'val' )
            // InternalKExpressions.g:1576:3: 'val'
            {
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalKExpressions.g:1589:1: ruleLogicalOrOperator : ( ( '||' ) ) ;
    public final void ruleLogicalOrOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1593:1: ( ( ( '||' ) ) )
            // InternalKExpressions.g:1594:1: ( ( '||' ) )
            {
            // InternalKExpressions.g:1594:1: ( ( '||' ) )
            // InternalKExpressions.g:1595:1: ( '||' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrOperatorAccess().getLOGICAL_OREnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1596:1: ( '||' )
            // InternalKExpressions.g:1596:3: '||'
            {
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalKExpressions.g:1609:1: ruleLogicalAndOperator : ( ( '&&' ) ) ;
    public final void ruleLogicalAndOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1613:1: ( ( ( '&&' ) ) )
            // InternalKExpressions.g:1614:1: ( ( '&&' ) )
            {
            // InternalKExpressions.g:1614:1: ( ( '&&' ) )
            // InternalKExpressions.g:1615:1: ( '&&' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndOperatorAccess().getLOGICAL_ANDEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1616:1: ( '&&' )
            // InternalKExpressions.g:1616:3: '&&'
            {
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;

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


    // $ANTLR start "rule__Expression__Alternatives_0"
    // InternalKExpressions.g:1638:1: rule__Expression__Alternatives_0 : ( ( ruleBoolExpression ) | ( ruleValuedExpression ) );
    public final void rule__Expression__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1642:1: ( ( ruleBoolExpression ) | ( ruleValuedExpression ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalKExpressions.g:1643:1: ( ruleBoolExpression )
                    {
                    // InternalKExpressions.g:1643:1: ( ruleBoolExpression )
                    // InternalKExpressions.g:1644:1: ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getBoolExpressionParserRuleCall_0_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getBoolExpressionParserRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:1649:6: ( ruleValuedExpression )
                    {
                    // InternalKExpressions.g:1649:6: ( ruleValuedExpression )
                    // InternalKExpressions.g:1650:1: ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_0_1()); 
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
    // $ANTLR end "rule__Expression__Alternatives_0"


    // $ANTLR start "rule__NotOrValuedExpression__Alternatives"
    // InternalKExpressions.g:1660:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );
    public final void rule__NotOrValuedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1664:1: ( ( ruleValuedExpression ) | ( ruleNotExpression ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalKExpressions.g:1665:1: ( ruleValuedExpression )
                    {
                    // InternalKExpressions.g:1665:1: ( ruleValuedExpression )
                    // InternalKExpressions.g:1666:1: ruleValuedExpression
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
                    // InternalKExpressions.g:1671:6: ( ruleNotExpression )
                    {
                    // InternalKExpressions.g:1671:6: ( ruleNotExpression )
                    // InternalKExpressions.g:1672:1: ruleNotExpression
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
    // InternalKExpressions.g:1682:1: rule__NotExpression__Alternatives : ( ( ( rule__NotExpression__Group_0__0 ) ) | ( ruleAtomicExpression ) );
    public final void rule__NotExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1686:1: ( ( ( rule__NotExpression__Group_0__0 ) ) | ( ruleAtomicExpression ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=RULE_BOOLEAN && LA3_0<=RULE_ID)||LA3_0==RULE_HOSTCODE||LA3_0==17||LA3_0==26||LA3_0==32||LA3_0==38||LA3_0==44) ) {
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
                    // InternalKExpressions.g:1687:1: ( ( rule__NotExpression__Group_0__0 ) )
                    {
                    // InternalKExpressions.g:1687:1: ( ( rule__NotExpression__Group_0__0 ) )
                    // InternalKExpressions.g:1688:1: ( rule__NotExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNotExpressionAccess().getGroup_0()); 
                    }
                    // InternalKExpressions.g:1689:1: ( rule__NotExpression__Group_0__0 )
                    // InternalKExpressions.g:1689:2: rule__NotExpression__Group_0__0
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
                    // InternalKExpressions.g:1693:6: ( ruleAtomicExpression )
                    {
                    // InternalKExpressions.g:1693:6: ( ruleAtomicExpression )
                    // InternalKExpressions.g:1694:1: ruleAtomicExpression
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
    // InternalKExpressions.g:1704:1: rule__NegExpression__Alternatives : ( ( ( rule__NegExpression__Group_0__0 ) ) | ( ruleAtomicValuedExpression ) );
    public final void rule__NegExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1708:1: ( ( ( rule__NegExpression__Group_0__0 ) ) | ( ruleAtomicValuedExpression ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_HOSTCODE)||LA4_0==17||LA4_0==26||LA4_0==32||LA4_0==38||LA4_0==44) ) {
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
                    // InternalKExpressions.g:1709:1: ( ( rule__NegExpression__Group_0__0 ) )
                    {
                    // InternalKExpressions.g:1709:1: ( ( rule__NegExpression__Group_0__0 ) )
                    // InternalKExpressions.g:1710:1: ( rule__NegExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNegExpressionAccess().getGroup_0()); 
                    }
                    // InternalKExpressions.g:1711:1: ( rule__NegExpression__Group_0__0 )
                    // InternalKExpressions.g:1711:2: rule__NegExpression__Group_0__0
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
                    // InternalKExpressions.g:1715:6: ( ruleAtomicValuedExpression )
                    {
                    // InternalKExpressions.g:1715:6: ( ruleAtomicValuedExpression )
                    // InternalKExpressions.g:1716:1: ruleAtomicValuedExpression
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
    // InternalKExpressions.g:1726:1: rule__AtomicExpression__Alternatives : ( ( ruleBoolValue ) | ( ruleValuedObjectTestExpression ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ruleReferenceCall ) | ( ruleFunctionCall ) | ( ruleTextExpression ) );
    public final void rule__AtomicExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1730:1: ( ( ruleBoolValue ) | ( ruleValuedObjectTestExpression ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ruleReferenceCall ) | ( ruleFunctionCall ) | ( ruleTextExpression ) )
            int alt5=6;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalKExpressions.g:1731:1: ( ruleBoolValue )
                    {
                    // InternalKExpressions.g:1731:1: ( ruleBoolValue )
                    // InternalKExpressions.g:1732:1: ruleBoolValue
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
                    // InternalKExpressions.g:1737:6: ( ruleValuedObjectTestExpression )
                    {
                    // InternalKExpressions.g:1737:6: ( ruleValuedObjectTestExpression )
                    // InternalKExpressions.g:1738:1: ruleValuedObjectTestExpression
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
                    // InternalKExpressions.g:1743:6: ( ( rule__AtomicExpression__Group_2__0 ) )
                    {
                    // InternalKExpressions.g:1743:6: ( ( rule__AtomicExpression__Group_2__0 ) )
                    // InternalKExpressions.g:1744:1: ( rule__AtomicExpression__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getGroup_2()); 
                    }
                    // InternalKExpressions.g:1745:1: ( rule__AtomicExpression__Group_2__0 )
                    // InternalKExpressions.g:1745:2: rule__AtomicExpression__Group_2__0
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
                    // InternalKExpressions.g:1749:6: ( ruleReferenceCall )
                    {
                    // InternalKExpressions.g:1749:6: ( ruleReferenceCall )
                    // InternalKExpressions.g:1750:1: ruleReferenceCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getReferenceCallParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleReferenceCall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicExpressionAccess().getReferenceCallParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKExpressions.g:1755:6: ( ruleFunctionCall )
                    {
                    // InternalKExpressions.g:1755:6: ( ruleFunctionCall )
                    // InternalKExpressions.g:1756:1: ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getFunctionCallParserRuleCall_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicExpressionAccess().getFunctionCallParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKExpressions.g:1761:6: ( ruleTextExpression )
                    {
                    // InternalKExpressions.g:1761:6: ( ruleTextExpression )
                    // InternalKExpressions.g:1762:1: ruleTextExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_5()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTextExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_5()); 
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
    // InternalKExpressions.g:1772:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleStringValue ) | ( ( rule__AtomicValuedExpression__Group_3__0 ) ) | ( ruleAtomicExpression ) );
    public final void rule__AtomicValuedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1776:1: ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleStringValue ) | ( ( rule__AtomicValuedExpression__Group_3__0 ) ) | ( ruleAtomicExpression ) )
            int alt6=5;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalKExpressions.g:1777:1: ( ruleIntValue )
                    {
                    // InternalKExpressions.g:1777:1: ( ruleIntValue )
                    // InternalKExpressions.g:1778:1: ruleIntValue
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
                    // InternalKExpressions.g:1783:6: ( ruleFloatValue )
                    {
                    // InternalKExpressions.g:1783:6: ( ruleFloatValue )
                    // InternalKExpressions.g:1784:1: ruleFloatValue
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
                    // InternalKExpressions.g:1789:6: ( ruleStringValue )
                    {
                    // InternalKExpressions.g:1789:6: ( ruleStringValue )
                    // InternalKExpressions.g:1790:1: ruleStringValue
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
                    // InternalKExpressions.g:1795:6: ( ( rule__AtomicValuedExpression__Group_3__0 ) )
                    {
                    // InternalKExpressions.g:1795:6: ( ( rule__AtomicValuedExpression__Group_3__0 ) )
                    // InternalKExpressions.g:1796:1: ( rule__AtomicValuedExpression__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_3()); 
                    }
                    // InternalKExpressions.g:1797:1: ( rule__AtomicValuedExpression__Group_3__0 )
                    // InternalKExpressions.g:1797:2: rule__AtomicValuedExpression__Group_3__0
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
                    // InternalKExpressions.g:1801:6: ( ruleAtomicExpression )
                    {
                    // InternalKExpressions.g:1801:6: ( ruleAtomicExpression )
                    // InternalKExpressions.g:1802:1: ruleAtomicExpression
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
    // InternalKExpressions.g:1812:1: rule__ValuedObjectTestExpression__Alternatives : ( ( ( rule__ValuedObjectTestExpression__Group_0__0 ) ) | ( ruleValuedObjectReference ) );
    public final void rule__ValuedObjectTestExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1816:1: ( ( ( rule__ValuedObjectTestExpression__Group_0__0 ) ) | ( ruleValuedObjectReference ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17||LA7_0==26) ) {
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
                    // InternalKExpressions.g:1817:1: ( ( rule__ValuedObjectTestExpression__Group_0__0 ) )
                    {
                    // InternalKExpressions.g:1817:1: ( ( rule__ValuedObjectTestExpression__Group_0__0 ) )
                    // InternalKExpressions.g:1818:1: ( rule__ValuedObjectTestExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getGroup_0()); 
                    }
                    // InternalKExpressions.g:1819:1: ( rule__ValuedObjectTestExpression__Group_0__0 )
                    // InternalKExpressions.g:1819:2: rule__ValuedObjectTestExpression__Group_0__0
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
                    // InternalKExpressions.g:1823:6: ( ruleValuedObjectReference )
                    {
                    // InternalKExpressions.g:1823:6: ( ruleValuedObjectReference )
                    // InternalKExpressions.g:1824:1: ruleValuedObjectReference
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
    // InternalKExpressions.g:1834:1: rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 : ( ( rulePreOperator ) | ( ruleValOperator ) );
    public final void rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1838:1: ( ( rulePreOperator ) | ( ruleValOperator ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            else if ( (LA8_0==26) ) {
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
                    // InternalKExpressions.g:1839:1: ( rulePreOperator )
                    {
                    // InternalKExpressions.g:1839:1: ( rulePreOperator )
                    // InternalKExpressions.g:1840:1: rulePreOperator
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
                    // InternalKExpressions.g:1845:6: ( ruleValOperator )
                    {
                    // InternalKExpressions.g:1845:6: ( ruleValOperator )
                    // InternalKExpressions.g:1846:1: ruleValOperator
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


    // $ANTLR start "rule__ReferenceCall__Alternatives_1"
    // InternalKExpressions.g:1856:1: rule__ReferenceCall__Alternatives_1 : ( ( ( rule__ReferenceCall__Group_1_0__0 ) ) | ( '()' ) );
    public final void rule__ReferenceCall__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1860:1: ( ( ( rule__ReferenceCall__Group_1_0__0 ) ) | ( '()' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==38) ) {
                alt9=1;
            }
            else if ( (LA9_0==29) ) {
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
                    // InternalKExpressions.g:1861:1: ( ( rule__ReferenceCall__Group_1_0__0 ) )
                    {
                    // InternalKExpressions.g:1861:1: ( ( rule__ReferenceCall__Group_1_0__0 ) )
                    // InternalKExpressions.g:1862:1: ( rule__ReferenceCall__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReferenceCallAccess().getGroup_1_0()); 
                    }
                    // InternalKExpressions.g:1863:1: ( rule__ReferenceCall__Group_1_0__0 )
                    // InternalKExpressions.g:1863:2: rule__ReferenceCall__Group_1_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ReferenceCall__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReferenceCallAccess().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:1867:6: ( '()' )
                    {
                    // InternalKExpressions.g:1867:6: ( '()' )
                    // InternalKExpressions.g:1868:1: '()'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReferenceCallAccess().getLeftParenthesisRightParenthesisKeyword_1_1()); 
                    }
                    match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReferenceCallAccess().getLeftParenthesisRightParenthesisKeyword_1_1()); 
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
    // $ANTLR end "rule__ReferenceCall__Alternatives_1"


    // $ANTLR start "rule__FunctionCall__Alternatives"
    // InternalKExpressions.g:1880:1: rule__FunctionCall__Alternatives : ( ( ( rule__FunctionCall__Group_0__0 ) ) | ( ( rule__FunctionCall__Group_1__0 ) ) );
    public final void rule__FunctionCall__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1884:1: ( ( ( rule__FunctionCall__Group_0__0 ) ) | ( ( rule__FunctionCall__Group_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==44) ) {
                alt10=1;
            }
            else if ( (LA10_0==32) ) {
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
                    // InternalKExpressions.g:1885:1: ( ( rule__FunctionCall__Group_0__0 ) )
                    {
                    // InternalKExpressions.g:1885:1: ( ( rule__FunctionCall__Group_0__0 ) )
                    // InternalKExpressions.g:1886:1: ( rule__FunctionCall__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctionCallAccess().getGroup_0()); 
                    }
                    // InternalKExpressions.g:1887:1: ( rule__FunctionCall__Group_0__0 )
                    // InternalKExpressions.g:1887:2: rule__FunctionCall__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__FunctionCall__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFunctionCallAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:1891:6: ( ( rule__FunctionCall__Group_1__0 ) )
                    {
                    // InternalKExpressions.g:1891:6: ( ( rule__FunctionCall__Group_1__0 ) )
                    // InternalKExpressions.g:1892:1: ( rule__FunctionCall__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctionCallAccess().getGroup_1()); 
                    }
                    // InternalKExpressions.g:1893:1: ( rule__FunctionCall__Group_1__0 )
                    // InternalKExpressions.g:1893:2: rule__FunctionCall__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__FunctionCall__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFunctionCallAccess().getGroup_1()); 
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
    // $ANTLR end "rule__FunctionCall__Alternatives"


    // $ANTLR start "rule__FunctionCall__Alternatives_0_2"
    // InternalKExpressions.g:1902:1: rule__FunctionCall__Alternatives_0_2 : ( ( ( rule__FunctionCall__Group_0_2_0__0 ) ) | ( '()' ) );
    public final void rule__FunctionCall__Alternatives_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1906:1: ( ( ( rule__FunctionCall__Group_0_2_0__0 ) ) | ( '()' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==38) ) {
                alt11=1;
            }
            else if ( (LA11_0==29) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalKExpressions.g:1907:1: ( ( rule__FunctionCall__Group_0_2_0__0 ) )
                    {
                    // InternalKExpressions.g:1907:1: ( ( rule__FunctionCall__Group_0_2_0__0 ) )
                    // InternalKExpressions.g:1908:1: ( rule__FunctionCall__Group_0_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctionCallAccess().getGroup_0_2_0()); 
                    }
                    // InternalKExpressions.g:1909:1: ( rule__FunctionCall__Group_0_2_0__0 )
                    // InternalKExpressions.g:1909:2: rule__FunctionCall__Group_0_2_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__FunctionCall__Group_0_2_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFunctionCallAccess().getGroup_0_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:1913:6: ( '()' )
                    {
                    // InternalKExpressions.g:1913:6: ( '()' )
                    // InternalKExpressions.g:1914:1: '()'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctionCallAccess().getLeftParenthesisRightParenthesisKeyword_0_2_1()); 
                    }
                    match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFunctionCallAccess().getLeftParenthesisRightParenthesisKeyword_0_2_1()); 
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
    // $ANTLR end "rule__FunctionCall__Alternatives_0_2"


    // $ANTLR start "rule__FunctionCall__Alternatives_1_2"
    // InternalKExpressions.g:1926:1: rule__FunctionCall__Alternatives_1_2 : ( ( ( rule__FunctionCall__Group_1_2_0__0 ) ) | ( '()' ) );
    public final void rule__FunctionCall__Alternatives_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1930:1: ( ( ( rule__FunctionCall__Group_1_2_0__0 ) ) | ( '()' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==38) ) {
                alt12=1;
            }
            else if ( (LA12_0==29) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalKExpressions.g:1931:1: ( ( rule__FunctionCall__Group_1_2_0__0 ) )
                    {
                    // InternalKExpressions.g:1931:1: ( ( rule__FunctionCall__Group_1_2_0__0 ) )
                    // InternalKExpressions.g:1932:1: ( rule__FunctionCall__Group_1_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctionCallAccess().getGroup_1_2_0()); 
                    }
                    // InternalKExpressions.g:1933:1: ( rule__FunctionCall__Group_1_2_0__0 )
                    // InternalKExpressions.g:1933:2: rule__FunctionCall__Group_1_2_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__FunctionCall__Group_1_2_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFunctionCallAccess().getGroup_1_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:1937:6: ( '()' )
                    {
                    // InternalKExpressions.g:1937:6: ( '()' )
                    // InternalKExpressions.g:1938:1: '()'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctionCallAccess().getLeftParenthesisRightParenthesisKeyword_1_2_1()); 
                    }
                    match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFunctionCallAccess().getLeftParenthesisRightParenthesisKeyword_1_2_1()); 
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
    // $ANTLR end "rule__FunctionCall__Alternatives_1_2"


    // $ANTLR start "rule__EStringBoolean__Alternatives"
    // InternalKExpressions.g:1958:1: rule__EStringBoolean__Alternatives : ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) );
    public final void rule__EStringBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1962:1: ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt13=1;
                }
                break;
            case RULE_ID:
                {
                alt13=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt13=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalKExpressions.g:1963:1: ( RULE_STRING )
                    {
                    // InternalKExpressions.g:1963:1: ( RULE_STRING )
                    // InternalKExpressions.g:1964:1: RULE_STRING
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
                    // InternalKExpressions.g:1969:6: ( ruleExtendedID )
                    {
                    // InternalKExpressions.g:1969:6: ( ruleExtendedID )
                    // InternalKExpressions.g:1970:1: ruleExtendedID
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
                    // InternalKExpressions.g:1975:6: ( RULE_BOOLEAN )
                    {
                    // InternalKExpressions.g:1975:6: ( RULE_BOOLEAN )
                    // InternalKExpressions.g:1976:1: RULE_BOOLEAN
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


    // $ANTLR start "rule__EStringAllTypes__Alternatives"
    // InternalKExpressions.g:1986:1: rule__EStringAllTypes__Alternatives : ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) | ( ruleInteger ) | ( ruleFloateger ) );
    public final void rule__EStringAllTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1990:1: ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) | ( ruleInteger ) | ( ruleFloateger ) )
            int alt14=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt14=1;
                }
                break;
            case RULE_ID:
                {
                alt14=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt14=3;
                }
                break;
            case 22:
                {
                int LA14_4 = input.LA(2);

                if ( (LA14_4==RULE_FLOAT) ) {
                    alt14=5;
                }
                else if ( (LA14_4==RULE_INT) ) {
                    alt14=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt14=4;
                }
                break;
            case RULE_FLOAT:
                {
                alt14=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalKExpressions.g:1991:1: ( RULE_STRING )
                    {
                    // InternalKExpressions.g:1991:1: ( RULE_STRING )
                    // InternalKExpressions.g:1992:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAllTypesAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAllTypesAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:1997:6: ( ruleExtendedID )
                    {
                    // InternalKExpressions.g:1997:6: ( ruleExtendedID )
                    // InternalKExpressions.g:1998:1: ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAllTypesAccess().getExtendedIDParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleExtendedID();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAllTypesAccess().getExtendedIDParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKExpressions.g:2003:6: ( RULE_BOOLEAN )
                    {
                    // InternalKExpressions.g:2003:6: ( RULE_BOOLEAN )
                    // InternalKExpressions.g:2004:1: RULE_BOOLEAN
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAllTypesAccess().getBOOLEANTerminalRuleCall_2()); 
                    }
                    match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAllTypesAccess().getBOOLEANTerminalRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKExpressions.g:2009:6: ( ruleInteger )
                    {
                    // InternalKExpressions.g:2009:6: ( ruleInteger )
                    // InternalKExpressions.g:2010:1: ruleInteger
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAllTypesAccess().getIntegerParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleInteger();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAllTypesAccess().getIntegerParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKExpressions.g:2015:6: ( ruleFloateger )
                    {
                    // InternalKExpressions.g:2015:6: ( ruleFloateger )
                    // InternalKExpressions.g:2016:1: ruleFloateger
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAllTypesAccess().getFloategerParserRuleCall_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleFloateger();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAllTypesAccess().getFloategerParserRuleCall_4()); 
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
    // $ANTLR end "rule__EStringAllTypes__Alternatives"


    // $ANTLR start "rule__ExtendedID__Alternatives_1"
    // InternalKExpressions.g:2026:1: rule__ExtendedID__Alternatives_1 : ( ( '.' ) | ( ( rule__ExtendedID__Group_1_1__0 ) ) );
    public final void rule__ExtendedID__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2030:1: ( ( '.' ) | ( ( rule__ExtendedID__Group_1_1__0 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            else if ( (LA15_0==22) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalKExpressions.g:2031:1: ( '.' )
                    {
                    // InternalKExpressions.g:2031:1: ( '.' )
                    // InternalKExpressions.g:2032:1: '.'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
                    }
                    match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:2039:6: ( ( rule__ExtendedID__Group_1_1__0 ) )
                    {
                    // InternalKExpressions.g:2039:6: ( ( rule__ExtendedID__Group_1_1__0 ) )
                    // InternalKExpressions.g:2040:1: ( rule__ExtendedID__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExtendedIDAccess().getGroup_1_1()); 
                    }
                    // InternalKExpressions.g:2041:1: ( rule__ExtendedID__Group_1_1__0 )
                    // InternalKExpressions.g:2041:2: rule__ExtendedID__Group_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ExtendedID__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExtendedIDAccess().getGroup_1_1()); 
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
    // $ANTLR end "rule__ExtendedID__Alternatives_1"


    // $ANTLR start "rule__CompareOperator__Alternatives"
    // InternalKExpressions.g:2050:1: rule__CompareOperator__Alternatives : ( ( ( '==' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '!=' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2054:1: ( ( ( '==' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '!=' ) ) )
            int alt16=6;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt16=1;
                }
                break;
            case 32:
                {
                alt16=2;
                }
                break;
            case 33:
                {
                alt16=3;
                }
                break;
            case 34:
                {
                alt16=4;
                }
                break;
            case 35:
                {
                alt16=5;
                }
                break;
            case 36:
                {
                alt16=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalKExpressions.g:2055:1: ( ( '==' ) )
                    {
                    // InternalKExpressions.g:2055:1: ( ( '==' ) )
                    // InternalKExpressions.g:2056:1: ( '==' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // InternalKExpressions.g:2057:1: ( '==' )
                    // InternalKExpressions.g:2057:3: '=='
                    {
                    match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:2062:6: ( ( '<' ) )
                    {
                    // InternalKExpressions.g:2062:6: ( ( '<' ) )
                    // InternalKExpressions.g:2063:1: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }
                    // InternalKExpressions.g:2064:1: ( '<' )
                    // InternalKExpressions.g:2064:3: '<'
                    {
                    match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKExpressions.g:2069:6: ( ( '<=' ) )
                    {
                    // InternalKExpressions.g:2069:6: ( ( '<=' ) )
                    // InternalKExpressions.g:2070:1: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }
                    // InternalKExpressions.g:2071:1: ( '<=' )
                    // InternalKExpressions.g:2071:3: '<='
                    {
                    match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKExpressions.g:2076:6: ( ( '>' ) )
                    {
                    // InternalKExpressions.g:2076:6: ( ( '>' ) )
                    // InternalKExpressions.g:2077:1: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }
                    // InternalKExpressions.g:2078:1: ( '>' )
                    // InternalKExpressions.g:2078:3: '>'
                    {
                    match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKExpressions.g:2083:6: ( ( '>=' ) )
                    {
                    // InternalKExpressions.g:2083:6: ( ( '>=' ) )
                    // InternalKExpressions.g:2084:1: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }
                    // InternalKExpressions.g:2085:1: ( '>=' )
                    // InternalKExpressions.g:2085:3: '>='
                    {
                    match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKExpressions.g:2090:6: ( ( '!=' ) )
                    {
                    // InternalKExpressions.g:2090:6: ( ( '!=' ) )
                    // InternalKExpressions.g:2091:1: ( '!=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_5()); 
                    }
                    // InternalKExpressions.g:2092:1: ( '!=' )
                    // InternalKExpressions.g:2092:3: '!='
                    {
                    match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;

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


    // $ANTLR start "rule__Expression__Group__0"
    // InternalKExpressions.g:2106:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2110:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalKExpressions.g:2111:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Expression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Expression__Group__1();

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
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // InternalKExpressions.g:2118:1: rule__Expression__Group__0__Impl : ( ( rule__Expression__Alternatives_0 ) ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2122:1: ( ( ( rule__Expression__Alternatives_0 ) ) )
            // InternalKExpressions.g:2123:1: ( ( rule__Expression__Alternatives_0 ) )
            {
            // InternalKExpressions.g:2123:1: ( ( rule__Expression__Alternatives_0 ) )
            // InternalKExpressions.g:2124:1: ( rule__Expression__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives_0()); 
            }
            // InternalKExpressions.g:2125:1: ( rule__Expression__Alternatives_0 )
            // InternalKExpressions.g:2125:2: rule__Expression__Alternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Expression__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // InternalKExpressions.g:2135:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2139:1: ( rule__Expression__Group__1__Impl )
            // InternalKExpressions.g:2140:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Expression__Group__1__Impl();

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
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // InternalKExpressions.g:2146:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2150:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // InternalKExpressions.g:2151:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // InternalKExpressions.g:2151:1: ( ( rule__Expression__Group_1__0 )? )
            // InternalKExpressions.g:2152:1: ( rule__Expression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:2153:1: ( rule__Expression__Group_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==37) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalKExpressions.g:2153:2: rule__Expression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Expression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // InternalKExpressions.g:2167:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2171:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalKExpressions.g:2172:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Expression__Group_1__1();

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
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // InternalKExpressions.g:2179:1: rule__Expression__Group_1__0__Impl : ( 'schedule' ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2183:1: ( ( 'schedule' ) )
            // InternalKExpressions.g:2184:1: ( 'schedule' )
            {
            // InternalKExpressions.g:2184:1: ( 'schedule' )
            // InternalKExpressions.g:2185:1: 'schedule'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getScheduleKeyword_1_0()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getScheduleKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // InternalKExpressions.g:2198:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2202:1: ( rule__Expression__Group_1__1__Impl )
            // InternalKExpressions.g:2203:2: rule__Expression__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Expression__Group_1__1__Impl();

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
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // InternalKExpressions.g:2209:1: rule__Expression__Group_1__1__Impl : ( ( ( rule__Expression__ScheduleAssignment_1_1 ) ) ( ( rule__Expression__ScheduleAssignment_1_1 )* ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2213:1: ( ( ( ( rule__Expression__ScheduleAssignment_1_1 ) ) ( ( rule__Expression__ScheduleAssignment_1_1 )* ) ) )
            // InternalKExpressions.g:2214:1: ( ( ( rule__Expression__ScheduleAssignment_1_1 ) ) ( ( rule__Expression__ScheduleAssignment_1_1 )* ) )
            {
            // InternalKExpressions.g:2214:1: ( ( ( rule__Expression__ScheduleAssignment_1_1 ) ) ( ( rule__Expression__ScheduleAssignment_1_1 )* ) )
            // InternalKExpressions.g:2215:1: ( ( rule__Expression__ScheduleAssignment_1_1 ) ) ( ( rule__Expression__ScheduleAssignment_1_1 )* )
            {
            // InternalKExpressions.g:2215:1: ( ( rule__Expression__ScheduleAssignment_1_1 ) )
            // InternalKExpressions.g:2216:1: ( rule__Expression__ScheduleAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getScheduleAssignment_1_1()); 
            }
            // InternalKExpressions.g:2217:1: ( rule__Expression__ScheduleAssignment_1_1 )
            // InternalKExpressions.g:2217:2: rule__Expression__ScheduleAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Expression__ScheduleAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getScheduleAssignment_1_1()); 
            }

            }

            // InternalKExpressions.g:2220:1: ( ( rule__Expression__ScheduleAssignment_1_1 )* )
            // InternalKExpressions.g:2221:1: ( rule__Expression__ScheduleAssignment_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getScheduleAssignment_1_1()); 
            }
            // InternalKExpressions.g:2222:1: ( rule__Expression__ScheduleAssignment_1_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalKExpressions.g:2222:2: rule__Expression__ScheduleAssignment_1_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    rule__Expression__ScheduleAssignment_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getScheduleAssignment_1_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__LogicalOrExpression__Group__0"
    // InternalKExpressions.g:2237:1: rule__LogicalOrExpression__Group__0 : rule__LogicalOrExpression__Group__0__Impl rule__LogicalOrExpression__Group__1 ;
    public final void rule__LogicalOrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2241:1: ( rule__LogicalOrExpression__Group__0__Impl rule__LogicalOrExpression__Group__1 )
            // InternalKExpressions.g:2242:2: rule__LogicalOrExpression__Group__0__Impl rule__LogicalOrExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
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
    // InternalKExpressions.g:2249:1: rule__LogicalOrExpression__Group__0__Impl : ( ruleLogicalAndExpression ) ;
    public final void rule__LogicalOrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2253:1: ( ( ruleLogicalAndExpression ) )
            // InternalKExpressions.g:2254:1: ( ruleLogicalAndExpression )
            {
            // InternalKExpressions.g:2254:1: ( ruleLogicalAndExpression )
            // InternalKExpressions.g:2255:1: ruleLogicalAndExpression
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
    // InternalKExpressions.g:2266:1: rule__LogicalOrExpression__Group__1 : rule__LogicalOrExpression__Group__1__Impl ;
    public final void rule__LogicalOrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2270:1: ( rule__LogicalOrExpression__Group__1__Impl )
            // InternalKExpressions.g:2271:2: rule__LogicalOrExpression__Group__1__Impl
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
    // InternalKExpressions.g:2277:1: rule__LogicalOrExpression__Group__1__Impl : ( ( rule__LogicalOrExpression__Group_1__0 )? ) ;
    public final void rule__LogicalOrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2281:1: ( ( ( rule__LogicalOrExpression__Group_1__0 )? ) )
            // InternalKExpressions.g:2282:1: ( ( rule__LogicalOrExpression__Group_1__0 )? )
            {
            // InternalKExpressions.g:2282:1: ( ( rule__LogicalOrExpression__Group_1__0 )? )
            // InternalKExpressions.g:2283:1: ( rule__LogicalOrExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:2284:1: ( rule__LogicalOrExpression__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalKExpressions.g:2284:2: rule__LogicalOrExpression__Group_1__0
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
    // InternalKExpressions.g:2298:1: rule__LogicalOrExpression__Group_1__0 : rule__LogicalOrExpression__Group_1__0__Impl rule__LogicalOrExpression__Group_1__1 ;
    public final void rule__LogicalOrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2302:1: ( rule__LogicalOrExpression__Group_1__0__Impl rule__LogicalOrExpression__Group_1__1 )
            // InternalKExpressions.g:2303:2: rule__LogicalOrExpression__Group_1__0__Impl rule__LogicalOrExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
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
    // InternalKExpressions.g:2310:1: rule__LogicalOrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__LogicalOrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2314:1: ( ( () ) )
            // InternalKExpressions.g:2315:1: ( () )
            {
            // InternalKExpressions.g:2315:1: ( () )
            // InternalKExpressions.g:2316:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:2317:1: ()
            // InternalKExpressions.g:2319:1: 
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
    // InternalKExpressions.g:2329:1: rule__LogicalOrExpression__Group_1__1 : rule__LogicalOrExpression__Group_1__1__Impl rule__LogicalOrExpression__Group_1__2 ;
    public final void rule__LogicalOrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2333:1: ( rule__LogicalOrExpression__Group_1__1__Impl rule__LogicalOrExpression__Group_1__2 )
            // InternalKExpressions.g:2334:2: rule__LogicalOrExpression__Group_1__1__Impl rule__LogicalOrExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_6);
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
    // InternalKExpressions.g:2341:1: rule__LogicalOrExpression__Group_1__1__Impl : ( ( rule__LogicalOrExpression__Group_1_1__0 ) ) ;
    public final void rule__LogicalOrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2345:1: ( ( ( rule__LogicalOrExpression__Group_1_1__0 ) ) )
            // InternalKExpressions.g:2346:1: ( ( rule__LogicalOrExpression__Group_1_1__0 ) )
            {
            // InternalKExpressions.g:2346:1: ( ( rule__LogicalOrExpression__Group_1_1__0 ) )
            // InternalKExpressions.g:2347:1: ( rule__LogicalOrExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExpressionAccess().getGroup_1_1()); 
            }
            // InternalKExpressions.g:2348:1: ( rule__LogicalOrExpression__Group_1_1__0 )
            // InternalKExpressions.g:2348:2: rule__LogicalOrExpression__Group_1_1__0
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
    // InternalKExpressions.g:2358:1: rule__LogicalOrExpression__Group_1__2 : rule__LogicalOrExpression__Group_1__2__Impl ;
    public final void rule__LogicalOrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2362:1: ( rule__LogicalOrExpression__Group_1__2__Impl )
            // InternalKExpressions.g:2363:2: rule__LogicalOrExpression__Group_1__2__Impl
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
    // InternalKExpressions.g:2369:1: rule__LogicalOrExpression__Group_1__2__Impl : ( ( rule__LogicalOrExpression__Group_1_2__0 )* ) ;
    public final void rule__LogicalOrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2373:1: ( ( ( rule__LogicalOrExpression__Group_1_2__0 )* ) )
            // InternalKExpressions.g:2374:1: ( ( rule__LogicalOrExpression__Group_1_2__0 )* )
            {
            // InternalKExpressions.g:2374:1: ( ( rule__LogicalOrExpression__Group_1_2__0 )* )
            // InternalKExpressions.g:2375:1: ( rule__LogicalOrExpression__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExpressionAccess().getGroup_1_2()); 
            }
            // InternalKExpressions.g:2376:1: ( rule__LogicalOrExpression__Group_1_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==27) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalKExpressions.g:2376:2: rule__LogicalOrExpression__Group_1_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    rule__LogicalOrExpression__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalKExpressions.g:2392:1: rule__LogicalOrExpression__Group_1_1__0 : rule__LogicalOrExpression__Group_1_1__0__Impl rule__LogicalOrExpression__Group_1_1__1 ;
    public final void rule__LogicalOrExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2396:1: ( rule__LogicalOrExpression__Group_1_1__0__Impl rule__LogicalOrExpression__Group_1_1__1 )
            // InternalKExpressions.g:2397:2: rule__LogicalOrExpression__Group_1_1__0__Impl rule__LogicalOrExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
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
    // InternalKExpressions.g:2404:1: rule__LogicalOrExpression__Group_1_1__0__Impl : ( ( rule__LogicalOrExpression__OperatorAssignment_1_1_0 ) ) ;
    public final void rule__LogicalOrExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2408:1: ( ( ( rule__LogicalOrExpression__OperatorAssignment_1_1_0 ) ) )
            // InternalKExpressions.g:2409:1: ( ( rule__LogicalOrExpression__OperatorAssignment_1_1_0 ) )
            {
            // InternalKExpressions.g:2409:1: ( ( rule__LogicalOrExpression__OperatorAssignment_1_1_0 ) )
            // InternalKExpressions.g:2410:1: ( rule__LogicalOrExpression__OperatorAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExpressionAccess().getOperatorAssignment_1_1_0()); 
            }
            // InternalKExpressions.g:2411:1: ( rule__LogicalOrExpression__OperatorAssignment_1_1_0 )
            // InternalKExpressions.g:2411:2: rule__LogicalOrExpression__OperatorAssignment_1_1_0
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
    // InternalKExpressions.g:2421:1: rule__LogicalOrExpression__Group_1_1__1 : rule__LogicalOrExpression__Group_1_1__1__Impl ;
    public final void rule__LogicalOrExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2425:1: ( rule__LogicalOrExpression__Group_1_1__1__Impl )
            // InternalKExpressions.g:2426:2: rule__LogicalOrExpression__Group_1_1__1__Impl
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
    // InternalKExpressions.g:2432:1: rule__LogicalOrExpression__Group_1_1__1__Impl : ( ( rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__LogicalOrExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2436:1: ( ( ( rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1 ) ) )
            // InternalKExpressions.g:2437:1: ( ( rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1 ) )
            {
            // InternalKExpressions.g:2437:1: ( ( rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1 ) )
            // InternalKExpressions.g:2438:1: ( rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }
            // InternalKExpressions.g:2439:1: ( rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1 )
            // InternalKExpressions.g:2439:2: rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1
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
    // InternalKExpressions.g:2453:1: rule__LogicalOrExpression__Group_1_2__0 : rule__LogicalOrExpression__Group_1_2__0__Impl rule__LogicalOrExpression__Group_1_2__1 ;
    public final void rule__LogicalOrExpression__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2457:1: ( rule__LogicalOrExpression__Group_1_2__0__Impl rule__LogicalOrExpression__Group_1_2__1 )
            // InternalKExpressions.g:2458:2: rule__LogicalOrExpression__Group_1_2__0__Impl rule__LogicalOrExpression__Group_1_2__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
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
    // InternalKExpressions.g:2465:1: rule__LogicalOrExpression__Group_1_2__0__Impl : ( '||' ) ;
    public final void rule__LogicalOrExpression__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2469:1: ( ( '||' ) )
            // InternalKExpressions.g:2470:1: ( '||' )
            {
            // InternalKExpressions.g:2470:1: ( '||' )
            // InternalKExpressions.g:2471:1: '||'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_2_0()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:2484:1: rule__LogicalOrExpression__Group_1_2__1 : rule__LogicalOrExpression__Group_1_2__1__Impl ;
    public final void rule__LogicalOrExpression__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2488:1: ( rule__LogicalOrExpression__Group_1_2__1__Impl )
            // InternalKExpressions.g:2489:2: rule__LogicalOrExpression__Group_1_2__1__Impl
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
    // InternalKExpressions.g:2495:1: rule__LogicalOrExpression__Group_1_2__1__Impl : ( ( rule__LogicalOrExpression__SubExpressionsAssignment_1_2_1 ) ) ;
    public final void rule__LogicalOrExpression__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2499:1: ( ( ( rule__LogicalOrExpression__SubExpressionsAssignment_1_2_1 ) ) )
            // InternalKExpressions.g:2500:1: ( ( rule__LogicalOrExpression__SubExpressionsAssignment_1_2_1 ) )
            {
            // InternalKExpressions.g:2500:1: ( ( rule__LogicalOrExpression__SubExpressionsAssignment_1_2_1 ) )
            // InternalKExpressions.g:2501:1: ( rule__LogicalOrExpression__SubExpressionsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsAssignment_1_2_1()); 
            }
            // InternalKExpressions.g:2502:1: ( rule__LogicalOrExpression__SubExpressionsAssignment_1_2_1 )
            // InternalKExpressions.g:2502:2: rule__LogicalOrExpression__SubExpressionsAssignment_1_2_1
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
    // InternalKExpressions.g:2516:1: rule__LogicalAndExpression__Group__0 : rule__LogicalAndExpression__Group__0__Impl rule__LogicalAndExpression__Group__1 ;
    public final void rule__LogicalAndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2520:1: ( rule__LogicalAndExpression__Group__0__Impl rule__LogicalAndExpression__Group__1 )
            // InternalKExpressions.g:2521:2: rule__LogicalAndExpression__Group__0__Impl rule__LogicalAndExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
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
    // InternalKExpressions.g:2528:1: rule__LogicalAndExpression__Group__0__Impl : ( ruleBitwiseOrExpression ) ;
    public final void rule__LogicalAndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2532:1: ( ( ruleBitwiseOrExpression ) )
            // InternalKExpressions.g:2533:1: ( ruleBitwiseOrExpression )
            {
            // InternalKExpressions.g:2533:1: ( ruleBitwiseOrExpression )
            // InternalKExpressions.g:2534:1: ruleBitwiseOrExpression
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
    // InternalKExpressions.g:2545:1: rule__LogicalAndExpression__Group__1 : rule__LogicalAndExpression__Group__1__Impl ;
    public final void rule__LogicalAndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2549:1: ( rule__LogicalAndExpression__Group__1__Impl )
            // InternalKExpressions.g:2550:2: rule__LogicalAndExpression__Group__1__Impl
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
    // InternalKExpressions.g:2556:1: rule__LogicalAndExpression__Group__1__Impl : ( ( rule__LogicalAndExpression__Group_1__0 )? ) ;
    public final void rule__LogicalAndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2560:1: ( ( ( rule__LogicalAndExpression__Group_1__0 )? ) )
            // InternalKExpressions.g:2561:1: ( ( rule__LogicalAndExpression__Group_1__0 )? )
            {
            // InternalKExpressions.g:2561:1: ( ( rule__LogicalAndExpression__Group_1__0 )? )
            // InternalKExpressions.g:2562:1: ( rule__LogicalAndExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:2563:1: ( rule__LogicalAndExpression__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalKExpressions.g:2563:2: rule__LogicalAndExpression__Group_1__0
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
    // InternalKExpressions.g:2577:1: rule__LogicalAndExpression__Group_1__0 : rule__LogicalAndExpression__Group_1__0__Impl rule__LogicalAndExpression__Group_1__1 ;
    public final void rule__LogicalAndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2581:1: ( rule__LogicalAndExpression__Group_1__0__Impl rule__LogicalAndExpression__Group_1__1 )
            // InternalKExpressions.g:2582:2: rule__LogicalAndExpression__Group_1__0__Impl rule__LogicalAndExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
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
    // InternalKExpressions.g:2589:1: rule__LogicalAndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__LogicalAndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2593:1: ( ( () ) )
            // InternalKExpressions.g:2594:1: ( () )
            {
            // InternalKExpressions.g:2594:1: ( () )
            // InternalKExpressions.g:2595:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:2596:1: ()
            // InternalKExpressions.g:2598:1: 
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
    // InternalKExpressions.g:2608:1: rule__LogicalAndExpression__Group_1__1 : rule__LogicalAndExpression__Group_1__1__Impl rule__LogicalAndExpression__Group_1__2 ;
    public final void rule__LogicalAndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2612:1: ( rule__LogicalAndExpression__Group_1__1__Impl rule__LogicalAndExpression__Group_1__2 )
            // InternalKExpressions.g:2613:2: rule__LogicalAndExpression__Group_1__1__Impl rule__LogicalAndExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_9);
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
    // InternalKExpressions.g:2620:1: rule__LogicalAndExpression__Group_1__1__Impl : ( ( rule__LogicalAndExpression__Group_1_1__0 ) ) ;
    public final void rule__LogicalAndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2624:1: ( ( ( rule__LogicalAndExpression__Group_1_1__0 ) ) )
            // InternalKExpressions.g:2625:1: ( ( rule__LogicalAndExpression__Group_1_1__0 ) )
            {
            // InternalKExpressions.g:2625:1: ( ( rule__LogicalAndExpression__Group_1_1__0 ) )
            // InternalKExpressions.g:2626:1: ( rule__LogicalAndExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExpressionAccess().getGroup_1_1()); 
            }
            // InternalKExpressions.g:2627:1: ( rule__LogicalAndExpression__Group_1_1__0 )
            // InternalKExpressions.g:2627:2: rule__LogicalAndExpression__Group_1_1__0
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
    // InternalKExpressions.g:2637:1: rule__LogicalAndExpression__Group_1__2 : rule__LogicalAndExpression__Group_1__2__Impl ;
    public final void rule__LogicalAndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2641:1: ( rule__LogicalAndExpression__Group_1__2__Impl )
            // InternalKExpressions.g:2642:2: rule__LogicalAndExpression__Group_1__2__Impl
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
    // InternalKExpressions.g:2648:1: rule__LogicalAndExpression__Group_1__2__Impl : ( ( rule__LogicalAndExpression__Group_1_2__0 )* ) ;
    public final void rule__LogicalAndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2652:1: ( ( ( rule__LogicalAndExpression__Group_1_2__0 )* ) )
            // InternalKExpressions.g:2653:1: ( ( rule__LogicalAndExpression__Group_1_2__0 )* )
            {
            // InternalKExpressions.g:2653:1: ( ( rule__LogicalAndExpression__Group_1_2__0 )* )
            // InternalKExpressions.g:2654:1: ( rule__LogicalAndExpression__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExpressionAccess().getGroup_1_2()); 
            }
            // InternalKExpressions.g:2655:1: ( rule__LogicalAndExpression__Group_1_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==28) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalKExpressions.g:2655:2: rule__LogicalAndExpression__Group_1_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    rule__LogicalAndExpression__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalKExpressions.g:2671:1: rule__LogicalAndExpression__Group_1_1__0 : rule__LogicalAndExpression__Group_1_1__0__Impl rule__LogicalAndExpression__Group_1_1__1 ;
    public final void rule__LogicalAndExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2675:1: ( rule__LogicalAndExpression__Group_1_1__0__Impl rule__LogicalAndExpression__Group_1_1__1 )
            // InternalKExpressions.g:2676:2: rule__LogicalAndExpression__Group_1_1__0__Impl rule__LogicalAndExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
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
    // InternalKExpressions.g:2683:1: rule__LogicalAndExpression__Group_1_1__0__Impl : ( ( rule__LogicalAndExpression__OperatorAssignment_1_1_0 ) ) ;
    public final void rule__LogicalAndExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2687:1: ( ( ( rule__LogicalAndExpression__OperatorAssignment_1_1_0 ) ) )
            // InternalKExpressions.g:2688:1: ( ( rule__LogicalAndExpression__OperatorAssignment_1_1_0 ) )
            {
            // InternalKExpressions.g:2688:1: ( ( rule__LogicalAndExpression__OperatorAssignment_1_1_0 ) )
            // InternalKExpressions.g:2689:1: ( rule__LogicalAndExpression__OperatorAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExpressionAccess().getOperatorAssignment_1_1_0()); 
            }
            // InternalKExpressions.g:2690:1: ( rule__LogicalAndExpression__OperatorAssignment_1_1_0 )
            // InternalKExpressions.g:2690:2: rule__LogicalAndExpression__OperatorAssignment_1_1_0
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
    // InternalKExpressions.g:2700:1: rule__LogicalAndExpression__Group_1_1__1 : rule__LogicalAndExpression__Group_1_1__1__Impl ;
    public final void rule__LogicalAndExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2704:1: ( rule__LogicalAndExpression__Group_1_1__1__Impl )
            // InternalKExpressions.g:2705:2: rule__LogicalAndExpression__Group_1_1__1__Impl
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
    // InternalKExpressions.g:2711:1: rule__LogicalAndExpression__Group_1_1__1__Impl : ( ( rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__LogicalAndExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2715:1: ( ( ( rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1 ) ) )
            // InternalKExpressions.g:2716:1: ( ( rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1 ) )
            {
            // InternalKExpressions.g:2716:1: ( ( rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1 ) )
            // InternalKExpressions.g:2717:1: ( rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }
            // InternalKExpressions.g:2718:1: ( rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1 )
            // InternalKExpressions.g:2718:2: rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1
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
    // InternalKExpressions.g:2732:1: rule__LogicalAndExpression__Group_1_2__0 : rule__LogicalAndExpression__Group_1_2__0__Impl rule__LogicalAndExpression__Group_1_2__1 ;
    public final void rule__LogicalAndExpression__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2736:1: ( rule__LogicalAndExpression__Group_1_2__0__Impl rule__LogicalAndExpression__Group_1_2__1 )
            // InternalKExpressions.g:2737:2: rule__LogicalAndExpression__Group_1_2__0__Impl rule__LogicalAndExpression__Group_1_2__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
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
    // InternalKExpressions.g:2744:1: rule__LogicalAndExpression__Group_1_2__0__Impl : ( '&&' ) ;
    public final void rule__LogicalAndExpression__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2748:1: ( ( '&&' ) )
            // InternalKExpressions.g:2749:1: ( '&&' )
            {
            // InternalKExpressions.g:2749:1: ( '&&' )
            // InternalKExpressions.g:2750:1: '&&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExpressionAccess().getAmpersandAmpersandKeyword_1_2_0()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:2763:1: rule__LogicalAndExpression__Group_1_2__1 : rule__LogicalAndExpression__Group_1_2__1__Impl ;
    public final void rule__LogicalAndExpression__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2767:1: ( rule__LogicalAndExpression__Group_1_2__1__Impl )
            // InternalKExpressions.g:2768:2: rule__LogicalAndExpression__Group_1_2__1__Impl
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
    // InternalKExpressions.g:2774:1: rule__LogicalAndExpression__Group_1_2__1__Impl : ( ( rule__LogicalAndExpression__SubExpressionsAssignment_1_2_1 ) ) ;
    public final void rule__LogicalAndExpression__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2778:1: ( ( ( rule__LogicalAndExpression__SubExpressionsAssignment_1_2_1 ) ) )
            // InternalKExpressions.g:2779:1: ( ( rule__LogicalAndExpression__SubExpressionsAssignment_1_2_1 ) )
            {
            // InternalKExpressions.g:2779:1: ( ( rule__LogicalAndExpression__SubExpressionsAssignment_1_2_1 ) )
            // InternalKExpressions.g:2780:1: ( rule__LogicalAndExpression__SubExpressionsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsAssignment_1_2_1()); 
            }
            // InternalKExpressions.g:2781:1: ( rule__LogicalAndExpression__SubExpressionsAssignment_1_2_1 )
            // InternalKExpressions.g:2781:2: rule__LogicalAndExpression__SubExpressionsAssignment_1_2_1
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
    // InternalKExpressions.g:2795:1: rule__BitwiseOrExpression__Group__0 : rule__BitwiseOrExpression__Group__0__Impl rule__BitwiseOrExpression__Group__1 ;
    public final void rule__BitwiseOrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2799:1: ( rule__BitwiseOrExpression__Group__0__Impl rule__BitwiseOrExpression__Group__1 )
            // InternalKExpressions.g:2800:2: rule__BitwiseOrExpression__Group__0__Impl rule__BitwiseOrExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
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
    // InternalKExpressions.g:2807:1: rule__BitwiseOrExpression__Group__0__Impl : ( ruleBitwiseAndExpression ) ;
    public final void rule__BitwiseOrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2811:1: ( ( ruleBitwiseAndExpression ) )
            // InternalKExpressions.g:2812:1: ( ruleBitwiseAndExpression )
            {
            // InternalKExpressions.g:2812:1: ( ruleBitwiseAndExpression )
            // InternalKExpressions.g:2813:1: ruleBitwiseAndExpression
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
    // InternalKExpressions.g:2824:1: rule__BitwiseOrExpression__Group__1 : rule__BitwiseOrExpression__Group__1__Impl ;
    public final void rule__BitwiseOrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2828:1: ( rule__BitwiseOrExpression__Group__1__Impl )
            // InternalKExpressions.g:2829:2: rule__BitwiseOrExpression__Group__1__Impl
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
    // InternalKExpressions.g:2835:1: rule__BitwiseOrExpression__Group__1__Impl : ( ( rule__BitwiseOrExpression__Group_1__0 )? ) ;
    public final void rule__BitwiseOrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2839:1: ( ( ( rule__BitwiseOrExpression__Group_1__0 )? ) )
            // InternalKExpressions.g:2840:1: ( ( rule__BitwiseOrExpression__Group_1__0 )? )
            {
            // InternalKExpressions.g:2840:1: ( ( rule__BitwiseOrExpression__Group_1__0 )? )
            // InternalKExpressions.g:2841:1: ( rule__BitwiseOrExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:2842:1: ( rule__BitwiseOrExpression__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==18) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalKExpressions.g:2842:2: rule__BitwiseOrExpression__Group_1__0
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
    // InternalKExpressions.g:2856:1: rule__BitwiseOrExpression__Group_1__0 : rule__BitwiseOrExpression__Group_1__0__Impl rule__BitwiseOrExpression__Group_1__1 ;
    public final void rule__BitwiseOrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2860:1: ( rule__BitwiseOrExpression__Group_1__0__Impl rule__BitwiseOrExpression__Group_1__1 )
            // InternalKExpressions.g:2861:2: rule__BitwiseOrExpression__Group_1__0__Impl rule__BitwiseOrExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
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
    // InternalKExpressions.g:2868:1: rule__BitwiseOrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__BitwiseOrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2872:1: ( ( () ) )
            // InternalKExpressions.g:2873:1: ( () )
            {
            // InternalKExpressions.g:2873:1: ( () )
            // InternalKExpressions.g:2874:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:2875:1: ()
            // InternalKExpressions.g:2877:1: 
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
    // InternalKExpressions.g:2887:1: rule__BitwiseOrExpression__Group_1__1 : rule__BitwiseOrExpression__Group_1__1__Impl rule__BitwiseOrExpression__Group_1__2 ;
    public final void rule__BitwiseOrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2891:1: ( rule__BitwiseOrExpression__Group_1__1__Impl rule__BitwiseOrExpression__Group_1__2 )
            // InternalKExpressions.g:2892:2: rule__BitwiseOrExpression__Group_1__1__Impl rule__BitwiseOrExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_11);
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
    // InternalKExpressions.g:2899:1: rule__BitwiseOrExpression__Group_1__1__Impl : ( ( rule__BitwiseOrExpression__Group_1_1__0 ) ) ;
    public final void rule__BitwiseOrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2903:1: ( ( ( rule__BitwiseOrExpression__Group_1_1__0 ) ) )
            // InternalKExpressions.g:2904:1: ( ( rule__BitwiseOrExpression__Group_1_1__0 ) )
            {
            // InternalKExpressions.g:2904:1: ( ( rule__BitwiseOrExpression__Group_1_1__0 ) )
            // InternalKExpressions.g:2905:1: ( rule__BitwiseOrExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrExpressionAccess().getGroup_1_1()); 
            }
            // InternalKExpressions.g:2906:1: ( rule__BitwiseOrExpression__Group_1_1__0 )
            // InternalKExpressions.g:2906:2: rule__BitwiseOrExpression__Group_1_1__0
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
    // InternalKExpressions.g:2916:1: rule__BitwiseOrExpression__Group_1__2 : rule__BitwiseOrExpression__Group_1__2__Impl ;
    public final void rule__BitwiseOrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2920:1: ( rule__BitwiseOrExpression__Group_1__2__Impl )
            // InternalKExpressions.g:2921:2: rule__BitwiseOrExpression__Group_1__2__Impl
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
    // InternalKExpressions.g:2927:1: rule__BitwiseOrExpression__Group_1__2__Impl : ( ( rule__BitwiseOrExpression__Group_1_2__0 )* ) ;
    public final void rule__BitwiseOrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2931:1: ( ( ( rule__BitwiseOrExpression__Group_1_2__0 )* ) )
            // InternalKExpressions.g:2932:1: ( ( rule__BitwiseOrExpression__Group_1_2__0 )* )
            {
            // InternalKExpressions.g:2932:1: ( ( rule__BitwiseOrExpression__Group_1_2__0 )* )
            // InternalKExpressions.g:2933:1: ( rule__BitwiseOrExpression__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrExpressionAccess().getGroup_1_2()); 
            }
            // InternalKExpressions.g:2934:1: ( rule__BitwiseOrExpression__Group_1_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==18) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalKExpressions.g:2934:2: rule__BitwiseOrExpression__Group_1_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_12);
            	    rule__BitwiseOrExpression__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalKExpressions.g:2950:1: rule__BitwiseOrExpression__Group_1_1__0 : rule__BitwiseOrExpression__Group_1_1__0__Impl rule__BitwiseOrExpression__Group_1_1__1 ;
    public final void rule__BitwiseOrExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2954:1: ( rule__BitwiseOrExpression__Group_1_1__0__Impl rule__BitwiseOrExpression__Group_1_1__1 )
            // InternalKExpressions.g:2955:2: rule__BitwiseOrExpression__Group_1_1__0__Impl rule__BitwiseOrExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
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
    // InternalKExpressions.g:2962:1: rule__BitwiseOrExpression__Group_1_1__0__Impl : ( ( rule__BitwiseOrExpression__OperatorAssignment_1_1_0 ) ) ;
    public final void rule__BitwiseOrExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2966:1: ( ( ( rule__BitwiseOrExpression__OperatorAssignment_1_1_0 ) ) )
            // InternalKExpressions.g:2967:1: ( ( rule__BitwiseOrExpression__OperatorAssignment_1_1_0 ) )
            {
            // InternalKExpressions.g:2967:1: ( ( rule__BitwiseOrExpression__OperatorAssignment_1_1_0 ) )
            // InternalKExpressions.g:2968:1: ( rule__BitwiseOrExpression__OperatorAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrExpressionAccess().getOperatorAssignment_1_1_0()); 
            }
            // InternalKExpressions.g:2969:1: ( rule__BitwiseOrExpression__OperatorAssignment_1_1_0 )
            // InternalKExpressions.g:2969:2: rule__BitwiseOrExpression__OperatorAssignment_1_1_0
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
    // InternalKExpressions.g:2979:1: rule__BitwiseOrExpression__Group_1_1__1 : rule__BitwiseOrExpression__Group_1_1__1__Impl ;
    public final void rule__BitwiseOrExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2983:1: ( rule__BitwiseOrExpression__Group_1_1__1__Impl )
            // InternalKExpressions.g:2984:2: rule__BitwiseOrExpression__Group_1_1__1__Impl
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
    // InternalKExpressions.g:2990:1: rule__BitwiseOrExpression__Group_1_1__1__Impl : ( ( rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__BitwiseOrExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2994:1: ( ( ( rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1 ) ) )
            // InternalKExpressions.g:2995:1: ( ( rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1 ) )
            {
            // InternalKExpressions.g:2995:1: ( ( rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1 ) )
            // InternalKExpressions.g:2996:1: ( rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }
            // InternalKExpressions.g:2997:1: ( rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1 )
            // InternalKExpressions.g:2997:2: rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1
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
    // InternalKExpressions.g:3011:1: rule__BitwiseOrExpression__Group_1_2__0 : rule__BitwiseOrExpression__Group_1_2__0__Impl rule__BitwiseOrExpression__Group_1_2__1 ;
    public final void rule__BitwiseOrExpression__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3015:1: ( rule__BitwiseOrExpression__Group_1_2__0__Impl rule__BitwiseOrExpression__Group_1_2__1 )
            // InternalKExpressions.g:3016:2: rule__BitwiseOrExpression__Group_1_2__0__Impl rule__BitwiseOrExpression__Group_1_2__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
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
    // InternalKExpressions.g:3023:1: rule__BitwiseOrExpression__Group_1_2__0__Impl : ( '|' ) ;
    public final void rule__BitwiseOrExpression__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3027:1: ( ( '|' ) )
            // InternalKExpressions.g:3028:1: ( '|' )
            {
            // InternalKExpressions.g:3028:1: ( '|' )
            // InternalKExpressions.g:3029:1: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrExpressionAccess().getVerticalLineKeyword_1_2_0()); 
            }
            match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:3042:1: rule__BitwiseOrExpression__Group_1_2__1 : rule__BitwiseOrExpression__Group_1_2__1__Impl ;
    public final void rule__BitwiseOrExpression__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3046:1: ( rule__BitwiseOrExpression__Group_1_2__1__Impl )
            // InternalKExpressions.g:3047:2: rule__BitwiseOrExpression__Group_1_2__1__Impl
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
    // InternalKExpressions.g:3053:1: rule__BitwiseOrExpression__Group_1_2__1__Impl : ( ( rule__BitwiseOrExpression__SubExpressionsAssignment_1_2_1 ) ) ;
    public final void rule__BitwiseOrExpression__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3057:1: ( ( ( rule__BitwiseOrExpression__SubExpressionsAssignment_1_2_1 ) ) )
            // InternalKExpressions.g:3058:1: ( ( rule__BitwiseOrExpression__SubExpressionsAssignment_1_2_1 ) )
            {
            // InternalKExpressions.g:3058:1: ( ( rule__BitwiseOrExpression__SubExpressionsAssignment_1_2_1 ) )
            // InternalKExpressions.g:3059:1: ( rule__BitwiseOrExpression__SubExpressionsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsAssignment_1_2_1()); 
            }
            // InternalKExpressions.g:3060:1: ( rule__BitwiseOrExpression__SubExpressionsAssignment_1_2_1 )
            // InternalKExpressions.g:3060:2: rule__BitwiseOrExpression__SubExpressionsAssignment_1_2_1
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
    // InternalKExpressions.g:3074:1: rule__BitwiseAndExpression__Group__0 : rule__BitwiseAndExpression__Group__0__Impl rule__BitwiseAndExpression__Group__1 ;
    public final void rule__BitwiseAndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3078:1: ( rule__BitwiseAndExpression__Group__0__Impl rule__BitwiseAndExpression__Group__1 )
            // InternalKExpressions.g:3079:2: rule__BitwiseAndExpression__Group__0__Impl rule__BitwiseAndExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_13);
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
    // InternalKExpressions.g:3086:1: rule__BitwiseAndExpression__Group__0__Impl : ( ruleCompareOperation ) ;
    public final void rule__BitwiseAndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3090:1: ( ( ruleCompareOperation ) )
            // InternalKExpressions.g:3091:1: ( ruleCompareOperation )
            {
            // InternalKExpressions.g:3091:1: ( ruleCompareOperation )
            // InternalKExpressions.g:3092:1: ruleCompareOperation
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
    // InternalKExpressions.g:3103:1: rule__BitwiseAndExpression__Group__1 : rule__BitwiseAndExpression__Group__1__Impl ;
    public final void rule__BitwiseAndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3107:1: ( rule__BitwiseAndExpression__Group__1__Impl )
            // InternalKExpressions.g:3108:2: rule__BitwiseAndExpression__Group__1__Impl
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
    // InternalKExpressions.g:3114:1: rule__BitwiseAndExpression__Group__1__Impl : ( ( rule__BitwiseAndExpression__Group_1__0 )? ) ;
    public final void rule__BitwiseAndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3118:1: ( ( ( rule__BitwiseAndExpression__Group_1__0 )? ) )
            // InternalKExpressions.g:3119:1: ( ( rule__BitwiseAndExpression__Group_1__0 )? )
            {
            // InternalKExpressions.g:3119:1: ( ( rule__BitwiseAndExpression__Group_1__0 )? )
            // InternalKExpressions.g:3120:1: ( rule__BitwiseAndExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:3121:1: ( rule__BitwiseAndExpression__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==19) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalKExpressions.g:3121:2: rule__BitwiseAndExpression__Group_1__0
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
    // InternalKExpressions.g:3135:1: rule__BitwiseAndExpression__Group_1__0 : rule__BitwiseAndExpression__Group_1__0__Impl rule__BitwiseAndExpression__Group_1__1 ;
    public final void rule__BitwiseAndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3139:1: ( rule__BitwiseAndExpression__Group_1__0__Impl rule__BitwiseAndExpression__Group_1__1 )
            // InternalKExpressions.g:3140:2: rule__BitwiseAndExpression__Group_1__0__Impl rule__BitwiseAndExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_13);
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
    // InternalKExpressions.g:3147:1: rule__BitwiseAndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__BitwiseAndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3151:1: ( ( () ) )
            // InternalKExpressions.g:3152:1: ( () )
            {
            // InternalKExpressions.g:3152:1: ( () )
            // InternalKExpressions.g:3153:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:3154:1: ()
            // InternalKExpressions.g:3156:1: 
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
    // InternalKExpressions.g:3166:1: rule__BitwiseAndExpression__Group_1__1 : rule__BitwiseAndExpression__Group_1__1__Impl rule__BitwiseAndExpression__Group_1__2 ;
    public final void rule__BitwiseAndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3170:1: ( rule__BitwiseAndExpression__Group_1__1__Impl rule__BitwiseAndExpression__Group_1__2 )
            // InternalKExpressions.g:3171:2: rule__BitwiseAndExpression__Group_1__1__Impl rule__BitwiseAndExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_13);
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
    // InternalKExpressions.g:3178:1: rule__BitwiseAndExpression__Group_1__1__Impl : ( ( rule__BitwiseAndExpression__Group_1_1__0 ) ) ;
    public final void rule__BitwiseAndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3182:1: ( ( ( rule__BitwiseAndExpression__Group_1_1__0 ) ) )
            // InternalKExpressions.g:3183:1: ( ( rule__BitwiseAndExpression__Group_1_1__0 ) )
            {
            // InternalKExpressions.g:3183:1: ( ( rule__BitwiseAndExpression__Group_1_1__0 ) )
            // InternalKExpressions.g:3184:1: ( rule__BitwiseAndExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndExpressionAccess().getGroup_1_1()); 
            }
            // InternalKExpressions.g:3185:1: ( rule__BitwiseAndExpression__Group_1_1__0 )
            // InternalKExpressions.g:3185:2: rule__BitwiseAndExpression__Group_1_1__0
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
    // InternalKExpressions.g:3195:1: rule__BitwiseAndExpression__Group_1__2 : rule__BitwiseAndExpression__Group_1__2__Impl ;
    public final void rule__BitwiseAndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3199:1: ( rule__BitwiseAndExpression__Group_1__2__Impl )
            // InternalKExpressions.g:3200:2: rule__BitwiseAndExpression__Group_1__2__Impl
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
    // InternalKExpressions.g:3206:1: rule__BitwiseAndExpression__Group_1__2__Impl : ( ( rule__BitwiseAndExpression__Group_1_2__0 )* ) ;
    public final void rule__BitwiseAndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3210:1: ( ( ( rule__BitwiseAndExpression__Group_1_2__0 )* ) )
            // InternalKExpressions.g:3211:1: ( ( rule__BitwiseAndExpression__Group_1_2__0 )* )
            {
            // InternalKExpressions.g:3211:1: ( ( rule__BitwiseAndExpression__Group_1_2__0 )* )
            // InternalKExpressions.g:3212:1: ( rule__BitwiseAndExpression__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndExpressionAccess().getGroup_1_2()); 
            }
            // InternalKExpressions.g:3213:1: ( rule__BitwiseAndExpression__Group_1_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==19) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalKExpressions.g:3213:2: rule__BitwiseAndExpression__Group_1_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_14);
            	    rule__BitwiseAndExpression__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalKExpressions.g:3229:1: rule__BitwiseAndExpression__Group_1_1__0 : rule__BitwiseAndExpression__Group_1_1__0__Impl rule__BitwiseAndExpression__Group_1_1__1 ;
    public final void rule__BitwiseAndExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3233:1: ( rule__BitwiseAndExpression__Group_1_1__0__Impl rule__BitwiseAndExpression__Group_1_1__1 )
            // InternalKExpressions.g:3234:2: rule__BitwiseAndExpression__Group_1_1__0__Impl rule__BitwiseAndExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
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
    // InternalKExpressions.g:3241:1: rule__BitwiseAndExpression__Group_1_1__0__Impl : ( ( rule__BitwiseAndExpression__OperatorAssignment_1_1_0 ) ) ;
    public final void rule__BitwiseAndExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3245:1: ( ( ( rule__BitwiseAndExpression__OperatorAssignment_1_1_0 ) ) )
            // InternalKExpressions.g:3246:1: ( ( rule__BitwiseAndExpression__OperatorAssignment_1_1_0 ) )
            {
            // InternalKExpressions.g:3246:1: ( ( rule__BitwiseAndExpression__OperatorAssignment_1_1_0 ) )
            // InternalKExpressions.g:3247:1: ( rule__BitwiseAndExpression__OperatorAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndExpressionAccess().getOperatorAssignment_1_1_0()); 
            }
            // InternalKExpressions.g:3248:1: ( rule__BitwiseAndExpression__OperatorAssignment_1_1_0 )
            // InternalKExpressions.g:3248:2: rule__BitwiseAndExpression__OperatorAssignment_1_1_0
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
    // InternalKExpressions.g:3258:1: rule__BitwiseAndExpression__Group_1_1__1 : rule__BitwiseAndExpression__Group_1_1__1__Impl ;
    public final void rule__BitwiseAndExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3262:1: ( rule__BitwiseAndExpression__Group_1_1__1__Impl )
            // InternalKExpressions.g:3263:2: rule__BitwiseAndExpression__Group_1_1__1__Impl
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
    // InternalKExpressions.g:3269:1: rule__BitwiseAndExpression__Group_1_1__1__Impl : ( ( rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__BitwiseAndExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3273:1: ( ( ( rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1 ) ) )
            // InternalKExpressions.g:3274:1: ( ( rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1 ) )
            {
            // InternalKExpressions.g:3274:1: ( ( rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1 ) )
            // InternalKExpressions.g:3275:1: ( rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }
            // InternalKExpressions.g:3276:1: ( rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1 )
            // InternalKExpressions.g:3276:2: rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1
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
    // InternalKExpressions.g:3290:1: rule__BitwiseAndExpression__Group_1_2__0 : rule__BitwiseAndExpression__Group_1_2__0__Impl rule__BitwiseAndExpression__Group_1_2__1 ;
    public final void rule__BitwiseAndExpression__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3294:1: ( rule__BitwiseAndExpression__Group_1_2__0__Impl rule__BitwiseAndExpression__Group_1_2__1 )
            // InternalKExpressions.g:3295:2: rule__BitwiseAndExpression__Group_1_2__0__Impl rule__BitwiseAndExpression__Group_1_2__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
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
    // InternalKExpressions.g:3302:1: rule__BitwiseAndExpression__Group_1_2__0__Impl : ( '&' ) ;
    public final void rule__BitwiseAndExpression__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3306:1: ( ( '&' ) )
            // InternalKExpressions.g:3307:1: ( '&' )
            {
            // InternalKExpressions.g:3307:1: ( '&' )
            // InternalKExpressions.g:3308:1: '&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndExpressionAccess().getAmpersandKeyword_1_2_0()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:3321:1: rule__BitwiseAndExpression__Group_1_2__1 : rule__BitwiseAndExpression__Group_1_2__1__Impl ;
    public final void rule__BitwiseAndExpression__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3325:1: ( rule__BitwiseAndExpression__Group_1_2__1__Impl )
            // InternalKExpressions.g:3326:2: rule__BitwiseAndExpression__Group_1_2__1__Impl
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
    // InternalKExpressions.g:3332:1: rule__BitwiseAndExpression__Group_1_2__1__Impl : ( ( rule__BitwiseAndExpression__SubExpressionsAssignment_1_2_1 ) ) ;
    public final void rule__BitwiseAndExpression__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3336:1: ( ( ( rule__BitwiseAndExpression__SubExpressionsAssignment_1_2_1 ) ) )
            // InternalKExpressions.g:3337:1: ( ( rule__BitwiseAndExpression__SubExpressionsAssignment_1_2_1 ) )
            {
            // InternalKExpressions.g:3337:1: ( ( rule__BitwiseAndExpression__SubExpressionsAssignment_1_2_1 ) )
            // InternalKExpressions.g:3338:1: ( rule__BitwiseAndExpression__SubExpressionsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsAssignment_1_2_1()); 
            }
            // InternalKExpressions.g:3339:1: ( rule__BitwiseAndExpression__SubExpressionsAssignment_1_2_1 )
            // InternalKExpressions.g:3339:2: rule__BitwiseAndExpression__SubExpressionsAssignment_1_2_1
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
    // InternalKExpressions.g:3353:1: rule__CompareOperation__Group__0 : rule__CompareOperation__Group__0__Impl rule__CompareOperation__Group__1 ;
    public final void rule__CompareOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3357:1: ( rule__CompareOperation__Group__0__Impl rule__CompareOperation__Group__1 )
            // InternalKExpressions.g:3358:2: rule__CompareOperation__Group__0__Impl rule__CompareOperation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
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
    // InternalKExpressions.g:3365:1: rule__CompareOperation__Group__0__Impl : ( ruleNotOrValuedExpression ) ;
    public final void rule__CompareOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3369:1: ( ( ruleNotOrValuedExpression ) )
            // InternalKExpressions.g:3370:1: ( ruleNotOrValuedExpression )
            {
            // InternalKExpressions.g:3370:1: ( ruleNotOrValuedExpression )
            // InternalKExpressions.g:3371:1: ruleNotOrValuedExpression
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
    // InternalKExpressions.g:3382:1: rule__CompareOperation__Group__1 : rule__CompareOperation__Group__1__Impl ;
    public final void rule__CompareOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3386:1: ( rule__CompareOperation__Group__1__Impl )
            // InternalKExpressions.g:3387:2: rule__CompareOperation__Group__1__Impl
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
    // InternalKExpressions.g:3393:1: rule__CompareOperation__Group__1__Impl : ( ( rule__CompareOperation__Group_1__0 )? ) ;
    public final void rule__CompareOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3397:1: ( ( ( rule__CompareOperation__Group_1__0 )? ) )
            // InternalKExpressions.g:3398:1: ( ( rule__CompareOperation__Group_1__0 )? )
            {
            // InternalKExpressions.g:3398:1: ( ( rule__CompareOperation__Group_1__0 )? )
            // InternalKExpressions.g:3399:1: ( rule__CompareOperation__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:3400:1: ( rule__CompareOperation__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=31 && LA27_0<=36)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalKExpressions.g:3400:2: rule__CompareOperation__Group_1__0
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
    // InternalKExpressions.g:3414:1: rule__CompareOperation__Group_1__0 : rule__CompareOperation__Group_1__0__Impl rule__CompareOperation__Group_1__1 ;
    public final void rule__CompareOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3418:1: ( rule__CompareOperation__Group_1__0__Impl rule__CompareOperation__Group_1__1 )
            // InternalKExpressions.g:3419:2: rule__CompareOperation__Group_1__0__Impl rule__CompareOperation__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
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
    // InternalKExpressions.g:3426:1: rule__CompareOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__CompareOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3430:1: ( ( () ) )
            // InternalKExpressions.g:3431:1: ( () )
            {
            // InternalKExpressions.g:3431:1: ( () )
            // InternalKExpressions.g:3432:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:3433:1: ()
            // InternalKExpressions.g:3435:1: 
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
    // InternalKExpressions.g:3445:1: rule__CompareOperation__Group_1__1 : rule__CompareOperation__Group_1__1__Impl rule__CompareOperation__Group_1__2 ;
    public final void rule__CompareOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3449:1: ( rule__CompareOperation__Group_1__1__Impl rule__CompareOperation__Group_1__2 )
            // InternalKExpressions.g:3450:2: rule__CompareOperation__Group_1__1__Impl rule__CompareOperation__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
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
    // InternalKExpressions.g:3457:1: rule__CompareOperation__Group_1__1__Impl : ( ( rule__CompareOperation__OperatorAssignment_1_1 ) ) ;
    public final void rule__CompareOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3461:1: ( ( ( rule__CompareOperation__OperatorAssignment_1_1 ) ) )
            // InternalKExpressions.g:3462:1: ( ( rule__CompareOperation__OperatorAssignment_1_1 ) )
            {
            // InternalKExpressions.g:3462:1: ( ( rule__CompareOperation__OperatorAssignment_1_1 ) )
            // InternalKExpressions.g:3463:1: ( rule__CompareOperation__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKExpressions.g:3464:1: ( rule__CompareOperation__OperatorAssignment_1_1 )
            // InternalKExpressions.g:3464:2: rule__CompareOperation__OperatorAssignment_1_1
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
    // InternalKExpressions.g:3474:1: rule__CompareOperation__Group_1__2 : rule__CompareOperation__Group_1__2__Impl ;
    public final void rule__CompareOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3478:1: ( rule__CompareOperation__Group_1__2__Impl )
            // InternalKExpressions.g:3479:2: rule__CompareOperation__Group_1__2__Impl
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
    // InternalKExpressions.g:3485:1: rule__CompareOperation__Group_1__2__Impl : ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__CompareOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3489:1: ( ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) ) )
            // InternalKExpressions.g:3490:1: ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) )
            {
            // InternalKExpressions.g:3490:1: ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) )
            // InternalKExpressions.g:3491:1: ( rule__CompareOperation__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // InternalKExpressions.g:3492:1: ( rule__CompareOperation__SubExpressionsAssignment_1_2 )
            // InternalKExpressions.g:3492:2: rule__CompareOperation__SubExpressionsAssignment_1_2
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
    // InternalKExpressions.g:3508:1: rule__NotExpression__Group_0__0 : rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1 ;
    public final void rule__NotExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3512:1: ( rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1 )
            // InternalKExpressions.g:3513:2: rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
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
    // InternalKExpressions.g:3520:1: rule__NotExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__NotExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3524:1: ( ( () ) )
            // InternalKExpressions.g:3525:1: ( () )
            {
            // InternalKExpressions.g:3525:1: ( () )
            // InternalKExpressions.g:3526:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // InternalKExpressions.g:3527:1: ()
            // InternalKExpressions.g:3529:1: 
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
    // InternalKExpressions.g:3539:1: rule__NotExpression__Group_0__1 : rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2 ;
    public final void rule__NotExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3543:1: ( rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2 )
            // InternalKExpressions.g:3544:2: rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
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
    // InternalKExpressions.g:3551:1: rule__NotExpression__Group_0__1__Impl : ( ( rule__NotExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__NotExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3555:1: ( ( ( rule__NotExpression__OperatorAssignment_0_1 ) ) )
            // InternalKExpressions.g:3556:1: ( ( rule__NotExpression__OperatorAssignment_0_1 ) )
            {
            // InternalKExpressions.g:3556:1: ( ( rule__NotExpression__OperatorAssignment_0_1 ) )
            // InternalKExpressions.g:3557:1: ( rule__NotExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // InternalKExpressions.g:3558:1: ( rule__NotExpression__OperatorAssignment_0_1 )
            // InternalKExpressions.g:3558:2: rule__NotExpression__OperatorAssignment_0_1
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
    // InternalKExpressions.g:3568:1: rule__NotExpression__Group_0__2 : rule__NotExpression__Group_0__2__Impl ;
    public final void rule__NotExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3572:1: ( rule__NotExpression__Group_0__2__Impl )
            // InternalKExpressions.g:3573:2: rule__NotExpression__Group_0__2__Impl
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
    // InternalKExpressions.g:3579:1: rule__NotExpression__Group_0__2__Impl : ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) ) ;
    public final void rule__NotExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3583:1: ( ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) ) )
            // InternalKExpressions.g:3584:1: ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) )
            {
            // InternalKExpressions.g:3584:1: ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) )
            // InternalKExpressions.g:3585:1: ( rule__NotExpression__SubExpressionsAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubExpressionsAssignment_0_2()); 
            }
            // InternalKExpressions.g:3586:1: ( rule__NotExpression__SubExpressionsAssignment_0_2 )
            // InternalKExpressions.g:3586:2: rule__NotExpression__SubExpressionsAssignment_0_2
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
    // InternalKExpressions.g:3602:1: rule__AddExpression__Group__0 : rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 ;
    public final void rule__AddExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3606:1: ( rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 )
            // InternalKExpressions.g:3607:2: rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
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
    // InternalKExpressions.g:3614:1: rule__AddExpression__Group__0__Impl : ( ruleSubExpression ) ;
    public final void rule__AddExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3618:1: ( ( ruleSubExpression ) )
            // InternalKExpressions.g:3619:1: ( ruleSubExpression )
            {
            // InternalKExpressions.g:3619:1: ( ruleSubExpression )
            // InternalKExpressions.g:3620:1: ruleSubExpression
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
    // InternalKExpressions.g:3631:1: rule__AddExpression__Group__1 : rule__AddExpression__Group__1__Impl ;
    public final void rule__AddExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3635:1: ( rule__AddExpression__Group__1__Impl )
            // InternalKExpressions.g:3636:2: rule__AddExpression__Group__1__Impl
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
    // InternalKExpressions.g:3642:1: rule__AddExpression__Group__1__Impl : ( ( rule__AddExpression__Group_1__0 )? ) ;
    public final void rule__AddExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3646:1: ( ( ( rule__AddExpression__Group_1__0 )? ) )
            // InternalKExpressions.g:3647:1: ( ( rule__AddExpression__Group_1__0 )? )
            {
            // InternalKExpressions.g:3647:1: ( ( rule__AddExpression__Group_1__0 )? )
            // InternalKExpressions.g:3648:1: ( rule__AddExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:3649:1: ( rule__AddExpression__Group_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==21) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalKExpressions.g:3649:2: rule__AddExpression__Group_1__0
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
    // InternalKExpressions.g:3663:1: rule__AddExpression__Group_1__0 : rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 ;
    public final void rule__AddExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3667:1: ( rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 )
            // InternalKExpressions.g:3668:2: rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
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
    // InternalKExpressions.g:3675:1: rule__AddExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AddExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3679:1: ( ( () ) )
            // InternalKExpressions.g:3680:1: ( () )
            {
            // InternalKExpressions.g:3680:1: ( () )
            // InternalKExpressions.g:3681:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:3682:1: ()
            // InternalKExpressions.g:3684:1: 
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
    // InternalKExpressions.g:3694:1: rule__AddExpression__Group_1__1 : rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2 ;
    public final void rule__AddExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3698:1: ( rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2 )
            // InternalKExpressions.g:3699:2: rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_17);
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
    // InternalKExpressions.g:3706:1: rule__AddExpression__Group_1__1__Impl : ( ( rule__AddExpression__Group_1_1__0 ) ) ;
    public final void rule__AddExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3710:1: ( ( ( rule__AddExpression__Group_1_1__0 ) ) )
            // InternalKExpressions.g:3711:1: ( ( rule__AddExpression__Group_1_1__0 ) )
            {
            // InternalKExpressions.g:3711:1: ( ( rule__AddExpression__Group_1_1__0 ) )
            // InternalKExpressions.g:3712:1: ( rule__AddExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1_1()); 
            }
            // InternalKExpressions.g:3713:1: ( rule__AddExpression__Group_1_1__0 )
            // InternalKExpressions.g:3713:2: rule__AddExpression__Group_1_1__0
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
    // InternalKExpressions.g:3723:1: rule__AddExpression__Group_1__2 : rule__AddExpression__Group_1__2__Impl ;
    public final void rule__AddExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3727:1: ( rule__AddExpression__Group_1__2__Impl )
            // InternalKExpressions.g:3728:2: rule__AddExpression__Group_1__2__Impl
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
    // InternalKExpressions.g:3734:1: rule__AddExpression__Group_1__2__Impl : ( ( rule__AddExpression__Group_1_2__0 )* ) ;
    public final void rule__AddExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3738:1: ( ( ( rule__AddExpression__Group_1_2__0 )* ) )
            // InternalKExpressions.g:3739:1: ( ( rule__AddExpression__Group_1_2__0 )* )
            {
            // InternalKExpressions.g:3739:1: ( ( rule__AddExpression__Group_1_2__0 )* )
            // InternalKExpressions.g:3740:1: ( rule__AddExpression__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1_2()); 
            }
            // InternalKExpressions.g:3741:1: ( rule__AddExpression__Group_1_2__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==21) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalKExpressions.g:3741:2: rule__AddExpression__Group_1_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    rule__AddExpression__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalKExpressions.g:3757:1: rule__AddExpression__Group_1_1__0 : rule__AddExpression__Group_1_1__0__Impl rule__AddExpression__Group_1_1__1 ;
    public final void rule__AddExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3761:1: ( rule__AddExpression__Group_1_1__0__Impl rule__AddExpression__Group_1_1__1 )
            // InternalKExpressions.g:3762:2: rule__AddExpression__Group_1_1__0__Impl rule__AddExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
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
    // InternalKExpressions.g:3769:1: rule__AddExpression__Group_1_1__0__Impl : ( ( rule__AddExpression__OperatorAssignment_1_1_0 ) ) ;
    public final void rule__AddExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3773:1: ( ( ( rule__AddExpression__OperatorAssignment_1_1_0 ) ) )
            // InternalKExpressions.g:3774:1: ( ( rule__AddExpression__OperatorAssignment_1_1_0 ) )
            {
            // InternalKExpressions.g:3774:1: ( ( rule__AddExpression__OperatorAssignment_1_1_0 ) )
            // InternalKExpressions.g:3775:1: ( rule__AddExpression__OperatorAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorAssignment_1_1_0()); 
            }
            // InternalKExpressions.g:3776:1: ( rule__AddExpression__OperatorAssignment_1_1_0 )
            // InternalKExpressions.g:3776:2: rule__AddExpression__OperatorAssignment_1_1_0
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
    // InternalKExpressions.g:3786:1: rule__AddExpression__Group_1_1__1 : rule__AddExpression__Group_1_1__1__Impl ;
    public final void rule__AddExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3790:1: ( rule__AddExpression__Group_1_1__1__Impl )
            // InternalKExpressions.g:3791:2: rule__AddExpression__Group_1_1__1__Impl
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
    // InternalKExpressions.g:3797:1: rule__AddExpression__Group_1_1__1__Impl : ( ( rule__AddExpression__SubExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__AddExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3801:1: ( ( ( rule__AddExpression__SubExpressionsAssignment_1_1_1 ) ) )
            // InternalKExpressions.g:3802:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_1_1 ) )
            {
            // InternalKExpressions.g:3802:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_1_1 ) )
            // InternalKExpressions.g:3803:1: ( rule__AddExpression__SubExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }
            // InternalKExpressions.g:3804:1: ( rule__AddExpression__SubExpressionsAssignment_1_1_1 )
            // InternalKExpressions.g:3804:2: rule__AddExpression__SubExpressionsAssignment_1_1_1
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
    // InternalKExpressions.g:3818:1: rule__AddExpression__Group_1_2__0 : rule__AddExpression__Group_1_2__0__Impl rule__AddExpression__Group_1_2__1 ;
    public final void rule__AddExpression__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3822:1: ( rule__AddExpression__Group_1_2__0__Impl rule__AddExpression__Group_1_2__1 )
            // InternalKExpressions.g:3823:2: rule__AddExpression__Group_1_2__0__Impl rule__AddExpression__Group_1_2__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
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
    // InternalKExpressions.g:3830:1: rule__AddExpression__Group_1_2__0__Impl : ( '+' ) ;
    public final void rule__AddExpression__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3834:1: ( ( '+' ) )
            // InternalKExpressions.g:3835:1: ( '+' )
            {
            // InternalKExpressions.g:3835:1: ( '+' )
            // InternalKExpressions.g:3836:1: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getPlusSignKeyword_1_2_0()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:3849:1: rule__AddExpression__Group_1_2__1 : rule__AddExpression__Group_1_2__1__Impl ;
    public final void rule__AddExpression__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3853:1: ( rule__AddExpression__Group_1_2__1__Impl )
            // InternalKExpressions.g:3854:2: rule__AddExpression__Group_1_2__1__Impl
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
    // InternalKExpressions.g:3860:1: rule__AddExpression__Group_1_2__1__Impl : ( ( rule__AddExpression__SubExpressionsAssignment_1_2_1 ) ) ;
    public final void rule__AddExpression__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3864:1: ( ( ( rule__AddExpression__SubExpressionsAssignment_1_2_1 ) ) )
            // InternalKExpressions.g:3865:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_2_1 ) )
            {
            // InternalKExpressions.g:3865:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_2_1 ) )
            // InternalKExpressions.g:3866:1: ( rule__AddExpression__SubExpressionsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionsAssignment_1_2_1()); 
            }
            // InternalKExpressions.g:3867:1: ( rule__AddExpression__SubExpressionsAssignment_1_2_1 )
            // InternalKExpressions.g:3867:2: rule__AddExpression__SubExpressionsAssignment_1_2_1
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
    // InternalKExpressions.g:3881:1: rule__SubExpression__Group__0 : rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 ;
    public final void rule__SubExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3885:1: ( rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 )
            // InternalKExpressions.g:3886:2: rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_20);
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
    // InternalKExpressions.g:3893:1: rule__SubExpression__Group__0__Impl : ( ruleMultExpression ) ;
    public final void rule__SubExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3897:1: ( ( ruleMultExpression ) )
            // InternalKExpressions.g:3898:1: ( ruleMultExpression )
            {
            // InternalKExpressions.g:3898:1: ( ruleMultExpression )
            // InternalKExpressions.g:3899:1: ruleMultExpression
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
    // InternalKExpressions.g:3910:1: rule__SubExpression__Group__1 : rule__SubExpression__Group__1__Impl ;
    public final void rule__SubExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3914:1: ( rule__SubExpression__Group__1__Impl )
            // InternalKExpressions.g:3915:2: rule__SubExpression__Group__1__Impl
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
    // InternalKExpressions.g:3921:1: rule__SubExpression__Group__1__Impl : ( ( rule__SubExpression__Group_1__0 )? ) ;
    public final void rule__SubExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3925:1: ( ( ( rule__SubExpression__Group_1__0 )? ) )
            // InternalKExpressions.g:3926:1: ( ( rule__SubExpression__Group_1__0 )? )
            {
            // InternalKExpressions.g:3926:1: ( ( rule__SubExpression__Group_1__0 )? )
            // InternalKExpressions.g:3927:1: ( rule__SubExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:3928:1: ( rule__SubExpression__Group_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==22) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalKExpressions.g:3928:2: rule__SubExpression__Group_1__0
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
    // InternalKExpressions.g:3942:1: rule__SubExpression__Group_1__0 : rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 ;
    public final void rule__SubExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3946:1: ( rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 )
            // InternalKExpressions.g:3947:2: rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_20);
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
    // InternalKExpressions.g:3954:1: rule__SubExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__SubExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3958:1: ( ( () ) )
            // InternalKExpressions.g:3959:1: ( () )
            {
            // InternalKExpressions.g:3959:1: ( () )
            // InternalKExpressions.g:3960:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:3961:1: ()
            // InternalKExpressions.g:3963:1: 
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
    // InternalKExpressions.g:3973:1: rule__SubExpression__Group_1__1 : rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2 ;
    public final void rule__SubExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3977:1: ( rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2 )
            // InternalKExpressions.g:3978:2: rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_20);
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
    // InternalKExpressions.g:3985:1: rule__SubExpression__Group_1__1__Impl : ( ( rule__SubExpression__Group_1_1__0 ) ) ;
    public final void rule__SubExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3989:1: ( ( ( rule__SubExpression__Group_1_1__0 ) ) )
            // InternalKExpressions.g:3990:1: ( ( rule__SubExpression__Group_1_1__0 ) )
            {
            // InternalKExpressions.g:3990:1: ( ( rule__SubExpression__Group_1_1__0 ) )
            // InternalKExpressions.g:3991:1: ( rule__SubExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup_1_1()); 
            }
            // InternalKExpressions.g:3992:1: ( rule__SubExpression__Group_1_1__0 )
            // InternalKExpressions.g:3992:2: rule__SubExpression__Group_1_1__0
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
    // InternalKExpressions.g:4002:1: rule__SubExpression__Group_1__2 : rule__SubExpression__Group_1__2__Impl ;
    public final void rule__SubExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4006:1: ( rule__SubExpression__Group_1__2__Impl )
            // InternalKExpressions.g:4007:2: rule__SubExpression__Group_1__2__Impl
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
    // InternalKExpressions.g:4013:1: rule__SubExpression__Group_1__2__Impl : ( ( rule__SubExpression__Group_1_2__0 )* ) ;
    public final void rule__SubExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4017:1: ( ( ( rule__SubExpression__Group_1_2__0 )* ) )
            // InternalKExpressions.g:4018:1: ( ( rule__SubExpression__Group_1_2__0 )* )
            {
            // InternalKExpressions.g:4018:1: ( ( rule__SubExpression__Group_1_2__0 )* )
            // InternalKExpressions.g:4019:1: ( rule__SubExpression__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup_1_2()); 
            }
            // InternalKExpressions.g:4020:1: ( rule__SubExpression__Group_1_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==22) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalKExpressions.g:4020:2: rule__SubExpression__Group_1_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    rule__SubExpression__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalKExpressions.g:4036:1: rule__SubExpression__Group_1_1__0 : rule__SubExpression__Group_1_1__0__Impl rule__SubExpression__Group_1_1__1 ;
    public final void rule__SubExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4040:1: ( rule__SubExpression__Group_1_1__0__Impl rule__SubExpression__Group_1_1__1 )
            // InternalKExpressions.g:4041:2: rule__SubExpression__Group_1_1__0__Impl rule__SubExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
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
    // InternalKExpressions.g:4048:1: rule__SubExpression__Group_1_1__0__Impl : ( ( rule__SubExpression__OperatorAssignment_1_1_0 ) ) ;
    public final void rule__SubExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4052:1: ( ( ( rule__SubExpression__OperatorAssignment_1_1_0 ) ) )
            // InternalKExpressions.g:4053:1: ( ( rule__SubExpression__OperatorAssignment_1_1_0 ) )
            {
            // InternalKExpressions.g:4053:1: ( ( rule__SubExpression__OperatorAssignment_1_1_0 ) )
            // InternalKExpressions.g:4054:1: ( rule__SubExpression__OperatorAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorAssignment_1_1_0()); 
            }
            // InternalKExpressions.g:4055:1: ( rule__SubExpression__OperatorAssignment_1_1_0 )
            // InternalKExpressions.g:4055:2: rule__SubExpression__OperatorAssignment_1_1_0
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
    // InternalKExpressions.g:4065:1: rule__SubExpression__Group_1_1__1 : rule__SubExpression__Group_1_1__1__Impl ;
    public final void rule__SubExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4069:1: ( rule__SubExpression__Group_1_1__1__Impl )
            // InternalKExpressions.g:4070:2: rule__SubExpression__Group_1_1__1__Impl
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
    // InternalKExpressions.g:4076:1: rule__SubExpression__Group_1_1__1__Impl : ( ( rule__SubExpression__SubExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__SubExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4080:1: ( ( ( rule__SubExpression__SubExpressionsAssignment_1_1_1 ) ) )
            // InternalKExpressions.g:4081:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_1_1 ) )
            {
            // InternalKExpressions.g:4081:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_1_1 ) )
            // InternalKExpressions.g:4082:1: ( rule__SubExpression__SubExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }
            // InternalKExpressions.g:4083:1: ( rule__SubExpression__SubExpressionsAssignment_1_1_1 )
            // InternalKExpressions.g:4083:2: rule__SubExpression__SubExpressionsAssignment_1_1_1
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
    // InternalKExpressions.g:4097:1: rule__SubExpression__Group_1_2__0 : rule__SubExpression__Group_1_2__0__Impl rule__SubExpression__Group_1_2__1 ;
    public final void rule__SubExpression__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4101:1: ( rule__SubExpression__Group_1_2__0__Impl rule__SubExpression__Group_1_2__1 )
            // InternalKExpressions.g:4102:2: rule__SubExpression__Group_1_2__0__Impl rule__SubExpression__Group_1_2__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
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
    // InternalKExpressions.g:4109:1: rule__SubExpression__Group_1_2__0__Impl : ( '-' ) ;
    public final void rule__SubExpression__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4113:1: ( ( '-' ) )
            // InternalKExpressions.g:4114:1: ( '-' )
            {
            // InternalKExpressions.g:4114:1: ( '-' )
            // InternalKExpressions.g:4115:1: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getHyphenMinusKeyword_1_2_0()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:4128:1: rule__SubExpression__Group_1_2__1 : rule__SubExpression__Group_1_2__1__Impl ;
    public final void rule__SubExpression__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4132:1: ( rule__SubExpression__Group_1_2__1__Impl )
            // InternalKExpressions.g:4133:2: rule__SubExpression__Group_1_2__1__Impl
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
    // InternalKExpressions.g:4139:1: rule__SubExpression__Group_1_2__1__Impl : ( ( rule__SubExpression__SubExpressionsAssignment_1_2_1 ) ) ;
    public final void rule__SubExpression__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4143:1: ( ( ( rule__SubExpression__SubExpressionsAssignment_1_2_1 ) ) )
            // InternalKExpressions.g:4144:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_2_1 ) )
            {
            // InternalKExpressions.g:4144:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_2_1 ) )
            // InternalKExpressions.g:4145:1: ( rule__SubExpression__SubExpressionsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getSubExpressionsAssignment_1_2_1()); 
            }
            // InternalKExpressions.g:4146:1: ( rule__SubExpression__SubExpressionsAssignment_1_2_1 )
            // InternalKExpressions.g:4146:2: rule__SubExpression__SubExpressionsAssignment_1_2_1
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
    // InternalKExpressions.g:4160:1: rule__MultExpression__Group__0 : rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 ;
    public final void rule__MultExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4164:1: ( rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 )
            // InternalKExpressions.g:4165:2: rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_22);
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
    // InternalKExpressions.g:4172:1: rule__MultExpression__Group__0__Impl : ( ruleDivExpression ) ;
    public final void rule__MultExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4176:1: ( ( ruleDivExpression ) )
            // InternalKExpressions.g:4177:1: ( ruleDivExpression )
            {
            // InternalKExpressions.g:4177:1: ( ruleDivExpression )
            // InternalKExpressions.g:4178:1: ruleDivExpression
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
    // InternalKExpressions.g:4189:1: rule__MultExpression__Group__1 : rule__MultExpression__Group__1__Impl ;
    public final void rule__MultExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4193:1: ( rule__MultExpression__Group__1__Impl )
            // InternalKExpressions.g:4194:2: rule__MultExpression__Group__1__Impl
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
    // InternalKExpressions.g:4200:1: rule__MultExpression__Group__1__Impl : ( ( rule__MultExpression__Group_1__0 )? ) ;
    public final void rule__MultExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4204:1: ( ( ( rule__MultExpression__Group_1__0 )? ) )
            // InternalKExpressions.g:4205:1: ( ( rule__MultExpression__Group_1__0 )? )
            {
            // InternalKExpressions.g:4205:1: ( ( rule__MultExpression__Group_1__0 )? )
            // InternalKExpressions.g:4206:1: ( rule__MultExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:4207:1: ( rule__MultExpression__Group_1__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==23) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalKExpressions.g:4207:2: rule__MultExpression__Group_1__0
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
    // InternalKExpressions.g:4221:1: rule__MultExpression__Group_1__0 : rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 ;
    public final void rule__MultExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4225:1: ( rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 )
            // InternalKExpressions.g:4226:2: rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_22);
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
    // InternalKExpressions.g:4233:1: rule__MultExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4237:1: ( ( () ) )
            // InternalKExpressions.g:4238:1: ( () )
            {
            // InternalKExpressions.g:4238:1: ( () )
            // InternalKExpressions.g:4239:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:4240:1: ()
            // InternalKExpressions.g:4242:1: 
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
    // InternalKExpressions.g:4252:1: rule__MultExpression__Group_1__1 : rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2 ;
    public final void rule__MultExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4256:1: ( rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2 )
            // InternalKExpressions.g:4257:2: rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_22);
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
    // InternalKExpressions.g:4264:1: rule__MultExpression__Group_1__1__Impl : ( ( rule__MultExpression__Group_1_1__0 ) ) ;
    public final void rule__MultExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4268:1: ( ( ( rule__MultExpression__Group_1_1__0 ) ) )
            // InternalKExpressions.g:4269:1: ( ( rule__MultExpression__Group_1_1__0 ) )
            {
            // InternalKExpressions.g:4269:1: ( ( rule__MultExpression__Group_1_1__0 ) )
            // InternalKExpressions.g:4270:1: ( rule__MultExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getGroup_1_1()); 
            }
            // InternalKExpressions.g:4271:1: ( rule__MultExpression__Group_1_1__0 )
            // InternalKExpressions.g:4271:2: rule__MultExpression__Group_1_1__0
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
    // InternalKExpressions.g:4281:1: rule__MultExpression__Group_1__2 : rule__MultExpression__Group_1__2__Impl ;
    public final void rule__MultExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4285:1: ( rule__MultExpression__Group_1__2__Impl )
            // InternalKExpressions.g:4286:2: rule__MultExpression__Group_1__2__Impl
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
    // InternalKExpressions.g:4292:1: rule__MultExpression__Group_1__2__Impl : ( ( rule__MultExpression__Group_1_2__0 )* ) ;
    public final void rule__MultExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4296:1: ( ( ( rule__MultExpression__Group_1_2__0 )* ) )
            // InternalKExpressions.g:4297:1: ( ( rule__MultExpression__Group_1_2__0 )* )
            {
            // InternalKExpressions.g:4297:1: ( ( rule__MultExpression__Group_1_2__0 )* )
            // InternalKExpressions.g:4298:1: ( rule__MultExpression__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getGroup_1_2()); 
            }
            // InternalKExpressions.g:4299:1: ( rule__MultExpression__Group_1_2__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==23) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalKExpressions.g:4299:2: rule__MultExpression__Group_1_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_23);
            	    rule__MultExpression__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalKExpressions.g:4315:1: rule__MultExpression__Group_1_1__0 : rule__MultExpression__Group_1_1__0__Impl rule__MultExpression__Group_1_1__1 ;
    public final void rule__MultExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4319:1: ( rule__MultExpression__Group_1_1__0__Impl rule__MultExpression__Group_1_1__1 )
            // InternalKExpressions.g:4320:2: rule__MultExpression__Group_1_1__0__Impl rule__MultExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
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
    // InternalKExpressions.g:4327:1: rule__MultExpression__Group_1_1__0__Impl : ( ( rule__MultExpression__OperatorAssignment_1_1_0 ) ) ;
    public final void rule__MultExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4331:1: ( ( ( rule__MultExpression__OperatorAssignment_1_1_0 ) ) )
            // InternalKExpressions.g:4332:1: ( ( rule__MultExpression__OperatorAssignment_1_1_0 ) )
            {
            // InternalKExpressions.g:4332:1: ( ( rule__MultExpression__OperatorAssignment_1_1_0 ) )
            // InternalKExpressions.g:4333:1: ( rule__MultExpression__OperatorAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorAssignment_1_1_0()); 
            }
            // InternalKExpressions.g:4334:1: ( rule__MultExpression__OperatorAssignment_1_1_0 )
            // InternalKExpressions.g:4334:2: rule__MultExpression__OperatorAssignment_1_1_0
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
    // InternalKExpressions.g:4344:1: rule__MultExpression__Group_1_1__1 : rule__MultExpression__Group_1_1__1__Impl ;
    public final void rule__MultExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4348:1: ( rule__MultExpression__Group_1_1__1__Impl )
            // InternalKExpressions.g:4349:2: rule__MultExpression__Group_1_1__1__Impl
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
    // InternalKExpressions.g:4355:1: rule__MultExpression__Group_1_1__1__Impl : ( ( rule__MultExpression__SubExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__MultExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4359:1: ( ( ( rule__MultExpression__SubExpressionsAssignment_1_1_1 ) ) )
            // InternalKExpressions.g:4360:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_1_1 ) )
            {
            // InternalKExpressions.g:4360:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_1_1 ) )
            // InternalKExpressions.g:4361:1: ( rule__MultExpression__SubExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }
            // InternalKExpressions.g:4362:1: ( rule__MultExpression__SubExpressionsAssignment_1_1_1 )
            // InternalKExpressions.g:4362:2: rule__MultExpression__SubExpressionsAssignment_1_1_1
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
    // InternalKExpressions.g:4376:1: rule__MultExpression__Group_1_2__0 : rule__MultExpression__Group_1_2__0__Impl rule__MultExpression__Group_1_2__1 ;
    public final void rule__MultExpression__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4380:1: ( rule__MultExpression__Group_1_2__0__Impl rule__MultExpression__Group_1_2__1 )
            // InternalKExpressions.g:4381:2: rule__MultExpression__Group_1_2__0__Impl rule__MultExpression__Group_1_2__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
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
    // InternalKExpressions.g:4388:1: rule__MultExpression__Group_1_2__0__Impl : ( '*' ) ;
    public final void rule__MultExpression__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4392:1: ( ( '*' ) )
            // InternalKExpressions.g:4393:1: ( '*' )
            {
            // InternalKExpressions.g:4393:1: ( '*' )
            // InternalKExpressions.g:4394:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getAsteriskKeyword_1_2_0()); 
            }
            match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:4407:1: rule__MultExpression__Group_1_2__1 : rule__MultExpression__Group_1_2__1__Impl ;
    public final void rule__MultExpression__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4411:1: ( rule__MultExpression__Group_1_2__1__Impl )
            // InternalKExpressions.g:4412:2: rule__MultExpression__Group_1_2__1__Impl
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
    // InternalKExpressions.g:4418:1: rule__MultExpression__Group_1_2__1__Impl : ( ( rule__MultExpression__SubExpressionsAssignment_1_2_1 ) ) ;
    public final void rule__MultExpression__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4422:1: ( ( ( rule__MultExpression__SubExpressionsAssignment_1_2_1 ) ) )
            // InternalKExpressions.g:4423:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_2_1 ) )
            {
            // InternalKExpressions.g:4423:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_2_1 ) )
            // InternalKExpressions.g:4424:1: ( rule__MultExpression__SubExpressionsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getSubExpressionsAssignment_1_2_1()); 
            }
            // InternalKExpressions.g:4425:1: ( rule__MultExpression__SubExpressionsAssignment_1_2_1 )
            // InternalKExpressions.g:4425:2: rule__MultExpression__SubExpressionsAssignment_1_2_1
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
    // InternalKExpressions.g:4439:1: rule__DivExpression__Group__0 : rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1 ;
    public final void rule__DivExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4443:1: ( rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1 )
            // InternalKExpressions.g:4444:2: rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalKExpressions.g:4451:1: rule__DivExpression__Group__0__Impl : ( ruleModExpression ) ;
    public final void rule__DivExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4455:1: ( ( ruleModExpression ) )
            // InternalKExpressions.g:4456:1: ( ruleModExpression )
            {
            // InternalKExpressions.g:4456:1: ( ruleModExpression )
            // InternalKExpressions.g:4457:1: ruleModExpression
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
    // InternalKExpressions.g:4468:1: rule__DivExpression__Group__1 : rule__DivExpression__Group__1__Impl ;
    public final void rule__DivExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4472:1: ( rule__DivExpression__Group__1__Impl )
            // InternalKExpressions.g:4473:2: rule__DivExpression__Group__1__Impl
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
    // InternalKExpressions.g:4479:1: rule__DivExpression__Group__1__Impl : ( ( rule__DivExpression__Group_1__0 )? ) ;
    public final void rule__DivExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4483:1: ( ( ( rule__DivExpression__Group_1__0 )? ) )
            // InternalKExpressions.g:4484:1: ( ( rule__DivExpression__Group_1__0 )? )
            {
            // InternalKExpressions.g:4484:1: ( ( rule__DivExpression__Group_1__0 )? )
            // InternalKExpressions.g:4485:1: ( rule__DivExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:4486:1: ( rule__DivExpression__Group_1__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==25) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalKExpressions.g:4486:2: rule__DivExpression__Group_1__0
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
    // InternalKExpressions.g:4500:1: rule__DivExpression__Group_1__0 : rule__DivExpression__Group_1__0__Impl rule__DivExpression__Group_1__1 ;
    public final void rule__DivExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4504:1: ( rule__DivExpression__Group_1__0__Impl rule__DivExpression__Group_1__1 )
            // InternalKExpressions.g:4505:2: rule__DivExpression__Group_1__0__Impl rule__DivExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalKExpressions.g:4512:1: rule__DivExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__DivExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4516:1: ( ( () ) )
            // InternalKExpressions.g:4517:1: ( () )
            {
            // InternalKExpressions.g:4517:1: ( () )
            // InternalKExpressions.g:4518:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:4519:1: ()
            // InternalKExpressions.g:4521:1: 
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
    // InternalKExpressions.g:4531:1: rule__DivExpression__Group_1__1 : rule__DivExpression__Group_1__1__Impl rule__DivExpression__Group_1__2 ;
    public final void rule__DivExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4535:1: ( rule__DivExpression__Group_1__1__Impl rule__DivExpression__Group_1__2 )
            // InternalKExpressions.g:4536:2: rule__DivExpression__Group_1__1__Impl rule__DivExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalKExpressions.g:4543:1: rule__DivExpression__Group_1__1__Impl : ( ( rule__DivExpression__Group_1_1__0 ) ) ;
    public final void rule__DivExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4547:1: ( ( ( rule__DivExpression__Group_1_1__0 ) ) )
            // InternalKExpressions.g:4548:1: ( ( rule__DivExpression__Group_1_1__0 ) )
            {
            // InternalKExpressions.g:4548:1: ( ( rule__DivExpression__Group_1_1__0 ) )
            // InternalKExpressions.g:4549:1: ( rule__DivExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getGroup_1_1()); 
            }
            // InternalKExpressions.g:4550:1: ( rule__DivExpression__Group_1_1__0 )
            // InternalKExpressions.g:4550:2: rule__DivExpression__Group_1_1__0
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
    // InternalKExpressions.g:4560:1: rule__DivExpression__Group_1__2 : rule__DivExpression__Group_1__2__Impl ;
    public final void rule__DivExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4564:1: ( rule__DivExpression__Group_1__2__Impl )
            // InternalKExpressions.g:4565:2: rule__DivExpression__Group_1__2__Impl
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
    // InternalKExpressions.g:4571:1: rule__DivExpression__Group_1__2__Impl : ( ( rule__DivExpression__Group_1_2__0 )* ) ;
    public final void rule__DivExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4575:1: ( ( ( rule__DivExpression__Group_1_2__0 )* ) )
            // InternalKExpressions.g:4576:1: ( ( rule__DivExpression__Group_1_2__0 )* )
            {
            // InternalKExpressions.g:4576:1: ( ( rule__DivExpression__Group_1_2__0 )* )
            // InternalKExpressions.g:4577:1: ( rule__DivExpression__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getGroup_1_2()); 
            }
            // InternalKExpressions.g:4578:1: ( rule__DivExpression__Group_1_2__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==25) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalKExpressions.g:4578:2: rule__DivExpression__Group_1_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_25);
            	    rule__DivExpression__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalKExpressions.g:4594:1: rule__DivExpression__Group_1_1__0 : rule__DivExpression__Group_1_1__0__Impl rule__DivExpression__Group_1_1__1 ;
    public final void rule__DivExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4598:1: ( rule__DivExpression__Group_1_1__0__Impl rule__DivExpression__Group_1_1__1 )
            // InternalKExpressions.g:4599:2: rule__DivExpression__Group_1_1__0__Impl rule__DivExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
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
    // InternalKExpressions.g:4606:1: rule__DivExpression__Group_1_1__0__Impl : ( ( rule__DivExpression__OperatorAssignment_1_1_0 ) ) ;
    public final void rule__DivExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4610:1: ( ( ( rule__DivExpression__OperatorAssignment_1_1_0 ) ) )
            // InternalKExpressions.g:4611:1: ( ( rule__DivExpression__OperatorAssignment_1_1_0 ) )
            {
            // InternalKExpressions.g:4611:1: ( ( rule__DivExpression__OperatorAssignment_1_1_0 ) )
            // InternalKExpressions.g:4612:1: ( rule__DivExpression__OperatorAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorAssignment_1_1_0()); 
            }
            // InternalKExpressions.g:4613:1: ( rule__DivExpression__OperatorAssignment_1_1_0 )
            // InternalKExpressions.g:4613:2: rule__DivExpression__OperatorAssignment_1_1_0
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
    // InternalKExpressions.g:4623:1: rule__DivExpression__Group_1_1__1 : rule__DivExpression__Group_1_1__1__Impl ;
    public final void rule__DivExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4627:1: ( rule__DivExpression__Group_1_1__1__Impl )
            // InternalKExpressions.g:4628:2: rule__DivExpression__Group_1_1__1__Impl
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
    // InternalKExpressions.g:4634:1: rule__DivExpression__Group_1_1__1__Impl : ( ( rule__DivExpression__SubExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__DivExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4638:1: ( ( ( rule__DivExpression__SubExpressionsAssignment_1_1_1 ) ) )
            // InternalKExpressions.g:4639:1: ( ( rule__DivExpression__SubExpressionsAssignment_1_1_1 ) )
            {
            // InternalKExpressions.g:4639:1: ( ( rule__DivExpression__SubExpressionsAssignment_1_1_1 ) )
            // InternalKExpressions.g:4640:1: ( rule__DivExpression__SubExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }
            // InternalKExpressions.g:4641:1: ( rule__DivExpression__SubExpressionsAssignment_1_1_1 )
            // InternalKExpressions.g:4641:2: rule__DivExpression__SubExpressionsAssignment_1_1_1
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
    // InternalKExpressions.g:4655:1: rule__DivExpression__Group_1_2__0 : rule__DivExpression__Group_1_2__0__Impl rule__DivExpression__Group_1_2__1 ;
    public final void rule__DivExpression__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4659:1: ( rule__DivExpression__Group_1_2__0__Impl rule__DivExpression__Group_1_2__1 )
            // InternalKExpressions.g:4660:2: rule__DivExpression__Group_1_2__0__Impl rule__DivExpression__Group_1_2__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
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
    // InternalKExpressions.g:4667:1: rule__DivExpression__Group_1_2__0__Impl : ( '/' ) ;
    public final void rule__DivExpression__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4671:1: ( ( '/' ) )
            // InternalKExpressions.g:4672:1: ( '/' )
            {
            // InternalKExpressions.g:4672:1: ( '/' )
            // InternalKExpressions.g:4673:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getSolidusKeyword_1_2_0()); 
            }
            match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:4686:1: rule__DivExpression__Group_1_2__1 : rule__DivExpression__Group_1_2__1__Impl ;
    public final void rule__DivExpression__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4690:1: ( rule__DivExpression__Group_1_2__1__Impl )
            // InternalKExpressions.g:4691:2: rule__DivExpression__Group_1_2__1__Impl
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
    // InternalKExpressions.g:4697:1: rule__DivExpression__Group_1_2__1__Impl : ( ( rule__DivExpression__SubExpressionsAssignment_1_2_1 ) ) ;
    public final void rule__DivExpression__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4701:1: ( ( ( rule__DivExpression__SubExpressionsAssignment_1_2_1 ) ) )
            // InternalKExpressions.g:4702:1: ( ( rule__DivExpression__SubExpressionsAssignment_1_2_1 ) )
            {
            // InternalKExpressions.g:4702:1: ( ( rule__DivExpression__SubExpressionsAssignment_1_2_1 ) )
            // InternalKExpressions.g:4703:1: ( rule__DivExpression__SubExpressionsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getSubExpressionsAssignment_1_2_1()); 
            }
            // InternalKExpressions.g:4704:1: ( rule__DivExpression__SubExpressionsAssignment_1_2_1 )
            // InternalKExpressions.g:4704:2: rule__DivExpression__SubExpressionsAssignment_1_2_1
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
    // InternalKExpressions.g:4718:1: rule__ModExpression__Group__0 : rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1 ;
    public final void rule__ModExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4722:1: ( rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1 )
            // InternalKExpressions.g:4723:2: rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_26);
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
    // InternalKExpressions.g:4730:1: rule__ModExpression__Group__0__Impl : ( ruleNegExpression ) ;
    public final void rule__ModExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4734:1: ( ( ruleNegExpression ) )
            // InternalKExpressions.g:4735:1: ( ruleNegExpression )
            {
            // InternalKExpressions.g:4735:1: ( ruleNegExpression )
            // InternalKExpressions.g:4736:1: ruleNegExpression
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
    // InternalKExpressions.g:4747:1: rule__ModExpression__Group__1 : rule__ModExpression__Group__1__Impl ;
    public final void rule__ModExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4751:1: ( rule__ModExpression__Group__1__Impl )
            // InternalKExpressions.g:4752:2: rule__ModExpression__Group__1__Impl
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
    // InternalKExpressions.g:4758:1: rule__ModExpression__Group__1__Impl : ( ( rule__ModExpression__Group_1__0 )? ) ;
    public final void rule__ModExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4762:1: ( ( ( rule__ModExpression__Group_1__0 )? ) )
            // InternalKExpressions.g:4763:1: ( ( rule__ModExpression__Group_1__0 )? )
            {
            // InternalKExpressions.g:4763:1: ( ( rule__ModExpression__Group_1__0 )? )
            // InternalKExpressions.g:4764:1: ( rule__ModExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:4765:1: ( rule__ModExpression__Group_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==24) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalKExpressions.g:4765:2: rule__ModExpression__Group_1__0
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
    // InternalKExpressions.g:4779:1: rule__ModExpression__Group_1__0 : rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1 ;
    public final void rule__ModExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4783:1: ( rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1 )
            // InternalKExpressions.g:4784:2: rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_26);
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
    // InternalKExpressions.g:4791:1: rule__ModExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ModExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4795:1: ( ( () ) )
            // InternalKExpressions.g:4796:1: ( () )
            {
            // InternalKExpressions.g:4796:1: ( () )
            // InternalKExpressions.g:4797:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:4798:1: ()
            // InternalKExpressions.g:4800:1: 
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
    // InternalKExpressions.g:4810:1: rule__ModExpression__Group_1__1 : rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2 ;
    public final void rule__ModExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4814:1: ( rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2 )
            // InternalKExpressions.g:4815:2: rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_26);
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
    // InternalKExpressions.g:4822:1: rule__ModExpression__Group_1__1__Impl : ( ( rule__ModExpression__Group_1_1__0 ) ) ;
    public final void rule__ModExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4826:1: ( ( ( rule__ModExpression__Group_1_1__0 ) ) )
            // InternalKExpressions.g:4827:1: ( ( rule__ModExpression__Group_1_1__0 ) )
            {
            // InternalKExpressions.g:4827:1: ( ( rule__ModExpression__Group_1_1__0 ) )
            // InternalKExpressions.g:4828:1: ( rule__ModExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getGroup_1_1()); 
            }
            // InternalKExpressions.g:4829:1: ( rule__ModExpression__Group_1_1__0 )
            // InternalKExpressions.g:4829:2: rule__ModExpression__Group_1_1__0
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
    // InternalKExpressions.g:4839:1: rule__ModExpression__Group_1__2 : rule__ModExpression__Group_1__2__Impl ;
    public final void rule__ModExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4843:1: ( rule__ModExpression__Group_1__2__Impl )
            // InternalKExpressions.g:4844:2: rule__ModExpression__Group_1__2__Impl
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
    // InternalKExpressions.g:4850:1: rule__ModExpression__Group_1__2__Impl : ( ( rule__ModExpression__Group_1_2__0 )* ) ;
    public final void rule__ModExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4854:1: ( ( ( rule__ModExpression__Group_1_2__0 )* ) )
            // InternalKExpressions.g:4855:1: ( ( rule__ModExpression__Group_1_2__0 )* )
            {
            // InternalKExpressions.g:4855:1: ( ( rule__ModExpression__Group_1_2__0 )* )
            // InternalKExpressions.g:4856:1: ( rule__ModExpression__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getGroup_1_2()); 
            }
            // InternalKExpressions.g:4857:1: ( rule__ModExpression__Group_1_2__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==24) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalKExpressions.g:4857:2: rule__ModExpression__Group_1_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_27);
            	    rule__ModExpression__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalKExpressions.g:4873:1: rule__ModExpression__Group_1_1__0 : rule__ModExpression__Group_1_1__0__Impl rule__ModExpression__Group_1_1__1 ;
    public final void rule__ModExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4877:1: ( rule__ModExpression__Group_1_1__0__Impl rule__ModExpression__Group_1_1__1 )
            // InternalKExpressions.g:4878:2: rule__ModExpression__Group_1_1__0__Impl rule__ModExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
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
    // InternalKExpressions.g:4885:1: rule__ModExpression__Group_1_1__0__Impl : ( ( rule__ModExpression__OperatorAssignment_1_1_0 ) ) ;
    public final void rule__ModExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4889:1: ( ( ( rule__ModExpression__OperatorAssignment_1_1_0 ) ) )
            // InternalKExpressions.g:4890:1: ( ( rule__ModExpression__OperatorAssignment_1_1_0 ) )
            {
            // InternalKExpressions.g:4890:1: ( ( rule__ModExpression__OperatorAssignment_1_1_0 ) )
            // InternalKExpressions.g:4891:1: ( rule__ModExpression__OperatorAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorAssignment_1_1_0()); 
            }
            // InternalKExpressions.g:4892:1: ( rule__ModExpression__OperatorAssignment_1_1_0 )
            // InternalKExpressions.g:4892:2: rule__ModExpression__OperatorAssignment_1_1_0
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
    // InternalKExpressions.g:4902:1: rule__ModExpression__Group_1_1__1 : rule__ModExpression__Group_1_1__1__Impl ;
    public final void rule__ModExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4906:1: ( rule__ModExpression__Group_1_1__1__Impl )
            // InternalKExpressions.g:4907:2: rule__ModExpression__Group_1_1__1__Impl
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
    // InternalKExpressions.g:4913:1: rule__ModExpression__Group_1_1__1__Impl : ( ( rule__ModExpression__SubExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__ModExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4917:1: ( ( ( rule__ModExpression__SubExpressionsAssignment_1_1_1 ) ) )
            // InternalKExpressions.g:4918:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_1_1 ) )
            {
            // InternalKExpressions.g:4918:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_1_1 ) )
            // InternalKExpressions.g:4919:1: ( rule__ModExpression__SubExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }
            // InternalKExpressions.g:4920:1: ( rule__ModExpression__SubExpressionsAssignment_1_1_1 )
            // InternalKExpressions.g:4920:2: rule__ModExpression__SubExpressionsAssignment_1_1_1
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
    // InternalKExpressions.g:4934:1: rule__ModExpression__Group_1_2__0 : rule__ModExpression__Group_1_2__0__Impl rule__ModExpression__Group_1_2__1 ;
    public final void rule__ModExpression__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4938:1: ( rule__ModExpression__Group_1_2__0__Impl rule__ModExpression__Group_1_2__1 )
            // InternalKExpressions.g:4939:2: rule__ModExpression__Group_1_2__0__Impl rule__ModExpression__Group_1_2__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
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
    // InternalKExpressions.g:4946:1: rule__ModExpression__Group_1_2__0__Impl : ( '%' ) ;
    public final void rule__ModExpression__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4950:1: ( ( '%' ) )
            // InternalKExpressions.g:4951:1: ( '%' )
            {
            // InternalKExpressions.g:4951:1: ( '%' )
            // InternalKExpressions.g:4952:1: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getPercentSignKeyword_1_2_0()); 
            }
            match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:4965:1: rule__ModExpression__Group_1_2__1 : rule__ModExpression__Group_1_2__1__Impl ;
    public final void rule__ModExpression__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4969:1: ( rule__ModExpression__Group_1_2__1__Impl )
            // InternalKExpressions.g:4970:2: rule__ModExpression__Group_1_2__1__Impl
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
    // InternalKExpressions.g:4976:1: rule__ModExpression__Group_1_2__1__Impl : ( ( rule__ModExpression__SubExpressionsAssignment_1_2_1 ) ) ;
    public final void rule__ModExpression__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4980:1: ( ( ( rule__ModExpression__SubExpressionsAssignment_1_2_1 ) ) )
            // InternalKExpressions.g:4981:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_2_1 ) )
            {
            // InternalKExpressions.g:4981:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_2_1 ) )
            // InternalKExpressions.g:4982:1: ( rule__ModExpression__SubExpressionsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getSubExpressionsAssignment_1_2_1()); 
            }
            // InternalKExpressions.g:4983:1: ( rule__ModExpression__SubExpressionsAssignment_1_2_1 )
            // InternalKExpressions.g:4983:2: rule__ModExpression__SubExpressionsAssignment_1_2_1
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
    // InternalKExpressions.g:4997:1: rule__NegExpression__Group_0__0 : rule__NegExpression__Group_0__0__Impl rule__NegExpression__Group_0__1 ;
    public final void rule__NegExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5001:1: ( rule__NegExpression__Group_0__0__Impl rule__NegExpression__Group_0__1 )
            // InternalKExpressions.g:5002:2: rule__NegExpression__Group_0__0__Impl rule__NegExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_20);
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
    // InternalKExpressions.g:5009:1: rule__NegExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__NegExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5013:1: ( ( () ) )
            // InternalKExpressions.g:5014:1: ( () )
            {
            // InternalKExpressions.g:5014:1: ( () )
            // InternalKExpressions.g:5015:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // InternalKExpressions.g:5016:1: ()
            // InternalKExpressions.g:5018:1: 
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
    // InternalKExpressions.g:5028:1: rule__NegExpression__Group_0__1 : rule__NegExpression__Group_0__1__Impl rule__NegExpression__Group_0__2 ;
    public final void rule__NegExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5032:1: ( rule__NegExpression__Group_0__1__Impl rule__NegExpression__Group_0__2 )
            // InternalKExpressions.g:5033:2: rule__NegExpression__Group_0__1__Impl rule__NegExpression__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_19);
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
    // InternalKExpressions.g:5040:1: rule__NegExpression__Group_0__1__Impl : ( ( rule__NegExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__NegExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5044:1: ( ( ( rule__NegExpression__OperatorAssignment_0_1 ) ) )
            // InternalKExpressions.g:5045:1: ( ( rule__NegExpression__OperatorAssignment_0_1 ) )
            {
            // InternalKExpressions.g:5045:1: ( ( rule__NegExpression__OperatorAssignment_0_1 ) )
            // InternalKExpressions.g:5046:1: ( rule__NegExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // InternalKExpressions.g:5047:1: ( rule__NegExpression__OperatorAssignment_0_1 )
            // InternalKExpressions.g:5047:2: rule__NegExpression__OperatorAssignment_0_1
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
    // InternalKExpressions.g:5057:1: rule__NegExpression__Group_0__2 : rule__NegExpression__Group_0__2__Impl ;
    public final void rule__NegExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5061:1: ( rule__NegExpression__Group_0__2__Impl )
            // InternalKExpressions.g:5062:2: rule__NegExpression__Group_0__2__Impl
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
    // InternalKExpressions.g:5068:1: rule__NegExpression__Group_0__2__Impl : ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) ) ;
    public final void rule__NegExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5072:1: ( ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) ) )
            // InternalKExpressions.g:5073:1: ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) )
            {
            // InternalKExpressions.g:5073:1: ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) )
            // InternalKExpressions.g:5074:1: ( rule__NegExpression__SubExpressionsAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getSubExpressionsAssignment_0_2()); 
            }
            // InternalKExpressions.g:5075:1: ( rule__NegExpression__SubExpressionsAssignment_0_2 )
            // InternalKExpressions.g:5075:2: rule__NegExpression__SubExpressionsAssignment_0_2
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
    // InternalKExpressions.g:5091:1: rule__AtomicExpression__Group_2__0 : rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 ;
    public final void rule__AtomicExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5095:1: ( rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 )
            // InternalKExpressions.g:5096:2: rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
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
    // InternalKExpressions.g:5103:1: rule__AtomicExpression__Group_2__0__Impl : ( '(' ) ;
    public final void rule__AtomicExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5107:1: ( ( '(' ) )
            // InternalKExpressions.g:5108:1: ( '(' )
            {
            // InternalKExpressions.g:5108:1: ( '(' )
            // InternalKExpressions.g:5109:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:5122:1: rule__AtomicExpression__Group_2__1 : rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2 ;
    public final void rule__AtomicExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5126:1: ( rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2 )
            // InternalKExpressions.g:5127:2: rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_28);
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
    // InternalKExpressions.g:5134:1: rule__AtomicExpression__Group_2__1__Impl : ( ruleBoolExpression ) ;
    public final void rule__AtomicExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5138:1: ( ( ruleBoolExpression ) )
            // InternalKExpressions.g:5139:1: ( ruleBoolExpression )
            {
            // InternalKExpressions.g:5139:1: ( ruleBoolExpression )
            // InternalKExpressions.g:5140:1: ruleBoolExpression
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
    // InternalKExpressions.g:5151:1: rule__AtomicExpression__Group_2__2 : rule__AtomicExpression__Group_2__2__Impl ;
    public final void rule__AtomicExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5155:1: ( rule__AtomicExpression__Group_2__2__Impl )
            // InternalKExpressions.g:5156:2: rule__AtomicExpression__Group_2__2__Impl
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
    // InternalKExpressions.g:5162:1: rule__AtomicExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__AtomicExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5166:1: ( ( ')' ) )
            // InternalKExpressions.g:5167:1: ( ')' )
            {
            // InternalKExpressions.g:5167:1: ( ')' )
            // InternalKExpressions.g:5168:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:5187:1: rule__AtomicValuedExpression__Group_3__0 : rule__AtomicValuedExpression__Group_3__0__Impl rule__AtomicValuedExpression__Group_3__1 ;
    public final void rule__AtomicValuedExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5191:1: ( rule__AtomicValuedExpression__Group_3__0__Impl rule__AtomicValuedExpression__Group_3__1 )
            // InternalKExpressions.g:5192:2: rule__AtomicValuedExpression__Group_3__0__Impl rule__AtomicValuedExpression__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
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
    // InternalKExpressions.g:5199:1: rule__AtomicValuedExpression__Group_3__0__Impl : ( '(' ) ;
    public final void rule__AtomicValuedExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5203:1: ( ( '(' ) )
            // InternalKExpressions.g:5204:1: ( '(' )
            {
            // InternalKExpressions.g:5204:1: ( '(' )
            // InternalKExpressions.g:5205:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:5218:1: rule__AtomicValuedExpression__Group_3__1 : rule__AtomicValuedExpression__Group_3__1__Impl rule__AtomicValuedExpression__Group_3__2 ;
    public final void rule__AtomicValuedExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5222:1: ( rule__AtomicValuedExpression__Group_3__1__Impl rule__AtomicValuedExpression__Group_3__2 )
            // InternalKExpressions.g:5223:2: rule__AtomicValuedExpression__Group_3__1__Impl rule__AtomicValuedExpression__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_28);
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
    // InternalKExpressions.g:5230:1: rule__AtomicValuedExpression__Group_3__1__Impl : ( ruleValuedExpression ) ;
    public final void rule__AtomicValuedExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5234:1: ( ( ruleValuedExpression ) )
            // InternalKExpressions.g:5235:1: ( ruleValuedExpression )
            {
            // InternalKExpressions.g:5235:1: ( ruleValuedExpression )
            // InternalKExpressions.g:5236:1: ruleValuedExpression
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
    // InternalKExpressions.g:5247:1: rule__AtomicValuedExpression__Group_3__2 : rule__AtomicValuedExpression__Group_3__2__Impl ;
    public final void rule__AtomicValuedExpression__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5251:1: ( rule__AtomicValuedExpression__Group_3__2__Impl )
            // InternalKExpressions.g:5252:2: rule__AtomicValuedExpression__Group_3__2__Impl
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
    // InternalKExpressions.g:5258:1: rule__AtomicValuedExpression__Group_3__2__Impl : ( ')' ) ;
    public final void rule__AtomicValuedExpression__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5262:1: ( ( ')' ) )
            // InternalKExpressions.g:5263:1: ( ')' )
            {
            // InternalKExpressions.g:5263:1: ( ')' )
            // InternalKExpressions.g:5264:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:5283:1: rule__ValuedObjectTestExpression__Group_0__0 : rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1 ;
    public final void rule__ValuedObjectTestExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5287:1: ( rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1 )
            // InternalKExpressions.g:5288:2: rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_29);
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
    // InternalKExpressions.g:5295:1: rule__ValuedObjectTestExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5299:1: ( ( () ) )
            // InternalKExpressions.g:5300:1: ( () )
            {
            // InternalKExpressions.g:5300:1: ( () )
            // InternalKExpressions.g:5301:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // InternalKExpressions.g:5302:1: ()
            // InternalKExpressions.g:5304:1: 
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
    // InternalKExpressions.g:5314:1: rule__ValuedObjectTestExpression__Group_0__1 : rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2 ;
    public final void rule__ValuedObjectTestExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5318:1: ( rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2 )
            // InternalKExpressions.g:5319:2: rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_30);
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
    // InternalKExpressions.g:5326:1: rule__ValuedObjectTestExpression__Group_0__1__Impl : ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5330:1: ( ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) ) )
            // InternalKExpressions.g:5331:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) )
            {
            // InternalKExpressions.g:5331:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) )
            // InternalKExpressions.g:5332:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // InternalKExpressions.g:5333:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 )
            // InternalKExpressions.g:5333:2: rule__ValuedObjectTestExpression__OperatorAssignment_0_1
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
    // InternalKExpressions.g:5343:1: rule__ValuedObjectTestExpression__Group_0__2 : rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3 ;
    public final void rule__ValuedObjectTestExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5347:1: ( rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3 )
            // InternalKExpressions.g:5348:2: rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3
            {
            pushFollow(FollowSets000.FOLLOW_31);
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
    // InternalKExpressions.g:5355:1: rule__ValuedObjectTestExpression__Group_0__2__Impl : ( '(' ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5359:1: ( ( '(' ) )
            // InternalKExpressions.g:5360:1: ( '(' )
            {
            // InternalKExpressions.g:5360:1: ( '(' )
            // InternalKExpressions.g:5361:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:5374:1: rule__ValuedObjectTestExpression__Group_0__3 : rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4 ;
    public final void rule__ValuedObjectTestExpression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5378:1: ( rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4 )
            // InternalKExpressions.g:5379:2: rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4
            {
            pushFollow(FollowSets000.FOLLOW_28);
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
    // InternalKExpressions.g:5386:1: rule__ValuedObjectTestExpression__Group_0__3__Impl : ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5390:1: ( ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) ) )
            // InternalKExpressions.g:5391:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) )
            {
            // InternalKExpressions.g:5391:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) )
            // InternalKExpressions.g:5392:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsAssignment_0_3()); 
            }
            // InternalKExpressions.g:5393:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 )
            // InternalKExpressions.g:5393:2: rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3
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
    // InternalKExpressions.g:5403:1: rule__ValuedObjectTestExpression__Group_0__4 : rule__ValuedObjectTestExpression__Group_0__4__Impl ;
    public final void rule__ValuedObjectTestExpression__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5407:1: ( rule__ValuedObjectTestExpression__Group_0__4__Impl )
            // InternalKExpressions.g:5408:2: rule__ValuedObjectTestExpression__Group_0__4__Impl
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
    // InternalKExpressions.g:5414:1: rule__ValuedObjectTestExpression__Group_0__4__Impl : ( ')' ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5418:1: ( ( ')' ) )
            // InternalKExpressions.g:5419:1: ( ')' )
            {
            // InternalKExpressions.g:5419:1: ( ')' )
            // InternalKExpressions.g:5420:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4()); 
            }
            match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__PrimeID__Group__0"
    // InternalKExpressions.g:5443:1: rule__PrimeID__Group__0 : rule__PrimeID__Group__0__Impl rule__PrimeID__Group__1 ;
    public final void rule__PrimeID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5447:1: ( rule__PrimeID__Group__0__Impl rule__PrimeID__Group__1 )
            // InternalKExpressions.g:5448:2: rule__PrimeID__Group__0__Impl rule__PrimeID__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__PrimeID__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PrimeID__Group__1();

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
    // $ANTLR end "rule__PrimeID__Group__0"


    // $ANTLR start "rule__PrimeID__Group__0__Impl"
    // InternalKExpressions.g:5455:1: rule__PrimeID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__PrimeID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5459:1: ( ( RULE_ID ) )
            // InternalKExpressions.g:5460:1: ( RULE_ID )
            {
            // InternalKExpressions.g:5460:1: ( RULE_ID )
            // InternalKExpressions.g:5461:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimeIDAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimeIDAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimeID__Group__0__Impl"


    // $ANTLR start "rule__PrimeID__Group__1"
    // InternalKExpressions.g:5472:1: rule__PrimeID__Group__1 : rule__PrimeID__Group__1__Impl ;
    public final void rule__PrimeID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5476:1: ( rule__PrimeID__Group__1__Impl )
            // InternalKExpressions.g:5477:2: rule__PrimeID__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PrimeID__Group__1__Impl();

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
    // $ANTLR end "rule__PrimeID__Group__1"


    // $ANTLR start "rule__PrimeID__Group__1__Impl"
    // InternalKExpressions.g:5483:1: rule__PrimeID__Group__1__Impl : ( ( '\\'' )* ) ;
    public final void rule__PrimeID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5487:1: ( ( ( '\\'' )* ) )
            // InternalKExpressions.g:5488:1: ( ( '\\'' )* )
            {
            // InternalKExpressions.g:5488:1: ( ( '\\'' )* )
            // InternalKExpressions.g:5489:1: ( '\\'' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimeIDAccess().getApostropheKeyword_1()); 
            }
            // InternalKExpressions.g:5490:1: ( '\\'' )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==40) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalKExpressions.g:5491:2: '\\''
            	    {
            	    match(input,40,FollowSets000.FOLLOW_33); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimeIDAccess().getApostropheKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimeID__Group__1__Impl"


    // $ANTLR start "rule__ValuedObjectReference__Group__0"
    // InternalKExpressions.g:5506:1: rule__ValuedObjectReference__Group__0 : rule__ValuedObjectReference__Group__0__Impl rule__ValuedObjectReference__Group__1 ;
    public final void rule__ValuedObjectReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5510:1: ( rule__ValuedObjectReference__Group__0__Impl rule__ValuedObjectReference__Group__1 )
            // InternalKExpressions.g:5511:2: rule__ValuedObjectReference__Group__0__Impl rule__ValuedObjectReference__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_34);
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
    // InternalKExpressions.g:5518:1: rule__ValuedObjectReference__Group__0__Impl : ( ( rule__ValuedObjectReference__ValuedObjectAssignment_0 ) ) ;
    public final void rule__ValuedObjectReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5522:1: ( ( ( rule__ValuedObjectReference__ValuedObjectAssignment_0 ) ) )
            // InternalKExpressions.g:5523:1: ( ( rule__ValuedObjectReference__ValuedObjectAssignment_0 ) )
            {
            // InternalKExpressions.g:5523:1: ( ( rule__ValuedObjectReference__ValuedObjectAssignment_0 ) )
            // InternalKExpressions.g:5524:1: ( rule__ValuedObjectReference__ValuedObjectAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectAssignment_0()); 
            }
            // InternalKExpressions.g:5525:1: ( rule__ValuedObjectReference__ValuedObjectAssignment_0 )
            // InternalKExpressions.g:5525:2: rule__ValuedObjectReference__ValuedObjectAssignment_0
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
    // InternalKExpressions.g:5535:1: rule__ValuedObjectReference__Group__1 : rule__ValuedObjectReference__Group__1__Impl rule__ValuedObjectReference__Group__2 ;
    public final void rule__ValuedObjectReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5539:1: ( rule__ValuedObjectReference__Group__1__Impl rule__ValuedObjectReference__Group__2 )
            // InternalKExpressions.g:5540:2: rule__ValuedObjectReference__Group__1__Impl rule__ValuedObjectReference__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_34);
            rule__ValuedObjectReference__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ValuedObjectReference__Group__2();

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
    // InternalKExpressions.g:5547:1: rule__ValuedObjectReference__Group__1__Impl : ( ( rule__ValuedObjectReference__Group_1__0 )* ) ;
    public final void rule__ValuedObjectReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5551:1: ( ( ( rule__ValuedObjectReference__Group_1__0 )* ) )
            // InternalKExpressions.g:5552:1: ( ( rule__ValuedObjectReference__Group_1__0 )* )
            {
            // InternalKExpressions.g:5552:1: ( ( rule__ValuedObjectReference__Group_1__0 )* )
            // InternalKExpressions.g:5553:1: ( rule__ValuedObjectReference__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:5554:1: ( rule__ValuedObjectReference__Group_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==41) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalKExpressions.g:5554:2: rule__ValuedObjectReference__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_35);
            	    rule__ValuedObjectReference__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
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


    // $ANTLR start "rule__ValuedObjectReference__Group__2"
    // InternalKExpressions.g:5564:1: rule__ValuedObjectReference__Group__2 : rule__ValuedObjectReference__Group__2__Impl ;
    public final void rule__ValuedObjectReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5568:1: ( rule__ValuedObjectReference__Group__2__Impl )
            // InternalKExpressions.g:5569:2: rule__ValuedObjectReference__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ValuedObjectReference__Group__2__Impl();

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
    // $ANTLR end "rule__ValuedObjectReference__Group__2"


    // $ANTLR start "rule__ValuedObjectReference__Group__2__Impl"
    // InternalKExpressions.g:5575:1: rule__ValuedObjectReference__Group__2__Impl : ( ( rule__ValuedObjectReference__Group_2__0 )? ) ;
    public final void rule__ValuedObjectReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5579:1: ( ( ( rule__ValuedObjectReference__Group_2__0 )? ) )
            // InternalKExpressions.g:5580:1: ( ( rule__ValuedObjectReference__Group_2__0 )? )
            {
            // InternalKExpressions.g:5580:1: ( ( rule__ValuedObjectReference__Group_2__0 )? )
            // InternalKExpressions.g:5581:1: ( rule__ValuedObjectReference__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getGroup_2()); 
            }
            // InternalKExpressions.g:5582:1: ( rule__ValuedObjectReference__Group_2__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==30) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalKExpressions.g:5582:2: rule__ValuedObjectReference__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ValuedObjectReference__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuedObjectReferenceAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValuedObjectReference__Group__2__Impl"


    // $ANTLR start "rule__ValuedObjectReference__Group_1__0"
    // InternalKExpressions.g:5598:1: rule__ValuedObjectReference__Group_1__0 : rule__ValuedObjectReference__Group_1__0__Impl rule__ValuedObjectReference__Group_1__1 ;
    public final void rule__ValuedObjectReference__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5602:1: ( rule__ValuedObjectReference__Group_1__0__Impl rule__ValuedObjectReference__Group_1__1 )
            // InternalKExpressions.g:5603:2: rule__ValuedObjectReference__Group_1__0__Impl rule__ValuedObjectReference__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
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
    // InternalKExpressions.g:5610:1: rule__ValuedObjectReference__Group_1__0__Impl : ( '[' ) ;
    public final void rule__ValuedObjectReference__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5614:1: ( ( '[' ) )
            // InternalKExpressions.g:5615:1: ( '[' )
            {
            // InternalKExpressions.g:5615:1: ( '[' )
            // InternalKExpressions.g:5616:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getLeftSquareBracketKeyword_1_0()); 
            }
            match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:5629:1: rule__ValuedObjectReference__Group_1__1 : rule__ValuedObjectReference__Group_1__1__Impl rule__ValuedObjectReference__Group_1__2 ;
    public final void rule__ValuedObjectReference__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5633:1: ( rule__ValuedObjectReference__Group_1__1__Impl rule__ValuedObjectReference__Group_1__2 )
            // InternalKExpressions.g:5634:2: rule__ValuedObjectReference__Group_1__1__Impl rule__ValuedObjectReference__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_36);
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
    // InternalKExpressions.g:5641:1: rule__ValuedObjectReference__Group_1__1__Impl : ( ( rule__ValuedObjectReference__IndicesAssignment_1_1 ) ) ;
    public final void rule__ValuedObjectReference__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5645:1: ( ( ( rule__ValuedObjectReference__IndicesAssignment_1_1 ) ) )
            // InternalKExpressions.g:5646:1: ( ( rule__ValuedObjectReference__IndicesAssignment_1_1 ) )
            {
            // InternalKExpressions.g:5646:1: ( ( rule__ValuedObjectReference__IndicesAssignment_1_1 ) )
            // InternalKExpressions.g:5647:1: ( rule__ValuedObjectReference__IndicesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getIndicesAssignment_1_1()); 
            }
            // InternalKExpressions.g:5648:1: ( rule__ValuedObjectReference__IndicesAssignment_1_1 )
            // InternalKExpressions.g:5648:2: rule__ValuedObjectReference__IndicesAssignment_1_1
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
    // InternalKExpressions.g:5658:1: rule__ValuedObjectReference__Group_1__2 : rule__ValuedObjectReference__Group_1__2__Impl ;
    public final void rule__ValuedObjectReference__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5662:1: ( rule__ValuedObjectReference__Group_1__2__Impl )
            // InternalKExpressions.g:5663:2: rule__ValuedObjectReference__Group_1__2__Impl
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
    // InternalKExpressions.g:5669:1: rule__ValuedObjectReference__Group_1__2__Impl : ( ']' ) ;
    public final void rule__ValuedObjectReference__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5673:1: ( ( ']' ) )
            // InternalKExpressions.g:5674:1: ( ']' )
            {
            // InternalKExpressions.g:5674:1: ( ']' )
            // InternalKExpressions.g:5675:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getRightSquareBracketKeyword_1_2()); 
            }
            match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__ValuedObjectReference__Group_2__0"
    // InternalKExpressions.g:5694:1: rule__ValuedObjectReference__Group_2__0 : rule__ValuedObjectReference__Group_2__0__Impl rule__ValuedObjectReference__Group_2__1 ;
    public final void rule__ValuedObjectReference__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5698:1: ( rule__ValuedObjectReference__Group_2__0__Impl rule__ValuedObjectReference__Group_2__1 )
            // InternalKExpressions.g:5699:2: rule__ValuedObjectReference__Group_2__0__Impl rule__ValuedObjectReference__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__ValuedObjectReference__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ValuedObjectReference__Group_2__1();

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
    // $ANTLR end "rule__ValuedObjectReference__Group_2__0"


    // $ANTLR start "rule__ValuedObjectReference__Group_2__0__Impl"
    // InternalKExpressions.g:5706:1: rule__ValuedObjectReference__Group_2__0__Impl : ( '.' ) ;
    public final void rule__ValuedObjectReference__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5710:1: ( ( '.' ) )
            // InternalKExpressions.g:5711:1: ( '.' )
            {
            // InternalKExpressions.g:5711:1: ( '.' )
            // InternalKExpressions.g:5712:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getFullStopKeyword_2_0()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuedObjectReferenceAccess().getFullStopKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValuedObjectReference__Group_2__0__Impl"


    // $ANTLR start "rule__ValuedObjectReference__Group_2__1"
    // InternalKExpressions.g:5725:1: rule__ValuedObjectReference__Group_2__1 : rule__ValuedObjectReference__Group_2__1__Impl ;
    public final void rule__ValuedObjectReference__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5729:1: ( rule__ValuedObjectReference__Group_2__1__Impl )
            // InternalKExpressions.g:5730:2: rule__ValuedObjectReference__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ValuedObjectReference__Group_2__1__Impl();

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
    // $ANTLR end "rule__ValuedObjectReference__Group_2__1"


    // $ANTLR start "rule__ValuedObjectReference__Group_2__1__Impl"
    // InternalKExpressions.g:5736:1: rule__ValuedObjectReference__Group_2__1__Impl : ( ( rule__ValuedObjectReference__SubReferenceAssignment_2_1 ) ) ;
    public final void rule__ValuedObjectReference__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5740:1: ( ( ( rule__ValuedObjectReference__SubReferenceAssignment_2_1 ) ) )
            // InternalKExpressions.g:5741:1: ( ( rule__ValuedObjectReference__SubReferenceAssignment_2_1 ) )
            {
            // InternalKExpressions.g:5741:1: ( ( rule__ValuedObjectReference__SubReferenceAssignment_2_1 ) )
            // InternalKExpressions.g:5742:1: ( rule__ValuedObjectReference__SubReferenceAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getSubReferenceAssignment_2_1()); 
            }
            // InternalKExpressions.g:5743:1: ( rule__ValuedObjectReference__SubReferenceAssignment_2_1 )
            // InternalKExpressions.g:5743:2: rule__ValuedObjectReference__SubReferenceAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ValuedObjectReference__SubReferenceAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuedObjectReferenceAccess().getSubReferenceAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValuedObjectReference__Group_2__1__Impl"


    // $ANTLR start "rule__ScheduleObjectReference__Group__0"
    // InternalKExpressions.g:5757:1: rule__ScheduleObjectReference__Group__0 : rule__ScheduleObjectReference__Group__0__Impl rule__ScheduleObjectReference__Group__1 ;
    public final void rule__ScheduleObjectReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5761:1: ( rule__ScheduleObjectReference__Group__0__Impl rule__ScheduleObjectReference__Group__1 )
            // InternalKExpressions.g:5762:2: rule__ScheduleObjectReference__Group__0__Impl rule__ScheduleObjectReference__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_37);
            rule__ScheduleObjectReference__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ScheduleObjectReference__Group__1();

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
    // $ANTLR end "rule__ScheduleObjectReference__Group__0"


    // $ANTLR start "rule__ScheduleObjectReference__Group__0__Impl"
    // InternalKExpressions.g:5769:1: rule__ScheduleObjectReference__Group__0__Impl : ( ( rule__ScheduleObjectReference__ValuedObjectAssignment_0 ) ) ;
    public final void rule__ScheduleObjectReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5773:1: ( ( ( rule__ScheduleObjectReference__ValuedObjectAssignment_0 ) ) )
            // InternalKExpressions.g:5774:1: ( ( rule__ScheduleObjectReference__ValuedObjectAssignment_0 ) )
            {
            // InternalKExpressions.g:5774:1: ( ( rule__ScheduleObjectReference__ValuedObjectAssignment_0 ) )
            // InternalKExpressions.g:5775:1: ( rule__ScheduleObjectReference__ValuedObjectAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScheduleObjectReferenceAccess().getValuedObjectAssignment_0()); 
            }
            // InternalKExpressions.g:5776:1: ( rule__ScheduleObjectReference__ValuedObjectAssignment_0 )
            // InternalKExpressions.g:5776:2: rule__ScheduleObjectReference__ValuedObjectAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ScheduleObjectReference__ValuedObjectAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScheduleObjectReferenceAccess().getValuedObjectAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScheduleObjectReference__Group__0__Impl"


    // $ANTLR start "rule__ScheduleObjectReference__Group__1"
    // InternalKExpressions.g:5786:1: rule__ScheduleObjectReference__Group__1 : rule__ScheduleObjectReference__Group__1__Impl ;
    public final void rule__ScheduleObjectReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5790:1: ( rule__ScheduleObjectReference__Group__1__Impl )
            // InternalKExpressions.g:5791:2: rule__ScheduleObjectReference__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ScheduleObjectReference__Group__1__Impl();

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
    // $ANTLR end "rule__ScheduleObjectReference__Group__1"


    // $ANTLR start "rule__ScheduleObjectReference__Group__1__Impl"
    // InternalKExpressions.g:5797:1: rule__ScheduleObjectReference__Group__1__Impl : ( ( rule__ScheduleObjectReference__PriorityAssignment_1 ) ) ;
    public final void rule__ScheduleObjectReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5801:1: ( ( ( rule__ScheduleObjectReference__PriorityAssignment_1 ) ) )
            // InternalKExpressions.g:5802:1: ( ( rule__ScheduleObjectReference__PriorityAssignment_1 ) )
            {
            // InternalKExpressions.g:5802:1: ( ( rule__ScheduleObjectReference__PriorityAssignment_1 ) )
            // InternalKExpressions.g:5803:1: ( rule__ScheduleObjectReference__PriorityAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScheduleObjectReferenceAccess().getPriorityAssignment_1()); 
            }
            // InternalKExpressions.g:5804:1: ( rule__ScheduleObjectReference__PriorityAssignment_1 )
            // InternalKExpressions.g:5804:2: rule__ScheduleObjectReference__PriorityAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ScheduleObjectReference__PriorityAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScheduleObjectReferenceAccess().getPriorityAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScheduleObjectReference__Group__1__Impl"


    // $ANTLR start "rule__ReferenceCall__Group__0"
    // InternalKExpressions.g:5818:1: rule__ReferenceCall__Group__0 : rule__ReferenceCall__Group__0__Impl rule__ReferenceCall__Group__1 ;
    public final void rule__ReferenceCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5822:1: ( rule__ReferenceCall__Group__0__Impl rule__ReferenceCall__Group__1 )
            // InternalKExpressions.g:5823:2: rule__ReferenceCall__Group__0__Impl rule__ReferenceCall__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_38);
            rule__ReferenceCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ReferenceCall__Group__1();

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
    // $ANTLR end "rule__ReferenceCall__Group__0"


    // $ANTLR start "rule__ReferenceCall__Group__0__Impl"
    // InternalKExpressions.g:5830:1: rule__ReferenceCall__Group__0__Impl : ( ( rule__ReferenceCall__ValuedObjectAssignment_0 ) ) ;
    public final void rule__ReferenceCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5834:1: ( ( ( rule__ReferenceCall__ValuedObjectAssignment_0 ) ) )
            // InternalKExpressions.g:5835:1: ( ( rule__ReferenceCall__ValuedObjectAssignment_0 ) )
            {
            // InternalKExpressions.g:5835:1: ( ( rule__ReferenceCall__ValuedObjectAssignment_0 ) )
            // InternalKExpressions.g:5836:1: ( rule__ReferenceCall__ValuedObjectAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceCallAccess().getValuedObjectAssignment_0()); 
            }
            // InternalKExpressions.g:5837:1: ( rule__ReferenceCall__ValuedObjectAssignment_0 )
            // InternalKExpressions.g:5837:2: rule__ReferenceCall__ValuedObjectAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ReferenceCall__ValuedObjectAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceCallAccess().getValuedObjectAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceCall__Group__0__Impl"


    // $ANTLR start "rule__ReferenceCall__Group__1"
    // InternalKExpressions.g:5847:1: rule__ReferenceCall__Group__1 : rule__ReferenceCall__Group__1__Impl ;
    public final void rule__ReferenceCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5851:1: ( rule__ReferenceCall__Group__1__Impl )
            // InternalKExpressions.g:5852:2: rule__ReferenceCall__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ReferenceCall__Group__1__Impl();

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
    // $ANTLR end "rule__ReferenceCall__Group__1"


    // $ANTLR start "rule__ReferenceCall__Group__1__Impl"
    // InternalKExpressions.g:5858:1: rule__ReferenceCall__Group__1__Impl : ( ( rule__ReferenceCall__Alternatives_1 ) ) ;
    public final void rule__ReferenceCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5862:1: ( ( ( rule__ReferenceCall__Alternatives_1 ) ) )
            // InternalKExpressions.g:5863:1: ( ( rule__ReferenceCall__Alternatives_1 ) )
            {
            // InternalKExpressions.g:5863:1: ( ( rule__ReferenceCall__Alternatives_1 ) )
            // InternalKExpressions.g:5864:1: ( rule__ReferenceCall__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceCallAccess().getAlternatives_1()); 
            }
            // InternalKExpressions.g:5865:1: ( rule__ReferenceCall__Alternatives_1 )
            // InternalKExpressions.g:5865:2: rule__ReferenceCall__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ReferenceCall__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceCallAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceCall__Group__1__Impl"


    // $ANTLR start "rule__ReferenceCall__Group_1_0__0"
    // InternalKExpressions.g:5879:1: rule__ReferenceCall__Group_1_0__0 : rule__ReferenceCall__Group_1_0__0__Impl rule__ReferenceCall__Group_1_0__1 ;
    public final void rule__ReferenceCall__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5883:1: ( rule__ReferenceCall__Group_1_0__0__Impl rule__ReferenceCall__Group_1_0__1 )
            // InternalKExpressions.g:5884:2: rule__ReferenceCall__Group_1_0__0__Impl rule__ReferenceCall__Group_1_0__1
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__ReferenceCall__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ReferenceCall__Group_1_0__1();

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
    // $ANTLR end "rule__ReferenceCall__Group_1_0__0"


    // $ANTLR start "rule__ReferenceCall__Group_1_0__0__Impl"
    // InternalKExpressions.g:5891:1: rule__ReferenceCall__Group_1_0__0__Impl : ( '(' ) ;
    public final void rule__ReferenceCall__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5895:1: ( ( '(' ) )
            // InternalKExpressions.g:5896:1: ( '(' )
            {
            // InternalKExpressions.g:5896:1: ( '(' )
            // InternalKExpressions.g:5897:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceCallAccess().getLeftParenthesisKeyword_1_0_0()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceCallAccess().getLeftParenthesisKeyword_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceCall__Group_1_0__0__Impl"


    // $ANTLR start "rule__ReferenceCall__Group_1_0__1"
    // InternalKExpressions.g:5910:1: rule__ReferenceCall__Group_1_0__1 : rule__ReferenceCall__Group_1_0__1__Impl rule__ReferenceCall__Group_1_0__2 ;
    public final void rule__ReferenceCall__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5914:1: ( rule__ReferenceCall__Group_1_0__1__Impl rule__ReferenceCall__Group_1_0__2 )
            // InternalKExpressions.g:5915:2: rule__ReferenceCall__Group_1_0__1__Impl rule__ReferenceCall__Group_1_0__2
            {
            pushFollow(FollowSets000.FOLLOW_40);
            rule__ReferenceCall__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ReferenceCall__Group_1_0__2();

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
    // $ANTLR end "rule__ReferenceCall__Group_1_0__1"


    // $ANTLR start "rule__ReferenceCall__Group_1_0__1__Impl"
    // InternalKExpressions.g:5922:1: rule__ReferenceCall__Group_1_0__1__Impl : ( ( rule__ReferenceCall__ParametersAssignment_1_0_1 ) ) ;
    public final void rule__ReferenceCall__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5926:1: ( ( ( rule__ReferenceCall__ParametersAssignment_1_0_1 ) ) )
            // InternalKExpressions.g:5927:1: ( ( rule__ReferenceCall__ParametersAssignment_1_0_1 ) )
            {
            // InternalKExpressions.g:5927:1: ( ( rule__ReferenceCall__ParametersAssignment_1_0_1 ) )
            // InternalKExpressions.g:5928:1: ( rule__ReferenceCall__ParametersAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceCallAccess().getParametersAssignment_1_0_1()); 
            }
            // InternalKExpressions.g:5929:1: ( rule__ReferenceCall__ParametersAssignment_1_0_1 )
            // InternalKExpressions.g:5929:2: rule__ReferenceCall__ParametersAssignment_1_0_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ReferenceCall__ParametersAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceCallAccess().getParametersAssignment_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceCall__Group_1_0__1__Impl"


    // $ANTLR start "rule__ReferenceCall__Group_1_0__2"
    // InternalKExpressions.g:5939:1: rule__ReferenceCall__Group_1_0__2 : rule__ReferenceCall__Group_1_0__2__Impl rule__ReferenceCall__Group_1_0__3 ;
    public final void rule__ReferenceCall__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5943:1: ( rule__ReferenceCall__Group_1_0__2__Impl rule__ReferenceCall__Group_1_0__3 )
            // InternalKExpressions.g:5944:2: rule__ReferenceCall__Group_1_0__2__Impl rule__ReferenceCall__Group_1_0__3
            {
            pushFollow(FollowSets000.FOLLOW_40);
            rule__ReferenceCall__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ReferenceCall__Group_1_0__3();

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
    // $ANTLR end "rule__ReferenceCall__Group_1_0__2"


    // $ANTLR start "rule__ReferenceCall__Group_1_0__2__Impl"
    // InternalKExpressions.g:5951:1: rule__ReferenceCall__Group_1_0__2__Impl : ( ( rule__ReferenceCall__Group_1_0_2__0 )* ) ;
    public final void rule__ReferenceCall__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5955:1: ( ( ( rule__ReferenceCall__Group_1_0_2__0 )* ) )
            // InternalKExpressions.g:5956:1: ( ( rule__ReferenceCall__Group_1_0_2__0 )* )
            {
            // InternalKExpressions.g:5956:1: ( ( rule__ReferenceCall__Group_1_0_2__0 )* )
            // InternalKExpressions.g:5957:1: ( rule__ReferenceCall__Group_1_0_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceCallAccess().getGroup_1_0_2()); 
            }
            // InternalKExpressions.g:5958:1: ( rule__ReferenceCall__Group_1_0_2__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==43) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalKExpressions.g:5958:2: rule__ReferenceCall__Group_1_0_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_41);
            	    rule__ReferenceCall__Group_1_0_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceCallAccess().getGroup_1_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceCall__Group_1_0__2__Impl"


    // $ANTLR start "rule__ReferenceCall__Group_1_0__3"
    // InternalKExpressions.g:5968:1: rule__ReferenceCall__Group_1_0__3 : rule__ReferenceCall__Group_1_0__3__Impl ;
    public final void rule__ReferenceCall__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5972:1: ( rule__ReferenceCall__Group_1_0__3__Impl )
            // InternalKExpressions.g:5973:2: rule__ReferenceCall__Group_1_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ReferenceCall__Group_1_0__3__Impl();

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
    // $ANTLR end "rule__ReferenceCall__Group_1_0__3"


    // $ANTLR start "rule__ReferenceCall__Group_1_0__3__Impl"
    // InternalKExpressions.g:5979:1: rule__ReferenceCall__Group_1_0__3__Impl : ( ')' ) ;
    public final void rule__ReferenceCall__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5983:1: ( ( ')' ) )
            // InternalKExpressions.g:5984:1: ( ')' )
            {
            // InternalKExpressions.g:5984:1: ( ')' )
            // InternalKExpressions.g:5985:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceCallAccess().getRightParenthesisKeyword_1_0_3()); 
            }
            match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceCallAccess().getRightParenthesisKeyword_1_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceCall__Group_1_0__3__Impl"


    // $ANTLR start "rule__ReferenceCall__Group_1_0_2__0"
    // InternalKExpressions.g:6006:1: rule__ReferenceCall__Group_1_0_2__0 : rule__ReferenceCall__Group_1_0_2__0__Impl rule__ReferenceCall__Group_1_0_2__1 ;
    public final void rule__ReferenceCall__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6010:1: ( rule__ReferenceCall__Group_1_0_2__0__Impl rule__ReferenceCall__Group_1_0_2__1 )
            // InternalKExpressions.g:6011:2: rule__ReferenceCall__Group_1_0_2__0__Impl rule__ReferenceCall__Group_1_0_2__1
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__ReferenceCall__Group_1_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ReferenceCall__Group_1_0_2__1();

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
    // $ANTLR end "rule__ReferenceCall__Group_1_0_2__0"


    // $ANTLR start "rule__ReferenceCall__Group_1_0_2__0__Impl"
    // InternalKExpressions.g:6018:1: rule__ReferenceCall__Group_1_0_2__0__Impl : ( ',' ) ;
    public final void rule__ReferenceCall__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6022:1: ( ( ',' ) )
            // InternalKExpressions.g:6023:1: ( ',' )
            {
            // InternalKExpressions.g:6023:1: ( ',' )
            // InternalKExpressions.g:6024:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceCallAccess().getCommaKeyword_1_0_2_0()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceCallAccess().getCommaKeyword_1_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceCall__Group_1_0_2__0__Impl"


    // $ANTLR start "rule__ReferenceCall__Group_1_0_2__1"
    // InternalKExpressions.g:6037:1: rule__ReferenceCall__Group_1_0_2__1 : rule__ReferenceCall__Group_1_0_2__1__Impl ;
    public final void rule__ReferenceCall__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6041:1: ( rule__ReferenceCall__Group_1_0_2__1__Impl )
            // InternalKExpressions.g:6042:2: rule__ReferenceCall__Group_1_0_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ReferenceCall__Group_1_0_2__1__Impl();

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
    // $ANTLR end "rule__ReferenceCall__Group_1_0_2__1"


    // $ANTLR start "rule__ReferenceCall__Group_1_0_2__1__Impl"
    // InternalKExpressions.g:6048:1: rule__ReferenceCall__Group_1_0_2__1__Impl : ( ( rule__ReferenceCall__ParametersAssignment_1_0_2_1 ) ) ;
    public final void rule__ReferenceCall__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6052:1: ( ( ( rule__ReferenceCall__ParametersAssignment_1_0_2_1 ) ) )
            // InternalKExpressions.g:6053:1: ( ( rule__ReferenceCall__ParametersAssignment_1_0_2_1 ) )
            {
            // InternalKExpressions.g:6053:1: ( ( rule__ReferenceCall__ParametersAssignment_1_0_2_1 ) )
            // InternalKExpressions.g:6054:1: ( rule__ReferenceCall__ParametersAssignment_1_0_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceCallAccess().getParametersAssignment_1_0_2_1()); 
            }
            // InternalKExpressions.g:6055:1: ( rule__ReferenceCall__ParametersAssignment_1_0_2_1 )
            // InternalKExpressions.g:6055:2: rule__ReferenceCall__ParametersAssignment_1_0_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ReferenceCall__ParametersAssignment_1_0_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceCallAccess().getParametersAssignment_1_0_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceCall__Group_1_0_2__1__Impl"


    // $ANTLR start "rule__FunctionCall__Group_0__0"
    // InternalKExpressions.g:6069:1: rule__FunctionCall__Group_0__0 : rule__FunctionCall__Group_0__0__Impl rule__FunctionCall__Group_0__1 ;
    public final void rule__FunctionCall__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6073:1: ( rule__FunctionCall__Group_0__0__Impl rule__FunctionCall__Group_0__1 )
            // InternalKExpressions.g:6074:2: rule__FunctionCall__Group_0__0__Impl rule__FunctionCall__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__FunctionCall__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCall__Group_0__1();

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
    // $ANTLR end "rule__FunctionCall__Group_0__0"


    // $ANTLR start "rule__FunctionCall__Group_0__0__Impl"
    // InternalKExpressions.g:6081:1: rule__FunctionCall__Group_0__0__Impl : ( 'extern' ) ;
    public final void rule__FunctionCall__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6085:1: ( ( 'extern' ) )
            // InternalKExpressions.g:6086:1: ( 'extern' )
            {
            // InternalKExpressions.g:6086:1: ( 'extern' )
            // InternalKExpressions.g:6087:1: 'extern'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getExternKeyword_0_0()); 
            }
            match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getExternKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_0__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group_0__1"
    // InternalKExpressions.g:6100:1: rule__FunctionCall__Group_0__1 : rule__FunctionCall__Group_0__1__Impl rule__FunctionCall__Group_0__2 ;
    public final void rule__FunctionCall__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6104:1: ( rule__FunctionCall__Group_0__1__Impl rule__FunctionCall__Group_0__2 )
            // InternalKExpressions.g:6105:2: rule__FunctionCall__Group_0__1__Impl rule__FunctionCall__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_38);
            rule__FunctionCall__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCall__Group_0__2();

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
    // $ANTLR end "rule__FunctionCall__Group_0__1"


    // $ANTLR start "rule__FunctionCall__Group_0__1__Impl"
    // InternalKExpressions.g:6112:1: rule__FunctionCall__Group_0__1__Impl : ( ( rule__FunctionCall__FunctionNameAssignment_0_1 ) ) ;
    public final void rule__FunctionCall__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6116:1: ( ( ( rule__FunctionCall__FunctionNameAssignment_0_1 ) ) )
            // InternalKExpressions.g:6117:1: ( ( rule__FunctionCall__FunctionNameAssignment_0_1 ) )
            {
            // InternalKExpressions.g:6117:1: ( ( rule__FunctionCall__FunctionNameAssignment_0_1 ) )
            // InternalKExpressions.g:6118:1: ( rule__FunctionCall__FunctionNameAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFunctionNameAssignment_0_1()); 
            }
            // InternalKExpressions.g:6119:1: ( rule__FunctionCall__FunctionNameAssignment_0_1 )
            // InternalKExpressions.g:6119:2: rule__FunctionCall__FunctionNameAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCall__FunctionNameAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getFunctionNameAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_0__1__Impl"


    // $ANTLR start "rule__FunctionCall__Group_0__2"
    // InternalKExpressions.g:6129:1: rule__FunctionCall__Group_0__2 : rule__FunctionCall__Group_0__2__Impl ;
    public final void rule__FunctionCall__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6133:1: ( rule__FunctionCall__Group_0__2__Impl )
            // InternalKExpressions.g:6134:2: rule__FunctionCall__Group_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCall__Group_0__2__Impl();

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
    // $ANTLR end "rule__FunctionCall__Group_0__2"


    // $ANTLR start "rule__FunctionCall__Group_0__2__Impl"
    // InternalKExpressions.g:6140:1: rule__FunctionCall__Group_0__2__Impl : ( ( rule__FunctionCall__Alternatives_0_2 ) ) ;
    public final void rule__FunctionCall__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6144:1: ( ( ( rule__FunctionCall__Alternatives_0_2 ) ) )
            // InternalKExpressions.g:6145:1: ( ( rule__FunctionCall__Alternatives_0_2 ) )
            {
            // InternalKExpressions.g:6145:1: ( ( rule__FunctionCall__Alternatives_0_2 ) )
            // InternalKExpressions.g:6146:1: ( rule__FunctionCall__Alternatives_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getAlternatives_0_2()); 
            }
            // InternalKExpressions.g:6147:1: ( rule__FunctionCall__Alternatives_0_2 )
            // InternalKExpressions.g:6147:2: rule__FunctionCall__Alternatives_0_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCall__Alternatives_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getAlternatives_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_0__2__Impl"


    // $ANTLR start "rule__FunctionCall__Group_0_2_0__0"
    // InternalKExpressions.g:6163:1: rule__FunctionCall__Group_0_2_0__0 : rule__FunctionCall__Group_0_2_0__0__Impl rule__FunctionCall__Group_0_2_0__1 ;
    public final void rule__FunctionCall__Group_0_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6167:1: ( rule__FunctionCall__Group_0_2_0__0__Impl rule__FunctionCall__Group_0_2_0__1 )
            // InternalKExpressions.g:6168:2: rule__FunctionCall__Group_0_2_0__0__Impl rule__FunctionCall__Group_0_2_0__1
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__FunctionCall__Group_0_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCall__Group_0_2_0__1();

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
    // $ANTLR end "rule__FunctionCall__Group_0_2_0__0"


    // $ANTLR start "rule__FunctionCall__Group_0_2_0__0__Impl"
    // InternalKExpressions.g:6175:1: rule__FunctionCall__Group_0_2_0__0__Impl : ( '(' ) ;
    public final void rule__FunctionCall__Group_0_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6179:1: ( ( '(' ) )
            // InternalKExpressions.g:6180:1: ( '(' )
            {
            // InternalKExpressions.g:6180:1: ( '(' )
            // InternalKExpressions.g:6181:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_0_2_0_0()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_0_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_0_2_0__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group_0_2_0__1"
    // InternalKExpressions.g:6194:1: rule__FunctionCall__Group_0_2_0__1 : rule__FunctionCall__Group_0_2_0__1__Impl rule__FunctionCall__Group_0_2_0__2 ;
    public final void rule__FunctionCall__Group_0_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6198:1: ( rule__FunctionCall__Group_0_2_0__1__Impl rule__FunctionCall__Group_0_2_0__2 )
            // InternalKExpressions.g:6199:2: rule__FunctionCall__Group_0_2_0__1__Impl rule__FunctionCall__Group_0_2_0__2
            {
            pushFollow(FollowSets000.FOLLOW_40);
            rule__FunctionCall__Group_0_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCall__Group_0_2_0__2();

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
    // $ANTLR end "rule__FunctionCall__Group_0_2_0__1"


    // $ANTLR start "rule__FunctionCall__Group_0_2_0__1__Impl"
    // InternalKExpressions.g:6206:1: rule__FunctionCall__Group_0_2_0__1__Impl : ( ( rule__FunctionCall__ParametersAssignment_0_2_0_1 ) ) ;
    public final void rule__FunctionCall__Group_0_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6210:1: ( ( ( rule__FunctionCall__ParametersAssignment_0_2_0_1 ) ) )
            // InternalKExpressions.g:6211:1: ( ( rule__FunctionCall__ParametersAssignment_0_2_0_1 ) )
            {
            // InternalKExpressions.g:6211:1: ( ( rule__FunctionCall__ParametersAssignment_0_2_0_1 ) )
            // InternalKExpressions.g:6212:1: ( rule__FunctionCall__ParametersAssignment_0_2_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getParametersAssignment_0_2_0_1()); 
            }
            // InternalKExpressions.g:6213:1: ( rule__FunctionCall__ParametersAssignment_0_2_0_1 )
            // InternalKExpressions.g:6213:2: rule__FunctionCall__ParametersAssignment_0_2_0_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCall__ParametersAssignment_0_2_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getParametersAssignment_0_2_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_0_2_0__1__Impl"


    // $ANTLR start "rule__FunctionCall__Group_0_2_0__2"
    // InternalKExpressions.g:6223:1: rule__FunctionCall__Group_0_2_0__2 : rule__FunctionCall__Group_0_2_0__2__Impl rule__FunctionCall__Group_0_2_0__3 ;
    public final void rule__FunctionCall__Group_0_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6227:1: ( rule__FunctionCall__Group_0_2_0__2__Impl rule__FunctionCall__Group_0_2_0__3 )
            // InternalKExpressions.g:6228:2: rule__FunctionCall__Group_0_2_0__2__Impl rule__FunctionCall__Group_0_2_0__3
            {
            pushFollow(FollowSets000.FOLLOW_40);
            rule__FunctionCall__Group_0_2_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCall__Group_0_2_0__3();

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
    // $ANTLR end "rule__FunctionCall__Group_0_2_0__2"


    // $ANTLR start "rule__FunctionCall__Group_0_2_0__2__Impl"
    // InternalKExpressions.g:6235:1: rule__FunctionCall__Group_0_2_0__2__Impl : ( ( rule__FunctionCall__Group_0_2_0_2__0 )* ) ;
    public final void rule__FunctionCall__Group_0_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6239:1: ( ( ( rule__FunctionCall__Group_0_2_0_2__0 )* ) )
            // InternalKExpressions.g:6240:1: ( ( rule__FunctionCall__Group_0_2_0_2__0 )* )
            {
            // InternalKExpressions.g:6240:1: ( ( rule__FunctionCall__Group_0_2_0_2__0 )* )
            // InternalKExpressions.g:6241:1: ( rule__FunctionCall__Group_0_2_0_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGroup_0_2_0_2()); 
            }
            // InternalKExpressions.g:6242:1: ( rule__FunctionCall__Group_0_2_0_2__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==43) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalKExpressions.g:6242:2: rule__FunctionCall__Group_0_2_0_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_41);
            	    rule__FunctionCall__Group_0_2_0_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getGroup_0_2_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_0_2_0__2__Impl"


    // $ANTLR start "rule__FunctionCall__Group_0_2_0__3"
    // InternalKExpressions.g:6252:1: rule__FunctionCall__Group_0_2_0__3 : rule__FunctionCall__Group_0_2_0__3__Impl ;
    public final void rule__FunctionCall__Group_0_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6256:1: ( rule__FunctionCall__Group_0_2_0__3__Impl )
            // InternalKExpressions.g:6257:2: rule__FunctionCall__Group_0_2_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCall__Group_0_2_0__3__Impl();

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
    // $ANTLR end "rule__FunctionCall__Group_0_2_0__3"


    // $ANTLR start "rule__FunctionCall__Group_0_2_0__3__Impl"
    // InternalKExpressions.g:6263:1: rule__FunctionCall__Group_0_2_0__3__Impl : ( ')' ) ;
    public final void rule__FunctionCall__Group_0_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6267:1: ( ( ')' ) )
            // InternalKExpressions.g:6268:1: ( ')' )
            {
            // InternalKExpressions.g:6268:1: ( ')' )
            // InternalKExpressions.g:6269:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_0_2_0_3()); 
            }
            match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_0_2_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_0_2_0__3__Impl"


    // $ANTLR start "rule__FunctionCall__Group_0_2_0_2__0"
    // InternalKExpressions.g:6290:1: rule__FunctionCall__Group_0_2_0_2__0 : rule__FunctionCall__Group_0_2_0_2__0__Impl rule__FunctionCall__Group_0_2_0_2__1 ;
    public final void rule__FunctionCall__Group_0_2_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6294:1: ( rule__FunctionCall__Group_0_2_0_2__0__Impl rule__FunctionCall__Group_0_2_0_2__1 )
            // InternalKExpressions.g:6295:2: rule__FunctionCall__Group_0_2_0_2__0__Impl rule__FunctionCall__Group_0_2_0_2__1
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__FunctionCall__Group_0_2_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCall__Group_0_2_0_2__1();

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
    // $ANTLR end "rule__FunctionCall__Group_0_2_0_2__0"


    // $ANTLR start "rule__FunctionCall__Group_0_2_0_2__0__Impl"
    // InternalKExpressions.g:6302:1: rule__FunctionCall__Group_0_2_0_2__0__Impl : ( ',' ) ;
    public final void rule__FunctionCall__Group_0_2_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6306:1: ( ( ',' ) )
            // InternalKExpressions.g:6307:1: ( ',' )
            {
            // InternalKExpressions.g:6307:1: ( ',' )
            // InternalKExpressions.g:6308:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getCommaKeyword_0_2_0_2_0()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getCommaKeyword_0_2_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_0_2_0_2__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group_0_2_0_2__1"
    // InternalKExpressions.g:6321:1: rule__FunctionCall__Group_0_2_0_2__1 : rule__FunctionCall__Group_0_2_0_2__1__Impl ;
    public final void rule__FunctionCall__Group_0_2_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6325:1: ( rule__FunctionCall__Group_0_2_0_2__1__Impl )
            // InternalKExpressions.g:6326:2: rule__FunctionCall__Group_0_2_0_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCall__Group_0_2_0_2__1__Impl();

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
    // $ANTLR end "rule__FunctionCall__Group_0_2_0_2__1"


    // $ANTLR start "rule__FunctionCall__Group_0_2_0_2__1__Impl"
    // InternalKExpressions.g:6332:1: rule__FunctionCall__Group_0_2_0_2__1__Impl : ( ( rule__FunctionCall__ParametersAssignment_0_2_0_2_1 ) ) ;
    public final void rule__FunctionCall__Group_0_2_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6336:1: ( ( ( rule__FunctionCall__ParametersAssignment_0_2_0_2_1 ) ) )
            // InternalKExpressions.g:6337:1: ( ( rule__FunctionCall__ParametersAssignment_0_2_0_2_1 ) )
            {
            // InternalKExpressions.g:6337:1: ( ( rule__FunctionCall__ParametersAssignment_0_2_0_2_1 ) )
            // InternalKExpressions.g:6338:1: ( rule__FunctionCall__ParametersAssignment_0_2_0_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getParametersAssignment_0_2_0_2_1()); 
            }
            // InternalKExpressions.g:6339:1: ( rule__FunctionCall__ParametersAssignment_0_2_0_2_1 )
            // InternalKExpressions.g:6339:2: rule__FunctionCall__ParametersAssignment_0_2_0_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCall__ParametersAssignment_0_2_0_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getParametersAssignment_0_2_0_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_0_2_0_2__1__Impl"


    // $ANTLR start "rule__FunctionCall__Group_1__0"
    // InternalKExpressions.g:6353:1: rule__FunctionCall__Group_1__0 : rule__FunctionCall__Group_1__0__Impl rule__FunctionCall__Group_1__1 ;
    public final void rule__FunctionCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6357:1: ( rule__FunctionCall__Group_1__0__Impl rule__FunctionCall__Group_1__1 )
            // InternalKExpressions.g:6358:2: rule__FunctionCall__Group_1__0__Impl rule__FunctionCall__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__FunctionCall__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCall__Group_1__1();

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
    // $ANTLR end "rule__FunctionCall__Group_1__0"


    // $ANTLR start "rule__FunctionCall__Group_1__0__Impl"
    // InternalKExpressions.g:6365:1: rule__FunctionCall__Group_1__0__Impl : ( '<' ) ;
    public final void rule__FunctionCall__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6369:1: ( ( '<' ) )
            // InternalKExpressions.g:6370:1: ( '<' )
            {
            // InternalKExpressions.g:6370:1: ( '<' )
            // InternalKExpressions.g:6371:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getLessThanSignKeyword_1_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getLessThanSignKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group_1__1"
    // InternalKExpressions.g:6384:1: rule__FunctionCall__Group_1__1 : rule__FunctionCall__Group_1__1__Impl rule__FunctionCall__Group_1__2 ;
    public final void rule__FunctionCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6388:1: ( rule__FunctionCall__Group_1__1__Impl rule__FunctionCall__Group_1__2 )
            // InternalKExpressions.g:6389:2: rule__FunctionCall__Group_1__1__Impl rule__FunctionCall__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_38);
            rule__FunctionCall__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCall__Group_1__2();

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
    // $ANTLR end "rule__FunctionCall__Group_1__1"


    // $ANTLR start "rule__FunctionCall__Group_1__1__Impl"
    // InternalKExpressions.g:6396:1: rule__FunctionCall__Group_1__1__Impl : ( ( rule__FunctionCall__FunctionNameAssignment_1_1 ) ) ;
    public final void rule__FunctionCall__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6400:1: ( ( ( rule__FunctionCall__FunctionNameAssignment_1_1 ) ) )
            // InternalKExpressions.g:6401:1: ( ( rule__FunctionCall__FunctionNameAssignment_1_1 ) )
            {
            // InternalKExpressions.g:6401:1: ( ( rule__FunctionCall__FunctionNameAssignment_1_1 ) )
            // InternalKExpressions.g:6402:1: ( rule__FunctionCall__FunctionNameAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFunctionNameAssignment_1_1()); 
            }
            // InternalKExpressions.g:6403:1: ( rule__FunctionCall__FunctionNameAssignment_1_1 )
            // InternalKExpressions.g:6403:2: rule__FunctionCall__FunctionNameAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCall__FunctionNameAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getFunctionNameAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1__1__Impl"


    // $ANTLR start "rule__FunctionCall__Group_1__2"
    // InternalKExpressions.g:6413:1: rule__FunctionCall__Group_1__2 : rule__FunctionCall__Group_1__2__Impl rule__FunctionCall__Group_1__3 ;
    public final void rule__FunctionCall__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6417:1: ( rule__FunctionCall__Group_1__2__Impl rule__FunctionCall__Group_1__3 )
            // InternalKExpressions.g:6418:2: rule__FunctionCall__Group_1__2__Impl rule__FunctionCall__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_42);
            rule__FunctionCall__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCall__Group_1__3();

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
    // $ANTLR end "rule__FunctionCall__Group_1__2"


    // $ANTLR start "rule__FunctionCall__Group_1__2__Impl"
    // InternalKExpressions.g:6425:1: rule__FunctionCall__Group_1__2__Impl : ( ( rule__FunctionCall__Alternatives_1_2 ) ) ;
    public final void rule__FunctionCall__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6429:1: ( ( ( rule__FunctionCall__Alternatives_1_2 ) ) )
            // InternalKExpressions.g:6430:1: ( ( rule__FunctionCall__Alternatives_1_2 ) )
            {
            // InternalKExpressions.g:6430:1: ( ( rule__FunctionCall__Alternatives_1_2 ) )
            // InternalKExpressions.g:6431:1: ( rule__FunctionCall__Alternatives_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getAlternatives_1_2()); 
            }
            // InternalKExpressions.g:6432:1: ( rule__FunctionCall__Alternatives_1_2 )
            // InternalKExpressions.g:6432:2: rule__FunctionCall__Alternatives_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCall__Alternatives_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getAlternatives_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1__2__Impl"


    // $ANTLR start "rule__FunctionCall__Group_1__3"
    // InternalKExpressions.g:6442:1: rule__FunctionCall__Group_1__3 : rule__FunctionCall__Group_1__3__Impl ;
    public final void rule__FunctionCall__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6446:1: ( rule__FunctionCall__Group_1__3__Impl )
            // InternalKExpressions.g:6447:2: rule__FunctionCall__Group_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCall__Group_1__3__Impl();

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
    // $ANTLR end "rule__FunctionCall__Group_1__3"


    // $ANTLR start "rule__FunctionCall__Group_1__3__Impl"
    // InternalKExpressions.g:6453:1: rule__FunctionCall__Group_1__3__Impl : ( '>' ) ;
    public final void rule__FunctionCall__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6457:1: ( ( '>' ) )
            // InternalKExpressions.g:6458:1: ( '>' )
            {
            // InternalKExpressions.g:6458:1: ( '>' )
            // InternalKExpressions.g:6459:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGreaterThanSignKeyword_1_3()); 
            }
            match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getGreaterThanSignKeyword_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1__3__Impl"


    // $ANTLR start "rule__FunctionCall__Group_1_2_0__0"
    // InternalKExpressions.g:6480:1: rule__FunctionCall__Group_1_2_0__0 : rule__FunctionCall__Group_1_2_0__0__Impl rule__FunctionCall__Group_1_2_0__1 ;
    public final void rule__FunctionCall__Group_1_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6484:1: ( rule__FunctionCall__Group_1_2_0__0__Impl rule__FunctionCall__Group_1_2_0__1 )
            // InternalKExpressions.g:6485:2: rule__FunctionCall__Group_1_2_0__0__Impl rule__FunctionCall__Group_1_2_0__1
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__FunctionCall__Group_1_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCall__Group_1_2_0__1();

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
    // $ANTLR end "rule__FunctionCall__Group_1_2_0__0"


    // $ANTLR start "rule__FunctionCall__Group_1_2_0__0__Impl"
    // InternalKExpressions.g:6492:1: rule__FunctionCall__Group_1_2_0__0__Impl : ( '(' ) ;
    public final void rule__FunctionCall__Group_1_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6496:1: ( ( '(' ) )
            // InternalKExpressions.g:6497:1: ( '(' )
            {
            // InternalKExpressions.g:6497:1: ( '(' )
            // InternalKExpressions.g:6498:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1_2_0_0()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1_2_0__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group_1_2_0__1"
    // InternalKExpressions.g:6511:1: rule__FunctionCall__Group_1_2_0__1 : rule__FunctionCall__Group_1_2_0__1__Impl rule__FunctionCall__Group_1_2_0__2 ;
    public final void rule__FunctionCall__Group_1_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6515:1: ( rule__FunctionCall__Group_1_2_0__1__Impl rule__FunctionCall__Group_1_2_0__2 )
            // InternalKExpressions.g:6516:2: rule__FunctionCall__Group_1_2_0__1__Impl rule__FunctionCall__Group_1_2_0__2
            {
            pushFollow(FollowSets000.FOLLOW_40);
            rule__FunctionCall__Group_1_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCall__Group_1_2_0__2();

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
    // $ANTLR end "rule__FunctionCall__Group_1_2_0__1"


    // $ANTLR start "rule__FunctionCall__Group_1_2_0__1__Impl"
    // InternalKExpressions.g:6523:1: rule__FunctionCall__Group_1_2_0__1__Impl : ( ( rule__FunctionCall__ParametersAssignment_1_2_0_1 ) ) ;
    public final void rule__FunctionCall__Group_1_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6527:1: ( ( ( rule__FunctionCall__ParametersAssignment_1_2_0_1 ) ) )
            // InternalKExpressions.g:6528:1: ( ( rule__FunctionCall__ParametersAssignment_1_2_0_1 ) )
            {
            // InternalKExpressions.g:6528:1: ( ( rule__FunctionCall__ParametersAssignment_1_2_0_1 ) )
            // InternalKExpressions.g:6529:1: ( rule__FunctionCall__ParametersAssignment_1_2_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getParametersAssignment_1_2_0_1()); 
            }
            // InternalKExpressions.g:6530:1: ( rule__FunctionCall__ParametersAssignment_1_2_0_1 )
            // InternalKExpressions.g:6530:2: rule__FunctionCall__ParametersAssignment_1_2_0_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCall__ParametersAssignment_1_2_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getParametersAssignment_1_2_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1_2_0__1__Impl"


    // $ANTLR start "rule__FunctionCall__Group_1_2_0__2"
    // InternalKExpressions.g:6540:1: rule__FunctionCall__Group_1_2_0__2 : rule__FunctionCall__Group_1_2_0__2__Impl rule__FunctionCall__Group_1_2_0__3 ;
    public final void rule__FunctionCall__Group_1_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6544:1: ( rule__FunctionCall__Group_1_2_0__2__Impl rule__FunctionCall__Group_1_2_0__3 )
            // InternalKExpressions.g:6545:2: rule__FunctionCall__Group_1_2_0__2__Impl rule__FunctionCall__Group_1_2_0__3
            {
            pushFollow(FollowSets000.FOLLOW_40);
            rule__FunctionCall__Group_1_2_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCall__Group_1_2_0__3();

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
    // $ANTLR end "rule__FunctionCall__Group_1_2_0__2"


    // $ANTLR start "rule__FunctionCall__Group_1_2_0__2__Impl"
    // InternalKExpressions.g:6552:1: rule__FunctionCall__Group_1_2_0__2__Impl : ( ( rule__FunctionCall__Group_1_2_0_2__0 )* ) ;
    public final void rule__FunctionCall__Group_1_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6556:1: ( ( ( rule__FunctionCall__Group_1_2_0_2__0 )* ) )
            // InternalKExpressions.g:6557:1: ( ( rule__FunctionCall__Group_1_2_0_2__0 )* )
            {
            // InternalKExpressions.g:6557:1: ( ( rule__FunctionCall__Group_1_2_0_2__0 )* )
            // InternalKExpressions.g:6558:1: ( rule__FunctionCall__Group_1_2_0_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGroup_1_2_0_2()); 
            }
            // InternalKExpressions.g:6559:1: ( rule__FunctionCall__Group_1_2_0_2__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==43) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalKExpressions.g:6559:2: rule__FunctionCall__Group_1_2_0_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_41);
            	    rule__FunctionCall__Group_1_2_0_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getGroup_1_2_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1_2_0__2__Impl"


    // $ANTLR start "rule__FunctionCall__Group_1_2_0__3"
    // InternalKExpressions.g:6569:1: rule__FunctionCall__Group_1_2_0__3 : rule__FunctionCall__Group_1_2_0__3__Impl ;
    public final void rule__FunctionCall__Group_1_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6573:1: ( rule__FunctionCall__Group_1_2_0__3__Impl )
            // InternalKExpressions.g:6574:2: rule__FunctionCall__Group_1_2_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCall__Group_1_2_0__3__Impl();

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
    // $ANTLR end "rule__FunctionCall__Group_1_2_0__3"


    // $ANTLR start "rule__FunctionCall__Group_1_2_0__3__Impl"
    // InternalKExpressions.g:6580:1: rule__FunctionCall__Group_1_2_0__3__Impl : ( ')' ) ;
    public final void rule__FunctionCall__Group_1_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6584:1: ( ( ')' ) )
            // InternalKExpressions.g:6585:1: ( ')' )
            {
            // InternalKExpressions.g:6585:1: ( ')' )
            // InternalKExpressions.g:6586:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_1_2_0_3()); 
            }
            match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_1_2_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1_2_0__3__Impl"


    // $ANTLR start "rule__FunctionCall__Group_1_2_0_2__0"
    // InternalKExpressions.g:6607:1: rule__FunctionCall__Group_1_2_0_2__0 : rule__FunctionCall__Group_1_2_0_2__0__Impl rule__FunctionCall__Group_1_2_0_2__1 ;
    public final void rule__FunctionCall__Group_1_2_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6611:1: ( rule__FunctionCall__Group_1_2_0_2__0__Impl rule__FunctionCall__Group_1_2_0_2__1 )
            // InternalKExpressions.g:6612:2: rule__FunctionCall__Group_1_2_0_2__0__Impl rule__FunctionCall__Group_1_2_0_2__1
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__FunctionCall__Group_1_2_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCall__Group_1_2_0_2__1();

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
    // $ANTLR end "rule__FunctionCall__Group_1_2_0_2__0"


    // $ANTLR start "rule__FunctionCall__Group_1_2_0_2__0__Impl"
    // InternalKExpressions.g:6619:1: rule__FunctionCall__Group_1_2_0_2__0__Impl : ( ',' ) ;
    public final void rule__FunctionCall__Group_1_2_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6623:1: ( ( ',' ) )
            // InternalKExpressions.g:6624:1: ( ',' )
            {
            // InternalKExpressions.g:6624:1: ( ',' )
            // InternalKExpressions.g:6625:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getCommaKeyword_1_2_0_2_0()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getCommaKeyword_1_2_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1_2_0_2__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group_1_2_0_2__1"
    // InternalKExpressions.g:6638:1: rule__FunctionCall__Group_1_2_0_2__1 : rule__FunctionCall__Group_1_2_0_2__1__Impl ;
    public final void rule__FunctionCall__Group_1_2_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6642:1: ( rule__FunctionCall__Group_1_2_0_2__1__Impl )
            // InternalKExpressions.g:6643:2: rule__FunctionCall__Group_1_2_0_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCall__Group_1_2_0_2__1__Impl();

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
    // $ANTLR end "rule__FunctionCall__Group_1_2_0_2__1"


    // $ANTLR start "rule__FunctionCall__Group_1_2_0_2__1__Impl"
    // InternalKExpressions.g:6649:1: rule__FunctionCall__Group_1_2_0_2__1__Impl : ( ( rule__FunctionCall__ParametersAssignment_1_2_0_2_1 ) ) ;
    public final void rule__FunctionCall__Group_1_2_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6653:1: ( ( ( rule__FunctionCall__ParametersAssignment_1_2_0_2_1 ) ) )
            // InternalKExpressions.g:6654:1: ( ( rule__FunctionCall__ParametersAssignment_1_2_0_2_1 ) )
            {
            // InternalKExpressions.g:6654:1: ( ( rule__FunctionCall__ParametersAssignment_1_2_0_2_1 ) )
            // InternalKExpressions.g:6655:1: ( rule__FunctionCall__ParametersAssignment_1_2_0_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getParametersAssignment_1_2_0_2_1()); 
            }
            // InternalKExpressions.g:6656:1: ( rule__FunctionCall__ParametersAssignment_1_2_0_2_1 )
            // InternalKExpressions.g:6656:2: rule__FunctionCall__ParametersAssignment_1_2_0_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCall__ParametersAssignment_1_2_0_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getParametersAssignment_1_2_0_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1_2_0_2__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalKExpressions.g:6670:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6674:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalKExpressions.g:6675:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_39);
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
    // InternalKExpressions.g:6682:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__Group_0__0 )? ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6686:1: ( ( ( rule__Parameter__Group_0__0 )? ) )
            // InternalKExpressions.g:6687:1: ( ( rule__Parameter__Group_0__0 )? )
            {
            // InternalKExpressions.g:6687:1: ( ( rule__Parameter__Group_0__0 )? )
            // InternalKExpressions.g:6688:1: ( rule__Parameter__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getGroup_0()); 
            }
            // InternalKExpressions.g:6689:1: ( rule__Parameter__Group_0__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==20) ) {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==19) ) {
                    alt44=1;
                }
            }
            else if ( (LA44_0==19) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalKExpressions.g:6689:2: rule__Parameter__Group_0__0
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
    // InternalKExpressions.g:6699:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6703:1: ( rule__Parameter__Group__1__Impl )
            // InternalKExpressions.g:6704:2: rule__Parameter__Group__1__Impl
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
    // InternalKExpressions.g:6710:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__ExpressionAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6714:1: ( ( ( rule__Parameter__ExpressionAssignment_1 ) ) )
            // InternalKExpressions.g:6715:1: ( ( rule__Parameter__ExpressionAssignment_1 ) )
            {
            // InternalKExpressions.g:6715:1: ( ( rule__Parameter__ExpressionAssignment_1 ) )
            // InternalKExpressions.g:6716:1: ( rule__Parameter__ExpressionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getExpressionAssignment_1()); 
            }
            // InternalKExpressions.g:6717:1: ( rule__Parameter__ExpressionAssignment_1 )
            // InternalKExpressions.g:6717:2: rule__Parameter__ExpressionAssignment_1
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
    // InternalKExpressions.g:6731:1: rule__Parameter__Group_0__0 : rule__Parameter__Group_0__0__Impl rule__Parameter__Group_0__1 ;
    public final void rule__Parameter__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6735:1: ( rule__Parameter__Group_0__0__Impl rule__Parameter__Group_0__1 )
            // InternalKExpressions.g:6736:2: rule__Parameter__Group_0__0__Impl rule__Parameter__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_43);
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
    // InternalKExpressions.g:6743:1: rule__Parameter__Group_0__0__Impl : ( ( rule__Parameter__PureOutputAssignment_0_0 )? ) ;
    public final void rule__Parameter__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6747:1: ( ( ( rule__Parameter__PureOutputAssignment_0_0 )? ) )
            // InternalKExpressions.g:6748:1: ( ( rule__Parameter__PureOutputAssignment_0_0 )? )
            {
            // InternalKExpressions.g:6748:1: ( ( rule__Parameter__PureOutputAssignment_0_0 )? )
            // InternalKExpressions.g:6749:1: ( rule__Parameter__PureOutputAssignment_0_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getPureOutputAssignment_0_0()); 
            }
            // InternalKExpressions.g:6750:1: ( rule__Parameter__PureOutputAssignment_0_0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==20) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalKExpressions.g:6750:2: rule__Parameter__PureOutputAssignment_0_0
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
    // InternalKExpressions.g:6760:1: rule__Parameter__Group_0__1 : rule__Parameter__Group_0__1__Impl ;
    public final void rule__Parameter__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6764:1: ( rule__Parameter__Group_0__1__Impl )
            // InternalKExpressions.g:6765:2: rule__Parameter__Group_0__1__Impl
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
    // InternalKExpressions.g:6771:1: rule__Parameter__Group_0__1__Impl : ( ( rule__Parameter__CallByReferenceAssignment_0_1 ) ) ;
    public final void rule__Parameter__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6775:1: ( ( ( rule__Parameter__CallByReferenceAssignment_0_1 ) ) )
            // InternalKExpressions.g:6776:1: ( ( rule__Parameter__CallByReferenceAssignment_0_1 ) )
            {
            // InternalKExpressions.g:6776:1: ( ( rule__Parameter__CallByReferenceAssignment_0_1 ) )
            // InternalKExpressions.g:6777:1: ( rule__Parameter__CallByReferenceAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getCallByReferenceAssignment_0_1()); 
            }
            // InternalKExpressions.g:6778:1: ( rule__Parameter__CallByReferenceAssignment_0_1 )
            // InternalKExpressions.g:6778:2: rule__Parameter__CallByReferenceAssignment_0_1
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
    // InternalKExpressions.g:6792:1: rule__TagAnnotation__Group__0 : rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 ;
    public final void rule__TagAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6796:1: ( rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 )
            // InternalKExpressions.g:6797:2: rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
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
    // InternalKExpressions.g:6804:1: rule__TagAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TagAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6808:1: ( ( '@' ) )
            // InternalKExpressions.g:6809:1: ( '@' )
            {
            // InternalKExpressions.g:6809:1: ( '@' )
            // InternalKExpressions.g:6810:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:6823:1: rule__TagAnnotation__Group__1 : rule__TagAnnotation__Group__1__Impl ;
    public final void rule__TagAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6827:1: ( rule__TagAnnotation__Group__1__Impl )
            // InternalKExpressions.g:6828:2: rule__TagAnnotation__Group__1__Impl
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
    // InternalKExpressions.g:6834:1: rule__TagAnnotation__Group__1__Impl : ( ( rule__TagAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TagAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6838:1: ( ( ( rule__TagAnnotation__NameAssignment_1 ) ) )
            // InternalKExpressions.g:6839:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:6839:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            // InternalKExpressions.g:6840:1: ( rule__TagAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:6841:1: ( rule__TagAnnotation__NameAssignment_1 )
            // InternalKExpressions.g:6841:2: rule__TagAnnotation__NameAssignment_1
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


    // $ANTLR start "rule__PragmaTag__Group__0"
    // InternalKExpressions.g:6855:1: rule__PragmaTag__Group__0 : rule__PragmaTag__Group__0__Impl rule__PragmaTag__Group__1 ;
    public final void rule__PragmaTag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6859:1: ( rule__PragmaTag__Group__0__Impl rule__PragmaTag__Group__1 )
            // InternalKExpressions.g:6860:2: rule__PragmaTag__Group__0__Impl rule__PragmaTag__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__PragmaTag__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PragmaTag__Group__1();

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
    // $ANTLR end "rule__PragmaTag__Group__0"


    // $ANTLR start "rule__PragmaTag__Group__0__Impl"
    // InternalKExpressions.g:6867:1: rule__PragmaTag__Group__0__Impl : ( '#' ) ;
    public final void rule__PragmaTag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6871:1: ( ( '#' ) )
            // InternalKExpressions.g:6872:1: ( '#' )
            {
            // InternalKExpressions.g:6872:1: ( '#' )
            // InternalKExpressions.g:6873:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPragmaTagAccess().getNumberSignKeyword_0()); 
            }
            match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPragmaTagAccess().getNumberSignKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PragmaTag__Group__0__Impl"


    // $ANTLR start "rule__PragmaTag__Group__1"
    // InternalKExpressions.g:6886:1: rule__PragmaTag__Group__1 : rule__PragmaTag__Group__1__Impl ;
    public final void rule__PragmaTag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6890:1: ( rule__PragmaTag__Group__1__Impl )
            // InternalKExpressions.g:6891:2: rule__PragmaTag__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PragmaTag__Group__1__Impl();

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
    // $ANTLR end "rule__PragmaTag__Group__1"


    // $ANTLR start "rule__PragmaTag__Group__1__Impl"
    // InternalKExpressions.g:6897:1: rule__PragmaTag__Group__1__Impl : ( ( rule__PragmaTag__NameAssignment_1 ) ) ;
    public final void rule__PragmaTag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6901:1: ( ( ( rule__PragmaTag__NameAssignment_1 ) ) )
            // InternalKExpressions.g:6902:1: ( ( rule__PragmaTag__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:6902:1: ( ( rule__PragmaTag__NameAssignment_1 ) )
            // InternalKExpressions.g:6903:1: ( rule__PragmaTag__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPragmaTagAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:6904:1: ( rule__PragmaTag__NameAssignment_1 )
            // InternalKExpressions.g:6904:2: rule__PragmaTag__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PragmaTag__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPragmaTagAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PragmaTag__Group__1__Impl"


    // $ANTLR start "rule__KeyStringValueAnnotation__Group__0"
    // InternalKExpressions.g:6918:1: rule__KeyStringValueAnnotation__Group__0 : rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 ;
    public final void rule__KeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6922:1: ( rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 )
            // InternalKExpressions.g:6923:2: rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
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
    // InternalKExpressions.g:6930:1: rule__KeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6934:1: ( ( '@' ) )
            // InternalKExpressions.g:6935:1: ( '@' )
            {
            // InternalKExpressions.g:6935:1: ( '@' )
            // InternalKExpressions.g:6936:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:6949:1: rule__KeyStringValueAnnotation__Group__1 : rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 ;
    public final void rule__KeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6953:1: ( rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 )
            // InternalKExpressions.g:6954:2: rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_44);
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
    // InternalKExpressions.g:6961:1: rule__KeyStringValueAnnotation__Group__1__Impl : ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6965:1: ( ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKExpressions.g:6966:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:6966:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKExpressions.g:6967:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:6968:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            // InternalKExpressions.g:6968:2: rule__KeyStringValueAnnotation__NameAssignment_1
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
    // InternalKExpressions.g:6978:1: rule__KeyStringValueAnnotation__Group__2 : rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 ;
    public final void rule__KeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6982:1: ( rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 )
            // InternalKExpressions.g:6983:2: rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_45);
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
    // InternalKExpressions.g:6990:1: rule__KeyStringValueAnnotation__Group__2__Impl : ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6994:1: ( ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalKExpressions.g:6995:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalKExpressions.g:6995:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalKExpressions.g:6996:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            }
            // InternalKExpressions.g:6997:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalKExpressions.g:6997:2: rule__KeyStringValueAnnotation__ValuesAssignment_2
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
    // InternalKExpressions.g:7007:1: rule__KeyStringValueAnnotation__Group__3 : rule__KeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__KeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7011:1: ( rule__KeyStringValueAnnotation__Group__3__Impl )
            // InternalKExpressions.g:7012:2: rule__KeyStringValueAnnotation__Group__3__Impl
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
    // InternalKExpressions.g:7018:1: rule__KeyStringValueAnnotation__Group__3__Impl : ( ( rule__KeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__KeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7022:1: ( ( ( rule__KeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalKExpressions.g:7023:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalKExpressions.g:7023:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )* )
            // InternalKExpressions.g:7024:1: ( rule__KeyStringValueAnnotation__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // InternalKExpressions.g:7025:1: ( rule__KeyStringValueAnnotation__Group_3__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==43) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalKExpressions.g:7025:2: rule__KeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_41);
            	    rule__KeyStringValueAnnotation__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop46;
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
    // InternalKExpressions.g:7043:1: rule__KeyStringValueAnnotation__Group_3__0 : rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 ;
    public final void rule__KeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7047:1: ( rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 )
            // InternalKExpressions.g:7048:2: rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_44);
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
    // InternalKExpressions.g:7055:1: rule__KeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7059:1: ( ( ',' ) )
            // InternalKExpressions.g:7060:1: ( ',' )
            {
            // InternalKExpressions.g:7060:1: ( ',' )
            // InternalKExpressions.g:7061:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:7074:1: rule__KeyStringValueAnnotation__Group_3__1 : rule__KeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__KeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7078:1: ( rule__KeyStringValueAnnotation__Group_3__1__Impl )
            // InternalKExpressions.g:7079:2: rule__KeyStringValueAnnotation__Group_3__1__Impl
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
    // InternalKExpressions.g:7085:1: rule__KeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7089:1: ( ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalKExpressions.g:7090:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalKExpressions.g:7090:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalKExpressions.g:7091:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            }
            // InternalKExpressions.g:7092:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalKExpressions.g:7092:2: rule__KeyStringValueAnnotation__ValuesAssignment_3_1
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


    // $ANTLR start "rule__RestrictedKeyStringValueAnnotation__Group__0"
    // InternalKExpressions.g:7106:1: rule__RestrictedKeyStringValueAnnotation__Group__0 : rule__RestrictedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedKeyStringValueAnnotation__Group__1 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7110:1: ( rule__RestrictedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedKeyStringValueAnnotation__Group__1 )
            // InternalKExpressions.g:7111:2: rule__RestrictedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__RestrictedKeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedKeyStringValueAnnotation__Group__1();

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
    // $ANTLR end "rule__RestrictedKeyStringValueAnnotation__Group__0"


    // $ANTLR start "rule__RestrictedKeyStringValueAnnotation__Group__0__Impl"
    // InternalKExpressions.g:7118:1: rule__RestrictedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7122:1: ( ( '@' ) )
            // InternalKExpressions.g:7123:1: ( '@' )
            {
            // InternalKExpressions.g:7123:1: ( '@' )
            // InternalKExpressions.g:7124:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedKeyStringValueAnnotation__Group__0__Impl"


    // $ANTLR start "rule__RestrictedKeyStringValueAnnotation__Group__1"
    // InternalKExpressions.g:7137:1: rule__RestrictedKeyStringValueAnnotation__Group__1 : rule__RestrictedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedKeyStringValueAnnotation__Group__2 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7141:1: ( rule__RestrictedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedKeyStringValueAnnotation__Group__2 )
            // InternalKExpressions.g:7142:2: rule__RestrictedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_46);
            rule__RestrictedKeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedKeyStringValueAnnotation__Group__2();

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
    // $ANTLR end "rule__RestrictedKeyStringValueAnnotation__Group__1"


    // $ANTLR start "rule__RestrictedKeyStringValueAnnotation__Group__1__Impl"
    // InternalKExpressions.g:7149:1: rule__RestrictedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7153:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKExpressions.g:7154:1: ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:7154:1: ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKExpressions.g:7155:1: ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:7156:1: ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKExpressions.g:7156:2: rule__RestrictedKeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedKeyStringValueAnnotation__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedKeyStringValueAnnotation__Group__1__Impl"


    // $ANTLR start "rule__RestrictedKeyStringValueAnnotation__Group__2"
    // InternalKExpressions.g:7166:1: rule__RestrictedKeyStringValueAnnotation__Group__2 : rule__RestrictedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedKeyStringValueAnnotation__Group__3 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7170:1: ( rule__RestrictedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedKeyStringValueAnnotation__Group__3 )
            // InternalKExpressions.g:7171:2: rule__RestrictedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_45);
            rule__RestrictedKeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedKeyStringValueAnnotation__Group__3();

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
    // $ANTLR end "rule__RestrictedKeyStringValueAnnotation__Group__2"


    // $ANTLR start "rule__RestrictedKeyStringValueAnnotation__Group__2__Impl"
    // InternalKExpressions.g:7178:1: rule__RestrictedKeyStringValueAnnotation__Group__2__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7182:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalKExpressions.g:7183:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalKExpressions.g:7183:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalKExpressions.g:7184:1: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            }
            // InternalKExpressions.g:7185:1: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalKExpressions.g:7185:2: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedKeyStringValueAnnotation__Group__2__Impl"


    // $ANTLR start "rule__RestrictedKeyStringValueAnnotation__Group__3"
    // InternalKExpressions.g:7195:1: rule__RestrictedKeyStringValueAnnotation__Group__3 : rule__RestrictedKeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7199:1: ( rule__RestrictedKeyStringValueAnnotation__Group__3__Impl )
            // InternalKExpressions.g:7200:2: rule__RestrictedKeyStringValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedKeyStringValueAnnotation__Group__3__Impl();

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
    // $ANTLR end "rule__RestrictedKeyStringValueAnnotation__Group__3"


    // $ANTLR start "rule__RestrictedKeyStringValueAnnotation__Group__3__Impl"
    // InternalKExpressions.g:7206:1: rule__RestrictedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7210:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalKExpressions.g:7211:1: ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalKExpressions.g:7211:1: ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* )
            // InternalKExpressions.g:7212:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // InternalKExpressions.g:7213:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==43) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalKExpressions.g:7213:2: rule__RestrictedKeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_41);
            	    rule__RestrictedKeyStringValueAnnotation__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedKeyStringValueAnnotation__Group__3__Impl"


    // $ANTLR start "rule__RestrictedKeyStringValueAnnotation__Group_3__0"
    // InternalKExpressions.g:7231:1: rule__RestrictedKeyStringValueAnnotation__Group_3__0 : rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl rule__RestrictedKeyStringValueAnnotation__Group_3__1 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7235:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl rule__RestrictedKeyStringValueAnnotation__Group_3__1 )
            // InternalKExpressions.g:7236:2: rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl rule__RestrictedKeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_46);
            rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedKeyStringValueAnnotation__Group_3__1();

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
    // $ANTLR end "rule__RestrictedKeyStringValueAnnotation__Group_3__0"


    // $ANTLR start "rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl"
    // InternalKExpressions.g:7243:1: rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7247:1: ( ( ',' ) )
            // InternalKExpressions.g:7248:1: ( ',' )
            {
            // InternalKExpressions.g:7248:1: ( ',' )
            // InternalKExpressions.g:7249:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl"


    // $ANTLR start "rule__RestrictedKeyStringValueAnnotation__Group_3__1"
    // InternalKExpressions.g:7262:1: rule__RestrictedKeyStringValueAnnotation__Group_3__1 : rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7266:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl )
            // InternalKExpressions.g:7267:2: rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl();

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
    // $ANTLR end "rule__RestrictedKeyStringValueAnnotation__Group_3__1"


    // $ANTLR start "rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl"
    // InternalKExpressions.g:7273:1: rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7277:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalKExpressions.g:7278:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalKExpressions.g:7278:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalKExpressions.g:7279:1: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            }
            // InternalKExpressions.g:7280:1: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalKExpressions.g:7280:2: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl"


    // $ANTLR start "rule__StringPragma__Group__0"
    // InternalKExpressions.g:7294:1: rule__StringPragma__Group__0 : rule__StringPragma__Group__0__Impl rule__StringPragma__Group__1 ;
    public final void rule__StringPragma__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7298:1: ( rule__StringPragma__Group__0__Impl rule__StringPragma__Group__1 )
            // InternalKExpressions.g:7299:2: rule__StringPragma__Group__0__Impl rule__StringPragma__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__StringPragma__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringPragma__Group__1();

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
    // $ANTLR end "rule__StringPragma__Group__0"


    // $ANTLR start "rule__StringPragma__Group__0__Impl"
    // InternalKExpressions.g:7306:1: rule__StringPragma__Group__0__Impl : ( '#' ) ;
    public final void rule__StringPragma__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7310:1: ( ( '#' ) )
            // InternalKExpressions.g:7311:1: ( '#' )
            {
            // InternalKExpressions.g:7311:1: ( '#' )
            // InternalKExpressions.g:7312:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPragmaAccess().getNumberSignKeyword_0()); 
            }
            match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringPragmaAccess().getNumberSignKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringPragma__Group__0__Impl"


    // $ANTLR start "rule__StringPragma__Group__1"
    // InternalKExpressions.g:7325:1: rule__StringPragma__Group__1 : rule__StringPragma__Group__1__Impl rule__StringPragma__Group__2 ;
    public final void rule__StringPragma__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7329:1: ( rule__StringPragma__Group__1__Impl rule__StringPragma__Group__2 )
            // InternalKExpressions.g:7330:2: rule__StringPragma__Group__1__Impl rule__StringPragma__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_44);
            rule__StringPragma__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringPragma__Group__2();

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
    // $ANTLR end "rule__StringPragma__Group__1"


    // $ANTLR start "rule__StringPragma__Group__1__Impl"
    // InternalKExpressions.g:7337:1: rule__StringPragma__Group__1__Impl : ( ( rule__StringPragma__NameAssignment_1 ) ) ;
    public final void rule__StringPragma__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7341:1: ( ( ( rule__StringPragma__NameAssignment_1 ) ) )
            // InternalKExpressions.g:7342:1: ( ( rule__StringPragma__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:7342:1: ( ( rule__StringPragma__NameAssignment_1 ) )
            // InternalKExpressions.g:7343:1: ( rule__StringPragma__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPragmaAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:7344:1: ( rule__StringPragma__NameAssignment_1 )
            // InternalKExpressions.g:7344:2: rule__StringPragma__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringPragma__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringPragmaAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringPragma__Group__1__Impl"


    // $ANTLR start "rule__StringPragma__Group__2"
    // InternalKExpressions.g:7354:1: rule__StringPragma__Group__2 : rule__StringPragma__Group__2__Impl rule__StringPragma__Group__3 ;
    public final void rule__StringPragma__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7358:1: ( rule__StringPragma__Group__2__Impl rule__StringPragma__Group__3 )
            // InternalKExpressions.g:7359:2: rule__StringPragma__Group__2__Impl rule__StringPragma__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_45);
            rule__StringPragma__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringPragma__Group__3();

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
    // $ANTLR end "rule__StringPragma__Group__2"


    // $ANTLR start "rule__StringPragma__Group__2__Impl"
    // InternalKExpressions.g:7366:1: rule__StringPragma__Group__2__Impl : ( ( rule__StringPragma__ValuesAssignment_2 ) ) ;
    public final void rule__StringPragma__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7370:1: ( ( ( rule__StringPragma__ValuesAssignment_2 ) ) )
            // InternalKExpressions.g:7371:1: ( ( rule__StringPragma__ValuesAssignment_2 ) )
            {
            // InternalKExpressions.g:7371:1: ( ( rule__StringPragma__ValuesAssignment_2 ) )
            // InternalKExpressions.g:7372:1: ( rule__StringPragma__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPragmaAccess().getValuesAssignment_2()); 
            }
            // InternalKExpressions.g:7373:1: ( rule__StringPragma__ValuesAssignment_2 )
            // InternalKExpressions.g:7373:2: rule__StringPragma__ValuesAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringPragma__ValuesAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringPragmaAccess().getValuesAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringPragma__Group__2__Impl"


    // $ANTLR start "rule__StringPragma__Group__3"
    // InternalKExpressions.g:7383:1: rule__StringPragma__Group__3 : rule__StringPragma__Group__3__Impl ;
    public final void rule__StringPragma__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7387:1: ( rule__StringPragma__Group__3__Impl )
            // InternalKExpressions.g:7388:2: rule__StringPragma__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringPragma__Group__3__Impl();

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
    // $ANTLR end "rule__StringPragma__Group__3"


    // $ANTLR start "rule__StringPragma__Group__3__Impl"
    // InternalKExpressions.g:7394:1: rule__StringPragma__Group__3__Impl : ( ( rule__StringPragma__Group_3__0 )* ) ;
    public final void rule__StringPragma__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7398:1: ( ( ( rule__StringPragma__Group_3__0 )* ) )
            // InternalKExpressions.g:7399:1: ( ( rule__StringPragma__Group_3__0 )* )
            {
            // InternalKExpressions.g:7399:1: ( ( rule__StringPragma__Group_3__0 )* )
            // InternalKExpressions.g:7400:1: ( rule__StringPragma__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPragmaAccess().getGroup_3()); 
            }
            // InternalKExpressions.g:7401:1: ( rule__StringPragma__Group_3__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==43) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalKExpressions.g:7401:2: rule__StringPragma__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_41);
            	    rule__StringPragma__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringPragmaAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringPragma__Group__3__Impl"


    // $ANTLR start "rule__StringPragma__Group_3__0"
    // InternalKExpressions.g:7419:1: rule__StringPragma__Group_3__0 : rule__StringPragma__Group_3__0__Impl rule__StringPragma__Group_3__1 ;
    public final void rule__StringPragma__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7423:1: ( rule__StringPragma__Group_3__0__Impl rule__StringPragma__Group_3__1 )
            // InternalKExpressions.g:7424:2: rule__StringPragma__Group_3__0__Impl rule__StringPragma__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_44);
            rule__StringPragma__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringPragma__Group_3__1();

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
    // $ANTLR end "rule__StringPragma__Group_3__0"


    // $ANTLR start "rule__StringPragma__Group_3__0__Impl"
    // InternalKExpressions.g:7431:1: rule__StringPragma__Group_3__0__Impl : ( ',' ) ;
    public final void rule__StringPragma__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7435:1: ( ( ',' ) )
            // InternalKExpressions.g:7436:1: ( ',' )
            {
            // InternalKExpressions.g:7436:1: ( ',' )
            // InternalKExpressions.g:7437:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPragmaAccess().getCommaKeyword_3_0()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringPragmaAccess().getCommaKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringPragma__Group_3__0__Impl"


    // $ANTLR start "rule__StringPragma__Group_3__1"
    // InternalKExpressions.g:7450:1: rule__StringPragma__Group_3__1 : rule__StringPragma__Group_3__1__Impl ;
    public final void rule__StringPragma__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7454:1: ( rule__StringPragma__Group_3__1__Impl )
            // InternalKExpressions.g:7455:2: rule__StringPragma__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringPragma__Group_3__1__Impl();

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
    // $ANTLR end "rule__StringPragma__Group_3__1"


    // $ANTLR start "rule__StringPragma__Group_3__1__Impl"
    // InternalKExpressions.g:7461:1: rule__StringPragma__Group_3__1__Impl : ( ( rule__StringPragma__ValuesAssignment_3_1 ) ) ;
    public final void rule__StringPragma__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7465:1: ( ( ( rule__StringPragma__ValuesAssignment_3_1 ) ) )
            // InternalKExpressions.g:7466:1: ( ( rule__StringPragma__ValuesAssignment_3_1 ) )
            {
            // InternalKExpressions.g:7466:1: ( ( rule__StringPragma__ValuesAssignment_3_1 ) )
            // InternalKExpressions.g:7467:1: ( rule__StringPragma__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPragmaAccess().getValuesAssignment_3_1()); 
            }
            // InternalKExpressions.g:7468:1: ( rule__StringPragma__ValuesAssignment_3_1 )
            // InternalKExpressions.g:7468:2: rule__StringPragma__ValuesAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringPragma__ValuesAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringPragmaAccess().getValuesAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringPragma__Group_3__1__Impl"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group__0"
    // InternalKExpressions.g:7482:1: rule__TypedKeyStringValueAnnotation__Group__0 : rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7486:1: ( rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 )
            // InternalKExpressions.g:7487:2: rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
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
    // InternalKExpressions.g:7494:1: rule__TypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7498:1: ( ( '@' ) )
            // InternalKExpressions.g:7499:1: ( '@' )
            {
            // InternalKExpressions.g:7499:1: ( '@' )
            // InternalKExpressions.g:7500:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:7513:1: rule__TypedKeyStringValueAnnotation__Group__1 : rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7517:1: ( rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 )
            // InternalKExpressions.g:7518:2: rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_47);
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
    // InternalKExpressions.g:7525:1: rule__TypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7529:1: ( ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKExpressions.g:7530:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:7530:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKExpressions.g:7531:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:7532:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKExpressions.g:7532:2: rule__TypedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKExpressions.g:7542:1: rule__TypedKeyStringValueAnnotation__Group__2 : rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7546:1: ( rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 )
            // InternalKExpressions.g:7547:2: rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_4);
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
    // InternalKExpressions.g:7554:1: rule__TypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7558:1: ( ( '[' ) )
            // InternalKExpressions.g:7559:1: ( '[' )
            {
            // InternalKExpressions.g:7559:1: ( '[' )
            // InternalKExpressions.g:7560:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:7573:1: rule__TypedKeyStringValueAnnotation__Group__3 : rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7577:1: ( rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 )
            // InternalKExpressions.g:7578:2: rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_36);
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
    // InternalKExpressions.g:7585:1: rule__TypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7589:1: ( ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalKExpressions.g:7590:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalKExpressions.g:7590:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalKExpressions.g:7591:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // InternalKExpressions.g:7592:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalKExpressions.g:7592:2: rule__TypedKeyStringValueAnnotation__TypeAssignment_3
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
    // InternalKExpressions.g:7602:1: rule__TypedKeyStringValueAnnotation__Group__4 : rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7606:1: ( rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 )
            // InternalKExpressions.g:7607:2: rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_44);
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
    // InternalKExpressions.g:7614:1: rule__TypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7618:1: ( ( ']' ) )
            // InternalKExpressions.g:7619:1: ( ']' )
            {
            // InternalKExpressions.g:7619:1: ( ']' )
            // InternalKExpressions.g:7620:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:7633:1: rule__TypedKeyStringValueAnnotation__Group__5 : rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7637:1: ( rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 )
            // InternalKExpressions.g:7638:2: rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_45);
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
    // InternalKExpressions.g:7645:1: rule__TypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7649:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalKExpressions.g:7650:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalKExpressions.g:7650:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalKExpressions.g:7651:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            }
            // InternalKExpressions.g:7652:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalKExpressions.g:7652:2: rule__TypedKeyStringValueAnnotation__ValuesAssignment_5
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
    // InternalKExpressions.g:7662:1: rule__TypedKeyStringValueAnnotation__Group__6 : rule__TypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7666:1: ( rule__TypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalKExpressions.g:7667:2: rule__TypedKeyStringValueAnnotation__Group__6__Impl
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
    // InternalKExpressions.g:7673:1: rule__TypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7677:1: ( ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalKExpressions.g:7678:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalKExpressions.g:7678:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalKExpressions.g:7679:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // InternalKExpressions.g:7680:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==43) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalKExpressions.g:7680:2: rule__TypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_41);
            	    rule__TypedKeyStringValueAnnotation__Group_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop49;
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
    // InternalKExpressions.g:7704:1: rule__TypedKeyStringValueAnnotation__Group_6__0 : rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7708:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 )
            // InternalKExpressions.g:7709:2: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_44);
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
    // InternalKExpressions.g:7716:1: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7720:1: ( ( ',' ) )
            // InternalKExpressions.g:7721:1: ( ',' )
            {
            // InternalKExpressions.g:7721:1: ( ',' )
            // InternalKExpressions.g:7722:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:7735:1: rule__TypedKeyStringValueAnnotation__Group_6__1 : rule__TypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7739:1: ( rule__TypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalKExpressions.g:7740:2: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl
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
    // InternalKExpressions.g:7746:1: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7750:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalKExpressions.g:7751:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalKExpressions.g:7751:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalKExpressions.g:7752:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            }
            // InternalKExpressions.g:7753:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalKExpressions.g:7753:2: rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1
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


    // $ANTLR start "rule__RestrictedTypedKeyStringValueAnnotation__Group__0"
    // InternalKExpressions.g:7767:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__0 : rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7771:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__1 )
            // InternalKExpressions.g:7772:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__1();

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
    // $ANTLR end "rule__RestrictedTypedKeyStringValueAnnotation__Group__0"


    // $ANTLR start "rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl"
    // InternalKExpressions.g:7779:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7783:1: ( ( '@' ) )
            // InternalKExpressions.g:7784:1: ( '@' )
            {
            // InternalKExpressions.g:7784:1: ( '@' )
            // InternalKExpressions.g:7785:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl"


    // $ANTLR start "rule__RestrictedTypedKeyStringValueAnnotation__Group__1"
    // InternalKExpressions.g:7798:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__1 : rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7802:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__2 )
            // InternalKExpressions.g:7803:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_47);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__2();

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
    // $ANTLR end "rule__RestrictedTypedKeyStringValueAnnotation__Group__1"


    // $ANTLR start "rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl"
    // InternalKExpressions.g:7810:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7814:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKExpressions.g:7815:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:7815:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKExpressions.g:7816:1: ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:7817:1: ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKExpressions.g:7817:2: rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl"


    // $ANTLR start "rule__RestrictedTypedKeyStringValueAnnotation__Group__2"
    // InternalKExpressions.g:7827:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__2 : rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7831:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__3 )
            // InternalKExpressions.g:7832:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__3();

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
    // $ANTLR end "rule__RestrictedTypedKeyStringValueAnnotation__Group__2"


    // $ANTLR start "rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl"
    // InternalKExpressions.g:7839:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7843:1: ( ( '[' ) )
            // InternalKExpressions.g:7844:1: ( '[' )
            {
            // InternalKExpressions.g:7844:1: ( '[' )
            // InternalKExpressions.g:7845:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl"


    // $ANTLR start "rule__RestrictedTypedKeyStringValueAnnotation__Group__3"
    // InternalKExpressions.g:7858:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__3 : rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7862:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__4 )
            // InternalKExpressions.g:7863:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_36);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__4();

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
    // $ANTLR end "rule__RestrictedTypedKeyStringValueAnnotation__Group__3"


    // $ANTLR start "rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl"
    // InternalKExpressions.g:7870:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7874:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalKExpressions.g:7875:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalKExpressions.g:7875:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalKExpressions.g:7876:1: ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // InternalKExpressions.g:7877:1: ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalKExpressions.g:7877:2: rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl"


    // $ANTLR start "rule__RestrictedTypedKeyStringValueAnnotation__Group__4"
    // InternalKExpressions.g:7887:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__4 : rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7891:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__5 )
            // InternalKExpressions.g:7892:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_46);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__5();

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
    // $ANTLR end "rule__RestrictedTypedKeyStringValueAnnotation__Group__4"


    // $ANTLR start "rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl"
    // InternalKExpressions.g:7899:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7903:1: ( ( ']' ) )
            // InternalKExpressions.g:7904:1: ( ']' )
            {
            // InternalKExpressions.g:7904:1: ( ']' )
            // InternalKExpressions.g:7905:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl"


    // $ANTLR start "rule__RestrictedTypedKeyStringValueAnnotation__Group__5"
    // InternalKExpressions.g:7918:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__5 : rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7922:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__6 )
            // InternalKExpressions.g:7923:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_45);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__6();

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
    // $ANTLR end "rule__RestrictedTypedKeyStringValueAnnotation__Group__5"


    // $ANTLR start "rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl"
    // InternalKExpressions.g:7930:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7934:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalKExpressions.g:7935:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalKExpressions.g:7935:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalKExpressions.g:7936:1: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            }
            // InternalKExpressions.g:7937:1: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalKExpressions.g:7937:2: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl"


    // $ANTLR start "rule__RestrictedTypedKeyStringValueAnnotation__Group__6"
    // InternalKExpressions.g:7947:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__6 : rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7951:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalKExpressions.g:7952:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl();

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
    // $ANTLR end "rule__RestrictedTypedKeyStringValueAnnotation__Group__6"


    // $ANTLR start "rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl"
    // InternalKExpressions.g:7958:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7962:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalKExpressions.g:7963:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalKExpressions.g:7963:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalKExpressions.g:7964:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // InternalKExpressions.g:7965:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==43) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalKExpressions.g:7965:2: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_41);
            	    rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl"


    // $ANTLR start "rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0"
    // InternalKExpressions.g:7989:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 : rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7993:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1 )
            // InternalKExpressions.g:7994:2: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_46);
            rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1();

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
    // $ANTLR end "rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0"


    // $ANTLR start "rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl"
    // InternalKExpressions.g:8001:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8005:1: ( ( ',' ) )
            // InternalKExpressions.g:8006:1: ( ',' )
            {
            // InternalKExpressions.g:8006:1: ( ',' )
            // InternalKExpressions.g:8007:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl"


    // $ANTLR start "rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1"
    // InternalKExpressions.g:8020:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1 : rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8024:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalKExpressions.g:8025:2: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl();

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
    // $ANTLR end "rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1"


    // $ANTLR start "rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl"
    // InternalKExpressions.g:8031:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8035:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalKExpressions.g:8036:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalKExpressions.g:8036:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalKExpressions.g:8037:1: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            }
            // InternalKExpressions.g:8038:1: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalKExpressions.g:8038:2: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl"


    // $ANTLR start "rule__QuotedKeyStringValueAnnotation__Group__0"
    // InternalKExpressions.g:8052:1: rule__QuotedKeyStringValueAnnotation__Group__0 : rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8056:1: ( rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1 )
            // InternalKExpressions.g:8057:2: rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
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
    // InternalKExpressions.g:8064:1: rule__QuotedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8068:1: ( ( '@' ) )
            // InternalKExpressions.g:8069:1: ( '@' )
            {
            // InternalKExpressions.g:8069:1: ( '@' )
            // InternalKExpressions.g:8070:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:8083:1: rule__QuotedKeyStringValueAnnotation__Group__1 : rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8087:1: ( rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2 )
            // InternalKExpressions.g:8088:2: rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_48);
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
    // InternalKExpressions.g:8095:1: rule__QuotedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8099:1: ( ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKExpressions.g:8100:1: ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:8100:1: ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKExpressions.g:8101:1: ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:8102:1: ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKExpressions.g:8102:2: rule__QuotedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKExpressions.g:8112:1: rule__QuotedKeyStringValueAnnotation__Group__2 : rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8116:1: ( rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3 )
            // InternalKExpressions.g:8117:2: rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_45);
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
    // InternalKExpressions.g:8124:1: rule__QuotedKeyStringValueAnnotation__Group__2__Impl : ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8128:1: ( ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalKExpressions.g:8129:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalKExpressions.g:8129:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalKExpressions.g:8130:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            }
            // InternalKExpressions.g:8131:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalKExpressions.g:8131:2: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2
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
    // InternalKExpressions.g:8141:1: rule__QuotedKeyStringValueAnnotation__Group__3 : rule__QuotedKeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8145:1: ( rule__QuotedKeyStringValueAnnotation__Group__3__Impl )
            // InternalKExpressions.g:8146:2: rule__QuotedKeyStringValueAnnotation__Group__3__Impl
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
    // InternalKExpressions.g:8152:1: rule__QuotedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8156:1: ( ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalKExpressions.g:8157:1: ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalKExpressions.g:8157:1: ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* )
            // InternalKExpressions.g:8158:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // InternalKExpressions.g:8159:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==43) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalKExpressions.g:8159:2: rule__QuotedKeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_41);
            	    rule__QuotedKeyStringValueAnnotation__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop51;
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
    // InternalKExpressions.g:8177:1: rule__QuotedKeyStringValueAnnotation__Group_3__0 : rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8181:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1 )
            // InternalKExpressions.g:8182:2: rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_48);
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
    // InternalKExpressions.g:8189:1: rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8193:1: ( ( ',' ) )
            // InternalKExpressions.g:8194:1: ( ',' )
            {
            // InternalKExpressions.g:8194:1: ( ',' )
            // InternalKExpressions.g:8195:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:8208:1: rule__QuotedKeyStringValueAnnotation__Group_3__1 : rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8212:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl )
            // InternalKExpressions.g:8213:2: rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl
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
    // InternalKExpressions.g:8219:1: rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8223:1: ( ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalKExpressions.g:8224:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalKExpressions.g:8224:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalKExpressions.g:8225:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            }
            // InternalKExpressions.g:8226:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalKExpressions.g:8226:2: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1
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
    // InternalKExpressions.g:8240:1: rule__QuotedTypedKeyStringValueAnnotation__Group__0 : rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8244:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1 )
            // InternalKExpressions.g:8245:2: rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
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
    // InternalKExpressions.g:8252:1: rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8256:1: ( ( '@' ) )
            // InternalKExpressions.g:8257:1: ( '@' )
            {
            // InternalKExpressions.g:8257:1: ( '@' )
            // InternalKExpressions.g:8258:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:8271:1: rule__QuotedTypedKeyStringValueAnnotation__Group__1 : rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8275:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2 )
            // InternalKExpressions.g:8276:2: rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_47);
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
    // InternalKExpressions.g:8283:1: rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8287:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKExpressions.g:8288:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:8288:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKExpressions.g:8289:1: ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:8290:1: ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKExpressions.g:8290:2: rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKExpressions.g:8300:1: rule__QuotedTypedKeyStringValueAnnotation__Group__2 : rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8304:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3 )
            // InternalKExpressions.g:8305:2: rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_4);
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
    // InternalKExpressions.g:8312:1: rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8316:1: ( ( '[' ) )
            // InternalKExpressions.g:8317:1: ( '[' )
            {
            // InternalKExpressions.g:8317:1: ( '[' )
            // InternalKExpressions.g:8318:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:8331:1: rule__QuotedTypedKeyStringValueAnnotation__Group__3 : rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8335:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4 )
            // InternalKExpressions.g:8336:2: rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_36);
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
    // InternalKExpressions.g:8343:1: rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8347:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalKExpressions.g:8348:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalKExpressions.g:8348:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalKExpressions.g:8349:1: ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // InternalKExpressions.g:8350:1: ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalKExpressions.g:8350:2: rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3
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
    // InternalKExpressions.g:8360:1: rule__QuotedTypedKeyStringValueAnnotation__Group__4 : rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8364:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5 )
            // InternalKExpressions.g:8365:2: rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_48);
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
    // InternalKExpressions.g:8372:1: rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8376:1: ( ( ']' ) )
            // InternalKExpressions.g:8377:1: ( ']' )
            {
            // InternalKExpressions.g:8377:1: ( ']' )
            // InternalKExpressions.g:8378:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:8391:1: rule__QuotedTypedKeyStringValueAnnotation__Group__5 : rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8395:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6 )
            // InternalKExpressions.g:8396:2: rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_45);
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
    // InternalKExpressions.g:8403:1: rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8407:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalKExpressions.g:8408:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalKExpressions.g:8408:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalKExpressions.g:8409:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            }
            // InternalKExpressions.g:8410:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalKExpressions.g:8410:2: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5
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
    // InternalKExpressions.g:8420:1: rule__QuotedTypedKeyStringValueAnnotation__Group__6 : rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8424:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalKExpressions.g:8425:2: rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl
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
    // InternalKExpressions.g:8431:1: rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8435:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalKExpressions.g:8436:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalKExpressions.g:8436:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalKExpressions.g:8437:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // InternalKExpressions.g:8438:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==43) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalKExpressions.g:8438:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_41);
            	    rule__QuotedTypedKeyStringValueAnnotation__Group_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop52;
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
    // InternalKExpressions.g:8462:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 : rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8466:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 )
            // InternalKExpressions.g:8467:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_48);
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
    // InternalKExpressions.g:8474:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8478:1: ( ( ',' ) )
            // InternalKExpressions.g:8479:1: ( ',' )
            {
            // InternalKExpressions.g:8479:1: ( ',' )
            // InternalKExpressions.g:8480:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:8493:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 : rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8497:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalKExpressions.g:8498:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl
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
    // InternalKExpressions.g:8504:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8508:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalKExpressions.g:8509:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalKExpressions.g:8509:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalKExpressions.g:8510:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            }
            // InternalKExpressions.g:8511:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalKExpressions.g:8511:2: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1
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


    // $ANTLR start "rule__ExtendedID__Group__0"
    // InternalKExpressions.g:8525:1: rule__ExtendedID__Group__0 : rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 ;
    public final void rule__ExtendedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8529:1: ( rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 )
            // InternalKExpressions.g:8530:2: rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_49);
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
    // InternalKExpressions.g:8537:1: rule__ExtendedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8541:1: ( ( RULE_ID ) )
            // InternalKExpressions.g:8542:1: ( RULE_ID )
            {
            // InternalKExpressions.g:8542:1: ( RULE_ID )
            // InternalKExpressions.g:8543:1: RULE_ID
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
    // InternalKExpressions.g:8554:1: rule__ExtendedID__Group__1 : rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2 ;
    public final void rule__ExtendedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8558:1: ( rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2 )
            // InternalKExpressions.g:8559:2: rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_49);
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
    // InternalKExpressions.g:8566:1: rule__ExtendedID__Group__1__Impl : ( ( rule__ExtendedID__Alternatives_1 )* ) ;
    public final void rule__ExtendedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8570:1: ( ( ( rule__ExtendedID__Alternatives_1 )* ) )
            // InternalKExpressions.g:8571:1: ( ( rule__ExtendedID__Alternatives_1 )* )
            {
            // InternalKExpressions.g:8571:1: ( ( rule__ExtendedID__Alternatives_1 )* )
            // InternalKExpressions.g:8572:1: ( rule__ExtendedID__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getAlternatives_1()); 
            }
            // InternalKExpressions.g:8573:1: ( rule__ExtendedID__Alternatives_1 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==22) ) {
                    int LA53_2 = input.LA(2);

                    if ( (LA53_2==RULE_ID) ) {
                        alt53=1;
                    }


                }
                else if ( (LA53_0==30) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalKExpressions.g:8573:2: rule__ExtendedID__Alternatives_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_50);
            	    rule__ExtendedID__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendedIDAccess().getAlternatives_1()); 
            }

            }


            }

        }
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
    // InternalKExpressions.g:8583:1: rule__ExtendedID__Group__2 : rule__ExtendedID__Group__2__Impl ;
    public final void rule__ExtendedID__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8587:1: ( rule__ExtendedID__Group__2__Impl )
            // InternalKExpressions.g:8588:2: rule__ExtendedID__Group__2__Impl
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
    // InternalKExpressions.g:8594:1: rule__ExtendedID__Group__2__Impl : ( ( rule__ExtendedID__Group_2__0 )? ) ;
    public final void rule__ExtendedID__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8598:1: ( ( ( rule__ExtendedID__Group_2__0 )? ) )
            // InternalKExpressions.g:8599:1: ( ( rule__ExtendedID__Group_2__0 )? )
            {
            // InternalKExpressions.g:8599:1: ( ( rule__ExtendedID__Group_2__0 )? )
            // InternalKExpressions.g:8600:1: ( rule__ExtendedID__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup_2()); 
            }
            // InternalKExpressions.g:8601:1: ( rule__ExtendedID__Group_2__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==46) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalKExpressions.g:8601:2: rule__ExtendedID__Group_2__0
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


    // $ANTLR start "rule__ExtendedID__Group_1_1__0"
    // InternalKExpressions.g:8617:1: rule__ExtendedID__Group_1_1__0 : rule__ExtendedID__Group_1_1__0__Impl rule__ExtendedID__Group_1_1__1 ;
    public final void rule__ExtendedID__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8621:1: ( rule__ExtendedID__Group_1_1__0__Impl rule__ExtendedID__Group_1_1__1 )
            // InternalKExpressions.g:8622:2: rule__ExtendedID__Group_1_1__0__Impl rule__ExtendedID__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__ExtendedID__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExtendedID__Group_1_1__1();

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
    // $ANTLR end "rule__ExtendedID__Group_1_1__0"


    // $ANTLR start "rule__ExtendedID__Group_1_1__0__Impl"
    // InternalKExpressions.g:8629:1: rule__ExtendedID__Group_1_1__0__Impl : ( '-' ) ;
    public final void rule__ExtendedID__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8633:1: ( ( '-' ) )
            // InternalKExpressions.g:8634:1: ( '-' )
            {
            // InternalKExpressions.g:8634:1: ( '-' )
            // InternalKExpressions.g:8635:1: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getHyphenMinusKeyword_1_1_0()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendedIDAccess().getHyphenMinusKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedID__Group_1_1__0__Impl"


    // $ANTLR start "rule__ExtendedID__Group_1_1__1"
    // InternalKExpressions.g:8648:1: rule__ExtendedID__Group_1_1__1 : rule__ExtendedID__Group_1_1__1__Impl ;
    public final void rule__ExtendedID__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8652:1: ( rule__ExtendedID__Group_1_1__1__Impl )
            // InternalKExpressions.g:8653:2: rule__ExtendedID__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExtendedID__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__ExtendedID__Group_1_1__1"


    // $ANTLR start "rule__ExtendedID__Group_1_1__1__Impl"
    // InternalKExpressions.g:8659:1: rule__ExtendedID__Group_1_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8663:1: ( ( RULE_ID ) )
            // InternalKExpressions.g:8664:1: ( RULE_ID )
            {
            // InternalKExpressions.g:8664:1: ( RULE_ID )
            // InternalKExpressions.g:8665:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedID__Group_1_1__1__Impl"


    // $ANTLR start "rule__ExtendedID__Group_2__0"
    // InternalKExpressions.g:8680:1: rule__ExtendedID__Group_2__0 : rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1 ;
    public final void rule__ExtendedID__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8684:1: ( rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1 )
            // InternalKExpressions.g:8685:2: rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_37);
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
    // InternalKExpressions.g:8692:1: rule__ExtendedID__Group_2__0__Impl : ( '#' ) ;
    public final void rule__ExtendedID__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8696:1: ( ( '#' ) )
            // InternalKExpressions.g:8697:1: ( '#' )
            {
            // InternalKExpressions.g:8697:1: ( '#' )
            // InternalKExpressions.g:8698:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getNumberSignKeyword_2_0()); 
            }
            match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:8711:1: rule__ExtendedID__Group_2__1 : rule__ExtendedID__Group_2__1__Impl ;
    public final void rule__ExtendedID__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8715:1: ( rule__ExtendedID__Group_2__1__Impl )
            // InternalKExpressions.g:8716:2: rule__ExtendedID__Group_2__1__Impl
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
    // InternalKExpressions.g:8722:1: rule__ExtendedID__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__ExtendedID__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8726:1: ( ( RULE_INT ) )
            // InternalKExpressions.g:8727:1: ( RULE_INT )
            {
            // InternalKExpressions.g:8727:1: ( RULE_INT )
            // InternalKExpressions.g:8728:1: RULE_INT
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
    // InternalKExpressions.g:8745:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8749:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // InternalKExpressions.g:8750:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_51);
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
    // InternalKExpressions.g:8757:1: rule__Integer__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8761:1: ( ( ( '-' )? ) )
            // InternalKExpressions.g:8762:1: ( ( '-' )? )
            {
            // InternalKExpressions.g:8762:1: ( ( '-' )? )
            // InternalKExpressions.g:8763:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalKExpressions.g:8764:1: ( '-' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==22) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalKExpressions.g:8765:2: '-'
                    {
                    match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalKExpressions.g:8776:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8780:1: ( rule__Integer__Group__1__Impl )
            // InternalKExpressions.g:8781:2: rule__Integer__Group__1__Impl
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
    // InternalKExpressions.g:8787:1: rule__Integer__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8791:1: ( ( RULE_INT ) )
            // InternalKExpressions.g:8792:1: ( RULE_INT )
            {
            // InternalKExpressions.g:8792:1: ( RULE_INT )
            // InternalKExpressions.g:8793:1: RULE_INT
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
    // InternalKExpressions.g:8808:1: rule__Floateger__Group__0 : rule__Floateger__Group__0__Impl rule__Floateger__Group__1 ;
    public final void rule__Floateger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8812:1: ( rule__Floateger__Group__0__Impl rule__Floateger__Group__1 )
            // InternalKExpressions.g:8813:2: rule__Floateger__Group__0__Impl rule__Floateger__Group__1
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
    // InternalKExpressions.g:8820:1: rule__Floateger__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Floateger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8824:1: ( ( ( '-' )? ) )
            // InternalKExpressions.g:8825:1: ( ( '-' )? )
            {
            // InternalKExpressions.g:8825:1: ( ( '-' )? )
            // InternalKExpressions.g:8826:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloategerAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalKExpressions.g:8827:1: ( '-' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==22) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalKExpressions.g:8828:2: '-'
                    {
                    match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalKExpressions.g:8839:1: rule__Floateger__Group__1 : rule__Floateger__Group__1__Impl ;
    public final void rule__Floateger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8843:1: ( rule__Floateger__Group__1__Impl )
            // InternalKExpressions.g:8844:2: rule__Floateger__Group__1__Impl
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
    // InternalKExpressions.g:8850:1: rule__Floateger__Group__1__Impl : ( RULE_FLOAT ) ;
    public final void rule__Floateger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8854:1: ( ( RULE_FLOAT ) )
            // InternalKExpressions.g:8855:1: ( RULE_FLOAT )
            {
            // InternalKExpressions.g:8855:1: ( RULE_FLOAT )
            // InternalKExpressions.g:8856:1: RULE_FLOAT
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


    // $ANTLR start "rule__Expression__ScheduleAssignment_1_1"
    // InternalKExpressions.g:8872:1: rule__Expression__ScheduleAssignment_1_1 : ( ruleScheduleObjectReference ) ;
    public final void rule__Expression__ScheduleAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8876:1: ( ( ruleScheduleObjectReference ) )
            // InternalKExpressions.g:8877:1: ( ruleScheduleObjectReference )
            {
            // InternalKExpressions.g:8877:1: ( ruleScheduleObjectReference )
            // InternalKExpressions.g:8878:1: ruleScheduleObjectReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getScheduleScheduleObjectReferenceParserRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleScheduleObjectReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getScheduleScheduleObjectReferenceParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__ScheduleAssignment_1_1"


    // $ANTLR start "rule__LogicalOrExpression__OperatorAssignment_1_1_0"
    // InternalKExpressions.g:8887:1: rule__LogicalOrExpression__OperatorAssignment_1_1_0 : ( ruleLogicalOrOperator ) ;
    public final void rule__LogicalOrExpression__OperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8891:1: ( ( ruleLogicalOrOperator ) )
            // InternalKExpressions.g:8892:1: ( ruleLogicalOrOperator )
            {
            // InternalKExpressions.g:8892:1: ( ruleLogicalOrOperator )
            // InternalKExpressions.g:8893:1: ruleLogicalOrOperator
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
    // InternalKExpressions.g:8902:1: rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1 : ( ruleLogicalAndExpression ) ;
    public final void rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8906:1: ( ( ruleLogicalAndExpression ) )
            // InternalKExpressions.g:8907:1: ( ruleLogicalAndExpression )
            {
            // InternalKExpressions.g:8907:1: ( ruleLogicalAndExpression )
            // InternalKExpressions.g:8908:1: ruleLogicalAndExpression
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
    // InternalKExpressions.g:8917:1: rule__LogicalOrExpression__SubExpressionsAssignment_1_2_1 : ( ruleLogicalAndExpression ) ;
    public final void rule__LogicalOrExpression__SubExpressionsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8921:1: ( ( ruleLogicalAndExpression ) )
            // InternalKExpressions.g:8922:1: ( ruleLogicalAndExpression )
            {
            // InternalKExpressions.g:8922:1: ( ruleLogicalAndExpression )
            // InternalKExpressions.g:8923:1: ruleLogicalAndExpression
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
    // InternalKExpressions.g:8932:1: rule__LogicalAndExpression__OperatorAssignment_1_1_0 : ( ruleLogicalAndOperator ) ;
    public final void rule__LogicalAndExpression__OperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8936:1: ( ( ruleLogicalAndOperator ) )
            // InternalKExpressions.g:8937:1: ( ruleLogicalAndOperator )
            {
            // InternalKExpressions.g:8937:1: ( ruleLogicalAndOperator )
            // InternalKExpressions.g:8938:1: ruleLogicalAndOperator
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
    // InternalKExpressions.g:8947:1: rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1 : ( ruleBitwiseOrExpression ) ;
    public final void rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8951:1: ( ( ruleBitwiseOrExpression ) )
            // InternalKExpressions.g:8952:1: ( ruleBitwiseOrExpression )
            {
            // InternalKExpressions.g:8952:1: ( ruleBitwiseOrExpression )
            // InternalKExpressions.g:8953:1: ruleBitwiseOrExpression
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
    // InternalKExpressions.g:8962:1: rule__LogicalAndExpression__SubExpressionsAssignment_1_2_1 : ( ruleBitwiseOrExpression ) ;
    public final void rule__LogicalAndExpression__SubExpressionsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8966:1: ( ( ruleBitwiseOrExpression ) )
            // InternalKExpressions.g:8967:1: ( ruleBitwiseOrExpression )
            {
            // InternalKExpressions.g:8967:1: ( ruleBitwiseOrExpression )
            // InternalKExpressions.g:8968:1: ruleBitwiseOrExpression
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
    // InternalKExpressions.g:8977:1: rule__BitwiseOrExpression__OperatorAssignment_1_1_0 : ( ruleBitwiseOrOperator ) ;
    public final void rule__BitwiseOrExpression__OperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8981:1: ( ( ruleBitwiseOrOperator ) )
            // InternalKExpressions.g:8982:1: ( ruleBitwiseOrOperator )
            {
            // InternalKExpressions.g:8982:1: ( ruleBitwiseOrOperator )
            // InternalKExpressions.g:8983:1: ruleBitwiseOrOperator
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
    // InternalKExpressions.g:8992:1: rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1 : ( ruleBitwiseAndExpression ) ;
    public final void rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8996:1: ( ( ruleBitwiseAndExpression ) )
            // InternalKExpressions.g:8997:1: ( ruleBitwiseAndExpression )
            {
            // InternalKExpressions.g:8997:1: ( ruleBitwiseAndExpression )
            // InternalKExpressions.g:8998:1: ruleBitwiseAndExpression
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
    // InternalKExpressions.g:9007:1: rule__BitwiseOrExpression__SubExpressionsAssignment_1_2_1 : ( ruleBitwiseAndExpression ) ;
    public final void rule__BitwiseOrExpression__SubExpressionsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9011:1: ( ( ruleBitwiseAndExpression ) )
            // InternalKExpressions.g:9012:1: ( ruleBitwiseAndExpression )
            {
            // InternalKExpressions.g:9012:1: ( ruleBitwiseAndExpression )
            // InternalKExpressions.g:9013:1: ruleBitwiseAndExpression
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
    // InternalKExpressions.g:9022:1: rule__BitwiseAndExpression__OperatorAssignment_1_1_0 : ( ruleBitwiseAndOperator ) ;
    public final void rule__BitwiseAndExpression__OperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9026:1: ( ( ruleBitwiseAndOperator ) )
            // InternalKExpressions.g:9027:1: ( ruleBitwiseAndOperator )
            {
            // InternalKExpressions.g:9027:1: ( ruleBitwiseAndOperator )
            // InternalKExpressions.g:9028:1: ruleBitwiseAndOperator
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
    // InternalKExpressions.g:9037:1: rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1 : ( ruleCompareOperation ) ;
    public final void rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9041:1: ( ( ruleCompareOperation ) )
            // InternalKExpressions.g:9042:1: ( ruleCompareOperation )
            {
            // InternalKExpressions.g:9042:1: ( ruleCompareOperation )
            // InternalKExpressions.g:9043:1: ruleCompareOperation
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
    // InternalKExpressions.g:9052:1: rule__BitwiseAndExpression__SubExpressionsAssignment_1_2_1 : ( ruleCompareOperation ) ;
    public final void rule__BitwiseAndExpression__SubExpressionsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9056:1: ( ( ruleCompareOperation ) )
            // InternalKExpressions.g:9057:1: ( ruleCompareOperation )
            {
            // InternalKExpressions.g:9057:1: ( ruleCompareOperation )
            // InternalKExpressions.g:9058:1: ruleCompareOperation
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
    // InternalKExpressions.g:9067:1: rule__CompareOperation__OperatorAssignment_1_1 : ( ruleCompareOperator ) ;
    public final void rule__CompareOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9071:1: ( ( ruleCompareOperator ) )
            // InternalKExpressions.g:9072:1: ( ruleCompareOperator )
            {
            // InternalKExpressions.g:9072:1: ( ruleCompareOperator )
            // InternalKExpressions.g:9073:1: ruleCompareOperator
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
    // InternalKExpressions.g:9082:1: rule__CompareOperation__SubExpressionsAssignment_1_2 : ( ruleNotOrValuedExpression ) ;
    public final void rule__CompareOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9086:1: ( ( ruleNotOrValuedExpression ) )
            // InternalKExpressions.g:9087:1: ( ruleNotOrValuedExpression )
            {
            // InternalKExpressions.g:9087:1: ( ruleNotOrValuedExpression )
            // InternalKExpressions.g:9088:1: ruleNotOrValuedExpression
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
    // InternalKExpressions.g:9097:1: rule__NotExpression__OperatorAssignment_0_1 : ( ruleNotOperator ) ;
    public final void rule__NotExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9101:1: ( ( ruleNotOperator ) )
            // InternalKExpressions.g:9102:1: ( ruleNotOperator )
            {
            // InternalKExpressions.g:9102:1: ( ruleNotOperator )
            // InternalKExpressions.g:9103:1: ruleNotOperator
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
    // InternalKExpressions.g:9112:1: rule__NotExpression__SubExpressionsAssignment_0_2 : ( ruleNotExpression ) ;
    public final void rule__NotExpression__SubExpressionsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9116:1: ( ( ruleNotExpression ) )
            // InternalKExpressions.g:9117:1: ( ruleNotExpression )
            {
            // InternalKExpressions.g:9117:1: ( ruleNotExpression )
            // InternalKExpressions.g:9118:1: ruleNotExpression
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
    // InternalKExpressions.g:9127:1: rule__AddExpression__OperatorAssignment_1_1_0 : ( ruleAddOperator ) ;
    public final void rule__AddExpression__OperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9131:1: ( ( ruleAddOperator ) )
            // InternalKExpressions.g:9132:1: ( ruleAddOperator )
            {
            // InternalKExpressions.g:9132:1: ( ruleAddOperator )
            // InternalKExpressions.g:9133:1: ruleAddOperator
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
    // InternalKExpressions.g:9142:1: rule__AddExpression__SubExpressionsAssignment_1_1_1 : ( ruleSubExpression ) ;
    public final void rule__AddExpression__SubExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9146:1: ( ( ruleSubExpression ) )
            // InternalKExpressions.g:9147:1: ( ruleSubExpression )
            {
            // InternalKExpressions.g:9147:1: ( ruleSubExpression )
            // InternalKExpressions.g:9148:1: ruleSubExpression
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
    // InternalKExpressions.g:9157:1: rule__AddExpression__SubExpressionsAssignment_1_2_1 : ( ruleSubExpression ) ;
    public final void rule__AddExpression__SubExpressionsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9161:1: ( ( ruleSubExpression ) )
            // InternalKExpressions.g:9162:1: ( ruleSubExpression )
            {
            // InternalKExpressions.g:9162:1: ( ruleSubExpression )
            // InternalKExpressions.g:9163:1: ruleSubExpression
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
    // InternalKExpressions.g:9172:1: rule__SubExpression__OperatorAssignment_1_1_0 : ( ruleSubOperator ) ;
    public final void rule__SubExpression__OperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9176:1: ( ( ruleSubOperator ) )
            // InternalKExpressions.g:9177:1: ( ruleSubOperator )
            {
            // InternalKExpressions.g:9177:1: ( ruleSubOperator )
            // InternalKExpressions.g:9178:1: ruleSubOperator
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
    // InternalKExpressions.g:9187:1: rule__SubExpression__SubExpressionsAssignment_1_1_1 : ( ruleMultExpression ) ;
    public final void rule__SubExpression__SubExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9191:1: ( ( ruleMultExpression ) )
            // InternalKExpressions.g:9192:1: ( ruleMultExpression )
            {
            // InternalKExpressions.g:9192:1: ( ruleMultExpression )
            // InternalKExpressions.g:9193:1: ruleMultExpression
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
    // InternalKExpressions.g:9202:1: rule__SubExpression__SubExpressionsAssignment_1_2_1 : ( ruleMultExpression ) ;
    public final void rule__SubExpression__SubExpressionsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9206:1: ( ( ruleMultExpression ) )
            // InternalKExpressions.g:9207:1: ( ruleMultExpression )
            {
            // InternalKExpressions.g:9207:1: ( ruleMultExpression )
            // InternalKExpressions.g:9208:1: ruleMultExpression
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
    // InternalKExpressions.g:9217:1: rule__MultExpression__OperatorAssignment_1_1_0 : ( ruleMultOperator ) ;
    public final void rule__MultExpression__OperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9221:1: ( ( ruleMultOperator ) )
            // InternalKExpressions.g:9222:1: ( ruleMultOperator )
            {
            // InternalKExpressions.g:9222:1: ( ruleMultOperator )
            // InternalKExpressions.g:9223:1: ruleMultOperator
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
    // InternalKExpressions.g:9232:1: rule__MultExpression__SubExpressionsAssignment_1_1_1 : ( ruleDivExpression ) ;
    public final void rule__MultExpression__SubExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9236:1: ( ( ruleDivExpression ) )
            // InternalKExpressions.g:9237:1: ( ruleDivExpression )
            {
            // InternalKExpressions.g:9237:1: ( ruleDivExpression )
            // InternalKExpressions.g:9238:1: ruleDivExpression
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
    // InternalKExpressions.g:9247:1: rule__MultExpression__SubExpressionsAssignment_1_2_1 : ( ruleDivExpression ) ;
    public final void rule__MultExpression__SubExpressionsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9251:1: ( ( ruleDivExpression ) )
            // InternalKExpressions.g:9252:1: ( ruleDivExpression )
            {
            // InternalKExpressions.g:9252:1: ( ruleDivExpression )
            // InternalKExpressions.g:9253:1: ruleDivExpression
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
    // InternalKExpressions.g:9262:1: rule__DivExpression__OperatorAssignment_1_1_0 : ( ruleDivOperator ) ;
    public final void rule__DivExpression__OperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9266:1: ( ( ruleDivOperator ) )
            // InternalKExpressions.g:9267:1: ( ruleDivOperator )
            {
            // InternalKExpressions.g:9267:1: ( ruleDivOperator )
            // InternalKExpressions.g:9268:1: ruleDivOperator
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
    // InternalKExpressions.g:9277:1: rule__DivExpression__SubExpressionsAssignment_1_1_1 : ( ruleModExpression ) ;
    public final void rule__DivExpression__SubExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9281:1: ( ( ruleModExpression ) )
            // InternalKExpressions.g:9282:1: ( ruleModExpression )
            {
            // InternalKExpressions.g:9282:1: ( ruleModExpression )
            // InternalKExpressions.g:9283:1: ruleModExpression
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
    // InternalKExpressions.g:9292:1: rule__DivExpression__SubExpressionsAssignment_1_2_1 : ( ruleModExpression ) ;
    public final void rule__DivExpression__SubExpressionsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9296:1: ( ( ruleModExpression ) )
            // InternalKExpressions.g:9297:1: ( ruleModExpression )
            {
            // InternalKExpressions.g:9297:1: ( ruleModExpression )
            // InternalKExpressions.g:9298:1: ruleModExpression
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
    // InternalKExpressions.g:9307:1: rule__ModExpression__OperatorAssignment_1_1_0 : ( ruleModOperator ) ;
    public final void rule__ModExpression__OperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9311:1: ( ( ruleModOperator ) )
            // InternalKExpressions.g:9312:1: ( ruleModOperator )
            {
            // InternalKExpressions.g:9312:1: ( ruleModOperator )
            // InternalKExpressions.g:9313:1: ruleModOperator
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
    // InternalKExpressions.g:9322:1: rule__ModExpression__SubExpressionsAssignment_1_1_1 : ( ruleAtomicValuedExpression ) ;
    public final void rule__ModExpression__SubExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9326:1: ( ( ruleAtomicValuedExpression ) )
            // InternalKExpressions.g:9327:1: ( ruleAtomicValuedExpression )
            {
            // InternalKExpressions.g:9327:1: ( ruleAtomicValuedExpression )
            // InternalKExpressions.g:9328:1: ruleAtomicValuedExpression
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
    // InternalKExpressions.g:9337:1: rule__ModExpression__SubExpressionsAssignment_1_2_1 : ( ruleAtomicValuedExpression ) ;
    public final void rule__ModExpression__SubExpressionsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9341:1: ( ( ruleAtomicValuedExpression ) )
            // InternalKExpressions.g:9342:1: ( ruleAtomicValuedExpression )
            {
            // InternalKExpressions.g:9342:1: ( ruleAtomicValuedExpression )
            // InternalKExpressions.g:9343:1: ruleAtomicValuedExpression
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
    // InternalKExpressions.g:9352:1: rule__NegExpression__OperatorAssignment_0_1 : ( ruleSubOperator ) ;
    public final void rule__NegExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9356:1: ( ( ruleSubOperator ) )
            // InternalKExpressions.g:9357:1: ( ruleSubOperator )
            {
            // InternalKExpressions.g:9357:1: ( ruleSubOperator )
            // InternalKExpressions.g:9358:1: ruleSubOperator
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
    // InternalKExpressions.g:9367:1: rule__NegExpression__SubExpressionsAssignment_0_2 : ( ruleNegExpression ) ;
    public final void rule__NegExpression__SubExpressionsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9371:1: ( ( ruleNegExpression ) )
            // InternalKExpressions.g:9372:1: ( ruleNegExpression )
            {
            // InternalKExpressions.g:9372:1: ( ruleNegExpression )
            // InternalKExpressions.g:9373:1: ruleNegExpression
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
    // InternalKExpressions.g:9382:1: rule__ValuedObjectTestExpression__OperatorAssignment_0_1 : ( ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 ) ) ;
    public final void rule__ValuedObjectTestExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9386:1: ( ( ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 ) ) )
            // InternalKExpressions.g:9387:1: ( ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 ) )
            {
            // InternalKExpressions.g:9387:1: ( ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 ) )
            // InternalKExpressions.g:9388:1: ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorAlternatives_0_1_0()); 
            }
            // InternalKExpressions.g:9389:1: ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 )
            // InternalKExpressions.g:9389:2: rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0
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
    // InternalKExpressions.g:9398:1: rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 : ( ruleValuedObjectTestExpression ) ;
    public final void rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9402:1: ( ( ruleValuedObjectTestExpression ) )
            // InternalKExpressions.g:9403:1: ( ruleValuedObjectTestExpression )
            {
            // InternalKExpressions.g:9403:1: ( ruleValuedObjectTestExpression )
            // InternalKExpressions.g:9404:1: ruleValuedObjectTestExpression
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
    // InternalKExpressions.g:9413:1: rule__ValuedObjectReference__ValuedObjectAssignment_0 : ( ( rulePrimeID ) ) ;
    public final void rule__ValuedObjectReference__ValuedObjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9417:1: ( ( ( rulePrimeID ) ) )
            // InternalKExpressions.g:9418:1: ( ( rulePrimeID ) )
            {
            // InternalKExpressions.g:9418:1: ( ( rulePrimeID ) )
            // InternalKExpressions.g:9419:1: ( rulePrimeID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
            }
            // InternalKExpressions.g:9420:1: ( rulePrimeID )
            // InternalKExpressions.g:9421:1: rulePrimeID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectPrimeIDParserRuleCall_0_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectPrimeIDParserRuleCall_0_0_1()); 
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
    // InternalKExpressions.g:9432:1: rule__ValuedObjectReference__IndicesAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__ValuedObjectReference__IndicesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9436:1: ( ( ruleExpression ) )
            // InternalKExpressions.g:9437:1: ( ruleExpression )
            {
            // InternalKExpressions.g:9437:1: ( ruleExpression )
            // InternalKExpressions.g:9438:1: ruleExpression
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


    // $ANTLR start "rule__ValuedObjectReference__SubReferenceAssignment_2_1"
    // InternalKExpressions.g:9447:1: rule__ValuedObjectReference__SubReferenceAssignment_2_1 : ( ruleValuedObjectReference ) ;
    public final void rule__ValuedObjectReference__SubReferenceAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9451:1: ( ( ruleValuedObjectReference ) )
            // InternalKExpressions.g:9452:1: ( ruleValuedObjectReference )
            {
            // InternalKExpressions.g:9452:1: ( ruleValuedObjectReference )
            // InternalKExpressions.g:9453:1: ruleValuedObjectReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getSubReferenceValuedObjectReferenceParserRuleCall_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValuedObjectReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuedObjectReferenceAccess().getSubReferenceValuedObjectReferenceParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValuedObjectReference__SubReferenceAssignment_2_1"


    // $ANTLR start "rule__ScheduleObjectReference__ValuedObjectAssignment_0"
    // InternalKExpressions.g:9462:1: rule__ScheduleObjectReference__ValuedObjectAssignment_0 : ( ( rulePrimeID ) ) ;
    public final void rule__ScheduleObjectReference__ValuedObjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9466:1: ( ( ( rulePrimeID ) ) )
            // InternalKExpressions.g:9467:1: ( ( rulePrimeID ) )
            {
            // InternalKExpressions.g:9467:1: ( ( rulePrimeID ) )
            // InternalKExpressions.g:9468:1: ( rulePrimeID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScheduleObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
            }
            // InternalKExpressions.g:9469:1: ( rulePrimeID )
            // InternalKExpressions.g:9470:1: rulePrimeID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScheduleObjectReferenceAccess().getValuedObjectValuedObjectPrimeIDParserRuleCall_0_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScheduleObjectReferenceAccess().getValuedObjectValuedObjectPrimeIDParserRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScheduleObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScheduleObjectReference__ValuedObjectAssignment_0"


    // $ANTLR start "rule__ScheduleObjectReference__PriorityAssignment_1"
    // InternalKExpressions.g:9481:1: rule__ScheduleObjectReference__PriorityAssignment_1 : ( RULE_INT ) ;
    public final void rule__ScheduleObjectReference__PriorityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9485:1: ( ( RULE_INT ) )
            // InternalKExpressions.g:9486:1: ( RULE_INT )
            {
            // InternalKExpressions.g:9486:1: ( RULE_INT )
            // InternalKExpressions.g:9487:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScheduleObjectReferenceAccess().getPriorityINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScheduleObjectReferenceAccess().getPriorityINTTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScheduleObjectReference__PriorityAssignment_1"


    // $ANTLR start "rule__ReferenceCall__ValuedObjectAssignment_0"
    // InternalKExpressions.g:9496:1: rule__ReferenceCall__ValuedObjectAssignment_0 : ( ( rulePrimeID ) ) ;
    public final void rule__ReferenceCall__ValuedObjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9500:1: ( ( ( rulePrimeID ) ) )
            // InternalKExpressions.g:9501:1: ( ( rulePrimeID ) )
            {
            // InternalKExpressions.g:9501:1: ( ( rulePrimeID ) )
            // InternalKExpressions.g:9502:1: ( rulePrimeID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceCallAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
            }
            // InternalKExpressions.g:9503:1: ( rulePrimeID )
            // InternalKExpressions.g:9504:1: rulePrimeID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceCallAccess().getValuedObjectValuedObjectPrimeIDParserRuleCall_0_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceCallAccess().getValuedObjectValuedObjectPrimeIDParserRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceCallAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceCall__ValuedObjectAssignment_0"


    // $ANTLR start "rule__ReferenceCall__ParametersAssignment_1_0_1"
    // InternalKExpressions.g:9515:1: rule__ReferenceCall__ParametersAssignment_1_0_1 : ( ruleParameter ) ;
    public final void rule__ReferenceCall__ParametersAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9519:1: ( ( ruleParameter ) )
            // InternalKExpressions.g:9520:1: ( ruleParameter )
            {
            // InternalKExpressions.g:9520:1: ( ruleParameter )
            // InternalKExpressions.g:9521:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceCallAccess().getParametersParameterParserRuleCall_1_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceCallAccess().getParametersParameterParserRuleCall_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceCall__ParametersAssignment_1_0_1"


    // $ANTLR start "rule__ReferenceCall__ParametersAssignment_1_0_2_1"
    // InternalKExpressions.g:9530:1: rule__ReferenceCall__ParametersAssignment_1_0_2_1 : ( ruleParameter ) ;
    public final void rule__ReferenceCall__ParametersAssignment_1_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9534:1: ( ( ruleParameter ) )
            // InternalKExpressions.g:9535:1: ( ruleParameter )
            {
            // InternalKExpressions.g:9535:1: ( ruleParameter )
            // InternalKExpressions.g:9536:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceCallAccess().getParametersParameterParserRuleCall_1_0_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceCallAccess().getParametersParameterParserRuleCall_1_0_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceCall__ParametersAssignment_1_0_2_1"


    // $ANTLR start "rule__FunctionCall__FunctionNameAssignment_0_1"
    // InternalKExpressions.g:9545:1: rule__FunctionCall__FunctionNameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__FunctionCall__FunctionNameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9549:1: ( ( RULE_ID ) )
            // InternalKExpressions.g:9550:1: ( RULE_ID )
            {
            // InternalKExpressions.g:9550:1: ( RULE_ID )
            // InternalKExpressions.g:9551:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFunctionNameIDTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getFunctionNameIDTerminalRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__FunctionNameAssignment_0_1"


    // $ANTLR start "rule__FunctionCall__ParametersAssignment_0_2_0_1"
    // InternalKExpressions.g:9560:1: rule__FunctionCall__ParametersAssignment_0_2_0_1 : ( ruleParameter ) ;
    public final void rule__FunctionCall__ParametersAssignment_0_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9564:1: ( ( ruleParameter ) )
            // InternalKExpressions.g:9565:1: ( ruleParameter )
            {
            // InternalKExpressions.g:9565:1: ( ruleParameter )
            // InternalKExpressions.g:9566:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_0_2_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_0_2_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__ParametersAssignment_0_2_0_1"


    // $ANTLR start "rule__FunctionCall__ParametersAssignment_0_2_0_2_1"
    // InternalKExpressions.g:9575:1: rule__FunctionCall__ParametersAssignment_0_2_0_2_1 : ( ruleParameter ) ;
    public final void rule__FunctionCall__ParametersAssignment_0_2_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9579:1: ( ( ruleParameter ) )
            // InternalKExpressions.g:9580:1: ( ruleParameter )
            {
            // InternalKExpressions.g:9580:1: ( ruleParameter )
            // InternalKExpressions.g:9581:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_0_2_0_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_0_2_0_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__ParametersAssignment_0_2_0_2_1"


    // $ANTLR start "rule__FunctionCall__FunctionNameAssignment_1_1"
    // InternalKExpressions.g:9590:1: rule__FunctionCall__FunctionNameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__FunctionCall__FunctionNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9594:1: ( ( RULE_ID ) )
            // InternalKExpressions.g:9595:1: ( RULE_ID )
            {
            // InternalKExpressions.g:9595:1: ( RULE_ID )
            // InternalKExpressions.g:9596:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFunctionNameIDTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getFunctionNameIDTerminalRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__FunctionNameAssignment_1_1"


    // $ANTLR start "rule__FunctionCall__ParametersAssignment_1_2_0_1"
    // InternalKExpressions.g:9605:1: rule__FunctionCall__ParametersAssignment_1_2_0_1 : ( ruleParameter ) ;
    public final void rule__FunctionCall__ParametersAssignment_1_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9609:1: ( ( ruleParameter ) )
            // InternalKExpressions.g:9610:1: ( ruleParameter )
            {
            // InternalKExpressions.g:9610:1: ( ruleParameter )
            // InternalKExpressions.g:9611:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_1_2_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_1_2_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__ParametersAssignment_1_2_0_1"


    // $ANTLR start "rule__FunctionCall__ParametersAssignment_1_2_0_2_1"
    // InternalKExpressions.g:9620:1: rule__FunctionCall__ParametersAssignment_1_2_0_2_1 : ( ruleParameter ) ;
    public final void rule__FunctionCall__ParametersAssignment_1_2_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9624:1: ( ( ruleParameter ) )
            // InternalKExpressions.g:9625:1: ( ruleParameter )
            {
            // InternalKExpressions.g:9625:1: ( ruleParameter )
            // InternalKExpressions.g:9626:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_1_2_0_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_1_2_0_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__ParametersAssignment_1_2_0_2_1"


    // $ANTLR start "rule__Parameter__PureOutputAssignment_0_0"
    // InternalKExpressions.g:9635:1: rule__Parameter__PureOutputAssignment_0_0 : ( ( '!' ) ) ;
    public final void rule__Parameter__PureOutputAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9639:1: ( ( ( '!' ) ) )
            // InternalKExpressions.g:9640:1: ( ( '!' ) )
            {
            // InternalKExpressions.g:9640:1: ( ( '!' ) )
            // InternalKExpressions.g:9641:1: ( '!' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getPureOutputExclamationMarkKeyword_0_0_0()); 
            }
            // InternalKExpressions.g:9642:1: ( '!' )
            // InternalKExpressions.g:9643:1: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getPureOutputExclamationMarkKeyword_0_0_0()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:9658:1: rule__Parameter__CallByReferenceAssignment_0_1 : ( ( '&' ) ) ;
    public final void rule__Parameter__CallByReferenceAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9662:1: ( ( ( '&' ) ) )
            // InternalKExpressions.g:9663:1: ( ( '&' ) )
            {
            // InternalKExpressions.g:9663:1: ( ( '&' ) )
            // InternalKExpressions.g:9664:1: ( '&' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getCallByReferenceAmpersandKeyword_0_1_0()); 
            }
            // InternalKExpressions.g:9665:1: ( '&' )
            // InternalKExpressions.g:9666:1: '&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getCallByReferenceAmpersandKeyword_0_1_0()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:9681:1: rule__Parameter__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__Parameter__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9685:1: ( ( ruleExpression ) )
            // InternalKExpressions.g:9686:1: ( ruleExpression )
            {
            // InternalKExpressions.g:9686:1: ( ruleExpression )
            // InternalKExpressions.g:9687:1: ruleExpression
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
    // InternalKExpressions.g:9696:1: rule__TextExpression__TextAssignment : ( RULE_HOSTCODE ) ;
    public final void rule__TextExpression__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9700:1: ( ( RULE_HOSTCODE ) )
            // InternalKExpressions.g:9701:1: ( RULE_HOSTCODE )
            {
            // InternalKExpressions.g:9701:1: ( RULE_HOSTCODE )
            // InternalKExpressions.g:9702:1: RULE_HOSTCODE
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
    // InternalKExpressions.g:9711:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9715:1: ( ( RULE_INT ) )
            // InternalKExpressions.g:9716:1: ( RULE_INT )
            {
            // InternalKExpressions.g:9716:1: ( RULE_INT )
            // InternalKExpressions.g:9717:1: RULE_INT
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
    // InternalKExpressions.g:9726:1: rule__FloatValue__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9730:1: ( ( RULE_FLOAT ) )
            // InternalKExpressions.g:9731:1: ( RULE_FLOAT )
            {
            // InternalKExpressions.g:9731:1: ( RULE_FLOAT )
            // InternalKExpressions.g:9732:1: RULE_FLOAT
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
    // InternalKExpressions.g:9741:1: rule__BoolValue__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BoolValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9745:1: ( ( RULE_BOOLEAN ) )
            // InternalKExpressions.g:9746:1: ( RULE_BOOLEAN )
            {
            // InternalKExpressions.g:9746:1: ( RULE_BOOLEAN )
            // InternalKExpressions.g:9747:1: RULE_BOOLEAN
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
    // InternalKExpressions.g:9756:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9760:1: ( ( RULE_STRING ) )
            // InternalKExpressions.g:9761:1: ( RULE_STRING )
            {
            // InternalKExpressions.g:9761:1: ( RULE_STRING )
            // InternalKExpressions.g:9762:1: RULE_STRING
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
    // InternalKExpressions.g:9771:1: rule__CommentAnnotation__ValuesAssignment : ( RULE_COMMENT_ANNOTATION ) ;
    public final void rule__CommentAnnotation__ValuesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9775:1: ( ( RULE_COMMENT_ANNOTATION ) )
            // InternalKExpressions.g:9776:1: ( RULE_COMMENT_ANNOTATION )
            {
            // InternalKExpressions.g:9776:1: ( RULE_COMMENT_ANNOTATION )
            // InternalKExpressions.g:9777:1: RULE_COMMENT_ANNOTATION
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
    // InternalKExpressions.g:9787:1: rule__TagAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TagAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9791:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:9792:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:9792:1: ( ruleExtendedID )
            // InternalKExpressions.g:9793:1: ruleExtendedID
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


    // $ANTLR start "rule__PragmaTag__NameAssignment_1"
    // InternalKExpressions.g:9802:1: rule__PragmaTag__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__PragmaTag__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9806:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:9807:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:9807:1: ( ruleExtendedID )
            // InternalKExpressions.g:9808:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPragmaTagAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPragmaTagAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PragmaTag__NameAssignment_1"


    // $ANTLR start "rule__KeyStringValueAnnotation__NameAssignment_1"
    // InternalKExpressions.g:9817:1: rule__KeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9821:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:9822:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:9822:1: ( ruleExtendedID )
            // InternalKExpressions.g:9823:1: ruleExtendedID
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
    // InternalKExpressions.g:9832:1: rule__KeyStringValueAnnotation__ValuesAssignment_2 : ( ruleEStringAllTypes ) ;
    public final void rule__KeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9836:1: ( ( ruleEStringAllTypes ) )
            // InternalKExpressions.g:9837:1: ( ruleEStringAllTypes )
            {
            // InternalKExpressions.g:9837:1: ( ruleEStringAllTypes )
            // InternalKExpressions.g:9838:1: ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEStringAllTypes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_2_0()); 
            }

            }


            }

        }
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
    // InternalKExpressions.g:9847:1: rule__KeyStringValueAnnotation__ValuesAssignment_3_1 : ( ruleEStringAllTypes ) ;
    public final void rule__KeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9851:1: ( ( ruleEStringAllTypes ) )
            // InternalKExpressions.g:9852:1: ( ruleEStringAllTypes )
            {
            // InternalKExpressions.g:9852:1: ( ruleEStringAllTypes )
            // InternalKExpressions.g:9853:1: ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEStringAllTypes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_3_1_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__RestrictedKeyStringValueAnnotation__NameAssignment_1"
    // InternalKExpressions.g:9862:1: rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9866:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:9867:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:9867:1: ( ruleExtendedID )
            // InternalKExpressions.g:9868:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedKeyStringValueAnnotation__NameAssignment_1"


    // $ANTLR start "rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2"
    // InternalKExpressions.g:9877:1: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9881:1: ( ( ruleEStringBoolean ) )
            // InternalKExpressions.g:9882:1: ( ruleEStringBoolean )
            {
            // InternalKExpressions.g:9882:1: ( ruleEStringBoolean )
            // InternalKExpressions.g:9883:1: ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEStringBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2"


    // $ANTLR start "rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1"
    // InternalKExpressions.g:9892:1: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9896:1: ( ( ruleEStringBoolean ) )
            // InternalKExpressions.g:9897:1: ( ruleEStringBoolean )
            {
            // InternalKExpressions.g:9897:1: ( ruleEStringBoolean )
            // InternalKExpressions.g:9898:1: ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEStringBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1"


    // $ANTLR start "rule__StringPragma__NameAssignment_1"
    // InternalKExpressions.g:9907:1: rule__StringPragma__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__StringPragma__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9911:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:9912:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:9912:1: ( ruleExtendedID )
            // InternalKExpressions.g:9913:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPragmaAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringPragmaAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringPragma__NameAssignment_1"


    // $ANTLR start "rule__StringPragma__ValuesAssignment_2"
    // InternalKExpressions.g:9922:1: rule__StringPragma__ValuesAssignment_2 : ( ruleEStringAllTypes ) ;
    public final void rule__StringPragma__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9926:1: ( ( ruleEStringAllTypes ) )
            // InternalKExpressions.g:9927:1: ( ruleEStringAllTypes )
            {
            // InternalKExpressions.g:9927:1: ( ruleEStringAllTypes )
            // InternalKExpressions.g:9928:1: ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPragmaAccess().getValuesEStringAllTypesParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEStringAllTypes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringPragmaAccess().getValuesEStringAllTypesParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringPragma__ValuesAssignment_2"


    // $ANTLR start "rule__StringPragma__ValuesAssignment_3_1"
    // InternalKExpressions.g:9937:1: rule__StringPragma__ValuesAssignment_3_1 : ( ruleEStringAllTypes ) ;
    public final void rule__StringPragma__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9941:1: ( ( ruleEStringAllTypes ) )
            // InternalKExpressions.g:9942:1: ( ruleEStringAllTypes )
            {
            // InternalKExpressions.g:9942:1: ( ruleEStringAllTypes )
            // InternalKExpressions.g:9943:1: ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPragmaAccess().getValuesEStringAllTypesParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEStringAllTypes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringPragmaAccess().getValuesEStringAllTypesParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringPragma__ValuesAssignment_3_1"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__NameAssignment_1"
    // InternalKExpressions.g:9952:1: rule__TypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9956:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:9957:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:9957:1: ( ruleExtendedID )
            // InternalKExpressions.g:9958:1: ruleExtendedID
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
    // InternalKExpressions.g:9967:1: rule__TypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9971:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:9972:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:9972:1: ( ruleExtendedID )
            // InternalKExpressions.g:9973:1: ruleExtendedID
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
    // InternalKExpressions.g:9982:1: rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 : ( ruleEStringAllTypes ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9986:1: ( ( ruleEStringAllTypes ) )
            // InternalKExpressions.g:9987:1: ( ruleEStringAllTypes )
            {
            // InternalKExpressions.g:9987:1: ( ruleEStringAllTypes )
            // InternalKExpressions.g:9988:1: ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEStringAllTypes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_5_0()); 
            }

            }


            }

        }
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
    // InternalKExpressions.g:9997:1: rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( ruleEStringAllTypes ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:10001:1: ( ( ruleEStringAllTypes ) )
            // InternalKExpressions.g:10002:1: ( ruleEStringAllTypes )
            {
            // InternalKExpressions.g:10002:1: ( ruleEStringAllTypes )
            // InternalKExpressions.g:10003:1: ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_6_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEStringAllTypes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_6_1_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1"
    // InternalKExpressions.g:10012:1: rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:10016:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:10017:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:10017:1: ( ruleExtendedID )
            // InternalKExpressions.g:10018:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1"


    // $ANTLR start "rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3"
    // InternalKExpressions.g:10027:1: rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:10031:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:10032:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:10032:1: ( ruleExtendedID )
            // InternalKExpressions.g:10033:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3"


    // $ANTLR start "rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5"
    // InternalKExpressions.g:10042:1: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:10046:1: ( ( ruleEStringBoolean ) )
            // InternalKExpressions.g:10047:1: ( ruleEStringBoolean )
            {
            // InternalKExpressions.g:10047:1: ( ruleEStringBoolean )
            // InternalKExpressions.g:10048:1: ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEStringBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5"


    // $ANTLR start "rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1"
    // InternalKExpressions.g:10057:1: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:10061:1: ( ( ruleEStringBoolean ) )
            // InternalKExpressions.g:10062:1: ( ruleEStringBoolean )
            {
            // InternalKExpressions.g:10062:1: ( ruleEStringBoolean )
            // InternalKExpressions.g:10063:1: ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_6_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEStringBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1"


    // $ANTLR start "rule__QuotedKeyStringValueAnnotation__NameAssignment_1"
    // InternalKExpressions.g:10072:1: rule__QuotedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__QuotedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:10076:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:10077:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:10077:1: ( ruleExtendedID )
            // InternalKExpressions.g:10078:1: ruleExtendedID
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
    // InternalKExpressions.g:10087:1: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 : ( RULE_STRING ) ;
    public final void rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:10091:1: ( ( RULE_STRING ) )
            // InternalKExpressions.g:10092:1: ( RULE_STRING )
            {
            // InternalKExpressions.g:10092:1: ( RULE_STRING )
            // InternalKExpressions.g:10093:1: RULE_STRING
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
    // InternalKExpressions.g:10102:1: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:10106:1: ( ( RULE_STRING ) )
            // InternalKExpressions.g:10107:1: ( RULE_STRING )
            {
            // InternalKExpressions.g:10107:1: ( RULE_STRING )
            // InternalKExpressions.g:10108:1: RULE_STRING
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
    // InternalKExpressions.g:10117:1: rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:10121:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:10122:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:10122:1: ( ruleExtendedID )
            // InternalKExpressions.g:10123:1: ruleExtendedID
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
    // InternalKExpressions.g:10132:1: rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:10136:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:10137:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:10137:1: ( ruleExtendedID )
            // InternalKExpressions.g:10138:1: ruleExtendedID
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
    // InternalKExpressions.g:10147:1: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 : ( RULE_STRING ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:10151:1: ( ( RULE_STRING ) )
            // InternalKExpressions.g:10152:1: ( RULE_STRING )
            {
            // InternalKExpressions.g:10152:1: ( RULE_STRING )
            // InternalKExpressions.g:10153:1: RULE_STRING
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
    // InternalKExpressions.g:10162:1: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:10166:1: ( ( RULE_STRING ) )
            // InternalKExpressions.g:10167:1: ( RULE_STRING )
            {
            // InternalKExpressions.g:10167:1: ( RULE_STRING )
            // InternalKExpressions.g:10168:1: RULE_STRING
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

    // $ANTLR start synpred1_InternalKExpressions
    public final void synpred1_InternalKExpressions_fragment() throws RecognitionException {   
        // InternalKExpressions.g:1643:1: ( ( ruleBoolExpression ) )
        // InternalKExpressions.g:1643:1: ( ruleBoolExpression )
        {
        // InternalKExpressions.g:1643:1: ( ruleBoolExpression )
        // InternalKExpressions.g:1644:1: ruleBoolExpression
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExpressionAccess().getBoolExpressionParserRuleCall_0_0()); 
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
        // InternalKExpressions.g:1665:1: ( ( ruleValuedExpression ) )
        // InternalKExpressions.g:1665:1: ( ruleValuedExpression )
        {
        // InternalKExpressions.g:1665:1: ( ruleValuedExpression )
        // InternalKExpressions.g:1666:1: ruleValuedExpression
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

    // $ANTLR start synpred13_InternalKExpressions
    public final void synpred13_InternalKExpressions_fragment() throws RecognitionException {   
        // InternalKExpressions.g:1795:6: ( ( ( rule__AtomicValuedExpression__Group_3__0 ) ) )
        // InternalKExpressions.g:1795:6: ( ( rule__AtomicValuedExpression__Group_3__0 ) )
        {
        // InternalKExpressions.g:1795:6: ( ( rule__AtomicValuedExpression__Group_3__0 ) )
        // InternalKExpressions.g:1796:1: ( rule__AtomicValuedExpression__Group_3__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_3()); 
        }
        // InternalKExpressions.g:1797:1: ( rule__AtomicValuedExpression__Group_3__0 )
        // InternalKExpressions.g:1797:2: rule__AtomicValuedExpression__Group_3__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__AtomicValuedExpression__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred13_InternalKExpressions

    // Delegated rules

    public final boolean synpred13_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalKExpressions_fragment(); // can never throw exception
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
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\4\14\0\2\uffff";
    static final String dfa_3s = "\1\54\14\0\2\uffff";
    static final String dfa_4s = "\15\uffff\1\1\1\2";
    static final String dfa_5s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\2\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\1\6\1\11\1\2\1\3\1\14\7\uffff\1\7\2\uffff\1\15\1\uffff\1\1\3\uffff\1\10\5\uffff\1\13\5\uffff\1\5\5\uffff\1\12",
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
            return "1638:1: rule__Expression__Alternatives_0 : ( ( ruleBoolExpression ) | ( ruleValuedExpression ) );";
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
                        if ( (synpred1_InternalKExpressions()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_2 = input.LA(1);

                         
                        int index1_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_3 = input.LA(1);

                         
                        int index1_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA1_4 = input.LA(1);

                         
                        int index1_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA1_5 = input.LA(1);

                         
                        int index1_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA1_6 = input.LA(1);

                         
                        int index1_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA1_7 = input.LA(1);

                         
                        int index1_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA1_8 = input.LA(1);

                         
                        int index1_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA1_9 = input.LA(1);

                         
                        int index1_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA1_10 = input.LA(1);

                         
                        int index1_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA1_11 = input.LA(1);

                         
                        int index1_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA1_12 = input.LA(1);

                         
                        int index1_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index1_12);
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
    static final String dfa_7s = "\16\uffff";
    static final String dfa_8s = "\1\4\4\uffff\10\0\1\uffff";
    static final String dfa_9s = "\1\54\4\uffff\10\0\1\uffff";
    static final String dfa_10s = "\1\uffff\1\1\13\uffff\1\2";
    static final String dfa_11s = "\5\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\1\6\1\11\2\1\1\14\7\uffff\1\7\2\uffff\1\15\1\uffff\1\1\3\uffff\1\10\5\uffff\1\13\5\uffff\1\5\5\uffff\1\12",
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
            return "1660:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );";
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

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index2_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_6 = input.LA(1);

                         
                        int index2_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index2_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_7 = input.LA(1);

                         
                        int index2_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index2_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA2_8 = input.LA(1);

                         
                        int index2_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index2_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA2_9 = input.LA(1);

                         
                        int index2_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index2_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA2_10 = input.LA(1);

                         
                        int index2_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index2_10);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA2_11 = input.LA(1);

                         
                        int index2_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index2_11);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA2_12 = input.LA(1);

                         
                        int index2_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index2_12);
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
    static final String dfa_13s = "\11\uffff";
    static final String dfa_14s = "\3\uffff\1\2\3\uffff\1\2\1\uffff";
    static final String dfa_15s = "\1\5\2\uffff\1\22\3\uffff\1\22\1\uffff";
    static final String dfa_16s = "\1\54\2\uffff\1\53\3\uffff\1\53\1\uffff";
    static final String dfa_17s = "\1\uffff\1\1\1\2\1\uffff\1\3\1\5\1\6\1\uffff\1\4";
    static final String dfa_18s = "\11\uffff}>";
    static final String[] dfa_19s = {
            "\1\1\1\3\2\uffff\1\6\7\uffff\1\2\10\uffff\1\2\5\uffff\1\5\5\uffff\1\4\5\uffff\1\5",
            "",
            "",
            "\2\2\1\uffff\5\2\1\uffff\2\2\1\10\10\2\1\10\1\2\1\7\3\2",
            "",
            "",
            "",
            "\2\2\1\uffff\5\2\1\uffff\2\2\1\10\10\2\1\10\1\2\1\7\3\2",
            ""
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_13;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "1726:1: rule__AtomicExpression__Alternatives : ( ( ruleBoolValue ) | ( ruleValuedObjectTestExpression ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ruleReferenceCall ) | ( ruleFunctionCall ) | ( ruleTextExpression ) );";
        }
    }
    static final String dfa_20s = "\15\uffff";
    static final String dfa_21s = "\1\4\3\uffff\1\0\10\uffff";
    static final String dfa_22s = "\1\54\3\uffff\1\0\10\uffff";
    static final String dfa_23s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\6\uffff\1\4";
    static final String dfa_24s = "\4\uffff\1\0\10\uffff}>";
    static final String[] dfa_25s = {
            "\1\3\2\5\1\1\1\2\1\5\7\uffff\1\5\10\uffff\1\5\5\uffff\1\5\5\uffff\1\4\5\uffff\1\5",
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
            "",
            ""
    };

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "1772:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleStringValue ) | ( ( rule__AtomicValuedExpression__Group_3__0 ) ) | ( ruleAtomicExpression ) );";
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
                        if ( (synpred13_InternalKExpressions()) ) {s = 12;}

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
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000042L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00001041045203F0L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001F80000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00001041044203F0L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000004020000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000004020040L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020040000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000004020000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00001041045A03F0L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000088000000000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00000000004001F0L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000400040400000L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000040400002L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000400080L});
    }


}