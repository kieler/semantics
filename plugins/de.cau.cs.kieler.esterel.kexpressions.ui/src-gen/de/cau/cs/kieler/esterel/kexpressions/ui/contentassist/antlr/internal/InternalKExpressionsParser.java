package de.cau.cs.kieler.esterel.kexpressions.ui.contentassist.antlr.internal; 

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
import de.cau.cs.kieler.esterel.kexpressions.services.KExpressionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalKExpressionsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_BOOLEAN", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_HOSTCODE", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_SL_COMMENT_ANNOTATION", "RULE_SL_COMMENT", "RULE_NUMBER", "RULE_WS", "RULE_ANY_OTHER", "'pre'", "'or'", "'and'", "'not'", "'+'", "'-'", "'*'", "'mod'", "'/'", "'?'", "'.'", "'='", "'<'", "'<='", "'>'", "'>='", "'<>'", "'pure'", "'boolean'", "'unsigned'", "'integer'", "'float'", "'double'", "'string'", "'host'", "'none'", "'max'", "'min'", "'('", "')'", "'input'", "';'", "','", "'output'", "'inputoutput'", "'return'", "':'", "':='", "'var'", "'combine'", "'with'", "'@'", "'#'", "'['", "']'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=5;
    public static final int T__19=19;
    public static final int T__59=59;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
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
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=8;
    public static final int T__46=46;
    public static final int T__47=47;
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
    // InternalKExpressions.g:70:1: ruleRoot : ( ( rule__Root__Alternatives ) ) ;
    public final void ruleRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:74:2: ( ( ( rule__Root__Alternatives ) ) )
            // InternalKExpressions.g:75:1: ( ( rule__Root__Alternatives ) )
            {
            // InternalKExpressions.g:75:1: ( ( rule__Root__Alternatives ) )
            // InternalKExpressions.g:76:1: ( rule__Root__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRootAccess().getAlternatives()); 
            }
            // InternalKExpressions.g:77:1: ( rule__Root__Alternatives )
            // InternalKExpressions.g:77:2: rule__Root__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Root__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRootAccess().getAlternatives()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleBooleanExpression"
    // InternalKExpressions.g:117:1: entryRuleBooleanExpression : ruleBooleanExpression EOF ;
    public final void entryRuleBooleanExpression() throws RecognitionException {
        try {
            // InternalKExpressions.g:118:1: ( ruleBooleanExpression EOF )
            // InternalKExpressions.g:119:1: ruleBooleanExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionRule()); 
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
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // InternalKExpressions.g:126:1: ruleBooleanExpression : ( ruleOrExpression ) ;
    public final void ruleBooleanExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:130:2: ( ( ruleOrExpression ) )
            // InternalKExpressions.g:131:1: ( ruleOrExpression )
            {
            // InternalKExpressions.g:131:1: ( ruleOrExpression )
            // InternalKExpressions.g:132:1: ruleOrExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getOrExpressionParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
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
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleOrExpression"
    // InternalKExpressions.g:145:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // InternalKExpressions.g:146:1: ( ruleOrExpression EOF )
            // InternalKExpressions.g:147:1: ruleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionRule()); 
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
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalKExpressions.g:154:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:158:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // InternalKExpressions.g:159:1: ( ( rule__OrExpression__Group__0 ) )
            {
            // InternalKExpressions.g:159:1: ( ( rule__OrExpression__Group__0 ) )
            // InternalKExpressions.g:160:1: ( rule__OrExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup()); 
            }
            // InternalKExpressions.g:161:1: ( rule__OrExpression__Group__0 )
            // InternalKExpressions.g:161:2: rule__OrExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalKExpressions.g:173:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // InternalKExpressions.g:174:1: ( ruleAndExpression EOF )
            // InternalKExpressions.g:175:1: ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionRule()); 
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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalKExpressions.g:182:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:186:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // InternalKExpressions.g:187:1: ( ( rule__AndExpression__Group__0 ) )
            {
            // InternalKExpressions.g:187:1: ( ( rule__AndExpression__Group__0 ) )
            // InternalKExpressions.g:188:1: ( rule__AndExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup()); 
            }
            // InternalKExpressions.g:189:1: ( rule__AndExpression__Group__0 )
            // InternalKExpressions.g:189:2: rule__AndExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleCompareOperation"
    // InternalKExpressions.g:201:1: entryRuleCompareOperation : ruleCompareOperation EOF ;
    public final void entryRuleCompareOperation() throws RecognitionException {
        try {
            // InternalKExpressions.g:202:1: ( ruleCompareOperation EOF )
            // InternalKExpressions.g:203:1: ruleCompareOperation EOF
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
    // InternalKExpressions.g:210:1: ruleCompareOperation : ( ( rule__CompareOperation__Alternatives ) ) ;
    public final void ruleCompareOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:214:2: ( ( ( rule__CompareOperation__Alternatives ) ) )
            // InternalKExpressions.g:215:1: ( ( rule__CompareOperation__Alternatives ) )
            {
            // InternalKExpressions.g:215:1: ( ( rule__CompareOperation__Alternatives ) )
            // InternalKExpressions.g:216:1: ( rule__CompareOperation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getAlternatives()); 
            }
            // InternalKExpressions.g:217:1: ( rule__CompareOperation__Alternatives )
            // InternalKExpressions.g:217:2: rule__CompareOperation__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CompareOperation__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "ruleCompareOperation"


    // $ANTLR start "entryRuleNotOrValuedExpression"
    // InternalKExpressions.g:229:1: entryRuleNotOrValuedExpression : ruleNotOrValuedExpression EOF ;
    public final void entryRuleNotOrValuedExpression() throws RecognitionException {
        try {
            // InternalKExpressions.g:230:1: ( ruleNotOrValuedExpression EOF )
            // InternalKExpressions.g:231:1: ruleNotOrValuedExpression EOF
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
    // InternalKExpressions.g:238:1: ruleNotOrValuedExpression : ( ( rule__NotOrValuedExpression__Alternatives ) ) ;
    public final void ruleNotOrValuedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:242:2: ( ( ( rule__NotOrValuedExpression__Alternatives ) ) )
            // InternalKExpressions.g:243:1: ( ( rule__NotOrValuedExpression__Alternatives ) )
            {
            // InternalKExpressions.g:243:1: ( ( rule__NotOrValuedExpression__Alternatives ) )
            // InternalKExpressions.g:244:1: ( rule__NotOrValuedExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotOrValuedExpressionAccess().getAlternatives()); 
            }
            // InternalKExpressions.g:245:1: ( rule__NotOrValuedExpression__Alternatives )
            // InternalKExpressions.g:245:2: rule__NotOrValuedExpression__Alternatives
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
    // InternalKExpressions.g:257:1: entryRuleNotExpression : ruleNotExpression EOF ;
    public final void entryRuleNotExpression() throws RecognitionException {
        try {
            // InternalKExpressions.g:258:1: ( ruleNotExpression EOF )
            // InternalKExpressions.g:259:1: ruleNotExpression EOF
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
    // InternalKExpressions.g:266:1: ruleNotExpression : ( ( rule__NotExpression__Alternatives ) ) ;
    public final void ruleNotExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:270:2: ( ( ( rule__NotExpression__Alternatives ) ) )
            // InternalKExpressions.g:271:1: ( ( rule__NotExpression__Alternatives ) )
            {
            // InternalKExpressions.g:271:1: ( ( rule__NotExpression__Alternatives ) )
            // InternalKExpressions.g:272:1: ( rule__NotExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getAlternatives()); 
            }
            // InternalKExpressions.g:273:1: ( rule__NotExpression__Alternatives )
            // InternalKExpressions.g:273:2: rule__NotExpression__Alternatives
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
    // InternalKExpressions.g:285:1: entryRuleValuedExpression : ruleValuedExpression EOF ;
    public final void entryRuleValuedExpression() throws RecognitionException {
        try {
            // InternalKExpressions.g:286:1: ( ruleValuedExpression EOF )
            // InternalKExpressions.g:287:1: ruleValuedExpression EOF
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
    // InternalKExpressions.g:294:1: ruleValuedExpression : ( ruleAddExpression ) ;
    public final void ruleValuedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:298:2: ( ( ruleAddExpression ) )
            // InternalKExpressions.g:299:1: ( ruleAddExpression )
            {
            // InternalKExpressions.g:299:1: ( ruleAddExpression )
            // InternalKExpressions.g:300:1: ruleAddExpression
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
    // InternalKExpressions.g:313:1: entryRuleAddExpression : ruleAddExpression EOF ;
    public final void entryRuleAddExpression() throws RecognitionException {
        try {
            // InternalKExpressions.g:314:1: ( ruleAddExpression EOF )
            // InternalKExpressions.g:315:1: ruleAddExpression EOF
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
    // InternalKExpressions.g:322:1: ruleAddExpression : ( ( rule__AddExpression__Group__0 ) ) ;
    public final void ruleAddExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:326:2: ( ( ( rule__AddExpression__Group__0 ) ) )
            // InternalKExpressions.g:327:1: ( ( rule__AddExpression__Group__0 ) )
            {
            // InternalKExpressions.g:327:1: ( ( rule__AddExpression__Group__0 ) )
            // InternalKExpressions.g:328:1: ( rule__AddExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup()); 
            }
            // InternalKExpressions.g:329:1: ( rule__AddExpression__Group__0 )
            // InternalKExpressions.g:329:2: rule__AddExpression__Group__0
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
    // InternalKExpressions.g:341:1: entryRuleSubExpression : ruleSubExpression EOF ;
    public final void entryRuleSubExpression() throws RecognitionException {
        try {
            // InternalKExpressions.g:342:1: ( ruleSubExpression EOF )
            // InternalKExpressions.g:343:1: ruleSubExpression EOF
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
    // InternalKExpressions.g:350:1: ruleSubExpression : ( ( rule__SubExpression__Group__0 ) ) ;
    public final void ruleSubExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:354:2: ( ( ( rule__SubExpression__Group__0 ) ) )
            // InternalKExpressions.g:355:1: ( ( rule__SubExpression__Group__0 ) )
            {
            // InternalKExpressions.g:355:1: ( ( rule__SubExpression__Group__0 ) )
            // InternalKExpressions.g:356:1: ( rule__SubExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup()); 
            }
            // InternalKExpressions.g:357:1: ( rule__SubExpression__Group__0 )
            // InternalKExpressions.g:357:2: rule__SubExpression__Group__0
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
    // InternalKExpressions.g:369:1: entryRuleMultExpression : ruleMultExpression EOF ;
    public final void entryRuleMultExpression() throws RecognitionException {
        try {
            // InternalKExpressions.g:370:1: ( ruleMultExpression EOF )
            // InternalKExpressions.g:371:1: ruleMultExpression EOF
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
    // InternalKExpressions.g:378:1: ruleMultExpression : ( ( rule__MultExpression__Group__0 ) ) ;
    public final void ruleMultExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:382:2: ( ( ( rule__MultExpression__Group__0 ) ) )
            // InternalKExpressions.g:383:1: ( ( rule__MultExpression__Group__0 ) )
            {
            // InternalKExpressions.g:383:1: ( ( rule__MultExpression__Group__0 ) )
            // InternalKExpressions.g:384:1: ( rule__MultExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getGroup()); 
            }
            // InternalKExpressions.g:385:1: ( rule__MultExpression__Group__0 )
            // InternalKExpressions.g:385:2: rule__MultExpression__Group__0
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
    // InternalKExpressions.g:397:1: entryRuleDivExpression : ruleDivExpression EOF ;
    public final void entryRuleDivExpression() throws RecognitionException {
        try {
            // InternalKExpressions.g:398:1: ( ruleDivExpression EOF )
            // InternalKExpressions.g:399:1: ruleDivExpression EOF
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
    // InternalKExpressions.g:406:1: ruleDivExpression : ( ( rule__DivExpression__Group__0 ) ) ;
    public final void ruleDivExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:410:2: ( ( ( rule__DivExpression__Group__0 ) ) )
            // InternalKExpressions.g:411:1: ( ( rule__DivExpression__Group__0 ) )
            {
            // InternalKExpressions.g:411:1: ( ( rule__DivExpression__Group__0 ) )
            // InternalKExpressions.g:412:1: ( rule__DivExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getGroup()); 
            }
            // InternalKExpressions.g:413:1: ( rule__DivExpression__Group__0 )
            // InternalKExpressions.g:413:2: rule__DivExpression__Group__0
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
    // InternalKExpressions.g:425:1: entryRuleModExpression : ruleModExpression EOF ;
    public final void entryRuleModExpression() throws RecognitionException {
        try {
            // InternalKExpressions.g:426:1: ( ruleModExpression EOF )
            // InternalKExpressions.g:427:1: ruleModExpression EOF
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
    // InternalKExpressions.g:434:1: ruleModExpression : ( ( rule__ModExpression__Group__0 ) ) ;
    public final void ruleModExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:438:2: ( ( ( rule__ModExpression__Group__0 ) ) )
            // InternalKExpressions.g:439:1: ( ( rule__ModExpression__Group__0 ) )
            {
            // InternalKExpressions.g:439:1: ( ( rule__ModExpression__Group__0 ) )
            // InternalKExpressions.g:440:1: ( rule__ModExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getGroup()); 
            }
            // InternalKExpressions.g:441:1: ( rule__ModExpression__Group__0 )
            // InternalKExpressions.g:441:2: rule__ModExpression__Group__0
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
    // InternalKExpressions.g:453:1: entryRuleNegExpression : ruleNegExpression EOF ;
    public final void entryRuleNegExpression() throws RecognitionException {
        try {
            // InternalKExpressions.g:454:1: ( ruleNegExpression EOF )
            // InternalKExpressions.g:455:1: ruleNegExpression EOF
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
    // InternalKExpressions.g:462:1: ruleNegExpression : ( ( rule__NegExpression__Alternatives ) ) ;
    public final void ruleNegExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:466:2: ( ( ( rule__NegExpression__Alternatives ) ) )
            // InternalKExpressions.g:467:1: ( ( rule__NegExpression__Alternatives ) )
            {
            // InternalKExpressions.g:467:1: ( ( rule__NegExpression__Alternatives ) )
            // InternalKExpressions.g:468:1: ( rule__NegExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getAlternatives()); 
            }
            // InternalKExpressions.g:469:1: ( rule__NegExpression__Alternatives )
            // InternalKExpressions.g:469:2: rule__NegExpression__Alternatives
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
    // InternalKExpressions.g:481:1: entryRuleAtomicExpression : ruleAtomicExpression EOF ;
    public final void entryRuleAtomicExpression() throws RecognitionException {
        try {
            // InternalKExpressions.g:482:1: ( ruleAtomicExpression EOF )
            // InternalKExpressions.g:483:1: ruleAtomicExpression EOF
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
    // InternalKExpressions.g:490:1: ruleAtomicExpression : ( ( rule__AtomicExpression__Alternatives ) ) ;
    public final void ruleAtomicExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:494:2: ( ( ( rule__AtomicExpression__Alternatives ) ) )
            // InternalKExpressions.g:495:1: ( ( rule__AtomicExpression__Alternatives ) )
            {
            // InternalKExpressions.g:495:1: ( ( rule__AtomicExpression__Alternatives ) )
            // InternalKExpressions.g:496:1: ( rule__AtomicExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getAlternatives()); 
            }
            // InternalKExpressions.g:497:1: ( rule__AtomicExpression__Alternatives )
            // InternalKExpressions.g:497:2: rule__AtomicExpression__Alternatives
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
    // InternalKExpressions.g:509:1: entryRuleAtomicValuedExpression : ruleAtomicValuedExpression EOF ;
    public final void entryRuleAtomicValuedExpression() throws RecognitionException {
        try {
            // InternalKExpressions.g:510:1: ( ruleAtomicValuedExpression EOF )
            // InternalKExpressions.g:511:1: ruleAtomicValuedExpression EOF
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
    // InternalKExpressions.g:518:1: ruleAtomicValuedExpression : ( ( rule__AtomicValuedExpression__Alternatives ) ) ;
    public final void ruleAtomicValuedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:522:2: ( ( ( rule__AtomicValuedExpression__Alternatives ) ) )
            // InternalKExpressions.g:523:1: ( ( rule__AtomicValuedExpression__Alternatives ) )
            {
            // InternalKExpressions.g:523:1: ( ( rule__AtomicValuedExpression__Alternatives ) )
            // InternalKExpressions.g:524:1: ( rule__AtomicValuedExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getAlternatives()); 
            }
            // InternalKExpressions.g:525:1: ( rule__AtomicValuedExpression__Alternatives )
            // InternalKExpressions.g:525:2: rule__AtomicValuedExpression__Alternatives
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
    // InternalKExpressions.g:537:1: entryRuleValuedObjectTestExpression : ruleValuedObjectTestExpression EOF ;
    public final void entryRuleValuedObjectTestExpression() throws RecognitionException {
        try {
            // InternalKExpressions.g:538:1: ( ruleValuedObjectTestExpression EOF )
            // InternalKExpressions.g:539:1: ruleValuedObjectTestExpression EOF
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
    // InternalKExpressions.g:546:1: ruleValuedObjectTestExpression : ( ( rule__ValuedObjectTestExpression__Alternatives ) ) ;
    public final void ruleValuedObjectTestExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:550:2: ( ( ( rule__ValuedObjectTestExpression__Alternatives ) ) )
            // InternalKExpressions.g:551:1: ( ( rule__ValuedObjectTestExpression__Alternatives ) )
            {
            // InternalKExpressions.g:551:1: ( ( rule__ValuedObjectTestExpression__Alternatives ) )
            // InternalKExpressions.g:552:1: ( rule__ValuedObjectTestExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getAlternatives()); 
            }
            // InternalKExpressions.g:553:1: ( rule__ValuedObjectTestExpression__Alternatives )
            // InternalKExpressions.g:553:2: rule__ValuedObjectTestExpression__Alternatives
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
    // InternalKExpressions.g:565:1: entryRuleValuedObjectReference : ruleValuedObjectReference EOF ;
    public final void entryRuleValuedObjectReference() throws RecognitionException {
        try {
            // InternalKExpressions.g:566:1: ( ruleValuedObjectReference EOF )
            // InternalKExpressions.g:567:1: ruleValuedObjectReference EOF
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
    // InternalKExpressions.g:574:1: ruleValuedObjectReference : ( ( rule__ValuedObjectReference__ValuedObjectAssignment ) ) ;
    public final void ruleValuedObjectReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:578:2: ( ( ( rule__ValuedObjectReference__ValuedObjectAssignment ) ) )
            // InternalKExpressions.g:579:1: ( ( rule__ValuedObjectReference__ValuedObjectAssignment ) )
            {
            // InternalKExpressions.g:579:1: ( ( rule__ValuedObjectReference__ValuedObjectAssignment ) )
            // InternalKExpressions.g:580:1: ( rule__ValuedObjectReference__ValuedObjectAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectAssignment()); 
            }
            // InternalKExpressions.g:581:1: ( rule__ValuedObjectReference__ValuedObjectAssignment )
            // InternalKExpressions.g:581:2: rule__ValuedObjectReference__ValuedObjectAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ValuedObjectReference__ValuedObjectAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "ruleValuedObjectReference"


    // $ANTLR start "entryRuleTextExpression"
    // InternalKExpressions.g:593:1: entryRuleTextExpression : ruleTextExpression EOF ;
    public final void entryRuleTextExpression() throws RecognitionException {
        try {
            // InternalKExpressions.g:594:1: ( ruleTextExpression EOF )
            // InternalKExpressions.g:595:1: ruleTextExpression EOF
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
    // InternalKExpressions.g:602:1: ruleTextExpression : ( ( rule__TextExpression__Group__0 ) ) ;
    public final void ruleTextExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:606:2: ( ( ( rule__TextExpression__Group__0 ) ) )
            // InternalKExpressions.g:607:1: ( ( rule__TextExpression__Group__0 ) )
            {
            // InternalKExpressions.g:607:1: ( ( rule__TextExpression__Group__0 ) )
            // InternalKExpressions.g:608:1: ( rule__TextExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getGroup()); 
            }
            // InternalKExpressions.g:609:1: ( rule__TextExpression__Group__0 )
            // InternalKExpressions.g:609:2: rule__TextExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TextExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "ruleTextExpression"


    // $ANTLR start "entryRuleIntValue"
    // InternalKExpressions.g:621:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // InternalKExpressions.g:622:1: ( ruleIntValue EOF )
            // InternalKExpressions.g:623:1: ruleIntValue EOF
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
    // InternalKExpressions.g:630:1: ruleIntValue : ( ( rule__IntValue__ValueAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:634:2: ( ( ( rule__IntValue__ValueAssignment ) ) )
            // InternalKExpressions.g:635:1: ( ( rule__IntValue__ValueAssignment ) )
            {
            // InternalKExpressions.g:635:1: ( ( rule__IntValue__ValueAssignment ) )
            // InternalKExpressions.g:636:1: ( rule__IntValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            }
            // InternalKExpressions.g:637:1: ( rule__IntValue__ValueAssignment )
            // InternalKExpressions.g:637:2: rule__IntValue__ValueAssignment
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
    // InternalKExpressions.g:649:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // InternalKExpressions.g:650:1: ( ruleFloatValue EOF )
            // InternalKExpressions.g:651:1: ruleFloatValue EOF
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
    // InternalKExpressions.g:658:1: ruleFloatValue : ( ( rule__FloatValue__ValueAssignment ) ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:662:2: ( ( ( rule__FloatValue__ValueAssignment ) ) )
            // InternalKExpressions.g:663:1: ( ( rule__FloatValue__ValueAssignment ) )
            {
            // InternalKExpressions.g:663:1: ( ( rule__FloatValue__ValueAssignment ) )
            // InternalKExpressions.g:664:1: ( rule__FloatValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueAssignment()); 
            }
            // InternalKExpressions.g:665:1: ( rule__FloatValue__ValueAssignment )
            // InternalKExpressions.g:665:2: rule__FloatValue__ValueAssignment
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


    // $ANTLR start "entryRuleBooleanValue"
    // InternalKExpressions.g:677:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // InternalKExpressions.g:678:1: ( ruleBooleanValue EOF )
            // InternalKExpressions.g:679:1: ruleBooleanValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleBooleanValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueRule()); 
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
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalKExpressions.g:686:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:690:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // InternalKExpressions.g:691:1: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // InternalKExpressions.g:691:1: ( ( rule__BooleanValue__ValueAssignment ) )
            // InternalKExpressions.g:692:1: ( rule__BooleanValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            }
            // InternalKExpressions.g:693:1: ( rule__BooleanValue__ValueAssignment )
            // InternalKExpressions.g:693:2: rule__BooleanValue__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BooleanValue__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleInterfaceDeclaration"
    // InternalKExpressions.g:707:1: entryRuleInterfaceDeclaration : ruleInterfaceDeclaration EOF ;
    public final void entryRuleInterfaceDeclaration() throws RecognitionException {
        try {
            // InternalKExpressions.g:708:1: ( ruleInterfaceDeclaration EOF )
            // InternalKExpressions.g:709:1: ruleInterfaceDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleInterfaceDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceDeclarationRule()); 
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
    // $ANTLR end "entryRuleInterfaceDeclaration"


    // $ANTLR start "ruleInterfaceDeclaration"
    // InternalKExpressions.g:716:1: ruleInterfaceDeclaration : ( ( rule__InterfaceDeclaration__Alternatives ) ) ;
    public final void ruleInterfaceDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:720:2: ( ( ( rule__InterfaceDeclaration__Alternatives ) ) )
            // InternalKExpressions.g:721:1: ( ( rule__InterfaceDeclaration__Alternatives ) )
            {
            // InternalKExpressions.g:721:1: ( ( rule__InterfaceDeclaration__Alternatives ) )
            // InternalKExpressions.g:722:1: ( rule__InterfaceDeclaration__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceDeclarationAccess().getAlternatives()); 
            }
            // InternalKExpressions.g:723:1: ( rule__InterfaceDeclaration__Alternatives )
            // InternalKExpressions.g:723:2: rule__InterfaceDeclaration__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceDeclaration__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceDeclarationAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterfaceDeclaration"


    // $ANTLR start "entryRuleISignal"
    // InternalKExpressions.g:735:1: entryRuleISignal : ruleISignal EOF ;
    public final void entryRuleISignal() throws RecognitionException {
        try {
            // InternalKExpressions.g:736:1: ( ruleISignal EOF )
            // InternalKExpressions.g:737:1: ruleISignal EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getISignalRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleISignal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getISignalRule()); 
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
    // $ANTLR end "entryRuleISignal"


    // $ANTLR start "ruleISignal"
    // InternalKExpressions.g:744:1: ruleISignal : ( ( rule__ISignal__Group__0 ) ) ;
    public final void ruleISignal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:748:2: ( ( ( rule__ISignal__Group__0 ) ) )
            // InternalKExpressions.g:749:1: ( ( rule__ISignal__Group__0 ) )
            {
            // InternalKExpressions.g:749:1: ( ( rule__ISignal__Group__0 ) )
            // InternalKExpressions.g:750:1: ( rule__ISignal__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getISignalAccess().getGroup()); 
            }
            // InternalKExpressions.g:751:1: ( rule__ISignal__Group__0 )
            // InternalKExpressions.g:751:2: rule__ISignal__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ISignal__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getISignalAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleISignal"


    // $ANTLR start "entryRuleInterfaceSignalDecl"
    // InternalKExpressions.g:763:1: entryRuleInterfaceSignalDecl : ruleInterfaceSignalDecl EOF ;
    public final void entryRuleInterfaceSignalDecl() throws RecognitionException {
        try {
            // InternalKExpressions.g:764:1: ( ruleInterfaceSignalDecl EOF )
            // InternalKExpressions.g:765:1: ruleInterfaceSignalDecl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleInterfaceSignalDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceSignalDeclRule()); 
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
    // $ANTLR end "entryRuleInterfaceSignalDecl"


    // $ANTLR start "ruleInterfaceSignalDecl"
    // InternalKExpressions.g:772:1: ruleInterfaceSignalDecl : ( ( rule__InterfaceSignalDecl__Alternatives ) ) ;
    public final void ruleInterfaceSignalDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:776:2: ( ( ( rule__InterfaceSignalDecl__Alternatives ) ) )
            // InternalKExpressions.g:777:1: ( ( rule__InterfaceSignalDecl__Alternatives ) )
            {
            // InternalKExpressions.g:777:1: ( ( rule__InterfaceSignalDecl__Alternatives ) )
            // InternalKExpressions.g:778:1: ( rule__InterfaceSignalDecl__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getAlternatives()); 
            }
            // InternalKExpressions.g:779:1: ( rule__InterfaceSignalDecl__Alternatives )
            // InternalKExpressions.g:779:2: rule__InterfaceSignalDecl__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceSignalDecl__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceSignalDeclAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterfaceSignalDecl"


    // $ANTLR start "entryRuleChannelDescription"
    // InternalKExpressions.g:791:1: entryRuleChannelDescription : ruleChannelDescription EOF ;
    public final void entryRuleChannelDescription() throws RecognitionException {
        try {
            // InternalKExpressions.g:792:1: ( ruleChannelDescription EOF )
            // InternalKExpressions.g:793:1: ruleChannelDescription EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChannelDescriptionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleChannelDescription();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChannelDescriptionRule()); 
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
    // $ANTLR end "entryRuleChannelDescription"


    // $ANTLR start "ruleChannelDescription"
    // InternalKExpressions.g:800:1: ruleChannelDescription : ( ( rule__ChannelDescription__Alternatives ) ) ;
    public final void ruleChannelDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:804:2: ( ( ( rule__ChannelDescription__Alternatives ) ) )
            // InternalKExpressions.g:805:1: ( ( rule__ChannelDescription__Alternatives ) )
            {
            // InternalKExpressions.g:805:1: ( ( rule__ChannelDescription__Alternatives ) )
            // InternalKExpressions.g:806:1: ( rule__ChannelDescription__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChannelDescriptionAccess().getAlternatives()); 
            }
            // InternalKExpressions.g:807:1: ( rule__ChannelDescription__Alternatives )
            // InternalKExpressions.g:807:2: rule__ChannelDescription__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChannelDescription__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChannelDescriptionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChannelDescription"


    // $ANTLR start "entryRuleInterfaceVariableDecl"
    // InternalKExpressions.g:819:1: entryRuleInterfaceVariableDecl : ruleInterfaceVariableDecl EOF ;
    public final void entryRuleInterfaceVariableDecl() throws RecognitionException {
        try {
            // InternalKExpressions.g:820:1: ( ruleInterfaceVariableDecl EOF )
            // InternalKExpressions.g:821:1: ruleInterfaceVariableDecl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceVariableDeclRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleInterfaceVariableDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceVariableDeclRule()); 
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
    // $ANTLR end "entryRuleInterfaceVariableDecl"


    // $ANTLR start "ruleInterfaceVariableDecl"
    // InternalKExpressions.g:828:1: ruleInterfaceVariableDecl : ( ( rule__InterfaceVariableDecl__Group__0 ) ) ;
    public final void ruleInterfaceVariableDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:832:2: ( ( ( rule__InterfaceVariableDecl__Group__0 ) ) )
            // InternalKExpressions.g:833:1: ( ( rule__InterfaceVariableDecl__Group__0 ) )
            {
            // InternalKExpressions.g:833:1: ( ( rule__InterfaceVariableDecl__Group__0 ) )
            // InternalKExpressions.g:834:1: ( rule__InterfaceVariableDecl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceVariableDeclAccess().getGroup()); 
            }
            // InternalKExpressions.g:835:1: ( rule__InterfaceVariableDecl__Group__0 )
            // InternalKExpressions.g:835:2: rule__InterfaceVariableDecl__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceVariableDecl__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceVariableDeclAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterfaceVariableDecl"


    // $ANTLR start "entryRuleVariableDecl"
    // InternalKExpressions.g:847:1: entryRuleVariableDecl : ruleVariableDecl EOF ;
    public final void entryRuleVariableDecl() throws RecognitionException {
        try {
            // InternalKExpressions.g:848:1: ( ruleVariableDecl EOF )
            // InternalKExpressions.g:849:1: ruleVariableDecl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleVariableDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclRule()); 
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
    // $ANTLR end "entryRuleVariableDecl"


    // $ANTLR start "ruleVariableDecl"
    // InternalKExpressions.g:856:1: ruleVariableDecl : ( ( rule__VariableDecl__Group__0 ) ) ;
    public final void ruleVariableDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:860:2: ( ( ( rule__VariableDecl__Group__0 ) ) )
            // InternalKExpressions.g:861:1: ( ( rule__VariableDecl__Group__0 ) )
            {
            // InternalKExpressions.g:861:1: ( ( rule__VariableDecl__Group__0 ) )
            // InternalKExpressions.g:862:1: ( rule__VariableDecl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclAccess().getGroup()); 
            }
            // InternalKExpressions.g:863:1: ( rule__VariableDecl__Group__0 )
            // InternalKExpressions.g:863:2: rule__VariableDecl__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VariableDecl__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableDecl"


    // $ANTLR start "entryRuleIVariable"
    // InternalKExpressions.g:875:1: entryRuleIVariable : ruleIVariable EOF ;
    public final void entryRuleIVariable() throws RecognitionException {
        try {
            // InternalKExpressions.g:876:1: ( ruleIVariable EOF )
            // InternalKExpressions.g:877:1: ruleIVariable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIVariableRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleIVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIVariableRule()); 
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
    // $ANTLR end "entryRuleIVariable"


    // $ANTLR start "ruleIVariable"
    // InternalKExpressions.g:884:1: ruleIVariable : ( ( rule__IVariable__Group__0 ) ) ;
    public final void ruleIVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:888:2: ( ( ( rule__IVariable__Group__0 ) ) )
            // InternalKExpressions.g:889:1: ( ( rule__IVariable__Group__0 ) )
            {
            // InternalKExpressions.g:889:1: ( ( rule__IVariable__Group__0 ) )
            // InternalKExpressions.g:890:1: ( rule__IVariable__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIVariableAccess().getGroup()); 
            }
            // InternalKExpressions.g:891:1: ( rule__IVariable__Group__0 )
            // InternalKExpressions.g:891:2: rule__IVariable__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IVariable__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIVariableAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIVariable"


    // $ANTLR start "entryRuleTypeIdentifier"
    // InternalKExpressions.g:903:1: entryRuleTypeIdentifier : ruleTypeIdentifier EOF ;
    public final void entryRuleTypeIdentifier() throws RecognitionException {
        try {
            // InternalKExpressions.g:904:1: ( ruleTypeIdentifier EOF )
            // InternalKExpressions.g:905:1: ruleTypeIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTypeIdentifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeIdentifierRule()); 
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
    // $ANTLR end "entryRuleTypeIdentifier"


    // $ANTLR start "ruleTypeIdentifier"
    // InternalKExpressions.g:912:1: ruleTypeIdentifier : ( ( rule__TypeIdentifier__Alternatives ) ) ;
    public final void ruleTypeIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:916:2: ( ( ( rule__TypeIdentifier__Alternatives ) ) )
            // InternalKExpressions.g:917:1: ( ( rule__TypeIdentifier__Alternatives ) )
            {
            // InternalKExpressions.g:917:1: ( ( rule__TypeIdentifier__Alternatives ) )
            // InternalKExpressions.g:918:1: ( rule__TypeIdentifier__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeIdentifierAccess().getAlternatives()); 
            }
            // InternalKExpressions.g:919:1: ( rule__TypeIdentifier__Alternatives )
            // InternalKExpressions.g:919:2: rule__TypeIdentifier__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypeIdentifier__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeIdentifierAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeIdentifier"


    // $ANTLR start "entryRuleCommentAnnotation"
    // InternalKExpressions.g:941:1: entryRuleCommentAnnotation : ruleCommentAnnotation EOF ;
    public final void entryRuleCommentAnnotation() throws RecognitionException {
        try {
            // InternalKExpressions.g:942:1: ( ruleCommentAnnotation EOF )
            // InternalKExpressions.g:943:1: ruleCommentAnnotation EOF
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
    // InternalKExpressions.g:950:1: ruleCommentAnnotation : ( ( rule__CommentAnnotation__ValuesAssignment ) ) ;
    public final void ruleCommentAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:954:2: ( ( ( rule__CommentAnnotation__ValuesAssignment ) ) )
            // InternalKExpressions.g:955:1: ( ( rule__CommentAnnotation__ValuesAssignment ) )
            {
            // InternalKExpressions.g:955:1: ( ( rule__CommentAnnotation__ValuesAssignment ) )
            // InternalKExpressions.g:956:1: ( rule__CommentAnnotation__ValuesAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationAccess().getValuesAssignment()); 
            }
            // InternalKExpressions.g:957:1: ( rule__CommentAnnotation__ValuesAssignment )
            // InternalKExpressions.g:957:2: rule__CommentAnnotation__ValuesAssignment
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
    // InternalKExpressions.g:971:1: entryRuleTagAnnotation : ruleTagAnnotation EOF ;
    public final void entryRuleTagAnnotation() throws RecognitionException {
        try {
            // InternalKExpressions.g:972:1: ( ruleTagAnnotation EOF )
            // InternalKExpressions.g:973:1: ruleTagAnnotation EOF
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
    // InternalKExpressions.g:980:1: ruleTagAnnotation : ( ( rule__TagAnnotation__Group__0 ) ) ;
    public final void ruleTagAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:984:2: ( ( ( rule__TagAnnotation__Group__0 ) ) )
            // InternalKExpressions.g:985:1: ( ( rule__TagAnnotation__Group__0 ) )
            {
            // InternalKExpressions.g:985:1: ( ( rule__TagAnnotation__Group__0 ) )
            // InternalKExpressions.g:986:1: ( rule__TagAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getGroup()); 
            }
            // InternalKExpressions.g:987:1: ( rule__TagAnnotation__Group__0 )
            // InternalKExpressions.g:987:2: rule__TagAnnotation__Group__0
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
    // InternalKExpressions.g:999:1: entryRulePragmaTag : rulePragmaTag EOF ;
    public final void entryRulePragmaTag() throws RecognitionException {
        try {
            // InternalKExpressions.g:1000:1: ( rulePragmaTag EOF )
            // InternalKExpressions.g:1001:1: rulePragmaTag EOF
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
    // InternalKExpressions.g:1008:1: rulePragmaTag : ( ( rule__PragmaTag__Group__0 ) ) ;
    public final void rulePragmaTag() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1012:2: ( ( ( rule__PragmaTag__Group__0 ) ) )
            // InternalKExpressions.g:1013:1: ( ( rule__PragmaTag__Group__0 ) )
            {
            // InternalKExpressions.g:1013:1: ( ( rule__PragmaTag__Group__0 ) )
            // InternalKExpressions.g:1014:1: ( rule__PragmaTag__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPragmaTagAccess().getGroup()); 
            }
            // InternalKExpressions.g:1015:1: ( rule__PragmaTag__Group__0 )
            // InternalKExpressions.g:1015:2: rule__PragmaTag__Group__0
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
    // InternalKExpressions.g:1027:1: entryRuleKeyStringValueAnnotation : ruleKeyStringValueAnnotation EOF ;
    public final void entryRuleKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKExpressions.g:1028:1: ( ruleKeyStringValueAnnotation EOF )
            // InternalKExpressions.g:1029:1: ruleKeyStringValueAnnotation EOF
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
    // InternalKExpressions.g:1036:1: ruleKeyStringValueAnnotation : ( ( rule__KeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1040:2: ( ( ( rule__KeyStringValueAnnotation__Group__0 ) ) )
            // InternalKExpressions.g:1041:1: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKExpressions.g:1041:1: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            // InternalKExpressions.g:1042:1: ( rule__KeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKExpressions.g:1043:1: ( rule__KeyStringValueAnnotation__Group__0 )
            // InternalKExpressions.g:1043:2: rule__KeyStringValueAnnotation__Group__0
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
    // InternalKExpressions.g:1055:1: entryRuleRestrictedKeyStringValueAnnotation : ruleRestrictedKeyStringValueAnnotation EOF ;
    public final void entryRuleRestrictedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKExpressions.g:1056:1: ( ruleRestrictedKeyStringValueAnnotation EOF )
            // InternalKExpressions.g:1057:1: ruleRestrictedKeyStringValueAnnotation EOF
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
    // InternalKExpressions.g:1064:1: ruleRestrictedKeyStringValueAnnotation : ( ( rule__RestrictedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleRestrictedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1068:2: ( ( ( rule__RestrictedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKExpressions.g:1069:1: ( ( rule__RestrictedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKExpressions.g:1069:1: ( ( rule__RestrictedKeyStringValueAnnotation__Group__0 ) )
            // InternalKExpressions.g:1070:1: ( rule__RestrictedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKExpressions.g:1071:1: ( rule__RestrictedKeyStringValueAnnotation__Group__0 )
            // InternalKExpressions.g:1071:2: rule__RestrictedKeyStringValueAnnotation__Group__0
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
    // InternalKExpressions.g:1083:1: entryRuleStringPragma : ruleStringPragma EOF ;
    public final void entryRuleStringPragma() throws RecognitionException {
        try {
            // InternalKExpressions.g:1084:1: ( ruleStringPragma EOF )
            // InternalKExpressions.g:1085:1: ruleStringPragma EOF
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
    // InternalKExpressions.g:1092:1: ruleStringPragma : ( ( rule__StringPragma__Group__0 ) ) ;
    public final void ruleStringPragma() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1096:2: ( ( ( rule__StringPragma__Group__0 ) ) )
            // InternalKExpressions.g:1097:1: ( ( rule__StringPragma__Group__0 ) )
            {
            // InternalKExpressions.g:1097:1: ( ( rule__StringPragma__Group__0 ) )
            // InternalKExpressions.g:1098:1: ( rule__StringPragma__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPragmaAccess().getGroup()); 
            }
            // InternalKExpressions.g:1099:1: ( rule__StringPragma__Group__0 )
            // InternalKExpressions.g:1099:2: rule__StringPragma__Group__0
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
    // InternalKExpressions.g:1111:1: entryRuleTypedKeyStringValueAnnotation : ruleTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKExpressions.g:1112:1: ( ruleTypedKeyStringValueAnnotation EOF )
            // InternalKExpressions.g:1113:1: ruleTypedKeyStringValueAnnotation EOF
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
    // InternalKExpressions.g:1120:1: ruleTypedKeyStringValueAnnotation : ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1124:2: ( ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKExpressions.g:1125:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKExpressions.g:1125:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            // InternalKExpressions.g:1126:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKExpressions.g:1127:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            // InternalKExpressions.g:1127:2: rule__TypedKeyStringValueAnnotation__Group__0
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
    // InternalKExpressions.g:1139:1: entryRuleRestrictedTypedKeyStringValueAnnotation : ruleRestrictedTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleRestrictedTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKExpressions.g:1140:1: ( ruleRestrictedTypedKeyStringValueAnnotation EOF )
            // InternalKExpressions.g:1141:1: ruleRestrictedTypedKeyStringValueAnnotation EOF
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
    // InternalKExpressions.g:1148:1: ruleRestrictedTypedKeyStringValueAnnotation : ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleRestrictedTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1152:2: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKExpressions.g:1153:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKExpressions.g:1153:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 ) )
            // InternalKExpressions.g:1154:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKExpressions.g:1155:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 )
            // InternalKExpressions.g:1155:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__0
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
    // InternalKExpressions.g:1167:1: entryRuleQuotedKeyStringValueAnnotation : ruleQuotedKeyStringValueAnnotation EOF ;
    public final void entryRuleQuotedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKExpressions.g:1168:1: ( ruleQuotedKeyStringValueAnnotation EOF )
            // InternalKExpressions.g:1169:1: ruleQuotedKeyStringValueAnnotation EOF
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
    // InternalKExpressions.g:1176:1: ruleQuotedKeyStringValueAnnotation : ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleQuotedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1180:2: ( ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKExpressions.g:1181:1: ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKExpressions.g:1181:1: ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) )
            // InternalKExpressions.g:1182:1: ( rule__QuotedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKExpressions.g:1183:1: ( rule__QuotedKeyStringValueAnnotation__Group__0 )
            // InternalKExpressions.g:1183:2: rule__QuotedKeyStringValueAnnotation__Group__0
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
    // InternalKExpressions.g:1195:1: entryRuleQuotedTypedKeyStringValueAnnotation : ruleQuotedTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKExpressions.g:1196:1: ( ruleQuotedTypedKeyStringValueAnnotation EOF )
            // InternalKExpressions.g:1197:1: ruleQuotedTypedKeyStringValueAnnotation EOF
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
    // InternalKExpressions.g:1204:1: ruleQuotedTypedKeyStringValueAnnotation : ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1208:2: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKExpressions.g:1209:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKExpressions.g:1209:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) )
            // InternalKExpressions.g:1210:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKExpressions.g:1211:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 )
            // InternalKExpressions.g:1211:2: rule__QuotedTypedKeyStringValueAnnotation__Group__0
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
    // InternalKExpressions.g:1225:1: entryRuleEStringBoolean : ruleEStringBoolean EOF ;
    public final void entryRuleEStringBoolean() throws RecognitionException {
        try {
            // InternalKExpressions.g:1226:1: ( ruleEStringBoolean EOF )
            // InternalKExpressions.g:1227:1: ruleEStringBoolean EOF
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
    // InternalKExpressions.g:1234:1: ruleEStringBoolean : ( ( rule__EStringBoolean__Alternatives ) ) ;
    public final void ruleEStringBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1238:2: ( ( ( rule__EStringBoolean__Alternatives ) ) )
            // InternalKExpressions.g:1239:1: ( ( rule__EStringBoolean__Alternatives ) )
            {
            // InternalKExpressions.g:1239:1: ( ( rule__EStringBoolean__Alternatives ) )
            // InternalKExpressions.g:1240:1: ( rule__EStringBoolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringBooleanAccess().getAlternatives()); 
            }
            // InternalKExpressions.g:1241:1: ( rule__EStringBoolean__Alternatives )
            // InternalKExpressions.g:1241:2: rule__EStringBoolean__Alternatives
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
    // InternalKExpressions.g:1253:1: entryRuleEStringAllTypes : ruleEStringAllTypes EOF ;
    public final void entryRuleEStringAllTypes() throws RecognitionException {
        try {
            // InternalKExpressions.g:1254:1: ( ruleEStringAllTypes EOF )
            // InternalKExpressions.g:1255:1: ruleEStringAllTypes EOF
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
    // InternalKExpressions.g:1262:1: ruleEStringAllTypes : ( ( rule__EStringAllTypes__Alternatives ) ) ;
    public final void ruleEStringAllTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1266:2: ( ( ( rule__EStringAllTypes__Alternatives ) ) )
            // InternalKExpressions.g:1267:1: ( ( rule__EStringAllTypes__Alternatives ) )
            {
            // InternalKExpressions.g:1267:1: ( ( rule__EStringAllTypes__Alternatives ) )
            // InternalKExpressions.g:1268:1: ( rule__EStringAllTypes__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAllTypesAccess().getAlternatives()); 
            }
            // InternalKExpressions.g:1269:1: ( rule__EStringAllTypes__Alternatives )
            // InternalKExpressions.g:1269:2: rule__EStringAllTypes__Alternatives
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
    // InternalKExpressions.g:1281:1: entryRuleExtendedID : ruleExtendedID EOF ;
    public final void entryRuleExtendedID() throws RecognitionException {
        try {
            // InternalKExpressions.g:1282:1: ( ruleExtendedID EOF )
            // InternalKExpressions.g:1283:1: ruleExtendedID EOF
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
    // InternalKExpressions.g:1290:1: ruleExtendedID : ( ( rule__ExtendedID__Group__0 ) ) ;
    public final void ruleExtendedID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1294:2: ( ( ( rule__ExtendedID__Group__0 ) ) )
            // InternalKExpressions.g:1295:1: ( ( rule__ExtendedID__Group__0 ) )
            {
            // InternalKExpressions.g:1295:1: ( ( rule__ExtendedID__Group__0 ) )
            // InternalKExpressions.g:1296:1: ( rule__ExtendedID__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup()); 
            }
            // InternalKExpressions.g:1297:1: ( rule__ExtendedID__Group__0 )
            // InternalKExpressions.g:1297:2: rule__ExtendedID__Group__0
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
    // InternalKExpressions.g:1311:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // InternalKExpressions.g:1312:1: ( ruleInteger EOF )
            // InternalKExpressions.g:1313:1: ruleInteger EOF
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
    // InternalKExpressions.g:1320:1: ruleInteger : ( ( rule__Integer__Group__0 ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1324:2: ( ( ( rule__Integer__Group__0 ) ) )
            // InternalKExpressions.g:1325:1: ( ( rule__Integer__Group__0 ) )
            {
            // InternalKExpressions.g:1325:1: ( ( rule__Integer__Group__0 ) )
            // InternalKExpressions.g:1326:1: ( rule__Integer__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getGroup()); 
            }
            // InternalKExpressions.g:1327:1: ( rule__Integer__Group__0 )
            // InternalKExpressions.g:1327:2: rule__Integer__Group__0
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
    // InternalKExpressions.g:1339:1: entryRuleFloateger : ruleFloateger EOF ;
    public final void entryRuleFloateger() throws RecognitionException {
        try {
            // InternalKExpressions.g:1340:1: ( ruleFloateger EOF )
            // InternalKExpressions.g:1341:1: ruleFloateger EOF
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
    // InternalKExpressions.g:1348:1: ruleFloateger : ( ( rule__Floateger__Group__0 ) ) ;
    public final void ruleFloateger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1352:2: ( ( ( rule__Floateger__Group__0 ) ) )
            // InternalKExpressions.g:1353:1: ( ( rule__Floateger__Group__0 ) )
            {
            // InternalKExpressions.g:1353:1: ( ( rule__Floateger__Group__0 ) )
            // InternalKExpressions.g:1354:1: ( rule__Floateger__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloategerAccess().getGroup()); 
            }
            // InternalKExpressions.g:1355:1: ( rule__Floateger__Group__0 )
            // InternalKExpressions.g:1355:2: rule__Floateger__Group__0
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
    // InternalKExpressions.g:1368:1: ruleCompareOperator : ( ( rule__CompareOperator__Alternatives ) ) ;
    public final void ruleCompareOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1372:1: ( ( ( rule__CompareOperator__Alternatives ) ) )
            // InternalKExpressions.g:1373:1: ( ( rule__CompareOperator__Alternatives ) )
            {
            // InternalKExpressions.g:1373:1: ( ( rule__CompareOperator__Alternatives ) )
            // InternalKExpressions.g:1374:1: ( rule__CompareOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            }
            // InternalKExpressions.g:1375:1: ( rule__CompareOperator__Alternatives )
            // InternalKExpressions.g:1375:2: rule__CompareOperator__Alternatives
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
    // InternalKExpressions.g:1387:1: rulePreOperator : ( ( 'pre' ) ) ;
    public final void rulePreOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1391:1: ( ( ( 'pre' ) ) )
            // InternalKExpressions.g:1392:1: ( ( 'pre' ) )
            {
            // InternalKExpressions.g:1392:1: ( ( 'pre' ) )
            // InternalKExpressions.g:1393:1: ( 'pre' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreOperatorAccess().getPREEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1394:1: ( 'pre' )
            // InternalKExpressions.g:1394:3: 'pre'
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


    // $ANTLR start "ruleOrOperator"
    // InternalKExpressions.g:1407:1: ruleOrOperator : ( ( 'or' ) ) ;
    public final void ruleOrOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1411:1: ( ( ( 'or' ) ) )
            // InternalKExpressions.g:1412:1: ( ( 'or' ) )
            {
            // InternalKExpressions.g:1412:1: ( ( 'or' ) )
            // InternalKExpressions.g:1413:1: ( 'or' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrOperatorAccess().getOREnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1414:1: ( 'or' )
            // InternalKExpressions.g:1414:3: 'or'
            {
            match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "ruleOrOperator"


    // $ANTLR start "ruleAndOperator"
    // InternalKExpressions.g:1427:1: ruleAndOperator : ( ( 'and' ) ) ;
    public final void ruleAndOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1431:1: ( ( ( 'and' ) ) )
            // InternalKExpressions.g:1432:1: ( ( 'and' ) )
            {
            // InternalKExpressions.g:1432:1: ( ( 'and' ) )
            // InternalKExpressions.g:1433:1: ( 'and' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndOperatorAccess().getANDEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1434:1: ( 'and' )
            // InternalKExpressions.g:1434:3: 'and'
            {
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "ruleAndOperator"


    // $ANTLR start "ruleNotOperator"
    // InternalKExpressions.g:1447:1: ruleNotOperator : ( ( 'not' ) ) ;
    public final void ruleNotOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1451:1: ( ( ( 'not' ) ) )
            // InternalKExpressions.g:1452:1: ( ( 'not' ) )
            {
            // InternalKExpressions.g:1452:1: ( ( 'not' ) )
            // InternalKExpressions.g:1453:1: ( 'not' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1454:1: ( 'not' )
            // InternalKExpressions.g:1454:3: 'not'
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
    // InternalKExpressions.g:1467:1: ruleAddOperator : ( ( '+' ) ) ;
    public final void ruleAddOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1471:1: ( ( ( '+' ) ) )
            // InternalKExpressions.g:1472:1: ( ( '+' ) )
            {
            // InternalKExpressions.g:1472:1: ( ( '+' ) )
            // InternalKExpressions.g:1473:1: ( '+' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddOperatorAccess().getADDEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1474:1: ( '+' )
            // InternalKExpressions.g:1474:3: '+'
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
    // InternalKExpressions.g:1487:1: ruleSubOperator : ( ( '-' ) ) ;
    public final void ruleSubOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1491:1: ( ( ( '-' ) ) )
            // InternalKExpressions.g:1492:1: ( ( '-' ) )
            {
            // InternalKExpressions.g:1492:1: ( ( '-' ) )
            // InternalKExpressions.g:1493:1: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubOperatorAccess().getSUBEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1494:1: ( '-' )
            // InternalKExpressions.g:1494:3: '-'
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
    // InternalKExpressions.g:1507:1: ruleMultOperator : ( ( '*' ) ) ;
    public final void ruleMultOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1511:1: ( ( ( '*' ) ) )
            // InternalKExpressions.g:1512:1: ( ( '*' ) )
            {
            // InternalKExpressions.g:1512:1: ( ( '*' ) )
            // InternalKExpressions.g:1513:1: ( '*' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1514:1: ( '*' )
            // InternalKExpressions.g:1514:3: '*'
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
    // InternalKExpressions.g:1527:1: ruleModOperator : ( ( 'mod' ) ) ;
    public final void ruleModOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1531:1: ( ( ( 'mod' ) ) )
            // InternalKExpressions.g:1532:1: ( ( 'mod' ) )
            {
            // InternalKExpressions.g:1532:1: ( ( 'mod' ) )
            // InternalKExpressions.g:1533:1: ( 'mod' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModOperatorAccess().getMODEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1534:1: ( 'mod' )
            // InternalKExpressions.g:1534:3: 'mod'
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
    // InternalKExpressions.g:1547:1: ruleDivOperator : ( ( '/' ) ) ;
    public final void ruleDivOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1551:1: ( ( ( '/' ) ) )
            // InternalKExpressions.g:1552:1: ( ( '/' ) )
            {
            // InternalKExpressions.g:1552:1: ( ( '/' ) )
            // InternalKExpressions.g:1553:1: ( '/' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivOperatorAccess().getDIVEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1554:1: ( '/' )
            // InternalKExpressions.g:1554:3: '/'
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


    // $ANTLR start "ruleValueTestOperator"
    // InternalKExpressions.g:1567:1: ruleValueTestOperator : ( ( '?' ) ) ;
    public final void ruleValueTestOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1571:1: ( ( ( '?' ) ) )
            // InternalKExpressions.g:1572:1: ( ( '?' ) )
            {
            // InternalKExpressions.g:1572:1: ( ( '?' ) )
            // InternalKExpressions.g:1573:1: ( '?' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueTestOperatorAccess().getVALEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1574:1: ( '?' )
            // InternalKExpressions.g:1574:3: '?'
            {
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "ruleValueTestOperator"


    // $ANTLR start "ruleValueType"
    // InternalKExpressions.g:1587:1: ruleValueType : ( ( rule__ValueType__Alternatives ) ) ;
    public final void ruleValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1591:1: ( ( ( rule__ValueType__Alternatives ) ) )
            // InternalKExpressions.g:1592:1: ( ( rule__ValueType__Alternatives ) )
            {
            // InternalKExpressions.g:1592:1: ( ( rule__ValueType__Alternatives ) )
            // InternalKExpressions.g:1593:1: ( rule__ValueType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueTypeAccess().getAlternatives()); 
            }
            // InternalKExpressions.g:1594:1: ( rule__ValueType__Alternatives )
            // InternalKExpressions.g:1594:2: rule__ValueType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ValueType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValueType"


    // $ANTLR start "ruleCombineOperator"
    // InternalKExpressions.g:1606:1: ruleCombineOperator : ( ( rule__CombineOperator__Alternatives ) ) ;
    public final void ruleCombineOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1610:1: ( ( ( rule__CombineOperator__Alternatives ) ) )
            // InternalKExpressions.g:1611:1: ( ( rule__CombineOperator__Alternatives ) )
            {
            // InternalKExpressions.g:1611:1: ( ( rule__CombineOperator__Alternatives ) )
            // InternalKExpressions.g:1612:1: ( rule__CombineOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCombineOperatorAccess().getAlternatives()); 
            }
            // InternalKExpressions.g:1613:1: ( rule__CombineOperator__Alternatives )
            // InternalKExpressions.g:1613:2: rule__CombineOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CombineOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCombineOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCombineOperator"


    // $ANTLR start "rule__Root__Alternatives"
    // InternalKExpressions.g:1624:1: rule__Root__Alternatives : ( ( ruleExpression ) | ( ruleInterfaceDeclaration ) );
    public final void rule__Root__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1628:1: ( ( ruleExpression ) | ( ruleInterfaceDeclaration ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=RULE_BOOLEAN && LA1_0<=RULE_HOSTCODE)||LA1_0==17||LA1_0==20||LA1_0==22||LA1_0==26||LA1_0==45) ) {
                alt1=1;
            }
            else if ( (LA1_0==47||(LA1_0>=50 && LA1_0<=52)||LA1_0==55) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalKExpressions.g:1629:1: ( ruleExpression )
                    {
                    // InternalKExpressions.g:1629:1: ( ruleExpression )
                    // InternalKExpressions.g:1630:1: ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRootAccess().getExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRootAccess().getExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:1635:6: ( ruleInterfaceDeclaration )
                    {
                    // InternalKExpressions.g:1635:6: ( ruleInterfaceDeclaration )
                    // InternalKExpressions.g:1636:1: ruleInterfaceDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRootAccess().getInterfaceDeclarationParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleInterfaceDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRootAccess().getInterfaceDeclarationParserRuleCall_1()); 
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
    // $ANTLR end "rule__Root__Alternatives"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalKExpressions.g:1646:1: rule__Expression__Alternatives : ( ( ( ruleBooleanExpression ) ) | ( ruleValuedExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1650:1: ( ( ( ruleBooleanExpression ) ) | ( ruleValuedExpression ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalKExpressions.g:1651:1: ( ( ruleBooleanExpression ) )
                    {
                    // InternalKExpressions.g:1651:1: ( ( ruleBooleanExpression ) )
                    // InternalKExpressions.g:1652:1: ( ruleBooleanExpression )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall_0()); 
                    }
                    // InternalKExpressions.g:1653:1: ( ruleBooleanExpression )
                    // InternalKExpressions.g:1653:3: ruleBooleanExpression
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleBooleanExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:1657:6: ( ruleValuedExpression )
                    {
                    // InternalKExpressions.g:1657:6: ( ruleValuedExpression )
                    // InternalKExpressions.g:1658:1: ruleValuedExpression
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


    // $ANTLR start "rule__CompareOperation__Alternatives"
    // InternalKExpressions.g:1668:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );
    public final void rule__CompareOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1672:1: ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalKExpressions.g:1673:1: ( ( rule__CompareOperation__Group_0__0 ) )
                    {
                    // InternalKExpressions.g:1673:1: ( ( rule__CompareOperation__Group_0__0 ) )
                    // InternalKExpressions.g:1674:1: ( rule__CompareOperation__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperationAccess().getGroup_0()); 
                    }
                    // InternalKExpressions.g:1675:1: ( rule__CompareOperation__Group_0__0 )
                    // InternalKExpressions.g:1675:2: rule__CompareOperation__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__CompareOperation__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperationAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:1679:6: ( ruleNotExpression )
                    {
                    // InternalKExpressions.g:1679:6: ( ruleNotExpression )
                    // InternalKExpressions.g:1680:1: ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperationAccess().getNotExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleNotExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__CompareOperation__Alternatives"


    // $ANTLR start "rule__NotOrValuedExpression__Alternatives"
    // InternalKExpressions.g:1690:1: rule__NotOrValuedExpression__Alternatives : ( ( ( ruleValuedExpression ) ) | ( ruleNotExpression ) );
    public final void rule__NotOrValuedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1694:1: ( ( ( ruleValuedExpression ) ) | ( ruleNotExpression ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalKExpressions.g:1695:1: ( ( ruleValuedExpression ) )
                    {
                    // InternalKExpressions.g:1695:1: ( ( ruleValuedExpression ) )
                    // InternalKExpressions.g:1696:1: ( ruleValuedExpression )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
                    }
                    // InternalKExpressions.g:1697:1: ( ruleValuedExpression )
                    // InternalKExpressions.g:1697:3: ruleValuedExpression
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:1701:6: ( ruleNotExpression )
                    {
                    // InternalKExpressions.g:1701:6: ( ruleNotExpression )
                    // InternalKExpressions.g:1702:1: ruleNotExpression
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
    // InternalKExpressions.g:1712:1: rule__NotExpression__Alternatives : ( ( ( rule__NotExpression__Group_0__0 ) ) | ( ruleAtomicExpression ) );
    public final void rule__NotExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1716:1: ( ( ( rule__NotExpression__Group_0__0 ) ) | ( ruleAtomicExpression ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=RULE_BOOLEAN && LA5_0<=RULE_ID)||LA5_0==RULE_HOSTCODE||LA5_0==17||LA5_0==26||LA5_0==45) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalKExpressions.g:1717:1: ( ( rule__NotExpression__Group_0__0 ) )
                    {
                    // InternalKExpressions.g:1717:1: ( ( rule__NotExpression__Group_0__0 ) )
                    // InternalKExpressions.g:1718:1: ( rule__NotExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNotExpressionAccess().getGroup_0()); 
                    }
                    // InternalKExpressions.g:1719:1: ( rule__NotExpression__Group_0__0 )
                    // InternalKExpressions.g:1719:2: rule__NotExpression__Group_0__0
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
                    // InternalKExpressions.g:1723:6: ( ruleAtomicExpression )
                    {
                    // InternalKExpressions.g:1723:6: ( ruleAtomicExpression )
                    // InternalKExpressions.g:1724:1: ruleAtomicExpression
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
    // InternalKExpressions.g:1734:1: rule__NegExpression__Alternatives : ( ( ( rule__NegExpression__Group_0__0 ) ) | ( ruleAtomicValuedExpression ) );
    public final void rule__NegExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1738:1: ( ( ( rule__NegExpression__Group_0__0 ) ) | ( ruleAtomicValuedExpression ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_BOOLEAN && LA6_0<=RULE_HOSTCODE)||LA6_0==17||LA6_0==26||LA6_0==45) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalKExpressions.g:1739:1: ( ( rule__NegExpression__Group_0__0 ) )
                    {
                    // InternalKExpressions.g:1739:1: ( ( rule__NegExpression__Group_0__0 ) )
                    // InternalKExpressions.g:1740:1: ( rule__NegExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNegExpressionAccess().getGroup_0()); 
                    }
                    // InternalKExpressions.g:1741:1: ( rule__NegExpression__Group_0__0 )
                    // InternalKExpressions.g:1741:2: rule__NegExpression__Group_0__0
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
                    // InternalKExpressions.g:1745:6: ( ruleAtomicValuedExpression )
                    {
                    // InternalKExpressions.g:1745:6: ( ruleAtomicValuedExpression )
                    // InternalKExpressions.g:1746:1: ruleAtomicValuedExpression
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
    // InternalKExpressions.g:1756:1: rule__AtomicExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleValuedObjectTestExpression ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ruleTextExpression ) );
    public final void rule__AtomicExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1760:1: ( ( ruleBooleanValue ) | ( ruleValuedObjectTestExpression ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ruleTextExpression ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt7=1;
                }
                break;
            case RULE_ID:
            case 17:
            case 26:
                {
                alt7=2;
                }
                break;
            case 45:
                {
                alt7=3;
                }
                break;
            case RULE_HOSTCODE:
                {
                alt7=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalKExpressions.g:1761:1: ( ruleBooleanValue )
                    {
                    // InternalKExpressions.g:1761:1: ( ruleBooleanValue )
                    // InternalKExpressions.g:1762:1: ruleBooleanValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getBooleanValueParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleBooleanValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicExpressionAccess().getBooleanValueParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:1767:6: ( ruleValuedObjectTestExpression )
                    {
                    // InternalKExpressions.g:1767:6: ( ruleValuedObjectTestExpression )
                    // InternalKExpressions.g:1768:1: ruleValuedObjectTestExpression
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
                    // InternalKExpressions.g:1773:6: ( ( rule__AtomicExpression__Group_2__0 ) )
                    {
                    // InternalKExpressions.g:1773:6: ( ( rule__AtomicExpression__Group_2__0 ) )
                    // InternalKExpressions.g:1774:1: ( rule__AtomicExpression__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getGroup_2()); 
                    }
                    // InternalKExpressions.g:1775:1: ( rule__AtomicExpression__Group_2__0 )
                    // InternalKExpressions.g:1775:2: rule__AtomicExpression__Group_2__0
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
                    // InternalKExpressions.g:1779:6: ( ruleTextExpression )
                    {
                    // InternalKExpressions.g:1779:6: ( ruleTextExpression )
                    // InternalKExpressions.g:1780:1: ruleTextExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTextExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__AtomicExpression__Alternatives"


    // $ANTLR start "rule__AtomicValuedExpression__Alternatives"
    // InternalKExpressions.g:1790:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ( rule__AtomicValuedExpression__Group_2__0 ) ) | ( ruleAtomicExpression ) );
    public final void rule__AtomicValuedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1794:1: ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ( rule__AtomicValuedExpression__Group_2__0 ) ) | ( ruleAtomicExpression ) )
            int alt8=4;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalKExpressions.g:1795:1: ( ruleIntValue )
                    {
                    // InternalKExpressions.g:1795:1: ( ruleIntValue )
                    // InternalKExpressions.g:1796:1: ruleIntValue
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
                    // InternalKExpressions.g:1801:6: ( ruleFloatValue )
                    {
                    // InternalKExpressions.g:1801:6: ( ruleFloatValue )
                    // InternalKExpressions.g:1802:1: ruleFloatValue
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
                    // InternalKExpressions.g:1807:6: ( ( rule__AtomicValuedExpression__Group_2__0 ) )
                    {
                    // InternalKExpressions.g:1807:6: ( ( rule__AtomicValuedExpression__Group_2__0 ) )
                    // InternalKExpressions.g:1808:1: ( rule__AtomicValuedExpression__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_2()); 
                    }
                    // InternalKExpressions.g:1809:1: ( rule__AtomicValuedExpression__Group_2__0 )
                    // InternalKExpressions.g:1809:2: rule__AtomicValuedExpression__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__AtomicValuedExpression__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicValuedExpressionAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKExpressions.g:1813:6: ( ruleAtomicExpression )
                    {
                    // InternalKExpressions.g:1813:6: ( ruleAtomicExpression )
                    // InternalKExpressions.g:1814:1: ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getAtomicExpressionParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAtomicExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicValuedExpressionAccess().getAtomicExpressionParserRuleCall_3()); 
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
    // InternalKExpressions.g:1824:1: rule__ValuedObjectTestExpression__Alternatives : ( ( ( rule__ValuedObjectTestExpression__Group_0__0 ) ) | ( ( rule__ValuedObjectTestExpression__Group_1__0 ) ) | ( ruleValuedObjectReference ) );
    public final void rule__ValuedObjectTestExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1828:1: ( ( ( rule__ValuedObjectTestExpression__Group_0__0 ) ) | ( ( rule__ValuedObjectTestExpression__Group_1__0 ) ) | ( ruleValuedObjectReference ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt9=1;
                }
                break;
            case 26:
                {
                alt9=2;
                }
                break;
            case RULE_ID:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalKExpressions.g:1829:1: ( ( rule__ValuedObjectTestExpression__Group_0__0 ) )
                    {
                    // InternalKExpressions.g:1829:1: ( ( rule__ValuedObjectTestExpression__Group_0__0 ) )
                    // InternalKExpressions.g:1830:1: ( rule__ValuedObjectTestExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getGroup_0()); 
                    }
                    // InternalKExpressions.g:1831:1: ( rule__ValuedObjectTestExpression__Group_0__0 )
                    // InternalKExpressions.g:1831:2: rule__ValuedObjectTestExpression__Group_0__0
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
                    // InternalKExpressions.g:1835:6: ( ( rule__ValuedObjectTestExpression__Group_1__0 ) )
                    {
                    // InternalKExpressions.g:1835:6: ( ( rule__ValuedObjectTestExpression__Group_1__0 ) )
                    // InternalKExpressions.g:1836:1: ( rule__ValuedObjectTestExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getGroup_1()); 
                    }
                    // InternalKExpressions.g:1837:1: ( rule__ValuedObjectTestExpression__Group_1__0 )
                    // InternalKExpressions.g:1837:2: rule__ValuedObjectTestExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ValuedObjectTestExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValuedObjectTestExpressionAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKExpressions.g:1841:6: ( ruleValuedObjectReference )
                    {
                    // InternalKExpressions.g:1841:6: ( ruleValuedObjectReference )
                    // InternalKExpressions.g:1842:1: ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getValuedObjectReferenceParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleValuedObjectReference();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__ValuedObjectTestExpression__Alternatives"


    // $ANTLR start "rule__InterfaceDeclaration__Alternatives"
    // InternalKExpressions.g:1853:1: rule__InterfaceDeclaration__Alternatives : ( ( ruleInterfaceSignalDecl ) | ( ruleInterfaceVariableDecl ) );
    public final void rule__InterfaceDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1857:1: ( ( ruleInterfaceSignalDecl ) | ( ruleInterfaceVariableDecl ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==47||(LA10_0>=50 && LA10_0<=52)) ) {
                alt10=1;
            }
            else if ( (LA10_0==55) ) {
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
                    // InternalKExpressions.g:1858:1: ( ruleInterfaceSignalDecl )
                    {
                    // InternalKExpressions.g:1858:1: ( ruleInterfaceSignalDecl )
                    // InternalKExpressions.g:1859:1: ruleInterfaceSignalDecl
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInterfaceDeclarationAccess().getInterfaceSignalDeclParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleInterfaceSignalDecl();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInterfaceDeclarationAccess().getInterfaceSignalDeclParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:1864:6: ( ruleInterfaceVariableDecl )
                    {
                    // InternalKExpressions.g:1864:6: ( ruleInterfaceVariableDecl )
                    // InternalKExpressions.g:1865:1: ruleInterfaceVariableDecl
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInterfaceDeclarationAccess().getInterfaceVariableDeclParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleInterfaceVariableDecl();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInterfaceDeclarationAccess().getInterfaceVariableDeclParserRuleCall_1()); 
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
    // $ANTLR end "rule__InterfaceDeclaration__Alternatives"


    // $ANTLR start "rule__InterfaceSignalDecl__Alternatives"
    // InternalKExpressions.g:1875:1: rule__InterfaceSignalDecl__Alternatives : ( ( ( rule__InterfaceSignalDecl__Group_0__0 ) ) | ( ( rule__InterfaceSignalDecl__Group_1__0 ) ) | ( ( rule__InterfaceSignalDecl__Group_2__0 ) ) | ( ( rule__InterfaceSignalDecl__Group_3__0 ) ) );
    public final void rule__InterfaceSignalDecl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1879:1: ( ( ( rule__InterfaceSignalDecl__Group_0__0 ) ) | ( ( rule__InterfaceSignalDecl__Group_1__0 ) ) | ( ( rule__InterfaceSignalDecl__Group_2__0 ) ) | ( ( rule__InterfaceSignalDecl__Group_3__0 ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt11=1;
                }
                break;
            case 50:
                {
                alt11=2;
                }
                break;
            case 51:
                {
                alt11=3;
                }
                break;
            case 52:
                {
                alt11=4;
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
                    // InternalKExpressions.g:1880:1: ( ( rule__InterfaceSignalDecl__Group_0__0 ) )
                    {
                    // InternalKExpressions.g:1880:1: ( ( rule__InterfaceSignalDecl__Group_0__0 ) )
                    // InternalKExpressions.g:1881:1: ( rule__InterfaceSignalDecl__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInterfaceSignalDeclAccess().getGroup_0()); 
                    }
                    // InternalKExpressions.g:1882:1: ( rule__InterfaceSignalDecl__Group_0__0 )
                    // InternalKExpressions.g:1882:2: rule__InterfaceSignalDecl__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__InterfaceSignalDecl__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInterfaceSignalDeclAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:1886:6: ( ( rule__InterfaceSignalDecl__Group_1__0 ) )
                    {
                    // InternalKExpressions.g:1886:6: ( ( rule__InterfaceSignalDecl__Group_1__0 ) )
                    // InternalKExpressions.g:1887:1: ( rule__InterfaceSignalDecl__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInterfaceSignalDeclAccess().getGroup_1()); 
                    }
                    // InternalKExpressions.g:1888:1: ( rule__InterfaceSignalDecl__Group_1__0 )
                    // InternalKExpressions.g:1888:2: rule__InterfaceSignalDecl__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__InterfaceSignalDecl__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInterfaceSignalDeclAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKExpressions.g:1892:6: ( ( rule__InterfaceSignalDecl__Group_2__0 ) )
                    {
                    // InternalKExpressions.g:1892:6: ( ( rule__InterfaceSignalDecl__Group_2__0 ) )
                    // InternalKExpressions.g:1893:1: ( rule__InterfaceSignalDecl__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInterfaceSignalDeclAccess().getGroup_2()); 
                    }
                    // InternalKExpressions.g:1894:1: ( rule__InterfaceSignalDecl__Group_2__0 )
                    // InternalKExpressions.g:1894:2: rule__InterfaceSignalDecl__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__InterfaceSignalDecl__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInterfaceSignalDeclAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKExpressions.g:1898:6: ( ( rule__InterfaceSignalDecl__Group_3__0 ) )
                    {
                    // InternalKExpressions.g:1898:6: ( ( rule__InterfaceSignalDecl__Group_3__0 ) )
                    // InternalKExpressions.g:1899:1: ( rule__InterfaceSignalDecl__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInterfaceSignalDeclAccess().getGroup_3()); 
                    }
                    // InternalKExpressions.g:1900:1: ( rule__InterfaceSignalDecl__Group_3__0 )
                    // InternalKExpressions.g:1900:2: rule__InterfaceSignalDecl__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__InterfaceSignalDecl__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInterfaceSignalDeclAccess().getGroup_3()); 
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
    // $ANTLR end "rule__InterfaceSignalDecl__Alternatives"


    // $ANTLR start "rule__ChannelDescription__Alternatives"
    // InternalKExpressions.g:1909:1: rule__ChannelDescription__Alternatives : ( ( ( rule__ChannelDescription__Group_0__0 ) ) | ( ( rule__ChannelDescription__Group_1__0 ) ) | ( ( rule__ChannelDescription__Group_2__0 ) ) );
    public final void rule__ChannelDescription__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1913:1: ( ( ( rule__ChannelDescription__Group_0__0 ) ) | ( ( rule__ChannelDescription__Group_1__0 ) ) | ( ( rule__ChannelDescription__Group_2__0 ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt12=1;
                }
                break;
            case 45:
                {
                alt12=2;
                }
                break;
            case 54:
                {
                alt12=3;
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
                    // InternalKExpressions.g:1914:1: ( ( rule__ChannelDescription__Group_0__0 ) )
                    {
                    // InternalKExpressions.g:1914:1: ( ( rule__ChannelDescription__Group_0__0 ) )
                    // InternalKExpressions.g:1915:1: ( rule__ChannelDescription__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getChannelDescriptionAccess().getGroup_0()); 
                    }
                    // InternalKExpressions.g:1916:1: ( rule__ChannelDescription__Group_0__0 )
                    // InternalKExpressions.g:1916:2: rule__ChannelDescription__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ChannelDescription__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getChannelDescriptionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:1920:6: ( ( rule__ChannelDescription__Group_1__0 ) )
                    {
                    // InternalKExpressions.g:1920:6: ( ( rule__ChannelDescription__Group_1__0 ) )
                    // InternalKExpressions.g:1921:1: ( rule__ChannelDescription__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getChannelDescriptionAccess().getGroup_1()); 
                    }
                    // InternalKExpressions.g:1922:1: ( rule__ChannelDescription__Group_1__0 )
                    // InternalKExpressions.g:1922:2: rule__ChannelDescription__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ChannelDescription__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getChannelDescriptionAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKExpressions.g:1926:6: ( ( rule__ChannelDescription__Group_2__0 ) )
                    {
                    // InternalKExpressions.g:1926:6: ( ( rule__ChannelDescription__Group_2__0 ) )
                    // InternalKExpressions.g:1927:1: ( rule__ChannelDescription__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getChannelDescriptionAccess().getGroup_2()); 
                    }
                    // InternalKExpressions.g:1928:1: ( rule__ChannelDescription__Group_2__0 )
                    // InternalKExpressions.g:1928:2: rule__ChannelDescription__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ChannelDescription__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getChannelDescriptionAccess().getGroup_2()); 
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
    // $ANTLR end "rule__ChannelDescription__Alternatives"


    // $ANTLR start "rule__TypeIdentifier__Alternatives"
    // InternalKExpressions.g:1937:1: rule__TypeIdentifier__Alternatives : ( ( ( rule__TypeIdentifier__TypeAssignment_0 ) ) | ( ( rule__TypeIdentifier__TypeIDAssignment_1 ) ) | ( ( rule__TypeIdentifier__Group_2__0 ) ) );
    public final void rule__TypeIdentifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1941:1: ( ( ( rule__TypeIdentifier__TypeAssignment_0 ) ) | ( ( rule__TypeIdentifier__TypeIDAssignment_1 ) ) | ( ( rule__TypeIdentifier__Group_2__0 ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
                {
                alt13=1;
                }
                break;
            case RULE_ID:
                {
                alt13=2;
                }
                break;
            case 56:
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
                    // InternalKExpressions.g:1942:1: ( ( rule__TypeIdentifier__TypeAssignment_0 ) )
                    {
                    // InternalKExpressions.g:1942:1: ( ( rule__TypeIdentifier__TypeAssignment_0 ) )
                    // InternalKExpressions.g:1943:1: ( rule__TypeIdentifier__TypeAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeIdentifierAccess().getTypeAssignment_0()); 
                    }
                    // InternalKExpressions.g:1944:1: ( rule__TypeIdentifier__TypeAssignment_0 )
                    // InternalKExpressions.g:1944:2: rule__TypeIdentifier__TypeAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TypeIdentifier__TypeAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeIdentifierAccess().getTypeAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:1948:6: ( ( rule__TypeIdentifier__TypeIDAssignment_1 ) )
                    {
                    // InternalKExpressions.g:1948:6: ( ( rule__TypeIdentifier__TypeIDAssignment_1 ) )
                    // InternalKExpressions.g:1949:1: ( rule__TypeIdentifier__TypeIDAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeIdentifierAccess().getTypeIDAssignment_1()); 
                    }
                    // InternalKExpressions.g:1950:1: ( rule__TypeIdentifier__TypeIDAssignment_1 )
                    // InternalKExpressions.g:1950:2: rule__TypeIdentifier__TypeIDAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TypeIdentifier__TypeIDAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeIdentifierAccess().getTypeIDAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKExpressions.g:1954:6: ( ( rule__TypeIdentifier__Group_2__0 ) )
                    {
                    // InternalKExpressions.g:1954:6: ( ( rule__TypeIdentifier__Group_2__0 ) )
                    // InternalKExpressions.g:1955:1: ( rule__TypeIdentifier__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeIdentifierAccess().getGroup_2()); 
                    }
                    // InternalKExpressions.g:1956:1: ( rule__TypeIdentifier__Group_2__0 )
                    // InternalKExpressions.g:1956:2: rule__TypeIdentifier__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TypeIdentifier__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeIdentifierAccess().getGroup_2()); 
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
    // $ANTLR end "rule__TypeIdentifier__Alternatives"


    // $ANTLR start "rule__TypeIdentifier__Alternatives_2_1"
    // InternalKExpressions.g:1965:1: rule__TypeIdentifier__Alternatives_2_1 : ( ( ( rule__TypeIdentifier__TypeAssignment_2_1_0 ) ) | ( ( rule__TypeIdentifier__TypeIDAssignment_2_1_1 ) ) );
    public final void rule__TypeIdentifier__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1969:1: ( ( ( rule__TypeIdentifier__TypeAssignment_2_1_0 ) ) | ( ( rule__TypeIdentifier__TypeIDAssignment_2_1_1 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=34 && LA14_0<=41)) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalKExpressions.g:1970:1: ( ( rule__TypeIdentifier__TypeAssignment_2_1_0 ) )
                    {
                    // InternalKExpressions.g:1970:1: ( ( rule__TypeIdentifier__TypeAssignment_2_1_0 ) )
                    // InternalKExpressions.g:1971:1: ( rule__TypeIdentifier__TypeAssignment_2_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeIdentifierAccess().getTypeAssignment_2_1_0()); 
                    }
                    // InternalKExpressions.g:1972:1: ( rule__TypeIdentifier__TypeAssignment_2_1_0 )
                    // InternalKExpressions.g:1972:2: rule__TypeIdentifier__TypeAssignment_2_1_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TypeIdentifier__TypeAssignment_2_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeIdentifierAccess().getTypeAssignment_2_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:1976:6: ( ( rule__TypeIdentifier__TypeIDAssignment_2_1_1 ) )
                    {
                    // InternalKExpressions.g:1976:6: ( ( rule__TypeIdentifier__TypeIDAssignment_2_1_1 ) )
                    // InternalKExpressions.g:1977:1: ( rule__TypeIdentifier__TypeIDAssignment_2_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeIdentifierAccess().getTypeIDAssignment_2_1_1()); 
                    }
                    // InternalKExpressions.g:1978:1: ( rule__TypeIdentifier__TypeIDAssignment_2_1_1 )
                    // InternalKExpressions.g:1978:2: rule__TypeIdentifier__TypeIDAssignment_2_1_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TypeIdentifier__TypeIDAssignment_2_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeIdentifierAccess().getTypeIDAssignment_2_1_1()); 
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
    // $ANTLR end "rule__TypeIdentifier__Alternatives_2_1"


    // $ANTLR start "rule__EStringBoolean__Alternatives"
    // InternalKExpressions.g:1993:1: rule__EStringBoolean__Alternatives : ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) );
    public final void rule__EStringBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1997:1: ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt15=1;
                }
                break;
            case RULE_ID:
                {
                alt15=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt15=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalKExpressions.g:1998:1: ( RULE_STRING )
                    {
                    // InternalKExpressions.g:1998:1: ( RULE_STRING )
                    // InternalKExpressions.g:1999:1: RULE_STRING
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
                    // InternalKExpressions.g:2004:6: ( ruleExtendedID )
                    {
                    // InternalKExpressions.g:2004:6: ( ruleExtendedID )
                    // InternalKExpressions.g:2005:1: ruleExtendedID
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
                    // InternalKExpressions.g:2010:6: ( RULE_BOOLEAN )
                    {
                    // InternalKExpressions.g:2010:6: ( RULE_BOOLEAN )
                    // InternalKExpressions.g:2011:1: RULE_BOOLEAN
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
    // InternalKExpressions.g:2021:1: rule__EStringAllTypes__Alternatives : ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) | ( ruleInteger ) | ( ruleFloateger ) );
    public final void rule__EStringAllTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2025:1: ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) | ( ruleInteger ) | ( ruleFloateger ) )
            int alt16=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt16=1;
                }
                break;
            case RULE_ID:
                {
                alt16=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt16=3;
                }
                break;
            case 22:
                {
                int LA16_4 = input.LA(2);

                if ( (LA16_4==RULE_FLOAT) ) {
                    alt16=5;
                }
                else if ( (LA16_4==RULE_INT) ) {
                    alt16=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt16=4;
                }
                break;
            case RULE_FLOAT:
                {
                alt16=5;
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
                    // InternalKExpressions.g:2026:1: ( RULE_STRING )
                    {
                    // InternalKExpressions.g:2026:1: ( RULE_STRING )
                    // InternalKExpressions.g:2027:1: RULE_STRING
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
                    // InternalKExpressions.g:2032:6: ( ruleExtendedID )
                    {
                    // InternalKExpressions.g:2032:6: ( ruleExtendedID )
                    // InternalKExpressions.g:2033:1: ruleExtendedID
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
                    // InternalKExpressions.g:2038:6: ( RULE_BOOLEAN )
                    {
                    // InternalKExpressions.g:2038:6: ( RULE_BOOLEAN )
                    // InternalKExpressions.g:2039:1: RULE_BOOLEAN
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
                    // InternalKExpressions.g:2044:6: ( ruleInteger )
                    {
                    // InternalKExpressions.g:2044:6: ( ruleInteger )
                    // InternalKExpressions.g:2045:1: ruleInteger
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
                    // InternalKExpressions.g:2050:6: ( ruleFloateger )
                    {
                    // InternalKExpressions.g:2050:6: ( ruleFloateger )
                    // InternalKExpressions.g:2051:1: ruleFloateger
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


    // $ANTLR start "rule__ExtendedID__Alternatives_1_0"
    // InternalKExpressions.g:2061:1: rule__ExtendedID__Alternatives_1_0 : ( ( '.' ) | ( '-' ) );
    public final void rule__ExtendedID__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2065:1: ( ( '.' ) | ( '-' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            else if ( (LA17_0==22) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalKExpressions.g:2066:1: ( '.' )
                    {
                    // InternalKExpressions.g:2066:1: ( '.' )
                    // InternalKExpressions.g:2067:1: '.'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0_0()); 
                    }
                    match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:2074:6: ( '-' )
                    {
                    // InternalKExpressions.g:2074:6: ( '-' )
                    // InternalKExpressions.g:2075:1: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExtendedIDAccess().getHyphenMinusKeyword_1_0_1()); 
                    }
                    match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExtendedIDAccess().getHyphenMinusKeyword_1_0_1()); 
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
    // $ANTLR end "rule__ExtendedID__Alternatives_1_0"


    // $ANTLR start "rule__CompareOperator__Alternatives"
    // InternalKExpressions.g:2087:1: rule__CompareOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2091:1: ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) )
            int alt18=6;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt18=1;
                }
                break;
            case 29:
                {
                alt18=2;
                }
                break;
            case 30:
                {
                alt18=3;
                }
                break;
            case 31:
                {
                alt18=4;
                }
                break;
            case 32:
                {
                alt18=5;
                }
                break;
            case 33:
                {
                alt18=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalKExpressions.g:2092:1: ( ( '=' ) )
                    {
                    // InternalKExpressions.g:2092:1: ( ( '=' ) )
                    // InternalKExpressions.g:2093:1: ( '=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // InternalKExpressions.g:2094:1: ( '=' )
                    // InternalKExpressions.g:2094:3: '='
                    {
                    match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:2099:6: ( ( '<' ) )
                    {
                    // InternalKExpressions.g:2099:6: ( ( '<' ) )
                    // InternalKExpressions.g:2100:1: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }
                    // InternalKExpressions.g:2101:1: ( '<' )
                    // InternalKExpressions.g:2101:3: '<'
                    {
                    match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKExpressions.g:2106:6: ( ( '<=' ) )
                    {
                    // InternalKExpressions.g:2106:6: ( ( '<=' ) )
                    // InternalKExpressions.g:2107:1: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }
                    // InternalKExpressions.g:2108:1: ( '<=' )
                    // InternalKExpressions.g:2108:3: '<='
                    {
                    match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKExpressions.g:2113:6: ( ( '>' ) )
                    {
                    // InternalKExpressions.g:2113:6: ( ( '>' ) )
                    // InternalKExpressions.g:2114:1: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }
                    // InternalKExpressions.g:2115:1: ( '>' )
                    // InternalKExpressions.g:2115:3: '>'
                    {
                    match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKExpressions.g:2120:6: ( ( '>=' ) )
                    {
                    // InternalKExpressions.g:2120:6: ( ( '>=' ) )
                    // InternalKExpressions.g:2121:1: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }
                    // InternalKExpressions.g:2122:1: ( '>=' )
                    // InternalKExpressions.g:2122:3: '>='
                    {
                    match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKExpressions.g:2127:6: ( ( '<>' ) )
                    {
                    // InternalKExpressions.g:2127:6: ( ( '<>' ) )
                    // InternalKExpressions.g:2128:1: ( '<>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_5()); 
                    }
                    // InternalKExpressions.g:2129:1: ( '<>' )
                    // InternalKExpressions.g:2129:3: '<>'
                    {
                    match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;

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


    // $ANTLR start "rule__ValueType__Alternatives"
    // InternalKExpressions.g:2139:1: rule__ValueType__Alternatives : ( ( ( 'pure' ) ) | ( ( 'boolean' ) ) | ( ( 'unsigned' ) ) | ( ( 'integer' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'string' ) ) | ( ( 'host' ) ) );
    public final void rule__ValueType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2143:1: ( ( ( 'pure' ) ) | ( ( 'boolean' ) ) | ( ( 'unsigned' ) ) | ( ( 'integer' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'string' ) ) | ( ( 'host' ) ) )
            int alt19=8;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt19=1;
                }
                break;
            case 35:
                {
                alt19=2;
                }
                break;
            case 36:
                {
                alt19=3;
                }
                break;
            case 37:
                {
                alt19=4;
                }
                break;
            case 38:
                {
                alt19=5;
                }
                break;
            case 39:
                {
                alt19=6;
                }
                break;
            case 40:
                {
                alt19=7;
                }
                break;
            case 41:
                {
                alt19=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalKExpressions.g:2144:1: ( ( 'pure' ) )
                    {
                    // InternalKExpressions.g:2144:1: ( ( 'pure' ) )
                    // InternalKExpressions.g:2145:1: ( 'pure' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0()); 
                    }
                    // InternalKExpressions.g:2146:1: ( 'pure' )
                    // InternalKExpressions.g:2146:3: 'pure'
                    {
                    match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:2151:6: ( ( 'boolean' ) )
                    {
                    // InternalKExpressions.g:2151:6: ( ( 'boolean' ) )
                    // InternalKExpressions.g:2152:1: ( 'boolean' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1()); 
                    }
                    // InternalKExpressions.g:2153:1: ( 'boolean' )
                    // InternalKExpressions.g:2153:3: 'boolean'
                    {
                    match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKExpressions.g:2158:6: ( ( 'unsigned' ) )
                    {
                    // InternalKExpressions.g:2158:6: ( ( 'unsigned' ) )
                    // InternalKExpressions.g:2159:1: ( 'unsigned' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2()); 
                    }
                    // InternalKExpressions.g:2160:1: ( 'unsigned' )
                    // InternalKExpressions.g:2160:3: 'unsigned'
                    {
                    match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKExpressions.g:2165:6: ( ( 'integer' ) )
                    {
                    // InternalKExpressions.g:2165:6: ( ( 'integer' ) )
                    // InternalKExpressions.g:2166:1: ( 'integer' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3()); 
                    }
                    // InternalKExpressions.g:2167:1: ( 'integer' )
                    // InternalKExpressions.g:2167:3: 'integer'
                    {
                    match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKExpressions.g:2172:6: ( ( 'float' ) )
                    {
                    // InternalKExpressions.g:2172:6: ( ( 'float' ) )
                    // InternalKExpressions.g:2173:1: ( 'float' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4()); 
                    }
                    // InternalKExpressions.g:2174:1: ( 'float' )
                    // InternalKExpressions.g:2174:3: 'float'
                    {
                    match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKExpressions.g:2179:6: ( ( 'double' ) )
                    {
                    // InternalKExpressions.g:2179:6: ( ( 'double' ) )
                    // InternalKExpressions.g:2180:1: ( 'double' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getDOUBLEEnumLiteralDeclaration_5()); 
                    }
                    // InternalKExpressions.g:2181:1: ( 'double' )
                    // InternalKExpressions.g:2181:3: 'double'
                    {
                    match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueTypeAccess().getDOUBLEEnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalKExpressions.g:2186:6: ( ( 'string' ) )
                    {
                    // InternalKExpressions.g:2186:6: ( ( 'string' ) )
                    // InternalKExpressions.g:2187:1: ( 'string' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_6()); 
                    }
                    // InternalKExpressions.g:2188:1: ( 'string' )
                    // InternalKExpressions.g:2188:3: 'string'
                    {
                    match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalKExpressions.g:2193:6: ( ( 'host' ) )
                    {
                    // InternalKExpressions.g:2193:6: ( ( 'host' ) )
                    // InternalKExpressions.g:2194:1: ( 'host' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getHOSTEnumLiteralDeclaration_7()); 
                    }
                    // InternalKExpressions.g:2195:1: ( 'host' )
                    // InternalKExpressions.g:2195:3: 'host'
                    {
                    match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueTypeAccess().getHOSTEnumLiteralDeclaration_7()); 
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
    // $ANTLR end "rule__ValueType__Alternatives"


    // $ANTLR start "rule__CombineOperator__Alternatives"
    // InternalKExpressions.g:2205:1: rule__CombineOperator__Alternatives : ( ( ( 'none' ) ) | ( ( '+' ) ) | ( ( '*' ) ) | ( ( 'max' ) ) | ( ( 'min' ) ) | ( ( 'or' ) ) | ( ( 'and' ) ) | ( ( 'host' ) ) );
    public final void rule__CombineOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2209:1: ( ( ( 'none' ) ) | ( ( '+' ) ) | ( ( '*' ) ) | ( ( 'max' ) ) | ( ( 'min' ) ) | ( ( 'or' ) ) | ( ( 'and' ) ) | ( ( 'host' ) ) )
            int alt20=8;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt20=1;
                }
                break;
            case 21:
                {
                alt20=2;
                }
                break;
            case 23:
                {
                alt20=3;
                }
                break;
            case 43:
                {
                alt20=4;
                }
                break;
            case 44:
                {
                alt20=5;
                }
                break;
            case 18:
                {
                alt20=6;
                }
                break;
            case 19:
                {
                alt20=7;
                }
                break;
            case 41:
                {
                alt20=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalKExpressions.g:2210:1: ( ( 'none' ) )
                    {
                    // InternalKExpressions.g:2210:1: ( ( 'none' ) )
                    // InternalKExpressions.g:2211:1: ( 'none' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 
                    }
                    // InternalKExpressions.g:2212:1: ( 'none' )
                    // InternalKExpressions.g:2212:3: 'none'
                    {
                    match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:2217:6: ( ( '+' ) )
                    {
                    // InternalKExpressions.g:2217:6: ( ( '+' ) )
                    // InternalKExpressions.g:2218:1: ( '+' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 
                    }
                    // InternalKExpressions.g:2219:1: ( '+' )
                    // InternalKExpressions.g:2219:3: '+'
                    {
                    match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKExpressions.g:2224:6: ( ( '*' ) )
                    {
                    // InternalKExpressions.g:2224:6: ( ( '*' ) )
                    // InternalKExpressions.g:2225:1: ( '*' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 
                    }
                    // InternalKExpressions.g:2226:1: ( '*' )
                    // InternalKExpressions.g:2226:3: '*'
                    {
                    match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKExpressions.g:2231:6: ( ( 'max' ) )
                    {
                    // InternalKExpressions.g:2231:6: ( ( 'max' ) )
                    // InternalKExpressions.g:2232:1: ( 'max' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3()); 
                    }
                    // InternalKExpressions.g:2233:1: ( 'max' )
                    // InternalKExpressions.g:2233:3: 'max'
                    {
                    match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKExpressions.g:2238:6: ( ( 'min' ) )
                    {
                    // InternalKExpressions.g:2238:6: ( ( 'min' ) )
                    // InternalKExpressions.g:2239:1: ( 'min' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4()); 
                    }
                    // InternalKExpressions.g:2240:1: ( 'min' )
                    // InternalKExpressions.g:2240:3: 'min'
                    {
                    match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKExpressions.g:2245:6: ( ( 'or' ) )
                    {
                    // InternalKExpressions.g:2245:6: ( ( 'or' ) )
                    // InternalKExpressions.g:2246:1: ( 'or' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5()); 
                    }
                    // InternalKExpressions.g:2247:1: ( 'or' )
                    // InternalKExpressions.g:2247:3: 'or'
                    {
                    match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalKExpressions.g:2252:6: ( ( 'and' ) )
                    {
                    // InternalKExpressions.g:2252:6: ( ( 'and' ) )
                    // InternalKExpressions.g:2253:1: ( 'and' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                    }
                    // InternalKExpressions.g:2254:1: ( 'and' )
                    // InternalKExpressions.g:2254:3: 'and'
                    {
                    match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalKExpressions.g:2259:6: ( ( 'host' ) )
                    {
                    // InternalKExpressions.g:2259:6: ( ( 'host' ) )
                    // InternalKExpressions.g:2260:1: ( 'host' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCombineOperatorAccess().getHOSTEnumLiteralDeclaration_7()); 
                    }
                    // InternalKExpressions.g:2261:1: ( 'host' )
                    // InternalKExpressions.g:2261:3: 'host'
                    {
                    match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCombineOperatorAccess().getHOSTEnumLiteralDeclaration_7()); 
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
    // $ANTLR end "rule__CombineOperator__Alternatives"


    // $ANTLR start "rule__OrExpression__Group__0"
    // InternalKExpressions.g:2273:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2277:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // InternalKExpressions.g:2278:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__OrExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__0"


    // $ANTLR start "rule__OrExpression__Group__0__Impl"
    // InternalKExpressions.g:2285:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2289:1: ( ( ruleAndExpression ) )
            // InternalKExpressions.g:2290:1: ( ruleAndExpression )
            {
            // InternalKExpressions.g:2290:1: ( ruleAndExpression )
            // InternalKExpressions.g:2291:1: ruleAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__OrExpression__Group__0__Impl"


    // $ANTLR start "rule__OrExpression__Group__1"
    // InternalKExpressions.g:2302:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2306:1: ( rule__OrExpression__Group__1__Impl )
            // InternalKExpressions.g:2307:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__1"


    // $ANTLR start "rule__OrExpression__Group__1__Impl"
    // InternalKExpressions.g:2313:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2317:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // InternalKExpressions.g:2318:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // InternalKExpressions.g:2318:1: ( ( rule__OrExpression__Group_1__0 )* )
            // InternalKExpressions.g:2319:1: ( rule__OrExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:2320:1: ( rule__OrExpression__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==18) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalKExpressions.g:2320:2: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__OrExpression__Group__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__0"
    // InternalKExpressions.g:2334:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2338:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // InternalKExpressions.g:2339:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__OrExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__0"


    // $ANTLR start "rule__OrExpression__Group_1__0__Impl"
    // InternalKExpressions.g:2346:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2350:1: ( ( () ) )
            // InternalKExpressions.g:2351:1: ( () )
            {
            // InternalKExpressions.g:2351:1: ( () )
            // InternalKExpressions.g:2352:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:2353:1: ()
            // InternalKExpressions.g:2355:1: 
            {
            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__OrExpression__Group_1__0__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__1"
    // InternalKExpressions.g:2365:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2369:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // InternalKExpressions.g:2370:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__OrExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__1"


    // $ANTLR start "rule__OrExpression__Group_1__1__Impl"
    // InternalKExpressions.g:2377:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2381:1: ( ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) )
            // InternalKExpressions.g:2382:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKExpressions.g:2382:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            // InternalKExpressions.g:2383:1: ( rule__OrExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKExpressions.g:2384:1: ( rule__OrExpression__OperatorAssignment_1_1 )
            // InternalKExpressions.g:2384:2: rule__OrExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__OrExpression__Group_1__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__2"
    // InternalKExpressions.g:2394:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2398:1: ( rule__OrExpression__Group_1__2__Impl )
            // InternalKExpressions.g:2399:2: rule__OrExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__2"


    // $ANTLR start "rule__OrExpression__Group_1__2__Impl"
    // InternalKExpressions.g:2405:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2409:1: ( ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) ) )
            // InternalKExpressions.g:2410:1: ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) )
            {
            // InternalKExpressions.g:2410:1: ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) )
            // InternalKExpressions.g:2411:1: ( rule__OrExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // InternalKExpressions.g:2412:1: ( rule__OrExpression__SubExpressionsAssignment_1_2 )
            // InternalKExpressions.g:2412:2: rule__OrExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrExpression__SubExpressionsAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__OrExpression__Group_1__2__Impl"


    // $ANTLR start "rule__AndExpression__Group__0"
    // InternalKExpressions.g:2428:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2432:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalKExpressions.g:2433:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__0"


    // $ANTLR start "rule__AndExpression__Group__0__Impl"
    // InternalKExpressions.g:2440:1: rule__AndExpression__Group__0__Impl : ( ruleCompareOperation ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2444:1: ( ( ruleCompareOperation ) )
            // InternalKExpressions.g:2445:1: ( ruleCompareOperation )
            {
            // InternalKExpressions.g:2445:1: ( ruleCompareOperation )
            // InternalKExpressions.g:2446:1: ruleCompareOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getCompareOperationParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleCompareOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__AndExpression__Group__0__Impl"


    // $ANTLR start "rule__AndExpression__Group__1"
    // InternalKExpressions.g:2457:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2461:1: ( rule__AndExpression__Group__1__Impl )
            // InternalKExpressions.g:2462:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__1"


    // $ANTLR start "rule__AndExpression__Group__1__Impl"
    // InternalKExpressions.g:2468:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2472:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalKExpressions.g:2473:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalKExpressions.g:2473:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalKExpressions.g:2474:1: ( rule__AndExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:2475:1: ( rule__AndExpression__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==19) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalKExpressions.g:2475:2: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__AndExpression__Group__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__0"
    // InternalKExpressions.g:2489:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2493:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalKExpressions.g:2494:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__AndExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0"


    // $ANTLR start "rule__AndExpression__Group_1__0__Impl"
    // InternalKExpressions.g:2501:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2505:1: ( ( () ) )
            // InternalKExpressions.g:2506:1: ( () )
            {
            // InternalKExpressions.g:2506:1: ( () )
            // InternalKExpressions.g:2507:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:2508:1: ()
            // InternalKExpressions.g:2510:1: 
            {
            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__AndExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__1"
    // InternalKExpressions.g:2520:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2524:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // InternalKExpressions.g:2525:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__AndExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__1"


    // $ANTLR start "rule__AndExpression__Group_1__1__Impl"
    // InternalKExpressions.g:2532:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2536:1: ( ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) )
            // InternalKExpressions.g:2537:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKExpressions.g:2537:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            // InternalKExpressions.g:2538:1: ( rule__AndExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKExpressions.g:2539:1: ( rule__AndExpression__OperatorAssignment_1_1 )
            // InternalKExpressions.g:2539:2: rule__AndExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__AndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__2"
    // InternalKExpressions.g:2549:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2553:1: ( rule__AndExpression__Group_1__2__Impl )
            // InternalKExpressions.g:2554:2: rule__AndExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__2"


    // $ANTLR start "rule__AndExpression__Group_1__2__Impl"
    // InternalKExpressions.g:2560:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2564:1: ( ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) ) )
            // InternalKExpressions.g:2565:1: ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) )
            {
            // InternalKExpressions.g:2565:1: ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) )
            // InternalKExpressions.g:2566:1: ( rule__AndExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // InternalKExpressions.g:2567:1: ( rule__AndExpression__SubExpressionsAssignment_1_2 )
            // InternalKExpressions.g:2567:2: rule__AndExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndExpression__SubExpressionsAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__AndExpression__Group_1__2__Impl"


    // $ANTLR start "rule__CompareOperation__Group_0__0"
    // InternalKExpressions.g:2583:1: rule__CompareOperation__Group_0__0 : rule__CompareOperation__Group_0__0__Impl rule__CompareOperation__Group_0__1 ;
    public final void rule__CompareOperation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2587:1: ( rule__CompareOperation__Group_0__0__Impl rule__CompareOperation__Group_0__1 )
            // InternalKExpressions.g:2588:2: rule__CompareOperation__Group_0__0__Impl rule__CompareOperation__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__CompareOperation__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CompareOperation__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group_0__0"


    // $ANTLR start "rule__CompareOperation__Group_0__0__Impl"
    // InternalKExpressions.g:2595:1: rule__CompareOperation__Group_0__0__Impl : ( ( ruleNotOrValuedExpression ) ) ;
    public final void rule__CompareOperation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2599:1: ( ( ( ruleNotOrValuedExpression ) ) )
            // InternalKExpressions.g:2600:1: ( ( ruleNotOrValuedExpression ) )
            {
            // InternalKExpressions.g:2600:1: ( ( ruleNotOrValuedExpression ) )
            // InternalKExpressions.g:2601:1: ( ruleNotOrValuedExpression )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0_0()); 
            }
            // InternalKExpressions.g:2602:1: ( ruleNotOrValuedExpression )
            // InternalKExpressions.g:2602:3: ruleNotOrValuedExpression
            {
            pushFollow(FollowSets000.FOLLOW_2);
            ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__CompareOperation__Group_0__0__Impl"


    // $ANTLR start "rule__CompareOperation__Group_0__1"
    // InternalKExpressions.g:2612:1: rule__CompareOperation__Group_0__1 : rule__CompareOperation__Group_0__1__Impl ;
    public final void rule__CompareOperation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2616:1: ( rule__CompareOperation__Group_0__1__Impl )
            // InternalKExpressions.g:2617:2: rule__CompareOperation__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CompareOperation__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group_0__1"


    // $ANTLR start "rule__CompareOperation__Group_0__1__Impl"
    // InternalKExpressions.g:2623:1: rule__CompareOperation__Group_0__1__Impl : ( ( rule__CompareOperation__Group_0_1__0 ) ) ;
    public final void rule__CompareOperation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2627:1: ( ( ( rule__CompareOperation__Group_0_1__0 ) ) )
            // InternalKExpressions.g:2628:1: ( ( rule__CompareOperation__Group_0_1__0 ) )
            {
            // InternalKExpressions.g:2628:1: ( ( rule__CompareOperation__Group_0_1__0 ) )
            // InternalKExpressions.g:2629:1: ( rule__CompareOperation__Group_0_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGroup_0_1()); 
            }
            // InternalKExpressions.g:2630:1: ( rule__CompareOperation__Group_0_1__0 )
            // InternalKExpressions.g:2630:2: rule__CompareOperation__Group_0_1__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CompareOperation__Group_0_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__CompareOperation__Group_0__1__Impl"


    // $ANTLR start "rule__CompareOperation__Group_0_1__0"
    // InternalKExpressions.g:2644:1: rule__CompareOperation__Group_0_1__0 : rule__CompareOperation__Group_0_1__0__Impl rule__CompareOperation__Group_0_1__1 ;
    public final void rule__CompareOperation__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2648:1: ( rule__CompareOperation__Group_0_1__0__Impl rule__CompareOperation__Group_0_1__1 )
            // InternalKExpressions.g:2649:2: rule__CompareOperation__Group_0_1__0__Impl rule__CompareOperation__Group_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__CompareOperation__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CompareOperation__Group_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group_0_1__0"


    // $ANTLR start "rule__CompareOperation__Group_0_1__0__Impl"
    // InternalKExpressions.g:2656:1: rule__CompareOperation__Group_0_1__0__Impl : ( () ) ;
    public final void rule__CompareOperation__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2660:1: ( ( () ) )
            // InternalKExpressions.g:2661:1: ( () )
            {
            // InternalKExpressions.g:2661:1: ( () )
            // InternalKExpressions.g:2662:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_0_1_0()); 
            }
            // InternalKExpressions.g:2663:1: ()
            // InternalKExpressions.g:2665:1: 
            {
            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__CompareOperation__Group_0_1__0__Impl"


    // $ANTLR start "rule__CompareOperation__Group_0_1__1"
    // InternalKExpressions.g:2675:1: rule__CompareOperation__Group_0_1__1 : rule__CompareOperation__Group_0_1__1__Impl rule__CompareOperation__Group_0_1__2 ;
    public final void rule__CompareOperation__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2679:1: ( rule__CompareOperation__Group_0_1__1__Impl rule__CompareOperation__Group_0_1__2 )
            // InternalKExpressions.g:2680:2: rule__CompareOperation__Group_0_1__1__Impl rule__CompareOperation__Group_0_1__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__CompareOperation__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CompareOperation__Group_0_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group_0_1__1"


    // $ANTLR start "rule__CompareOperation__Group_0_1__1__Impl"
    // InternalKExpressions.g:2687:1: rule__CompareOperation__Group_0_1__1__Impl : ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) ) ;
    public final void rule__CompareOperation__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2691:1: ( ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) ) )
            // InternalKExpressions.g:2692:1: ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) )
            {
            // InternalKExpressions.g:2692:1: ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) )
            // InternalKExpressions.g:2693:1: ( rule__CompareOperation__OperatorAssignment_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorAssignment_0_1_1()); 
            }
            // InternalKExpressions.g:2694:1: ( rule__CompareOperation__OperatorAssignment_0_1_1 )
            // InternalKExpressions.g:2694:2: rule__CompareOperation__OperatorAssignment_0_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CompareOperation__OperatorAssignment_0_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__CompareOperation__Group_0_1__1__Impl"


    // $ANTLR start "rule__CompareOperation__Group_0_1__2"
    // InternalKExpressions.g:2704:1: rule__CompareOperation__Group_0_1__2 : rule__CompareOperation__Group_0_1__2__Impl ;
    public final void rule__CompareOperation__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2708:1: ( rule__CompareOperation__Group_0_1__2__Impl )
            // InternalKExpressions.g:2709:2: rule__CompareOperation__Group_0_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CompareOperation__Group_0_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareOperation__Group_0_1__2"


    // $ANTLR start "rule__CompareOperation__Group_0_1__2__Impl"
    // InternalKExpressions.g:2715:1: rule__CompareOperation__Group_0_1__2__Impl : ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) ) ;
    public final void rule__CompareOperation__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2719:1: ( ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) ) )
            // InternalKExpressions.g:2720:1: ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) )
            {
            // InternalKExpressions.g:2720:1: ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) )
            // InternalKExpressions.g:2721:1: ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsAssignment_0_1_2()); 
            }
            // InternalKExpressions.g:2722:1: ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 )
            // InternalKExpressions.g:2722:2: rule__CompareOperation__SubExpressionsAssignment_0_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CompareOperation__SubExpressionsAssignment_0_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__CompareOperation__Group_0_1__2__Impl"


    // $ANTLR start "rule__NotExpression__Group_0__0"
    // InternalKExpressions.g:2738:1: rule__NotExpression__Group_0__0 : rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1 ;
    public final void rule__NotExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2742:1: ( rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1 )
            // InternalKExpressions.g:2743:2: rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
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
    // InternalKExpressions.g:2750:1: rule__NotExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__NotExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2754:1: ( ( () ) )
            // InternalKExpressions.g:2755:1: ( () )
            {
            // InternalKExpressions.g:2755:1: ( () )
            // InternalKExpressions.g:2756:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // InternalKExpressions.g:2757:1: ()
            // InternalKExpressions.g:2759:1: 
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
    // InternalKExpressions.g:2769:1: rule__NotExpression__Group_0__1 : rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2 ;
    public final void rule__NotExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2773:1: ( rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2 )
            // InternalKExpressions.g:2774:2: rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2
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
    // InternalKExpressions.g:2781:1: rule__NotExpression__Group_0__1__Impl : ( ( rule__NotExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__NotExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2785:1: ( ( ( rule__NotExpression__OperatorAssignment_0_1 ) ) )
            // InternalKExpressions.g:2786:1: ( ( rule__NotExpression__OperatorAssignment_0_1 ) )
            {
            // InternalKExpressions.g:2786:1: ( ( rule__NotExpression__OperatorAssignment_0_1 ) )
            // InternalKExpressions.g:2787:1: ( rule__NotExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // InternalKExpressions.g:2788:1: ( rule__NotExpression__OperatorAssignment_0_1 )
            // InternalKExpressions.g:2788:2: rule__NotExpression__OperatorAssignment_0_1
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
    // InternalKExpressions.g:2798:1: rule__NotExpression__Group_0__2 : rule__NotExpression__Group_0__2__Impl ;
    public final void rule__NotExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2802:1: ( rule__NotExpression__Group_0__2__Impl )
            // InternalKExpressions.g:2803:2: rule__NotExpression__Group_0__2__Impl
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
    // InternalKExpressions.g:2809:1: rule__NotExpression__Group_0__2__Impl : ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) ) ;
    public final void rule__NotExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2813:1: ( ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) ) )
            // InternalKExpressions.g:2814:1: ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) )
            {
            // InternalKExpressions.g:2814:1: ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) )
            // InternalKExpressions.g:2815:1: ( rule__NotExpression__SubExpressionsAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubExpressionsAssignment_0_2()); 
            }
            // InternalKExpressions.g:2816:1: ( rule__NotExpression__SubExpressionsAssignment_0_2 )
            // InternalKExpressions.g:2816:2: rule__NotExpression__SubExpressionsAssignment_0_2
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
    // InternalKExpressions.g:2832:1: rule__AddExpression__Group__0 : rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 ;
    public final void rule__AddExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2836:1: ( rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 )
            // InternalKExpressions.g:2837:2: rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
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
    // InternalKExpressions.g:2844:1: rule__AddExpression__Group__0__Impl : ( ruleSubExpression ) ;
    public final void rule__AddExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2848:1: ( ( ruleSubExpression ) )
            // InternalKExpressions.g:2849:1: ( ruleSubExpression )
            {
            // InternalKExpressions.g:2849:1: ( ruleSubExpression )
            // InternalKExpressions.g:2850:1: ruleSubExpression
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
    // InternalKExpressions.g:2861:1: rule__AddExpression__Group__1 : rule__AddExpression__Group__1__Impl ;
    public final void rule__AddExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2865:1: ( rule__AddExpression__Group__1__Impl )
            // InternalKExpressions.g:2866:2: rule__AddExpression__Group__1__Impl
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
    // InternalKExpressions.g:2872:1: rule__AddExpression__Group__1__Impl : ( ( rule__AddExpression__Group_1__0 )* ) ;
    public final void rule__AddExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2876:1: ( ( ( rule__AddExpression__Group_1__0 )* ) )
            // InternalKExpressions.g:2877:1: ( ( rule__AddExpression__Group_1__0 )* )
            {
            // InternalKExpressions.g:2877:1: ( ( rule__AddExpression__Group_1__0 )* )
            // InternalKExpressions.g:2878:1: ( rule__AddExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:2879:1: ( rule__AddExpression__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==21) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalKExpressions.g:2879:2: rule__AddExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_11);
            	    rule__AddExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

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
    // InternalKExpressions.g:2893:1: rule__AddExpression__Group_1__0 : rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 ;
    public final void rule__AddExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2897:1: ( rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 )
            // InternalKExpressions.g:2898:2: rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
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
    // InternalKExpressions.g:2905:1: rule__AddExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AddExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2909:1: ( ( () ) )
            // InternalKExpressions.g:2910:1: ( () )
            {
            // InternalKExpressions.g:2910:1: ( () )
            // InternalKExpressions.g:2911:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:2912:1: ()
            // InternalKExpressions.g:2914:1: 
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
    // InternalKExpressions.g:2924:1: rule__AddExpression__Group_1__1 : rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2 ;
    public final void rule__AddExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2928:1: ( rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2 )
            // InternalKExpressions.g:2929:2: rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_12);
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
    // InternalKExpressions.g:2936:1: rule__AddExpression__Group_1__1__Impl : ( ( rule__AddExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AddExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2940:1: ( ( ( rule__AddExpression__OperatorAssignment_1_1 ) ) )
            // InternalKExpressions.g:2941:1: ( ( rule__AddExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKExpressions.g:2941:1: ( ( rule__AddExpression__OperatorAssignment_1_1 ) )
            // InternalKExpressions.g:2942:1: ( rule__AddExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKExpressions.g:2943:1: ( rule__AddExpression__OperatorAssignment_1_1 )
            // InternalKExpressions.g:2943:2: rule__AddExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AddExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__AddExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AddExpression__Group_1__2"
    // InternalKExpressions.g:2953:1: rule__AddExpression__Group_1__2 : rule__AddExpression__Group_1__2__Impl ;
    public final void rule__AddExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2957:1: ( rule__AddExpression__Group_1__2__Impl )
            // InternalKExpressions.g:2958:2: rule__AddExpression__Group_1__2__Impl
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
    // InternalKExpressions.g:2964:1: rule__AddExpression__Group_1__2__Impl : ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__AddExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2968:1: ( ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) ) )
            // InternalKExpressions.g:2969:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) )
            {
            // InternalKExpressions.g:2969:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) )
            // InternalKExpressions.g:2970:1: ( rule__AddExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // InternalKExpressions.g:2971:1: ( rule__AddExpression__SubExpressionsAssignment_1_2 )
            // InternalKExpressions.g:2971:2: rule__AddExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AddExpression__SubExpressionsAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__AddExpression__Group_1__2__Impl"


    // $ANTLR start "rule__SubExpression__Group__0"
    // InternalKExpressions.g:2987:1: rule__SubExpression__Group__0 : rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 ;
    public final void rule__SubExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2991:1: ( rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 )
            // InternalKExpressions.g:2992:2: rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_13);
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
    // InternalKExpressions.g:2999:1: rule__SubExpression__Group__0__Impl : ( ruleMultExpression ) ;
    public final void rule__SubExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3003:1: ( ( ruleMultExpression ) )
            // InternalKExpressions.g:3004:1: ( ruleMultExpression )
            {
            // InternalKExpressions.g:3004:1: ( ruleMultExpression )
            // InternalKExpressions.g:3005:1: ruleMultExpression
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
    // InternalKExpressions.g:3016:1: rule__SubExpression__Group__1 : rule__SubExpression__Group__1__Impl ;
    public final void rule__SubExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3020:1: ( rule__SubExpression__Group__1__Impl )
            // InternalKExpressions.g:3021:2: rule__SubExpression__Group__1__Impl
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
    // InternalKExpressions.g:3027:1: rule__SubExpression__Group__1__Impl : ( ( rule__SubExpression__Group_1__0 )* ) ;
    public final void rule__SubExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3031:1: ( ( ( rule__SubExpression__Group_1__0 )* ) )
            // InternalKExpressions.g:3032:1: ( ( rule__SubExpression__Group_1__0 )* )
            {
            // InternalKExpressions.g:3032:1: ( ( rule__SubExpression__Group_1__0 )* )
            // InternalKExpressions.g:3033:1: ( rule__SubExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:3034:1: ( rule__SubExpression__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==22) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalKExpressions.g:3034:2: rule__SubExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_14);
            	    rule__SubExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

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
    // InternalKExpressions.g:3048:1: rule__SubExpression__Group_1__0 : rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 ;
    public final void rule__SubExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3052:1: ( rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 )
            // InternalKExpressions.g:3053:2: rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_13);
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
    // InternalKExpressions.g:3060:1: rule__SubExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__SubExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3064:1: ( ( () ) )
            // InternalKExpressions.g:3065:1: ( () )
            {
            // InternalKExpressions.g:3065:1: ( () )
            // InternalKExpressions.g:3066:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:3067:1: ()
            // InternalKExpressions.g:3069:1: 
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
    // InternalKExpressions.g:3079:1: rule__SubExpression__Group_1__1 : rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2 ;
    public final void rule__SubExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3083:1: ( rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2 )
            // InternalKExpressions.g:3084:2: rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_12);
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
    // InternalKExpressions.g:3091:1: rule__SubExpression__Group_1__1__Impl : ( ( rule__SubExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__SubExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3095:1: ( ( ( rule__SubExpression__OperatorAssignment_1_1 ) ) )
            // InternalKExpressions.g:3096:1: ( ( rule__SubExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKExpressions.g:3096:1: ( ( rule__SubExpression__OperatorAssignment_1_1 ) )
            // InternalKExpressions.g:3097:1: ( rule__SubExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKExpressions.g:3098:1: ( rule__SubExpression__OperatorAssignment_1_1 )
            // InternalKExpressions.g:3098:2: rule__SubExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SubExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__SubExpression__Group_1__1__Impl"


    // $ANTLR start "rule__SubExpression__Group_1__2"
    // InternalKExpressions.g:3108:1: rule__SubExpression__Group_1__2 : rule__SubExpression__Group_1__2__Impl ;
    public final void rule__SubExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3112:1: ( rule__SubExpression__Group_1__2__Impl )
            // InternalKExpressions.g:3113:2: rule__SubExpression__Group_1__2__Impl
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
    // InternalKExpressions.g:3119:1: rule__SubExpression__Group_1__2__Impl : ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__SubExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3123:1: ( ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) ) )
            // InternalKExpressions.g:3124:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) )
            {
            // InternalKExpressions.g:3124:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) )
            // InternalKExpressions.g:3125:1: ( rule__SubExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // InternalKExpressions.g:3126:1: ( rule__SubExpression__SubExpressionsAssignment_1_2 )
            // InternalKExpressions.g:3126:2: rule__SubExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SubExpression__SubExpressionsAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__SubExpression__Group_1__2__Impl"


    // $ANTLR start "rule__MultExpression__Group__0"
    // InternalKExpressions.g:3142:1: rule__MultExpression__Group__0 : rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 ;
    public final void rule__MultExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3146:1: ( rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 )
            // InternalKExpressions.g:3147:2: rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
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
    // InternalKExpressions.g:3154:1: rule__MultExpression__Group__0__Impl : ( ruleDivExpression ) ;
    public final void rule__MultExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3158:1: ( ( ruleDivExpression ) )
            // InternalKExpressions.g:3159:1: ( ruleDivExpression )
            {
            // InternalKExpressions.g:3159:1: ( ruleDivExpression )
            // InternalKExpressions.g:3160:1: ruleDivExpression
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
    // InternalKExpressions.g:3171:1: rule__MultExpression__Group__1 : rule__MultExpression__Group__1__Impl ;
    public final void rule__MultExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3175:1: ( rule__MultExpression__Group__1__Impl )
            // InternalKExpressions.g:3176:2: rule__MultExpression__Group__1__Impl
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
    // InternalKExpressions.g:3182:1: rule__MultExpression__Group__1__Impl : ( ( rule__MultExpression__Group_1__0 )* ) ;
    public final void rule__MultExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3186:1: ( ( ( rule__MultExpression__Group_1__0 )* ) )
            // InternalKExpressions.g:3187:1: ( ( rule__MultExpression__Group_1__0 )* )
            {
            // InternalKExpressions.g:3187:1: ( ( rule__MultExpression__Group_1__0 )* )
            // InternalKExpressions.g:3188:1: ( rule__MultExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:3189:1: ( rule__MultExpression__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==23) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalKExpressions.g:3189:2: rule__MultExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    rule__MultExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

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
    // InternalKExpressions.g:3203:1: rule__MultExpression__Group_1__0 : rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 ;
    public final void rule__MultExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3207:1: ( rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 )
            // InternalKExpressions.g:3208:2: rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
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
    // InternalKExpressions.g:3215:1: rule__MultExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3219:1: ( ( () ) )
            // InternalKExpressions.g:3220:1: ( () )
            {
            // InternalKExpressions.g:3220:1: ( () )
            // InternalKExpressions.g:3221:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:3222:1: ()
            // InternalKExpressions.g:3224:1: 
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
    // InternalKExpressions.g:3234:1: rule__MultExpression__Group_1__1 : rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2 ;
    public final void rule__MultExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3238:1: ( rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2 )
            // InternalKExpressions.g:3239:2: rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_12);
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
    // InternalKExpressions.g:3246:1: rule__MultExpression__Group_1__1__Impl : ( ( rule__MultExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3250:1: ( ( ( rule__MultExpression__OperatorAssignment_1_1 ) ) )
            // InternalKExpressions.g:3251:1: ( ( rule__MultExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKExpressions.g:3251:1: ( ( rule__MultExpression__OperatorAssignment_1_1 ) )
            // InternalKExpressions.g:3252:1: ( rule__MultExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKExpressions.g:3253:1: ( rule__MultExpression__OperatorAssignment_1_1 )
            // InternalKExpressions.g:3253:2: rule__MultExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__MultExpression__Group_1__1__Impl"


    // $ANTLR start "rule__MultExpression__Group_1__2"
    // InternalKExpressions.g:3263:1: rule__MultExpression__Group_1__2 : rule__MultExpression__Group_1__2__Impl ;
    public final void rule__MultExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3267:1: ( rule__MultExpression__Group_1__2__Impl )
            // InternalKExpressions.g:3268:2: rule__MultExpression__Group_1__2__Impl
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
    // InternalKExpressions.g:3274:1: rule__MultExpression__Group_1__2__Impl : ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__MultExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3278:1: ( ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) ) )
            // InternalKExpressions.g:3279:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) )
            {
            // InternalKExpressions.g:3279:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) )
            // InternalKExpressions.g:3280:1: ( rule__MultExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // InternalKExpressions.g:3281:1: ( rule__MultExpression__SubExpressionsAssignment_1_2 )
            // InternalKExpressions.g:3281:2: rule__MultExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultExpression__SubExpressionsAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__MultExpression__Group_1__2__Impl"


    // $ANTLR start "rule__DivExpression__Group__0"
    // InternalKExpressions.g:3297:1: rule__DivExpression__Group__0 : rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1 ;
    public final void rule__DivExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3301:1: ( rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1 )
            // InternalKExpressions.g:3302:2: rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
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
    // InternalKExpressions.g:3309:1: rule__DivExpression__Group__0__Impl : ( ruleModExpression ) ;
    public final void rule__DivExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3313:1: ( ( ruleModExpression ) )
            // InternalKExpressions.g:3314:1: ( ruleModExpression )
            {
            // InternalKExpressions.g:3314:1: ( ruleModExpression )
            // InternalKExpressions.g:3315:1: ruleModExpression
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
    // InternalKExpressions.g:3326:1: rule__DivExpression__Group__1 : rule__DivExpression__Group__1__Impl ;
    public final void rule__DivExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3330:1: ( rule__DivExpression__Group__1__Impl )
            // InternalKExpressions.g:3331:2: rule__DivExpression__Group__1__Impl
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
    // InternalKExpressions.g:3337:1: rule__DivExpression__Group__1__Impl : ( ( rule__DivExpression__Group_1__0 )? ) ;
    public final void rule__DivExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3341:1: ( ( ( rule__DivExpression__Group_1__0 )? ) )
            // InternalKExpressions.g:3342:1: ( ( rule__DivExpression__Group_1__0 )? )
            {
            // InternalKExpressions.g:3342:1: ( ( rule__DivExpression__Group_1__0 )? )
            // InternalKExpressions.g:3343:1: ( rule__DivExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:3344:1: ( rule__DivExpression__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==25) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalKExpressions.g:3344:2: rule__DivExpression__Group_1__0
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
    // InternalKExpressions.g:3358:1: rule__DivExpression__Group_1__0 : rule__DivExpression__Group_1__0__Impl rule__DivExpression__Group_1__1 ;
    public final void rule__DivExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3362:1: ( rule__DivExpression__Group_1__0__Impl rule__DivExpression__Group_1__1 )
            // InternalKExpressions.g:3363:2: rule__DivExpression__Group_1__0__Impl rule__DivExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
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
    // InternalKExpressions.g:3370:1: rule__DivExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__DivExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3374:1: ( ( () ) )
            // InternalKExpressions.g:3375:1: ( () )
            {
            // InternalKExpressions.g:3375:1: ( () )
            // InternalKExpressions.g:3376:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:3377:1: ()
            // InternalKExpressions.g:3379:1: 
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
    // InternalKExpressions.g:3389:1: rule__DivExpression__Group_1__1 : rule__DivExpression__Group_1__1__Impl rule__DivExpression__Group_1__2 ;
    public final void rule__DivExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3393:1: ( rule__DivExpression__Group_1__1__Impl rule__DivExpression__Group_1__2 )
            // InternalKExpressions.g:3394:2: rule__DivExpression__Group_1__1__Impl rule__DivExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_12);
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
    // InternalKExpressions.g:3401:1: rule__DivExpression__Group_1__1__Impl : ( ( rule__DivExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__DivExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3405:1: ( ( ( rule__DivExpression__OperatorAssignment_1_1 ) ) )
            // InternalKExpressions.g:3406:1: ( ( rule__DivExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKExpressions.g:3406:1: ( ( rule__DivExpression__OperatorAssignment_1_1 ) )
            // InternalKExpressions.g:3407:1: ( rule__DivExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKExpressions.g:3408:1: ( rule__DivExpression__OperatorAssignment_1_1 )
            // InternalKExpressions.g:3408:2: rule__DivExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DivExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
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
    // InternalKExpressions.g:3418:1: rule__DivExpression__Group_1__2 : rule__DivExpression__Group_1__2__Impl ;
    public final void rule__DivExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3422:1: ( rule__DivExpression__Group_1__2__Impl )
            // InternalKExpressions.g:3423:2: rule__DivExpression__Group_1__2__Impl
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
    // InternalKExpressions.g:3429:1: rule__DivExpression__Group_1__2__Impl : ( ( rule__DivExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__DivExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3433:1: ( ( ( rule__DivExpression__SubExpressionsAssignment_1_2 ) ) )
            // InternalKExpressions.g:3434:1: ( ( rule__DivExpression__SubExpressionsAssignment_1_2 ) )
            {
            // InternalKExpressions.g:3434:1: ( ( rule__DivExpression__SubExpressionsAssignment_1_2 ) )
            // InternalKExpressions.g:3435:1: ( rule__DivExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // InternalKExpressions.g:3436:1: ( rule__DivExpression__SubExpressionsAssignment_1_2 )
            // InternalKExpressions.g:3436:2: rule__DivExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DivExpression__SubExpressionsAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__ModExpression__Group__0"
    // InternalKExpressions.g:3452:1: rule__ModExpression__Group__0 : rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1 ;
    public final void rule__ModExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3456:1: ( rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1 )
            // InternalKExpressions.g:3457:2: rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_18);
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
    // InternalKExpressions.g:3464:1: rule__ModExpression__Group__0__Impl : ( ruleNegExpression ) ;
    public final void rule__ModExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3468:1: ( ( ruleNegExpression ) )
            // InternalKExpressions.g:3469:1: ( ruleNegExpression )
            {
            // InternalKExpressions.g:3469:1: ( ruleNegExpression )
            // InternalKExpressions.g:3470:1: ruleNegExpression
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
    // InternalKExpressions.g:3481:1: rule__ModExpression__Group__1 : rule__ModExpression__Group__1__Impl ;
    public final void rule__ModExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3485:1: ( rule__ModExpression__Group__1__Impl )
            // InternalKExpressions.g:3486:2: rule__ModExpression__Group__1__Impl
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
    // InternalKExpressions.g:3492:1: rule__ModExpression__Group__1__Impl : ( ( rule__ModExpression__Group_1__0 )? ) ;
    public final void rule__ModExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3496:1: ( ( ( rule__ModExpression__Group_1__0 )? ) )
            // InternalKExpressions.g:3497:1: ( ( rule__ModExpression__Group_1__0 )? )
            {
            // InternalKExpressions.g:3497:1: ( ( rule__ModExpression__Group_1__0 )? )
            // InternalKExpressions.g:3498:1: ( rule__ModExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:3499:1: ( rule__ModExpression__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==24) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalKExpressions.g:3499:2: rule__ModExpression__Group_1__0
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
    // InternalKExpressions.g:3513:1: rule__ModExpression__Group_1__0 : rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1 ;
    public final void rule__ModExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3517:1: ( rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1 )
            // InternalKExpressions.g:3518:2: rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_18);
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
    // InternalKExpressions.g:3525:1: rule__ModExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ModExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3529:1: ( ( () ) )
            // InternalKExpressions.g:3530:1: ( () )
            {
            // InternalKExpressions.g:3530:1: ( () )
            // InternalKExpressions.g:3531:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:3532:1: ()
            // InternalKExpressions.g:3534:1: 
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
    // InternalKExpressions.g:3544:1: rule__ModExpression__Group_1__1 : rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2 ;
    public final void rule__ModExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3548:1: ( rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2 )
            // InternalKExpressions.g:3549:2: rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_12);
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
    // InternalKExpressions.g:3556:1: rule__ModExpression__Group_1__1__Impl : ( ( rule__ModExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ModExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3560:1: ( ( ( rule__ModExpression__OperatorAssignment_1_1 ) ) )
            // InternalKExpressions.g:3561:1: ( ( rule__ModExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKExpressions.g:3561:1: ( ( rule__ModExpression__OperatorAssignment_1_1 ) )
            // InternalKExpressions.g:3562:1: ( rule__ModExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKExpressions.g:3563:1: ( rule__ModExpression__OperatorAssignment_1_1 )
            // InternalKExpressions.g:3563:2: rule__ModExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ModExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__ModExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ModExpression__Group_1__2"
    // InternalKExpressions.g:3573:1: rule__ModExpression__Group_1__2 : rule__ModExpression__Group_1__2__Impl ;
    public final void rule__ModExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3577:1: ( rule__ModExpression__Group_1__2__Impl )
            // InternalKExpressions.g:3578:2: rule__ModExpression__Group_1__2__Impl
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
    // InternalKExpressions.g:3584:1: rule__ModExpression__Group_1__2__Impl : ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__ModExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3588:1: ( ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) ) )
            // InternalKExpressions.g:3589:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) )
            {
            // InternalKExpressions.g:3589:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) )
            // InternalKExpressions.g:3590:1: ( rule__ModExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // InternalKExpressions.g:3591:1: ( rule__ModExpression__SubExpressionsAssignment_1_2 )
            // InternalKExpressions.g:3591:2: rule__ModExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ModExpression__SubExpressionsAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__ModExpression__Group_1__2__Impl"


    // $ANTLR start "rule__NegExpression__Group_0__0"
    // InternalKExpressions.g:3607:1: rule__NegExpression__Group_0__0 : rule__NegExpression__Group_0__0__Impl rule__NegExpression__Group_0__1 ;
    public final void rule__NegExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3611:1: ( rule__NegExpression__Group_0__0__Impl rule__NegExpression__Group_0__1 )
            // InternalKExpressions.g:3612:2: rule__NegExpression__Group_0__0__Impl rule__NegExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_13);
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
    // InternalKExpressions.g:3619:1: rule__NegExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__NegExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3623:1: ( ( () ) )
            // InternalKExpressions.g:3624:1: ( () )
            {
            // InternalKExpressions.g:3624:1: ( () )
            // InternalKExpressions.g:3625:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // InternalKExpressions.g:3626:1: ()
            // InternalKExpressions.g:3628:1: 
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
    // InternalKExpressions.g:3638:1: rule__NegExpression__Group_0__1 : rule__NegExpression__Group_0__1__Impl rule__NegExpression__Group_0__2 ;
    public final void rule__NegExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3642:1: ( rule__NegExpression__Group_0__1__Impl rule__NegExpression__Group_0__2 )
            // InternalKExpressions.g:3643:2: rule__NegExpression__Group_0__1__Impl rule__NegExpression__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_12);
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
    // InternalKExpressions.g:3650:1: rule__NegExpression__Group_0__1__Impl : ( ( rule__NegExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__NegExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3654:1: ( ( ( rule__NegExpression__OperatorAssignment_0_1 ) ) )
            // InternalKExpressions.g:3655:1: ( ( rule__NegExpression__OperatorAssignment_0_1 ) )
            {
            // InternalKExpressions.g:3655:1: ( ( rule__NegExpression__OperatorAssignment_0_1 ) )
            // InternalKExpressions.g:3656:1: ( rule__NegExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // InternalKExpressions.g:3657:1: ( rule__NegExpression__OperatorAssignment_0_1 )
            // InternalKExpressions.g:3657:2: rule__NegExpression__OperatorAssignment_0_1
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
    // InternalKExpressions.g:3667:1: rule__NegExpression__Group_0__2 : rule__NegExpression__Group_0__2__Impl ;
    public final void rule__NegExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3671:1: ( rule__NegExpression__Group_0__2__Impl )
            // InternalKExpressions.g:3672:2: rule__NegExpression__Group_0__2__Impl
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
    // InternalKExpressions.g:3678:1: rule__NegExpression__Group_0__2__Impl : ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) ) ;
    public final void rule__NegExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3682:1: ( ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) ) )
            // InternalKExpressions.g:3683:1: ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) )
            {
            // InternalKExpressions.g:3683:1: ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) )
            // InternalKExpressions.g:3684:1: ( rule__NegExpression__SubExpressionsAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getSubExpressionsAssignment_0_2()); 
            }
            // InternalKExpressions.g:3685:1: ( rule__NegExpression__SubExpressionsAssignment_0_2 )
            // InternalKExpressions.g:3685:2: rule__NegExpression__SubExpressionsAssignment_0_2
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
    // InternalKExpressions.g:3701:1: rule__AtomicExpression__Group_2__0 : rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 ;
    public final void rule__AtomicExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3705:1: ( rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 )
            // InternalKExpressions.g:3706:2: rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1
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
    // InternalKExpressions.g:3713:1: rule__AtomicExpression__Group_2__0__Impl : ( '(' ) ;
    public final void rule__AtomicExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3717:1: ( ( '(' ) )
            // InternalKExpressions.g:3718:1: ( '(' )
            {
            // InternalKExpressions.g:3718:1: ( '(' )
            // InternalKExpressions.g:3719:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:3732:1: rule__AtomicExpression__Group_2__1 : rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2 ;
    public final void rule__AtomicExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3736:1: ( rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2 )
            // InternalKExpressions.g:3737:2: rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_19);
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
    // InternalKExpressions.g:3744:1: rule__AtomicExpression__Group_2__1__Impl : ( ruleBooleanExpression ) ;
    public final void rule__AtomicExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3748:1: ( ( ruleBooleanExpression ) )
            // InternalKExpressions.g:3749:1: ( ruleBooleanExpression )
            {
            // InternalKExpressions.g:3749:1: ( ruleBooleanExpression )
            // InternalKExpressions.g:3750:1: ruleBooleanExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getBooleanExpressionParserRuleCall_2_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__AtomicExpression__Group_2__1__Impl"


    // $ANTLR start "rule__AtomicExpression__Group_2__2"
    // InternalKExpressions.g:3761:1: rule__AtomicExpression__Group_2__2 : rule__AtomicExpression__Group_2__2__Impl ;
    public final void rule__AtomicExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3765:1: ( rule__AtomicExpression__Group_2__2__Impl )
            // InternalKExpressions.g:3766:2: rule__AtomicExpression__Group_2__2__Impl
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
    // InternalKExpressions.g:3772:1: rule__AtomicExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__AtomicExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3776:1: ( ( ')' ) )
            // InternalKExpressions.g:3777:1: ( ')' )
            {
            // InternalKExpressions.g:3777:1: ( ')' )
            // InternalKExpressions.g:3778:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__AtomicValuedExpression__Group_2__0"
    // InternalKExpressions.g:3797:1: rule__AtomicValuedExpression__Group_2__0 : rule__AtomicValuedExpression__Group_2__0__Impl rule__AtomicValuedExpression__Group_2__1 ;
    public final void rule__AtomicValuedExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3801:1: ( rule__AtomicValuedExpression__Group_2__0__Impl rule__AtomicValuedExpression__Group_2__1 )
            // InternalKExpressions.g:3802:2: rule__AtomicValuedExpression__Group_2__0__Impl rule__AtomicValuedExpression__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__AtomicValuedExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AtomicValuedExpression__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicValuedExpression__Group_2__0"


    // $ANTLR start "rule__AtomicValuedExpression__Group_2__0__Impl"
    // InternalKExpressions.g:3809:1: rule__AtomicValuedExpression__Group_2__0__Impl : ( ( '(' ) ) ;
    public final void rule__AtomicValuedExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3813:1: ( ( ( '(' ) ) )
            // InternalKExpressions.g:3814:1: ( ( '(' ) )
            {
            // InternalKExpressions.g:3814:1: ( ( '(' ) )
            // InternalKExpressions.g:3815:1: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0()); 
            }
            // InternalKExpressions.g:3816:1: ( '(' )
            // InternalKExpressions.g:3817:2: '('
            {
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__AtomicValuedExpression__Group_2__0__Impl"


    // $ANTLR start "rule__AtomicValuedExpression__Group_2__1"
    // InternalKExpressions.g:3828:1: rule__AtomicValuedExpression__Group_2__1 : rule__AtomicValuedExpression__Group_2__1__Impl rule__AtomicValuedExpression__Group_2__2 ;
    public final void rule__AtomicValuedExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3832:1: ( rule__AtomicValuedExpression__Group_2__1__Impl rule__AtomicValuedExpression__Group_2__2 )
            // InternalKExpressions.g:3833:2: rule__AtomicValuedExpression__Group_2__1__Impl rule__AtomicValuedExpression__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__AtomicValuedExpression__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AtomicValuedExpression__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicValuedExpression__Group_2__1"


    // $ANTLR start "rule__AtomicValuedExpression__Group_2__1__Impl"
    // InternalKExpressions.g:3840:1: rule__AtomicValuedExpression__Group_2__1__Impl : ( ruleValuedExpression ) ;
    public final void rule__AtomicValuedExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3844:1: ( ( ruleValuedExpression ) )
            // InternalKExpressions.g:3845:1: ( ruleValuedExpression )
            {
            // InternalKExpressions.g:3845:1: ( ruleValuedExpression )
            // InternalKExpressions.g:3846:1: ruleValuedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_2_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValuedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicValuedExpression__Group_2__1__Impl"


    // $ANTLR start "rule__AtomicValuedExpression__Group_2__2"
    // InternalKExpressions.g:3857:1: rule__AtomicValuedExpression__Group_2__2 : rule__AtomicValuedExpression__Group_2__2__Impl ;
    public final void rule__AtomicValuedExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3861:1: ( rule__AtomicValuedExpression__Group_2__2__Impl )
            // InternalKExpressions.g:3862:2: rule__AtomicValuedExpression__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AtomicValuedExpression__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicValuedExpression__Group_2__2"


    // $ANTLR start "rule__AtomicValuedExpression__Group_2__2__Impl"
    // InternalKExpressions.g:3868:1: rule__AtomicValuedExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__AtomicValuedExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3872:1: ( ( ')' ) )
            // InternalKExpressions.g:3873:1: ( ')' )
            {
            // InternalKExpressions.g:3873:1: ( ')' )
            // InternalKExpressions.g:3874:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__AtomicValuedExpression__Group_2__2__Impl"


    // $ANTLR start "rule__ValuedObjectTestExpression__Group_0__0"
    // InternalKExpressions.g:3893:1: rule__ValuedObjectTestExpression__Group_0__0 : rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1 ;
    public final void rule__ValuedObjectTestExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3897:1: ( rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1 )
            // InternalKExpressions.g:3898:2: rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_20);
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
    // InternalKExpressions.g:3905:1: rule__ValuedObjectTestExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3909:1: ( ( () ) )
            // InternalKExpressions.g:3910:1: ( () )
            {
            // InternalKExpressions.g:3910:1: ( () )
            // InternalKExpressions.g:3911:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // InternalKExpressions.g:3912:1: ()
            // InternalKExpressions.g:3914:1: 
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
    // InternalKExpressions.g:3924:1: rule__ValuedObjectTestExpression__Group_0__1 : rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2 ;
    public final void rule__ValuedObjectTestExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3928:1: ( rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2 )
            // InternalKExpressions.g:3929:2: rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_21);
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
    // InternalKExpressions.g:3936:1: rule__ValuedObjectTestExpression__Group_0__1__Impl : ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3940:1: ( ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) ) )
            // InternalKExpressions.g:3941:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) )
            {
            // InternalKExpressions.g:3941:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) )
            // InternalKExpressions.g:3942:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // InternalKExpressions.g:3943:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 )
            // InternalKExpressions.g:3943:2: rule__ValuedObjectTestExpression__OperatorAssignment_0_1
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
    // InternalKExpressions.g:3953:1: rule__ValuedObjectTestExpression__Group_0__2 : rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3 ;
    public final void rule__ValuedObjectTestExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3957:1: ( rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3 )
            // InternalKExpressions.g:3958:2: rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3
            {
            pushFollow(FollowSets000.FOLLOW_22);
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
    // InternalKExpressions.g:3965:1: rule__ValuedObjectTestExpression__Group_0__2__Impl : ( '(' ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3969:1: ( ( '(' ) )
            // InternalKExpressions.g:3970:1: ( '(' )
            {
            // InternalKExpressions.g:3970:1: ( '(' )
            // InternalKExpressions.g:3971:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:3984:1: rule__ValuedObjectTestExpression__Group_0__3 : rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4 ;
    public final void rule__ValuedObjectTestExpression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3988:1: ( rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4 )
            // InternalKExpressions.g:3989:2: rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4
            {
            pushFollow(FollowSets000.FOLLOW_19);
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
    // InternalKExpressions.g:3996:1: rule__ValuedObjectTestExpression__Group_0__3__Impl : ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4000:1: ( ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) ) )
            // InternalKExpressions.g:4001:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) )
            {
            // InternalKExpressions.g:4001:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) )
            // InternalKExpressions.g:4002:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsAssignment_0_3()); 
            }
            // InternalKExpressions.g:4003:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 )
            // InternalKExpressions.g:4003:2: rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3
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
    // InternalKExpressions.g:4013:1: rule__ValuedObjectTestExpression__Group_0__4 : rule__ValuedObjectTestExpression__Group_0__4__Impl ;
    public final void rule__ValuedObjectTestExpression__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4017:1: ( rule__ValuedObjectTestExpression__Group_0__4__Impl )
            // InternalKExpressions.g:4018:2: rule__ValuedObjectTestExpression__Group_0__4__Impl
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
    // InternalKExpressions.g:4024:1: rule__ValuedObjectTestExpression__Group_0__4__Impl : ( ')' ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4028:1: ( ( ')' ) )
            // InternalKExpressions.g:4029:1: ( ')' )
            {
            // InternalKExpressions.g:4029:1: ( ')' )
            // InternalKExpressions.g:4030:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4()); 
            }
            match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__ValuedObjectTestExpression__Group_1__0"
    // InternalKExpressions.g:4053:1: rule__ValuedObjectTestExpression__Group_1__0 : rule__ValuedObjectTestExpression__Group_1__0__Impl rule__ValuedObjectTestExpression__Group_1__1 ;
    public final void rule__ValuedObjectTestExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4057:1: ( rule__ValuedObjectTestExpression__Group_1__0__Impl rule__ValuedObjectTestExpression__Group_1__1 )
            // InternalKExpressions.g:4058:2: rule__ValuedObjectTestExpression__Group_1__0__Impl rule__ValuedObjectTestExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__ValuedObjectTestExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ValuedObjectTestExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValuedObjectTestExpression__Group_1__0"


    // $ANTLR start "rule__ValuedObjectTestExpression__Group_1__0__Impl"
    // InternalKExpressions.g:4065:1: rule__ValuedObjectTestExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ValuedObjectTestExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4069:1: ( ( () ) )
            // InternalKExpressions.g:4070:1: ( () )
            {
            // InternalKExpressions.g:4070:1: ( () )
            // InternalKExpressions.g:4071:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorExpressionAction_1_0()); 
            }
            // InternalKExpressions.g:4072:1: ()
            // InternalKExpressions.g:4074:1: 
            {
            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__ValuedObjectTestExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ValuedObjectTestExpression__Group_1__1"
    // InternalKExpressions.g:4084:1: rule__ValuedObjectTestExpression__Group_1__1 : rule__ValuedObjectTestExpression__Group_1__1__Impl rule__ValuedObjectTestExpression__Group_1__2 ;
    public final void rule__ValuedObjectTestExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4088:1: ( rule__ValuedObjectTestExpression__Group_1__1__Impl rule__ValuedObjectTestExpression__Group_1__2 )
            // InternalKExpressions.g:4089:2: rule__ValuedObjectTestExpression__Group_1__1__Impl rule__ValuedObjectTestExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__ValuedObjectTestExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ValuedObjectTestExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValuedObjectTestExpression__Group_1__1"


    // $ANTLR start "rule__ValuedObjectTestExpression__Group_1__1__Impl"
    // InternalKExpressions.g:4096:1: rule__ValuedObjectTestExpression__Group_1__1__Impl : ( ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4100:1: ( ( ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 ) ) )
            // InternalKExpressions.g:4101:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKExpressions.g:4101:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 ) )
            // InternalKExpressions.g:4102:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKExpressions.g:4103:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 )
            // InternalKExpressions.g:4103:2: rule__ValuedObjectTestExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ValuedObjectTestExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__ValuedObjectTestExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ValuedObjectTestExpression__Group_1__2"
    // InternalKExpressions.g:4113:1: rule__ValuedObjectTestExpression__Group_1__2 : rule__ValuedObjectTestExpression__Group_1__2__Impl ;
    public final void rule__ValuedObjectTestExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4117:1: ( rule__ValuedObjectTestExpression__Group_1__2__Impl )
            // InternalKExpressions.g:4118:2: rule__ValuedObjectTestExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ValuedObjectTestExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValuedObjectTestExpression__Group_1__2"


    // $ANTLR start "rule__ValuedObjectTestExpression__Group_1__2__Impl"
    // InternalKExpressions.g:4124:1: rule__ValuedObjectTestExpression__Group_1__2__Impl : ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4128:1: ( ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 ) ) )
            // InternalKExpressions.g:4129:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 ) )
            {
            // InternalKExpressions.g:4129:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 ) )
            // InternalKExpressions.g:4130:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // InternalKExpressions.g:4131:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 )
            // InternalKExpressions.g:4131:2: rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__ValuedObjectTestExpression__Group_1__2__Impl"


    // $ANTLR start "rule__TextExpression__Group__0"
    // InternalKExpressions.g:4147:1: rule__TextExpression__Group__0 : rule__TextExpression__Group__0__Impl rule__TextExpression__Group__1 ;
    public final void rule__TextExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4151:1: ( rule__TextExpression__Group__0__Impl rule__TextExpression__Group__1 )
            // InternalKExpressions.g:4152:2: rule__TextExpression__Group__0__Impl rule__TextExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__TextExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TextExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextExpression__Group__0"


    // $ANTLR start "rule__TextExpression__Group__0__Impl"
    // InternalKExpressions.g:4159:1: rule__TextExpression__Group__0__Impl : ( ( rule__TextExpression__CodeAssignment_0 ) ) ;
    public final void rule__TextExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4163:1: ( ( ( rule__TextExpression__CodeAssignment_0 ) ) )
            // InternalKExpressions.g:4164:1: ( ( rule__TextExpression__CodeAssignment_0 ) )
            {
            // InternalKExpressions.g:4164:1: ( ( rule__TextExpression__CodeAssignment_0 ) )
            // InternalKExpressions.g:4165:1: ( rule__TextExpression__CodeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getCodeAssignment_0()); 
            }
            // InternalKExpressions.g:4166:1: ( rule__TextExpression__CodeAssignment_0 )
            // InternalKExpressions.g:4166:2: rule__TextExpression__CodeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TextExpression__CodeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__TextExpression__Group__0__Impl"


    // $ANTLR start "rule__TextExpression__Group__1"
    // InternalKExpressions.g:4176:1: rule__TextExpression__Group__1 : rule__TextExpression__Group__1__Impl ;
    public final void rule__TextExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4180:1: ( rule__TextExpression__Group__1__Impl )
            // InternalKExpressions.g:4181:2: rule__TextExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TextExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextExpression__Group__1"


    // $ANTLR start "rule__TextExpression__Group__1__Impl"
    // InternalKExpressions.g:4187:1: rule__TextExpression__Group__1__Impl : ( ( rule__TextExpression__Group_1__0 )? ) ;
    public final void rule__TextExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4191:1: ( ( ( rule__TextExpression__Group_1__0 )? ) )
            // InternalKExpressions.g:4192:1: ( ( rule__TextExpression__Group_1__0 )? )
            {
            // InternalKExpressions.g:4192:1: ( ( rule__TextExpression__Group_1__0 )? )
            // InternalKExpressions.g:4193:1: ( rule__TextExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:4194:1: ( rule__TextExpression__Group_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==45) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalKExpressions.g:4194:2: rule__TextExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TextExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__TextExpression__Group__1__Impl"


    // $ANTLR start "rule__TextExpression__Group_1__0"
    // InternalKExpressions.g:4208:1: rule__TextExpression__Group_1__0 : rule__TextExpression__Group_1__0__Impl rule__TextExpression__Group_1__1 ;
    public final void rule__TextExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4212:1: ( rule__TextExpression__Group_1__0__Impl rule__TextExpression__Group_1__1 )
            // InternalKExpressions.g:4213:2: rule__TextExpression__Group_1__0__Impl rule__TextExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__TextExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TextExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextExpression__Group_1__0"


    // $ANTLR start "rule__TextExpression__Group_1__0__Impl"
    // InternalKExpressions.g:4220:1: rule__TextExpression__Group_1__0__Impl : ( '(' ) ;
    public final void rule__TextExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4224:1: ( ( '(' ) )
            // InternalKExpressions.g:4225:1: ( '(' )
            {
            // InternalKExpressions.g:4225:1: ( '(' )
            // InternalKExpressions.g:4226:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__TextExpression__Group_1__0__Impl"


    // $ANTLR start "rule__TextExpression__Group_1__1"
    // InternalKExpressions.g:4239:1: rule__TextExpression__Group_1__1 : rule__TextExpression__Group_1__1__Impl rule__TextExpression__Group_1__2 ;
    public final void rule__TextExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4243:1: ( rule__TextExpression__Group_1__1__Impl rule__TextExpression__Group_1__2 )
            // InternalKExpressions.g:4244:2: rule__TextExpression__Group_1__1__Impl rule__TextExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__TextExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TextExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextExpression__Group_1__1"


    // $ANTLR start "rule__TextExpression__Group_1__1__Impl"
    // InternalKExpressions.g:4251:1: rule__TextExpression__Group_1__1__Impl : ( ( rule__TextExpression__TypeAssignment_1_1 ) ) ;
    public final void rule__TextExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4255:1: ( ( ( rule__TextExpression__TypeAssignment_1_1 ) ) )
            // InternalKExpressions.g:4256:1: ( ( rule__TextExpression__TypeAssignment_1_1 ) )
            {
            // InternalKExpressions.g:4256:1: ( ( rule__TextExpression__TypeAssignment_1_1 ) )
            // InternalKExpressions.g:4257:1: ( rule__TextExpression__TypeAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getTypeAssignment_1_1()); 
            }
            // InternalKExpressions.g:4258:1: ( rule__TextExpression__TypeAssignment_1_1 )
            // InternalKExpressions.g:4258:2: rule__TextExpression__TypeAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TextExpression__TypeAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__TextExpression__Group_1__1__Impl"


    // $ANTLR start "rule__TextExpression__Group_1__2"
    // InternalKExpressions.g:4268:1: rule__TextExpression__Group_1__2 : rule__TextExpression__Group_1__2__Impl ;
    public final void rule__TextExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4272:1: ( rule__TextExpression__Group_1__2__Impl )
            // InternalKExpressions.g:4273:2: rule__TextExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TextExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextExpression__Group_1__2"


    // $ANTLR start "rule__TextExpression__Group_1__2__Impl"
    // InternalKExpressions.g:4279:1: rule__TextExpression__Group_1__2__Impl : ( ')' ) ;
    public final void rule__TextExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4283:1: ( ( ')' ) )
            // InternalKExpressions.g:4284:1: ( ')' )
            {
            // InternalKExpressions.g:4284:1: ( ')' )
            // InternalKExpressions.g:4285:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__TextExpression__Group_1__2__Impl"


    // $ANTLR start "rule__ISignal__Group__0"
    // InternalKExpressions.g:4304:1: rule__ISignal__Group__0 : rule__ISignal__Group__0__Impl rule__ISignal__Group__1 ;
    public final void rule__ISignal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4308:1: ( rule__ISignal__Group__0__Impl rule__ISignal__Group__1 )
            // InternalKExpressions.g:4309:2: rule__ISignal__Group__0__Impl rule__ISignal__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__ISignal__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ISignal__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ISignal__Group__0"


    // $ANTLR start "rule__ISignal__Group__0__Impl"
    // InternalKExpressions.g:4316:1: rule__ISignal__Group__0__Impl : ( ( rule__ISignal__NameAssignment_0 ) ) ;
    public final void rule__ISignal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4320:1: ( ( ( rule__ISignal__NameAssignment_0 ) ) )
            // InternalKExpressions.g:4321:1: ( ( rule__ISignal__NameAssignment_0 ) )
            {
            // InternalKExpressions.g:4321:1: ( ( rule__ISignal__NameAssignment_0 ) )
            // InternalKExpressions.g:4322:1: ( rule__ISignal__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getISignalAccess().getNameAssignment_0()); 
            }
            // InternalKExpressions.g:4323:1: ( rule__ISignal__NameAssignment_0 )
            // InternalKExpressions.g:4323:2: rule__ISignal__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ISignal__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getISignalAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ISignal__Group__0__Impl"


    // $ANTLR start "rule__ISignal__Group__1"
    // InternalKExpressions.g:4333:1: rule__ISignal__Group__1 : rule__ISignal__Group__1__Impl ;
    public final void rule__ISignal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4337:1: ( rule__ISignal__Group__1__Impl )
            // InternalKExpressions.g:4338:2: rule__ISignal__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ISignal__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ISignal__Group__1"


    // $ANTLR start "rule__ISignal__Group__1__Impl"
    // InternalKExpressions.g:4344:1: rule__ISignal__Group__1__Impl : ( ( rule__ISignal__ChannelDescrAssignment_1 )? ) ;
    public final void rule__ISignal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4348:1: ( ( ( rule__ISignal__ChannelDescrAssignment_1 )? ) )
            // InternalKExpressions.g:4349:1: ( ( rule__ISignal__ChannelDescrAssignment_1 )? )
            {
            // InternalKExpressions.g:4349:1: ( ( rule__ISignal__ChannelDescrAssignment_1 )? )
            // InternalKExpressions.g:4350:1: ( rule__ISignal__ChannelDescrAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getISignalAccess().getChannelDescrAssignment_1()); 
            }
            // InternalKExpressions.g:4351:1: ( rule__ISignal__ChannelDescrAssignment_1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==45||(LA29_0>=53 && LA29_0<=54)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalKExpressions.g:4351:2: rule__ISignal__ChannelDescrAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ISignal__ChannelDescrAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getISignalAccess().getChannelDescrAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ISignal__Group__1__Impl"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_0__0"
    // InternalKExpressions.g:4365:1: rule__InterfaceSignalDecl__Group_0__0 : rule__InterfaceSignalDecl__Group_0__0__Impl rule__InterfaceSignalDecl__Group_0__1 ;
    public final void rule__InterfaceSignalDecl__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4369:1: ( rule__InterfaceSignalDecl__Group_0__0__Impl rule__InterfaceSignalDecl__Group_0__1 )
            // InternalKExpressions.g:4370:2: rule__InterfaceSignalDecl__Group_0__0__Impl rule__InterfaceSignalDecl__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__InterfaceSignalDecl__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceSignalDecl__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_0__0"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_0__0__Impl"
    // InternalKExpressions.g:4377:1: rule__InterfaceSignalDecl__Group_0__0__Impl : ( () ) ;
    public final void rule__InterfaceSignalDecl__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4381:1: ( ( () ) )
            // InternalKExpressions.g:4382:1: ( () )
            {
            // InternalKExpressions.g:4382:1: ( () )
            // InternalKExpressions.g:4383:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getInputAction_0_0()); 
            }
            // InternalKExpressions.g:4384:1: ()
            // InternalKExpressions.g:4386:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceSignalDeclAccess().getInputAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_0__0__Impl"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_0__1"
    // InternalKExpressions.g:4396:1: rule__InterfaceSignalDecl__Group_0__1 : rule__InterfaceSignalDecl__Group_0__1__Impl rule__InterfaceSignalDecl__Group_0__2 ;
    public final void rule__InterfaceSignalDecl__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4400:1: ( rule__InterfaceSignalDecl__Group_0__1__Impl rule__InterfaceSignalDecl__Group_0__2 )
            // InternalKExpressions.g:4401:2: rule__InterfaceSignalDecl__Group_0__1__Impl rule__InterfaceSignalDecl__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__InterfaceSignalDecl__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceSignalDecl__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_0__1"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_0__1__Impl"
    // InternalKExpressions.g:4408:1: rule__InterfaceSignalDecl__Group_0__1__Impl : ( 'input' ) ;
    public final void rule__InterfaceSignalDecl__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4412:1: ( ( 'input' ) )
            // InternalKExpressions.g:4413:1: ( 'input' )
            {
            // InternalKExpressions.g:4413:1: ( 'input' )
            // InternalKExpressions.g:4414:1: 'input'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getInputKeyword_0_1()); 
            }
            match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceSignalDeclAccess().getInputKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_0__1__Impl"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_0__2"
    // InternalKExpressions.g:4427:1: rule__InterfaceSignalDecl__Group_0__2 : rule__InterfaceSignalDecl__Group_0__2__Impl rule__InterfaceSignalDecl__Group_0__3 ;
    public final void rule__InterfaceSignalDecl__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4431:1: ( rule__InterfaceSignalDecl__Group_0__2__Impl rule__InterfaceSignalDecl__Group_0__3 )
            // InternalKExpressions.g:4432:2: rule__InterfaceSignalDecl__Group_0__2__Impl rule__InterfaceSignalDecl__Group_0__3
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__InterfaceSignalDecl__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceSignalDecl__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_0__2"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_0__2__Impl"
    // InternalKExpressions.g:4439:1: rule__InterfaceSignalDecl__Group_0__2__Impl : ( ( rule__InterfaceSignalDecl__SignalsAssignment_0_2 ) ) ;
    public final void rule__InterfaceSignalDecl__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4443:1: ( ( ( rule__InterfaceSignalDecl__SignalsAssignment_0_2 ) ) )
            // InternalKExpressions.g:4444:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_0_2 ) )
            {
            // InternalKExpressions.g:4444:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_0_2 ) )
            // InternalKExpressions.g:4445:1: ( rule__InterfaceSignalDecl__SignalsAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSignalsAssignment_0_2()); 
            }
            // InternalKExpressions.g:4446:1: ( rule__InterfaceSignalDecl__SignalsAssignment_0_2 )
            // InternalKExpressions.g:4446:2: rule__InterfaceSignalDecl__SignalsAssignment_0_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceSignalDecl__SignalsAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceSignalDeclAccess().getSignalsAssignment_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_0__2__Impl"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_0__3"
    // InternalKExpressions.g:4456:1: rule__InterfaceSignalDecl__Group_0__3 : rule__InterfaceSignalDecl__Group_0__3__Impl rule__InterfaceSignalDecl__Group_0__4 ;
    public final void rule__InterfaceSignalDecl__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4460:1: ( rule__InterfaceSignalDecl__Group_0__3__Impl rule__InterfaceSignalDecl__Group_0__4 )
            // InternalKExpressions.g:4461:2: rule__InterfaceSignalDecl__Group_0__3__Impl rule__InterfaceSignalDecl__Group_0__4
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__InterfaceSignalDecl__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceSignalDecl__Group_0__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_0__3"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_0__3__Impl"
    // InternalKExpressions.g:4468:1: rule__InterfaceSignalDecl__Group_0__3__Impl : ( ( rule__InterfaceSignalDecl__Group_0_3__0 )* ) ;
    public final void rule__InterfaceSignalDecl__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4472:1: ( ( ( rule__InterfaceSignalDecl__Group_0_3__0 )* ) )
            // InternalKExpressions.g:4473:1: ( ( rule__InterfaceSignalDecl__Group_0_3__0 )* )
            {
            // InternalKExpressions.g:4473:1: ( ( rule__InterfaceSignalDecl__Group_0_3__0 )* )
            // InternalKExpressions.g:4474:1: ( rule__InterfaceSignalDecl__Group_0_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getGroup_0_3()); 
            }
            // InternalKExpressions.g:4475:1: ( rule__InterfaceSignalDecl__Group_0_3__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==49) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalKExpressions.g:4475:2: rule__InterfaceSignalDecl__Group_0_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    rule__InterfaceSignalDecl__Group_0_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceSignalDeclAccess().getGroup_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_0__3__Impl"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_0__4"
    // InternalKExpressions.g:4485:1: rule__InterfaceSignalDecl__Group_0__4 : rule__InterfaceSignalDecl__Group_0__4__Impl ;
    public final void rule__InterfaceSignalDecl__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4489:1: ( rule__InterfaceSignalDecl__Group_0__4__Impl )
            // InternalKExpressions.g:4490:2: rule__InterfaceSignalDecl__Group_0__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceSignalDecl__Group_0__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_0__4"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_0__4__Impl"
    // InternalKExpressions.g:4496:1: rule__InterfaceSignalDecl__Group_0__4__Impl : ( ';' ) ;
    public final void rule__InterfaceSignalDecl__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4500:1: ( ( ';' ) )
            // InternalKExpressions.g:4501:1: ( ';' )
            {
            // InternalKExpressions.g:4501:1: ( ';' )
            // InternalKExpressions.g:4502:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSemicolonKeyword_0_4()); 
            }
            match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceSignalDeclAccess().getSemicolonKeyword_0_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_0__4__Impl"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_0_3__0"
    // InternalKExpressions.g:4525:1: rule__InterfaceSignalDecl__Group_0_3__0 : rule__InterfaceSignalDecl__Group_0_3__0__Impl rule__InterfaceSignalDecl__Group_0_3__1 ;
    public final void rule__InterfaceSignalDecl__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4529:1: ( rule__InterfaceSignalDecl__Group_0_3__0__Impl rule__InterfaceSignalDecl__Group_0_3__1 )
            // InternalKExpressions.g:4530:2: rule__InterfaceSignalDecl__Group_0_3__0__Impl rule__InterfaceSignalDecl__Group_0_3__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__InterfaceSignalDecl__Group_0_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceSignalDecl__Group_0_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_0_3__0"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_0_3__0__Impl"
    // InternalKExpressions.g:4537:1: rule__InterfaceSignalDecl__Group_0_3__0__Impl : ( ',' ) ;
    public final void rule__InterfaceSignalDecl__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4541:1: ( ( ',' ) )
            // InternalKExpressions.g:4542:1: ( ',' )
            {
            // InternalKExpressions.g:4542:1: ( ',' )
            // InternalKExpressions.g:4543:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getCommaKeyword_0_3_0()); 
            }
            match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceSignalDeclAccess().getCommaKeyword_0_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_0_3__0__Impl"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_0_3__1"
    // InternalKExpressions.g:4556:1: rule__InterfaceSignalDecl__Group_0_3__1 : rule__InterfaceSignalDecl__Group_0_3__1__Impl ;
    public final void rule__InterfaceSignalDecl__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4560:1: ( rule__InterfaceSignalDecl__Group_0_3__1__Impl )
            // InternalKExpressions.g:4561:2: rule__InterfaceSignalDecl__Group_0_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceSignalDecl__Group_0_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_0_3__1"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_0_3__1__Impl"
    // InternalKExpressions.g:4567:1: rule__InterfaceSignalDecl__Group_0_3__1__Impl : ( ( rule__InterfaceSignalDecl__SignalsAssignment_0_3_1 ) ) ;
    public final void rule__InterfaceSignalDecl__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4571:1: ( ( ( rule__InterfaceSignalDecl__SignalsAssignment_0_3_1 ) ) )
            // InternalKExpressions.g:4572:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_0_3_1 ) )
            {
            // InternalKExpressions.g:4572:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_0_3_1 ) )
            // InternalKExpressions.g:4573:1: ( rule__InterfaceSignalDecl__SignalsAssignment_0_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSignalsAssignment_0_3_1()); 
            }
            // InternalKExpressions.g:4574:1: ( rule__InterfaceSignalDecl__SignalsAssignment_0_3_1 )
            // InternalKExpressions.g:4574:2: rule__InterfaceSignalDecl__SignalsAssignment_0_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceSignalDecl__SignalsAssignment_0_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceSignalDeclAccess().getSignalsAssignment_0_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_0_3__1__Impl"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_1__0"
    // InternalKExpressions.g:4588:1: rule__InterfaceSignalDecl__Group_1__0 : rule__InterfaceSignalDecl__Group_1__0__Impl rule__InterfaceSignalDecl__Group_1__1 ;
    public final void rule__InterfaceSignalDecl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4592:1: ( rule__InterfaceSignalDecl__Group_1__0__Impl rule__InterfaceSignalDecl__Group_1__1 )
            // InternalKExpressions.g:4593:2: rule__InterfaceSignalDecl__Group_1__0__Impl rule__InterfaceSignalDecl__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__InterfaceSignalDecl__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceSignalDecl__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_1__0"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_1__0__Impl"
    // InternalKExpressions.g:4600:1: rule__InterfaceSignalDecl__Group_1__0__Impl : ( () ) ;
    public final void rule__InterfaceSignalDecl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4604:1: ( ( () ) )
            // InternalKExpressions.g:4605:1: ( () )
            {
            // InternalKExpressions.g:4605:1: ( () )
            // InternalKExpressions.g:4606:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getOutputAction_1_0()); 
            }
            // InternalKExpressions.g:4607:1: ()
            // InternalKExpressions.g:4609:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceSignalDeclAccess().getOutputAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_1__0__Impl"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_1__1"
    // InternalKExpressions.g:4619:1: rule__InterfaceSignalDecl__Group_1__1 : rule__InterfaceSignalDecl__Group_1__1__Impl rule__InterfaceSignalDecl__Group_1__2 ;
    public final void rule__InterfaceSignalDecl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4623:1: ( rule__InterfaceSignalDecl__Group_1__1__Impl rule__InterfaceSignalDecl__Group_1__2 )
            // InternalKExpressions.g:4624:2: rule__InterfaceSignalDecl__Group_1__1__Impl rule__InterfaceSignalDecl__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__InterfaceSignalDecl__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceSignalDecl__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_1__1"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_1__1__Impl"
    // InternalKExpressions.g:4631:1: rule__InterfaceSignalDecl__Group_1__1__Impl : ( 'output' ) ;
    public final void rule__InterfaceSignalDecl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4635:1: ( ( 'output' ) )
            // InternalKExpressions.g:4636:1: ( 'output' )
            {
            // InternalKExpressions.g:4636:1: ( 'output' )
            // InternalKExpressions.g:4637:1: 'output'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getOutputKeyword_1_1()); 
            }
            match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceSignalDeclAccess().getOutputKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_1__1__Impl"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_1__2"
    // InternalKExpressions.g:4650:1: rule__InterfaceSignalDecl__Group_1__2 : rule__InterfaceSignalDecl__Group_1__2__Impl rule__InterfaceSignalDecl__Group_1__3 ;
    public final void rule__InterfaceSignalDecl__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4654:1: ( rule__InterfaceSignalDecl__Group_1__2__Impl rule__InterfaceSignalDecl__Group_1__3 )
            // InternalKExpressions.g:4655:2: rule__InterfaceSignalDecl__Group_1__2__Impl rule__InterfaceSignalDecl__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__InterfaceSignalDecl__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceSignalDecl__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_1__2"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_1__2__Impl"
    // InternalKExpressions.g:4662:1: rule__InterfaceSignalDecl__Group_1__2__Impl : ( ( rule__InterfaceSignalDecl__SignalsAssignment_1_2 ) ) ;
    public final void rule__InterfaceSignalDecl__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4666:1: ( ( ( rule__InterfaceSignalDecl__SignalsAssignment_1_2 ) ) )
            // InternalKExpressions.g:4667:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_1_2 ) )
            {
            // InternalKExpressions.g:4667:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_1_2 ) )
            // InternalKExpressions.g:4668:1: ( rule__InterfaceSignalDecl__SignalsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSignalsAssignment_1_2()); 
            }
            // InternalKExpressions.g:4669:1: ( rule__InterfaceSignalDecl__SignalsAssignment_1_2 )
            // InternalKExpressions.g:4669:2: rule__InterfaceSignalDecl__SignalsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceSignalDecl__SignalsAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceSignalDeclAccess().getSignalsAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_1__2__Impl"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_1__3"
    // InternalKExpressions.g:4679:1: rule__InterfaceSignalDecl__Group_1__3 : rule__InterfaceSignalDecl__Group_1__3__Impl rule__InterfaceSignalDecl__Group_1__4 ;
    public final void rule__InterfaceSignalDecl__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4683:1: ( rule__InterfaceSignalDecl__Group_1__3__Impl rule__InterfaceSignalDecl__Group_1__4 )
            // InternalKExpressions.g:4684:2: rule__InterfaceSignalDecl__Group_1__3__Impl rule__InterfaceSignalDecl__Group_1__4
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__InterfaceSignalDecl__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceSignalDecl__Group_1__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_1__3"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_1__3__Impl"
    // InternalKExpressions.g:4691:1: rule__InterfaceSignalDecl__Group_1__3__Impl : ( ( rule__InterfaceSignalDecl__Group_1_3__0 )* ) ;
    public final void rule__InterfaceSignalDecl__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4695:1: ( ( ( rule__InterfaceSignalDecl__Group_1_3__0 )* ) )
            // InternalKExpressions.g:4696:1: ( ( rule__InterfaceSignalDecl__Group_1_3__0 )* )
            {
            // InternalKExpressions.g:4696:1: ( ( rule__InterfaceSignalDecl__Group_1_3__0 )* )
            // InternalKExpressions.g:4697:1: ( rule__InterfaceSignalDecl__Group_1_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getGroup_1_3()); 
            }
            // InternalKExpressions.g:4698:1: ( rule__InterfaceSignalDecl__Group_1_3__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==49) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalKExpressions.g:4698:2: rule__InterfaceSignalDecl__Group_1_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    rule__InterfaceSignalDecl__Group_1_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceSignalDeclAccess().getGroup_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_1__3__Impl"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_1__4"
    // InternalKExpressions.g:4708:1: rule__InterfaceSignalDecl__Group_1__4 : rule__InterfaceSignalDecl__Group_1__4__Impl ;
    public final void rule__InterfaceSignalDecl__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4712:1: ( rule__InterfaceSignalDecl__Group_1__4__Impl )
            // InternalKExpressions.g:4713:2: rule__InterfaceSignalDecl__Group_1__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceSignalDecl__Group_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_1__4"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_1__4__Impl"
    // InternalKExpressions.g:4719:1: rule__InterfaceSignalDecl__Group_1__4__Impl : ( ';' ) ;
    public final void rule__InterfaceSignalDecl__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4723:1: ( ( ';' ) )
            // InternalKExpressions.g:4724:1: ( ';' )
            {
            // InternalKExpressions.g:4724:1: ( ';' )
            // InternalKExpressions.g:4725:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSemicolonKeyword_1_4()); 
            }
            match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceSignalDeclAccess().getSemicolonKeyword_1_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_1__4__Impl"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_1_3__0"
    // InternalKExpressions.g:4748:1: rule__InterfaceSignalDecl__Group_1_3__0 : rule__InterfaceSignalDecl__Group_1_3__0__Impl rule__InterfaceSignalDecl__Group_1_3__1 ;
    public final void rule__InterfaceSignalDecl__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4752:1: ( rule__InterfaceSignalDecl__Group_1_3__0__Impl rule__InterfaceSignalDecl__Group_1_3__1 )
            // InternalKExpressions.g:4753:2: rule__InterfaceSignalDecl__Group_1_3__0__Impl rule__InterfaceSignalDecl__Group_1_3__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__InterfaceSignalDecl__Group_1_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceSignalDecl__Group_1_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_1_3__0"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_1_3__0__Impl"
    // InternalKExpressions.g:4760:1: rule__InterfaceSignalDecl__Group_1_3__0__Impl : ( ',' ) ;
    public final void rule__InterfaceSignalDecl__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4764:1: ( ( ',' ) )
            // InternalKExpressions.g:4765:1: ( ',' )
            {
            // InternalKExpressions.g:4765:1: ( ',' )
            // InternalKExpressions.g:4766:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getCommaKeyword_1_3_0()); 
            }
            match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceSignalDeclAccess().getCommaKeyword_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_1_3__0__Impl"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_1_3__1"
    // InternalKExpressions.g:4779:1: rule__InterfaceSignalDecl__Group_1_3__1 : rule__InterfaceSignalDecl__Group_1_3__1__Impl ;
    public final void rule__InterfaceSignalDecl__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4783:1: ( rule__InterfaceSignalDecl__Group_1_3__1__Impl )
            // InternalKExpressions.g:4784:2: rule__InterfaceSignalDecl__Group_1_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceSignalDecl__Group_1_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_1_3__1"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_1_3__1__Impl"
    // InternalKExpressions.g:4790:1: rule__InterfaceSignalDecl__Group_1_3__1__Impl : ( ( rule__InterfaceSignalDecl__SignalsAssignment_1_3_1 ) ) ;
    public final void rule__InterfaceSignalDecl__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4794:1: ( ( ( rule__InterfaceSignalDecl__SignalsAssignment_1_3_1 ) ) )
            // InternalKExpressions.g:4795:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_1_3_1 ) )
            {
            // InternalKExpressions.g:4795:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_1_3_1 ) )
            // InternalKExpressions.g:4796:1: ( rule__InterfaceSignalDecl__SignalsAssignment_1_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSignalsAssignment_1_3_1()); 
            }
            // InternalKExpressions.g:4797:1: ( rule__InterfaceSignalDecl__SignalsAssignment_1_3_1 )
            // InternalKExpressions.g:4797:2: rule__InterfaceSignalDecl__SignalsAssignment_1_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceSignalDecl__SignalsAssignment_1_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceSignalDeclAccess().getSignalsAssignment_1_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_1_3__1__Impl"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_2__0"
    // InternalKExpressions.g:4811:1: rule__InterfaceSignalDecl__Group_2__0 : rule__InterfaceSignalDecl__Group_2__0__Impl rule__InterfaceSignalDecl__Group_2__1 ;
    public final void rule__InterfaceSignalDecl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4815:1: ( rule__InterfaceSignalDecl__Group_2__0__Impl rule__InterfaceSignalDecl__Group_2__1 )
            // InternalKExpressions.g:4816:2: rule__InterfaceSignalDecl__Group_2__0__Impl rule__InterfaceSignalDecl__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_30);
            rule__InterfaceSignalDecl__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceSignalDecl__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_2__0"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_2__0__Impl"
    // InternalKExpressions.g:4823:1: rule__InterfaceSignalDecl__Group_2__0__Impl : ( () ) ;
    public final void rule__InterfaceSignalDecl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4827:1: ( ( () ) )
            // InternalKExpressions.g:4828:1: ( () )
            {
            // InternalKExpressions.g:4828:1: ( () )
            // InternalKExpressions.g:4829:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getInputOutputAction_2_0()); 
            }
            // InternalKExpressions.g:4830:1: ()
            // InternalKExpressions.g:4832:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceSignalDeclAccess().getInputOutputAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_2__0__Impl"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_2__1"
    // InternalKExpressions.g:4842:1: rule__InterfaceSignalDecl__Group_2__1 : rule__InterfaceSignalDecl__Group_2__1__Impl rule__InterfaceSignalDecl__Group_2__2 ;
    public final void rule__InterfaceSignalDecl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4846:1: ( rule__InterfaceSignalDecl__Group_2__1__Impl rule__InterfaceSignalDecl__Group_2__2 )
            // InternalKExpressions.g:4847:2: rule__InterfaceSignalDecl__Group_2__1__Impl rule__InterfaceSignalDecl__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__InterfaceSignalDecl__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceSignalDecl__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_2__1"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_2__1__Impl"
    // InternalKExpressions.g:4854:1: rule__InterfaceSignalDecl__Group_2__1__Impl : ( 'inputoutput' ) ;
    public final void rule__InterfaceSignalDecl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4858:1: ( ( 'inputoutput' ) )
            // InternalKExpressions.g:4859:1: ( 'inputoutput' )
            {
            // InternalKExpressions.g:4859:1: ( 'inputoutput' )
            // InternalKExpressions.g:4860:1: 'inputoutput'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getInputoutputKeyword_2_1()); 
            }
            match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceSignalDeclAccess().getInputoutputKeyword_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_2__1__Impl"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_2__2"
    // InternalKExpressions.g:4873:1: rule__InterfaceSignalDecl__Group_2__2 : rule__InterfaceSignalDecl__Group_2__2__Impl rule__InterfaceSignalDecl__Group_2__3 ;
    public final void rule__InterfaceSignalDecl__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4877:1: ( rule__InterfaceSignalDecl__Group_2__2__Impl rule__InterfaceSignalDecl__Group_2__3 )
            // InternalKExpressions.g:4878:2: rule__InterfaceSignalDecl__Group_2__2__Impl rule__InterfaceSignalDecl__Group_2__3
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__InterfaceSignalDecl__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceSignalDecl__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_2__2"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_2__2__Impl"
    // InternalKExpressions.g:4885:1: rule__InterfaceSignalDecl__Group_2__2__Impl : ( ( rule__InterfaceSignalDecl__SignalsAssignment_2_2 ) ) ;
    public final void rule__InterfaceSignalDecl__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4889:1: ( ( ( rule__InterfaceSignalDecl__SignalsAssignment_2_2 ) ) )
            // InternalKExpressions.g:4890:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_2_2 ) )
            {
            // InternalKExpressions.g:4890:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_2_2 ) )
            // InternalKExpressions.g:4891:1: ( rule__InterfaceSignalDecl__SignalsAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSignalsAssignment_2_2()); 
            }
            // InternalKExpressions.g:4892:1: ( rule__InterfaceSignalDecl__SignalsAssignment_2_2 )
            // InternalKExpressions.g:4892:2: rule__InterfaceSignalDecl__SignalsAssignment_2_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceSignalDecl__SignalsAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceSignalDeclAccess().getSignalsAssignment_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_2__2__Impl"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_2__3"
    // InternalKExpressions.g:4902:1: rule__InterfaceSignalDecl__Group_2__3 : rule__InterfaceSignalDecl__Group_2__3__Impl rule__InterfaceSignalDecl__Group_2__4 ;
    public final void rule__InterfaceSignalDecl__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4906:1: ( rule__InterfaceSignalDecl__Group_2__3__Impl rule__InterfaceSignalDecl__Group_2__4 )
            // InternalKExpressions.g:4907:2: rule__InterfaceSignalDecl__Group_2__3__Impl rule__InterfaceSignalDecl__Group_2__4
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__InterfaceSignalDecl__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceSignalDecl__Group_2__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_2__3"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_2__3__Impl"
    // InternalKExpressions.g:4914:1: rule__InterfaceSignalDecl__Group_2__3__Impl : ( ( rule__InterfaceSignalDecl__Group_2_3__0 )* ) ;
    public final void rule__InterfaceSignalDecl__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4918:1: ( ( ( rule__InterfaceSignalDecl__Group_2_3__0 )* ) )
            // InternalKExpressions.g:4919:1: ( ( rule__InterfaceSignalDecl__Group_2_3__0 )* )
            {
            // InternalKExpressions.g:4919:1: ( ( rule__InterfaceSignalDecl__Group_2_3__0 )* )
            // InternalKExpressions.g:4920:1: ( rule__InterfaceSignalDecl__Group_2_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getGroup_2_3()); 
            }
            // InternalKExpressions.g:4921:1: ( rule__InterfaceSignalDecl__Group_2_3__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==49) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalKExpressions.g:4921:2: rule__InterfaceSignalDecl__Group_2_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    rule__InterfaceSignalDecl__Group_2_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceSignalDeclAccess().getGroup_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_2__3__Impl"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_2__4"
    // InternalKExpressions.g:4931:1: rule__InterfaceSignalDecl__Group_2__4 : rule__InterfaceSignalDecl__Group_2__4__Impl ;
    public final void rule__InterfaceSignalDecl__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4935:1: ( rule__InterfaceSignalDecl__Group_2__4__Impl )
            // InternalKExpressions.g:4936:2: rule__InterfaceSignalDecl__Group_2__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceSignalDecl__Group_2__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_2__4"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_2__4__Impl"
    // InternalKExpressions.g:4942:1: rule__InterfaceSignalDecl__Group_2__4__Impl : ( ';' ) ;
    public final void rule__InterfaceSignalDecl__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4946:1: ( ( ';' ) )
            // InternalKExpressions.g:4947:1: ( ';' )
            {
            // InternalKExpressions.g:4947:1: ( ';' )
            // InternalKExpressions.g:4948:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSemicolonKeyword_2_4()); 
            }
            match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceSignalDeclAccess().getSemicolonKeyword_2_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_2__4__Impl"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_2_3__0"
    // InternalKExpressions.g:4971:1: rule__InterfaceSignalDecl__Group_2_3__0 : rule__InterfaceSignalDecl__Group_2_3__0__Impl rule__InterfaceSignalDecl__Group_2_3__1 ;
    public final void rule__InterfaceSignalDecl__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4975:1: ( rule__InterfaceSignalDecl__Group_2_3__0__Impl rule__InterfaceSignalDecl__Group_2_3__1 )
            // InternalKExpressions.g:4976:2: rule__InterfaceSignalDecl__Group_2_3__0__Impl rule__InterfaceSignalDecl__Group_2_3__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__InterfaceSignalDecl__Group_2_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceSignalDecl__Group_2_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_2_3__0"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_2_3__0__Impl"
    // InternalKExpressions.g:4983:1: rule__InterfaceSignalDecl__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__InterfaceSignalDecl__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4987:1: ( ( ',' ) )
            // InternalKExpressions.g:4988:1: ( ',' )
            {
            // InternalKExpressions.g:4988:1: ( ',' )
            // InternalKExpressions.g:4989:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getCommaKeyword_2_3_0()); 
            }
            match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceSignalDeclAccess().getCommaKeyword_2_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_2_3__0__Impl"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_2_3__1"
    // InternalKExpressions.g:5002:1: rule__InterfaceSignalDecl__Group_2_3__1 : rule__InterfaceSignalDecl__Group_2_3__1__Impl ;
    public final void rule__InterfaceSignalDecl__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5006:1: ( rule__InterfaceSignalDecl__Group_2_3__1__Impl )
            // InternalKExpressions.g:5007:2: rule__InterfaceSignalDecl__Group_2_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceSignalDecl__Group_2_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_2_3__1"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_2_3__1__Impl"
    // InternalKExpressions.g:5013:1: rule__InterfaceSignalDecl__Group_2_3__1__Impl : ( ( rule__InterfaceSignalDecl__SignalsAssignment_2_3_1 ) ) ;
    public final void rule__InterfaceSignalDecl__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5017:1: ( ( ( rule__InterfaceSignalDecl__SignalsAssignment_2_3_1 ) ) )
            // InternalKExpressions.g:5018:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_2_3_1 ) )
            {
            // InternalKExpressions.g:5018:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_2_3_1 ) )
            // InternalKExpressions.g:5019:1: ( rule__InterfaceSignalDecl__SignalsAssignment_2_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSignalsAssignment_2_3_1()); 
            }
            // InternalKExpressions.g:5020:1: ( rule__InterfaceSignalDecl__SignalsAssignment_2_3_1 )
            // InternalKExpressions.g:5020:2: rule__InterfaceSignalDecl__SignalsAssignment_2_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceSignalDecl__SignalsAssignment_2_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceSignalDeclAccess().getSignalsAssignment_2_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_2_3__1__Impl"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_3__0"
    // InternalKExpressions.g:5034:1: rule__InterfaceSignalDecl__Group_3__0 : rule__InterfaceSignalDecl__Group_3__0__Impl rule__InterfaceSignalDecl__Group_3__1 ;
    public final void rule__InterfaceSignalDecl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5038:1: ( rule__InterfaceSignalDecl__Group_3__0__Impl rule__InterfaceSignalDecl__Group_3__1 )
            // InternalKExpressions.g:5039:2: rule__InterfaceSignalDecl__Group_3__0__Impl rule__InterfaceSignalDecl__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__InterfaceSignalDecl__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceSignalDecl__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_3__0"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_3__0__Impl"
    // InternalKExpressions.g:5046:1: rule__InterfaceSignalDecl__Group_3__0__Impl : ( () ) ;
    public final void rule__InterfaceSignalDecl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5050:1: ( ( () ) )
            // InternalKExpressions.g:5051:1: ( () )
            {
            // InternalKExpressions.g:5051:1: ( () )
            // InternalKExpressions.g:5052:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getReturnAction_3_0()); 
            }
            // InternalKExpressions.g:5053:1: ()
            // InternalKExpressions.g:5055:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceSignalDeclAccess().getReturnAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_3__0__Impl"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_3__1"
    // InternalKExpressions.g:5065:1: rule__InterfaceSignalDecl__Group_3__1 : rule__InterfaceSignalDecl__Group_3__1__Impl rule__InterfaceSignalDecl__Group_3__2 ;
    public final void rule__InterfaceSignalDecl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5069:1: ( rule__InterfaceSignalDecl__Group_3__1__Impl rule__InterfaceSignalDecl__Group_3__2 )
            // InternalKExpressions.g:5070:2: rule__InterfaceSignalDecl__Group_3__1__Impl rule__InterfaceSignalDecl__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__InterfaceSignalDecl__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceSignalDecl__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_3__1"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_3__1__Impl"
    // InternalKExpressions.g:5077:1: rule__InterfaceSignalDecl__Group_3__1__Impl : ( 'return' ) ;
    public final void rule__InterfaceSignalDecl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5081:1: ( ( 'return' ) )
            // InternalKExpressions.g:5082:1: ( 'return' )
            {
            // InternalKExpressions.g:5082:1: ( 'return' )
            // InternalKExpressions.g:5083:1: 'return'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getReturnKeyword_3_1()); 
            }
            match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceSignalDeclAccess().getReturnKeyword_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_3__1__Impl"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_3__2"
    // InternalKExpressions.g:5096:1: rule__InterfaceSignalDecl__Group_3__2 : rule__InterfaceSignalDecl__Group_3__2__Impl rule__InterfaceSignalDecl__Group_3__3 ;
    public final void rule__InterfaceSignalDecl__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5100:1: ( rule__InterfaceSignalDecl__Group_3__2__Impl rule__InterfaceSignalDecl__Group_3__3 )
            // InternalKExpressions.g:5101:2: rule__InterfaceSignalDecl__Group_3__2__Impl rule__InterfaceSignalDecl__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__InterfaceSignalDecl__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceSignalDecl__Group_3__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_3__2"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_3__2__Impl"
    // InternalKExpressions.g:5108:1: rule__InterfaceSignalDecl__Group_3__2__Impl : ( ( rule__InterfaceSignalDecl__SignalsAssignment_3_2 ) ) ;
    public final void rule__InterfaceSignalDecl__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5112:1: ( ( ( rule__InterfaceSignalDecl__SignalsAssignment_3_2 ) ) )
            // InternalKExpressions.g:5113:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_3_2 ) )
            {
            // InternalKExpressions.g:5113:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_3_2 ) )
            // InternalKExpressions.g:5114:1: ( rule__InterfaceSignalDecl__SignalsAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSignalsAssignment_3_2()); 
            }
            // InternalKExpressions.g:5115:1: ( rule__InterfaceSignalDecl__SignalsAssignment_3_2 )
            // InternalKExpressions.g:5115:2: rule__InterfaceSignalDecl__SignalsAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceSignalDecl__SignalsAssignment_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceSignalDeclAccess().getSignalsAssignment_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_3__2__Impl"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_3__3"
    // InternalKExpressions.g:5125:1: rule__InterfaceSignalDecl__Group_3__3 : rule__InterfaceSignalDecl__Group_3__3__Impl rule__InterfaceSignalDecl__Group_3__4 ;
    public final void rule__InterfaceSignalDecl__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5129:1: ( rule__InterfaceSignalDecl__Group_3__3__Impl rule__InterfaceSignalDecl__Group_3__4 )
            // InternalKExpressions.g:5130:2: rule__InterfaceSignalDecl__Group_3__3__Impl rule__InterfaceSignalDecl__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__InterfaceSignalDecl__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceSignalDecl__Group_3__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_3__3"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_3__3__Impl"
    // InternalKExpressions.g:5137:1: rule__InterfaceSignalDecl__Group_3__3__Impl : ( ( rule__InterfaceSignalDecl__Group_3_3__0 )* ) ;
    public final void rule__InterfaceSignalDecl__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5141:1: ( ( ( rule__InterfaceSignalDecl__Group_3_3__0 )* ) )
            // InternalKExpressions.g:5142:1: ( ( rule__InterfaceSignalDecl__Group_3_3__0 )* )
            {
            // InternalKExpressions.g:5142:1: ( ( rule__InterfaceSignalDecl__Group_3_3__0 )* )
            // InternalKExpressions.g:5143:1: ( rule__InterfaceSignalDecl__Group_3_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getGroup_3_3()); 
            }
            // InternalKExpressions.g:5144:1: ( rule__InterfaceSignalDecl__Group_3_3__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==49) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalKExpressions.g:5144:2: rule__InterfaceSignalDecl__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    rule__InterfaceSignalDecl__Group_3_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceSignalDeclAccess().getGroup_3_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_3__3__Impl"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_3__4"
    // InternalKExpressions.g:5154:1: rule__InterfaceSignalDecl__Group_3__4 : rule__InterfaceSignalDecl__Group_3__4__Impl ;
    public final void rule__InterfaceSignalDecl__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5158:1: ( rule__InterfaceSignalDecl__Group_3__4__Impl )
            // InternalKExpressions.g:5159:2: rule__InterfaceSignalDecl__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceSignalDecl__Group_3__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_3__4"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_3__4__Impl"
    // InternalKExpressions.g:5165:1: rule__InterfaceSignalDecl__Group_3__4__Impl : ( ';' ) ;
    public final void rule__InterfaceSignalDecl__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5169:1: ( ( ';' ) )
            // InternalKExpressions.g:5170:1: ( ';' )
            {
            // InternalKExpressions.g:5170:1: ( ';' )
            // InternalKExpressions.g:5171:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSemicolonKeyword_3_4()); 
            }
            match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceSignalDeclAccess().getSemicolonKeyword_3_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_3__4__Impl"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_3_3__0"
    // InternalKExpressions.g:5194:1: rule__InterfaceSignalDecl__Group_3_3__0 : rule__InterfaceSignalDecl__Group_3_3__0__Impl rule__InterfaceSignalDecl__Group_3_3__1 ;
    public final void rule__InterfaceSignalDecl__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5198:1: ( rule__InterfaceSignalDecl__Group_3_3__0__Impl rule__InterfaceSignalDecl__Group_3_3__1 )
            // InternalKExpressions.g:5199:2: rule__InterfaceSignalDecl__Group_3_3__0__Impl rule__InterfaceSignalDecl__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__InterfaceSignalDecl__Group_3_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceSignalDecl__Group_3_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_3_3__0"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_3_3__0__Impl"
    // InternalKExpressions.g:5206:1: rule__InterfaceSignalDecl__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__InterfaceSignalDecl__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5210:1: ( ( ',' ) )
            // InternalKExpressions.g:5211:1: ( ',' )
            {
            // InternalKExpressions.g:5211:1: ( ',' )
            // InternalKExpressions.g:5212:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getCommaKeyword_3_3_0()); 
            }
            match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceSignalDeclAccess().getCommaKeyword_3_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_3_3__0__Impl"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_3_3__1"
    // InternalKExpressions.g:5225:1: rule__InterfaceSignalDecl__Group_3_3__1 : rule__InterfaceSignalDecl__Group_3_3__1__Impl ;
    public final void rule__InterfaceSignalDecl__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5229:1: ( rule__InterfaceSignalDecl__Group_3_3__1__Impl )
            // InternalKExpressions.g:5230:2: rule__InterfaceSignalDecl__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceSignalDecl__Group_3_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_3_3__1"


    // $ANTLR start "rule__InterfaceSignalDecl__Group_3_3__1__Impl"
    // InternalKExpressions.g:5236:1: rule__InterfaceSignalDecl__Group_3_3__1__Impl : ( ( rule__InterfaceSignalDecl__SignalsAssignment_3_3_1 ) ) ;
    public final void rule__InterfaceSignalDecl__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5240:1: ( ( ( rule__InterfaceSignalDecl__SignalsAssignment_3_3_1 ) ) )
            // InternalKExpressions.g:5241:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_3_3_1 ) )
            {
            // InternalKExpressions.g:5241:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_3_3_1 ) )
            // InternalKExpressions.g:5242:1: ( rule__InterfaceSignalDecl__SignalsAssignment_3_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSignalsAssignment_3_3_1()); 
            }
            // InternalKExpressions.g:5243:1: ( rule__InterfaceSignalDecl__SignalsAssignment_3_3_1 )
            // InternalKExpressions.g:5243:2: rule__InterfaceSignalDecl__SignalsAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceSignalDecl__SignalsAssignment_3_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceSignalDeclAccess().getSignalsAssignment_3_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__Group_3_3__1__Impl"


    // $ANTLR start "rule__ChannelDescription__Group_0__0"
    // InternalKExpressions.g:5257:1: rule__ChannelDescription__Group_0__0 : rule__ChannelDescription__Group_0__0__Impl rule__ChannelDescription__Group_0__1 ;
    public final void rule__ChannelDescription__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5261:1: ( rule__ChannelDescription__Group_0__0__Impl rule__ChannelDescription__Group_0__1 )
            // InternalKExpressions.g:5262:2: rule__ChannelDescription__Group_0__0__Impl rule__ChannelDescription__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__ChannelDescription__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChannelDescription__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelDescription__Group_0__0"


    // $ANTLR start "rule__ChannelDescription__Group_0__0__Impl"
    // InternalKExpressions.g:5269:1: rule__ChannelDescription__Group_0__0__Impl : ( ':' ) ;
    public final void rule__ChannelDescription__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5273:1: ( ( ':' ) )
            // InternalKExpressions.g:5274:1: ( ':' )
            {
            // InternalKExpressions.g:5274:1: ( ':' )
            // InternalKExpressions.g:5275:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChannelDescriptionAccess().getColonKeyword_0_0()); 
            }
            match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChannelDescriptionAccess().getColonKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelDescription__Group_0__0__Impl"


    // $ANTLR start "rule__ChannelDescription__Group_0__1"
    // InternalKExpressions.g:5288:1: rule__ChannelDescription__Group_0__1 : rule__ChannelDescription__Group_0__1__Impl ;
    public final void rule__ChannelDescription__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5292:1: ( rule__ChannelDescription__Group_0__1__Impl )
            // InternalKExpressions.g:5293:2: rule__ChannelDescription__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChannelDescription__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelDescription__Group_0__1"


    // $ANTLR start "rule__ChannelDescription__Group_0__1__Impl"
    // InternalKExpressions.g:5299:1: rule__ChannelDescription__Group_0__1__Impl : ( ( rule__ChannelDescription__TypeAssignment_0_1 ) ) ;
    public final void rule__ChannelDescription__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5303:1: ( ( ( rule__ChannelDescription__TypeAssignment_0_1 ) ) )
            // InternalKExpressions.g:5304:1: ( ( rule__ChannelDescription__TypeAssignment_0_1 ) )
            {
            // InternalKExpressions.g:5304:1: ( ( rule__ChannelDescription__TypeAssignment_0_1 ) )
            // InternalKExpressions.g:5305:1: ( rule__ChannelDescription__TypeAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChannelDescriptionAccess().getTypeAssignment_0_1()); 
            }
            // InternalKExpressions.g:5306:1: ( rule__ChannelDescription__TypeAssignment_0_1 )
            // InternalKExpressions.g:5306:2: rule__ChannelDescription__TypeAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChannelDescription__TypeAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChannelDescriptionAccess().getTypeAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelDescription__Group_0__1__Impl"


    // $ANTLR start "rule__ChannelDescription__Group_1__0"
    // InternalKExpressions.g:5320:1: rule__ChannelDescription__Group_1__0 : rule__ChannelDescription__Group_1__0__Impl rule__ChannelDescription__Group_1__1 ;
    public final void rule__ChannelDescription__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5324:1: ( rule__ChannelDescription__Group_1__0__Impl rule__ChannelDescription__Group_1__1 )
            // InternalKExpressions.g:5325:2: rule__ChannelDescription__Group_1__0__Impl rule__ChannelDescription__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__ChannelDescription__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChannelDescription__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelDescription__Group_1__0"


    // $ANTLR start "rule__ChannelDescription__Group_1__0__Impl"
    // InternalKExpressions.g:5332:1: rule__ChannelDescription__Group_1__0__Impl : ( '(' ) ;
    public final void rule__ChannelDescription__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5336:1: ( ( '(' ) )
            // InternalKExpressions.g:5337:1: ( '(' )
            {
            // InternalKExpressions.g:5337:1: ( '(' )
            // InternalKExpressions.g:5338:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChannelDescriptionAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChannelDescriptionAccess().getLeftParenthesisKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelDescription__Group_1__0__Impl"


    // $ANTLR start "rule__ChannelDescription__Group_1__1"
    // InternalKExpressions.g:5351:1: rule__ChannelDescription__Group_1__1 : rule__ChannelDescription__Group_1__1__Impl rule__ChannelDescription__Group_1__2 ;
    public final void rule__ChannelDescription__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5355:1: ( rule__ChannelDescription__Group_1__1__Impl rule__ChannelDescription__Group_1__2 )
            // InternalKExpressions.g:5356:2: rule__ChannelDescription__Group_1__1__Impl rule__ChannelDescription__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__ChannelDescription__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChannelDescription__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelDescription__Group_1__1"


    // $ANTLR start "rule__ChannelDescription__Group_1__1__Impl"
    // InternalKExpressions.g:5363:1: rule__ChannelDescription__Group_1__1__Impl : ( ( rule__ChannelDescription__TypeAssignment_1_1 ) ) ;
    public final void rule__ChannelDescription__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5367:1: ( ( ( rule__ChannelDescription__TypeAssignment_1_1 ) ) )
            // InternalKExpressions.g:5368:1: ( ( rule__ChannelDescription__TypeAssignment_1_1 ) )
            {
            // InternalKExpressions.g:5368:1: ( ( rule__ChannelDescription__TypeAssignment_1_1 ) )
            // InternalKExpressions.g:5369:1: ( rule__ChannelDescription__TypeAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChannelDescriptionAccess().getTypeAssignment_1_1()); 
            }
            // InternalKExpressions.g:5370:1: ( rule__ChannelDescription__TypeAssignment_1_1 )
            // InternalKExpressions.g:5370:2: rule__ChannelDescription__TypeAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChannelDescription__TypeAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChannelDescriptionAccess().getTypeAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelDescription__Group_1__1__Impl"


    // $ANTLR start "rule__ChannelDescription__Group_1__2"
    // InternalKExpressions.g:5380:1: rule__ChannelDescription__Group_1__2 : rule__ChannelDescription__Group_1__2__Impl ;
    public final void rule__ChannelDescription__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5384:1: ( rule__ChannelDescription__Group_1__2__Impl )
            // InternalKExpressions.g:5385:2: rule__ChannelDescription__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChannelDescription__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelDescription__Group_1__2"


    // $ANTLR start "rule__ChannelDescription__Group_1__2__Impl"
    // InternalKExpressions.g:5391:1: rule__ChannelDescription__Group_1__2__Impl : ( ')' ) ;
    public final void rule__ChannelDescription__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5395:1: ( ( ')' ) )
            // InternalKExpressions.g:5396:1: ( ')' )
            {
            // InternalKExpressions.g:5396:1: ( ')' )
            // InternalKExpressions.g:5397:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChannelDescriptionAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChannelDescriptionAccess().getRightParenthesisKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelDescription__Group_1__2__Impl"


    // $ANTLR start "rule__ChannelDescription__Group_2__0"
    // InternalKExpressions.g:5416:1: rule__ChannelDescription__Group_2__0 : rule__ChannelDescription__Group_2__0__Impl rule__ChannelDescription__Group_2__1 ;
    public final void rule__ChannelDescription__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5420:1: ( rule__ChannelDescription__Group_2__0__Impl rule__ChannelDescription__Group_2__1 )
            // InternalKExpressions.g:5421:2: rule__ChannelDescription__Group_2__0__Impl rule__ChannelDescription__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__ChannelDescription__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChannelDescription__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelDescription__Group_2__0"


    // $ANTLR start "rule__ChannelDescription__Group_2__0__Impl"
    // InternalKExpressions.g:5428:1: rule__ChannelDescription__Group_2__0__Impl : ( ':=' ) ;
    public final void rule__ChannelDescription__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5432:1: ( ( ':=' ) )
            // InternalKExpressions.g:5433:1: ( ':=' )
            {
            // InternalKExpressions.g:5433:1: ( ':=' )
            // InternalKExpressions.g:5434:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChannelDescriptionAccess().getColonEqualsSignKeyword_2_0()); 
            }
            match(input,54,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChannelDescriptionAccess().getColonEqualsSignKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelDescription__Group_2__0__Impl"


    // $ANTLR start "rule__ChannelDescription__Group_2__1"
    // InternalKExpressions.g:5447:1: rule__ChannelDescription__Group_2__1 : rule__ChannelDescription__Group_2__1__Impl rule__ChannelDescription__Group_2__2 ;
    public final void rule__ChannelDescription__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5451:1: ( rule__ChannelDescription__Group_2__1__Impl rule__ChannelDescription__Group_2__2 )
            // InternalKExpressions.g:5452:2: rule__ChannelDescription__Group_2__1__Impl rule__ChannelDescription__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_33);
            rule__ChannelDescription__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChannelDescription__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelDescription__Group_2__1"


    // $ANTLR start "rule__ChannelDescription__Group_2__1__Impl"
    // InternalKExpressions.g:5459:1: rule__ChannelDescription__Group_2__1__Impl : ( ( rule__ChannelDescription__ExpressionAssignment_2_1 ) ) ;
    public final void rule__ChannelDescription__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5463:1: ( ( ( rule__ChannelDescription__ExpressionAssignment_2_1 ) ) )
            // InternalKExpressions.g:5464:1: ( ( rule__ChannelDescription__ExpressionAssignment_2_1 ) )
            {
            // InternalKExpressions.g:5464:1: ( ( rule__ChannelDescription__ExpressionAssignment_2_1 ) )
            // InternalKExpressions.g:5465:1: ( rule__ChannelDescription__ExpressionAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChannelDescriptionAccess().getExpressionAssignment_2_1()); 
            }
            // InternalKExpressions.g:5466:1: ( rule__ChannelDescription__ExpressionAssignment_2_1 )
            // InternalKExpressions.g:5466:2: rule__ChannelDescription__ExpressionAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChannelDescription__ExpressionAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChannelDescriptionAccess().getExpressionAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelDescription__Group_2__1__Impl"


    // $ANTLR start "rule__ChannelDescription__Group_2__2"
    // InternalKExpressions.g:5476:1: rule__ChannelDescription__Group_2__2 : rule__ChannelDescription__Group_2__2__Impl rule__ChannelDescription__Group_2__3 ;
    public final void rule__ChannelDescription__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5480:1: ( rule__ChannelDescription__Group_2__2__Impl rule__ChannelDescription__Group_2__3 )
            // InternalKExpressions.g:5481:2: rule__ChannelDescription__Group_2__2__Impl rule__ChannelDescription__Group_2__3
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__ChannelDescription__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChannelDescription__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelDescription__Group_2__2"


    // $ANTLR start "rule__ChannelDescription__Group_2__2__Impl"
    // InternalKExpressions.g:5488:1: rule__ChannelDescription__Group_2__2__Impl : ( ':' ) ;
    public final void rule__ChannelDescription__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5492:1: ( ( ':' ) )
            // InternalKExpressions.g:5493:1: ( ':' )
            {
            // InternalKExpressions.g:5493:1: ( ':' )
            // InternalKExpressions.g:5494:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChannelDescriptionAccess().getColonKeyword_2_2()); 
            }
            match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChannelDescriptionAccess().getColonKeyword_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelDescription__Group_2__2__Impl"


    // $ANTLR start "rule__ChannelDescription__Group_2__3"
    // InternalKExpressions.g:5507:1: rule__ChannelDescription__Group_2__3 : rule__ChannelDescription__Group_2__3__Impl ;
    public final void rule__ChannelDescription__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5511:1: ( rule__ChannelDescription__Group_2__3__Impl )
            // InternalKExpressions.g:5512:2: rule__ChannelDescription__Group_2__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChannelDescription__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelDescription__Group_2__3"


    // $ANTLR start "rule__ChannelDescription__Group_2__3__Impl"
    // InternalKExpressions.g:5518:1: rule__ChannelDescription__Group_2__3__Impl : ( ( rule__ChannelDescription__TypeAssignment_2_3 ) ) ;
    public final void rule__ChannelDescription__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5522:1: ( ( ( rule__ChannelDescription__TypeAssignment_2_3 ) ) )
            // InternalKExpressions.g:5523:1: ( ( rule__ChannelDescription__TypeAssignment_2_3 ) )
            {
            // InternalKExpressions.g:5523:1: ( ( rule__ChannelDescription__TypeAssignment_2_3 ) )
            // InternalKExpressions.g:5524:1: ( rule__ChannelDescription__TypeAssignment_2_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChannelDescriptionAccess().getTypeAssignment_2_3()); 
            }
            // InternalKExpressions.g:5525:1: ( rule__ChannelDescription__TypeAssignment_2_3 )
            // InternalKExpressions.g:5525:2: rule__ChannelDescription__TypeAssignment_2_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChannelDescription__TypeAssignment_2_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChannelDescriptionAccess().getTypeAssignment_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelDescription__Group_2__3__Impl"


    // $ANTLR start "rule__InterfaceVariableDecl__Group__0"
    // InternalKExpressions.g:5543:1: rule__InterfaceVariableDecl__Group__0 : rule__InterfaceVariableDecl__Group__0__Impl rule__InterfaceVariableDecl__Group__1 ;
    public final void rule__InterfaceVariableDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5547:1: ( rule__InterfaceVariableDecl__Group__0__Impl rule__InterfaceVariableDecl__Group__1 )
            // InternalKExpressions.g:5548:2: rule__InterfaceVariableDecl__Group__0__Impl rule__InterfaceVariableDecl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__InterfaceVariableDecl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceVariableDecl__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceVariableDecl__Group__0"


    // $ANTLR start "rule__InterfaceVariableDecl__Group__0__Impl"
    // InternalKExpressions.g:5555:1: rule__InterfaceVariableDecl__Group__0__Impl : ( 'var' ) ;
    public final void rule__InterfaceVariableDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5559:1: ( ( 'var' ) )
            // InternalKExpressions.g:5560:1: ( 'var' )
            {
            // InternalKExpressions.g:5560:1: ( 'var' )
            // InternalKExpressions.g:5561:1: 'var'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceVariableDeclAccess().getVarKeyword_0()); 
            }
            match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceVariableDeclAccess().getVarKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceVariableDecl__Group__0__Impl"


    // $ANTLR start "rule__InterfaceVariableDecl__Group__1"
    // InternalKExpressions.g:5574:1: rule__InterfaceVariableDecl__Group__1 : rule__InterfaceVariableDecl__Group__1__Impl rule__InterfaceVariableDecl__Group__2 ;
    public final void rule__InterfaceVariableDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5578:1: ( rule__InterfaceVariableDecl__Group__1__Impl rule__InterfaceVariableDecl__Group__2 )
            // InternalKExpressions.g:5579:2: rule__InterfaceVariableDecl__Group__1__Impl rule__InterfaceVariableDecl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_34);
            rule__InterfaceVariableDecl__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceVariableDecl__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceVariableDecl__Group__1"


    // $ANTLR start "rule__InterfaceVariableDecl__Group__1__Impl"
    // InternalKExpressions.g:5586:1: rule__InterfaceVariableDecl__Group__1__Impl : ( ( rule__InterfaceVariableDecl__VarDeclsAssignment_1 ) ) ;
    public final void rule__InterfaceVariableDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5590:1: ( ( ( rule__InterfaceVariableDecl__VarDeclsAssignment_1 ) ) )
            // InternalKExpressions.g:5591:1: ( ( rule__InterfaceVariableDecl__VarDeclsAssignment_1 ) )
            {
            // InternalKExpressions.g:5591:1: ( ( rule__InterfaceVariableDecl__VarDeclsAssignment_1 ) )
            // InternalKExpressions.g:5592:1: ( rule__InterfaceVariableDecl__VarDeclsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceVariableDeclAccess().getVarDeclsAssignment_1()); 
            }
            // InternalKExpressions.g:5593:1: ( rule__InterfaceVariableDecl__VarDeclsAssignment_1 )
            // InternalKExpressions.g:5593:2: rule__InterfaceVariableDecl__VarDeclsAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceVariableDecl__VarDeclsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceVariableDeclAccess().getVarDeclsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceVariableDecl__Group__1__Impl"


    // $ANTLR start "rule__InterfaceVariableDecl__Group__2"
    // InternalKExpressions.g:5603:1: rule__InterfaceVariableDecl__Group__2 : rule__InterfaceVariableDecl__Group__2__Impl ;
    public final void rule__InterfaceVariableDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5607:1: ( rule__InterfaceVariableDecl__Group__2__Impl )
            // InternalKExpressions.g:5608:2: rule__InterfaceVariableDecl__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceVariableDecl__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceVariableDecl__Group__2"


    // $ANTLR start "rule__InterfaceVariableDecl__Group__2__Impl"
    // InternalKExpressions.g:5614:1: rule__InterfaceVariableDecl__Group__2__Impl : ( ( rule__InterfaceVariableDecl__Group_2__0 )* ) ;
    public final void rule__InterfaceVariableDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5618:1: ( ( ( rule__InterfaceVariableDecl__Group_2__0 )* ) )
            // InternalKExpressions.g:5619:1: ( ( rule__InterfaceVariableDecl__Group_2__0 )* )
            {
            // InternalKExpressions.g:5619:1: ( ( rule__InterfaceVariableDecl__Group_2__0 )* )
            // InternalKExpressions.g:5620:1: ( rule__InterfaceVariableDecl__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceVariableDeclAccess().getGroup_2()); 
            }
            // InternalKExpressions.g:5621:1: ( rule__InterfaceVariableDecl__Group_2__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==49) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalKExpressions.g:5621:2: rule__InterfaceVariableDecl__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    rule__InterfaceVariableDecl__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceVariableDeclAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceVariableDecl__Group__2__Impl"


    // $ANTLR start "rule__InterfaceVariableDecl__Group_2__0"
    // InternalKExpressions.g:5637:1: rule__InterfaceVariableDecl__Group_2__0 : rule__InterfaceVariableDecl__Group_2__0__Impl rule__InterfaceVariableDecl__Group_2__1 ;
    public final void rule__InterfaceVariableDecl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5641:1: ( rule__InterfaceVariableDecl__Group_2__0__Impl rule__InterfaceVariableDecl__Group_2__1 )
            // InternalKExpressions.g:5642:2: rule__InterfaceVariableDecl__Group_2__0__Impl rule__InterfaceVariableDecl__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__InterfaceVariableDecl__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceVariableDecl__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceVariableDecl__Group_2__0"


    // $ANTLR start "rule__InterfaceVariableDecl__Group_2__0__Impl"
    // InternalKExpressions.g:5649:1: rule__InterfaceVariableDecl__Group_2__0__Impl : ( ',' ) ;
    public final void rule__InterfaceVariableDecl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5653:1: ( ( ',' ) )
            // InternalKExpressions.g:5654:1: ( ',' )
            {
            // InternalKExpressions.g:5654:1: ( ',' )
            // InternalKExpressions.g:5655:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceVariableDeclAccess().getCommaKeyword_2_0()); 
            }
            match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceVariableDeclAccess().getCommaKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceVariableDecl__Group_2__0__Impl"


    // $ANTLR start "rule__InterfaceVariableDecl__Group_2__1"
    // InternalKExpressions.g:5668:1: rule__InterfaceVariableDecl__Group_2__1 : rule__InterfaceVariableDecl__Group_2__1__Impl ;
    public final void rule__InterfaceVariableDecl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5672:1: ( rule__InterfaceVariableDecl__Group_2__1__Impl )
            // InternalKExpressions.g:5673:2: rule__InterfaceVariableDecl__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceVariableDecl__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceVariableDecl__Group_2__1"


    // $ANTLR start "rule__InterfaceVariableDecl__Group_2__1__Impl"
    // InternalKExpressions.g:5679:1: rule__InterfaceVariableDecl__Group_2__1__Impl : ( ( rule__InterfaceVariableDecl__VarDeclsAssignment_2_1 ) ) ;
    public final void rule__InterfaceVariableDecl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5683:1: ( ( ( rule__InterfaceVariableDecl__VarDeclsAssignment_2_1 ) ) )
            // InternalKExpressions.g:5684:1: ( ( rule__InterfaceVariableDecl__VarDeclsAssignment_2_1 ) )
            {
            // InternalKExpressions.g:5684:1: ( ( rule__InterfaceVariableDecl__VarDeclsAssignment_2_1 ) )
            // InternalKExpressions.g:5685:1: ( rule__InterfaceVariableDecl__VarDeclsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceVariableDeclAccess().getVarDeclsAssignment_2_1()); 
            }
            // InternalKExpressions.g:5686:1: ( rule__InterfaceVariableDecl__VarDeclsAssignment_2_1 )
            // InternalKExpressions.g:5686:2: rule__InterfaceVariableDecl__VarDeclsAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InterfaceVariableDecl__VarDeclsAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceVariableDeclAccess().getVarDeclsAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceVariableDecl__Group_2__1__Impl"


    // $ANTLR start "rule__VariableDecl__Group__0"
    // InternalKExpressions.g:5700:1: rule__VariableDecl__Group__0 : rule__VariableDecl__Group__0__Impl rule__VariableDecl__Group__1 ;
    public final void rule__VariableDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5704:1: ( rule__VariableDecl__Group__0__Impl rule__VariableDecl__Group__1 )
            // InternalKExpressions.g:5705:2: rule__VariableDecl__Group__0__Impl rule__VariableDecl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_35);
            rule__VariableDecl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VariableDecl__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDecl__Group__0"


    // $ANTLR start "rule__VariableDecl__Group__0__Impl"
    // InternalKExpressions.g:5712:1: rule__VariableDecl__Group__0__Impl : ( ( rule__VariableDecl__VariablesAssignment_0 ) ) ;
    public final void rule__VariableDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5716:1: ( ( ( rule__VariableDecl__VariablesAssignment_0 ) ) )
            // InternalKExpressions.g:5717:1: ( ( rule__VariableDecl__VariablesAssignment_0 ) )
            {
            // InternalKExpressions.g:5717:1: ( ( rule__VariableDecl__VariablesAssignment_0 ) )
            // InternalKExpressions.g:5718:1: ( rule__VariableDecl__VariablesAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclAccess().getVariablesAssignment_0()); 
            }
            // InternalKExpressions.g:5719:1: ( rule__VariableDecl__VariablesAssignment_0 )
            // InternalKExpressions.g:5719:2: rule__VariableDecl__VariablesAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VariableDecl__VariablesAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclAccess().getVariablesAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDecl__Group__0__Impl"


    // $ANTLR start "rule__VariableDecl__Group__1"
    // InternalKExpressions.g:5729:1: rule__VariableDecl__Group__1 : rule__VariableDecl__Group__1__Impl rule__VariableDecl__Group__2 ;
    public final void rule__VariableDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5733:1: ( rule__VariableDecl__Group__1__Impl rule__VariableDecl__Group__2 )
            // InternalKExpressions.g:5734:2: rule__VariableDecl__Group__1__Impl rule__VariableDecl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_35);
            rule__VariableDecl__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VariableDecl__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDecl__Group__1"


    // $ANTLR start "rule__VariableDecl__Group__1__Impl"
    // InternalKExpressions.g:5741:1: rule__VariableDecl__Group__1__Impl : ( ( rule__VariableDecl__Group_1__0 )* ) ;
    public final void rule__VariableDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5745:1: ( ( ( rule__VariableDecl__Group_1__0 )* ) )
            // InternalKExpressions.g:5746:1: ( ( rule__VariableDecl__Group_1__0 )* )
            {
            // InternalKExpressions.g:5746:1: ( ( rule__VariableDecl__Group_1__0 )* )
            // InternalKExpressions.g:5747:1: ( rule__VariableDecl__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:5748:1: ( rule__VariableDecl__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==49) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalKExpressions.g:5748:2: rule__VariableDecl__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    rule__VariableDecl__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDecl__Group__1__Impl"


    // $ANTLR start "rule__VariableDecl__Group__2"
    // InternalKExpressions.g:5758:1: rule__VariableDecl__Group__2 : rule__VariableDecl__Group__2__Impl rule__VariableDecl__Group__3 ;
    public final void rule__VariableDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5762:1: ( rule__VariableDecl__Group__2__Impl rule__VariableDecl__Group__3 )
            // InternalKExpressions.g:5763:2: rule__VariableDecl__Group__2__Impl rule__VariableDecl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__VariableDecl__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VariableDecl__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDecl__Group__2"


    // $ANTLR start "rule__VariableDecl__Group__2__Impl"
    // InternalKExpressions.g:5770:1: rule__VariableDecl__Group__2__Impl : ( ':' ) ;
    public final void rule__VariableDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5774:1: ( ( ':' ) )
            // InternalKExpressions.g:5775:1: ( ':' )
            {
            // InternalKExpressions.g:5775:1: ( ':' )
            // InternalKExpressions.g:5776:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclAccess().getColonKeyword_2()); 
            }
            match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclAccess().getColonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDecl__Group__2__Impl"


    // $ANTLR start "rule__VariableDecl__Group__3"
    // InternalKExpressions.g:5789:1: rule__VariableDecl__Group__3 : rule__VariableDecl__Group__3__Impl ;
    public final void rule__VariableDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5793:1: ( rule__VariableDecl__Group__3__Impl )
            // InternalKExpressions.g:5794:2: rule__VariableDecl__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VariableDecl__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDecl__Group__3"


    // $ANTLR start "rule__VariableDecl__Group__3__Impl"
    // InternalKExpressions.g:5800:1: rule__VariableDecl__Group__3__Impl : ( ( rule__VariableDecl__TypeAssignment_3 ) ) ;
    public final void rule__VariableDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5804:1: ( ( ( rule__VariableDecl__TypeAssignment_3 ) ) )
            // InternalKExpressions.g:5805:1: ( ( rule__VariableDecl__TypeAssignment_3 ) )
            {
            // InternalKExpressions.g:5805:1: ( ( rule__VariableDecl__TypeAssignment_3 ) )
            // InternalKExpressions.g:5806:1: ( rule__VariableDecl__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclAccess().getTypeAssignment_3()); 
            }
            // InternalKExpressions.g:5807:1: ( rule__VariableDecl__TypeAssignment_3 )
            // InternalKExpressions.g:5807:2: rule__VariableDecl__TypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VariableDecl__TypeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclAccess().getTypeAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDecl__Group__3__Impl"


    // $ANTLR start "rule__VariableDecl__Group_1__0"
    // InternalKExpressions.g:5825:1: rule__VariableDecl__Group_1__0 : rule__VariableDecl__Group_1__0__Impl rule__VariableDecl__Group_1__1 ;
    public final void rule__VariableDecl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5829:1: ( rule__VariableDecl__Group_1__0__Impl rule__VariableDecl__Group_1__1 )
            // InternalKExpressions.g:5830:2: rule__VariableDecl__Group_1__0__Impl rule__VariableDecl__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__VariableDecl__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VariableDecl__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDecl__Group_1__0"


    // $ANTLR start "rule__VariableDecl__Group_1__0__Impl"
    // InternalKExpressions.g:5837:1: rule__VariableDecl__Group_1__0__Impl : ( ',' ) ;
    public final void rule__VariableDecl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5841:1: ( ( ',' ) )
            // InternalKExpressions.g:5842:1: ( ',' )
            {
            // InternalKExpressions.g:5842:1: ( ',' )
            // InternalKExpressions.g:5843:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclAccess().getCommaKeyword_1_0()); 
            }
            match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclAccess().getCommaKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDecl__Group_1__0__Impl"


    // $ANTLR start "rule__VariableDecl__Group_1__1"
    // InternalKExpressions.g:5856:1: rule__VariableDecl__Group_1__1 : rule__VariableDecl__Group_1__1__Impl ;
    public final void rule__VariableDecl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5860:1: ( rule__VariableDecl__Group_1__1__Impl )
            // InternalKExpressions.g:5861:2: rule__VariableDecl__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VariableDecl__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDecl__Group_1__1"


    // $ANTLR start "rule__VariableDecl__Group_1__1__Impl"
    // InternalKExpressions.g:5867:1: rule__VariableDecl__Group_1__1__Impl : ( ( rule__VariableDecl__VariablesAssignment_1_1 ) ) ;
    public final void rule__VariableDecl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5871:1: ( ( ( rule__VariableDecl__VariablesAssignment_1_1 ) ) )
            // InternalKExpressions.g:5872:1: ( ( rule__VariableDecl__VariablesAssignment_1_1 ) )
            {
            // InternalKExpressions.g:5872:1: ( ( rule__VariableDecl__VariablesAssignment_1_1 ) )
            // InternalKExpressions.g:5873:1: ( rule__VariableDecl__VariablesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclAccess().getVariablesAssignment_1_1()); 
            }
            // InternalKExpressions.g:5874:1: ( rule__VariableDecl__VariablesAssignment_1_1 )
            // InternalKExpressions.g:5874:2: rule__VariableDecl__VariablesAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VariableDecl__VariablesAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclAccess().getVariablesAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDecl__Group_1__1__Impl"


    // $ANTLR start "rule__IVariable__Group__0"
    // InternalKExpressions.g:5888:1: rule__IVariable__Group__0 : rule__IVariable__Group__0__Impl rule__IVariable__Group__1 ;
    public final void rule__IVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5892:1: ( rule__IVariable__Group__0__Impl rule__IVariable__Group__1 )
            // InternalKExpressions.g:5893:2: rule__IVariable__Group__0__Impl rule__IVariable__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_36);
            rule__IVariable__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IVariable__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IVariable__Group__0"


    // $ANTLR start "rule__IVariable__Group__0__Impl"
    // InternalKExpressions.g:5900:1: rule__IVariable__Group__0__Impl : ( ( rule__IVariable__NameAssignment_0 ) ) ;
    public final void rule__IVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5904:1: ( ( ( rule__IVariable__NameAssignment_0 ) ) )
            // InternalKExpressions.g:5905:1: ( ( rule__IVariable__NameAssignment_0 ) )
            {
            // InternalKExpressions.g:5905:1: ( ( rule__IVariable__NameAssignment_0 ) )
            // InternalKExpressions.g:5906:1: ( rule__IVariable__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIVariableAccess().getNameAssignment_0()); 
            }
            // InternalKExpressions.g:5907:1: ( rule__IVariable__NameAssignment_0 )
            // InternalKExpressions.g:5907:2: rule__IVariable__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IVariable__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIVariableAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IVariable__Group__0__Impl"


    // $ANTLR start "rule__IVariable__Group__1"
    // InternalKExpressions.g:5917:1: rule__IVariable__Group__1 : rule__IVariable__Group__1__Impl ;
    public final void rule__IVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5921:1: ( rule__IVariable__Group__1__Impl )
            // InternalKExpressions.g:5922:2: rule__IVariable__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IVariable__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IVariable__Group__1"


    // $ANTLR start "rule__IVariable__Group__1__Impl"
    // InternalKExpressions.g:5928:1: rule__IVariable__Group__1__Impl : ( ( rule__IVariable__Group_1__0 )? ) ;
    public final void rule__IVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5932:1: ( ( ( rule__IVariable__Group_1__0 )? ) )
            // InternalKExpressions.g:5933:1: ( ( rule__IVariable__Group_1__0 )? )
            {
            // InternalKExpressions.g:5933:1: ( ( rule__IVariable__Group_1__0 )? )
            // InternalKExpressions.g:5934:1: ( rule__IVariable__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIVariableAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:5935:1: ( rule__IVariable__Group_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==54) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalKExpressions.g:5935:2: rule__IVariable__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__IVariable__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIVariableAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IVariable__Group__1__Impl"


    // $ANTLR start "rule__IVariable__Group_1__0"
    // InternalKExpressions.g:5949:1: rule__IVariable__Group_1__0 : rule__IVariable__Group_1__0__Impl rule__IVariable__Group_1__1 ;
    public final void rule__IVariable__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5953:1: ( rule__IVariable__Group_1__0__Impl rule__IVariable__Group_1__1 )
            // InternalKExpressions.g:5954:2: rule__IVariable__Group_1__0__Impl rule__IVariable__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__IVariable__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IVariable__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IVariable__Group_1__0"


    // $ANTLR start "rule__IVariable__Group_1__0__Impl"
    // InternalKExpressions.g:5961:1: rule__IVariable__Group_1__0__Impl : ( ':=' ) ;
    public final void rule__IVariable__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5965:1: ( ( ':=' ) )
            // InternalKExpressions.g:5966:1: ( ':=' )
            {
            // InternalKExpressions.g:5966:1: ( ':=' )
            // InternalKExpressions.g:5967:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIVariableAccess().getColonEqualsSignKeyword_1_0()); 
            }
            match(input,54,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIVariableAccess().getColonEqualsSignKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IVariable__Group_1__0__Impl"


    // $ANTLR start "rule__IVariable__Group_1__1"
    // InternalKExpressions.g:5980:1: rule__IVariable__Group_1__1 : rule__IVariable__Group_1__1__Impl ;
    public final void rule__IVariable__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5984:1: ( rule__IVariable__Group_1__1__Impl )
            // InternalKExpressions.g:5985:2: rule__IVariable__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IVariable__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IVariable__Group_1__1"


    // $ANTLR start "rule__IVariable__Group_1__1__Impl"
    // InternalKExpressions.g:5991:1: rule__IVariable__Group_1__1__Impl : ( ( rule__IVariable__ExpressionAssignment_1_1 ) ) ;
    public final void rule__IVariable__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5995:1: ( ( ( rule__IVariable__ExpressionAssignment_1_1 ) ) )
            // InternalKExpressions.g:5996:1: ( ( rule__IVariable__ExpressionAssignment_1_1 ) )
            {
            // InternalKExpressions.g:5996:1: ( ( rule__IVariable__ExpressionAssignment_1_1 ) )
            // InternalKExpressions.g:5997:1: ( rule__IVariable__ExpressionAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIVariableAccess().getExpressionAssignment_1_1()); 
            }
            // InternalKExpressions.g:5998:1: ( rule__IVariable__ExpressionAssignment_1_1 )
            // InternalKExpressions.g:5998:2: rule__IVariable__ExpressionAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IVariable__ExpressionAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIVariableAccess().getExpressionAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IVariable__Group_1__1__Impl"


    // $ANTLR start "rule__TypeIdentifier__Group_2__0"
    // InternalKExpressions.g:6012:1: rule__TypeIdentifier__Group_2__0 : rule__TypeIdentifier__Group_2__0__Impl rule__TypeIdentifier__Group_2__1 ;
    public final void rule__TypeIdentifier__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6016:1: ( rule__TypeIdentifier__Group_2__0__Impl rule__TypeIdentifier__Group_2__1 )
            // InternalKExpressions.g:6017:2: rule__TypeIdentifier__Group_2__0__Impl rule__TypeIdentifier__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_37);
            rule__TypeIdentifier__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypeIdentifier__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeIdentifier__Group_2__0"


    // $ANTLR start "rule__TypeIdentifier__Group_2__0__Impl"
    // InternalKExpressions.g:6024:1: rule__TypeIdentifier__Group_2__0__Impl : ( 'combine' ) ;
    public final void rule__TypeIdentifier__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6028:1: ( ( 'combine' ) )
            // InternalKExpressions.g:6029:1: ( 'combine' )
            {
            // InternalKExpressions.g:6029:1: ( 'combine' )
            // InternalKExpressions.g:6030:1: 'combine'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeIdentifierAccess().getCombineKeyword_2_0()); 
            }
            match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeIdentifierAccess().getCombineKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeIdentifier__Group_2__0__Impl"


    // $ANTLR start "rule__TypeIdentifier__Group_2__1"
    // InternalKExpressions.g:6043:1: rule__TypeIdentifier__Group_2__1 : rule__TypeIdentifier__Group_2__1__Impl rule__TypeIdentifier__Group_2__2 ;
    public final void rule__TypeIdentifier__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6047:1: ( rule__TypeIdentifier__Group_2__1__Impl rule__TypeIdentifier__Group_2__2 )
            // InternalKExpressions.g:6048:2: rule__TypeIdentifier__Group_2__1__Impl rule__TypeIdentifier__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_38);
            rule__TypeIdentifier__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypeIdentifier__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeIdentifier__Group_2__1"


    // $ANTLR start "rule__TypeIdentifier__Group_2__1__Impl"
    // InternalKExpressions.g:6055:1: rule__TypeIdentifier__Group_2__1__Impl : ( ( rule__TypeIdentifier__Alternatives_2_1 ) ) ;
    public final void rule__TypeIdentifier__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6059:1: ( ( ( rule__TypeIdentifier__Alternatives_2_1 ) ) )
            // InternalKExpressions.g:6060:1: ( ( rule__TypeIdentifier__Alternatives_2_1 ) )
            {
            // InternalKExpressions.g:6060:1: ( ( rule__TypeIdentifier__Alternatives_2_1 ) )
            // InternalKExpressions.g:6061:1: ( rule__TypeIdentifier__Alternatives_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeIdentifierAccess().getAlternatives_2_1()); 
            }
            // InternalKExpressions.g:6062:1: ( rule__TypeIdentifier__Alternatives_2_1 )
            // InternalKExpressions.g:6062:2: rule__TypeIdentifier__Alternatives_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypeIdentifier__Alternatives_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeIdentifierAccess().getAlternatives_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeIdentifier__Group_2__1__Impl"


    // $ANTLR start "rule__TypeIdentifier__Group_2__2"
    // InternalKExpressions.g:6072:1: rule__TypeIdentifier__Group_2__2 : rule__TypeIdentifier__Group_2__2__Impl rule__TypeIdentifier__Group_2__3 ;
    public final void rule__TypeIdentifier__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6076:1: ( rule__TypeIdentifier__Group_2__2__Impl rule__TypeIdentifier__Group_2__3 )
            // InternalKExpressions.g:6077:2: rule__TypeIdentifier__Group_2__2__Impl rule__TypeIdentifier__Group_2__3
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__TypeIdentifier__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypeIdentifier__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeIdentifier__Group_2__2"


    // $ANTLR start "rule__TypeIdentifier__Group_2__2__Impl"
    // InternalKExpressions.g:6084:1: rule__TypeIdentifier__Group_2__2__Impl : ( 'with' ) ;
    public final void rule__TypeIdentifier__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6088:1: ( ( 'with' ) )
            // InternalKExpressions.g:6089:1: ( 'with' )
            {
            // InternalKExpressions.g:6089:1: ( 'with' )
            // InternalKExpressions.g:6090:1: 'with'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeIdentifierAccess().getWithKeyword_2_2()); 
            }
            match(input,57,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeIdentifierAccess().getWithKeyword_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeIdentifier__Group_2__2__Impl"


    // $ANTLR start "rule__TypeIdentifier__Group_2__3"
    // InternalKExpressions.g:6103:1: rule__TypeIdentifier__Group_2__3 : rule__TypeIdentifier__Group_2__3__Impl ;
    public final void rule__TypeIdentifier__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6107:1: ( rule__TypeIdentifier__Group_2__3__Impl )
            // InternalKExpressions.g:6108:2: rule__TypeIdentifier__Group_2__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypeIdentifier__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeIdentifier__Group_2__3"


    // $ANTLR start "rule__TypeIdentifier__Group_2__3__Impl"
    // InternalKExpressions.g:6114:1: rule__TypeIdentifier__Group_2__3__Impl : ( ( rule__TypeIdentifier__OperatorAssignment_2_3 ) ) ;
    public final void rule__TypeIdentifier__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6118:1: ( ( ( rule__TypeIdentifier__OperatorAssignment_2_3 ) ) )
            // InternalKExpressions.g:6119:1: ( ( rule__TypeIdentifier__OperatorAssignment_2_3 ) )
            {
            // InternalKExpressions.g:6119:1: ( ( rule__TypeIdentifier__OperatorAssignment_2_3 ) )
            // InternalKExpressions.g:6120:1: ( rule__TypeIdentifier__OperatorAssignment_2_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeIdentifierAccess().getOperatorAssignment_2_3()); 
            }
            // InternalKExpressions.g:6121:1: ( rule__TypeIdentifier__OperatorAssignment_2_3 )
            // InternalKExpressions.g:6121:2: rule__TypeIdentifier__OperatorAssignment_2_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypeIdentifier__OperatorAssignment_2_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeIdentifierAccess().getOperatorAssignment_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeIdentifier__Group_2__3__Impl"


    // $ANTLR start "rule__TagAnnotation__Group__0"
    // InternalKExpressions.g:6139:1: rule__TagAnnotation__Group__0 : rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 ;
    public final void rule__TagAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6143:1: ( rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 )
            // InternalKExpressions.g:6144:2: rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalKExpressions.g:6151:1: rule__TagAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TagAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6155:1: ( ( '@' ) )
            // InternalKExpressions.g:6156:1: ( '@' )
            {
            // InternalKExpressions.g:6156:1: ( '@' )
            // InternalKExpressions.g:6157:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:6170:1: rule__TagAnnotation__Group__1 : rule__TagAnnotation__Group__1__Impl ;
    public final void rule__TagAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6174:1: ( rule__TagAnnotation__Group__1__Impl )
            // InternalKExpressions.g:6175:2: rule__TagAnnotation__Group__1__Impl
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
    // InternalKExpressions.g:6181:1: rule__TagAnnotation__Group__1__Impl : ( ( rule__TagAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TagAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6185:1: ( ( ( rule__TagAnnotation__NameAssignment_1 ) ) )
            // InternalKExpressions.g:6186:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:6186:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            // InternalKExpressions.g:6187:1: ( rule__TagAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:6188:1: ( rule__TagAnnotation__NameAssignment_1 )
            // InternalKExpressions.g:6188:2: rule__TagAnnotation__NameAssignment_1
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
    // InternalKExpressions.g:6202:1: rule__PragmaTag__Group__0 : rule__PragmaTag__Group__0__Impl rule__PragmaTag__Group__1 ;
    public final void rule__PragmaTag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6206:1: ( rule__PragmaTag__Group__0__Impl rule__PragmaTag__Group__1 )
            // InternalKExpressions.g:6207:2: rule__PragmaTag__Group__0__Impl rule__PragmaTag__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalKExpressions.g:6214:1: rule__PragmaTag__Group__0__Impl : ( '#' ) ;
    public final void rule__PragmaTag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6218:1: ( ( '#' ) )
            // InternalKExpressions.g:6219:1: ( '#' )
            {
            // InternalKExpressions.g:6219:1: ( '#' )
            // InternalKExpressions.g:6220:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPragmaTagAccess().getNumberSignKeyword_0()); 
            }
            match(input,59,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:6233:1: rule__PragmaTag__Group__1 : rule__PragmaTag__Group__1__Impl ;
    public final void rule__PragmaTag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6237:1: ( rule__PragmaTag__Group__1__Impl )
            // InternalKExpressions.g:6238:2: rule__PragmaTag__Group__1__Impl
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
    // InternalKExpressions.g:6244:1: rule__PragmaTag__Group__1__Impl : ( ( rule__PragmaTag__NameAssignment_1 ) ) ;
    public final void rule__PragmaTag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6248:1: ( ( ( rule__PragmaTag__NameAssignment_1 ) ) )
            // InternalKExpressions.g:6249:1: ( ( rule__PragmaTag__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:6249:1: ( ( rule__PragmaTag__NameAssignment_1 ) )
            // InternalKExpressions.g:6250:1: ( rule__PragmaTag__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPragmaTagAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:6251:1: ( rule__PragmaTag__NameAssignment_1 )
            // InternalKExpressions.g:6251:2: rule__PragmaTag__NameAssignment_1
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
    // InternalKExpressions.g:6265:1: rule__KeyStringValueAnnotation__Group__0 : rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 ;
    public final void rule__KeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6269:1: ( rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 )
            // InternalKExpressions.g:6270:2: rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalKExpressions.g:6277:1: rule__KeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6281:1: ( ( '@' ) )
            // InternalKExpressions.g:6282:1: ( '@' )
            {
            // InternalKExpressions.g:6282:1: ( '@' )
            // InternalKExpressions.g:6283:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:6296:1: rule__KeyStringValueAnnotation__Group__1 : rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 ;
    public final void rule__KeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6300:1: ( rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 )
            // InternalKExpressions.g:6301:2: rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_40);
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
    // InternalKExpressions.g:6308:1: rule__KeyStringValueAnnotation__Group__1__Impl : ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6312:1: ( ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKExpressions.g:6313:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:6313:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKExpressions.g:6314:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:6315:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            // InternalKExpressions.g:6315:2: rule__KeyStringValueAnnotation__NameAssignment_1
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
    // InternalKExpressions.g:6325:1: rule__KeyStringValueAnnotation__Group__2 : rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 ;
    public final void rule__KeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6329:1: ( rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 )
            // InternalKExpressions.g:6330:2: rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_34);
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
    // InternalKExpressions.g:6337:1: rule__KeyStringValueAnnotation__Group__2__Impl : ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6341:1: ( ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalKExpressions.g:6342:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalKExpressions.g:6342:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalKExpressions.g:6343:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            }
            // InternalKExpressions.g:6344:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalKExpressions.g:6344:2: rule__KeyStringValueAnnotation__ValuesAssignment_2
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
    // InternalKExpressions.g:6354:1: rule__KeyStringValueAnnotation__Group__3 : rule__KeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__KeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6358:1: ( rule__KeyStringValueAnnotation__Group__3__Impl )
            // InternalKExpressions.g:6359:2: rule__KeyStringValueAnnotation__Group__3__Impl
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
    // InternalKExpressions.g:6365:1: rule__KeyStringValueAnnotation__Group__3__Impl : ( ( rule__KeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__KeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6369:1: ( ( ( rule__KeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalKExpressions.g:6370:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalKExpressions.g:6370:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )* )
            // InternalKExpressions.g:6371:1: ( rule__KeyStringValueAnnotation__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // InternalKExpressions.g:6372:1: ( rule__KeyStringValueAnnotation__Group_3__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==49) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalKExpressions.g:6372:2: rule__KeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
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
    // InternalKExpressions.g:6390:1: rule__KeyStringValueAnnotation__Group_3__0 : rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 ;
    public final void rule__KeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6394:1: ( rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 )
            // InternalKExpressions.g:6395:2: rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_40);
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
    // InternalKExpressions.g:6402:1: rule__KeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6406:1: ( ( ',' ) )
            // InternalKExpressions.g:6407:1: ( ',' )
            {
            // InternalKExpressions.g:6407:1: ( ',' )
            // InternalKExpressions.g:6408:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            }
            match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:6421:1: rule__KeyStringValueAnnotation__Group_3__1 : rule__KeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__KeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6425:1: ( rule__KeyStringValueAnnotation__Group_3__1__Impl )
            // InternalKExpressions.g:6426:2: rule__KeyStringValueAnnotation__Group_3__1__Impl
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
    // InternalKExpressions.g:6432:1: rule__KeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6436:1: ( ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalKExpressions.g:6437:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalKExpressions.g:6437:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalKExpressions.g:6438:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            }
            // InternalKExpressions.g:6439:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalKExpressions.g:6439:2: rule__KeyStringValueAnnotation__ValuesAssignment_3_1
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
    // InternalKExpressions.g:6453:1: rule__RestrictedKeyStringValueAnnotation__Group__0 : rule__RestrictedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedKeyStringValueAnnotation__Group__1 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6457:1: ( rule__RestrictedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedKeyStringValueAnnotation__Group__1 )
            // InternalKExpressions.g:6458:2: rule__RestrictedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalKExpressions.g:6465:1: rule__RestrictedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6469:1: ( ( '@' ) )
            // InternalKExpressions.g:6470:1: ( '@' )
            {
            // InternalKExpressions.g:6470:1: ( '@' )
            // InternalKExpressions.g:6471:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:6484:1: rule__RestrictedKeyStringValueAnnotation__Group__1 : rule__RestrictedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedKeyStringValueAnnotation__Group__2 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6488:1: ( rule__RestrictedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedKeyStringValueAnnotation__Group__2 )
            // InternalKExpressions.g:6489:2: rule__RestrictedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_41);
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
    // InternalKExpressions.g:6496:1: rule__RestrictedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6500:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKExpressions.g:6501:1: ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:6501:1: ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKExpressions.g:6502:1: ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:6503:1: ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKExpressions.g:6503:2: rule__RestrictedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKExpressions.g:6513:1: rule__RestrictedKeyStringValueAnnotation__Group__2 : rule__RestrictedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedKeyStringValueAnnotation__Group__3 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6517:1: ( rule__RestrictedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedKeyStringValueAnnotation__Group__3 )
            // InternalKExpressions.g:6518:2: rule__RestrictedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_34);
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
    // InternalKExpressions.g:6525:1: rule__RestrictedKeyStringValueAnnotation__Group__2__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6529:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalKExpressions.g:6530:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalKExpressions.g:6530:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalKExpressions.g:6531:1: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            }
            // InternalKExpressions.g:6532:1: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalKExpressions.g:6532:2: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2
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
    // InternalKExpressions.g:6542:1: rule__RestrictedKeyStringValueAnnotation__Group__3 : rule__RestrictedKeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6546:1: ( rule__RestrictedKeyStringValueAnnotation__Group__3__Impl )
            // InternalKExpressions.g:6547:2: rule__RestrictedKeyStringValueAnnotation__Group__3__Impl
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
    // InternalKExpressions.g:6553:1: rule__RestrictedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6557:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalKExpressions.g:6558:1: ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalKExpressions.g:6558:1: ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* )
            // InternalKExpressions.g:6559:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // InternalKExpressions.g:6560:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==49) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalKExpressions.g:6560:2: rule__RestrictedKeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    rule__RestrictedKeyStringValueAnnotation__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalKExpressions.g:6578:1: rule__RestrictedKeyStringValueAnnotation__Group_3__0 : rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl rule__RestrictedKeyStringValueAnnotation__Group_3__1 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6582:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl rule__RestrictedKeyStringValueAnnotation__Group_3__1 )
            // InternalKExpressions.g:6583:2: rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl rule__RestrictedKeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_41);
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
    // InternalKExpressions.g:6590:1: rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6594:1: ( ( ',' ) )
            // InternalKExpressions.g:6595:1: ( ',' )
            {
            // InternalKExpressions.g:6595:1: ( ',' )
            // InternalKExpressions.g:6596:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            }
            match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:6609:1: rule__RestrictedKeyStringValueAnnotation__Group_3__1 : rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6613:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl )
            // InternalKExpressions.g:6614:2: rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl
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
    // InternalKExpressions.g:6620:1: rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6624:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalKExpressions.g:6625:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalKExpressions.g:6625:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalKExpressions.g:6626:1: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            }
            // InternalKExpressions.g:6627:1: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalKExpressions.g:6627:2: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1
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
    // InternalKExpressions.g:6641:1: rule__StringPragma__Group__0 : rule__StringPragma__Group__0__Impl rule__StringPragma__Group__1 ;
    public final void rule__StringPragma__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6645:1: ( rule__StringPragma__Group__0__Impl rule__StringPragma__Group__1 )
            // InternalKExpressions.g:6646:2: rule__StringPragma__Group__0__Impl rule__StringPragma__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalKExpressions.g:6653:1: rule__StringPragma__Group__0__Impl : ( '#' ) ;
    public final void rule__StringPragma__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6657:1: ( ( '#' ) )
            // InternalKExpressions.g:6658:1: ( '#' )
            {
            // InternalKExpressions.g:6658:1: ( '#' )
            // InternalKExpressions.g:6659:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPragmaAccess().getNumberSignKeyword_0()); 
            }
            match(input,59,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:6672:1: rule__StringPragma__Group__1 : rule__StringPragma__Group__1__Impl rule__StringPragma__Group__2 ;
    public final void rule__StringPragma__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6676:1: ( rule__StringPragma__Group__1__Impl rule__StringPragma__Group__2 )
            // InternalKExpressions.g:6677:2: rule__StringPragma__Group__1__Impl rule__StringPragma__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_40);
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
    // InternalKExpressions.g:6684:1: rule__StringPragma__Group__1__Impl : ( ( rule__StringPragma__NameAssignment_1 ) ) ;
    public final void rule__StringPragma__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6688:1: ( ( ( rule__StringPragma__NameAssignment_1 ) ) )
            // InternalKExpressions.g:6689:1: ( ( rule__StringPragma__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:6689:1: ( ( rule__StringPragma__NameAssignment_1 ) )
            // InternalKExpressions.g:6690:1: ( rule__StringPragma__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPragmaAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:6691:1: ( rule__StringPragma__NameAssignment_1 )
            // InternalKExpressions.g:6691:2: rule__StringPragma__NameAssignment_1
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
    // InternalKExpressions.g:6701:1: rule__StringPragma__Group__2 : rule__StringPragma__Group__2__Impl rule__StringPragma__Group__3 ;
    public final void rule__StringPragma__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6705:1: ( rule__StringPragma__Group__2__Impl rule__StringPragma__Group__3 )
            // InternalKExpressions.g:6706:2: rule__StringPragma__Group__2__Impl rule__StringPragma__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_34);
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
    // InternalKExpressions.g:6713:1: rule__StringPragma__Group__2__Impl : ( ( rule__StringPragma__ValuesAssignment_2 ) ) ;
    public final void rule__StringPragma__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6717:1: ( ( ( rule__StringPragma__ValuesAssignment_2 ) ) )
            // InternalKExpressions.g:6718:1: ( ( rule__StringPragma__ValuesAssignment_2 ) )
            {
            // InternalKExpressions.g:6718:1: ( ( rule__StringPragma__ValuesAssignment_2 ) )
            // InternalKExpressions.g:6719:1: ( rule__StringPragma__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPragmaAccess().getValuesAssignment_2()); 
            }
            // InternalKExpressions.g:6720:1: ( rule__StringPragma__ValuesAssignment_2 )
            // InternalKExpressions.g:6720:2: rule__StringPragma__ValuesAssignment_2
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
    // InternalKExpressions.g:6730:1: rule__StringPragma__Group__3 : rule__StringPragma__Group__3__Impl ;
    public final void rule__StringPragma__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6734:1: ( rule__StringPragma__Group__3__Impl )
            // InternalKExpressions.g:6735:2: rule__StringPragma__Group__3__Impl
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
    // InternalKExpressions.g:6741:1: rule__StringPragma__Group__3__Impl : ( ( rule__StringPragma__Group_3__0 )* ) ;
    public final void rule__StringPragma__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6745:1: ( ( ( rule__StringPragma__Group_3__0 )* ) )
            // InternalKExpressions.g:6746:1: ( ( rule__StringPragma__Group_3__0 )* )
            {
            // InternalKExpressions.g:6746:1: ( ( rule__StringPragma__Group_3__0 )* )
            // InternalKExpressions.g:6747:1: ( rule__StringPragma__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPragmaAccess().getGroup_3()); 
            }
            // InternalKExpressions.g:6748:1: ( rule__StringPragma__Group_3__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==49) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalKExpressions.g:6748:2: rule__StringPragma__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    rule__StringPragma__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalKExpressions.g:6766:1: rule__StringPragma__Group_3__0 : rule__StringPragma__Group_3__0__Impl rule__StringPragma__Group_3__1 ;
    public final void rule__StringPragma__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6770:1: ( rule__StringPragma__Group_3__0__Impl rule__StringPragma__Group_3__1 )
            // InternalKExpressions.g:6771:2: rule__StringPragma__Group_3__0__Impl rule__StringPragma__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_40);
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
    // InternalKExpressions.g:6778:1: rule__StringPragma__Group_3__0__Impl : ( ',' ) ;
    public final void rule__StringPragma__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6782:1: ( ( ',' ) )
            // InternalKExpressions.g:6783:1: ( ',' )
            {
            // InternalKExpressions.g:6783:1: ( ',' )
            // InternalKExpressions.g:6784:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPragmaAccess().getCommaKeyword_3_0()); 
            }
            match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:6797:1: rule__StringPragma__Group_3__1 : rule__StringPragma__Group_3__1__Impl ;
    public final void rule__StringPragma__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6801:1: ( rule__StringPragma__Group_3__1__Impl )
            // InternalKExpressions.g:6802:2: rule__StringPragma__Group_3__1__Impl
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
    // InternalKExpressions.g:6808:1: rule__StringPragma__Group_3__1__Impl : ( ( rule__StringPragma__ValuesAssignment_3_1 ) ) ;
    public final void rule__StringPragma__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6812:1: ( ( ( rule__StringPragma__ValuesAssignment_3_1 ) ) )
            // InternalKExpressions.g:6813:1: ( ( rule__StringPragma__ValuesAssignment_3_1 ) )
            {
            // InternalKExpressions.g:6813:1: ( ( rule__StringPragma__ValuesAssignment_3_1 ) )
            // InternalKExpressions.g:6814:1: ( rule__StringPragma__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPragmaAccess().getValuesAssignment_3_1()); 
            }
            // InternalKExpressions.g:6815:1: ( rule__StringPragma__ValuesAssignment_3_1 )
            // InternalKExpressions.g:6815:2: rule__StringPragma__ValuesAssignment_3_1
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
    // InternalKExpressions.g:6829:1: rule__TypedKeyStringValueAnnotation__Group__0 : rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6833:1: ( rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 )
            // InternalKExpressions.g:6834:2: rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalKExpressions.g:6841:1: rule__TypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6845:1: ( ( '@' ) )
            // InternalKExpressions.g:6846:1: ( '@' )
            {
            // InternalKExpressions.g:6846:1: ( '@' )
            // InternalKExpressions.g:6847:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:6860:1: rule__TypedKeyStringValueAnnotation__Group__1 : rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6864:1: ( rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 )
            // InternalKExpressions.g:6865:2: rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_42);
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
    // InternalKExpressions.g:6872:1: rule__TypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6876:1: ( ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKExpressions.g:6877:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:6877:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKExpressions.g:6878:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:6879:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKExpressions.g:6879:2: rule__TypedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKExpressions.g:6889:1: rule__TypedKeyStringValueAnnotation__Group__2 : rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6893:1: ( rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 )
            // InternalKExpressions.g:6894:2: rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalKExpressions.g:6901:1: rule__TypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6905:1: ( ( '[' ) )
            // InternalKExpressions.g:6906:1: ( '[' )
            {
            // InternalKExpressions.g:6906:1: ( '[' )
            // InternalKExpressions.g:6907:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,60,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:6920:1: rule__TypedKeyStringValueAnnotation__Group__3 : rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6924:1: ( rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 )
            // InternalKExpressions.g:6925:2: rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_43);
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
    // InternalKExpressions.g:6932:1: rule__TypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6936:1: ( ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalKExpressions.g:6937:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalKExpressions.g:6937:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalKExpressions.g:6938:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // InternalKExpressions.g:6939:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalKExpressions.g:6939:2: rule__TypedKeyStringValueAnnotation__TypeAssignment_3
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
    // InternalKExpressions.g:6949:1: rule__TypedKeyStringValueAnnotation__Group__4 : rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6953:1: ( rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 )
            // InternalKExpressions.g:6954:2: rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5
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
    // InternalKExpressions.g:6961:1: rule__TypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6965:1: ( ( ']' ) )
            // InternalKExpressions.g:6966:1: ( ']' )
            {
            // InternalKExpressions.g:6966:1: ( ']' )
            // InternalKExpressions.g:6967:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,61,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:6980:1: rule__TypedKeyStringValueAnnotation__Group__5 : rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6984:1: ( rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 )
            // InternalKExpressions.g:6985:2: rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_34);
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
    // InternalKExpressions.g:6992:1: rule__TypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6996:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalKExpressions.g:6997:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalKExpressions.g:6997:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalKExpressions.g:6998:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            }
            // InternalKExpressions.g:6999:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalKExpressions.g:6999:2: rule__TypedKeyStringValueAnnotation__ValuesAssignment_5
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
    // InternalKExpressions.g:7009:1: rule__TypedKeyStringValueAnnotation__Group__6 : rule__TypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7013:1: ( rule__TypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalKExpressions.g:7014:2: rule__TypedKeyStringValueAnnotation__Group__6__Impl
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
    // InternalKExpressions.g:7020:1: rule__TypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7024:1: ( ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalKExpressions.g:7025:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalKExpressions.g:7025:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalKExpressions.g:7026:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // InternalKExpressions.g:7027:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==49) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalKExpressions.g:7027:2: rule__TypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    rule__TypedKeyStringValueAnnotation__Group_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalKExpressions.g:7051:1: rule__TypedKeyStringValueAnnotation__Group_6__0 : rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7055:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 )
            // InternalKExpressions.g:7056:2: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1
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
    // InternalKExpressions.g:7063:1: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7067:1: ( ( ',' ) )
            // InternalKExpressions.g:7068:1: ( ',' )
            {
            // InternalKExpressions.g:7068:1: ( ',' )
            // InternalKExpressions.g:7069:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            }
            match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:7082:1: rule__TypedKeyStringValueAnnotation__Group_6__1 : rule__TypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7086:1: ( rule__TypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalKExpressions.g:7087:2: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl
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
    // InternalKExpressions.g:7093:1: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7097:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalKExpressions.g:7098:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalKExpressions.g:7098:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalKExpressions.g:7099:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            }
            // InternalKExpressions.g:7100:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalKExpressions.g:7100:2: rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1
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
    // InternalKExpressions.g:7114:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__0 : rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7118:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__1 )
            // InternalKExpressions.g:7119:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalKExpressions.g:7126:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7130:1: ( ( '@' ) )
            // InternalKExpressions.g:7131:1: ( '@' )
            {
            // InternalKExpressions.g:7131:1: ( '@' )
            // InternalKExpressions.g:7132:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:7145:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__1 : rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7149:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__2 )
            // InternalKExpressions.g:7150:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_42);
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
    // InternalKExpressions.g:7157:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7161:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKExpressions.g:7162:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:7162:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKExpressions.g:7163:1: ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:7164:1: ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKExpressions.g:7164:2: rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKExpressions.g:7174:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__2 : rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7178:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__3 )
            // InternalKExpressions.g:7179:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalKExpressions.g:7186:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7190:1: ( ( '[' ) )
            // InternalKExpressions.g:7191:1: ( '[' )
            {
            // InternalKExpressions.g:7191:1: ( '[' )
            // InternalKExpressions.g:7192:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,60,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:7205:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__3 : rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7209:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__4 )
            // InternalKExpressions.g:7210:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_43);
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
    // InternalKExpressions.g:7217:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7221:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalKExpressions.g:7222:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalKExpressions.g:7222:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalKExpressions.g:7223:1: ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // InternalKExpressions.g:7224:1: ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalKExpressions.g:7224:2: rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3
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
    // InternalKExpressions.g:7234:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__4 : rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7238:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__5 )
            // InternalKExpressions.g:7239:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_41);
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
    // InternalKExpressions.g:7246:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7250:1: ( ( ']' ) )
            // InternalKExpressions.g:7251:1: ( ']' )
            {
            // InternalKExpressions.g:7251:1: ( ']' )
            // InternalKExpressions.g:7252:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,61,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:7265:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__5 : rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7269:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__6 )
            // InternalKExpressions.g:7270:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_34);
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
    // InternalKExpressions.g:7277:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7281:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalKExpressions.g:7282:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalKExpressions.g:7282:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalKExpressions.g:7283:1: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            }
            // InternalKExpressions.g:7284:1: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalKExpressions.g:7284:2: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5
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
    // InternalKExpressions.g:7294:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__6 : rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7298:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalKExpressions.g:7299:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl
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
    // InternalKExpressions.g:7305:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7309:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalKExpressions.g:7310:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalKExpressions.g:7310:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalKExpressions.g:7311:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // InternalKExpressions.g:7312:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==49) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalKExpressions.g:7312:2: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalKExpressions.g:7336:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 : rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7340:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1 )
            // InternalKExpressions.g:7341:2: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_41);
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
    // InternalKExpressions.g:7348:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7352:1: ( ( ',' ) )
            // InternalKExpressions.g:7353:1: ( ',' )
            {
            // InternalKExpressions.g:7353:1: ( ',' )
            // InternalKExpressions.g:7354:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            }
            match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:7367:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1 : rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7371:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalKExpressions.g:7372:2: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl
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
    // InternalKExpressions.g:7378:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7382:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalKExpressions.g:7383:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalKExpressions.g:7383:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalKExpressions.g:7384:1: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            }
            // InternalKExpressions.g:7385:1: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalKExpressions.g:7385:2: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1
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
    // InternalKExpressions.g:7399:1: rule__QuotedKeyStringValueAnnotation__Group__0 : rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7403:1: ( rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1 )
            // InternalKExpressions.g:7404:2: rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalKExpressions.g:7411:1: rule__QuotedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7415:1: ( ( '@' ) )
            // InternalKExpressions.g:7416:1: ( '@' )
            {
            // InternalKExpressions.g:7416:1: ( '@' )
            // InternalKExpressions.g:7417:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:7430:1: rule__QuotedKeyStringValueAnnotation__Group__1 : rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7434:1: ( rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2 )
            // InternalKExpressions.g:7435:2: rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_44);
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
    // InternalKExpressions.g:7442:1: rule__QuotedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7446:1: ( ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKExpressions.g:7447:1: ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:7447:1: ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKExpressions.g:7448:1: ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:7449:1: ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKExpressions.g:7449:2: rule__QuotedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKExpressions.g:7459:1: rule__QuotedKeyStringValueAnnotation__Group__2 : rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7463:1: ( rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3 )
            // InternalKExpressions.g:7464:2: rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_34);
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
    // InternalKExpressions.g:7471:1: rule__QuotedKeyStringValueAnnotation__Group__2__Impl : ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7475:1: ( ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalKExpressions.g:7476:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalKExpressions.g:7476:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalKExpressions.g:7477:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            }
            // InternalKExpressions.g:7478:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalKExpressions.g:7478:2: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2
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
    // InternalKExpressions.g:7488:1: rule__QuotedKeyStringValueAnnotation__Group__3 : rule__QuotedKeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7492:1: ( rule__QuotedKeyStringValueAnnotation__Group__3__Impl )
            // InternalKExpressions.g:7493:2: rule__QuotedKeyStringValueAnnotation__Group__3__Impl
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
    // InternalKExpressions.g:7499:1: rule__QuotedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7503:1: ( ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalKExpressions.g:7504:1: ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalKExpressions.g:7504:1: ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* )
            // InternalKExpressions.g:7505:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // InternalKExpressions.g:7506:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==49) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalKExpressions.g:7506:2: rule__QuotedKeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    rule__QuotedKeyStringValueAnnotation__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalKExpressions.g:7524:1: rule__QuotedKeyStringValueAnnotation__Group_3__0 : rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7528:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1 )
            // InternalKExpressions.g:7529:2: rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_44);
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
    // InternalKExpressions.g:7536:1: rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7540:1: ( ( ',' ) )
            // InternalKExpressions.g:7541:1: ( ',' )
            {
            // InternalKExpressions.g:7541:1: ( ',' )
            // InternalKExpressions.g:7542:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            }
            match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:7555:1: rule__QuotedKeyStringValueAnnotation__Group_3__1 : rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7559:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl )
            // InternalKExpressions.g:7560:2: rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl
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
    // InternalKExpressions.g:7566:1: rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7570:1: ( ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalKExpressions.g:7571:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalKExpressions.g:7571:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalKExpressions.g:7572:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            }
            // InternalKExpressions.g:7573:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalKExpressions.g:7573:2: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1
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
    // InternalKExpressions.g:7587:1: rule__QuotedTypedKeyStringValueAnnotation__Group__0 : rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7591:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1 )
            // InternalKExpressions.g:7592:2: rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalKExpressions.g:7599:1: rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7603:1: ( ( '@' ) )
            // InternalKExpressions.g:7604:1: ( '@' )
            {
            // InternalKExpressions.g:7604:1: ( '@' )
            // InternalKExpressions.g:7605:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:7618:1: rule__QuotedTypedKeyStringValueAnnotation__Group__1 : rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7622:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2 )
            // InternalKExpressions.g:7623:2: rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_42);
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
    // InternalKExpressions.g:7630:1: rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7634:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKExpressions.g:7635:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:7635:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKExpressions.g:7636:1: ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:7637:1: ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKExpressions.g:7637:2: rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKExpressions.g:7647:1: rule__QuotedTypedKeyStringValueAnnotation__Group__2 : rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7651:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3 )
            // InternalKExpressions.g:7652:2: rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalKExpressions.g:7659:1: rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7663:1: ( ( '[' ) )
            // InternalKExpressions.g:7664:1: ( '[' )
            {
            // InternalKExpressions.g:7664:1: ( '[' )
            // InternalKExpressions.g:7665:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,60,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:7678:1: rule__QuotedTypedKeyStringValueAnnotation__Group__3 : rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7682:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4 )
            // InternalKExpressions.g:7683:2: rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_43);
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
    // InternalKExpressions.g:7690:1: rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7694:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalKExpressions.g:7695:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalKExpressions.g:7695:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalKExpressions.g:7696:1: ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // InternalKExpressions.g:7697:1: ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalKExpressions.g:7697:2: rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3
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
    // InternalKExpressions.g:7707:1: rule__QuotedTypedKeyStringValueAnnotation__Group__4 : rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7711:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5 )
            // InternalKExpressions.g:7712:2: rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_44);
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
    // InternalKExpressions.g:7719:1: rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7723:1: ( ( ']' ) )
            // InternalKExpressions.g:7724:1: ( ']' )
            {
            // InternalKExpressions.g:7724:1: ( ']' )
            // InternalKExpressions.g:7725:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,61,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:7738:1: rule__QuotedTypedKeyStringValueAnnotation__Group__5 : rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7742:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6 )
            // InternalKExpressions.g:7743:2: rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_34);
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
    // InternalKExpressions.g:7750:1: rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7754:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalKExpressions.g:7755:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalKExpressions.g:7755:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalKExpressions.g:7756:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            }
            // InternalKExpressions.g:7757:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalKExpressions.g:7757:2: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5
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
    // InternalKExpressions.g:7767:1: rule__QuotedTypedKeyStringValueAnnotation__Group__6 : rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7771:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalKExpressions.g:7772:2: rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl
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
    // InternalKExpressions.g:7778:1: rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7782:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalKExpressions.g:7783:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalKExpressions.g:7783:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalKExpressions.g:7784:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // InternalKExpressions.g:7785:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==49) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalKExpressions.g:7785:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    rule__QuotedTypedKeyStringValueAnnotation__Group_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop43;
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
    // InternalKExpressions.g:7809:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 : rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7813:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 )
            // InternalKExpressions.g:7814:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_44);
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
    // InternalKExpressions.g:7821:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7825:1: ( ( ',' ) )
            // InternalKExpressions.g:7826:1: ( ',' )
            {
            // InternalKExpressions.g:7826:1: ( ',' )
            // InternalKExpressions.g:7827:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            }
            match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:7840:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 : rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7844:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalKExpressions.g:7845:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl
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
    // InternalKExpressions.g:7851:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7855:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalKExpressions.g:7856:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalKExpressions.g:7856:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalKExpressions.g:7857:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            }
            // InternalKExpressions.g:7858:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalKExpressions.g:7858:2: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1
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
    // InternalKExpressions.g:7872:1: rule__ExtendedID__Group__0 : rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 ;
    public final void rule__ExtendedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7876:1: ( rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 )
            // InternalKExpressions.g:7877:2: rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1
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
    // InternalKExpressions.g:7884:1: rule__ExtendedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7888:1: ( ( RULE_ID ) )
            // InternalKExpressions.g:7889:1: ( RULE_ID )
            {
            // InternalKExpressions.g:7889:1: ( RULE_ID )
            // InternalKExpressions.g:7890:1: RULE_ID
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
    // InternalKExpressions.g:7901:1: rule__ExtendedID__Group__1 : rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2 ;
    public final void rule__ExtendedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7905:1: ( rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2 )
            // InternalKExpressions.g:7906:2: rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2
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
    // InternalKExpressions.g:7913:1: rule__ExtendedID__Group__1__Impl : ( ( rule__ExtendedID__Group_1__0 )* ) ;
    public final void rule__ExtendedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7917:1: ( ( ( rule__ExtendedID__Group_1__0 )* ) )
            // InternalKExpressions.g:7918:1: ( ( rule__ExtendedID__Group_1__0 )* )
            {
            // InternalKExpressions.g:7918:1: ( ( rule__ExtendedID__Group_1__0 )* )
            // InternalKExpressions.g:7919:1: ( rule__ExtendedID__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:7920:1: ( rule__ExtendedID__Group_1__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==22) ) {
                    int LA44_2 = input.LA(2);

                    if ( (LA44_2==RULE_ID) ) {
                        alt44=1;
                    }


                }
                else if ( (LA44_0==27) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalKExpressions.g:7920:2: rule__ExtendedID__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_46);
            	    rule__ExtendedID__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop44;
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
    // InternalKExpressions.g:7930:1: rule__ExtendedID__Group__2 : rule__ExtendedID__Group__2__Impl ;
    public final void rule__ExtendedID__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7934:1: ( rule__ExtendedID__Group__2__Impl )
            // InternalKExpressions.g:7935:2: rule__ExtendedID__Group__2__Impl
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
    // InternalKExpressions.g:7941:1: rule__ExtendedID__Group__2__Impl : ( ( rule__ExtendedID__Group_2__0 )? ) ;
    public final void rule__ExtendedID__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7945:1: ( ( ( rule__ExtendedID__Group_2__0 )? ) )
            // InternalKExpressions.g:7946:1: ( ( rule__ExtendedID__Group_2__0 )? )
            {
            // InternalKExpressions.g:7946:1: ( ( rule__ExtendedID__Group_2__0 )? )
            // InternalKExpressions.g:7947:1: ( rule__ExtendedID__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup_2()); 
            }
            // InternalKExpressions.g:7948:1: ( rule__ExtendedID__Group_2__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==59) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalKExpressions.g:7948:2: rule__ExtendedID__Group_2__0
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
    // InternalKExpressions.g:7964:1: rule__ExtendedID__Group_1__0 : rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 ;
    public final void rule__ExtendedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7968:1: ( rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 )
            // InternalKExpressions.g:7969:2: rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalKExpressions.g:7976:1: rule__ExtendedID__Group_1__0__Impl : ( ( rule__ExtendedID__Alternatives_1_0 ) ) ;
    public final void rule__ExtendedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7980:1: ( ( ( rule__ExtendedID__Alternatives_1_0 ) ) )
            // InternalKExpressions.g:7981:1: ( ( rule__ExtendedID__Alternatives_1_0 ) )
            {
            // InternalKExpressions.g:7981:1: ( ( rule__ExtendedID__Alternatives_1_0 ) )
            // InternalKExpressions.g:7982:1: ( rule__ExtendedID__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getAlternatives_1_0()); 
            }
            // InternalKExpressions.g:7983:1: ( rule__ExtendedID__Alternatives_1_0 )
            // InternalKExpressions.g:7983:2: rule__ExtendedID__Alternatives_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExtendedID__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendedIDAccess().getAlternatives_1_0()); 
            }

            }


            }

        }
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
    // InternalKExpressions.g:7993:1: rule__ExtendedID__Group_1__1 : rule__ExtendedID__Group_1__1__Impl ;
    public final void rule__ExtendedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7997:1: ( rule__ExtendedID__Group_1__1__Impl )
            // InternalKExpressions.g:7998:2: rule__ExtendedID__Group_1__1__Impl
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
    // InternalKExpressions.g:8004:1: rule__ExtendedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8008:1: ( ( RULE_ID ) )
            // InternalKExpressions.g:8009:1: ( RULE_ID )
            {
            // InternalKExpressions.g:8009:1: ( RULE_ID )
            // InternalKExpressions.g:8010:1: RULE_ID
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
    // InternalKExpressions.g:8025:1: rule__ExtendedID__Group_2__0 : rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1 ;
    public final void rule__ExtendedID__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8029:1: ( rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1 )
            // InternalKExpressions.g:8030:2: rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1
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
    // InternalKExpressions.g:8037:1: rule__ExtendedID__Group_2__0__Impl : ( '#' ) ;
    public final void rule__ExtendedID__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8041:1: ( ( '#' ) )
            // InternalKExpressions.g:8042:1: ( '#' )
            {
            // InternalKExpressions.g:8042:1: ( '#' )
            // InternalKExpressions.g:8043:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getNumberSignKeyword_2_0()); 
            }
            match(input,59,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:8056:1: rule__ExtendedID__Group_2__1 : rule__ExtendedID__Group_2__1__Impl ;
    public final void rule__ExtendedID__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8060:1: ( rule__ExtendedID__Group_2__1__Impl )
            // InternalKExpressions.g:8061:2: rule__ExtendedID__Group_2__1__Impl
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
    // InternalKExpressions.g:8067:1: rule__ExtendedID__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__ExtendedID__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8071:1: ( ( RULE_INT ) )
            // InternalKExpressions.g:8072:1: ( RULE_INT )
            {
            // InternalKExpressions.g:8072:1: ( RULE_INT )
            // InternalKExpressions.g:8073:1: RULE_INT
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
    // InternalKExpressions.g:8090:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8094:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // InternalKExpressions.g:8095:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_48);
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
    // InternalKExpressions.g:8102:1: rule__Integer__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8106:1: ( ( ( '-' )? ) )
            // InternalKExpressions.g:8107:1: ( ( '-' )? )
            {
            // InternalKExpressions.g:8107:1: ( ( '-' )? )
            // InternalKExpressions.g:8108:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalKExpressions.g:8109:1: ( '-' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==22) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalKExpressions.g:8110:2: '-'
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
    // InternalKExpressions.g:8121:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8125:1: ( rule__Integer__Group__1__Impl )
            // InternalKExpressions.g:8126:2: rule__Integer__Group__1__Impl
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
    // InternalKExpressions.g:8132:1: rule__Integer__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8136:1: ( ( RULE_INT ) )
            // InternalKExpressions.g:8137:1: ( RULE_INT )
            {
            // InternalKExpressions.g:8137:1: ( RULE_INT )
            // InternalKExpressions.g:8138:1: RULE_INT
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
    // InternalKExpressions.g:8153:1: rule__Floateger__Group__0 : rule__Floateger__Group__0__Impl rule__Floateger__Group__1 ;
    public final void rule__Floateger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8157:1: ( rule__Floateger__Group__0__Impl rule__Floateger__Group__1 )
            // InternalKExpressions.g:8158:2: rule__Floateger__Group__0__Impl rule__Floateger__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_40);
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
    // InternalKExpressions.g:8165:1: rule__Floateger__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Floateger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8169:1: ( ( ( '-' )? ) )
            // InternalKExpressions.g:8170:1: ( ( '-' )? )
            {
            // InternalKExpressions.g:8170:1: ( ( '-' )? )
            // InternalKExpressions.g:8171:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloategerAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalKExpressions.g:8172:1: ( '-' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==22) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalKExpressions.g:8173:2: '-'
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
    // InternalKExpressions.g:8184:1: rule__Floateger__Group__1 : rule__Floateger__Group__1__Impl ;
    public final void rule__Floateger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8188:1: ( rule__Floateger__Group__1__Impl )
            // InternalKExpressions.g:8189:2: rule__Floateger__Group__1__Impl
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
    // InternalKExpressions.g:8195:1: rule__Floateger__Group__1__Impl : ( RULE_FLOAT ) ;
    public final void rule__Floateger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8199:1: ( ( RULE_FLOAT ) )
            // InternalKExpressions.g:8200:1: ( RULE_FLOAT )
            {
            // InternalKExpressions.g:8200:1: ( RULE_FLOAT )
            // InternalKExpressions.g:8201:1: RULE_FLOAT
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


    // $ANTLR start "rule__OrExpression__OperatorAssignment_1_1"
    // InternalKExpressions.g:8217:1: rule__OrExpression__OperatorAssignment_1_1 : ( ruleOrOperator ) ;
    public final void rule__OrExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8221:1: ( ( ruleOrOperator ) )
            // InternalKExpressions.g:8222:1: ( ruleOrOperator )
            {
            // InternalKExpressions.g:8222:1: ( ruleOrOperator )
            // InternalKExpressions.g:8223:1: ruleOrOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleOrOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__OrExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__OrExpression__SubExpressionsAssignment_1_2"
    // InternalKExpressions.g:8232:1: rule__OrExpression__SubExpressionsAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8236:1: ( ( ruleAndExpression ) )
            // InternalKExpressions.g:8237:1: ( ruleAndExpression )
            {
            // InternalKExpressions.g:8237:1: ( ruleAndExpression )
            // InternalKExpressions.g:8238:1: ruleAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getSubExpressionsAndExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__OrExpression__SubExpressionsAssignment_1_2"


    // $ANTLR start "rule__AndExpression__OperatorAssignment_1_1"
    // InternalKExpressions.g:8247:1: rule__AndExpression__OperatorAssignment_1_1 : ( ruleAndOperator ) ;
    public final void rule__AndExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8251:1: ( ( ruleAndOperator ) )
            // InternalKExpressions.g:8252:1: ( ruleAndOperator )
            {
            // InternalKExpressions.g:8252:1: ( ruleAndOperator )
            // InternalKExpressions.g:8253:1: ruleAndOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAndOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__AndExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__AndExpression__SubExpressionsAssignment_1_2"
    // InternalKExpressions.g:8262:1: rule__AndExpression__SubExpressionsAssignment_1_2 : ( ruleCompareOperation ) ;
    public final void rule__AndExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8266:1: ( ( ruleCompareOperation ) )
            // InternalKExpressions.g:8267:1: ( ruleCompareOperation )
            {
            // InternalKExpressions.g:8267:1: ( ruleCompareOperation )
            // InternalKExpressions.g:8268:1: ruleCompareOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleCompareOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__AndExpression__SubExpressionsAssignment_1_2"


    // $ANTLR start "rule__CompareOperation__OperatorAssignment_0_1_1"
    // InternalKExpressions.g:8277:1: rule__CompareOperation__OperatorAssignment_0_1_1 : ( ruleCompareOperator ) ;
    public final void rule__CompareOperation__OperatorAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8281:1: ( ( ruleCompareOperator ) )
            // InternalKExpressions.g:8282:1: ( ruleCompareOperator )
            {
            // InternalKExpressions.g:8282:1: ( ruleCompareOperator )
            // InternalKExpressions.g:8283:1: ruleCompareOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_0_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleCompareOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__CompareOperation__OperatorAssignment_0_1_1"


    // $ANTLR start "rule__CompareOperation__SubExpressionsAssignment_0_1_2"
    // InternalKExpressions.g:8292:1: rule__CompareOperation__SubExpressionsAssignment_0_1_2 : ( ruleNotOrValuedExpression ) ;
    public final void rule__CompareOperation__SubExpressionsAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8296:1: ( ( ruleNotOrValuedExpression ) )
            // InternalKExpressions.g:8297:1: ( ruleNotOrValuedExpression )
            {
            // InternalKExpressions.g:8297:1: ( ruleNotOrValuedExpression )
            // InternalKExpressions.g:8298:1: ruleNotOrValuedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_0_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__CompareOperation__SubExpressionsAssignment_0_1_2"


    // $ANTLR start "rule__NotExpression__OperatorAssignment_0_1"
    // InternalKExpressions.g:8307:1: rule__NotExpression__OperatorAssignment_0_1 : ( ruleNotOperator ) ;
    public final void rule__NotExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8311:1: ( ( ruleNotOperator ) )
            // InternalKExpressions.g:8312:1: ( ruleNotOperator )
            {
            // InternalKExpressions.g:8312:1: ( ruleNotOperator )
            // InternalKExpressions.g:8313:1: ruleNotOperator
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
    // InternalKExpressions.g:8322:1: rule__NotExpression__SubExpressionsAssignment_0_2 : ( ruleNotExpression ) ;
    public final void rule__NotExpression__SubExpressionsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8326:1: ( ( ruleNotExpression ) )
            // InternalKExpressions.g:8327:1: ( ruleNotExpression )
            {
            // InternalKExpressions.g:8327:1: ( ruleNotExpression )
            // InternalKExpressions.g:8328:1: ruleNotExpression
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


    // $ANTLR start "rule__AddExpression__OperatorAssignment_1_1"
    // InternalKExpressions.g:8337:1: rule__AddExpression__OperatorAssignment_1_1 : ( ruleAddOperator ) ;
    public final void rule__AddExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8341:1: ( ( ruleAddOperator ) )
            // InternalKExpressions.g:8342:1: ( ruleAddOperator )
            {
            // InternalKExpressions.g:8342:1: ( ruleAddOperator )
            // InternalKExpressions.g:8343:1: ruleAddOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAddOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__AddExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__AddExpression__SubExpressionsAssignment_1_2"
    // InternalKExpressions.g:8352:1: rule__AddExpression__SubExpressionsAssignment_1_2 : ( ruleSubExpression ) ;
    public final void rule__AddExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8356:1: ( ( ruleSubExpression ) )
            // InternalKExpressions.g:8357:1: ( ruleSubExpression )
            {
            // InternalKExpressions.g:8357:1: ( ruleSubExpression )
            // InternalKExpressions.g:8358:1: ruleSubExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSubExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__AddExpression__SubExpressionsAssignment_1_2"


    // $ANTLR start "rule__SubExpression__OperatorAssignment_1_1"
    // InternalKExpressions.g:8367:1: rule__SubExpression__OperatorAssignment_1_1 : ( ruleSubOperator ) ;
    public final void rule__SubExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8371:1: ( ( ruleSubOperator ) )
            // InternalKExpressions.g:8372:1: ( ruleSubOperator )
            {
            // InternalKExpressions.g:8372:1: ( ruleSubOperator )
            // InternalKExpressions.g:8373:1: ruleSubOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSubOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__SubExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__SubExpression__SubExpressionsAssignment_1_2"
    // InternalKExpressions.g:8382:1: rule__SubExpression__SubExpressionsAssignment_1_2 : ( ruleMultExpression ) ;
    public final void rule__SubExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8386:1: ( ( ruleMultExpression ) )
            // InternalKExpressions.g:8387:1: ( ruleMultExpression )
            {
            // InternalKExpressions.g:8387:1: ( ruleMultExpression )
            // InternalKExpressions.g:8388:1: ruleMultExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMultExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__SubExpression__SubExpressionsAssignment_1_2"


    // $ANTLR start "rule__MultExpression__OperatorAssignment_1_1"
    // InternalKExpressions.g:8397:1: rule__MultExpression__OperatorAssignment_1_1 : ( ruleMultOperator ) ;
    public final void rule__MultExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8401:1: ( ( ruleMultOperator ) )
            // InternalKExpressions.g:8402:1: ( ruleMultOperator )
            {
            // InternalKExpressions.g:8402:1: ( ruleMultOperator )
            // InternalKExpressions.g:8403:1: ruleMultOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMultOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__MultExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__MultExpression__SubExpressionsAssignment_1_2"
    // InternalKExpressions.g:8412:1: rule__MultExpression__SubExpressionsAssignment_1_2 : ( ruleDivExpression ) ;
    public final void rule__MultExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8416:1: ( ( ruleDivExpression ) )
            // InternalKExpressions.g:8417:1: ( ruleDivExpression )
            {
            // InternalKExpressions.g:8417:1: ( ruleDivExpression )
            // InternalKExpressions.g:8418:1: ruleDivExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDivExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__SubExpressionsAssignment_1_2"


    // $ANTLR start "rule__DivExpression__OperatorAssignment_1_1"
    // InternalKExpressions.g:8427:1: rule__DivExpression__OperatorAssignment_1_1 : ( ruleDivOperator ) ;
    public final void rule__DivExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8431:1: ( ( ruleDivOperator ) )
            // InternalKExpressions.g:8432:1: ( ruleDivOperator )
            {
            // InternalKExpressions.g:8432:1: ( ruleDivOperator )
            // InternalKExpressions.g:8433:1: ruleDivOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDivOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DivExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__DivExpression__SubExpressionsAssignment_1_2"
    // InternalKExpressions.g:8442:1: rule__DivExpression__SubExpressionsAssignment_1_2 : ( ruleModExpression ) ;
    public final void rule__DivExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8446:1: ( ( ruleModExpression ) )
            // InternalKExpressions.g:8447:1: ( ruleModExpression )
            {
            // InternalKExpressions.g:8447:1: ( ruleModExpression )
            // InternalKExpressions.g:8448:1: ruleModExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleModExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DivExpression__SubExpressionsAssignment_1_2"


    // $ANTLR start "rule__ModExpression__OperatorAssignment_1_1"
    // InternalKExpressions.g:8457:1: rule__ModExpression__OperatorAssignment_1_1 : ( ruleModOperator ) ;
    public final void rule__ModExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8461:1: ( ( ruleModOperator ) )
            // InternalKExpressions.g:8462:1: ( ruleModOperator )
            {
            // InternalKExpressions.g:8462:1: ( ruleModOperator )
            // InternalKExpressions.g:8463:1: ruleModOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleModOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__ModExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__ModExpression__SubExpressionsAssignment_1_2"
    // InternalKExpressions.g:8472:1: rule__ModExpression__SubExpressionsAssignment_1_2 : ( ruleAtomicValuedExpression ) ;
    public final void rule__ModExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8476:1: ( ( ruleAtomicValuedExpression ) )
            // InternalKExpressions.g:8477:1: ( ruleAtomicValuedExpression )
            {
            // InternalKExpressions.g:8477:1: ( ruleAtomicValuedExpression )
            // InternalKExpressions.g:8478:1: ruleAtomicValuedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAtomicValuedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__ModExpression__SubExpressionsAssignment_1_2"


    // $ANTLR start "rule__NegExpression__OperatorAssignment_0_1"
    // InternalKExpressions.g:8487:1: rule__NegExpression__OperatorAssignment_0_1 : ( ruleSubOperator ) ;
    public final void rule__NegExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8491:1: ( ( ruleSubOperator ) )
            // InternalKExpressions.g:8492:1: ( ruleSubOperator )
            {
            // InternalKExpressions.g:8492:1: ( ruleSubOperator )
            // InternalKExpressions.g:8493:1: ruleSubOperator
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
    // InternalKExpressions.g:8502:1: rule__NegExpression__SubExpressionsAssignment_0_2 : ( ruleNegExpression ) ;
    public final void rule__NegExpression__SubExpressionsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8506:1: ( ( ruleNegExpression ) )
            // InternalKExpressions.g:8507:1: ( ruleNegExpression )
            {
            // InternalKExpressions.g:8507:1: ( ruleNegExpression )
            // InternalKExpressions.g:8508:1: ruleNegExpression
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
    // InternalKExpressions.g:8517:1: rule__ValuedObjectTestExpression__OperatorAssignment_0_1 : ( rulePreOperator ) ;
    public final void rule__ValuedObjectTestExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8521:1: ( ( rulePreOperator ) )
            // InternalKExpressions.g:8522:1: ( rulePreOperator )
            {
            // InternalKExpressions.g:8522:1: ( rulePreOperator )
            // InternalKExpressions.g:8523:1: rulePreOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            rulePreOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__ValuedObjectTestExpression__OperatorAssignment_0_1"


    // $ANTLR start "rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3"
    // InternalKExpressions.g:8532:1: rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 : ( ruleValuedObjectTestExpression ) ;
    public final void rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8536:1: ( ( ruleValuedObjectTestExpression ) )
            // InternalKExpressions.g:8537:1: ( ruleValuedObjectTestExpression )
            {
            // InternalKExpressions.g:8537:1: ( ruleValuedObjectTestExpression )
            // InternalKExpressions.g:8538:1: ruleValuedObjectTestExpression
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


    // $ANTLR start "rule__ValuedObjectTestExpression__OperatorAssignment_1_1"
    // InternalKExpressions.g:8547:1: rule__ValuedObjectTestExpression__OperatorAssignment_1_1 : ( ruleValueTestOperator ) ;
    public final void rule__ValuedObjectTestExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8551:1: ( ( ruleValueTestOperator ) )
            // InternalKExpressions.g:8552:1: ( ruleValueTestOperator )
            {
            // InternalKExpressions.g:8552:1: ( ruleValueTestOperator )
            // InternalKExpressions.g:8553:1: ruleValueTestOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValueTestOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValueTestOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__ValuedObjectTestExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2"
    // InternalKExpressions.g:8562:1: rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 : ( ruleValuedObjectReference ) ;
    public final void rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8566:1: ( ( ruleValuedObjectReference ) )
            // InternalKExpressions.g:8567:1: ( ruleValuedObjectReference )
            {
            // InternalKExpressions.g:8567:1: ( ruleValuedObjectReference )
            // InternalKExpressions.g:8568:1: ruleValuedObjectReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectReferenceParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValuedObjectReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2"


    // $ANTLR start "rule__ValuedObjectReference__ValuedObjectAssignment"
    // InternalKExpressions.g:8577:1: rule__ValuedObjectReference__ValuedObjectAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ValuedObjectReference__ValuedObjectAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8581:1: ( ( ( RULE_ID ) ) )
            // InternalKExpressions.g:8582:1: ( ( RULE_ID ) )
            {
            // InternalKExpressions.g:8582:1: ( ( RULE_ID ) )
            // InternalKExpressions.g:8583:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0()); 
            }
            // InternalKExpressions.g:8584:1: ( RULE_ID )
            // InternalKExpressions.g:8585:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectIDTerminalRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__ValuedObjectReference__ValuedObjectAssignment"


    // $ANTLR start "rule__TextExpression__CodeAssignment_0"
    // InternalKExpressions.g:8596:1: rule__TextExpression__CodeAssignment_0 : ( RULE_HOSTCODE ) ;
    public final void rule__TextExpression__CodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8600:1: ( ( RULE_HOSTCODE ) )
            // InternalKExpressions.g:8601:1: ( RULE_HOSTCODE )
            {
            // InternalKExpressions.g:8601:1: ( RULE_HOSTCODE )
            // InternalKExpressions.g:8602:1: RULE_HOSTCODE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getCodeHOSTCODETerminalRuleCall_0_0()); 
            }
            match(input,RULE_HOSTCODE,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextExpressionAccess().getCodeHOSTCODETerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextExpression__CodeAssignment_0"


    // $ANTLR start "rule__TextExpression__TypeAssignment_1_1"
    // InternalKExpressions.g:8611:1: rule__TextExpression__TypeAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__TextExpression__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8615:1: ( ( RULE_ID ) )
            // InternalKExpressions.g:8616:1: ( RULE_ID )
            {
            // InternalKExpressions.g:8616:1: ( RULE_ID )
            // InternalKExpressions.g:8617:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getTypeIDTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__TextExpression__TypeAssignment_1_1"


    // $ANTLR start "rule__IntValue__ValueAssignment"
    // InternalKExpressions.g:8626:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8630:1: ( ( RULE_INT ) )
            // InternalKExpressions.g:8631:1: ( RULE_INT )
            {
            // InternalKExpressions.g:8631:1: ( RULE_INT )
            // InternalKExpressions.g:8632:1: RULE_INT
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
    // InternalKExpressions.g:8641:1: rule__FloatValue__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8645:1: ( ( RULE_FLOAT ) )
            // InternalKExpressions.g:8646:1: ( RULE_FLOAT )
            {
            // InternalKExpressions.g:8646:1: ( RULE_FLOAT )
            // InternalKExpressions.g:8647:1: RULE_FLOAT
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


    // $ANTLR start "rule__BooleanValue__ValueAssignment"
    // InternalKExpressions.g:8656:1: rule__BooleanValue__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8660:1: ( ( RULE_BOOLEAN ) )
            // InternalKExpressions.g:8661:1: ( RULE_BOOLEAN )
            {
            // InternalKExpressions.g:8661:1: ( RULE_BOOLEAN )
            // InternalKExpressions.g:8662:1: RULE_BOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueBOOLEANTerminalRuleCall_0()); 
            }
            match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueAccess().getValueBOOLEANTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__ValueAssignment"


    // $ANTLR start "rule__ISignal__NameAssignment_0"
    // InternalKExpressions.g:8671:1: rule__ISignal__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ISignal__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8675:1: ( ( RULE_ID ) )
            // InternalKExpressions.g:8676:1: ( RULE_ID )
            {
            // InternalKExpressions.g:8676:1: ( RULE_ID )
            // InternalKExpressions.g:8677:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getISignalAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getISignalAccess().getNameIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ISignal__NameAssignment_0"


    // $ANTLR start "rule__ISignal__ChannelDescrAssignment_1"
    // InternalKExpressions.g:8686:1: rule__ISignal__ChannelDescrAssignment_1 : ( ruleChannelDescription ) ;
    public final void rule__ISignal__ChannelDescrAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8690:1: ( ( ruleChannelDescription ) )
            // InternalKExpressions.g:8691:1: ( ruleChannelDescription )
            {
            // InternalKExpressions.g:8691:1: ( ruleChannelDescription )
            // InternalKExpressions.g:8692:1: ruleChannelDescription
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getISignalAccess().getChannelDescrChannelDescriptionParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleChannelDescription();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getISignalAccess().getChannelDescrChannelDescriptionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ISignal__ChannelDescrAssignment_1"


    // $ANTLR start "rule__InterfaceSignalDecl__SignalsAssignment_0_2"
    // InternalKExpressions.g:8701:1: rule__InterfaceSignalDecl__SignalsAssignment_0_2 : ( ruleISignal ) ;
    public final void rule__InterfaceSignalDecl__SignalsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8705:1: ( ( ruleISignal ) )
            // InternalKExpressions.g:8706:1: ( ruleISignal )
            {
            // InternalKExpressions.g:8706:1: ( ruleISignal )
            // InternalKExpressions.g:8707:1: ruleISignal
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleISignal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__SignalsAssignment_0_2"


    // $ANTLR start "rule__InterfaceSignalDecl__SignalsAssignment_0_3_1"
    // InternalKExpressions.g:8716:1: rule__InterfaceSignalDecl__SignalsAssignment_0_3_1 : ( ruleISignal ) ;
    public final void rule__InterfaceSignalDecl__SignalsAssignment_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8720:1: ( ( ruleISignal ) )
            // InternalKExpressions.g:8721:1: ( ruleISignal )
            {
            // InternalKExpressions.g:8721:1: ( ruleISignal )
            // InternalKExpressions.g:8722:1: ruleISignal
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_0_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleISignal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_0_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__SignalsAssignment_0_3_1"


    // $ANTLR start "rule__InterfaceSignalDecl__SignalsAssignment_1_2"
    // InternalKExpressions.g:8731:1: rule__InterfaceSignalDecl__SignalsAssignment_1_2 : ( ruleISignal ) ;
    public final void rule__InterfaceSignalDecl__SignalsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8735:1: ( ( ruleISignal ) )
            // InternalKExpressions.g:8736:1: ( ruleISignal )
            {
            // InternalKExpressions.g:8736:1: ( ruleISignal )
            // InternalKExpressions.g:8737:1: ruleISignal
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleISignal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__SignalsAssignment_1_2"


    // $ANTLR start "rule__InterfaceSignalDecl__SignalsAssignment_1_3_1"
    // InternalKExpressions.g:8746:1: rule__InterfaceSignalDecl__SignalsAssignment_1_3_1 : ( ruleISignal ) ;
    public final void rule__InterfaceSignalDecl__SignalsAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8750:1: ( ( ruleISignal ) )
            // InternalKExpressions.g:8751:1: ( ruleISignal )
            {
            // InternalKExpressions.g:8751:1: ( ruleISignal )
            // InternalKExpressions.g:8752:1: ruleISignal
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_1_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleISignal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_1_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__SignalsAssignment_1_3_1"


    // $ANTLR start "rule__InterfaceSignalDecl__SignalsAssignment_2_2"
    // InternalKExpressions.g:8761:1: rule__InterfaceSignalDecl__SignalsAssignment_2_2 : ( ruleISignal ) ;
    public final void rule__InterfaceSignalDecl__SignalsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8765:1: ( ( ruleISignal ) )
            // InternalKExpressions.g:8766:1: ( ruleISignal )
            {
            // InternalKExpressions.g:8766:1: ( ruleISignal )
            // InternalKExpressions.g:8767:1: ruleISignal
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_2_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleISignal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__SignalsAssignment_2_2"


    // $ANTLR start "rule__InterfaceSignalDecl__SignalsAssignment_2_3_1"
    // InternalKExpressions.g:8776:1: rule__InterfaceSignalDecl__SignalsAssignment_2_3_1 : ( ruleISignal ) ;
    public final void rule__InterfaceSignalDecl__SignalsAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8780:1: ( ( ruleISignal ) )
            // InternalKExpressions.g:8781:1: ( ruleISignal )
            {
            // InternalKExpressions.g:8781:1: ( ruleISignal )
            // InternalKExpressions.g:8782:1: ruleISignal
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_2_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleISignal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_2_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__SignalsAssignment_2_3_1"


    // $ANTLR start "rule__InterfaceSignalDecl__SignalsAssignment_3_2"
    // InternalKExpressions.g:8791:1: rule__InterfaceSignalDecl__SignalsAssignment_3_2 : ( ruleISignal ) ;
    public final void rule__InterfaceSignalDecl__SignalsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8795:1: ( ( ruleISignal ) )
            // InternalKExpressions.g:8796:1: ( ruleISignal )
            {
            // InternalKExpressions.g:8796:1: ( ruleISignal )
            // InternalKExpressions.g:8797:1: ruleISignal
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_3_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleISignal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__SignalsAssignment_3_2"


    // $ANTLR start "rule__InterfaceSignalDecl__SignalsAssignment_3_3_1"
    // InternalKExpressions.g:8806:1: rule__InterfaceSignalDecl__SignalsAssignment_3_3_1 : ( ruleISignal ) ;
    public final void rule__InterfaceSignalDecl__SignalsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8810:1: ( ( ruleISignal ) )
            // InternalKExpressions.g:8811:1: ( ruleISignal )
            {
            // InternalKExpressions.g:8811:1: ( ruleISignal )
            // InternalKExpressions.g:8812:1: ruleISignal
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_3_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleISignal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_3_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceSignalDecl__SignalsAssignment_3_3_1"


    // $ANTLR start "rule__ChannelDescription__TypeAssignment_0_1"
    // InternalKExpressions.g:8821:1: rule__ChannelDescription__TypeAssignment_0_1 : ( ruleTypeIdentifier ) ;
    public final void rule__ChannelDescription__TypeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8825:1: ( ( ruleTypeIdentifier ) )
            // InternalKExpressions.g:8826:1: ( ruleTypeIdentifier )
            {
            // InternalKExpressions.g:8826:1: ( ruleTypeIdentifier )
            // InternalKExpressions.g:8827:1: ruleTypeIdentifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChannelDescriptionAccess().getTypeTypeIdentifierParserRuleCall_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTypeIdentifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChannelDescriptionAccess().getTypeTypeIdentifierParserRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelDescription__TypeAssignment_0_1"


    // $ANTLR start "rule__ChannelDescription__TypeAssignment_1_1"
    // InternalKExpressions.g:8836:1: rule__ChannelDescription__TypeAssignment_1_1 : ( ruleTypeIdentifier ) ;
    public final void rule__ChannelDescription__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8840:1: ( ( ruleTypeIdentifier ) )
            // InternalKExpressions.g:8841:1: ( ruleTypeIdentifier )
            {
            // InternalKExpressions.g:8841:1: ( ruleTypeIdentifier )
            // InternalKExpressions.g:8842:1: ruleTypeIdentifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChannelDescriptionAccess().getTypeTypeIdentifierParserRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTypeIdentifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChannelDescriptionAccess().getTypeTypeIdentifierParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelDescription__TypeAssignment_1_1"


    // $ANTLR start "rule__ChannelDescription__ExpressionAssignment_2_1"
    // InternalKExpressions.g:8851:1: rule__ChannelDescription__ExpressionAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__ChannelDescription__ExpressionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8855:1: ( ( ruleExpression ) )
            // InternalKExpressions.g:8856:1: ( ruleExpression )
            {
            // InternalKExpressions.g:8856:1: ( ruleExpression )
            // InternalKExpressions.g:8857:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChannelDescriptionAccess().getExpressionExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChannelDescriptionAccess().getExpressionExpressionParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelDescription__ExpressionAssignment_2_1"


    // $ANTLR start "rule__ChannelDescription__TypeAssignment_2_3"
    // InternalKExpressions.g:8866:1: rule__ChannelDescription__TypeAssignment_2_3 : ( ruleTypeIdentifier ) ;
    public final void rule__ChannelDescription__TypeAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8870:1: ( ( ruleTypeIdentifier ) )
            // InternalKExpressions.g:8871:1: ( ruleTypeIdentifier )
            {
            // InternalKExpressions.g:8871:1: ( ruleTypeIdentifier )
            // InternalKExpressions.g:8872:1: ruleTypeIdentifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChannelDescriptionAccess().getTypeTypeIdentifierParserRuleCall_2_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTypeIdentifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChannelDescriptionAccess().getTypeTypeIdentifierParserRuleCall_2_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelDescription__TypeAssignment_2_3"


    // $ANTLR start "rule__InterfaceVariableDecl__VarDeclsAssignment_1"
    // InternalKExpressions.g:8881:1: rule__InterfaceVariableDecl__VarDeclsAssignment_1 : ( ruleVariableDecl ) ;
    public final void rule__InterfaceVariableDecl__VarDeclsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8885:1: ( ( ruleVariableDecl ) )
            // InternalKExpressions.g:8886:1: ( ruleVariableDecl )
            {
            // InternalKExpressions.g:8886:1: ( ruleVariableDecl )
            // InternalKExpressions.g:8887:1: ruleVariableDecl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceVariableDeclAccess().getVarDeclsVariableDeclParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVariableDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceVariableDeclAccess().getVarDeclsVariableDeclParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceVariableDecl__VarDeclsAssignment_1"


    // $ANTLR start "rule__InterfaceVariableDecl__VarDeclsAssignment_2_1"
    // InternalKExpressions.g:8896:1: rule__InterfaceVariableDecl__VarDeclsAssignment_2_1 : ( ruleVariableDecl ) ;
    public final void rule__InterfaceVariableDecl__VarDeclsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8900:1: ( ( ruleVariableDecl ) )
            // InternalKExpressions.g:8901:1: ( ruleVariableDecl )
            {
            // InternalKExpressions.g:8901:1: ( ruleVariableDecl )
            // InternalKExpressions.g:8902:1: ruleVariableDecl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceVariableDeclAccess().getVarDeclsVariableDeclParserRuleCall_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVariableDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceVariableDeclAccess().getVarDeclsVariableDeclParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceVariableDecl__VarDeclsAssignment_2_1"


    // $ANTLR start "rule__VariableDecl__VariablesAssignment_0"
    // InternalKExpressions.g:8911:1: rule__VariableDecl__VariablesAssignment_0 : ( ruleIVariable ) ;
    public final void rule__VariableDecl__VariablesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8915:1: ( ( ruleIVariable ) )
            // InternalKExpressions.g:8916:1: ( ruleIVariable )
            {
            // InternalKExpressions.g:8916:1: ( ruleIVariable )
            // InternalKExpressions.g:8917:1: ruleIVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclAccess().getVariablesIVariableParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleIVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclAccess().getVariablesIVariableParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDecl__VariablesAssignment_0"


    // $ANTLR start "rule__VariableDecl__VariablesAssignment_1_1"
    // InternalKExpressions.g:8926:1: rule__VariableDecl__VariablesAssignment_1_1 : ( ruleIVariable ) ;
    public final void rule__VariableDecl__VariablesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8930:1: ( ( ruleIVariable ) )
            // InternalKExpressions.g:8931:1: ( ruleIVariable )
            {
            // InternalKExpressions.g:8931:1: ( ruleIVariable )
            // InternalKExpressions.g:8932:1: ruleIVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclAccess().getVariablesIVariableParserRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleIVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclAccess().getVariablesIVariableParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDecl__VariablesAssignment_1_1"


    // $ANTLR start "rule__VariableDecl__TypeAssignment_3"
    // InternalKExpressions.g:8941:1: rule__VariableDecl__TypeAssignment_3 : ( ruleTypeIdentifier ) ;
    public final void rule__VariableDecl__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8945:1: ( ( ruleTypeIdentifier ) )
            // InternalKExpressions.g:8946:1: ( ruleTypeIdentifier )
            {
            // InternalKExpressions.g:8946:1: ( ruleTypeIdentifier )
            // InternalKExpressions.g:8947:1: ruleTypeIdentifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclAccess().getTypeTypeIdentifierParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTypeIdentifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclAccess().getTypeTypeIdentifierParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDecl__TypeAssignment_3"


    // $ANTLR start "rule__IVariable__NameAssignment_0"
    // InternalKExpressions.g:8956:1: rule__IVariable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__IVariable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8960:1: ( ( RULE_ID ) )
            // InternalKExpressions.g:8961:1: ( RULE_ID )
            {
            // InternalKExpressions.g:8961:1: ( RULE_ID )
            // InternalKExpressions.g:8962:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIVariableAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIVariableAccess().getNameIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IVariable__NameAssignment_0"


    // $ANTLR start "rule__IVariable__ExpressionAssignment_1_1"
    // InternalKExpressions.g:8971:1: rule__IVariable__ExpressionAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__IVariable__ExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8975:1: ( ( ruleExpression ) )
            // InternalKExpressions.g:8976:1: ( ruleExpression )
            {
            // InternalKExpressions.g:8976:1: ( ruleExpression )
            // InternalKExpressions.g:8977:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIVariableAccess().getExpressionExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIVariableAccess().getExpressionExpressionParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IVariable__ExpressionAssignment_1_1"


    // $ANTLR start "rule__TypeIdentifier__TypeAssignment_0"
    // InternalKExpressions.g:8986:1: rule__TypeIdentifier__TypeAssignment_0 : ( ruleValueType ) ;
    public final void rule__TypeIdentifier__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8990:1: ( ( ruleValueType ) )
            // InternalKExpressions.g:8991:1: ( ruleValueType )
            {
            // InternalKExpressions.g:8991:1: ( ruleValueType )
            // InternalKExpressions.g:8992:1: ruleValueType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeIdentifierAccess().getTypeValueTypeEnumRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValueType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeIdentifierAccess().getTypeValueTypeEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeIdentifier__TypeAssignment_0"


    // $ANTLR start "rule__TypeIdentifier__TypeIDAssignment_1"
    // InternalKExpressions.g:9001:1: rule__TypeIdentifier__TypeIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__TypeIdentifier__TypeIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9005:1: ( ( RULE_ID ) )
            // InternalKExpressions.g:9006:1: ( RULE_ID )
            {
            // InternalKExpressions.g:9006:1: ( RULE_ID )
            // InternalKExpressions.g:9007:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeIdentifierAccess().getTypeIDIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeIdentifierAccess().getTypeIDIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeIdentifier__TypeIDAssignment_1"


    // $ANTLR start "rule__TypeIdentifier__TypeAssignment_2_1_0"
    // InternalKExpressions.g:9016:1: rule__TypeIdentifier__TypeAssignment_2_1_0 : ( ruleValueType ) ;
    public final void rule__TypeIdentifier__TypeAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9020:1: ( ( ruleValueType ) )
            // InternalKExpressions.g:9021:1: ( ruleValueType )
            {
            // InternalKExpressions.g:9021:1: ( ruleValueType )
            // InternalKExpressions.g:9022:1: ruleValueType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeIdentifierAccess().getTypeValueTypeEnumRuleCall_2_1_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValueType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeIdentifierAccess().getTypeValueTypeEnumRuleCall_2_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeIdentifier__TypeAssignment_2_1_0"


    // $ANTLR start "rule__TypeIdentifier__TypeIDAssignment_2_1_1"
    // InternalKExpressions.g:9031:1: rule__TypeIdentifier__TypeIDAssignment_2_1_1 : ( RULE_ID ) ;
    public final void rule__TypeIdentifier__TypeIDAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9035:1: ( ( RULE_ID ) )
            // InternalKExpressions.g:9036:1: ( RULE_ID )
            {
            // InternalKExpressions.g:9036:1: ( RULE_ID )
            // InternalKExpressions.g:9037:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeIdentifierAccess().getTypeIDIDTerminalRuleCall_2_1_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeIdentifierAccess().getTypeIDIDTerminalRuleCall_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeIdentifier__TypeIDAssignment_2_1_1"


    // $ANTLR start "rule__TypeIdentifier__OperatorAssignment_2_3"
    // InternalKExpressions.g:9046:1: rule__TypeIdentifier__OperatorAssignment_2_3 : ( ruleCombineOperator ) ;
    public final void rule__TypeIdentifier__OperatorAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9050:1: ( ( ruleCombineOperator ) )
            // InternalKExpressions.g:9051:1: ( ruleCombineOperator )
            {
            // InternalKExpressions.g:9051:1: ( ruleCombineOperator )
            // InternalKExpressions.g:9052:1: ruleCombineOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeIdentifierAccess().getOperatorCombineOperatorEnumRuleCall_2_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleCombineOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeIdentifierAccess().getOperatorCombineOperatorEnumRuleCall_2_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeIdentifier__OperatorAssignment_2_3"


    // $ANTLR start "rule__CommentAnnotation__ValuesAssignment"
    // InternalKExpressions.g:9061:1: rule__CommentAnnotation__ValuesAssignment : ( RULE_COMMENT_ANNOTATION ) ;
    public final void rule__CommentAnnotation__ValuesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9065:1: ( ( RULE_COMMENT_ANNOTATION ) )
            // InternalKExpressions.g:9066:1: ( RULE_COMMENT_ANNOTATION )
            {
            // InternalKExpressions.g:9066:1: ( RULE_COMMENT_ANNOTATION )
            // InternalKExpressions.g:9067:1: RULE_COMMENT_ANNOTATION
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
    // InternalKExpressions.g:9077:1: rule__TagAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TagAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9081:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:9082:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:9082:1: ( ruleExtendedID )
            // InternalKExpressions.g:9083:1: ruleExtendedID
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
    // InternalKExpressions.g:9092:1: rule__PragmaTag__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__PragmaTag__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9096:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:9097:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:9097:1: ( ruleExtendedID )
            // InternalKExpressions.g:9098:1: ruleExtendedID
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
    // InternalKExpressions.g:9107:1: rule__KeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9111:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:9112:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:9112:1: ( ruleExtendedID )
            // InternalKExpressions.g:9113:1: ruleExtendedID
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
    // InternalKExpressions.g:9122:1: rule__KeyStringValueAnnotation__ValuesAssignment_2 : ( ruleEStringAllTypes ) ;
    public final void rule__KeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9126:1: ( ( ruleEStringAllTypes ) )
            // InternalKExpressions.g:9127:1: ( ruleEStringAllTypes )
            {
            // InternalKExpressions.g:9127:1: ( ruleEStringAllTypes )
            // InternalKExpressions.g:9128:1: ruleEStringAllTypes
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
    // InternalKExpressions.g:9137:1: rule__KeyStringValueAnnotation__ValuesAssignment_3_1 : ( ruleEStringAllTypes ) ;
    public final void rule__KeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9141:1: ( ( ruleEStringAllTypes ) )
            // InternalKExpressions.g:9142:1: ( ruleEStringAllTypes )
            {
            // InternalKExpressions.g:9142:1: ( ruleEStringAllTypes )
            // InternalKExpressions.g:9143:1: ruleEStringAllTypes
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
    // InternalKExpressions.g:9152:1: rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9156:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:9157:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:9157:1: ( ruleExtendedID )
            // InternalKExpressions.g:9158:1: ruleExtendedID
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
    // InternalKExpressions.g:9167:1: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9171:1: ( ( ruleEStringBoolean ) )
            // InternalKExpressions.g:9172:1: ( ruleEStringBoolean )
            {
            // InternalKExpressions.g:9172:1: ( ruleEStringBoolean )
            // InternalKExpressions.g:9173:1: ruleEStringBoolean
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
    // InternalKExpressions.g:9182:1: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9186:1: ( ( ruleEStringBoolean ) )
            // InternalKExpressions.g:9187:1: ( ruleEStringBoolean )
            {
            // InternalKExpressions.g:9187:1: ( ruleEStringBoolean )
            // InternalKExpressions.g:9188:1: ruleEStringBoolean
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
    // InternalKExpressions.g:9197:1: rule__StringPragma__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__StringPragma__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9201:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:9202:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:9202:1: ( ruleExtendedID )
            // InternalKExpressions.g:9203:1: ruleExtendedID
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
    // InternalKExpressions.g:9212:1: rule__StringPragma__ValuesAssignment_2 : ( ruleEStringAllTypes ) ;
    public final void rule__StringPragma__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9216:1: ( ( ruleEStringAllTypes ) )
            // InternalKExpressions.g:9217:1: ( ruleEStringAllTypes )
            {
            // InternalKExpressions.g:9217:1: ( ruleEStringAllTypes )
            // InternalKExpressions.g:9218:1: ruleEStringAllTypes
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
    // InternalKExpressions.g:9227:1: rule__StringPragma__ValuesAssignment_3_1 : ( ruleEStringAllTypes ) ;
    public final void rule__StringPragma__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9231:1: ( ( ruleEStringAllTypes ) )
            // InternalKExpressions.g:9232:1: ( ruleEStringAllTypes )
            {
            // InternalKExpressions.g:9232:1: ( ruleEStringAllTypes )
            // InternalKExpressions.g:9233:1: ruleEStringAllTypes
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
    // InternalKExpressions.g:9242:1: rule__TypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9246:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:9247:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:9247:1: ( ruleExtendedID )
            // InternalKExpressions.g:9248:1: ruleExtendedID
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
    // InternalKExpressions.g:9257:1: rule__TypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9261:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:9262:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:9262:1: ( ruleExtendedID )
            // InternalKExpressions.g:9263:1: ruleExtendedID
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
    // InternalKExpressions.g:9272:1: rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 : ( ruleEStringAllTypes ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9276:1: ( ( ruleEStringAllTypes ) )
            // InternalKExpressions.g:9277:1: ( ruleEStringAllTypes )
            {
            // InternalKExpressions.g:9277:1: ( ruleEStringAllTypes )
            // InternalKExpressions.g:9278:1: ruleEStringAllTypes
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
    // InternalKExpressions.g:9287:1: rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( ruleEStringAllTypes ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9291:1: ( ( ruleEStringAllTypes ) )
            // InternalKExpressions.g:9292:1: ( ruleEStringAllTypes )
            {
            // InternalKExpressions.g:9292:1: ( ruleEStringAllTypes )
            // InternalKExpressions.g:9293:1: ruleEStringAllTypes
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
    // InternalKExpressions.g:9302:1: rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9306:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:9307:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:9307:1: ( ruleExtendedID )
            // InternalKExpressions.g:9308:1: ruleExtendedID
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
    // InternalKExpressions.g:9317:1: rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9321:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:9322:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:9322:1: ( ruleExtendedID )
            // InternalKExpressions.g:9323:1: ruleExtendedID
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
    // InternalKExpressions.g:9332:1: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9336:1: ( ( ruleEStringBoolean ) )
            // InternalKExpressions.g:9337:1: ( ruleEStringBoolean )
            {
            // InternalKExpressions.g:9337:1: ( ruleEStringBoolean )
            // InternalKExpressions.g:9338:1: ruleEStringBoolean
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
    // InternalKExpressions.g:9347:1: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9351:1: ( ( ruleEStringBoolean ) )
            // InternalKExpressions.g:9352:1: ( ruleEStringBoolean )
            {
            // InternalKExpressions.g:9352:1: ( ruleEStringBoolean )
            // InternalKExpressions.g:9353:1: ruleEStringBoolean
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
    // InternalKExpressions.g:9362:1: rule__QuotedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__QuotedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9366:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:9367:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:9367:1: ( ruleExtendedID )
            // InternalKExpressions.g:9368:1: ruleExtendedID
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
    // InternalKExpressions.g:9377:1: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 : ( RULE_STRING ) ;
    public final void rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9381:1: ( ( RULE_STRING ) )
            // InternalKExpressions.g:9382:1: ( RULE_STRING )
            {
            // InternalKExpressions.g:9382:1: ( RULE_STRING )
            // InternalKExpressions.g:9383:1: RULE_STRING
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
    // InternalKExpressions.g:9392:1: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9396:1: ( ( RULE_STRING ) )
            // InternalKExpressions.g:9397:1: ( RULE_STRING )
            {
            // InternalKExpressions.g:9397:1: ( RULE_STRING )
            // InternalKExpressions.g:9398:1: RULE_STRING
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
    // InternalKExpressions.g:9407:1: rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9411:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:9412:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:9412:1: ( ruleExtendedID )
            // InternalKExpressions.g:9413:1: ruleExtendedID
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
    // InternalKExpressions.g:9422:1: rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9426:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:9427:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:9427:1: ( ruleExtendedID )
            // InternalKExpressions.g:9428:1: ruleExtendedID
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
    // InternalKExpressions.g:9437:1: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 : ( RULE_STRING ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9441:1: ( ( RULE_STRING ) )
            // InternalKExpressions.g:9442:1: ( RULE_STRING )
            {
            // InternalKExpressions.g:9442:1: ( RULE_STRING )
            // InternalKExpressions.g:9443:1: RULE_STRING
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
    // InternalKExpressions.g:9452:1: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9456:1: ( ( RULE_STRING ) )
            // InternalKExpressions.g:9457:1: ( RULE_STRING )
            {
            // InternalKExpressions.g:9457:1: ( RULE_STRING )
            // InternalKExpressions.g:9458:1: RULE_STRING
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

    // $ANTLR start synpred2_InternalKExpressions
    public final void synpred2_InternalKExpressions_fragment() throws RecognitionException {   
        // InternalKExpressions.g:1651:1: ( ( ( ruleBooleanExpression ) ) )
        // InternalKExpressions.g:1651:1: ( ( ruleBooleanExpression ) )
        {
        // InternalKExpressions.g:1651:1: ( ( ruleBooleanExpression ) )
        // InternalKExpressions.g:1652:1: ( ruleBooleanExpression )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall_0()); 
        }
        // InternalKExpressions.g:1653:1: ( ruleBooleanExpression )
        // InternalKExpressions.g:1653:3: ruleBooleanExpression
        {
        pushFollow(FollowSets000.FOLLOW_2);
        ruleBooleanExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred2_InternalKExpressions

    // $ANTLR start synpred3_InternalKExpressions
    public final void synpred3_InternalKExpressions_fragment() throws RecognitionException {   
        // InternalKExpressions.g:1673:1: ( ( ( rule__CompareOperation__Group_0__0 ) ) )
        // InternalKExpressions.g:1673:1: ( ( rule__CompareOperation__Group_0__0 ) )
        {
        // InternalKExpressions.g:1673:1: ( ( rule__CompareOperation__Group_0__0 ) )
        // InternalKExpressions.g:1674:1: ( rule__CompareOperation__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCompareOperationAccess().getGroup_0()); 
        }
        // InternalKExpressions.g:1675:1: ( rule__CompareOperation__Group_0__0 )
        // InternalKExpressions.g:1675:2: rule__CompareOperation__Group_0__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__CompareOperation__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred3_InternalKExpressions

    // $ANTLR start synpred4_InternalKExpressions
    public final void synpred4_InternalKExpressions_fragment() throws RecognitionException {   
        // InternalKExpressions.g:1695:1: ( ( ( ruleValuedExpression ) ) )
        // InternalKExpressions.g:1695:1: ( ( ruleValuedExpression ) )
        {
        // InternalKExpressions.g:1695:1: ( ( ruleValuedExpression ) )
        // InternalKExpressions.g:1696:1: ( ruleValuedExpression )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
        }
        // InternalKExpressions.g:1697:1: ( ruleValuedExpression )
        // InternalKExpressions.g:1697:3: ruleValuedExpression
        {
        pushFollow(FollowSets000.FOLLOW_2);
        ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred4_InternalKExpressions

    // $ANTLR start synpred12_InternalKExpressions
    public final void synpred12_InternalKExpressions_fragment() throws RecognitionException {   
        // InternalKExpressions.g:1807:6: ( ( ( rule__AtomicValuedExpression__Group_2__0 ) ) )
        // InternalKExpressions.g:1807:6: ( ( rule__AtomicValuedExpression__Group_2__0 ) )
        {
        // InternalKExpressions.g:1807:6: ( ( rule__AtomicValuedExpression__Group_2__0 ) )
        // InternalKExpressions.g:1808:1: ( rule__AtomicValuedExpression__Group_2__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_2()); 
        }
        // InternalKExpressions.g:1809:1: ( rule__AtomicValuedExpression__Group_2__0 )
        // InternalKExpressions.g:1809:2: rule__AtomicValuedExpression__Group_2__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__AtomicValuedExpression__Group_2__0();

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
    public final boolean synpred3_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalKExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalKExpressions_fragment(); // can never throw exception
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


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\5\11\0\2\uffff";
    static final String dfa_3s = "\1\55\11\0\2\uffff";
    static final String dfa_4s = "\12\uffff\1\1\1\2";
    static final String dfa_5s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff}>";
    static final String[] dfa_6s = {
            "\1\5\1\10\1\2\1\3\1\11\7\uffff\1\6\2\uffff\1\12\1\uffff\1\1\3\uffff\1\7\22\uffff\1\4",
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

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1646:1: rule__Expression__Alternatives : ( ( ( ruleBooleanExpression ) ) | ( ruleValuedExpression ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_1 = input.LA(1);

                         
                        int index2_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalKExpressions()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index2_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_2 = input.LA(1);

                         
                        int index2_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalKExpressions()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index2_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_3 = input.LA(1);

                         
                        int index2_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalKExpressions()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index2_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA2_4 = input.LA(1);

                         
                        int index2_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalKExpressions()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index2_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA2_5 = input.LA(1);

                         
                        int index2_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalKExpressions()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index2_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA2_6 = input.LA(1);

                         
                        int index2_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalKExpressions()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index2_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA2_7 = input.LA(1);

                         
                        int index2_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalKExpressions()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index2_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA2_8 = input.LA(1);

                         
                        int index2_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalKExpressions()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index2_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA2_9 = input.LA(1);

                         
                        int index2_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalKExpressions()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index2_9);
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
    static final String dfa_7s = "\1\5\3\uffff\7\0\1\uffff";
    static final String dfa_8s = "\1\55\3\uffff\7\0\1\uffff";
    static final String dfa_9s = "\1\uffff\1\1\11\uffff\1\2";
    static final String dfa_10s = "\4\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff}>";
    static final String[] dfa_11s = {
            "\1\5\1\10\2\1\1\11\7\uffff\1\6\2\uffff\1\12\1\uffff\1\1\3\uffff\1\7\22\uffff\1\4",
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
    static final char[] dfa_7 = DFA.unpackEncodedStringToUnsignedChars(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[][] dfa_11 = unpackEncodedStringArray(dfa_11s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_7;
            this.max = dfa_8;
            this.accept = dfa_9;
            this.special = dfa_10;
            this.transition = dfa_11;
        }
        public String getDescription() {
            return "1668:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_4 = input.LA(1);

                         
                        int index3_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index3_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_5 = input.LA(1);

                         
                        int index3_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index3_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA3_6 = input.LA(1);

                         
                        int index3_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index3_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA3_7 = input.LA(1);

                         
                        int index3_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index3_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA3_8 = input.LA(1);

                         
                        int index3_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index3_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA3_9 = input.LA(1);

                         
                        int index3_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index3_9);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA3_10 = input.LA(1);

                         
                        int index3_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index3_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 3, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_12s = "\13\uffff";
    static final String dfa_13s = "\1\5\3\uffff\6\0\1\uffff";
    static final String dfa_14s = "\1\55\3\uffff\6\0\1\uffff";
    static final String dfa_15s = "\1\uffff\1\1\10\uffff\1\2";
    static final String dfa_16s = "\4\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\uffff}>";
    static final String[] dfa_17s = {
            "\1\5\1\10\2\1\1\11\7\uffff\1\6\2\uffff\1\12\1\uffff\1\1\3\uffff\1\7\22\uffff\1\4",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final char[] dfa_13 = DFA.unpackEncodedStringToUnsignedChars(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[][] dfa_17 = unpackEncodedStringArray(dfa_17s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_12;
            this.eof = dfa_12;
            this.min = dfa_13;
            this.max = dfa_14;
            this.accept = dfa_15;
            this.special = dfa_16;
            this.transition = dfa_17;
        }
        public String getDescription() {
            return "1690:1: rule__NotOrValuedExpression__Alternatives : ( ( ( ruleValuedExpression ) ) | ( ruleNotExpression ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_4 = input.LA(1);

                         
                        int index4_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index4_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_5 = input.LA(1);

                         
                        int index4_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index4_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA4_6 = input.LA(1);

                         
                        int index4_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index4_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA4_7 = input.LA(1);

                         
                        int index4_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index4_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA4_8 = input.LA(1);

                         
                        int index4_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index4_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA4_9 = input.LA(1);

                         
                        int index4_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index4_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_18s = "\12\uffff";
    static final String dfa_19s = "\1\5\2\uffff\1\0\6\uffff";
    static final String dfa_20s = "\1\55\2\uffff\1\0\6\uffff";
    static final String dfa_21s = "\1\uffff\1\1\1\2\1\uffff\1\4\4\uffff\1\3";
    static final String dfa_22s = "\3\uffff\1\0\6\uffff}>";
    static final String[] dfa_23s = {
            "\2\4\1\1\1\2\1\4\7\uffff\1\4\10\uffff\1\4\22\uffff\1\3",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final char[] dfa_19 = DFA.unpackEncodedStringToUnsignedChars(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[][] dfa_23 = unpackEncodedStringArray(dfa_23s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_18;
            this.eof = dfa_18;
            this.min = dfa_19;
            this.max = dfa_20;
            this.accept = dfa_21;
            this.special = dfa_22;
            this.transition = dfa_23;
        }
        public String getDescription() {
            return "1790:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ( rule__AtomicValuedExpression__Group_2__0 ) ) | ( ruleAtomicExpression ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_3 = input.LA(1);

                         
                        int index8_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalKExpressions()) ) {s = 9;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index8_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00002000045203E0L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000003F0000000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00002000044203E0L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004020040L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0060200000000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0003000000000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0002000000000002L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x010003FC00000040L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0022000000000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000003FC00000040L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00001E0000AC0000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00000000004001F0L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0800000008400000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000008400002L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000400080L});
    }


}