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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_BOOLEAN", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_HOSTCODE", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'pre'", "'or'", "'and'", "'not'", "'+'", "'-'", "'*'", "'mod'", "'/'", "'?'", "'='", "'<'", "'<='", "'>'", "'>='", "'<>'", "'pure'", "'boolean'", "'unsigned'", "'integer'", "'float'", "'double'", "'string'", "'host'", "'none'", "'max'", "'min'", "'('", "')'", "'input'", "';'", "','", "'output'", "'inputoutput'", "'return'", "':'", "':='", "'var'", "'combine'", "'with'", "'@'", "'['", "']'", "'.'", "'#'", "'tick'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=5;
    public static final int T__19=19;
    public static final int T__59=59;
    public static final int T__16=16;
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
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int RULE_NUMBER=12;
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
    // InternalKExpressions.g:574:1: ruleValuedObjectReference : ( ( rule__ValuedObjectReference__Alternatives ) ) ;
    public final void ruleValuedObjectReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:578:2: ( ( ( rule__ValuedObjectReference__Alternatives ) ) )
            // InternalKExpressions.g:579:1: ( ( rule__ValuedObjectReference__Alternatives ) )
            {
            // InternalKExpressions.g:579:1: ( ( rule__ValuedObjectReference__Alternatives ) )
            // InternalKExpressions.g:580:1: ( rule__ValuedObjectReference__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getAlternatives()); 
            }
            // InternalKExpressions.g:581:1: ( rule__ValuedObjectReference__Alternatives )
            // InternalKExpressions.g:581:2: rule__ValuedObjectReference__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ValuedObjectReference__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuedObjectReferenceAccess().getAlternatives()); 
            }

            }


            }

        }
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
    // InternalKExpressions.g:937:1: entryRuleCommentAnnotation : ruleCommentAnnotation EOF ;
    public final void entryRuleCommentAnnotation() throws RecognitionException {
        try {
            // InternalKExpressions.g:938:1: ( ruleCommentAnnotation EOF )
            // InternalKExpressions.g:939:1: ruleCommentAnnotation EOF
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
    // InternalKExpressions.g:946:1: ruleCommentAnnotation : ( ( rule__CommentAnnotation__ValuesAssignment ) ) ;
    public final void ruleCommentAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:950:2: ( ( ( rule__CommentAnnotation__ValuesAssignment ) ) )
            // InternalKExpressions.g:951:1: ( ( rule__CommentAnnotation__ValuesAssignment ) )
            {
            // InternalKExpressions.g:951:1: ( ( rule__CommentAnnotation__ValuesAssignment ) )
            // InternalKExpressions.g:952:1: ( rule__CommentAnnotation__ValuesAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationAccess().getValuesAssignment()); 
            }
            // InternalKExpressions.g:953:1: ( rule__CommentAnnotation__ValuesAssignment )
            // InternalKExpressions.g:953:2: rule__CommentAnnotation__ValuesAssignment
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
    // InternalKExpressions.g:965:1: entryRuleTagAnnotation : ruleTagAnnotation EOF ;
    public final void entryRuleTagAnnotation() throws RecognitionException {
        try {
            // InternalKExpressions.g:966:1: ( ruleTagAnnotation EOF )
            // InternalKExpressions.g:967:1: ruleTagAnnotation EOF
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
    // InternalKExpressions.g:974:1: ruleTagAnnotation : ( ( rule__TagAnnotation__Group__0 ) ) ;
    public final void ruleTagAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:978:2: ( ( ( rule__TagAnnotation__Group__0 ) ) )
            // InternalKExpressions.g:979:1: ( ( rule__TagAnnotation__Group__0 ) )
            {
            // InternalKExpressions.g:979:1: ( ( rule__TagAnnotation__Group__0 ) )
            // InternalKExpressions.g:980:1: ( rule__TagAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getGroup()); 
            }
            // InternalKExpressions.g:981:1: ( rule__TagAnnotation__Group__0 )
            // InternalKExpressions.g:981:2: rule__TagAnnotation__Group__0
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
    // InternalKExpressions.g:993:1: entryRuleKeyStringValueAnnotation : ruleKeyStringValueAnnotation EOF ;
    public final void entryRuleKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKExpressions.g:994:1: ( ruleKeyStringValueAnnotation EOF )
            // InternalKExpressions.g:995:1: ruleKeyStringValueAnnotation EOF
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
    // InternalKExpressions.g:1002:1: ruleKeyStringValueAnnotation : ( ( rule__KeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1006:2: ( ( ( rule__KeyStringValueAnnotation__Group__0 ) ) )
            // InternalKExpressions.g:1007:1: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKExpressions.g:1007:1: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            // InternalKExpressions.g:1008:1: ( rule__KeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKExpressions.g:1009:1: ( rule__KeyStringValueAnnotation__Group__0 )
            // InternalKExpressions.g:1009:2: rule__KeyStringValueAnnotation__Group__0
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
    // InternalKExpressions.g:1021:1: entryRuleTypedKeyStringValueAnnotation : ruleTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKExpressions.g:1022:1: ( ruleTypedKeyStringValueAnnotation EOF )
            // InternalKExpressions.g:1023:1: ruleTypedKeyStringValueAnnotation EOF
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
    // InternalKExpressions.g:1030:1: ruleTypedKeyStringValueAnnotation : ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1034:2: ( ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKExpressions.g:1035:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKExpressions.g:1035:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            // InternalKExpressions.g:1036:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKExpressions.g:1037:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            // InternalKExpressions.g:1037:2: rule__TypedKeyStringValueAnnotation__Group__0
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
    // InternalKExpressions.g:1049:1: entryRuleQuotedKeyStringValueAnnotation : ruleQuotedKeyStringValueAnnotation EOF ;
    public final void entryRuleQuotedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKExpressions.g:1050:1: ( ruleQuotedKeyStringValueAnnotation EOF )
            // InternalKExpressions.g:1051:1: ruleQuotedKeyStringValueAnnotation EOF
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
    // InternalKExpressions.g:1058:1: ruleQuotedKeyStringValueAnnotation : ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleQuotedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1062:2: ( ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKExpressions.g:1063:1: ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKExpressions.g:1063:1: ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) )
            // InternalKExpressions.g:1064:1: ( rule__QuotedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKExpressions.g:1065:1: ( rule__QuotedKeyStringValueAnnotation__Group__0 )
            // InternalKExpressions.g:1065:2: rule__QuotedKeyStringValueAnnotation__Group__0
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
    // InternalKExpressions.g:1077:1: entryRuleQuotedTypedKeyStringValueAnnotation : ruleQuotedTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKExpressions.g:1078:1: ( ruleQuotedTypedKeyStringValueAnnotation EOF )
            // InternalKExpressions.g:1079:1: ruleQuotedTypedKeyStringValueAnnotation EOF
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
    // InternalKExpressions.g:1086:1: ruleQuotedTypedKeyStringValueAnnotation : ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1090:2: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKExpressions.g:1091:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKExpressions.g:1091:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) )
            // InternalKExpressions.g:1092:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKExpressions.g:1093:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 )
            // InternalKExpressions.g:1093:2: rule__QuotedTypedKeyStringValueAnnotation__Group__0
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
    // InternalKExpressions.g:1105:1: entryRuleKeyBooleanValueAnnotation : ruleKeyBooleanValueAnnotation EOF ;
    public final void entryRuleKeyBooleanValueAnnotation() throws RecognitionException {
        try {
            // InternalKExpressions.g:1106:1: ( ruleKeyBooleanValueAnnotation EOF )
            // InternalKExpressions.g:1107:1: ruleKeyBooleanValueAnnotation EOF
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
    // InternalKExpressions.g:1114:1: ruleKeyBooleanValueAnnotation : ( ( rule__KeyBooleanValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyBooleanValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1118:2: ( ( ( rule__KeyBooleanValueAnnotation__Group__0 ) ) )
            // InternalKExpressions.g:1119:1: ( ( rule__KeyBooleanValueAnnotation__Group__0 ) )
            {
            // InternalKExpressions.g:1119:1: ( ( rule__KeyBooleanValueAnnotation__Group__0 ) )
            // InternalKExpressions.g:1120:1: ( rule__KeyBooleanValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getGroup()); 
            }
            // InternalKExpressions.g:1121:1: ( rule__KeyBooleanValueAnnotation__Group__0 )
            // InternalKExpressions.g:1121:2: rule__KeyBooleanValueAnnotation__Group__0
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
    // InternalKExpressions.g:1133:1: entryRuleKeyIntValueAnnotation : ruleKeyIntValueAnnotation EOF ;
    public final void entryRuleKeyIntValueAnnotation() throws RecognitionException {
        try {
            // InternalKExpressions.g:1134:1: ( ruleKeyIntValueAnnotation EOF )
            // InternalKExpressions.g:1135:1: ruleKeyIntValueAnnotation EOF
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
    // InternalKExpressions.g:1142:1: ruleKeyIntValueAnnotation : ( ( rule__KeyIntValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyIntValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1146:2: ( ( ( rule__KeyIntValueAnnotation__Group__0 ) ) )
            // InternalKExpressions.g:1147:1: ( ( rule__KeyIntValueAnnotation__Group__0 ) )
            {
            // InternalKExpressions.g:1147:1: ( ( rule__KeyIntValueAnnotation__Group__0 ) )
            // InternalKExpressions.g:1148:1: ( rule__KeyIntValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getGroup()); 
            }
            // InternalKExpressions.g:1149:1: ( rule__KeyIntValueAnnotation__Group__0 )
            // InternalKExpressions.g:1149:2: rule__KeyIntValueAnnotation__Group__0
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
    // InternalKExpressions.g:1161:1: entryRuleKeyFloatValueAnnotation : ruleKeyFloatValueAnnotation EOF ;
    public final void entryRuleKeyFloatValueAnnotation() throws RecognitionException {
        try {
            // InternalKExpressions.g:1162:1: ( ruleKeyFloatValueAnnotation EOF )
            // InternalKExpressions.g:1163:1: ruleKeyFloatValueAnnotation EOF
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
    // InternalKExpressions.g:1170:1: ruleKeyFloatValueAnnotation : ( ( rule__KeyFloatValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyFloatValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1174:2: ( ( ( rule__KeyFloatValueAnnotation__Group__0 ) ) )
            // InternalKExpressions.g:1175:1: ( ( rule__KeyFloatValueAnnotation__Group__0 ) )
            {
            // InternalKExpressions.g:1175:1: ( ( rule__KeyFloatValueAnnotation__Group__0 ) )
            // InternalKExpressions.g:1176:1: ( rule__KeyFloatValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getGroup()); 
            }
            // InternalKExpressions.g:1177:1: ( rule__KeyFloatValueAnnotation__Group__0 )
            // InternalKExpressions.g:1177:2: rule__KeyFloatValueAnnotation__Group__0
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
    // InternalKExpressions.g:1189:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalKExpressions.g:1190:1: ( ruleEString EOF )
            // InternalKExpressions.g:1191:1: ruleEString EOF
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
    // InternalKExpressions.g:1198:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1202:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalKExpressions.g:1203:1: ( ( rule__EString__Alternatives ) )
            {
            // InternalKExpressions.g:1203:1: ( ( rule__EString__Alternatives ) )
            // InternalKExpressions.g:1204:1: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // InternalKExpressions.g:1205:1: ( rule__EString__Alternatives )
            // InternalKExpressions.g:1205:2: rule__EString__Alternatives
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
    // InternalKExpressions.g:1217:1: entryRuleEStringBoolean : ruleEStringBoolean EOF ;
    public final void entryRuleEStringBoolean() throws RecognitionException {
        try {
            // InternalKExpressions.g:1218:1: ( ruleEStringBoolean EOF )
            // InternalKExpressions.g:1219:1: ruleEStringBoolean EOF
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
    // InternalKExpressions.g:1226:1: ruleEStringBoolean : ( ( rule__EStringBoolean__Alternatives ) ) ;
    public final void ruleEStringBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1230:2: ( ( ( rule__EStringBoolean__Alternatives ) ) )
            // InternalKExpressions.g:1231:1: ( ( rule__EStringBoolean__Alternatives ) )
            {
            // InternalKExpressions.g:1231:1: ( ( rule__EStringBoolean__Alternatives ) )
            // InternalKExpressions.g:1232:1: ( rule__EStringBoolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringBooleanAccess().getAlternatives()); 
            }
            // InternalKExpressions.g:1233:1: ( rule__EStringBoolean__Alternatives )
            // InternalKExpressions.g:1233:2: rule__EStringBoolean__Alternatives
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
    // InternalKExpressions.g:1245:1: entryRuleExtendedID : ruleExtendedID EOF ;
    public final void entryRuleExtendedID() throws RecognitionException {
        try {
            // InternalKExpressions.g:1246:1: ( ruleExtendedID EOF )
            // InternalKExpressions.g:1247:1: ruleExtendedID EOF
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
    // InternalKExpressions.g:1254:1: ruleExtendedID : ( ( rule__ExtendedID__Group__0 ) ) ;
    public final void ruleExtendedID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1258:2: ( ( ( rule__ExtendedID__Group__0 ) ) )
            // InternalKExpressions.g:1259:1: ( ( rule__ExtendedID__Group__0 ) )
            {
            // InternalKExpressions.g:1259:1: ( ( rule__ExtendedID__Group__0 ) )
            // InternalKExpressions.g:1260:1: ( rule__ExtendedID__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup()); 
            }
            // InternalKExpressions.g:1261:1: ( rule__ExtendedID__Group__0 )
            // InternalKExpressions.g:1261:2: rule__ExtendedID__Group__0
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
    // InternalKExpressions.g:1273:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // InternalKExpressions.g:1274:1: ( ruleInteger EOF )
            // InternalKExpressions.g:1275:1: ruleInteger EOF
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
    // InternalKExpressions.g:1282:1: ruleInteger : ( ( rule__Integer__Group__0 ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1286:2: ( ( ( rule__Integer__Group__0 ) ) )
            // InternalKExpressions.g:1287:1: ( ( rule__Integer__Group__0 ) )
            {
            // InternalKExpressions.g:1287:1: ( ( rule__Integer__Group__0 ) )
            // InternalKExpressions.g:1288:1: ( rule__Integer__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getGroup()); 
            }
            // InternalKExpressions.g:1289:1: ( rule__Integer__Group__0 )
            // InternalKExpressions.g:1289:2: rule__Integer__Group__0
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
    // InternalKExpressions.g:1301:1: entryRuleFloateger : ruleFloateger EOF ;
    public final void entryRuleFloateger() throws RecognitionException {
        try {
            // InternalKExpressions.g:1302:1: ( ruleFloateger EOF )
            // InternalKExpressions.g:1303:1: ruleFloateger EOF
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
    // InternalKExpressions.g:1310:1: ruleFloateger : ( ( rule__Floateger__Group__0 ) ) ;
    public final void ruleFloateger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1314:2: ( ( ( rule__Floateger__Group__0 ) ) )
            // InternalKExpressions.g:1315:1: ( ( rule__Floateger__Group__0 ) )
            {
            // InternalKExpressions.g:1315:1: ( ( rule__Floateger__Group__0 ) )
            // InternalKExpressions.g:1316:1: ( rule__Floateger__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloategerAccess().getGroup()); 
            }
            // InternalKExpressions.g:1317:1: ( rule__Floateger__Group__0 )
            // InternalKExpressions.g:1317:2: rule__Floateger__Group__0
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
    // InternalKExpressions.g:1330:1: ruleCompareOperator : ( ( rule__CompareOperator__Alternatives ) ) ;
    public final void ruleCompareOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1334:1: ( ( ( rule__CompareOperator__Alternatives ) ) )
            // InternalKExpressions.g:1335:1: ( ( rule__CompareOperator__Alternatives ) )
            {
            // InternalKExpressions.g:1335:1: ( ( rule__CompareOperator__Alternatives ) )
            // InternalKExpressions.g:1336:1: ( rule__CompareOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            }
            // InternalKExpressions.g:1337:1: ( rule__CompareOperator__Alternatives )
            // InternalKExpressions.g:1337:2: rule__CompareOperator__Alternatives
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
    // InternalKExpressions.g:1349:1: rulePreOperator : ( ( 'pre' ) ) ;
    public final void rulePreOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1353:1: ( ( ( 'pre' ) ) )
            // InternalKExpressions.g:1354:1: ( ( 'pre' ) )
            {
            // InternalKExpressions.g:1354:1: ( ( 'pre' ) )
            // InternalKExpressions.g:1355:1: ( 'pre' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreOperatorAccess().getPREEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1356:1: ( 'pre' )
            // InternalKExpressions.g:1356:3: 'pre'
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


    // $ANTLR start "ruleOrOperator"
    // InternalKExpressions.g:1369:1: ruleOrOperator : ( ( 'or' ) ) ;
    public final void ruleOrOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1373:1: ( ( ( 'or' ) ) )
            // InternalKExpressions.g:1374:1: ( ( 'or' ) )
            {
            // InternalKExpressions.g:1374:1: ( ( 'or' ) )
            // InternalKExpressions.g:1375:1: ( 'or' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrOperatorAccess().getOREnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1376:1: ( 'or' )
            // InternalKExpressions.g:1376:3: 'or'
            {
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalKExpressions.g:1389:1: ruleAndOperator : ( ( 'and' ) ) ;
    public final void ruleAndOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1393:1: ( ( ( 'and' ) ) )
            // InternalKExpressions.g:1394:1: ( ( 'and' ) )
            {
            // InternalKExpressions.g:1394:1: ( ( 'and' ) )
            // InternalKExpressions.g:1395:1: ( 'and' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndOperatorAccess().getANDEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1396:1: ( 'and' )
            // InternalKExpressions.g:1396:3: 'and'
            {
            match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalKExpressions.g:1409:1: ruleNotOperator : ( ( 'not' ) ) ;
    public final void ruleNotOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1413:1: ( ( ( 'not' ) ) )
            // InternalKExpressions.g:1414:1: ( ( 'not' ) )
            {
            // InternalKExpressions.g:1414:1: ( ( 'not' ) )
            // InternalKExpressions.g:1415:1: ( 'not' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1416:1: ( 'not' )
            // InternalKExpressions.g:1416:3: 'not'
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
    // InternalKExpressions.g:1429:1: ruleAddOperator : ( ( '+' ) ) ;
    public final void ruleAddOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1433:1: ( ( ( '+' ) ) )
            // InternalKExpressions.g:1434:1: ( ( '+' ) )
            {
            // InternalKExpressions.g:1434:1: ( ( '+' ) )
            // InternalKExpressions.g:1435:1: ( '+' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddOperatorAccess().getADDEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1436:1: ( '+' )
            // InternalKExpressions.g:1436:3: '+'
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
    // InternalKExpressions.g:1449:1: ruleSubOperator : ( ( '-' ) ) ;
    public final void ruleSubOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1453:1: ( ( ( '-' ) ) )
            // InternalKExpressions.g:1454:1: ( ( '-' ) )
            {
            // InternalKExpressions.g:1454:1: ( ( '-' ) )
            // InternalKExpressions.g:1455:1: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubOperatorAccess().getSUBEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1456:1: ( '-' )
            // InternalKExpressions.g:1456:3: '-'
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
    // InternalKExpressions.g:1469:1: ruleMultOperator : ( ( '*' ) ) ;
    public final void ruleMultOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1473:1: ( ( ( '*' ) ) )
            // InternalKExpressions.g:1474:1: ( ( '*' ) )
            {
            // InternalKExpressions.g:1474:1: ( ( '*' ) )
            // InternalKExpressions.g:1475:1: ( '*' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1476:1: ( '*' )
            // InternalKExpressions.g:1476:3: '*'
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
    // InternalKExpressions.g:1489:1: ruleModOperator : ( ( 'mod' ) ) ;
    public final void ruleModOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1493:1: ( ( ( 'mod' ) ) )
            // InternalKExpressions.g:1494:1: ( ( 'mod' ) )
            {
            // InternalKExpressions.g:1494:1: ( ( 'mod' ) )
            // InternalKExpressions.g:1495:1: ( 'mod' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModOperatorAccess().getMODEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1496:1: ( 'mod' )
            // InternalKExpressions.g:1496:3: 'mod'
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
    // InternalKExpressions.g:1509:1: ruleDivOperator : ( ( '/' ) ) ;
    public final void ruleDivOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1513:1: ( ( ( '/' ) ) )
            // InternalKExpressions.g:1514:1: ( ( '/' ) )
            {
            // InternalKExpressions.g:1514:1: ( ( '/' ) )
            // InternalKExpressions.g:1515:1: ( '/' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivOperatorAccess().getDIVEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1516:1: ( '/' )
            // InternalKExpressions.g:1516:3: '/'
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


    // $ANTLR start "ruleValueTestOperator"
    // InternalKExpressions.g:1529:1: ruleValueTestOperator : ( ( '?' ) ) ;
    public final void ruleValueTestOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1533:1: ( ( ( '?' ) ) )
            // InternalKExpressions.g:1534:1: ( ( '?' ) )
            {
            // InternalKExpressions.g:1534:1: ( ( '?' ) )
            // InternalKExpressions.g:1535:1: ( '?' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueTestOperatorAccess().getVALEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1536:1: ( '?' )
            // InternalKExpressions.g:1536:3: '?'
            {
            match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalKExpressions.g:1549:1: ruleValueType : ( ( rule__ValueType__Alternatives ) ) ;
    public final void ruleValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1553:1: ( ( ( rule__ValueType__Alternatives ) ) )
            // InternalKExpressions.g:1554:1: ( ( rule__ValueType__Alternatives ) )
            {
            // InternalKExpressions.g:1554:1: ( ( rule__ValueType__Alternatives ) )
            // InternalKExpressions.g:1555:1: ( rule__ValueType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueTypeAccess().getAlternatives()); 
            }
            // InternalKExpressions.g:1556:1: ( rule__ValueType__Alternatives )
            // InternalKExpressions.g:1556:2: rule__ValueType__Alternatives
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
    // InternalKExpressions.g:1568:1: ruleCombineOperator : ( ( rule__CombineOperator__Alternatives ) ) ;
    public final void ruleCombineOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1572:1: ( ( ( rule__CombineOperator__Alternatives ) ) )
            // InternalKExpressions.g:1573:1: ( ( rule__CombineOperator__Alternatives ) )
            {
            // InternalKExpressions.g:1573:1: ( ( rule__CombineOperator__Alternatives ) )
            // InternalKExpressions.g:1574:1: ( rule__CombineOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCombineOperatorAccess().getAlternatives()); 
            }
            // InternalKExpressions.g:1575:1: ( rule__CombineOperator__Alternatives )
            // InternalKExpressions.g:1575:2: rule__CombineOperator__Alternatives
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
    // InternalKExpressions.g:1586:1: rule__Root__Alternatives : ( ( ruleExpression ) | ( ruleInterfaceDeclaration ) );
    public final void rule__Root__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1590:1: ( ( ruleExpression ) | ( ruleInterfaceDeclaration ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=RULE_BOOLEAN && LA1_0<=RULE_HOSTCODE)||LA1_0==16||LA1_0==19||LA1_0==21||LA1_0==25||LA1_0==43||LA1_0==61) ) {
                alt1=1;
            }
            else if ( (LA1_0==45||(LA1_0>=48 && LA1_0<=50)||LA1_0==53) ) {
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
                    // InternalKExpressions.g:1591:1: ( ruleExpression )
                    {
                    // InternalKExpressions.g:1591:1: ( ruleExpression )
                    // InternalKExpressions.g:1592:1: ruleExpression
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
                    // InternalKExpressions.g:1597:6: ( ruleInterfaceDeclaration )
                    {
                    // InternalKExpressions.g:1597:6: ( ruleInterfaceDeclaration )
                    // InternalKExpressions.g:1598:1: ruleInterfaceDeclaration
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
    // InternalKExpressions.g:1608:1: rule__Expression__Alternatives : ( ( ( ruleBooleanExpression ) ) | ( ruleValuedExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1612:1: ( ( ( ruleBooleanExpression ) ) | ( ruleValuedExpression ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalKExpressions.g:1613:1: ( ( ruleBooleanExpression ) )
                    {
                    // InternalKExpressions.g:1613:1: ( ( ruleBooleanExpression ) )
                    // InternalKExpressions.g:1614:1: ( ruleBooleanExpression )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall_0()); 
                    }
                    // InternalKExpressions.g:1615:1: ( ruleBooleanExpression )
                    // InternalKExpressions.g:1615:3: ruleBooleanExpression
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
                    // InternalKExpressions.g:1619:6: ( ruleValuedExpression )
                    {
                    // InternalKExpressions.g:1619:6: ( ruleValuedExpression )
                    // InternalKExpressions.g:1620:1: ruleValuedExpression
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
    // InternalKExpressions.g:1630:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );
    public final void rule__CompareOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1634:1: ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalKExpressions.g:1635:1: ( ( rule__CompareOperation__Group_0__0 ) )
                    {
                    // InternalKExpressions.g:1635:1: ( ( rule__CompareOperation__Group_0__0 ) )
                    // InternalKExpressions.g:1636:1: ( rule__CompareOperation__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperationAccess().getGroup_0()); 
                    }
                    // InternalKExpressions.g:1637:1: ( rule__CompareOperation__Group_0__0 )
                    // InternalKExpressions.g:1637:2: rule__CompareOperation__Group_0__0
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
                    // InternalKExpressions.g:1641:6: ( ruleNotExpression )
                    {
                    // InternalKExpressions.g:1641:6: ( ruleNotExpression )
                    // InternalKExpressions.g:1642:1: ruleNotExpression
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
    // InternalKExpressions.g:1652:1: rule__NotOrValuedExpression__Alternatives : ( ( ( ruleValuedExpression ) ) | ( ruleNotExpression ) );
    public final void rule__NotOrValuedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1656:1: ( ( ( ruleValuedExpression ) ) | ( ruleNotExpression ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalKExpressions.g:1657:1: ( ( ruleValuedExpression ) )
                    {
                    // InternalKExpressions.g:1657:1: ( ( ruleValuedExpression ) )
                    // InternalKExpressions.g:1658:1: ( ruleValuedExpression )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
                    }
                    // InternalKExpressions.g:1659:1: ( ruleValuedExpression )
                    // InternalKExpressions.g:1659:3: ruleValuedExpression
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
                    // InternalKExpressions.g:1663:6: ( ruleNotExpression )
                    {
                    // InternalKExpressions.g:1663:6: ( ruleNotExpression )
                    // InternalKExpressions.g:1664:1: ruleNotExpression
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
    // InternalKExpressions.g:1674:1: rule__NotExpression__Alternatives : ( ( ( rule__NotExpression__Group_0__0 ) ) | ( ruleAtomicExpression ) );
    public final void rule__NotExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1678:1: ( ( ( rule__NotExpression__Group_0__0 ) ) | ( ruleAtomicExpression ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=RULE_BOOLEAN && LA5_0<=RULE_ID)||LA5_0==RULE_HOSTCODE||LA5_0==16||LA5_0==25||LA5_0==43||LA5_0==61) ) {
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
                    // InternalKExpressions.g:1679:1: ( ( rule__NotExpression__Group_0__0 ) )
                    {
                    // InternalKExpressions.g:1679:1: ( ( rule__NotExpression__Group_0__0 ) )
                    // InternalKExpressions.g:1680:1: ( rule__NotExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNotExpressionAccess().getGroup_0()); 
                    }
                    // InternalKExpressions.g:1681:1: ( rule__NotExpression__Group_0__0 )
                    // InternalKExpressions.g:1681:2: rule__NotExpression__Group_0__0
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
                    // InternalKExpressions.g:1685:6: ( ruleAtomicExpression )
                    {
                    // InternalKExpressions.g:1685:6: ( ruleAtomicExpression )
                    // InternalKExpressions.g:1686:1: ruleAtomicExpression
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
    // InternalKExpressions.g:1696:1: rule__NegExpression__Alternatives : ( ( ( rule__NegExpression__Group_0__0 ) ) | ( ruleAtomicValuedExpression ) );
    public final void rule__NegExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1700:1: ( ( ( rule__NegExpression__Group_0__0 ) ) | ( ruleAtomicValuedExpression ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_BOOLEAN && LA6_0<=RULE_HOSTCODE)||LA6_0==16||LA6_0==25||LA6_0==43||LA6_0==61) ) {
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
                    // InternalKExpressions.g:1701:1: ( ( rule__NegExpression__Group_0__0 ) )
                    {
                    // InternalKExpressions.g:1701:1: ( ( rule__NegExpression__Group_0__0 ) )
                    // InternalKExpressions.g:1702:1: ( rule__NegExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNegExpressionAccess().getGroup_0()); 
                    }
                    // InternalKExpressions.g:1703:1: ( rule__NegExpression__Group_0__0 )
                    // InternalKExpressions.g:1703:2: rule__NegExpression__Group_0__0
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
                    // InternalKExpressions.g:1707:6: ( ruleAtomicValuedExpression )
                    {
                    // InternalKExpressions.g:1707:6: ( ruleAtomicValuedExpression )
                    // InternalKExpressions.g:1708:1: ruleAtomicValuedExpression
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
    // InternalKExpressions.g:1718:1: rule__AtomicExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleValuedObjectTestExpression ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ruleTextExpression ) );
    public final void rule__AtomicExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1722:1: ( ( ruleBooleanValue ) | ( ruleValuedObjectTestExpression ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ruleTextExpression ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt7=1;
                }
                break;
            case RULE_ID:
            case 16:
            case 25:
            case 61:
                {
                alt7=2;
                }
                break;
            case 43:
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
                    // InternalKExpressions.g:1723:1: ( ruleBooleanValue )
                    {
                    // InternalKExpressions.g:1723:1: ( ruleBooleanValue )
                    // InternalKExpressions.g:1724:1: ruleBooleanValue
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
                    // InternalKExpressions.g:1729:6: ( ruleValuedObjectTestExpression )
                    {
                    // InternalKExpressions.g:1729:6: ( ruleValuedObjectTestExpression )
                    // InternalKExpressions.g:1730:1: ruleValuedObjectTestExpression
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
                    // InternalKExpressions.g:1735:6: ( ( rule__AtomicExpression__Group_2__0 ) )
                    {
                    // InternalKExpressions.g:1735:6: ( ( rule__AtomicExpression__Group_2__0 ) )
                    // InternalKExpressions.g:1736:1: ( rule__AtomicExpression__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getGroup_2()); 
                    }
                    // InternalKExpressions.g:1737:1: ( rule__AtomicExpression__Group_2__0 )
                    // InternalKExpressions.g:1737:2: rule__AtomicExpression__Group_2__0
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
                    // InternalKExpressions.g:1741:6: ( ruleTextExpression )
                    {
                    // InternalKExpressions.g:1741:6: ( ruleTextExpression )
                    // InternalKExpressions.g:1742:1: ruleTextExpression
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
    // InternalKExpressions.g:1752:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ( rule__AtomicValuedExpression__Group_2__0 ) ) | ( ruleAtomicExpression ) );
    public final void rule__AtomicValuedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1756:1: ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ( rule__AtomicValuedExpression__Group_2__0 ) ) | ( ruleAtomicExpression ) )
            int alt8=4;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalKExpressions.g:1757:1: ( ruleIntValue )
                    {
                    // InternalKExpressions.g:1757:1: ( ruleIntValue )
                    // InternalKExpressions.g:1758:1: ruleIntValue
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
                    // InternalKExpressions.g:1763:6: ( ruleFloatValue )
                    {
                    // InternalKExpressions.g:1763:6: ( ruleFloatValue )
                    // InternalKExpressions.g:1764:1: ruleFloatValue
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
                    // InternalKExpressions.g:1769:6: ( ( rule__AtomicValuedExpression__Group_2__0 ) )
                    {
                    // InternalKExpressions.g:1769:6: ( ( rule__AtomicValuedExpression__Group_2__0 ) )
                    // InternalKExpressions.g:1770:1: ( rule__AtomicValuedExpression__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_2()); 
                    }
                    // InternalKExpressions.g:1771:1: ( rule__AtomicValuedExpression__Group_2__0 )
                    // InternalKExpressions.g:1771:2: rule__AtomicValuedExpression__Group_2__0
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
                    // InternalKExpressions.g:1775:6: ( ruleAtomicExpression )
                    {
                    // InternalKExpressions.g:1775:6: ( ruleAtomicExpression )
                    // InternalKExpressions.g:1776:1: ruleAtomicExpression
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
    // InternalKExpressions.g:1786:1: rule__ValuedObjectTestExpression__Alternatives : ( ( ( rule__ValuedObjectTestExpression__Group_0__0 ) ) | ( ( rule__ValuedObjectTestExpression__Group_1__0 ) ) | ( ruleValuedObjectReference ) );
    public final void rule__ValuedObjectTestExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1790:1: ( ( ( rule__ValuedObjectTestExpression__Group_0__0 ) ) | ( ( rule__ValuedObjectTestExpression__Group_1__0 ) ) | ( ruleValuedObjectReference ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt9=1;
                }
                break;
            case 25:
                {
                alt9=2;
                }
                break;
            case RULE_ID:
            case 61:
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
                    // InternalKExpressions.g:1791:1: ( ( rule__ValuedObjectTestExpression__Group_0__0 ) )
                    {
                    // InternalKExpressions.g:1791:1: ( ( rule__ValuedObjectTestExpression__Group_0__0 ) )
                    // InternalKExpressions.g:1792:1: ( rule__ValuedObjectTestExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getGroup_0()); 
                    }
                    // InternalKExpressions.g:1793:1: ( rule__ValuedObjectTestExpression__Group_0__0 )
                    // InternalKExpressions.g:1793:2: rule__ValuedObjectTestExpression__Group_0__0
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
                    // InternalKExpressions.g:1797:6: ( ( rule__ValuedObjectTestExpression__Group_1__0 ) )
                    {
                    // InternalKExpressions.g:1797:6: ( ( rule__ValuedObjectTestExpression__Group_1__0 ) )
                    // InternalKExpressions.g:1798:1: ( rule__ValuedObjectTestExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getGroup_1()); 
                    }
                    // InternalKExpressions.g:1799:1: ( rule__ValuedObjectTestExpression__Group_1__0 )
                    // InternalKExpressions.g:1799:2: rule__ValuedObjectTestExpression__Group_1__0
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
                    // InternalKExpressions.g:1803:6: ( ruleValuedObjectReference )
                    {
                    // InternalKExpressions.g:1803:6: ( ruleValuedObjectReference )
                    // InternalKExpressions.g:1804:1: ruleValuedObjectReference
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


    // $ANTLR start "rule__ValuedObjectReference__Alternatives"
    // InternalKExpressions.g:1814:1: rule__ValuedObjectReference__Alternatives : ( ( ( rule__ValuedObjectReference__ValuedObjectAssignment_0 ) ) | ( ( rule__ValuedObjectReference__TickAssignment_1 ) ) );
    public final void rule__ValuedObjectReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1818:1: ( ( ( rule__ValuedObjectReference__ValuedObjectAssignment_0 ) ) | ( ( rule__ValuedObjectReference__TickAssignment_1 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==61) ) {
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
                    // InternalKExpressions.g:1819:1: ( ( rule__ValuedObjectReference__ValuedObjectAssignment_0 ) )
                    {
                    // InternalKExpressions.g:1819:1: ( ( rule__ValuedObjectReference__ValuedObjectAssignment_0 ) )
                    // InternalKExpressions.g:1820:1: ( rule__ValuedObjectReference__ValuedObjectAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectAssignment_0()); 
                    }
                    // InternalKExpressions.g:1821:1: ( rule__ValuedObjectReference__ValuedObjectAssignment_0 )
                    // InternalKExpressions.g:1821:2: rule__ValuedObjectReference__ValuedObjectAssignment_0
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
                    break;
                case 2 :
                    // InternalKExpressions.g:1825:6: ( ( rule__ValuedObjectReference__TickAssignment_1 ) )
                    {
                    // InternalKExpressions.g:1825:6: ( ( rule__ValuedObjectReference__TickAssignment_1 ) )
                    // InternalKExpressions.g:1826:1: ( rule__ValuedObjectReference__TickAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValuedObjectReferenceAccess().getTickAssignment_1()); 
                    }
                    // InternalKExpressions.g:1827:1: ( rule__ValuedObjectReference__TickAssignment_1 )
                    // InternalKExpressions.g:1827:2: rule__ValuedObjectReference__TickAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ValuedObjectReference__TickAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValuedObjectReferenceAccess().getTickAssignment_1()); 
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
    // $ANTLR end "rule__ValuedObjectReference__Alternatives"


    // $ANTLR start "rule__InterfaceDeclaration__Alternatives"
    // InternalKExpressions.g:1837:1: rule__InterfaceDeclaration__Alternatives : ( ( ruleInterfaceSignalDecl ) | ( ruleInterfaceVariableDecl ) );
    public final void rule__InterfaceDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1841:1: ( ( ruleInterfaceSignalDecl ) | ( ruleInterfaceVariableDecl ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==45||(LA11_0>=48 && LA11_0<=50)) ) {
                alt11=1;
            }
            else if ( (LA11_0==53) ) {
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
                    // InternalKExpressions.g:1842:1: ( ruleInterfaceSignalDecl )
                    {
                    // InternalKExpressions.g:1842:1: ( ruleInterfaceSignalDecl )
                    // InternalKExpressions.g:1843:1: ruleInterfaceSignalDecl
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
                    // InternalKExpressions.g:1848:6: ( ruleInterfaceVariableDecl )
                    {
                    // InternalKExpressions.g:1848:6: ( ruleInterfaceVariableDecl )
                    // InternalKExpressions.g:1849:1: ruleInterfaceVariableDecl
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
    // InternalKExpressions.g:1859:1: rule__InterfaceSignalDecl__Alternatives : ( ( ( rule__InterfaceSignalDecl__Group_0__0 ) ) | ( ( rule__InterfaceSignalDecl__Group_1__0 ) ) | ( ( rule__InterfaceSignalDecl__Group_2__0 ) ) | ( ( rule__InterfaceSignalDecl__Group_3__0 ) ) );
    public final void rule__InterfaceSignalDecl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1863:1: ( ( ( rule__InterfaceSignalDecl__Group_0__0 ) ) | ( ( rule__InterfaceSignalDecl__Group_1__0 ) ) | ( ( rule__InterfaceSignalDecl__Group_2__0 ) ) | ( ( rule__InterfaceSignalDecl__Group_3__0 ) ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt12=1;
                }
                break;
            case 48:
                {
                alt12=2;
                }
                break;
            case 49:
                {
                alt12=3;
                }
                break;
            case 50:
                {
                alt12=4;
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
                    // InternalKExpressions.g:1864:1: ( ( rule__InterfaceSignalDecl__Group_0__0 ) )
                    {
                    // InternalKExpressions.g:1864:1: ( ( rule__InterfaceSignalDecl__Group_0__0 ) )
                    // InternalKExpressions.g:1865:1: ( rule__InterfaceSignalDecl__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInterfaceSignalDeclAccess().getGroup_0()); 
                    }
                    // InternalKExpressions.g:1866:1: ( rule__InterfaceSignalDecl__Group_0__0 )
                    // InternalKExpressions.g:1866:2: rule__InterfaceSignalDecl__Group_0__0
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
                    // InternalKExpressions.g:1870:6: ( ( rule__InterfaceSignalDecl__Group_1__0 ) )
                    {
                    // InternalKExpressions.g:1870:6: ( ( rule__InterfaceSignalDecl__Group_1__0 ) )
                    // InternalKExpressions.g:1871:1: ( rule__InterfaceSignalDecl__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInterfaceSignalDeclAccess().getGroup_1()); 
                    }
                    // InternalKExpressions.g:1872:1: ( rule__InterfaceSignalDecl__Group_1__0 )
                    // InternalKExpressions.g:1872:2: rule__InterfaceSignalDecl__Group_1__0
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
                    // InternalKExpressions.g:1876:6: ( ( rule__InterfaceSignalDecl__Group_2__0 ) )
                    {
                    // InternalKExpressions.g:1876:6: ( ( rule__InterfaceSignalDecl__Group_2__0 ) )
                    // InternalKExpressions.g:1877:1: ( rule__InterfaceSignalDecl__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInterfaceSignalDeclAccess().getGroup_2()); 
                    }
                    // InternalKExpressions.g:1878:1: ( rule__InterfaceSignalDecl__Group_2__0 )
                    // InternalKExpressions.g:1878:2: rule__InterfaceSignalDecl__Group_2__0
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
                    // InternalKExpressions.g:1882:6: ( ( rule__InterfaceSignalDecl__Group_3__0 ) )
                    {
                    // InternalKExpressions.g:1882:6: ( ( rule__InterfaceSignalDecl__Group_3__0 ) )
                    // InternalKExpressions.g:1883:1: ( rule__InterfaceSignalDecl__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInterfaceSignalDeclAccess().getGroup_3()); 
                    }
                    // InternalKExpressions.g:1884:1: ( rule__InterfaceSignalDecl__Group_3__0 )
                    // InternalKExpressions.g:1884:2: rule__InterfaceSignalDecl__Group_3__0
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
    // InternalKExpressions.g:1893:1: rule__ChannelDescription__Alternatives : ( ( ( rule__ChannelDescription__Group_0__0 ) ) | ( ( rule__ChannelDescription__Group_1__0 ) ) | ( ( rule__ChannelDescription__Group_2__0 ) ) );
    public final void rule__ChannelDescription__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1897:1: ( ( ( rule__ChannelDescription__Group_0__0 ) ) | ( ( rule__ChannelDescription__Group_1__0 ) ) | ( ( rule__ChannelDescription__Group_2__0 ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt13=1;
                }
                break;
            case 43:
                {
                alt13=2;
                }
                break;
            case 52:
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
                    // InternalKExpressions.g:1898:1: ( ( rule__ChannelDescription__Group_0__0 ) )
                    {
                    // InternalKExpressions.g:1898:1: ( ( rule__ChannelDescription__Group_0__0 ) )
                    // InternalKExpressions.g:1899:1: ( rule__ChannelDescription__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getChannelDescriptionAccess().getGroup_0()); 
                    }
                    // InternalKExpressions.g:1900:1: ( rule__ChannelDescription__Group_0__0 )
                    // InternalKExpressions.g:1900:2: rule__ChannelDescription__Group_0__0
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
                    // InternalKExpressions.g:1904:6: ( ( rule__ChannelDescription__Group_1__0 ) )
                    {
                    // InternalKExpressions.g:1904:6: ( ( rule__ChannelDescription__Group_1__0 ) )
                    // InternalKExpressions.g:1905:1: ( rule__ChannelDescription__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getChannelDescriptionAccess().getGroup_1()); 
                    }
                    // InternalKExpressions.g:1906:1: ( rule__ChannelDescription__Group_1__0 )
                    // InternalKExpressions.g:1906:2: rule__ChannelDescription__Group_1__0
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
                    // InternalKExpressions.g:1910:6: ( ( rule__ChannelDescription__Group_2__0 ) )
                    {
                    // InternalKExpressions.g:1910:6: ( ( rule__ChannelDescription__Group_2__0 ) )
                    // InternalKExpressions.g:1911:1: ( rule__ChannelDescription__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getChannelDescriptionAccess().getGroup_2()); 
                    }
                    // InternalKExpressions.g:1912:1: ( rule__ChannelDescription__Group_2__0 )
                    // InternalKExpressions.g:1912:2: rule__ChannelDescription__Group_2__0
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
    // InternalKExpressions.g:1921:1: rule__TypeIdentifier__Alternatives : ( ( ( rule__TypeIdentifier__TypeAssignment_0 ) ) | ( ( rule__TypeIdentifier__TypeIDAssignment_1 ) ) | ( ( rule__TypeIdentifier__Group_2__0 ) ) );
    public final void rule__TypeIdentifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1925:1: ( ( ( rule__TypeIdentifier__TypeAssignment_0 ) ) | ( ( rule__TypeIdentifier__TypeIDAssignment_1 ) ) | ( ( rule__TypeIdentifier__Group_2__0 ) ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
                {
                alt14=1;
                }
                break;
            case RULE_ID:
                {
                alt14=2;
                }
                break;
            case 54:
                {
                alt14=3;
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
                    // InternalKExpressions.g:1926:1: ( ( rule__TypeIdentifier__TypeAssignment_0 ) )
                    {
                    // InternalKExpressions.g:1926:1: ( ( rule__TypeIdentifier__TypeAssignment_0 ) )
                    // InternalKExpressions.g:1927:1: ( rule__TypeIdentifier__TypeAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeIdentifierAccess().getTypeAssignment_0()); 
                    }
                    // InternalKExpressions.g:1928:1: ( rule__TypeIdentifier__TypeAssignment_0 )
                    // InternalKExpressions.g:1928:2: rule__TypeIdentifier__TypeAssignment_0
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
                    // InternalKExpressions.g:1932:6: ( ( rule__TypeIdentifier__TypeIDAssignment_1 ) )
                    {
                    // InternalKExpressions.g:1932:6: ( ( rule__TypeIdentifier__TypeIDAssignment_1 ) )
                    // InternalKExpressions.g:1933:1: ( rule__TypeIdentifier__TypeIDAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeIdentifierAccess().getTypeIDAssignment_1()); 
                    }
                    // InternalKExpressions.g:1934:1: ( rule__TypeIdentifier__TypeIDAssignment_1 )
                    // InternalKExpressions.g:1934:2: rule__TypeIdentifier__TypeIDAssignment_1
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
                    // InternalKExpressions.g:1938:6: ( ( rule__TypeIdentifier__Group_2__0 ) )
                    {
                    // InternalKExpressions.g:1938:6: ( ( rule__TypeIdentifier__Group_2__0 ) )
                    // InternalKExpressions.g:1939:1: ( rule__TypeIdentifier__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeIdentifierAccess().getGroup_2()); 
                    }
                    // InternalKExpressions.g:1940:1: ( rule__TypeIdentifier__Group_2__0 )
                    // InternalKExpressions.g:1940:2: rule__TypeIdentifier__Group_2__0
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
    // InternalKExpressions.g:1949:1: rule__TypeIdentifier__Alternatives_2_1 : ( ( ( rule__TypeIdentifier__TypeAssignment_2_1_0 ) ) | ( ( rule__TypeIdentifier__TypeIDAssignment_2_1_1 ) ) );
    public final void rule__TypeIdentifier__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1953:1: ( ( ( rule__TypeIdentifier__TypeAssignment_2_1_0 ) ) | ( ( rule__TypeIdentifier__TypeIDAssignment_2_1_1 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=32 && LA15_0<=39)) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
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
                    // InternalKExpressions.g:1954:1: ( ( rule__TypeIdentifier__TypeAssignment_2_1_0 ) )
                    {
                    // InternalKExpressions.g:1954:1: ( ( rule__TypeIdentifier__TypeAssignment_2_1_0 ) )
                    // InternalKExpressions.g:1955:1: ( rule__TypeIdentifier__TypeAssignment_2_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeIdentifierAccess().getTypeAssignment_2_1_0()); 
                    }
                    // InternalKExpressions.g:1956:1: ( rule__TypeIdentifier__TypeAssignment_2_1_0 )
                    // InternalKExpressions.g:1956:2: rule__TypeIdentifier__TypeAssignment_2_1_0
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
                    // InternalKExpressions.g:1960:6: ( ( rule__TypeIdentifier__TypeIDAssignment_2_1_1 ) )
                    {
                    // InternalKExpressions.g:1960:6: ( ( rule__TypeIdentifier__TypeIDAssignment_2_1_1 ) )
                    // InternalKExpressions.g:1961:1: ( rule__TypeIdentifier__TypeIDAssignment_2_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeIdentifierAccess().getTypeIDAssignment_2_1_1()); 
                    }
                    // InternalKExpressions.g:1962:1: ( rule__TypeIdentifier__TypeIDAssignment_2_1_1 )
                    // InternalKExpressions.g:1962:2: rule__TypeIdentifier__TypeIDAssignment_2_1_1
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


    // $ANTLR start "rule__EString__Alternatives"
    // InternalKExpressions.g:1974:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( ruleExtendedID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1978:1: ( ( RULE_STRING ) | ( ruleExtendedID ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalKExpressions.g:1979:1: ( RULE_STRING )
                    {
                    // InternalKExpressions.g:1979:1: ( RULE_STRING )
                    // InternalKExpressions.g:1980:1: RULE_STRING
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
                    // InternalKExpressions.g:1985:6: ( ruleExtendedID )
                    {
                    // InternalKExpressions.g:1985:6: ( ruleExtendedID )
                    // InternalKExpressions.g:1986:1: ruleExtendedID
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
    // InternalKExpressions.g:1996:1: rule__EStringBoolean__Alternatives : ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) );
    public final void rule__EStringBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2000:1: ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt17=1;
                }
                break;
            case RULE_ID:
                {
                alt17=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt17=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalKExpressions.g:2001:1: ( RULE_STRING )
                    {
                    // InternalKExpressions.g:2001:1: ( RULE_STRING )
                    // InternalKExpressions.g:2002:1: RULE_STRING
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
                    // InternalKExpressions.g:2007:6: ( ruleExtendedID )
                    {
                    // InternalKExpressions.g:2007:6: ( ruleExtendedID )
                    // InternalKExpressions.g:2008:1: ruleExtendedID
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
                    // InternalKExpressions.g:2013:6: ( RULE_BOOLEAN )
                    {
                    // InternalKExpressions.g:2013:6: ( RULE_BOOLEAN )
                    // InternalKExpressions.g:2014:1: RULE_BOOLEAN
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
    // InternalKExpressions.g:2024:1: rule__CompareOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2028:1: ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) )
            int alt18=6;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt18=1;
                }
                break;
            case 27:
                {
                alt18=2;
                }
                break;
            case 28:
                {
                alt18=3;
                }
                break;
            case 29:
                {
                alt18=4;
                }
                break;
            case 30:
                {
                alt18=5;
                }
                break;
            case 31:
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
                    // InternalKExpressions.g:2029:1: ( ( '=' ) )
                    {
                    // InternalKExpressions.g:2029:1: ( ( '=' ) )
                    // InternalKExpressions.g:2030:1: ( '=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // InternalKExpressions.g:2031:1: ( '=' )
                    // InternalKExpressions.g:2031:3: '='
                    {
                    match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:2036:6: ( ( '<' ) )
                    {
                    // InternalKExpressions.g:2036:6: ( ( '<' ) )
                    // InternalKExpressions.g:2037:1: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }
                    // InternalKExpressions.g:2038:1: ( '<' )
                    // InternalKExpressions.g:2038:3: '<'
                    {
                    match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKExpressions.g:2043:6: ( ( '<=' ) )
                    {
                    // InternalKExpressions.g:2043:6: ( ( '<=' ) )
                    // InternalKExpressions.g:2044:1: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }
                    // InternalKExpressions.g:2045:1: ( '<=' )
                    // InternalKExpressions.g:2045:3: '<='
                    {
                    match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKExpressions.g:2050:6: ( ( '>' ) )
                    {
                    // InternalKExpressions.g:2050:6: ( ( '>' ) )
                    // InternalKExpressions.g:2051:1: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }
                    // InternalKExpressions.g:2052:1: ( '>' )
                    // InternalKExpressions.g:2052:3: '>'
                    {
                    match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKExpressions.g:2057:6: ( ( '>=' ) )
                    {
                    // InternalKExpressions.g:2057:6: ( ( '>=' ) )
                    // InternalKExpressions.g:2058:1: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }
                    // InternalKExpressions.g:2059:1: ( '>=' )
                    // InternalKExpressions.g:2059:3: '>='
                    {
                    match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKExpressions.g:2064:6: ( ( '<>' ) )
                    {
                    // InternalKExpressions.g:2064:6: ( ( '<>' ) )
                    // InternalKExpressions.g:2065:1: ( '<>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_5()); 
                    }
                    // InternalKExpressions.g:2066:1: ( '<>' )
                    // InternalKExpressions.g:2066:3: '<>'
                    {
                    match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalKExpressions.g:2076:1: rule__ValueType__Alternatives : ( ( ( 'pure' ) ) | ( ( 'boolean' ) ) | ( ( 'unsigned' ) ) | ( ( 'integer' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'string' ) ) | ( ( 'host' ) ) );
    public final void rule__ValueType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2080:1: ( ( ( 'pure' ) ) | ( ( 'boolean' ) ) | ( ( 'unsigned' ) ) | ( ( 'integer' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'string' ) ) | ( ( 'host' ) ) )
            int alt19=8;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt19=1;
                }
                break;
            case 33:
                {
                alt19=2;
                }
                break;
            case 34:
                {
                alt19=3;
                }
                break;
            case 35:
                {
                alt19=4;
                }
                break;
            case 36:
                {
                alt19=5;
                }
                break;
            case 37:
                {
                alt19=6;
                }
                break;
            case 38:
                {
                alt19=7;
                }
                break;
            case 39:
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
                    // InternalKExpressions.g:2081:1: ( ( 'pure' ) )
                    {
                    // InternalKExpressions.g:2081:1: ( ( 'pure' ) )
                    // InternalKExpressions.g:2082:1: ( 'pure' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0()); 
                    }
                    // InternalKExpressions.g:2083:1: ( 'pure' )
                    // InternalKExpressions.g:2083:3: 'pure'
                    {
                    match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:2088:6: ( ( 'boolean' ) )
                    {
                    // InternalKExpressions.g:2088:6: ( ( 'boolean' ) )
                    // InternalKExpressions.g:2089:1: ( 'boolean' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1()); 
                    }
                    // InternalKExpressions.g:2090:1: ( 'boolean' )
                    // InternalKExpressions.g:2090:3: 'boolean'
                    {
                    match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKExpressions.g:2095:6: ( ( 'unsigned' ) )
                    {
                    // InternalKExpressions.g:2095:6: ( ( 'unsigned' ) )
                    // InternalKExpressions.g:2096:1: ( 'unsigned' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2()); 
                    }
                    // InternalKExpressions.g:2097:1: ( 'unsigned' )
                    // InternalKExpressions.g:2097:3: 'unsigned'
                    {
                    match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKExpressions.g:2102:6: ( ( 'integer' ) )
                    {
                    // InternalKExpressions.g:2102:6: ( ( 'integer' ) )
                    // InternalKExpressions.g:2103:1: ( 'integer' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3()); 
                    }
                    // InternalKExpressions.g:2104:1: ( 'integer' )
                    // InternalKExpressions.g:2104:3: 'integer'
                    {
                    match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKExpressions.g:2109:6: ( ( 'float' ) )
                    {
                    // InternalKExpressions.g:2109:6: ( ( 'float' ) )
                    // InternalKExpressions.g:2110:1: ( 'float' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4()); 
                    }
                    // InternalKExpressions.g:2111:1: ( 'float' )
                    // InternalKExpressions.g:2111:3: 'float'
                    {
                    match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKExpressions.g:2116:6: ( ( 'double' ) )
                    {
                    // InternalKExpressions.g:2116:6: ( ( 'double' ) )
                    // InternalKExpressions.g:2117:1: ( 'double' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getDOUBLEEnumLiteralDeclaration_5()); 
                    }
                    // InternalKExpressions.g:2118:1: ( 'double' )
                    // InternalKExpressions.g:2118:3: 'double'
                    {
                    match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueTypeAccess().getDOUBLEEnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalKExpressions.g:2123:6: ( ( 'string' ) )
                    {
                    // InternalKExpressions.g:2123:6: ( ( 'string' ) )
                    // InternalKExpressions.g:2124:1: ( 'string' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_6()); 
                    }
                    // InternalKExpressions.g:2125:1: ( 'string' )
                    // InternalKExpressions.g:2125:3: 'string'
                    {
                    match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalKExpressions.g:2130:6: ( ( 'host' ) )
                    {
                    // InternalKExpressions.g:2130:6: ( ( 'host' ) )
                    // InternalKExpressions.g:2131:1: ( 'host' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getHOSTEnumLiteralDeclaration_7()); 
                    }
                    // InternalKExpressions.g:2132:1: ( 'host' )
                    // InternalKExpressions.g:2132:3: 'host'
                    {
                    match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalKExpressions.g:2142:1: rule__CombineOperator__Alternatives : ( ( ( 'none' ) ) | ( ( '+' ) ) | ( ( '*' ) ) | ( ( 'max' ) ) | ( ( 'min' ) ) | ( ( 'or' ) ) | ( ( 'and' ) ) | ( ( 'host' ) ) );
    public final void rule__CombineOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2146:1: ( ( ( 'none' ) ) | ( ( '+' ) ) | ( ( '*' ) ) | ( ( 'max' ) ) | ( ( 'min' ) ) | ( ( 'or' ) ) | ( ( 'and' ) ) | ( ( 'host' ) ) )
            int alt20=8;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt20=1;
                }
                break;
            case 20:
                {
                alt20=2;
                }
                break;
            case 22:
                {
                alt20=3;
                }
                break;
            case 41:
                {
                alt20=4;
                }
                break;
            case 42:
                {
                alt20=5;
                }
                break;
            case 17:
                {
                alt20=6;
                }
                break;
            case 18:
                {
                alt20=7;
                }
                break;
            case 39:
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
                    // InternalKExpressions.g:2147:1: ( ( 'none' ) )
                    {
                    // InternalKExpressions.g:2147:1: ( ( 'none' ) )
                    // InternalKExpressions.g:2148:1: ( 'none' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 
                    }
                    // InternalKExpressions.g:2149:1: ( 'none' )
                    // InternalKExpressions.g:2149:3: 'none'
                    {
                    match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:2154:6: ( ( '+' ) )
                    {
                    // InternalKExpressions.g:2154:6: ( ( '+' ) )
                    // InternalKExpressions.g:2155:1: ( '+' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 
                    }
                    // InternalKExpressions.g:2156:1: ( '+' )
                    // InternalKExpressions.g:2156:3: '+'
                    {
                    match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKExpressions.g:2161:6: ( ( '*' ) )
                    {
                    // InternalKExpressions.g:2161:6: ( ( '*' ) )
                    // InternalKExpressions.g:2162:1: ( '*' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 
                    }
                    // InternalKExpressions.g:2163:1: ( '*' )
                    // InternalKExpressions.g:2163:3: '*'
                    {
                    match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKExpressions.g:2168:6: ( ( 'max' ) )
                    {
                    // InternalKExpressions.g:2168:6: ( ( 'max' ) )
                    // InternalKExpressions.g:2169:1: ( 'max' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3()); 
                    }
                    // InternalKExpressions.g:2170:1: ( 'max' )
                    // InternalKExpressions.g:2170:3: 'max'
                    {
                    match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKExpressions.g:2175:6: ( ( 'min' ) )
                    {
                    // InternalKExpressions.g:2175:6: ( ( 'min' ) )
                    // InternalKExpressions.g:2176:1: ( 'min' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4()); 
                    }
                    // InternalKExpressions.g:2177:1: ( 'min' )
                    // InternalKExpressions.g:2177:3: 'min'
                    {
                    match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKExpressions.g:2182:6: ( ( 'or' ) )
                    {
                    // InternalKExpressions.g:2182:6: ( ( 'or' ) )
                    // InternalKExpressions.g:2183:1: ( 'or' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5()); 
                    }
                    // InternalKExpressions.g:2184:1: ( 'or' )
                    // InternalKExpressions.g:2184:3: 'or'
                    {
                    match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalKExpressions.g:2189:6: ( ( 'and' ) )
                    {
                    // InternalKExpressions.g:2189:6: ( ( 'and' ) )
                    // InternalKExpressions.g:2190:1: ( 'and' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                    }
                    // InternalKExpressions.g:2191:1: ( 'and' )
                    // InternalKExpressions.g:2191:3: 'and'
                    {
                    match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalKExpressions.g:2196:6: ( ( 'host' ) )
                    {
                    // InternalKExpressions.g:2196:6: ( ( 'host' ) )
                    // InternalKExpressions.g:2197:1: ( 'host' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCombineOperatorAccess().getHOSTEnumLiteralDeclaration_7()); 
                    }
                    // InternalKExpressions.g:2198:1: ( 'host' )
                    // InternalKExpressions.g:2198:3: 'host'
                    {
                    match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalKExpressions.g:2210:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2214:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // InternalKExpressions.g:2215:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
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
    // InternalKExpressions.g:2222:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2226:1: ( ( ruleAndExpression ) )
            // InternalKExpressions.g:2227:1: ( ruleAndExpression )
            {
            // InternalKExpressions.g:2227:1: ( ruleAndExpression )
            // InternalKExpressions.g:2228:1: ruleAndExpression
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
    // InternalKExpressions.g:2239:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2243:1: ( rule__OrExpression__Group__1__Impl )
            // InternalKExpressions.g:2244:2: rule__OrExpression__Group__1__Impl
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
    // InternalKExpressions.g:2250:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2254:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // InternalKExpressions.g:2255:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // InternalKExpressions.g:2255:1: ( ( rule__OrExpression__Group_1__0 )* )
            // InternalKExpressions.g:2256:1: ( rule__OrExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:2257:1: ( rule__OrExpression__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==17) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalKExpressions.g:2257:2: rule__OrExpression__Group_1__0
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
    // InternalKExpressions.g:2271:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2275:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // InternalKExpressions.g:2276:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
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
    // InternalKExpressions.g:2283:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2287:1: ( ( () ) )
            // InternalKExpressions.g:2288:1: ( () )
            {
            // InternalKExpressions.g:2288:1: ( () )
            // InternalKExpressions.g:2289:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:2290:1: ()
            // InternalKExpressions.g:2292:1: 
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
    // InternalKExpressions.g:2302:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2306:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // InternalKExpressions.g:2307:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
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
    // InternalKExpressions.g:2314:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2318:1: ( ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) )
            // InternalKExpressions.g:2319:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKExpressions.g:2319:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            // InternalKExpressions.g:2320:1: ( rule__OrExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKExpressions.g:2321:1: ( rule__OrExpression__OperatorAssignment_1_1 )
            // InternalKExpressions.g:2321:2: rule__OrExpression__OperatorAssignment_1_1
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
    // InternalKExpressions.g:2331:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2335:1: ( rule__OrExpression__Group_1__2__Impl )
            // InternalKExpressions.g:2336:2: rule__OrExpression__Group_1__2__Impl
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
    // InternalKExpressions.g:2342:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2346:1: ( ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) ) )
            // InternalKExpressions.g:2347:1: ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) )
            {
            // InternalKExpressions.g:2347:1: ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) )
            // InternalKExpressions.g:2348:1: ( rule__OrExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // InternalKExpressions.g:2349:1: ( rule__OrExpression__SubExpressionsAssignment_1_2 )
            // InternalKExpressions.g:2349:2: rule__OrExpression__SubExpressionsAssignment_1_2
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
    // InternalKExpressions.g:2365:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2369:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalKExpressions.g:2370:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
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
    // InternalKExpressions.g:2377:1: rule__AndExpression__Group__0__Impl : ( ruleCompareOperation ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2381:1: ( ( ruleCompareOperation ) )
            // InternalKExpressions.g:2382:1: ( ruleCompareOperation )
            {
            // InternalKExpressions.g:2382:1: ( ruleCompareOperation )
            // InternalKExpressions.g:2383:1: ruleCompareOperation
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
    // InternalKExpressions.g:2394:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2398:1: ( rule__AndExpression__Group__1__Impl )
            // InternalKExpressions.g:2399:2: rule__AndExpression__Group__1__Impl
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
    // InternalKExpressions.g:2405:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2409:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalKExpressions.g:2410:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalKExpressions.g:2410:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalKExpressions.g:2411:1: ( rule__AndExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:2412:1: ( rule__AndExpression__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==18) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalKExpressions.g:2412:2: rule__AndExpression__Group_1__0
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
    // InternalKExpressions.g:2426:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2430:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalKExpressions.g:2431:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
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
    // InternalKExpressions.g:2438:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2442:1: ( ( () ) )
            // InternalKExpressions.g:2443:1: ( () )
            {
            // InternalKExpressions.g:2443:1: ( () )
            // InternalKExpressions.g:2444:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:2445:1: ()
            // InternalKExpressions.g:2447:1: 
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
    // InternalKExpressions.g:2457:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2461:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // InternalKExpressions.g:2462:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
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
    // InternalKExpressions.g:2469:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2473:1: ( ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) )
            // InternalKExpressions.g:2474:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKExpressions.g:2474:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            // InternalKExpressions.g:2475:1: ( rule__AndExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKExpressions.g:2476:1: ( rule__AndExpression__OperatorAssignment_1_1 )
            // InternalKExpressions.g:2476:2: rule__AndExpression__OperatorAssignment_1_1
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
    // InternalKExpressions.g:2486:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2490:1: ( rule__AndExpression__Group_1__2__Impl )
            // InternalKExpressions.g:2491:2: rule__AndExpression__Group_1__2__Impl
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
    // InternalKExpressions.g:2497:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2501:1: ( ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) ) )
            // InternalKExpressions.g:2502:1: ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) )
            {
            // InternalKExpressions.g:2502:1: ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) )
            // InternalKExpressions.g:2503:1: ( rule__AndExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // InternalKExpressions.g:2504:1: ( rule__AndExpression__SubExpressionsAssignment_1_2 )
            // InternalKExpressions.g:2504:2: rule__AndExpression__SubExpressionsAssignment_1_2
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
    // InternalKExpressions.g:2520:1: rule__CompareOperation__Group_0__0 : rule__CompareOperation__Group_0__0__Impl rule__CompareOperation__Group_0__1 ;
    public final void rule__CompareOperation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2524:1: ( rule__CompareOperation__Group_0__0__Impl rule__CompareOperation__Group_0__1 )
            // InternalKExpressions.g:2525:2: rule__CompareOperation__Group_0__0__Impl rule__CompareOperation__Group_0__1
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
    // InternalKExpressions.g:2532:1: rule__CompareOperation__Group_0__0__Impl : ( ( ruleNotOrValuedExpression ) ) ;
    public final void rule__CompareOperation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2536:1: ( ( ( ruleNotOrValuedExpression ) ) )
            // InternalKExpressions.g:2537:1: ( ( ruleNotOrValuedExpression ) )
            {
            // InternalKExpressions.g:2537:1: ( ( ruleNotOrValuedExpression ) )
            // InternalKExpressions.g:2538:1: ( ruleNotOrValuedExpression )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0_0()); 
            }
            // InternalKExpressions.g:2539:1: ( ruleNotOrValuedExpression )
            // InternalKExpressions.g:2539:3: ruleNotOrValuedExpression
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
    // InternalKExpressions.g:2549:1: rule__CompareOperation__Group_0__1 : rule__CompareOperation__Group_0__1__Impl ;
    public final void rule__CompareOperation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2553:1: ( rule__CompareOperation__Group_0__1__Impl )
            // InternalKExpressions.g:2554:2: rule__CompareOperation__Group_0__1__Impl
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
    // InternalKExpressions.g:2560:1: rule__CompareOperation__Group_0__1__Impl : ( ( rule__CompareOperation__Group_0_1__0 ) ) ;
    public final void rule__CompareOperation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2564:1: ( ( ( rule__CompareOperation__Group_0_1__0 ) ) )
            // InternalKExpressions.g:2565:1: ( ( rule__CompareOperation__Group_0_1__0 ) )
            {
            // InternalKExpressions.g:2565:1: ( ( rule__CompareOperation__Group_0_1__0 ) )
            // InternalKExpressions.g:2566:1: ( rule__CompareOperation__Group_0_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGroup_0_1()); 
            }
            // InternalKExpressions.g:2567:1: ( rule__CompareOperation__Group_0_1__0 )
            // InternalKExpressions.g:2567:2: rule__CompareOperation__Group_0_1__0
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
    // InternalKExpressions.g:2581:1: rule__CompareOperation__Group_0_1__0 : rule__CompareOperation__Group_0_1__0__Impl rule__CompareOperation__Group_0_1__1 ;
    public final void rule__CompareOperation__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2585:1: ( rule__CompareOperation__Group_0_1__0__Impl rule__CompareOperation__Group_0_1__1 )
            // InternalKExpressions.g:2586:2: rule__CompareOperation__Group_0_1__0__Impl rule__CompareOperation__Group_0_1__1
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
    // InternalKExpressions.g:2593:1: rule__CompareOperation__Group_0_1__0__Impl : ( () ) ;
    public final void rule__CompareOperation__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2597:1: ( ( () ) )
            // InternalKExpressions.g:2598:1: ( () )
            {
            // InternalKExpressions.g:2598:1: ( () )
            // InternalKExpressions.g:2599:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_0_1_0()); 
            }
            // InternalKExpressions.g:2600:1: ()
            // InternalKExpressions.g:2602:1: 
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
    // InternalKExpressions.g:2612:1: rule__CompareOperation__Group_0_1__1 : rule__CompareOperation__Group_0_1__1__Impl rule__CompareOperation__Group_0_1__2 ;
    public final void rule__CompareOperation__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2616:1: ( rule__CompareOperation__Group_0_1__1__Impl rule__CompareOperation__Group_0_1__2 )
            // InternalKExpressions.g:2617:2: rule__CompareOperation__Group_0_1__1__Impl rule__CompareOperation__Group_0_1__2
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
    // InternalKExpressions.g:2624:1: rule__CompareOperation__Group_0_1__1__Impl : ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) ) ;
    public final void rule__CompareOperation__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2628:1: ( ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) ) )
            // InternalKExpressions.g:2629:1: ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) )
            {
            // InternalKExpressions.g:2629:1: ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) )
            // InternalKExpressions.g:2630:1: ( rule__CompareOperation__OperatorAssignment_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorAssignment_0_1_1()); 
            }
            // InternalKExpressions.g:2631:1: ( rule__CompareOperation__OperatorAssignment_0_1_1 )
            // InternalKExpressions.g:2631:2: rule__CompareOperation__OperatorAssignment_0_1_1
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
    // InternalKExpressions.g:2641:1: rule__CompareOperation__Group_0_1__2 : rule__CompareOperation__Group_0_1__2__Impl ;
    public final void rule__CompareOperation__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2645:1: ( rule__CompareOperation__Group_0_1__2__Impl )
            // InternalKExpressions.g:2646:2: rule__CompareOperation__Group_0_1__2__Impl
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
    // InternalKExpressions.g:2652:1: rule__CompareOperation__Group_0_1__2__Impl : ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) ) ;
    public final void rule__CompareOperation__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2656:1: ( ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) ) )
            // InternalKExpressions.g:2657:1: ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) )
            {
            // InternalKExpressions.g:2657:1: ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) )
            // InternalKExpressions.g:2658:1: ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsAssignment_0_1_2()); 
            }
            // InternalKExpressions.g:2659:1: ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 )
            // InternalKExpressions.g:2659:2: rule__CompareOperation__SubExpressionsAssignment_0_1_2
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
    // InternalKExpressions.g:2675:1: rule__NotExpression__Group_0__0 : rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1 ;
    public final void rule__NotExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2679:1: ( rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1 )
            // InternalKExpressions.g:2680:2: rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1
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
    // InternalKExpressions.g:2687:1: rule__NotExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__NotExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2691:1: ( ( () ) )
            // InternalKExpressions.g:2692:1: ( () )
            {
            // InternalKExpressions.g:2692:1: ( () )
            // InternalKExpressions.g:2693:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // InternalKExpressions.g:2694:1: ()
            // InternalKExpressions.g:2696:1: 
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
    // InternalKExpressions.g:2706:1: rule__NotExpression__Group_0__1 : rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2 ;
    public final void rule__NotExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2710:1: ( rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2 )
            // InternalKExpressions.g:2711:2: rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2
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
    // InternalKExpressions.g:2718:1: rule__NotExpression__Group_0__1__Impl : ( ( rule__NotExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__NotExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2722:1: ( ( ( rule__NotExpression__OperatorAssignment_0_1 ) ) )
            // InternalKExpressions.g:2723:1: ( ( rule__NotExpression__OperatorAssignment_0_1 ) )
            {
            // InternalKExpressions.g:2723:1: ( ( rule__NotExpression__OperatorAssignment_0_1 ) )
            // InternalKExpressions.g:2724:1: ( rule__NotExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // InternalKExpressions.g:2725:1: ( rule__NotExpression__OperatorAssignment_0_1 )
            // InternalKExpressions.g:2725:2: rule__NotExpression__OperatorAssignment_0_1
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
    // InternalKExpressions.g:2735:1: rule__NotExpression__Group_0__2 : rule__NotExpression__Group_0__2__Impl ;
    public final void rule__NotExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2739:1: ( rule__NotExpression__Group_0__2__Impl )
            // InternalKExpressions.g:2740:2: rule__NotExpression__Group_0__2__Impl
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
    // InternalKExpressions.g:2746:1: rule__NotExpression__Group_0__2__Impl : ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) ) ;
    public final void rule__NotExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2750:1: ( ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) ) )
            // InternalKExpressions.g:2751:1: ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) )
            {
            // InternalKExpressions.g:2751:1: ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) )
            // InternalKExpressions.g:2752:1: ( rule__NotExpression__SubExpressionsAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubExpressionsAssignment_0_2()); 
            }
            // InternalKExpressions.g:2753:1: ( rule__NotExpression__SubExpressionsAssignment_0_2 )
            // InternalKExpressions.g:2753:2: rule__NotExpression__SubExpressionsAssignment_0_2
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
    // InternalKExpressions.g:2769:1: rule__AddExpression__Group__0 : rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 ;
    public final void rule__AddExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2773:1: ( rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 )
            // InternalKExpressions.g:2774:2: rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1
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
    // InternalKExpressions.g:2781:1: rule__AddExpression__Group__0__Impl : ( ruleSubExpression ) ;
    public final void rule__AddExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2785:1: ( ( ruleSubExpression ) )
            // InternalKExpressions.g:2786:1: ( ruleSubExpression )
            {
            // InternalKExpressions.g:2786:1: ( ruleSubExpression )
            // InternalKExpressions.g:2787:1: ruleSubExpression
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
    // InternalKExpressions.g:2798:1: rule__AddExpression__Group__1 : rule__AddExpression__Group__1__Impl ;
    public final void rule__AddExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2802:1: ( rule__AddExpression__Group__1__Impl )
            // InternalKExpressions.g:2803:2: rule__AddExpression__Group__1__Impl
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
    // InternalKExpressions.g:2809:1: rule__AddExpression__Group__1__Impl : ( ( rule__AddExpression__Group_1__0 )* ) ;
    public final void rule__AddExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2813:1: ( ( ( rule__AddExpression__Group_1__0 )* ) )
            // InternalKExpressions.g:2814:1: ( ( rule__AddExpression__Group_1__0 )* )
            {
            // InternalKExpressions.g:2814:1: ( ( rule__AddExpression__Group_1__0 )* )
            // InternalKExpressions.g:2815:1: ( rule__AddExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:2816:1: ( rule__AddExpression__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==20) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalKExpressions.g:2816:2: rule__AddExpression__Group_1__0
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
    // InternalKExpressions.g:2830:1: rule__AddExpression__Group_1__0 : rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 ;
    public final void rule__AddExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2834:1: ( rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 )
            // InternalKExpressions.g:2835:2: rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1
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
    // InternalKExpressions.g:2842:1: rule__AddExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AddExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2846:1: ( ( () ) )
            // InternalKExpressions.g:2847:1: ( () )
            {
            // InternalKExpressions.g:2847:1: ( () )
            // InternalKExpressions.g:2848:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:2849:1: ()
            // InternalKExpressions.g:2851:1: 
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
    // InternalKExpressions.g:2861:1: rule__AddExpression__Group_1__1 : rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2 ;
    public final void rule__AddExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2865:1: ( rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2 )
            // InternalKExpressions.g:2866:2: rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2
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
    // InternalKExpressions.g:2873:1: rule__AddExpression__Group_1__1__Impl : ( ( rule__AddExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AddExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2877:1: ( ( ( rule__AddExpression__OperatorAssignment_1_1 ) ) )
            // InternalKExpressions.g:2878:1: ( ( rule__AddExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKExpressions.g:2878:1: ( ( rule__AddExpression__OperatorAssignment_1_1 ) )
            // InternalKExpressions.g:2879:1: ( rule__AddExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKExpressions.g:2880:1: ( rule__AddExpression__OperatorAssignment_1_1 )
            // InternalKExpressions.g:2880:2: rule__AddExpression__OperatorAssignment_1_1
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
    // InternalKExpressions.g:2890:1: rule__AddExpression__Group_1__2 : rule__AddExpression__Group_1__2__Impl ;
    public final void rule__AddExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2894:1: ( rule__AddExpression__Group_1__2__Impl )
            // InternalKExpressions.g:2895:2: rule__AddExpression__Group_1__2__Impl
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
    // InternalKExpressions.g:2901:1: rule__AddExpression__Group_1__2__Impl : ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__AddExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2905:1: ( ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) ) )
            // InternalKExpressions.g:2906:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) )
            {
            // InternalKExpressions.g:2906:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) )
            // InternalKExpressions.g:2907:1: ( rule__AddExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // InternalKExpressions.g:2908:1: ( rule__AddExpression__SubExpressionsAssignment_1_2 )
            // InternalKExpressions.g:2908:2: rule__AddExpression__SubExpressionsAssignment_1_2
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
    // InternalKExpressions.g:2924:1: rule__SubExpression__Group__0 : rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 ;
    public final void rule__SubExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2928:1: ( rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 )
            // InternalKExpressions.g:2929:2: rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1
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
    // InternalKExpressions.g:2936:1: rule__SubExpression__Group__0__Impl : ( ruleMultExpression ) ;
    public final void rule__SubExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2940:1: ( ( ruleMultExpression ) )
            // InternalKExpressions.g:2941:1: ( ruleMultExpression )
            {
            // InternalKExpressions.g:2941:1: ( ruleMultExpression )
            // InternalKExpressions.g:2942:1: ruleMultExpression
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
    // InternalKExpressions.g:2953:1: rule__SubExpression__Group__1 : rule__SubExpression__Group__1__Impl ;
    public final void rule__SubExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2957:1: ( rule__SubExpression__Group__1__Impl )
            // InternalKExpressions.g:2958:2: rule__SubExpression__Group__1__Impl
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
    // InternalKExpressions.g:2964:1: rule__SubExpression__Group__1__Impl : ( ( rule__SubExpression__Group_1__0 )* ) ;
    public final void rule__SubExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2968:1: ( ( ( rule__SubExpression__Group_1__0 )* ) )
            // InternalKExpressions.g:2969:1: ( ( rule__SubExpression__Group_1__0 )* )
            {
            // InternalKExpressions.g:2969:1: ( ( rule__SubExpression__Group_1__0 )* )
            // InternalKExpressions.g:2970:1: ( rule__SubExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:2971:1: ( rule__SubExpression__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==21) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalKExpressions.g:2971:2: rule__SubExpression__Group_1__0
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
    // InternalKExpressions.g:2985:1: rule__SubExpression__Group_1__0 : rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 ;
    public final void rule__SubExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2989:1: ( rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 )
            // InternalKExpressions.g:2990:2: rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1
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
    // InternalKExpressions.g:2997:1: rule__SubExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__SubExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3001:1: ( ( () ) )
            // InternalKExpressions.g:3002:1: ( () )
            {
            // InternalKExpressions.g:3002:1: ( () )
            // InternalKExpressions.g:3003:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:3004:1: ()
            // InternalKExpressions.g:3006:1: 
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
    // InternalKExpressions.g:3016:1: rule__SubExpression__Group_1__1 : rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2 ;
    public final void rule__SubExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3020:1: ( rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2 )
            // InternalKExpressions.g:3021:2: rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2
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
    // InternalKExpressions.g:3028:1: rule__SubExpression__Group_1__1__Impl : ( ( rule__SubExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__SubExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3032:1: ( ( ( rule__SubExpression__OperatorAssignment_1_1 ) ) )
            // InternalKExpressions.g:3033:1: ( ( rule__SubExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKExpressions.g:3033:1: ( ( rule__SubExpression__OperatorAssignment_1_1 ) )
            // InternalKExpressions.g:3034:1: ( rule__SubExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKExpressions.g:3035:1: ( rule__SubExpression__OperatorAssignment_1_1 )
            // InternalKExpressions.g:3035:2: rule__SubExpression__OperatorAssignment_1_1
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
    // InternalKExpressions.g:3045:1: rule__SubExpression__Group_1__2 : rule__SubExpression__Group_1__2__Impl ;
    public final void rule__SubExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3049:1: ( rule__SubExpression__Group_1__2__Impl )
            // InternalKExpressions.g:3050:2: rule__SubExpression__Group_1__2__Impl
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
    // InternalKExpressions.g:3056:1: rule__SubExpression__Group_1__2__Impl : ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__SubExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3060:1: ( ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) ) )
            // InternalKExpressions.g:3061:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) )
            {
            // InternalKExpressions.g:3061:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) )
            // InternalKExpressions.g:3062:1: ( rule__SubExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // InternalKExpressions.g:3063:1: ( rule__SubExpression__SubExpressionsAssignment_1_2 )
            // InternalKExpressions.g:3063:2: rule__SubExpression__SubExpressionsAssignment_1_2
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
    // InternalKExpressions.g:3079:1: rule__MultExpression__Group__0 : rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 ;
    public final void rule__MultExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3083:1: ( rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 )
            // InternalKExpressions.g:3084:2: rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1
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
    // InternalKExpressions.g:3091:1: rule__MultExpression__Group__0__Impl : ( ruleDivExpression ) ;
    public final void rule__MultExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3095:1: ( ( ruleDivExpression ) )
            // InternalKExpressions.g:3096:1: ( ruleDivExpression )
            {
            // InternalKExpressions.g:3096:1: ( ruleDivExpression )
            // InternalKExpressions.g:3097:1: ruleDivExpression
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
    // InternalKExpressions.g:3108:1: rule__MultExpression__Group__1 : rule__MultExpression__Group__1__Impl ;
    public final void rule__MultExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3112:1: ( rule__MultExpression__Group__1__Impl )
            // InternalKExpressions.g:3113:2: rule__MultExpression__Group__1__Impl
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
    // InternalKExpressions.g:3119:1: rule__MultExpression__Group__1__Impl : ( ( rule__MultExpression__Group_1__0 )* ) ;
    public final void rule__MultExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3123:1: ( ( ( rule__MultExpression__Group_1__0 )* ) )
            // InternalKExpressions.g:3124:1: ( ( rule__MultExpression__Group_1__0 )* )
            {
            // InternalKExpressions.g:3124:1: ( ( rule__MultExpression__Group_1__0 )* )
            // InternalKExpressions.g:3125:1: ( rule__MultExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:3126:1: ( rule__MultExpression__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==22) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalKExpressions.g:3126:2: rule__MultExpression__Group_1__0
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
    // InternalKExpressions.g:3140:1: rule__MultExpression__Group_1__0 : rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 ;
    public final void rule__MultExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3144:1: ( rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 )
            // InternalKExpressions.g:3145:2: rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1
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
    // InternalKExpressions.g:3152:1: rule__MultExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3156:1: ( ( () ) )
            // InternalKExpressions.g:3157:1: ( () )
            {
            // InternalKExpressions.g:3157:1: ( () )
            // InternalKExpressions.g:3158:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:3159:1: ()
            // InternalKExpressions.g:3161:1: 
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
    // InternalKExpressions.g:3171:1: rule__MultExpression__Group_1__1 : rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2 ;
    public final void rule__MultExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3175:1: ( rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2 )
            // InternalKExpressions.g:3176:2: rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2
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
    // InternalKExpressions.g:3183:1: rule__MultExpression__Group_1__1__Impl : ( ( rule__MultExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3187:1: ( ( ( rule__MultExpression__OperatorAssignment_1_1 ) ) )
            // InternalKExpressions.g:3188:1: ( ( rule__MultExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKExpressions.g:3188:1: ( ( rule__MultExpression__OperatorAssignment_1_1 ) )
            // InternalKExpressions.g:3189:1: ( rule__MultExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKExpressions.g:3190:1: ( rule__MultExpression__OperatorAssignment_1_1 )
            // InternalKExpressions.g:3190:2: rule__MultExpression__OperatorAssignment_1_1
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
    // InternalKExpressions.g:3200:1: rule__MultExpression__Group_1__2 : rule__MultExpression__Group_1__2__Impl ;
    public final void rule__MultExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3204:1: ( rule__MultExpression__Group_1__2__Impl )
            // InternalKExpressions.g:3205:2: rule__MultExpression__Group_1__2__Impl
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
    // InternalKExpressions.g:3211:1: rule__MultExpression__Group_1__2__Impl : ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__MultExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3215:1: ( ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) ) )
            // InternalKExpressions.g:3216:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) )
            {
            // InternalKExpressions.g:3216:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) )
            // InternalKExpressions.g:3217:1: ( rule__MultExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // InternalKExpressions.g:3218:1: ( rule__MultExpression__SubExpressionsAssignment_1_2 )
            // InternalKExpressions.g:3218:2: rule__MultExpression__SubExpressionsAssignment_1_2
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
    // InternalKExpressions.g:3234:1: rule__DivExpression__Group__0 : rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1 ;
    public final void rule__DivExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3238:1: ( rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1 )
            // InternalKExpressions.g:3239:2: rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1
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
    // InternalKExpressions.g:3246:1: rule__DivExpression__Group__0__Impl : ( ruleModExpression ) ;
    public final void rule__DivExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3250:1: ( ( ruleModExpression ) )
            // InternalKExpressions.g:3251:1: ( ruleModExpression )
            {
            // InternalKExpressions.g:3251:1: ( ruleModExpression )
            // InternalKExpressions.g:3252:1: ruleModExpression
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
    // InternalKExpressions.g:3263:1: rule__DivExpression__Group__1 : rule__DivExpression__Group__1__Impl ;
    public final void rule__DivExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3267:1: ( rule__DivExpression__Group__1__Impl )
            // InternalKExpressions.g:3268:2: rule__DivExpression__Group__1__Impl
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
    // InternalKExpressions.g:3274:1: rule__DivExpression__Group__1__Impl : ( ( rule__DivExpression__Group_1__0 )? ) ;
    public final void rule__DivExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3278:1: ( ( ( rule__DivExpression__Group_1__0 )? ) )
            // InternalKExpressions.g:3279:1: ( ( rule__DivExpression__Group_1__0 )? )
            {
            // InternalKExpressions.g:3279:1: ( ( rule__DivExpression__Group_1__0 )? )
            // InternalKExpressions.g:3280:1: ( rule__DivExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:3281:1: ( rule__DivExpression__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==24) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalKExpressions.g:3281:2: rule__DivExpression__Group_1__0
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
    // InternalKExpressions.g:3295:1: rule__DivExpression__Group_1__0 : rule__DivExpression__Group_1__0__Impl rule__DivExpression__Group_1__1 ;
    public final void rule__DivExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3299:1: ( rule__DivExpression__Group_1__0__Impl rule__DivExpression__Group_1__1 )
            // InternalKExpressions.g:3300:2: rule__DivExpression__Group_1__0__Impl rule__DivExpression__Group_1__1
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
    // InternalKExpressions.g:3307:1: rule__DivExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__DivExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3311:1: ( ( () ) )
            // InternalKExpressions.g:3312:1: ( () )
            {
            // InternalKExpressions.g:3312:1: ( () )
            // InternalKExpressions.g:3313:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:3314:1: ()
            // InternalKExpressions.g:3316:1: 
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
    // InternalKExpressions.g:3326:1: rule__DivExpression__Group_1__1 : rule__DivExpression__Group_1__1__Impl rule__DivExpression__Group_1__2 ;
    public final void rule__DivExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3330:1: ( rule__DivExpression__Group_1__1__Impl rule__DivExpression__Group_1__2 )
            // InternalKExpressions.g:3331:2: rule__DivExpression__Group_1__1__Impl rule__DivExpression__Group_1__2
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
    // InternalKExpressions.g:3338:1: rule__DivExpression__Group_1__1__Impl : ( ( rule__DivExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__DivExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3342:1: ( ( ( rule__DivExpression__OperatorAssignment_1_1 ) ) )
            // InternalKExpressions.g:3343:1: ( ( rule__DivExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKExpressions.g:3343:1: ( ( rule__DivExpression__OperatorAssignment_1_1 ) )
            // InternalKExpressions.g:3344:1: ( rule__DivExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKExpressions.g:3345:1: ( rule__DivExpression__OperatorAssignment_1_1 )
            // InternalKExpressions.g:3345:2: rule__DivExpression__OperatorAssignment_1_1
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
    // InternalKExpressions.g:3355:1: rule__DivExpression__Group_1__2 : rule__DivExpression__Group_1__2__Impl ;
    public final void rule__DivExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3359:1: ( rule__DivExpression__Group_1__2__Impl )
            // InternalKExpressions.g:3360:2: rule__DivExpression__Group_1__2__Impl
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
    // InternalKExpressions.g:3366:1: rule__DivExpression__Group_1__2__Impl : ( ( rule__DivExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__DivExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3370:1: ( ( ( rule__DivExpression__SubExpressionsAssignment_1_2 ) ) )
            // InternalKExpressions.g:3371:1: ( ( rule__DivExpression__SubExpressionsAssignment_1_2 ) )
            {
            // InternalKExpressions.g:3371:1: ( ( rule__DivExpression__SubExpressionsAssignment_1_2 ) )
            // InternalKExpressions.g:3372:1: ( rule__DivExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // InternalKExpressions.g:3373:1: ( rule__DivExpression__SubExpressionsAssignment_1_2 )
            // InternalKExpressions.g:3373:2: rule__DivExpression__SubExpressionsAssignment_1_2
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
    // InternalKExpressions.g:3389:1: rule__ModExpression__Group__0 : rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1 ;
    public final void rule__ModExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3393:1: ( rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1 )
            // InternalKExpressions.g:3394:2: rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1
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
    // InternalKExpressions.g:3401:1: rule__ModExpression__Group__0__Impl : ( ruleNegExpression ) ;
    public final void rule__ModExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3405:1: ( ( ruleNegExpression ) )
            // InternalKExpressions.g:3406:1: ( ruleNegExpression )
            {
            // InternalKExpressions.g:3406:1: ( ruleNegExpression )
            // InternalKExpressions.g:3407:1: ruleNegExpression
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
    // InternalKExpressions.g:3418:1: rule__ModExpression__Group__1 : rule__ModExpression__Group__1__Impl ;
    public final void rule__ModExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3422:1: ( rule__ModExpression__Group__1__Impl )
            // InternalKExpressions.g:3423:2: rule__ModExpression__Group__1__Impl
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
    // InternalKExpressions.g:3429:1: rule__ModExpression__Group__1__Impl : ( ( rule__ModExpression__Group_1__0 )? ) ;
    public final void rule__ModExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3433:1: ( ( ( rule__ModExpression__Group_1__0 )? ) )
            // InternalKExpressions.g:3434:1: ( ( rule__ModExpression__Group_1__0 )? )
            {
            // InternalKExpressions.g:3434:1: ( ( rule__ModExpression__Group_1__0 )? )
            // InternalKExpressions.g:3435:1: ( rule__ModExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:3436:1: ( rule__ModExpression__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==23) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalKExpressions.g:3436:2: rule__ModExpression__Group_1__0
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
    // InternalKExpressions.g:3450:1: rule__ModExpression__Group_1__0 : rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1 ;
    public final void rule__ModExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3454:1: ( rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1 )
            // InternalKExpressions.g:3455:2: rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1
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
    // InternalKExpressions.g:3462:1: rule__ModExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ModExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3466:1: ( ( () ) )
            // InternalKExpressions.g:3467:1: ( () )
            {
            // InternalKExpressions.g:3467:1: ( () )
            // InternalKExpressions.g:3468:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:3469:1: ()
            // InternalKExpressions.g:3471:1: 
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
    // InternalKExpressions.g:3481:1: rule__ModExpression__Group_1__1 : rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2 ;
    public final void rule__ModExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3485:1: ( rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2 )
            // InternalKExpressions.g:3486:2: rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2
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
    // InternalKExpressions.g:3493:1: rule__ModExpression__Group_1__1__Impl : ( ( rule__ModExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ModExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3497:1: ( ( ( rule__ModExpression__OperatorAssignment_1_1 ) ) )
            // InternalKExpressions.g:3498:1: ( ( rule__ModExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKExpressions.g:3498:1: ( ( rule__ModExpression__OperatorAssignment_1_1 ) )
            // InternalKExpressions.g:3499:1: ( rule__ModExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKExpressions.g:3500:1: ( rule__ModExpression__OperatorAssignment_1_1 )
            // InternalKExpressions.g:3500:2: rule__ModExpression__OperatorAssignment_1_1
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
    // InternalKExpressions.g:3510:1: rule__ModExpression__Group_1__2 : rule__ModExpression__Group_1__2__Impl ;
    public final void rule__ModExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3514:1: ( rule__ModExpression__Group_1__2__Impl )
            // InternalKExpressions.g:3515:2: rule__ModExpression__Group_1__2__Impl
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
    // InternalKExpressions.g:3521:1: rule__ModExpression__Group_1__2__Impl : ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__ModExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3525:1: ( ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) ) )
            // InternalKExpressions.g:3526:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) )
            {
            // InternalKExpressions.g:3526:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) )
            // InternalKExpressions.g:3527:1: ( rule__ModExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // InternalKExpressions.g:3528:1: ( rule__ModExpression__SubExpressionsAssignment_1_2 )
            // InternalKExpressions.g:3528:2: rule__ModExpression__SubExpressionsAssignment_1_2
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
    // InternalKExpressions.g:3544:1: rule__NegExpression__Group_0__0 : rule__NegExpression__Group_0__0__Impl rule__NegExpression__Group_0__1 ;
    public final void rule__NegExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3548:1: ( rule__NegExpression__Group_0__0__Impl rule__NegExpression__Group_0__1 )
            // InternalKExpressions.g:3549:2: rule__NegExpression__Group_0__0__Impl rule__NegExpression__Group_0__1
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
    // InternalKExpressions.g:3556:1: rule__NegExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__NegExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3560:1: ( ( () ) )
            // InternalKExpressions.g:3561:1: ( () )
            {
            // InternalKExpressions.g:3561:1: ( () )
            // InternalKExpressions.g:3562:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // InternalKExpressions.g:3563:1: ()
            // InternalKExpressions.g:3565:1: 
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
    // InternalKExpressions.g:3575:1: rule__NegExpression__Group_0__1 : rule__NegExpression__Group_0__1__Impl rule__NegExpression__Group_0__2 ;
    public final void rule__NegExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3579:1: ( rule__NegExpression__Group_0__1__Impl rule__NegExpression__Group_0__2 )
            // InternalKExpressions.g:3580:2: rule__NegExpression__Group_0__1__Impl rule__NegExpression__Group_0__2
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
    // InternalKExpressions.g:3587:1: rule__NegExpression__Group_0__1__Impl : ( ( rule__NegExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__NegExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3591:1: ( ( ( rule__NegExpression__OperatorAssignment_0_1 ) ) )
            // InternalKExpressions.g:3592:1: ( ( rule__NegExpression__OperatorAssignment_0_1 ) )
            {
            // InternalKExpressions.g:3592:1: ( ( rule__NegExpression__OperatorAssignment_0_1 ) )
            // InternalKExpressions.g:3593:1: ( rule__NegExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // InternalKExpressions.g:3594:1: ( rule__NegExpression__OperatorAssignment_0_1 )
            // InternalKExpressions.g:3594:2: rule__NegExpression__OperatorAssignment_0_1
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
    // InternalKExpressions.g:3604:1: rule__NegExpression__Group_0__2 : rule__NegExpression__Group_0__2__Impl ;
    public final void rule__NegExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3608:1: ( rule__NegExpression__Group_0__2__Impl )
            // InternalKExpressions.g:3609:2: rule__NegExpression__Group_0__2__Impl
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
    // InternalKExpressions.g:3615:1: rule__NegExpression__Group_0__2__Impl : ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) ) ;
    public final void rule__NegExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3619:1: ( ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) ) )
            // InternalKExpressions.g:3620:1: ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) )
            {
            // InternalKExpressions.g:3620:1: ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) )
            // InternalKExpressions.g:3621:1: ( rule__NegExpression__SubExpressionsAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getSubExpressionsAssignment_0_2()); 
            }
            // InternalKExpressions.g:3622:1: ( rule__NegExpression__SubExpressionsAssignment_0_2 )
            // InternalKExpressions.g:3622:2: rule__NegExpression__SubExpressionsAssignment_0_2
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
    // InternalKExpressions.g:3638:1: rule__AtomicExpression__Group_2__0 : rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 ;
    public final void rule__AtomicExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3642:1: ( rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 )
            // InternalKExpressions.g:3643:2: rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1
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
    // InternalKExpressions.g:3650:1: rule__AtomicExpression__Group_2__0__Impl : ( '(' ) ;
    public final void rule__AtomicExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3654:1: ( ( '(' ) )
            // InternalKExpressions.g:3655:1: ( '(' )
            {
            // InternalKExpressions.g:3655:1: ( '(' )
            // InternalKExpressions.g:3656:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:3669:1: rule__AtomicExpression__Group_2__1 : rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2 ;
    public final void rule__AtomicExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3673:1: ( rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2 )
            // InternalKExpressions.g:3674:2: rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2
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
    // InternalKExpressions.g:3681:1: rule__AtomicExpression__Group_2__1__Impl : ( ruleBooleanExpression ) ;
    public final void rule__AtomicExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3685:1: ( ( ruleBooleanExpression ) )
            // InternalKExpressions.g:3686:1: ( ruleBooleanExpression )
            {
            // InternalKExpressions.g:3686:1: ( ruleBooleanExpression )
            // InternalKExpressions.g:3687:1: ruleBooleanExpression
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
    // InternalKExpressions.g:3698:1: rule__AtomicExpression__Group_2__2 : rule__AtomicExpression__Group_2__2__Impl ;
    public final void rule__AtomicExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3702:1: ( rule__AtomicExpression__Group_2__2__Impl )
            // InternalKExpressions.g:3703:2: rule__AtomicExpression__Group_2__2__Impl
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
    // InternalKExpressions.g:3709:1: rule__AtomicExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__AtomicExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3713:1: ( ( ')' ) )
            // InternalKExpressions.g:3714:1: ( ')' )
            {
            // InternalKExpressions.g:3714:1: ( ')' )
            // InternalKExpressions.g:3715:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:3734:1: rule__AtomicValuedExpression__Group_2__0 : rule__AtomicValuedExpression__Group_2__0__Impl rule__AtomicValuedExpression__Group_2__1 ;
    public final void rule__AtomicValuedExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3738:1: ( rule__AtomicValuedExpression__Group_2__0__Impl rule__AtomicValuedExpression__Group_2__1 )
            // InternalKExpressions.g:3739:2: rule__AtomicValuedExpression__Group_2__0__Impl rule__AtomicValuedExpression__Group_2__1
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
    // InternalKExpressions.g:3746:1: rule__AtomicValuedExpression__Group_2__0__Impl : ( ( '(' ) ) ;
    public final void rule__AtomicValuedExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3750:1: ( ( ( '(' ) ) )
            // InternalKExpressions.g:3751:1: ( ( '(' ) )
            {
            // InternalKExpressions.g:3751:1: ( ( '(' ) )
            // InternalKExpressions.g:3752:1: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0()); 
            }
            // InternalKExpressions.g:3753:1: ( '(' )
            // InternalKExpressions.g:3754:2: '('
            {
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalKExpressions.g:3765:1: rule__AtomicValuedExpression__Group_2__1 : rule__AtomicValuedExpression__Group_2__1__Impl rule__AtomicValuedExpression__Group_2__2 ;
    public final void rule__AtomicValuedExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3769:1: ( rule__AtomicValuedExpression__Group_2__1__Impl rule__AtomicValuedExpression__Group_2__2 )
            // InternalKExpressions.g:3770:2: rule__AtomicValuedExpression__Group_2__1__Impl rule__AtomicValuedExpression__Group_2__2
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
    // InternalKExpressions.g:3777:1: rule__AtomicValuedExpression__Group_2__1__Impl : ( ruleValuedExpression ) ;
    public final void rule__AtomicValuedExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3781:1: ( ( ruleValuedExpression ) )
            // InternalKExpressions.g:3782:1: ( ruleValuedExpression )
            {
            // InternalKExpressions.g:3782:1: ( ruleValuedExpression )
            // InternalKExpressions.g:3783:1: ruleValuedExpression
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
    // InternalKExpressions.g:3794:1: rule__AtomicValuedExpression__Group_2__2 : rule__AtomicValuedExpression__Group_2__2__Impl ;
    public final void rule__AtomicValuedExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3798:1: ( rule__AtomicValuedExpression__Group_2__2__Impl )
            // InternalKExpressions.g:3799:2: rule__AtomicValuedExpression__Group_2__2__Impl
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
    // InternalKExpressions.g:3805:1: rule__AtomicValuedExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__AtomicValuedExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3809:1: ( ( ')' ) )
            // InternalKExpressions.g:3810:1: ( ')' )
            {
            // InternalKExpressions.g:3810:1: ( ')' )
            // InternalKExpressions.g:3811:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:3830:1: rule__ValuedObjectTestExpression__Group_0__0 : rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1 ;
    public final void rule__ValuedObjectTestExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3834:1: ( rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1 )
            // InternalKExpressions.g:3835:2: rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1
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
    // InternalKExpressions.g:3842:1: rule__ValuedObjectTestExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3846:1: ( ( () ) )
            // InternalKExpressions.g:3847:1: ( () )
            {
            // InternalKExpressions.g:3847:1: ( () )
            // InternalKExpressions.g:3848:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // InternalKExpressions.g:3849:1: ()
            // InternalKExpressions.g:3851:1: 
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
    // InternalKExpressions.g:3861:1: rule__ValuedObjectTestExpression__Group_0__1 : rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2 ;
    public final void rule__ValuedObjectTestExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3865:1: ( rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2 )
            // InternalKExpressions.g:3866:2: rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2
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
    // InternalKExpressions.g:3873:1: rule__ValuedObjectTestExpression__Group_0__1__Impl : ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3877:1: ( ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) ) )
            // InternalKExpressions.g:3878:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) )
            {
            // InternalKExpressions.g:3878:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) )
            // InternalKExpressions.g:3879:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // InternalKExpressions.g:3880:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 )
            // InternalKExpressions.g:3880:2: rule__ValuedObjectTestExpression__OperatorAssignment_0_1
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
    // InternalKExpressions.g:3890:1: rule__ValuedObjectTestExpression__Group_0__2 : rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3 ;
    public final void rule__ValuedObjectTestExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3894:1: ( rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3 )
            // InternalKExpressions.g:3895:2: rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3
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
    // InternalKExpressions.g:3902:1: rule__ValuedObjectTestExpression__Group_0__2__Impl : ( '(' ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3906:1: ( ( '(' ) )
            // InternalKExpressions.g:3907:1: ( '(' )
            {
            // InternalKExpressions.g:3907:1: ( '(' )
            // InternalKExpressions.g:3908:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:3921:1: rule__ValuedObjectTestExpression__Group_0__3 : rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4 ;
    public final void rule__ValuedObjectTestExpression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3925:1: ( rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4 )
            // InternalKExpressions.g:3926:2: rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4
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
    // InternalKExpressions.g:3933:1: rule__ValuedObjectTestExpression__Group_0__3__Impl : ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3937:1: ( ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) ) )
            // InternalKExpressions.g:3938:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) )
            {
            // InternalKExpressions.g:3938:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) )
            // InternalKExpressions.g:3939:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsAssignment_0_3()); 
            }
            // InternalKExpressions.g:3940:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 )
            // InternalKExpressions.g:3940:2: rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3
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
    // InternalKExpressions.g:3950:1: rule__ValuedObjectTestExpression__Group_0__4 : rule__ValuedObjectTestExpression__Group_0__4__Impl ;
    public final void rule__ValuedObjectTestExpression__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3954:1: ( rule__ValuedObjectTestExpression__Group_0__4__Impl )
            // InternalKExpressions.g:3955:2: rule__ValuedObjectTestExpression__Group_0__4__Impl
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
    // InternalKExpressions.g:3961:1: rule__ValuedObjectTestExpression__Group_0__4__Impl : ( ')' ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3965:1: ( ( ')' ) )
            // InternalKExpressions.g:3966:1: ( ')' )
            {
            // InternalKExpressions.g:3966:1: ( ')' )
            // InternalKExpressions.g:3967:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4()); 
            }
            match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:3990:1: rule__ValuedObjectTestExpression__Group_1__0 : rule__ValuedObjectTestExpression__Group_1__0__Impl rule__ValuedObjectTestExpression__Group_1__1 ;
    public final void rule__ValuedObjectTestExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3994:1: ( rule__ValuedObjectTestExpression__Group_1__0__Impl rule__ValuedObjectTestExpression__Group_1__1 )
            // InternalKExpressions.g:3995:2: rule__ValuedObjectTestExpression__Group_1__0__Impl rule__ValuedObjectTestExpression__Group_1__1
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
    // InternalKExpressions.g:4002:1: rule__ValuedObjectTestExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ValuedObjectTestExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4006:1: ( ( () ) )
            // InternalKExpressions.g:4007:1: ( () )
            {
            // InternalKExpressions.g:4007:1: ( () )
            // InternalKExpressions.g:4008:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorExpressionAction_1_0()); 
            }
            // InternalKExpressions.g:4009:1: ()
            // InternalKExpressions.g:4011:1: 
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
    // InternalKExpressions.g:4021:1: rule__ValuedObjectTestExpression__Group_1__1 : rule__ValuedObjectTestExpression__Group_1__1__Impl rule__ValuedObjectTestExpression__Group_1__2 ;
    public final void rule__ValuedObjectTestExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4025:1: ( rule__ValuedObjectTestExpression__Group_1__1__Impl rule__ValuedObjectTestExpression__Group_1__2 )
            // InternalKExpressions.g:4026:2: rule__ValuedObjectTestExpression__Group_1__1__Impl rule__ValuedObjectTestExpression__Group_1__2
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
    // InternalKExpressions.g:4033:1: rule__ValuedObjectTestExpression__Group_1__1__Impl : ( ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4037:1: ( ( ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 ) ) )
            // InternalKExpressions.g:4038:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKExpressions.g:4038:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 ) )
            // InternalKExpressions.g:4039:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKExpressions.g:4040:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 )
            // InternalKExpressions.g:4040:2: rule__ValuedObjectTestExpression__OperatorAssignment_1_1
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
    // InternalKExpressions.g:4050:1: rule__ValuedObjectTestExpression__Group_1__2 : rule__ValuedObjectTestExpression__Group_1__2__Impl ;
    public final void rule__ValuedObjectTestExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4054:1: ( rule__ValuedObjectTestExpression__Group_1__2__Impl )
            // InternalKExpressions.g:4055:2: rule__ValuedObjectTestExpression__Group_1__2__Impl
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
    // InternalKExpressions.g:4061:1: rule__ValuedObjectTestExpression__Group_1__2__Impl : ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4065:1: ( ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 ) ) )
            // InternalKExpressions.g:4066:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 ) )
            {
            // InternalKExpressions.g:4066:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 ) )
            // InternalKExpressions.g:4067:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // InternalKExpressions.g:4068:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 )
            // InternalKExpressions.g:4068:2: rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2
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
    // InternalKExpressions.g:4084:1: rule__TextExpression__Group__0 : rule__TextExpression__Group__0__Impl rule__TextExpression__Group__1 ;
    public final void rule__TextExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4088:1: ( rule__TextExpression__Group__0__Impl rule__TextExpression__Group__1 )
            // InternalKExpressions.g:4089:2: rule__TextExpression__Group__0__Impl rule__TextExpression__Group__1
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
    // InternalKExpressions.g:4096:1: rule__TextExpression__Group__0__Impl : ( ( rule__TextExpression__CodeAssignment_0 ) ) ;
    public final void rule__TextExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4100:1: ( ( ( rule__TextExpression__CodeAssignment_0 ) ) )
            // InternalKExpressions.g:4101:1: ( ( rule__TextExpression__CodeAssignment_0 ) )
            {
            // InternalKExpressions.g:4101:1: ( ( rule__TextExpression__CodeAssignment_0 ) )
            // InternalKExpressions.g:4102:1: ( rule__TextExpression__CodeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getCodeAssignment_0()); 
            }
            // InternalKExpressions.g:4103:1: ( rule__TextExpression__CodeAssignment_0 )
            // InternalKExpressions.g:4103:2: rule__TextExpression__CodeAssignment_0
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
    // InternalKExpressions.g:4113:1: rule__TextExpression__Group__1 : rule__TextExpression__Group__1__Impl ;
    public final void rule__TextExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4117:1: ( rule__TextExpression__Group__1__Impl )
            // InternalKExpressions.g:4118:2: rule__TextExpression__Group__1__Impl
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
    // InternalKExpressions.g:4124:1: rule__TextExpression__Group__1__Impl : ( ( rule__TextExpression__Group_1__0 )? ) ;
    public final void rule__TextExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4128:1: ( ( ( rule__TextExpression__Group_1__0 )? ) )
            // InternalKExpressions.g:4129:1: ( ( rule__TextExpression__Group_1__0 )? )
            {
            // InternalKExpressions.g:4129:1: ( ( rule__TextExpression__Group_1__0 )? )
            // InternalKExpressions.g:4130:1: ( rule__TextExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:4131:1: ( rule__TextExpression__Group_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==43) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalKExpressions.g:4131:2: rule__TextExpression__Group_1__0
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
    // InternalKExpressions.g:4145:1: rule__TextExpression__Group_1__0 : rule__TextExpression__Group_1__0__Impl rule__TextExpression__Group_1__1 ;
    public final void rule__TextExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4149:1: ( rule__TextExpression__Group_1__0__Impl rule__TextExpression__Group_1__1 )
            // InternalKExpressions.g:4150:2: rule__TextExpression__Group_1__0__Impl rule__TextExpression__Group_1__1
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
    // InternalKExpressions.g:4157:1: rule__TextExpression__Group_1__0__Impl : ( '(' ) ;
    public final void rule__TextExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4161:1: ( ( '(' ) )
            // InternalKExpressions.g:4162:1: ( '(' )
            {
            // InternalKExpressions.g:4162:1: ( '(' )
            // InternalKExpressions.g:4163:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:4176:1: rule__TextExpression__Group_1__1 : rule__TextExpression__Group_1__1__Impl rule__TextExpression__Group_1__2 ;
    public final void rule__TextExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4180:1: ( rule__TextExpression__Group_1__1__Impl rule__TextExpression__Group_1__2 )
            // InternalKExpressions.g:4181:2: rule__TextExpression__Group_1__1__Impl rule__TextExpression__Group_1__2
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
    // InternalKExpressions.g:4188:1: rule__TextExpression__Group_1__1__Impl : ( ( rule__TextExpression__TypeAssignment_1_1 ) ) ;
    public final void rule__TextExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4192:1: ( ( ( rule__TextExpression__TypeAssignment_1_1 ) ) )
            // InternalKExpressions.g:4193:1: ( ( rule__TextExpression__TypeAssignment_1_1 ) )
            {
            // InternalKExpressions.g:4193:1: ( ( rule__TextExpression__TypeAssignment_1_1 ) )
            // InternalKExpressions.g:4194:1: ( rule__TextExpression__TypeAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getTypeAssignment_1_1()); 
            }
            // InternalKExpressions.g:4195:1: ( rule__TextExpression__TypeAssignment_1_1 )
            // InternalKExpressions.g:4195:2: rule__TextExpression__TypeAssignment_1_1
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
    // InternalKExpressions.g:4205:1: rule__TextExpression__Group_1__2 : rule__TextExpression__Group_1__2__Impl ;
    public final void rule__TextExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4209:1: ( rule__TextExpression__Group_1__2__Impl )
            // InternalKExpressions.g:4210:2: rule__TextExpression__Group_1__2__Impl
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
    // InternalKExpressions.g:4216:1: rule__TextExpression__Group_1__2__Impl : ( ')' ) ;
    public final void rule__TextExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4220:1: ( ( ')' ) )
            // InternalKExpressions.g:4221:1: ( ')' )
            {
            // InternalKExpressions.g:4221:1: ( ')' )
            // InternalKExpressions.g:4222:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:4241:1: rule__ISignal__Group__0 : rule__ISignal__Group__0__Impl rule__ISignal__Group__1 ;
    public final void rule__ISignal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4245:1: ( rule__ISignal__Group__0__Impl rule__ISignal__Group__1 )
            // InternalKExpressions.g:4246:2: rule__ISignal__Group__0__Impl rule__ISignal__Group__1
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
    // InternalKExpressions.g:4253:1: rule__ISignal__Group__0__Impl : ( ( rule__ISignal__NameAssignment_0 ) ) ;
    public final void rule__ISignal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4257:1: ( ( ( rule__ISignal__NameAssignment_0 ) ) )
            // InternalKExpressions.g:4258:1: ( ( rule__ISignal__NameAssignment_0 ) )
            {
            // InternalKExpressions.g:4258:1: ( ( rule__ISignal__NameAssignment_0 ) )
            // InternalKExpressions.g:4259:1: ( rule__ISignal__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getISignalAccess().getNameAssignment_0()); 
            }
            // InternalKExpressions.g:4260:1: ( rule__ISignal__NameAssignment_0 )
            // InternalKExpressions.g:4260:2: rule__ISignal__NameAssignment_0
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
    // InternalKExpressions.g:4270:1: rule__ISignal__Group__1 : rule__ISignal__Group__1__Impl ;
    public final void rule__ISignal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4274:1: ( rule__ISignal__Group__1__Impl )
            // InternalKExpressions.g:4275:2: rule__ISignal__Group__1__Impl
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
    // InternalKExpressions.g:4281:1: rule__ISignal__Group__1__Impl : ( ( rule__ISignal__ChannelDescrAssignment_1 )? ) ;
    public final void rule__ISignal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4285:1: ( ( ( rule__ISignal__ChannelDescrAssignment_1 )? ) )
            // InternalKExpressions.g:4286:1: ( ( rule__ISignal__ChannelDescrAssignment_1 )? )
            {
            // InternalKExpressions.g:4286:1: ( ( rule__ISignal__ChannelDescrAssignment_1 )? )
            // InternalKExpressions.g:4287:1: ( rule__ISignal__ChannelDescrAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getISignalAccess().getChannelDescrAssignment_1()); 
            }
            // InternalKExpressions.g:4288:1: ( rule__ISignal__ChannelDescrAssignment_1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==43||(LA29_0>=51 && LA29_0<=52)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalKExpressions.g:4288:2: rule__ISignal__ChannelDescrAssignment_1
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
    // InternalKExpressions.g:4302:1: rule__InterfaceSignalDecl__Group_0__0 : rule__InterfaceSignalDecl__Group_0__0__Impl rule__InterfaceSignalDecl__Group_0__1 ;
    public final void rule__InterfaceSignalDecl__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4306:1: ( rule__InterfaceSignalDecl__Group_0__0__Impl rule__InterfaceSignalDecl__Group_0__1 )
            // InternalKExpressions.g:4307:2: rule__InterfaceSignalDecl__Group_0__0__Impl rule__InterfaceSignalDecl__Group_0__1
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
    // InternalKExpressions.g:4314:1: rule__InterfaceSignalDecl__Group_0__0__Impl : ( () ) ;
    public final void rule__InterfaceSignalDecl__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4318:1: ( ( () ) )
            // InternalKExpressions.g:4319:1: ( () )
            {
            // InternalKExpressions.g:4319:1: ( () )
            // InternalKExpressions.g:4320:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getInputAction_0_0()); 
            }
            // InternalKExpressions.g:4321:1: ()
            // InternalKExpressions.g:4323:1: 
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
    // InternalKExpressions.g:4333:1: rule__InterfaceSignalDecl__Group_0__1 : rule__InterfaceSignalDecl__Group_0__1__Impl rule__InterfaceSignalDecl__Group_0__2 ;
    public final void rule__InterfaceSignalDecl__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4337:1: ( rule__InterfaceSignalDecl__Group_0__1__Impl rule__InterfaceSignalDecl__Group_0__2 )
            // InternalKExpressions.g:4338:2: rule__InterfaceSignalDecl__Group_0__1__Impl rule__InterfaceSignalDecl__Group_0__2
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
    // InternalKExpressions.g:4345:1: rule__InterfaceSignalDecl__Group_0__1__Impl : ( 'input' ) ;
    public final void rule__InterfaceSignalDecl__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4349:1: ( ( 'input' ) )
            // InternalKExpressions.g:4350:1: ( 'input' )
            {
            // InternalKExpressions.g:4350:1: ( 'input' )
            // InternalKExpressions.g:4351:1: 'input'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getInputKeyword_0_1()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:4364:1: rule__InterfaceSignalDecl__Group_0__2 : rule__InterfaceSignalDecl__Group_0__2__Impl rule__InterfaceSignalDecl__Group_0__3 ;
    public final void rule__InterfaceSignalDecl__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4368:1: ( rule__InterfaceSignalDecl__Group_0__2__Impl rule__InterfaceSignalDecl__Group_0__3 )
            // InternalKExpressions.g:4369:2: rule__InterfaceSignalDecl__Group_0__2__Impl rule__InterfaceSignalDecl__Group_0__3
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
    // InternalKExpressions.g:4376:1: rule__InterfaceSignalDecl__Group_0__2__Impl : ( ( rule__InterfaceSignalDecl__SignalsAssignment_0_2 ) ) ;
    public final void rule__InterfaceSignalDecl__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4380:1: ( ( ( rule__InterfaceSignalDecl__SignalsAssignment_0_2 ) ) )
            // InternalKExpressions.g:4381:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_0_2 ) )
            {
            // InternalKExpressions.g:4381:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_0_2 ) )
            // InternalKExpressions.g:4382:1: ( rule__InterfaceSignalDecl__SignalsAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSignalsAssignment_0_2()); 
            }
            // InternalKExpressions.g:4383:1: ( rule__InterfaceSignalDecl__SignalsAssignment_0_2 )
            // InternalKExpressions.g:4383:2: rule__InterfaceSignalDecl__SignalsAssignment_0_2
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
    // InternalKExpressions.g:4393:1: rule__InterfaceSignalDecl__Group_0__3 : rule__InterfaceSignalDecl__Group_0__3__Impl rule__InterfaceSignalDecl__Group_0__4 ;
    public final void rule__InterfaceSignalDecl__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4397:1: ( rule__InterfaceSignalDecl__Group_0__3__Impl rule__InterfaceSignalDecl__Group_0__4 )
            // InternalKExpressions.g:4398:2: rule__InterfaceSignalDecl__Group_0__3__Impl rule__InterfaceSignalDecl__Group_0__4
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
    // InternalKExpressions.g:4405:1: rule__InterfaceSignalDecl__Group_0__3__Impl : ( ( rule__InterfaceSignalDecl__Group_0_3__0 )* ) ;
    public final void rule__InterfaceSignalDecl__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4409:1: ( ( ( rule__InterfaceSignalDecl__Group_0_3__0 )* ) )
            // InternalKExpressions.g:4410:1: ( ( rule__InterfaceSignalDecl__Group_0_3__0 )* )
            {
            // InternalKExpressions.g:4410:1: ( ( rule__InterfaceSignalDecl__Group_0_3__0 )* )
            // InternalKExpressions.g:4411:1: ( rule__InterfaceSignalDecl__Group_0_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getGroup_0_3()); 
            }
            // InternalKExpressions.g:4412:1: ( rule__InterfaceSignalDecl__Group_0_3__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==47) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalKExpressions.g:4412:2: rule__InterfaceSignalDecl__Group_0_3__0
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
    // InternalKExpressions.g:4422:1: rule__InterfaceSignalDecl__Group_0__4 : rule__InterfaceSignalDecl__Group_0__4__Impl ;
    public final void rule__InterfaceSignalDecl__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4426:1: ( rule__InterfaceSignalDecl__Group_0__4__Impl )
            // InternalKExpressions.g:4427:2: rule__InterfaceSignalDecl__Group_0__4__Impl
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
    // InternalKExpressions.g:4433:1: rule__InterfaceSignalDecl__Group_0__4__Impl : ( ';' ) ;
    public final void rule__InterfaceSignalDecl__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4437:1: ( ( ';' ) )
            // InternalKExpressions.g:4438:1: ( ';' )
            {
            // InternalKExpressions.g:4438:1: ( ';' )
            // InternalKExpressions.g:4439:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSemicolonKeyword_0_4()); 
            }
            match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:4462:1: rule__InterfaceSignalDecl__Group_0_3__0 : rule__InterfaceSignalDecl__Group_0_3__0__Impl rule__InterfaceSignalDecl__Group_0_3__1 ;
    public final void rule__InterfaceSignalDecl__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4466:1: ( rule__InterfaceSignalDecl__Group_0_3__0__Impl rule__InterfaceSignalDecl__Group_0_3__1 )
            // InternalKExpressions.g:4467:2: rule__InterfaceSignalDecl__Group_0_3__0__Impl rule__InterfaceSignalDecl__Group_0_3__1
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
    // InternalKExpressions.g:4474:1: rule__InterfaceSignalDecl__Group_0_3__0__Impl : ( ',' ) ;
    public final void rule__InterfaceSignalDecl__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4478:1: ( ( ',' ) )
            // InternalKExpressions.g:4479:1: ( ',' )
            {
            // InternalKExpressions.g:4479:1: ( ',' )
            // InternalKExpressions.g:4480:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getCommaKeyword_0_3_0()); 
            }
            match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:4493:1: rule__InterfaceSignalDecl__Group_0_3__1 : rule__InterfaceSignalDecl__Group_0_3__1__Impl ;
    public final void rule__InterfaceSignalDecl__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4497:1: ( rule__InterfaceSignalDecl__Group_0_3__1__Impl )
            // InternalKExpressions.g:4498:2: rule__InterfaceSignalDecl__Group_0_3__1__Impl
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
    // InternalKExpressions.g:4504:1: rule__InterfaceSignalDecl__Group_0_3__1__Impl : ( ( rule__InterfaceSignalDecl__SignalsAssignment_0_3_1 ) ) ;
    public final void rule__InterfaceSignalDecl__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4508:1: ( ( ( rule__InterfaceSignalDecl__SignalsAssignment_0_3_1 ) ) )
            // InternalKExpressions.g:4509:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_0_3_1 ) )
            {
            // InternalKExpressions.g:4509:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_0_3_1 ) )
            // InternalKExpressions.g:4510:1: ( rule__InterfaceSignalDecl__SignalsAssignment_0_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSignalsAssignment_0_3_1()); 
            }
            // InternalKExpressions.g:4511:1: ( rule__InterfaceSignalDecl__SignalsAssignment_0_3_1 )
            // InternalKExpressions.g:4511:2: rule__InterfaceSignalDecl__SignalsAssignment_0_3_1
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
    // InternalKExpressions.g:4525:1: rule__InterfaceSignalDecl__Group_1__0 : rule__InterfaceSignalDecl__Group_1__0__Impl rule__InterfaceSignalDecl__Group_1__1 ;
    public final void rule__InterfaceSignalDecl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4529:1: ( rule__InterfaceSignalDecl__Group_1__0__Impl rule__InterfaceSignalDecl__Group_1__1 )
            // InternalKExpressions.g:4530:2: rule__InterfaceSignalDecl__Group_1__0__Impl rule__InterfaceSignalDecl__Group_1__1
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
    // InternalKExpressions.g:4537:1: rule__InterfaceSignalDecl__Group_1__0__Impl : ( () ) ;
    public final void rule__InterfaceSignalDecl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4541:1: ( ( () ) )
            // InternalKExpressions.g:4542:1: ( () )
            {
            // InternalKExpressions.g:4542:1: ( () )
            // InternalKExpressions.g:4543:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getOutputAction_1_0()); 
            }
            // InternalKExpressions.g:4544:1: ()
            // InternalKExpressions.g:4546:1: 
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
    // InternalKExpressions.g:4556:1: rule__InterfaceSignalDecl__Group_1__1 : rule__InterfaceSignalDecl__Group_1__1__Impl rule__InterfaceSignalDecl__Group_1__2 ;
    public final void rule__InterfaceSignalDecl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4560:1: ( rule__InterfaceSignalDecl__Group_1__1__Impl rule__InterfaceSignalDecl__Group_1__2 )
            // InternalKExpressions.g:4561:2: rule__InterfaceSignalDecl__Group_1__1__Impl rule__InterfaceSignalDecl__Group_1__2
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
    // InternalKExpressions.g:4568:1: rule__InterfaceSignalDecl__Group_1__1__Impl : ( 'output' ) ;
    public final void rule__InterfaceSignalDecl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4572:1: ( ( 'output' ) )
            // InternalKExpressions.g:4573:1: ( 'output' )
            {
            // InternalKExpressions.g:4573:1: ( 'output' )
            // InternalKExpressions.g:4574:1: 'output'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getOutputKeyword_1_1()); 
            }
            match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:4587:1: rule__InterfaceSignalDecl__Group_1__2 : rule__InterfaceSignalDecl__Group_1__2__Impl rule__InterfaceSignalDecl__Group_1__3 ;
    public final void rule__InterfaceSignalDecl__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4591:1: ( rule__InterfaceSignalDecl__Group_1__2__Impl rule__InterfaceSignalDecl__Group_1__3 )
            // InternalKExpressions.g:4592:2: rule__InterfaceSignalDecl__Group_1__2__Impl rule__InterfaceSignalDecl__Group_1__3
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
    // InternalKExpressions.g:4599:1: rule__InterfaceSignalDecl__Group_1__2__Impl : ( ( rule__InterfaceSignalDecl__SignalsAssignment_1_2 ) ) ;
    public final void rule__InterfaceSignalDecl__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4603:1: ( ( ( rule__InterfaceSignalDecl__SignalsAssignment_1_2 ) ) )
            // InternalKExpressions.g:4604:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_1_2 ) )
            {
            // InternalKExpressions.g:4604:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_1_2 ) )
            // InternalKExpressions.g:4605:1: ( rule__InterfaceSignalDecl__SignalsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSignalsAssignment_1_2()); 
            }
            // InternalKExpressions.g:4606:1: ( rule__InterfaceSignalDecl__SignalsAssignment_1_2 )
            // InternalKExpressions.g:4606:2: rule__InterfaceSignalDecl__SignalsAssignment_1_2
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
    // InternalKExpressions.g:4616:1: rule__InterfaceSignalDecl__Group_1__3 : rule__InterfaceSignalDecl__Group_1__3__Impl rule__InterfaceSignalDecl__Group_1__4 ;
    public final void rule__InterfaceSignalDecl__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4620:1: ( rule__InterfaceSignalDecl__Group_1__3__Impl rule__InterfaceSignalDecl__Group_1__4 )
            // InternalKExpressions.g:4621:2: rule__InterfaceSignalDecl__Group_1__3__Impl rule__InterfaceSignalDecl__Group_1__4
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
    // InternalKExpressions.g:4628:1: rule__InterfaceSignalDecl__Group_1__3__Impl : ( ( rule__InterfaceSignalDecl__Group_1_3__0 )* ) ;
    public final void rule__InterfaceSignalDecl__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4632:1: ( ( ( rule__InterfaceSignalDecl__Group_1_3__0 )* ) )
            // InternalKExpressions.g:4633:1: ( ( rule__InterfaceSignalDecl__Group_1_3__0 )* )
            {
            // InternalKExpressions.g:4633:1: ( ( rule__InterfaceSignalDecl__Group_1_3__0 )* )
            // InternalKExpressions.g:4634:1: ( rule__InterfaceSignalDecl__Group_1_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getGroup_1_3()); 
            }
            // InternalKExpressions.g:4635:1: ( rule__InterfaceSignalDecl__Group_1_3__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==47) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalKExpressions.g:4635:2: rule__InterfaceSignalDecl__Group_1_3__0
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
    // InternalKExpressions.g:4645:1: rule__InterfaceSignalDecl__Group_1__4 : rule__InterfaceSignalDecl__Group_1__4__Impl ;
    public final void rule__InterfaceSignalDecl__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4649:1: ( rule__InterfaceSignalDecl__Group_1__4__Impl )
            // InternalKExpressions.g:4650:2: rule__InterfaceSignalDecl__Group_1__4__Impl
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
    // InternalKExpressions.g:4656:1: rule__InterfaceSignalDecl__Group_1__4__Impl : ( ';' ) ;
    public final void rule__InterfaceSignalDecl__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4660:1: ( ( ';' ) )
            // InternalKExpressions.g:4661:1: ( ';' )
            {
            // InternalKExpressions.g:4661:1: ( ';' )
            // InternalKExpressions.g:4662:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSemicolonKeyword_1_4()); 
            }
            match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:4685:1: rule__InterfaceSignalDecl__Group_1_3__0 : rule__InterfaceSignalDecl__Group_1_3__0__Impl rule__InterfaceSignalDecl__Group_1_3__1 ;
    public final void rule__InterfaceSignalDecl__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4689:1: ( rule__InterfaceSignalDecl__Group_1_3__0__Impl rule__InterfaceSignalDecl__Group_1_3__1 )
            // InternalKExpressions.g:4690:2: rule__InterfaceSignalDecl__Group_1_3__0__Impl rule__InterfaceSignalDecl__Group_1_3__1
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
    // InternalKExpressions.g:4697:1: rule__InterfaceSignalDecl__Group_1_3__0__Impl : ( ',' ) ;
    public final void rule__InterfaceSignalDecl__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4701:1: ( ( ',' ) )
            // InternalKExpressions.g:4702:1: ( ',' )
            {
            // InternalKExpressions.g:4702:1: ( ',' )
            // InternalKExpressions.g:4703:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getCommaKeyword_1_3_0()); 
            }
            match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:4716:1: rule__InterfaceSignalDecl__Group_1_3__1 : rule__InterfaceSignalDecl__Group_1_3__1__Impl ;
    public final void rule__InterfaceSignalDecl__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4720:1: ( rule__InterfaceSignalDecl__Group_1_3__1__Impl )
            // InternalKExpressions.g:4721:2: rule__InterfaceSignalDecl__Group_1_3__1__Impl
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
    // InternalKExpressions.g:4727:1: rule__InterfaceSignalDecl__Group_1_3__1__Impl : ( ( rule__InterfaceSignalDecl__SignalsAssignment_1_3_1 ) ) ;
    public final void rule__InterfaceSignalDecl__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4731:1: ( ( ( rule__InterfaceSignalDecl__SignalsAssignment_1_3_1 ) ) )
            // InternalKExpressions.g:4732:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_1_3_1 ) )
            {
            // InternalKExpressions.g:4732:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_1_3_1 ) )
            // InternalKExpressions.g:4733:1: ( rule__InterfaceSignalDecl__SignalsAssignment_1_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSignalsAssignment_1_3_1()); 
            }
            // InternalKExpressions.g:4734:1: ( rule__InterfaceSignalDecl__SignalsAssignment_1_3_1 )
            // InternalKExpressions.g:4734:2: rule__InterfaceSignalDecl__SignalsAssignment_1_3_1
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
    // InternalKExpressions.g:4748:1: rule__InterfaceSignalDecl__Group_2__0 : rule__InterfaceSignalDecl__Group_2__0__Impl rule__InterfaceSignalDecl__Group_2__1 ;
    public final void rule__InterfaceSignalDecl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4752:1: ( rule__InterfaceSignalDecl__Group_2__0__Impl rule__InterfaceSignalDecl__Group_2__1 )
            // InternalKExpressions.g:4753:2: rule__InterfaceSignalDecl__Group_2__0__Impl rule__InterfaceSignalDecl__Group_2__1
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
    // InternalKExpressions.g:4760:1: rule__InterfaceSignalDecl__Group_2__0__Impl : ( () ) ;
    public final void rule__InterfaceSignalDecl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4764:1: ( ( () ) )
            // InternalKExpressions.g:4765:1: ( () )
            {
            // InternalKExpressions.g:4765:1: ( () )
            // InternalKExpressions.g:4766:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getInputOutputAction_2_0()); 
            }
            // InternalKExpressions.g:4767:1: ()
            // InternalKExpressions.g:4769:1: 
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
    // InternalKExpressions.g:4779:1: rule__InterfaceSignalDecl__Group_2__1 : rule__InterfaceSignalDecl__Group_2__1__Impl rule__InterfaceSignalDecl__Group_2__2 ;
    public final void rule__InterfaceSignalDecl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4783:1: ( rule__InterfaceSignalDecl__Group_2__1__Impl rule__InterfaceSignalDecl__Group_2__2 )
            // InternalKExpressions.g:4784:2: rule__InterfaceSignalDecl__Group_2__1__Impl rule__InterfaceSignalDecl__Group_2__2
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
    // InternalKExpressions.g:4791:1: rule__InterfaceSignalDecl__Group_2__1__Impl : ( 'inputoutput' ) ;
    public final void rule__InterfaceSignalDecl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4795:1: ( ( 'inputoutput' ) )
            // InternalKExpressions.g:4796:1: ( 'inputoutput' )
            {
            // InternalKExpressions.g:4796:1: ( 'inputoutput' )
            // InternalKExpressions.g:4797:1: 'inputoutput'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getInputoutputKeyword_2_1()); 
            }
            match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:4810:1: rule__InterfaceSignalDecl__Group_2__2 : rule__InterfaceSignalDecl__Group_2__2__Impl rule__InterfaceSignalDecl__Group_2__3 ;
    public final void rule__InterfaceSignalDecl__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4814:1: ( rule__InterfaceSignalDecl__Group_2__2__Impl rule__InterfaceSignalDecl__Group_2__3 )
            // InternalKExpressions.g:4815:2: rule__InterfaceSignalDecl__Group_2__2__Impl rule__InterfaceSignalDecl__Group_2__3
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
    // InternalKExpressions.g:4822:1: rule__InterfaceSignalDecl__Group_2__2__Impl : ( ( rule__InterfaceSignalDecl__SignalsAssignment_2_2 ) ) ;
    public final void rule__InterfaceSignalDecl__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4826:1: ( ( ( rule__InterfaceSignalDecl__SignalsAssignment_2_2 ) ) )
            // InternalKExpressions.g:4827:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_2_2 ) )
            {
            // InternalKExpressions.g:4827:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_2_2 ) )
            // InternalKExpressions.g:4828:1: ( rule__InterfaceSignalDecl__SignalsAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSignalsAssignment_2_2()); 
            }
            // InternalKExpressions.g:4829:1: ( rule__InterfaceSignalDecl__SignalsAssignment_2_2 )
            // InternalKExpressions.g:4829:2: rule__InterfaceSignalDecl__SignalsAssignment_2_2
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
    // InternalKExpressions.g:4839:1: rule__InterfaceSignalDecl__Group_2__3 : rule__InterfaceSignalDecl__Group_2__3__Impl rule__InterfaceSignalDecl__Group_2__4 ;
    public final void rule__InterfaceSignalDecl__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4843:1: ( rule__InterfaceSignalDecl__Group_2__3__Impl rule__InterfaceSignalDecl__Group_2__4 )
            // InternalKExpressions.g:4844:2: rule__InterfaceSignalDecl__Group_2__3__Impl rule__InterfaceSignalDecl__Group_2__4
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
    // InternalKExpressions.g:4851:1: rule__InterfaceSignalDecl__Group_2__3__Impl : ( ( rule__InterfaceSignalDecl__Group_2_3__0 )* ) ;
    public final void rule__InterfaceSignalDecl__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4855:1: ( ( ( rule__InterfaceSignalDecl__Group_2_3__0 )* ) )
            // InternalKExpressions.g:4856:1: ( ( rule__InterfaceSignalDecl__Group_2_3__0 )* )
            {
            // InternalKExpressions.g:4856:1: ( ( rule__InterfaceSignalDecl__Group_2_3__0 )* )
            // InternalKExpressions.g:4857:1: ( rule__InterfaceSignalDecl__Group_2_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getGroup_2_3()); 
            }
            // InternalKExpressions.g:4858:1: ( rule__InterfaceSignalDecl__Group_2_3__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==47) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalKExpressions.g:4858:2: rule__InterfaceSignalDecl__Group_2_3__0
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
    // InternalKExpressions.g:4868:1: rule__InterfaceSignalDecl__Group_2__4 : rule__InterfaceSignalDecl__Group_2__4__Impl ;
    public final void rule__InterfaceSignalDecl__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4872:1: ( rule__InterfaceSignalDecl__Group_2__4__Impl )
            // InternalKExpressions.g:4873:2: rule__InterfaceSignalDecl__Group_2__4__Impl
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
    // InternalKExpressions.g:4879:1: rule__InterfaceSignalDecl__Group_2__4__Impl : ( ';' ) ;
    public final void rule__InterfaceSignalDecl__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4883:1: ( ( ';' ) )
            // InternalKExpressions.g:4884:1: ( ';' )
            {
            // InternalKExpressions.g:4884:1: ( ';' )
            // InternalKExpressions.g:4885:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSemicolonKeyword_2_4()); 
            }
            match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:4908:1: rule__InterfaceSignalDecl__Group_2_3__0 : rule__InterfaceSignalDecl__Group_2_3__0__Impl rule__InterfaceSignalDecl__Group_2_3__1 ;
    public final void rule__InterfaceSignalDecl__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4912:1: ( rule__InterfaceSignalDecl__Group_2_3__0__Impl rule__InterfaceSignalDecl__Group_2_3__1 )
            // InternalKExpressions.g:4913:2: rule__InterfaceSignalDecl__Group_2_3__0__Impl rule__InterfaceSignalDecl__Group_2_3__1
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
    // InternalKExpressions.g:4920:1: rule__InterfaceSignalDecl__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__InterfaceSignalDecl__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4924:1: ( ( ',' ) )
            // InternalKExpressions.g:4925:1: ( ',' )
            {
            // InternalKExpressions.g:4925:1: ( ',' )
            // InternalKExpressions.g:4926:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getCommaKeyword_2_3_0()); 
            }
            match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:4939:1: rule__InterfaceSignalDecl__Group_2_3__1 : rule__InterfaceSignalDecl__Group_2_3__1__Impl ;
    public final void rule__InterfaceSignalDecl__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4943:1: ( rule__InterfaceSignalDecl__Group_2_3__1__Impl )
            // InternalKExpressions.g:4944:2: rule__InterfaceSignalDecl__Group_2_3__1__Impl
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
    // InternalKExpressions.g:4950:1: rule__InterfaceSignalDecl__Group_2_3__1__Impl : ( ( rule__InterfaceSignalDecl__SignalsAssignment_2_3_1 ) ) ;
    public final void rule__InterfaceSignalDecl__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4954:1: ( ( ( rule__InterfaceSignalDecl__SignalsAssignment_2_3_1 ) ) )
            // InternalKExpressions.g:4955:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_2_3_1 ) )
            {
            // InternalKExpressions.g:4955:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_2_3_1 ) )
            // InternalKExpressions.g:4956:1: ( rule__InterfaceSignalDecl__SignalsAssignment_2_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSignalsAssignment_2_3_1()); 
            }
            // InternalKExpressions.g:4957:1: ( rule__InterfaceSignalDecl__SignalsAssignment_2_3_1 )
            // InternalKExpressions.g:4957:2: rule__InterfaceSignalDecl__SignalsAssignment_2_3_1
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
    // InternalKExpressions.g:4971:1: rule__InterfaceSignalDecl__Group_3__0 : rule__InterfaceSignalDecl__Group_3__0__Impl rule__InterfaceSignalDecl__Group_3__1 ;
    public final void rule__InterfaceSignalDecl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4975:1: ( rule__InterfaceSignalDecl__Group_3__0__Impl rule__InterfaceSignalDecl__Group_3__1 )
            // InternalKExpressions.g:4976:2: rule__InterfaceSignalDecl__Group_3__0__Impl rule__InterfaceSignalDecl__Group_3__1
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
    // InternalKExpressions.g:4983:1: rule__InterfaceSignalDecl__Group_3__0__Impl : ( () ) ;
    public final void rule__InterfaceSignalDecl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4987:1: ( ( () ) )
            // InternalKExpressions.g:4988:1: ( () )
            {
            // InternalKExpressions.g:4988:1: ( () )
            // InternalKExpressions.g:4989:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getReturnAction_3_0()); 
            }
            // InternalKExpressions.g:4990:1: ()
            // InternalKExpressions.g:4992:1: 
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
    // InternalKExpressions.g:5002:1: rule__InterfaceSignalDecl__Group_3__1 : rule__InterfaceSignalDecl__Group_3__1__Impl rule__InterfaceSignalDecl__Group_3__2 ;
    public final void rule__InterfaceSignalDecl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5006:1: ( rule__InterfaceSignalDecl__Group_3__1__Impl rule__InterfaceSignalDecl__Group_3__2 )
            // InternalKExpressions.g:5007:2: rule__InterfaceSignalDecl__Group_3__1__Impl rule__InterfaceSignalDecl__Group_3__2
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
    // InternalKExpressions.g:5014:1: rule__InterfaceSignalDecl__Group_3__1__Impl : ( 'return' ) ;
    public final void rule__InterfaceSignalDecl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5018:1: ( ( 'return' ) )
            // InternalKExpressions.g:5019:1: ( 'return' )
            {
            // InternalKExpressions.g:5019:1: ( 'return' )
            // InternalKExpressions.g:5020:1: 'return'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getReturnKeyword_3_1()); 
            }
            match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:5033:1: rule__InterfaceSignalDecl__Group_3__2 : rule__InterfaceSignalDecl__Group_3__2__Impl rule__InterfaceSignalDecl__Group_3__3 ;
    public final void rule__InterfaceSignalDecl__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5037:1: ( rule__InterfaceSignalDecl__Group_3__2__Impl rule__InterfaceSignalDecl__Group_3__3 )
            // InternalKExpressions.g:5038:2: rule__InterfaceSignalDecl__Group_3__2__Impl rule__InterfaceSignalDecl__Group_3__3
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
    // InternalKExpressions.g:5045:1: rule__InterfaceSignalDecl__Group_3__2__Impl : ( ( rule__InterfaceSignalDecl__SignalsAssignment_3_2 ) ) ;
    public final void rule__InterfaceSignalDecl__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5049:1: ( ( ( rule__InterfaceSignalDecl__SignalsAssignment_3_2 ) ) )
            // InternalKExpressions.g:5050:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_3_2 ) )
            {
            // InternalKExpressions.g:5050:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_3_2 ) )
            // InternalKExpressions.g:5051:1: ( rule__InterfaceSignalDecl__SignalsAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSignalsAssignment_3_2()); 
            }
            // InternalKExpressions.g:5052:1: ( rule__InterfaceSignalDecl__SignalsAssignment_3_2 )
            // InternalKExpressions.g:5052:2: rule__InterfaceSignalDecl__SignalsAssignment_3_2
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
    // InternalKExpressions.g:5062:1: rule__InterfaceSignalDecl__Group_3__3 : rule__InterfaceSignalDecl__Group_3__3__Impl rule__InterfaceSignalDecl__Group_3__4 ;
    public final void rule__InterfaceSignalDecl__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5066:1: ( rule__InterfaceSignalDecl__Group_3__3__Impl rule__InterfaceSignalDecl__Group_3__4 )
            // InternalKExpressions.g:5067:2: rule__InterfaceSignalDecl__Group_3__3__Impl rule__InterfaceSignalDecl__Group_3__4
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
    // InternalKExpressions.g:5074:1: rule__InterfaceSignalDecl__Group_3__3__Impl : ( ( rule__InterfaceSignalDecl__Group_3_3__0 )* ) ;
    public final void rule__InterfaceSignalDecl__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5078:1: ( ( ( rule__InterfaceSignalDecl__Group_3_3__0 )* ) )
            // InternalKExpressions.g:5079:1: ( ( rule__InterfaceSignalDecl__Group_3_3__0 )* )
            {
            // InternalKExpressions.g:5079:1: ( ( rule__InterfaceSignalDecl__Group_3_3__0 )* )
            // InternalKExpressions.g:5080:1: ( rule__InterfaceSignalDecl__Group_3_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getGroup_3_3()); 
            }
            // InternalKExpressions.g:5081:1: ( rule__InterfaceSignalDecl__Group_3_3__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==47) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalKExpressions.g:5081:2: rule__InterfaceSignalDecl__Group_3_3__0
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
    // InternalKExpressions.g:5091:1: rule__InterfaceSignalDecl__Group_3__4 : rule__InterfaceSignalDecl__Group_3__4__Impl ;
    public final void rule__InterfaceSignalDecl__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5095:1: ( rule__InterfaceSignalDecl__Group_3__4__Impl )
            // InternalKExpressions.g:5096:2: rule__InterfaceSignalDecl__Group_3__4__Impl
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
    // InternalKExpressions.g:5102:1: rule__InterfaceSignalDecl__Group_3__4__Impl : ( ';' ) ;
    public final void rule__InterfaceSignalDecl__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5106:1: ( ( ';' ) )
            // InternalKExpressions.g:5107:1: ( ';' )
            {
            // InternalKExpressions.g:5107:1: ( ';' )
            // InternalKExpressions.g:5108:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSemicolonKeyword_3_4()); 
            }
            match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:5131:1: rule__InterfaceSignalDecl__Group_3_3__0 : rule__InterfaceSignalDecl__Group_3_3__0__Impl rule__InterfaceSignalDecl__Group_3_3__1 ;
    public final void rule__InterfaceSignalDecl__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5135:1: ( rule__InterfaceSignalDecl__Group_3_3__0__Impl rule__InterfaceSignalDecl__Group_3_3__1 )
            // InternalKExpressions.g:5136:2: rule__InterfaceSignalDecl__Group_3_3__0__Impl rule__InterfaceSignalDecl__Group_3_3__1
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
    // InternalKExpressions.g:5143:1: rule__InterfaceSignalDecl__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__InterfaceSignalDecl__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5147:1: ( ( ',' ) )
            // InternalKExpressions.g:5148:1: ( ',' )
            {
            // InternalKExpressions.g:5148:1: ( ',' )
            // InternalKExpressions.g:5149:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getCommaKeyword_3_3_0()); 
            }
            match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:5162:1: rule__InterfaceSignalDecl__Group_3_3__1 : rule__InterfaceSignalDecl__Group_3_3__1__Impl ;
    public final void rule__InterfaceSignalDecl__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5166:1: ( rule__InterfaceSignalDecl__Group_3_3__1__Impl )
            // InternalKExpressions.g:5167:2: rule__InterfaceSignalDecl__Group_3_3__1__Impl
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
    // InternalKExpressions.g:5173:1: rule__InterfaceSignalDecl__Group_3_3__1__Impl : ( ( rule__InterfaceSignalDecl__SignalsAssignment_3_3_1 ) ) ;
    public final void rule__InterfaceSignalDecl__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5177:1: ( ( ( rule__InterfaceSignalDecl__SignalsAssignment_3_3_1 ) ) )
            // InternalKExpressions.g:5178:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_3_3_1 ) )
            {
            // InternalKExpressions.g:5178:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_3_3_1 ) )
            // InternalKExpressions.g:5179:1: ( rule__InterfaceSignalDecl__SignalsAssignment_3_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSignalsAssignment_3_3_1()); 
            }
            // InternalKExpressions.g:5180:1: ( rule__InterfaceSignalDecl__SignalsAssignment_3_3_1 )
            // InternalKExpressions.g:5180:2: rule__InterfaceSignalDecl__SignalsAssignment_3_3_1
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
    // InternalKExpressions.g:5194:1: rule__ChannelDescription__Group_0__0 : rule__ChannelDescription__Group_0__0__Impl rule__ChannelDescription__Group_0__1 ;
    public final void rule__ChannelDescription__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5198:1: ( rule__ChannelDescription__Group_0__0__Impl rule__ChannelDescription__Group_0__1 )
            // InternalKExpressions.g:5199:2: rule__ChannelDescription__Group_0__0__Impl rule__ChannelDescription__Group_0__1
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
    // InternalKExpressions.g:5206:1: rule__ChannelDescription__Group_0__0__Impl : ( ':' ) ;
    public final void rule__ChannelDescription__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5210:1: ( ( ':' ) )
            // InternalKExpressions.g:5211:1: ( ':' )
            {
            // InternalKExpressions.g:5211:1: ( ':' )
            // InternalKExpressions.g:5212:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChannelDescriptionAccess().getColonKeyword_0_0()); 
            }
            match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:5225:1: rule__ChannelDescription__Group_0__1 : rule__ChannelDescription__Group_0__1__Impl ;
    public final void rule__ChannelDescription__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5229:1: ( rule__ChannelDescription__Group_0__1__Impl )
            // InternalKExpressions.g:5230:2: rule__ChannelDescription__Group_0__1__Impl
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
    // InternalKExpressions.g:5236:1: rule__ChannelDescription__Group_0__1__Impl : ( ( rule__ChannelDescription__TypeAssignment_0_1 ) ) ;
    public final void rule__ChannelDescription__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5240:1: ( ( ( rule__ChannelDescription__TypeAssignment_0_1 ) ) )
            // InternalKExpressions.g:5241:1: ( ( rule__ChannelDescription__TypeAssignment_0_1 ) )
            {
            // InternalKExpressions.g:5241:1: ( ( rule__ChannelDescription__TypeAssignment_0_1 ) )
            // InternalKExpressions.g:5242:1: ( rule__ChannelDescription__TypeAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChannelDescriptionAccess().getTypeAssignment_0_1()); 
            }
            // InternalKExpressions.g:5243:1: ( rule__ChannelDescription__TypeAssignment_0_1 )
            // InternalKExpressions.g:5243:2: rule__ChannelDescription__TypeAssignment_0_1
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
    // InternalKExpressions.g:5257:1: rule__ChannelDescription__Group_1__0 : rule__ChannelDescription__Group_1__0__Impl rule__ChannelDescription__Group_1__1 ;
    public final void rule__ChannelDescription__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5261:1: ( rule__ChannelDescription__Group_1__0__Impl rule__ChannelDescription__Group_1__1 )
            // InternalKExpressions.g:5262:2: rule__ChannelDescription__Group_1__0__Impl rule__ChannelDescription__Group_1__1
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
    // InternalKExpressions.g:5269:1: rule__ChannelDescription__Group_1__0__Impl : ( '(' ) ;
    public final void rule__ChannelDescription__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5273:1: ( ( '(' ) )
            // InternalKExpressions.g:5274:1: ( '(' )
            {
            // InternalKExpressions.g:5274:1: ( '(' )
            // InternalKExpressions.g:5275:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChannelDescriptionAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:5288:1: rule__ChannelDescription__Group_1__1 : rule__ChannelDescription__Group_1__1__Impl rule__ChannelDescription__Group_1__2 ;
    public final void rule__ChannelDescription__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5292:1: ( rule__ChannelDescription__Group_1__1__Impl rule__ChannelDescription__Group_1__2 )
            // InternalKExpressions.g:5293:2: rule__ChannelDescription__Group_1__1__Impl rule__ChannelDescription__Group_1__2
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
    // InternalKExpressions.g:5300:1: rule__ChannelDescription__Group_1__1__Impl : ( ( rule__ChannelDescription__TypeAssignment_1_1 ) ) ;
    public final void rule__ChannelDescription__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5304:1: ( ( ( rule__ChannelDescription__TypeAssignment_1_1 ) ) )
            // InternalKExpressions.g:5305:1: ( ( rule__ChannelDescription__TypeAssignment_1_1 ) )
            {
            // InternalKExpressions.g:5305:1: ( ( rule__ChannelDescription__TypeAssignment_1_1 ) )
            // InternalKExpressions.g:5306:1: ( rule__ChannelDescription__TypeAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChannelDescriptionAccess().getTypeAssignment_1_1()); 
            }
            // InternalKExpressions.g:5307:1: ( rule__ChannelDescription__TypeAssignment_1_1 )
            // InternalKExpressions.g:5307:2: rule__ChannelDescription__TypeAssignment_1_1
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
    // InternalKExpressions.g:5317:1: rule__ChannelDescription__Group_1__2 : rule__ChannelDescription__Group_1__2__Impl ;
    public final void rule__ChannelDescription__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5321:1: ( rule__ChannelDescription__Group_1__2__Impl )
            // InternalKExpressions.g:5322:2: rule__ChannelDescription__Group_1__2__Impl
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
    // InternalKExpressions.g:5328:1: rule__ChannelDescription__Group_1__2__Impl : ( ')' ) ;
    public final void rule__ChannelDescription__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5332:1: ( ( ')' ) )
            // InternalKExpressions.g:5333:1: ( ')' )
            {
            // InternalKExpressions.g:5333:1: ( ')' )
            // InternalKExpressions.g:5334:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChannelDescriptionAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:5353:1: rule__ChannelDescription__Group_2__0 : rule__ChannelDescription__Group_2__0__Impl rule__ChannelDescription__Group_2__1 ;
    public final void rule__ChannelDescription__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5357:1: ( rule__ChannelDescription__Group_2__0__Impl rule__ChannelDescription__Group_2__1 )
            // InternalKExpressions.g:5358:2: rule__ChannelDescription__Group_2__0__Impl rule__ChannelDescription__Group_2__1
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
    // InternalKExpressions.g:5365:1: rule__ChannelDescription__Group_2__0__Impl : ( ':=' ) ;
    public final void rule__ChannelDescription__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5369:1: ( ( ':=' ) )
            // InternalKExpressions.g:5370:1: ( ':=' )
            {
            // InternalKExpressions.g:5370:1: ( ':=' )
            // InternalKExpressions.g:5371:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChannelDescriptionAccess().getColonEqualsSignKeyword_2_0()); 
            }
            match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:5384:1: rule__ChannelDescription__Group_2__1 : rule__ChannelDescription__Group_2__1__Impl rule__ChannelDescription__Group_2__2 ;
    public final void rule__ChannelDescription__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5388:1: ( rule__ChannelDescription__Group_2__1__Impl rule__ChannelDescription__Group_2__2 )
            // InternalKExpressions.g:5389:2: rule__ChannelDescription__Group_2__1__Impl rule__ChannelDescription__Group_2__2
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
    // InternalKExpressions.g:5396:1: rule__ChannelDescription__Group_2__1__Impl : ( ( rule__ChannelDescription__ExpressionAssignment_2_1 ) ) ;
    public final void rule__ChannelDescription__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5400:1: ( ( ( rule__ChannelDescription__ExpressionAssignment_2_1 ) ) )
            // InternalKExpressions.g:5401:1: ( ( rule__ChannelDescription__ExpressionAssignment_2_1 ) )
            {
            // InternalKExpressions.g:5401:1: ( ( rule__ChannelDescription__ExpressionAssignment_2_1 ) )
            // InternalKExpressions.g:5402:1: ( rule__ChannelDescription__ExpressionAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChannelDescriptionAccess().getExpressionAssignment_2_1()); 
            }
            // InternalKExpressions.g:5403:1: ( rule__ChannelDescription__ExpressionAssignment_2_1 )
            // InternalKExpressions.g:5403:2: rule__ChannelDescription__ExpressionAssignment_2_1
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
    // InternalKExpressions.g:5413:1: rule__ChannelDescription__Group_2__2 : rule__ChannelDescription__Group_2__2__Impl rule__ChannelDescription__Group_2__3 ;
    public final void rule__ChannelDescription__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5417:1: ( rule__ChannelDescription__Group_2__2__Impl rule__ChannelDescription__Group_2__3 )
            // InternalKExpressions.g:5418:2: rule__ChannelDescription__Group_2__2__Impl rule__ChannelDescription__Group_2__3
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
    // InternalKExpressions.g:5425:1: rule__ChannelDescription__Group_2__2__Impl : ( ':' ) ;
    public final void rule__ChannelDescription__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5429:1: ( ( ':' ) )
            // InternalKExpressions.g:5430:1: ( ':' )
            {
            // InternalKExpressions.g:5430:1: ( ':' )
            // InternalKExpressions.g:5431:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChannelDescriptionAccess().getColonKeyword_2_2()); 
            }
            match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:5444:1: rule__ChannelDescription__Group_2__3 : rule__ChannelDescription__Group_2__3__Impl ;
    public final void rule__ChannelDescription__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5448:1: ( rule__ChannelDescription__Group_2__3__Impl )
            // InternalKExpressions.g:5449:2: rule__ChannelDescription__Group_2__3__Impl
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
    // InternalKExpressions.g:5455:1: rule__ChannelDescription__Group_2__3__Impl : ( ( rule__ChannelDescription__TypeAssignment_2_3 ) ) ;
    public final void rule__ChannelDescription__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5459:1: ( ( ( rule__ChannelDescription__TypeAssignment_2_3 ) ) )
            // InternalKExpressions.g:5460:1: ( ( rule__ChannelDescription__TypeAssignment_2_3 ) )
            {
            // InternalKExpressions.g:5460:1: ( ( rule__ChannelDescription__TypeAssignment_2_3 ) )
            // InternalKExpressions.g:5461:1: ( rule__ChannelDescription__TypeAssignment_2_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChannelDescriptionAccess().getTypeAssignment_2_3()); 
            }
            // InternalKExpressions.g:5462:1: ( rule__ChannelDescription__TypeAssignment_2_3 )
            // InternalKExpressions.g:5462:2: rule__ChannelDescription__TypeAssignment_2_3
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
    // InternalKExpressions.g:5480:1: rule__InterfaceVariableDecl__Group__0 : rule__InterfaceVariableDecl__Group__0__Impl rule__InterfaceVariableDecl__Group__1 ;
    public final void rule__InterfaceVariableDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5484:1: ( rule__InterfaceVariableDecl__Group__0__Impl rule__InterfaceVariableDecl__Group__1 )
            // InternalKExpressions.g:5485:2: rule__InterfaceVariableDecl__Group__0__Impl rule__InterfaceVariableDecl__Group__1
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
    // InternalKExpressions.g:5492:1: rule__InterfaceVariableDecl__Group__0__Impl : ( 'var' ) ;
    public final void rule__InterfaceVariableDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5496:1: ( ( 'var' ) )
            // InternalKExpressions.g:5497:1: ( 'var' )
            {
            // InternalKExpressions.g:5497:1: ( 'var' )
            // InternalKExpressions.g:5498:1: 'var'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceVariableDeclAccess().getVarKeyword_0()); 
            }
            match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:5511:1: rule__InterfaceVariableDecl__Group__1 : rule__InterfaceVariableDecl__Group__1__Impl rule__InterfaceVariableDecl__Group__2 ;
    public final void rule__InterfaceVariableDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5515:1: ( rule__InterfaceVariableDecl__Group__1__Impl rule__InterfaceVariableDecl__Group__2 )
            // InternalKExpressions.g:5516:2: rule__InterfaceVariableDecl__Group__1__Impl rule__InterfaceVariableDecl__Group__2
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
    // InternalKExpressions.g:5523:1: rule__InterfaceVariableDecl__Group__1__Impl : ( ( rule__InterfaceVariableDecl__VarDeclsAssignment_1 ) ) ;
    public final void rule__InterfaceVariableDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5527:1: ( ( ( rule__InterfaceVariableDecl__VarDeclsAssignment_1 ) ) )
            // InternalKExpressions.g:5528:1: ( ( rule__InterfaceVariableDecl__VarDeclsAssignment_1 ) )
            {
            // InternalKExpressions.g:5528:1: ( ( rule__InterfaceVariableDecl__VarDeclsAssignment_1 ) )
            // InternalKExpressions.g:5529:1: ( rule__InterfaceVariableDecl__VarDeclsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceVariableDeclAccess().getVarDeclsAssignment_1()); 
            }
            // InternalKExpressions.g:5530:1: ( rule__InterfaceVariableDecl__VarDeclsAssignment_1 )
            // InternalKExpressions.g:5530:2: rule__InterfaceVariableDecl__VarDeclsAssignment_1
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
    // InternalKExpressions.g:5540:1: rule__InterfaceVariableDecl__Group__2 : rule__InterfaceVariableDecl__Group__2__Impl ;
    public final void rule__InterfaceVariableDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5544:1: ( rule__InterfaceVariableDecl__Group__2__Impl )
            // InternalKExpressions.g:5545:2: rule__InterfaceVariableDecl__Group__2__Impl
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
    // InternalKExpressions.g:5551:1: rule__InterfaceVariableDecl__Group__2__Impl : ( ( rule__InterfaceVariableDecl__Group_2__0 )* ) ;
    public final void rule__InterfaceVariableDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5555:1: ( ( ( rule__InterfaceVariableDecl__Group_2__0 )* ) )
            // InternalKExpressions.g:5556:1: ( ( rule__InterfaceVariableDecl__Group_2__0 )* )
            {
            // InternalKExpressions.g:5556:1: ( ( rule__InterfaceVariableDecl__Group_2__0 )* )
            // InternalKExpressions.g:5557:1: ( rule__InterfaceVariableDecl__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceVariableDeclAccess().getGroup_2()); 
            }
            // InternalKExpressions.g:5558:1: ( rule__InterfaceVariableDecl__Group_2__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==47) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalKExpressions.g:5558:2: rule__InterfaceVariableDecl__Group_2__0
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
    // InternalKExpressions.g:5574:1: rule__InterfaceVariableDecl__Group_2__0 : rule__InterfaceVariableDecl__Group_2__0__Impl rule__InterfaceVariableDecl__Group_2__1 ;
    public final void rule__InterfaceVariableDecl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5578:1: ( rule__InterfaceVariableDecl__Group_2__0__Impl rule__InterfaceVariableDecl__Group_2__1 )
            // InternalKExpressions.g:5579:2: rule__InterfaceVariableDecl__Group_2__0__Impl rule__InterfaceVariableDecl__Group_2__1
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
    // InternalKExpressions.g:5586:1: rule__InterfaceVariableDecl__Group_2__0__Impl : ( ',' ) ;
    public final void rule__InterfaceVariableDecl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5590:1: ( ( ',' ) )
            // InternalKExpressions.g:5591:1: ( ',' )
            {
            // InternalKExpressions.g:5591:1: ( ',' )
            // InternalKExpressions.g:5592:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceVariableDeclAccess().getCommaKeyword_2_0()); 
            }
            match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:5605:1: rule__InterfaceVariableDecl__Group_2__1 : rule__InterfaceVariableDecl__Group_2__1__Impl ;
    public final void rule__InterfaceVariableDecl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5609:1: ( rule__InterfaceVariableDecl__Group_2__1__Impl )
            // InternalKExpressions.g:5610:2: rule__InterfaceVariableDecl__Group_2__1__Impl
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
    // InternalKExpressions.g:5616:1: rule__InterfaceVariableDecl__Group_2__1__Impl : ( ( rule__InterfaceVariableDecl__VarDeclsAssignment_2_1 ) ) ;
    public final void rule__InterfaceVariableDecl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5620:1: ( ( ( rule__InterfaceVariableDecl__VarDeclsAssignment_2_1 ) ) )
            // InternalKExpressions.g:5621:1: ( ( rule__InterfaceVariableDecl__VarDeclsAssignment_2_1 ) )
            {
            // InternalKExpressions.g:5621:1: ( ( rule__InterfaceVariableDecl__VarDeclsAssignment_2_1 ) )
            // InternalKExpressions.g:5622:1: ( rule__InterfaceVariableDecl__VarDeclsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceVariableDeclAccess().getVarDeclsAssignment_2_1()); 
            }
            // InternalKExpressions.g:5623:1: ( rule__InterfaceVariableDecl__VarDeclsAssignment_2_1 )
            // InternalKExpressions.g:5623:2: rule__InterfaceVariableDecl__VarDeclsAssignment_2_1
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
    // InternalKExpressions.g:5637:1: rule__VariableDecl__Group__0 : rule__VariableDecl__Group__0__Impl rule__VariableDecl__Group__1 ;
    public final void rule__VariableDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5641:1: ( rule__VariableDecl__Group__0__Impl rule__VariableDecl__Group__1 )
            // InternalKExpressions.g:5642:2: rule__VariableDecl__Group__0__Impl rule__VariableDecl__Group__1
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
    // InternalKExpressions.g:5649:1: rule__VariableDecl__Group__0__Impl : ( ( rule__VariableDecl__VariablesAssignment_0 ) ) ;
    public final void rule__VariableDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5653:1: ( ( ( rule__VariableDecl__VariablesAssignment_0 ) ) )
            // InternalKExpressions.g:5654:1: ( ( rule__VariableDecl__VariablesAssignment_0 ) )
            {
            // InternalKExpressions.g:5654:1: ( ( rule__VariableDecl__VariablesAssignment_0 ) )
            // InternalKExpressions.g:5655:1: ( rule__VariableDecl__VariablesAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclAccess().getVariablesAssignment_0()); 
            }
            // InternalKExpressions.g:5656:1: ( rule__VariableDecl__VariablesAssignment_0 )
            // InternalKExpressions.g:5656:2: rule__VariableDecl__VariablesAssignment_0
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
    // InternalKExpressions.g:5666:1: rule__VariableDecl__Group__1 : rule__VariableDecl__Group__1__Impl rule__VariableDecl__Group__2 ;
    public final void rule__VariableDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5670:1: ( rule__VariableDecl__Group__1__Impl rule__VariableDecl__Group__2 )
            // InternalKExpressions.g:5671:2: rule__VariableDecl__Group__1__Impl rule__VariableDecl__Group__2
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
    // InternalKExpressions.g:5678:1: rule__VariableDecl__Group__1__Impl : ( ( rule__VariableDecl__Group_1__0 )* ) ;
    public final void rule__VariableDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5682:1: ( ( ( rule__VariableDecl__Group_1__0 )* ) )
            // InternalKExpressions.g:5683:1: ( ( rule__VariableDecl__Group_1__0 )* )
            {
            // InternalKExpressions.g:5683:1: ( ( rule__VariableDecl__Group_1__0 )* )
            // InternalKExpressions.g:5684:1: ( rule__VariableDecl__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:5685:1: ( rule__VariableDecl__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==47) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalKExpressions.g:5685:2: rule__VariableDecl__Group_1__0
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
    // InternalKExpressions.g:5695:1: rule__VariableDecl__Group__2 : rule__VariableDecl__Group__2__Impl rule__VariableDecl__Group__3 ;
    public final void rule__VariableDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5699:1: ( rule__VariableDecl__Group__2__Impl rule__VariableDecl__Group__3 )
            // InternalKExpressions.g:5700:2: rule__VariableDecl__Group__2__Impl rule__VariableDecl__Group__3
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
    // InternalKExpressions.g:5707:1: rule__VariableDecl__Group__2__Impl : ( ':' ) ;
    public final void rule__VariableDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5711:1: ( ( ':' ) )
            // InternalKExpressions.g:5712:1: ( ':' )
            {
            // InternalKExpressions.g:5712:1: ( ':' )
            // InternalKExpressions.g:5713:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclAccess().getColonKeyword_2()); 
            }
            match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:5726:1: rule__VariableDecl__Group__3 : rule__VariableDecl__Group__3__Impl ;
    public final void rule__VariableDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5730:1: ( rule__VariableDecl__Group__3__Impl )
            // InternalKExpressions.g:5731:2: rule__VariableDecl__Group__3__Impl
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
    // InternalKExpressions.g:5737:1: rule__VariableDecl__Group__3__Impl : ( ( rule__VariableDecl__TypeAssignment_3 ) ) ;
    public final void rule__VariableDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5741:1: ( ( ( rule__VariableDecl__TypeAssignment_3 ) ) )
            // InternalKExpressions.g:5742:1: ( ( rule__VariableDecl__TypeAssignment_3 ) )
            {
            // InternalKExpressions.g:5742:1: ( ( rule__VariableDecl__TypeAssignment_3 ) )
            // InternalKExpressions.g:5743:1: ( rule__VariableDecl__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclAccess().getTypeAssignment_3()); 
            }
            // InternalKExpressions.g:5744:1: ( rule__VariableDecl__TypeAssignment_3 )
            // InternalKExpressions.g:5744:2: rule__VariableDecl__TypeAssignment_3
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
    // InternalKExpressions.g:5762:1: rule__VariableDecl__Group_1__0 : rule__VariableDecl__Group_1__0__Impl rule__VariableDecl__Group_1__1 ;
    public final void rule__VariableDecl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5766:1: ( rule__VariableDecl__Group_1__0__Impl rule__VariableDecl__Group_1__1 )
            // InternalKExpressions.g:5767:2: rule__VariableDecl__Group_1__0__Impl rule__VariableDecl__Group_1__1
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
    // InternalKExpressions.g:5774:1: rule__VariableDecl__Group_1__0__Impl : ( ',' ) ;
    public final void rule__VariableDecl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5778:1: ( ( ',' ) )
            // InternalKExpressions.g:5779:1: ( ',' )
            {
            // InternalKExpressions.g:5779:1: ( ',' )
            // InternalKExpressions.g:5780:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclAccess().getCommaKeyword_1_0()); 
            }
            match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:5793:1: rule__VariableDecl__Group_1__1 : rule__VariableDecl__Group_1__1__Impl ;
    public final void rule__VariableDecl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5797:1: ( rule__VariableDecl__Group_1__1__Impl )
            // InternalKExpressions.g:5798:2: rule__VariableDecl__Group_1__1__Impl
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
    // InternalKExpressions.g:5804:1: rule__VariableDecl__Group_1__1__Impl : ( ( rule__VariableDecl__VariablesAssignment_1_1 ) ) ;
    public final void rule__VariableDecl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5808:1: ( ( ( rule__VariableDecl__VariablesAssignment_1_1 ) ) )
            // InternalKExpressions.g:5809:1: ( ( rule__VariableDecl__VariablesAssignment_1_1 ) )
            {
            // InternalKExpressions.g:5809:1: ( ( rule__VariableDecl__VariablesAssignment_1_1 ) )
            // InternalKExpressions.g:5810:1: ( rule__VariableDecl__VariablesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclAccess().getVariablesAssignment_1_1()); 
            }
            // InternalKExpressions.g:5811:1: ( rule__VariableDecl__VariablesAssignment_1_1 )
            // InternalKExpressions.g:5811:2: rule__VariableDecl__VariablesAssignment_1_1
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
    // InternalKExpressions.g:5825:1: rule__IVariable__Group__0 : rule__IVariable__Group__0__Impl rule__IVariable__Group__1 ;
    public final void rule__IVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5829:1: ( rule__IVariable__Group__0__Impl rule__IVariable__Group__1 )
            // InternalKExpressions.g:5830:2: rule__IVariable__Group__0__Impl rule__IVariable__Group__1
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
    // InternalKExpressions.g:5837:1: rule__IVariable__Group__0__Impl : ( ( rule__IVariable__NameAssignment_0 ) ) ;
    public final void rule__IVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5841:1: ( ( ( rule__IVariable__NameAssignment_0 ) ) )
            // InternalKExpressions.g:5842:1: ( ( rule__IVariable__NameAssignment_0 ) )
            {
            // InternalKExpressions.g:5842:1: ( ( rule__IVariable__NameAssignment_0 ) )
            // InternalKExpressions.g:5843:1: ( rule__IVariable__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIVariableAccess().getNameAssignment_0()); 
            }
            // InternalKExpressions.g:5844:1: ( rule__IVariable__NameAssignment_0 )
            // InternalKExpressions.g:5844:2: rule__IVariable__NameAssignment_0
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
    // InternalKExpressions.g:5854:1: rule__IVariable__Group__1 : rule__IVariable__Group__1__Impl ;
    public final void rule__IVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5858:1: ( rule__IVariable__Group__1__Impl )
            // InternalKExpressions.g:5859:2: rule__IVariable__Group__1__Impl
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
    // InternalKExpressions.g:5865:1: rule__IVariable__Group__1__Impl : ( ( rule__IVariable__Group_1__0 )? ) ;
    public final void rule__IVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5869:1: ( ( ( rule__IVariable__Group_1__0 )? ) )
            // InternalKExpressions.g:5870:1: ( ( rule__IVariable__Group_1__0 )? )
            {
            // InternalKExpressions.g:5870:1: ( ( rule__IVariable__Group_1__0 )? )
            // InternalKExpressions.g:5871:1: ( rule__IVariable__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIVariableAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:5872:1: ( rule__IVariable__Group_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==52) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalKExpressions.g:5872:2: rule__IVariable__Group_1__0
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
    // InternalKExpressions.g:5886:1: rule__IVariable__Group_1__0 : rule__IVariable__Group_1__0__Impl rule__IVariable__Group_1__1 ;
    public final void rule__IVariable__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5890:1: ( rule__IVariable__Group_1__0__Impl rule__IVariable__Group_1__1 )
            // InternalKExpressions.g:5891:2: rule__IVariable__Group_1__0__Impl rule__IVariable__Group_1__1
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
    // InternalKExpressions.g:5898:1: rule__IVariable__Group_1__0__Impl : ( ':=' ) ;
    public final void rule__IVariable__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5902:1: ( ( ':=' ) )
            // InternalKExpressions.g:5903:1: ( ':=' )
            {
            // InternalKExpressions.g:5903:1: ( ':=' )
            // InternalKExpressions.g:5904:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIVariableAccess().getColonEqualsSignKeyword_1_0()); 
            }
            match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:5917:1: rule__IVariable__Group_1__1 : rule__IVariable__Group_1__1__Impl ;
    public final void rule__IVariable__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5921:1: ( rule__IVariable__Group_1__1__Impl )
            // InternalKExpressions.g:5922:2: rule__IVariable__Group_1__1__Impl
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
    // InternalKExpressions.g:5928:1: rule__IVariable__Group_1__1__Impl : ( ( rule__IVariable__ExpressionAssignment_1_1 ) ) ;
    public final void rule__IVariable__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5932:1: ( ( ( rule__IVariable__ExpressionAssignment_1_1 ) ) )
            // InternalKExpressions.g:5933:1: ( ( rule__IVariable__ExpressionAssignment_1_1 ) )
            {
            // InternalKExpressions.g:5933:1: ( ( rule__IVariable__ExpressionAssignment_1_1 ) )
            // InternalKExpressions.g:5934:1: ( rule__IVariable__ExpressionAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIVariableAccess().getExpressionAssignment_1_1()); 
            }
            // InternalKExpressions.g:5935:1: ( rule__IVariable__ExpressionAssignment_1_1 )
            // InternalKExpressions.g:5935:2: rule__IVariable__ExpressionAssignment_1_1
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
    // InternalKExpressions.g:5949:1: rule__TypeIdentifier__Group_2__0 : rule__TypeIdentifier__Group_2__0__Impl rule__TypeIdentifier__Group_2__1 ;
    public final void rule__TypeIdentifier__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5953:1: ( rule__TypeIdentifier__Group_2__0__Impl rule__TypeIdentifier__Group_2__1 )
            // InternalKExpressions.g:5954:2: rule__TypeIdentifier__Group_2__0__Impl rule__TypeIdentifier__Group_2__1
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
    // InternalKExpressions.g:5961:1: rule__TypeIdentifier__Group_2__0__Impl : ( 'combine' ) ;
    public final void rule__TypeIdentifier__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5965:1: ( ( 'combine' ) )
            // InternalKExpressions.g:5966:1: ( 'combine' )
            {
            // InternalKExpressions.g:5966:1: ( 'combine' )
            // InternalKExpressions.g:5967:1: 'combine'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeIdentifierAccess().getCombineKeyword_2_0()); 
            }
            match(input,54,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:5980:1: rule__TypeIdentifier__Group_2__1 : rule__TypeIdentifier__Group_2__1__Impl rule__TypeIdentifier__Group_2__2 ;
    public final void rule__TypeIdentifier__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5984:1: ( rule__TypeIdentifier__Group_2__1__Impl rule__TypeIdentifier__Group_2__2 )
            // InternalKExpressions.g:5985:2: rule__TypeIdentifier__Group_2__1__Impl rule__TypeIdentifier__Group_2__2
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
    // InternalKExpressions.g:5992:1: rule__TypeIdentifier__Group_2__1__Impl : ( ( rule__TypeIdentifier__Alternatives_2_1 ) ) ;
    public final void rule__TypeIdentifier__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5996:1: ( ( ( rule__TypeIdentifier__Alternatives_2_1 ) ) )
            // InternalKExpressions.g:5997:1: ( ( rule__TypeIdentifier__Alternatives_2_1 ) )
            {
            // InternalKExpressions.g:5997:1: ( ( rule__TypeIdentifier__Alternatives_2_1 ) )
            // InternalKExpressions.g:5998:1: ( rule__TypeIdentifier__Alternatives_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeIdentifierAccess().getAlternatives_2_1()); 
            }
            // InternalKExpressions.g:5999:1: ( rule__TypeIdentifier__Alternatives_2_1 )
            // InternalKExpressions.g:5999:2: rule__TypeIdentifier__Alternatives_2_1
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
    // InternalKExpressions.g:6009:1: rule__TypeIdentifier__Group_2__2 : rule__TypeIdentifier__Group_2__2__Impl rule__TypeIdentifier__Group_2__3 ;
    public final void rule__TypeIdentifier__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6013:1: ( rule__TypeIdentifier__Group_2__2__Impl rule__TypeIdentifier__Group_2__3 )
            // InternalKExpressions.g:6014:2: rule__TypeIdentifier__Group_2__2__Impl rule__TypeIdentifier__Group_2__3
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
    // InternalKExpressions.g:6021:1: rule__TypeIdentifier__Group_2__2__Impl : ( 'with' ) ;
    public final void rule__TypeIdentifier__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6025:1: ( ( 'with' ) )
            // InternalKExpressions.g:6026:1: ( 'with' )
            {
            // InternalKExpressions.g:6026:1: ( 'with' )
            // InternalKExpressions.g:6027:1: 'with'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeIdentifierAccess().getWithKeyword_2_2()); 
            }
            match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:6040:1: rule__TypeIdentifier__Group_2__3 : rule__TypeIdentifier__Group_2__3__Impl ;
    public final void rule__TypeIdentifier__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6044:1: ( rule__TypeIdentifier__Group_2__3__Impl )
            // InternalKExpressions.g:6045:2: rule__TypeIdentifier__Group_2__3__Impl
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
    // InternalKExpressions.g:6051:1: rule__TypeIdentifier__Group_2__3__Impl : ( ( rule__TypeIdentifier__OperatorAssignment_2_3 ) ) ;
    public final void rule__TypeIdentifier__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6055:1: ( ( ( rule__TypeIdentifier__OperatorAssignment_2_3 ) ) )
            // InternalKExpressions.g:6056:1: ( ( rule__TypeIdentifier__OperatorAssignment_2_3 ) )
            {
            // InternalKExpressions.g:6056:1: ( ( rule__TypeIdentifier__OperatorAssignment_2_3 ) )
            // InternalKExpressions.g:6057:1: ( rule__TypeIdentifier__OperatorAssignment_2_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeIdentifierAccess().getOperatorAssignment_2_3()); 
            }
            // InternalKExpressions.g:6058:1: ( rule__TypeIdentifier__OperatorAssignment_2_3 )
            // InternalKExpressions.g:6058:2: rule__TypeIdentifier__OperatorAssignment_2_3
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
    // InternalKExpressions.g:6076:1: rule__TagAnnotation__Group__0 : rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 ;
    public final void rule__TagAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6080:1: ( rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 )
            // InternalKExpressions.g:6081:2: rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1
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
    // InternalKExpressions.g:6088:1: rule__TagAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TagAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6092:1: ( ( '@' ) )
            // InternalKExpressions.g:6093:1: ( '@' )
            {
            // InternalKExpressions.g:6093:1: ( '@' )
            // InternalKExpressions.g:6094:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:6107:1: rule__TagAnnotation__Group__1 : rule__TagAnnotation__Group__1__Impl ;
    public final void rule__TagAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6111:1: ( rule__TagAnnotation__Group__1__Impl )
            // InternalKExpressions.g:6112:2: rule__TagAnnotation__Group__1__Impl
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
    // InternalKExpressions.g:6118:1: rule__TagAnnotation__Group__1__Impl : ( ( rule__TagAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TagAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6122:1: ( ( ( rule__TagAnnotation__NameAssignment_1 ) ) )
            // InternalKExpressions.g:6123:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:6123:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            // InternalKExpressions.g:6124:1: ( rule__TagAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:6125:1: ( rule__TagAnnotation__NameAssignment_1 )
            // InternalKExpressions.g:6125:2: rule__TagAnnotation__NameAssignment_1
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
    // InternalKExpressions.g:6139:1: rule__KeyStringValueAnnotation__Group__0 : rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 ;
    public final void rule__KeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6143:1: ( rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 )
            // InternalKExpressions.g:6144:2: rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1
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
    // InternalKExpressions.g:6151:1: rule__KeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6155:1: ( ( '@' ) )
            // InternalKExpressions.g:6156:1: ( '@' )
            {
            // InternalKExpressions.g:6156:1: ( '@' )
            // InternalKExpressions.g:6157:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:6170:1: rule__KeyStringValueAnnotation__Group__1 : rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 ;
    public final void rule__KeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6174:1: ( rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 )
            // InternalKExpressions.g:6175:2: rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2
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
    // InternalKExpressions.g:6182:1: rule__KeyStringValueAnnotation__Group__1__Impl : ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6186:1: ( ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKExpressions.g:6187:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:6187:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKExpressions.g:6188:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:6189:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            // InternalKExpressions.g:6189:2: rule__KeyStringValueAnnotation__NameAssignment_1
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
    // InternalKExpressions.g:6199:1: rule__KeyStringValueAnnotation__Group__2 : rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 ;
    public final void rule__KeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6203:1: ( rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 )
            // InternalKExpressions.g:6204:2: rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3
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
    // InternalKExpressions.g:6211:1: rule__KeyStringValueAnnotation__Group__2__Impl : ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6215:1: ( ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalKExpressions.g:6216:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalKExpressions.g:6216:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalKExpressions.g:6217:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            }
            // InternalKExpressions.g:6218:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalKExpressions.g:6218:2: rule__KeyStringValueAnnotation__ValuesAssignment_2
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
    // InternalKExpressions.g:6228:1: rule__KeyStringValueAnnotation__Group__3 : rule__KeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__KeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6232:1: ( rule__KeyStringValueAnnotation__Group__3__Impl )
            // InternalKExpressions.g:6233:2: rule__KeyStringValueAnnotation__Group__3__Impl
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
    // InternalKExpressions.g:6239:1: rule__KeyStringValueAnnotation__Group__3__Impl : ( ( rule__KeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__KeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6243:1: ( ( ( rule__KeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalKExpressions.g:6244:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalKExpressions.g:6244:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )* )
            // InternalKExpressions.g:6245:1: ( rule__KeyStringValueAnnotation__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // InternalKExpressions.g:6246:1: ( rule__KeyStringValueAnnotation__Group_3__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==47) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalKExpressions.g:6246:2: rule__KeyStringValueAnnotation__Group_3__0
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
    // InternalKExpressions.g:6264:1: rule__KeyStringValueAnnotation__Group_3__0 : rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 ;
    public final void rule__KeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6268:1: ( rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 )
            // InternalKExpressions.g:6269:2: rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1
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
    // InternalKExpressions.g:6276:1: rule__KeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6280:1: ( ( ',' ) )
            // InternalKExpressions.g:6281:1: ( ',' )
            {
            // InternalKExpressions.g:6281:1: ( ',' )
            // InternalKExpressions.g:6282:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            }
            match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:6295:1: rule__KeyStringValueAnnotation__Group_3__1 : rule__KeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__KeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6299:1: ( rule__KeyStringValueAnnotation__Group_3__1__Impl )
            // InternalKExpressions.g:6300:2: rule__KeyStringValueAnnotation__Group_3__1__Impl
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
    // InternalKExpressions.g:6306:1: rule__KeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6310:1: ( ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalKExpressions.g:6311:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalKExpressions.g:6311:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalKExpressions.g:6312:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            }
            // InternalKExpressions.g:6313:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalKExpressions.g:6313:2: rule__KeyStringValueAnnotation__ValuesAssignment_3_1
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
    // InternalKExpressions.g:6327:1: rule__TypedKeyStringValueAnnotation__Group__0 : rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6331:1: ( rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 )
            // InternalKExpressions.g:6332:2: rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1
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
    // InternalKExpressions.g:6339:1: rule__TypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6343:1: ( ( '@' ) )
            // InternalKExpressions.g:6344:1: ( '@' )
            {
            // InternalKExpressions.g:6344:1: ( '@' )
            // InternalKExpressions.g:6345:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:6358:1: rule__TypedKeyStringValueAnnotation__Group__1 : rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6362:1: ( rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 )
            // InternalKExpressions.g:6363:2: rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_41);
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
    // InternalKExpressions.g:6370:1: rule__TypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6374:1: ( ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKExpressions.g:6375:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:6375:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKExpressions.g:6376:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:6377:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKExpressions.g:6377:2: rule__TypedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKExpressions.g:6387:1: rule__TypedKeyStringValueAnnotation__Group__2 : rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6391:1: ( rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 )
            // InternalKExpressions.g:6392:2: rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3
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
    // InternalKExpressions.g:6399:1: rule__TypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6403:1: ( ( '[' ) )
            // InternalKExpressions.g:6404:1: ( '[' )
            {
            // InternalKExpressions.g:6404:1: ( '[' )
            // InternalKExpressions.g:6405:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,57,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:6418:1: rule__TypedKeyStringValueAnnotation__Group__3 : rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6422:1: ( rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 )
            // InternalKExpressions.g:6423:2: rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_42);
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
    // InternalKExpressions.g:6430:1: rule__TypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6434:1: ( ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalKExpressions.g:6435:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalKExpressions.g:6435:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalKExpressions.g:6436:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // InternalKExpressions.g:6437:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalKExpressions.g:6437:2: rule__TypedKeyStringValueAnnotation__TypeAssignment_3
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
    // InternalKExpressions.g:6447:1: rule__TypedKeyStringValueAnnotation__Group__4 : rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6451:1: ( rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 )
            // InternalKExpressions.g:6452:2: rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_43);
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
    // InternalKExpressions.g:6459:1: rule__TypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6463:1: ( ( ']' ) )
            // InternalKExpressions.g:6464:1: ( ']' )
            {
            // InternalKExpressions.g:6464:1: ( ']' )
            // InternalKExpressions.g:6465:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:6478:1: rule__TypedKeyStringValueAnnotation__Group__5 : rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6482:1: ( rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 )
            // InternalKExpressions.g:6483:2: rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6
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
    // InternalKExpressions.g:6490:1: rule__TypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6494:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalKExpressions.g:6495:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalKExpressions.g:6495:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalKExpressions.g:6496:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            }
            // InternalKExpressions.g:6497:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalKExpressions.g:6497:2: rule__TypedKeyStringValueAnnotation__ValuesAssignment_5
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
    // InternalKExpressions.g:6507:1: rule__TypedKeyStringValueAnnotation__Group__6 : rule__TypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6511:1: ( rule__TypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalKExpressions.g:6512:2: rule__TypedKeyStringValueAnnotation__Group__6__Impl
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
    // InternalKExpressions.g:6518:1: rule__TypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6522:1: ( ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalKExpressions.g:6523:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalKExpressions.g:6523:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalKExpressions.g:6524:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // InternalKExpressions.g:6525:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==47) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalKExpressions.g:6525:2: rule__TypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
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
    // InternalKExpressions.g:6549:1: rule__TypedKeyStringValueAnnotation__Group_6__0 : rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6553:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 )
            // InternalKExpressions.g:6554:2: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_43);
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
    // InternalKExpressions.g:6561:1: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6565:1: ( ( ',' ) )
            // InternalKExpressions.g:6566:1: ( ',' )
            {
            // InternalKExpressions.g:6566:1: ( ',' )
            // InternalKExpressions.g:6567:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            }
            match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:6580:1: rule__TypedKeyStringValueAnnotation__Group_6__1 : rule__TypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6584:1: ( rule__TypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalKExpressions.g:6585:2: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl
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
    // InternalKExpressions.g:6591:1: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6595:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalKExpressions.g:6596:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalKExpressions.g:6596:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalKExpressions.g:6597:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            }
            // InternalKExpressions.g:6598:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalKExpressions.g:6598:2: rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1
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
    // InternalKExpressions.g:6612:1: rule__QuotedKeyStringValueAnnotation__Group__0 : rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6616:1: ( rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1 )
            // InternalKExpressions.g:6617:2: rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1
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
    // InternalKExpressions.g:6624:1: rule__QuotedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6628:1: ( ( '@' ) )
            // InternalKExpressions.g:6629:1: ( '@' )
            {
            // InternalKExpressions.g:6629:1: ( '@' )
            // InternalKExpressions.g:6630:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:6643:1: rule__QuotedKeyStringValueAnnotation__Group__1 : rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6647:1: ( rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2 )
            // InternalKExpressions.g:6648:2: rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2
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
    // InternalKExpressions.g:6655:1: rule__QuotedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6659:1: ( ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKExpressions.g:6660:1: ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:6660:1: ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKExpressions.g:6661:1: ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:6662:1: ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKExpressions.g:6662:2: rule__QuotedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKExpressions.g:6672:1: rule__QuotedKeyStringValueAnnotation__Group__2 : rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6676:1: ( rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3 )
            // InternalKExpressions.g:6677:2: rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3
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
    // InternalKExpressions.g:6684:1: rule__QuotedKeyStringValueAnnotation__Group__2__Impl : ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6688:1: ( ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalKExpressions.g:6689:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalKExpressions.g:6689:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalKExpressions.g:6690:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            }
            // InternalKExpressions.g:6691:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalKExpressions.g:6691:2: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2
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
    // InternalKExpressions.g:6701:1: rule__QuotedKeyStringValueAnnotation__Group__3 : rule__QuotedKeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6705:1: ( rule__QuotedKeyStringValueAnnotation__Group__3__Impl )
            // InternalKExpressions.g:6706:2: rule__QuotedKeyStringValueAnnotation__Group__3__Impl
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
    // InternalKExpressions.g:6712:1: rule__QuotedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6716:1: ( ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalKExpressions.g:6717:1: ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalKExpressions.g:6717:1: ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* )
            // InternalKExpressions.g:6718:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // InternalKExpressions.g:6719:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==47) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalKExpressions.g:6719:2: rule__QuotedKeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
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
    // InternalKExpressions.g:6737:1: rule__QuotedKeyStringValueAnnotation__Group_3__0 : rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6741:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1 )
            // InternalKExpressions.g:6742:2: rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1
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
    // InternalKExpressions.g:6749:1: rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6753:1: ( ( ',' ) )
            // InternalKExpressions.g:6754:1: ( ',' )
            {
            // InternalKExpressions.g:6754:1: ( ',' )
            // InternalKExpressions.g:6755:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            }
            match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:6768:1: rule__QuotedKeyStringValueAnnotation__Group_3__1 : rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6772:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl )
            // InternalKExpressions.g:6773:2: rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl
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
    // InternalKExpressions.g:6779:1: rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6783:1: ( ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalKExpressions.g:6784:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalKExpressions.g:6784:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalKExpressions.g:6785:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            }
            // InternalKExpressions.g:6786:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalKExpressions.g:6786:2: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1
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
    // InternalKExpressions.g:6800:1: rule__QuotedTypedKeyStringValueAnnotation__Group__0 : rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6804:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1 )
            // InternalKExpressions.g:6805:2: rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1
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
    // InternalKExpressions.g:6812:1: rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6816:1: ( ( '@' ) )
            // InternalKExpressions.g:6817:1: ( '@' )
            {
            // InternalKExpressions.g:6817:1: ( '@' )
            // InternalKExpressions.g:6818:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:6831:1: rule__QuotedTypedKeyStringValueAnnotation__Group__1 : rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6835:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2 )
            // InternalKExpressions.g:6836:2: rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_41);
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
    // InternalKExpressions.g:6843:1: rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6847:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKExpressions.g:6848:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:6848:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKExpressions.g:6849:1: ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:6850:1: ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKExpressions.g:6850:2: rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKExpressions.g:6860:1: rule__QuotedTypedKeyStringValueAnnotation__Group__2 : rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6864:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3 )
            // InternalKExpressions.g:6865:2: rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3
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
    // InternalKExpressions.g:6872:1: rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6876:1: ( ( '[' ) )
            // InternalKExpressions.g:6877:1: ( '[' )
            {
            // InternalKExpressions.g:6877:1: ( '[' )
            // InternalKExpressions.g:6878:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,57,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:6891:1: rule__QuotedTypedKeyStringValueAnnotation__Group__3 : rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6895:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4 )
            // InternalKExpressions.g:6896:2: rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_42);
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
    // InternalKExpressions.g:6903:1: rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6907:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalKExpressions.g:6908:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalKExpressions.g:6908:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalKExpressions.g:6909:1: ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // InternalKExpressions.g:6910:1: ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalKExpressions.g:6910:2: rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3
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
    // InternalKExpressions.g:6920:1: rule__QuotedTypedKeyStringValueAnnotation__Group__4 : rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6924:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5 )
            // InternalKExpressions.g:6925:2: rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5
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
    // InternalKExpressions.g:6932:1: rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6936:1: ( ( ']' ) )
            // InternalKExpressions.g:6937:1: ( ']' )
            {
            // InternalKExpressions.g:6937:1: ( ']' )
            // InternalKExpressions.g:6938:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:6951:1: rule__QuotedTypedKeyStringValueAnnotation__Group__5 : rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6955:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6 )
            // InternalKExpressions.g:6956:2: rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6
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
    // InternalKExpressions.g:6963:1: rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6967:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalKExpressions.g:6968:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalKExpressions.g:6968:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalKExpressions.g:6969:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            }
            // InternalKExpressions.g:6970:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalKExpressions.g:6970:2: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5
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
    // InternalKExpressions.g:6980:1: rule__QuotedTypedKeyStringValueAnnotation__Group__6 : rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6984:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalKExpressions.g:6985:2: rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl
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
    // InternalKExpressions.g:6991:1: rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6995:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalKExpressions.g:6996:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalKExpressions.g:6996:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalKExpressions.g:6997:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // InternalKExpressions.g:6998:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==47) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalKExpressions.g:6998:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
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
    // InternalKExpressions.g:7022:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 : rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7026:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 )
            // InternalKExpressions.g:7027:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1
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
    // InternalKExpressions.g:7034:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7038:1: ( ( ',' ) )
            // InternalKExpressions.g:7039:1: ( ',' )
            {
            // InternalKExpressions.g:7039:1: ( ',' )
            // InternalKExpressions.g:7040:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            }
            match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:7053:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 : rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7057:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalKExpressions.g:7058:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl
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
    // InternalKExpressions.g:7064:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7068:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalKExpressions.g:7069:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalKExpressions.g:7069:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalKExpressions.g:7070:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            }
            // InternalKExpressions.g:7071:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalKExpressions.g:7071:2: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1
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
    // InternalKExpressions.g:7085:1: rule__KeyBooleanValueAnnotation__Group__0 : rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1 ;
    public final void rule__KeyBooleanValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7089:1: ( rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1 )
            // InternalKExpressions.g:7090:2: rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalKExpressions.g:7097:1: rule__KeyBooleanValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7101:1: ( ( '@' ) )
            // InternalKExpressions.g:7102:1: ( '@' )
            {
            // InternalKExpressions.g:7102:1: ( '@' )
            // InternalKExpressions.g:7103:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:7116:1: rule__KeyBooleanValueAnnotation__Group__1 : rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2 ;
    public final void rule__KeyBooleanValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7120:1: ( rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2 )
            // InternalKExpressions.g:7121:2: rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_45);
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
    // InternalKExpressions.g:7128:1: rule__KeyBooleanValueAnnotation__Group__1__Impl : ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7132:1: ( ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) ) )
            // InternalKExpressions.g:7133:1: ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:7133:1: ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) )
            // InternalKExpressions.g:7134:1: ( rule__KeyBooleanValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:7135:1: ( rule__KeyBooleanValueAnnotation__NameAssignment_1 )
            // InternalKExpressions.g:7135:2: rule__KeyBooleanValueAnnotation__NameAssignment_1
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
    // InternalKExpressions.g:7145:1: rule__KeyBooleanValueAnnotation__Group__2 : rule__KeyBooleanValueAnnotation__Group__2__Impl ;
    public final void rule__KeyBooleanValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7149:1: ( rule__KeyBooleanValueAnnotation__Group__2__Impl )
            // InternalKExpressions.g:7150:2: rule__KeyBooleanValueAnnotation__Group__2__Impl
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
    // InternalKExpressions.g:7156:1: rule__KeyBooleanValueAnnotation__Group__2__Impl : ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7160:1: ( ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) ) )
            // InternalKExpressions.g:7161:1: ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) )
            {
            // InternalKExpressions.g:7161:1: ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) )
            // InternalKExpressions.g:7162:1: ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getValueAssignment_2()); 
            }
            // InternalKExpressions.g:7163:1: ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 )
            // InternalKExpressions.g:7163:2: rule__KeyBooleanValueAnnotation__ValueAssignment_2
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
    // InternalKExpressions.g:7179:1: rule__KeyIntValueAnnotation__Group__0 : rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1 ;
    public final void rule__KeyIntValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7183:1: ( rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1 )
            // InternalKExpressions.g:7184:2: rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalKExpressions.g:7191:1: rule__KeyIntValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyIntValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7195:1: ( ( '@' ) )
            // InternalKExpressions.g:7196:1: ( '@' )
            {
            // InternalKExpressions.g:7196:1: ( '@' )
            // InternalKExpressions.g:7197:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:7210:1: rule__KeyIntValueAnnotation__Group__1 : rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2 ;
    public final void rule__KeyIntValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7214:1: ( rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2 )
            // InternalKExpressions.g:7215:2: rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_46);
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
    // InternalKExpressions.g:7222:1: rule__KeyIntValueAnnotation__Group__1__Impl : ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyIntValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7226:1: ( ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) ) )
            // InternalKExpressions.g:7227:1: ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:7227:1: ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) )
            // InternalKExpressions.g:7228:1: ( rule__KeyIntValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:7229:1: ( rule__KeyIntValueAnnotation__NameAssignment_1 )
            // InternalKExpressions.g:7229:2: rule__KeyIntValueAnnotation__NameAssignment_1
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
    // InternalKExpressions.g:7239:1: rule__KeyIntValueAnnotation__Group__2 : rule__KeyIntValueAnnotation__Group__2__Impl ;
    public final void rule__KeyIntValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7243:1: ( rule__KeyIntValueAnnotation__Group__2__Impl )
            // InternalKExpressions.g:7244:2: rule__KeyIntValueAnnotation__Group__2__Impl
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
    // InternalKExpressions.g:7250:1: rule__KeyIntValueAnnotation__Group__2__Impl : ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyIntValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7254:1: ( ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) ) )
            // InternalKExpressions.g:7255:1: ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) )
            {
            // InternalKExpressions.g:7255:1: ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) )
            // InternalKExpressions.g:7256:1: ( rule__KeyIntValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getValueAssignment_2()); 
            }
            // InternalKExpressions.g:7257:1: ( rule__KeyIntValueAnnotation__ValueAssignment_2 )
            // InternalKExpressions.g:7257:2: rule__KeyIntValueAnnotation__ValueAssignment_2
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
    // InternalKExpressions.g:7273:1: rule__KeyFloatValueAnnotation__Group__0 : rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1 ;
    public final void rule__KeyFloatValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7277:1: ( rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1 )
            // InternalKExpressions.g:7278:2: rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalKExpressions.g:7285:1: rule__KeyFloatValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyFloatValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7289:1: ( ( '@' ) )
            // InternalKExpressions.g:7290:1: ( '@' )
            {
            // InternalKExpressions.g:7290:1: ( '@' )
            // InternalKExpressions.g:7291:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:7304:1: rule__KeyFloatValueAnnotation__Group__1 : rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2 ;
    public final void rule__KeyFloatValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7308:1: ( rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2 )
            // InternalKExpressions.g:7309:2: rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_47);
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
    // InternalKExpressions.g:7316:1: rule__KeyFloatValueAnnotation__Group__1__Impl : ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyFloatValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7320:1: ( ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) ) )
            // InternalKExpressions.g:7321:1: ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:7321:1: ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) )
            // InternalKExpressions.g:7322:1: ( rule__KeyFloatValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:7323:1: ( rule__KeyFloatValueAnnotation__NameAssignment_1 )
            // InternalKExpressions.g:7323:2: rule__KeyFloatValueAnnotation__NameAssignment_1
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
    // InternalKExpressions.g:7333:1: rule__KeyFloatValueAnnotation__Group__2 : rule__KeyFloatValueAnnotation__Group__2__Impl ;
    public final void rule__KeyFloatValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7337:1: ( rule__KeyFloatValueAnnotation__Group__2__Impl )
            // InternalKExpressions.g:7338:2: rule__KeyFloatValueAnnotation__Group__2__Impl
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
    // InternalKExpressions.g:7344:1: rule__KeyFloatValueAnnotation__Group__2__Impl : ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyFloatValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7348:1: ( ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) ) )
            // InternalKExpressions.g:7349:1: ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) )
            {
            // InternalKExpressions.g:7349:1: ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) )
            // InternalKExpressions.g:7350:1: ( rule__KeyFloatValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getValueAssignment_2()); 
            }
            // InternalKExpressions.g:7351:1: ( rule__KeyFloatValueAnnotation__ValueAssignment_2 )
            // InternalKExpressions.g:7351:2: rule__KeyFloatValueAnnotation__ValueAssignment_2
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
    // InternalKExpressions.g:7367:1: rule__ExtendedID__Group__0 : rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 ;
    public final void rule__ExtendedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7371:1: ( rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 )
            // InternalKExpressions.g:7372:2: rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_48);
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
    // InternalKExpressions.g:7379:1: rule__ExtendedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7383:1: ( ( RULE_ID ) )
            // InternalKExpressions.g:7384:1: ( RULE_ID )
            {
            // InternalKExpressions.g:7384:1: ( RULE_ID )
            // InternalKExpressions.g:7385:1: RULE_ID
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
    // InternalKExpressions.g:7396:1: rule__ExtendedID__Group__1 : rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2 ;
    public final void rule__ExtendedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7400:1: ( rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2 )
            // InternalKExpressions.g:7401:2: rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_48);
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
    // InternalKExpressions.g:7408:1: rule__ExtendedID__Group__1__Impl : ( ( rule__ExtendedID__Group_1__0 )* ) ;
    public final void rule__ExtendedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7412:1: ( ( ( rule__ExtendedID__Group_1__0 )* ) )
            // InternalKExpressions.g:7413:1: ( ( rule__ExtendedID__Group_1__0 )* )
            {
            // InternalKExpressions.g:7413:1: ( ( rule__ExtendedID__Group_1__0 )* )
            // InternalKExpressions.g:7414:1: ( rule__ExtendedID__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:7415:1: ( rule__ExtendedID__Group_1__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==59) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalKExpressions.g:7415:2: rule__ExtendedID__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_49);
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
    // InternalKExpressions.g:7425:1: rule__ExtendedID__Group__2 : rule__ExtendedID__Group__2__Impl ;
    public final void rule__ExtendedID__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7429:1: ( rule__ExtendedID__Group__2__Impl )
            // InternalKExpressions.g:7430:2: rule__ExtendedID__Group__2__Impl
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
    // InternalKExpressions.g:7436:1: rule__ExtendedID__Group__2__Impl : ( ( rule__ExtendedID__Group_2__0 )? ) ;
    public final void rule__ExtendedID__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7440:1: ( ( ( rule__ExtendedID__Group_2__0 )? ) )
            // InternalKExpressions.g:7441:1: ( ( rule__ExtendedID__Group_2__0 )? )
            {
            // InternalKExpressions.g:7441:1: ( ( rule__ExtendedID__Group_2__0 )? )
            // InternalKExpressions.g:7442:1: ( rule__ExtendedID__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup_2()); 
            }
            // InternalKExpressions.g:7443:1: ( rule__ExtendedID__Group_2__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==60) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalKExpressions.g:7443:2: rule__ExtendedID__Group_2__0
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
    // InternalKExpressions.g:7459:1: rule__ExtendedID__Group_1__0 : rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 ;
    public final void rule__ExtendedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7463:1: ( rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 )
            // InternalKExpressions.g:7464:2: rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1
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
    // InternalKExpressions.g:7471:1: rule__ExtendedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__ExtendedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7475:1: ( ( '.' ) )
            // InternalKExpressions.g:7476:1: ( '.' )
            {
            // InternalKExpressions.g:7476:1: ( '.' )
            // InternalKExpressions.g:7477:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            }
            match(input,59,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:7490:1: rule__ExtendedID__Group_1__1 : rule__ExtendedID__Group_1__1__Impl ;
    public final void rule__ExtendedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7494:1: ( rule__ExtendedID__Group_1__1__Impl )
            // InternalKExpressions.g:7495:2: rule__ExtendedID__Group_1__1__Impl
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
    // InternalKExpressions.g:7501:1: rule__ExtendedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7505:1: ( ( RULE_ID ) )
            // InternalKExpressions.g:7506:1: ( RULE_ID )
            {
            // InternalKExpressions.g:7506:1: ( RULE_ID )
            // InternalKExpressions.g:7507:1: RULE_ID
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
    // InternalKExpressions.g:7522:1: rule__ExtendedID__Group_2__0 : rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1 ;
    public final void rule__ExtendedID__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7526:1: ( rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1 )
            // InternalKExpressions.g:7527:2: rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_50);
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
    // InternalKExpressions.g:7534:1: rule__ExtendedID__Group_2__0__Impl : ( '#' ) ;
    public final void rule__ExtendedID__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7538:1: ( ( '#' ) )
            // InternalKExpressions.g:7539:1: ( '#' )
            {
            // InternalKExpressions.g:7539:1: ( '#' )
            // InternalKExpressions.g:7540:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getNumberSignKeyword_2_0()); 
            }
            match(input,60,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:7553:1: rule__ExtendedID__Group_2__1 : rule__ExtendedID__Group_2__1__Impl ;
    public final void rule__ExtendedID__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7557:1: ( rule__ExtendedID__Group_2__1__Impl )
            // InternalKExpressions.g:7558:2: rule__ExtendedID__Group_2__1__Impl
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
    // InternalKExpressions.g:7564:1: rule__ExtendedID__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__ExtendedID__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7568:1: ( ( RULE_INT ) )
            // InternalKExpressions.g:7569:1: ( RULE_INT )
            {
            // InternalKExpressions.g:7569:1: ( RULE_INT )
            // InternalKExpressions.g:7570:1: RULE_INT
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
    // InternalKExpressions.g:7585:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7589:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // InternalKExpressions.g:7590:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_46);
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
    // InternalKExpressions.g:7597:1: rule__Integer__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7601:1: ( ( ( '-' )? ) )
            // InternalKExpressions.g:7602:1: ( ( '-' )? )
            {
            // InternalKExpressions.g:7602:1: ( ( '-' )? )
            // InternalKExpressions.g:7603:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalKExpressions.g:7604:1: ( '-' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==21) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalKExpressions.g:7605:2: '-'
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
    // InternalKExpressions.g:7616:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7620:1: ( rule__Integer__Group__1__Impl )
            // InternalKExpressions.g:7621:2: rule__Integer__Group__1__Impl
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
    // InternalKExpressions.g:7627:1: rule__Integer__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7631:1: ( ( RULE_INT ) )
            // InternalKExpressions.g:7632:1: ( RULE_INT )
            {
            // InternalKExpressions.g:7632:1: ( RULE_INT )
            // InternalKExpressions.g:7633:1: RULE_INT
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
    // InternalKExpressions.g:7648:1: rule__Floateger__Group__0 : rule__Floateger__Group__0__Impl rule__Floateger__Group__1 ;
    public final void rule__Floateger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7652:1: ( rule__Floateger__Group__0__Impl rule__Floateger__Group__1 )
            // InternalKExpressions.g:7653:2: rule__Floateger__Group__0__Impl rule__Floateger__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_47);
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
    // InternalKExpressions.g:7660:1: rule__Floateger__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Floateger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7664:1: ( ( ( '-' )? ) )
            // InternalKExpressions.g:7665:1: ( ( '-' )? )
            {
            // InternalKExpressions.g:7665:1: ( ( '-' )? )
            // InternalKExpressions.g:7666:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloategerAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalKExpressions.g:7667:1: ( '-' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==21) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalKExpressions.g:7668:2: '-'
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
    // InternalKExpressions.g:7679:1: rule__Floateger__Group__1 : rule__Floateger__Group__1__Impl ;
    public final void rule__Floateger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7683:1: ( rule__Floateger__Group__1__Impl )
            // InternalKExpressions.g:7684:2: rule__Floateger__Group__1__Impl
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
    // InternalKExpressions.g:7690:1: rule__Floateger__Group__1__Impl : ( RULE_FLOAT ) ;
    public final void rule__Floateger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7694:1: ( ( RULE_FLOAT ) )
            // InternalKExpressions.g:7695:1: ( RULE_FLOAT )
            {
            // InternalKExpressions.g:7695:1: ( RULE_FLOAT )
            // InternalKExpressions.g:7696:1: RULE_FLOAT
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
    // InternalKExpressions.g:7712:1: rule__OrExpression__OperatorAssignment_1_1 : ( ruleOrOperator ) ;
    public final void rule__OrExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7716:1: ( ( ruleOrOperator ) )
            // InternalKExpressions.g:7717:1: ( ruleOrOperator )
            {
            // InternalKExpressions.g:7717:1: ( ruleOrOperator )
            // InternalKExpressions.g:7718:1: ruleOrOperator
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
    // InternalKExpressions.g:7727:1: rule__OrExpression__SubExpressionsAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7731:1: ( ( ruleAndExpression ) )
            // InternalKExpressions.g:7732:1: ( ruleAndExpression )
            {
            // InternalKExpressions.g:7732:1: ( ruleAndExpression )
            // InternalKExpressions.g:7733:1: ruleAndExpression
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
    // InternalKExpressions.g:7742:1: rule__AndExpression__OperatorAssignment_1_1 : ( ruleAndOperator ) ;
    public final void rule__AndExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7746:1: ( ( ruleAndOperator ) )
            // InternalKExpressions.g:7747:1: ( ruleAndOperator )
            {
            // InternalKExpressions.g:7747:1: ( ruleAndOperator )
            // InternalKExpressions.g:7748:1: ruleAndOperator
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
    // InternalKExpressions.g:7757:1: rule__AndExpression__SubExpressionsAssignment_1_2 : ( ruleCompareOperation ) ;
    public final void rule__AndExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7761:1: ( ( ruleCompareOperation ) )
            // InternalKExpressions.g:7762:1: ( ruleCompareOperation )
            {
            // InternalKExpressions.g:7762:1: ( ruleCompareOperation )
            // InternalKExpressions.g:7763:1: ruleCompareOperation
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
    // InternalKExpressions.g:7772:1: rule__CompareOperation__OperatorAssignment_0_1_1 : ( ruleCompareOperator ) ;
    public final void rule__CompareOperation__OperatorAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7776:1: ( ( ruleCompareOperator ) )
            // InternalKExpressions.g:7777:1: ( ruleCompareOperator )
            {
            // InternalKExpressions.g:7777:1: ( ruleCompareOperator )
            // InternalKExpressions.g:7778:1: ruleCompareOperator
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
    // InternalKExpressions.g:7787:1: rule__CompareOperation__SubExpressionsAssignment_0_1_2 : ( ruleNotOrValuedExpression ) ;
    public final void rule__CompareOperation__SubExpressionsAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7791:1: ( ( ruleNotOrValuedExpression ) )
            // InternalKExpressions.g:7792:1: ( ruleNotOrValuedExpression )
            {
            // InternalKExpressions.g:7792:1: ( ruleNotOrValuedExpression )
            // InternalKExpressions.g:7793:1: ruleNotOrValuedExpression
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
    // InternalKExpressions.g:7802:1: rule__NotExpression__OperatorAssignment_0_1 : ( ruleNotOperator ) ;
    public final void rule__NotExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7806:1: ( ( ruleNotOperator ) )
            // InternalKExpressions.g:7807:1: ( ruleNotOperator )
            {
            // InternalKExpressions.g:7807:1: ( ruleNotOperator )
            // InternalKExpressions.g:7808:1: ruleNotOperator
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
    // InternalKExpressions.g:7817:1: rule__NotExpression__SubExpressionsAssignment_0_2 : ( ruleNotExpression ) ;
    public final void rule__NotExpression__SubExpressionsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7821:1: ( ( ruleNotExpression ) )
            // InternalKExpressions.g:7822:1: ( ruleNotExpression )
            {
            // InternalKExpressions.g:7822:1: ( ruleNotExpression )
            // InternalKExpressions.g:7823:1: ruleNotExpression
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
    // InternalKExpressions.g:7832:1: rule__AddExpression__OperatorAssignment_1_1 : ( ruleAddOperator ) ;
    public final void rule__AddExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7836:1: ( ( ruleAddOperator ) )
            // InternalKExpressions.g:7837:1: ( ruleAddOperator )
            {
            // InternalKExpressions.g:7837:1: ( ruleAddOperator )
            // InternalKExpressions.g:7838:1: ruleAddOperator
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
    // InternalKExpressions.g:7847:1: rule__AddExpression__SubExpressionsAssignment_1_2 : ( ruleSubExpression ) ;
    public final void rule__AddExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7851:1: ( ( ruleSubExpression ) )
            // InternalKExpressions.g:7852:1: ( ruleSubExpression )
            {
            // InternalKExpressions.g:7852:1: ( ruleSubExpression )
            // InternalKExpressions.g:7853:1: ruleSubExpression
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
    // InternalKExpressions.g:7862:1: rule__SubExpression__OperatorAssignment_1_1 : ( ruleSubOperator ) ;
    public final void rule__SubExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7866:1: ( ( ruleSubOperator ) )
            // InternalKExpressions.g:7867:1: ( ruleSubOperator )
            {
            // InternalKExpressions.g:7867:1: ( ruleSubOperator )
            // InternalKExpressions.g:7868:1: ruleSubOperator
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
    // InternalKExpressions.g:7877:1: rule__SubExpression__SubExpressionsAssignment_1_2 : ( ruleMultExpression ) ;
    public final void rule__SubExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7881:1: ( ( ruleMultExpression ) )
            // InternalKExpressions.g:7882:1: ( ruleMultExpression )
            {
            // InternalKExpressions.g:7882:1: ( ruleMultExpression )
            // InternalKExpressions.g:7883:1: ruleMultExpression
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
    // InternalKExpressions.g:7892:1: rule__MultExpression__OperatorAssignment_1_1 : ( ruleMultOperator ) ;
    public final void rule__MultExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7896:1: ( ( ruleMultOperator ) )
            // InternalKExpressions.g:7897:1: ( ruleMultOperator )
            {
            // InternalKExpressions.g:7897:1: ( ruleMultOperator )
            // InternalKExpressions.g:7898:1: ruleMultOperator
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
    // InternalKExpressions.g:7907:1: rule__MultExpression__SubExpressionsAssignment_1_2 : ( ruleDivExpression ) ;
    public final void rule__MultExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7911:1: ( ( ruleDivExpression ) )
            // InternalKExpressions.g:7912:1: ( ruleDivExpression )
            {
            // InternalKExpressions.g:7912:1: ( ruleDivExpression )
            // InternalKExpressions.g:7913:1: ruleDivExpression
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
    // InternalKExpressions.g:7922:1: rule__DivExpression__OperatorAssignment_1_1 : ( ruleDivOperator ) ;
    public final void rule__DivExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7926:1: ( ( ruleDivOperator ) )
            // InternalKExpressions.g:7927:1: ( ruleDivOperator )
            {
            // InternalKExpressions.g:7927:1: ( ruleDivOperator )
            // InternalKExpressions.g:7928:1: ruleDivOperator
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
    // InternalKExpressions.g:7937:1: rule__DivExpression__SubExpressionsAssignment_1_2 : ( ruleModExpression ) ;
    public final void rule__DivExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7941:1: ( ( ruleModExpression ) )
            // InternalKExpressions.g:7942:1: ( ruleModExpression )
            {
            // InternalKExpressions.g:7942:1: ( ruleModExpression )
            // InternalKExpressions.g:7943:1: ruleModExpression
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
    // InternalKExpressions.g:7952:1: rule__ModExpression__OperatorAssignment_1_1 : ( ruleModOperator ) ;
    public final void rule__ModExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7956:1: ( ( ruleModOperator ) )
            // InternalKExpressions.g:7957:1: ( ruleModOperator )
            {
            // InternalKExpressions.g:7957:1: ( ruleModOperator )
            // InternalKExpressions.g:7958:1: ruleModOperator
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
    // InternalKExpressions.g:7967:1: rule__ModExpression__SubExpressionsAssignment_1_2 : ( ruleAtomicValuedExpression ) ;
    public final void rule__ModExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7971:1: ( ( ruleAtomicValuedExpression ) )
            // InternalKExpressions.g:7972:1: ( ruleAtomicValuedExpression )
            {
            // InternalKExpressions.g:7972:1: ( ruleAtomicValuedExpression )
            // InternalKExpressions.g:7973:1: ruleAtomicValuedExpression
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
    // InternalKExpressions.g:7982:1: rule__NegExpression__OperatorAssignment_0_1 : ( ruleSubOperator ) ;
    public final void rule__NegExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7986:1: ( ( ruleSubOperator ) )
            // InternalKExpressions.g:7987:1: ( ruleSubOperator )
            {
            // InternalKExpressions.g:7987:1: ( ruleSubOperator )
            // InternalKExpressions.g:7988:1: ruleSubOperator
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
    // InternalKExpressions.g:7997:1: rule__NegExpression__SubExpressionsAssignment_0_2 : ( ruleNegExpression ) ;
    public final void rule__NegExpression__SubExpressionsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8001:1: ( ( ruleNegExpression ) )
            // InternalKExpressions.g:8002:1: ( ruleNegExpression )
            {
            // InternalKExpressions.g:8002:1: ( ruleNegExpression )
            // InternalKExpressions.g:8003:1: ruleNegExpression
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
    // InternalKExpressions.g:8012:1: rule__ValuedObjectTestExpression__OperatorAssignment_0_1 : ( rulePreOperator ) ;
    public final void rule__ValuedObjectTestExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8016:1: ( ( rulePreOperator ) )
            // InternalKExpressions.g:8017:1: ( rulePreOperator )
            {
            // InternalKExpressions.g:8017:1: ( rulePreOperator )
            // InternalKExpressions.g:8018:1: rulePreOperator
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
    // InternalKExpressions.g:8027:1: rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 : ( ruleValuedObjectTestExpression ) ;
    public final void rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8031:1: ( ( ruleValuedObjectTestExpression ) )
            // InternalKExpressions.g:8032:1: ( ruleValuedObjectTestExpression )
            {
            // InternalKExpressions.g:8032:1: ( ruleValuedObjectTestExpression )
            // InternalKExpressions.g:8033:1: ruleValuedObjectTestExpression
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
    // InternalKExpressions.g:8042:1: rule__ValuedObjectTestExpression__OperatorAssignment_1_1 : ( ruleValueTestOperator ) ;
    public final void rule__ValuedObjectTestExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8046:1: ( ( ruleValueTestOperator ) )
            // InternalKExpressions.g:8047:1: ( ruleValueTestOperator )
            {
            // InternalKExpressions.g:8047:1: ( ruleValueTestOperator )
            // InternalKExpressions.g:8048:1: ruleValueTestOperator
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
    // InternalKExpressions.g:8057:1: rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 : ( ruleValuedObjectReference ) ;
    public final void rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8061:1: ( ( ruleValuedObjectReference ) )
            // InternalKExpressions.g:8062:1: ( ruleValuedObjectReference )
            {
            // InternalKExpressions.g:8062:1: ( ruleValuedObjectReference )
            // InternalKExpressions.g:8063:1: ruleValuedObjectReference
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


    // $ANTLR start "rule__ValuedObjectReference__ValuedObjectAssignment_0"
    // InternalKExpressions.g:8072:1: rule__ValuedObjectReference__ValuedObjectAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ValuedObjectReference__ValuedObjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8076:1: ( ( ( RULE_ID ) ) )
            // InternalKExpressions.g:8077:1: ( ( RULE_ID ) )
            {
            // InternalKExpressions.g:8077:1: ( ( RULE_ID ) )
            // InternalKExpressions.g:8078:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
            }
            // InternalKExpressions.g:8079:1: ( RULE_ID )
            // InternalKExpressions.g:8080:1: RULE_ID
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


    // $ANTLR start "rule__ValuedObjectReference__TickAssignment_1"
    // InternalKExpressions.g:8091:1: rule__ValuedObjectReference__TickAssignment_1 : ( ( 'tick' ) ) ;
    public final void rule__ValuedObjectReference__TickAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8095:1: ( ( ( 'tick' ) ) )
            // InternalKExpressions.g:8096:1: ( ( 'tick' ) )
            {
            // InternalKExpressions.g:8096:1: ( ( 'tick' ) )
            // InternalKExpressions.g:8097:1: ( 'tick' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getTickTickKeyword_1_0()); 
            }
            // InternalKExpressions.g:8098:1: ( 'tick' )
            // InternalKExpressions.g:8099:1: 'tick'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getTickTickKeyword_1_0()); 
            }
            match(input,61,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuedObjectReferenceAccess().getTickTickKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuedObjectReferenceAccess().getTickTickKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValuedObjectReference__TickAssignment_1"


    // $ANTLR start "rule__TextExpression__CodeAssignment_0"
    // InternalKExpressions.g:8114:1: rule__TextExpression__CodeAssignment_0 : ( RULE_HOSTCODE ) ;
    public final void rule__TextExpression__CodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8118:1: ( ( RULE_HOSTCODE ) )
            // InternalKExpressions.g:8119:1: ( RULE_HOSTCODE )
            {
            // InternalKExpressions.g:8119:1: ( RULE_HOSTCODE )
            // InternalKExpressions.g:8120:1: RULE_HOSTCODE
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
    // InternalKExpressions.g:8129:1: rule__TextExpression__TypeAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__TextExpression__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8133:1: ( ( RULE_ID ) )
            // InternalKExpressions.g:8134:1: ( RULE_ID )
            {
            // InternalKExpressions.g:8134:1: ( RULE_ID )
            // InternalKExpressions.g:8135:1: RULE_ID
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
    // InternalKExpressions.g:8144:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8148:1: ( ( RULE_INT ) )
            // InternalKExpressions.g:8149:1: ( RULE_INT )
            {
            // InternalKExpressions.g:8149:1: ( RULE_INT )
            // InternalKExpressions.g:8150:1: RULE_INT
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
    // InternalKExpressions.g:8159:1: rule__FloatValue__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8163:1: ( ( RULE_FLOAT ) )
            // InternalKExpressions.g:8164:1: ( RULE_FLOAT )
            {
            // InternalKExpressions.g:8164:1: ( RULE_FLOAT )
            // InternalKExpressions.g:8165:1: RULE_FLOAT
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
    // InternalKExpressions.g:8174:1: rule__BooleanValue__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8178:1: ( ( RULE_BOOLEAN ) )
            // InternalKExpressions.g:8179:1: ( RULE_BOOLEAN )
            {
            // InternalKExpressions.g:8179:1: ( RULE_BOOLEAN )
            // InternalKExpressions.g:8180:1: RULE_BOOLEAN
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
    // InternalKExpressions.g:8189:1: rule__ISignal__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ISignal__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8193:1: ( ( RULE_ID ) )
            // InternalKExpressions.g:8194:1: ( RULE_ID )
            {
            // InternalKExpressions.g:8194:1: ( RULE_ID )
            // InternalKExpressions.g:8195:1: RULE_ID
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
    // InternalKExpressions.g:8204:1: rule__ISignal__ChannelDescrAssignment_1 : ( ruleChannelDescription ) ;
    public final void rule__ISignal__ChannelDescrAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8208:1: ( ( ruleChannelDescription ) )
            // InternalKExpressions.g:8209:1: ( ruleChannelDescription )
            {
            // InternalKExpressions.g:8209:1: ( ruleChannelDescription )
            // InternalKExpressions.g:8210:1: ruleChannelDescription
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
    // InternalKExpressions.g:8219:1: rule__InterfaceSignalDecl__SignalsAssignment_0_2 : ( ruleISignal ) ;
    public final void rule__InterfaceSignalDecl__SignalsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8223:1: ( ( ruleISignal ) )
            // InternalKExpressions.g:8224:1: ( ruleISignal )
            {
            // InternalKExpressions.g:8224:1: ( ruleISignal )
            // InternalKExpressions.g:8225:1: ruleISignal
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
    // InternalKExpressions.g:8234:1: rule__InterfaceSignalDecl__SignalsAssignment_0_3_1 : ( ruleISignal ) ;
    public final void rule__InterfaceSignalDecl__SignalsAssignment_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8238:1: ( ( ruleISignal ) )
            // InternalKExpressions.g:8239:1: ( ruleISignal )
            {
            // InternalKExpressions.g:8239:1: ( ruleISignal )
            // InternalKExpressions.g:8240:1: ruleISignal
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
    // InternalKExpressions.g:8249:1: rule__InterfaceSignalDecl__SignalsAssignment_1_2 : ( ruleISignal ) ;
    public final void rule__InterfaceSignalDecl__SignalsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8253:1: ( ( ruleISignal ) )
            // InternalKExpressions.g:8254:1: ( ruleISignal )
            {
            // InternalKExpressions.g:8254:1: ( ruleISignal )
            // InternalKExpressions.g:8255:1: ruleISignal
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
    // InternalKExpressions.g:8264:1: rule__InterfaceSignalDecl__SignalsAssignment_1_3_1 : ( ruleISignal ) ;
    public final void rule__InterfaceSignalDecl__SignalsAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8268:1: ( ( ruleISignal ) )
            // InternalKExpressions.g:8269:1: ( ruleISignal )
            {
            // InternalKExpressions.g:8269:1: ( ruleISignal )
            // InternalKExpressions.g:8270:1: ruleISignal
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
    // InternalKExpressions.g:8279:1: rule__InterfaceSignalDecl__SignalsAssignment_2_2 : ( ruleISignal ) ;
    public final void rule__InterfaceSignalDecl__SignalsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8283:1: ( ( ruleISignal ) )
            // InternalKExpressions.g:8284:1: ( ruleISignal )
            {
            // InternalKExpressions.g:8284:1: ( ruleISignal )
            // InternalKExpressions.g:8285:1: ruleISignal
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
    // InternalKExpressions.g:8294:1: rule__InterfaceSignalDecl__SignalsAssignment_2_3_1 : ( ruleISignal ) ;
    public final void rule__InterfaceSignalDecl__SignalsAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8298:1: ( ( ruleISignal ) )
            // InternalKExpressions.g:8299:1: ( ruleISignal )
            {
            // InternalKExpressions.g:8299:1: ( ruleISignal )
            // InternalKExpressions.g:8300:1: ruleISignal
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
    // InternalKExpressions.g:8309:1: rule__InterfaceSignalDecl__SignalsAssignment_3_2 : ( ruleISignal ) ;
    public final void rule__InterfaceSignalDecl__SignalsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8313:1: ( ( ruleISignal ) )
            // InternalKExpressions.g:8314:1: ( ruleISignal )
            {
            // InternalKExpressions.g:8314:1: ( ruleISignal )
            // InternalKExpressions.g:8315:1: ruleISignal
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
    // InternalKExpressions.g:8324:1: rule__InterfaceSignalDecl__SignalsAssignment_3_3_1 : ( ruleISignal ) ;
    public final void rule__InterfaceSignalDecl__SignalsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8328:1: ( ( ruleISignal ) )
            // InternalKExpressions.g:8329:1: ( ruleISignal )
            {
            // InternalKExpressions.g:8329:1: ( ruleISignal )
            // InternalKExpressions.g:8330:1: ruleISignal
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
    // InternalKExpressions.g:8339:1: rule__ChannelDescription__TypeAssignment_0_1 : ( ruleTypeIdentifier ) ;
    public final void rule__ChannelDescription__TypeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8343:1: ( ( ruleTypeIdentifier ) )
            // InternalKExpressions.g:8344:1: ( ruleTypeIdentifier )
            {
            // InternalKExpressions.g:8344:1: ( ruleTypeIdentifier )
            // InternalKExpressions.g:8345:1: ruleTypeIdentifier
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
    // InternalKExpressions.g:8354:1: rule__ChannelDescription__TypeAssignment_1_1 : ( ruleTypeIdentifier ) ;
    public final void rule__ChannelDescription__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8358:1: ( ( ruleTypeIdentifier ) )
            // InternalKExpressions.g:8359:1: ( ruleTypeIdentifier )
            {
            // InternalKExpressions.g:8359:1: ( ruleTypeIdentifier )
            // InternalKExpressions.g:8360:1: ruleTypeIdentifier
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
    // InternalKExpressions.g:8369:1: rule__ChannelDescription__ExpressionAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__ChannelDescription__ExpressionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8373:1: ( ( ruleExpression ) )
            // InternalKExpressions.g:8374:1: ( ruleExpression )
            {
            // InternalKExpressions.g:8374:1: ( ruleExpression )
            // InternalKExpressions.g:8375:1: ruleExpression
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
    // InternalKExpressions.g:8384:1: rule__ChannelDescription__TypeAssignment_2_3 : ( ruleTypeIdentifier ) ;
    public final void rule__ChannelDescription__TypeAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8388:1: ( ( ruleTypeIdentifier ) )
            // InternalKExpressions.g:8389:1: ( ruleTypeIdentifier )
            {
            // InternalKExpressions.g:8389:1: ( ruleTypeIdentifier )
            // InternalKExpressions.g:8390:1: ruleTypeIdentifier
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
    // InternalKExpressions.g:8399:1: rule__InterfaceVariableDecl__VarDeclsAssignment_1 : ( ruleVariableDecl ) ;
    public final void rule__InterfaceVariableDecl__VarDeclsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8403:1: ( ( ruleVariableDecl ) )
            // InternalKExpressions.g:8404:1: ( ruleVariableDecl )
            {
            // InternalKExpressions.g:8404:1: ( ruleVariableDecl )
            // InternalKExpressions.g:8405:1: ruleVariableDecl
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
    // InternalKExpressions.g:8414:1: rule__InterfaceVariableDecl__VarDeclsAssignment_2_1 : ( ruleVariableDecl ) ;
    public final void rule__InterfaceVariableDecl__VarDeclsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8418:1: ( ( ruleVariableDecl ) )
            // InternalKExpressions.g:8419:1: ( ruleVariableDecl )
            {
            // InternalKExpressions.g:8419:1: ( ruleVariableDecl )
            // InternalKExpressions.g:8420:1: ruleVariableDecl
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
    // InternalKExpressions.g:8429:1: rule__VariableDecl__VariablesAssignment_0 : ( ruleIVariable ) ;
    public final void rule__VariableDecl__VariablesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8433:1: ( ( ruleIVariable ) )
            // InternalKExpressions.g:8434:1: ( ruleIVariable )
            {
            // InternalKExpressions.g:8434:1: ( ruleIVariable )
            // InternalKExpressions.g:8435:1: ruleIVariable
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
    // InternalKExpressions.g:8444:1: rule__VariableDecl__VariablesAssignment_1_1 : ( ruleIVariable ) ;
    public final void rule__VariableDecl__VariablesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8448:1: ( ( ruleIVariable ) )
            // InternalKExpressions.g:8449:1: ( ruleIVariable )
            {
            // InternalKExpressions.g:8449:1: ( ruleIVariable )
            // InternalKExpressions.g:8450:1: ruleIVariable
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
    // InternalKExpressions.g:8459:1: rule__VariableDecl__TypeAssignment_3 : ( ruleTypeIdentifier ) ;
    public final void rule__VariableDecl__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8463:1: ( ( ruleTypeIdentifier ) )
            // InternalKExpressions.g:8464:1: ( ruleTypeIdentifier )
            {
            // InternalKExpressions.g:8464:1: ( ruleTypeIdentifier )
            // InternalKExpressions.g:8465:1: ruleTypeIdentifier
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
    // InternalKExpressions.g:8474:1: rule__IVariable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__IVariable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8478:1: ( ( RULE_ID ) )
            // InternalKExpressions.g:8479:1: ( RULE_ID )
            {
            // InternalKExpressions.g:8479:1: ( RULE_ID )
            // InternalKExpressions.g:8480:1: RULE_ID
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
    // InternalKExpressions.g:8489:1: rule__IVariable__ExpressionAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__IVariable__ExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8493:1: ( ( ruleExpression ) )
            // InternalKExpressions.g:8494:1: ( ruleExpression )
            {
            // InternalKExpressions.g:8494:1: ( ruleExpression )
            // InternalKExpressions.g:8495:1: ruleExpression
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
    // InternalKExpressions.g:8504:1: rule__TypeIdentifier__TypeAssignment_0 : ( ruleValueType ) ;
    public final void rule__TypeIdentifier__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8508:1: ( ( ruleValueType ) )
            // InternalKExpressions.g:8509:1: ( ruleValueType )
            {
            // InternalKExpressions.g:8509:1: ( ruleValueType )
            // InternalKExpressions.g:8510:1: ruleValueType
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
    // InternalKExpressions.g:8519:1: rule__TypeIdentifier__TypeIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__TypeIdentifier__TypeIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8523:1: ( ( RULE_ID ) )
            // InternalKExpressions.g:8524:1: ( RULE_ID )
            {
            // InternalKExpressions.g:8524:1: ( RULE_ID )
            // InternalKExpressions.g:8525:1: RULE_ID
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
    // InternalKExpressions.g:8534:1: rule__TypeIdentifier__TypeAssignment_2_1_0 : ( ruleValueType ) ;
    public final void rule__TypeIdentifier__TypeAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8538:1: ( ( ruleValueType ) )
            // InternalKExpressions.g:8539:1: ( ruleValueType )
            {
            // InternalKExpressions.g:8539:1: ( ruleValueType )
            // InternalKExpressions.g:8540:1: ruleValueType
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
    // InternalKExpressions.g:8549:1: rule__TypeIdentifier__TypeIDAssignment_2_1_1 : ( RULE_ID ) ;
    public final void rule__TypeIdentifier__TypeIDAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8553:1: ( ( RULE_ID ) )
            // InternalKExpressions.g:8554:1: ( RULE_ID )
            {
            // InternalKExpressions.g:8554:1: ( RULE_ID )
            // InternalKExpressions.g:8555:1: RULE_ID
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
    // InternalKExpressions.g:8564:1: rule__TypeIdentifier__OperatorAssignment_2_3 : ( ruleCombineOperator ) ;
    public final void rule__TypeIdentifier__OperatorAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8568:1: ( ( ruleCombineOperator ) )
            // InternalKExpressions.g:8569:1: ( ruleCombineOperator )
            {
            // InternalKExpressions.g:8569:1: ( ruleCombineOperator )
            // InternalKExpressions.g:8570:1: ruleCombineOperator
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
    // InternalKExpressions.g:8579:1: rule__CommentAnnotation__ValuesAssignment : ( RULE_COMMENT_ANNOTATION ) ;
    public final void rule__CommentAnnotation__ValuesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8583:1: ( ( RULE_COMMENT_ANNOTATION ) )
            // InternalKExpressions.g:8584:1: ( RULE_COMMENT_ANNOTATION )
            {
            // InternalKExpressions.g:8584:1: ( RULE_COMMENT_ANNOTATION )
            // InternalKExpressions.g:8585:1: RULE_COMMENT_ANNOTATION
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
    // InternalKExpressions.g:8594:1: rule__TagAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TagAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8598:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:8599:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:8599:1: ( ruleExtendedID )
            // InternalKExpressions.g:8600:1: ruleExtendedID
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
    // InternalKExpressions.g:8609:1: rule__KeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8613:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:8614:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:8614:1: ( ruleExtendedID )
            // InternalKExpressions.g:8615:1: ruleExtendedID
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
    // InternalKExpressions.g:8624:1: rule__KeyStringValueAnnotation__ValuesAssignment_2 : ( ruleEString ) ;
    public final void rule__KeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8628:1: ( ( ruleEString ) )
            // InternalKExpressions.g:8629:1: ( ruleEString )
            {
            // InternalKExpressions.g:8629:1: ( ruleEString )
            // InternalKExpressions.g:8630:1: ruleEString
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
    // InternalKExpressions.g:8639:1: rule__KeyStringValueAnnotation__ValuesAssignment_3_1 : ( ruleEString ) ;
    public final void rule__KeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8643:1: ( ( ruleEString ) )
            // InternalKExpressions.g:8644:1: ( ruleEString )
            {
            // InternalKExpressions.g:8644:1: ( ruleEString )
            // InternalKExpressions.g:8645:1: ruleEString
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
    // InternalKExpressions.g:8654:1: rule__TypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8658:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:8659:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:8659:1: ( ruleExtendedID )
            // InternalKExpressions.g:8660:1: ruleExtendedID
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
    // InternalKExpressions.g:8669:1: rule__TypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8673:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:8674:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:8674:1: ( ruleExtendedID )
            // InternalKExpressions.g:8675:1: ruleExtendedID
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
    // InternalKExpressions.g:8684:1: rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 : ( ruleEStringBoolean ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8688:1: ( ( ruleEStringBoolean ) )
            // InternalKExpressions.g:8689:1: ( ruleEStringBoolean )
            {
            // InternalKExpressions.g:8689:1: ( ruleEStringBoolean )
            // InternalKExpressions.g:8690:1: ruleEStringBoolean
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
    // InternalKExpressions.g:8699:1: rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( ruleEStringBoolean ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8703:1: ( ( ruleEStringBoolean ) )
            // InternalKExpressions.g:8704:1: ( ruleEStringBoolean )
            {
            // InternalKExpressions.g:8704:1: ( ruleEStringBoolean )
            // InternalKExpressions.g:8705:1: ruleEStringBoolean
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
    // InternalKExpressions.g:8714:1: rule__QuotedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__QuotedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8718:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:8719:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:8719:1: ( ruleExtendedID )
            // InternalKExpressions.g:8720:1: ruleExtendedID
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
    // InternalKExpressions.g:8729:1: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 : ( RULE_STRING ) ;
    public final void rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8733:1: ( ( RULE_STRING ) )
            // InternalKExpressions.g:8734:1: ( RULE_STRING )
            {
            // InternalKExpressions.g:8734:1: ( RULE_STRING )
            // InternalKExpressions.g:8735:1: RULE_STRING
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
    // InternalKExpressions.g:8744:1: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8748:1: ( ( RULE_STRING ) )
            // InternalKExpressions.g:8749:1: ( RULE_STRING )
            {
            // InternalKExpressions.g:8749:1: ( RULE_STRING )
            // InternalKExpressions.g:8750:1: RULE_STRING
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
    // InternalKExpressions.g:8759:1: rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8763:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:8764:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:8764:1: ( ruleExtendedID )
            // InternalKExpressions.g:8765:1: ruleExtendedID
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
    // InternalKExpressions.g:8774:1: rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8778:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:8779:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:8779:1: ( ruleExtendedID )
            // InternalKExpressions.g:8780:1: ruleExtendedID
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
    // InternalKExpressions.g:8789:1: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 : ( RULE_STRING ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8793:1: ( ( RULE_STRING ) )
            // InternalKExpressions.g:8794:1: ( RULE_STRING )
            {
            // InternalKExpressions.g:8794:1: ( RULE_STRING )
            // InternalKExpressions.g:8795:1: RULE_STRING
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
    // InternalKExpressions.g:8804:1: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8808:1: ( ( RULE_STRING ) )
            // InternalKExpressions.g:8809:1: ( RULE_STRING )
            {
            // InternalKExpressions.g:8809:1: ( RULE_STRING )
            // InternalKExpressions.g:8810:1: RULE_STRING
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
    // InternalKExpressions.g:8819:1: rule__KeyBooleanValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyBooleanValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8823:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:8824:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:8824:1: ( ruleExtendedID )
            // InternalKExpressions.g:8825:1: ruleExtendedID
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
    // InternalKExpressions.g:8834:1: rule__KeyBooleanValueAnnotation__ValueAssignment_2 : ( RULE_BOOLEAN ) ;
    public final void rule__KeyBooleanValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8838:1: ( ( RULE_BOOLEAN ) )
            // InternalKExpressions.g:8839:1: ( RULE_BOOLEAN )
            {
            // InternalKExpressions.g:8839:1: ( RULE_BOOLEAN )
            // InternalKExpressions.g:8840:1: RULE_BOOLEAN
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
    // InternalKExpressions.g:8849:1: rule__KeyIntValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyIntValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8853:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:8854:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:8854:1: ( ruleExtendedID )
            // InternalKExpressions.g:8855:1: ruleExtendedID
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
    // InternalKExpressions.g:8864:1: rule__KeyIntValueAnnotation__ValueAssignment_2 : ( ruleInteger ) ;
    public final void rule__KeyIntValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8868:1: ( ( ruleInteger ) )
            // InternalKExpressions.g:8869:1: ( ruleInteger )
            {
            // InternalKExpressions.g:8869:1: ( ruleInteger )
            // InternalKExpressions.g:8870:1: ruleInteger
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
    // InternalKExpressions.g:8879:1: rule__KeyFloatValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyFloatValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8883:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:8884:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:8884:1: ( ruleExtendedID )
            // InternalKExpressions.g:8885:1: ruleExtendedID
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
    // InternalKExpressions.g:8894:1: rule__KeyFloatValueAnnotation__ValueAssignment_2 : ( ruleFloateger ) ;
    public final void rule__KeyFloatValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8898:1: ( ( ruleFloateger ) )
            // InternalKExpressions.g:8899:1: ( ruleFloateger )
            {
            // InternalKExpressions.g:8899:1: ( ruleFloateger )
            // InternalKExpressions.g:8900:1: ruleFloateger
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

    // $ANTLR start synpred2_InternalKExpressions
    public final void synpred2_InternalKExpressions_fragment() throws RecognitionException {   
        // InternalKExpressions.g:1613:1: ( ( ( ruleBooleanExpression ) ) )
        // InternalKExpressions.g:1613:1: ( ( ruleBooleanExpression ) )
        {
        // InternalKExpressions.g:1613:1: ( ( ruleBooleanExpression ) )
        // InternalKExpressions.g:1614:1: ( ruleBooleanExpression )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall_0()); 
        }
        // InternalKExpressions.g:1615:1: ( ruleBooleanExpression )
        // InternalKExpressions.g:1615:3: ruleBooleanExpression
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
        // InternalKExpressions.g:1635:1: ( ( ( rule__CompareOperation__Group_0__0 ) ) )
        // InternalKExpressions.g:1635:1: ( ( rule__CompareOperation__Group_0__0 ) )
        {
        // InternalKExpressions.g:1635:1: ( ( rule__CompareOperation__Group_0__0 ) )
        // InternalKExpressions.g:1636:1: ( rule__CompareOperation__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCompareOperationAccess().getGroup_0()); 
        }
        // InternalKExpressions.g:1637:1: ( rule__CompareOperation__Group_0__0 )
        // InternalKExpressions.g:1637:2: rule__CompareOperation__Group_0__0
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
        // InternalKExpressions.g:1657:1: ( ( ( ruleValuedExpression ) ) )
        // InternalKExpressions.g:1657:1: ( ( ruleValuedExpression ) )
        {
        // InternalKExpressions.g:1657:1: ( ( ruleValuedExpression ) )
        // InternalKExpressions.g:1658:1: ( ruleValuedExpression )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
        }
        // InternalKExpressions.g:1659:1: ( ruleValuedExpression )
        // InternalKExpressions.g:1659:3: ruleValuedExpression
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
        // InternalKExpressions.g:1769:6: ( ( ( rule__AtomicValuedExpression__Group_2__0 ) ) )
        // InternalKExpressions.g:1769:6: ( ( rule__AtomicValuedExpression__Group_2__0 ) )
        {
        // InternalKExpressions.g:1769:6: ( ( rule__AtomicValuedExpression__Group_2__0 ) )
        // InternalKExpressions.g:1770:1: ( rule__AtomicValuedExpression__Group_2__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_2()); 
        }
        // InternalKExpressions.g:1771:1: ( rule__AtomicValuedExpression__Group_2__0 )
        // InternalKExpressions.g:1771:2: rule__AtomicValuedExpression__Group_2__0
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
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\5\12\0\2\uffff";
    static final String dfa_3s = "\1\75\12\0\2\uffff";
    static final String dfa_4s = "\13\uffff\1\1\1\2";
    static final String dfa_5s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\2\uffff}>";
    static final String[] dfa_6s = {
            "\1\5\1\10\1\2\1\3\1\12\6\uffff\1\6\2\uffff\1\13\1\uffff\1\1\3\uffff\1\7\21\uffff\1\4\21\uffff\1\11",
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
            return "1608:1: rule__Expression__Alternatives : ( ( ( ruleBooleanExpression ) ) | ( ruleValuedExpression ) );";
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
                        if ( (synpred2_InternalKExpressions()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index2_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_2 = input.LA(1);

                         
                        int index2_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalKExpressions()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index2_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_3 = input.LA(1);

                         
                        int index2_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalKExpressions()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index2_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA2_4 = input.LA(1);

                         
                        int index2_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalKExpressions()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index2_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA2_5 = input.LA(1);

                         
                        int index2_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalKExpressions()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index2_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA2_6 = input.LA(1);

                         
                        int index2_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalKExpressions()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index2_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA2_7 = input.LA(1);

                         
                        int index2_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalKExpressions()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index2_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA2_8 = input.LA(1);

                         
                        int index2_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalKExpressions()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index2_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA2_9 = input.LA(1);

                         
                        int index2_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalKExpressions()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index2_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA2_10 = input.LA(1);

                         
                        int index2_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalKExpressions()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index2_10);
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
    static final String dfa_7s = "\1\5\3\uffff\10\0\1\uffff";
    static final String dfa_8s = "\1\75\3\uffff\10\0\1\uffff";
    static final String dfa_9s = "\1\uffff\1\1\12\uffff\1\2";
    static final String dfa_10s = "\4\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff}>";
    static final String[] dfa_11s = {
            "\1\5\1\10\2\1\1\12\6\uffff\1\6\2\uffff\1\13\1\uffff\1\1\3\uffff\1\7\21\uffff\1\4\21\uffff\1\11",
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
            return "1630:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );";
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

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index3_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_5 = input.LA(1);

                         
                        int index3_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index3_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA3_6 = input.LA(1);

                         
                        int index3_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index3_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA3_7 = input.LA(1);

                         
                        int index3_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index3_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA3_8 = input.LA(1);

                         
                        int index3_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index3_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA3_9 = input.LA(1);

                         
                        int index3_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index3_9);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA3_10 = input.LA(1);

                         
                        int index3_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index3_10);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA3_11 = input.LA(1);

                         
                        int index3_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index3_11);
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
    static final String dfa_12s = "\14\uffff";
    static final String dfa_13s = "\1\5\3\uffff\7\0\1\uffff";
    static final String dfa_14s = "\1\75\3\uffff\7\0\1\uffff";
    static final String dfa_15s = "\1\uffff\1\1\11\uffff\1\2";
    static final String dfa_16s = "\4\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff}>";
    static final String[] dfa_17s = {
            "\1\5\1\10\2\1\1\12\6\uffff\1\6\2\uffff\1\13\1\uffff\1\1\3\uffff\1\7\21\uffff\1\4\21\uffff\1\11",
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
            return "1652:1: rule__NotOrValuedExpression__Alternatives : ( ( ( ruleValuedExpression ) ) | ( ruleNotExpression ) );";
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

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index4_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_5 = input.LA(1);

                         
                        int index4_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index4_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA4_6 = input.LA(1);

                         
                        int index4_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index4_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA4_7 = input.LA(1);

                         
                        int index4_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index4_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA4_8 = input.LA(1);

                         
                        int index4_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index4_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA4_9 = input.LA(1);

                         
                        int index4_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index4_9);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA4_10 = input.LA(1);

                         
                        int index4_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index4_10);
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
    static final String dfa_18s = "\13\uffff";
    static final String dfa_19s = "\1\5\2\uffff\1\0\7\uffff";
    static final String dfa_20s = "\1\75\2\uffff\1\0\7\uffff";
    static final String dfa_21s = "\1\uffff\1\1\1\2\1\uffff\1\4\5\uffff\1\3";
    static final String dfa_22s = "\3\uffff\1\0\7\uffff}>";
    static final String[] dfa_23s = {
            "\2\4\1\1\1\2\1\4\6\uffff\1\4\10\uffff\1\4\21\uffff\1\3\21\uffff\1\4",
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
            return "1752:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ( rule__AtomicValuedExpression__Group_2__0 ) ) | ( ruleAtomicExpression ) );";
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
                        if ( (synpred12_InternalKExpressions()) ) {s = 10;}

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
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x20000800022903E0L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000FC000000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x20000800022103E0L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x2000000002010040L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0018080000000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000C00000000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000800000000002L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x004000FF00000040L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0008800000000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000000FF00000040L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000078000560000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000200080L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000200100L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x1800000000000000L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0800000000000002L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000080L});
    }


}