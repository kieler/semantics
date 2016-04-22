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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_BOOLEAN", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_HOSTCODE", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'pre'", "'or'", "'and'", "'not'", "'+'", "'-'", "'*'", "'mod'", "'/'", "'?'", "'='", "'<'", "'<='", "'>'", "'>='", "'<>'", "'pure'", "'boolean'", "'unsigned'", "'integer'", "'float'", "'double'", "'string'", "'host'", "'none'", "'max'", "'min'", "'('", "')'", "'input'", "';'", "','", "'output'", "'inputoutput'", "'return'", "':'", "':='", "'var'", "'combine'", "'with'", "'@'", "'['", "']'", "'.'", "'#'"
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

            if ( ((LA1_0>=RULE_BOOLEAN && LA1_0<=RULE_HOSTCODE)||LA1_0==16||LA1_0==19||LA1_0==21||LA1_0==25||LA1_0==43) ) {
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
            else if ( ((LA5_0>=RULE_BOOLEAN && LA5_0<=RULE_ID)||LA5_0==RULE_HOSTCODE||LA5_0==16||LA5_0==25||LA5_0==43) ) {
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
            else if ( ((LA6_0>=RULE_BOOLEAN && LA6_0<=RULE_HOSTCODE)||LA6_0==16||LA6_0==25||LA6_0==43) ) {
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


    // $ANTLR start "rule__InterfaceDeclaration__Alternatives"
    // InternalKExpressions.g:1815:1: rule__InterfaceDeclaration__Alternatives : ( ( ruleInterfaceSignalDecl ) | ( ruleInterfaceVariableDecl ) );
    public final void rule__InterfaceDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1819:1: ( ( ruleInterfaceSignalDecl ) | ( ruleInterfaceVariableDecl ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==45||(LA10_0>=48 && LA10_0<=50)) ) {
                alt10=1;
            }
            else if ( (LA10_0==53) ) {
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
                    // InternalKExpressions.g:1820:1: ( ruleInterfaceSignalDecl )
                    {
                    // InternalKExpressions.g:1820:1: ( ruleInterfaceSignalDecl )
                    // InternalKExpressions.g:1821:1: ruleInterfaceSignalDecl
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
                    // InternalKExpressions.g:1826:6: ( ruleInterfaceVariableDecl )
                    {
                    // InternalKExpressions.g:1826:6: ( ruleInterfaceVariableDecl )
                    // InternalKExpressions.g:1827:1: ruleInterfaceVariableDecl
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
    // InternalKExpressions.g:1837:1: rule__InterfaceSignalDecl__Alternatives : ( ( ( rule__InterfaceSignalDecl__Group_0__0 ) ) | ( ( rule__InterfaceSignalDecl__Group_1__0 ) ) | ( ( rule__InterfaceSignalDecl__Group_2__0 ) ) | ( ( rule__InterfaceSignalDecl__Group_3__0 ) ) );
    public final void rule__InterfaceSignalDecl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1841:1: ( ( ( rule__InterfaceSignalDecl__Group_0__0 ) ) | ( ( rule__InterfaceSignalDecl__Group_1__0 ) ) | ( ( rule__InterfaceSignalDecl__Group_2__0 ) ) | ( ( rule__InterfaceSignalDecl__Group_3__0 ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt11=1;
                }
                break;
            case 48:
                {
                alt11=2;
                }
                break;
            case 49:
                {
                alt11=3;
                }
                break;
            case 50:
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
                    // InternalKExpressions.g:1842:1: ( ( rule__InterfaceSignalDecl__Group_0__0 ) )
                    {
                    // InternalKExpressions.g:1842:1: ( ( rule__InterfaceSignalDecl__Group_0__0 ) )
                    // InternalKExpressions.g:1843:1: ( rule__InterfaceSignalDecl__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInterfaceSignalDeclAccess().getGroup_0()); 
                    }
                    // InternalKExpressions.g:1844:1: ( rule__InterfaceSignalDecl__Group_0__0 )
                    // InternalKExpressions.g:1844:2: rule__InterfaceSignalDecl__Group_0__0
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
                    // InternalKExpressions.g:1848:6: ( ( rule__InterfaceSignalDecl__Group_1__0 ) )
                    {
                    // InternalKExpressions.g:1848:6: ( ( rule__InterfaceSignalDecl__Group_1__0 ) )
                    // InternalKExpressions.g:1849:1: ( rule__InterfaceSignalDecl__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInterfaceSignalDeclAccess().getGroup_1()); 
                    }
                    // InternalKExpressions.g:1850:1: ( rule__InterfaceSignalDecl__Group_1__0 )
                    // InternalKExpressions.g:1850:2: rule__InterfaceSignalDecl__Group_1__0
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
                    // InternalKExpressions.g:1854:6: ( ( rule__InterfaceSignalDecl__Group_2__0 ) )
                    {
                    // InternalKExpressions.g:1854:6: ( ( rule__InterfaceSignalDecl__Group_2__0 ) )
                    // InternalKExpressions.g:1855:1: ( rule__InterfaceSignalDecl__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInterfaceSignalDeclAccess().getGroup_2()); 
                    }
                    // InternalKExpressions.g:1856:1: ( rule__InterfaceSignalDecl__Group_2__0 )
                    // InternalKExpressions.g:1856:2: rule__InterfaceSignalDecl__Group_2__0
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
                    // InternalKExpressions.g:1860:6: ( ( rule__InterfaceSignalDecl__Group_3__0 ) )
                    {
                    // InternalKExpressions.g:1860:6: ( ( rule__InterfaceSignalDecl__Group_3__0 ) )
                    // InternalKExpressions.g:1861:1: ( rule__InterfaceSignalDecl__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInterfaceSignalDeclAccess().getGroup_3()); 
                    }
                    // InternalKExpressions.g:1862:1: ( rule__InterfaceSignalDecl__Group_3__0 )
                    // InternalKExpressions.g:1862:2: rule__InterfaceSignalDecl__Group_3__0
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
    // InternalKExpressions.g:1871:1: rule__ChannelDescription__Alternatives : ( ( ( rule__ChannelDescription__Group_0__0 ) ) | ( ( rule__ChannelDescription__Group_1__0 ) ) | ( ( rule__ChannelDescription__Group_2__0 ) ) );
    public final void rule__ChannelDescription__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1875:1: ( ( ( rule__ChannelDescription__Group_0__0 ) ) | ( ( rule__ChannelDescription__Group_1__0 ) ) | ( ( rule__ChannelDescription__Group_2__0 ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt12=1;
                }
                break;
            case 43:
                {
                alt12=2;
                }
                break;
            case 52:
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
                    // InternalKExpressions.g:1876:1: ( ( rule__ChannelDescription__Group_0__0 ) )
                    {
                    // InternalKExpressions.g:1876:1: ( ( rule__ChannelDescription__Group_0__0 ) )
                    // InternalKExpressions.g:1877:1: ( rule__ChannelDescription__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getChannelDescriptionAccess().getGroup_0()); 
                    }
                    // InternalKExpressions.g:1878:1: ( rule__ChannelDescription__Group_0__0 )
                    // InternalKExpressions.g:1878:2: rule__ChannelDescription__Group_0__0
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
                    // InternalKExpressions.g:1882:6: ( ( rule__ChannelDescription__Group_1__0 ) )
                    {
                    // InternalKExpressions.g:1882:6: ( ( rule__ChannelDescription__Group_1__0 ) )
                    // InternalKExpressions.g:1883:1: ( rule__ChannelDescription__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getChannelDescriptionAccess().getGroup_1()); 
                    }
                    // InternalKExpressions.g:1884:1: ( rule__ChannelDescription__Group_1__0 )
                    // InternalKExpressions.g:1884:2: rule__ChannelDescription__Group_1__0
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
                    // InternalKExpressions.g:1888:6: ( ( rule__ChannelDescription__Group_2__0 ) )
                    {
                    // InternalKExpressions.g:1888:6: ( ( rule__ChannelDescription__Group_2__0 ) )
                    // InternalKExpressions.g:1889:1: ( rule__ChannelDescription__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getChannelDescriptionAccess().getGroup_2()); 
                    }
                    // InternalKExpressions.g:1890:1: ( rule__ChannelDescription__Group_2__0 )
                    // InternalKExpressions.g:1890:2: rule__ChannelDescription__Group_2__0
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
    // InternalKExpressions.g:1899:1: rule__TypeIdentifier__Alternatives : ( ( ( rule__TypeIdentifier__TypeAssignment_0 ) ) | ( ( rule__TypeIdentifier__TypeIDAssignment_1 ) ) | ( ( rule__TypeIdentifier__Group_2__0 ) ) );
    public final void rule__TypeIdentifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1903:1: ( ( ( rule__TypeIdentifier__TypeAssignment_0 ) ) | ( ( rule__TypeIdentifier__TypeIDAssignment_1 ) ) | ( ( rule__TypeIdentifier__Group_2__0 ) ) )
            int alt13=3;
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
                alt13=1;
                }
                break;
            case RULE_ID:
                {
                alt13=2;
                }
                break;
            case 54:
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
                    // InternalKExpressions.g:1904:1: ( ( rule__TypeIdentifier__TypeAssignment_0 ) )
                    {
                    // InternalKExpressions.g:1904:1: ( ( rule__TypeIdentifier__TypeAssignment_0 ) )
                    // InternalKExpressions.g:1905:1: ( rule__TypeIdentifier__TypeAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeIdentifierAccess().getTypeAssignment_0()); 
                    }
                    // InternalKExpressions.g:1906:1: ( rule__TypeIdentifier__TypeAssignment_0 )
                    // InternalKExpressions.g:1906:2: rule__TypeIdentifier__TypeAssignment_0
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
                    // InternalKExpressions.g:1910:6: ( ( rule__TypeIdentifier__TypeIDAssignment_1 ) )
                    {
                    // InternalKExpressions.g:1910:6: ( ( rule__TypeIdentifier__TypeIDAssignment_1 ) )
                    // InternalKExpressions.g:1911:1: ( rule__TypeIdentifier__TypeIDAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeIdentifierAccess().getTypeIDAssignment_1()); 
                    }
                    // InternalKExpressions.g:1912:1: ( rule__TypeIdentifier__TypeIDAssignment_1 )
                    // InternalKExpressions.g:1912:2: rule__TypeIdentifier__TypeIDAssignment_1
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
                    // InternalKExpressions.g:1916:6: ( ( rule__TypeIdentifier__Group_2__0 ) )
                    {
                    // InternalKExpressions.g:1916:6: ( ( rule__TypeIdentifier__Group_2__0 ) )
                    // InternalKExpressions.g:1917:1: ( rule__TypeIdentifier__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeIdentifierAccess().getGroup_2()); 
                    }
                    // InternalKExpressions.g:1918:1: ( rule__TypeIdentifier__Group_2__0 )
                    // InternalKExpressions.g:1918:2: rule__TypeIdentifier__Group_2__0
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
    // InternalKExpressions.g:1927:1: rule__TypeIdentifier__Alternatives_2_1 : ( ( ( rule__TypeIdentifier__TypeAssignment_2_1_0 ) ) | ( ( rule__TypeIdentifier__TypeIDAssignment_2_1_1 ) ) );
    public final void rule__TypeIdentifier__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1931:1: ( ( ( rule__TypeIdentifier__TypeAssignment_2_1_0 ) ) | ( ( rule__TypeIdentifier__TypeIDAssignment_2_1_1 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=32 && LA14_0<=39)) ) {
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
                    // InternalKExpressions.g:1932:1: ( ( rule__TypeIdentifier__TypeAssignment_2_1_0 ) )
                    {
                    // InternalKExpressions.g:1932:1: ( ( rule__TypeIdentifier__TypeAssignment_2_1_0 ) )
                    // InternalKExpressions.g:1933:1: ( rule__TypeIdentifier__TypeAssignment_2_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeIdentifierAccess().getTypeAssignment_2_1_0()); 
                    }
                    // InternalKExpressions.g:1934:1: ( rule__TypeIdentifier__TypeAssignment_2_1_0 )
                    // InternalKExpressions.g:1934:2: rule__TypeIdentifier__TypeAssignment_2_1_0
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
                    // InternalKExpressions.g:1938:6: ( ( rule__TypeIdentifier__TypeIDAssignment_2_1_1 ) )
                    {
                    // InternalKExpressions.g:1938:6: ( ( rule__TypeIdentifier__TypeIDAssignment_2_1_1 ) )
                    // InternalKExpressions.g:1939:1: ( rule__TypeIdentifier__TypeIDAssignment_2_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeIdentifierAccess().getTypeIDAssignment_2_1_1()); 
                    }
                    // InternalKExpressions.g:1940:1: ( rule__TypeIdentifier__TypeIDAssignment_2_1_1 )
                    // InternalKExpressions.g:1940:2: rule__TypeIdentifier__TypeIDAssignment_2_1_1
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
    // InternalKExpressions.g:1952:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( ruleExtendedID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1956:1: ( ( RULE_STRING ) | ( ruleExtendedID ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
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
                    // InternalKExpressions.g:1957:1: ( RULE_STRING )
                    {
                    // InternalKExpressions.g:1957:1: ( RULE_STRING )
                    // InternalKExpressions.g:1958:1: RULE_STRING
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
                    // InternalKExpressions.g:1963:6: ( ruleExtendedID )
                    {
                    // InternalKExpressions.g:1963:6: ( ruleExtendedID )
                    // InternalKExpressions.g:1964:1: ruleExtendedID
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
    // InternalKExpressions.g:1974:1: rule__EStringBoolean__Alternatives : ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) );
    public final void rule__EStringBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1978:1: ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) )
            int alt16=3;
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
            default:
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
                    // InternalKExpressions.g:1985:6: ( ruleExtendedID )
                    {
                    // InternalKExpressions.g:1985:6: ( ruleExtendedID )
                    // InternalKExpressions.g:1986:1: ruleExtendedID
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
                    // InternalKExpressions.g:1991:6: ( RULE_BOOLEAN )
                    {
                    // InternalKExpressions.g:1991:6: ( RULE_BOOLEAN )
                    // InternalKExpressions.g:1992:1: RULE_BOOLEAN
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
    // InternalKExpressions.g:2002:1: rule__CompareOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2006:1: ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) )
            int alt17=6;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt17=1;
                }
                break;
            case 27:
                {
                alt17=2;
                }
                break;
            case 28:
                {
                alt17=3;
                }
                break;
            case 29:
                {
                alt17=4;
                }
                break;
            case 30:
                {
                alt17=5;
                }
                break;
            case 31:
                {
                alt17=6;
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
                    // InternalKExpressions.g:2007:1: ( ( '=' ) )
                    {
                    // InternalKExpressions.g:2007:1: ( ( '=' ) )
                    // InternalKExpressions.g:2008:1: ( '=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // InternalKExpressions.g:2009:1: ( '=' )
                    // InternalKExpressions.g:2009:3: '='
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
                    // InternalKExpressions.g:2014:6: ( ( '<' ) )
                    {
                    // InternalKExpressions.g:2014:6: ( ( '<' ) )
                    // InternalKExpressions.g:2015:1: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }
                    // InternalKExpressions.g:2016:1: ( '<' )
                    // InternalKExpressions.g:2016:3: '<'
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
                    // InternalKExpressions.g:2021:6: ( ( '<=' ) )
                    {
                    // InternalKExpressions.g:2021:6: ( ( '<=' ) )
                    // InternalKExpressions.g:2022:1: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }
                    // InternalKExpressions.g:2023:1: ( '<=' )
                    // InternalKExpressions.g:2023:3: '<='
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
                    // InternalKExpressions.g:2028:6: ( ( '>' ) )
                    {
                    // InternalKExpressions.g:2028:6: ( ( '>' ) )
                    // InternalKExpressions.g:2029:1: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }
                    // InternalKExpressions.g:2030:1: ( '>' )
                    // InternalKExpressions.g:2030:3: '>'
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
                    // InternalKExpressions.g:2035:6: ( ( '>=' ) )
                    {
                    // InternalKExpressions.g:2035:6: ( ( '>=' ) )
                    // InternalKExpressions.g:2036:1: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }
                    // InternalKExpressions.g:2037:1: ( '>=' )
                    // InternalKExpressions.g:2037:3: '>='
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
                    // InternalKExpressions.g:2042:6: ( ( '<>' ) )
                    {
                    // InternalKExpressions.g:2042:6: ( ( '<>' ) )
                    // InternalKExpressions.g:2043:1: ( '<>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_5()); 
                    }
                    // InternalKExpressions.g:2044:1: ( '<>' )
                    // InternalKExpressions.g:2044:3: '<>'
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
    // InternalKExpressions.g:2054:1: rule__ValueType__Alternatives : ( ( ( 'pure' ) ) | ( ( 'boolean' ) ) | ( ( 'unsigned' ) ) | ( ( 'integer' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'string' ) ) | ( ( 'host' ) ) );
    public final void rule__ValueType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2058:1: ( ( ( 'pure' ) ) | ( ( 'boolean' ) ) | ( ( 'unsigned' ) ) | ( ( 'integer' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'string' ) ) | ( ( 'host' ) ) )
            int alt18=8;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt18=1;
                }
                break;
            case 33:
                {
                alt18=2;
                }
                break;
            case 34:
                {
                alt18=3;
                }
                break;
            case 35:
                {
                alt18=4;
                }
                break;
            case 36:
                {
                alt18=5;
                }
                break;
            case 37:
                {
                alt18=6;
                }
                break;
            case 38:
                {
                alt18=7;
                }
                break;
            case 39:
                {
                alt18=8;
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
                    // InternalKExpressions.g:2059:1: ( ( 'pure' ) )
                    {
                    // InternalKExpressions.g:2059:1: ( ( 'pure' ) )
                    // InternalKExpressions.g:2060:1: ( 'pure' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0()); 
                    }
                    // InternalKExpressions.g:2061:1: ( 'pure' )
                    // InternalKExpressions.g:2061:3: 'pure'
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
                    // InternalKExpressions.g:2066:6: ( ( 'boolean' ) )
                    {
                    // InternalKExpressions.g:2066:6: ( ( 'boolean' ) )
                    // InternalKExpressions.g:2067:1: ( 'boolean' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1()); 
                    }
                    // InternalKExpressions.g:2068:1: ( 'boolean' )
                    // InternalKExpressions.g:2068:3: 'boolean'
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
                    // InternalKExpressions.g:2073:6: ( ( 'unsigned' ) )
                    {
                    // InternalKExpressions.g:2073:6: ( ( 'unsigned' ) )
                    // InternalKExpressions.g:2074:1: ( 'unsigned' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2()); 
                    }
                    // InternalKExpressions.g:2075:1: ( 'unsigned' )
                    // InternalKExpressions.g:2075:3: 'unsigned'
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
                    // InternalKExpressions.g:2080:6: ( ( 'integer' ) )
                    {
                    // InternalKExpressions.g:2080:6: ( ( 'integer' ) )
                    // InternalKExpressions.g:2081:1: ( 'integer' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3()); 
                    }
                    // InternalKExpressions.g:2082:1: ( 'integer' )
                    // InternalKExpressions.g:2082:3: 'integer'
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
                    // InternalKExpressions.g:2087:6: ( ( 'float' ) )
                    {
                    // InternalKExpressions.g:2087:6: ( ( 'float' ) )
                    // InternalKExpressions.g:2088:1: ( 'float' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4()); 
                    }
                    // InternalKExpressions.g:2089:1: ( 'float' )
                    // InternalKExpressions.g:2089:3: 'float'
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
                    // InternalKExpressions.g:2094:6: ( ( 'double' ) )
                    {
                    // InternalKExpressions.g:2094:6: ( ( 'double' ) )
                    // InternalKExpressions.g:2095:1: ( 'double' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getDOUBLEEnumLiteralDeclaration_5()); 
                    }
                    // InternalKExpressions.g:2096:1: ( 'double' )
                    // InternalKExpressions.g:2096:3: 'double'
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
                    // InternalKExpressions.g:2101:6: ( ( 'string' ) )
                    {
                    // InternalKExpressions.g:2101:6: ( ( 'string' ) )
                    // InternalKExpressions.g:2102:1: ( 'string' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_6()); 
                    }
                    // InternalKExpressions.g:2103:1: ( 'string' )
                    // InternalKExpressions.g:2103:3: 'string'
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
                    // InternalKExpressions.g:2108:6: ( ( 'host' ) )
                    {
                    // InternalKExpressions.g:2108:6: ( ( 'host' ) )
                    // InternalKExpressions.g:2109:1: ( 'host' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getHOSTEnumLiteralDeclaration_7()); 
                    }
                    // InternalKExpressions.g:2110:1: ( 'host' )
                    // InternalKExpressions.g:2110:3: 'host'
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
    // InternalKExpressions.g:2120:1: rule__CombineOperator__Alternatives : ( ( ( 'none' ) ) | ( ( '+' ) ) | ( ( '*' ) ) | ( ( 'max' ) ) | ( ( 'min' ) ) | ( ( 'or' ) ) | ( ( 'and' ) ) | ( ( 'host' ) ) );
    public final void rule__CombineOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2124:1: ( ( ( 'none' ) ) | ( ( '+' ) ) | ( ( '*' ) ) | ( ( 'max' ) ) | ( ( 'min' ) ) | ( ( 'or' ) ) | ( ( 'and' ) ) | ( ( 'host' ) ) )
            int alt19=8;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt19=1;
                }
                break;
            case 20:
                {
                alt19=2;
                }
                break;
            case 22:
                {
                alt19=3;
                }
                break;
            case 41:
                {
                alt19=4;
                }
                break;
            case 42:
                {
                alt19=5;
                }
                break;
            case 17:
                {
                alt19=6;
                }
                break;
            case 18:
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
                    // InternalKExpressions.g:2125:1: ( ( 'none' ) )
                    {
                    // InternalKExpressions.g:2125:1: ( ( 'none' ) )
                    // InternalKExpressions.g:2126:1: ( 'none' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 
                    }
                    // InternalKExpressions.g:2127:1: ( 'none' )
                    // InternalKExpressions.g:2127:3: 'none'
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
                    // InternalKExpressions.g:2132:6: ( ( '+' ) )
                    {
                    // InternalKExpressions.g:2132:6: ( ( '+' ) )
                    // InternalKExpressions.g:2133:1: ( '+' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 
                    }
                    // InternalKExpressions.g:2134:1: ( '+' )
                    // InternalKExpressions.g:2134:3: '+'
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
                    // InternalKExpressions.g:2139:6: ( ( '*' ) )
                    {
                    // InternalKExpressions.g:2139:6: ( ( '*' ) )
                    // InternalKExpressions.g:2140:1: ( '*' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 
                    }
                    // InternalKExpressions.g:2141:1: ( '*' )
                    // InternalKExpressions.g:2141:3: '*'
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
                    // InternalKExpressions.g:2146:6: ( ( 'max' ) )
                    {
                    // InternalKExpressions.g:2146:6: ( ( 'max' ) )
                    // InternalKExpressions.g:2147:1: ( 'max' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3()); 
                    }
                    // InternalKExpressions.g:2148:1: ( 'max' )
                    // InternalKExpressions.g:2148:3: 'max'
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
                    // InternalKExpressions.g:2153:6: ( ( 'min' ) )
                    {
                    // InternalKExpressions.g:2153:6: ( ( 'min' ) )
                    // InternalKExpressions.g:2154:1: ( 'min' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4()); 
                    }
                    // InternalKExpressions.g:2155:1: ( 'min' )
                    // InternalKExpressions.g:2155:3: 'min'
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
                    // InternalKExpressions.g:2160:6: ( ( 'or' ) )
                    {
                    // InternalKExpressions.g:2160:6: ( ( 'or' ) )
                    // InternalKExpressions.g:2161:1: ( 'or' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5()); 
                    }
                    // InternalKExpressions.g:2162:1: ( 'or' )
                    // InternalKExpressions.g:2162:3: 'or'
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
                    // InternalKExpressions.g:2167:6: ( ( 'and' ) )
                    {
                    // InternalKExpressions.g:2167:6: ( ( 'and' ) )
                    // InternalKExpressions.g:2168:1: ( 'and' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                    }
                    // InternalKExpressions.g:2169:1: ( 'and' )
                    // InternalKExpressions.g:2169:3: 'and'
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
                    // InternalKExpressions.g:2174:6: ( ( 'host' ) )
                    {
                    // InternalKExpressions.g:2174:6: ( ( 'host' ) )
                    // InternalKExpressions.g:2175:1: ( 'host' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCombineOperatorAccess().getHOSTEnumLiteralDeclaration_7()); 
                    }
                    // InternalKExpressions.g:2176:1: ( 'host' )
                    // InternalKExpressions.g:2176:3: 'host'
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
    // InternalKExpressions.g:2188:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2192:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // InternalKExpressions.g:2193:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
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
    // InternalKExpressions.g:2200:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2204:1: ( ( ruleAndExpression ) )
            // InternalKExpressions.g:2205:1: ( ruleAndExpression )
            {
            // InternalKExpressions.g:2205:1: ( ruleAndExpression )
            // InternalKExpressions.g:2206:1: ruleAndExpression
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
    // InternalKExpressions.g:2217:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2221:1: ( rule__OrExpression__Group__1__Impl )
            // InternalKExpressions.g:2222:2: rule__OrExpression__Group__1__Impl
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
    // InternalKExpressions.g:2228:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2232:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // InternalKExpressions.g:2233:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // InternalKExpressions.g:2233:1: ( ( rule__OrExpression__Group_1__0 )* )
            // InternalKExpressions.g:2234:1: ( rule__OrExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:2235:1: ( rule__OrExpression__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==17) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalKExpressions.g:2235:2: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalKExpressions.g:2249:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2253:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // InternalKExpressions.g:2254:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
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
    // InternalKExpressions.g:2261:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2265:1: ( ( () ) )
            // InternalKExpressions.g:2266:1: ( () )
            {
            // InternalKExpressions.g:2266:1: ( () )
            // InternalKExpressions.g:2267:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:2268:1: ()
            // InternalKExpressions.g:2270:1: 
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
    // InternalKExpressions.g:2280:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2284:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // InternalKExpressions.g:2285:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
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
    // InternalKExpressions.g:2292:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2296:1: ( ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) )
            // InternalKExpressions.g:2297:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKExpressions.g:2297:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            // InternalKExpressions.g:2298:1: ( rule__OrExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKExpressions.g:2299:1: ( rule__OrExpression__OperatorAssignment_1_1 )
            // InternalKExpressions.g:2299:2: rule__OrExpression__OperatorAssignment_1_1
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
    // InternalKExpressions.g:2309:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2313:1: ( rule__OrExpression__Group_1__2__Impl )
            // InternalKExpressions.g:2314:2: rule__OrExpression__Group_1__2__Impl
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
    // InternalKExpressions.g:2320:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2324:1: ( ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) ) )
            // InternalKExpressions.g:2325:1: ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) )
            {
            // InternalKExpressions.g:2325:1: ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) )
            // InternalKExpressions.g:2326:1: ( rule__OrExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // InternalKExpressions.g:2327:1: ( rule__OrExpression__SubExpressionsAssignment_1_2 )
            // InternalKExpressions.g:2327:2: rule__OrExpression__SubExpressionsAssignment_1_2
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
    // InternalKExpressions.g:2343:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2347:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalKExpressions.g:2348:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
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
    // InternalKExpressions.g:2355:1: rule__AndExpression__Group__0__Impl : ( ruleCompareOperation ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2359:1: ( ( ruleCompareOperation ) )
            // InternalKExpressions.g:2360:1: ( ruleCompareOperation )
            {
            // InternalKExpressions.g:2360:1: ( ruleCompareOperation )
            // InternalKExpressions.g:2361:1: ruleCompareOperation
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
    // InternalKExpressions.g:2372:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2376:1: ( rule__AndExpression__Group__1__Impl )
            // InternalKExpressions.g:2377:2: rule__AndExpression__Group__1__Impl
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
    // InternalKExpressions.g:2383:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2387:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalKExpressions.g:2388:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalKExpressions.g:2388:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalKExpressions.g:2389:1: ( rule__AndExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:2390:1: ( rule__AndExpression__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==18) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalKExpressions.g:2390:2: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalKExpressions.g:2404:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2408:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalKExpressions.g:2409:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
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
    // InternalKExpressions.g:2416:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2420:1: ( ( () ) )
            // InternalKExpressions.g:2421:1: ( () )
            {
            // InternalKExpressions.g:2421:1: ( () )
            // InternalKExpressions.g:2422:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:2423:1: ()
            // InternalKExpressions.g:2425:1: 
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
    // InternalKExpressions.g:2435:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2439:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // InternalKExpressions.g:2440:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
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
    // InternalKExpressions.g:2447:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2451:1: ( ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) )
            // InternalKExpressions.g:2452:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKExpressions.g:2452:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            // InternalKExpressions.g:2453:1: ( rule__AndExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKExpressions.g:2454:1: ( rule__AndExpression__OperatorAssignment_1_1 )
            // InternalKExpressions.g:2454:2: rule__AndExpression__OperatorAssignment_1_1
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
    // InternalKExpressions.g:2464:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2468:1: ( rule__AndExpression__Group_1__2__Impl )
            // InternalKExpressions.g:2469:2: rule__AndExpression__Group_1__2__Impl
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
    // InternalKExpressions.g:2475:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2479:1: ( ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) ) )
            // InternalKExpressions.g:2480:1: ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) )
            {
            // InternalKExpressions.g:2480:1: ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) )
            // InternalKExpressions.g:2481:1: ( rule__AndExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // InternalKExpressions.g:2482:1: ( rule__AndExpression__SubExpressionsAssignment_1_2 )
            // InternalKExpressions.g:2482:2: rule__AndExpression__SubExpressionsAssignment_1_2
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
    // InternalKExpressions.g:2498:1: rule__CompareOperation__Group_0__0 : rule__CompareOperation__Group_0__0__Impl rule__CompareOperation__Group_0__1 ;
    public final void rule__CompareOperation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2502:1: ( rule__CompareOperation__Group_0__0__Impl rule__CompareOperation__Group_0__1 )
            // InternalKExpressions.g:2503:2: rule__CompareOperation__Group_0__0__Impl rule__CompareOperation__Group_0__1
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
    // InternalKExpressions.g:2510:1: rule__CompareOperation__Group_0__0__Impl : ( ( ruleNotOrValuedExpression ) ) ;
    public final void rule__CompareOperation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2514:1: ( ( ( ruleNotOrValuedExpression ) ) )
            // InternalKExpressions.g:2515:1: ( ( ruleNotOrValuedExpression ) )
            {
            // InternalKExpressions.g:2515:1: ( ( ruleNotOrValuedExpression ) )
            // InternalKExpressions.g:2516:1: ( ruleNotOrValuedExpression )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0_0()); 
            }
            // InternalKExpressions.g:2517:1: ( ruleNotOrValuedExpression )
            // InternalKExpressions.g:2517:3: ruleNotOrValuedExpression
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
    // InternalKExpressions.g:2527:1: rule__CompareOperation__Group_0__1 : rule__CompareOperation__Group_0__1__Impl ;
    public final void rule__CompareOperation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2531:1: ( rule__CompareOperation__Group_0__1__Impl )
            // InternalKExpressions.g:2532:2: rule__CompareOperation__Group_0__1__Impl
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
    // InternalKExpressions.g:2538:1: rule__CompareOperation__Group_0__1__Impl : ( ( rule__CompareOperation__Group_0_1__0 ) ) ;
    public final void rule__CompareOperation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2542:1: ( ( ( rule__CompareOperation__Group_0_1__0 ) ) )
            // InternalKExpressions.g:2543:1: ( ( rule__CompareOperation__Group_0_1__0 ) )
            {
            // InternalKExpressions.g:2543:1: ( ( rule__CompareOperation__Group_0_1__0 ) )
            // InternalKExpressions.g:2544:1: ( rule__CompareOperation__Group_0_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGroup_0_1()); 
            }
            // InternalKExpressions.g:2545:1: ( rule__CompareOperation__Group_0_1__0 )
            // InternalKExpressions.g:2545:2: rule__CompareOperation__Group_0_1__0
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
    // InternalKExpressions.g:2559:1: rule__CompareOperation__Group_0_1__0 : rule__CompareOperation__Group_0_1__0__Impl rule__CompareOperation__Group_0_1__1 ;
    public final void rule__CompareOperation__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2563:1: ( rule__CompareOperation__Group_0_1__0__Impl rule__CompareOperation__Group_0_1__1 )
            // InternalKExpressions.g:2564:2: rule__CompareOperation__Group_0_1__0__Impl rule__CompareOperation__Group_0_1__1
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
    // InternalKExpressions.g:2571:1: rule__CompareOperation__Group_0_1__0__Impl : ( () ) ;
    public final void rule__CompareOperation__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2575:1: ( ( () ) )
            // InternalKExpressions.g:2576:1: ( () )
            {
            // InternalKExpressions.g:2576:1: ( () )
            // InternalKExpressions.g:2577:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_0_1_0()); 
            }
            // InternalKExpressions.g:2578:1: ()
            // InternalKExpressions.g:2580:1: 
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
    // InternalKExpressions.g:2590:1: rule__CompareOperation__Group_0_1__1 : rule__CompareOperation__Group_0_1__1__Impl rule__CompareOperation__Group_0_1__2 ;
    public final void rule__CompareOperation__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2594:1: ( rule__CompareOperation__Group_0_1__1__Impl rule__CompareOperation__Group_0_1__2 )
            // InternalKExpressions.g:2595:2: rule__CompareOperation__Group_0_1__1__Impl rule__CompareOperation__Group_0_1__2
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
    // InternalKExpressions.g:2602:1: rule__CompareOperation__Group_0_1__1__Impl : ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) ) ;
    public final void rule__CompareOperation__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2606:1: ( ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) ) )
            // InternalKExpressions.g:2607:1: ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) )
            {
            // InternalKExpressions.g:2607:1: ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) )
            // InternalKExpressions.g:2608:1: ( rule__CompareOperation__OperatorAssignment_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorAssignment_0_1_1()); 
            }
            // InternalKExpressions.g:2609:1: ( rule__CompareOperation__OperatorAssignment_0_1_1 )
            // InternalKExpressions.g:2609:2: rule__CompareOperation__OperatorAssignment_0_1_1
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
    // InternalKExpressions.g:2619:1: rule__CompareOperation__Group_0_1__2 : rule__CompareOperation__Group_0_1__2__Impl ;
    public final void rule__CompareOperation__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2623:1: ( rule__CompareOperation__Group_0_1__2__Impl )
            // InternalKExpressions.g:2624:2: rule__CompareOperation__Group_0_1__2__Impl
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
    // InternalKExpressions.g:2630:1: rule__CompareOperation__Group_0_1__2__Impl : ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) ) ;
    public final void rule__CompareOperation__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2634:1: ( ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) ) )
            // InternalKExpressions.g:2635:1: ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) )
            {
            // InternalKExpressions.g:2635:1: ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) )
            // InternalKExpressions.g:2636:1: ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsAssignment_0_1_2()); 
            }
            // InternalKExpressions.g:2637:1: ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 )
            // InternalKExpressions.g:2637:2: rule__CompareOperation__SubExpressionsAssignment_0_1_2
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
    // InternalKExpressions.g:2653:1: rule__NotExpression__Group_0__0 : rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1 ;
    public final void rule__NotExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2657:1: ( rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1 )
            // InternalKExpressions.g:2658:2: rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1
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
    // InternalKExpressions.g:2665:1: rule__NotExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__NotExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2669:1: ( ( () ) )
            // InternalKExpressions.g:2670:1: ( () )
            {
            // InternalKExpressions.g:2670:1: ( () )
            // InternalKExpressions.g:2671:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // InternalKExpressions.g:2672:1: ()
            // InternalKExpressions.g:2674:1: 
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
    // InternalKExpressions.g:2684:1: rule__NotExpression__Group_0__1 : rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2 ;
    public final void rule__NotExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2688:1: ( rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2 )
            // InternalKExpressions.g:2689:2: rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2
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
    // InternalKExpressions.g:2696:1: rule__NotExpression__Group_0__1__Impl : ( ( rule__NotExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__NotExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2700:1: ( ( ( rule__NotExpression__OperatorAssignment_0_1 ) ) )
            // InternalKExpressions.g:2701:1: ( ( rule__NotExpression__OperatorAssignment_0_1 ) )
            {
            // InternalKExpressions.g:2701:1: ( ( rule__NotExpression__OperatorAssignment_0_1 ) )
            // InternalKExpressions.g:2702:1: ( rule__NotExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // InternalKExpressions.g:2703:1: ( rule__NotExpression__OperatorAssignment_0_1 )
            // InternalKExpressions.g:2703:2: rule__NotExpression__OperatorAssignment_0_1
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
    // InternalKExpressions.g:2713:1: rule__NotExpression__Group_0__2 : rule__NotExpression__Group_0__2__Impl ;
    public final void rule__NotExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2717:1: ( rule__NotExpression__Group_0__2__Impl )
            // InternalKExpressions.g:2718:2: rule__NotExpression__Group_0__2__Impl
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
    // InternalKExpressions.g:2724:1: rule__NotExpression__Group_0__2__Impl : ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) ) ;
    public final void rule__NotExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2728:1: ( ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) ) )
            // InternalKExpressions.g:2729:1: ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) )
            {
            // InternalKExpressions.g:2729:1: ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) )
            // InternalKExpressions.g:2730:1: ( rule__NotExpression__SubExpressionsAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubExpressionsAssignment_0_2()); 
            }
            // InternalKExpressions.g:2731:1: ( rule__NotExpression__SubExpressionsAssignment_0_2 )
            // InternalKExpressions.g:2731:2: rule__NotExpression__SubExpressionsAssignment_0_2
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
    // InternalKExpressions.g:2747:1: rule__AddExpression__Group__0 : rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 ;
    public final void rule__AddExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2751:1: ( rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 )
            // InternalKExpressions.g:2752:2: rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1
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
    // InternalKExpressions.g:2759:1: rule__AddExpression__Group__0__Impl : ( ruleSubExpression ) ;
    public final void rule__AddExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2763:1: ( ( ruleSubExpression ) )
            // InternalKExpressions.g:2764:1: ( ruleSubExpression )
            {
            // InternalKExpressions.g:2764:1: ( ruleSubExpression )
            // InternalKExpressions.g:2765:1: ruleSubExpression
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
    // InternalKExpressions.g:2776:1: rule__AddExpression__Group__1 : rule__AddExpression__Group__1__Impl ;
    public final void rule__AddExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2780:1: ( rule__AddExpression__Group__1__Impl )
            // InternalKExpressions.g:2781:2: rule__AddExpression__Group__1__Impl
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
    // InternalKExpressions.g:2787:1: rule__AddExpression__Group__1__Impl : ( ( rule__AddExpression__Group_1__0 )* ) ;
    public final void rule__AddExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2791:1: ( ( ( rule__AddExpression__Group_1__0 )* ) )
            // InternalKExpressions.g:2792:1: ( ( rule__AddExpression__Group_1__0 )* )
            {
            // InternalKExpressions.g:2792:1: ( ( rule__AddExpression__Group_1__0 )* )
            // InternalKExpressions.g:2793:1: ( rule__AddExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:2794:1: ( rule__AddExpression__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==20) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalKExpressions.g:2794:2: rule__AddExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_11);
            	    rule__AddExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalKExpressions.g:2808:1: rule__AddExpression__Group_1__0 : rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 ;
    public final void rule__AddExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2812:1: ( rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 )
            // InternalKExpressions.g:2813:2: rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1
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
    // InternalKExpressions.g:2820:1: rule__AddExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AddExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2824:1: ( ( () ) )
            // InternalKExpressions.g:2825:1: ( () )
            {
            // InternalKExpressions.g:2825:1: ( () )
            // InternalKExpressions.g:2826:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:2827:1: ()
            // InternalKExpressions.g:2829:1: 
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
    // InternalKExpressions.g:2839:1: rule__AddExpression__Group_1__1 : rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2 ;
    public final void rule__AddExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2843:1: ( rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2 )
            // InternalKExpressions.g:2844:2: rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2
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
    // InternalKExpressions.g:2851:1: rule__AddExpression__Group_1__1__Impl : ( ( rule__AddExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AddExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2855:1: ( ( ( rule__AddExpression__OperatorAssignment_1_1 ) ) )
            // InternalKExpressions.g:2856:1: ( ( rule__AddExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKExpressions.g:2856:1: ( ( rule__AddExpression__OperatorAssignment_1_1 ) )
            // InternalKExpressions.g:2857:1: ( rule__AddExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKExpressions.g:2858:1: ( rule__AddExpression__OperatorAssignment_1_1 )
            // InternalKExpressions.g:2858:2: rule__AddExpression__OperatorAssignment_1_1
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
    // InternalKExpressions.g:2868:1: rule__AddExpression__Group_1__2 : rule__AddExpression__Group_1__2__Impl ;
    public final void rule__AddExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2872:1: ( rule__AddExpression__Group_1__2__Impl )
            // InternalKExpressions.g:2873:2: rule__AddExpression__Group_1__2__Impl
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
    // InternalKExpressions.g:2879:1: rule__AddExpression__Group_1__2__Impl : ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__AddExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2883:1: ( ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) ) )
            // InternalKExpressions.g:2884:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) )
            {
            // InternalKExpressions.g:2884:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) )
            // InternalKExpressions.g:2885:1: ( rule__AddExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // InternalKExpressions.g:2886:1: ( rule__AddExpression__SubExpressionsAssignment_1_2 )
            // InternalKExpressions.g:2886:2: rule__AddExpression__SubExpressionsAssignment_1_2
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
    // InternalKExpressions.g:2902:1: rule__SubExpression__Group__0 : rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 ;
    public final void rule__SubExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2906:1: ( rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 )
            // InternalKExpressions.g:2907:2: rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1
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
    // InternalKExpressions.g:2914:1: rule__SubExpression__Group__0__Impl : ( ruleMultExpression ) ;
    public final void rule__SubExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2918:1: ( ( ruleMultExpression ) )
            // InternalKExpressions.g:2919:1: ( ruleMultExpression )
            {
            // InternalKExpressions.g:2919:1: ( ruleMultExpression )
            // InternalKExpressions.g:2920:1: ruleMultExpression
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
    // InternalKExpressions.g:2931:1: rule__SubExpression__Group__1 : rule__SubExpression__Group__1__Impl ;
    public final void rule__SubExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2935:1: ( rule__SubExpression__Group__1__Impl )
            // InternalKExpressions.g:2936:2: rule__SubExpression__Group__1__Impl
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
    // InternalKExpressions.g:2942:1: rule__SubExpression__Group__1__Impl : ( ( rule__SubExpression__Group_1__0 )* ) ;
    public final void rule__SubExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2946:1: ( ( ( rule__SubExpression__Group_1__0 )* ) )
            // InternalKExpressions.g:2947:1: ( ( rule__SubExpression__Group_1__0 )* )
            {
            // InternalKExpressions.g:2947:1: ( ( rule__SubExpression__Group_1__0 )* )
            // InternalKExpressions.g:2948:1: ( rule__SubExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:2949:1: ( rule__SubExpression__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==21) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalKExpressions.g:2949:2: rule__SubExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_14);
            	    rule__SubExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalKExpressions.g:2963:1: rule__SubExpression__Group_1__0 : rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 ;
    public final void rule__SubExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2967:1: ( rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 )
            // InternalKExpressions.g:2968:2: rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1
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
    // InternalKExpressions.g:2975:1: rule__SubExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__SubExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2979:1: ( ( () ) )
            // InternalKExpressions.g:2980:1: ( () )
            {
            // InternalKExpressions.g:2980:1: ( () )
            // InternalKExpressions.g:2981:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:2982:1: ()
            // InternalKExpressions.g:2984:1: 
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
    // InternalKExpressions.g:2994:1: rule__SubExpression__Group_1__1 : rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2 ;
    public final void rule__SubExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2998:1: ( rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2 )
            // InternalKExpressions.g:2999:2: rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2
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
    // InternalKExpressions.g:3006:1: rule__SubExpression__Group_1__1__Impl : ( ( rule__SubExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__SubExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3010:1: ( ( ( rule__SubExpression__OperatorAssignment_1_1 ) ) )
            // InternalKExpressions.g:3011:1: ( ( rule__SubExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKExpressions.g:3011:1: ( ( rule__SubExpression__OperatorAssignment_1_1 ) )
            // InternalKExpressions.g:3012:1: ( rule__SubExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKExpressions.g:3013:1: ( rule__SubExpression__OperatorAssignment_1_1 )
            // InternalKExpressions.g:3013:2: rule__SubExpression__OperatorAssignment_1_1
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
    // InternalKExpressions.g:3023:1: rule__SubExpression__Group_1__2 : rule__SubExpression__Group_1__2__Impl ;
    public final void rule__SubExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3027:1: ( rule__SubExpression__Group_1__2__Impl )
            // InternalKExpressions.g:3028:2: rule__SubExpression__Group_1__2__Impl
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
    // InternalKExpressions.g:3034:1: rule__SubExpression__Group_1__2__Impl : ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__SubExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3038:1: ( ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) ) )
            // InternalKExpressions.g:3039:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) )
            {
            // InternalKExpressions.g:3039:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) )
            // InternalKExpressions.g:3040:1: ( rule__SubExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // InternalKExpressions.g:3041:1: ( rule__SubExpression__SubExpressionsAssignment_1_2 )
            // InternalKExpressions.g:3041:2: rule__SubExpression__SubExpressionsAssignment_1_2
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
    // InternalKExpressions.g:3057:1: rule__MultExpression__Group__0 : rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 ;
    public final void rule__MultExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3061:1: ( rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 )
            // InternalKExpressions.g:3062:2: rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1
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
    // InternalKExpressions.g:3069:1: rule__MultExpression__Group__0__Impl : ( ruleDivExpression ) ;
    public final void rule__MultExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3073:1: ( ( ruleDivExpression ) )
            // InternalKExpressions.g:3074:1: ( ruleDivExpression )
            {
            // InternalKExpressions.g:3074:1: ( ruleDivExpression )
            // InternalKExpressions.g:3075:1: ruleDivExpression
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
    // InternalKExpressions.g:3086:1: rule__MultExpression__Group__1 : rule__MultExpression__Group__1__Impl ;
    public final void rule__MultExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3090:1: ( rule__MultExpression__Group__1__Impl )
            // InternalKExpressions.g:3091:2: rule__MultExpression__Group__1__Impl
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
    // InternalKExpressions.g:3097:1: rule__MultExpression__Group__1__Impl : ( ( rule__MultExpression__Group_1__0 )* ) ;
    public final void rule__MultExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3101:1: ( ( ( rule__MultExpression__Group_1__0 )* ) )
            // InternalKExpressions.g:3102:1: ( ( rule__MultExpression__Group_1__0 )* )
            {
            // InternalKExpressions.g:3102:1: ( ( rule__MultExpression__Group_1__0 )* )
            // InternalKExpressions.g:3103:1: ( rule__MultExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:3104:1: ( rule__MultExpression__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==22) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalKExpressions.g:3104:2: rule__MultExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    rule__MultExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalKExpressions.g:3118:1: rule__MultExpression__Group_1__0 : rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 ;
    public final void rule__MultExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3122:1: ( rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 )
            // InternalKExpressions.g:3123:2: rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1
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
    // InternalKExpressions.g:3130:1: rule__MultExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3134:1: ( ( () ) )
            // InternalKExpressions.g:3135:1: ( () )
            {
            // InternalKExpressions.g:3135:1: ( () )
            // InternalKExpressions.g:3136:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:3137:1: ()
            // InternalKExpressions.g:3139:1: 
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
    // InternalKExpressions.g:3149:1: rule__MultExpression__Group_1__1 : rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2 ;
    public final void rule__MultExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3153:1: ( rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2 )
            // InternalKExpressions.g:3154:2: rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2
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
    // InternalKExpressions.g:3161:1: rule__MultExpression__Group_1__1__Impl : ( ( rule__MultExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3165:1: ( ( ( rule__MultExpression__OperatorAssignment_1_1 ) ) )
            // InternalKExpressions.g:3166:1: ( ( rule__MultExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKExpressions.g:3166:1: ( ( rule__MultExpression__OperatorAssignment_1_1 ) )
            // InternalKExpressions.g:3167:1: ( rule__MultExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKExpressions.g:3168:1: ( rule__MultExpression__OperatorAssignment_1_1 )
            // InternalKExpressions.g:3168:2: rule__MultExpression__OperatorAssignment_1_1
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
    // InternalKExpressions.g:3178:1: rule__MultExpression__Group_1__2 : rule__MultExpression__Group_1__2__Impl ;
    public final void rule__MultExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3182:1: ( rule__MultExpression__Group_1__2__Impl )
            // InternalKExpressions.g:3183:2: rule__MultExpression__Group_1__2__Impl
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
    // InternalKExpressions.g:3189:1: rule__MultExpression__Group_1__2__Impl : ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__MultExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3193:1: ( ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) ) )
            // InternalKExpressions.g:3194:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) )
            {
            // InternalKExpressions.g:3194:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) )
            // InternalKExpressions.g:3195:1: ( rule__MultExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // InternalKExpressions.g:3196:1: ( rule__MultExpression__SubExpressionsAssignment_1_2 )
            // InternalKExpressions.g:3196:2: rule__MultExpression__SubExpressionsAssignment_1_2
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
    // InternalKExpressions.g:3212:1: rule__DivExpression__Group__0 : rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1 ;
    public final void rule__DivExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3216:1: ( rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1 )
            // InternalKExpressions.g:3217:2: rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1
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
    // InternalKExpressions.g:3224:1: rule__DivExpression__Group__0__Impl : ( ruleModExpression ) ;
    public final void rule__DivExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3228:1: ( ( ruleModExpression ) )
            // InternalKExpressions.g:3229:1: ( ruleModExpression )
            {
            // InternalKExpressions.g:3229:1: ( ruleModExpression )
            // InternalKExpressions.g:3230:1: ruleModExpression
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
    // InternalKExpressions.g:3241:1: rule__DivExpression__Group__1 : rule__DivExpression__Group__1__Impl ;
    public final void rule__DivExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3245:1: ( rule__DivExpression__Group__1__Impl )
            // InternalKExpressions.g:3246:2: rule__DivExpression__Group__1__Impl
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
    // InternalKExpressions.g:3252:1: rule__DivExpression__Group__1__Impl : ( ( rule__DivExpression__Group_1__0 )? ) ;
    public final void rule__DivExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3256:1: ( ( ( rule__DivExpression__Group_1__0 )? ) )
            // InternalKExpressions.g:3257:1: ( ( rule__DivExpression__Group_1__0 )? )
            {
            // InternalKExpressions.g:3257:1: ( ( rule__DivExpression__Group_1__0 )? )
            // InternalKExpressions.g:3258:1: ( rule__DivExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:3259:1: ( rule__DivExpression__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==24) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalKExpressions.g:3259:2: rule__DivExpression__Group_1__0
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
    // InternalKExpressions.g:3273:1: rule__DivExpression__Group_1__0 : rule__DivExpression__Group_1__0__Impl rule__DivExpression__Group_1__1 ;
    public final void rule__DivExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3277:1: ( rule__DivExpression__Group_1__0__Impl rule__DivExpression__Group_1__1 )
            // InternalKExpressions.g:3278:2: rule__DivExpression__Group_1__0__Impl rule__DivExpression__Group_1__1
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
    // InternalKExpressions.g:3285:1: rule__DivExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__DivExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3289:1: ( ( () ) )
            // InternalKExpressions.g:3290:1: ( () )
            {
            // InternalKExpressions.g:3290:1: ( () )
            // InternalKExpressions.g:3291:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:3292:1: ()
            // InternalKExpressions.g:3294:1: 
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
    // InternalKExpressions.g:3304:1: rule__DivExpression__Group_1__1 : rule__DivExpression__Group_1__1__Impl rule__DivExpression__Group_1__2 ;
    public final void rule__DivExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3308:1: ( rule__DivExpression__Group_1__1__Impl rule__DivExpression__Group_1__2 )
            // InternalKExpressions.g:3309:2: rule__DivExpression__Group_1__1__Impl rule__DivExpression__Group_1__2
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
    // InternalKExpressions.g:3316:1: rule__DivExpression__Group_1__1__Impl : ( ( rule__DivExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__DivExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3320:1: ( ( ( rule__DivExpression__OperatorAssignment_1_1 ) ) )
            // InternalKExpressions.g:3321:1: ( ( rule__DivExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKExpressions.g:3321:1: ( ( rule__DivExpression__OperatorAssignment_1_1 ) )
            // InternalKExpressions.g:3322:1: ( rule__DivExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKExpressions.g:3323:1: ( rule__DivExpression__OperatorAssignment_1_1 )
            // InternalKExpressions.g:3323:2: rule__DivExpression__OperatorAssignment_1_1
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
    // InternalKExpressions.g:3333:1: rule__DivExpression__Group_1__2 : rule__DivExpression__Group_1__2__Impl ;
    public final void rule__DivExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3337:1: ( rule__DivExpression__Group_1__2__Impl )
            // InternalKExpressions.g:3338:2: rule__DivExpression__Group_1__2__Impl
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
    // InternalKExpressions.g:3344:1: rule__DivExpression__Group_1__2__Impl : ( ( rule__DivExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__DivExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3348:1: ( ( ( rule__DivExpression__SubExpressionsAssignment_1_2 ) ) )
            // InternalKExpressions.g:3349:1: ( ( rule__DivExpression__SubExpressionsAssignment_1_2 ) )
            {
            // InternalKExpressions.g:3349:1: ( ( rule__DivExpression__SubExpressionsAssignment_1_2 ) )
            // InternalKExpressions.g:3350:1: ( rule__DivExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // InternalKExpressions.g:3351:1: ( rule__DivExpression__SubExpressionsAssignment_1_2 )
            // InternalKExpressions.g:3351:2: rule__DivExpression__SubExpressionsAssignment_1_2
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
    // InternalKExpressions.g:3367:1: rule__ModExpression__Group__0 : rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1 ;
    public final void rule__ModExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3371:1: ( rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1 )
            // InternalKExpressions.g:3372:2: rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1
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
    // InternalKExpressions.g:3379:1: rule__ModExpression__Group__0__Impl : ( ruleNegExpression ) ;
    public final void rule__ModExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3383:1: ( ( ruleNegExpression ) )
            // InternalKExpressions.g:3384:1: ( ruleNegExpression )
            {
            // InternalKExpressions.g:3384:1: ( ruleNegExpression )
            // InternalKExpressions.g:3385:1: ruleNegExpression
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
    // InternalKExpressions.g:3396:1: rule__ModExpression__Group__1 : rule__ModExpression__Group__1__Impl ;
    public final void rule__ModExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3400:1: ( rule__ModExpression__Group__1__Impl )
            // InternalKExpressions.g:3401:2: rule__ModExpression__Group__1__Impl
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
    // InternalKExpressions.g:3407:1: rule__ModExpression__Group__1__Impl : ( ( rule__ModExpression__Group_1__0 )? ) ;
    public final void rule__ModExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3411:1: ( ( ( rule__ModExpression__Group_1__0 )? ) )
            // InternalKExpressions.g:3412:1: ( ( rule__ModExpression__Group_1__0 )? )
            {
            // InternalKExpressions.g:3412:1: ( ( rule__ModExpression__Group_1__0 )? )
            // InternalKExpressions.g:3413:1: ( rule__ModExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:3414:1: ( rule__ModExpression__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==23) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalKExpressions.g:3414:2: rule__ModExpression__Group_1__0
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
    // InternalKExpressions.g:3428:1: rule__ModExpression__Group_1__0 : rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1 ;
    public final void rule__ModExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3432:1: ( rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1 )
            // InternalKExpressions.g:3433:2: rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1
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
    // InternalKExpressions.g:3440:1: rule__ModExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ModExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3444:1: ( ( () ) )
            // InternalKExpressions.g:3445:1: ( () )
            {
            // InternalKExpressions.g:3445:1: ( () )
            // InternalKExpressions.g:3446:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:3447:1: ()
            // InternalKExpressions.g:3449:1: 
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
    // InternalKExpressions.g:3459:1: rule__ModExpression__Group_1__1 : rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2 ;
    public final void rule__ModExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3463:1: ( rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2 )
            // InternalKExpressions.g:3464:2: rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2
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
    // InternalKExpressions.g:3471:1: rule__ModExpression__Group_1__1__Impl : ( ( rule__ModExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ModExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3475:1: ( ( ( rule__ModExpression__OperatorAssignment_1_1 ) ) )
            // InternalKExpressions.g:3476:1: ( ( rule__ModExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKExpressions.g:3476:1: ( ( rule__ModExpression__OperatorAssignment_1_1 ) )
            // InternalKExpressions.g:3477:1: ( rule__ModExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKExpressions.g:3478:1: ( rule__ModExpression__OperatorAssignment_1_1 )
            // InternalKExpressions.g:3478:2: rule__ModExpression__OperatorAssignment_1_1
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
    // InternalKExpressions.g:3488:1: rule__ModExpression__Group_1__2 : rule__ModExpression__Group_1__2__Impl ;
    public final void rule__ModExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3492:1: ( rule__ModExpression__Group_1__2__Impl )
            // InternalKExpressions.g:3493:2: rule__ModExpression__Group_1__2__Impl
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
    // InternalKExpressions.g:3499:1: rule__ModExpression__Group_1__2__Impl : ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__ModExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3503:1: ( ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) ) )
            // InternalKExpressions.g:3504:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) )
            {
            // InternalKExpressions.g:3504:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) )
            // InternalKExpressions.g:3505:1: ( rule__ModExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // InternalKExpressions.g:3506:1: ( rule__ModExpression__SubExpressionsAssignment_1_2 )
            // InternalKExpressions.g:3506:2: rule__ModExpression__SubExpressionsAssignment_1_2
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
    // InternalKExpressions.g:3522:1: rule__NegExpression__Group_0__0 : rule__NegExpression__Group_0__0__Impl rule__NegExpression__Group_0__1 ;
    public final void rule__NegExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3526:1: ( rule__NegExpression__Group_0__0__Impl rule__NegExpression__Group_0__1 )
            // InternalKExpressions.g:3527:2: rule__NegExpression__Group_0__0__Impl rule__NegExpression__Group_0__1
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
    // InternalKExpressions.g:3534:1: rule__NegExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__NegExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3538:1: ( ( () ) )
            // InternalKExpressions.g:3539:1: ( () )
            {
            // InternalKExpressions.g:3539:1: ( () )
            // InternalKExpressions.g:3540:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // InternalKExpressions.g:3541:1: ()
            // InternalKExpressions.g:3543:1: 
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
    // InternalKExpressions.g:3553:1: rule__NegExpression__Group_0__1 : rule__NegExpression__Group_0__1__Impl rule__NegExpression__Group_0__2 ;
    public final void rule__NegExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3557:1: ( rule__NegExpression__Group_0__1__Impl rule__NegExpression__Group_0__2 )
            // InternalKExpressions.g:3558:2: rule__NegExpression__Group_0__1__Impl rule__NegExpression__Group_0__2
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
    // InternalKExpressions.g:3565:1: rule__NegExpression__Group_0__1__Impl : ( ( rule__NegExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__NegExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3569:1: ( ( ( rule__NegExpression__OperatorAssignment_0_1 ) ) )
            // InternalKExpressions.g:3570:1: ( ( rule__NegExpression__OperatorAssignment_0_1 ) )
            {
            // InternalKExpressions.g:3570:1: ( ( rule__NegExpression__OperatorAssignment_0_1 ) )
            // InternalKExpressions.g:3571:1: ( rule__NegExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // InternalKExpressions.g:3572:1: ( rule__NegExpression__OperatorAssignment_0_1 )
            // InternalKExpressions.g:3572:2: rule__NegExpression__OperatorAssignment_0_1
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
    // InternalKExpressions.g:3582:1: rule__NegExpression__Group_0__2 : rule__NegExpression__Group_0__2__Impl ;
    public final void rule__NegExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3586:1: ( rule__NegExpression__Group_0__2__Impl )
            // InternalKExpressions.g:3587:2: rule__NegExpression__Group_0__2__Impl
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
    // InternalKExpressions.g:3593:1: rule__NegExpression__Group_0__2__Impl : ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) ) ;
    public final void rule__NegExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3597:1: ( ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) ) )
            // InternalKExpressions.g:3598:1: ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) )
            {
            // InternalKExpressions.g:3598:1: ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) )
            // InternalKExpressions.g:3599:1: ( rule__NegExpression__SubExpressionsAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getSubExpressionsAssignment_0_2()); 
            }
            // InternalKExpressions.g:3600:1: ( rule__NegExpression__SubExpressionsAssignment_0_2 )
            // InternalKExpressions.g:3600:2: rule__NegExpression__SubExpressionsAssignment_0_2
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
    // InternalKExpressions.g:3616:1: rule__AtomicExpression__Group_2__0 : rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 ;
    public final void rule__AtomicExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3620:1: ( rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 )
            // InternalKExpressions.g:3621:2: rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1
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
    // InternalKExpressions.g:3628:1: rule__AtomicExpression__Group_2__0__Impl : ( '(' ) ;
    public final void rule__AtomicExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3632:1: ( ( '(' ) )
            // InternalKExpressions.g:3633:1: ( '(' )
            {
            // InternalKExpressions.g:3633:1: ( '(' )
            // InternalKExpressions.g:3634:1: '('
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
    // InternalKExpressions.g:3647:1: rule__AtomicExpression__Group_2__1 : rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2 ;
    public final void rule__AtomicExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3651:1: ( rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2 )
            // InternalKExpressions.g:3652:2: rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2
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
    // InternalKExpressions.g:3659:1: rule__AtomicExpression__Group_2__1__Impl : ( ruleBooleanExpression ) ;
    public final void rule__AtomicExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3663:1: ( ( ruleBooleanExpression ) )
            // InternalKExpressions.g:3664:1: ( ruleBooleanExpression )
            {
            // InternalKExpressions.g:3664:1: ( ruleBooleanExpression )
            // InternalKExpressions.g:3665:1: ruleBooleanExpression
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
    // InternalKExpressions.g:3676:1: rule__AtomicExpression__Group_2__2 : rule__AtomicExpression__Group_2__2__Impl ;
    public final void rule__AtomicExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3680:1: ( rule__AtomicExpression__Group_2__2__Impl )
            // InternalKExpressions.g:3681:2: rule__AtomicExpression__Group_2__2__Impl
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
    // InternalKExpressions.g:3687:1: rule__AtomicExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__AtomicExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3691:1: ( ( ')' ) )
            // InternalKExpressions.g:3692:1: ( ')' )
            {
            // InternalKExpressions.g:3692:1: ( ')' )
            // InternalKExpressions.g:3693:1: ')'
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
    // InternalKExpressions.g:3712:1: rule__AtomicValuedExpression__Group_2__0 : rule__AtomicValuedExpression__Group_2__0__Impl rule__AtomicValuedExpression__Group_2__1 ;
    public final void rule__AtomicValuedExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3716:1: ( rule__AtomicValuedExpression__Group_2__0__Impl rule__AtomicValuedExpression__Group_2__1 )
            // InternalKExpressions.g:3717:2: rule__AtomicValuedExpression__Group_2__0__Impl rule__AtomicValuedExpression__Group_2__1
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
    // InternalKExpressions.g:3724:1: rule__AtomicValuedExpression__Group_2__0__Impl : ( ( '(' ) ) ;
    public final void rule__AtomicValuedExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3728:1: ( ( ( '(' ) ) )
            // InternalKExpressions.g:3729:1: ( ( '(' ) )
            {
            // InternalKExpressions.g:3729:1: ( ( '(' ) )
            // InternalKExpressions.g:3730:1: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0()); 
            }
            // InternalKExpressions.g:3731:1: ( '(' )
            // InternalKExpressions.g:3732:2: '('
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
    // InternalKExpressions.g:3743:1: rule__AtomicValuedExpression__Group_2__1 : rule__AtomicValuedExpression__Group_2__1__Impl rule__AtomicValuedExpression__Group_2__2 ;
    public final void rule__AtomicValuedExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3747:1: ( rule__AtomicValuedExpression__Group_2__1__Impl rule__AtomicValuedExpression__Group_2__2 )
            // InternalKExpressions.g:3748:2: rule__AtomicValuedExpression__Group_2__1__Impl rule__AtomicValuedExpression__Group_2__2
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
    // InternalKExpressions.g:3755:1: rule__AtomicValuedExpression__Group_2__1__Impl : ( ruleValuedExpression ) ;
    public final void rule__AtomicValuedExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3759:1: ( ( ruleValuedExpression ) )
            // InternalKExpressions.g:3760:1: ( ruleValuedExpression )
            {
            // InternalKExpressions.g:3760:1: ( ruleValuedExpression )
            // InternalKExpressions.g:3761:1: ruleValuedExpression
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
    // InternalKExpressions.g:3772:1: rule__AtomicValuedExpression__Group_2__2 : rule__AtomicValuedExpression__Group_2__2__Impl ;
    public final void rule__AtomicValuedExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3776:1: ( rule__AtomicValuedExpression__Group_2__2__Impl )
            // InternalKExpressions.g:3777:2: rule__AtomicValuedExpression__Group_2__2__Impl
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
    // InternalKExpressions.g:3783:1: rule__AtomicValuedExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__AtomicValuedExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3787:1: ( ( ')' ) )
            // InternalKExpressions.g:3788:1: ( ')' )
            {
            // InternalKExpressions.g:3788:1: ( ')' )
            // InternalKExpressions.g:3789:1: ')'
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
    // InternalKExpressions.g:3808:1: rule__ValuedObjectTestExpression__Group_0__0 : rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1 ;
    public final void rule__ValuedObjectTestExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3812:1: ( rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1 )
            // InternalKExpressions.g:3813:2: rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1
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
    // InternalKExpressions.g:3820:1: rule__ValuedObjectTestExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3824:1: ( ( () ) )
            // InternalKExpressions.g:3825:1: ( () )
            {
            // InternalKExpressions.g:3825:1: ( () )
            // InternalKExpressions.g:3826:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // InternalKExpressions.g:3827:1: ()
            // InternalKExpressions.g:3829:1: 
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
    // InternalKExpressions.g:3839:1: rule__ValuedObjectTestExpression__Group_0__1 : rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2 ;
    public final void rule__ValuedObjectTestExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3843:1: ( rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2 )
            // InternalKExpressions.g:3844:2: rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2
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
    // InternalKExpressions.g:3851:1: rule__ValuedObjectTestExpression__Group_0__1__Impl : ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3855:1: ( ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) ) )
            // InternalKExpressions.g:3856:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) )
            {
            // InternalKExpressions.g:3856:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) )
            // InternalKExpressions.g:3857:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // InternalKExpressions.g:3858:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 )
            // InternalKExpressions.g:3858:2: rule__ValuedObjectTestExpression__OperatorAssignment_0_1
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
    // InternalKExpressions.g:3868:1: rule__ValuedObjectTestExpression__Group_0__2 : rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3 ;
    public final void rule__ValuedObjectTestExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3872:1: ( rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3 )
            // InternalKExpressions.g:3873:2: rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3
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
    // InternalKExpressions.g:3880:1: rule__ValuedObjectTestExpression__Group_0__2__Impl : ( '(' ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3884:1: ( ( '(' ) )
            // InternalKExpressions.g:3885:1: ( '(' )
            {
            // InternalKExpressions.g:3885:1: ( '(' )
            // InternalKExpressions.g:3886:1: '('
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
    // InternalKExpressions.g:3899:1: rule__ValuedObjectTestExpression__Group_0__3 : rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4 ;
    public final void rule__ValuedObjectTestExpression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3903:1: ( rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4 )
            // InternalKExpressions.g:3904:2: rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4
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
    // InternalKExpressions.g:3911:1: rule__ValuedObjectTestExpression__Group_0__3__Impl : ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3915:1: ( ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) ) )
            // InternalKExpressions.g:3916:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) )
            {
            // InternalKExpressions.g:3916:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) )
            // InternalKExpressions.g:3917:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsAssignment_0_3()); 
            }
            // InternalKExpressions.g:3918:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 )
            // InternalKExpressions.g:3918:2: rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3
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
    // InternalKExpressions.g:3928:1: rule__ValuedObjectTestExpression__Group_0__4 : rule__ValuedObjectTestExpression__Group_0__4__Impl ;
    public final void rule__ValuedObjectTestExpression__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3932:1: ( rule__ValuedObjectTestExpression__Group_0__4__Impl )
            // InternalKExpressions.g:3933:2: rule__ValuedObjectTestExpression__Group_0__4__Impl
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
    // InternalKExpressions.g:3939:1: rule__ValuedObjectTestExpression__Group_0__4__Impl : ( ')' ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3943:1: ( ( ')' ) )
            // InternalKExpressions.g:3944:1: ( ')' )
            {
            // InternalKExpressions.g:3944:1: ( ')' )
            // InternalKExpressions.g:3945:1: ')'
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
    // InternalKExpressions.g:3968:1: rule__ValuedObjectTestExpression__Group_1__0 : rule__ValuedObjectTestExpression__Group_1__0__Impl rule__ValuedObjectTestExpression__Group_1__1 ;
    public final void rule__ValuedObjectTestExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3972:1: ( rule__ValuedObjectTestExpression__Group_1__0__Impl rule__ValuedObjectTestExpression__Group_1__1 )
            // InternalKExpressions.g:3973:2: rule__ValuedObjectTestExpression__Group_1__0__Impl rule__ValuedObjectTestExpression__Group_1__1
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
    // InternalKExpressions.g:3980:1: rule__ValuedObjectTestExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ValuedObjectTestExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3984:1: ( ( () ) )
            // InternalKExpressions.g:3985:1: ( () )
            {
            // InternalKExpressions.g:3985:1: ( () )
            // InternalKExpressions.g:3986:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorExpressionAction_1_0()); 
            }
            // InternalKExpressions.g:3987:1: ()
            // InternalKExpressions.g:3989:1: 
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
    // InternalKExpressions.g:3999:1: rule__ValuedObjectTestExpression__Group_1__1 : rule__ValuedObjectTestExpression__Group_1__1__Impl rule__ValuedObjectTestExpression__Group_1__2 ;
    public final void rule__ValuedObjectTestExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4003:1: ( rule__ValuedObjectTestExpression__Group_1__1__Impl rule__ValuedObjectTestExpression__Group_1__2 )
            // InternalKExpressions.g:4004:2: rule__ValuedObjectTestExpression__Group_1__1__Impl rule__ValuedObjectTestExpression__Group_1__2
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
    // InternalKExpressions.g:4011:1: rule__ValuedObjectTestExpression__Group_1__1__Impl : ( ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4015:1: ( ( ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 ) ) )
            // InternalKExpressions.g:4016:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKExpressions.g:4016:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 ) )
            // InternalKExpressions.g:4017:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKExpressions.g:4018:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 )
            // InternalKExpressions.g:4018:2: rule__ValuedObjectTestExpression__OperatorAssignment_1_1
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
    // InternalKExpressions.g:4028:1: rule__ValuedObjectTestExpression__Group_1__2 : rule__ValuedObjectTestExpression__Group_1__2__Impl ;
    public final void rule__ValuedObjectTestExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4032:1: ( rule__ValuedObjectTestExpression__Group_1__2__Impl )
            // InternalKExpressions.g:4033:2: rule__ValuedObjectTestExpression__Group_1__2__Impl
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
    // InternalKExpressions.g:4039:1: rule__ValuedObjectTestExpression__Group_1__2__Impl : ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4043:1: ( ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 ) ) )
            // InternalKExpressions.g:4044:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 ) )
            {
            // InternalKExpressions.g:4044:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 ) )
            // InternalKExpressions.g:4045:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // InternalKExpressions.g:4046:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 )
            // InternalKExpressions.g:4046:2: rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2
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
    // InternalKExpressions.g:4062:1: rule__TextExpression__Group__0 : rule__TextExpression__Group__0__Impl rule__TextExpression__Group__1 ;
    public final void rule__TextExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4066:1: ( rule__TextExpression__Group__0__Impl rule__TextExpression__Group__1 )
            // InternalKExpressions.g:4067:2: rule__TextExpression__Group__0__Impl rule__TextExpression__Group__1
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
    // InternalKExpressions.g:4074:1: rule__TextExpression__Group__0__Impl : ( ( rule__TextExpression__CodeAssignment_0 ) ) ;
    public final void rule__TextExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4078:1: ( ( ( rule__TextExpression__CodeAssignment_0 ) ) )
            // InternalKExpressions.g:4079:1: ( ( rule__TextExpression__CodeAssignment_0 ) )
            {
            // InternalKExpressions.g:4079:1: ( ( rule__TextExpression__CodeAssignment_0 ) )
            // InternalKExpressions.g:4080:1: ( rule__TextExpression__CodeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getCodeAssignment_0()); 
            }
            // InternalKExpressions.g:4081:1: ( rule__TextExpression__CodeAssignment_0 )
            // InternalKExpressions.g:4081:2: rule__TextExpression__CodeAssignment_0
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
    // InternalKExpressions.g:4091:1: rule__TextExpression__Group__1 : rule__TextExpression__Group__1__Impl ;
    public final void rule__TextExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4095:1: ( rule__TextExpression__Group__1__Impl )
            // InternalKExpressions.g:4096:2: rule__TextExpression__Group__1__Impl
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
    // InternalKExpressions.g:4102:1: rule__TextExpression__Group__1__Impl : ( ( rule__TextExpression__Group_1__0 )? ) ;
    public final void rule__TextExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4106:1: ( ( ( rule__TextExpression__Group_1__0 )? ) )
            // InternalKExpressions.g:4107:1: ( ( rule__TextExpression__Group_1__0 )? )
            {
            // InternalKExpressions.g:4107:1: ( ( rule__TextExpression__Group_1__0 )? )
            // InternalKExpressions.g:4108:1: ( rule__TextExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:4109:1: ( rule__TextExpression__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==43) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalKExpressions.g:4109:2: rule__TextExpression__Group_1__0
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
    // InternalKExpressions.g:4123:1: rule__TextExpression__Group_1__0 : rule__TextExpression__Group_1__0__Impl rule__TextExpression__Group_1__1 ;
    public final void rule__TextExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4127:1: ( rule__TextExpression__Group_1__0__Impl rule__TextExpression__Group_1__1 )
            // InternalKExpressions.g:4128:2: rule__TextExpression__Group_1__0__Impl rule__TextExpression__Group_1__1
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
    // InternalKExpressions.g:4135:1: rule__TextExpression__Group_1__0__Impl : ( '(' ) ;
    public final void rule__TextExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4139:1: ( ( '(' ) )
            // InternalKExpressions.g:4140:1: ( '(' )
            {
            // InternalKExpressions.g:4140:1: ( '(' )
            // InternalKExpressions.g:4141:1: '('
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
    // InternalKExpressions.g:4154:1: rule__TextExpression__Group_1__1 : rule__TextExpression__Group_1__1__Impl rule__TextExpression__Group_1__2 ;
    public final void rule__TextExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4158:1: ( rule__TextExpression__Group_1__1__Impl rule__TextExpression__Group_1__2 )
            // InternalKExpressions.g:4159:2: rule__TextExpression__Group_1__1__Impl rule__TextExpression__Group_1__2
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
    // InternalKExpressions.g:4166:1: rule__TextExpression__Group_1__1__Impl : ( ( rule__TextExpression__TypeAssignment_1_1 ) ) ;
    public final void rule__TextExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4170:1: ( ( ( rule__TextExpression__TypeAssignment_1_1 ) ) )
            // InternalKExpressions.g:4171:1: ( ( rule__TextExpression__TypeAssignment_1_1 ) )
            {
            // InternalKExpressions.g:4171:1: ( ( rule__TextExpression__TypeAssignment_1_1 ) )
            // InternalKExpressions.g:4172:1: ( rule__TextExpression__TypeAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getTypeAssignment_1_1()); 
            }
            // InternalKExpressions.g:4173:1: ( rule__TextExpression__TypeAssignment_1_1 )
            // InternalKExpressions.g:4173:2: rule__TextExpression__TypeAssignment_1_1
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
    // InternalKExpressions.g:4183:1: rule__TextExpression__Group_1__2 : rule__TextExpression__Group_1__2__Impl ;
    public final void rule__TextExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4187:1: ( rule__TextExpression__Group_1__2__Impl )
            // InternalKExpressions.g:4188:2: rule__TextExpression__Group_1__2__Impl
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
    // InternalKExpressions.g:4194:1: rule__TextExpression__Group_1__2__Impl : ( ')' ) ;
    public final void rule__TextExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4198:1: ( ( ')' ) )
            // InternalKExpressions.g:4199:1: ( ')' )
            {
            // InternalKExpressions.g:4199:1: ( ')' )
            // InternalKExpressions.g:4200:1: ')'
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
    // InternalKExpressions.g:4219:1: rule__ISignal__Group__0 : rule__ISignal__Group__0__Impl rule__ISignal__Group__1 ;
    public final void rule__ISignal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4223:1: ( rule__ISignal__Group__0__Impl rule__ISignal__Group__1 )
            // InternalKExpressions.g:4224:2: rule__ISignal__Group__0__Impl rule__ISignal__Group__1
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
    // InternalKExpressions.g:4231:1: rule__ISignal__Group__0__Impl : ( ( rule__ISignal__NameAssignment_0 ) ) ;
    public final void rule__ISignal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4235:1: ( ( ( rule__ISignal__NameAssignment_0 ) ) )
            // InternalKExpressions.g:4236:1: ( ( rule__ISignal__NameAssignment_0 ) )
            {
            // InternalKExpressions.g:4236:1: ( ( rule__ISignal__NameAssignment_0 ) )
            // InternalKExpressions.g:4237:1: ( rule__ISignal__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getISignalAccess().getNameAssignment_0()); 
            }
            // InternalKExpressions.g:4238:1: ( rule__ISignal__NameAssignment_0 )
            // InternalKExpressions.g:4238:2: rule__ISignal__NameAssignment_0
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
    // InternalKExpressions.g:4248:1: rule__ISignal__Group__1 : rule__ISignal__Group__1__Impl ;
    public final void rule__ISignal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4252:1: ( rule__ISignal__Group__1__Impl )
            // InternalKExpressions.g:4253:2: rule__ISignal__Group__1__Impl
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
    // InternalKExpressions.g:4259:1: rule__ISignal__Group__1__Impl : ( ( rule__ISignal__ChannelDescrAssignment_1 )? ) ;
    public final void rule__ISignal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4263:1: ( ( ( rule__ISignal__ChannelDescrAssignment_1 )? ) )
            // InternalKExpressions.g:4264:1: ( ( rule__ISignal__ChannelDescrAssignment_1 )? )
            {
            // InternalKExpressions.g:4264:1: ( ( rule__ISignal__ChannelDescrAssignment_1 )? )
            // InternalKExpressions.g:4265:1: ( rule__ISignal__ChannelDescrAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getISignalAccess().getChannelDescrAssignment_1()); 
            }
            // InternalKExpressions.g:4266:1: ( rule__ISignal__ChannelDescrAssignment_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==43||(LA28_0>=51 && LA28_0<=52)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalKExpressions.g:4266:2: rule__ISignal__ChannelDescrAssignment_1
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
    // InternalKExpressions.g:4280:1: rule__InterfaceSignalDecl__Group_0__0 : rule__InterfaceSignalDecl__Group_0__0__Impl rule__InterfaceSignalDecl__Group_0__1 ;
    public final void rule__InterfaceSignalDecl__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4284:1: ( rule__InterfaceSignalDecl__Group_0__0__Impl rule__InterfaceSignalDecl__Group_0__1 )
            // InternalKExpressions.g:4285:2: rule__InterfaceSignalDecl__Group_0__0__Impl rule__InterfaceSignalDecl__Group_0__1
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
    // InternalKExpressions.g:4292:1: rule__InterfaceSignalDecl__Group_0__0__Impl : ( () ) ;
    public final void rule__InterfaceSignalDecl__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4296:1: ( ( () ) )
            // InternalKExpressions.g:4297:1: ( () )
            {
            // InternalKExpressions.g:4297:1: ( () )
            // InternalKExpressions.g:4298:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getInputAction_0_0()); 
            }
            // InternalKExpressions.g:4299:1: ()
            // InternalKExpressions.g:4301:1: 
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
    // InternalKExpressions.g:4311:1: rule__InterfaceSignalDecl__Group_0__1 : rule__InterfaceSignalDecl__Group_0__1__Impl rule__InterfaceSignalDecl__Group_0__2 ;
    public final void rule__InterfaceSignalDecl__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4315:1: ( rule__InterfaceSignalDecl__Group_0__1__Impl rule__InterfaceSignalDecl__Group_0__2 )
            // InternalKExpressions.g:4316:2: rule__InterfaceSignalDecl__Group_0__1__Impl rule__InterfaceSignalDecl__Group_0__2
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
    // InternalKExpressions.g:4323:1: rule__InterfaceSignalDecl__Group_0__1__Impl : ( 'input' ) ;
    public final void rule__InterfaceSignalDecl__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4327:1: ( ( 'input' ) )
            // InternalKExpressions.g:4328:1: ( 'input' )
            {
            // InternalKExpressions.g:4328:1: ( 'input' )
            // InternalKExpressions.g:4329:1: 'input'
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
    // InternalKExpressions.g:4342:1: rule__InterfaceSignalDecl__Group_0__2 : rule__InterfaceSignalDecl__Group_0__2__Impl rule__InterfaceSignalDecl__Group_0__3 ;
    public final void rule__InterfaceSignalDecl__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4346:1: ( rule__InterfaceSignalDecl__Group_0__2__Impl rule__InterfaceSignalDecl__Group_0__3 )
            // InternalKExpressions.g:4347:2: rule__InterfaceSignalDecl__Group_0__2__Impl rule__InterfaceSignalDecl__Group_0__3
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
    // InternalKExpressions.g:4354:1: rule__InterfaceSignalDecl__Group_0__2__Impl : ( ( rule__InterfaceSignalDecl__SignalsAssignment_0_2 ) ) ;
    public final void rule__InterfaceSignalDecl__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4358:1: ( ( ( rule__InterfaceSignalDecl__SignalsAssignment_0_2 ) ) )
            // InternalKExpressions.g:4359:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_0_2 ) )
            {
            // InternalKExpressions.g:4359:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_0_2 ) )
            // InternalKExpressions.g:4360:1: ( rule__InterfaceSignalDecl__SignalsAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSignalsAssignment_0_2()); 
            }
            // InternalKExpressions.g:4361:1: ( rule__InterfaceSignalDecl__SignalsAssignment_0_2 )
            // InternalKExpressions.g:4361:2: rule__InterfaceSignalDecl__SignalsAssignment_0_2
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
    // InternalKExpressions.g:4371:1: rule__InterfaceSignalDecl__Group_0__3 : rule__InterfaceSignalDecl__Group_0__3__Impl rule__InterfaceSignalDecl__Group_0__4 ;
    public final void rule__InterfaceSignalDecl__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4375:1: ( rule__InterfaceSignalDecl__Group_0__3__Impl rule__InterfaceSignalDecl__Group_0__4 )
            // InternalKExpressions.g:4376:2: rule__InterfaceSignalDecl__Group_0__3__Impl rule__InterfaceSignalDecl__Group_0__4
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
    // InternalKExpressions.g:4383:1: rule__InterfaceSignalDecl__Group_0__3__Impl : ( ( rule__InterfaceSignalDecl__Group_0_3__0 )* ) ;
    public final void rule__InterfaceSignalDecl__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4387:1: ( ( ( rule__InterfaceSignalDecl__Group_0_3__0 )* ) )
            // InternalKExpressions.g:4388:1: ( ( rule__InterfaceSignalDecl__Group_0_3__0 )* )
            {
            // InternalKExpressions.g:4388:1: ( ( rule__InterfaceSignalDecl__Group_0_3__0 )* )
            // InternalKExpressions.g:4389:1: ( rule__InterfaceSignalDecl__Group_0_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getGroup_0_3()); 
            }
            // InternalKExpressions.g:4390:1: ( rule__InterfaceSignalDecl__Group_0_3__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==47) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalKExpressions.g:4390:2: rule__InterfaceSignalDecl__Group_0_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    rule__InterfaceSignalDecl__Group_0_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalKExpressions.g:4400:1: rule__InterfaceSignalDecl__Group_0__4 : rule__InterfaceSignalDecl__Group_0__4__Impl ;
    public final void rule__InterfaceSignalDecl__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4404:1: ( rule__InterfaceSignalDecl__Group_0__4__Impl )
            // InternalKExpressions.g:4405:2: rule__InterfaceSignalDecl__Group_0__4__Impl
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
    // InternalKExpressions.g:4411:1: rule__InterfaceSignalDecl__Group_0__4__Impl : ( ';' ) ;
    public final void rule__InterfaceSignalDecl__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4415:1: ( ( ';' ) )
            // InternalKExpressions.g:4416:1: ( ';' )
            {
            // InternalKExpressions.g:4416:1: ( ';' )
            // InternalKExpressions.g:4417:1: ';'
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
    // InternalKExpressions.g:4440:1: rule__InterfaceSignalDecl__Group_0_3__0 : rule__InterfaceSignalDecl__Group_0_3__0__Impl rule__InterfaceSignalDecl__Group_0_3__1 ;
    public final void rule__InterfaceSignalDecl__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4444:1: ( rule__InterfaceSignalDecl__Group_0_3__0__Impl rule__InterfaceSignalDecl__Group_0_3__1 )
            // InternalKExpressions.g:4445:2: rule__InterfaceSignalDecl__Group_0_3__0__Impl rule__InterfaceSignalDecl__Group_0_3__1
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
    // InternalKExpressions.g:4452:1: rule__InterfaceSignalDecl__Group_0_3__0__Impl : ( ',' ) ;
    public final void rule__InterfaceSignalDecl__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4456:1: ( ( ',' ) )
            // InternalKExpressions.g:4457:1: ( ',' )
            {
            // InternalKExpressions.g:4457:1: ( ',' )
            // InternalKExpressions.g:4458:1: ','
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
    // InternalKExpressions.g:4471:1: rule__InterfaceSignalDecl__Group_0_3__1 : rule__InterfaceSignalDecl__Group_0_3__1__Impl ;
    public final void rule__InterfaceSignalDecl__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4475:1: ( rule__InterfaceSignalDecl__Group_0_3__1__Impl )
            // InternalKExpressions.g:4476:2: rule__InterfaceSignalDecl__Group_0_3__1__Impl
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
    // InternalKExpressions.g:4482:1: rule__InterfaceSignalDecl__Group_0_3__1__Impl : ( ( rule__InterfaceSignalDecl__SignalsAssignment_0_3_1 ) ) ;
    public final void rule__InterfaceSignalDecl__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4486:1: ( ( ( rule__InterfaceSignalDecl__SignalsAssignment_0_3_1 ) ) )
            // InternalKExpressions.g:4487:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_0_3_1 ) )
            {
            // InternalKExpressions.g:4487:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_0_3_1 ) )
            // InternalKExpressions.g:4488:1: ( rule__InterfaceSignalDecl__SignalsAssignment_0_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSignalsAssignment_0_3_1()); 
            }
            // InternalKExpressions.g:4489:1: ( rule__InterfaceSignalDecl__SignalsAssignment_0_3_1 )
            // InternalKExpressions.g:4489:2: rule__InterfaceSignalDecl__SignalsAssignment_0_3_1
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
    // InternalKExpressions.g:4503:1: rule__InterfaceSignalDecl__Group_1__0 : rule__InterfaceSignalDecl__Group_1__0__Impl rule__InterfaceSignalDecl__Group_1__1 ;
    public final void rule__InterfaceSignalDecl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4507:1: ( rule__InterfaceSignalDecl__Group_1__0__Impl rule__InterfaceSignalDecl__Group_1__1 )
            // InternalKExpressions.g:4508:2: rule__InterfaceSignalDecl__Group_1__0__Impl rule__InterfaceSignalDecl__Group_1__1
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
    // InternalKExpressions.g:4515:1: rule__InterfaceSignalDecl__Group_1__0__Impl : ( () ) ;
    public final void rule__InterfaceSignalDecl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4519:1: ( ( () ) )
            // InternalKExpressions.g:4520:1: ( () )
            {
            // InternalKExpressions.g:4520:1: ( () )
            // InternalKExpressions.g:4521:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getOutputAction_1_0()); 
            }
            // InternalKExpressions.g:4522:1: ()
            // InternalKExpressions.g:4524:1: 
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
    // InternalKExpressions.g:4534:1: rule__InterfaceSignalDecl__Group_1__1 : rule__InterfaceSignalDecl__Group_1__1__Impl rule__InterfaceSignalDecl__Group_1__2 ;
    public final void rule__InterfaceSignalDecl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4538:1: ( rule__InterfaceSignalDecl__Group_1__1__Impl rule__InterfaceSignalDecl__Group_1__2 )
            // InternalKExpressions.g:4539:2: rule__InterfaceSignalDecl__Group_1__1__Impl rule__InterfaceSignalDecl__Group_1__2
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
    // InternalKExpressions.g:4546:1: rule__InterfaceSignalDecl__Group_1__1__Impl : ( 'output' ) ;
    public final void rule__InterfaceSignalDecl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4550:1: ( ( 'output' ) )
            // InternalKExpressions.g:4551:1: ( 'output' )
            {
            // InternalKExpressions.g:4551:1: ( 'output' )
            // InternalKExpressions.g:4552:1: 'output'
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
    // InternalKExpressions.g:4565:1: rule__InterfaceSignalDecl__Group_1__2 : rule__InterfaceSignalDecl__Group_1__2__Impl rule__InterfaceSignalDecl__Group_1__3 ;
    public final void rule__InterfaceSignalDecl__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4569:1: ( rule__InterfaceSignalDecl__Group_1__2__Impl rule__InterfaceSignalDecl__Group_1__3 )
            // InternalKExpressions.g:4570:2: rule__InterfaceSignalDecl__Group_1__2__Impl rule__InterfaceSignalDecl__Group_1__3
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
    // InternalKExpressions.g:4577:1: rule__InterfaceSignalDecl__Group_1__2__Impl : ( ( rule__InterfaceSignalDecl__SignalsAssignment_1_2 ) ) ;
    public final void rule__InterfaceSignalDecl__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4581:1: ( ( ( rule__InterfaceSignalDecl__SignalsAssignment_1_2 ) ) )
            // InternalKExpressions.g:4582:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_1_2 ) )
            {
            // InternalKExpressions.g:4582:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_1_2 ) )
            // InternalKExpressions.g:4583:1: ( rule__InterfaceSignalDecl__SignalsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSignalsAssignment_1_2()); 
            }
            // InternalKExpressions.g:4584:1: ( rule__InterfaceSignalDecl__SignalsAssignment_1_2 )
            // InternalKExpressions.g:4584:2: rule__InterfaceSignalDecl__SignalsAssignment_1_2
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
    // InternalKExpressions.g:4594:1: rule__InterfaceSignalDecl__Group_1__3 : rule__InterfaceSignalDecl__Group_1__3__Impl rule__InterfaceSignalDecl__Group_1__4 ;
    public final void rule__InterfaceSignalDecl__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4598:1: ( rule__InterfaceSignalDecl__Group_1__3__Impl rule__InterfaceSignalDecl__Group_1__4 )
            // InternalKExpressions.g:4599:2: rule__InterfaceSignalDecl__Group_1__3__Impl rule__InterfaceSignalDecl__Group_1__4
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
    // InternalKExpressions.g:4606:1: rule__InterfaceSignalDecl__Group_1__3__Impl : ( ( rule__InterfaceSignalDecl__Group_1_3__0 )* ) ;
    public final void rule__InterfaceSignalDecl__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4610:1: ( ( ( rule__InterfaceSignalDecl__Group_1_3__0 )* ) )
            // InternalKExpressions.g:4611:1: ( ( rule__InterfaceSignalDecl__Group_1_3__0 )* )
            {
            // InternalKExpressions.g:4611:1: ( ( rule__InterfaceSignalDecl__Group_1_3__0 )* )
            // InternalKExpressions.g:4612:1: ( rule__InterfaceSignalDecl__Group_1_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getGroup_1_3()); 
            }
            // InternalKExpressions.g:4613:1: ( rule__InterfaceSignalDecl__Group_1_3__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==47) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalKExpressions.g:4613:2: rule__InterfaceSignalDecl__Group_1_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    rule__InterfaceSignalDecl__Group_1_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalKExpressions.g:4623:1: rule__InterfaceSignalDecl__Group_1__4 : rule__InterfaceSignalDecl__Group_1__4__Impl ;
    public final void rule__InterfaceSignalDecl__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4627:1: ( rule__InterfaceSignalDecl__Group_1__4__Impl )
            // InternalKExpressions.g:4628:2: rule__InterfaceSignalDecl__Group_1__4__Impl
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
    // InternalKExpressions.g:4634:1: rule__InterfaceSignalDecl__Group_1__4__Impl : ( ';' ) ;
    public final void rule__InterfaceSignalDecl__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4638:1: ( ( ';' ) )
            // InternalKExpressions.g:4639:1: ( ';' )
            {
            // InternalKExpressions.g:4639:1: ( ';' )
            // InternalKExpressions.g:4640:1: ';'
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
    // InternalKExpressions.g:4663:1: rule__InterfaceSignalDecl__Group_1_3__0 : rule__InterfaceSignalDecl__Group_1_3__0__Impl rule__InterfaceSignalDecl__Group_1_3__1 ;
    public final void rule__InterfaceSignalDecl__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4667:1: ( rule__InterfaceSignalDecl__Group_1_3__0__Impl rule__InterfaceSignalDecl__Group_1_3__1 )
            // InternalKExpressions.g:4668:2: rule__InterfaceSignalDecl__Group_1_3__0__Impl rule__InterfaceSignalDecl__Group_1_3__1
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
    // InternalKExpressions.g:4675:1: rule__InterfaceSignalDecl__Group_1_3__0__Impl : ( ',' ) ;
    public final void rule__InterfaceSignalDecl__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4679:1: ( ( ',' ) )
            // InternalKExpressions.g:4680:1: ( ',' )
            {
            // InternalKExpressions.g:4680:1: ( ',' )
            // InternalKExpressions.g:4681:1: ','
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
    // InternalKExpressions.g:4694:1: rule__InterfaceSignalDecl__Group_1_3__1 : rule__InterfaceSignalDecl__Group_1_3__1__Impl ;
    public final void rule__InterfaceSignalDecl__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4698:1: ( rule__InterfaceSignalDecl__Group_1_3__1__Impl )
            // InternalKExpressions.g:4699:2: rule__InterfaceSignalDecl__Group_1_3__1__Impl
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
    // InternalKExpressions.g:4705:1: rule__InterfaceSignalDecl__Group_1_3__1__Impl : ( ( rule__InterfaceSignalDecl__SignalsAssignment_1_3_1 ) ) ;
    public final void rule__InterfaceSignalDecl__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4709:1: ( ( ( rule__InterfaceSignalDecl__SignalsAssignment_1_3_1 ) ) )
            // InternalKExpressions.g:4710:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_1_3_1 ) )
            {
            // InternalKExpressions.g:4710:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_1_3_1 ) )
            // InternalKExpressions.g:4711:1: ( rule__InterfaceSignalDecl__SignalsAssignment_1_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSignalsAssignment_1_3_1()); 
            }
            // InternalKExpressions.g:4712:1: ( rule__InterfaceSignalDecl__SignalsAssignment_1_3_1 )
            // InternalKExpressions.g:4712:2: rule__InterfaceSignalDecl__SignalsAssignment_1_3_1
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
    // InternalKExpressions.g:4726:1: rule__InterfaceSignalDecl__Group_2__0 : rule__InterfaceSignalDecl__Group_2__0__Impl rule__InterfaceSignalDecl__Group_2__1 ;
    public final void rule__InterfaceSignalDecl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4730:1: ( rule__InterfaceSignalDecl__Group_2__0__Impl rule__InterfaceSignalDecl__Group_2__1 )
            // InternalKExpressions.g:4731:2: rule__InterfaceSignalDecl__Group_2__0__Impl rule__InterfaceSignalDecl__Group_2__1
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
    // InternalKExpressions.g:4738:1: rule__InterfaceSignalDecl__Group_2__0__Impl : ( () ) ;
    public final void rule__InterfaceSignalDecl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4742:1: ( ( () ) )
            // InternalKExpressions.g:4743:1: ( () )
            {
            // InternalKExpressions.g:4743:1: ( () )
            // InternalKExpressions.g:4744:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getInputOutputAction_2_0()); 
            }
            // InternalKExpressions.g:4745:1: ()
            // InternalKExpressions.g:4747:1: 
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
    // InternalKExpressions.g:4757:1: rule__InterfaceSignalDecl__Group_2__1 : rule__InterfaceSignalDecl__Group_2__1__Impl rule__InterfaceSignalDecl__Group_2__2 ;
    public final void rule__InterfaceSignalDecl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4761:1: ( rule__InterfaceSignalDecl__Group_2__1__Impl rule__InterfaceSignalDecl__Group_2__2 )
            // InternalKExpressions.g:4762:2: rule__InterfaceSignalDecl__Group_2__1__Impl rule__InterfaceSignalDecl__Group_2__2
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
    // InternalKExpressions.g:4769:1: rule__InterfaceSignalDecl__Group_2__1__Impl : ( 'inputoutput' ) ;
    public final void rule__InterfaceSignalDecl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4773:1: ( ( 'inputoutput' ) )
            // InternalKExpressions.g:4774:1: ( 'inputoutput' )
            {
            // InternalKExpressions.g:4774:1: ( 'inputoutput' )
            // InternalKExpressions.g:4775:1: 'inputoutput'
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
    // InternalKExpressions.g:4788:1: rule__InterfaceSignalDecl__Group_2__2 : rule__InterfaceSignalDecl__Group_2__2__Impl rule__InterfaceSignalDecl__Group_2__3 ;
    public final void rule__InterfaceSignalDecl__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4792:1: ( rule__InterfaceSignalDecl__Group_2__2__Impl rule__InterfaceSignalDecl__Group_2__3 )
            // InternalKExpressions.g:4793:2: rule__InterfaceSignalDecl__Group_2__2__Impl rule__InterfaceSignalDecl__Group_2__3
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
    // InternalKExpressions.g:4800:1: rule__InterfaceSignalDecl__Group_2__2__Impl : ( ( rule__InterfaceSignalDecl__SignalsAssignment_2_2 ) ) ;
    public final void rule__InterfaceSignalDecl__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4804:1: ( ( ( rule__InterfaceSignalDecl__SignalsAssignment_2_2 ) ) )
            // InternalKExpressions.g:4805:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_2_2 ) )
            {
            // InternalKExpressions.g:4805:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_2_2 ) )
            // InternalKExpressions.g:4806:1: ( rule__InterfaceSignalDecl__SignalsAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSignalsAssignment_2_2()); 
            }
            // InternalKExpressions.g:4807:1: ( rule__InterfaceSignalDecl__SignalsAssignment_2_2 )
            // InternalKExpressions.g:4807:2: rule__InterfaceSignalDecl__SignalsAssignment_2_2
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
    // InternalKExpressions.g:4817:1: rule__InterfaceSignalDecl__Group_2__3 : rule__InterfaceSignalDecl__Group_2__3__Impl rule__InterfaceSignalDecl__Group_2__4 ;
    public final void rule__InterfaceSignalDecl__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4821:1: ( rule__InterfaceSignalDecl__Group_2__3__Impl rule__InterfaceSignalDecl__Group_2__4 )
            // InternalKExpressions.g:4822:2: rule__InterfaceSignalDecl__Group_2__3__Impl rule__InterfaceSignalDecl__Group_2__4
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
    // InternalKExpressions.g:4829:1: rule__InterfaceSignalDecl__Group_2__3__Impl : ( ( rule__InterfaceSignalDecl__Group_2_3__0 )* ) ;
    public final void rule__InterfaceSignalDecl__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4833:1: ( ( ( rule__InterfaceSignalDecl__Group_2_3__0 )* ) )
            // InternalKExpressions.g:4834:1: ( ( rule__InterfaceSignalDecl__Group_2_3__0 )* )
            {
            // InternalKExpressions.g:4834:1: ( ( rule__InterfaceSignalDecl__Group_2_3__0 )* )
            // InternalKExpressions.g:4835:1: ( rule__InterfaceSignalDecl__Group_2_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getGroup_2_3()); 
            }
            // InternalKExpressions.g:4836:1: ( rule__InterfaceSignalDecl__Group_2_3__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==47) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalKExpressions.g:4836:2: rule__InterfaceSignalDecl__Group_2_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    rule__InterfaceSignalDecl__Group_2_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalKExpressions.g:4846:1: rule__InterfaceSignalDecl__Group_2__4 : rule__InterfaceSignalDecl__Group_2__4__Impl ;
    public final void rule__InterfaceSignalDecl__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4850:1: ( rule__InterfaceSignalDecl__Group_2__4__Impl )
            // InternalKExpressions.g:4851:2: rule__InterfaceSignalDecl__Group_2__4__Impl
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
    // InternalKExpressions.g:4857:1: rule__InterfaceSignalDecl__Group_2__4__Impl : ( ';' ) ;
    public final void rule__InterfaceSignalDecl__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4861:1: ( ( ';' ) )
            // InternalKExpressions.g:4862:1: ( ';' )
            {
            // InternalKExpressions.g:4862:1: ( ';' )
            // InternalKExpressions.g:4863:1: ';'
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
    // InternalKExpressions.g:4886:1: rule__InterfaceSignalDecl__Group_2_3__0 : rule__InterfaceSignalDecl__Group_2_3__0__Impl rule__InterfaceSignalDecl__Group_2_3__1 ;
    public final void rule__InterfaceSignalDecl__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4890:1: ( rule__InterfaceSignalDecl__Group_2_3__0__Impl rule__InterfaceSignalDecl__Group_2_3__1 )
            // InternalKExpressions.g:4891:2: rule__InterfaceSignalDecl__Group_2_3__0__Impl rule__InterfaceSignalDecl__Group_2_3__1
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
    // InternalKExpressions.g:4898:1: rule__InterfaceSignalDecl__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__InterfaceSignalDecl__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4902:1: ( ( ',' ) )
            // InternalKExpressions.g:4903:1: ( ',' )
            {
            // InternalKExpressions.g:4903:1: ( ',' )
            // InternalKExpressions.g:4904:1: ','
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
    // InternalKExpressions.g:4917:1: rule__InterfaceSignalDecl__Group_2_3__1 : rule__InterfaceSignalDecl__Group_2_3__1__Impl ;
    public final void rule__InterfaceSignalDecl__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4921:1: ( rule__InterfaceSignalDecl__Group_2_3__1__Impl )
            // InternalKExpressions.g:4922:2: rule__InterfaceSignalDecl__Group_2_3__1__Impl
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
    // InternalKExpressions.g:4928:1: rule__InterfaceSignalDecl__Group_2_3__1__Impl : ( ( rule__InterfaceSignalDecl__SignalsAssignment_2_3_1 ) ) ;
    public final void rule__InterfaceSignalDecl__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4932:1: ( ( ( rule__InterfaceSignalDecl__SignalsAssignment_2_3_1 ) ) )
            // InternalKExpressions.g:4933:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_2_3_1 ) )
            {
            // InternalKExpressions.g:4933:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_2_3_1 ) )
            // InternalKExpressions.g:4934:1: ( rule__InterfaceSignalDecl__SignalsAssignment_2_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSignalsAssignment_2_3_1()); 
            }
            // InternalKExpressions.g:4935:1: ( rule__InterfaceSignalDecl__SignalsAssignment_2_3_1 )
            // InternalKExpressions.g:4935:2: rule__InterfaceSignalDecl__SignalsAssignment_2_3_1
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
    // InternalKExpressions.g:4949:1: rule__InterfaceSignalDecl__Group_3__0 : rule__InterfaceSignalDecl__Group_3__0__Impl rule__InterfaceSignalDecl__Group_3__1 ;
    public final void rule__InterfaceSignalDecl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4953:1: ( rule__InterfaceSignalDecl__Group_3__0__Impl rule__InterfaceSignalDecl__Group_3__1 )
            // InternalKExpressions.g:4954:2: rule__InterfaceSignalDecl__Group_3__0__Impl rule__InterfaceSignalDecl__Group_3__1
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
    // InternalKExpressions.g:4961:1: rule__InterfaceSignalDecl__Group_3__0__Impl : ( () ) ;
    public final void rule__InterfaceSignalDecl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4965:1: ( ( () ) )
            // InternalKExpressions.g:4966:1: ( () )
            {
            // InternalKExpressions.g:4966:1: ( () )
            // InternalKExpressions.g:4967:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getReturnAction_3_0()); 
            }
            // InternalKExpressions.g:4968:1: ()
            // InternalKExpressions.g:4970:1: 
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
    // InternalKExpressions.g:4980:1: rule__InterfaceSignalDecl__Group_3__1 : rule__InterfaceSignalDecl__Group_3__1__Impl rule__InterfaceSignalDecl__Group_3__2 ;
    public final void rule__InterfaceSignalDecl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4984:1: ( rule__InterfaceSignalDecl__Group_3__1__Impl rule__InterfaceSignalDecl__Group_3__2 )
            // InternalKExpressions.g:4985:2: rule__InterfaceSignalDecl__Group_3__1__Impl rule__InterfaceSignalDecl__Group_3__2
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
    // InternalKExpressions.g:4992:1: rule__InterfaceSignalDecl__Group_3__1__Impl : ( 'return' ) ;
    public final void rule__InterfaceSignalDecl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4996:1: ( ( 'return' ) )
            // InternalKExpressions.g:4997:1: ( 'return' )
            {
            // InternalKExpressions.g:4997:1: ( 'return' )
            // InternalKExpressions.g:4998:1: 'return'
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
    // InternalKExpressions.g:5011:1: rule__InterfaceSignalDecl__Group_3__2 : rule__InterfaceSignalDecl__Group_3__2__Impl rule__InterfaceSignalDecl__Group_3__3 ;
    public final void rule__InterfaceSignalDecl__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5015:1: ( rule__InterfaceSignalDecl__Group_3__2__Impl rule__InterfaceSignalDecl__Group_3__3 )
            // InternalKExpressions.g:5016:2: rule__InterfaceSignalDecl__Group_3__2__Impl rule__InterfaceSignalDecl__Group_3__3
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
    // InternalKExpressions.g:5023:1: rule__InterfaceSignalDecl__Group_3__2__Impl : ( ( rule__InterfaceSignalDecl__SignalsAssignment_3_2 ) ) ;
    public final void rule__InterfaceSignalDecl__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5027:1: ( ( ( rule__InterfaceSignalDecl__SignalsAssignment_3_2 ) ) )
            // InternalKExpressions.g:5028:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_3_2 ) )
            {
            // InternalKExpressions.g:5028:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_3_2 ) )
            // InternalKExpressions.g:5029:1: ( rule__InterfaceSignalDecl__SignalsAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSignalsAssignment_3_2()); 
            }
            // InternalKExpressions.g:5030:1: ( rule__InterfaceSignalDecl__SignalsAssignment_3_2 )
            // InternalKExpressions.g:5030:2: rule__InterfaceSignalDecl__SignalsAssignment_3_2
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
    // InternalKExpressions.g:5040:1: rule__InterfaceSignalDecl__Group_3__3 : rule__InterfaceSignalDecl__Group_3__3__Impl rule__InterfaceSignalDecl__Group_3__4 ;
    public final void rule__InterfaceSignalDecl__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5044:1: ( rule__InterfaceSignalDecl__Group_3__3__Impl rule__InterfaceSignalDecl__Group_3__4 )
            // InternalKExpressions.g:5045:2: rule__InterfaceSignalDecl__Group_3__3__Impl rule__InterfaceSignalDecl__Group_3__4
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
    // InternalKExpressions.g:5052:1: rule__InterfaceSignalDecl__Group_3__3__Impl : ( ( rule__InterfaceSignalDecl__Group_3_3__0 )* ) ;
    public final void rule__InterfaceSignalDecl__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5056:1: ( ( ( rule__InterfaceSignalDecl__Group_3_3__0 )* ) )
            // InternalKExpressions.g:5057:1: ( ( rule__InterfaceSignalDecl__Group_3_3__0 )* )
            {
            // InternalKExpressions.g:5057:1: ( ( rule__InterfaceSignalDecl__Group_3_3__0 )* )
            // InternalKExpressions.g:5058:1: ( rule__InterfaceSignalDecl__Group_3_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getGroup_3_3()); 
            }
            // InternalKExpressions.g:5059:1: ( rule__InterfaceSignalDecl__Group_3_3__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==47) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalKExpressions.g:5059:2: rule__InterfaceSignalDecl__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    rule__InterfaceSignalDecl__Group_3_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalKExpressions.g:5069:1: rule__InterfaceSignalDecl__Group_3__4 : rule__InterfaceSignalDecl__Group_3__4__Impl ;
    public final void rule__InterfaceSignalDecl__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5073:1: ( rule__InterfaceSignalDecl__Group_3__4__Impl )
            // InternalKExpressions.g:5074:2: rule__InterfaceSignalDecl__Group_3__4__Impl
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
    // InternalKExpressions.g:5080:1: rule__InterfaceSignalDecl__Group_3__4__Impl : ( ';' ) ;
    public final void rule__InterfaceSignalDecl__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5084:1: ( ( ';' ) )
            // InternalKExpressions.g:5085:1: ( ';' )
            {
            // InternalKExpressions.g:5085:1: ( ';' )
            // InternalKExpressions.g:5086:1: ';'
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
    // InternalKExpressions.g:5109:1: rule__InterfaceSignalDecl__Group_3_3__0 : rule__InterfaceSignalDecl__Group_3_3__0__Impl rule__InterfaceSignalDecl__Group_3_3__1 ;
    public final void rule__InterfaceSignalDecl__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5113:1: ( rule__InterfaceSignalDecl__Group_3_3__0__Impl rule__InterfaceSignalDecl__Group_3_3__1 )
            // InternalKExpressions.g:5114:2: rule__InterfaceSignalDecl__Group_3_3__0__Impl rule__InterfaceSignalDecl__Group_3_3__1
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
    // InternalKExpressions.g:5121:1: rule__InterfaceSignalDecl__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__InterfaceSignalDecl__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5125:1: ( ( ',' ) )
            // InternalKExpressions.g:5126:1: ( ',' )
            {
            // InternalKExpressions.g:5126:1: ( ',' )
            // InternalKExpressions.g:5127:1: ','
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
    // InternalKExpressions.g:5140:1: rule__InterfaceSignalDecl__Group_3_3__1 : rule__InterfaceSignalDecl__Group_3_3__1__Impl ;
    public final void rule__InterfaceSignalDecl__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5144:1: ( rule__InterfaceSignalDecl__Group_3_3__1__Impl )
            // InternalKExpressions.g:5145:2: rule__InterfaceSignalDecl__Group_3_3__1__Impl
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
    // InternalKExpressions.g:5151:1: rule__InterfaceSignalDecl__Group_3_3__1__Impl : ( ( rule__InterfaceSignalDecl__SignalsAssignment_3_3_1 ) ) ;
    public final void rule__InterfaceSignalDecl__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5155:1: ( ( ( rule__InterfaceSignalDecl__SignalsAssignment_3_3_1 ) ) )
            // InternalKExpressions.g:5156:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_3_3_1 ) )
            {
            // InternalKExpressions.g:5156:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_3_3_1 ) )
            // InternalKExpressions.g:5157:1: ( rule__InterfaceSignalDecl__SignalsAssignment_3_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSignalsAssignment_3_3_1()); 
            }
            // InternalKExpressions.g:5158:1: ( rule__InterfaceSignalDecl__SignalsAssignment_3_3_1 )
            // InternalKExpressions.g:5158:2: rule__InterfaceSignalDecl__SignalsAssignment_3_3_1
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
    // InternalKExpressions.g:5172:1: rule__ChannelDescription__Group_0__0 : rule__ChannelDescription__Group_0__0__Impl rule__ChannelDescription__Group_0__1 ;
    public final void rule__ChannelDescription__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5176:1: ( rule__ChannelDescription__Group_0__0__Impl rule__ChannelDescription__Group_0__1 )
            // InternalKExpressions.g:5177:2: rule__ChannelDescription__Group_0__0__Impl rule__ChannelDescription__Group_0__1
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
    // InternalKExpressions.g:5184:1: rule__ChannelDescription__Group_0__0__Impl : ( ':' ) ;
    public final void rule__ChannelDescription__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5188:1: ( ( ':' ) )
            // InternalKExpressions.g:5189:1: ( ':' )
            {
            // InternalKExpressions.g:5189:1: ( ':' )
            // InternalKExpressions.g:5190:1: ':'
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
    // InternalKExpressions.g:5203:1: rule__ChannelDescription__Group_0__1 : rule__ChannelDescription__Group_0__1__Impl ;
    public final void rule__ChannelDescription__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5207:1: ( rule__ChannelDescription__Group_0__1__Impl )
            // InternalKExpressions.g:5208:2: rule__ChannelDescription__Group_0__1__Impl
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
    // InternalKExpressions.g:5214:1: rule__ChannelDescription__Group_0__1__Impl : ( ( rule__ChannelDescription__TypeAssignment_0_1 ) ) ;
    public final void rule__ChannelDescription__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5218:1: ( ( ( rule__ChannelDescription__TypeAssignment_0_1 ) ) )
            // InternalKExpressions.g:5219:1: ( ( rule__ChannelDescription__TypeAssignment_0_1 ) )
            {
            // InternalKExpressions.g:5219:1: ( ( rule__ChannelDescription__TypeAssignment_0_1 ) )
            // InternalKExpressions.g:5220:1: ( rule__ChannelDescription__TypeAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChannelDescriptionAccess().getTypeAssignment_0_1()); 
            }
            // InternalKExpressions.g:5221:1: ( rule__ChannelDescription__TypeAssignment_0_1 )
            // InternalKExpressions.g:5221:2: rule__ChannelDescription__TypeAssignment_0_1
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
    // InternalKExpressions.g:5235:1: rule__ChannelDescription__Group_1__0 : rule__ChannelDescription__Group_1__0__Impl rule__ChannelDescription__Group_1__1 ;
    public final void rule__ChannelDescription__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5239:1: ( rule__ChannelDescription__Group_1__0__Impl rule__ChannelDescription__Group_1__1 )
            // InternalKExpressions.g:5240:2: rule__ChannelDescription__Group_1__0__Impl rule__ChannelDescription__Group_1__1
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
    // InternalKExpressions.g:5247:1: rule__ChannelDescription__Group_1__0__Impl : ( '(' ) ;
    public final void rule__ChannelDescription__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5251:1: ( ( '(' ) )
            // InternalKExpressions.g:5252:1: ( '(' )
            {
            // InternalKExpressions.g:5252:1: ( '(' )
            // InternalKExpressions.g:5253:1: '('
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
    // InternalKExpressions.g:5266:1: rule__ChannelDescription__Group_1__1 : rule__ChannelDescription__Group_1__1__Impl rule__ChannelDescription__Group_1__2 ;
    public final void rule__ChannelDescription__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5270:1: ( rule__ChannelDescription__Group_1__1__Impl rule__ChannelDescription__Group_1__2 )
            // InternalKExpressions.g:5271:2: rule__ChannelDescription__Group_1__1__Impl rule__ChannelDescription__Group_1__2
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
    // InternalKExpressions.g:5278:1: rule__ChannelDescription__Group_1__1__Impl : ( ( rule__ChannelDescription__TypeAssignment_1_1 ) ) ;
    public final void rule__ChannelDescription__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5282:1: ( ( ( rule__ChannelDescription__TypeAssignment_1_1 ) ) )
            // InternalKExpressions.g:5283:1: ( ( rule__ChannelDescription__TypeAssignment_1_1 ) )
            {
            // InternalKExpressions.g:5283:1: ( ( rule__ChannelDescription__TypeAssignment_1_1 ) )
            // InternalKExpressions.g:5284:1: ( rule__ChannelDescription__TypeAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChannelDescriptionAccess().getTypeAssignment_1_1()); 
            }
            // InternalKExpressions.g:5285:1: ( rule__ChannelDescription__TypeAssignment_1_1 )
            // InternalKExpressions.g:5285:2: rule__ChannelDescription__TypeAssignment_1_1
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
    // InternalKExpressions.g:5295:1: rule__ChannelDescription__Group_1__2 : rule__ChannelDescription__Group_1__2__Impl ;
    public final void rule__ChannelDescription__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5299:1: ( rule__ChannelDescription__Group_1__2__Impl )
            // InternalKExpressions.g:5300:2: rule__ChannelDescription__Group_1__2__Impl
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
    // InternalKExpressions.g:5306:1: rule__ChannelDescription__Group_1__2__Impl : ( ')' ) ;
    public final void rule__ChannelDescription__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5310:1: ( ( ')' ) )
            // InternalKExpressions.g:5311:1: ( ')' )
            {
            // InternalKExpressions.g:5311:1: ( ')' )
            // InternalKExpressions.g:5312:1: ')'
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
    // InternalKExpressions.g:5331:1: rule__ChannelDescription__Group_2__0 : rule__ChannelDescription__Group_2__0__Impl rule__ChannelDescription__Group_2__1 ;
    public final void rule__ChannelDescription__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5335:1: ( rule__ChannelDescription__Group_2__0__Impl rule__ChannelDescription__Group_2__1 )
            // InternalKExpressions.g:5336:2: rule__ChannelDescription__Group_2__0__Impl rule__ChannelDescription__Group_2__1
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
    // InternalKExpressions.g:5343:1: rule__ChannelDescription__Group_2__0__Impl : ( ':=' ) ;
    public final void rule__ChannelDescription__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5347:1: ( ( ':=' ) )
            // InternalKExpressions.g:5348:1: ( ':=' )
            {
            // InternalKExpressions.g:5348:1: ( ':=' )
            // InternalKExpressions.g:5349:1: ':='
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
    // InternalKExpressions.g:5362:1: rule__ChannelDescription__Group_2__1 : rule__ChannelDescription__Group_2__1__Impl rule__ChannelDescription__Group_2__2 ;
    public final void rule__ChannelDescription__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5366:1: ( rule__ChannelDescription__Group_2__1__Impl rule__ChannelDescription__Group_2__2 )
            // InternalKExpressions.g:5367:2: rule__ChannelDescription__Group_2__1__Impl rule__ChannelDescription__Group_2__2
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
    // InternalKExpressions.g:5374:1: rule__ChannelDescription__Group_2__1__Impl : ( ( rule__ChannelDescription__ExpressionAssignment_2_1 ) ) ;
    public final void rule__ChannelDescription__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5378:1: ( ( ( rule__ChannelDescription__ExpressionAssignment_2_1 ) ) )
            // InternalKExpressions.g:5379:1: ( ( rule__ChannelDescription__ExpressionAssignment_2_1 ) )
            {
            // InternalKExpressions.g:5379:1: ( ( rule__ChannelDescription__ExpressionAssignment_2_1 ) )
            // InternalKExpressions.g:5380:1: ( rule__ChannelDescription__ExpressionAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChannelDescriptionAccess().getExpressionAssignment_2_1()); 
            }
            // InternalKExpressions.g:5381:1: ( rule__ChannelDescription__ExpressionAssignment_2_1 )
            // InternalKExpressions.g:5381:2: rule__ChannelDescription__ExpressionAssignment_2_1
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
    // InternalKExpressions.g:5391:1: rule__ChannelDescription__Group_2__2 : rule__ChannelDescription__Group_2__2__Impl rule__ChannelDescription__Group_2__3 ;
    public final void rule__ChannelDescription__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5395:1: ( rule__ChannelDescription__Group_2__2__Impl rule__ChannelDescription__Group_2__3 )
            // InternalKExpressions.g:5396:2: rule__ChannelDescription__Group_2__2__Impl rule__ChannelDescription__Group_2__3
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
    // InternalKExpressions.g:5403:1: rule__ChannelDescription__Group_2__2__Impl : ( ':' ) ;
    public final void rule__ChannelDescription__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5407:1: ( ( ':' ) )
            // InternalKExpressions.g:5408:1: ( ':' )
            {
            // InternalKExpressions.g:5408:1: ( ':' )
            // InternalKExpressions.g:5409:1: ':'
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
    // InternalKExpressions.g:5422:1: rule__ChannelDescription__Group_2__3 : rule__ChannelDescription__Group_2__3__Impl ;
    public final void rule__ChannelDescription__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5426:1: ( rule__ChannelDescription__Group_2__3__Impl )
            // InternalKExpressions.g:5427:2: rule__ChannelDescription__Group_2__3__Impl
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
    // InternalKExpressions.g:5433:1: rule__ChannelDescription__Group_2__3__Impl : ( ( rule__ChannelDescription__TypeAssignment_2_3 ) ) ;
    public final void rule__ChannelDescription__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5437:1: ( ( ( rule__ChannelDescription__TypeAssignment_2_3 ) ) )
            // InternalKExpressions.g:5438:1: ( ( rule__ChannelDescription__TypeAssignment_2_3 ) )
            {
            // InternalKExpressions.g:5438:1: ( ( rule__ChannelDescription__TypeAssignment_2_3 ) )
            // InternalKExpressions.g:5439:1: ( rule__ChannelDescription__TypeAssignment_2_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChannelDescriptionAccess().getTypeAssignment_2_3()); 
            }
            // InternalKExpressions.g:5440:1: ( rule__ChannelDescription__TypeAssignment_2_3 )
            // InternalKExpressions.g:5440:2: rule__ChannelDescription__TypeAssignment_2_3
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
    // InternalKExpressions.g:5458:1: rule__InterfaceVariableDecl__Group__0 : rule__InterfaceVariableDecl__Group__0__Impl rule__InterfaceVariableDecl__Group__1 ;
    public final void rule__InterfaceVariableDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5462:1: ( rule__InterfaceVariableDecl__Group__0__Impl rule__InterfaceVariableDecl__Group__1 )
            // InternalKExpressions.g:5463:2: rule__InterfaceVariableDecl__Group__0__Impl rule__InterfaceVariableDecl__Group__1
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
    // InternalKExpressions.g:5470:1: rule__InterfaceVariableDecl__Group__0__Impl : ( 'var' ) ;
    public final void rule__InterfaceVariableDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5474:1: ( ( 'var' ) )
            // InternalKExpressions.g:5475:1: ( 'var' )
            {
            // InternalKExpressions.g:5475:1: ( 'var' )
            // InternalKExpressions.g:5476:1: 'var'
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
    // InternalKExpressions.g:5489:1: rule__InterfaceVariableDecl__Group__1 : rule__InterfaceVariableDecl__Group__1__Impl rule__InterfaceVariableDecl__Group__2 ;
    public final void rule__InterfaceVariableDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5493:1: ( rule__InterfaceVariableDecl__Group__1__Impl rule__InterfaceVariableDecl__Group__2 )
            // InternalKExpressions.g:5494:2: rule__InterfaceVariableDecl__Group__1__Impl rule__InterfaceVariableDecl__Group__2
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
    // InternalKExpressions.g:5501:1: rule__InterfaceVariableDecl__Group__1__Impl : ( ( rule__InterfaceVariableDecl__VarDeclsAssignment_1 ) ) ;
    public final void rule__InterfaceVariableDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5505:1: ( ( ( rule__InterfaceVariableDecl__VarDeclsAssignment_1 ) ) )
            // InternalKExpressions.g:5506:1: ( ( rule__InterfaceVariableDecl__VarDeclsAssignment_1 ) )
            {
            // InternalKExpressions.g:5506:1: ( ( rule__InterfaceVariableDecl__VarDeclsAssignment_1 ) )
            // InternalKExpressions.g:5507:1: ( rule__InterfaceVariableDecl__VarDeclsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceVariableDeclAccess().getVarDeclsAssignment_1()); 
            }
            // InternalKExpressions.g:5508:1: ( rule__InterfaceVariableDecl__VarDeclsAssignment_1 )
            // InternalKExpressions.g:5508:2: rule__InterfaceVariableDecl__VarDeclsAssignment_1
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
    // InternalKExpressions.g:5518:1: rule__InterfaceVariableDecl__Group__2 : rule__InterfaceVariableDecl__Group__2__Impl ;
    public final void rule__InterfaceVariableDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5522:1: ( rule__InterfaceVariableDecl__Group__2__Impl )
            // InternalKExpressions.g:5523:2: rule__InterfaceVariableDecl__Group__2__Impl
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
    // InternalKExpressions.g:5529:1: rule__InterfaceVariableDecl__Group__2__Impl : ( ( rule__InterfaceVariableDecl__Group_2__0 )* ) ;
    public final void rule__InterfaceVariableDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5533:1: ( ( ( rule__InterfaceVariableDecl__Group_2__0 )* ) )
            // InternalKExpressions.g:5534:1: ( ( rule__InterfaceVariableDecl__Group_2__0 )* )
            {
            // InternalKExpressions.g:5534:1: ( ( rule__InterfaceVariableDecl__Group_2__0 )* )
            // InternalKExpressions.g:5535:1: ( rule__InterfaceVariableDecl__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceVariableDeclAccess().getGroup_2()); 
            }
            // InternalKExpressions.g:5536:1: ( rule__InterfaceVariableDecl__Group_2__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==47) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalKExpressions.g:5536:2: rule__InterfaceVariableDecl__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    rule__InterfaceVariableDecl__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalKExpressions.g:5552:1: rule__InterfaceVariableDecl__Group_2__0 : rule__InterfaceVariableDecl__Group_2__0__Impl rule__InterfaceVariableDecl__Group_2__1 ;
    public final void rule__InterfaceVariableDecl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5556:1: ( rule__InterfaceVariableDecl__Group_2__0__Impl rule__InterfaceVariableDecl__Group_2__1 )
            // InternalKExpressions.g:5557:2: rule__InterfaceVariableDecl__Group_2__0__Impl rule__InterfaceVariableDecl__Group_2__1
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
    // InternalKExpressions.g:5564:1: rule__InterfaceVariableDecl__Group_2__0__Impl : ( ',' ) ;
    public final void rule__InterfaceVariableDecl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5568:1: ( ( ',' ) )
            // InternalKExpressions.g:5569:1: ( ',' )
            {
            // InternalKExpressions.g:5569:1: ( ',' )
            // InternalKExpressions.g:5570:1: ','
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
    // InternalKExpressions.g:5583:1: rule__InterfaceVariableDecl__Group_2__1 : rule__InterfaceVariableDecl__Group_2__1__Impl ;
    public final void rule__InterfaceVariableDecl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5587:1: ( rule__InterfaceVariableDecl__Group_2__1__Impl )
            // InternalKExpressions.g:5588:2: rule__InterfaceVariableDecl__Group_2__1__Impl
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
    // InternalKExpressions.g:5594:1: rule__InterfaceVariableDecl__Group_2__1__Impl : ( ( rule__InterfaceVariableDecl__VarDeclsAssignment_2_1 ) ) ;
    public final void rule__InterfaceVariableDecl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5598:1: ( ( ( rule__InterfaceVariableDecl__VarDeclsAssignment_2_1 ) ) )
            // InternalKExpressions.g:5599:1: ( ( rule__InterfaceVariableDecl__VarDeclsAssignment_2_1 ) )
            {
            // InternalKExpressions.g:5599:1: ( ( rule__InterfaceVariableDecl__VarDeclsAssignment_2_1 ) )
            // InternalKExpressions.g:5600:1: ( rule__InterfaceVariableDecl__VarDeclsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceVariableDeclAccess().getVarDeclsAssignment_2_1()); 
            }
            // InternalKExpressions.g:5601:1: ( rule__InterfaceVariableDecl__VarDeclsAssignment_2_1 )
            // InternalKExpressions.g:5601:2: rule__InterfaceVariableDecl__VarDeclsAssignment_2_1
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
    // InternalKExpressions.g:5615:1: rule__VariableDecl__Group__0 : rule__VariableDecl__Group__0__Impl rule__VariableDecl__Group__1 ;
    public final void rule__VariableDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5619:1: ( rule__VariableDecl__Group__0__Impl rule__VariableDecl__Group__1 )
            // InternalKExpressions.g:5620:2: rule__VariableDecl__Group__0__Impl rule__VariableDecl__Group__1
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
    // InternalKExpressions.g:5627:1: rule__VariableDecl__Group__0__Impl : ( ( rule__VariableDecl__VariablesAssignment_0 ) ) ;
    public final void rule__VariableDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5631:1: ( ( ( rule__VariableDecl__VariablesAssignment_0 ) ) )
            // InternalKExpressions.g:5632:1: ( ( rule__VariableDecl__VariablesAssignment_0 ) )
            {
            // InternalKExpressions.g:5632:1: ( ( rule__VariableDecl__VariablesAssignment_0 ) )
            // InternalKExpressions.g:5633:1: ( rule__VariableDecl__VariablesAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclAccess().getVariablesAssignment_0()); 
            }
            // InternalKExpressions.g:5634:1: ( rule__VariableDecl__VariablesAssignment_0 )
            // InternalKExpressions.g:5634:2: rule__VariableDecl__VariablesAssignment_0
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
    // InternalKExpressions.g:5644:1: rule__VariableDecl__Group__1 : rule__VariableDecl__Group__1__Impl rule__VariableDecl__Group__2 ;
    public final void rule__VariableDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5648:1: ( rule__VariableDecl__Group__1__Impl rule__VariableDecl__Group__2 )
            // InternalKExpressions.g:5649:2: rule__VariableDecl__Group__1__Impl rule__VariableDecl__Group__2
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
    // InternalKExpressions.g:5656:1: rule__VariableDecl__Group__1__Impl : ( ( rule__VariableDecl__Group_1__0 )* ) ;
    public final void rule__VariableDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5660:1: ( ( ( rule__VariableDecl__Group_1__0 )* ) )
            // InternalKExpressions.g:5661:1: ( ( rule__VariableDecl__Group_1__0 )* )
            {
            // InternalKExpressions.g:5661:1: ( ( rule__VariableDecl__Group_1__0 )* )
            // InternalKExpressions.g:5662:1: ( rule__VariableDecl__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:5663:1: ( rule__VariableDecl__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==47) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalKExpressions.g:5663:2: rule__VariableDecl__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    rule__VariableDecl__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalKExpressions.g:5673:1: rule__VariableDecl__Group__2 : rule__VariableDecl__Group__2__Impl rule__VariableDecl__Group__3 ;
    public final void rule__VariableDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5677:1: ( rule__VariableDecl__Group__2__Impl rule__VariableDecl__Group__3 )
            // InternalKExpressions.g:5678:2: rule__VariableDecl__Group__2__Impl rule__VariableDecl__Group__3
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
    // InternalKExpressions.g:5685:1: rule__VariableDecl__Group__2__Impl : ( ':' ) ;
    public final void rule__VariableDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5689:1: ( ( ':' ) )
            // InternalKExpressions.g:5690:1: ( ':' )
            {
            // InternalKExpressions.g:5690:1: ( ':' )
            // InternalKExpressions.g:5691:1: ':'
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
    // InternalKExpressions.g:5704:1: rule__VariableDecl__Group__3 : rule__VariableDecl__Group__3__Impl ;
    public final void rule__VariableDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5708:1: ( rule__VariableDecl__Group__3__Impl )
            // InternalKExpressions.g:5709:2: rule__VariableDecl__Group__3__Impl
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
    // InternalKExpressions.g:5715:1: rule__VariableDecl__Group__3__Impl : ( ( rule__VariableDecl__TypeAssignment_3 ) ) ;
    public final void rule__VariableDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5719:1: ( ( ( rule__VariableDecl__TypeAssignment_3 ) ) )
            // InternalKExpressions.g:5720:1: ( ( rule__VariableDecl__TypeAssignment_3 ) )
            {
            // InternalKExpressions.g:5720:1: ( ( rule__VariableDecl__TypeAssignment_3 ) )
            // InternalKExpressions.g:5721:1: ( rule__VariableDecl__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclAccess().getTypeAssignment_3()); 
            }
            // InternalKExpressions.g:5722:1: ( rule__VariableDecl__TypeAssignment_3 )
            // InternalKExpressions.g:5722:2: rule__VariableDecl__TypeAssignment_3
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
    // InternalKExpressions.g:5740:1: rule__VariableDecl__Group_1__0 : rule__VariableDecl__Group_1__0__Impl rule__VariableDecl__Group_1__1 ;
    public final void rule__VariableDecl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5744:1: ( rule__VariableDecl__Group_1__0__Impl rule__VariableDecl__Group_1__1 )
            // InternalKExpressions.g:5745:2: rule__VariableDecl__Group_1__0__Impl rule__VariableDecl__Group_1__1
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
    // InternalKExpressions.g:5752:1: rule__VariableDecl__Group_1__0__Impl : ( ',' ) ;
    public final void rule__VariableDecl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5756:1: ( ( ',' ) )
            // InternalKExpressions.g:5757:1: ( ',' )
            {
            // InternalKExpressions.g:5757:1: ( ',' )
            // InternalKExpressions.g:5758:1: ','
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
    // InternalKExpressions.g:5771:1: rule__VariableDecl__Group_1__1 : rule__VariableDecl__Group_1__1__Impl ;
    public final void rule__VariableDecl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5775:1: ( rule__VariableDecl__Group_1__1__Impl )
            // InternalKExpressions.g:5776:2: rule__VariableDecl__Group_1__1__Impl
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
    // InternalKExpressions.g:5782:1: rule__VariableDecl__Group_1__1__Impl : ( ( rule__VariableDecl__VariablesAssignment_1_1 ) ) ;
    public final void rule__VariableDecl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5786:1: ( ( ( rule__VariableDecl__VariablesAssignment_1_1 ) ) )
            // InternalKExpressions.g:5787:1: ( ( rule__VariableDecl__VariablesAssignment_1_1 ) )
            {
            // InternalKExpressions.g:5787:1: ( ( rule__VariableDecl__VariablesAssignment_1_1 ) )
            // InternalKExpressions.g:5788:1: ( rule__VariableDecl__VariablesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclAccess().getVariablesAssignment_1_1()); 
            }
            // InternalKExpressions.g:5789:1: ( rule__VariableDecl__VariablesAssignment_1_1 )
            // InternalKExpressions.g:5789:2: rule__VariableDecl__VariablesAssignment_1_1
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
    // InternalKExpressions.g:5803:1: rule__IVariable__Group__0 : rule__IVariable__Group__0__Impl rule__IVariable__Group__1 ;
    public final void rule__IVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5807:1: ( rule__IVariable__Group__0__Impl rule__IVariable__Group__1 )
            // InternalKExpressions.g:5808:2: rule__IVariable__Group__0__Impl rule__IVariable__Group__1
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
    // InternalKExpressions.g:5815:1: rule__IVariable__Group__0__Impl : ( ( rule__IVariable__NameAssignment_0 ) ) ;
    public final void rule__IVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5819:1: ( ( ( rule__IVariable__NameAssignment_0 ) ) )
            // InternalKExpressions.g:5820:1: ( ( rule__IVariable__NameAssignment_0 ) )
            {
            // InternalKExpressions.g:5820:1: ( ( rule__IVariable__NameAssignment_0 ) )
            // InternalKExpressions.g:5821:1: ( rule__IVariable__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIVariableAccess().getNameAssignment_0()); 
            }
            // InternalKExpressions.g:5822:1: ( rule__IVariable__NameAssignment_0 )
            // InternalKExpressions.g:5822:2: rule__IVariable__NameAssignment_0
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
    // InternalKExpressions.g:5832:1: rule__IVariable__Group__1 : rule__IVariable__Group__1__Impl ;
    public final void rule__IVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5836:1: ( rule__IVariable__Group__1__Impl )
            // InternalKExpressions.g:5837:2: rule__IVariable__Group__1__Impl
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
    // InternalKExpressions.g:5843:1: rule__IVariable__Group__1__Impl : ( ( rule__IVariable__Group_1__0 )? ) ;
    public final void rule__IVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5847:1: ( ( ( rule__IVariable__Group_1__0 )? ) )
            // InternalKExpressions.g:5848:1: ( ( rule__IVariable__Group_1__0 )? )
            {
            // InternalKExpressions.g:5848:1: ( ( rule__IVariable__Group_1__0 )? )
            // InternalKExpressions.g:5849:1: ( rule__IVariable__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIVariableAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:5850:1: ( rule__IVariable__Group_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==52) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalKExpressions.g:5850:2: rule__IVariable__Group_1__0
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
    // InternalKExpressions.g:5864:1: rule__IVariable__Group_1__0 : rule__IVariable__Group_1__0__Impl rule__IVariable__Group_1__1 ;
    public final void rule__IVariable__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5868:1: ( rule__IVariable__Group_1__0__Impl rule__IVariable__Group_1__1 )
            // InternalKExpressions.g:5869:2: rule__IVariable__Group_1__0__Impl rule__IVariable__Group_1__1
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
    // InternalKExpressions.g:5876:1: rule__IVariable__Group_1__0__Impl : ( ':=' ) ;
    public final void rule__IVariable__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5880:1: ( ( ':=' ) )
            // InternalKExpressions.g:5881:1: ( ':=' )
            {
            // InternalKExpressions.g:5881:1: ( ':=' )
            // InternalKExpressions.g:5882:1: ':='
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
    // InternalKExpressions.g:5895:1: rule__IVariable__Group_1__1 : rule__IVariable__Group_1__1__Impl ;
    public final void rule__IVariable__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5899:1: ( rule__IVariable__Group_1__1__Impl )
            // InternalKExpressions.g:5900:2: rule__IVariable__Group_1__1__Impl
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
    // InternalKExpressions.g:5906:1: rule__IVariable__Group_1__1__Impl : ( ( rule__IVariable__ExpressionAssignment_1_1 ) ) ;
    public final void rule__IVariable__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5910:1: ( ( ( rule__IVariable__ExpressionAssignment_1_1 ) ) )
            // InternalKExpressions.g:5911:1: ( ( rule__IVariable__ExpressionAssignment_1_1 ) )
            {
            // InternalKExpressions.g:5911:1: ( ( rule__IVariable__ExpressionAssignment_1_1 ) )
            // InternalKExpressions.g:5912:1: ( rule__IVariable__ExpressionAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIVariableAccess().getExpressionAssignment_1_1()); 
            }
            // InternalKExpressions.g:5913:1: ( rule__IVariable__ExpressionAssignment_1_1 )
            // InternalKExpressions.g:5913:2: rule__IVariable__ExpressionAssignment_1_1
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
    // InternalKExpressions.g:5927:1: rule__TypeIdentifier__Group_2__0 : rule__TypeIdentifier__Group_2__0__Impl rule__TypeIdentifier__Group_2__1 ;
    public final void rule__TypeIdentifier__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5931:1: ( rule__TypeIdentifier__Group_2__0__Impl rule__TypeIdentifier__Group_2__1 )
            // InternalKExpressions.g:5932:2: rule__TypeIdentifier__Group_2__0__Impl rule__TypeIdentifier__Group_2__1
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
    // InternalKExpressions.g:5939:1: rule__TypeIdentifier__Group_2__0__Impl : ( 'combine' ) ;
    public final void rule__TypeIdentifier__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5943:1: ( ( 'combine' ) )
            // InternalKExpressions.g:5944:1: ( 'combine' )
            {
            // InternalKExpressions.g:5944:1: ( 'combine' )
            // InternalKExpressions.g:5945:1: 'combine'
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
    // InternalKExpressions.g:5958:1: rule__TypeIdentifier__Group_2__1 : rule__TypeIdentifier__Group_2__1__Impl rule__TypeIdentifier__Group_2__2 ;
    public final void rule__TypeIdentifier__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5962:1: ( rule__TypeIdentifier__Group_2__1__Impl rule__TypeIdentifier__Group_2__2 )
            // InternalKExpressions.g:5963:2: rule__TypeIdentifier__Group_2__1__Impl rule__TypeIdentifier__Group_2__2
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
    // InternalKExpressions.g:5970:1: rule__TypeIdentifier__Group_2__1__Impl : ( ( rule__TypeIdentifier__Alternatives_2_1 ) ) ;
    public final void rule__TypeIdentifier__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5974:1: ( ( ( rule__TypeIdentifier__Alternatives_2_1 ) ) )
            // InternalKExpressions.g:5975:1: ( ( rule__TypeIdentifier__Alternatives_2_1 ) )
            {
            // InternalKExpressions.g:5975:1: ( ( rule__TypeIdentifier__Alternatives_2_1 ) )
            // InternalKExpressions.g:5976:1: ( rule__TypeIdentifier__Alternatives_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeIdentifierAccess().getAlternatives_2_1()); 
            }
            // InternalKExpressions.g:5977:1: ( rule__TypeIdentifier__Alternatives_2_1 )
            // InternalKExpressions.g:5977:2: rule__TypeIdentifier__Alternatives_2_1
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
    // InternalKExpressions.g:5987:1: rule__TypeIdentifier__Group_2__2 : rule__TypeIdentifier__Group_2__2__Impl rule__TypeIdentifier__Group_2__3 ;
    public final void rule__TypeIdentifier__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5991:1: ( rule__TypeIdentifier__Group_2__2__Impl rule__TypeIdentifier__Group_2__3 )
            // InternalKExpressions.g:5992:2: rule__TypeIdentifier__Group_2__2__Impl rule__TypeIdentifier__Group_2__3
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
    // InternalKExpressions.g:5999:1: rule__TypeIdentifier__Group_2__2__Impl : ( 'with' ) ;
    public final void rule__TypeIdentifier__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6003:1: ( ( 'with' ) )
            // InternalKExpressions.g:6004:1: ( 'with' )
            {
            // InternalKExpressions.g:6004:1: ( 'with' )
            // InternalKExpressions.g:6005:1: 'with'
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
    // InternalKExpressions.g:6018:1: rule__TypeIdentifier__Group_2__3 : rule__TypeIdentifier__Group_2__3__Impl ;
    public final void rule__TypeIdentifier__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6022:1: ( rule__TypeIdentifier__Group_2__3__Impl )
            // InternalKExpressions.g:6023:2: rule__TypeIdentifier__Group_2__3__Impl
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
    // InternalKExpressions.g:6029:1: rule__TypeIdentifier__Group_2__3__Impl : ( ( rule__TypeIdentifier__OperatorAssignment_2_3 ) ) ;
    public final void rule__TypeIdentifier__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6033:1: ( ( ( rule__TypeIdentifier__OperatorAssignment_2_3 ) ) )
            // InternalKExpressions.g:6034:1: ( ( rule__TypeIdentifier__OperatorAssignment_2_3 ) )
            {
            // InternalKExpressions.g:6034:1: ( ( rule__TypeIdentifier__OperatorAssignment_2_3 ) )
            // InternalKExpressions.g:6035:1: ( rule__TypeIdentifier__OperatorAssignment_2_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeIdentifierAccess().getOperatorAssignment_2_3()); 
            }
            // InternalKExpressions.g:6036:1: ( rule__TypeIdentifier__OperatorAssignment_2_3 )
            // InternalKExpressions.g:6036:2: rule__TypeIdentifier__OperatorAssignment_2_3
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
    // InternalKExpressions.g:6054:1: rule__TagAnnotation__Group__0 : rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 ;
    public final void rule__TagAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6058:1: ( rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 )
            // InternalKExpressions.g:6059:2: rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1
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
    // InternalKExpressions.g:6066:1: rule__TagAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TagAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6070:1: ( ( '@' ) )
            // InternalKExpressions.g:6071:1: ( '@' )
            {
            // InternalKExpressions.g:6071:1: ( '@' )
            // InternalKExpressions.g:6072:1: '@'
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
    // InternalKExpressions.g:6085:1: rule__TagAnnotation__Group__1 : rule__TagAnnotation__Group__1__Impl ;
    public final void rule__TagAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6089:1: ( rule__TagAnnotation__Group__1__Impl )
            // InternalKExpressions.g:6090:2: rule__TagAnnotation__Group__1__Impl
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
    // InternalKExpressions.g:6096:1: rule__TagAnnotation__Group__1__Impl : ( ( rule__TagAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TagAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6100:1: ( ( ( rule__TagAnnotation__NameAssignment_1 ) ) )
            // InternalKExpressions.g:6101:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:6101:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            // InternalKExpressions.g:6102:1: ( rule__TagAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:6103:1: ( rule__TagAnnotation__NameAssignment_1 )
            // InternalKExpressions.g:6103:2: rule__TagAnnotation__NameAssignment_1
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
    // InternalKExpressions.g:6117:1: rule__KeyStringValueAnnotation__Group__0 : rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 ;
    public final void rule__KeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6121:1: ( rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 )
            // InternalKExpressions.g:6122:2: rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1
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
    // InternalKExpressions.g:6129:1: rule__KeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6133:1: ( ( '@' ) )
            // InternalKExpressions.g:6134:1: ( '@' )
            {
            // InternalKExpressions.g:6134:1: ( '@' )
            // InternalKExpressions.g:6135:1: '@'
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
    // InternalKExpressions.g:6148:1: rule__KeyStringValueAnnotation__Group__1 : rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 ;
    public final void rule__KeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6152:1: ( rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 )
            // InternalKExpressions.g:6153:2: rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2
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
    // InternalKExpressions.g:6160:1: rule__KeyStringValueAnnotation__Group__1__Impl : ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6164:1: ( ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKExpressions.g:6165:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:6165:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKExpressions.g:6166:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:6167:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            // InternalKExpressions.g:6167:2: rule__KeyStringValueAnnotation__NameAssignment_1
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
    // InternalKExpressions.g:6177:1: rule__KeyStringValueAnnotation__Group__2 : rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 ;
    public final void rule__KeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6181:1: ( rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 )
            // InternalKExpressions.g:6182:2: rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3
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
    // InternalKExpressions.g:6189:1: rule__KeyStringValueAnnotation__Group__2__Impl : ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6193:1: ( ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalKExpressions.g:6194:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalKExpressions.g:6194:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalKExpressions.g:6195:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            }
            // InternalKExpressions.g:6196:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalKExpressions.g:6196:2: rule__KeyStringValueAnnotation__ValuesAssignment_2
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
    // InternalKExpressions.g:6206:1: rule__KeyStringValueAnnotation__Group__3 : rule__KeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__KeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6210:1: ( rule__KeyStringValueAnnotation__Group__3__Impl )
            // InternalKExpressions.g:6211:2: rule__KeyStringValueAnnotation__Group__3__Impl
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
    // InternalKExpressions.g:6217:1: rule__KeyStringValueAnnotation__Group__3__Impl : ( ( rule__KeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__KeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6221:1: ( ( ( rule__KeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalKExpressions.g:6222:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalKExpressions.g:6222:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )* )
            // InternalKExpressions.g:6223:1: ( rule__KeyStringValueAnnotation__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // InternalKExpressions.g:6224:1: ( rule__KeyStringValueAnnotation__Group_3__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==47) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalKExpressions.g:6224:2: rule__KeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    rule__KeyStringValueAnnotation__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalKExpressions.g:6242:1: rule__KeyStringValueAnnotation__Group_3__0 : rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 ;
    public final void rule__KeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6246:1: ( rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 )
            // InternalKExpressions.g:6247:2: rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1
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
    // InternalKExpressions.g:6254:1: rule__KeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6258:1: ( ( ',' ) )
            // InternalKExpressions.g:6259:1: ( ',' )
            {
            // InternalKExpressions.g:6259:1: ( ',' )
            // InternalKExpressions.g:6260:1: ','
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
    // InternalKExpressions.g:6273:1: rule__KeyStringValueAnnotation__Group_3__1 : rule__KeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__KeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6277:1: ( rule__KeyStringValueAnnotation__Group_3__1__Impl )
            // InternalKExpressions.g:6278:2: rule__KeyStringValueAnnotation__Group_3__1__Impl
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
    // InternalKExpressions.g:6284:1: rule__KeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6288:1: ( ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalKExpressions.g:6289:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalKExpressions.g:6289:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalKExpressions.g:6290:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            }
            // InternalKExpressions.g:6291:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalKExpressions.g:6291:2: rule__KeyStringValueAnnotation__ValuesAssignment_3_1
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
    // InternalKExpressions.g:6305:1: rule__TypedKeyStringValueAnnotation__Group__0 : rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6309:1: ( rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 )
            // InternalKExpressions.g:6310:2: rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1
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
    // InternalKExpressions.g:6317:1: rule__TypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6321:1: ( ( '@' ) )
            // InternalKExpressions.g:6322:1: ( '@' )
            {
            // InternalKExpressions.g:6322:1: ( '@' )
            // InternalKExpressions.g:6323:1: '@'
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
    // InternalKExpressions.g:6336:1: rule__TypedKeyStringValueAnnotation__Group__1 : rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6340:1: ( rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 )
            // InternalKExpressions.g:6341:2: rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2
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
    // InternalKExpressions.g:6348:1: rule__TypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6352:1: ( ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKExpressions.g:6353:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:6353:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKExpressions.g:6354:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:6355:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKExpressions.g:6355:2: rule__TypedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKExpressions.g:6365:1: rule__TypedKeyStringValueAnnotation__Group__2 : rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6369:1: ( rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 )
            // InternalKExpressions.g:6370:2: rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3
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
    // InternalKExpressions.g:6377:1: rule__TypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6381:1: ( ( '[' ) )
            // InternalKExpressions.g:6382:1: ( '[' )
            {
            // InternalKExpressions.g:6382:1: ( '[' )
            // InternalKExpressions.g:6383:1: '['
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
    // InternalKExpressions.g:6396:1: rule__TypedKeyStringValueAnnotation__Group__3 : rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6400:1: ( rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 )
            // InternalKExpressions.g:6401:2: rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4
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
    // InternalKExpressions.g:6408:1: rule__TypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6412:1: ( ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalKExpressions.g:6413:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalKExpressions.g:6413:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalKExpressions.g:6414:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // InternalKExpressions.g:6415:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalKExpressions.g:6415:2: rule__TypedKeyStringValueAnnotation__TypeAssignment_3
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
    // InternalKExpressions.g:6425:1: rule__TypedKeyStringValueAnnotation__Group__4 : rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6429:1: ( rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 )
            // InternalKExpressions.g:6430:2: rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5
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
    // InternalKExpressions.g:6437:1: rule__TypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6441:1: ( ( ']' ) )
            // InternalKExpressions.g:6442:1: ( ']' )
            {
            // InternalKExpressions.g:6442:1: ( ']' )
            // InternalKExpressions.g:6443:1: ']'
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
    // InternalKExpressions.g:6456:1: rule__TypedKeyStringValueAnnotation__Group__5 : rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6460:1: ( rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 )
            // InternalKExpressions.g:6461:2: rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6
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
    // InternalKExpressions.g:6468:1: rule__TypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6472:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalKExpressions.g:6473:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalKExpressions.g:6473:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalKExpressions.g:6474:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            }
            // InternalKExpressions.g:6475:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalKExpressions.g:6475:2: rule__TypedKeyStringValueAnnotation__ValuesAssignment_5
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
    // InternalKExpressions.g:6485:1: rule__TypedKeyStringValueAnnotation__Group__6 : rule__TypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6489:1: ( rule__TypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalKExpressions.g:6490:2: rule__TypedKeyStringValueAnnotation__Group__6__Impl
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
    // InternalKExpressions.g:6496:1: rule__TypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6500:1: ( ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalKExpressions.g:6501:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalKExpressions.g:6501:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalKExpressions.g:6502:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // InternalKExpressions.g:6503:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==47) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalKExpressions.g:6503:2: rule__TypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    rule__TypedKeyStringValueAnnotation__Group_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalKExpressions.g:6527:1: rule__TypedKeyStringValueAnnotation__Group_6__0 : rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6531:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 )
            // InternalKExpressions.g:6532:2: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1
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
    // InternalKExpressions.g:6539:1: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6543:1: ( ( ',' ) )
            // InternalKExpressions.g:6544:1: ( ',' )
            {
            // InternalKExpressions.g:6544:1: ( ',' )
            // InternalKExpressions.g:6545:1: ','
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
    // InternalKExpressions.g:6558:1: rule__TypedKeyStringValueAnnotation__Group_6__1 : rule__TypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6562:1: ( rule__TypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalKExpressions.g:6563:2: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl
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
    // InternalKExpressions.g:6569:1: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6573:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalKExpressions.g:6574:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalKExpressions.g:6574:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalKExpressions.g:6575:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            }
            // InternalKExpressions.g:6576:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalKExpressions.g:6576:2: rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1
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
    // InternalKExpressions.g:6590:1: rule__QuotedKeyStringValueAnnotation__Group__0 : rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6594:1: ( rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1 )
            // InternalKExpressions.g:6595:2: rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1
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
    // InternalKExpressions.g:6602:1: rule__QuotedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6606:1: ( ( '@' ) )
            // InternalKExpressions.g:6607:1: ( '@' )
            {
            // InternalKExpressions.g:6607:1: ( '@' )
            // InternalKExpressions.g:6608:1: '@'
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
    // InternalKExpressions.g:6621:1: rule__QuotedKeyStringValueAnnotation__Group__1 : rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6625:1: ( rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2 )
            // InternalKExpressions.g:6626:2: rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2
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
    // InternalKExpressions.g:6633:1: rule__QuotedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6637:1: ( ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKExpressions.g:6638:1: ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:6638:1: ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKExpressions.g:6639:1: ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:6640:1: ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKExpressions.g:6640:2: rule__QuotedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKExpressions.g:6650:1: rule__QuotedKeyStringValueAnnotation__Group__2 : rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6654:1: ( rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3 )
            // InternalKExpressions.g:6655:2: rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3
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
    // InternalKExpressions.g:6662:1: rule__QuotedKeyStringValueAnnotation__Group__2__Impl : ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6666:1: ( ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalKExpressions.g:6667:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalKExpressions.g:6667:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalKExpressions.g:6668:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            }
            // InternalKExpressions.g:6669:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalKExpressions.g:6669:2: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2
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
    // InternalKExpressions.g:6679:1: rule__QuotedKeyStringValueAnnotation__Group__3 : rule__QuotedKeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6683:1: ( rule__QuotedKeyStringValueAnnotation__Group__3__Impl )
            // InternalKExpressions.g:6684:2: rule__QuotedKeyStringValueAnnotation__Group__3__Impl
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
    // InternalKExpressions.g:6690:1: rule__QuotedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6694:1: ( ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalKExpressions.g:6695:1: ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalKExpressions.g:6695:1: ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* )
            // InternalKExpressions.g:6696:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // InternalKExpressions.g:6697:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==47) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalKExpressions.g:6697:2: rule__QuotedKeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    rule__QuotedKeyStringValueAnnotation__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalKExpressions.g:6715:1: rule__QuotedKeyStringValueAnnotation__Group_3__0 : rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6719:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1 )
            // InternalKExpressions.g:6720:2: rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1
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
    // InternalKExpressions.g:6727:1: rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6731:1: ( ( ',' ) )
            // InternalKExpressions.g:6732:1: ( ',' )
            {
            // InternalKExpressions.g:6732:1: ( ',' )
            // InternalKExpressions.g:6733:1: ','
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
    // InternalKExpressions.g:6746:1: rule__QuotedKeyStringValueAnnotation__Group_3__1 : rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6750:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl )
            // InternalKExpressions.g:6751:2: rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl
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
    // InternalKExpressions.g:6757:1: rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6761:1: ( ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalKExpressions.g:6762:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalKExpressions.g:6762:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalKExpressions.g:6763:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            }
            // InternalKExpressions.g:6764:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalKExpressions.g:6764:2: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1
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
    // InternalKExpressions.g:6778:1: rule__QuotedTypedKeyStringValueAnnotation__Group__0 : rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6782:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1 )
            // InternalKExpressions.g:6783:2: rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1
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
    // InternalKExpressions.g:6790:1: rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6794:1: ( ( '@' ) )
            // InternalKExpressions.g:6795:1: ( '@' )
            {
            // InternalKExpressions.g:6795:1: ( '@' )
            // InternalKExpressions.g:6796:1: '@'
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
    // InternalKExpressions.g:6809:1: rule__QuotedTypedKeyStringValueAnnotation__Group__1 : rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6813:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2 )
            // InternalKExpressions.g:6814:2: rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2
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
    // InternalKExpressions.g:6821:1: rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6825:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKExpressions.g:6826:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:6826:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKExpressions.g:6827:1: ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:6828:1: ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKExpressions.g:6828:2: rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKExpressions.g:6838:1: rule__QuotedTypedKeyStringValueAnnotation__Group__2 : rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6842:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3 )
            // InternalKExpressions.g:6843:2: rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3
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
    // InternalKExpressions.g:6850:1: rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6854:1: ( ( '[' ) )
            // InternalKExpressions.g:6855:1: ( '[' )
            {
            // InternalKExpressions.g:6855:1: ( '[' )
            // InternalKExpressions.g:6856:1: '['
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
    // InternalKExpressions.g:6869:1: rule__QuotedTypedKeyStringValueAnnotation__Group__3 : rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6873:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4 )
            // InternalKExpressions.g:6874:2: rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4
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
    // InternalKExpressions.g:6881:1: rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6885:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalKExpressions.g:6886:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalKExpressions.g:6886:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalKExpressions.g:6887:1: ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // InternalKExpressions.g:6888:1: ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalKExpressions.g:6888:2: rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3
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
    // InternalKExpressions.g:6898:1: rule__QuotedTypedKeyStringValueAnnotation__Group__4 : rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6902:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5 )
            // InternalKExpressions.g:6903:2: rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5
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
    // InternalKExpressions.g:6910:1: rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6914:1: ( ( ']' ) )
            // InternalKExpressions.g:6915:1: ( ']' )
            {
            // InternalKExpressions.g:6915:1: ( ']' )
            // InternalKExpressions.g:6916:1: ']'
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
    // InternalKExpressions.g:6929:1: rule__QuotedTypedKeyStringValueAnnotation__Group__5 : rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6933:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6 )
            // InternalKExpressions.g:6934:2: rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6
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
    // InternalKExpressions.g:6941:1: rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6945:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalKExpressions.g:6946:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalKExpressions.g:6946:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalKExpressions.g:6947:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            }
            // InternalKExpressions.g:6948:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalKExpressions.g:6948:2: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5
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
    // InternalKExpressions.g:6958:1: rule__QuotedTypedKeyStringValueAnnotation__Group__6 : rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6962:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalKExpressions.g:6963:2: rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl
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
    // InternalKExpressions.g:6969:1: rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6973:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalKExpressions.g:6974:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalKExpressions.g:6974:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalKExpressions.g:6975:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // InternalKExpressions.g:6976:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==47) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalKExpressions.g:6976:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    rule__QuotedTypedKeyStringValueAnnotation__Group_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalKExpressions.g:7000:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 : rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7004:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 )
            // InternalKExpressions.g:7005:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1
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
    // InternalKExpressions.g:7012:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7016:1: ( ( ',' ) )
            // InternalKExpressions.g:7017:1: ( ',' )
            {
            // InternalKExpressions.g:7017:1: ( ',' )
            // InternalKExpressions.g:7018:1: ','
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
    // InternalKExpressions.g:7031:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 : rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7035:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalKExpressions.g:7036:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl
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
    // InternalKExpressions.g:7042:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7046:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalKExpressions.g:7047:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalKExpressions.g:7047:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalKExpressions.g:7048:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            }
            // InternalKExpressions.g:7049:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalKExpressions.g:7049:2: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1
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
    // InternalKExpressions.g:7063:1: rule__KeyBooleanValueAnnotation__Group__0 : rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1 ;
    public final void rule__KeyBooleanValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7067:1: ( rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1 )
            // InternalKExpressions.g:7068:2: rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1
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
    // InternalKExpressions.g:7075:1: rule__KeyBooleanValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7079:1: ( ( '@' ) )
            // InternalKExpressions.g:7080:1: ( '@' )
            {
            // InternalKExpressions.g:7080:1: ( '@' )
            // InternalKExpressions.g:7081:1: '@'
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
    // InternalKExpressions.g:7094:1: rule__KeyBooleanValueAnnotation__Group__1 : rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2 ;
    public final void rule__KeyBooleanValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7098:1: ( rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2 )
            // InternalKExpressions.g:7099:2: rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2
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
    // InternalKExpressions.g:7106:1: rule__KeyBooleanValueAnnotation__Group__1__Impl : ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7110:1: ( ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) ) )
            // InternalKExpressions.g:7111:1: ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:7111:1: ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) )
            // InternalKExpressions.g:7112:1: ( rule__KeyBooleanValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:7113:1: ( rule__KeyBooleanValueAnnotation__NameAssignment_1 )
            // InternalKExpressions.g:7113:2: rule__KeyBooleanValueAnnotation__NameAssignment_1
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
    // InternalKExpressions.g:7123:1: rule__KeyBooleanValueAnnotation__Group__2 : rule__KeyBooleanValueAnnotation__Group__2__Impl ;
    public final void rule__KeyBooleanValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7127:1: ( rule__KeyBooleanValueAnnotation__Group__2__Impl )
            // InternalKExpressions.g:7128:2: rule__KeyBooleanValueAnnotation__Group__2__Impl
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
    // InternalKExpressions.g:7134:1: rule__KeyBooleanValueAnnotation__Group__2__Impl : ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7138:1: ( ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) ) )
            // InternalKExpressions.g:7139:1: ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) )
            {
            // InternalKExpressions.g:7139:1: ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) )
            // InternalKExpressions.g:7140:1: ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getValueAssignment_2()); 
            }
            // InternalKExpressions.g:7141:1: ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 )
            // InternalKExpressions.g:7141:2: rule__KeyBooleanValueAnnotation__ValueAssignment_2
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
    // InternalKExpressions.g:7157:1: rule__KeyIntValueAnnotation__Group__0 : rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1 ;
    public final void rule__KeyIntValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7161:1: ( rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1 )
            // InternalKExpressions.g:7162:2: rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1
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
    // InternalKExpressions.g:7169:1: rule__KeyIntValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyIntValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7173:1: ( ( '@' ) )
            // InternalKExpressions.g:7174:1: ( '@' )
            {
            // InternalKExpressions.g:7174:1: ( '@' )
            // InternalKExpressions.g:7175:1: '@'
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
    // InternalKExpressions.g:7188:1: rule__KeyIntValueAnnotation__Group__1 : rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2 ;
    public final void rule__KeyIntValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7192:1: ( rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2 )
            // InternalKExpressions.g:7193:2: rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2
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
    // InternalKExpressions.g:7200:1: rule__KeyIntValueAnnotation__Group__1__Impl : ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyIntValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7204:1: ( ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) ) )
            // InternalKExpressions.g:7205:1: ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:7205:1: ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) )
            // InternalKExpressions.g:7206:1: ( rule__KeyIntValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:7207:1: ( rule__KeyIntValueAnnotation__NameAssignment_1 )
            // InternalKExpressions.g:7207:2: rule__KeyIntValueAnnotation__NameAssignment_1
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
    // InternalKExpressions.g:7217:1: rule__KeyIntValueAnnotation__Group__2 : rule__KeyIntValueAnnotation__Group__2__Impl ;
    public final void rule__KeyIntValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7221:1: ( rule__KeyIntValueAnnotation__Group__2__Impl )
            // InternalKExpressions.g:7222:2: rule__KeyIntValueAnnotation__Group__2__Impl
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
    // InternalKExpressions.g:7228:1: rule__KeyIntValueAnnotation__Group__2__Impl : ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyIntValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7232:1: ( ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) ) )
            // InternalKExpressions.g:7233:1: ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) )
            {
            // InternalKExpressions.g:7233:1: ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) )
            // InternalKExpressions.g:7234:1: ( rule__KeyIntValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getValueAssignment_2()); 
            }
            // InternalKExpressions.g:7235:1: ( rule__KeyIntValueAnnotation__ValueAssignment_2 )
            // InternalKExpressions.g:7235:2: rule__KeyIntValueAnnotation__ValueAssignment_2
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
    // InternalKExpressions.g:7251:1: rule__KeyFloatValueAnnotation__Group__0 : rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1 ;
    public final void rule__KeyFloatValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7255:1: ( rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1 )
            // InternalKExpressions.g:7256:2: rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1
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
    // InternalKExpressions.g:7263:1: rule__KeyFloatValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyFloatValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7267:1: ( ( '@' ) )
            // InternalKExpressions.g:7268:1: ( '@' )
            {
            // InternalKExpressions.g:7268:1: ( '@' )
            // InternalKExpressions.g:7269:1: '@'
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
    // InternalKExpressions.g:7282:1: rule__KeyFloatValueAnnotation__Group__1 : rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2 ;
    public final void rule__KeyFloatValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7286:1: ( rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2 )
            // InternalKExpressions.g:7287:2: rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2
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
    // InternalKExpressions.g:7294:1: rule__KeyFloatValueAnnotation__Group__1__Impl : ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyFloatValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7298:1: ( ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) ) )
            // InternalKExpressions.g:7299:1: ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:7299:1: ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) )
            // InternalKExpressions.g:7300:1: ( rule__KeyFloatValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:7301:1: ( rule__KeyFloatValueAnnotation__NameAssignment_1 )
            // InternalKExpressions.g:7301:2: rule__KeyFloatValueAnnotation__NameAssignment_1
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
    // InternalKExpressions.g:7311:1: rule__KeyFloatValueAnnotation__Group__2 : rule__KeyFloatValueAnnotation__Group__2__Impl ;
    public final void rule__KeyFloatValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7315:1: ( rule__KeyFloatValueAnnotation__Group__2__Impl )
            // InternalKExpressions.g:7316:2: rule__KeyFloatValueAnnotation__Group__2__Impl
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
    // InternalKExpressions.g:7322:1: rule__KeyFloatValueAnnotation__Group__2__Impl : ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyFloatValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7326:1: ( ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) ) )
            // InternalKExpressions.g:7327:1: ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) )
            {
            // InternalKExpressions.g:7327:1: ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) )
            // InternalKExpressions.g:7328:1: ( rule__KeyFloatValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getValueAssignment_2()); 
            }
            // InternalKExpressions.g:7329:1: ( rule__KeyFloatValueAnnotation__ValueAssignment_2 )
            // InternalKExpressions.g:7329:2: rule__KeyFloatValueAnnotation__ValueAssignment_2
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
    // InternalKExpressions.g:7345:1: rule__ExtendedID__Group__0 : rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 ;
    public final void rule__ExtendedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7349:1: ( rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 )
            // InternalKExpressions.g:7350:2: rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1
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
    // InternalKExpressions.g:7357:1: rule__ExtendedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7361:1: ( ( RULE_ID ) )
            // InternalKExpressions.g:7362:1: ( RULE_ID )
            {
            // InternalKExpressions.g:7362:1: ( RULE_ID )
            // InternalKExpressions.g:7363:1: RULE_ID
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
    // InternalKExpressions.g:7374:1: rule__ExtendedID__Group__1 : rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2 ;
    public final void rule__ExtendedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7378:1: ( rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2 )
            // InternalKExpressions.g:7379:2: rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2
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
    // InternalKExpressions.g:7386:1: rule__ExtendedID__Group__1__Impl : ( ( rule__ExtendedID__Group_1__0 )* ) ;
    public final void rule__ExtendedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7390:1: ( ( ( rule__ExtendedID__Group_1__0 )* ) )
            // InternalKExpressions.g:7391:1: ( ( rule__ExtendedID__Group_1__0 )* )
            {
            // InternalKExpressions.g:7391:1: ( ( rule__ExtendedID__Group_1__0 )* )
            // InternalKExpressions.g:7392:1: ( rule__ExtendedID__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:7393:1: ( rule__ExtendedID__Group_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==59) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalKExpressions.g:7393:2: rule__ExtendedID__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_49);
            	    rule__ExtendedID__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalKExpressions.g:7403:1: rule__ExtendedID__Group__2 : rule__ExtendedID__Group__2__Impl ;
    public final void rule__ExtendedID__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7407:1: ( rule__ExtendedID__Group__2__Impl )
            // InternalKExpressions.g:7408:2: rule__ExtendedID__Group__2__Impl
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
    // InternalKExpressions.g:7414:1: rule__ExtendedID__Group__2__Impl : ( ( rule__ExtendedID__Group_2__0 )? ) ;
    public final void rule__ExtendedID__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7418:1: ( ( ( rule__ExtendedID__Group_2__0 )? ) )
            // InternalKExpressions.g:7419:1: ( ( rule__ExtendedID__Group_2__0 )? )
            {
            // InternalKExpressions.g:7419:1: ( ( rule__ExtendedID__Group_2__0 )? )
            // InternalKExpressions.g:7420:1: ( rule__ExtendedID__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup_2()); 
            }
            // InternalKExpressions.g:7421:1: ( rule__ExtendedID__Group_2__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==60) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalKExpressions.g:7421:2: rule__ExtendedID__Group_2__0
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
    // InternalKExpressions.g:7437:1: rule__ExtendedID__Group_1__0 : rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 ;
    public final void rule__ExtendedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7441:1: ( rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 )
            // InternalKExpressions.g:7442:2: rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1
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
    // InternalKExpressions.g:7449:1: rule__ExtendedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__ExtendedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7453:1: ( ( '.' ) )
            // InternalKExpressions.g:7454:1: ( '.' )
            {
            // InternalKExpressions.g:7454:1: ( '.' )
            // InternalKExpressions.g:7455:1: '.'
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
    // InternalKExpressions.g:7468:1: rule__ExtendedID__Group_1__1 : rule__ExtendedID__Group_1__1__Impl ;
    public final void rule__ExtendedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7472:1: ( rule__ExtendedID__Group_1__1__Impl )
            // InternalKExpressions.g:7473:2: rule__ExtendedID__Group_1__1__Impl
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
    // InternalKExpressions.g:7479:1: rule__ExtendedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7483:1: ( ( RULE_ID ) )
            // InternalKExpressions.g:7484:1: ( RULE_ID )
            {
            // InternalKExpressions.g:7484:1: ( RULE_ID )
            // InternalKExpressions.g:7485:1: RULE_ID
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
    // InternalKExpressions.g:7500:1: rule__ExtendedID__Group_2__0 : rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1 ;
    public final void rule__ExtendedID__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7504:1: ( rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1 )
            // InternalKExpressions.g:7505:2: rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1
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
    // InternalKExpressions.g:7512:1: rule__ExtendedID__Group_2__0__Impl : ( '#' ) ;
    public final void rule__ExtendedID__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7516:1: ( ( '#' ) )
            // InternalKExpressions.g:7517:1: ( '#' )
            {
            // InternalKExpressions.g:7517:1: ( '#' )
            // InternalKExpressions.g:7518:1: '#'
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
    // InternalKExpressions.g:7531:1: rule__ExtendedID__Group_2__1 : rule__ExtendedID__Group_2__1__Impl ;
    public final void rule__ExtendedID__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7535:1: ( rule__ExtendedID__Group_2__1__Impl )
            // InternalKExpressions.g:7536:2: rule__ExtendedID__Group_2__1__Impl
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
    // InternalKExpressions.g:7542:1: rule__ExtendedID__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__ExtendedID__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7546:1: ( ( RULE_INT ) )
            // InternalKExpressions.g:7547:1: ( RULE_INT )
            {
            // InternalKExpressions.g:7547:1: ( RULE_INT )
            // InternalKExpressions.g:7548:1: RULE_INT
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
    // InternalKExpressions.g:7563:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7567:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // InternalKExpressions.g:7568:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
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
    // InternalKExpressions.g:7575:1: rule__Integer__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7579:1: ( ( ( '-' )? ) )
            // InternalKExpressions.g:7580:1: ( ( '-' )? )
            {
            // InternalKExpressions.g:7580:1: ( ( '-' )? )
            // InternalKExpressions.g:7581:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalKExpressions.g:7582:1: ( '-' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==21) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalKExpressions.g:7583:2: '-'
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
    // InternalKExpressions.g:7594:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7598:1: ( rule__Integer__Group__1__Impl )
            // InternalKExpressions.g:7599:2: rule__Integer__Group__1__Impl
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
    // InternalKExpressions.g:7605:1: rule__Integer__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7609:1: ( ( RULE_INT ) )
            // InternalKExpressions.g:7610:1: ( RULE_INT )
            {
            // InternalKExpressions.g:7610:1: ( RULE_INT )
            // InternalKExpressions.g:7611:1: RULE_INT
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
    // InternalKExpressions.g:7626:1: rule__Floateger__Group__0 : rule__Floateger__Group__0__Impl rule__Floateger__Group__1 ;
    public final void rule__Floateger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7630:1: ( rule__Floateger__Group__0__Impl rule__Floateger__Group__1 )
            // InternalKExpressions.g:7631:2: rule__Floateger__Group__0__Impl rule__Floateger__Group__1
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
    // InternalKExpressions.g:7638:1: rule__Floateger__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Floateger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7642:1: ( ( ( '-' )? ) )
            // InternalKExpressions.g:7643:1: ( ( '-' )? )
            {
            // InternalKExpressions.g:7643:1: ( ( '-' )? )
            // InternalKExpressions.g:7644:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloategerAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalKExpressions.g:7645:1: ( '-' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==21) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalKExpressions.g:7646:2: '-'
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
    // InternalKExpressions.g:7657:1: rule__Floateger__Group__1 : rule__Floateger__Group__1__Impl ;
    public final void rule__Floateger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7661:1: ( rule__Floateger__Group__1__Impl )
            // InternalKExpressions.g:7662:2: rule__Floateger__Group__1__Impl
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
    // InternalKExpressions.g:7668:1: rule__Floateger__Group__1__Impl : ( RULE_FLOAT ) ;
    public final void rule__Floateger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7672:1: ( ( RULE_FLOAT ) )
            // InternalKExpressions.g:7673:1: ( RULE_FLOAT )
            {
            // InternalKExpressions.g:7673:1: ( RULE_FLOAT )
            // InternalKExpressions.g:7674:1: RULE_FLOAT
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
    // InternalKExpressions.g:7690:1: rule__OrExpression__OperatorAssignment_1_1 : ( ruleOrOperator ) ;
    public final void rule__OrExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7694:1: ( ( ruleOrOperator ) )
            // InternalKExpressions.g:7695:1: ( ruleOrOperator )
            {
            // InternalKExpressions.g:7695:1: ( ruleOrOperator )
            // InternalKExpressions.g:7696:1: ruleOrOperator
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
    // InternalKExpressions.g:7705:1: rule__OrExpression__SubExpressionsAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7709:1: ( ( ruleAndExpression ) )
            // InternalKExpressions.g:7710:1: ( ruleAndExpression )
            {
            // InternalKExpressions.g:7710:1: ( ruleAndExpression )
            // InternalKExpressions.g:7711:1: ruleAndExpression
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
    // InternalKExpressions.g:7720:1: rule__AndExpression__OperatorAssignment_1_1 : ( ruleAndOperator ) ;
    public final void rule__AndExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7724:1: ( ( ruleAndOperator ) )
            // InternalKExpressions.g:7725:1: ( ruleAndOperator )
            {
            // InternalKExpressions.g:7725:1: ( ruleAndOperator )
            // InternalKExpressions.g:7726:1: ruleAndOperator
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
    // InternalKExpressions.g:7735:1: rule__AndExpression__SubExpressionsAssignment_1_2 : ( ruleCompareOperation ) ;
    public final void rule__AndExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7739:1: ( ( ruleCompareOperation ) )
            // InternalKExpressions.g:7740:1: ( ruleCompareOperation )
            {
            // InternalKExpressions.g:7740:1: ( ruleCompareOperation )
            // InternalKExpressions.g:7741:1: ruleCompareOperation
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
    // InternalKExpressions.g:7750:1: rule__CompareOperation__OperatorAssignment_0_1_1 : ( ruleCompareOperator ) ;
    public final void rule__CompareOperation__OperatorAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7754:1: ( ( ruleCompareOperator ) )
            // InternalKExpressions.g:7755:1: ( ruleCompareOperator )
            {
            // InternalKExpressions.g:7755:1: ( ruleCompareOperator )
            // InternalKExpressions.g:7756:1: ruleCompareOperator
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
    // InternalKExpressions.g:7765:1: rule__CompareOperation__SubExpressionsAssignment_0_1_2 : ( ruleNotOrValuedExpression ) ;
    public final void rule__CompareOperation__SubExpressionsAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7769:1: ( ( ruleNotOrValuedExpression ) )
            // InternalKExpressions.g:7770:1: ( ruleNotOrValuedExpression )
            {
            // InternalKExpressions.g:7770:1: ( ruleNotOrValuedExpression )
            // InternalKExpressions.g:7771:1: ruleNotOrValuedExpression
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
    // InternalKExpressions.g:7780:1: rule__NotExpression__OperatorAssignment_0_1 : ( ruleNotOperator ) ;
    public final void rule__NotExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7784:1: ( ( ruleNotOperator ) )
            // InternalKExpressions.g:7785:1: ( ruleNotOperator )
            {
            // InternalKExpressions.g:7785:1: ( ruleNotOperator )
            // InternalKExpressions.g:7786:1: ruleNotOperator
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
    // InternalKExpressions.g:7795:1: rule__NotExpression__SubExpressionsAssignment_0_2 : ( ruleNotExpression ) ;
    public final void rule__NotExpression__SubExpressionsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7799:1: ( ( ruleNotExpression ) )
            // InternalKExpressions.g:7800:1: ( ruleNotExpression )
            {
            // InternalKExpressions.g:7800:1: ( ruleNotExpression )
            // InternalKExpressions.g:7801:1: ruleNotExpression
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
    // InternalKExpressions.g:7810:1: rule__AddExpression__OperatorAssignment_1_1 : ( ruleAddOperator ) ;
    public final void rule__AddExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7814:1: ( ( ruleAddOperator ) )
            // InternalKExpressions.g:7815:1: ( ruleAddOperator )
            {
            // InternalKExpressions.g:7815:1: ( ruleAddOperator )
            // InternalKExpressions.g:7816:1: ruleAddOperator
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
    // InternalKExpressions.g:7825:1: rule__AddExpression__SubExpressionsAssignment_1_2 : ( ruleSubExpression ) ;
    public final void rule__AddExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7829:1: ( ( ruleSubExpression ) )
            // InternalKExpressions.g:7830:1: ( ruleSubExpression )
            {
            // InternalKExpressions.g:7830:1: ( ruleSubExpression )
            // InternalKExpressions.g:7831:1: ruleSubExpression
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
    // InternalKExpressions.g:7840:1: rule__SubExpression__OperatorAssignment_1_1 : ( ruleSubOperator ) ;
    public final void rule__SubExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7844:1: ( ( ruleSubOperator ) )
            // InternalKExpressions.g:7845:1: ( ruleSubOperator )
            {
            // InternalKExpressions.g:7845:1: ( ruleSubOperator )
            // InternalKExpressions.g:7846:1: ruleSubOperator
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
    // InternalKExpressions.g:7855:1: rule__SubExpression__SubExpressionsAssignment_1_2 : ( ruleMultExpression ) ;
    public final void rule__SubExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7859:1: ( ( ruleMultExpression ) )
            // InternalKExpressions.g:7860:1: ( ruleMultExpression )
            {
            // InternalKExpressions.g:7860:1: ( ruleMultExpression )
            // InternalKExpressions.g:7861:1: ruleMultExpression
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
    // InternalKExpressions.g:7870:1: rule__MultExpression__OperatorAssignment_1_1 : ( ruleMultOperator ) ;
    public final void rule__MultExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7874:1: ( ( ruleMultOperator ) )
            // InternalKExpressions.g:7875:1: ( ruleMultOperator )
            {
            // InternalKExpressions.g:7875:1: ( ruleMultOperator )
            // InternalKExpressions.g:7876:1: ruleMultOperator
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
    // InternalKExpressions.g:7885:1: rule__MultExpression__SubExpressionsAssignment_1_2 : ( ruleDivExpression ) ;
    public final void rule__MultExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7889:1: ( ( ruleDivExpression ) )
            // InternalKExpressions.g:7890:1: ( ruleDivExpression )
            {
            // InternalKExpressions.g:7890:1: ( ruleDivExpression )
            // InternalKExpressions.g:7891:1: ruleDivExpression
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
    // InternalKExpressions.g:7900:1: rule__DivExpression__OperatorAssignment_1_1 : ( ruleDivOperator ) ;
    public final void rule__DivExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7904:1: ( ( ruleDivOperator ) )
            // InternalKExpressions.g:7905:1: ( ruleDivOperator )
            {
            // InternalKExpressions.g:7905:1: ( ruleDivOperator )
            // InternalKExpressions.g:7906:1: ruleDivOperator
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
    // InternalKExpressions.g:7915:1: rule__DivExpression__SubExpressionsAssignment_1_2 : ( ruleModExpression ) ;
    public final void rule__DivExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7919:1: ( ( ruleModExpression ) )
            // InternalKExpressions.g:7920:1: ( ruleModExpression )
            {
            // InternalKExpressions.g:7920:1: ( ruleModExpression )
            // InternalKExpressions.g:7921:1: ruleModExpression
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
    // InternalKExpressions.g:7930:1: rule__ModExpression__OperatorAssignment_1_1 : ( ruleModOperator ) ;
    public final void rule__ModExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7934:1: ( ( ruleModOperator ) )
            // InternalKExpressions.g:7935:1: ( ruleModOperator )
            {
            // InternalKExpressions.g:7935:1: ( ruleModOperator )
            // InternalKExpressions.g:7936:1: ruleModOperator
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
    // InternalKExpressions.g:7945:1: rule__ModExpression__SubExpressionsAssignment_1_2 : ( ruleAtomicValuedExpression ) ;
    public final void rule__ModExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7949:1: ( ( ruleAtomicValuedExpression ) )
            // InternalKExpressions.g:7950:1: ( ruleAtomicValuedExpression )
            {
            // InternalKExpressions.g:7950:1: ( ruleAtomicValuedExpression )
            // InternalKExpressions.g:7951:1: ruleAtomicValuedExpression
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
    // InternalKExpressions.g:7960:1: rule__NegExpression__OperatorAssignment_0_1 : ( ruleSubOperator ) ;
    public final void rule__NegExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7964:1: ( ( ruleSubOperator ) )
            // InternalKExpressions.g:7965:1: ( ruleSubOperator )
            {
            // InternalKExpressions.g:7965:1: ( ruleSubOperator )
            // InternalKExpressions.g:7966:1: ruleSubOperator
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
    // InternalKExpressions.g:7975:1: rule__NegExpression__SubExpressionsAssignment_0_2 : ( ruleNegExpression ) ;
    public final void rule__NegExpression__SubExpressionsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7979:1: ( ( ruleNegExpression ) )
            // InternalKExpressions.g:7980:1: ( ruleNegExpression )
            {
            // InternalKExpressions.g:7980:1: ( ruleNegExpression )
            // InternalKExpressions.g:7981:1: ruleNegExpression
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
    // InternalKExpressions.g:7990:1: rule__ValuedObjectTestExpression__OperatorAssignment_0_1 : ( rulePreOperator ) ;
    public final void rule__ValuedObjectTestExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7994:1: ( ( rulePreOperator ) )
            // InternalKExpressions.g:7995:1: ( rulePreOperator )
            {
            // InternalKExpressions.g:7995:1: ( rulePreOperator )
            // InternalKExpressions.g:7996:1: rulePreOperator
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
    // InternalKExpressions.g:8005:1: rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 : ( ruleValuedObjectTestExpression ) ;
    public final void rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8009:1: ( ( ruleValuedObjectTestExpression ) )
            // InternalKExpressions.g:8010:1: ( ruleValuedObjectTestExpression )
            {
            // InternalKExpressions.g:8010:1: ( ruleValuedObjectTestExpression )
            // InternalKExpressions.g:8011:1: ruleValuedObjectTestExpression
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
    // InternalKExpressions.g:8020:1: rule__ValuedObjectTestExpression__OperatorAssignment_1_1 : ( ruleValueTestOperator ) ;
    public final void rule__ValuedObjectTestExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8024:1: ( ( ruleValueTestOperator ) )
            // InternalKExpressions.g:8025:1: ( ruleValueTestOperator )
            {
            // InternalKExpressions.g:8025:1: ( ruleValueTestOperator )
            // InternalKExpressions.g:8026:1: ruleValueTestOperator
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
    // InternalKExpressions.g:8035:1: rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 : ( ruleValuedObjectReference ) ;
    public final void rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8039:1: ( ( ruleValuedObjectReference ) )
            // InternalKExpressions.g:8040:1: ( ruleValuedObjectReference )
            {
            // InternalKExpressions.g:8040:1: ( ruleValuedObjectReference )
            // InternalKExpressions.g:8041:1: ruleValuedObjectReference
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
    // InternalKExpressions.g:8050:1: rule__ValuedObjectReference__ValuedObjectAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ValuedObjectReference__ValuedObjectAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8054:1: ( ( ( RULE_ID ) ) )
            // InternalKExpressions.g:8055:1: ( ( RULE_ID ) )
            {
            // InternalKExpressions.g:8055:1: ( ( RULE_ID ) )
            // InternalKExpressions.g:8056:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0()); 
            }
            // InternalKExpressions.g:8057:1: ( RULE_ID )
            // InternalKExpressions.g:8058:1: RULE_ID
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
    // InternalKExpressions.g:8069:1: rule__TextExpression__CodeAssignment_0 : ( RULE_HOSTCODE ) ;
    public final void rule__TextExpression__CodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8073:1: ( ( RULE_HOSTCODE ) )
            // InternalKExpressions.g:8074:1: ( RULE_HOSTCODE )
            {
            // InternalKExpressions.g:8074:1: ( RULE_HOSTCODE )
            // InternalKExpressions.g:8075:1: RULE_HOSTCODE
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
    // InternalKExpressions.g:8084:1: rule__TextExpression__TypeAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__TextExpression__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8088:1: ( ( RULE_ID ) )
            // InternalKExpressions.g:8089:1: ( RULE_ID )
            {
            // InternalKExpressions.g:8089:1: ( RULE_ID )
            // InternalKExpressions.g:8090:1: RULE_ID
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
    // InternalKExpressions.g:8099:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8103:1: ( ( RULE_INT ) )
            // InternalKExpressions.g:8104:1: ( RULE_INT )
            {
            // InternalKExpressions.g:8104:1: ( RULE_INT )
            // InternalKExpressions.g:8105:1: RULE_INT
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
    // InternalKExpressions.g:8114:1: rule__FloatValue__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8118:1: ( ( RULE_FLOAT ) )
            // InternalKExpressions.g:8119:1: ( RULE_FLOAT )
            {
            // InternalKExpressions.g:8119:1: ( RULE_FLOAT )
            // InternalKExpressions.g:8120:1: RULE_FLOAT
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
    // InternalKExpressions.g:8129:1: rule__BooleanValue__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8133:1: ( ( RULE_BOOLEAN ) )
            // InternalKExpressions.g:8134:1: ( RULE_BOOLEAN )
            {
            // InternalKExpressions.g:8134:1: ( RULE_BOOLEAN )
            // InternalKExpressions.g:8135:1: RULE_BOOLEAN
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
    // InternalKExpressions.g:8144:1: rule__ISignal__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ISignal__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8148:1: ( ( RULE_ID ) )
            // InternalKExpressions.g:8149:1: ( RULE_ID )
            {
            // InternalKExpressions.g:8149:1: ( RULE_ID )
            // InternalKExpressions.g:8150:1: RULE_ID
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
    // InternalKExpressions.g:8159:1: rule__ISignal__ChannelDescrAssignment_1 : ( ruleChannelDescription ) ;
    public final void rule__ISignal__ChannelDescrAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8163:1: ( ( ruleChannelDescription ) )
            // InternalKExpressions.g:8164:1: ( ruleChannelDescription )
            {
            // InternalKExpressions.g:8164:1: ( ruleChannelDescription )
            // InternalKExpressions.g:8165:1: ruleChannelDescription
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
    // InternalKExpressions.g:8174:1: rule__InterfaceSignalDecl__SignalsAssignment_0_2 : ( ruleISignal ) ;
    public final void rule__InterfaceSignalDecl__SignalsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8178:1: ( ( ruleISignal ) )
            // InternalKExpressions.g:8179:1: ( ruleISignal )
            {
            // InternalKExpressions.g:8179:1: ( ruleISignal )
            // InternalKExpressions.g:8180:1: ruleISignal
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
    // InternalKExpressions.g:8189:1: rule__InterfaceSignalDecl__SignalsAssignment_0_3_1 : ( ruleISignal ) ;
    public final void rule__InterfaceSignalDecl__SignalsAssignment_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8193:1: ( ( ruleISignal ) )
            // InternalKExpressions.g:8194:1: ( ruleISignal )
            {
            // InternalKExpressions.g:8194:1: ( ruleISignal )
            // InternalKExpressions.g:8195:1: ruleISignal
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
    // InternalKExpressions.g:8204:1: rule__InterfaceSignalDecl__SignalsAssignment_1_2 : ( ruleISignal ) ;
    public final void rule__InterfaceSignalDecl__SignalsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8208:1: ( ( ruleISignal ) )
            // InternalKExpressions.g:8209:1: ( ruleISignal )
            {
            // InternalKExpressions.g:8209:1: ( ruleISignal )
            // InternalKExpressions.g:8210:1: ruleISignal
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
    // InternalKExpressions.g:8219:1: rule__InterfaceSignalDecl__SignalsAssignment_1_3_1 : ( ruleISignal ) ;
    public final void rule__InterfaceSignalDecl__SignalsAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8223:1: ( ( ruleISignal ) )
            // InternalKExpressions.g:8224:1: ( ruleISignal )
            {
            // InternalKExpressions.g:8224:1: ( ruleISignal )
            // InternalKExpressions.g:8225:1: ruleISignal
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
    // InternalKExpressions.g:8234:1: rule__InterfaceSignalDecl__SignalsAssignment_2_2 : ( ruleISignal ) ;
    public final void rule__InterfaceSignalDecl__SignalsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8238:1: ( ( ruleISignal ) )
            // InternalKExpressions.g:8239:1: ( ruleISignal )
            {
            // InternalKExpressions.g:8239:1: ( ruleISignal )
            // InternalKExpressions.g:8240:1: ruleISignal
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
    // InternalKExpressions.g:8249:1: rule__InterfaceSignalDecl__SignalsAssignment_2_3_1 : ( ruleISignal ) ;
    public final void rule__InterfaceSignalDecl__SignalsAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8253:1: ( ( ruleISignal ) )
            // InternalKExpressions.g:8254:1: ( ruleISignal )
            {
            // InternalKExpressions.g:8254:1: ( ruleISignal )
            // InternalKExpressions.g:8255:1: ruleISignal
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
    // InternalKExpressions.g:8264:1: rule__InterfaceSignalDecl__SignalsAssignment_3_2 : ( ruleISignal ) ;
    public final void rule__InterfaceSignalDecl__SignalsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8268:1: ( ( ruleISignal ) )
            // InternalKExpressions.g:8269:1: ( ruleISignal )
            {
            // InternalKExpressions.g:8269:1: ( ruleISignal )
            // InternalKExpressions.g:8270:1: ruleISignal
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
    // InternalKExpressions.g:8279:1: rule__InterfaceSignalDecl__SignalsAssignment_3_3_1 : ( ruleISignal ) ;
    public final void rule__InterfaceSignalDecl__SignalsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8283:1: ( ( ruleISignal ) )
            // InternalKExpressions.g:8284:1: ( ruleISignal )
            {
            // InternalKExpressions.g:8284:1: ( ruleISignal )
            // InternalKExpressions.g:8285:1: ruleISignal
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
    // InternalKExpressions.g:8294:1: rule__ChannelDescription__TypeAssignment_0_1 : ( ruleTypeIdentifier ) ;
    public final void rule__ChannelDescription__TypeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8298:1: ( ( ruleTypeIdentifier ) )
            // InternalKExpressions.g:8299:1: ( ruleTypeIdentifier )
            {
            // InternalKExpressions.g:8299:1: ( ruleTypeIdentifier )
            // InternalKExpressions.g:8300:1: ruleTypeIdentifier
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
    // InternalKExpressions.g:8309:1: rule__ChannelDescription__TypeAssignment_1_1 : ( ruleTypeIdentifier ) ;
    public final void rule__ChannelDescription__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8313:1: ( ( ruleTypeIdentifier ) )
            // InternalKExpressions.g:8314:1: ( ruleTypeIdentifier )
            {
            // InternalKExpressions.g:8314:1: ( ruleTypeIdentifier )
            // InternalKExpressions.g:8315:1: ruleTypeIdentifier
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
    // InternalKExpressions.g:8324:1: rule__ChannelDescription__ExpressionAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__ChannelDescription__ExpressionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8328:1: ( ( ruleExpression ) )
            // InternalKExpressions.g:8329:1: ( ruleExpression )
            {
            // InternalKExpressions.g:8329:1: ( ruleExpression )
            // InternalKExpressions.g:8330:1: ruleExpression
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
    // InternalKExpressions.g:8339:1: rule__ChannelDescription__TypeAssignment_2_3 : ( ruleTypeIdentifier ) ;
    public final void rule__ChannelDescription__TypeAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8343:1: ( ( ruleTypeIdentifier ) )
            // InternalKExpressions.g:8344:1: ( ruleTypeIdentifier )
            {
            // InternalKExpressions.g:8344:1: ( ruleTypeIdentifier )
            // InternalKExpressions.g:8345:1: ruleTypeIdentifier
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
    // InternalKExpressions.g:8354:1: rule__InterfaceVariableDecl__VarDeclsAssignment_1 : ( ruleVariableDecl ) ;
    public final void rule__InterfaceVariableDecl__VarDeclsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8358:1: ( ( ruleVariableDecl ) )
            // InternalKExpressions.g:8359:1: ( ruleVariableDecl )
            {
            // InternalKExpressions.g:8359:1: ( ruleVariableDecl )
            // InternalKExpressions.g:8360:1: ruleVariableDecl
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
    // InternalKExpressions.g:8369:1: rule__InterfaceVariableDecl__VarDeclsAssignment_2_1 : ( ruleVariableDecl ) ;
    public final void rule__InterfaceVariableDecl__VarDeclsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8373:1: ( ( ruleVariableDecl ) )
            // InternalKExpressions.g:8374:1: ( ruleVariableDecl )
            {
            // InternalKExpressions.g:8374:1: ( ruleVariableDecl )
            // InternalKExpressions.g:8375:1: ruleVariableDecl
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
    // InternalKExpressions.g:8384:1: rule__VariableDecl__VariablesAssignment_0 : ( ruleIVariable ) ;
    public final void rule__VariableDecl__VariablesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8388:1: ( ( ruleIVariable ) )
            // InternalKExpressions.g:8389:1: ( ruleIVariable )
            {
            // InternalKExpressions.g:8389:1: ( ruleIVariable )
            // InternalKExpressions.g:8390:1: ruleIVariable
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
    // InternalKExpressions.g:8399:1: rule__VariableDecl__VariablesAssignment_1_1 : ( ruleIVariable ) ;
    public final void rule__VariableDecl__VariablesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8403:1: ( ( ruleIVariable ) )
            // InternalKExpressions.g:8404:1: ( ruleIVariable )
            {
            // InternalKExpressions.g:8404:1: ( ruleIVariable )
            // InternalKExpressions.g:8405:1: ruleIVariable
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
    // InternalKExpressions.g:8414:1: rule__VariableDecl__TypeAssignment_3 : ( ruleTypeIdentifier ) ;
    public final void rule__VariableDecl__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8418:1: ( ( ruleTypeIdentifier ) )
            // InternalKExpressions.g:8419:1: ( ruleTypeIdentifier )
            {
            // InternalKExpressions.g:8419:1: ( ruleTypeIdentifier )
            // InternalKExpressions.g:8420:1: ruleTypeIdentifier
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
    // InternalKExpressions.g:8429:1: rule__IVariable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__IVariable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8433:1: ( ( RULE_ID ) )
            // InternalKExpressions.g:8434:1: ( RULE_ID )
            {
            // InternalKExpressions.g:8434:1: ( RULE_ID )
            // InternalKExpressions.g:8435:1: RULE_ID
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
    // InternalKExpressions.g:8444:1: rule__IVariable__ExpressionAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__IVariable__ExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8448:1: ( ( ruleExpression ) )
            // InternalKExpressions.g:8449:1: ( ruleExpression )
            {
            // InternalKExpressions.g:8449:1: ( ruleExpression )
            // InternalKExpressions.g:8450:1: ruleExpression
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
    // InternalKExpressions.g:8459:1: rule__TypeIdentifier__TypeAssignment_0 : ( ruleValueType ) ;
    public final void rule__TypeIdentifier__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8463:1: ( ( ruleValueType ) )
            // InternalKExpressions.g:8464:1: ( ruleValueType )
            {
            // InternalKExpressions.g:8464:1: ( ruleValueType )
            // InternalKExpressions.g:8465:1: ruleValueType
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
    // InternalKExpressions.g:8474:1: rule__TypeIdentifier__TypeIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__TypeIdentifier__TypeIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8478:1: ( ( RULE_ID ) )
            // InternalKExpressions.g:8479:1: ( RULE_ID )
            {
            // InternalKExpressions.g:8479:1: ( RULE_ID )
            // InternalKExpressions.g:8480:1: RULE_ID
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
    // InternalKExpressions.g:8489:1: rule__TypeIdentifier__TypeAssignment_2_1_0 : ( ruleValueType ) ;
    public final void rule__TypeIdentifier__TypeAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8493:1: ( ( ruleValueType ) )
            // InternalKExpressions.g:8494:1: ( ruleValueType )
            {
            // InternalKExpressions.g:8494:1: ( ruleValueType )
            // InternalKExpressions.g:8495:1: ruleValueType
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
    // InternalKExpressions.g:8504:1: rule__TypeIdentifier__TypeIDAssignment_2_1_1 : ( RULE_ID ) ;
    public final void rule__TypeIdentifier__TypeIDAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8508:1: ( ( RULE_ID ) )
            // InternalKExpressions.g:8509:1: ( RULE_ID )
            {
            // InternalKExpressions.g:8509:1: ( RULE_ID )
            // InternalKExpressions.g:8510:1: RULE_ID
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
    // InternalKExpressions.g:8519:1: rule__TypeIdentifier__OperatorAssignment_2_3 : ( ruleCombineOperator ) ;
    public final void rule__TypeIdentifier__OperatorAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8523:1: ( ( ruleCombineOperator ) )
            // InternalKExpressions.g:8524:1: ( ruleCombineOperator )
            {
            // InternalKExpressions.g:8524:1: ( ruleCombineOperator )
            // InternalKExpressions.g:8525:1: ruleCombineOperator
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
    // InternalKExpressions.g:8534:1: rule__CommentAnnotation__ValuesAssignment : ( RULE_COMMENT_ANNOTATION ) ;
    public final void rule__CommentAnnotation__ValuesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8538:1: ( ( RULE_COMMENT_ANNOTATION ) )
            // InternalKExpressions.g:8539:1: ( RULE_COMMENT_ANNOTATION )
            {
            // InternalKExpressions.g:8539:1: ( RULE_COMMENT_ANNOTATION )
            // InternalKExpressions.g:8540:1: RULE_COMMENT_ANNOTATION
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
    // InternalKExpressions.g:8549:1: rule__TagAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TagAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8553:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:8554:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:8554:1: ( ruleExtendedID )
            // InternalKExpressions.g:8555:1: ruleExtendedID
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
    // InternalKExpressions.g:8564:1: rule__KeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8568:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:8569:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:8569:1: ( ruleExtendedID )
            // InternalKExpressions.g:8570:1: ruleExtendedID
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
    // InternalKExpressions.g:8579:1: rule__KeyStringValueAnnotation__ValuesAssignment_2 : ( ruleEString ) ;
    public final void rule__KeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8583:1: ( ( ruleEString ) )
            // InternalKExpressions.g:8584:1: ( ruleEString )
            {
            // InternalKExpressions.g:8584:1: ( ruleEString )
            // InternalKExpressions.g:8585:1: ruleEString
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
    // InternalKExpressions.g:8594:1: rule__KeyStringValueAnnotation__ValuesAssignment_3_1 : ( ruleEString ) ;
    public final void rule__KeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8598:1: ( ( ruleEString ) )
            // InternalKExpressions.g:8599:1: ( ruleEString )
            {
            // InternalKExpressions.g:8599:1: ( ruleEString )
            // InternalKExpressions.g:8600:1: ruleEString
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
    // InternalKExpressions.g:8609:1: rule__TypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8613:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:8614:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:8614:1: ( ruleExtendedID )
            // InternalKExpressions.g:8615:1: ruleExtendedID
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
    // InternalKExpressions.g:8624:1: rule__TypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8628:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:8629:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:8629:1: ( ruleExtendedID )
            // InternalKExpressions.g:8630:1: ruleExtendedID
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
    // InternalKExpressions.g:8639:1: rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 : ( ruleEStringBoolean ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8643:1: ( ( ruleEStringBoolean ) )
            // InternalKExpressions.g:8644:1: ( ruleEStringBoolean )
            {
            // InternalKExpressions.g:8644:1: ( ruleEStringBoolean )
            // InternalKExpressions.g:8645:1: ruleEStringBoolean
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
    // InternalKExpressions.g:8654:1: rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( ruleEStringBoolean ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8658:1: ( ( ruleEStringBoolean ) )
            // InternalKExpressions.g:8659:1: ( ruleEStringBoolean )
            {
            // InternalKExpressions.g:8659:1: ( ruleEStringBoolean )
            // InternalKExpressions.g:8660:1: ruleEStringBoolean
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
    // InternalKExpressions.g:8669:1: rule__QuotedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__QuotedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8673:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:8674:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:8674:1: ( ruleExtendedID )
            // InternalKExpressions.g:8675:1: ruleExtendedID
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
    // InternalKExpressions.g:8684:1: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 : ( RULE_STRING ) ;
    public final void rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8688:1: ( ( RULE_STRING ) )
            // InternalKExpressions.g:8689:1: ( RULE_STRING )
            {
            // InternalKExpressions.g:8689:1: ( RULE_STRING )
            // InternalKExpressions.g:8690:1: RULE_STRING
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
    // InternalKExpressions.g:8699:1: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8703:1: ( ( RULE_STRING ) )
            // InternalKExpressions.g:8704:1: ( RULE_STRING )
            {
            // InternalKExpressions.g:8704:1: ( RULE_STRING )
            // InternalKExpressions.g:8705:1: RULE_STRING
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
    // InternalKExpressions.g:8714:1: rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8718:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:8719:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:8719:1: ( ruleExtendedID )
            // InternalKExpressions.g:8720:1: ruleExtendedID
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
    // InternalKExpressions.g:8729:1: rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8733:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:8734:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:8734:1: ( ruleExtendedID )
            // InternalKExpressions.g:8735:1: ruleExtendedID
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
    // InternalKExpressions.g:8744:1: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 : ( RULE_STRING ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8748:1: ( ( RULE_STRING ) )
            // InternalKExpressions.g:8749:1: ( RULE_STRING )
            {
            // InternalKExpressions.g:8749:1: ( RULE_STRING )
            // InternalKExpressions.g:8750:1: RULE_STRING
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
    // InternalKExpressions.g:8759:1: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8763:1: ( ( RULE_STRING ) )
            // InternalKExpressions.g:8764:1: ( RULE_STRING )
            {
            // InternalKExpressions.g:8764:1: ( RULE_STRING )
            // InternalKExpressions.g:8765:1: RULE_STRING
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
    // InternalKExpressions.g:8774:1: rule__KeyBooleanValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyBooleanValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8778:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:8779:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:8779:1: ( ruleExtendedID )
            // InternalKExpressions.g:8780:1: ruleExtendedID
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
    // InternalKExpressions.g:8789:1: rule__KeyBooleanValueAnnotation__ValueAssignment_2 : ( RULE_BOOLEAN ) ;
    public final void rule__KeyBooleanValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8793:1: ( ( RULE_BOOLEAN ) )
            // InternalKExpressions.g:8794:1: ( RULE_BOOLEAN )
            {
            // InternalKExpressions.g:8794:1: ( RULE_BOOLEAN )
            // InternalKExpressions.g:8795:1: RULE_BOOLEAN
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
    // InternalKExpressions.g:8804:1: rule__KeyIntValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyIntValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8808:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:8809:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:8809:1: ( ruleExtendedID )
            // InternalKExpressions.g:8810:1: ruleExtendedID
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
    // InternalKExpressions.g:8819:1: rule__KeyIntValueAnnotation__ValueAssignment_2 : ( ruleInteger ) ;
    public final void rule__KeyIntValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8823:1: ( ( ruleInteger ) )
            // InternalKExpressions.g:8824:1: ( ruleInteger )
            {
            // InternalKExpressions.g:8824:1: ( ruleInteger )
            // InternalKExpressions.g:8825:1: ruleInteger
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
    // InternalKExpressions.g:8834:1: rule__KeyFloatValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyFloatValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8838:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:8839:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:8839:1: ( ruleExtendedID )
            // InternalKExpressions.g:8840:1: ruleExtendedID
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
    // InternalKExpressions.g:8849:1: rule__KeyFloatValueAnnotation__ValueAssignment_2 : ( ruleFloateger ) ;
    public final void rule__KeyFloatValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8853:1: ( ( ruleFloateger ) )
            // InternalKExpressions.g:8854:1: ( ruleFloateger )
            {
            // InternalKExpressions.g:8854:1: ( ruleFloateger )
            // InternalKExpressions.g:8855:1: ruleFloateger
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
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\5\11\0\2\uffff";
    static final String dfa_3s = "\1\53\11\0\2\uffff";
    static final String dfa_4s = "\12\uffff\1\1\1\2";
    static final String dfa_5s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff}>";
    static final String[] dfa_6s = {
            "\1\5\1\10\1\2\1\3\1\11\6\uffff\1\6\2\uffff\1\12\1\uffff\1\1\3\uffff\1\7\21\uffff\1\4",
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
    static final String dfa_8s = "\1\53\3\uffff\7\0\1\uffff";
    static final String dfa_9s = "\1\uffff\1\1\11\uffff\1\2";
    static final String dfa_10s = "\4\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff}>";
    static final String[] dfa_11s = {
            "\1\5\1\10\2\1\1\11\6\uffff\1\6\2\uffff\1\12\1\uffff\1\1\3\uffff\1\7\21\uffff\1\4",
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
    static final String dfa_14s = "\1\53\3\uffff\6\0\1\uffff";
    static final String dfa_15s = "\1\uffff\1\1\10\uffff\1\2";
    static final String dfa_16s = "\4\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\uffff}>";
    static final String[] dfa_17s = {
            "\1\5\1\10\2\1\1\11\6\uffff\1\6\2\uffff\1\12\1\uffff\1\1\3\uffff\1\7\21\uffff\1\4",
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
    static final String dfa_20s = "\1\53\2\uffff\1\0\6\uffff";
    static final String dfa_21s = "\1\uffff\1\1\1\2\1\uffff\1\4\4\uffff\1\3";
    static final String dfa_22s = "\3\uffff\1\0\6\uffff}>";
    static final String[] dfa_23s = {
            "\2\4\1\1\1\2\1\4\6\uffff\1\4\10\uffff\1\4\21\uffff\1\3",
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
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000800022903E0L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000FC000000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000800022103E0L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002010040L});
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