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
    // InternalKExpressions.g:939:1: entryRuleCommentAnnotation : ruleCommentAnnotation EOF ;
    public final void entryRuleCommentAnnotation() throws RecognitionException {
        try {
            // InternalKExpressions.g:940:1: ( ruleCommentAnnotation EOF )
            // InternalKExpressions.g:941:1: ruleCommentAnnotation EOF
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
    // InternalKExpressions.g:948:1: ruleCommentAnnotation : ( ( rule__CommentAnnotation__ValuesAssignment ) ) ;
    public final void ruleCommentAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:952:2: ( ( ( rule__CommentAnnotation__ValuesAssignment ) ) )
            // InternalKExpressions.g:953:1: ( ( rule__CommentAnnotation__ValuesAssignment ) )
            {
            // InternalKExpressions.g:953:1: ( ( rule__CommentAnnotation__ValuesAssignment ) )
            // InternalKExpressions.g:954:1: ( rule__CommentAnnotation__ValuesAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationAccess().getValuesAssignment()); 
            }
            // InternalKExpressions.g:955:1: ( rule__CommentAnnotation__ValuesAssignment )
            // InternalKExpressions.g:955:2: rule__CommentAnnotation__ValuesAssignment
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
    // InternalKExpressions.g:967:1: entryRuleTagAnnotation : ruleTagAnnotation EOF ;
    public final void entryRuleTagAnnotation() throws RecognitionException {
        try {
            // InternalKExpressions.g:968:1: ( ruleTagAnnotation EOF )
            // InternalKExpressions.g:969:1: ruleTagAnnotation EOF
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
    // InternalKExpressions.g:976:1: ruleTagAnnotation : ( ( rule__TagAnnotation__Group__0 ) ) ;
    public final void ruleTagAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:980:2: ( ( ( rule__TagAnnotation__Group__0 ) ) )
            // InternalKExpressions.g:981:1: ( ( rule__TagAnnotation__Group__0 ) )
            {
            // InternalKExpressions.g:981:1: ( ( rule__TagAnnotation__Group__0 ) )
            // InternalKExpressions.g:982:1: ( rule__TagAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getGroup()); 
            }
            // InternalKExpressions.g:983:1: ( rule__TagAnnotation__Group__0 )
            // InternalKExpressions.g:983:2: rule__TagAnnotation__Group__0
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
    // InternalKExpressions.g:995:1: entryRuleKeyStringValueAnnotation : ruleKeyStringValueAnnotation EOF ;
    public final void entryRuleKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKExpressions.g:996:1: ( ruleKeyStringValueAnnotation EOF )
            // InternalKExpressions.g:997:1: ruleKeyStringValueAnnotation EOF
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
    // InternalKExpressions.g:1004:1: ruleKeyStringValueAnnotation : ( ( rule__KeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1008:2: ( ( ( rule__KeyStringValueAnnotation__Group__0 ) ) )
            // InternalKExpressions.g:1009:1: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKExpressions.g:1009:1: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            // InternalKExpressions.g:1010:1: ( rule__KeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKExpressions.g:1011:1: ( rule__KeyStringValueAnnotation__Group__0 )
            // InternalKExpressions.g:1011:2: rule__KeyStringValueAnnotation__Group__0
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
    // InternalKExpressions.g:1023:1: entryRuleRestrictedKeyStringValueAnnotation : ruleRestrictedKeyStringValueAnnotation EOF ;
    public final void entryRuleRestrictedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKExpressions.g:1024:1: ( ruleRestrictedKeyStringValueAnnotation EOF )
            // InternalKExpressions.g:1025:1: ruleRestrictedKeyStringValueAnnotation EOF
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
    // InternalKExpressions.g:1032:1: ruleRestrictedKeyStringValueAnnotation : ( ( rule__RestrictedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleRestrictedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1036:2: ( ( ( rule__RestrictedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKExpressions.g:1037:1: ( ( rule__RestrictedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKExpressions.g:1037:1: ( ( rule__RestrictedKeyStringValueAnnotation__Group__0 ) )
            // InternalKExpressions.g:1038:1: ( rule__RestrictedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKExpressions.g:1039:1: ( rule__RestrictedKeyStringValueAnnotation__Group__0 )
            // InternalKExpressions.g:1039:2: rule__RestrictedKeyStringValueAnnotation__Group__0
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


    // $ANTLR start "entryRuleTypedKeyStringValueAnnotation"
    // InternalKExpressions.g:1051:1: entryRuleTypedKeyStringValueAnnotation : ruleTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKExpressions.g:1052:1: ( ruleTypedKeyStringValueAnnotation EOF )
            // InternalKExpressions.g:1053:1: ruleTypedKeyStringValueAnnotation EOF
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
    // InternalKExpressions.g:1060:1: ruleTypedKeyStringValueAnnotation : ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1064:2: ( ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKExpressions.g:1065:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKExpressions.g:1065:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            // InternalKExpressions.g:1066:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKExpressions.g:1067:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            // InternalKExpressions.g:1067:2: rule__TypedKeyStringValueAnnotation__Group__0
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
    // InternalKExpressions.g:1079:1: entryRuleRestrictedTypedKeyStringValueAnnotation : ruleRestrictedTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleRestrictedTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKExpressions.g:1080:1: ( ruleRestrictedTypedKeyStringValueAnnotation EOF )
            // InternalKExpressions.g:1081:1: ruleRestrictedTypedKeyStringValueAnnotation EOF
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
    // InternalKExpressions.g:1088:1: ruleRestrictedTypedKeyStringValueAnnotation : ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleRestrictedTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1092:2: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKExpressions.g:1093:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKExpressions.g:1093:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 ) )
            // InternalKExpressions.g:1094:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKExpressions.g:1095:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 )
            // InternalKExpressions.g:1095:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__0
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
    // InternalKExpressions.g:1107:1: entryRuleQuotedKeyStringValueAnnotation : ruleQuotedKeyStringValueAnnotation EOF ;
    public final void entryRuleQuotedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKExpressions.g:1108:1: ( ruleQuotedKeyStringValueAnnotation EOF )
            // InternalKExpressions.g:1109:1: ruleQuotedKeyStringValueAnnotation EOF
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
    // InternalKExpressions.g:1116:1: ruleQuotedKeyStringValueAnnotation : ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleQuotedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1120:2: ( ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKExpressions.g:1121:1: ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKExpressions.g:1121:1: ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) )
            // InternalKExpressions.g:1122:1: ( rule__QuotedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKExpressions.g:1123:1: ( rule__QuotedKeyStringValueAnnotation__Group__0 )
            // InternalKExpressions.g:1123:2: rule__QuotedKeyStringValueAnnotation__Group__0
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
    // InternalKExpressions.g:1135:1: entryRuleQuotedTypedKeyStringValueAnnotation : ruleQuotedTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKExpressions.g:1136:1: ( ruleQuotedTypedKeyStringValueAnnotation EOF )
            // InternalKExpressions.g:1137:1: ruleQuotedTypedKeyStringValueAnnotation EOF
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
    // InternalKExpressions.g:1144:1: ruleQuotedTypedKeyStringValueAnnotation : ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1148:2: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKExpressions.g:1149:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKExpressions.g:1149:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) )
            // InternalKExpressions.g:1150:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKExpressions.g:1151:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 )
            // InternalKExpressions.g:1151:2: rule__QuotedTypedKeyStringValueAnnotation__Group__0
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
    // InternalKExpressions.g:1165:1: entryRuleEStringBoolean : ruleEStringBoolean EOF ;
    public final void entryRuleEStringBoolean() throws RecognitionException {
        try {
            // InternalKExpressions.g:1166:1: ( ruleEStringBoolean EOF )
            // InternalKExpressions.g:1167:1: ruleEStringBoolean EOF
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
    // InternalKExpressions.g:1174:1: ruleEStringBoolean : ( ( rule__EStringBoolean__Alternatives ) ) ;
    public final void ruleEStringBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1178:2: ( ( ( rule__EStringBoolean__Alternatives ) ) )
            // InternalKExpressions.g:1179:1: ( ( rule__EStringBoolean__Alternatives ) )
            {
            // InternalKExpressions.g:1179:1: ( ( rule__EStringBoolean__Alternatives ) )
            // InternalKExpressions.g:1180:1: ( rule__EStringBoolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringBooleanAccess().getAlternatives()); 
            }
            // InternalKExpressions.g:1181:1: ( rule__EStringBoolean__Alternatives )
            // InternalKExpressions.g:1181:2: rule__EStringBoolean__Alternatives
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
    // InternalKExpressions.g:1193:1: entryRuleEStringAllTypes : ruleEStringAllTypes EOF ;
    public final void entryRuleEStringAllTypes() throws RecognitionException {
        try {
            // InternalKExpressions.g:1194:1: ( ruleEStringAllTypes EOF )
            // InternalKExpressions.g:1195:1: ruleEStringAllTypes EOF
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
    // InternalKExpressions.g:1202:1: ruleEStringAllTypes : ( ( rule__EStringAllTypes__Alternatives ) ) ;
    public final void ruleEStringAllTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1206:2: ( ( ( rule__EStringAllTypes__Alternatives ) ) )
            // InternalKExpressions.g:1207:1: ( ( rule__EStringAllTypes__Alternatives ) )
            {
            // InternalKExpressions.g:1207:1: ( ( rule__EStringAllTypes__Alternatives ) )
            // InternalKExpressions.g:1208:1: ( rule__EStringAllTypes__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAllTypesAccess().getAlternatives()); 
            }
            // InternalKExpressions.g:1209:1: ( rule__EStringAllTypes__Alternatives )
            // InternalKExpressions.g:1209:2: rule__EStringAllTypes__Alternatives
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
    // InternalKExpressions.g:1221:1: entryRuleExtendedID : ruleExtendedID EOF ;
    public final void entryRuleExtendedID() throws RecognitionException {
        try {
            // InternalKExpressions.g:1222:1: ( ruleExtendedID EOF )
            // InternalKExpressions.g:1223:1: ruleExtendedID EOF
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
    // InternalKExpressions.g:1230:1: ruleExtendedID : ( ( rule__ExtendedID__Group__0 ) ) ;
    public final void ruleExtendedID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1234:2: ( ( ( rule__ExtendedID__Group__0 ) ) )
            // InternalKExpressions.g:1235:1: ( ( rule__ExtendedID__Group__0 ) )
            {
            // InternalKExpressions.g:1235:1: ( ( rule__ExtendedID__Group__0 ) )
            // InternalKExpressions.g:1236:1: ( rule__ExtendedID__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup()); 
            }
            // InternalKExpressions.g:1237:1: ( rule__ExtendedID__Group__0 )
            // InternalKExpressions.g:1237:2: rule__ExtendedID__Group__0
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
    // InternalKExpressions.g:1251:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // InternalKExpressions.g:1252:1: ( ruleInteger EOF )
            // InternalKExpressions.g:1253:1: ruleInteger EOF
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
    // InternalKExpressions.g:1260:1: ruleInteger : ( ( rule__Integer__Group__0 ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1264:2: ( ( ( rule__Integer__Group__0 ) ) )
            // InternalKExpressions.g:1265:1: ( ( rule__Integer__Group__0 ) )
            {
            // InternalKExpressions.g:1265:1: ( ( rule__Integer__Group__0 ) )
            // InternalKExpressions.g:1266:1: ( rule__Integer__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getGroup()); 
            }
            // InternalKExpressions.g:1267:1: ( rule__Integer__Group__0 )
            // InternalKExpressions.g:1267:2: rule__Integer__Group__0
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
    // InternalKExpressions.g:1279:1: entryRuleFloateger : ruleFloateger EOF ;
    public final void entryRuleFloateger() throws RecognitionException {
        try {
            // InternalKExpressions.g:1280:1: ( ruleFloateger EOF )
            // InternalKExpressions.g:1281:1: ruleFloateger EOF
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
    // InternalKExpressions.g:1288:1: ruleFloateger : ( ( rule__Floateger__Group__0 ) ) ;
    public final void ruleFloateger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1292:2: ( ( ( rule__Floateger__Group__0 ) ) )
            // InternalKExpressions.g:1293:1: ( ( rule__Floateger__Group__0 ) )
            {
            // InternalKExpressions.g:1293:1: ( ( rule__Floateger__Group__0 ) )
            // InternalKExpressions.g:1294:1: ( rule__Floateger__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloategerAccess().getGroup()); 
            }
            // InternalKExpressions.g:1295:1: ( rule__Floateger__Group__0 )
            // InternalKExpressions.g:1295:2: rule__Floateger__Group__0
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
    // InternalKExpressions.g:1308:1: ruleCompareOperator : ( ( rule__CompareOperator__Alternatives ) ) ;
    public final void ruleCompareOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1312:1: ( ( ( rule__CompareOperator__Alternatives ) ) )
            // InternalKExpressions.g:1313:1: ( ( rule__CompareOperator__Alternatives ) )
            {
            // InternalKExpressions.g:1313:1: ( ( rule__CompareOperator__Alternatives ) )
            // InternalKExpressions.g:1314:1: ( rule__CompareOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            }
            // InternalKExpressions.g:1315:1: ( rule__CompareOperator__Alternatives )
            // InternalKExpressions.g:1315:2: rule__CompareOperator__Alternatives
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
    // InternalKExpressions.g:1327:1: rulePreOperator : ( ( 'pre' ) ) ;
    public final void rulePreOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1331:1: ( ( ( 'pre' ) ) )
            // InternalKExpressions.g:1332:1: ( ( 'pre' ) )
            {
            // InternalKExpressions.g:1332:1: ( ( 'pre' ) )
            // InternalKExpressions.g:1333:1: ( 'pre' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreOperatorAccess().getPREEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1334:1: ( 'pre' )
            // InternalKExpressions.g:1334:3: 'pre'
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
    // InternalKExpressions.g:1347:1: ruleOrOperator : ( ( 'or' ) ) ;
    public final void ruleOrOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1351:1: ( ( ( 'or' ) ) )
            // InternalKExpressions.g:1352:1: ( ( 'or' ) )
            {
            // InternalKExpressions.g:1352:1: ( ( 'or' ) )
            // InternalKExpressions.g:1353:1: ( 'or' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrOperatorAccess().getOREnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1354:1: ( 'or' )
            // InternalKExpressions.g:1354:3: 'or'
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
    // InternalKExpressions.g:1367:1: ruleAndOperator : ( ( 'and' ) ) ;
    public final void ruleAndOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1371:1: ( ( ( 'and' ) ) )
            // InternalKExpressions.g:1372:1: ( ( 'and' ) )
            {
            // InternalKExpressions.g:1372:1: ( ( 'and' ) )
            // InternalKExpressions.g:1373:1: ( 'and' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndOperatorAccess().getANDEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1374:1: ( 'and' )
            // InternalKExpressions.g:1374:3: 'and'
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
    // InternalKExpressions.g:1387:1: ruleNotOperator : ( ( 'not' ) ) ;
    public final void ruleNotOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1391:1: ( ( ( 'not' ) ) )
            // InternalKExpressions.g:1392:1: ( ( 'not' ) )
            {
            // InternalKExpressions.g:1392:1: ( ( 'not' ) )
            // InternalKExpressions.g:1393:1: ( 'not' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1394:1: ( 'not' )
            // InternalKExpressions.g:1394:3: 'not'
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
    // InternalKExpressions.g:1407:1: ruleAddOperator : ( ( '+' ) ) ;
    public final void ruleAddOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1411:1: ( ( ( '+' ) ) )
            // InternalKExpressions.g:1412:1: ( ( '+' ) )
            {
            // InternalKExpressions.g:1412:1: ( ( '+' ) )
            // InternalKExpressions.g:1413:1: ( '+' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddOperatorAccess().getADDEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1414:1: ( '+' )
            // InternalKExpressions.g:1414:3: '+'
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
    // InternalKExpressions.g:1427:1: ruleSubOperator : ( ( '-' ) ) ;
    public final void ruleSubOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1431:1: ( ( ( '-' ) ) )
            // InternalKExpressions.g:1432:1: ( ( '-' ) )
            {
            // InternalKExpressions.g:1432:1: ( ( '-' ) )
            // InternalKExpressions.g:1433:1: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubOperatorAccess().getSUBEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1434:1: ( '-' )
            // InternalKExpressions.g:1434:3: '-'
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
    // InternalKExpressions.g:1447:1: ruleMultOperator : ( ( '*' ) ) ;
    public final void ruleMultOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1451:1: ( ( ( '*' ) ) )
            // InternalKExpressions.g:1452:1: ( ( '*' ) )
            {
            // InternalKExpressions.g:1452:1: ( ( '*' ) )
            // InternalKExpressions.g:1453:1: ( '*' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1454:1: ( '*' )
            // InternalKExpressions.g:1454:3: '*'
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
    // InternalKExpressions.g:1467:1: ruleModOperator : ( ( 'mod' ) ) ;
    public final void ruleModOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1471:1: ( ( ( 'mod' ) ) )
            // InternalKExpressions.g:1472:1: ( ( 'mod' ) )
            {
            // InternalKExpressions.g:1472:1: ( ( 'mod' ) )
            // InternalKExpressions.g:1473:1: ( 'mod' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModOperatorAccess().getMODEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1474:1: ( 'mod' )
            // InternalKExpressions.g:1474:3: 'mod'
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
    // InternalKExpressions.g:1487:1: ruleDivOperator : ( ( '/' ) ) ;
    public final void ruleDivOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1491:1: ( ( ( '/' ) ) )
            // InternalKExpressions.g:1492:1: ( ( '/' ) )
            {
            // InternalKExpressions.g:1492:1: ( ( '/' ) )
            // InternalKExpressions.g:1493:1: ( '/' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivOperatorAccess().getDIVEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1494:1: ( '/' )
            // InternalKExpressions.g:1494:3: '/'
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
    // InternalKExpressions.g:1507:1: ruleValueTestOperator : ( ( '?' ) ) ;
    public final void ruleValueTestOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1511:1: ( ( ( '?' ) ) )
            // InternalKExpressions.g:1512:1: ( ( '?' ) )
            {
            // InternalKExpressions.g:1512:1: ( ( '?' ) )
            // InternalKExpressions.g:1513:1: ( '?' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueTestOperatorAccess().getVALEnumLiteralDeclaration()); 
            }
            // InternalKExpressions.g:1514:1: ( '?' )
            // InternalKExpressions.g:1514:3: '?'
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
    // InternalKExpressions.g:1527:1: ruleValueType : ( ( rule__ValueType__Alternatives ) ) ;
    public final void ruleValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1531:1: ( ( ( rule__ValueType__Alternatives ) ) )
            // InternalKExpressions.g:1532:1: ( ( rule__ValueType__Alternatives ) )
            {
            // InternalKExpressions.g:1532:1: ( ( rule__ValueType__Alternatives ) )
            // InternalKExpressions.g:1533:1: ( rule__ValueType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueTypeAccess().getAlternatives()); 
            }
            // InternalKExpressions.g:1534:1: ( rule__ValueType__Alternatives )
            // InternalKExpressions.g:1534:2: rule__ValueType__Alternatives
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
    // InternalKExpressions.g:1546:1: ruleCombineOperator : ( ( rule__CombineOperator__Alternatives ) ) ;
    public final void ruleCombineOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1550:1: ( ( ( rule__CombineOperator__Alternatives ) ) )
            // InternalKExpressions.g:1551:1: ( ( rule__CombineOperator__Alternatives ) )
            {
            // InternalKExpressions.g:1551:1: ( ( rule__CombineOperator__Alternatives ) )
            // InternalKExpressions.g:1552:1: ( rule__CombineOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCombineOperatorAccess().getAlternatives()); 
            }
            // InternalKExpressions.g:1553:1: ( rule__CombineOperator__Alternatives )
            // InternalKExpressions.g:1553:2: rule__CombineOperator__Alternatives
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
    // InternalKExpressions.g:1564:1: rule__Root__Alternatives : ( ( ruleExpression ) | ( ruleInterfaceDeclaration ) );
    public final void rule__Root__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1568:1: ( ( ruleExpression ) | ( ruleInterfaceDeclaration ) )
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
                    // InternalKExpressions.g:1569:1: ( ruleExpression )
                    {
                    // InternalKExpressions.g:1569:1: ( ruleExpression )
                    // InternalKExpressions.g:1570:1: ruleExpression
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
                    // InternalKExpressions.g:1575:6: ( ruleInterfaceDeclaration )
                    {
                    // InternalKExpressions.g:1575:6: ( ruleInterfaceDeclaration )
                    // InternalKExpressions.g:1576:1: ruleInterfaceDeclaration
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
    // InternalKExpressions.g:1586:1: rule__Expression__Alternatives : ( ( ( ruleBooleanExpression ) ) | ( ruleValuedExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1590:1: ( ( ( ruleBooleanExpression ) ) | ( ruleValuedExpression ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalKExpressions.g:1591:1: ( ( ruleBooleanExpression ) )
                    {
                    // InternalKExpressions.g:1591:1: ( ( ruleBooleanExpression ) )
                    // InternalKExpressions.g:1592:1: ( ruleBooleanExpression )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall_0()); 
                    }
                    // InternalKExpressions.g:1593:1: ( ruleBooleanExpression )
                    // InternalKExpressions.g:1593:3: ruleBooleanExpression
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
                    // InternalKExpressions.g:1597:6: ( ruleValuedExpression )
                    {
                    // InternalKExpressions.g:1597:6: ( ruleValuedExpression )
                    // InternalKExpressions.g:1598:1: ruleValuedExpression
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
    // InternalKExpressions.g:1608:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );
    public final void rule__CompareOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1612:1: ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalKExpressions.g:1613:1: ( ( rule__CompareOperation__Group_0__0 ) )
                    {
                    // InternalKExpressions.g:1613:1: ( ( rule__CompareOperation__Group_0__0 ) )
                    // InternalKExpressions.g:1614:1: ( rule__CompareOperation__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperationAccess().getGroup_0()); 
                    }
                    // InternalKExpressions.g:1615:1: ( rule__CompareOperation__Group_0__0 )
                    // InternalKExpressions.g:1615:2: rule__CompareOperation__Group_0__0
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
                    // InternalKExpressions.g:1619:6: ( ruleNotExpression )
                    {
                    // InternalKExpressions.g:1619:6: ( ruleNotExpression )
                    // InternalKExpressions.g:1620:1: ruleNotExpression
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
    // InternalKExpressions.g:1630:1: rule__NotOrValuedExpression__Alternatives : ( ( ( ruleValuedExpression ) ) | ( ruleNotExpression ) );
    public final void rule__NotOrValuedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1634:1: ( ( ( ruleValuedExpression ) ) | ( ruleNotExpression ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalKExpressions.g:1635:1: ( ( ruleValuedExpression ) )
                    {
                    // InternalKExpressions.g:1635:1: ( ( ruleValuedExpression ) )
                    // InternalKExpressions.g:1636:1: ( ruleValuedExpression )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
                    }
                    // InternalKExpressions.g:1637:1: ( ruleValuedExpression )
                    // InternalKExpressions.g:1637:3: ruleValuedExpression
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
                    // InternalKExpressions.g:1641:6: ( ruleNotExpression )
                    {
                    // InternalKExpressions.g:1641:6: ( ruleNotExpression )
                    // InternalKExpressions.g:1642:1: ruleNotExpression
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
    // InternalKExpressions.g:1652:1: rule__NotExpression__Alternatives : ( ( ( rule__NotExpression__Group_0__0 ) ) | ( ruleAtomicExpression ) );
    public final void rule__NotExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1656:1: ( ( ( rule__NotExpression__Group_0__0 ) ) | ( ruleAtomicExpression ) )
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
                    // InternalKExpressions.g:1657:1: ( ( rule__NotExpression__Group_0__0 ) )
                    {
                    // InternalKExpressions.g:1657:1: ( ( rule__NotExpression__Group_0__0 ) )
                    // InternalKExpressions.g:1658:1: ( rule__NotExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNotExpressionAccess().getGroup_0()); 
                    }
                    // InternalKExpressions.g:1659:1: ( rule__NotExpression__Group_0__0 )
                    // InternalKExpressions.g:1659:2: rule__NotExpression__Group_0__0
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
                    // InternalKExpressions.g:1663:6: ( ruleAtomicExpression )
                    {
                    // InternalKExpressions.g:1663:6: ( ruleAtomicExpression )
                    // InternalKExpressions.g:1664:1: ruleAtomicExpression
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
    // InternalKExpressions.g:1674:1: rule__NegExpression__Alternatives : ( ( ( rule__NegExpression__Group_0__0 ) ) | ( ruleAtomicValuedExpression ) );
    public final void rule__NegExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1678:1: ( ( ( rule__NegExpression__Group_0__0 ) ) | ( ruleAtomicValuedExpression ) )
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
                    // InternalKExpressions.g:1679:1: ( ( rule__NegExpression__Group_0__0 ) )
                    {
                    // InternalKExpressions.g:1679:1: ( ( rule__NegExpression__Group_0__0 ) )
                    // InternalKExpressions.g:1680:1: ( rule__NegExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNegExpressionAccess().getGroup_0()); 
                    }
                    // InternalKExpressions.g:1681:1: ( rule__NegExpression__Group_0__0 )
                    // InternalKExpressions.g:1681:2: rule__NegExpression__Group_0__0
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
                    // InternalKExpressions.g:1685:6: ( ruleAtomicValuedExpression )
                    {
                    // InternalKExpressions.g:1685:6: ( ruleAtomicValuedExpression )
                    // InternalKExpressions.g:1686:1: ruleAtomicValuedExpression
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
    // InternalKExpressions.g:1696:1: rule__AtomicExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleValuedObjectTestExpression ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ruleTextExpression ) );
    public final void rule__AtomicExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1700:1: ( ( ruleBooleanValue ) | ( ruleValuedObjectTestExpression ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ruleTextExpression ) )
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
                    // InternalKExpressions.g:1701:1: ( ruleBooleanValue )
                    {
                    // InternalKExpressions.g:1701:1: ( ruleBooleanValue )
                    // InternalKExpressions.g:1702:1: ruleBooleanValue
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
                    // InternalKExpressions.g:1707:6: ( ruleValuedObjectTestExpression )
                    {
                    // InternalKExpressions.g:1707:6: ( ruleValuedObjectTestExpression )
                    // InternalKExpressions.g:1708:1: ruleValuedObjectTestExpression
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
                    // InternalKExpressions.g:1713:6: ( ( rule__AtomicExpression__Group_2__0 ) )
                    {
                    // InternalKExpressions.g:1713:6: ( ( rule__AtomicExpression__Group_2__0 ) )
                    // InternalKExpressions.g:1714:1: ( rule__AtomicExpression__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getGroup_2()); 
                    }
                    // InternalKExpressions.g:1715:1: ( rule__AtomicExpression__Group_2__0 )
                    // InternalKExpressions.g:1715:2: rule__AtomicExpression__Group_2__0
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
                    // InternalKExpressions.g:1719:6: ( ruleTextExpression )
                    {
                    // InternalKExpressions.g:1719:6: ( ruleTextExpression )
                    // InternalKExpressions.g:1720:1: ruleTextExpression
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
    // InternalKExpressions.g:1730:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ( rule__AtomicValuedExpression__Group_2__0 ) ) | ( ruleAtomicExpression ) );
    public final void rule__AtomicValuedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1734:1: ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ( rule__AtomicValuedExpression__Group_2__0 ) ) | ( ruleAtomicExpression ) )
            int alt8=4;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalKExpressions.g:1735:1: ( ruleIntValue )
                    {
                    // InternalKExpressions.g:1735:1: ( ruleIntValue )
                    // InternalKExpressions.g:1736:1: ruleIntValue
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
                    // InternalKExpressions.g:1741:6: ( ruleFloatValue )
                    {
                    // InternalKExpressions.g:1741:6: ( ruleFloatValue )
                    // InternalKExpressions.g:1742:1: ruleFloatValue
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
                    // InternalKExpressions.g:1747:6: ( ( rule__AtomicValuedExpression__Group_2__0 ) )
                    {
                    // InternalKExpressions.g:1747:6: ( ( rule__AtomicValuedExpression__Group_2__0 ) )
                    // InternalKExpressions.g:1748:1: ( rule__AtomicValuedExpression__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_2()); 
                    }
                    // InternalKExpressions.g:1749:1: ( rule__AtomicValuedExpression__Group_2__0 )
                    // InternalKExpressions.g:1749:2: rule__AtomicValuedExpression__Group_2__0
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
                    // InternalKExpressions.g:1753:6: ( ruleAtomicExpression )
                    {
                    // InternalKExpressions.g:1753:6: ( ruleAtomicExpression )
                    // InternalKExpressions.g:1754:1: ruleAtomicExpression
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
    // InternalKExpressions.g:1764:1: rule__ValuedObjectTestExpression__Alternatives : ( ( ( rule__ValuedObjectTestExpression__Group_0__0 ) ) | ( ( rule__ValuedObjectTestExpression__Group_1__0 ) ) | ( ruleValuedObjectReference ) );
    public final void rule__ValuedObjectTestExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1768:1: ( ( ( rule__ValuedObjectTestExpression__Group_0__0 ) ) | ( ( rule__ValuedObjectTestExpression__Group_1__0 ) ) | ( ruleValuedObjectReference ) )
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
                    // InternalKExpressions.g:1769:1: ( ( rule__ValuedObjectTestExpression__Group_0__0 ) )
                    {
                    // InternalKExpressions.g:1769:1: ( ( rule__ValuedObjectTestExpression__Group_0__0 ) )
                    // InternalKExpressions.g:1770:1: ( rule__ValuedObjectTestExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getGroup_0()); 
                    }
                    // InternalKExpressions.g:1771:1: ( rule__ValuedObjectTestExpression__Group_0__0 )
                    // InternalKExpressions.g:1771:2: rule__ValuedObjectTestExpression__Group_0__0
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
                    // InternalKExpressions.g:1775:6: ( ( rule__ValuedObjectTestExpression__Group_1__0 ) )
                    {
                    // InternalKExpressions.g:1775:6: ( ( rule__ValuedObjectTestExpression__Group_1__0 ) )
                    // InternalKExpressions.g:1776:1: ( rule__ValuedObjectTestExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getGroup_1()); 
                    }
                    // InternalKExpressions.g:1777:1: ( rule__ValuedObjectTestExpression__Group_1__0 )
                    // InternalKExpressions.g:1777:2: rule__ValuedObjectTestExpression__Group_1__0
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
                    // InternalKExpressions.g:1781:6: ( ruleValuedObjectReference )
                    {
                    // InternalKExpressions.g:1781:6: ( ruleValuedObjectReference )
                    // InternalKExpressions.g:1782:1: ruleValuedObjectReference
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
    // InternalKExpressions.g:1793:1: rule__InterfaceDeclaration__Alternatives : ( ( ruleInterfaceSignalDecl ) | ( ruleInterfaceVariableDecl ) );
    public final void rule__InterfaceDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1797:1: ( ( ruleInterfaceSignalDecl ) | ( ruleInterfaceVariableDecl ) )
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
                    // InternalKExpressions.g:1798:1: ( ruleInterfaceSignalDecl )
                    {
                    // InternalKExpressions.g:1798:1: ( ruleInterfaceSignalDecl )
                    // InternalKExpressions.g:1799:1: ruleInterfaceSignalDecl
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
                    // InternalKExpressions.g:1804:6: ( ruleInterfaceVariableDecl )
                    {
                    // InternalKExpressions.g:1804:6: ( ruleInterfaceVariableDecl )
                    // InternalKExpressions.g:1805:1: ruleInterfaceVariableDecl
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
    // InternalKExpressions.g:1815:1: rule__InterfaceSignalDecl__Alternatives : ( ( ( rule__InterfaceSignalDecl__Group_0__0 ) ) | ( ( rule__InterfaceSignalDecl__Group_1__0 ) ) | ( ( rule__InterfaceSignalDecl__Group_2__0 ) ) | ( ( rule__InterfaceSignalDecl__Group_3__0 ) ) );
    public final void rule__InterfaceSignalDecl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1819:1: ( ( ( rule__InterfaceSignalDecl__Group_0__0 ) ) | ( ( rule__InterfaceSignalDecl__Group_1__0 ) ) | ( ( rule__InterfaceSignalDecl__Group_2__0 ) ) | ( ( rule__InterfaceSignalDecl__Group_3__0 ) ) )
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
                    // InternalKExpressions.g:1820:1: ( ( rule__InterfaceSignalDecl__Group_0__0 ) )
                    {
                    // InternalKExpressions.g:1820:1: ( ( rule__InterfaceSignalDecl__Group_0__0 ) )
                    // InternalKExpressions.g:1821:1: ( rule__InterfaceSignalDecl__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInterfaceSignalDeclAccess().getGroup_0()); 
                    }
                    // InternalKExpressions.g:1822:1: ( rule__InterfaceSignalDecl__Group_0__0 )
                    // InternalKExpressions.g:1822:2: rule__InterfaceSignalDecl__Group_0__0
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
                    // InternalKExpressions.g:1826:6: ( ( rule__InterfaceSignalDecl__Group_1__0 ) )
                    {
                    // InternalKExpressions.g:1826:6: ( ( rule__InterfaceSignalDecl__Group_1__0 ) )
                    // InternalKExpressions.g:1827:1: ( rule__InterfaceSignalDecl__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInterfaceSignalDeclAccess().getGroup_1()); 
                    }
                    // InternalKExpressions.g:1828:1: ( rule__InterfaceSignalDecl__Group_1__0 )
                    // InternalKExpressions.g:1828:2: rule__InterfaceSignalDecl__Group_1__0
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
                    // InternalKExpressions.g:1832:6: ( ( rule__InterfaceSignalDecl__Group_2__0 ) )
                    {
                    // InternalKExpressions.g:1832:6: ( ( rule__InterfaceSignalDecl__Group_2__0 ) )
                    // InternalKExpressions.g:1833:1: ( rule__InterfaceSignalDecl__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInterfaceSignalDeclAccess().getGroup_2()); 
                    }
                    // InternalKExpressions.g:1834:1: ( rule__InterfaceSignalDecl__Group_2__0 )
                    // InternalKExpressions.g:1834:2: rule__InterfaceSignalDecl__Group_2__0
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
                    // InternalKExpressions.g:1838:6: ( ( rule__InterfaceSignalDecl__Group_3__0 ) )
                    {
                    // InternalKExpressions.g:1838:6: ( ( rule__InterfaceSignalDecl__Group_3__0 ) )
                    // InternalKExpressions.g:1839:1: ( rule__InterfaceSignalDecl__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInterfaceSignalDeclAccess().getGroup_3()); 
                    }
                    // InternalKExpressions.g:1840:1: ( rule__InterfaceSignalDecl__Group_3__0 )
                    // InternalKExpressions.g:1840:2: rule__InterfaceSignalDecl__Group_3__0
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
    // InternalKExpressions.g:1849:1: rule__ChannelDescription__Alternatives : ( ( ( rule__ChannelDescription__Group_0__0 ) ) | ( ( rule__ChannelDescription__Group_1__0 ) ) | ( ( rule__ChannelDescription__Group_2__0 ) ) );
    public final void rule__ChannelDescription__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1853:1: ( ( ( rule__ChannelDescription__Group_0__0 ) ) | ( ( rule__ChannelDescription__Group_1__0 ) ) | ( ( rule__ChannelDescription__Group_2__0 ) ) )
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
                    // InternalKExpressions.g:1854:1: ( ( rule__ChannelDescription__Group_0__0 ) )
                    {
                    // InternalKExpressions.g:1854:1: ( ( rule__ChannelDescription__Group_0__0 ) )
                    // InternalKExpressions.g:1855:1: ( rule__ChannelDescription__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getChannelDescriptionAccess().getGroup_0()); 
                    }
                    // InternalKExpressions.g:1856:1: ( rule__ChannelDescription__Group_0__0 )
                    // InternalKExpressions.g:1856:2: rule__ChannelDescription__Group_0__0
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
                    // InternalKExpressions.g:1860:6: ( ( rule__ChannelDescription__Group_1__0 ) )
                    {
                    // InternalKExpressions.g:1860:6: ( ( rule__ChannelDescription__Group_1__0 ) )
                    // InternalKExpressions.g:1861:1: ( rule__ChannelDescription__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getChannelDescriptionAccess().getGroup_1()); 
                    }
                    // InternalKExpressions.g:1862:1: ( rule__ChannelDescription__Group_1__0 )
                    // InternalKExpressions.g:1862:2: rule__ChannelDescription__Group_1__0
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
                    // InternalKExpressions.g:1866:6: ( ( rule__ChannelDescription__Group_2__0 ) )
                    {
                    // InternalKExpressions.g:1866:6: ( ( rule__ChannelDescription__Group_2__0 ) )
                    // InternalKExpressions.g:1867:1: ( rule__ChannelDescription__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getChannelDescriptionAccess().getGroup_2()); 
                    }
                    // InternalKExpressions.g:1868:1: ( rule__ChannelDescription__Group_2__0 )
                    // InternalKExpressions.g:1868:2: rule__ChannelDescription__Group_2__0
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
    // InternalKExpressions.g:1877:1: rule__TypeIdentifier__Alternatives : ( ( ( rule__TypeIdentifier__TypeAssignment_0 ) ) | ( ( rule__TypeIdentifier__TypeIDAssignment_1 ) ) | ( ( rule__TypeIdentifier__Group_2__0 ) ) );
    public final void rule__TypeIdentifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1881:1: ( ( ( rule__TypeIdentifier__TypeAssignment_0 ) ) | ( ( rule__TypeIdentifier__TypeIDAssignment_1 ) ) | ( ( rule__TypeIdentifier__Group_2__0 ) ) )
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
                    // InternalKExpressions.g:1882:1: ( ( rule__TypeIdentifier__TypeAssignment_0 ) )
                    {
                    // InternalKExpressions.g:1882:1: ( ( rule__TypeIdentifier__TypeAssignment_0 ) )
                    // InternalKExpressions.g:1883:1: ( rule__TypeIdentifier__TypeAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeIdentifierAccess().getTypeAssignment_0()); 
                    }
                    // InternalKExpressions.g:1884:1: ( rule__TypeIdentifier__TypeAssignment_0 )
                    // InternalKExpressions.g:1884:2: rule__TypeIdentifier__TypeAssignment_0
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
                    // InternalKExpressions.g:1888:6: ( ( rule__TypeIdentifier__TypeIDAssignment_1 ) )
                    {
                    // InternalKExpressions.g:1888:6: ( ( rule__TypeIdentifier__TypeIDAssignment_1 ) )
                    // InternalKExpressions.g:1889:1: ( rule__TypeIdentifier__TypeIDAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeIdentifierAccess().getTypeIDAssignment_1()); 
                    }
                    // InternalKExpressions.g:1890:1: ( rule__TypeIdentifier__TypeIDAssignment_1 )
                    // InternalKExpressions.g:1890:2: rule__TypeIdentifier__TypeIDAssignment_1
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
                    // InternalKExpressions.g:1894:6: ( ( rule__TypeIdentifier__Group_2__0 ) )
                    {
                    // InternalKExpressions.g:1894:6: ( ( rule__TypeIdentifier__Group_2__0 ) )
                    // InternalKExpressions.g:1895:1: ( rule__TypeIdentifier__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeIdentifierAccess().getGroup_2()); 
                    }
                    // InternalKExpressions.g:1896:1: ( rule__TypeIdentifier__Group_2__0 )
                    // InternalKExpressions.g:1896:2: rule__TypeIdentifier__Group_2__0
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
    // InternalKExpressions.g:1905:1: rule__TypeIdentifier__Alternatives_2_1 : ( ( ( rule__TypeIdentifier__TypeAssignment_2_1_0 ) ) | ( ( rule__TypeIdentifier__TypeIDAssignment_2_1_1 ) ) );
    public final void rule__TypeIdentifier__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1909:1: ( ( ( rule__TypeIdentifier__TypeAssignment_2_1_0 ) ) | ( ( rule__TypeIdentifier__TypeIDAssignment_2_1_1 ) ) )
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
                    // InternalKExpressions.g:1910:1: ( ( rule__TypeIdentifier__TypeAssignment_2_1_0 ) )
                    {
                    // InternalKExpressions.g:1910:1: ( ( rule__TypeIdentifier__TypeAssignment_2_1_0 ) )
                    // InternalKExpressions.g:1911:1: ( rule__TypeIdentifier__TypeAssignment_2_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeIdentifierAccess().getTypeAssignment_2_1_0()); 
                    }
                    // InternalKExpressions.g:1912:1: ( rule__TypeIdentifier__TypeAssignment_2_1_0 )
                    // InternalKExpressions.g:1912:2: rule__TypeIdentifier__TypeAssignment_2_1_0
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
                    // InternalKExpressions.g:1916:6: ( ( rule__TypeIdentifier__TypeIDAssignment_2_1_1 ) )
                    {
                    // InternalKExpressions.g:1916:6: ( ( rule__TypeIdentifier__TypeIDAssignment_2_1_1 ) )
                    // InternalKExpressions.g:1917:1: ( rule__TypeIdentifier__TypeIDAssignment_2_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeIdentifierAccess().getTypeIDAssignment_2_1_1()); 
                    }
                    // InternalKExpressions.g:1918:1: ( rule__TypeIdentifier__TypeIDAssignment_2_1_1 )
                    // InternalKExpressions.g:1918:2: rule__TypeIdentifier__TypeIDAssignment_2_1_1
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
    // InternalKExpressions.g:1932:1: rule__EStringBoolean__Alternatives : ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) );
    public final void rule__EStringBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1936:1: ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) )
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
                    // InternalKExpressions.g:1937:1: ( RULE_STRING )
                    {
                    // InternalKExpressions.g:1937:1: ( RULE_STRING )
                    // InternalKExpressions.g:1938:1: RULE_STRING
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
                    // InternalKExpressions.g:1943:6: ( ruleExtendedID )
                    {
                    // InternalKExpressions.g:1943:6: ( ruleExtendedID )
                    // InternalKExpressions.g:1944:1: ruleExtendedID
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
                    // InternalKExpressions.g:1949:6: ( RULE_BOOLEAN )
                    {
                    // InternalKExpressions.g:1949:6: ( RULE_BOOLEAN )
                    // InternalKExpressions.g:1950:1: RULE_BOOLEAN
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
    // InternalKExpressions.g:1960:1: rule__EStringAllTypes__Alternatives : ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) | ( ruleInteger ) | ( ruleFloateger ) );
    public final void rule__EStringAllTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:1964:1: ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) | ( ruleInteger ) | ( ruleFloateger ) )
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
            case 21:
                {
                int LA16_4 = input.LA(2);

                if ( (LA16_4==RULE_INT) ) {
                    alt16=4;
                }
                else if ( (LA16_4==RULE_FLOAT) ) {
                    alt16=5;
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
                    // InternalKExpressions.g:1965:1: ( RULE_STRING )
                    {
                    // InternalKExpressions.g:1965:1: ( RULE_STRING )
                    // InternalKExpressions.g:1966:1: RULE_STRING
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
                    // InternalKExpressions.g:1971:6: ( ruleExtendedID )
                    {
                    // InternalKExpressions.g:1971:6: ( ruleExtendedID )
                    // InternalKExpressions.g:1972:1: ruleExtendedID
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
                    // InternalKExpressions.g:1977:6: ( RULE_BOOLEAN )
                    {
                    // InternalKExpressions.g:1977:6: ( RULE_BOOLEAN )
                    // InternalKExpressions.g:1978:1: RULE_BOOLEAN
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
                    // InternalKExpressions.g:1983:6: ( ruleInteger )
                    {
                    // InternalKExpressions.g:1983:6: ( ruleInteger )
                    // InternalKExpressions.g:1984:1: ruleInteger
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
                    // InternalKExpressions.g:1989:6: ( ruleFloateger )
                    {
                    // InternalKExpressions.g:1989:6: ( ruleFloateger )
                    // InternalKExpressions.g:1990:1: ruleFloateger
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


    // $ANTLR start "rule__CompareOperator__Alternatives"
    // InternalKExpressions.g:2000:1: rule__CompareOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2004:1: ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) )
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
                    // InternalKExpressions.g:2005:1: ( ( '=' ) )
                    {
                    // InternalKExpressions.g:2005:1: ( ( '=' ) )
                    // InternalKExpressions.g:2006:1: ( '=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // InternalKExpressions.g:2007:1: ( '=' )
                    // InternalKExpressions.g:2007:3: '='
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
                    // InternalKExpressions.g:2012:6: ( ( '<' ) )
                    {
                    // InternalKExpressions.g:2012:6: ( ( '<' ) )
                    // InternalKExpressions.g:2013:1: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }
                    // InternalKExpressions.g:2014:1: ( '<' )
                    // InternalKExpressions.g:2014:3: '<'
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
                    // InternalKExpressions.g:2019:6: ( ( '<=' ) )
                    {
                    // InternalKExpressions.g:2019:6: ( ( '<=' ) )
                    // InternalKExpressions.g:2020:1: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }
                    // InternalKExpressions.g:2021:1: ( '<=' )
                    // InternalKExpressions.g:2021:3: '<='
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
                    // InternalKExpressions.g:2026:6: ( ( '>' ) )
                    {
                    // InternalKExpressions.g:2026:6: ( ( '>' ) )
                    // InternalKExpressions.g:2027:1: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }
                    // InternalKExpressions.g:2028:1: ( '>' )
                    // InternalKExpressions.g:2028:3: '>'
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
                    // InternalKExpressions.g:2033:6: ( ( '>=' ) )
                    {
                    // InternalKExpressions.g:2033:6: ( ( '>=' ) )
                    // InternalKExpressions.g:2034:1: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }
                    // InternalKExpressions.g:2035:1: ( '>=' )
                    // InternalKExpressions.g:2035:3: '>='
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
                    // InternalKExpressions.g:2040:6: ( ( '<>' ) )
                    {
                    // InternalKExpressions.g:2040:6: ( ( '<>' ) )
                    // InternalKExpressions.g:2041:1: ( '<>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_5()); 
                    }
                    // InternalKExpressions.g:2042:1: ( '<>' )
                    // InternalKExpressions.g:2042:3: '<>'
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
    // InternalKExpressions.g:2052:1: rule__ValueType__Alternatives : ( ( ( 'pure' ) ) | ( ( 'boolean' ) ) | ( ( 'unsigned' ) ) | ( ( 'integer' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'string' ) ) | ( ( 'host' ) ) );
    public final void rule__ValueType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2056:1: ( ( ( 'pure' ) ) | ( ( 'boolean' ) ) | ( ( 'unsigned' ) ) | ( ( 'integer' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'string' ) ) | ( ( 'host' ) ) )
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
                    // InternalKExpressions.g:2057:1: ( ( 'pure' ) )
                    {
                    // InternalKExpressions.g:2057:1: ( ( 'pure' ) )
                    // InternalKExpressions.g:2058:1: ( 'pure' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0()); 
                    }
                    // InternalKExpressions.g:2059:1: ( 'pure' )
                    // InternalKExpressions.g:2059:3: 'pure'
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
                    // InternalKExpressions.g:2064:6: ( ( 'boolean' ) )
                    {
                    // InternalKExpressions.g:2064:6: ( ( 'boolean' ) )
                    // InternalKExpressions.g:2065:1: ( 'boolean' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1()); 
                    }
                    // InternalKExpressions.g:2066:1: ( 'boolean' )
                    // InternalKExpressions.g:2066:3: 'boolean'
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
                    // InternalKExpressions.g:2071:6: ( ( 'unsigned' ) )
                    {
                    // InternalKExpressions.g:2071:6: ( ( 'unsigned' ) )
                    // InternalKExpressions.g:2072:1: ( 'unsigned' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2()); 
                    }
                    // InternalKExpressions.g:2073:1: ( 'unsigned' )
                    // InternalKExpressions.g:2073:3: 'unsigned'
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
                    // InternalKExpressions.g:2078:6: ( ( 'integer' ) )
                    {
                    // InternalKExpressions.g:2078:6: ( ( 'integer' ) )
                    // InternalKExpressions.g:2079:1: ( 'integer' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3()); 
                    }
                    // InternalKExpressions.g:2080:1: ( 'integer' )
                    // InternalKExpressions.g:2080:3: 'integer'
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
                    // InternalKExpressions.g:2085:6: ( ( 'float' ) )
                    {
                    // InternalKExpressions.g:2085:6: ( ( 'float' ) )
                    // InternalKExpressions.g:2086:1: ( 'float' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4()); 
                    }
                    // InternalKExpressions.g:2087:1: ( 'float' )
                    // InternalKExpressions.g:2087:3: 'float'
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
                    // InternalKExpressions.g:2092:6: ( ( 'double' ) )
                    {
                    // InternalKExpressions.g:2092:6: ( ( 'double' ) )
                    // InternalKExpressions.g:2093:1: ( 'double' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getDOUBLEEnumLiteralDeclaration_5()); 
                    }
                    // InternalKExpressions.g:2094:1: ( 'double' )
                    // InternalKExpressions.g:2094:3: 'double'
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
                    // InternalKExpressions.g:2099:6: ( ( 'string' ) )
                    {
                    // InternalKExpressions.g:2099:6: ( ( 'string' ) )
                    // InternalKExpressions.g:2100:1: ( 'string' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_6()); 
                    }
                    // InternalKExpressions.g:2101:1: ( 'string' )
                    // InternalKExpressions.g:2101:3: 'string'
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
                    // InternalKExpressions.g:2106:6: ( ( 'host' ) )
                    {
                    // InternalKExpressions.g:2106:6: ( ( 'host' ) )
                    // InternalKExpressions.g:2107:1: ( 'host' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getHOSTEnumLiteralDeclaration_7()); 
                    }
                    // InternalKExpressions.g:2108:1: ( 'host' )
                    // InternalKExpressions.g:2108:3: 'host'
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
    // InternalKExpressions.g:2118:1: rule__CombineOperator__Alternatives : ( ( ( 'none' ) ) | ( ( '+' ) ) | ( ( '*' ) ) | ( ( 'max' ) ) | ( ( 'min' ) ) | ( ( 'or' ) ) | ( ( 'and' ) ) | ( ( 'host' ) ) );
    public final void rule__CombineOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2122:1: ( ( ( 'none' ) ) | ( ( '+' ) ) | ( ( '*' ) ) | ( ( 'max' ) ) | ( ( 'min' ) ) | ( ( 'or' ) ) | ( ( 'and' ) ) | ( ( 'host' ) ) )
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
                    // InternalKExpressions.g:2123:1: ( ( 'none' ) )
                    {
                    // InternalKExpressions.g:2123:1: ( ( 'none' ) )
                    // InternalKExpressions.g:2124:1: ( 'none' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 
                    }
                    // InternalKExpressions.g:2125:1: ( 'none' )
                    // InternalKExpressions.g:2125:3: 'none'
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
                    // InternalKExpressions.g:2130:6: ( ( '+' ) )
                    {
                    // InternalKExpressions.g:2130:6: ( ( '+' ) )
                    // InternalKExpressions.g:2131:1: ( '+' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 
                    }
                    // InternalKExpressions.g:2132:1: ( '+' )
                    // InternalKExpressions.g:2132:3: '+'
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
                    // InternalKExpressions.g:2137:6: ( ( '*' ) )
                    {
                    // InternalKExpressions.g:2137:6: ( ( '*' ) )
                    // InternalKExpressions.g:2138:1: ( '*' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 
                    }
                    // InternalKExpressions.g:2139:1: ( '*' )
                    // InternalKExpressions.g:2139:3: '*'
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
                    // InternalKExpressions.g:2144:6: ( ( 'max' ) )
                    {
                    // InternalKExpressions.g:2144:6: ( ( 'max' ) )
                    // InternalKExpressions.g:2145:1: ( 'max' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3()); 
                    }
                    // InternalKExpressions.g:2146:1: ( 'max' )
                    // InternalKExpressions.g:2146:3: 'max'
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
                    // InternalKExpressions.g:2151:6: ( ( 'min' ) )
                    {
                    // InternalKExpressions.g:2151:6: ( ( 'min' ) )
                    // InternalKExpressions.g:2152:1: ( 'min' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4()); 
                    }
                    // InternalKExpressions.g:2153:1: ( 'min' )
                    // InternalKExpressions.g:2153:3: 'min'
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
                    // InternalKExpressions.g:2158:6: ( ( 'or' ) )
                    {
                    // InternalKExpressions.g:2158:6: ( ( 'or' ) )
                    // InternalKExpressions.g:2159:1: ( 'or' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5()); 
                    }
                    // InternalKExpressions.g:2160:1: ( 'or' )
                    // InternalKExpressions.g:2160:3: 'or'
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
                    // InternalKExpressions.g:2165:6: ( ( 'and' ) )
                    {
                    // InternalKExpressions.g:2165:6: ( ( 'and' ) )
                    // InternalKExpressions.g:2166:1: ( 'and' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                    }
                    // InternalKExpressions.g:2167:1: ( 'and' )
                    // InternalKExpressions.g:2167:3: 'and'
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
                    // InternalKExpressions.g:2172:6: ( ( 'host' ) )
                    {
                    // InternalKExpressions.g:2172:6: ( ( 'host' ) )
                    // InternalKExpressions.g:2173:1: ( 'host' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCombineOperatorAccess().getHOSTEnumLiteralDeclaration_7()); 
                    }
                    // InternalKExpressions.g:2174:1: ( 'host' )
                    // InternalKExpressions.g:2174:3: 'host'
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
    // InternalKExpressions.g:2186:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2190:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // InternalKExpressions.g:2191:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
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
    // InternalKExpressions.g:2198:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2202:1: ( ( ruleAndExpression ) )
            // InternalKExpressions.g:2203:1: ( ruleAndExpression )
            {
            // InternalKExpressions.g:2203:1: ( ruleAndExpression )
            // InternalKExpressions.g:2204:1: ruleAndExpression
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
    // InternalKExpressions.g:2215:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2219:1: ( rule__OrExpression__Group__1__Impl )
            // InternalKExpressions.g:2220:2: rule__OrExpression__Group__1__Impl
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
    // InternalKExpressions.g:2226:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2230:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // InternalKExpressions.g:2231:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // InternalKExpressions.g:2231:1: ( ( rule__OrExpression__Group_1__0 )* )
            // InternalKExpressions.g:2232:1: ( rule__OrExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:2233:1: ( rule__OrExpression__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==17) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalKExpressions.g:2233:2: rule__OrExpression__Group_1__0
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
    // InternalKExpressions.g:2247:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2251:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // InternalKExpressions.g:2252:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
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
    // InternalKExpressions.g:2259:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2263:1: ( ( () ) )
            // InternalKExpressions.g:2264:1: ( () )
            {
            // InternalKExpressions.g:2264:1: ( () )
            // InternalKExpressions.g:2265:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:2266:1: ()
            // InternalKExpressions.g:2268:1: 
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
    // InternalKExpressions.g:2278:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2282:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // InternalKExpressions.g:2283:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
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
    // InternalKExpressions.g:2290:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2294:1: ( ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) )
            // InternalKExpressions.g:2295:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKExpressions.g:2295:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            // InternalKExpressions.g:2296:1: ( rule__OrExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKExpressions.g:2297:1: ( rule__OrExpression__OperatorAssignment_1_1 )
            // InternalKExpressions.g:2297:2: rule__OrExpression__OperatorAssignment_1_1
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
    // InternalKExpressions.g:2307:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2311:1: ( rule__OrExpression__Group_1__2__Impl )
            // InternalKExpressions.g:2312:2: rule__OrExpression__Group_1__2__Impl
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
    // InternalKExpressions.g:2318:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2322:1: ( ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) ) )
            // InternalKExpressions.g:2323:1: ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) )
            {
            // InternalKExpressions.g:2323:1: ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) )
            // InternalKExpressions.g:2324:1: ( rule__OrExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // InternalKExpressions.g:2325:1: ( rule__OrExpression__SubExpressionsAssignment_1_2 )
            // InternalKExpressions.g:2325:2: rule__OrExpression__SubExpressionsAssignment_1_2
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
    // InternalKExpressions.g:2341:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2345:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalKExpressions.g:2346:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
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
    // InternalKExpressions.g:2353:1: rule__AndExpression__Group__0__Impl : ( ruleCompareOperation ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2357:1: ( ( ruleCompareOperation ) )
            // InternalKExpressions.g:2358:1: ( ruleCompareOperation )
            {
            // InternalKExpressions.g:2358:1: ( ruleCompareOperation )
            // InternalKExpressions.g:2359:1: ruleCompareOperation
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
    // InternalKExpressions.g:2370:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2374:1: ( rule__AndExpression__Group__1__Impl )
            // InternalKExpressions.g:2375:2: rule__AndExpression__Group__1__Impl
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
    // InternalKExpressions.g:2381:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2385:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalKExpressions.g:2386:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalKExpressions.g:2386:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalKExpressions.g:2387:1: ( rule__AndExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:2388:1: ( rule__AndExpression__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==18) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalKExpressions.g:2388:2: rule__AndExpression__Group_1__0
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
    // InternalKExpressions.g:2402:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2406:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalKExpressions.g:2407:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
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
    // InternalKExpressions.g:2414:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2418:1: ( ( () ) )
            // InternalKExpressions.g:2419:1: ( () )
            {
            // InternalKExpressions.g:2419:1: ( () )
            // InternalKExpressions.g:2420:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:2421:1: ()
            // InternalKExpressions.g:2423:1: 
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
    // InternalKExpressions.g:2433:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2437:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // InternalKExpressions.g:2438:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
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
    // InternalKExpressions.g:2445:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2449:1: ( ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) )
            // InternalKExpressions.g:2450:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKExpressions.g:2450:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            // InternalKExpressions.g:2451:1: ( rule__AndExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKExpressions.g:2452:1: ( rule__AndExpression__OperatorAssignment_1_1 )
            // InternalKExpressions.g:2452:2: rule__AndExpression__OperatorAssignment_1_1
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
    // InternalKExpressions.g:2462:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2466:1: ( rule__AndExpression__Group_1__2__Impl )
            // InternalKExpressions.g:2467:2: rule__AndExpression__Group_1__2__Impl
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
    // InternalKExpressions.g:2473:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2477:1: ( ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) ) )
            // InternalKExpressions.g:2478:1: ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) )
            {
            // InternalKExpressions.g:2478:1: ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) )
            // InternalKExpressions.g:2479:1: ( rule__AndExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // InternalKExpressions.g:2480:1: ( rule__AndExpression__SubExpressionsAssignment_1_2 )
            // InternalKExpressions.g:2480:2: rule__AndExpression__SubExpressionsAssignment_1_2
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
    // InternalKExpressions.g:2496:1: rule__CompareOperation__Group_0__0 : rule__CompareOperation__Group_0__0__Impl rule__CompareOperation__Group_0__1 ;
    public final void rule__CompareOperation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2500:1: ( rule__CompareOperation__Group_0__0__Impl rule__CompareOperation__Group_0__1 )
            // InternalKExpressions.g:2501:2: rule__CompareOperation__Group_0__0__Impl rule__CompareOperation__Group_0__1
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
    // InternalKExpressions.g:2508:1: rule__CompareOperation__Group_0__0__Impl : ( ( ruleNotOrValuedExpression ) ) ;
    public final void rule__CompareOperation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2512:1: ( ( ( ruleNotOrValuedExpression ) ) )
            // InternalKExpressions.g:2513:1: ( ( ruleNotOrValuedExpression ) )
            {
            // InternalKExpressions.g:2513:1: ( ( ruleNotOrValuedExpression ) )
            // InternalKExpressions.g:2514:1: ( ruleNotOrValuedExpression )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0_0()); 
            }
            // InternalKExpressions.g:2515:1: ( ruleNotOrValuedExpression )
            // InternalKExpressions.g:2515:3: ruleNotOrValuedExpression
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
    // InternalKExpressions.g:2525:1: rule__CompareOperation__Group_0__1 : rule__CompareOperation__Group_0__1__Impl ;
    public final void rule__CompareOperation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2529:1: ( rule__CompareOperation__Group_0__1__Impl )
            // InternalKExpressions.g:2530:2: rule__CompareOperation__Group_0__1__Impl
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
    // InternalKExpressions.g:2536:1: rule__CompareOperation__Group_0__1__Impl : ( ( rule__CompareOperation__Group_0_1__0 ) ) ;
    public final void rule__CompareOperation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2540:1: ( ( ( rule__CompareOperation__Group_0_1__0 ) ) )
            // InternalKExpressions.g:2541:1: ( ( rule__CompareOperation__Group_0_1__0 ) )
            {
            // InternalKExpressions.g:2541:1: ( ( rule__CompareOperation__Group_0_1__0 ) )
            // InternalKExpressions.g:2542:1: ( rule__CompareOperation__Group_0_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGroup_0_1()); 
            }
            // InternalKExpressions.g:2543:1: ( rule__CompareOperation__Group_0_1__0 )
            // InternalKExpressions.g:2543:2: rule__CompareOperation__Group_0_1__0
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
    // InternalKExpressions.g:2557:1: rule__CompareOperation__Group_0_1__0 : rule__CompareOperation__Group_0_1__0__Impl rule__CompareOperation__Group_0_1__1 ;
    public final void rule__CompareOperation__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2561:1: ( rule__CompareOperation__Group_0_1__0__Impl rule__CompareOperation__Group_0_1__1 )
            // InternalKExpressions.g:2562:2: rule__CompareOperation__Group_0_1__0__Impl rule__CompareOperation__Group_0_1__1
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
    // InternalKExpressions.g:2569:1: rule__CompareOperation__Group_0_1__0__Impl : ( () ) ;
    public final void rule__CompareOperation__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2573:1: ( ( () ) )
            // InternalKExpressions.g:2574:1: ( () )
            {
            // InternalKExpressions.g:2574:1: ( () )
            // InternalKExpressions.g:2575:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_0_1_0()); 
            }
            // InternalKExpressions.g:2576:1: ()
            // InternalKExpressions.g:2578:1: 
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
    // InternalKExpressions.g:2588:1: rule__CompareOperation__Group_0_1__1 : rule__CompareOperation__Group_0_1__1__Impl rule__CompareOperation__Group_0_1__2 ;
    public final void rule__CompareOperation__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2592:1: ( rule__CompareOperation__Group_0_1__1__Impl rule__CompareOperation__Group_0_1__2 )
            // InternalKExpressions.g:2593:2: rule__CompareOperation__Group_0_1__1__Impl rule__CompareOperation__Group_0_1__2
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
    // InternalKExpressions.g:2600:1: rule__CompareOperation__Group_0_1__1__Impl : ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) ) ;
    public final void rule__CompareOperation__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2604:1: ( ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) ) )
            // InternalKExpressions.g:2605:1: ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) )
            {
            // InternalKExpressions.g:2605:1: ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) )
            // InternalKExpressions.g:2606:1: ( rule__CompareOperation__OperatorAssignment_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorAssignment_0_1_1()); 
            }
            // InternalKExpressions.g:2607:1: ( rule__CompareOperation__OperatorAssignment_0_1_1 )
            // InternalKExpressions.g:2607:2: rule__CompareOperation__OperatorAssignment_0_1_1
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
    // InternalKExpressions.g:2617:1: rule__CompareOperation__Group_0_1__2 : rule__CompareOperation__Group_0_1__2__Impl ;
    public final void rule__CompareOperation__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2621:1: ( rule__CompareOperation__Group_0_1__2__Impl )
            // InternalKExpressions.g:2622:2: rule__CompareOperation__Group_0_1__2__Impl
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
    // InternalKExpressions.g:2628:1: rule__CompareOperation__Group_0_1__2__Impl : ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) ) ;
    public final void rule__CompareOperation__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2632:1: ( ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) ) )
            // InternalKExpressions.g:2633:1: ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) )
            {
            // InternalKExpressions.g:2633:1: ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) )
            // InternalKExpressions.g:2634:1: ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsAssignment_0_1_2()); 
            }
            // InternalKExpressions.g:2635:1: ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 )
            // InternalKExpressions.g:2635:2: rule__CompareOperation__SubExpressionsAssignment_0_1_2
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
    // InternalKExpressions.g:2651:1: rule__NotExpression__Group_0__0 : rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1 ;
    public final void rule__NotExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2655:1: ( rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1 )
            // InternalKExpressions.g:2656:2: rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1
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
    // InternalKExpressions.g:2663:1: rule__NotExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__NotExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2667:1: ( ( () ) )
            // InternalKExpressions.g:2668:1: ( () )
            {
            // InternalKExpressions.g:2668:1: ( () )
            // InternalKExpressions.g:2669:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // InternalKExpressions.g:2670:1: ()
            // InternalKExpressions.g:2672:1: 
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
    // InternalKExpressions.g:2682:1: rule__NotExpression__Group_0__1 : rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2 ;
    public final void rule__NotExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2686:1: ( rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2 )
            // InternalKExpressions.g:2687:2: rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2
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
    // InternalKExpressions.g:2694:1: rule__NotExpression__Group_0__1__Impl : ( ( rule__NotExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__NotExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2698:1: ( ( ( rule__NotExpression__OperatorAssignment_0_1 ) ) )
            // InternalKExpressions.g:2699:1: ( ( rule__NotExpression__OperatorAssignment_0_1 ) )
            {
            // InternalKExpressions.g:2699:1: ( ( rule__NotExpression__OperatorAssignment_0_1 ) )
            // InternalKExpressions.g:2700:1: ( rule__NotExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // InternalKExpressions.g:2701:1: ( rule__NotExpression__OperatorAssignment_0_1 )
            // InternalKExpressions.g:2701:2: rule__NotExpression__OperatorAssignment_0_1
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
    // InternalKExpressions.g:2711:1: rule__NotExpression__Group_0__2 : rule__NotExpression__Group_0__2__Impl ;
    public final void rule__NotExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2715:1: ( rule__NotExpression__Group_0__2__Impl )
            // InternalKExpressions.g:2716:2: rule__NotExpression__Group_0__2__Impl
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
    // InternalKExpressions.g:2722:1: rule__NotExpression__Group_0__2__Impl : ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) ) ;
    public final void rule__NotExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2726:1: ( ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) ) )
            // InternalKExpressions.g:2727:1: ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) )
            {
            // InternalKExpressions.g:2727:1: ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) )
            // InternalKExpressions.g:2728:1: ( rule__NotExpression__SubExpressionsAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubExpressionsAssignment_0_2()); 
            }
            // InternalKExpressions.g:2729:1: ( rule__NotExpression__SubExpressionsAssignment_0_2 )
            // InternalKExpressions.g:2729:2: rule__NotExpression__SubExpressionsAssignment_0_2
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
    // InternalKExpressions.g:2745:1: rule__AddExpression__Group__0 : rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 ;
    public final void rule__AddExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2749:1: ( rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 )
            // InternalKExpressions.g:2750:2: rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1
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
    // InternalKExpressions.g:2757:1: rule__AddExpression__Group__0__Impl : ( ruleSubExpression ) ;
    public final void rule__AddExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2761:1: ( ( ruleSubExpression ) )
            // InternalKExpressions.g:2762:1: ( ruleSubExpression )
            {
            // InternalKExpressions.g:2762:1: ( ruleSubExpression )
            // InternalKExpressions.g:2763:1: ruleSubExpression
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
    // InternalKExpressions.g:2774:1: rule__AddExpression__Group__1 : rule__AddExpression__Group__1__Impl ;
    public final void rule__AddExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2778:1: ( rule__AddExpression__Group__1__Impl )
            // InternalKExpressions.g:2779:2: rule__AddExpression__Group__1__Impl
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
    // InternalKExpressions.g:2785:1: rule__AddExpression__Group__1__Impl : ( ( rule__AddExpression__Group_1__0 )* ) ;
    public final void rule__AddExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2789:1: ( ( ( rule__AddExpression__Group_1__0 )* ) )
            // InternalKExpressions.g:2790:1: ( ( rule__AddExpression__Group_1__0 )* )
            {
            // InternalKExpressions.g:2790:1: ( ( rule__AddExpression__Group_1__0 )* )
            // InternalKExpressions.g:2791:1: ( rule__AddExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:2792:1: ( rule__AddExpression__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==20) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalKExpressions.g:2792:2: rule__AddExpression__Group_1__0
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
    // InternalKExpressions.g:2806:1: rule__AddExpression__Group_1__0 : rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 ;
    public final void rule__AddExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2810:1: ( rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 )
            // InternalKExpressions.g:2811:2: rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1
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
    // InternalKExpressions.g:2818:1: rule__AddExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AddExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2822:1: ( ( () ) )
            // InternalKExpressions.g:2823:1: ( () )
            {
            // InternalKExpressions.g:2823:1: ( () )
            // InternalKExpressions.g:2824:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:2825:1: ()
            // InternalKExpressions.g:2827:1: 
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
    // InternalKExpressions.g:2837:1: rule__AddExpression__Group_1__1 : rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2 ;
    public final void rule__AddExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2841:1: ( rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2 )
            // InternalKExpressions.g:2842:2: rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2
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
    // InternalKExpressions.g:2849:1: rule__AddExpression__Group_1__1__Impl : ( ( rule__AddExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AddExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2853:1: ( ( ( rule__AddExpression__OperatorAssignment_1_1 ) ) )
            // InternalKExpressions.g:2854:1: ( ( rule__AddExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKExpressions.g:2854:1: ( ( rule__AddExpression__OperatorAssignment_1_1 ) )
            // InternalKExpressions.g:2855:1: ( rule__AddExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKExpressions.g:2856:1: ( rule__AddExpression__OperatorAssignment_1_1 )
            // InternalKExpressions.g:2856:2: rule__AddExpression__OperatorAssignment_1_1
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
    // InternalKExpressions.g:2866:1: rule__AddExpression__Group_1__2 : rule__AddExpression__Group_1__2__Impl ;
    public final void rule__AddExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2870:1: ( rule__AddExpression__Group_1__2__Impl )
            // InternalKExpressions.g:2871:2: rule__AddExpression__Group_1__2__Impl
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
    // InternalKExpressions.g:2877:1: rule__AddExpression__Group_1__2__Impl : ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__AddExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2881:1: ( ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) ) )
            // InternalKExpressions.g:2882:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) )
            {
            // InternalKExpressions.g:2882:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) )
            // InternalKExpressions.g:2883:1: ( rule__AddExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // InternalKExpressions.g:2884:1: ( rule__AddExpression__SubExpressionsAssignment_1_2 )
            // InternalKExpressions.g:2884:2: rule__AddExpression__SubExpressionsAssignment_1_2
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
    // InternalKExpressions.g:2900:1: rule__SubExpression__Group__0 : rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 ;
    public final void rule__SubExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2904:1: ( rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 )
            // InternalKExpressions.g:2905:2: rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1
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
    // InternalKExpressions.g:2912:1: rule__SubExpression__Group__0__Impl : ( ruleMultExpression ) ;
    public final void rule__SubExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2916:1: ( ( ruleMultExpression ) )
            // InternalKExpressions.g:2917:1: ( ruleMultExpression )
            {
            // InternalKExpressions.g:2917:1: ( ruleMultExpression )
            // InternalKExpressions.g:2918:1: ruleMultExpression
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
    // InternalKExpressions.g:2929:1: rule__SubExpression__Group__1 : rule__SubExpression__Group__1__Impl ;
    public final void rule__SubExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2933:1: ( rule__SubExpression__Group__1__Impl )
            // InternalKExpressions.g:2934:2: rule__SubExpression__Group__1__Impl
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
    // InternalKExpressions.g:2940:1: rule__SubExpression__Group__1__Impl : ( ( rule__SubExpression__Group_1__0 )* ) ;
    public final void rule__SubExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2944:1: ( ( ( rule__SubExpression__Group_1__0 )* ) )
            // InternalKExpressions.g:2945:1: ( ( rule__SubExpression__Group_1__0 )* )
            {
            // InternalKExpressions.g:2945:1: ( ( rule__SubExpression__Group_1__0 )* )
            // InternalKExpressions.g:2946:1: ( rule__SubExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:2947:1: ( rule__SubExpression__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==21) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalKExpressions.g:2947:2: rule__SubExpression__Group_1__0
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
    // InternalKExpressions.g:2961:1: rule__SubExpression__Group_1__0 : rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 ;
    public final void rule__SubExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2965:1: ( rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 )
            // InternalKExpressions.g:2966:2: rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1
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
    // InternalKExpressions.g:2973:1: rule__SubExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__SubExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2977:1: ( ( () ) )
            // InternalKExpressions.g:2978:1: ( () )
            {
            // InternalKExpressions.g:2978:1: ( () )
            // InternalKExpressions.g:2979:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:2980:1: ()
            // InternalKExpressions.g:2982:1: 
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
    // InternalKExpressions.g:2992:1: rule__SubExpression__Group_1__1 : rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2 ;
    public final void rule__SubExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:2996:1: ( rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2 )
            // InternalKExpressions.g:2997:2: rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2
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
    // InternalKExpressions.g:3004:1: rule__SubExpression__Group_1__1__Impl : ( ( rule__SubExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__SubExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3008:1: ( ( ( rule__SubExpression__OperatorAssignment_1_1 ) ) )
            // InternalKExpressions.g:3009:1: ( ( rule__SubExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKExpressions.g:3009:1: ( ( rule__SubExpression__OperatorAssignment_1_1 ) )
            // InternalKExpressions.g:3010:1: ( rule__SubExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKExpressions.g:3011:1: ( rule__SubExpression__OperatorAssignment_1_1 )
            // InternalKExpressions.g:3011:2: rule__SubExpression__OperatorAssignment_1_1
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
    // InternalKExpressions.g:3021:1: rule__SubExpression__Group_1__2 : rule__SubExpression__Group_1__2__Impl ;
    public final void rule__SubExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3025:1: ( rule__SubExpression__Group_1__2__Impl )
            // InternalKExpressions.g:3026:2: rule__SubExpression__Group_1__2__Impl
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
    // InternalKExpressions.g:3032:1: rule__SubExpression__Group_1__2__Impl : ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__SubExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3036:1: ( ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) ) )
            // InternalKExpressions.g:3037:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) )
            {
            // InternalKExpressions.g:3037:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) )
            // InternalKExpressions.g:3038:1: ( rule__SubExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // InternalKExpressions.g:3039:1: ( rule__SubExpression__SubExpressionsAssignment_1_2 )
            // InternalKExpressions.g:3039:2: rule__SubExpression__SubExpressionsAssignment_1_2
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
    // InternalKExpressions.g:3055:1: rule__MultExpression__Group__0 : rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 ;
    public final void rule__MultExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3059:1: ( rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 )
            // InternalKExpressions.g:3060:2: rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1
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
    // InternalKExpressions.g:3067:1: rule__MultExpression__Group__0__Impl : ( ruleDivExpression ) ;
    public final void rule__MultExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3071:1: ( ( ruleDivExpression ) )
            // InternalKExpressions.g:3072:1: ( ruleDivExpression )
            {
            // InternalKExpressions.g:3072:1: ( ruleDivExpression )
            // InternalKExpressions.g:3073:1: ruleDivExpression
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
    // InternalKExpressions.g:3084:1: rule__MultExpression__Group__1 : rule__MultExpression__Group__1__Impl ;
    public final void rule__MultExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3088:1: ( rule__MultExpression__Group__1__Impl )
            // InternalKExpressions.g:3089:2: rule__MultExpression__Group__1__Impl
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
    // InternalKExpressions.g:3095:1: rule__MultExpression__Group__1__Impl : ( ( rule__MultExpression__Group_1__0 )* ) ;
    public final void rule__MultExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3099:1: ( ( ( rule__MultExpression__Group_1__0 )* ) )
            // InternalKExpressions.g:3100:1: ( ( rule__MultExpression__Group_1__0 )* )
            {
            // InternalKExpressions.g:3100:1: ( ( rule__MultExpression__Group_1__0 )* )
            // InternalKExpressions.g:3101:1: ( rule__MultExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:3102:1: ( rule__MultExpression__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==22) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalKExpressions.g:3102:2: rule__MultExpression__Group_1__0
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
    // InternalKExpressions.g:3116:1: rule__MultExpression__Group_1__0 : rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 ;
    public final void rule__MultExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3120:1: ( rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 )
            // InternalKExpressions.g:3121:2: rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1
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
    // InternalKExpressions.g:3128:1: rule__MultExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3132:1: ( ( () ) )
            // InternalKExpressions.g:3133:1: ( () )
            {
            // InternalKExpressions.g:3133:1: ( () )
            // InternalKExpressions.g:3134:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:3135:1: ()
            // InternalKExpressions.g:3137:1: 
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
    // InternalKExpressions.g:3147:1: rule__MultExpression__Group_1__1 : rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2 ;
    public final void rule__MultExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3151:1: ( rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2 )
            // InternalKExpressions.g:3152:2: rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2
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
    // InternalKExpressions.g:3159:1: rule__MultExpression__Group_1__1__Impl : ( ( rule__MultExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3163:1: ( ( ( rule__MultExpression__OperatorAssignment_1_1 ) ) )
            // InternalKExpressions.g:3164:1: ( ( rule__MultExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKExpressions.g:3164:1: ( ( rule__MultExpression__OperatorAssignment_1_1 ) )
            // InternalKExpressions.g:3165:1: ( rule__MultExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKExpressions.g:3166:1: ( rule__MultExpression__OperatorAssignment_1_1 )
            // InternalKExpressions.g:3166:2: rule__MultExpression__OperatorAssignment_1_1
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
    // InternalKExpressions.g:3176:1: rule__MultExpression__Group_1__2 : rule__MultExpression__Group_1__2__Impl ;
    public final void rule__MultExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3180:1: ( rule__MultExpression__Group_1__2__Impl )
            // InternalKExpressions.g:3181:2: rule__MultExpression__Group_1__2__Impl
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
    // InternalKExpressions.g:3187:1: rule__MultExpression__Group_1__2__Impl : ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__MultExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3191:1: ( ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) ) )
            // InternalKExpressions.g:3192:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) )
            {
            // InternalKExpressions.g:3192:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) )
            // InternalKExpressions.g:3193:1: ( rule__MultExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // InternalKExpressions.g:3194:1: ( rule__MultExpression__SubExpressionsAssignment_1_2 )
            // InternalKExpressions.g:3194:2: rule__MultExpression__SubExpressionsAssignment_1_2
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
    // InternalKExpressions.g:3210:1: rule__DivExpression__Group__0 : rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1 ;
    public final void rule__DivExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3214:1: ( rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1 )
            // InternalKExpressions.g:3215:2: rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1
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
    // InternalKExpressions.g:3222:1: rule__DivExpression__Group__0__Impl : ( ruleModExpression ) ;
    public final void rule__DivExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3226:1: ( ( ruleModExpression ) )
            // InternalKExpressions.g:3227:1: ( ruleModExpression )
            {
            // InternalKExpressions.g:3227:1: ( ruleModExpression )
            // InternalKExpressions.g:3228:1: ruleModExpression
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
    // InternalKExpressions.g:3239:1: rule__DivExpression__Group__1 : rule__DivExpression__Group__1__Impl ;
    public final void rule__DivExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3243:1: ( rule__DivExpression__Group__1__Impl )
            // InternalKExpressions.g:3244:2: rule__DivExpression__Group__1__Impl
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
    // InternalKExpressions.g:3250:1: rule__DivExpression__Group__1__Impl : ( ( rule__DivExpression__Group_1__0 )? ) ;
    public final void rule__DivExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3254:1: ( ( ( rule__DivExpression__Group_1__0 )? ) )
            // InternalKExpressions.g:3255:1: ( ( rule__DivExpression__Group_1__0 )? )
            {
            // InternalKExpressions.g:3255:1: ( ( rule__DivExpression__Group_1__0 )? )
            // InternalKExpressions.g:3256:1: ( rule__DivExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:3257:1: ( rule__DivExpression__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==24) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalKExpressions.g:3257:2: rule__DivExpression__Group_1__0
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
    // InternalKExpressions.g:3271:1: rule__DivExpression__Group_1__0 : rule__DivExpression__Group_1__0__Impl rule__DivExpression__Group_1__1 ;
    public final void rule__DivExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3275:1: ( rule__DivExpression__Group_1__0__Impl rule__DivExpression__Group_1__1 )
            // InternalKExpressions.g:3276:2: rule__DivExpression__Group_1__0__Impl rule__DivExpression__Group_1__1
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
    // InternalKExpressions.g:3283:1: rule__DivExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__DivExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3287:1: ( ( () ) )
            // InternalKExpressions.g:3288:1: ( () )
            {
            // InternalKExpressions.g:3288:1: ( () )
            // InternalKExpressions.g:3289:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:3290:1: ()
            // InternalKExpressions.g:3292:1: 
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
    // InternalKExpressions.g:3302:1: rule__DivExpression__Group_1__1 : rule__DivExpression__Group_1__1__Impl rule__DivExpression__Group_1__2 ;
    public final void rule__DivExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3306:1: ( rule__DivExpression__Group_1__1__Impl rule__DivExpression__Group_1__2 )
            // InternalKExpressions.g:3307:2: rule__DivExpression__Group_1__1__Impl rule__DivExpression__Group_1__2
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
    // InternalKExpressions.g:3314:1: rule__DivExpression__Group_1__1__Impl : ( ( rule__DivExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__DivExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3318:1: ( ( ( rule__DivExpression__OperatorAssignment_1_1 ) ) )
            // InternalKExpressions.g:3319:1: ( ( rule__DivExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKExpressions.g:3319:1: ( ( rule__DivExpression__OperatorAssignment_1_1 ) )
            // InternalKExpressions.g:3320:1: ( rule__DivExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKExpressions.g:3321:1: ( rule__DivExpression__OperatorAssignment_1_1 )
            // InternalKExpressions.g:3321:2: rule__DivExpression__OperatorAssignment_1_1
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
    // InternalKExpressions.g:3331:1: rule__DivExpression__Group_1__2 : rule__DivExpression__Group_1__2__Impl ;
    public final void rule__DivExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3335:1: ( rule__DivExpression__Group_1__2__Impl )
            // InternalKExpressions.g:3336:2: rule__DivExpression__Group_1__2__Impl
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
    // InternalKExpressions.g:3342:1: rule__DivExpression__Group_1__2__Impl : ( ( rule__DivExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__DivExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3346:1: ( ( ( rule__DivExpression__SubExpressionsAssignment_1_2 ) ) )
            // InternalKExpressions.g:3347:1: ( ( rule__DivExpression__SubExpressionsAssignment_1_2 ) )
            {
            // InternalKExpressions.g:3347:1: ( ( rule__DivExpression__SubExpressionsAssignment_1_2 ) )
            // InternalKExpressions.g:3348:1: ( rule__DivExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // InternalKExpressions.g:3349:1: ( rule__DivExpression__SubExpressionsAssignment_1_2 )
            // InternalKExpressions.g:3349:2: rule__DivExpression__SubExpressionsAssignment_1_2
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
    // InternalKExpressions.g:3365:1: rule__ModExpression__Group__0 : rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1 ;
    public final void rule__ModExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3369:1: ( rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1 )
            // InternalKExpressions.g:3370:2: rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1
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
    // InternalKExpressions.g:3377:1: rule__ModExpression__Group__0__Impl : ( ruleNegExpression ) ;
    public final void rule__ModExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3381:1: ( ( ruleNegExpression ) )
            // InternalKExpressions.g:3382:1: ( ruleNegExpression )
            {
            // InternalKExpressions.g:3382:1: ( ruleNegExpression )
            // InternalKExpressions.g:3383:1: ruleNegExpression
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
    // InternalKExpressions.g:3394:1: rule__ModExpression__Group__1 : rule__ModExpression__Group__1__Impl ;
    public final void rule__ModExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3398:1: ( rule__ModExpression__Group__1__Impl )
            // InternalKExpressions.g:3399:2: rule__ModExpression__Group__1__Impl
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
    // InternalKExpressions.g:3405:1: rule__ModExpression__Group__1__Impl : ( ( rule__ModExpression__Group_1__0 )? ) ;
    public final void rule__ModExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3409:1: ( ( ( rule__ModExpression__Group_1__0 )? ) )
            // InternalKExpressions.g:3410:1: ( ( rule__ModExpression__Group_1__0 )? )
            {
            // InternalKExpressions.g:3410:1: ( ( rule__ModExpression__Group_1__0 )? )
            // InternalKExpressions.g:3411:1: ( rule__ModExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:3412:1: ( rule__ModExpression__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==23) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalKExpressions.g:3412:2: rule__ModExpression__Group_1__0
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
    // InternalKExpressions.g:3426:1: rule__ModExpression__Group_1__0 : rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1 ;
    public final void rule__ModExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3430:1: ( rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1 )
            // InternalKExpressions.g:3431:2: rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1
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
    // InternalKExpressions.g:3438:1: rule__ModExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ModExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3442:1: ( ( () ) )
            // InternalKExpressions.g:3443:1: ( () )
            {
            // InternalKExpressions.g:3443:1: ( () )
            // InternalKExpressions.g:3444:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKExpressions.g:3445:1: ()
            // InternalKExpressions.g:3447:1: 
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
    // InternalKExpressions.g:3457:1: rule__ModExpression__Group_1__1 : rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2 ;
    public final void rule__ModExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3461:1: ( rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2 )
            // InternalKExpressions.g:3462:2: rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2
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
    // InternalKExpressions.g:3469:1: rule__ModExpression__Group_1__1__Impl : ( ( rule__ModExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ModExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3473:1: ( ( ( rule__ModExpression__OperatorAssignment_1_1 ) ) )
            // InternalKExpressions.g:3474:1: ( ( rule__ModExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKExpressions.g:3474:1: ( ( rule__ModExpression__OperatorAssignment_1_1 ) )
            // InternalKExpressions.g:3475:1: ( rule__ModExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKExpressions.g:3476:1: ( rule__ModExpression__OperatorAssignment_1_1 )
            // InternalKExpressions.g:3476:2: rule__ModExpression__OperatorAssignment_1_1
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
    // InternalKExpressions.g:3486:1: rule__ModExpression__Group_1__2 : rule__ModExpression__Group_1__2__Impl ;
    public final void rule__ModExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3490:1: ( rule__ModExpression__Group_1__2__Impl )
            // InternalKExpressions.g:3491:2: rule__ModExpression__Group_1__2__Impl
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
    // InternalKExpressions.g:3497:1: rule__ModExpression__Group_1__2__Impl : ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__ModExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3501:1: ( ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) ) )
            // InternalKExpressions.g:3502:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) )
            {
            // InternalKExpressions.g:3502:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) )
            // InternalKExpressions.g:3503:1: ( rule__ModExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // InternalKExpressions.g:3504:1: ( rule__ModExpression__SubExpressionsAssignment_1_2 )
            // InternalKExpressions.g:3504:2: rule__ModExpression__SubExpressionsAssignment_1_2
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
    // InternalKExpressions.g:3520:1: rule__NegExpression__Group_0__0 : rule__NegExpression__Group_0__0__Impl rule__NegExpression__Group_0__1 ;
    public final void rule__NegExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3524:1: ( rule__NegExpression__Group_0__0__Impl rule__NegExpression__Group_0__1 )
            // InternalKExpressions.g:3525:2: rule__NegExpression__Group_0__0__Impl rule__NegExpression__Group_0__1
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
    // InternalKExpressions.g:3532:1: rule__NegExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__NegExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3536:1: ( ( () ) )
            // InternalKExpressions.g:3537:1: ( () )
            {
            // InternalKExpressions.g:3537:1: ( () )
            // InternalKExpressions.g:3538:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // InternalKExpressions.g:3539:1: ()
            // InternalKExpressions.g:3541:1: 
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
    // InternalKExpressions.g:3551:1: rule__NegExpression__Group_0__1 : rule__NegExpression__Group_0__1__Impl rule__NegExpression__Group_0__2 ;
    public final void rule__NegExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3555:1: ( rule__NegExpression__Group_0__1__Impl rule__NegExpression__Group_0__2 )
            // InternalKExpressions.g:3556:2: rule__NegExpression__Group_0__1__Impl rule__NegExpression__Group_0__2
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
    // InternalKExpressions.g:3563:1: rule__NegExpression__Group_0__1__Impl : ( ( rule__NegExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__NegExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3567:1: ( ( ( rule__NegExpression__OperatorAssignment_0_1 ) ) )
            // InternalKExpressions.g:3568:1: ( ( rule__NegExpression__OperatorAssignment_0_1 ) )
            {
            // InternalKExpressions.g:3568:1: ( ( rule__NegExpression__OperatorAssignment_0_1 ) )
            // InternalKExpressions.g:3569:1: ( rule__NegExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // InternalKExpressions.g:3570:1: ( rule__NegExpression__OperatorAssignment_0_1 )
            // InternalKExpressions.g:3570:2: rule__NegExpression__OperatorAssignment_0_1
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
    // InternalKExpressions.g:3580:1: rule__NegExpression__Group_0__2 : rule__NegExpression__Group_0__2__Impl ;
    public final void rule__NegExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3584:1: ( rule__NegExpression__Group_0__2__Impl )
            // InternalKExpressions.g:3585:2: rule__NegExpression__Group_0__2__Impl
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
    // InternalKExpressions.g:3591:1: rule__NegExpression__Group_0__2__Impl : ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) ) ;
    public final void rule__NegExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3595:1: ( ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) ) )
            // InternalKExpressions.g:3596:1: ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) )
            {
            // InternalKExpressions.g:3596:1: ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) )
            // InternalKExpressions.g:3597:1: ( rule__NegExpression__SubExpressionsAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getSubExpressionsAssignment_0_2()); 
            }
            // InternalKExpressions.g:3598:1: ( rule__NegExpression__SubExpressionsAssignment_0_2 )
            // InternalKExpressions.g:3598:2: rule__NegExpression__SubExpressionsAssignment_0_2
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
    // InternalKExpressions.g:3614:1: rule__AtomicExpression__Group_2__0 : rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 ;
    public final void rule__AtomicExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3618:1: ( rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 )
            // InternalKExpressions.g:3619:2: rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1
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
    // InternalKExpressions.g:3626:1: rule__AtomicExpression__Group_2__0__Impl : ( '(' ) ;
    public final void rule__AtomicExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3630:1: ( ( '(' ) )
            // InternalKExpressions.g:3631:1: ( '(' )
            {
            // InternalKExpressions.g:3631:1: ( '(' )
            // InternalKExpressions.g:3632:1: '('
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
    // InternalKExpressions.g:3645:1: rule__AtomicExpression__Group_2__1 : rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2 ;
    public final void rule__AtomicExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3649:1: ( rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2 )
            // InternalKExpressions.g:3650:2: rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2
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
    // InternalKExpressions.g:3657:1: rule__AtomicExpression__Group_2__1__Impl : ( ruleBooleanExpression ) ;
    public final void rule__AtomicExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3661:1: ( ( ruleBooleanExpression ) )
            // InternalKExpressions.g:3662:1: ( ruleBooleanExpression )
            {
            // InternalKExpressions.g:3662:1: ( ruleBooleanExpression )
            // InternalKExpressions.g:3663:1: ruleBooleanExpression
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
    // InternalKExpressions.g:3674:1: rule__AtomicExpression__Group_2__2 : rule__AtomicExpression__Group_2__2__Impl ;
    public final void rule__AtomicExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3678:1: ( rule__AtomicExpression__Group_2__2__Impl )
            // InternalKExpressions.g:3679:2: rule__AtomicExpression__Group_2__2__Impl
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
    // InternalKExpressions.g:3685:1: rule__AtomicExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__AtomicExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3689:1: ( ( ')' ) )
            // InternalKExpressions.g:3690:1: ( ')' )
            {
            // InternalKExpressions.g:3690:1: ( ')' )
            // InternalKExpressions.g:3691:1: ')'
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
    // InternalKExpressions.g:3710:1: rule__AtomicValuedExpression__Group_2__0 : rule__AtomicValuedExpression__Group_2__0__Impl rule__AtomicValuedExpression__Group_2__1 ;
    public final void rule__AtomicValuedExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3714:1: ( rule__AtomicValuedExpression__Group_2__0__Impl rule__AtomicValuedExpression__Group_2__1 )
            // InternalKExpressions.g:3715:2: rule__AtomicValuedExpression__Group_2__0__Impl rule__AtomicValuedExpression__Group_2__1
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
    // InternalKExpressions.g:3722:1: rule__AtomicValuedExpression__Group_2__0__Impl : ( ( '(' ) ) ;
    public final void rule__AtomicValuedExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3726:1: ( ( ( '(' ) ) )
            // InternalKExpressions.g:3727:1: ( ( '(' ) )
            {
            // InternalKExpressions.g:3727:1: ( ( '(' ) )
            // InternalKExpressions.g:3728:1: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0()); 
            }
            // InternalKExpressions.g:3729:1: ( '(' )
            // InternalKExpressions.g:3730:2: '('
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
    // InternalKExpressions.g:3741:1: rule__AtomicValuedExpression__Group_2__1 : rule__AtomicValuedExpression__Group_2__1__Impl rule__AtomicValuedExpression__Group_2__2 ;
    public final void rule__AtomicValuedExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3745:1: ( rule__AtomicValuedExpression__Group_2__1__Impl rule__AtomicValuedExpression__Group_2__2 )
            // InternalKExpressions.g:3746:2: rule__AtomicValuedExpression__Group_2__1__Impl rule__AtomicValuedExpression__Group_2__2
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
    // InternalKExpressions.g:3753:1: rule__AtomicValuedExpression__Group_2__1__Impl : ( ruleValuedExpression ) ;
    public final void rule__AtomicValuedExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3757:1: ( ( ruleValuedExpression ) )
            // InternalKExpressions.g:3758:1: ( ruleValuedExpression )
            {
            // InternalKExpressions.g:3758:1: ( ruleValuedExpression )
            // InternalKExpressions.g:3759:1: ruleValuedExpression
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
    // InternalKExpressions.g:3770:1: rule__AtomicValuedExpression__Group_2__2 : rule__AtomicValuedExpression__Group_2__2__Impl ;
    public final void rule__AtomicValuedExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3774:1: ( rule__AtomicValuedExpression__Group_2__2__Impl )
            // InternalKExpressions.g:3775:2: rule__AtomicValuedExpression__Group_2__2__Impl
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
    // InternalKExpressions.g:3781:1: rule__AtomicValuedExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__AtomicValuedExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3785:1: ( ( ')' ) )
            // InternalKExpressions.g:3786:1: ( ')' )
            {
            // InternalKExpressions.g:3786:1: ( ')' )
            // InternalKExpressions.g:3787:1: ')'
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
    // InternalKExpressions.g:3806:1: rule__ValuedObjectTestExpression__Group_0__0 : rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1 ;
    public final void rule__ValuedObjectTestExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3810:1: ( rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1 )
            // InternalKExpressions.g:3811:2: rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1
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
    // InternalKExpressions.g:3818:1: rule__ValuedObjectTestExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3822:1: ( ( () ) )
            // InternalKExpressions.g:3823:1: ( () )
            {
            // InternalKExpressions.g:3823:1: ( () )
            // InternalKExpressions.g:3824:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // InternalKExpressions.g:3825:1: ()
            // InternalKExpressions.g:3827:1: 
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
    // InternalKExpressions.g:3837:1: rule__ValuedObjectTestExpression__Group_0__1 : rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2 ;
    public final void rule__ValuedObjectTestExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3841:1: ( rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2 )
            // InternalKExpressions.g:3842:2: rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2
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
    // InternalKExpressions.g:3849:1: rule__ValuedObjectTestExpression__Group_0__1__Impl : ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3853:1: ( ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) ) )
            // InternalKExpressions.g:3854:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) )
            {
            // InternalKExpressions.g:3854:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) )
            // InternalKExpressions.g:3855:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // InternalKExpressions.g:3856:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 )
            // InternalKExpressions.g:3856:2: rule__ValuedObjectTestExpression__OperatorAssignment_0_1
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
    // InternalKExpressions.g:3866:1: rule__ValuedObjectTestExpression__Group_0__2 : rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3 ;
    public final void rule__ValuedObjectTestExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3870:1: ( rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3 )
            // InternalKExpressions.g:3871:2: rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3
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
    // InternalKExpressions.g:3878:1: rule__ValuedObjectTestExpression__Group_0__2__Impl : ( '(' ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3882:1: ( ( '(' ) )
            // InternalKExpressions.g:3883:1: ( '(' )
            {
            // InternalKExpressions.g:3883:1: ( '(' )
            // InternalKExpressions.g:3884:1: '('
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
    // InternalKExpressions.g:3897:1: rule__ValuedObjectTestExpression__Group_0__3 : rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4 ;
    public final void rule__ValuedObjectTestExpression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3901:1: ( rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4 )
            // InternalKExpressions.g:3902:2: rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4
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
    // InternalKExpressions.g:3909:1: rule__ValuedObjectTestExpression__Group_0__3__Impl : ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3913:1: ( ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) ) )
            // InternalKExpressions.g:3914:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) )
            {
            // InternalKExpressions.g:3914:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) )
            // InternalKExpressions.g:3915:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsAssignment_0_3()); 
            }
            // InternalKExpressions.g:3916:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 )
            // InternalKExpressions.g:3916:2: rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3
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
    // InternalKExpressions.g:3926:1: rule__ValuedObjectTestExpression__Group_0__4 : rule__ValuedObjectTestExpression__Group_0__4__Impl ;
    public final void rule__ValuedObjectTestExpression__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3930:1: ( rule__ValuedObjectTestExpression__Group_0__4__Impl )
            // InternalKExpressions.g:3931:2: rule__ValuedObjectTestExpression__Group_0__4__Impl
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
    // InternalKExpressions.g:3937:1: rule__ValuedObjectTestExpression__Group_0__4__Impl : ( ')' ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3941:1: ( ( ')' ) )
            // InternalKExpressions.g:3942:1: ( ')' )
            {
            // InternalKExpressions.g:3942:1: ( ')' )
            // InternalKExpressions.g:3943:1: ')'
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
    // InternalKExpressions.g:3966:1: rule__ValuedObjectTestExpression__Group_1__0 : rule__ValuedObjectTestExpression__Group_1__0__Impl rule__ValuedObjectTestExpression__Group_1__1 ;
    public final void rule__ValuedObjectTestExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3970:1: ( rule__ValuedObjectTestExpression__Group_1__0__Impl rule__ValuedObjectTestExpression__Group_1__1 )
            // InternalKExpressions.g:3971:2: rule__ValuedObjectTestExpression__Group_1__0__Impl rule__ValuedObjectTestExpression__Group_1__1
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
    // InternalKExpressions.g:3978:1: rule__ValuedObjectTestExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ValuedObjectTestExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:3982:1: ( ( () ) )
            // InternalKExpressions.g:3983:1: ( () )
            {
            // InternalKExpressions.g:3983:1: ( () )
            // InternalKExpressions.g:3984:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorExpressionAction_1_0()); 
            }
            // InternalKExpressions.g:3985:1: ()
            // InternalKExpressions.g:3987:1: 
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
    // InternalKExpressions.g:3997:1: rule__ValuedObjectTestExpression__Group_1__1 : rule__ValuedObjectTestExpression__Group_1__1__Impl rule__ValuedObjectTestExpression__Group_1__2 ;
    public final void rule__ValuedObjectTestExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4001:1: ( rule__ValuedObjectTestExpression__Group_1__1__Impl rule__ValuedObjectTestExpression__Group_1__2 )
            // InternalKExpressions.g:4002:2: rule__ValuedObjectTestExpression__Group_1__1__Impl rule__ValuedObjectTestExpression__Group_1__2
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
    // InternalKExpressions.g:4009:1: rule__ValuedObjectTestExpression__Group_1__1__Impl : ( ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4013:1: ( ( ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 ) ) )
            // InternalKExpressions.g:4014:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 ) )
            {
            // InternalKExpressions.g:4014:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 ) )
            // InternalKExpressions.g:4015:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKExpressions.g:4016:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 )
            // InternalKExpressions.g:4016:2: rule__ValuedObjectTestExpression__OperatorAssignment_1_1
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
    // InternalKExpressions.g:4026:1: rule__ValuedObjectTestExpression__Group_1__2 : rule__ValuedObjectTestExpression__Group_1__2__Impl ;
    public final void rule__ValuedObjectTestExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4030:1: ( rule__ValuedObjectTestExpression__Group_1__2__Impl )
            // InternalKExpressions.g:4031:2: rule__ValuedObjectTestExpression__Group_1__2__Impl
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
    // InternalKExpressions.g:4037:1: rule__ValuedObjectTestExpression__Group_1__2__Impl : ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4041:1: ( ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 ) ) )
            // InternalKExpressions.g:4042:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 ) )
            {
            // InternalKExpressions.g:4042:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 ) )
            // InternalKExpressions.g:4043:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // InternalKExpressions.g:4044:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 )
            // InternalKExpressions.g:4044:2: rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2
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
    // InternalKExpressions.g:4060:1: rule__TextExpression__Group__0 : rule__TextExpression__Group__0__Impl rule__TextExpression__Group__1 ;
    public final void rule__TextExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4064:1: ( rule__TextExpression__Group__0__Impl rule__TextExpression__Group__1 )
            // InternalKExpressions.g:4065:2: rule__TextExpression__Group__0__Impl rule__TextExpression__Group__1
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
    // InternalKExpressions.g:4072:1: rule__TextExpression__Group__0__Impl : ( ( rule__TextExpression__CodeAssignment_0 ) ) ;
    public final void rule__TextExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4076:1: ( ( ( rule__TextExpression__CodeAssignment_0 ) ) )
            // InternalKExpressions.g:4077:1: ( ( rule__TextExpression__CodeAssignment_0 ) )
            {
            // InternalKExpressions.g:4077:1: ( ( rule__TextExpression__CodeAssignment_0 ) )
            // InternalKExpressions.g:4078:1: ( rule__TextExpression__CodeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getCodeAssignment_0()); 
            }
            // InternalKExpressions.g:4079:1: ( rule__TextExpression__CodeAssignment_0 )
            // InternalKExpressions.g:4079:2: rule__TextExpression__CodeAssignment_0
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
    // InternalKExpressions.g:4089:1: rule__TextExpression__Group__1 : rule__TextExpression__Group__1__Impl ;
    public final void rule__TextExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4093:1: ( rule__TextExpression__Group__1__Impl )
            // InternalKExpressions.g:4094:2: rule__TextExpression__Group__1__Impl
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
    // InternalKExpressions.g:4100:1: rule__TextExpression__Group__1__Impl : ( ( rule__TextExpression__Group_1__0 )? ) ;
    public final void rule__TextExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4104:1: ( ( ( rule__TextExpression__Group_1__0 )? ) )
            // InternalKExpressions.g:4105:1: ( ( rule__TextExpression__Group_1__0 )? )
            {
            // InternalKExpressions.g:4105:1: ( ( rule__TextExpression__Group_1__0 )? )
            // InternalKExpressions.g:4106:1: ( rule__TextExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:4107:1: ( rule__TextExpression__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==43) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalKExpressions.g:4107:2: rule__TextExpression__Group_1__0
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
    // InternalKExpressions.g:4121:1: rule__TextExpression__Group_1__0 : rule__TextExpression__Group_1__0__Impl rule__TextExpression__Group_1__1 ;
    public final void rule__TextExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4125:1: ( rule__TextExpression__Group_1__0__Impl rule__TextExpression__Group_1__1 )
            // InternalKExpressions.g:4126:2: rule__TextExpression__Group_1__0__Impl rule__TextExpression__Group_1__1
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
    // InternalKExpressions.g:4133:1: rule__TextExpression__Group_1__0__Impl : ( '(' ) ;
    public final void rule__TextExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4137:1: ( ( '(' ) )
            // InternalKExpressions.g:4138:1: ( '(' )
            {
            // InternalKExpressions.g:4138:1: ( '(' )
            // InternalKExpressions.g:4139:1: '('
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
    // InternalKExpressions.g:4152:1: rule__TextExpression__Group_1__1 : rule__TextExpression__Group_1__1__Impl rule__TextExpression__Group_1__2 ;
    public final void rule__TextExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4156:1: ( rule__TextExpression__Group_1__1__Impl rule__TextExpression__Group_1__2 )
            // InternalKExpressions.g:4157:2: rule__TextExpression__Group_1__1__Impl rule__TextExpression__Group_1__2
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
    // InternalKExpressions.g:4164:1: rule__TextExpression__Group_1__1__Impl : ( ( rule__TextExpression__TypeAssignment_1_1 ) ) ;
    public final void rule__TextExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4168:1: ( ( ( rule__TextExpression__TypeAssignment_1_1 ) ) )
            // InternalKExpressions.g:4169:1: ( ( rule__TextExpression__TypeAssignment_1_1 ) )
            {
            // InternalKExpressions.g:4169:1: ( ( rule__TextExpression__TypeAssignment_1_1 ) )
            // InternalKExpressions.g:4170:1: ( rule__TextExpression__TypeAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getTypeAssignment_1_1()); 
            }
            // InternalKExpressions.g:4171:1: ( rule__TextExpression__TypeAssignment_1_1 )
            // InternalKExpressions.g:4171:2: rule__TextExpression__TypeAssignment_1_1
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
    // InternalKExpressions.g:4181:1: rule__TextExpression__Group_1__2 : rule__TextExpression__Group_1__2__Impl ;
    public final void rule__TextExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4185:1: ( rule__TextExpression__Group_1__2__Impl )
            // InternalKExpressions.g:4186:2: rule__TextExpression__Group_1__2__Impl
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
    // InternalKExpressions.g:4192:1: rule__TextExpression__Group_1__2__Impl : ( ')' ) ;
    public final void rule__TextExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4196:1: ( ( ')' ) )
            // InternalKExpressions.g:4197:1: ( ')' )
            {
            // InternalKExpressions.g:4197:1: ( ')' )
            // InternalKExpressions.g:4198:1: ')'
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
    // InternalKExpressions.g:4217:1: rule__ISignal__Group__0 : rule__ISignal__Group__0__Impl rule__ISignal__Group__1 ;
    public final void rule__ISignal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4221:1: ( rule__ISignal__Group__0__Impl rule__ISignal__Group__1 )
            // InternalKExpressions.g:4222:2: rule__ISignal__Group__0__Impl rule__ISignal__Group__1
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
    // InternalKExpressions.g:4229:1: rule__ISignal__Group__0__Impl : ( ( rule__ISignal__NameAssignment_0 ) ) ;
    public final void rule__ISignal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4233:1: ( ( ( rule__ISignal__NameAssignment_0 ) ) )
            // InternalKExpressions.g:4234:1: ( ( rule__ISignal__NameAssignment_0 ) )
            {
            // InternalKExpressions.g:4234:1: ( ( rule__ISignal__NameAssignment_0 ) )
            // InternalKExpressions.g:4235:1: ( rule__ISignal__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getISignalAccess().getNameAssignment_0()); 
            }
            // InternalKExpressions.g:4236:1: ( rule__ISignal__NameAssignment_0 )
            // InternalKExpressions.g:4236:2: rule__ISignal__NameAssignment_0
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
    // InternalKExpressions.g:4246:1: rule__ISignal__Group__1 : rule__ISignal__Group__1__Impl ;
    public final void rule__ISignal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4250:1: ( rule__ISignal__Group__1__Impl )
            // InternalKExpressions.g:4251:2: rule__ISignal__Group__1__Impl
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
    // InternalKExpressions.g:4257:1: rule__ISignal__Group__1__Impl : ( ( rule__ISignal__ChannelDescrAssignment_1 )? ) ;
    public final void rule__ISignal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4261:1: ( ( ( rule__ISignal__ChannelDescrAssignment_1 )? ) )
            // InternalKExpressions.g:4262:1: ( ( rule__ISignal__ChannelDescrAssignment_1 )? )
            {
            // InternalKExpressions.g:4262:1: ( ( rule__ISignal__ChannelDescrAssignment_1 )? )
            // InternalKExpressions.g:4263:1: ( rule__ISignal__ChannelDescrAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getISignalAccess().getChannelDescrAssignment_1()); 
            }
            // InternalKExpressions.g:4264:1: ( rule__ISignal__ChannelDescrAssignment_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==43||(LA28_0>=51 && LA28_0<=52)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalKExpressions.g:4264:2: rule__ISignal__ChannelDescrAssignment_1
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
    // InternalKExpressions.g:4278:1: rule__InterfaceSignalDecl__Group_0__0 : rule__InterfaceSignalDecl__Group_0__0__Impl rule__InterfaceSignalDecl__Group_0__1 ;
    public final void rule__InterfaceSignalDecl__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4282:1: ( rule__InterfaceSignalDecl__Group_0__0__Impl rule__InterfaceSignalDecl__Group_0__1 )
            // InternalKExpressions.g:4283:2: rule__InterfaceSignalDecl__Group_0__0__Impl rule__InterfaceSignalDecl__Group_0__1
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
    // InternalKExpressions.g:4290:1: rule__InterfaceSignalDecl__Group_0__0__Impl : ( () ) ;
    public final void rule__InterfaceSignalDecl__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4294:1: ( ( () ) )
            // InternalKExpressions.g:4295:1: ( () )
            {
            // InternalKExpressions.g:4295:1: ( () )
            // InternalKExpressions.g:4296:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getInputAction_0_0()); 
            }
            // InternalKExpressions.g:4297:1: ()
            // InternalKExpressions.g:4299:1: 
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
    // InternalKExpressions.g:4309:1: rule__InterfaceSignalDecl__Group_0__1 : rule__InterfaceSignalDecl__Group_0__1__Impl rule__InterfaceSignalDecl__Group_0__2 ;
    public final void rule__InterfaceSignalDecl__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4313:1: ( rule__InterfaceSignalDecl__Group_0__1__Impl rule__InterfaceSignalDecl__Group_0__2 )
            // InternalKExpressions.g:4314:2: rule__InterfaceSignalDecl__Group_0__1__Impl rule__InterfaceSignalDecl__Group_0__2
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
    // InternalKExpressions.g:4321:1: rule__InterfaceSignalDecl__Group_0__1__Impl : ( 'input' ) ;
    public final void rule__InterfaceSignalDecl__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4325:1: ( ( 'input' ) )
            // InternalKExpressions.g:4326:1: ( 'input' )
            {
            // InternalKExpressions.g:4326:1: ( 'input' )
            // InternalKExpressions.g:4327:1: 'input'
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
    // InternalKExpressions.g:4340:1: rule__InterfaceSignalDecl__Group_0__2 : rule__InterfaceSignalDecl__Group_0__2__Impl rule__InterfaceSignalDecl__Group_0__3 ;
    public final void rule__InterfaceSignalDecl__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4344:1: ( rule__InterfaceSignalDecl__Group_0__2__Impl rule__InterfaceSignalDecl__Group_0__3 )
            // InternalKExpressions.g:4345:2: rule__InterfaceSignalDecl__Group_0__2__Impl rule__InterfaceSignalDecl__Group_0__3
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
    // InternalKExpressions.g:4352:1: rule__InterfaceSignalDecl__Group_0__2__Impl : ( ( rule__InterfaceSignalDecl__SignalsAssignment_0_2 ) ) ;
    public final void rule__InterfaceSignalDecl__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4356:1: ( ( ( rule__InterfaceSignalDecl__SignalsAssignment_0_2 ) ) )
            // InternalKExpressions.g:4357:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_0_2 ) )
            {
            // InternalKExpressions.g:4357:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_0_2 ) )
            // InternalKExpressions.g:4358:1: ( rule__InterfaceSignalDecl__SignalsAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSignalsAssignment_0_2()); 
            }
            // InternalKExpressions.g:4359:1: ( rule__InterfaceSignalDecl__SignalsAssignment_0_2 )
            // InternalKExpressions.g:4359:2: rule__InterfaceSignalDecl__SignalsAssignment_0_2
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
    // InternalKExpressions.g:4369:1: rule__InterfaceSignalDecl__Group_0__3 : rule__InterfaceSignalDecl__Group_0__3__Impl rule__InterfaceSignalDecl__Group_0__4 ;
    public final void rule__InterfaceSignalDecl__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4373:1: ( rule__InterfaceSignalDecl__Group_0__3__Impl rule__InterfaceSignalDecl__Group_0__4 )
            // InternalKExpressions.g:4374:2: rule__InterfaceSignalDecl__Group_0__3__Impl rule__InterfaceSignalDecl__Group_0__4
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
    // InternalKExpressions.g:4381:1: rule__InterfaceSignalDecl__Group_0__3__Impl : ( ( rule__InterfaceSignalDecl__Group_0_3__0 )* ) ;
    public final void rule__InterfaceSignalDecl__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4385:1: ( ( ( rule__InterfaceSignalDecl__Group_0_3__0 )* ) )
            // InternalKExpressions.g:4386:1: ( ( rule__InterfaceSignalDecl__Group_0_3__0 )* )
            {
            // InternalKExpressions.g:4386:1: ( ( rule__InterfaceSignalDecl__Group_0_3__0 )* )
            // InternalKExpressions.g:4387:1: ( rule__InterfaceSignalDecl__Group_0_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getGroup_0_3()); 
            }
            // InternalKExpressions.g:4388:1: ( rule__InterfaceSignalDecl__Group_0_3__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==47) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalKExpressions.g:4388:2: rule__InterfaceSignalDecl__Group_0_3__0
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
    // InternalKExpressions.g:4398:1: rule__InterfaceSignalDecl__Group_0__4 : rule__InterfaceSignalDecl__Group_0__4__Impl ;
    public final void rule__InterfaceSignalDecl__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4402:1: ( rule__InterfaceSignalDecl__Group_0__4__Impl )
            // InternalKExpressions.g:4403:2: rule__InterfaceSignalDecl__Group_0__4__Impl
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
    // InternalKExpressions.g:4409:1: rule__InterfaceSignalDecl__Group_0__4__Impl : ( ';' ) ;
    public final void rule__InterfaceSignalDecl__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4413:1: ( ( ';' ) )
            // InternalKExpressions.g:4414:1: ( ';' )
            {
            // InternalKExpressions.g:4414:1: ( ';' )
            // InternalKExpressions.g:4415:1: ';'
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
    // InternalKExpressions.g:4438:1: rule__InterfaceSignalDecl__Group_0_3__0 : rule__InterfaceSignalDecl__Group_0_3__0__Impl rule__InterfaceSignalDecl__Group_0_3__1 ;
    public final void rule__InterfaceSignalDecl__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4442:1: ( rule__InterfaceSignalDecl__Group_0_3__0__Impl rule__InterfaceSignalDecl__Group_0_3__1 )
            // InternalKExpressions.g:4443:2: rule__InterfaceSignalDecl__Group_0_3__0__Impl rule__InterfaceSignalDecl__Group_0_3__1
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
    // InternalKExpressions.g:4450:1: rule__InterfaceSignalDecl__Group_0_3__0__Impl : ( ',' ) ;
    public final void rule__InterfaceSignalDecl__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4454:1: ( ( ',' ) )
            // InternalKExpressions.g:4455:1: ( ',' )
            {
            // InternalKExpressions.g:4455:1: ( ',' )
            // InternalKExpressions.g:4456:1: ','
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
    // InternalKExpressions.g:4469:1: rule__InterfaceSignalDecl__Group_0_3__1 : rule__InterfaceSignalDecl__Group_0_3__1__Impl ;
    public final void rule__InterfaceSignalDecl__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4473:1: ( rule__InterfaceSignalDecl__Group_0_3__1__Impl )
            // InternalKExpressions.g:4474:2: rule__InterfaceSignalDecl__Group_0_3__1__Impl
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
    // InternalKExpressions.g:4480:1: rule__InterfaceSignalDecl__Group_0_3__1__Impl : ( ( rule__InterfaceSignalDecl__SignalsAssignment_0_3_1 ) ) ;
    public final void rule__InterfaceSignalDecl__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4484:1: ( ( ( rule__InterfaceSignalDecl__SignalsAssignment_0_3_1 ) ) )
            // InternalKExpressions.g:4485:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_0_3_1 ) )
            {
            // InternalKExpressions.g:4485:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_0_3_1 ) )
            // InternalKExpressions.g:4486:1: ( rule__InterfaceSignalDecl__SignalsAssignment_0_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSignalsAssignment_0_3_1()); 
            }
            // InternalKExpressions.g:4487:1: ( rule__InterfaceSignalDecl__SignalsAssignment_0_3_1 )
            // InternalKExpressions.g:4487:2: rule__InterfaceSignalDecl__SignalsAssignment_0_3_1
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
    // InternalKExpressions.g:4501:1: rule__InterfaceSignalDecl__Group_1__0 : rule__InterfaceSignalDecl__Group_1__0__Impl rule__InterfaceSignalDecl__Group_1__1 ;
    public final void rule__InterfaceSignalDecl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4505:1: ( rule__InterfaceSignalDecl__Group_1__0__Impl rule__InterfaceSignalDecl__Group_1__1 )
            // InternalKExpressions.g:4506:2: rule__InterfaceSignalDecl__Group_1__0__Impl rule__InterfaceSignalDecl__Group_1__1
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
    // InternalKExpressions.g:4513:1: rule__InterfaceSignalDecl__Group_1__0__Impl : ( () ) ;
    public final void rule__InterfaceSignalDecl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4517:1: ( ( () ) )
            // InternalKExpressions.g:4518:1: ( () )
            {
            // InternalKExpressions.g:4518:1: ( () )
            // InternalKExpressions.g:4519:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getOutputAction_1_0()); 
            }
            // InternalKExpressions.g:4520:1: ()
            // InternalKExpressions.g:4522:1: 
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
    // InternalKExpressions.g:4532:1: rule__InterfaceSignalDecl__Group_1__1 : rule__InterfaceSignalDecl__Group_1__1__Impl rule__InterfaceSignalDecl__Group_1__2 ;
    public final void rule__InterfaceSignalDecl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4536:1: ( rule__InterfaceSignalDecl__Group_1__1__Impl rule__InterfaceSignalDecl__Group_1__2 )
            // InternalKExpressions.g:4537:2: rule__InterfaceSignalDecl__Group_1__1__Impl rule__InterfaceSignalDecl__Group_1__2
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
    // InternalKExpressions.g:4544:1: rule__InterfaceSignalDecl__Group_1__1__Impl : ( 'output' ) ;
    public final void rule__InterfaceSignalDecl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4548:1: ( ( 'output' ) )
            // InternalKExpressions.g:4549:1: ( 'output' )
            {
            // InternalKExpressions.g:4549:1: ( 'output' )
            // InternalKExpressions.g:4550:1: 'output'
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
    // InternalKExpressions.g:4563:1: rule__InterfaceSignalDecl__Group_1__2 : rule__InterfaceSignalDecl__Group_1__2__Impl rule__InterfaceSignalDecl__Group_1__3 ;
    public final void rule__InterfaceSignalDecl__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4567:1: ( rule__InterfaceSignalDecl__Group_1__2__Impl rule__InterfaceSignalDecl__Group_1__3 )
            // InternalKExpressions.g:4568:2: rule__InterfaceSignalDecl__Group_1__2__Impl rule__InterfaceSignalDecl__Group_1__3
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
    // InternalKExpressions.g:4575:1: rule__InterfaceSignalDecl__Group_1__2__Impl : ( ( rule__InterfaceSignalDecl__SignalsAssignment_1_2 ) ) ;
    public final void rule__InterfaceSignalDecl__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4579:1: ( ( ( rule__InterfaceSignalDecl__SignalsAssignment_1_2 ) ) )
            // InternalKExpressions.g:4580:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_1_2 ) )
            {
            // InternalKExpressions.g:4580:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_1_2 ) )
            // InternalKExpressions.g:4581:1: ( rule__InterfaceSignalDecl__SignalsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSignalsAssignment_1_2()); 
            }
            // InternalKExpressions.g:4582:1: ( rule__InterfaceSignalDecl__SignalsAssignment_1_2 )
            // InternalKExpressions.g:4582:2: rule__InterfaceSignalDecl__SignalsAssignment_1_2
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
    // InternalKExpressions.g:4592:1: rule__InterfaceSignalDecl__Group_1__3 : rule__InterfaceSignalDecl__Group_1__3__Impl rule__InterfaceSignalDecl__Group_1__4 ;
    public final void rule__InterfaceSignalDecl__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4596:1: ( rule__InterfaceSignalDecl__Group_1__3__Impl rule__InterfaceSignalDecl__Group_1__4 )
            // InternalKExpressions.g:4597:2: rule__InterfaceSignalDecl__Group_1__3__Impl rule__InterfaceSignalDecl__Group_1__4
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
    // InternalKExpressions.g:4604:1: rule__InterfaceSignalDecl__Group_1__3__Impl : ( ( rule__InterfaceSignalDecl__Group_1_3__0 )* ) ;
    public final void rule__InterfaceSignalDecl__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4608:1: ( ( ( rule__InterfaceSignalDecl__Group_1_3__0 )* ) )
            // InternalKExpressions.g:4609:1: ( ( rule__InterfaceSignalDecl__Group_1_3__0 )* )
            {
            // InternalKExpressions.g:4609:1: ( ( rule__InterfaceSignalDecl__Group_1_3__0 )* )
            // InternalKExpressions.g:4610:1: ( rule__InterfaceSignalDecl__Group_1_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getGroup_1_3()); 
            }
            // InternalKExpressions.g:4611:1: ( rule__InterfaceSignalDecl__Group_1_3__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==47) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalKExpressions.g:4611:2: rule__InterfaceSignalDecl__Group_1_3__0
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
    // InternalKExpressions.g:4621:1: rule__InterfaceSignalDecl__Group_1__4 : rule__InterfaceSignalDecl__Group_1__4__Impl ;
    public final void rule__InterfaceSignalDecl__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4625:1: ( rule__InterfaceSignalDecl__Group_1__4__Impl )
            // InternalKExpressions.g:4626:2: rule__InterfaceSignalDecl__Group_1__4__Impl
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
    // InternalKExpressions.g:4632:1: rule__InterfaceSignalDecl__Group_1__4__Impl : ( ';' ) ;
    public final void rule__InterfaceSignalDecl__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4636:1: ( ( ';' ) )
            // InternalKExpressions.g:4637:1: ( ';' )
            {
            // InternalKExpressions.g:4637:1: ( ';' )
            // InternalKExpressions.g:4638:1: ';'
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
    // InternalKExpressions.g:4661:1: rule__InterfaceSignalDecl__Group_1_3__0 : rule__InterfaceSignalDecl__Group_1_3__0__Impl rule__InterfaceSignalDecl__Group_1_3__1 ;
    public final void rule__InterfaceSignalDecl__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4665:1: ( rule__InterfaceSignalDecl__Group_1_3__0__Impl rule__InterfaceSignalDecl__Group_1_3__1 )
            // InternalKExpressions.g:4666:2: rule__InterfaceSignalDecl__Group_1_3__0__Impl rule__InterfaceSignalDecl__Group_1_3__1
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
    // InternalKExpressions.g:4673:1: rule__InterfaceSignalDecl__Group_1_3__0__Impl : ( ',' ) ;
    public final void rule__InterfaceSignalDecl__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4677:1: ( ( ',' ) )
            // InternalKExpressions.g:4678:1: ( ',' )
            {
            // InternalKExpressions.g:4678:1: ( ',' )
            // InternalKExpressions.g:4679:1: ','
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
    // InternalKExpressions.g:4692:1: rule__InterfaceSignalDecl__Group_1_3__1 : rule__InterfaceSignalDecl__Group_1_3__1__Impl ;
    public final void rule__InterfaceSignalDecl__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4696:1: ( rule__InterfaceSignalDecl__Group_1_3__1__Impl )
            // InternalKExpressions.g:4697:2: rule__InterfaceSignalDecl__Group_1_3__1__Impl
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
    // InternalKExpressions.g:4703:1: rule__InterfaceSignalDecl__Group_1_3__1__Impl : ( ( rule__InterfaceSignalDecl__SignalsAssignment_1_3_1 ) ) ;
    public final void rule__InterfaceSignalDecl__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4707:1: ( ( ( rule__InterfaceSignalDecl__SignalsAssignment_1_3_1 ) ) )
            // InternalKExpressions.g:4708:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_1_3_1 ) )
            {
            // InternalKExpressions.g:4708:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_1_3_1 ) )
            // InternalKExpressions.g:4709:1: ( rule__InterfaceSignalDecl__SignalsAssignment_1_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSignalsAssignment_1_3_1()); 
            }
            // InternalKExpressions.g:4710:1: ( rule__InterfaceSignalDecl__SignalsAssignment_1_3_1 )
            // InternalKExpressions.g:4710:2: rule__InterfaceSignalDecl__SignalsAssignment_1_3_1
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
    // InternalKExpressions.g:4724:1: rule__InterfaceSignalDecl__Group_2__0 : rule__InterfaceSignalDecl__Group_2__0__Impl rule__InterfaceSignalDecl__Group_2__1 ;
    public final void rule__InterfaceSignalDecl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4728:1: ( rule__InterfaceSignalDecl__Group_2__0__Impl rule__InterfaceSignalDecl__Group_2__1 )
            // InternalKExpressions.g:4729:2: rule__InterfaceSignalDecl__Group_2__0__Impl rule__InterfaceSignalDecl__Group_2__1
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
    // InternalKExpressions.g:4736:1: rule__InterfaceSignalDecl__Group_2__0__Impl : ( () ) ;
    public final void rule__InterfaceSignalDecl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4740:1: ( ( () ) )
            // InternalKExpressions.g:4741:1: ( () )
            {
            // InternalKExpressions.g:4741:1: ( () )
            // InternalKExpressions.g:4742:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getInputOutputAction_2_0()); 
            }
            // InternalKExpressions.g:4743:1: ()
            // InternalKExpressions.g:4745:1: 
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
    // InternalKExpressions.g:4755:1: rule__InterfaceSignalDecl__Group_2__1 : rule__InterfaceSignalDecl__Group_2__1__Impl rule__InterfaceSignalDecl__Group_2__2 ;
    public final void rule__InterfaceSignalDecl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4759:1: ( rule__InterfaceSignalDecl__Group_2__1__Impl rule__InterfaceSignalDecl__Group_2__2 )
            // InternalKExpressions.g:4760:2: rule__InterfaceSignalDecl__Group_2__1__Impl rule__InterfaceSignalDecl__Group_2__2
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
    // InternalKExpressions.g:4767:1: rule__InterfaceSignalDecl__Group_2__1__Impl : ( 'inputoutput' ) ;
    public final void rule__InterfaceSignalDecl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4771:1: ( ( 'inputoutput' ) )
            // InternalKExpressions.g:4772:1: ( 'inputoutput' )
            {
            // InternalKExpressions.g:4772:1: ( 'inputoutput' )
            // InternalKExpressions.g:4773:1: 'inputoutput'
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
    // InternalKExpressions.g:4786:1: rule__InterfaceSignalDecl__Group_2__2 : rule__InterfaceSignalDecl__Group_2__2__Impl rule__InterfaceSignalDecl__Group_2__3 ;
    public final void rule__InterfaceSignalDecl__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4790:1: ( rule__InterfaceSignalDecl__Group_2__2__Impl rule__InterfaceSignalDecl__Group_2__3 )
            // InternalKExpressions.g:4791:2: rule__InterfaceSignalDecl__Group_2__2__Impl rule__InterfaceSignalDecl__Group_2__3
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
    // InternalKExpressions.g:4798:1: rule__InterfaceSignalDecl__Group_2__2__Impl : ( ( rule__InterfaceSignalDecl__SignalsAssignment_2_2 ) ) ;
    public final void rule__InterfaceSignalDecl__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4802:1: ( ( ( rule__InterfaceSignalDecl__SignalsAssignment_2_2 ) ) )
            // InternalKExpressions.g:4803:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_2_2 ) )
            {
            // InternalKExpressions.g:4803:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_2_2 ) )
            // InternalKExpressions.g:4804:1: ( rule__InterfaceSignalDecl__SignalsAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSignalsAssignment_2_2()); 
            }
            // InternalKExpressions.g:4805:1: ( rule__InterfaceSignalDecl__SignalsAssignment_2_2 )
            // InternalKExpressions.g:4805:2: rule__InterfaceSignalDecl__SignalsAssignment_2_2
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
    // InternalKExpressions.g:4815:1: rule__InterfaceSignalDecl__Group_2__3 : rule__InterfaceSignalDecl__Group_2__3__Impl rule__InterfaceSignalDecl__Group_2__4 ;
    public final void rule__InterfaceSignalDecl__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4819:1: ( rule__InterfaceSignalDecl__Group_2__3__Impl rule__InterfaceSignalDecl__Group_2__4 )
            // InternalKExpressions.g:4820:2: rule__InterfaceSignalDecl__Group_2__3__Impl rule__InterfaceSignalDecl__Group_2__4
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
    // InternalKExpressions.g:4827:1: rule__InterfaceSignalDecl__Group_2__3__Impl : ( ( rule__InterfaceSignalDecl__Group_2_3__0 )* ) ;
    public final void rule__InterfaceSignalDecl__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4831:1: ( ( ( rule__InterfaceSignalDecl__Group_2_3__0 )* ) )
            // InternalKExpressions.g:4832:1: ( ( rule__InterfaceSignalDecl__Group_2_3__0 )* )
            {
            // InternalKExpressions.g:4832:1: ( ( rule__InterfaceSignalDecl__Group_2_3__0 )* )
            // InternalKExpressions.g:4833:1: ( rule__InterfaceSignalDecl__Group_2_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getGroup_2_3()); 
            }
            // InternalKExpressions.g:4834:1: ( rule__InterfaceSignalDecl__Group_2_3__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==47) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalKExpressions.g:4834:2: rule__InterfaceSignalDecl__Group_2_3__0
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
    // InternalKExpressions.g:4844:1: rule__InterfaceSignalDecl__Group_2__4 : rule__InterfaceSignalDecl__Group_2__4__Impl ;
    public final void rule__InterfaceSignalDecl__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4848:1: ( rule__InterfaceSignalDecl__Group_2__4__Impl )
            // InternalKExpressions.g:4849:2: rule__InterfaceSignalDecl__Group_2__4__Impl
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
    // InternalKExpressions.g:4855:1: rule__InterfaceSignalDecl__Group_2__4__Impl : ( ';' ) ;
    public final void rule__InterfaceSignalDecl__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4859:1: ( ( ';' ) )
            // InternalKExpressions.g:4860:1: ( ';' )
            {
            // InternalKExpressions.g:4860:1: ( ';' )
            // InternalKExpressions.g:4861:1: ';'
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
    // InternalKExpressions.g:4884:1: rule__InterfaceSignalDecl__Group_2_3__0 : rule__InterfaceSignalDecl__Group_2_3__0__Impl rule__InterfaceSignalDecl__Group_2_3__1 ;
    public final void rule__InterfaceSignalDecl__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4888:1: ( rule__InterfaceSignalDecl__Group_2_3__0__Impl rule__InterfaceSignalDecl__Group_2_3__1 )
            // InternalKExpressions.g:4889:2: rule__InterfaceSignalDecl__Group_2_3__0__Impl rule__InterfaceSignalDecl__Group_2_3__1
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
    // InternalKExpressions.g:4896:1: rule__InterfaceSignalDecl__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__InterfaceSignalDecl__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4900:1: ( ( ',' ) )
            // InternalKExpressions.g:4901:1: ( ',' )
            {
            // InternalKExpressions.g:4901:1: ( ',' )
            // InternalKExpressions.g:4902:1: ','
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
    // InternalKExpressions.g:4915:1: rule__InterfaceSignalDecl__Group_2_3__1 : rule__InterfaceSignalDecl__Group_2_3__1__Impl ;
    public final void rule__InterfaceSignalDecl__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4919:1: ( rule__InterfaceSignalDecl__Group_2_3__1__Impl )
            // InternalKExpressions.g:4920:2: rule__InterfaceSignalDecl__Group_2_3__1__Impl
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
    // InternalKExpressions.g:4926:1: rule__InterfaceSignalDecl__Group_2_3__1__Impl : ( ( rule__InterfaceSignalDecl__SignalsAssignment_2_3_1 ) ) ;
    public final void rule__InterfaceSignalDecl__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4930:1: ( ( ( rule__InterfaceSignalDecl__SignalsAssignment_2_3_1 ) ) )
            // InternalKExpressions.g:4931:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_2_3_1 ) )
            {
            // InternalKExpressions.g:4931:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_2_3_1 ) )
            // InternalKExpressions.g:4932:1: ( rule__InterfaceSignalDecl__SignalsAssignment_2_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSignalsAssignment_2_3_1()); 
            }
            // InternalKExpressions.g:4933:1: ( rule__InterfaceSignalDecl__SignalsAssignment_2_3_1 )
            // InternalKExpressions.g:4933:2: rule__InterfaceSignalDecl__SignalsAssignment_2_3_1
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
    // InternalKExpressions.g:4947:1: rule__InterfaceSignalDecl__Group_3__0 : rule__InterfaceSignalDecl__Group_3__0__Impl rule__InterfaceSignalDecl__Group_3__1 ;
    public final void rule__InterfaceSignalDecl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4951:1: ( rule__InterfaceSignalDecl__Group_3__0__Impl rule__InterfaceSignalDecl__Group_3__1 )
            // InternalKExpressions.g:4952:2: rule__InterfaceSignalDecl__Group_3__0__Impl rule__InterfaceSignalDecl__Group_3__1
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
    // InternalKExpressions.g:4959:1: rule__InterfaceSignalDecl__Group_3__0__Impl : ( () ) ;
    public final void rule__InterfaceSignalDecl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4963:1: ( ( () ) )
            // InternalKExpressions.g:4964:1: ( () )
            {
            // InternalKExpressions.g:4964:1: ( () )
            // InternalKExpressions.g:4965:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getReturnAction_3_0()); 
            }
            // InternalKExpressions.g:4966:1: ()
            // InternalKExpressions.g:4968:1: 
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
    // InternalKExpressions.g:4978:1: rule__InterfaceSignalDecl__Group_3__1 : rule__InterfaceSignalDecl__Group_3__1__Impl rule__InterfaceSignalDecl__Group_3__2 ;
    public final void rule__InterfaceSignalDecl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4982:1: ( rule__InterfaceSignalDecl__Group_3__1__Impl rule__InterfaceSignalDecl__Group_3__2 )
            // InternalKExpressions.g:4983:2: rule__InterfaceSignalDecl__Group_3__1__Impl rule__InterfaceSignalDecl__Group_3__2
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
    // InternalKExpressions.g:4990:1: rule__InterfaceSignalDecl__Group_3__1__Impl : ( 'return' ) ;
    public final void rule__InterfaceSignalDecl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:4994:1: ( ( 'return' ) )
            // InternalKExpressions.g:4995:1: ( 'return' )
            {
            // InternalKExpressions.g:4995:1: ( 'return' )
            // InternalKExpressions.g:4996:1: 'return'
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
    // InternalKExpressions.g:5009:1: rule__InterfaceSignalDecl__Group_3__2 : rule__InterfaceSignalDecl__Group_3__2__Impl rule__InterfaceSignalDecl__Group_3__3 ;
    public final void rule__InterfaceSignalDecl__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5013:1: ( rule__InterfaceSignalDecl__Group_3__2__Impl rule__InterfaceSignalDecl__Group_3__3 )
            // InternalKExpressions.g:5014:2: rule__InterfaceSignalDecl__Group_3__2__Impl rule__InterfaceSignalDecl__Group_3__3
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
    // InternalKExpressions.g:5021:1: rule__InterfaceSignalDecl__Group_3__2__Impl : ( ( rule__InterfaceSignalDecl__SignalsAssignment_3_2 ) ) ;
    public final void rule__InterfaceSignalDecl__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5025:1: ( ( ( rule__InterfaceSignalDecl__SignalsAssignment_3_2 ) ) )
            // InternalKExpressions.g:5026:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_3_2 ) )
            {
            // InternalKExpressions.g:5026:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_3_2 ) )
            // InternalKExpressions.g:5027:1: ( rule__InterfaceSignalDecl__SignalsAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSignalsAssignment_3_2()); 
            }
            // InternalKExpressions.g:5028:1: ( rule__InterfaceSignalDecl__SignalsAssignment_3_2 )
            // InternalKExpressions.g:5028:2: rule__InterfaceSignalDecl__SignalsAssignment_3_2
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
    // InternalKExpressions.g:5038:1: rule__InterfaceSignalDecl__Group_3__3 : rule__InterfaceSignalDecl__Group_3__3__Impl rule__InterfaceSignalDecl__Group_3__4 ;
    public final void rule__InterfaceSignalDecl__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5042:1: ( rule__InterfaceSignalDecl__Group_3__3__Impl rule__InterfaceSignalDecl__Group_3__4 )
            // InternalKExpressions.g:5043:2: rule__InterfaceSignalDecl__Group_3__3__Impl rule__InterfaceSignalDecl__Group_3__4
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
    // InternalKExpressions.g:5050:1: rule__InterfaceSignalDecl__Group_3__3__Impl : ( ( rule__InterfaceSignalDecl__Group_3_3__0 )* ) ;
    public final void rule__InterfaceSignalDecl__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5054:1: ( ( ( rule__InterfaceSignalDecl__Group_3_3__0 )* ) )
            // InternalKExpressions.g:5055:1: ( ( rule__InterfaceSignalDecl__Group_3_3__0 )* )
            {
            // InternalKExpressions.g:5055:1: ( ( rule__InterfaceSignalDecl__Group_3_3__0 )* )
            // InternalKExpressions.g:5056:1: ( rule__InterfaceSignalDecl__Group_3_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getGroup_3_3()); 
            }
            // InternalKExpressions.g:5057:1: ( rule__InterfaceSignalDecl__Group_3_3__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==47) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalKExpressions.g:5057:2: rule__InterfaceSignalDecl__Group_3_3__0
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
    // InternalKExpressions.g:5067:1: rule__InterfaceSignalDecl__Group_3__4 : rule__InterfaceSignalDecl__Group_3__4__Impl ;
    public final void rule__InterfaceSignalDecl__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5071:1: ( rule__InterfaceSignalDecl__Group_3__4__Impl )
            // InternalKExpressions.g:5072:2: rule__InterfaceSignalDecl__Group_3__4__Impl
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
    // InternalKExpressions.g:5078:1: rule__InterfaceSignalDecl__Group_3__4__Impl : ( ';' ) ;
    public final void rule__InterfaceSignalDecl__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5082:1: ( ( ';' ) )
            // InternalKExpressions.g:5083:1: ( ';' )
            {
            // InternalKExpressions.g:5083:1: ( ';' )
            // InternalKExpressions.g:5084:1: ';'
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
    // InternalKExpressions.g:5107:1: rule__InterfaceSignalDecl__Group_3_3__0 : rule__InterfaceSignalDecl__Group_3_3__0__Impl rule__InterfaceSignalDecl__Group_3_3__1 ;
    public final void rule__InterfaceSignalDecl__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5111:1: ( rule__InterfaceSignalDecl__Group_3_3__0__Impl rule__InterfaceSignalDecl__Group_3_3__1 )
            // InternalKExpressions.g:5112:2: rule__InterfaceSignalDecl__Group_3_3__0__Impl rule__InterfaceSignalDecl__Group_3_3__1
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
    // InternalKExpressions.g:5119:1: rule__InterfaceSignalDecl__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__InterfaceSignalDecl__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5123:1: ( ( ',' ) )
            // InternalKExpressions.g:5124:1: ( ',' )
            {
            // InternalKExpressions.g:5124:1: ( ',' )
            // InternalKExpressions.g:5125:1: ','
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
    // InternalKExpressions.g:5138:1: rule__InterfaceSignalDecl__Group_3_3__1 : rule__InterfaceSignalDecl__Group_3_3__1__Impl ;
    public final void rule__InterfaceSignalDecl__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5142:1: ( rule__InterfaceSignalDecl__Group_3_3__1__Impl )
            // InternalKExpressions.g:5143:2: rule__InterfaceSignalDecl__Group_3_3__1__Impl
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
    // InternalKExpressions.g:5149:1: rule__InterfaceSignalDecl__Group_3_3__1__Impl : ( ( rule__InterfaceSignalDecl__SignalsAssignment_3_3_1 ) ) ;
    public final void rule__InterfaceSignalDecl__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5153:1: ( ( ( rule__InterfaceSignalDecl__SignalsAssignment_3_3_1 ) ) )
            // InternalKExpressions.g:5154:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_3_3_1 ) )
            {
            // InternalKExpressions.g:5154:1: ( ( rule__InterfaceSignalDecl__SignalsAssignment_3_3_1 ) )
            // InternalKExpressions.g:5155:1: ( rule__InterfaceSignalDecl__SignalsAssignment_3_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceSignalDeclAccess().getSignalsAssignment_3_3_1()); 
            }
            // InternalKExpressions.g:5156:1: ( rule__InterfaceSignalDecl__SignalsAssignment_3_3_1 )
            // InternalKExpressions.g:5156:2: rule__InterfaceSignalDecl__SignalsAssignment_3_3_1
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
    // InternalKExpressions.g:5170:1: rule__ChannelDescription__Group_0__0 : rule__ChannelDescription__Group_0__0__Impl rule__ChannelDescription__Group_0__1 ;
    public final void rule__ChannelDescription__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5174:1: ( rule__ChannelDescription__Group_0__0__Impl rule__ChannelDescription__Group_0__1 )
            // InternalKExpressions.g:5175:2: rule__ChannelDescription__Group_0__0__Impl rule__ChannelDescription__Group_0__1
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
    // InternalKExpressions.g:5182:1: rule__ChannelDescription__Group_0__0__Impl : ( ':' ) ;
    public final void rule__ChannelDescription__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5186:1: ( ( ':' ) )
            // InternalKExpressions.g:5187:1: ( ':' )
            {
            // InternalKExpressions.g:5187:1: ( ':' )
            // InternalKExpressions.g:5188:1: ':'
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
    // InternalKExpressions.g:5201:1: rule__ChannelDescription__Group_0__1 : rule__ChannelDescription__Group_0__1__Impl ;
    public final void rule__ChannelDescription__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5205:1: ( rule__ChannelDescription__Group_0__1__Impl )
            // InternalKExpressions.g:5206:2: rule__ChannelDescription__Group_0__1__Impl
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
    // InternalKExpressions.g:5212:1: rule__ChannelDescription__Group_0__1__Impl : ( ( rule__ChannelDescription__TypeAssignment_0_1 ) ) ;
    public final void rule__ChannelDescription__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5216:1: ( ( ( rule__ChannelDescription__TypeAssignment_0_1 ) ) )
            // InternalKExpressions.g:5217:1: ( ( rule__ChannelDescription__TypeAssignment_0_1 ) )
            {
            // InternalKExpressions.g:5217:1: ( ( rule__ChannelDescription__TypeAssignment_0_1 ) )
            // InternalKExpressions.g:5218:1: ( rule__ChannelDescription__TypeAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChannelDescriptionAccess().getTypeAssignment_0_1()); 
            }
            // InternalKExpressions.g:5219:1: ( rule__ChannelDescription__TypeAssignment_0_1 )
            // InternalKExpressions.g:5219:2: rule__ChannelDescription__TypeAssignment_0_1
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
    // InternalKExpressions.g:5233:1: rule__ChannelDescription__Group_1__0 : rule__ChannelDescription__Group_1__0__Impl rule__ChannelDescription__Group_1__1 ;
    public final void rule__ChannelDescription__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5237:1: ( rule__ChannelDescription__Group_1__0__Impl rule__ChannelDescription__Group_1__1 )
            // InternalKExpressions.g:5238:2: rule__ChannelDescription__Group_1__0__Impl rule__ChannelDescription__Group_1__1
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
    // InternalKExpressions.g:5245:1: rule__ChannelDescription__Group_1__0__Impl : ( '(' ) ;
    public final void rule__ChannelDescription__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5249:1: ( ( '(' ) )
            // InternalKExpressions.g:5250:1: ( '(' )
            {
            // InternalKExpressions.g:5250:1: ( '(' )
            // InternalKExpressions.g:5251:1: '('
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
    // InternalKExpressions.g:5264:1: rule__ChannelDescription__Group_1__1 : rule__ChannelDescription__Group_1__1__Impl rule__ChannelDescription__Group_1__2 ;
    public final void rule__ChannelDescription__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5268:1: ( rule__ChannelDescription__Group_1__1__Impl rule__ChannelDescription__Group_1__2 )
            // InternalKExpressions.g:5269:2: rule__ChannelDescription__Group_1__1__Impl rule__ChannelDescription__Group_1__2
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
    // InternalKExpressions.g:5276:1: rule__ChannelDescription__Group_1__1__Impl : ( ( rule__ChannelDescription__TypeAssignment_1_1 ) ) ;
    public final void rule__ChannelDescription__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5280:1: ( ( ( rule__ChannelDescription__TypeAssignment_1_1 ) ) )
            // InternalKExpressions.g:5281:1: ( ( rule__ChannelDescription__TypeAssignment_1_1 ) )
            {
            // InternalKExpressions.g:5281:1: ( ( rule__ChannelDescription__TypeAssignment_1_1 ) )
            // InternalKExpressions.g:5282:1: ( rule__ChannelDescription__TypeAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChannelDescriptionAccess().getTypeAssignment_1_1()); 
            }
            // InternalKExpressions.g:5283:1: ( rule__ChannelDescription__TypeAssignment_1_1 )
            // InternalKExpressions.g:5283:2: rule__ChannelDescription__TypeAssignment_1_1
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
    // InternalKExpressions.g:5293:1: rule__ChannelDescription__Group_1__2 : rule__ChannelDescription__Group_1__2__Impl ;
    public final void rule__ChannelDescription__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5297:1: ( rule__ChannelDescription__Group_1__2__Impl )
            // InternalKExpressions.g:5298:2: rule__ChannelDescription__Group_1__2__Impl
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
    // InternalKExpressions.g:5304:1: rule__ChannelDescription__Group_1__2__Impl : ( ')' ) ;
    public final void rule__ChannelDescription__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5308:1: ( ( ')' ) )
            // InternalKExpressions.g:5309:1: ( ')' )
            {
            // InternalKExpressions.g:5309:1: ( ')' )
            // InternalKExpressions.g:5310:1: ')'
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
    // InternalKExpressions.g:5329:1: rule__ChannelDescription__Group_2__0 : rule__ChannelDescription__Group_2__0__Impl rule__ChannelDescription__Group_2__1 ;
    public final void rule__ChannelDescription__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5333:1: ( rule__ChannelDescription__Group_2__0__Impl rule__ChannelDescription__Group_2__1 )
            // InternalKExpressions.g:5334:2: rule__ChannelDescription__Group_2__0__Impl rule__ChannelDescription__Group_2__1
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
    // InternalKExpressions.g:5341:1: rule__ChannelDescription__Group_2__0__Impl : ( ':=' ) ;
    public final void rule__ChannelDescription__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5345:1: ( ( ':=' ) )
            // InternalKExpressions.g:5346:1: ( ':=' )
            {
            // InternalKExpressions.g:5346:1: ( ':=' )
            // InternalKExpressions.g:5347:1: ':='
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
    // InternalKExpressions.g:5360:1: rule__ChannelDescription__Group_2__1 : rule__ChannelDescription__Group_2__1__Impl rule__ChannelDescription__Group_2__2 ;
    public final void rule__ChannelDescription__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5364:1: ( rule__ChannelDescription__Group_2__1__Impl rule__ChannelDescription__Group_2__2 )
            // InternalKExpressions.g:5365:2: rule__ChannelDescription__Group_2__1__Impl rule__ChannelDescription__Group_2__2
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
    // InternalKExpressions.g:5372:1: rule__ChannelDescription__Group_2__1__Impl : ( ( rule__ChannelDescription__ExpressionAssignment_2_1 ) ) ;
    public final void rule__ChannelDescription__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5376:1: ( ( ( rule__ChannelDescription__ExpressionAssignment_2_1 ) ) )
            // InternalKExpressions.g:5377:1: ( ( rule__ChannelDescription__ExpressionAssignment_2_1 ) )
            {
            // InternalKExpressions.g:5377:1: ( ( rule__ChannelDescription__ExpressionAssignment_2_1 ) )
            // InternalKExpressions.g:5378:1: ( rule__ChannelDescription__ExpressionAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChannelDescriptionAccess().getExpressionAssignment_2_1()); 
            }
            // InternalKExpressions.g:5379:1: ( rule__ChannelDescription__ExpressionAssignment_2_1 )
            // InternalKExpressions.g:5379:2: rule__ChannelDescription__ExpressionAssignment_2_1
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
    // InternalKExpressions.g:5389:1: rule__ChannelDescription__Group_2__2 : rule__ChannelDescription__Group_2__2__Impl rule__ChannelDescription__Group_2__3 ;
    public final void rule__ChannelDescription__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5393:1: ( rule__ChannelDescription__Group_2__2__Impl rule__ChannelDescription__Group_2__3 )
            // InternalKExpressions.g:5394:2: rule__ChannelDescription__Group_2__2__Impl rule__ChannelDescription__Group_2__3
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
    // InternalKExpressions.g:5401:1: rule__ChannelDescription__Group_2__2__Impl : ( ':' ) ;
    public final void rule__ChannelDescription__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5405:1: ( ( ':' ) )
            // InternalKExpressions.g:5406:1: ( ':' )
            {
            // InternalKExpressions.g:5406:1: ( ':' )
            // InternalKExpressions.g:5407:1: ':'
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
    // InternalKExpressions.g:5420:1: rule__ChannelDescription__Group_2__3 : rule__ChannelDescription__Group_2__3__Impl ;
    public final void rule__ChannelDescription__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5424:1: ( rule__ChannelDescription__Group_2__3__Impl )
            // InternalKExpressions.g:5425:2: rule__ChannelDescription__Group_2__3__Impl
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
    // InternalKExpressions.g:5431:1: rule__ChannelDescription__Group_2__3__Impl : ( ( rule__ChannelDescription__TypeAssignment_2_3 ) ) ;
    public final void rule__ChannelDescription__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5435:1: ( ( ( rule__ChannelDescription__TypeAssignment_2_3 ) ) )
            // InternalKExpressions.g:5436:1: ( ( rule__ChannelDescription__TypeAssignment_2_3 ) )
            {
            // InternalKExpressions.g:5436:1: ( ( rule__ChannelDescription__TypeAssignment_2_3 ) )
            // InternalKExpressions.g:5437:1: ( rule__ChannelDescription__TypeAssignment_2_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChannelDescriptionAccess().getTypeAssignment_2_3()); 
            }
            // InternalKExpressions.g:5438:1: ( rule__ChannelDescription__TypeAssignment_2_3 )
            // InternalKExpressions.g:5438:2: rule__ChannelDescription__TypeAssignment_2_3
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
    // InternalKExpressions.g:5456:1: rule__InterfaceVariableDecl__Group__0 : rule__InterfaceVariableDecl__Group__0__Impl rule__InterfaceVariableDecl__Group__1 ;
    public final void rule__InterfaceVariableDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5460:1: ( rule__InterfaceVariableDecl__Group__0__Impl rule__InterfaceVariableDecl__Group__1 )
            // InternalKExpressions.g:5461:2: rule__InterfaceVariableDecl__Group__0__Impl rule__InterfaceVariableDecl__Group__1
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
    // InternalKExpressions.g:5468:1: rule__InterfaceVariableDecl__Group__0__Impl : ( 'var' ) ;
    public final void rule__InterfaceVariableDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5472:1: ( ( 'var' ) )
            // InternalKExpressions.g:5473:1: ( 'var' )
            {
            // InternalKExpressions.g:5473:1: ( 'var' )
            // InternalKExpressions.g:5474:1: 'var'
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
    // InternalKExpressions.g:5487:1: rule__InterfaceVariableDecl__Group__1 : rule__InterfaceVariableDecl__Group__1__Impl rule__InterfaceVariableDecl__Group__2 ;
    public final void rule__InterfaceVariableDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5491:1: ( rule__InterfaceVariableDecl__Group__1__Impl rule__InterfaceVariableDecl__Group__2 )
            // InternalKExpressions.g:5492:2: rule__InterfaceVariableDecl__Group__1__Impl rule__InterfaceVariableDecl__Group__2
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
    // InternalKExpressions.g:5499:1: rule__InterfaceVariableDecl__Group__1__Impl : ( ( rule__InterfaceVariableDecl__VarDeclsAssignment_1 ) ) ;
    public final void rule__InterfaceVariableDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5503:1: ( ( ( rule__InterfaceVariableDecl__VarDeclsAssignment_1 ) ) )
            // InternalKExpressions.g:5504:1: ( ( rule__InterfaceVariableDecl__VarDeclsAssignment_1 ) )
            {
            // InternalKExpressions.g:5504:1: ( ( rule__InterfaceVariableDecl__VarDeclsAssignment_1 ) )
            // InternalKExpressions.g:5505:1: ( rule__InterfaceVariableDecl__VarDeclsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceVariableDeclAccess().getVarDeclsAssignment_1()); 
            }
            // InternalKExpressions.g:5506:1: ( rule__InterfaceVariableDecl__VarDeclsAssignment_1 )
            // InternalKExpressions.g:5506:2: rule__InterfaceVariableDecl__VarDeclsAssignment_1
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
    // InternalKExpressions.g:5516:1: rule__InterfaceVariableDecl__Group__2 : rule__InterfaceVariableDecl__Group__2__Impl ;
    public final void rule__InterfaceVariableDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5520:1: ( rule__InterfaceVariableDecl__Group__2__Impl )
            // InternalKExpressions.g:5521:2: rule__InterfaceVariableDecl__Group__2__Impl
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
    // InternalKExpressions.g:5527:1: rule__InterfaceVariableDecl__Group__2__Impl : ( ( rule__InterfaceVariableDecl__Group_2__0 )* ) ;
    public final void rule__InterfaceVariableDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5531:1: ( ( ( rule__InterfaceVariableDecl__Group_2__0 )* ) )
            // InternalKExpressions.g:5532:1: ( ( rule__InterfaceVariableDecl__Group_2__0 )* )
            {
            // InternalKExpressions.g:5532:1: ( ( rule__InterfaceVariableDecl__Group_2__0 )* )
            // InternalKExpressions.g:5533:1: ( rule__InterfaceVariableDecl__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceVariableDeclAccess().getGroup_2()); 
            }
            // InternalKExpressions.g:5534:1: ( rule__InterfaceVariableDecl__Group_2__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==47) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalKExpressions.g:5534:2: rule__InterfaceVariableDecl__Group_2__0
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
    // InternalKExpressions.g:5550:1: rule__InterfaceVariableDecl__Group_2__0 : rule__InterfaceVariableDecl__Group_2__0__Impl rule__InterfaceVariableDecl__Group_2__1 ;
    public final void rule__InterfaceVariableDecl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5554:1: ( rule__InterfaceVariableDecl__Group_2__0__Impl rule__InterfaceVariableDecl__Group_2__1 )
            // InternalKExpressions.g:5555:2: rule__InterfaceVariableDecl__Group_2__0__Impl rule__InterfaceVariableDecl__Group_2__1
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
    // InternalKExpressions.g:5562:1: rule__InterfaceVariableDecl__Group_2__0__Impl : ( ',' ) ;
    public final void rule__InterfaceVariableDecl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5566:1: ( ( ',' ) )
            // InternalKExpressions.g:5567:1: ( ',' )
            {
            // InternalKExpressions.g:5567:1: ( ',' )
            // InternalKExpressions.g:5568:1: ','
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
    // InternalKExpressions.g:5581:1: rule__InterfaceVariableDecl__Group_2__1 : rule__InterfaceVariableDecl__Group_2__1__Impl ;
    public final void rule__InterfaceVariableDecl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5585:1: ( rule__InterfaceVariableDecl__Group_2__1__Impl )
            // InternalKExpressions.g:5586:2: rule__InterfaceVariableDecl__Group_2__1__Impl
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
    // InternalKExpressions.g:5592:1: rule__InterfaceVariableDecl__Group_2__1__Impl : ( ( rule__InterfaceVariableDecl__VarDeclsAssignment_2_1 ) ) ;
    public final void rule__InterfaceVariableDecl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5596:1: ( ( ( rule__InterfaceVariableDecl__VarDeclsAssignment_2_1 ) ) )
            // InternalKExpressions.g:5597:1: ( ( rule__InterfaceVariableDecl__VarDeclsAssignment_2_1 ) )
            {
            // InternalKExpressions.g:5597:1: ( ( rule__InterfaceVariableDecl__VarDeclsAssignment_2_1 ) )
            // InternalKExpressions.g:5598:1: ( rule__InterfaceVariableDecl__VarDeclsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceVariableDeclAccess().getVarDeclsAssignment_2_1()); 
            }
            // InternalKExpressions.g:5599:1: ( rule__InterfaceVariableDecl__VarDeclsAssignment_2_1 )
            // InternalKExpressions.g:5599:2: rule__InterfaceVariableDecl__VarDeclsAssignment_2_1
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
    // InternalKExpressions.g:5613:1: rule__VariableDecl__Group__0 : rule__VariableDecl__Group__0__Impl rule__VariableDecl__Group__1 ;
    public final void rule__VariableDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5617:1: ( rule__VariableDecl__Group__0__Impl rule__VariableDecl__Group__1 )
            // InternalKExpressions.g:5618:2: rule__VariableDecl__Group__0__Impl rule__VariableDecl__Group__1
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
    // InternalKExpressions.g:5625:1: rule__VariableDecl__Group__0__Impl : ( ( rule__VariableDecl__VariablesAssignment_0 ) ) ;
    public final void rule__VariableDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5629:1: ( ( ( rule__VariableDecl__VariablesAssignment_0 ) ) )
            // InternalKExpressions.g:5630:1: ( ( rule__VariableDecl__VariablesAssignment_0 ) )
            {
            // InternalKExpressions.g:5630:1: ( ( rule__VariableDecl__VariablesAssignment_0 ) )
            // InternalKExpressions.g:5631:1: ( rule__VariableDecl__VariablesAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclAccess().getVariablesAssignment_0()); 
            }
            // InternalKExpressions.g:5632:1: ( rule__VariableDecl__VariablesAssignment_0 )
            // InternalKExpressions.g:5632:2: rule__VariableDecl__VariablesAssignment_0
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
    // InternalKExpressions.g:5642:1: rule__VariableDecl__Group__1 : rule__VariableDecl__Group__1__Impl rule__VariableDecl__Group__2 ;
    public final void rule__VariableDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5646:1: ( rule__VariableDecl__Group__1__Impl rule__VariableDecl__Group__2 )
            // InternalKExpressions.g:5647:2: rule__VariableDecl__Group__1__Impl rule__VariableDecl__Group__2
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
    // InternalKExpressions.g:5654:1: rule__VariableDecl__Group__1__Impl : ( ( rule__VariableDecl__Group_1__0 )* ) ;
    public final void rule__VariableDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5658:1: ( ( ( rule__VariableDecl__Group_1__0 )* ) )
            // InternalKExpressions.g:5659:1: ( ( rule__VariableDecl__Group_1__0 )* )
            {
            // InternalKExpressions.g:5659:1: ( ( rule__VariableDecl__Group_1__0 )* )
            // InternalKExpressions.g:5660:1: ( rule__VariableDecl__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:5661:1: ( rule__VariableDecl__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==47) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalKExpressions.g:5661:2: rule__VariableDecl__Group_1__0
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
    // InternalKExpressions.g:5671:1: rule__VariableDecl__Group__2 : rule__VariableDecl__Group__2__Impl rule__VariableDecl__Group__3 ;
    public final void rule__VariableDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5675:1: ( rule__VariableDecl__Group__2__Impl rule__VariableDecl__Group__3 )
            // InternalKExpressions.g:5676:2: rule__VariableDecl__Group__2__Impl rule__VariableDecl__Group__3
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
    // InternalKExpressions.g:5683:1: rule__VariableDecl__Group__2__Impl : ( ':' ) ;
    public final void rule__VariableDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5687:1: ( ( ':' ) )
            // InternalKExpressions.g:5688:1: ( ':' )
            {
            // InternalKExpressions.g:5688:1: ( ':' )
            // InternalKExpressions.g:5689:1: ':'
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
    // InternalKExpressions.g:5702:1: rule__VariableDecl__Group__3 : rule__VariableDecl__Group__3__Impl ;
    public final void rule__VariableDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5706:1: ( rule__VariableDecl__Group__3__Impl )
            // InternalKExpressions.g:5707:2: rule__VariableDecl__Group__3__Impl
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
    // InternalKExpressions.g:5713:1: rule__VariableDecl__Group__3__Impl : ( ( rule__VariableDecl__TypeAssignment_3 ) ) ;
    public final void rule__VariableDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5717:1: ( ( ( rule__VariableDecl__TypeAssignment_3 ) ) )
            // InternalKExpressions.g:5718:1: ( ( rule__VariableDecl__TypeAssignment_3 ) )
            {
            // InternalKExpressions.g:5718:1: ( ( rule__VariableDecl__TypeAssignment_3 ) )
            // InternalKExpressions.g:5719:1: ( rule__VariableDecl__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclAccess().getTypeAssignment_3()); 
            }
            // InternalKExpressions.g:5720:1: ( rule__VariableDecl__TypeAssignment_3 )
            // InternalKExpressions.g:5720:2: rule__VariableDecl__TypeAssignment_3
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
    // InternalKExpressions.g:5738:1: rule__VariableDecl__Group_1__0 : rule__VariableDecl__Group_1__0__Impl rule__VariableDecl__Group_1__1 ;
    public final void rule__VariableDecl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5742:1: ( rule__VariableDecl__Group_1__0__Impl rule__VariableDecl__Group_1__1 )
            // InternalKExpressions.g:5743:2: rule__VariableDecl__Group_1__0__Impl rule__VariableDecl__Group_1__1
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
    // InternalKExpressions.g:5750:1: rule__VariableDecl__Group_1__0__Impl : ( ',' ) ;
    public final void rule__VariableDecl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5754:1: ( ( ',' ) )
            // InternalKExpressions.g:5755:1: ( ',' )
            {
            // InternalKExpressions.g:5755:1: ( ',' )
            // InternalKExpressions.g:5756:1: ','
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
    // InternalKExpressions.g:5769:1: rule__VariableDecl__Group_1__1 : rule__VariableDecl__Group_1__1__Impl ;
    public final void rule__VariableDecl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5773:1: ( rule__VariableDecl__Group_1__1__Impl )
            // InternalKExpressions.g:5774:2: rule__VariableDecl__Group_1__1__Impl
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
    // InternalKExpressions.g:5780:1: rule__VariableDecl__Group_1__1__Impl : ( ( rule__VariableDecl__VariablesAssignment_1_1 ) ) ;
    public final void rule__VariableDecl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5784:1: ( ( ( rule__VariableDecl__VariablesAssignment_1_1 ) ) )
            // InternalKExpressions.g:5785:1: ( ( rule__VariableDecl__VariablesAssignment_1_1 ) )
            {
            // InternalKExpressions.g:5785:1: ( ( rule__VariableDecl__VariablesAssignment_1_1 ) )
            // InternalKExpressions.g:5786:1: ( rule__VariableDecl__VariablesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclAccess().getVariablesAssignment_1_1()); 
            }
            // InternalKExpressions.g:5787:1: ( rule__VariableDecl__VariablesAssignment_1_1 )
            // InternalKExpressions.g:5787:2: rule__VariableDecl__VariablesAssignment_1_1
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
    // InternalKExpressions.g:5801:1: rule__IVariable__Group__0 : rule__IVariable__Group__0__Impl rule__IVariable__Group__1 ;
    public final void rule__IVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5805:1: ( rule__IVariable__Group__0__Impl rule__IVariable__Group__1 )
            // InternalKExpressions.g:5806:2: rule__IVariable__Group__0__Impl rule__IVariable__Group__1
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
    // InternalKExpressions.g:5813:1: rule__IVariable__Group__0__Impl : ( ( rule__IVariable__NameAssignment_0 ) ) ;
    public final void rule__IVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5817:1: ( ( ( rule__IVariable__NameAssignment_0 ) ) )
            // InternalKExpressions.g:5818:1: ( ( rule__IVariable__NameAssignment_0 ) )
            {
            // InternalKExpressions.g:5818:1: ( ( rule__IVariable__NameAssignment_0 ) )
            // InternalKExpressions.g:5819:1: ( rule__IVariable__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIVariableAccess().getNameAssignment_0()); 
            }
            // InternalKExpressions.g:5820:1: ( rule__IVariable__NameAssignment_0 )
            // InternalKExpressions.g:5820:2: rule__IVariable__NameAssignment_0
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
    // InternalKExpressions.g:5830:1: rule__IVariable__Group__1 : rule__IVariable__Group__1__Impl ;
    public final void rule__IVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5834:1: ( rule__IVariable__Group__1__Impl )
            // InternalKExpressions.g:5835:2: rule__IVariable__Group__1__Impl
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
    // InternalKExpressions.g:5841:1: rule__IVariable__Group__1__Impl : ( ( rule__IVariable__Group_1__0 )? ) ;
    public final void rule__IVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5845:1: ( ( ( rule__IVariable__Group_1__0 )? ) )
            // InternalKExpressions.g:5846:1: ( ( rule__IVariable__Group_1__0 )? )
            {
            // InternalKExpressions.g:5846:1: ( ( rule__IVariable__Group_1__0 )? )
            // InternalKExpressions.g:5847:1: ( rule__IVariable__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIVariableAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:5848:1: ( rule__IVariable__Group_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==52) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalKExpressions.g:5848:2: rule__IVariable__Group_1__0
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
    // InternalKExpressions.g:5862:1: rule__IVariable__Group_1__0 : rule__IVariable__Group_1__0__Impl rule__IVariable__Group_1__1 ;
    public final void rule__IVariable__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5866:1: ( rule__IVariable__Group_1__0__Impl rule__IVariable__Group_1__1 )
            // InternalKExpressions.g:5867:2: rule__IVariable__Group_1__0__Impl rule__IVariable__Group_1__1
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
    // InternalKExpressions.g:5874:1: rule__IVariable__Group_1__0__Impl : ( ':=' ) ;
    public final void rule__IVariable__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5878:1: ( ( ':=' ) )
            // InternalKExpressions.g:5879:1: ( ':=' )
            {
            // InternalKExpressions.g:5879:1: ( ':=' )
            // InternalKExpressions.g:5880:1: ':='
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
    // InternalKExpressions.g:5893:1: rule__IVariable__Group_1__1 : rule__IVariable__Group_1__1__Impl ;
    public final void rule__IVariable__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5897:1: ( rule__IVariable__Group_1__1__Impl )
            // InternalKExpressions.g:5898:2: rule__IVariable__Group_1__1__Impl
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
    // InternalKExpressions.g:5904:1: rule__IVariable__Group_1__1__Impl : ( ( rule__IVariable__ExpressionAssignment_1_1 ) ) ;
    public final void rule__IVariable__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5908:1: ( ( ( rule__IVariable__ExpressionAssignment_1_1 ) ) )
            // InternalKExpressions.g:5909:1: ( ( rule__IVariable__ExpressionAssignment_1_1 ) )
            {
            // InternalKExpressions.g:5909:1: ( ( rule__IVariable__ExpressionAssignment_1_1 ) )
            // InternalKExpressions.g:5910:1: ( rule__IVariable__ExpressionAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIVariableAccess().getExpressionAssignment_1_1()); 
            }
            // InternalKExpressions.g:5911:1: ( rule__IVariable__ExpressionAssignment_1_1 )
            // InternalKExpressions.g:5911:2: rule__IVariable__ExpressionAssignment_1_1
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
    // InternalKExpressions.g:5925:1: rule__TypeIdentifier__Group_2__0 : rule__TypeIdentifier__Group_2__0__Impl rule__TypeIdentifier__Group_2__1 ;
    public final void rule__TypeIdentifier__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5929:1: ( rule__TypeIdentifier__Group_2__0__Impl rule__TypeIdentifier__Group_2__1 )
            // InternalKExpressions.g:5930:2: rule__TypeIdentifier__Group_2__0__Impl rule__TypeIdentifier__Group_2__1
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
    // InternalKExpressions.g:5937:1: rule__TypeIdentifier__Group_2__0__Impl : ( 'combine' ) ;
    public final void rule__TypeIdentifier__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5941:1: ( ( 'combine' ) )
            // InternalKExpressions.g:5942:1: ( 'combine' )
            {
            // InternalKExpressions.g:5942:1: ( 'combine' )
            // InternalKExpressions.g:5943:1: 'combine'
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
    // InternalKExpressions.g:5956:1: rule__TypeIdentifier__Group_2__1 : rule__TypeIdentifier__Group_2__1__Impl rule__TypeIdentifier__Group_2__2 ;
    public final void rule__TypeIdentifier__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5960:1: ( rule__TypeIdentifier__Group_2__1__Impl rule__TypeIdentifier__Group_2__2 )
            // InternalKExpressions.g:5961:2: rule__TypeIdentifier__Group_2__1__Impl rule__TypeIdentifier__Group_2__2
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
    // InternalKExpressions.g:5968:1: rule__TypeIdentifier__Group_2__1__Impl : ( ( rule__TypeIdentifier__Alternatives_2_1 ) ) ;
    public final void rule__TypeIdentifier__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5972:1: ( ( ( rule__TypeIdentifier__Alternatives_2_1 ) ) )
            // InternalKExpressions.g:5973:1: ( ( rule__TypeIdentifier__Alternatives_2_1 ) )
            {
            // InternalKExpressions.g:5973:1: ( ( rule__TypeIdentifier__Alternatives_2_1 ) )
            // InternalKExpressions.g:5974:1: ( rule__TypeIdentifier__Alternatives_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeIdentifierAccess().getAlternatives_2_1()); 
            }
            // InternalKExpressions.g:5975:1: ( rule__TypeIdentifier__Alternatives_2_1 )
            // InternalKExpressions.g:5975:2: rule__TypeIdentifier__Alternatives_2_1
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
    // InternalKExpressions.g:5985:1: rule__TypeIdentifier__Group_2__2 : rule__TypeIdentifier__Group_2__2__Impl rule__TypeIdentifier__Group_2__3 ;
    public final void rule__TypeIdentifier__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:5989:1: ( rule__TypeIdentifier__Group_2__2__Impl rule__TypeIdentifier__Group_2__3 )
            // InternalKExpressions.g:5990:2: rule__TypeIdentifier__Group_2__2__Impl rule__TypeIdentifier__Group_2__3
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
    // InternalKExpressions.g:5997:1: rule__TypeIdentifier__Group_2__2__Impl : ( 'with' ) ;
    public final void rule__TypeIdentifier__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6001:1: ( ( 'with' ) )
            // InternalKExpressions.g:6002:1: ( 'with' )
            {
            // InternalKExpressions.g:6002:1: ( 'with' )
            // InternalKExpressions.g:6003:1: 'with'
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
    // InternalKExpressions.g:6016:1: rule__TypeIdentifier__Group_2__3 : rule__TypeIdentifier__Group_2__3__Impl ;
    public final void rule__TypeIdentifier__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6020:1: ( rule__TypeIdentifier__Group_2__3__Impl )
            // InternalKExpressions.g:6021:2: rule__TypeIdentifier__Group_2__3__Impl
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
    // InternalKExpressions.g:6027:1: rule__TypeIdentifier__Group_2__3__Impl : ( ( rule__TypeIdentifier__OperatorAssignment_2_3 ) ) ;
    public final void rule__TypeIdentifier__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6031:1: ( ( ( rule__TypeIdentifier__OperatorAssignment_2_3 ) ) )
            // InternalKExpressions.g:6032:1: ( ( rule__TypeIdentifier__OperatorAssignment_2_3 ) )
            {
            // InternalKExpressions.g:6032:1: ( ( rule__TypeIdentifier__OperatorAssignment_2_3 ) )
            // InternalKExpressions.g:6033:1: ( rule__TypeIdentifier__OperatorAssignment_2_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeIdentifierAccess().getOperatorAssignment_2_3()); 
            }
            // InternalKExpressions.g:6034:1: ( rule__TypeIdentifier__OperatorAssignment_2_3 )
            // InternalKExpressions.g:6034:2: rule__TypeIdentifier__OperatorAssignment_2_3
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
    // InternalKExpressions.g:6052:1: rule__TagAnnotation__Group__0 : rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 ;
    public final void rule__TagAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6056:1: ( rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 )
            // InternalKExpressions.g:6057:2: rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1
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
    // InternalKExpressions.g:6064:1: rule__TagAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TagAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6068:1: ( ( '@' ) )
            // InternalKExpressions.g:6069:1: ( '@' )
            {
            // InternalKExpressions.g:6069:1: ( '@' )
            // InternalKExpressions.g:6070:1: '@'
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
    // InternalKExpressions.g:6083:1: rule__TagAnnotation__Group__1 : rule__TagAnnotation__Group__1__Impl ;
    public final void rule__TagAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6087:1: ( rule__TagAnnotation__Group__1__Impl )
            // InternalKExpressions.g:6088:2: rule__TagAnnotation__Group__1__Impl
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
    // InternalKExpressions.g:6094:1: rule__TagAnnotation__Group__1__Impl : ( ( rule__TagAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TagAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6098:1: ( ( ( rule__TagAnnotation__NameAssignment_1 ) ) )
            // InternalKExpressions.g:6099:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:6099:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            // InternalKExpressions.g:6100:1: ( rule__TagAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:6101:1: ( rule__TagAnnotation__NameAssignment_1 )
            // InternalKExpressions.g:6101:2: rule__TagAnnotation__NameAssignment_1
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
    // InternalKExpressions.g:6115:1: rule__KeyStringValueAnnotation__Group__0 : rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 ;
    public final void rule__KeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6119:1: ( rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 )
            // InternalKExpressions.g:6120:2: rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1
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
    // InternalKExpressions.g:6127:1: rule__KeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6131:1: ( ( '@' ) )
            // InternalKExpressions.g:6132:1: ( '@' )
            {
            // InternalKExpressions.g:6132:1: ( '@' )
            // InternalKExpressions.g:6133:1: '@'
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
    // InternalKExpressions.g:6146:1: rule__KeyStringValueAnnotation__Group__1 : rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 ;
    public final void rule__KeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6150:1: ( rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 )
            // InternalKExpressions.g:6151:2: rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2
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
    // InternalKExpressions.g:6158:1: rule__KeyStringValueAnnotation__Group__1__Impl : ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6162:1: ( ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKExpressions.g:6163:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:6163:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKExpressions.g:6164:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:6165:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            // InternalKExpressions.g:6165:2: rule__KeyStringValueAnnotation__NameAssignment_1
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
    // InternalKExpressions.g:6175:1: rule__KeyStringValueAnnotation__Group__2 : rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 ;
    public final void rule__KeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6179:1: ( rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 )
            // InternalKExpressions.g:6180:2: rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3
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
    // InternalKExpressions.g:6187:1: rule__KeyStringValueAnnotation__Group__2__Impl : ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6191:1: ( ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalKExpressions.g:6192:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalKExpressions.g:6192:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalKExpressions.g:6193:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            }
            // InternalKExpressions.g:6194:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalKExpressions.g:6194:2: rule__KeyStringValueAnnotation__ValuesAssignment_2
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
    // InternalKExpressions.g:6204:1: rule__KeyStringValueAnnotation__Group__3 : rule__KeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__KeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6208:1: ( rule__KeyStringValueAnnotation__Group__3__Impl )
            // InternalKExpressions.g:6209:2: rule__KeyStringValueAnnotation__Group__3__Impl
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
    // InternalKExpressions.g:6215:1: rule__KeyStringValueAnnotation__Group__3__Impl : ( ( rule__KeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__KeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6219:1: ( ( ( rule__KeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalKExpressions.g:6220:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalKExpressions.g:6220:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )* )
            // InternalKExpressions.g:6221:1: ( rule__KeyStringValueAnnotation__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // InternalKExpressions.g:6222:1: ( rule__KeyStringValueAnnotation__Group_3__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==47) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalKExpressions.g:6222:2: rule__KeyStringValueAnnotation__Group_3__0
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
    // InternalKExpressions.g:6240:1: rule__KeyStringValueAnnotation__Group_3__0 : rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 ;
    public final void rule__KeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6244:1: ( rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 )
            // InternalKExpressions.g:6245:2: rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1
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
    // InternalKExpressions.g:6252:1: rule__KeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6256:1: ( ( ',' ) )
            // InternalKExpressions.g:6257:1: ( ',' )
            {
            // InternalKExpressions.g:6257:1: ( ',' )
            // InternalKExpressions.g:6258:1: ','
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
    // InternalKExpressions.g:6271:1: rule__KeyStringValueAnnotation__Group_3__1 : rule__KeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__KeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6275:1: ( rule__KeyStringValueAnnotation__Group_3__1__Impl )
            // InternalKExpressions.g:6276:2: rule__KeyStringValueAnnotation__Group_3__1__Impl
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
    // InternalKExpressions.g:6282:1: rule__KeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6286:1: ( ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalKExpressions.g:6287:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalKExpressions.g:6287:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalKExpressions.g:6288:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            }
            // InternalKExpressions.g:6289:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalKExpressions.g:6289:2: rule__KeyStringValueAnnotation__ValuesAssignment_3_1
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
    // InternalKExpressions.g:6303:1: rule__RestrictedKeyStringValueAnnotation__Group__0 : rule__RestrictedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedKeyStringValueAnnotation__Group__1 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6307:1: ( rule__RestrictedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedKeyStringValueAnnotation__Group__1 )
            // InternalKExpressions.g:6308:2: rule__RestrictedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedKeyStringValueAnnotation__Group__1
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
    // InternalKExpressions.g:6315:1: rule__RestrictedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6319:1: ( ( '@' ) )
            // InternalKExpressions.g:6320:1: ( '@' )
            {
            // InternalKExpressions.g:6320:1: ( '@' )
            // InternalKExpressions.g:6321:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:6334:1: rule__RestrictedKeyStringValueAnnotation__Group__1 : rule__RestrictedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedKeyStringValueAnnotation__Group__2 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6338:1: ( rule__RestrictedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedKeyStringValueAnnotation__Group__2 )
            // InternalKExpressions.g:6339:2: rule__RestrictedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedKeyStringValueAnnotation__Group__2
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
    // InternalKExpressions.g:6346:1: rule__RestrictedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6350:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKExpressions.g:6351:1: ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:6351:1: ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKExpressions.g:6352:1: ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:6353:1: ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKExpressions.g:6353:2: rule__RestrictedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKExpressions.g:6363:1: rule__RestrictedKeyStringValueAnnotation__Group__2 : rule__RestrictedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedKeyStringValueAnnotation__Group__3 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6367:1: ( rule__RestrictedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedKeyStringValueAnnotation__Group__3 )
            // InternalKExpressions.g:6368:2: rule__RestrictedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedKeyStringValueAnnotation__Group__3
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
    // InternalKExpressions.g:6375:1: rule__RestrictedKeyStringValueAnnotation__Group__2__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6379:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalKExpressions.g:6380:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalKExpressions.g:6380:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalKExpressions.g:6381:1: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            }
            // InternalKExpressions.g:6382:1: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalKExpressions.g:6382:2: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2
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
    // InternalKExpressions.g:6392:1: rule__RestrictedKeyStringValueAnnotation__Group__3 : rule__RestrictedKeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6396:1: ( rule__RestrictedKeyStringValueAnnotation__Group__3__Impl )
            // InternalKExpressions.g:6397:2: rule__RestrictedKeyStringValueAnnotation__Group__3__Impl
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
    // InternalKExpressions.g:6403:1: rule__RestrictedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6407:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalKExpressions.g:6408:1: ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalKExpressions.g:6408:1: ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* )
            // InternalKExpressions.g:6409:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // InternalKExpressions.g:6410:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==47) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalKExpressions.g:6410:2: rule__RestrictedKeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    rule__RestrictedKeyStringValueAnnotation__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalKExpressions.g:6428:1: rule__RestrictedKeyStringValueAnnotation__Group_3__0 : rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl rule__RestrictedKeyStringValueAnnotation__Group_3__1 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6432:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl rule__RestrictedKeyStringValueAnnotation__Group_3__1 )
            // InternalKExpressions.g:6433:2: rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl rule__RestrictedKeyStringValueAnnotation__Group_3__1
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
    // InternalKExpressions.g:6440:1: rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6444:1: ( ( ',' ) )
            // InternalKExpressions.g:6445:1: ( ',' )
            {
            // InternalKExpressions.g:6445:1: ( ',' )
            // InternalKExpressions.g:6446:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            }
            match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:6459:1: rule__RestrictedKeyStringValueAnnotation__Group_3__1 : rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6463:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl )
            // InternalKExpressions.g:6464:2: rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl
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
    // InternalKExpressions.g:6470:1: rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6474:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalKExpressions.g:6475:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalKExpressions.g:6475:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalKExpressions.g:6476:1: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            }
            // InternalKExpressions.g:6477:1: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalKExpressions.g:6477:2: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1
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


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group__0"
    // InternalKExpressions.g:6491:1: rule__TypedKeyStringValueAnnotation__Group__0 : rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6495:1: ( rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 )
            // InternalKExpressions.g:6496:2: rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1
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
    // InternalKExpressions.g:6503:1: rule__TypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6507:1: ( ( '@' ) )
            // InternalKExpressions.g:6508:1: ( '@' )
            {
            // InternalKExpressions.g:6508:1: ( '@' )
            // InternalKExpressions.g:6509:1: '@'
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
    // InternalKExpressions.g:6522:1: rule__TypedKeyStringValueAnnotation__Group__1 : rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6526:1: ( rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 )
            // InternalKExpressions.g:6527:2: rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2
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
    // InternalKExpressions.g:6534:1: rule__TypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6538:1: ( ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKExpressions.g:6539:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:6539:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKExpressions.g:6540:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:6541:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKExpressions.g:6541:2: rule__TypedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKExpressions.g:6551:1: rule__TypedKeyStringValueAnnotation__Group__2 : rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6555:1: ( rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 )
            // InternalKExpressions.g:6556:2: rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3
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
    // InternalKExpressions.g:6563:1: rule__TypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6567:1: ( ( '[' ) )
            // InternalKExpressions.g:6568:1: ( '[' )
            {
            // InternalKExpressions.g:6568:1: ( '[' )
            // InternalKExpressions.g:6569:1: '['
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
    // InternalKExpressions.g:6582:1: rule__TypedKeyStringValueAnnotation__Group__3 : rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6586:1: ( rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 )
            // InternalKExpressions.g:6587:2: rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4
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
    // InternalKExpressions.g:6594:1: rule__TypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6598:1: ( ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalKExpressions.g:6599:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalKExpressions.g:6599:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalKExpressions.g:6600:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // InternalKExpressions.g:6601:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalKExpressions.g:6601:2: rule__TypedKeyStringValueAnnotation__TypeAssignment_3
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
    // InternalKExpressions.g:6611:1: rule__TypedKeyStringValueAnnotation__Group__4 : rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6615:1: ( rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 )
            // InternalKExpressions.g:6616:2: rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5
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
    // InternalKExpressions.g:6623:1: rule__TypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6627:1: ( ( ']' ) )
            // InternalKExpressions.g:6628:1: ( ']' )
            {
            // InternalKExpressions.g:6628:1: ( ']' )
            // InternalKExpressions.g:6629:1: ']'
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
    // InternalKExpressions.g:6642:1: rule__TypedKeyStringValueAnnotation__Group__5 : rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6646:1: ( rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 )
            // InternalKExpressions.g:6647:2: rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6
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
    // InternalKExpressions.g:6654:1: rule__TypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6658:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalKExpressions.g:6659:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalKExpressions.g:6659:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalKExpressions.g:6660:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            }
            // InternalKExpressions.g:6661:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalKExpressions.g:6661:2: rule__TypedKeyStringValueAnnotation__ValuesAssignment_5
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
    // InternalKExpressions.g:6671:1: rule__TypedKeyStringValueAnnotation__Group__6 : rule__TypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6675:1: ( rule__TypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalKExpressions.g:6676:2: rule__TypedKeyStringValueAnnotation__Group__6__Impl
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
    // InternalKExpressions.g:6682:1: rule__TypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6686:1: ( ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalKExpressions.g:6687:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalKExpressions.g:6687:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalKExpressions.g:6688:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // InternalKExpressions.g:6689:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==47) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalKExpressions.g:6689:2: rule__TypedKeyStringValueAnnotation__Group_6__0
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
    // InternalKExpressions.g:6713:1: rule__TypedKeyStringValueAnnotation__Group_6__0 : rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6717:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 )
            // InternalKExpressions.g:6718:2: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1
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
    // InternalKExpressions.g:6725:1: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6729:1: ( ( ',' ) )
            // InternalKExpressions.g:6730:1: ( ',' )
            {
            // InternalKExpressions.g:6730:1: ( ',' )
            // InternalKExpressions.g:6731:1: ','
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
    // InternalKExpressions.g:6744:1: rule__TypedKeyStringValueAnnotation__Group_6__1 : rule__TypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6748:1: ( rule__TypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalKExpressions.g:6749:2: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl
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
    // InternalKExpressions.g:6755:1: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6759:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalKExpressions.g:6760:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalKExpressions.g:6760:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalKExpressions.g:6761:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            }
            // InternalKExpressions.g:6762:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalKExpressions.g:6762:2: rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1
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
    // InternalKExpressions.g:6776:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__0 : rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6780:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__1 )
            // InternalKExpressions.g:6781:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__1
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
    // InternalKExpressions.g:6788:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6792:1: ( ( '@' ) )
            // InternalKExpressions.g:6793:1: ( '@' )
            {
            // InternalKExpressions.g:6793:1: ( '@' )
            // InternalKExpressions.g:6794:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:6807:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__1 : rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6811:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__2 )
            // InternalKExpressions.g:6812:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__2
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
    // InternalKExpressions.g:6819:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6823:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKExpressions.g:6824:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:6824:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKExpressions.g:6825:1: ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:6826:1: ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKExpressions.g:6826:2: rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKExpressions.g:6836:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__2 : rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6840:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__3 )
            // InternalKExpressions.g:6841:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__3
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
    // InternalKExpressions.g:6848:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6852:1: ( ( '[' ) )
            // InternalKExpressions.g:6853:1: ( '[' )
            {
            // InternalKExpressions.g:6853:1: ( '[' )
            // InternalKExpressions.g:6854:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,57,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:6867:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__3 : rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6871:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__4 )
            // InternalKExpressions.g:6872:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__4
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
    // InternalKExpressions.g:6879:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6883:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalKExpressions.g:6884:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalKExpressions.g:6884:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalKExpressions.g:6885:1: ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // InternalKExpressions.g:6886:1: ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalKExpressions.g:6886:2: rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3
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
    // InternalKExpressions.g:6896:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__4 : rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6900:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__5 )
            // InternalKExpressions.g:6901:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__5
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
    // InternalKExpressions.g:6908:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6912:1: ( ( ']' ) )
            // InternalKExpressions.g:6913:1: ( ']' )
            {
            // InternalKExpressions.g:6913:1: ( ']' )
            // InternalKExpressions.g:6914:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:6927:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__5 : rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6931:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__6 )
            // InternalKExpressions.g:6932:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__6
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
    // InternalKExpressions.g:6939:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6943:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalKExpressions.g:6944:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalKExpressions.g:6944:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalKExpressions.g:6945:1: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            }
            // InternalKExpressions.g:6946:1: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalKExpressions.g:6946:2: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5
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
    // InternalKExpressions.g:6956:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__6 : rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6960:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalKExpressions.g:6961:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl
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
    // InternalKExpressions.g:6967:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:6971:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalKExpressions.g:6972:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalKExpressions.g:6972:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalKExpressions.g:6973:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // InternalKExpressions.g:6974:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==47) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalKExpressions.g:6974:2: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalKExpressions.g:6998:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 : rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7002:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1 )
            // InternalKExpressions.g:7003:2: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1
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
    // InternalKExpressions.g:7010:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7014:1: ( ( ',' ) )
            // InternalKExpressions.g:7015:1: ( ',' )
            {
            // InternalKExpressions.g:7015:1: ( ',' )
            // InternalKExpressions.g:7016:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            }
            match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKExpressions.g:7029:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1 : rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7033:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalKExpressions.g:7034:2: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl
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
    // InternalKExpressions.g:7040:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7044:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalKExpressions.g:7045:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalKExpressions.g:7045:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalKExpressions.g:7046:1: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            }
            // InternalKExpressions.g:7047:1: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalKExpressions.g:7047:2: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1
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
    // InternalKExpressions.g:7061:1: rule__QuotedKeyStringValueAnnotation__Group__0 : rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7065:1: ( rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1 )
            // InternalKExpressions.g:7066:2: rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1
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
    // InternalKExpressions.g:7073:1: rule__QuotedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7077:1: ( ( '@' ) )
            // InternalKExpressions.g:7078:1: ( '@' )
            {
            // InternalKExpressions.g:7078:1: ( '@' )
            // InternalKExpressions.g:7079:1: '@'
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
    // InternalKExpressions.g:7092:1: rule__QuotedKeyStringValueAnnotation__Group__1 : rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7096:1: ( rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2 )
            // InternalKExpressions.g:7097:2: rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2
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
    // InternalKExpressions.g:7104:1: rule__QuotedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7108:1: ( ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKExpressions.g:7109:1: ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:7109:1: ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKExpressions.g:7110:1: ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:7111:1: ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKExpressions.g:7111:2: rule__QuotedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKExpressions.g:7121:1: rule__QuotedKeyStringValueAnnotation__Group__2 : rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7125:1: ( rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3 )
            // InternalKExpressions.g:7126:2: rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3
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
    // InternalKExpressions.g:7133:1: rule__QuotedKeyStringValueAnnotation__Group__2__Impl : ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7137:1: ( ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalKExpressions.g:7138:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalKExpressions.g:7138:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalKExpressions.g:7139:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            }
            // InternalKExpressions.g:7140:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalKExpressions.g:7140:2: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2
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
    // InternalKExpressions.g:7150:1: rule__QuotedKeyStringValueAnnotation__Group__3 : rule__QuotedKeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7154:1: ( rule__QuotedKeyStringValueAnnotation__Group__3__Impl )
            // InternalKExpressions.g:7155:2: rule__QuotedKeyStringValueAnnotation__Group__3__Impl
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
    // InternalKExpressions.g:7161:1: rule__QuotedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7165:1: ( ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalKExpressions.g:7166:1: ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalKExpressions.g:7166:1: ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* )
            // InternalKExpressions.g:7167:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // InternalKExpressions.g:7168:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==47) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalKExpressions.g:7168:2: rule__QuotedKeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    rule__QuotedKeyStringValueAnnotation__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalKExpressions.g:7186:1: rule__QuotedKeyStringValueAnnotation__Group_3__0 : rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7190:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1 )
            // InternalKExpressions.g:7191:2: rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1
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
    // InternalKExpressions.g:7198:1: rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7202:1: ( ( ',' ) )
            // InternalKExpressions.g:7203:1: ( ',' )
            {
            // InternalKExpressions.g:7203:1: ( ',' )
            // InternalKExpressions.g:7204:1: ','
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
    // InternalKExpressions.g:7217:1: rule__QuotedKeyStringValueAnnotation__Group_3__1 : rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7221:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl )
            // InternalKExpressions.g:7222:2: rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl
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
    // InternalKExpressions.g:7228:1: rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7232:1: ( ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalKExpressions.g:7233:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalKExpressions.g:7233:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalKExpressions.g:7234:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            }
            // InternalKExpressions.g:7235:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalKExpressions.g:7235:2: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1
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
    // InternalKExpressions.g:7249:1: rule__QuotedTypedKeyStringValueAnnotation__Group__0 : rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7253:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1 )
            // InternalKExpressions.g:7254:2: rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1
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
    // InternalKExpressions.g:7261:1: rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7265:1: ( ( '@' ) )
            // InternalKExpressions.g:7266:1: ( '@' )
            {
            // InternalKExpressions.g:7266:1: ( '@' )
            // InternalKExpressions.g:7267:1: '@'
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
    // InternalKExpressions.g:7280:1: rule__QuotedTypedKeyStringValueAnnotation__Group__1 : rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7284:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2 )
            // InternalKExpressions.g:7285:2: rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2
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
    // InternalKExpressions.g:7292:1: rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7296:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKExpressions.g:7297:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKExpressions.g:7297:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKExpressions.g:7298:1: ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKExpressions.g:7299:1: ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKExpressions.g:7299:2: rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKExpressions.g:7309:1: rule__QuotedTypedKeyStringValueAnnotation__Group__2 : rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7313:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3 )
            // InternalKExpressions.g:7314:2: rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3
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
    // InternalKExpressions.g:7321:1: rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7325:1: ( ( '[' ) )
            // InternalKExpressions.g:7326:1: ( '[' )
            {
            // InternalKExpressions.g:7326:1: ( '[' )
            // InternalKExpressions.g:7327:1: '['
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
    // InternalKExpressions.g:7340:1: rule__QuotedTypedKeyStringValueAnnotation__Group__3 : rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7344:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4 )
            // InternalKExpressions.g:7345:2: rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4
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
    // InternalKExpressions.g:7352:1: rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7356:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalKExpressions.g:7357:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalKExpressions.g:7357:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalKExpressions.g:7358:1: ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // InternalKExpressions.g:7359:1: ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalKExpressions.g:7359:2: rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3
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
    // InternalKExpressions.g:7369:1: rule__QuotedTypedKeyStringValueAnnotation__Group__4 : rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7373:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5 )
            // InternalKExpressions.g:7374:2: rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5
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
    // InternalKExpressions.g:7381:1: rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7385:1: ( ( ']' ) )
            // InternalKExpressions.g:7386:1: ( ']' )
            {
            // InternalKExpressions.g:7386:1: ( ']' )
            // InternalKExpressions.g:7387:1: ']'
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
    // InternalKExpressions.g:7400:1: rule__QuotedTypedKeyStringValueAnnotation__Group__5 : rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7404:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6 )
            // InternalKExpressions.g:7405:2: rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6
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
    // InternalKExpressions.g:7412:1: rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7416:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalKExpressions.g:7417:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalKExpressions.g:7417:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalKExpressions.g:7418:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            }
            // InternalKExpressions.g:7419:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalKExpressions.g:7419:2: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5
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
    // InternalKExpressions.g:7429:1: rule__QuotedTypedKeyStringValueAnnotation__Group__6 : rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7433:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalKExpressions.g:7434:2: rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl
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
    // InternalKExpressions.g:7440:1: rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7444:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalKExpressions.g:7445:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalKExpressions.g:7445:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalKExpressions.g:7446:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // InternalKExpressions.g:7447:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==47) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalKExpressions.g:7447:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    rule__QuotedTypedKeyStringValueAnnotation__Group_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalKExpressions.g:7471:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 : rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7475:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 )
            // InternalKExpressions.g:7476:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1
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
    // InternalKExpressions.g:7483:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7487:1: ( ( ',' ) )
            // InternalKExpressions.g:7488:1: ( ',' )
            {
            // InternalKExpressions.g:7488:1: ( ',' )
            // InternalKExpressions.g:7489:1: ','
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
    // InternalKExpressions.g:7502:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 : rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7506:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalKExpressions.g:7507:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl
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
    // InternalKExpressions.g:7513:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7517:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalKExpressions.g:7518:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalKExpressions.g:7518:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalKExpressions.g:7519:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            }
            // InternalKExpressions.g:7520:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalKExpressions.g:7520:2: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1
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
    // InternalKExpressions.g:7534:1: rule__ExtendedID__Group__0 : rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 ;
    public final void rule__ExtendedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7538:1: ( rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 )
            // InternalKExpressions.g:7539:2: rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1
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
    // InternalKExpressions.g:7546:1: rule__ExtendedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7550:1: ( ( RULE_ID ) )
            // InternalKExpressions.g:7551:1: ( RULE_ID )
            {
            // InternalKExpressions.g:7551:1: ( RULE_ID )
            // InternalKExpressions.g:7552:1: RULE_ID
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
    // InternalKExpressions.g:7563:1: rule__ExtendedID__Group__1 : rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2 ;
    public final void rule__ExtendedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7567:1: ( rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2 )
            // InternalKExpressions.g:7568:2: rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2
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
    // InternalKExpressions.g:7575:1: rule__ExtendedID__Group__1__Impl : ( ( rule__ExtendedID__Group_1__0 )* ) ;
    public final void rule__ExtendedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7579:1: ( ( ( rule__ExtendedID__Group_1__0 )* ) )
            // InternalKExpressions.g:7580:1: ( ( rule__ExtendedID__Group_1__0 )* )
            {
            // InternalKExpressions.g:7580:1: ( ( rule__ExtendedID__Group_1__0 )* )
            // InternalKExpressions.g:7581:1: ( rule__ExtendedID__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup_1()); 
            }
            // InternalKExpressions.g:7582:1: ( rule__ExtendedID__Group_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==59) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalKExpressions.g:7582:2: rule__ExtendedID__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_46);
            	    rule__ExtendedID__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalKExpressions.g:7592:1: rule__ExtendedID__Group__2 : rule__ExtendedID__Group__2__Impl ;
    public final void rule__ExtendedID__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7596:1: ( rule__ExtendedID__Group__2__Impl )
            // InternalKExpressions.g:7597:2: rule__ExtendedID__Group__2__Impl
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
    // InternalKExpressions.g:7603:1: rule__ExtendedID__Group__2__Impl : ( ( rule__ExtendedID__Group_2__0 )? ) ;
    public final void rule__ExtendedID__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7607:1: ( ( ( rule__ExtendedID__Group_2__0 )? ) )
            // InternalKExpressions.g:7608:1: ( ( rule__ExtendedID__Group_2__0 )? )
            {
            // InternalKExpressions.g:7608:1: ( ( rule__ExtendedID__Group_2__0 )? )
            // InternalKExpressions.g:7609:1: ( rule__ExtendedID__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup_2()); 
            }
            // InternalKExpressions.g:7610:1: ( rule__ExtendedID__Group_2__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==60) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalKExpressions.g:7610:2: rule__ExtendedID__Group_2__0
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
    // InternalKExpressions.g:7626:1: rule__ExtendedID__Group_1__0 : rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 ;
    public final void rule__ExtendedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7630:1: ( rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 )
            // InternalKExpressions.g:7631:2: rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1
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
    // InternalKExpressions.g:7638:1: rule__ExtendedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__ExtendedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7642:1: ( ( '.' ) )
            // InternalKExpressions.g:7643:1: ( '.' )
            {
            // InternalKExpressions.g:7643:1: ( '.' )
            // InternalKExpressions.g:7644:1: '.'
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
    // InternalKExpressions.g:7657:1: rule__ExtendedID__Group_1__1 : rule__ExtendedID__Group_1__1__Impl ;
    public final void rule__ExtendedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7661:1: ( rule__ExtendedID__Group_1__1__Impl )
            // InternalKExpressions.g:7662:2: rule__ExtendedID__Group_1__1__Impl
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
    // InternalKExpressions.g:7668:1: rule__ExtendedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7672:1: ( ( RULE_ID ) )
            // InternalKExpressions.g:7673:1: ( RULE_ID )
            {
            // InternalKExpressions.g:7673:1: ( RULE_ID )
            // InternalKExpressions.g:7674:1: RULE_ID
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
    // InternalKExpressions.g:7689:1: rule__ExtendedID__Group_2__0 : rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1 ;
    public final void rule__ExtendedID__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7693:1: ( rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1 )
            // InternalKExpressions.g:7694:2: rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1
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
    // InternalKExpressions.g:7701:1: rule__ExtendedID__Group_2__0__Impl : ( '#' ) ;
    public final void rule__ExtendedID__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7705:1: ( ( '#' ) )
            // InternalKExpressions.g:7706:1: ( '#' )
            {
            // InternalKExpressions.g:7706:1: ( '#' )
            // InternalKExpressions.g:7707:1: '#'
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
    // InternalKExpressions.g:7720:1: rule__ExtendedID__Group_2__1 : rule__ExtendedID__Group_2__1__Impl ;
    public final void rule__ExtendedID__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7724:1: ( rule__ExtendedID__Group_2__1__Impl )
            // InternalKExpressions.g:7725:2: rule__ExtendedID__Group_2__1__Impl
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
    // InternalKExpressions.g:7731:1: rule__ExtendedID__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__ExtendedID__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7735:1: ( ( RULE_INT ) )
            // InternalKExpressions.g:7736:1: ( RULE_INT )
            {
            // InternalKExpressions.g:7736:1: ( RULE_INT )
            // InternalKExpressions.g:7737:1: RULE_INT
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
    // InternalKExpressions.g:7754:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7758:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // InternalKExpressions.g:7759:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
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
    // InternalKExpressions.g:7766:1: rule__Integer__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7770:1: ( ( ( '-' )? ) )
            // InternalKExpressions.g:7771:1: ( ( '-' )? )
            {
            // InternalKExpressions.g:7771:1: ( ( '-' )? )
            // InternalKExpressions.g:7772:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalKExpressions.g:7773:1: ( '-' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==21) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalKExpressions.g:7774:2: '-'
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
    // InternalKExpressions.g:7785:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7789:1: ( rule__Integer__Group__1__Impl )
            // InternalKExpressions.g:7790:2: rule__Integer__Group__1__Impl
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
    // InternalKExpressions.g:7796:1: rule__Integer__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7800:1: ( ( RULE_INT ) )
            // InternalKExpressions.g:7801:1: ( RULE_INT )
            {
            // InternalKExpressions.g:7801:1: ( RULE_INT )
            // InternalKExpressions.g:7802:1: RULE_INT
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
    // InternalKExpressions.g:7817:1: rule__Floateger__Group__0 : rule__Floateger__Group__0__Impl rule__Floateger__Group__1 ;
    public final void rule__Floateger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7821:1: ( rule__Floateger__Group__0__Impl rule__Floateger__Group__1 )
            // InternalKExpressions.g:7822:2: rule__Floateger__Group__0__Impl rule__Floateger__Group__1
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
    // InternalKExpressions.g:7829:1: rule__Floateger__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Floateger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7833:1: ( ( ( '-' )? ) )
            // InternalKExpressions.g:7834:1: ( ( '-' )? )
            {
            // InternalKExpressions.g:7834:1: ( ( '-' )? )
            // InternalKExpressions.g:7835:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloategerAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalKExpressions.g:7836:1: ( '-' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==21) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalKExpressions.g:7837:2: '-'
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
    // InternalKExpressions.g:7848:1: rule__Floateger__Group__1 : rule__Floateger__Group__1__Impl ;
    public final void rule__Floateger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7852:1: ( rule__Floateger__Group__1__Impl )
            // InternalKExpressions.g:7853:2: rule__Floateger__Group__1__Impl
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
    // InternalKExpressions.g:7859:1: rule__Floateger__Group__1__Impl : ( RULE_FLOAT ) ;
    public final void rule__Floateger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7863:1: ( ( RULE_FLOAT ) )
            // InternalKExpressions.g:7864:1: ( RULE_FLOAT )
            {
            // InternalKExpressions.g:7864:1: ( RULE_FLOAT )
            // InternalKExpressions.g:7865:1: RULE_FLOAT
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
    // InternalKExpressions.g:7881:1: rule__OrExpression__OperatorAssignment_1_1 : ( ruleOrOperator ) ;
    public final void rule__OrExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7885:1: ( ( ruleOrOperator ) )
            // InternalKExpressions.g:7886:1: ( ruleOrOperator )
            {
            // InternalKExpressions.g:7886:1: ( ruleOrOperator )
            // InternalKExpressions.g:7887:1: ruleOrOperator
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
    // InternalKExpressions.g:7896:1: rule__OrExpression__SubExpressionsAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7900:1: ( ( ruleAndExpression ) )
            // InternalKExpressions.g:7901:1: ( ruleAndExpression )
            {
            // InternalKExpressions.g:7901:1: ( ruleAndExpression )
            // InternalKExpressions.g:7902:1: ruleAndExpression
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
    // InternalKExpressions.g:7911:1: rule__AndExpression__OperatorAssignment_1_1 : ( ruleAndOperator ) ;
    public final void rule__AndExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7915:1: ( ( ruleAndOperator ) )
            // InternalKExpressions.g:7916:1: ( ruleAndOperator )
            {
            // InternalKExpressions.g:7916:1: ( ruleAndOperator )
            // InternalKExpressions.g:7917:1: ruleAndOperator
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
    // InternalKExpressions.g:7926:1: rule__AndExpression__SubExpressionsAssignment_1_2 : ( ruleCompareOperation ) ;
    public final void rule__AndExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7930:1: ( ( ruleCompareOperation ) )
            // InternalKExpressions.g:7931:1: ( ruleCompareOperation )
            {
            // InternalKExpressions.g:7931:1: ( ruleCompareOperation )
            // InternalKExpressions.g:7932:1: ruleCompareOperation
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
    // InternalKExpressions.g:7941:1: rule__CompareOperation__OperatorAssignment_0_1_1 : ( ruleCompareOperator ) ;
    public final void rule__CompareOperation__OperatorAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7945:1: ( ( ruleCompareOperator ) )
            // InternalKExpressions.g:7946:1: ( ruleCompareOperator )
            {
            // InternalKExpressions.g:7946:1: ( ruleCompareOperator )
            // InternalKExpressions.g:7947:1: ruleCompareOperator
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
    // InternalKExpressions.g:7956:1: rule__CompareOperation__SubExpressionsAssignment_0_1_2 : ( ruleNotOrValuedExpression ) ;
    public final void rule__CompareOperation__SubExpressionsAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7960:1: ( ( ruleNotOrValuedExpression ) )
            // InternalKExpressions.g:7961:1: ( ruleNotOrValuedExpression )
            {
            // InternalKExpressions.g:7961:1: ( ruleNotOrValuedExpression )
            // InternalKExpressions.g:7962:1: ruleNotOrValuedExpression
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
    // InternalKExpressions.g:7971:1: rule__NotExpression__OperatorAssignment_0_1 : ( ruleNotOperator ) ;
    public final void rule__NotExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7975:1: ( ( ruleNotOperator ) )
            // InternalKExpressions.g:7976:1: ( ruleNotOperator )
            {
            // InternalKExpressions.g:7976:1: ( ruleNotOperator )
            // InternalKExpressions.g:7977:1: ruleNotOperator
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
    // InternalKExpressions.g:7986:1: rule__NotExpression__SubExpressionsAssignment_0_2 : ( ruleNotExpression ) ;
    public final void rule__NotExpression__SubExpressionsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:7990:1: ( ( ruleNotExpression ) )
            // InternalKExpressions.g:7991:1: ( ruleNotExpression )
            {
            // InternalKExpressions.g:7991:1: ( ruleNotExpression )
            // InternalKExpressions.g:7992:1: ruleNotExpression
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
    // InternalKExpressions.g:8001:1: rule__AddExpression__OperatorAssignment_1_1 : ( ruleAddOperator ) ;
    public final void rule__AddExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8005:1: ( ( ruleAddOperator ) )
            // InternalKExpressions.g:8006:1: ( ruleAddOperator )
            {
            // InternalKExpressions.g:8006:1: ( ruleAddOperator )
            // InternalKExpressions.g:8007:1: ruleAddOperator
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
    // InternalKExpressions.g:8016:1: rule__AddExpression__SubExpressionsAssignment_1_2 : ( ruleSubExpression ) ;
    public final void rule__AddExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8020:1: ( ( ruleSubExpression ) )
            // InternalKExpressions.g:8021:1: ( ruleSubExpression )
            {
            // InternalKExpressions.g:8021:1: ( ruleSubExpression )
            // InternalKExpressions.g:8022:1: ruleSubExpression
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
    // InternalKExpressions.g:8031:1: rule__SubExpression__OperatorAssignment_1_1 : ( ruleSubOperator ) ;
    public final void rule__SubExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8035:1: ( ( ruleSubOperator ) )
            // InternalKExpressions.g:8036:1: ( ruleSubOperator )
            {
            // InternalKExpressions.g:8036:1: ( ruleSubOperator )
            // InternalKExpressions.g:8037:1: ruleSubOperator
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
    // InternalKExpressions.g:8046:1: rule__SubExpression__SubExpressionsAssignment_1_2 : ( ruleMultExpression ) ;
    public final void rule__SubExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8050:1: ( ( ruleMultExpression ) )
            // InternalKExpressions.g:8051:1: ( ruleMultExpression )
            {
            // InternalKExpressions.g:8051:1: ( ruleMultExpression )
            // InternalKExpressions.g:8052:1: ruleMultExpression
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
    // InternalKExpressions.g:8061:1: rule__MultExpression__OperatorAssignment_1_1 : ( ruleMultOperator ) ;
    public final void rule__MultExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8065:1: ( ( ruleMultOperator ) )
            // InternalKExpressions.g:8066:1: ( ruleMultOperator )
            {
            // InternalKExpressions.g:8066:1: ( ruleMultOperator )
            // InternalKExpressions.g:8067:1: ruleMultOperator
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
    // InternalKExpressions.g:8076:1: rule__MultExpression__SubExpressionsAssignment_1_2 : ( ruleDivExpression ) ;
    public final void rule__MultExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8080:1: ( ( ruleDivExpression ) )
            // InternalKExpressions.g:8081:1: ( ruleDivExpression )
            {
            // InternalKExpressions.g:8081:1: ( ruleDivExpression )
            // InternalKExpressions.g:8082:1: ruleDivExpression
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
    // InternalKExpressions.g:8091:1: rule__DivExpression__OperatorAssignment_1_1 : ( ruleDivOperator ) ;
    public final void rule__DivExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8095:1: ( ( ruleDivOperator ) )
            // InternalKExpressions.g:8096:1: ( ruleDivOperator )
            {
            // InternalKExpressions.g:8096:1: ( ruleDivOperator )
            // InternalKExpressions.g:8097:1: ruleDivOperator
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
    // InternalKExpressions.g:8106:1: rule__DivExpression__SubExpressionsAssignment_1_2 : ( ruleModExpression ) ;
    public final void rule__DivExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8110:1: ( ( ruleModExpression ) )
            // InternalKExpressions.g:8111:1: ( ruleModExpression )
            {
            // InternalKExpressions.g:8111:1: ( ruleModExpression )
            // InternalKExpressions.g:8112:1: ruleModExpression
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
    // InternalKExpressions.g:8121:1: rule__ModExpression__OperatorAssignment_1_1 : ( ruleModOperator ) ;
    public final void rule__ModExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8125:1: ( ( ruleModOperator ) )
            // InternalKExpressions.g:8126:1: ( ruleModOperator )
            {
            // InternalKExpressions.g:8126:1: ( ruleModOperator )
            // InternalKExpressions.g:8127:1: ruleModOperator
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
    // InternalKExpressions.g:8136:1: rule__ModExpression__SubExpressionsAssignment_1_2 : ( ruleAtomicValuedExpression ) ;
    public final void rule__ModExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8140:1: ( ( ruleAtomicValuedExpression ) )
            // InternalKExpressions.g:8141:1: ( ruleAtomicValuedExpression )
            {
            // InternalKExpressions.g:8141:1: ( ruleAtomicValuedExpression )
            // InternalKExpressions.g:8142:1: ruleAtomicValuedExpression
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
    // InternalKExpressions.g:8151:1: rule__NegExpression__OperatorAssignment_0_1 : ( ruleSubOperator ) ;
    public final void rule__NegExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8155:1: ( ( ruleSubOperator ) )
            // InternalKExpressions.g:8156:1: ( ruleSubOperator )
            {
            // InternalKExpressions.g:8156:1: ( ruleSubOperator )
            // InternalKExpressions.g:8157:1: ruleSubOperator
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
    // InternalKExpressions.g:8166:1: rule__NegExpression__SubExpressionsAssignment_0_2 : ( ruleNegExpression ) ;
    public final void rule__NegExpression__SubExpressionsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8170:1: ( ( ruleNegExpression ) )
            // InternalKExpressions.g:8171:1: ( ruleNegExpression )
            {
            // InternalKExpressions.g:8171:1: ( ruleNegExpression )
            // InternalKExpressions.g:8172:1: ruleNegExpression
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
    // InternalKExpressions.g:8181:1: rule__ValuedObjectTestExpression__OperatorAssignment_0_1 : ( rulePreOperator ) ;
    public final void rule__ValuedObjectTestExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8185:1: ( ( rulePreOperator ) )
            // InternalKExpressions.g:8186:1: ( rulePreOperator )
            {
            // InternalKExpressions.g:8186:1: ( rulePreOperator )
            // InternalKExpressions.g:8187:1: rulePreOperator
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
    // InternalKExpressions.g:8196:1: rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 : ( ruleValuedObjectTestExpression ) ;
    public final void rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8200:1: ( ( ruleValuedObjectTestExpression ) )
            // InternalKExpressions.g:8201:1: ( ruleValuedObjectTestExpression )
            {
            // InternalKExpressions.g:8201:1: ( ruleValuedObjectTestExpression )
            // InternalKExpressions.g:8202:1: ruleValuedObjectTestExpression
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
    // InternalKExpressions.g:8211:1: rule__ValuedObjectTestExpression__OperatorAssignment_1_1 : ( ruleValueTestOperator ) ;
    public final void rule__ValuedObjectTestExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8215:1: ( ( ruleValueTestOperator ) )
            // InternalKExpressions.g:8216:1: ( ruleValueTestOperator )
            {
            // InternalKExpressions.g:8216:1: ( ruleValueTestOperator )
            // InternalKExpressions.g:8217:1: ruleValueTestOperator
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
    // InternalKExpressions.g:8226:1: rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 : ( ruleValuedObjectReference ) ;
    public final void rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8230:1: ( ( ruleValuedObjectReference ) )
            // InternalKExpressions.g:8231:1: ( ruleValuedObjectReference )
            {
            // InternalKExpressions.g:8231:1: ( ruleValuedObjectReference )
            // InternalKExpressions.g:8232:1: ruleValuedObjectReference
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
    // InternalKExpressions.g:8241:1: rule__ValuedObjectReference__ValuedObjectAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ValuedObjectReference__ValuedObjectAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8245:1: ( ( ( RULE_ID ) ) )
            // InternalKExpressions.g:8246:1: ( ( RULE_ID ) )
            {
            // InternalKExpressions.g:8246:1: ( ( RULE_ID ) )
            // InternalKExpressions.g:8247:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0()); 
            }
            // InternalKExpressions.g:8248:1: ( RULE_ID )
            // InternalKExpressions.g:8249:1: RULE_ID
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
    // InternalKExpressions.g:8260:1: rule__TextExpression__CodeAssignment_0 : ( RULE_HOSTCODE ) ;
    public final void rule__TextExpression__CodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8264:1: ( ( RULE_HOSTCODE ) )
            // InternalKExpressions.g:8265:1: ( RULE_HOSTCODE )
            {
            // InternalKExpressions.g:8265:1: ( RULE_HOSTCODE )
            // InternalKExpressions.g:8266:1: RULE_HOSTCODE
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
    // InternalKExpressions.g:8275:1: rule__TextExpression__TypeAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__TextExpression__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8279:1: ( ( RULE_ID ) )
            // InternalKExpressions.g:8280:1: ( RULE_ID )
            {
            // InternalKExpressions.g:8280:1: ( RULE_ID )
            // InternalKExpressions.g:8281:1: RULE_ID
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
    // InternalKExpressions.g:8290:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8294:1: ( ( RULE_INT ) )
            // InternalKExpressions.g:8295:1: ( RULE_INT )
            {
            // InternalKExpressions.g:8295:1: ( RULE_INT )
            // InternalKExpressions.g:8296:1: RULE_INT
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
    // InternalKExpressions.g:8305:1: rule__FloatValue__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8309:1: ( ( RULE_FLOAT ) )
            // InternalKExpressions.g:8310:1: ( RULE_FLOAT )
            {
            // InternalKExpressions.g:8310:1: ( RULE_FLOAT )
            // InternalKExpressions.g:8311:1: RULE_FLOAT
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
    // InternalKExpressions.g:8320:1: rule__BooleanValue__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8324:1: ( ( RULE_BOOLEAN ) )
            // InternalKExpressions.g:8325:1: ( RULE_BOOLEAN )
            {
            // InternalKExpressions.g:8325:1: ( RULE_BOOLEAN )
            // InternalKExpressions.g:8326:1: RULE_BOOLEAN
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
    // InternalKExpressions.g:8335:1: rule__ISignal__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ISignal__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8339:1: ( ( RULE_ID ) )
            // InternalKExpressions.g:8340:1: ( RULE_ID )
            {
            // InternalKExpressions.g:8340:1: ( RULE_ID )
            // InternalKExpressions.g:8341:1: RULE_ID
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
    // InternalKExpressions.g:8350:1: rule__ISignal__ChannelDescrAssignment_1 : ( ruleChannelDescription ) ;
    public final void rule__ISignal__ChannelDescrAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8354:1: ( ( ruleChannelDescription ) )
            // InternalKExpressions.g:8355:1: ( ruleChannelDescription )
            {
            // InternalKExpressions.g:8355:1: ( ruleChannelDescription )
            // InternalKExpressions.g:8356:1: ruleChannelDescription
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
    // InternalKExpressions.g:8365:1: rule__InterfaceSignalDecl__SignalsAssignment_0_2 : ( ruleISignal ) ;
    public final void rule__InterfaceSignalDecl__SignalsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8369:1: ( ( ruleISignal ) )
            // InternalKExpressions.g:8370:1: ( ruleISignal )
            {
            // InternalKExpressions.g:8370:1: ( ruleISignal )
            // InternalKExpressions.g:8371:1: ruleISignal
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
    // InternalKExpressions.g:8380:1: rule__InterfaceSignalDecl__SignalsAssignment_0_3_1 : ( ruleISignal ) ;
    public final void rule__InterfaceSignalDecl__SignalsAssignment_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8384:1: ( ( ruleISignal ) )
            // InternalKExpressions.g:8385:1: ( ruleISignal )
            {
            // InternalKExpressions.g:8385:1: ( ruleISignal )
            // InternalKExpressions.g:8386:1: ruleISignal
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
    // InternalKExpressions.g:8395:1: rule__InterfaceSignalDecl__SignalsAssignment_1_2 : ( ruleISignal ) ;
    public final void rule__InterfaceSignalDecl__SignalsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8399:1: ( ( ruleISignal ) )
            // InternalKExpressions.g:8400:1: ( ruleISignal )
            {
            // InternalKExpressions.g:8400:1: ( ruleISignal )
            // InternalKExpressions.g:8401:1: ruleISignal
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
    // InternalKExpressions.g:8410:1: rule__InterfaceSignalDecl__SignalsAssignment_1_3_1 : ( ruleISignal ) ;
    public final void rule__InterfaceSignalDecl__SignalsAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8414:1: ( ( ruleISignal ) )
            // InternalKExpressions.g:8415:1: ( ruleISignal )
            {
            // InternalKExpressions.g:8415:1: ( ruleISignal )
            // InternalKExpressions.g:8416:1: ruleISignal
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
    // InternalKExpressions.g:8425:1: rule__InterfaceSignalDecl__SignalsAssignment_2_2 : ( ruleISignal ) ;
    public final void rule__InterfaceSignalDecl__SignalsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8429:1: ( ( ruleISignal ) )
            // InternalKExpressions.g:8430:1: ( ruleISignal )
            {
            // InternalKExpressions.g:8430:1: ( ruleISignal )
            // InternalKExpressions.g:8431:1: ruleISignal
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
    // InternalKExpressions.g:8440:1: rule__InterfaceSignalDecl__SignalsAssignment_2_3_1 : ( ruleISignal ) ;
    public final void rule__InterfaceSignalDecl__SignalsAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8444:1: ( ( ruleISignal ) )
            // InternalKExpressions.g:8445:1: ( ruleISignal )
            {
            // InternalKExpressions.g:8445:1: ( ruleISignal )
            // InternalKExpressions.g:8446:1: ruleISignal
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
    // InternalKExpressions.g:8455:1: rule__InterfaceSignalDecl__SignalsAssignment_3_2 : ( ruleISignal ) ;
    public final void rule__InterfaceSignalDecl__SignalsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8459:1: ( ( ruleISignal ) )
            // InternalKExpressions.g:8460:1: ( ruleISignal )
            {
            // InternalKExpressions.g:8460:1: ( ruleISignal )
            // InternalKExpressions.g:8461:1: ruleISignal
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
    // InternalKExpressions.g:8470:1: rule__InterfaceSignalDecl__SignalsAssignment_3_3_1 : ( ruleISignal ) ;
    public final void rule__InterfaceSignalDecl__SignalsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8474:1: ( ( ruleISignal ) )
            // InternalKExpressions.g:8475:1: ( ruleISignal )
            {
            // InternalKExpressions.g:8475:1: ( ruleISignal )
            // InternalKExpressions.g:8476:1: ruleISignal
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
    // InternalKExpressions.g:8485:1: rule__ChannelDescription__TypeAssignment_0_1 : ( ruleTypeIdentifier ) ;
    public final void rule__ChannelDescription__TypeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8489:1: ( ( ruleTypeIdentifier ) )
            // InternalKExpressions.g:8490:1: ( ruleTypeIdentifier )
            {
            // InternalKExpressions.g:8490:1: ( ruleTypeIdentifier )
            // InternalKExpressions.g:8491:1: ruleTypeIdentifier
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
    // InternalKExpressions.g:8500:1: rule__ChannelDescription__TypeAssignment_1_1 : ( ruleTypeIdentifier ) ;
    public final void rule__ChannelDescription__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8504:1: ( ( ruleTypeIdentifier ) )
            // InternalKExpressions.g:8505:1: ( ruleTypeIdentifier )
            {
            // InternalKExpressions.g:8505:1: ( ruleTypeIdentifier )
            // InternalKExpressions.g:8506:1: ruleTypeIdentifier
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
    // InternalKExpressions.g:8515:1: rule__ChannelDescription__ExpressionAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__ChannelDescription__ExpressionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8519:1: ( ( ruleExpression ) )
            // InternalKExpressions.g:8520:1: ( ruleExpression )
            {
            // InternalKExpressions.g:8520:1: ( ruleExpression )
            // InternalKExpressions.g:8521:1: ruleExpression
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
    // InternalKExpressions.g:8530:1: rule__ChannelDescription__TypeAssignment_2_3 : ( ruleTypeIdentifier ) ;
    public final void rule__ChannelDescription__TypeAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8534:1: ( ( ruleTypeIdentifier ) )
            // InternalKExpressions.g:8535:1: ( ruleTypeIdentifier )
            {
            // InternalKExpressions.g:8535:1: ( ruleTypeIdentifier )
            // InternalKExpressions.g:8536:1: ruleTypeIdentifier
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
    // InternalKExpressions.g:8545:1: rule__InterfaceVariableDecl__VarDeclsAssignment_1 : ( ruleVariableDecl ) ;
    public final void rule__InterfaceVariableDecl__VarDeclsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8549:1: ( ( ruleVariableDecl ) )
            // InternalKExpressions.g:8550:1: ( ruleVariableDecl )
            {
            // InternalKExpressions.g:8550:1: ( ruleVariableDecl )
            // InternalKExpressions.g:8551:1: ruleVariableDecl
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
    // InternalKExpressions.g:8560:1: rule__InterfaceVariableDecl__VarDeclsAssignment_2_1 : ( ruleVariableDecl ) ;
    public final void rule__InterfaceVariableDecl__VarDeclsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8564:1: ( ( ruleVariableDecl ) )
            // InternalKExpressions.g:8565:1: ( ruleVariableDecl )
            {
            // InternalKExpressions.g:8565:1: ( ruleVariableDecl )
            // InternalKExpressions.g:8566:1: ruleVariableDecl
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
    // InternalKExpressions.g:8575:1: rule__VariableDecl__VariablesAssignment_0 : ( ruleIVariable ) ;
    public final void rule__VariableDecl__VariablesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8579:1: ( ( ruleIVariable ) )
            // InternalKExpressions.g:8580:1: ( ruleIVariable )
            {
            // InternalKExpressions.g:8580:1: ( ruleIVariable )
            // InternalKExpressions.g:8581:1: ruleIVariable
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
    // InternalKExpressions.g:8590:1: rule__VariableDecl__VariablesAssignment_1_1 : ( ruleIVariable ) ;
    public final void rule__VariableDecl__VariablesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8594:1: ( ( ruleIVariable ) )
            // InternalKExpressions.g:8595:1: ( ruleIVariable )
            {
            // InternalKExpressions.g:8595:1: ( ruleIVariable )
            // InternalKExpressions.g:8596:1: ruleIVariable
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
    // InternalKExpressions.g:8605:1: rule__VariableDecl__TypeAssignment_3 : ( ruleTypeIdentifier ) ;
    public final void rule__VariableDecl__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8609:1: ( ( ruleTypeIdentifier ) )
            // InternalKExpressions.g:8610:1: ( ruleTypeIdentifier )
            {
            // InternalKExpressions.g:8610:1: ( ruleTypeIdentifier )
            // InternalKExpressions.g:8611:1: ruleTypeIdentifier
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
    // InternalKExpressions.g:8620:1: rule__IVariable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__IVariable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8624:1: ( ( RULE_ID ) )
            // InternalKExpressions.g:8625:1: ( RULE_ID )
            {
            // InternalKExpressions.g:8625:1: ( RULE_ID )
            // InternalKExpressions.g:8626:1: RULE_ID
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
    // InternalKExpressions.g:8635:1: rule__IVariable__ExpressionAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__IVariable__ExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8639:1: ( ( ruleExpression ) )
            // InternalKExpressions.g:8640:1: ( ruleExpression )
            {
            // InternalKExpressions.g:8640:1: ( ruleExpression )
            // InternalKExpressions.g:8641:1: ruleExpression
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
    // InternalKExpressions.g:8650:1: rule__TypeIdentifier__TypeAssignment_0 : ( ruleValueType ) ;
    public final void rule__TypeIdentifier__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8654:1: ( ( ruleValueType ) )
            // InternalKExpressions.g:8655:1: ( ruleValueType )
            {
            // InternalKExpressions.g:8655:1: ( ruleValueType )
            // InternalKExpressions.g:8656:1: ruleValueType
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
    // InternalKExpressions.g:8665:1: rule__TypeIdentifier__TypeIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__TypeIdentifier__TypeIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8669:1: ( ( RULE_ID ) )
            // InternalKExpressions.g:8670:1: ( RULE_ID )
            {
            // InternalKExpressions.g:8670:1: ( RULE_ID )
            // InternalKExpressions.g:8671:1: RULE_ID
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
    // InternalKExpressions.g:8680:1: rule__TypeIdentifier__TypeAssignment_2_1_0 : ( ruleValueType ) ;
    public final void rule__TypeIdentifier__TypeAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8684:1: ( ( ruleValueType ) )
            // InternalKExpressions.g:8685:1: ( ruleValueType )
            {
            // InternalKExpressions.g:8685:1: ( ruleValueType )
            // InternalKExpressions.g:8686:1: ruleValueType
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
    // InternalKExpressions.g:8695:1: rule__TypeIdentifier__TypeIDAssignment_2_1_1 : ( RULE_ID ) ;
    public final void rule__TypeIdentifier__TypeIDAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8699:1: ( ( RULE_ID ) )
            // InternalKExpressions.g:8700:1: ( RULE_ID )
            {
            // InternalKExpressions.g:8700:1: ( RULE_ID )
            // InternalKExpressions.g:8701:1: RULE_ID
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
    // InternalKExpressions.g:8710:1: rule__TypeIdentifier__OperatorAssignment_2_3 : ( ruleCombineOperator ) ;
    public final void rule__TypeIdentifier__OperatorAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8714:1: ( ( ruleCombineOperator ) )
            // InternalKExpressions.g:8715:1: ( ruleCombineOperator )
            {
            // InternalKExpressions.g:8715:1: ( ruleCombineOperator )
            // InternalKExpressions.g:8716:1: ruleCombineOperator
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
    // InternalKExpressions.g:8725:1: rule__CommentAnnotation__ValuesAssignment : ( RULE_COMMENT_ANNOTATION ) ;
    public final void rule__CommentAnnotation__ValuesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8729:1: ( ( RULE_COMMENT_ANNOTATION ) )
            // InternalKExpressions.g:8730:1: ( RULE_COMMENT_ANNOTATION )
            {
            // InternalKExpressions.g:8730:1: ( RULE_COMMENT_ANNOTATION )
            // InternalKExpressions.g:8731:1: RULE_COMMENT_ANNOTATION
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
    // InternalKExpressions.g:8740:1: rule__TagAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TagAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8744:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:8745:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:8745:1: ( ruleExtendedID )
            // InternalKExpressions.g:8746:1: ruleExtendedID
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
    // InternalKExpressions.g:8755:1: rule__KeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8759:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:8760:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:8760:1: ( ruleExtendedID )
            // InternalKExpressions.g:8761:1: ruleExtendedID
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
    // InternalKExpressions.g:8770:1: rule__KeyStringValueAnnotation__ValuesAssignment_2 : ( ruleEStringAllTypes ) ;
    public final void rule__KeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8774:1: ( ( ruleEStringAllTypes ) )
            // InternalKExpressions.g:8775:1: ( ruleEStringAllTypes )
            {
            // InternalKExpressions.g:8775:1: ( ruleEStringAllTypes )
            // InternalKExpressions.g:8776:1: ruleEStringAllTypes
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
    // InternalKExpressions.g:8785:1: rule__KeyStringValueAnnotation__ValuesAssignment_3_1 : ( ruleEStringAllTypes ) ;
    public final void rule__KeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8789:1: ( ( ruleEStringAllTypes ) )
            // InternalKExpressions.g:8790:1: ( ruleEStringAllTypes )
            {
            // InternalKExpressions.g:8790:1: ( ruleEStringAllTypes )
            // InternalKExpressions.g:8791:1: ruleEStringAllTypes
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
    // InternalKExpressions.g:8800:1: rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8804:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:8805:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:8805:1: ( ruleExtendedID )
            // InternalKExpressions.g:8806:1: ruleExtendedID
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
    // InternalKExpressions.g:8815:1: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8819:1: ( ( ruleEStringBoolean ) )
            // InternalKExpressions.g:8820:1: ( ruleEStringBoolean )
            {
            // InternalKExpressions.g:8820:1: ( ruleEStringBoolean )
            // InternalKExpressions.g:8821:1: ruleEStringBoolean
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
    // InternalKExpressions.g:8830:1: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8834:1: ( ( ruleEStringBoolean ) )
            // InternalKExpressions.g:8835:1: ( ruleEStringBoolean )
            {
            // InternalKExpressions.g:8835:1: ( ruleEStringBoolean )
            // InternalKExpressions.g:8836:1: ruleEStringBoolean
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


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__NameAssignment_1"
    // InternalKExpressions.g:8845:1: rule__TypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8849:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:8850:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:8850:1: ( ruleExtendedID )
            // InternalKExpressions.g:8851:1: ruleExtendedID
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
    // InternalKExpressions.g:8860:1: rule__TypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8864:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:8865:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:8865:1: ( ruleExtendedID )
            // InternalKExpressions.g:8866:1: ruleExtendedID
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
    // InternalKExpressions.g:8875:1: rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 : ( ruleEStringAllTypes ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8879:1: ( ( ruleEStringAllTypes ) )
            // InternalKExpressions.g:8880:1: ( ruleEStringAllTypes )
            {
            // InternalKExpressions.g:8880:1: ( ruleEStringAllTypes )
            // InternalKExpressions.g:8881:1: ruleEStringAllTypes
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
    // InternalKExpressions.g:8890:1: rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( ruleEStringAllTypes ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8894:1: ( ( ruleEStringAllTypes ) )
            // InternalKExpressions.g:8895:1: ( ruleEStringAllTypes )
            {
            // InternalKExpressions.g:8895:1: ( ruleEStringAllTypes )
            // InternalKExpressions.g:8896:1: ruleEStringAllTypes
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
    // InternalKExpressions.g:8905:1: rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8909:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:8910:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:8910:1: ( ruleExtendedID )
            // InternalKExpressions.g:8911:1: ruleExtendedID
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
    // InternalKExpressions.g:8920:1: rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8924:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:8925:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:8925:1: ( ruleExtendedID )
            // InternalKExpressions.g:8926:1: ruleExtendedID
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
    // InternalKExpressions.g:8935:1: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8939:1: ( ( ruleEStringBoolean ) )
            // InternalKExpressions.g:8940:1: ( ruleEStringBoolean )
            {
            // InternalKExpressions.g:8940:1: ( ruleEStringBoolean )
            // InternalKExpressions.g:8941:1: ruleEStringBoolean
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
    // InternalKExpressions.g:8950:1: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8954:1: ( ( ruleEStringBoolean ) )
            // InternalKExpressions.g:8955:1: ( ruleEStringBoolean )
            {
            // InternalKExpressions.g:8955:1: ( ruleEStringBoolean )
            // InternalKExpressions.g:8956:1: ruleEStringBoolean
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
    // InternalKExpressions.g:8965:1: rule__QuotedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__QuotedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8969:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:8970:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:8970:1: ( ruleExtendedID )
            // InternalKExpressions.g:8971:1: ruleExtendedID
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
    // InternalKExpressions.g:8980:1: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 : ( RULE_STRING ) ;
    public final void rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8984:1: ( ( RULE_STRING ) )
            // InternalKExpressions.g:8985:1: ( RULE_STRING )
            {
            // InternalKExpressions.g:8985:1: ( RULE_STRING )
            // InternalKExpressions.g:8986:1: RULE_STRING
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
    // InternalKExpressions.g:8995:1: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:8999:1: ( ( RULE_STRING ) )
            // InternalKExpressions.g:9000:1: ( RULE_STRING )
            {
            // InternalKExpressions.g:9000:1: ( RULE_STRING )
            // InternalKExpressions.g:9001:1: RULE_STRING
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
    // InternalKExpressions.g:9010:1: rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9014:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:9015:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:9015:1: ( ruleExtendedID )
            // InternalKExpressions.g:9016:1: ruleExtendedID
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
    // InternalKExpressions.g:9025:1: rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9029:1: ( ( ruleExtendedID ) )
            // InternalKExpressions.g:9030:1: ( ruleExtendedID )
            {
            // InternalKExpressions.g:9030:1: ( ruleExtendedID )
            // InternalKExpressions.g:9031:1: ruleExtendedID
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
    // InternalKExpressions.g:9040:1: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 : ( RULE_STRING ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9044:1: ( ( RULE_STRING ) )
            // InternalKExpressions.g:9045:1: ( RULE_STRING )
            {
            // InternalKExpressions.g:9045:1: ( RULE_STRING )
            // InternalKExpressions.g:9046:1: RULE_STRING
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
    // InternalKExpressions.g:9055:1: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKExpressions.g:9059:1: ( ( RULE_STRING ) )
            // InternalKExpressions.g:9060:1: ( RULE_STRING )
            {
            // InternalKExpressions.g:9060:1: ( RULE_STRING )
            // InternalKExpressions.g:9061:1: RULE_STRING
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
        // InternalKExpressions.g:1591:1: ( ( ( ruleBooleanExpression ) ) )
        // InternalKExpressions.g:1591:1: ( ( ruleBooleanExpression ) )
        {
        // InternalKExpressions.g:1591:1: ( ( ruleBooleanExpression ) )
        // InternalKExpressions.g:1592:1: ( ruleBooleanExpression )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall_0()); 
        }
        // InternalKExpressions.g:1593:1: ( ruleBooleanExpression )
        // InternalKExpressions.g:1593:3: ruleBooleanExpression
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
        // InternalKExpressions.g:1613:1: ( ( ( rule__CompareOperation__Group_0__0 ) ) )
        // InternalKExpressions.g:1613:1: ( ( rule__CompareOperation__Group_0__0 ) )
        {
        // InternalKExpressions.g:1613:1: ( ( rule__CompareOperation__Group_0__0 ) )
        // InternalKExpressions.g:1614:1: ( rule__CompareOperation__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCompareOperationAccess().getGroup_0()); 
        }
        // InternalKExpressions.g:1615:1: ( rule__CompareOperation__Group_0__0 )
        // InternalKExpressions.g:1615:2: rule__CompareOperation__Group_0__0
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
        // InternalKExpressions.g:1635:1: ( ( ( ruleValuedExpression ) ) )
        // InternalKExpressions.g:1635:1: ( ( ruleValuedExpression ) )
        {
        // InternalKExpressions.g:1635:1: ( ( ruleValuedExpression ) )
        // InternalKExpressions.g:1636:1: ( ruleValuedExpression )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
        }
        // InternalKExpressions.g:1637:1: ( ruleValuedExpression )
        // InternalKExpressions.g:1637:3: ruleValuedExpression
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
        // InternalKExpressions.g:1747:6: ( ( ( rule__AtomicValuedExpression__Group_2__0 ) ) )
        // InternalKExpressions.g:1747:6: ( ( rule__AtomicValuedExpression__Group_2__0 ) )
        {
        // InternalKExpressions.g:1747:6: ( ( rule__AtomicValuedExpression__Group_2__0 ) )
        // InternalKExpressions.g:1748:1: ( rule__AtomicValuedExpression__Group_2__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_2()); 
        }
        // InternalKExpressions.g:1749:1: ( rule__AtomicValuedExpression__Group_2__0 )
        // InternalKExpressions.g:1749:2: rule__AtomicValuedExpression__Group_2__0
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
            return "1586:1: rule__Expression__Alternatives : ( ( ( ruleBooleanExpression ) ) | ( ruleValuedExpression ) );";
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
            return "1608:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );";
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
            return "1630:1: rule__NotOrValuedExpression__Alternatives : ( ( ( ruleValuedExpression ) ) | ( ruleNotExpression ) );";
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
            return "1730:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ( rule__AtomicValuedExpression__Group_2__0 ) ) | ( ruleAtomicExpression ) );";
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
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00000000002001F0L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x1800000000000000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0800000000000002L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000200080L});
    }


}