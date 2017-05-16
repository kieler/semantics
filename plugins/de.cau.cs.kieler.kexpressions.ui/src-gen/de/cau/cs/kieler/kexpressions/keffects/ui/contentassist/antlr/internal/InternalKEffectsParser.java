package de.cau.cs.kieler.kexpressions.keffects.ui.contentassist.antlr.internal; 

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
import de.cau.cs.kieler.kexpressions.keffects.services.KEffectsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalKEffectsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_BOOLEAN", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_HOSTCODE", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'pre'", "'|'", "'&'", "'!'", "'+'", "'-'", "'*'", "'%'", "'/'", "'val'", "'||'", "'&&'", "'()'", "'='", "'+='", "'-='", "'*='", "'/='", "'++'", "'--'", "'=='", "'<'", "'<='", "'>'", "'>='", "'!='", "'('", "')'", "'['", "']'", "','", "'@'", "'.'", "'#'"
    };
    public static final int RULE_BOOLEAN=5;
    public static final int T__19=19;
    public static final int T__16=16;
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


        public InternalKEffectsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKEffectsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKEffectsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalKEffects.g"; }


     
     	private KEffectsGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(KEffectsGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleEffect"
    // InternalKEffects.g:61:1: entryRuleEffect : ruleEffect EOF ;
    public final void entryRuleEffect() throws RecognitionException {
        try {
            // InternalKEffects.g:62:1: ( ruleEffect EOF )
            // InternalKEffects.g:63:1: ruleEffect EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEffect();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEffectRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEffect"


    // $ANTLR start "ruleEffect"
    // InternalKEffects.g:70:1: ruleEffect : ( ( rule__Effect__Alternatives ) ) ;
    public final void ruleEffect() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:74:2: ( ( ( rule__Effect__Alternatives ) ) )
            // InternalKEffects.g:75:1: ( ( rule__Effect__Alternatives ) )
            {
            // InternalKEffects.g:75:1: ( ( rule__Effect__Alternatives ) )
            // InternalKEffects.g:76:1: ( rule__Effect__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEffectAccess().getAlternatives()); 
            }
            // InternalKEffects.g:77:1: ( rule__Effect__Alternatives )
            // InternalKEffects.g:77:2: rule__Effect__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Effect__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEffectAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEffect"


    // $ANTLR start "entryRuleEmission"
    // InternalKEffects.g:89:1: entryRuleEmission : ruleEmission EOF ;
    public final void entryRuleEmission() throws RecognitionException {
        try {
            // InternalKEffects.g:90:1: ( ruleEmission EOF )
            // InternalKEffects.g:91:1: ruleEmission EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmissionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEmission();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmissionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEmission"


    // $ANTLR start "ruleEmission"
    // InternalKEffects.g:98:1: ruleEmission : ( ( rule__Emission__Group__0 ) ) ;
    public final void ruleEmission() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:102:2: ( ( ( rule__Emission__Group__0 ) ) )
            // InternalKEffects.g:103:1: ( ( rule__Emission__Group__0 ) )
            {
            // InternalKEffects.g:103:1: ( ( rule__Emission__Group__0 ) )
            // InternalKEffects.g:104:1: ( rule__Emission__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getGroup()); 
            }
            // InternalKEffects.g:105:1: ( rule__Emission__Group__0 )
            // InternalKEffects.g:105:2: rule__Emission__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Emission__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEmission"


    // $ANTLR start "entryRuleAssignment"
    // InternalKEffects.g:117:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalKEffects.g:118:1: ( ruleAssignment EOF )
            // InternalKEffects.g:119:1: ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalKEffects.g:126:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:130:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalKEffects.g:131:1: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalKEffects.g:131:1: ( ( rule__Assignment__Group__0 ) )
            // InternalKEffects.g:132:1: ( rule__Assignment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup()); 
            }
            // InternalKEffects.g:133:1: ( rule__Assignment__Group__0 )
            // InternalKEffects.g:133:2: rule__Assignment__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRulePostfixEffect"
    // InternalKEffects.g:145:1: entryRulePostfixEffect : rulePostfixEffect EOF ;
    public final void entryRulePostfixEffect() throws RecognitionException {
        try {
            // InternalKEffects.g:146:1: ( rulePostfixEffect EOF )
            // InternalKEffects.g:147:1: rulePostfixEffect EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPostfixEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            rulePostfixEffect();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPostfixEffectRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePostfixEffect"


    // $ANTLR start "rulePostfixEffect"
    // InternalKEffects.g:154:1: rulePostfixEffect : ( ( rule__PostfixEffect__Group__0 ) ) ;
    public final void rulePostfixEffect() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:158:2: ( ( ( rule__PostfixEffect__Group__0 ) ) )
            // InternalKEffects.g:159:1: ( ( rule__PostfixEffect__Group__0 ) )
            {
            // InternalKEffects.g:159:1: ( ( rule__PostfixEffect__Group__0 ) )
            // InternalKEffects.g:160:1: ( rule__PostfixEffect__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPostfixEffectAccess().getGroup()); 
            }
            // InternalKEffects.g:161:1: ( rule__PostfixEffect__Group__0 )
            // InternalKEffects.g:161:2: rule__PostfixEffect__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PostfixEffect__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPostfixEffectAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePostfixEffect"


    // $ANTLR start "entryRuleHostcodeEffect"
    // InternalKEffects.g:173:1: entryRuleHostcodeEffect : ruleHostcodeEffect EOF ;
    public final void entryRuleHostcodeEffect() throws RecognitionException {
        try {
            // InternalKEffects.g:174:1: ( ruleHostcodeEffect EOF )
            // InternalKEffects.g:175:1: ruleHostcodeEffect EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHostcodeEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleHostcodeEffect();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHostcodeEffectRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHostcodeEffect"


    // $ANTLR start "ruleHostcodeEffect"
    // InternalKEffects.g:182:1: ruleHostcodeEffect : ( ( rule__HostcodeEffect__Group__0 ) ) ;
    public final void ruleHostcodeEffect() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:186:2: ( ( ( rule__HostcodeEffect__Group__0 ) ) )
            // InternalKEffects.g:187:1: ( ( rule__HostcodeEffect__Group__0 ) )
            {
            // InternalKEffects.g:187:1: ( ( rule__HostcodeEffect__Group__0 ) )
            // InternalKEffects.g:188:1: ( rule__HostcodeEffect__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHostcodeEffectAccess().getGroup()); 
            }
            // InternalKEffects.g:189:1: ( rule__HostcodeEffect__Group__0 )
            // InternalKEffects.g:189:2: rule__HostcodeEffect__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__HostcodeEffect__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHostcodeEffectAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHostcodeEffect"


    // $ANTLR start "entryRuleFunctionCallEffect"
    // InternalKEffects.g:201:1: entryRuleFunctionCallEffect : ruleFunctionCallEffect EOF ;
    public final void entryRuleFunctionCallEffect() throws RecognitionException {
        try {
            // InternalKEffects.g:202:1: ( ruleFunctionCallEffect EOF )
            // InternalKEffects.g:203:1: ruleFunctionCallEffect EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleFunctionCallEffect();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallEffectRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunctionCallEffect"


    // $ANTLR start "ruleFunctionCallEffect"
    // InternalKEffects.g:210:1: ruleFunctionCallEffect : ( ( rule__FunctionCallEffect__Group__0 ) ) ;
    public final void ruleFunctionCallEffect() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:214:2: ( ( ( rule__FunctionCallEffect__Group__0 ) ) )
            // InternalKEffects.g:215:1: ( ( rule__FunctionCallEffect__Group__0 ) )
            {
            // InternalKEffects.g:215:1: ( ( rule__FunctionCallEffect__Group__0 ) )
            // InternalKEffects.g:216:1: ( rule__FunctionCallEffect__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallEffectAccess().getGroup()); 
            }
            // InternalKEffects.g:217:1: ( rule__FunctionCallEffect__Group__0 )
            // InternalKEffects.g:217:2: rule__FunctionCallEffect__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCallEffect__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallEffectAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionCallEffect"


    // $ANTLR start "entryRuleExpression"
    // InternalKEffects.g:231:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalKEffects.g:232:1: ( ruleExpression EOF )
            // InternalKEffects.g:233:1: ruleExpression EOF
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
    // InternalKEffects.g:240:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:244:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalKEffects.g:245:1: ( ( rule__Expression__Alternatives ) )
            {
            // InternalKEffects.g:245:1: ( ( rule__Expression__Alternatives ) )
            // InternalKEffects.g:246:1: ( rule__Expression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives()); 
            }
            // InternalKEffects.g:247:1: ( rule__Expression__Alternatives )
            // InternalKEffects.g:247:2: rule__Expression__Alternatives
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
    // InternalKEffects.g:259:1: entryRuleBoolExpression : ruleBoolExpression EOF ;
    public final void entryRuleBoolExpression() throws RecognitionException {
        try {
            // InternalKEffects.g:260:1: ( ruleBoolExpression EOF )
            // InternalKEffects.g:261:1: ruleBoolExpression EOF
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
    // InternalKEffects.g:268:1: ruleBoolExpression : ( ruleLogicalOrExpression ) ;
    public final void ruleBoolExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:272:2: ( ( ruleLogicalOrExpression ) )
            // InternalKEffects.g:273:1: ( ruleLogicalOrExpression )
            {
            // InternalKEffects.g:273:1: ( ruleLogicalOrExpression )
            // InternalKEffects.g:274:1: ruleLogicalOrExpression
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
    // InternalKEffects.g:287:1: entryRuleLogicalOrExpression : ruleLogicalOrExpression EOF ;
    public final void entryRuleLogicalOrExpression() throws RecognitionException {
        try {
            // InternalKEffects.g:288:1: ( ruleLogicalOrExpression EOF )
            // InternalKEffects.g:289:1: ruleLogicalOrExpression EOF
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
    // InternalKEffects.g:296:1: ruleLogicalOrExpression : ( ( rule__LogicalOrExpression__Group__0 ) ) ;
    public final void ruleLogicalOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:300:2: ( ( ( rule__LogicalOrExpression__Group__0 ) ) )
            // InternalKEffects.g:301:1: ( ( rule__LogicalOrExpression__Group__0 ) )
            {
            // InternalKEffects.g:301:1: ( ( rule__LogicalOrExpression__Group__0 ) )
            // InternalKEffects.g:302:1: ( rule__LogicalOrExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExpressionAccess().getGroup()); 
            }
            // InternalKEffects.g:303:1: ( rule__LogicalOrExpression__Group__0 )
            // InternalKEffects.g:303:2: rule__LogicalOrExpression__Group__0
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
    // InternalKEffects.g:315:1: entryRuleLogicalAndExpression : ruleLogicalAndExpression EOF ;
    public final void entryRuleLogicalAndExpression() throws RecognitionException {
        try {
            // InternalKEffects.g:316:1: ( ruleLogicalAndExpression EOF )
            // InternalKEffects.g:317:1: ruleLogicalAndExpression EOF
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
    // InternalKEffects.g:324:1: ruleLogicalAndExpression : ( ( rule__LogicalAndExpression__Group__0 ) ) ;
    public final void ruleLogicalAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:328:2: ( ( ( rule__LogicalAndExpression__Group__0 ) ) )
            // InternalKEffects.g:329:1: ( ( rule__LogicalAndExpression__Group__0 ) )
            {
            // InternalKEffects.g:329:1: ( ( rule__LogicalAndExpression__Group__0 ) )
            // InternalKEffects.g:330:1: ( rule__LogicalAndExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExpressionAccess().getGroup()); 
            }
            // InternalKEffects.g:331:1: ( rule__LogicalAndExpression__Group__0 )
            // InternalKEffects.g:331:2: rule__LogicalAndExpression__Group__0
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
    // InternalKEffects.g:343:1: entryRuleBitwiseOrExpression : ruleBitwiseOrExpression EOF ;
    public final void entryRuleBitwiseOrExpression() throws RecognitionException {
        try {
            // InternalKEffects.g:344:1: ( ruleBitwiseOrExpression EOF )
            // InternalKEffects.g:345:1: ruleBitwiseOrExpression EOF
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
    // InternalKEffects.g:352:1: ruleBitwiseOrExpression : ( ( rule__BitwiseOrExpression__Group__0 ) ) ;
    public final void ruleBitwiseOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:356:2: ( ( ( rule__BitwiseOrExpression__Group__0 ) ) )
            // InternalKEffects.g:357:1: ( ( rule__BitwiseOrExpression__Group__0 ) )
            {
            // InternalKEffects.g:357:1: ( ( rule__BitwiseOrExpression__Group__0 ) )
            // InternalKEffects.g:358:1: ( rule__BitwiseOrExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrExpressionAccess().getGroup()); 
            }
            // InternalKEffects.g:359:1: ( rule__BitwiseOrExpression__Group__0 )
            // InternalKEffects.g:359:2: rule__BitwiseOrExpression__Group__0
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
    // InternalKEffects.g:371:1: entryRuleBitwiseAndExpression : ruleBitwiseAndExpression EOF ;
    public final void entryRuleBitwiseAndExpression() throws RecognitionException {
        try {
            // InternalKEffects.g:372:1: ( ruleBitwiseAndExpression EOF )
            // InternalKEffects.g:373:1: ruleBitwiseAndExpression EOF
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
    // InternalKEffects.g:380:1: ruleBitwiseAndExpression : ( ( rule__BitwiseAndExpression__Group__0 ) ) ;
    public final void ruleBitwiseAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:384:2: ( ( ( rule__BitwiseAndExpression__Group__0 ) ) )
            // InternalKEffects.g:385:1: ( ( rule__BitwiseAndExpression__Group__0 ) )
            {
            // InternalKEffects.g:385:1: ( ( rule__BitwiseAndExpression__Group__0 ) )
            // InternalKEffects.g:386:1: ( rule__BitwiseAndExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndExpressionAccess().getGroup()); 
            }
            // InternalKEffects.g:387:1: ( rule__BitwiseAndExpression__Group__0 )
            // InternalKEffects.g:387:2: rule__BitwiseAndExpression__Group__0
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
    // InternalKEffects.g:399:1: entryRuleCompareOperation : ruleCompareOperation EOF ;
    public final void entryRuleCompareOperation() throws RecognitionException {
        try {
            // InternalKEffects.g:400:1: ( ruleCompareOperation EOF )
            // InternalKEffects.g:401:1: ruleCompareOperation EOF
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
    // InternalKEffects.g:408:1: ruleCompareOperation : ( ( rule__CompareOperation__Group__0 ) ) ;
    public final void ruleCompareOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:412:2: ( ( ( rule__CompareOperation__Group__0 ) ) )
            // InternalKEffects.g:413:1: ( ( rule__CompareOperation__Group__0 ) )
            {
            // InternalKEffects.g:413:1: ( ( rule__CompareOperation__Group__0 ) )
            // InternalKEffects.g:414:1: ( rule__CompareOperation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGroup()); 
            }
            // InternalKEffects.g:415:1: ( rule__CompareOperation__Group__0 )
            // InternalKEffects.g:415:2: rule__CompareOperation__Group__0
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
    // InternalKEffects.g:427:1: entryRuleNotOrValuedExpression : ruleNotOrValuedExpression EOF ;
    public final void entryRuleNotOrValuedExpression() throws RecognitionException {
        try {
            // InternalKEffects.g:428:1: ( ruleNotOrValuedExpression EOF )
            // InternalKEffects.g:429:1: ruleNotOrValuedExpression EOF
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
    // InternalKEffects.g:436:1: ruleNotOrValuedExpression : ( ( rule__NotOrValuedExpression__Alternatives ) ) ;
    public final void ruleNotOrValuedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:440:2: ( ( ( rule__NotOrValuedExpression__Alternatives ) ) )
            // InternalKEffects.g:441:1: ( ( rule__NotOrValuedExpression__Alternatives ) )
            {
            // InternalKEffects.g:441:1: ( ( rule__NotOrValuedExpression__Alternatives ) )
            // InternalKEffects.g:442:1: ( rule__NotOrValuedExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotOrValuedExpressionAccess().getAlternatives()); 
            }
            // InternalKEffects.g:443:1: ( rule__NotOrValuedExpression__Alternatives )
            // InternalKEffects.g:443:2: rule__NotOrValuedExpression__Alternatives
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
    // InternalKEffects.g:455:1: entryRuleNotExpression : ruleNotExpression EOF ;
    public final void entryRuleNotExpression() throws RecognitionException {
        try {
            // InternalKEffects.g:456:1: ( ruleNotExpression EOF )
            // InternalKEffects.g:457:1: ruleNotExpression EOF
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
    // InternalKEffects.g:464:1: ruleNotExpression : ( ( rule__NotExpression__Alternatives ) ) ;
    public final void ruleNotExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:468:2: ( ( ( rule__NotExpression__Alternatives ) ) )
            // InternalKEffects.g:469:1: ( ( rule__NotExpression__Alternatives ) )
            {
            // InternalKEffects.g:469:1: ( ( rule__NotExpression__Alternatives ) )
            // InternalKEffects.g:470:1: ( rule__NotExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getAlternatives()); 
            }
            // InternalKEffects.g:471:1: ( rule__NotExpression__Alternatives )
            // InternalKEffects.g:471:2: rule__NotExpression__Alternatives
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
    // InternalKEffects.g:483:1: entryRuleValuedExpression : ruleValuedExpression EOF ;
    public final void entryRuleValuedExpression() throws RecognitionException {
        try {
            // InternalKEffects.g:484:1: ( ruleValuedExpression EOF )
            // InternalKEffects.g:485:1: ruleValuedExpression EOF
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
    // InternalKEffects.g:492:1: ruleValuedExpression : ( ruleAddExpression ) ;
    public final void ruleValuedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:496:2: ( ( ruleAddExpression ) )
            // InternalKEffects.g:497:1: ( ruleAddExpression )
            {
            // InternalKEffects.g:497:1: ( ruleAddExpression )
            // InternalKEffects.g:498:1: ruleAddExpression
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
    // InternalKEffects.g:511:1: entryRuleAddExpression : ruleAddExpression EOF ;
    public final void entryRuleAddExpression() throws RecognitionException {
        try {
            // InternalKEffects.g:512:1: ( ruleAddExpression EOF )
            // InternalKEffects.g:513:1: ruleAddExpression EOF
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
    // InternalKEffects.g:520:1: ruleAddExpression : ( ( rule__AddExpression__Group__0 ) ) ;
    public final void ruleAddExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:524:2: ( ( ( rule__AddExpression__Group__0 ) ) )
            // InternalKEffects.g:525:1: ( ( rule__AddExpression__Group__0 ) )
            {
            // InternalKEffects.g:525:1: ( ( rule__AddExpression__Group__0 ) )
            // InternalKEffects.g:526:1: ( rule__AddExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup()); 
            }
            // InternalKEffects.g:527:1: ( rule__AddExpression__Group__0 )
            // InternalKEffects.g:527:2: rule__AddExpression__Group__0
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
    // InternalKEffects.g:539:1: entryRuleSubExpression : ruleSubExpression EOF ;
    public final void entryRuleSubExpression() throws RecognitionException {
        try {
            // InternalKEffects.g:540:1: ( ruleSubExpression EOF )
            // InternalKEffects.g:541:1: ruleSubExpression EOF
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
    // InternalKEffects.g:548:1: ruleSubExpression : ( ( rule__SubExpression__Group__0 ) ) ;
    public final void ruleSubExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:552:2: ( ( ( rule__SubExpression__Group__0 ) ) )
            // InternalKEffects.g:553:1: ( ( rule__SubExpression__Group__0 ) )
            {
            // InternalKEffects.g:553:1: ( ( rule__SubExpression__Group__0 ) )
            // InternalKEffects.g:554:1: ( rule__SubExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup()); 
            }
            // InternalKEffects.g:555:1: ( rule__SubExpression__Group__0 )
            // InternalKEffects.g:555:2: rule__SubExpression__Group__0
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
    // InternalKEffects.g:567:1: entryRuleMultExpression : ruleMultExpression EOF ;
    public final void entryRuleMultExpression() throws RecognitionException {
        try {
            // InternalKEffects.g:568:1: ( ruleMultExpression EOF )
            // InternalKEffects.g:569:1: ruleMultExpression EOF
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
    // InternalKEffects.g:576:1: ruleMultExpression : ( ( rule__MultExpression__Group__0 ) ) ;
    public final void ruleMultExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:580:2: ( ( ( rule__MultExpression__Group__0 ) ) )
            // InternalKEffects.g:581:1: ( ( rule__MultExpression__Group__0 ) )
            {
            // InternalKEffects.g:581:1: ( ( rule__MultExpression__Group__0 ) )
            // InternalKEffects.g:582:1: ( rule__MultExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getGroup()); 
            }
            // InternalKEffects.g:583:1: ( rule__MultExpression__Group__0 )
            // InternalKEffects.g:583:2: rule__MultExpression__Group__0
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
    // InternalKEffects.g:595:1: entryRuleDivExpression : ruleDivExpression EOF ;
    public final void entryRuleDivExpression() throws RecognitionException {
        try {
            // InternalKEffects.g:596:1: ( ruleDivExpression EOF )
            // InternalKEffects.g:597:1: ruleDivExpression EOF
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
    // InternalKEffects.g:604:1: ruleDivExpression : ( ( rule__DivExpression__Group__0 ) ) ;
    public final void ruleDivExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:608:2: ( ( ( rule__DivExpression__Group__0 ) ) )
            // InternalKEffects.g:609:1: ( ( rule__DivExpression__Group__0 ) )
            {
            // InternalKEffects.g:609:1: ( ( rule__DivExpression__Group__0 ) )
            // InternalKEffects.g:610:1: ( rule__DivExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getGroup()); 
            }
            // InternalKEffects.g:611:1: ( rule__DivExpression__Group__0 )
            // InternalKEffects.g:611:2: rule__DivExpression__Group__0
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
    // InternalKEffects.g:623:1: entryRuleModExpression : ruleModExpression EOF ;
    public final void entryRuleModExpression() throws RecognitionException {
        try {
            // InternalKEffects.g:624:1: ( ruleModExpression EOF )
            // InternalKEffects.g:625:1: ruleModExpression EOF
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
    // InternalKEffects.g:632:1: ruleModExpression : ( ( rule__ModExpression__Group__0 ) ) ;
    public final void ruleModExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:636:2: ( ( ( rule__ModExpression__Group__0 ) ) )
            // InternalKEffects.g:637:1: ( ( rule__ModExpression__Group__0 ) )
            {
            // InternalKEffects.g:637:1: ( ( rule__ModExpression__Group__0 ) )
            // InternalKEffects.g:638:1: ( rule__ModExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getGroup()); 
            }
            // InternalKEffects.g:639:1: ( rule__ModExpression__Group__0 )
            // InternalKEffects.g:639:2: rule__ModExpression__Group__0
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
    // InternalKEffects.g:651:1: entryRuleNegExpression : ruleNegExpression EOF ;
    public final void entryRuleNegExpression() throws RecognitionException {
        try {
            // InternalKEffects.g:652:1: ( ruleNegExpression EOF )
            // InternalKEffects.g:653:1: ruleNegExpression EOF
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
    // InternalKEffects.g:660:1: ruleNegExpression : ( ( rule__NegExpression__Alternatives ) ) ;
    public final void ruleNegExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:664:2: ( ( ( rule__NegExpression__Alternatives ) ) )
            // InternalKEffects.g:665:1: ( ( rule__NegExpression__Alternatives ) )
            {
            // InternalKEffects.g:665:1: ( ( rule__NegExpression__Alternatives ) )
            // InternalKEffects.g:666:1: ( rule__NegExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getAlternatives()); 
            }
            // InternalKEffects.g:667:1: ( rule__NegExpression__Alternatives )
            // InternalKEffects.g:667:2: rule__NegExpression__Alternatives
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
    // InternalKEffects.g:679:1: entryRuleAtomicExpression : ruleAtomicExpression EOF ;
    public final void entryRuleAtomicExpression() throws RecognitionException {
        try {
            // InternalKEffects.g:680:1: ( ruleAtomicExpression EOF )
            // InternalKEffects.g:681:1: ruleAtomicExpression EOF
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
    // InternalKEffects.g:688:1: ruleAtomicExpression : ( ( rule__AtomicExpression__Alternatives ) ) ;
    public final void ruleAtomicExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:692:2: ( ( ( rule__AtomicExpression__Alternatives ) ) )
            // InternalKEffects.g:693:1: ( ( rule__AtomicExpression__Alternatives ) )
            {
            // InternalKEffects.g:693:1: ( ( rule__AtomicExpression__Alternatives ) )
            // InternalKEffects.g:694:1: ( rule__AtomicExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getAlternatives()); 
            }
            // InternalKEffects.g:695:1: ( rule__AtomicExpression__Alternatives )
            // InternalKEffects.g:695:2: rule__AtomicExpression__Alternatives
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
    // InternalKEffects.g:707:1: entryRuleAtomicValuedExpression : ruleAtomicValuedExpression EOF ;
    public final void entryRuleAtomicValuedExpression() throws RecognitionException {
        try {
            // InternalKEffects.g:708:1: ( ruleAtomicValuedExpression EOF )
            // InternalKEffects.g:709:1: ruleAtomicValuedExpression EOF
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
    // InternalKEffects.g:716:1: ruleAtomicValuedExpression : ( ( rule__AtomicValuedExpression__Alternatives ) ) ;
    public final void ruleAtomicValuedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:720:2: ( ( ( rule__AtomicValuedExpression__Alternatives ) ) )
            // InternalKEffects.g:721:1: ( ( rule__AtomicValuedExpression__Alternatives ) )
            {
            // InternalKEffects.g:721:1: ( ( rule__AtomicValuedExpression__Alternatives ) )
            // InternalKEffects.g:722:1: ( rule__AtomicValuedExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getAlternatives()); 
            }
            // InternalKEffects.g:723:1: ( rule__AtomicValuedExpression__Alternatives )
            // InternalKEffects.g:723:2: rule__AtomicValuedExpression__Alternatives
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
    // InternalKEffects.g:735:1: entryRuleValuedObjectTestExpression : ruleValuedObjectTestExpression EOF ;
    public final void entryRuleValuedObjectTestExpression() throws RecognitionException {
        try {
            // InternalKEffects.g:736:1: ( ruleValuedObjectTestExpression EOF )
            // InternalKEffects.g:737:1: ruleValuedObjectTestExpression EOF
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
    // InternalKEffects.g:744:1: ruleValuedObjectTestExpression : ( ( rule__ValuedObjectTestExpression__Alternatives ) ) ;
    public final void ruleValuedObjectTestExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:748:2: ( ( ( rule__ValuedObjectTestExpression__Alternatives ) ) )
            // InternalKEffects.g:749:1: ( ( rule__ValuedObjectTestExpression__Alternatives ) )
            {
            // InternalKEffects.g:749:1: ( ( rule__ValuedObjectTestExpression__Alternatives ) )
            // InternalKEffects.g:750:1: ( rule__ValuedObjectTestExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getAlternatives()); 
            }
            // InternalKEffects.g:751:1: ( rule__ValuedObjectTestExpression__Alternatives )
            // InternalKEffects.g:751:2: rule__ValuedObjectTestExpression__Alternatives
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
    // InternalKEffects.g:763:1: entryRuleValuedObjectReference : ruleValuedObjectReference EOF ;
    public final void entryRuleValuedObjectReference() throws RecognitionException {
        try {
            // InternalKEffects.g:764:1: ( ruleValuedObjectReference EOF )
            // InternalKEffects.g:765:1: ruleValuedObjectReference EOF
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
    // InternalKEffects.g:772:1: ruleValuedObjectReference : ( ( rule__ValuedObjectReference__Group__0 ) ) ;
    public final void ruleValuedObjectReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:776:2: ( ( ( rule__ValuedObjectReference__Group__0 ) ) )
            // InternalKEffects.g:777:1: ( ( rule__ValuedObjectReference__Group__0 ) )
            {
            // InternalKEffects.g:777:1: ( ( rule__ValuedObjectReference__Group__0 ) )
            // InternalKEffects.g:778:1: ( rule__ValuedObjectReference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getGroup()); 
            }
            // InternalKEffects.g:779:1: ( rule__ValuedObjectReference__Group__0 )
            // InternalKEffects.g:779:2: rule__ValuedObjectReference__Group__0
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
    // InternalKEffects.g:791:1: entryRuleFunctionCall : ruleFunctionCall EOF ;
    public final void entryRuleFunctionCall() throws RecognitionException {
        try {
            // InternalKEffects.g:792:1: ( ruleFunctionCall EOF )
            // InternalKEffects.g:793:1: ruleFunctionCall EOF
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
    // InternalKEffects.g:800:1: ruleFunctionCall : ( ( rule__FunctionCall__Group__0 ) ) ;
    public final void ruleFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:804:2: ( ( ( rule__FunctionCall__Group__0 ) ) )
            // InternalKEffects.g:805:1: ( ( rule__FunctionCall__Group__0 ) )
            {
            // InternalKEffects.g:805:1: ( ( rule__FunctionCall__Group__0 ) )
            // InternalKEffects.g:806:1: ( rule__FunctionCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGroup()); 
            }
            // InternalKEffects.g:807:1: ( rule__FunctionCall__Group__0 )
            // InternalKEffects.g:807:2: rule__FunctionCall__Group__0
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
    // InternalKEffects.g:819:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalKEffects.g:820:1: ( ruleParameter EOF )
            // InternalKEffects.g:821:1: ruleParameter EOF
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
    // InternalKEffects.g:828:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:832:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalKEffects.g:833:1: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalKEffects.g:833:1: ( ( rule__Parameter__Group__0 ) )
            // InternalKEffects.g:834:1: ( rule__Parameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getGroup()); 
            }
            // InternalKEffects.g:835:1: ( rule__Parameter__Group__0 )
            // InternalKEffects.g:835:2: rule__Parameter__Group__0
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
    // InternalKEffects.g:847:1: entryRuleTextExpression : ruleTextExpression EOF ;
    public final void entryRuleTextExpression() throws RecognitionException {
        try {
            // InternalKEffects.g:848:1: ( ruleTextExpression EOF )
            // InternalKEffects.g:849:1: ruleTextExpression EOF
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
    // InternalKEffects.g:856:1: ruleTextExpression : ( ( rule__TextExpression__TextAssignment ) ) ;
    public final void ruleTextExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:860:2: ( ( ( rule__TextExpression__TextAssignment ) ) )
            // InternalKEffects.g:861:1: ( ( rule__TextExpression__TextAssignment ) )
            {
            // InternalKEffects.g:861:1: ( ( rule__TextExpression__TextAssignment ) )
            // InternalKEffects.g:862:1: ( rule__TextExpression__TextAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getTextAssignment()); 
            }
            // InternalKEffects.g:863:1: ( rule__TextExpression__TextAssignment )
            // InternalKEffects.g:863:2: rule__TextExpression__TextAssignment
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
    // InternalKEffects.g:875:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // InternalKEffects.g:876:1: ( ruleIntValue EOF )
            // InternalKEffects.g:877:1: ruleIntValue EOF
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
    // InternalKEffects.g:884:1: ruleIntValue : ( ( rule__IntValue__ValueAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:888:2: ( ( ( rule__IntValue__ValueAssignment ) ) )
            // InternalKEffects.g:889:1: ( ( rule__IntValue__ValueAssignment ) )
            {
            // InternalKEffects.g:889:1: ( ( rule__IntValue__ValueAssignment ) )
            // InternalKEffects.g:890:1: ( rule__IntValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            }
            // InternalKEffects.g:891:1: ( rule__IntValue__ValueAssignment )
            // InternalKEffects.g:891:2: rule__IntValue__ValueAssignment
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
    // InternalKEffects.g:903:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // InternalKEffects.g:904:1: ( ruleFloatValue EOF )
            // InternalKEffects.g:905:1: ruleFloatValue EOF
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
    // InternalKEffects.g:912:1: ruleFloatValue : ( ( rule__FloatValue__ValueAssignment ) ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:916:2: ( ( ( rule__FloatValue__ValueAssignment ) ) )
            // InternalKEffects.g:917:1: ( ( rule__FloatValue__ValueAssignment ) )
            {
            // InternalKEffects.g:917:1: ( ( rule__FloatValue__ValueAssignment ) )
            // InternalKEffects.g:918:1: ( rule__FloatValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueAssignment()); 
            }
            // InternalKEffects.g:919:1: ( rule__FloatValue__ValueAssignment )
            // InternalKEffects.g:919:2: rule__FloatValue__ValueAssignment
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
    // InternalKEffects.g:931:1: entryRuleBoolValue : ruleBoolValue EOF ;
    public final void entryRuleBoolValue() throws RecognitionException {
        try {
            // InternalKEffects.g:932:1: ( ruleBoolValue EOF )
            // InternalKEffects.g:933:1: ruleBoolValue EOF
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
    // InternalKEffects.g:940:1: ruleBoolValue : ( ( rule__BoolValue__ValueAssignment ) ) ;
    public final void ruleBoolValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:944:2: ( ( ( rule__BoolValue__ValueAssignment ) ) )
            // InternalKEffects.g:945:1: ( ( rule__BoolValue__ValueAssignment ) )
            {
            // InternalKEffects.g:945:1: ( ( rule__BoolValue__ValueAssignment ) )
            // InternalKEffects.g:946:1: ( rule__BoolValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolValueAccess().getValueAssignment()); 
            }
            // InternalKEffects.g:947:1: ( rule__BoolValue__ValueAssignment )
            // InternalKEffects.g:947:2: rule__BoolValue__ValueAssignment
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
    // InternalKEffects.g:959:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalKEffects.g:960:1: ( ruleStringValue EOF )
            // InternalKEffects.g:961:1: ruleStringValue EOF
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
    // InternalKEffects.g:968:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:972:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // InternalKEffects.g:973:1: ( ( rule__StringValue__ValueAssignment ) )
            {
            // InternalKEffects.g:973:1: ( ( rule__StringValue__ValueAssignment ) )
            // InternalKEffects.g:974:1: ( rule__StringValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            }
            // InternalKEffects.g:975:1: ( rule__StringValue__ValueAssignment )
            // InternalKEffects.g:975:2: rule__StringValue__ValueAssignment
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


    // $ANTLR start "entryRuleAnnotation"
    // InternalKEffects.g:991:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // InternalKEffects.g:992:1: ( ruleAnnotation EOF )
            // InternalKEffects.g:993:1: ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // InternalKEffects.g:1000:1: ruleAnnotation : ( ( rule__Annotation__Alternatives ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1004:2: ( ( ( rule__Annotation__Alternatives ) ) )
            // InternalKEffects.g:1005:1: ( ( rule__Annotation__Alternatives ) )
            {
            // InternalKEffects.g:1005:1: ( ( rule__Annotation__Alternatives ) )
            // InternalKEffects.g:1006:1: ( rule__Annotation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getAlternatives()); 
            }
            // InternalKEffects.g:1007:1: ( rule__Annotation__Alternatives )
            // InternalKEffects.g:1007:2: rule__Annotation__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Annotation__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleRestrictedAnnotation"
    // InternalKEffects.g:1021:1: entryRuleRestrictedAnnotation : ruleRestrictedAnnotation EOF ;
    public final void entryRuleRestrictedAnnotation() throws RecognitionException {
        try {
            // InternalKEffects.g:1022:1: ( ruleRestrictedAnnotation EOF )
            // InternalKEffects.g:1023:1: ruleRestrictedAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleRestrictedAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRestrictedAnnotation"


    // $ANTLR start "ruleRestrictedAnnotation"
    // InternalKEffects.g:1030:1: ruleRestrictedAnnotation : ( ( rule__RestrictedAnnotation__Alternatives ) ) ;
    public final void ruleRestrictedAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1034:2: ( ( ( rule__RestrictedAnnotation__Alternatives ) ) )
            // InternalKEffects.g:1035:1: ( ( rule__RestrictedAnnotation__Alternatives ) )
            {
            // InternalKEffects.g:1035:1: ( ( rule__RestrictedAnnotation__Alternatives ) )
            // InternalKEffects.g:1036:1: ( rule__RestrictedAnnotation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedAnnotationAccess().getAlternatives()); 
            }
            // InternalKEffects.g:1037:1: ( rule__RestrictedAnnotation__Alternatives )
            // InternalKEffects.g:1037:2: rule__RestrictedAnnotation__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedAnnotation__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedAnnotationAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRestrictedAnnotation"


    // $ANTLR start "entryRuleCommentAnnotation"
    // InternalKEffects.g:1049:1: entryRuleCommentAnnotation : ruleCommentAnnotation EOF ;
    public final void entryRuleCommentAnnotation() throws RecognitionException {
        try {
            // InternalKEffects.g:1050:1: ( ruleCommentAnnotation EOF )
            // InternalKEffects.g:1051:1: ruleCommentAnnotation EOF
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
    // InternalKEffects.g:1058:1: ruleCommentAnnotation : ( ( rule__CommentAnnotation__ValuesAssignment ) ) ;
    public final void ruleCommentAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1062:2: ( ( ( rule__CommentAnnotation__ValuesAssignment ) ) )
            // InternalKEffects.g:1063:1: ( ( rule__CommentAnnotation__ValuesAssignment ) )
            {
            // InternalKEffects.g:1063:1: ( ( rule__CommentAnnotation__ValuesAssignment ) )
            // InternalKEffects.g:1064:1: ( rule__CommentAnnotation__ValuesAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationAccess().getValuesAssignment()); 
            }
            // InternalKEffects.g:1065:1: ( rule__CommentAnnotation__ValuesAssignment )
            // InternalKEffects.g:1065:2: rule__CommentAnnotation__ValuesAssignment
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
    // InternalKEffects.g:1077:1: entryRuleTagAnnotation : ruleTagAnnotation EOF ;
    public final void entryRuleTagAnnotation() throws RecognitionException {
        try {
            // InternalKEffects.g:1078:1: ( ruleTagAnnotation EOF )
            // InternalKEffects.g:1079:1: ruleTagAnnotation EOF
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
    // InternalKEffects.g:1086:1: ruleTagAnnotation : ( ( rule__TagAnnotation__Group__0 ) ) ;
    public final void ruleTagAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1090:2: ( ( ( rule__TagAnnotation__Group__0 ) ) )
            // InternalKEffects.g:1091:1: ( ( rule__TagAnnotation__Group__0 ) )
            {
            // InternalKEffects.g:1091:1: ( ( rule__TagAnnotation__Group__0 ) )
            // InternalKEffects.g:1092:1: ( rule__TagAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getGroup()); 
            }
            // InternalKEffects.g:1093:1: ( rule__TagAnnotation__Group__0 )
            // InternalKEffects.g:1093:2: rule__TagAnnotation__Group__0
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
    // InternalKEffects.g:1105:1: entryRuleKeyStringValueAnnotation : ruleKeyStringValueAnnotation EOF ;
    public final void entryRuleKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKEffects.g:1106:1: ( ruleKeyStringValueAnnotation EOF )
            // InternalKEffects.g:1107:1: ruleKeyStringValueAnnotation EOF
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
    // InternalKEffects.g:1114:1: ruleKeyStringValueAnnotation : ( ( rule__KeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1118:2: ( ( ( rule__KeyStringValueAnnotation__Group__0 ) ) )
            // InternalKEffects.g:1119:1: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKEffects.g:1119:1: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            // InternalKEffects.g:1120:1: ( rule__KeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKEffects.g:1121:1: ( rule__KeyStringValueAnnotation__Group__0 )
            // InternalKEffects.g:1121:2: rule__KeyStringValueAnnotation__Group__0
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
    // InternalKEffects.g:1133:1: entryRuleTypedKeyStringValueAnnotation : ruleTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKEffects.g:1134:1: ( ruleTypedKeyStringValueAnnotation EOF )
            // InternalKEffects.g:1135:1: ruleTypedKeyStringValueAnnotation EOF
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
    // InternalKEffects.g:1142:1: ruleTypedKeyStringValueAnnotation : ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1146:2: ( ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKEffects.g:1147:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKEffects.g:1147:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            // InternalKEffects.g:1148:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKEffects.g:1149:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            // InternalKEffects.g:1149:2: rule__TypedKeyStringValueAnnotation__Group__0
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
    // InternalKEffects.g:1161:1: entryRuleQuotedKeyStringValueAnnotation : ruleQuotedKeyStringValueAnnotation EOF ;
    public final void entryRuleQuotedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKEffects.g:1162:1: ( ruleQuotedKeyStringValueAnnotation EOF )
            // InternalKEffects.g:1163:1: ruleQuotedKeyStringValueAnnotation EOF
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
    // InternalKEffects.g:1170:1: ruleQuotedKeyStringValueAnnotation : ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleQuotedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1174:2: ( ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKEffects.g:1175:1: ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKEffects.g:1175:1: ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) )
            // InternalKEffects.g:1176:1: ( rule__QuotedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKEffects.g:1177:1: ( rule__QuotedKeyStringValueAnnotation__Group__0 )
            // InternalKEffects.g:1177:2: rule__QuotedKeyStringValueAnnotation__Group__0
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
    // InternalKEffects.g:1189:1: entryRuleQuotedTypedKeyStringValueAnnotation : ruleQuotedTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKEffects.g:1190:1: ( ruleQuotedTypedKeyStringValueAnnotation EOF )
            // InternalKEffects.g:1191:1: ruleQuotedTypedKeyStringValueAnnotation EOF
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
    // InternalKEffects.g:1198:1: ruleQuotedTypedKeyStringValueAnnotation : ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1202:2: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKEffects.g:1203:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKEffects.g:1203:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) )
            // InternalKEffects.g:1204:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKEffects.g:1205:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 )
            // InternalKEffects.g:1205:2: rule__QuotedTypedKeyStringValueAnnotation__Group__0
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
    // InternalKEffects.g:1217:1: entryRuleKeyBooleanValueAnnotation : ruleKeyBooleanValueAnnotation EOF ;
    public final void entryRuleKeyBooleanValueAnnotation() throws RecognitionException {
        try {
            // InternalKEffects.g:1218:1: ( ruleKeyBooleanValueAnnotation EOF )
            // InternalKEffects.g:1219:1: ruleKeyBooleanValueAnnotation EOF
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
    // InternalKEffects.g:1226:1: ruleKeyBooleanValueAnnotation : ( ( rule__KeyBooleanValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyBooleanValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1230:2: ( ( ( rule__KeyBooleanValueAnnotation__Group__0 ) ) )
            // InternalKEffects.g:1231:1: ( ( rule__KeyBooleanValueAnnotation__Group__0 ) )
            {
            // InternalKEffects.g:1231:1: ( ( rule__KeyBooleanValueAnnotation__Group__0 ) )
            // InternalKEffects.g:1232:1: ( rule__KeyBooleanValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getGroup()); 
            }
            // InternalKEffects.g:1233:1: ( rule__KeyBooleanValueAnnotation__Group__0 )
            // InternalKEffects.g:1233:2: rule__KeyBooleanValueAnnotation__Group__0
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
    // InternalKEffects.g:1245:1: entryRuleKeyIntValueAnnotation : ruleKeyIntValueAnnotation EOF ;
    public final void entryRuleKeyIntValueAnnotation() throws RecognitionException {
        try {
            // InternalKEffects.g:1246:1: ( ruleKeyIntValueAnnotation EOF )
            // InternalKEffects.g:1247:1: ruleKeyIntValueAnnotation EOF
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
    // InternalKEffects.g:1254:1: ruleKeyIntValueAnnotation : ( ( rule__KeyIntValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyIntValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1258:2: ( ( ( rule__KeyIntValueAnnotation__Group__0 ) ) )
            // InternalKEffects.g:1259:1: ( ( rule__KeyIntValueAnnotation__Group__0 ) )
            {
            // InternalKEffects.g:1259:1: ( ( rule__KeyIntValueAnnotation__Group__0 ) )
            // InternalKEffects.g:1260:1: ( rule__KeyIntValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getGroup()); 
            }
            // InternalKEffects.g:1261:1: ( rule__KeyIntValueAnnotation__Group__0 )
            // InternalKEffects.g:1261:2: rule__KeyIntValueAnnotation__Group__0
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
    // InternalKEffects.g:1273:1: entryRuleKeyFloatValueAnnotation : ruleKeyFloatValueAnnotation EOF ;
    public final void entryRuleKeyFloatValueAnnotation() throws RecognitionException {
        try {
            // InternalKEffects.g:1274:1: ( ruleKeyFloatValueAnnotation EOF )
            // InternalKEffects.g:1275:1: ruleKeyFloatValueAnnotation EOF
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
    // InternalKEffects.g:1282:1: ruleKeyFloatValueAnnotation : ( ( rule__KeyFloatValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyFloatValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1286:2: ( ( ( rule__KeyFloatValueAnnotation__Group__0 ) ) )
            // InternalKEffects.g:1287:1: ( ( rule__KeyFloatValueAnnotation__Group__0 ) )
            {
            // InternalKEffects.g:1287:1: ( ( rule__KeyFloatValueAnnotation__Group__0 ) )
            // InternalKEffects.g:1288:1: ( rule__KeyFloatValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getGroup()); 
            }
            // InternalKEffects.g:1289:1: ( rule__KeyFloatValueAnnotation__Group__0 )
            // InternalKEffects.g:1289:2: rule__KeyFloatValueAnnotation__Group__0
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
    // InternalKEffects.g:1301:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalKEffects.g:1302:1: ( ruleEString EOF )
            // InternalKEffects.g:1303:1: ruleEString EOF
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
    // InternalKEffects.g:1310:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1314:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalKEffects.g:1315:1: ( ( rule__EString__Alternatives ) )
            {
            // InternalKEffects.g:1315:1: ( ( rule__EString__Alternatives ) )
            // InternalKEffects.g:1316:1: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // InternalKEffects.g:1317:1: ( rule__EString__Alternatives )
            // InternalKEffects.g:1317:2: rule__EString__Alternatives
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
    // InternalKEffects.g:1329:1: entryRuleEStringBoolean : ruleEStringBoolean EOF ;
    public final void entryRuleEStringBoolean() throws RecognitionException {
        try {
            // InternalKEffects.g:1330:1: ( ruleEStringBoolean EOF )
            // InternalKEffects.g:1331:1: ruleEStringBoolean EOF
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
    // InternalKEffects.g:1338:1: ruleEStringBoolean : ( ( rule__EStringBoolean__Alternatives ) ) ;
    public final void ruleEStringBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1342:2: ( ( ( rule__EStringBoolean__Alternatives ) ) )
            // InternalKEffects.g:1343:1: ( ( rule__EStringBoolean__Alternatives ) )
            {
            // InternalKEffects.g:1343:1: ( ( rule__EStringBoolean__Alternatives ) )
            // InternalKEffects.g:1344:1: ( rule__EStringBoolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringBooleanAccess().getAlternatives()); 
            }
            // InternalKEffects.g:1345:1: ( rule__EStringBoolean__Alternatives )
            // InternalKEffects.g:1345:2: rule__EStringBoolean__Alternatives
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
    // InternalKEffects.g:1357:1: entryRuleExtendedID : ruleExtendedID EOF ;
    public final void entryRuleExtendedID() throws RecognitionException {
        try {
            // InternalKEffects.g:1358:1: ( ruleExtendedID EOF )
            // InternalKEffects.g:1359:1: ruleExtendedID EOF
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
    // InternalKEffects.g:1366:1: ruleExtendedID : ( ( rule__ExtendedID__Group__0 ) ) ;
    public final void ruleExtendedID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1370:2: ( ( ( rule__ExtendedID__Group__0 ) ) )
            // InternalKEffects.g:1371:1: ( ( rule__ExtendedID__Group__0 ) )
            {
            // InternalKEffects.g:1371:1: ( ( rule__ExtendedID__Group__0 ) )
            // InternalKEffects.g:1372:1: ( rule__ExtendedID__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup()); 
            }
            // InternalKEffects.g:1373:1: ( rule__ExtendedID__Group__0 )
            // InternalKEffects.g:1373:2: rule__ExtendedID__Group__0
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
    // InternalKEffects.g:1385:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // InternalKEffects.g:1386:1: ( ruleInteger EOF )
            // InternalKEffects.g:1387:1: ruleInteger EOF
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
    // InternalKEffects.g:1394:1: ruleInteger : ( ( rule__Integer__Group__0 ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1398:2: ( ( ( rule__Integer__Group__0 ) ) )
            // InternalKEffects.g:1399:1: ( ( rule__Integer__Group__0 ) )
            {
            // InternalKEffects.g:1399:1: ( ( rule__Integer__Group__0 ) )
            // InternalKEffects.g:1400:1: ( rule__Integer__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getGroup()); 
            }
            // InternalKEffects.g:1401:1: ( rule__Integer__Group__0 )
            // InternalKEffects.g:1401:2: rule__Integer__Group__0
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
    // InternalKEffects.g:1413:1: entryRuleFloateger : ruleFloateger EOF ;
    public final void entryRuleFloateger() throws RecognitionException {
        try {
            // InternalKEffects.g:1414:1: ( ruleFloateger EOF )
            // InternalKEffects.g:1415:1: ruleFloateger EOF
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
    // InternalKEffects.g:1422:1: ruleFloateger : ( ( rule__Floateger__Group__0 ) ) ;
    public final void ruleFloateger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1426:2: ( ( ( rule__Floateger__Group__0 ) ) )
            // InternalKEffects.g:1427:1: ( ( rule__Floateger__Group__0 ) )
            {
            // InternalKEffects.g:1427:1: ( ( rule__Floateger__Group__0 ) )
            // InternalKEffects.g:1428:1: ( rule__Floateger__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloategerAccess().getGroup()); 
            }
            // InternalKEffects.g:1429:1: ( rule__Floateger__Group__0 )
            // InternalKEffects.g:1429:2: rule__Floateger__Group__0
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


    // $ANTLR start "ruleAssignOperator"
    // InternalKEffects.g:1442:1: ruleAssignOperator : ( ( rule__AssignOperator__Alternatives ) ) ;
    public final void ruleAssignOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1446:1: ( ( ( rule__AssignOperator__Alternatives ) ) )
            // InternalKEffects.g:1447:1: ( ( rule__AssignOperator__Alternatives ) )
            {
            // InternalKEffects.g:1447:1: ( ( rule__AssignOperator__Alternatives ) )
            // InternalKEffects.g:1448:1: ( rule__AssignOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignOperatorAccess().getAlternatives()); 
            }
            // InternalKEffects.g:1449:1: ( rule__AssignOperator__Alternatives )
            // InternalKEffects.g:1449:2: rule__AssignOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssignOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignOperator"


    // $ANTLR start "rulePostfixOperator"
    // InternalKEffects.g:1461:1: rulePostfixOperator : ( ( rule__PostfixOperator__Alternatives ) ) ;
    public final void rulePostfixOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1465:1: ( ( ( rule__PostfixOperator__Alternatives ) ) )
            // InternalKEffects.g:1466:1: ( ( rule__PostfixOperator__Alternatives ) )
            {
            // InternalKEffects.g:1466:1: ( ( rule__PostfixOperator__Alternatives ) )
            // InternalKEffects.g:1467:1: ( rule__PostfixOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPostfixOperatorAccess().getAlternatives()); 
            }
            // InternalKEffects.g:1468:1: ( rule__PostfixOperator__Alternatives )
            // InternalKEffects.g:1468:2: rule__PostfixOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PostfixOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPostfixOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePostfixOperator"


    // $ANTLR start "ruleCompareOperator"
    // InternalKEffects.g:1480:1: ruleCompareOperator : ( ( rule__CompareOperator__Alternatives ) ) ;
    public final void ruleCompareOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1484:1: ( ( ( rule__CompareOperator__Alternatives ) ) )
            // InternalKEffects.g:1485:1: ( ( rule__CompareOperator__Alternatives ) )
            {
            // InternalKEffects.g:1485:1: ( ( rule__CompareOperator__Alternatives ) )
            // InternalKEffects.g:1486:1: ( rule__CompareOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            }
            // InternalKEffects.g:1487:1: ( rule__CompareOperator__Alternatives )
            // InternalKEffects.g:1487:2: rule__CompareOperator__Alternatives
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
    // InternalKEffects.g:1499:1: rulePreOperator : ( ( 'pre' ) ) ;
    public final void rulePreOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1503:1: ( ( ( 'pre' ) ) )
            // InternalKEffects.g:1504:1: ( ( 'pre' ) )
            {
            // InternalKEffects.g:1504:1: ( ( 'pre' ) )
            // InternalKEffects.g:1505:1: ( 'pre' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreOperatorAccess().getPREEnumLiteralDeclaration()); 
            }
            // InternalKEffects.g:1506:1: ( 'pre' )
            // InternalKEffects.g:1506:3: 'pre'
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
    // InternalKEffects.g:1519:1: ruleBitwiseOrOperator : ( ( '|' ) ) ;
    public final void ruleBitwiseOrOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1523:1: ( ( ( '|' ) ) )
            // InternalKEffects.g:1524:1: ( ( '|' ) )
            {
            // InternalKEffects.g:1524:1: ( ( '|' ) )
            // InternalKEffects.g:1525:1: ( '|' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrOperatorAccess().getBITWISE_OREnumLiteralDeclaration()); 
            }
            // InternalKEffects.g:1526:1: ( '|' )
            // InternalKEffects.g:1526:3: '|'
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
    // InternalKEffects.g:1539:1: ruleBitwiseAndOperator : ( ( '&' ) ) ;
    public final void ruleBitwiseAndOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1543:1: ( ( ( '&' ) ) )
            // InternalKEffects.g:1544:1: ( ( '&' ) )
            {
            // InternalKEffects.g:1544:1: ( ( '&' ) )
            // InternalKEffects.g:1545:1: ( '&' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndOperatorAccess().getBITWISE_ANDEnumLiteralDeclaration()); 
            }
            // InternalKEffects.g:1546:1: ( '&' )
            // InternalKEffects.g:1546:3: '&'
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
    // InternalKEffects.g:1559:1: ruleNotOperator : ( ( '!' ) ) ;
    public final void ruleNotOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1563:1: ( ( ( '!' ) ) )
            // InternalKEffects.g:1564:1: ( ( '!' ) )
            {
            // InternalKEffects.g:1564:1: ( ( '!' ) )
            // InternalKEffects.g:1565:1: ( '!' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration()); 
            }
            // InternalKEffects.g:1566:1: ( '!' )
            // InternalKEffects.g:1566:3: '!'
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
    // InternalKEffects.g:1579:1: ruleAddOperator : ( ( '+' ) ) ;
    public final void ruleAddOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1583:1: ( ( ( '+' ) ) )
            // InternalKEffects.g:1584:1: ( ( '+' ) )
            {
            // InternalKEffects.g:1584:1: ( ( '+' ) )
            // InternalKEffects.g:1585:1: ( '+' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddOperatorAccess().getADDEnumLiteralDeclaration()); 
            }
            // InternalKEffects.g:1586:1: ( '+' )
            // InternalKEffects.g:1586:3: '+'
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
    // InternalKEffects.g:1599:1: ruleSubOperator : ( ( '-' ) ) ;
    public final void ruleSubOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1603:1: ( ( ( '-' ) ) )
            // InternalKEffects.g:1604:1: ( ( '-' ) )
            {
            // InternalKEffects.g:1604:1: ( ( '-' ) )
            // InternalKEffects.g:1605:1: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubOperatorAccess().getSUBEnumLiteralDeclaration()); 
            }
            // InternalKEffects.g:1606:1: ( '-' )
            // InternalKEffects.g:1606:3: '-'
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
    // InternalKEffects.g:1619:1: ruleMultOperator : ( ( '*' ) ) ;
    public final void ruleMultOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1623:1: ( ( ( '*' ) ) )
            // InternalKEffects.g:1624:1: ( ( '*' ) )
            {
            // InternalKEffects.g:1624:1: ( ( '*' ) )
            // InternalKEffects.g:1625:1: ( '*' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration()); 
            }
            // InternalKEffects.g:1626:1: ( '*' )
            // InternalKEffects.g:1626:3: '*'
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
    // InternalKEffects.g:1639:1: ruleModOperator : ( ( '%' ) ) ;
    public final void ruleModOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1643:1: ( ( ( '%' ) ) )
            // InternalKEffects.g:1644:1: ( ( '%' ) )
            {
            // InternalKEffects.g:1644:1: ( ( '%' ) )
            // InternalKEffects.g:1645:1: ( '%' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModOperatorAccess().getMODEnumLiteralDeclaration()); 
            }
            // InternalKEffects.g:1646:1: ( '%' )
            // InternalKEffects.g:1646:3: '%'
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
    // InternalKEffects.g:1659:1: ruleDivOperator : ( ( '/' ) ) ;
    public final void ruleDivOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1663:1: ( ( ( '/' ) ) )
            // InternalKEffects.g:1664:1: ( ( '/' ) )
            {
            // InternalKEffects.g:1664:1: ( ( '/' ) )
            // InternalKEffects.g:1665:1: ( '/' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivOperatorAccess().getDIVEnumLiteralDeclaration()); 
            }
            // InternalKEffects.g:1666:1: ( '/' )
            // InternalKEffects.g:1666:3: '/'
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
    // InternalKEffects.g:1679:1: ruleValOperator : ( ( 'val' ) ) ;
    public final void ruleValOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1683:1: ( ( ( 'val' ) ) )
            // InternalKEffects.g:1684:1: ( ( 'val' ) )
            {
            // InternalKEffects.g:1684:1: ( ( 'val' ) )
            // InternalKEffects.g:1685:1: ( 'val' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValOperatorAccess().getVALEnumLiteralDeclaration()); 
            }
            // InternalKEffects.g:1686:1: ( 'val' )
            // InternalKEffects.g:1686:3: 'val'
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
    // InternalKEffects.g:1699:1: ruleLogicalOrOperator : ( ( '||' ) ) ;
    public final void ruleLogicalOrOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1703:1: ( ( ( '||' ) ) )
            // InternalKEffects.g:1704:1: ( ( '||' ) )
            {
            // InternalKEffects.g:1704:1: ( ( '||' ) )
            // InternalKEffects.g:1705:1: ( '||' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrOperatorAccess().getLOGICAL_OREnumLiteralDeclaration()); 
            }
            // InternalKEffects.g:1706:1: ( '||' )
            // InternalKEffects.g:1706:3: '||'
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
    // InternalKEffects.g:1719:1: ruleLogicalAndOperator : ( ( '&&' ) ) ;
    public final void ruleLogicalAndOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1723:1: ( ( ( '&&' ) ) )
            // InternalKEffects.g:1724:1: ( ( '&&' ) )
            {
            // InternalKEffects.g:1724:1: ( ( '&&' ) )
            // InternalKEffects.g:1725:1: ( '&&' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndOperatorAccess().getLOGICAL_ANDEnumLiteralDeclaration()); 
            }
            // InternalKEffects.g:1726:1: ( '&&' )
            // InternalKEffects.g:1726:3: '&&'
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


    // $ANTLR start "rule__Effect__Alternatives"
    // InternalKEffects.g:1748:1: rule__Effect__Alternatives : ( ( ruleAssignment ) | ( rulePostfixEffect ) | ( ruleEmission ) | ( ruleHostcodeEffect ) | ( ruleFunctionCallEffect ) );
    public final void rule__Effect__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1752:1: ( ( ruleAssignment ) | ( rulePostfixEffect ) | ( ruleEmission ) | ( ruleHostcodeEffect ) | ( ruleFunctionCallEffect ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case RULE_COMMENT_ANNOTATION:
                {
                int LA1_1 = input.LA(2);

                if ( (synpred1_InternalKEffects()) ) {
                    alt1=1;
                }
                else if ( (synpred2_InternalKEffects()) ) {
                    alt1=2;
                }
                else if ( (synpred3_InternalKEffects()) ) {
                    alt1=3;
                }
                else if ( (synpred4_InternalKEffects()) ) {
                    alt1=4;
                }
                else if ( (true) ) {
                    alt1=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 47:
                {
                int LA1_2 = input.LA(2);

                if ( (synpred1_InternalKEffects()) ) {
                    alt1=1;
                }
                else if ( (synpred2_InternalKEffects()) ) {
                    alt1=2;
                }
                else if ( (synpred3_InternalKEffects()) ) {
                    alt1=3;
                }
                else if ( (synpred4_InternalKEffects()) ) {
                    alt1=4;
                }
                else if ( (true) ) {
                    alt1=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA1_3 = input.LA(2);

                if ( (synpred1_InternalKEffects()) ) {
                    alt1=1;
                }
                else if ( (synpred2_InternalKEffects()) ) {
                    alt1=2;
                }
                else if ( (synpred3_InternalKEffects()) ) {
                    alt1=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_HOSTCODE:
                {
                alt1=4;
                }
                break;
            case 37:
                {
                alt1=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalKEffects.g:1753:1: ( ruleAssignment )
                    {
                    // InternalKEffects.g:1753:1: ( ruleAssignment )
                    // InternalKEffects.g:1754:1: ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEffectAccess().getAssignmentParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAssignment();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEffectAccess().getAssignmentParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKEffects.g:1759:6: ( rulePostfixEffect )
                    {
                    // InternalKEffects.g:1759:6: ( rulePostfixEffect )
                    // InternalKEffects.g:1760:1: rulePostfixEffect
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEffectAccess().getPostfixEffectParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    rulePostfixEffect();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEffectAccess().getPostfixEffectParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKEffects.g:1765:6: ( ruleEmission )
                    {
                    // InternalKEffects.g:1765:6: ( ruleEmission )
                    // InternalKEffects.g:1766:1: ruleEmission
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEffectAccess().getEmissionParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleEmission();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEffectAccess().getEmissionParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKEffects.g:1771:6: ( ruleHostcodeEffect )
                    {
                    // InternalKEffects.g:1771:6: ( ruleHostcodeEffect )
                    // InternalKEffects.g:1772:1: ruleHostcodeEffect
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEffectAccess().getHostcodeEffectParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleHostcodeEffect();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEffectAccess().getHostcodeEffectParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKEffects.g:1777:6: ( ruleFunctionCallEffect )
                    {
                    // InternalKEffects.g:1777:6: ( ruleFunctionCallEffect )
                    // InternalKEffects.g:1778:1: ruleFunctionCallEffect
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEffectAccess().getFunctionCallEffectParserRuleCall_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleFunctionCallEffect();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEffectAccess().getFunctionCallEffectParserRuleCall_4()); 
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
    // $ANTLR end "rule__Effect__Alternatives"


    // $ANTLR start "rule__FunctionCallEffect__Alternatives_3"
    // InternalKEffects.g:1788:1: rule__FunctionCallEffect__Alternatives_3 : ( ( ( rule__FunctionCallEffect__Group_3_0__0 ) ) | ( '()' ) );
    public final void rule__FunctionCallEffect__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1792:1: ( ( ( rule__FunctionCallEffect__Group_3_0__0 ) ) | ( '()' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==42) ) {
                alt2=1;
            }
            else if ( (LA2_0==28) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalKEffects.g:1793:1: ( ( rule__FunctionCallEffect__Group_3_0__0 ) )
                    {
                    // InternalKEffects.g:1793:1: ( ( rule__FunctionCallEffect__Group_3_0__0 ) )
                    // InternalKEffects.g:1794:1: ( rule__FunctionCallEffect__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctionCallEffectAccess().getGroup_3_0()); 
                    }
                    // InternalKEffects.g:1795:1: ( rule__FunctionCallEffect__Group_3_0__0 )
                    // InternalKEffects.g:1795:2: rule__FunctionCallEffect__Group_3_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__FunctionCallEffect__Group_3_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFunctionCallEffectAccess().getGroup_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKEffects.g:1799:6: ( '()' )
                    {
                    // InternalKEffects.g:1799:6: ( '()' )
                    // InternalKEffects.g:1800:1: '()'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisRightParenthesisKeyword_3_1()); 
                    }
                    match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisRightParenthesisKeyword_3_1()); 
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
    // $ANTLR end "rule__FunctionCallEffect__Alternatives_3"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalKEffects.g:1812:1: rule__Expression__Alternatives : ( ( ruleBoolExpression ) | ( ruleValuedExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1816:1: ( ( ruleBoolExpression ) | ( ruleValuedExpression ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalKEffects.g:1817:1: ( ruleBoolExpression )
                    {
                    // InternalKEffects.g:1817:1: ( ruleBoolExpression )
                    // InternalKEffects.g:1818:1: ruleBoolExpression
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
                    // InternalKEffects.g:1823:6: ( ruleValuedExpression )
                    {
                    // InternalKEffects.g:1823:6: ( ruleValuedExpression )
                    // InternalKEffects.g:1824:1: ruleValuedExpression
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
    // InternalKEffects.g:1834:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );
    public final void rule__NotOrValuedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1838:1: ( ( ruleValuedExpression ) | ( ruleNotExpression ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalKEffects.g:1839:1: ( ruleValuedExpression )
                    {
                    // InternalKEffects.g:1839:1: ( ruleValuedExpression )
                    // InternalKEffects.g:1840:1: ruleValuedExpression
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
                    // InternalKEffects.g:1845:6: ( ruleNotExpression )
                    {
                    // InternalKEffects.g:1845:6: ( ruleNotExpression )
                    // InternalKEffects.g:1846:1: ruleNotExpression
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
    // InternalKEffects.g:1856:1: rule__NotExpression__Alternatives : ( ( ( rule__NotExpression__Group_0__0 ) ) | ( ruleAtomicExpression ) );
    public final void rule__NotExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1860:1: ( ( ( rule__NotExpression__Group_0__0 ) ) | ( ruleAtomicExpression ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=RULE_BOOLEAN && LA5_0<=RULE_ID)||LA5_0==RULE_HOSTCODE||LA5_0==16||LA5_0==25||LA5_0==37||LA5_0==42) ) {
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
                    // InternalKEffects.g:1861:1: ( ( rule__NotExpression__Group_0__0 ) )
                    {
                    // InternalKEffects.g:1861:1: ( ( rule__NotExpression__Group_0__0 ) )
                    // InternalKEffects.g:1862:1: ( rule__NotExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNotExpressionAccess().getGroup_0()); 
                    }
                    // InternalKEffects.g:1863:1: ( rule__NotExpression__Group_0__0 )
                    // InternalKEffects.g:1863:2: rule__NotExpression__Group_0__0
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
                    // InternalKEffects.g:1867:6: ( ruleAtomicExpression )
                    {
                    // InternalKEffects.g:1867:6: ( ruleAtomicExpression )
                    // InternalKEffects.g:1868:1: ruleAtomicExpression
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
    // InternalKEffects.g:1878:1: rule__NegExpression__Alternatives : ( ( ( rule__NegExpression__Group_0__0 ) ) | ( ruleAtomicValuedExpression ) );
    public final void rule__NegExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1882:1: ( ( ( rule__NegExpression__Group_0__0 ) ) | ( ruleAtomicValuedExpression ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_HOSTCODE)||LA6_0==16||LA6_0==25||LA6_0==37||LA6_0==42) ) {
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
                    // InternalKEffects.g:1883:1: ( ( rule__NegExpression__Group_0__0 ) )
                    {
                    // InternalKEffects.g:1883:1: ( ( rule__NegExpression__Group_0__0 ) )
                    // InternalKEffects.g:1884:1: ( rule__NegExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNegExpressionAccess().getGroup_0()); 
                    }
                    // InternalKEffects.g:1885:1: ( rule__NegExpression__Group_0__0 )
                    // InternalKEffects.g:1885:2: rule__NegExpression__Group_0__0
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
                    // InternalKEffects.g:1889:6: ( ruleAtomicValuedExpression )
                    {
                    // InternalKEffects.g:1889:6: ( ruleAtomicValuedExpression )
                    // InternalKEffects.g:1890:1: ruleAtomicValuedExpression
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
    // InternalKEffects.g:1900:1: rule__AtomicExpression__Alternatives : ( ( ruleBoolValue ) | ( ruleValuedObjectTestExpression ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ruleFunctionCall ) | ( ruleTextExpression ) );
    public final void rule__AtomicExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1904:1: ( ( ruleBoolValue ) | ( ruleValuedObjectTestExpression ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ruleFunctionCall ) | ( ruleTextExpression ) )
            int alt7=5;
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
            case 42:
                {
                alt7=3;
                }
                break;
            case 37:
                {
                alt7=4;
                }
                break;
            case RULE_HOSTCODE:
                {
                alt7=5;
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
                    // InternalKEffects.g:1905:1: ( ruleBoolValue )
                    {
                    // InternalKEffects.g:1905:1: ( ruleBoolValue )
                    // InternalKEffects.g:1906:1: ruleBoolValue
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
                    // InternalKEffects.g:1911:6: ( ruleValuedObjectTestExpression )
                    {
                    // InternalKEffects.g:1911:6: ( ruleValuedObjectTestExpression )
                    // InternalKEffects.g:1912:1: ruleValuedObjectTestExpression
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
                    // InternalKEffects.g:1917:6: ( ( rule__AtomicExpression__Group_2__0 ) )
                    {
                    // InternalKEffects.g:1917:6: ( ( rule__AtomicExpression__Group_2__0 ) )
                    // InternalKEffects.g:1918:1: ( rule__AtomicExpression__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getGroup_2()); 
                    }
                    // InternalKEffects.g:1919:1: ( rule__AtomicExpression__Group_2__0 )
                    // InternalKEffects.g:1919:2: rule__AtomicExpression__Group_2__0
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
                    // InternalKEffects.g:1923:6: ( ruleFunctionCall )
                    {
                    // InternalKEffects.g:1923:6: ( ruleFunctionCall )
                    // InternalKEffects.g:1924:1: ruleFunctionCall
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
                    // InternalKEffects.g:1929:6: ( ruleTextExpression )
                    {
                    // InternalKEffects.g:1929:6: ( ruleTextExpression )
                    // InternalKEffects.g:1930:1: ruleTextExpression
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
    // InternalKEffects.g:1940:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleStringValue ) | ( ( rule__AtomicValuedExpression__Group_3__0 ) ) | ( ruleAtomicExpression ) );
    public final void rule__AtomicValuedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1944:1: ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleStringValue ) | ( ( rule__AtomicValuedExpression__Group_3__0 ) ) | ( ruleAtomicExpression ) )
            int alt8=5;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalKEffects.g:1945:1: ( ruleIntValue )
                    {
                    // InternalKEffects.g:1945:1: ( ruleIntValue )
                    // InternalKEffects.g:1946:1: ruleIntValue
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
                    // InternalKEffects.g:1951:6: ( ruleFloatValue )
                    {
                    // InternalKEffects.g:1951:6: ( ruleFloatValue )
                    // InternalKEffects.g:1952:1: ruleFloatValue
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
                    // InternalKEffects.g:1957:6: ( ruleStringValue )
                    {
                    // InternalKEffects.g:1957:6: ( ruleStringValue )
                    // InternalKEffects.g:1958:1: ruleStringValue
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
                    // InternalKEffects.g:1963:6: ( ( rule__AtomicValuedExpression__Group_3__0 ) )
                    {
                    // InternalKEffects.g:1963:6: ( ( rule__AtomicValuedExpression__Group_3__0 ) )
                    // InternalKEffects.g:1964:1: ( rule__AtomicValuedExpression__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_3()); 
                    }
                    // InternalKEffects.g:1965:1: ( rule__AtomicValuedExpression__Group_3__0 )
                    // InternalKEffects.g:1965:2: rule__AtomicValuedExpression__Group_3__0
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
                    // InternalKEffects.g:1969:6: ( ruleAtomicExpression )
                    {
                    // InternalKEffects.g:1969:6: ( ruleAtomicExpression )
                    // InternalKEffects.g:1970:1: ruleAtomicExpression
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
    // InternalKEffects.g:1980:1: rule__ValuedObjectTestExpression__Alternatives : ( ( ( rule__ValuedObjectTestExpression__Group_0__0 ) ) | ( ruleValuedObjectReference ) );
    public final void rule__ValuedObjectTestExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1984:1: ( ( ( rule__ValuedObjectTestExpression__Group_0__0 ) ) | ( ruleValuedObjectReference ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16||LA9_0==25) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
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
                    // InternalKEffects.g:1985:1: ( ( rule__ValuedObjectTestExpression__Group_0__0 ) )
                    {
                    // InternalKEffects.g:1985:1: ( ( rule__ValuedObjectTestExpression__Group_0__0 ) )
                    // InternalKEffects.g:1986:1: ( rule__ValuedObjectTestExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getGroup_0()); 
                    }
                    // InternalKEffects.g:1987:1: ( rule__ValuedObjectTestExpression__Group_0__0 )
                    // InternalKEffects.g:1987:2: rule__ValuedObjectTestExpression__Group_0__0
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
                    // InternalKEffects.g:1991:6: ( ruleValuedObjectReference )
                    {
                    // InternalKEffects.g:1991:6: ( ruleValuedObjectReference )
                    // InternalKEffects.g:1992:1: ruleValuedObjectReference
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
    // InternalKEffects.g:2002:1: rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 : ( ( rulePreOperator ) | ( ruleValOperator ) );
    public final void rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2006:1: ( ( rulePreOperator ) | ( ruleValOperator ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            else if ( (LA10_0==25) ) {
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
                    // InternalKEffects.g:2007:1: ( rulePreOperator )
                    {
                    // InternalKEffects.g:2007:1: ( rulePreOperator )
                    // InternalKEffects.g:2008:1: rulePreOperator
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
                    // InternalKEffects.g:2013:6: ( ruleValOperator )
                    {
                    // InternalKEffects.g:2013:6: ( ruleValOperator )
                    // InternalKEffects.g:2014:1: ruleValOperator
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
    // InternalKEffects.g:2024:1: rule__FunctionCall__Alternatives_2 : ( ( ( rule__FunctionCall__Group_2_0__0 ) ) | ( '()' ) );
    public final void rule__FunctionCall__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2028:1: ( ( ( rule__FunctionCall__Group_2_0__0 ) ) | ( '()' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==42) ) {
                alt11=1;
            }
            else if ( (LA11_0==28) ) {
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
                    // InternalKEffects.g:2029:1: ( ( rule__FunctionCall__Group_2_0__0 ) )
                    {
                    // InternalKEffects.g:2029:1: ( ( rule__FunctionCall__Group_2_0__0 ) )
                    // InternalKEffects.g:2030:1: ( rule__FunctionCall__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctionCallAccess().getGroup_2_0()); 
                    }
                    // InternalKEffects.g:2031:1: ( rule__FunctionCall__Group_2_0__0 )
                    // InternalKEffects.g:2031:2: rule__FunctionCall__Group_2_0__0
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
                    // InternalKEffects.g:2035:6: ( '()' )
                    {
                    // InternalKEffects.g:2035:6: ( '()' )
                    // InternalKEffects.g:2036:1: '()'
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


    // $ANTLR start "rule__Annotation__Alternatives"
    // InternalKEffects.g:2050:1: rule__Annotation__Alternatives : ( ( ruleCommentAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) | ( ruleTagAnnotation ) );
    public final void rule__Annotation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2054:1: ( ( ruleCommentAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) | ( ruleTagAnnotation ) )
            int alt12=7;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalKEffects.g:2055:1: ( ruleCommentAnnotation )
                    {
                    // InternalKEffects.g:2055:1: ( ruleCommentAnnotation )
                    // InternalKEffects.g:2056:1: ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleCommentAnnotation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKEffects.g:2061:6: ( ruleKeyBooleanValueAnnotation )
                    {
                    // InternalKEffects.g:2061:6: ( ruleKeyBooleanValueAnnotation )
                    // InternalKEffects.g:2062:1: ruleKeyBooleanValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleKeyBooleanValueAnnotation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKEffects.g:2067:6: ( ruleKeyStringValueAnnotation )
                    {
                    // InternalKEffects.g:2067:6: ( ruleKeyStringValueAnnotation )
                    // InternalKEffects.g:2068:1: ruleKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleKeyStringValueAnnotation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKEffects.g:2073:6: ( ruleTypedKeyStringValueAnnotation )
                    {
                    // InternalKEffects.g:2073:6: ( ruleTypedKeyStringValueAnnotation )
                    // InternalKEffects.g:2074:1: ruleTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTypedKeyStringValueAnnotation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKEffects.g:2079:6: ( ruleKeyIntValueAnnotation )
                    {
                    // InternalKEffects.g:2079:6: ( ruleKeyIntValueAnnotation )
                    // InternalKEffects.g:2080:1: ruleKeyIntValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleKeyIntValueAnnotation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKEffects.g:2085:6: ( ruleKeyFloatValueAnnotation )
                    {
                    // InternalKEffects.g:2085:6: ( ruleKeyFloatValueAnnotation )
                    // InternalKEffects.g:2086:1: ruleKeyFloatValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_5()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleKeyFloatValueAnnotation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalKEffects.g:2091:6: ( ruleTagAnnotation )
                    {
                    // InternalKEffects.g:2091:6: ( ruleTagAnnotation )
                    // InternalKEffects.g:2092:1: ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_6()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTagAnnotation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_6()); 
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
    // $ANTLR end "rule__Annotation__Alternatives"


    // $ANTLR start "rule__RestrictedAnnotation__Alternatives"
    // InternalKEffects.g:2103:1: rule__RestrictedAnnotation__Alternatives : ( ( ruleCommentAnnotation ) | ( ruleQuotedKeyStringValueAnnotation ) | ( ruleQuotedTypedKeyStringValueAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) | ( ruleTagAnnotation ) );
    public final void rule__RestrictedAnnotation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2107:1: ( ( ruleCommentAnnotation ) | ( ruleQuotedKeyStringValueAnnotation ) | ( ruleQuotedTypedKeyStringValueAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) | ( ruleTagAnnotation ) )
            int alt13=7;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalKEffects.g:2108:1: ( ruleCommentAnnotation )
                    {
                    // InternalKEffects.g:2108:1: ( ruleCommentAnnotation )
                    // InternalKEffects.g:2109:1: ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRestrictedAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleCommentAnnotation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRestrictedAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKEffects.g:2114:6: ( ruleQuotedKeyStringValueAnnotation )
                    {
                    // InternalKEffects.g:2114:6: ( ruleQuotedKeyStringValueAnnotation )
                    // InternalKEffects.g:2115:1: ruleQuotedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRestrictedAnnotationAccess().getQuotedKeyStringValueAnnotationParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleQuotedKeyStringValueAnnotation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRestrictedAnnotationAccess().getQuotedKeyStringValueAnnotationParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKEffects.g:2120:6: ( ruleQuotedTypedKeyStringValueAnnotation )
                    {
                    // InternalKEffects.g:2120:6: ( ruleQuotedTypedKeyStringValueAnnotation )
                    // InternalKEffects.g:2121:1: ruleQuotedTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRestrictedAnnotationAccess().getQuotedTypedKeyStringValueAnnotationParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleQuotedTypedKeyStringValueAnnotation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRestrictedAnnotationAccess().getQuotedTypedKeyStringValueAnnotationParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKEffects.g:2126:6: ( ruleKeyBooleanValueAnnotation )
                    {
                    // InternalKEffects.g:2126:6: ( ruleKeyBooleanValueAnnotation )
                    // InternalKEffects.g:2127:1: ruleKeyBooleanValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRestrictedAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleKeyBooleanValueAnnotation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRestrictedAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKEffects.g:2132:6: ( ruleKeyIntValueAnnotation )
                    {
                    // InternalKEffects.g:2132:6: ( ruleKeyIntValueAnnotation )
                    // InternalKEffects.g:2133:1: ruleKeyIntValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRestrictedAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleKeyIntValueAnnotation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRestrictedAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKEffects.g:2138:6: ( ruleKeyFloatValueAnnotation )
                    {
                    // InternalKEffects.g:2138:6: ( ruleKeyFloatValueAnnotation )
                    // InternalKEffects.g:2139:1: ruleKeyFloatValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRestrictedAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_5()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleKeyFloatValueAnnotation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRestrictedAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalKEffects.g:2144:6: ( ruleTagAnnotation )
                    {
                    // InternalKEffects.g:2144:6: ( ruleTagAnnotation )
                    // InternalKEffects.g:2145:1: ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRestrictedAnnotationAccess().getTagAnnotationParserRuleCall_6()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTagAnnotation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRestrictedAnnotationAccess().getTagAnnotationParserRuleCall_6()); 
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
    // $ANTLR end "rule__RestrictedAnnotation__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalKEffects.g:2155:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( ruleExtendedID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2159:1: ( ( RULE_STRING ) | ( ruleExtendedID ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
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
                    // InternalKEffects.g:2160:1: ( RULE_STRING )
                    {
                    // InternalKEffects.g:2160:1: ( RULE_STRING )
                    // InternalKEffects.g:2161:1: RULE_STRING
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
                    // InternalKEffects.g:2166:6: ( ruleExtendedID )
                    {
                    // InternalKEffects.g:2166:6: ( ruleExtendedID )
                    // InternalKEffects.g:2167:1: ruleExtendedID
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
    // InternalKEffects.g:2177:1: rule__EStringBoolean__Alternatives : ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) );
    public final void rule__EStringBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2181:1: ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) )
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
                    // InternalKEffects.g:2182:1: ( RULE_STRING )
                    {
                    // InternalKEffects.g:2182:1: ( RULE_STRING )
                    // InternalKEffects.g:2183:1: RULE_STRING
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
                    // InternalKEffects.g:2188:6: ( ruleExtendedID )
                    {
                    // InternalKEffects.g:2188:6: ( ruleExtendedID )
                    // InternalKEffects.g:2189:1: ruleExtendedID
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
                    // InternalKEffects.g:2194:6: ( RULE_BOOLEAN )
                    {
                    // InternalKEffects.g:2194:6: ( RULE_BOOLEAN )
                    // InternalKEffects.g:2195:1: RULE_BOOLEAN
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


    // $ANTLR start "rule__AssignOperator__Alternatives"
    // InternalKEffects.g:2205:1: rule__AssignOperator__Alternatives : ( ( ( '=' ) ) | ( ( '+=' ) ) | ( ( '-=' ) ) | ( ( '*=' ) ) | ( ( '/=' ) ) );
    public final void rule__AssignOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2209:1: ( ( ( '=' ) ) | ( ( '+=' ) ) | ( ( '-=' ) ) | ( ( '*=' ) ) | ( ( '/=' ) ) )
            int alt16=5;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt16=1;
                }
                break;
            case 30:
                {
                alt16=2;
                }
                break;
            case 31:
                {
                alt16=3;
                }
                break;
            case 32:
                {
                alt16=4;
                }
                break;
            case 33:
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
                    // InternalKEffects.g:2210:1: ( ( '=' ) )
                    {
                    // InternalKEffects.g:2210:1: ( ( '=' ) )
                    // InternalKEffects.g:2211:1: ( '=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0()); 
                    }
                    // InternalKEffects.g:2212:1: ( '=' )
                    // InternalKEffects.g:2212:3: '='
                    {
                    match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKEffects.g:2217:6: ( ( '+=' ) )
                    {
                    // InternalKEffects.g:2217:6: ( ( '+=' ) )
                    // InternalKEffects.g:2218:1: ( '+=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssignOperatorAccess().getASSIGNADDEnumLiteralDeclaration_1()); 
                    }
                    // InternalKEffects.g:2219:1: ( '+=' )
                    // InternalKEffects.g:2219:3: '+='
                    {
                    match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAssignOperatorAccess().getASSIGNADDEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKEffects.g:2224:6: ( ( '-=' ) )
                    {
                    // InternalKEffects.g:2224:6: ( ( '-=' ) )
                    // InternalKEffects.g:2225:1: ( '-=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssignOperatorAccess().getASSIGNSUBEnumLiteralDeclaration_2()); 
                    }
                    // InternalKEffects.g:2226:1: ( '-=' )
                    // InternalKEffects.g:2226:3: '-='
                    {
                    match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAssignOperatorAccess().getASSIGNSUBEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKEffects.g:2231:6: ( ( '*=' ) )
                    {
                    // InternalKEffects.g:2231:6: ( ( '*=' ) )
                    // InternalKEffects.g:2232:1: ( '*=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssignOperatorAccess().getASSIGNMULEnumLiteralDeclaration_3()); 
                    }
                    // InternalKEffects.g:2233:1: ( '*=' )
                    // InternalKEffects.g:2233:3: '*='
                    {
                    match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAssignOperatorAccess().getASSIGNMULEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKEffects.g:2238:6: ( ( '/=' ) )
                    {
                    // InternalKEffects.g:2238:6: ( ( '/=' ) )
                    // InternalKEffects.g:2239:1: ( '/=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssignOperatorAccess().getASSIGNDIVEnumLiteralDeclaration_4()); 
                    }
                    // InternalKEffects.g:2240:1: ( '/=' )
                    // InternalKEffects.g:2240:3: '/='
                    {
                    match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAssignOperatorAccess().getASSIGNDIVEnumLiteralDeclaration_4()); 
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
    // $ANTLR end "rule__AssignOperator__Alternatives"


    // $ANTLR start "rule__PostfixOperator__Alternatives"
    // InternalKEffects.g:2250:1: rule__PostfixOperator__Alternatives : ( ( ( '++' ) ) | ( ( '--' ) ) );
    public final void rule__PostfixOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2254:1: ( ( ( '++' ) ) | ( ( '--' ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            else if ( (LA17_0==35) ) {
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
                    // InternalKEffects.g:2255:1: ( ( '++' ) )
                    {
                    // InternalKEffects.g:2255:1: ( ( '++' ) )
                    // InternalKEffects.g:2256:1: ( '++' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPostfixOperatorAccess().getPOSTFIXADDEnumLiteralDeclaration_0()); 
                    }
                    // InternalKEffects.g:2257:1: ( '++' )
                    // InternalKEffects.g:2257:3: '++'
                    {
                    match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPostfixOperatorAccess().getPOSTFIXADDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKEffects.g:2262:6: ( ( '--' ) )
                    {
                    // InternalKEffects.g:2262:6: ( ( '--' ) )
                    // InternalKEffects.g:2263:1: ( '--' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPostfixOperatorAccess().getPOSTFIXSUBEnumLiteralDeclaration_1()); 
                    }
                    // InternalKEffects.g:2264:1: ( '--' )
                    // InternalKEffects.g:2264:3: '--'
                    {
                    match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPostfixOperatorAccess().getPOSTFIXSUBEnumLiteralDeclaration_1()); 
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
    // $ANTLR end "rule__PostfixOperator__Alternatives"


    // $ANTLR start "rule__CompareOperator__Alternatives"
    // InternalKEffects.g:2274:1: rule__CompareOperator__Alternatives : ( ( ( '==' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '!=' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2278:1: ( ( ( '==' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '!=' ) ) )
            int alt18=6;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt18=1;
                }
                break;
            case 37:
                {
                alt18=2;
                }
                break;
            case 38:
                {
                alt18=3;
                }
                break;
            case 39:
                {
                alt18=4;
                }
                break;
            case 40:
                {
                alt18=5;
                }
                break;
            case 41:
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
                    // InternalKEffects.g:2279:1: ( ( '==' ) )
                    {
                    // InternalKEffects.g:2279:1: ( ( '==' ) )
                    // InternalKEffects.g:2280:1: ( '==' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // InternalKEffects.g:2281:1: ( '==' )
                    // InternalKEffects.g:2281:3: '=='
                    {
                    match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKEffects.g:2286:6: ( ( '<' ) )
                    {
                    // InternalKEffects.g:2286:6: ( ( '<' ) )
                    // InternalKEffects.g:2287:1: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }
                    // InternalKEffects.g:2288:1: ( '<' )
                    // InternalKEffects.g:2288:3: '<'
                    {
                    match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKEffects.g:2293:6: ( ( '<=' ) )
                    {
                    // InternalKEffects.g:2293:6: ( ( '<=' ) )
                    // InternalKEffects.g:2294:1: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }
                    // InternalKEffects.g:2295:1: ( '<=' )
                    // InternalKEffects.g:2295:3: '<='
                    {
                    match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKEffects.g:2300:6: ( ( '>' ) )
                    {
                    // InternalKEffects.g:2300:6: ( ( '>' ) )
                    // InternalKEffects.g:2301:1: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }
                    // InternalKEffects.g:2302:1: ( '>' )
                    // InternalKEffects.g:2302:3: '>'
                    {
                    match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKEffects.g:2307:6: ( ( '>=' ) )
                    {
                    // InternalKEffects.g:2307:6: ( ( '>=' ) )
                    // InternalKEffects.g:2308:1: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }
                    // InternalKEffects.g:2309:1: ( '>=' )
                    // InternalKEffects.g:2309:3: '>='
                    {
                    match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKEffects.g:2314:6: ( ( '!=' ) )
                    {
                    // InternalKEffects.g:2314:6: ( ( '!=' ) )
                    // InternalKEffects.g:2315:1: ( '!=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_5()); 
                    }
                    // InternalKEffects.g:2316:1: ( '!=' )
                    // InternalKEffects.g:2316:3: '!='
                    {
                    match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return ;

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


    // $ANTLR start "rule__Emission__Group__0"
    // InternalKEffects.g:2330:1: rule__Emission__Group__0 : rule__Emission__Group__0__Impl rule__Emission__Group__1 ;
    public final void rule__Emission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2334:1: ( rule__Emission__Group__0__Impl rule__Emission__Group__1 )
            // InternalKEffects.g:2335:2: rule__Emission__Group__0__Impl rule__Emission__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Emission__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Emission__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Emission__Group__0"


    // $ANTLR start "rule__Emission__Group__0__Impl"
    // InternalKEffects.g:2342:1: rule__Emission__Group__0__Impl : ( ( rule__Emission__AnnotationsAssignment_0 )* ) ;
    public final void rule__Emission__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2346:1: ( ( ( rule__Emission__AnnotationsAssignment_0 )* ) )
            // InternalKEffects.g:2347:1: ( ( rule__Emission__AnnotationsAssignment_0 )* )
            {
            // InternalKEffects.g:2347:1: ( ( rule__Emission__AnnotationsAssignment_0 )* )
            // InternalKEffects.g:2348:1: ( rule__Emission__AnnotationsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getAnnotationsAssignment_0()); 
            }
            // InternalKEffects.g:2349:1: ( rule__Emission__AnnotationsAssignment_0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_COMMENT_ANNOTATION||LA19_0==47) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalKEffects.g:2349:2: rule__Emission__AnnotationsAssignment_0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    rule__Emission__AnnotationsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getAnnotationsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Emission__Group__0__Impl"


    // $ANTLR start "rule__Emission__Group__1"
    // InternalKEffects.g:2359:1: rule__Emission__Group__1 : rule__Emission__Group__1__Impl rule__Emission__Group__2 ;
    public final void rule__Emission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2363:1: ( rule__Emission__Group__1__Impl rule__Emission__Group__2 )
            // InternalKEffects.g:2364:2: rule__Emission__Group__1__Impl rule__Emission__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Emission__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Emission__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Emission__Group__1"


    // $ANTLR start "rule__Emission__Group__1__Impl"
    // InternalKEffects.g:2371:1: rule__Emission__Group__1__Impl : ( ( rule__Emission__ValuedObjectAssignment_1 ) ) ;
    public final void rule__Emission__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2375:1: ( ( ( rule__Emission__ValuedObjectAssignment_1 ) ) )
            // InternalKEffects.g:2376:1: ( ( rule__Emission__ValuedObjectAssignment_1 ) )
            {
            // InternalKEffects.g:2376:1: ( ( rule__Emission__ValuedObjectAssignment_1 ) )
            // InternalKEffects.g:2377:1: ( rule__Emission__ValuedObjectAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getValuedObjectAssignment_1()); 
            }
            // InternalKEffects.g:2378:1: ( rule__Emission__ValuedObjectAssignment_1 )
            // InternalKEffects.g:2378:2: rule__Emission__ValuedObjectAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Emission__ValuedObjectAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getValuedObjectAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Emission__Group__1__Impl"


    // $ANTLR start "rule__Emission__Group__2"
    // InternalKEffects.g:2388:1: rule__Emission__Group__2 : rule__Emission__Group__2__Impl ;
    public final void rule__Emission__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2392:1: ( rule__Emission__Group__2__Impl )
            // InternalKEffects.g:2393:2: rule__Emission__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Emission__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Emission__Group__2"


    // $ANTLR start "rule__Emission__Group__2__Impl"
    // InternalKEffects.g:2399:1: rule__Emission__Group__2__Impl : ( ( rule__Emission__Group_2__0 )? ) ;
    public final void rule__Emission__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2403:1: ( ( ( rule__Emission__Group_2__0 )? ) )
            // InternalKEffects.g:2404:1: ( ( rule__Emission__Group_2__0 )? )
            {
            // InternalKEffects.g:2404:1: ( ( rule__Emission__Group_2__0 )? )
            // InternalKEffects.g:2405:1: ( rule__Emission__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getGroup_2()); 
            }
            // InternalKEffects.g:2406:1: ( rule__Emission__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==42) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalKEffects.g:2406:2: rule__Emission__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Emission__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Emission__Group__2__Impl"


    // $ANTLR start "rule__Emission__Group_2__0"
    // InternalKEffects.g:2422:1: rule__Emission__Group_2__0 : rule__Emission__Group_2__0__Impl rule__Emission__Group_2__1 ;
    public final void rule__Emission__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2426:1: ( rule__Emission__Group_2__0__Impl rule__Emission__Group_2__1 )
            // InternalKEffects.g:2427:2: rule__Emission__Group_2__0__Impl rule__Emission__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__Emission__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Emission__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Emission__Group_2__0"


    // $ANTLR start "rule__Emission__Group_2__0__Impl"
    // InternalKEffects.g:2434:1: rule__Emission__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Emission__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2438:1: ( ( '(' ) )
            // InternalKEffects.g:2439:1: ( '(' )
            {
            // InternalKEffects.g:2439:1: ( '(' )
            // InternalKEffects.g:2440:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Emission__Group_2__0__Impl"


    // $ANTLR start "rule__Emission__Group_2__1"
    // InternalKEffects.g:2453:1: rule__Emission__Group_2__1 : rule__Emission__Group_2__1__Impl rule__Emission__Group_2__2 ;
    public final void rule__Emission__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2457:1: ( rule__Emission__Group_2__1__Impl rule__Emission__Group_2__2 )
            // InternalKEffects.g:2458:2: rule__Emission__Group_2__1__Impl rule__Emission__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__Emission__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Emission__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Emission__Group_2__1"


    // $ANTLR start "rule__Emission__Group_2__1__Impl"
    // InternalKEffects.g:2465:1: rule__Emission__Group_2__1__Impl : ( ( rule__Emission__NewValueAssignment_2_1 ) ) ;
    public final void rule__Emission__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2469:1: ( ( ( rule__Emission__NewValueAssignment_2_1 ) ) )
            // InternalKEffects.g:2470:1: ( ( rule__Emission__NewValueAssignment_2_1 ) )
            {
            // InternalKEffects.g:2470:1: ( ( rule__Emission__NewValueAssignment_2_1 ) )
            // InternalKEffects.g:2471:1: ( rule__Emission__NewValueAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getNewValueAssignment_2_1()); 
            }
            // InternalKEffects.g:2472:1: ( rule__Emission__NewValueAssignment_2_1 )
            // InternalKEffects.g:2472:2: rule__Emission__NewValueAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Emission__NewValueAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getNewValueAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Emission__Group_2__1__Impl"


    // $ANTLR start "rule__Emission__Group_2__2"
    // InternalKEffects.g:2482:1: rule__Emission__Group_2__2 : rule__Emission__Group_2__2__Impl ;
    public final void rule__Emission__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2486:1: ( rule__Emission__Group_2__2__Impl )
            // InternalKEffects.g:2487:2: rule__Emission__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Emission__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Emission__Group_2__2"


    // $ANTLR start "rule__Emission__Group_2__2__Impl"
    // InternalKEffects.g:2493:1: rule__Emission__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Emission__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2497:1: ( ( ')' ) )
            // InternalKEffects.g:2498:1: ( ')' )
            {
            // InternalKEffects.g:2498:1: ( ')' )
            // InternalKEffects.g:2499:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getRightParenthesisKeyword_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Emission__Group_2__2__Impl"


    // $ANTLR start "rule__Assignment__Group__0"
    // InternalKEffects.g:2518:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2522:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalKEffects.g:2523:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Assignment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0"


    // $ANTLR start "rule__Assignment__Group__0__Impl"
    // InternalKEffects.g:2530:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__AnnotationsAssignment_0 )* ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2534:1: ( ( ( rule__Assignment__AnnotationsAssignment_0 )* ) )
            // InternalKEffects.g:2535:1: ( ( rule__Assignment__AnnotationsAssignment_0 )* )
            {
            // InternalKEffects.g:2535:1: ( ( rule__Assignment__AnnotationsAssignment_0 )* )
            // InternalKEffects.g:2536:1: ( rule__Assignment__AnnotationsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getAnnotationsAssignment_0()); 
            }
            // InternalKEffects.g:2537:1: ( rule__Assignment__AnnotationsAssignment_0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_COMMENT_ANNOTATION||LA21_0==47) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalKEffects.g:2537:2: rule__Assignment__AnnotationsAssignment_0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    rule__Assignment__AnnotationsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getAnnotationsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0__Impl"


    // $ANTLR start "rule__Assignment__Group__1"
    // InternalKEffects.g:2547:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2551:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalKEffects.g:2552:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__Assignment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1"


    // $ANTLR start "rule__Assignment__Group__1__Impl"
    // InternalKEffects.g:2559:1: rule__Assignment__Group__1__Impl : ( ( rule__Assignment__ValuedObjectAssignment_1 ) ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2563:1: ( ( ( rule__Assignment__ValuedObjectAssignment_1 ) ) )
            // InternalKEffects.g:2564:1: ( ( rule__Assignment__ValuedObjectAssignment_1 ) )
            {
            // InternalKEffects.g:2564:1: ( ( rule__Assignment__ValuedObjectAssignment_1 ) )
            // InternalKEffects.g:2565:1: ( rule__Assignment__ValuedObjectAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValuedObjectAssignment_1()); 
            }
            // InternalKEffects.g:2566:1: ( rule__Assignment__ValuedObjectAssignment_1 )
            // InternalKEffects.g:2566:2: rule__Assignment__ValuedObjectAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__ValuedObjectAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getValuedObjectAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__2"
    // InternalKEffects.g:2576:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl rule__Assignment__Group__3 ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2580:1: ( rule__Assignment__Group__2__Impl rule__Assignment__Group__3 )
            // InternalKEffects.g:2581:2: rule__Assignment__Group__2__Impl rule__Assignment__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__Assignment__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2"


    // $ANTLR start "rule__Assignment__Group__2__Impl"
    // InternalKEffects.g:2588:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__Group_2__0 )* ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2592:1: ( ( ( rule__Assignment__Group_2__0 )* ) )
            // InternalKEffects.g:2593:1: ( ( rule__Assignment__Group_2__0 )* )
            {
            // InternalKEffects.g:2593:1: ( ( rule__Assignment__Group_2__0 )* )
            // InternalKEffects.g:2594:1: ( rule__Assignment__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup_2()); 
            }
            // InternalKEffects.g:2595:1: ( rule__Assignment__Group_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==44) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalKEffects.g:2595:2: rule__Assignment__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    rule__Assignment__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2__Impl"


    // $ANTLR start "rule__Assignment__Group__3"
    // InternalKEffects.g:2605:1: rule__Assignment__Group__3 : rule__Assignment__Group__3__Impl rule__Assignment__Group__4 ;
    public final void rule__Assignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2609:1: ( rule__Assignment__Group__3__Impl rule__Assignment__Group__4 )
            // InternalKEffects.g:2610:2: rule__Assignment__Group__3__Impl rule__Assignment__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__Assignment__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__3"


    // $ANTLR start "rule__Assignment__Group__3__Impl"
    // InternalKEffects.g:2617:1: rule__Assignment__Group__3__Impl : ( ( rule__Assignment__OperatorAssignment_3 ) ) ;
    public final void rule__Assignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2621:1: ( ( ( rule__Assignment__OperatorAssignment_3 ) ) )
            // InternalKEffects.g:2622:1: ( ( rule__Assignment__OperatorAssignment_3 ) )
            {
            // InternalKEffects.g:2622:1: ( ( rule__Assignment__OperatorAssignment_3 ) )
            // InternalKEffects.g:2623:1: ( rule__Assignment__OperatorAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getOperatorAssignment_3()); 
            }
            // InternalKEffects.g:2624:1: ( rule__Assignment__OperatorAssignment_3 )
            // InternalKEffects.g:2624:2: rule__Assignment__OperatorAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__OperatorAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getOperatorAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__3__Impl"


    // $ANTLR start "rule__Assignment__Group__4"
    // InternalKEffects.g:2634:1: rule__Assignment__Group__4 : rule__Assignment__Group__4__Impl ;
    public final void rule__Assignment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2638:1: ( rule__Assignment__Group__4__Impl )
            // InternalKEffects.g:2639:2: rule__Assignment__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__4"


    // $ANTLR start "rule__Assignment__Group__4__Impl"
    // InternalKEffects.g:2645:1: rule__Assignment__Group__4__Impl : ( ( rule__Assignment__ExpressionAssignment_4 ) ) ;
    public final void rule__Assignment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2649:1: ( ( ( rule__Assignment__ExpressionAssignment_4 ) ) )
            // InternalKEffects.g:2650:1: ( ( rule__Assignment__ExpressionAssignment_4 ) )
            {
            // InternalKEffects.g:2650:1: ( ( rule__Assignment__ExpressionAssignment_4 ) )
            // InternalKEffects.g:2651:1: ( rule__Assignment__ExpressionAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getExpressionAssignment_4()); 
            }
            // InternalKEffects.g:2652:1: ( rule__Assignment__ExpressionAssignment_4 )
            // InternalKEffects.g:2652:2: rule__Assignment__ExpressionAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__ExpressionAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getExpressionAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__4__Impl"


    // $ANTLR start "rule__Assignment__Group_2__0"
    // InternalKEffects.g:2672:1: rule__Assignment__Group_2__0 : rule__Assignment__Group_2__0__Impl rule__Assignment__Group_2__1 ;
    public final void rule__Assignment__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2676:1: ( rule__Assignment__Group_2__0__Impl rule__Assignment__Group_2__1 )
            // InternalKEffects.g:2677:2: rule__Assignment__Group_2__0__Impl rule__Assignment__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__Assignment__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_2__0"


    // $ANTLR start "rule__Assignment__Group_2__0__Impl"
    // InternalKEffects.g:2684:1: rule__Assignment__Group_2__0__Impl : ( '[' ) ;
    public final void rule__Assignment__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2688:1: ( ( '[' ) )
            // InternalKEffects.g:2689:1: ( '[' )
            {
            // InternalKEffects.g:2689:1: ( '[' )
            // InternalKEffects.g:2690:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getLeftSquareBracketKeyword_2_0()); 
            }
            match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getLeftSquareBracketKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_2__0__Impl"


    // $ANTLR start "rule__Assignment__Group_2__1"
    // InternalKEffects.g:2703:1: rule__Assignment__Group_2__1 : rule__Assignment__Group_2__1__Impl rule__Assignment__Group_2__2 ;
    public final void rule__Assignment__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2707:1: ( rule__Assignment__Group_2__1__Impl rule__Assignment__Group_2__2 )
            // InternalKEffects.g:2708:2: rule__Assignment__Group_2__1__Impl rule__Assignment__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__Assignment__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_2__1"


    // $ANTLR start "rule__Assignment__Group_2__1__Impl"
    // InternalKEffects.g:2715:1: rule__Assignment__Group_2__1__Impl : ( ( rule__Assignment__IndicesAssignment_2_1 ) ) ;
    public final void rule__Assignment__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2719:1: ( ( ( rule__Assignment__IndicesAssignment_2_1 ) ) )
            // InternalKEffects.g:2720:1: ( ( rule__Assignment__IndicesAssignment_2_1 ) )
            {
            // InternalKEffects.g:2720:1: ( ( rule__Assignment__IndicesAssignment_2_1 ) )
            // InternalKEffects.g:2721:1: ( rule__Assignment__IndicesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getIndicesAssignment_2_1()); 
            }
            // InternalKEffects.g:2722:1: ( rule__Assignment__IndicesAssignment_2_1 )
            // InternalKEffects.g:2722:2: rule__Assignment__IndicesAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__IndicesAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getIndicesAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_2__1__Impl"


    // $ANTLR start "rule__Assignment__Group_2__2"
    // InternalKEffects.g:2732:1: rule__Assignment__Group_2__2 : rule__Assignment__Group_2__2__Impl ;
    public final void rule__Assignment__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2736:1: ( rule__Assignment__Group_2__2__Impl )
            // InternalKEffects.g:2737:2: rule__Assignment__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_2__2"


    // $ANTLR start "rule__Assignment__Group_2__2__Impl"
    // InternalKEffects.g:2743:1: rule__Assignment__Group_2__2__Impl : ( ']' ) ;
    public final void rule__Assignment__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2747:1: ( ( ']' ) )
            // InternalKEffects.g:2748:1: ( ']' )
            {
            // InternalKEffects.g:2748:1: ( ']' )
            // InternalKEffects.g:2749:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getRightSquareBracketKeyword_2_2()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getRightSquareBracketKeyword_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_2__2__Impl"


    // $ANTLR start "rule__PostfixEffect__Group__0"
    // InternalKEffects.g:2768:1: rule__PostfixEffect__Group__0 : rule__PostfixEffect__Group__0__Impl rule__PostfixEffect__Group__1 ;
    public final void rule__PostfixEffect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2772:1: ( rule__PostfixEffect__Group__0__Impl rule__PostfixEffect__Group__1 )
            // InternalKEffects.g:2773:2: rule__PostfixEffect__Group__0__Impl rule__PostfixEffect__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__PostfixEffect__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PostfixEffect__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostfixEffect__Group__0"


    // $ANTLR start "rule__PostfixEffect__Group__0__Impl"
    // InternalKEffects.g:2780:1: rule__PostfixEffect__Group__0__Impl : ( ( rule__PostfixEffect__AnnotationsAssignment_0 )* ) ;
    public final void rule__PostfixEffect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2784:1: ( ( ( rule__PostfixEffect__AnnotationsAssignment_0 )* ) )
            // InternalKEffects.g:2785:1: ( ( rule__PostfixEffect__AnnotationsAssignment_0 )* )
            {
            // InternalKEffects.g:2785:1: ( ( rule__PostfixEffect__AnnotationsAssignment_0 )* )
            // InternalKEffects.g:2786:1: ( rule__PostfixEffect__AnnotationsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPostfixEffectAccess().getAnnotationsAssignment_0()); 
            }
            // InternalKEffects.g:2787:1: ( rule__PostfixEffect__AnnotationsAssignment_0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_COMMENT_ANNOTATION||LA23_0==47) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalKEffects.g:2787:2: rule__PostfixEffect__AnnotationsAssignment_0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    rule__PostfixEffect__AnnotationsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPostfixEffectAccess().getAnnotationsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostfixEffect__Group__0__Impl"


    // $ANTLR start "rule__PostfixEffect__Group__1"
    // InternalKEffects.g:2797:1: rule__PostfixEffect__Group__1 : rule__PostfixEffect__Group__1__Impl rule__PostfixEffect__Group__2 ;
    public final void rule__PostfixEffect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2801:1: ( rule__PostfixEffect__Group__1__Impl rule__PostfixEffect__Group__2 )
            // InternalKEffects.g:2802:2: rule__PostfixEffect__Group__1__Impl rule__PostfixEffect__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__PostfixEffect__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PostfixEffect__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostfixEffect__Group__1"


    // $ANTLR start "rule__PostfixEffect__Group__1__Impl"
    // InternalKEffects.g:2809:1: rule__PostfixEffect__Group__1__Impl : ( ( rule__PostfixEffect__ValuedObjectAssignment_1 ) ) ;
    public final void rule__PostfixEffect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2813:1: ( ( ( rule__PostfixEffect__ValuedObjectAssignment_1 ) ) )
            // InternalKEffects.g:2814:1: ( ( rule__PostfixEffect__ValuedObjectAssignment_1 ) )
            {
            // InternalKEffects.g:2814:1: ( ( rule__PostfixEffect__ValuedObjectAssignment_1 ) )
            // InternalKEffects.g:2815:1: ( rule__PostfixEffect__ValuedObjectAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPostfixEffectAccess().getValuedObjectAssignment_1()); 
            }
            // InternalKEffects.g:2816:1: ( rule__PostfixEffect__ValuedObjectAssignment_1 )
            // InternalKEffects.g:2816:2: rule__PostfixEffect__ValuedObjectAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PostfixEffect__ValuedObjectAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPostfixEffectAccess().getValuedObjectAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostfixEffect__Group__1__Impl"


    // $ANTLR start "rule__PostfixEffect__Group__2"
    // InternalKEffects.g:2826:1: rule__PostfixEffect__Group__2 : rule__PostfixEffect__Group__2__Impl rule__PostfixEffect__Group__3 ;
    public final void rule__PostfixEffect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2830:1: ( rule__PostfixEffect__Group__2__Impl rule__PostfixEffect__Group__3 )
            // InternalKEffects.g:2831:2: rule__PostfixEffect__Group__2__Impl rule__PostfixEffect__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__PostfixEffect__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PostfixEffect__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostfixEffect__Group__2"


    // $ANTLR start "rule__PostfixEffect__Group__2__Impl"
    // InternalKEffects.g:2838:1: rule__PostfixEffect__Group__2__Impl : ( ( rule__PostfixEffect__Group_2__0 )* ) ;
    public final void rule__PostfixEffect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2842:1: ( ( ( rule__PostfixEffect__Group_2__0 )* ) )
            // InternalKEffects.g:2843:1: ( ( rule__PostfixEffect__Group_2__0 )* )
            {
            // InternalKEffects.g:2843:1: ( ( rule__PostfixEffect__Group_2__0 )* )
            // InternalKEffects.g:2844:1: ( rule__PostfixEffect__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPostfixEffectAccess().getGroup_2()); 
            }
            // InternalKEffects.g:2845:1: ( rule__PostfixEffect__Group_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==44) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalKEffects.g:2845:2: rule__PostfixEffect__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    rule__PostfixEffect__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPostfixEffectAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostfixEffect__Group__2__Impl"


    // $ANTLR start "rule__PostfixEffect__Group__3"
    // InternalKEffects.g:2855:1: rule__PostfixEffect__Group__3 : rule__PostfixEffect__Group__3__Impl ;
    public final void rule__PostfixEffect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2859:1: ( rule__PostfixEffect__Group__3__Impl )
            // InternalKEffects.g:2860:2: rule__PostfixEffect__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PostfixEffect__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostfixEffect__Group__3"


    // $ANTLR start "rule__PostfixEffect__Group__3__Impl"
    // InternalKEffects.g:2866:1: rule__PostfixEffect__Group__3__Impl : ( ( rule__PostfixEffect__OperatorAssignment_3 ) ) ;
    public final void rule__PostfixEffect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2870:1: ( ( ( rule__PostfixEffect__OperatorAssignment_3 ) ) )
            // InternalKEffects.g:2871:1: ( ( rule__PostfixEffect__OperatorAssignment_3 ) )
            {
            // InternalKEffects.g:2871:1: ( ( rule__PostfixEffect__OperatorAssignment_3 ) )
            // InternalKEffects.g:2872:1: ( rule__PostfixEffect__OperatorAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPostfixEffectAccess().getOperatorAssignment_3()); 
            }
            // InternalKEffects.g:2873:1: ( rule__PostfixEffect__OperatorAssignment_3 )
            // InternalKEffects.g:2873:2: rule__PostfixEffect__OperatorAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PostfixEffect__OperatorAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPostfixEffectAccess().getOperatorAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostfixEffect__Group__3__Impl"


    // $ANTLR start "rule__PostfixEffect__Group_2__0"
    // InternalKEffects.g:2891:1: rule__PostfixEffect__Group_2__0 : rule__PostfixEffect__Group_2__0__Impl rule__PostfixEffect__Group_2__1 ;
    public final void rule__PostfixEffect__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2895:1: ( rule__PostfixEffect__Group_2__0__Impl rule__PostfixEffect__Group_2__1 )
            // InternalKEffects.g:2896:2: rule__PostfixEffect__Group_2__0__Impl rule__PostfixEffect__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__PostfixEffect__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PostfixEffect__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostfixEffect__Group_2__0"


    // $ANTLR start "rule__PostfixEffect__Group_2__0__Impl"
    // InternalKEffects.g:2903:1: rule__PostfixEffect__Group_2__0__Impl : ( '[' ) ;
    public final void rule__PostfixEffect__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2907:1: ( ( '[' ) )
            // InternalKEffects.g:2908:1: ( '[' )
            {
            // InternalKEffects.g:2908:1: ( '[' )
            // InternalKEffects.g:2909:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPostfixEffectAccess().getLeftSquareBracketKeyword_2_0()); 
            }
            match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPostfixEffectAccess().getLeftSquareBracketKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostfixEffect__Group_2__0__Impl"


    // $ANTLR start "rule__PostfixEffect__Group_2__1"
    // InternalKEffects.g:2922:1: rule__PostfixEffect__Group_2__1 : rule__PostfixEffect__Group_2__1__Impl rule__PostfixEffect__Group_2__2 ;
    public final void rule__PostfixEffect__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2926:1: ( rule__PostfixEffect__Group_2__1__Impl rule__PostfixEffect__Group_2__2 )
            // InternalKEffects.g:2927:2: rule__PostfixEffect__Group_2__1__Impl rule__PostfixEffect__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__PostfixEffect__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PostfixEffect__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostfixEffect__Group_2__1"


    // $ANTLR start "rule__PostfixEffect__Group_2__1__Impl"
    // InternalKEffects.g:2934:1: rule__PostfixEffect__Group_2__1__Impl : ( ( rule__PostfixEffect__IndicesAssignment_2_1 ) ) ;
    public final void rule__PostfixEffect__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2938:1: ( ( ( rule__PostfixEffect__IndicesAssignment_2_1 ) ) )
            // InternalKEffects.g:2939:1: ( ( rule__PostfixEffect__IndicesAssignment_2_1 ) )
            {
            // InternalKEffects.g:2939:1: ( ( rule__PostfixEffect__IndicesAssignment_2_1 ) )
            // InternalKEffects.g:2940:1: ( rule__PostfixEffect__IndicesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPostfixEffectAccess().getIndicesAssignment_2_1()); 
            }
            // InternalKEffects.g:2941:1: ( rule__PostfixEffect__IndicesAssignment_2_1 )
            // InternalKEffects.g:2941:2: rule__PostfixEffect__IndicesAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PostfixEffect__IndicesAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPostfixEffectAccess().getIndicesAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostfixEffect__Group_2__1__Impl"


    // $ANTLR start "rule__PostfixEffect__Group_2__2"
    // InternalKEffects.g:2951:1: rule__PostfixEffect__Group_2__2 : rule__PostfixEffect__Group_2__2__Impl ;
    public final void rule__PostfixEffect__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2955:1: ( rule__PostfixEffect__Group_2__2__Impl )
            // InternalKEffects.g:2956:2: rule__PostfixEffect__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PostfixEffect__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostfixEffect__Group_2__2"


    // $ANTLR start "rule__PostfixEffect__Group_2__2__Impl"
    // InternalKEffects.g:2962:1: rule__PostfixEffect__Group_2__2__Impl : ( ']' ) ;
    public final void rule__PostfixEffect__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2966:1: ( ( ']' ) )
            // InternalKEffects.g:2967:1: ( ']' )
            {
            // InternalKEffects.g:2967:1: ( ']' )
            // InternalKEffects.g:2968:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPostfixEffectAccess().getRightSquareBracketKeyword_2_2()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPostfixEffectAccess().getRightSquareBracketKeyword_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostfixEffect__Group_2__2__Impl"


    // $ANTLR start "rule__HostcodeEffect__Group__0"
    // InternalKEffects.g:2987:1: rule__HostcodeEffect__Group__0 : rule__HostcodeEffect__Group__0__Impl rule__HostcodeEffect__Group__1 ;
    public final void rule__HostcodeEffect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2991:1: ( rule__HostcodeEffect__Group__0__Impl rule__HostcodeEffect__Group__1 )
            // InternalKEffects.g:2992:2: rule__HostcodeEffect__Group__0__Impl rule__HostcodeEffect__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__HostcodeEffect__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__HostcodeEffect__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HostcodeEffect__Group__0"


    // $ANTLR start "rule__HostcodeEffect__Group__0__Impl"
    // InternalKEffects.g:2999:1: rule__HostcodeEffect__Group__0__Impl : ( ( rule__HostcodeEffect__AnnotationsAssignment_0 )* ) ;
    public final void rule__HostcodeEffect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3003:1: ( ( ( rule__HostcodeEffect__AnnotationsAssignment_0 )* ) )
            // InternalKEffects.g:3004:1: ( ( rule__HostcodeEffect__AnnotationsAssignment_0 )* )
            {
            // InternalKEffects.g:3004:1: ( ( rule__HostcodeEffect__AnnotationsAssignment_0 )* )
            // InternalKEffects.g:3005:1: ( rule__HostcodeEffect__AnnotationsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHostcodeEffectAccess().getAnnotationsAssignment_0()); 
            }
            // InternalKEffects.g:3006:1: ( rule__HostcodeEffect__AnnotationsAssignment_0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_COMMENT_ANNOTATION||LA25_0==47) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalKEffects.g:3006:2: rule__HostcodeEffect__AnnotationsAssignment_0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    rule__HostcodeEffect__AnnotationsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHostcodeEffectAccess().getAnnotationsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HostcodeEffect__Group__0__Impl"


    // $ANTLR start "rule__HostcodeEffect__Group__1"
    // InternalKEffects.g:3016:1: rule__HostcodeEffect__Group__1 : rule__HostcodeEffect__Group__1__Impl ;
    public final void rule__HostcodeEffect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3020:1: ( rule__HostcodeEffect__Group__1__Impl )
            // InternalKEffects.g:3021:2: rule__HostcodeEffect__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__HostcodeEffect__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HostcodeEffect__Group__1"


    // $ANTLR start "rule__HostcodeEffect__Group__1__Impl"
    // InternalKEffects.g:3027:1: rule__HostcodeEffect__Group__1__Impl : ( ( rule__HostcodeEffect__TextAssignment_1 ) ) ;
    public final void rule__HostcodeEffect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3031:1: ( ( ( rule__HostcodeEffect__TextAssignment_1 ) ) )
            // InternalKEffects.g:3032:1: ( ( rule__HostcodeEffect__TextAssignment_1 ) )
            {
            // InternalKEffects.g:3032:1: ( ( rule__HostcodeEffect__TextAssignment_1 ) )
            // InternalKEffects.g:3033:1: ( rule__HostcodeEffect__TextAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHostcodeEffectAccess().getTextAssignment_1()); 
            }
            // InternalKEffects.g:3034:1: ( rule__HostcodeEffect__TextAssignment_1 )
            // InternalKEffects.g:3034:2: rule__HostcodeEffect__TextAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__HostcodeEffect__TextAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHostcodeEffectAccess().getTextAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HostcodeEffect__Group__1__Impl"


    // $ANTLR start "rule__FunctionCallEffect__Group__0"
    // InternalKEffects.g:3048:1: rule__FunctionCallEffect__Group__0 : rule__FunctionCallEffect__Group__0__Impl rule__FunctionCallEffect__Group__1 ;
    public final void rule__FunctionCallEffect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3052:1: ( rule__FunctionCallEffect__Group__0__Impl rule__FunctionCallEffect__Group__1 )
            // InternalKEffects.g:3053:2: rule__FunctionCallEffect__Group__0__Impl rule__FunctionCallEffect__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__FunctionCallEffect__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCallEffect__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallEffect__Group__0"


    // $ANTLR start "rule__FunctionCallEffect__Group__0__Impl"
    // InternalKEffects.g:3060:1: rule__FunctionCallEffect__Group__0__Impl : ( ( rule__FunctionCallEffect__AnnotationsAssignment_0 )* ) ;
    public final void rule__FunctionCallEffect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3064:1: ( ( ( rule__FunctionCallEffect__AnnotationsAssignment_0 )* ) )
            // InternalKEffects.g:3065:1: ( ( rule__FunctionCallEffect__AnnotationsAssignment_0 )* )
            {
            // InternalKEffects.g:3065:1: ( ( rule__FunctionCallEffect__AnnotationsAssignment_0 )* )
            // InternalKEffects.g:3066:1: ( rule__FunctionCallEffect__AnnotationsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallEffectAccess().getAnnotationsAssignment_0()); 
            }
            // InternalKEffects.g:3067:1: ( rule__FunctionCallEffect__AnnotationsAssignment_0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_COMMENT_ANNOTATION||LA26_0==47) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalKEffects.g:3067:2: rule__FunctionCallEffect__AnnotationsAssignment_0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    rule__FunctionCallEffect__AnnotationsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallEffectAccess().getAnnotationsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallEffect__Group__0__Impl"


    // $ANTLR start "rule__FunctionCallEffect__Group__1"
    // InternalKEffects.g:3077:1: rule__FunctionCallEffect__Group__1 : rule__FunctionCallEffect__Group__1__Impl rule__FunctionCallEffect__Group__2 ;
    public final void rule__FunctionCallEffect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3081:1: ( rule__FunctionCallEffect__Group__1__Impl rule__FunctionCallEffect__Group__2 )
            // InternalKEffects.g:3082:2: rule__FunctionCallEffect__Group__1__Impl rule__FunctionCallEffect__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__FunctionCallEffect__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCallEffect__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallEffect__Group__1"


    // $ANTLR start "rule__FunctionCallEffect__Group__1__Impl"
    // InternalKEffects.g:3089:1: rule__FunctionCallEffect__Group__1__Impl : ( '<' ) ;
    public final void rule__FunctionCallEffect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3093:1: ( ( '<' ) )
            // InternalKEffects.g:3094:1: ( '<' )
            {
            // InternalKEffects.g:3094:1: ( '<' )
            // InternalKEffects.g:3095:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallEffectAccess().getLessThanSignKeyword_1()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallEffectAccess().getLessThanSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallEffect__Group__1__Impl"


    // $ANTLR start "rule__FunctionCallEffect__Group__2"
    // InternalKEffects.g:3108:1: rule__FunctionCallEffect__Group__2 : rule__FunctionCallEffect__Group__2__Impl rule__FunctionCallEffect__Group__3 ;
    public final void rule__FunctionCallEffect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3112:1: ( rule__FunctionCallEffect__Group__2__Impl rule__FunctionCallEffect__Group__3 )
            // InternalKEffects.g:3113:2: rule__FunctionCallEffect__Group__2__Impl rule__FunctionCallEffect__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__FunctionCallEffect__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCallEffect__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallEffect__Group__2"


    // $ANTLR start "rule__FunctionCallEffect__Group__2__Impl"
    // InternalKEffects.g:3120:1: rule__FunctionCallEffect__Group__2__Impl : ( ( rule__FunctionCallEffect__FunctionNameAssignment_2 ) ) ;
    public final void rule__FunctionCallEffect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3124:1: ( ( ( rule__FunctionCallEffect__FunctionNameAssignment_2 ) ) )
            // InternalKEffects.g:3125:1: ( ( rule__FunctionCallEffect__FunctionNameAssignment_2 ) )
            {
            // InternalKEffects.g:3125:1: ( ( rule__FunctionCallEffect__FunctionNameAssignment_2 ) )
            // InternalKEffects.g:3126:1: ( rule__FunctionCallEffect__FunctionNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallEffectAccess().getFunctionNameAssignment_2()); 
            }
            // InternalKEffects.g:3127:1: ( rule__FunctionCallEffect__FunctionNameAssignment_2 )
            // InternalKEffects.g:3127:2: rule__FunctionCallEffect__FunctionNameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCallEffect__FunctionNameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallEffectAccess().getFunctionNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallEffect__Group__2__Impl"


    // $ANTLR start "rule__FunctionCallEffect__Group__3"
    // InternalKEffects.g:3137:1: rule__FunctionCallEffect__Group__3 : rule__FunctionCallEffect__Group__3__Impl rule__FunctionCallEffect__Group__4 ;
    public final void rule__FunctionCallEffect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3141:1: ( rule__FunctionCallEffect__Group__3__Impl rule__FunctionCallEffect__Group__4 )
            // InternalKEffects.g:3142:2: rule__FunctionCallEffect__Group__3__Impl rule__FunctionCallEffect__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__FunctionCallEffect__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCallEffect__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallEffect__Group__3"


    // $ANTLR start "rule__FunctionCallEffect__Group__3__Impl"
    // InternalKEffects.g:3149:1: rule__FunctionCallEffect__Group__3__Impl : ( ( rule__FunctionCallEffect__Alternatives_3 )? ) ;
    public final void rule__FunctionCallEffect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3153:1: ( ( ( rule__FunctionCallEffect__Alternatives_3 )? ) )
            // InternalKEffects.g:3154:1: ( ( rule__FunctionCallEffect__Alternatives_3 )? )
            {
            // InternalKEffects.g:3154:1: ( ( rule__FunctionCallEffect__Alternatives_3 )? )
            // InternalKEffects.g:3155:1: ( rule__FunctionCallEffect__Alternatives_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallEffectAccess().getAlternatives_3()); 
            }
            // InternalKEffects.g:3156:1: ( rule__FunctionCallEffect__Alternatives_3 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==28||LA27_0==42) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalKEffects.g:3156:2: rule__FunctionCallEffect__Alternatives_3
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__FunctionCallEffect__Alternatives_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallEffectAccess().getAlternatives_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallEffect__Group__3__Impl"


    // $ANTLR start "rule__FunctionCallEffect__Group__4"
    // InternalKEffects.g:3166:1: rule__FunctionCallEffect__Group__4 : rule__FunctionCallEffect__Group__4__Impl ;
    public final void rule__FunctionCallEffect__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3170:1: ( rule__FunctionCallEffect__Group__4__Impl )
            // InternalKEffects.g:3171:2: rule__FunctionCallEffect__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCallEffect__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallEffect__Group__4"


    // $ANTLR start "rule__FunctionCallEffect__Group__4__Impl"
    // InternalKEffects.g:3177:1: rule__FunctionCallEffect__Group__4__Impl : ( '>' ) ;
    public final void rule__FunctionCallEffect__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3181:1: ( ( '>' ) )
            // InternalKEffects.g:3182:1: ( '>' )
            {
            // InternalKEffects.g:3182:1: ( '>' )
            // InternalKEffects.g:3183:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallEffectAccess().getGreaterThanSignKeyword_4()); 
            }
            match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallEffectAccess().getGreaterThanSignKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallEffect__Group__4__Impl"


    // $ANTLR start "rule__FunctionCallEffect__Group_3_0__0"
    // InternalKEffects.g:3206:1: rule__FunctionCallEffect__Group_3_0__0 : rule__FunctionCallEffect__Group_3_0__0__Impl rule__FunctionCallEffect__Group_3_0__1 ;
    public final void rule__FunctionCallEffect__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3210:1: ( rule__FunctionCallEffect__Group_3_0__0__Impl rule__FunctionCallEffect__Group_3_0__1 )
            // InternalKEffects.g:3211:2: rule__FunctionCallEffect__Group_3_0__0__Impl rule__FunctionCallEffect__Group_3_0__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__FunctionCallEffect__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCallEffect__Group_3_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallEffect__Group_3_0__0"


    // $ANTLR start "rule__FunctionCallEffect__Group_3_0__0__Impl"
    // InternalKEffects.g:3218:1: rule__FunctionCallEffect__Group_3_0__0__Impl : ( '(' ) ;
    public final void rule__FunctionCallEffect__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3222:1: ( ( '(' ) )
            // InternalKEffects.g:3223:1: ( '(' )
            {
            // InternalKEffects.g:3223:1: ( '(' )
            // InternalKEffects.g:3224:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisKeyword_3_0_0()); 
            }
            match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisKeyword_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallEffect__Group_3_0__0__Impl"


    // $ANTLR start "rule__FunctionCallEffect__Group_3_0__1"
    // InternalKEffects.g:3237:1: rule__FunctionCallEffect__Group_3_0__1 : rule__FunctionCallEffect__Group_3_0__1__Impl rule__FunctionCallEffect__Group_3_0__2 ;
    public final void rule__FunctionCallEffect__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3241:1: ( rule__FunctionCallEffect__Group_3_0__1__Impl rule__FunctionCallEffect__Group_3_0__2 )
            // InternalKEffects.g:3242:2: rule__FunctionCallEffect__Group_3_0__1__Impl rule__FunctionCallEffect__Group_3_0__2
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__FunctionCallEffect__Group_3_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCallEffect__Group_3_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallEffect__Group_3_0__1"


    // $ANTLR start "rule__FunctionCallEffect__Group_3_0__1__Impl"
    // InternalKEffects.g:3249:1: rule__FunctionCallEffect__Group_3_0__1__Impl : ( ( rule__FunctionCallEffect__ParametersAssignment_3_0_1 ) ) ;
    public final void rule__FunctionCallEffect__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3253:1: ( ( ( rule__FunctionCallEffect__ParametersAssignment_3_0_1 ) ) )
            // InternalKEffects.g:3254:1: ( ( rule__FunctionCallEffect__ParametersAssignment_3_0_1 ) )
            {
            // InternalKEffects.g:3254:1: ( ( rule__FunctionCallEffect__ParametersAssignment_3_0_1 ) )
            // InternalKEffects.g:3255:1: ( rule__FunctionCallEffect__ParametersAssignment_3_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallEffectAccess().getParametersAssignment_3_0_1()); 
            }
            // InternalKEffects.g:3256:1: ( rule__FunctionCallEffect__ParametersAssignment_3_0_1 )
            // InternalKEffects.g:3256:2: rule__FunctionCallEffect__ParametersAssignment_3_0_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCallEffect__ParametersAssignment_3_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallEffectAccess().getParametersAssignment_3_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallEffect__Group_3_0__1__Impl"


    // $ANTLR start "rule__FunctionCallEffect__Group_3_0__2"
    // InternalKEffects.g:3266:1: rule__FunctionCallEffect__Group_3_0__2 : rule__FunctionCallEffect__Group_3_0__2__Impl rule__FunctionCallEffect__Group_3_0__3 ;
    public final void rule__FunctionCallEffect__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3270:1: ( rule__FunctionCallEffect__Group_3_0__2__Impl rule__FunctionCallEffect__Group_3_0__3 )
            // InternalKEffects.g:3271:2: rule__FunctionCallEffect__Group_3_0__2__Impl rule__FunctionCallEffect__Group_3_0__3
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__FunctionCallEffect__Group_3_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCallEffect__Group_3_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallEffect__Group_3_0__2"


    // $ANTLR start "rule__FunctionCallEffect__Group_3_0__2__Impl"
    // InternalKEffects.g:3278:1: rule__FunctionCallEffect__Group_3_0__2__Impl : ( ( rule__FunctionCallEffect__Group_3_0_2__0 )* ) ;
    public final void rule__FunctionCallEffect__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3282:1: ( ( ( rule__FunctionCallEffect__Group_3_0_2__0 )* ) )
            // InternalKEffects.g:3283:1: ( ( rule__FunctionCallEffect__Group_3_0_2__0 )* )
            {
            // InternalKEffects.g:3283:1: ( ( rule__FunctionCallEffect__Group_3_0_2__0 )* )
            // InternalKEffects.g:3284:1: ( rule__FunctionCallEffect__Group_3_0_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallEffectAccess().getGroup_3_0_2()); 
            }
            // InternalKEffects.g:3285:1: ( rule__FunctionCallEffect__Group_3_0_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==46) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalKEffects.g:3285:2: rule__FunctionCallEffect__Group_3_0_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_17);
            	    rule__FunctionCallEffect__Group_3_0_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallEffectAccess().getGroup_3_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallEffect__Group_3_0__2__Impl"


    // $ANTLR start "rule__FunctionCallEffect__Group_3_0__3"
    // InternalKEffects.g:3295:1: rule__FunctionCallEffect__Group_3_0__3 : rule__FunctionCallEffect__Group_3_0__3__Impl ;
    public final void rule__FunctionCallEffect__Group_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3299:1: ( rule__FunctionCallEffect__Group_3_0__3__Impl )
            // InternalKEffects.g:3300:2: rule__FunctionCallEffect__Group_3_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCallEffect__Group_3_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallEffect__Group_3_0__3"


    // $ANTLR start "rule__FunctionCallEffect__Group_3_0__3__Impl"
    // InternalKEffects.g:3306:1: rule__FunctionCallEffect__Group_3_0__3__Impl : ( ')' ) ;
    public final void rule__FunctionCallEffect__Group_3_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3310:1: ( ( ')' ) )
            // InternalKEffects.g:3311:1: ( ')' )
            {
            // InternalKEffects.g:3311:1: ( ')' )
            // InternalKEffects.g:3312:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallEffectAccess().getRightParenthesisKeyword_3_0_3()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallEffectAccess().getRightParenthesisKeyword_3_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallEffect__Group_3_0__3__Impl"


    // $ANTLR start "rule__FunctionCallEffect__Group_3_0_2__0"
    // InternalKEffects.g:3333:1: rule__FunctionCallEffect__Group_3_0_2__0 : rule__FunctionCallEffect__Group_3_0_2__0__Impl rule__FunctionCallEffect__Group_3_0_2__1 ;
    public final void rule__FunctionCallEffect__Group_3_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3337:1: ( rule__FunctionCallEffect__Group_3_0_2__0__Impl rule__FunctionCallEffect__Group_3_0_2__1 )
            // InternalKEffects.g:3338:2: rule__FunctionCallEffect__Group_3_0_2__0__Impl rule__FunctionCallEffect__Group_3_0_2__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__FunctionCallEffect__Group_3_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCallEffect__Group_3_0_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallEffect__Group_3_0_2__0"


    // $ANTLR start "rule__FunctionCallEffect__Group_3_0_2__0__Impl"
    // InternalKEffects.g:3345:1: rule__FunctionCallEffect__Group_3_0_2__0__Impl : ( ',' ) ;
    public final void rule__FunctionCallEffect__Group_3_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3349:1: ( ( ',' ) )
            // InternalKEffects.g:3350:1: ( ',' )
            {
            // InternalKEffects.g:3350:1: ( ',' )
            // InternalKEffects.g:3351:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallEffectAccess().getCommaKeyword_3_0_2_0()); 
            }
            match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallEffectAccess().getCommaKeyword_3_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallEffect__Group_3_0_2__0__Impl"


    // $ANTLR start "rule__FunctionCallEffect__Group_3_0_2__1"
    // InternalKEffects.g:3364:1: rule__FunctionCallEffect__Group_3_0_2__1 : rule__FunctionCallEffect__Group_3_0_2__1__Impl ;
    public final void rule__FunctionCallEffect__Group_3_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3368:1: ( rule__FunctionCallEffect__Group_3_0_2__1__Impl )
            // InternalKEffects.g:3369:2: rule__FunctionCallEffect__Group_3_0_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCallEffect__Group_3_0_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallEffect__Group_3_0_2__1"


    // $ANTLR start "rule__FunctionCallEffect__Group_3_0_2__1__Impl"
    // InternalKEffects.g:3375:1: rule__FunctionCallEffect__Group_3_0_2__1__Impl : ( ( rule__FunctionCallEffect__ParametersAssignment_3_0_2_1 ) ) ;
    public final void rule__FunctionCallEffect__Group_3_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3379:1: ( ( ( rule__FunctionCallEffect__ParametersAssignment_3_0_2_1 ) ) )
            // InternalKEffects.g:3380:1: ( ( rule__FunctionCallEffect__ParametersAssignment_3_0_2_1 ) )
            {
            // InternalKEffects.g:3380:1: ( ( rule__FunctionCallEffect__ParametersAssignment_3_0_2_1 ) )
            // InternalKEffects.g:3381:1: ( rule__FunctionCallEffect__ParametersAssignment_3_0_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallEffectAccess().getParametersAssignment_3_0_2_1()); 
            }
            // InternalKEffects.g:3382:1: ( rule__FunctionCallEffect__ParametersAssignment_3_0_2_1 )
            // InternalKEffects.g:3382:2: rule__FunctionCallEffect__ParametersAssignment_3_0_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionCallEffect__ParametersAssignment_3_0_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallEffectAccess().getParametersAssignment_3_0_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallEffect__Group_3_0_2__1__Impl"


    // $ANTLR start "rule__LogicalOrExpression__Group__0"
    // InternalKEffects.g:3396:1: rule__LogicalOrExpression__Group__0 : rule__LogicalOrExpression__Group__0__Impl rule__LogicalOrExpression__Group__1 ;
    public final void rule__LogicalOrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3400:1: ( rule__LogicalOrExpression__Group__0__Impl rule__LogicalOrExpression__Group__1 )
            // InternalKEffects.g:3401:2: rule__LogicalOrExpression__Group__0__Impl rule__LogicalOrExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_18);
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
    // InternalKEffects.g:3408:1: rule__LogicalOrExpression__Group__0__Impl : ( ruleLogicalAndExpression ) ;
    public final void rule__LogicalOrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3412:1: ( ( ruleLogicalAndExpression ) )
            // InternalKEffects.g:3413:1: ( ruleLogicalAndExpression )
            {
            // InternalKEffects.g:3413:1: ( ruleLogicalAndExpression )
            // InternalKEffects.g:3414:1: ruleLogicalAndExpression
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
    // InternalKEffects.g:3425:1: rule__LogicalOrExpression__Group__1 : rule__LogicalOrExpression__Group__1__Impl ;
    public final void rule__LogicalOrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3429:1: ( rule__LogicalOrExpression__Group__1__Impl )
            // InternalKEffects.g:3430:2: rule__LogicalOrExpression__Group__1__Impl
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
    // InternalKEffects.g:3436:1: rule__LogicalOrExpression__Group__1__Impl : ( ( rule__LogicalOrExpression__Group_1__0 )? ) ;
    public final void rule__LogicalOrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3440:1: ( ( ( rule__LogicalOrExpression__Group_1__0 )? ) )
            // InternalKEffects.g:3441:1: ( ( rule__LogicalOrExpression__Group_1__0 )? )
            {
            // InternalKEffects.g:3441:1: ( ( rule__LogicalOrExpression__Group_1__0 )? )
            // InternalKEffects.g:3442:1: ( rule__LogicalOrExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExpressionAccess().getGroup_1()); 
            }
            // InternalKEffects.g:3443:1: ( rule__LogicalOrExpression__Group_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==26) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalKEffects.g:3443:2: rule__LogicalOrExpression__Group_1__0
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
    // InternalKEffects.g:3457:1: rule__LogicalOrExpression__Group_1__0 : rule__LogicalOrExpression__Group_1__0__Impl rule__LogicalOrExpression__Group_1__1 ;
    public final void rule__LogicalOrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3461:1: ( rule__LogicalOrExpression__Group_1__0__Impl rule__LogicalOrExpression__Group_1__1 )
            // InternalKEffects.g:3462:2: rule__LogicalOrExpression__Group_1__0__Impl rule__LogicalOrExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_18);
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
    // InternalKEffects.g:3469:1: rule__LogicalOrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__LogicalOrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3473:1: ( ( () ) )
            // InternalKEffects.g:3474:1: ( () )
            {
            // InternalKEffects.g:3474:1: ( () )
            // InternalKEffects.g:3475:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKEffects.g:3476:1: ()
            // InternalKEffects.g:3478:1: 
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
    // InternalKEffects.g:3488:1: rule__LogicalOrExpression__Group_1__1 : rule__LogicalOrExpression__Group_1__1__Impl ;
    public final void rule__LogicalOrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3492:1: ( rule__LogicalOrExpression__Group_1__1__Impl )
            // InternalKEffects.g:3493:2: rule__LogicalOrExpression__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalOrExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalKEffects.g:3499:1: rule__LogicalOrExpression__Group_1__1__Impl : ( ( ( rule__LogicalOrExpression__Group_1_1__0 ) ) ( ( rule__LogicalOrExpression__Group_1_1__0 )* ) ) ;
    public final void rule__LogicalOrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3503:1: ( ( ( ( rule__LogicalOrExpression__Group_1_1__0 ) ) ( ( rule__LogicalOrExpression__Group_1_1__0 )* ) ) )
            // InternalKEffects.g:3504:1: ( ( ( rule__LogicalOrExpression__Group_1_1__0 ) ) ( ( rule__LogicalOrExpression__Group_1_1__0 )* ) )
            {
            // InternalKEffects.g:3504:1: ( ( ( rule__LogicalOrExpression__Group_1_1__0 ) ) ( ( rule__LogicalOrExpression__Group_1_1__0 )* ) )
            // InternalKEffects.g:3505:1: ( ( rule__LogicalOrExpression__Group_1_1__0 ) ) ( ( rule__LogicalOrExpression__Group_1_1__0 )* )
            {
            // InternalKEffects.g:3505:1: ( ( rule__LogicalOrExpression__Group_1_1__0 ) )
            // InternalKEffects.g:3506:1: ( rule__LogicalOrExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExpressionAccess().getGroup_1_1()); 
            }
            // InternalKEffects.g:3507:1: ( rule__LogicalOrExpression__Group_1_1__0 )
            // InternalKEffects.g:3507:2: rule__LogicalOrExpression__Group_1_1__0
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__LogicalOrExpression__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrExpressionAccess().getGroup_1_1()); 
            }

            }

            // InternalKEffects.g:3510:1: ( ( rule__LogicalOrExpression__Group_1_1__0 )* )
            // InternalKEffects.g:3511:1: ( rule__LogicalOrExpression__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExpressionAccess().getGroup_1_1()); 
            }
            // InternalKEffects.g:3512:1: ( rule__LogicalOrExpression__Group_1_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==26) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalKEffects.g:3512:2: rule__LogicalOrExpression__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_19);
            	    rule__LogicalOrExpression__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrExpressionAccess().getGroup_1_1()); 
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
    // $ANTLR end "rule__LogicalOrExpression__Group_1__1__Impl"


    // $ANTLR start "rule__LogicalOrExpression__Group_1_1__0"
    // InternalKEffects.g:3527:1: rule__LogicalOrExpression__Group_1_1__0 : rule__LogicalOrExpression__Group_1_1__0__Impl rule__LogicalOrExpression__Group_1_1__1 ;
    public final void rule__LogicalOrExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3531:1: ( rule__LogicalOrExpression__Group_1_1__0__Impl rule__LogicalOrExpression__Group_1_1__1 )
            // InternalKEffects.g:3532:2: rule__LogicalOrExpression__Group_1_1__0__Impl rule__LogicalOrExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
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
    // InternalKEffects.g:3539:1: rule__LogicalOrExpression__Group_1_1__0__Impl : ( ( rule__LogicalOrExpression__OperatorAssignment_1_1_0 ) ) ;
    public final void rule__LogicalOrExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3543:1: ( ( ( rule__LogicalOrExpression__OperatorAssignment_1_1_0 ) ) )
            // InternalKEffects.g:3544:1: ( ( rule__LogicalOrExpression__OperatorAssignment_1_1_0 ) )
            {
            // InternalKEffects.g:3544:1: ( ( rule__LogicalOrExpression__OperatorAssignment_1_1_0 ) )
            // InternalKEffects.g:3545:1: ( rule__LogicalOrExpression__OperatorAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExpressionAccess().getOperatorAssignment_1_1_0()); 
            }
            // InternalKEffects.g:3546:1: ( rule__LogicalOrExpression__OperatorAssignment_1_1_0 )
            // InternalKEffects.g:3546:2: rule__LogicalOrExpression__OperatorAssignment_1_1_0
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
    // InternalKEffects.g:3556:1: rule__LogicalOrExpression__Group_1_1__1 : rule__LogicalOrExpression__Group_1_1__1__Impl ;
    public final void rule__LogicalOrExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3560:1: ( rule__LogicalOrExpression__Group_1_1__1__Impl )
            // InternalKEffects.g:3561:2: rule__LogicalOrExpression__Group_1_1__1__Impl
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
    // InternalKEffects.g:3567:1: rule__LogicalOrExpression__Group_1_1__1__Impl : ( ( rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__LogicalOrExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3571:1: ( ( ( rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1 ) ) )
            // InternalKEffects.g:3572:1: ( ( rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1 ) )
            {
            // InternalKEffects.g:3572:1: ( ( rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1 ) )
            // InternalKEffects.g:3573:1: ( rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }
            // InternalKEffects.g:3574:1: ( rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1 )
            // InternalKEffects.g:3574:2: rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1
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


    // $ANTLR start "rule__LogicalAndExpression__Group__0"
    // InternalKEffects.g:3588:1: rule__LogicalAndExpression__Group__0 : rule__LogicalAndExpression__Group__0__Impl rule__LogicalAndExpression__Group__1 ;
    public final void rule__LogicalAndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3592:1: ( rule__LogicalAndExpression__Group__0__Impl rule__LogicalAndExpression__Group__1 )
            // InternalKEffects.g:3593:2: rule__LogicalAndExpression__Group__0__Impl rule__LogicalAndExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_20);
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
    // InternalKEffects.g:3600:1: rule__LogicalAndExpression__Group__0__Impl : ( ruleBitwiseOrExpression ) ;
    public final void rule__LogicalAndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3604:1: ( ( ruleBitwiseOrExpression ) )
            // InternalKEffects.g:3605:1: ( ruleBitwiseOrExpression )
            {
            // InternalKEffects.g:3605:1: ( ruleBitwiseOrExpression )
            // InternalKEffects.g:3606:1: ruleBitwiseOrExpression
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
    // InternalKEffects.g:3617:1: rule__LogicalAndExpression__Group__1 : rule__LogicalAndExpression__Group__1__Impl ;
    public final void rule__LogicalAndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3621:1: ( rule__LogicalAndExpression__Group__1__Impl )
            // InternalKEffects.g:3622:2: rule__LogicalAndExpression__Group__1__Impl
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
    // InternalKEffects.g:3628:1: rule__LogicalAndExpression__Group__1__Impl : ( ( rule__LogicalAndExpression__Group_1__0 )? ) ;
    public final void rule__LogicalAndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3632:1: ( ( ( rule__LogicalAndExpression__Group_1__0 )? ) )
            // InternalKEffects.g:3633:1: ( ( rule__LogicalAndExpression__Group_1__0 )? )
            {
            // InternalKEffects.g:3633:1: ( ( rule__LogicalAndExpression__Group_1__0 )? )
            // InternalKEffects.g:3634:1: ( rule__LogicalAndExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExpressionAccess().getGroup_1()); 
            }
            // InternalKEffects.g:3635:1: ( rule__LogicalAndExpression__Group_1__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==27) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalKEffects.g:3635:2: rule__LogicalAndExpression__Group_1__0
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
    // InternalKEffects.g:3649:1: rule__LogicalAndExpression__Group_1__0 : rule__LogicalAndExpression__Group_1__0__Impl rule__LogicalAndExpression__Group_1__1 ;
    public final void rule__LogicalAndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3653:1: ( rule__LogicalAndExpression__Group_1__0__Impl rule__LogicalAndExpression__Group_1__1 )
            // InternalKEffects.g:3654:2: rule__LogicalAndExpression__Group_1__0__Impl rule__LogicalAndExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_20);
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
    // InternalKEffects.g:3661:1: rule__LogicalAndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__LogicalAndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3665:1: ( ( () ) )
            // InternalKEffects.g:3666:1: ( () )
            {
            // InternalKEffects.g:3666:1: ( () )
            // InternalKEffects.g:3667:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKEffects.g:3668:1: ()
            // InternalKEffects.g:3670:1: 
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
    // InternalKEffects.g:3680:1: rule__LogicalAndExpression__Group_1__1 : rule__LogicalAndExpression__Group_1__1__Impl ;
    public final void rule__LogicalAndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3684:1: ( rule__LogicalAndExpression__Group_1__1__Impl )
            // InternalKEffects.g:3685:2: rule__LogicalAndExpression__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalAndExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalKEffects.g:3691:1: rule__LogicalAndExpression__Group_1__1__Impl : ( ( ( rule__LogicalAndExpression__Group_1_1__0 ) ) ( ( rule__LogicalAndExpression__Group_1_1__0 )* ) ) ;
    public final void rule__LogicalAndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3695:1: ( ( ( ( rule__LogicalAndExpression__Group_1_1__0 ) ) ( ( rule__LogicalAndExpression__Group_1_1__0 )* ) ) )
            // InternalKEffects.g:3696:1: ( ( ( rule__LogicalAndExpression__Group_1_1__0 ) ) ( ( rule__LogicalAndExpression__Group_1_1__0 )* ) )
            {
            // InternalKEffects.g:3696:1: ( ( ( rule__LogicalAndExpression__Group_1_1__0 ) ) ( ( rule__LogicalAndExpression__Group_1_1__0 )* ) )
            // InternalKEffects.g:3697:1: ( ( rule__LogicalAndExpression__Group_1_1__0 ) ) ( ( rule__LogicalAndExpression__Group_1_1__0 )* )
            {
            // InternalKEffects.g:3697:1: ( ( rule__LogicalAndExpression__Group_1_1__0 ) )
            // InternalKEffects.g:3698:1: ( rule__LogicalAndExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExpressionAccess().getGroup_1_1()); 
            }
            // InternalKEffects.g:3699:1: ( rule__LogicalAndExpression__Group_1_1__0 )
            // InternalKEffects.g:3699:2: rule__LogicalAndExpression__Group_1_1__0
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__LogicalAndExpression__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndExpressionAccess().getGroup_1_1()); 
            }

            }

            // InternalKEffects.g:3702:1: ( ( rule__LogicalAndExpression__Group_1_1__0 )* )
            // InternalKEffects.g:3703:1: ( rule__LogicalAndExpression__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExpressionAccess().getGroup_1_1()); 
            }
            // InternalKEffects.g:3704:1: ( rule__LogicalAndExpression__Group_1_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==27) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalKEffects.g:3704:2: rule__LogicalAndExpression__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    rule__LogicalAndExpression__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndExpressionAccess().getGroup_1_1()); 
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
    // $ANTLR end "rule__LogicalAndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__LogicalAndExpression__Group_1_1__0"
    // InternalKEffects.g:3719:1: rule__LogicalAndExpression__Group_1_1__0 : rule__LogicalAndExpression__Group_1_1__0__Impl rule__LogicalAndExpression__Group_1_1__1 ;
    public final void rule__LogicalAndExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3723:1: ( rule__LogicalAndExpression__Group_1_1__0__Impl rule__LogicalAndExpression__Group_1_1__1 )
            // InternalKEffects.g:3724:2: rule__LogicalAndExpression__Group_1_1__0__Impl rule__LogicalAndExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
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
    // InternalKEffects.g:3731:1: rule__LogicalAndExpression__Group_1_1__0__Impl : ( ( rule__LogicalAndExpression__OperatorAssignment_1_1_0 ) ) ;
    public final void rule__LogicalAndExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3735:1: ( ( ( rule__LogicalAndExpression__OperatorAssignment_1_1_0 ) ) )
            // InternalKEffects.g:3736:1: ( ( rule__LogicalAndExpression__OperatorAssignment_1_1_0 ) )
            {
            // InternalKEffects.g:3736:1: ( ( rule__LogicalAndExpression__OperatorAssignment_1_1_0 ) )
            // InternalKEffects.g:3737:1: ( rule__LogicalAndExpression__OperatorAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExpressionAccess().getOperatorAssignment_1_1_0()); 
            }
            // InternalKEffects.g:3738:1: ( rule__LogicalAndExpression__OperatorAssignment_1_1_0 )
            // InternalKEffects.g:3738:2: rule__LogicalAndExpression__OperatorAssignment_1_1_0
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
    // InternalKEffects.g:3748:1: rule__LogicalAndExpression__Group_1_1__1 : rule__LogicalAndExpression__Group_1_1__1__Impl ;
    public final void rule__LogicalAndExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3752:1: ( rule__LogicalAndExpression__Group_1_1__1__Impl )
            // InternalKEffects.g:3753:2: rule__LogicalAndExpression__Group_1_1__1__Impl
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
    // InternalKEffects.g:3759:1: rule__LogicalAndExpression__Group_1_1__1__Impl : ( ( rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__LogicalAndExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3763:1: ( ( ( rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1 ) ) )
            // InternalKEffects.g:3764:1: ( ( rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1 ) )
            {
            // InternalKEffects.g:3764:1: ( ( rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1 ) )
            // InternalKEffects.g:3765:1: ( rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }
            // InternalKEffects.g:3766:1: ( rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1 )
            // InternalKEffects.g:3766:2: rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1
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


    // $ANTLR start "rule__BitwiseOrExpression__Group__0"
    // InternalKEffects.g:3780:1: rule__BitwiseOrExpression__Group__0 : rule__BitwiseOrExpression__Group__0__Impl rule__BitwiseOrExpression__Group__1 ;
    public final void rule__BitwiseOrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3784:1: ( rule__BitwiseOrExpression__Group__0__Impl rule__BitwiseOrExpression__Group__1 )
            // InternalKEffects.g:3785:2: rule__BitwiseOrExpression__Group__0__Impl rule__BitwiseOrExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_22);
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
    // InternalKEffects.g:3792:1: rule__BitwiseOrExpression__Group__0__Impl : ( ruleBitwiseAndExpression ) ;
    public final void rule__BitwiseOrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3796:1: ( ( ruleBitwiseAndExpression ) )
            // InternalKEffects.g:3797:1: ( ruleBitwiseAndExpression )
            {
            // InternalKEffects.g:3797:1: ( ruleBitwiseAndExpression )
            // InternalKEffects.g:3798:1: ruleBitwiseAndExpression
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
    // InternalKEffects.g:3809:1: rule__BitwiseOrExpression__Group__1 : rule__BitwiseOrExpression__Group__1__Impl ;
    public final void rule__BitwiseOrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3813:1: ( rule__BitwiseOrExpression__Group__1__Impl )
            // InternalKEffects.g:3814:2: rule__BitwiseOrExpression__Group__1__Impl
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
    // InternalKEffects.g:3820:1: rule__BitwiseOrExpression__Group__1__Impl : ( ( rule__BitwiseOrExpression__Group_1__0 )? ) ;
    public final void rule__BitwiseOrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3824:1: ( ( ( rule__BitwiseOrExpression__Group_1__0 )? ) )
            // InternalKEffects.g:3825:1: ( ( rule__BitwiseOrExpression__Group_1__0 )? )
            {
            // InternalKEffects.g:3825:1: ( ( rule__BitwiseOrExpression__Group_1__0 )? )
            // InternalKEffects.g:3826:1: ( rule__BitwiseOrExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrExpressionAccess().getGroup_1()); 
            }
            // InternalKEffects.g:3827:1: ( rule__BitwiseOrExpression__Group_1__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==17) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalKEffects.g:3827:2: rule__BitwiseOrExpression__Group_1__0
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
    // InternalKEffects.g:3841:1: rule__BitwiseOrExpression__Group_1__0 : rule__BitwiseOrExpression__Group_1__0__Impl rule__BitwiseOrExpression__Group_1__1 ;
    public final void rule__BitwiseOrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3845:1: ( rule__BitwiseOrExpression__Group_1__0__Impl rule__BitwiseOrExpression__Group_1__1 )
            // InternalKEffects.g:3846:2: rule__BitwiseOrExpression__Group_1__0__Impl rule__BitwiseOrExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_22);
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
    // InternalKEffects.g:3853:1: rule__BitwiseOrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__BitwiseOrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3857:1: ( ( () ) )
            // InternalKEffects.g:3858:1: ( () )
            {
            // InternalKEffects.g:3858:1: ( () )
            // InternalKEffects.g:3859:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKEffects.g:3860:1: ()
            // InternalKEffects.g:3862:1: 
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
    // InternalKEffects.g:3872:1: rule__BitwiseOrExpression__Group_1__1 : rule__BitwiseOrExpression__Group_1__1__Impl ;
    public final void rule__BitwiseOrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3876:1: ( rule__BitwiseOrExpression__Group_1__1__Impl )
            // InternalKEffects.g:3877:2: rule__BitwiseOrExpression__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BitwiseOrExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalKEffects.g:3883:1: rule__BitwiseOrExpression__Group_1__1__Impl : ( ( ( rule__BitwiseOrExpression__Group_1_1__0 ) ) ( ( rule__BitwiseOrExpression__Group_1_1__0 )* ) ) ;
    public final void rule__BitwiseOrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3887:1: ( ( ( ( rule__BitwiseOrExpression__Group_1_1__0 ) ) ( ( rule__BitwiseOrExpression__Group_1_1__0 )* ) ) )
            // InternalKEffects.g:3888:1: ( ( ( rule__BitwiseOrExpression__Group_1_1__0 ) ) ( ( rule__BitwiseOrExpression__Group_1_1__0 )* ) )
            {
            // InternalKEffects.g:3888:1: ( ( ( rule__BitwiseOrExpression__Group_1_1__0 ) ) ( ( rule__BitwiseOrExpression__Group_1_1__0 )* ) )
            // InternalKEffects.g:3889:1: ( ( rule__BitwiseOrExpression__Group_1_1__0 ) ) ( ( rule__BitwiseOrExpression__Group_1_1__0 )* )
            {
            // InternalKEffects.g:3889:1: ( ( rule__BitwiseOrExpression__Group_1_1__0 ) )
            // InternalKEffects.g:3890:1: ( rule__BitwiseOrExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrExpressionAccess().getGroup_1_1()); 
            }
            // InternalKEffects.g:3891:1: ( rule__BitwiseOrExpression__Group_1_1__0 )
            // InternalKEffects.g:3891:2: rule__BitwiseOrExpression__Group_1_1__0
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__BitwiseOrExpression__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBitwiseOrExpressionAccess().getGroup_1_1()); 
            }

            }

            // InternalKEffects.g:3894:1: ( ( rule__BitwiseOrExpression__Group_1_1__0 )* )
            // InternalKEffects.g:3895:1: ( rule__BitwiseOrExpression__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrExpressionAccess().getGroup_1_1()); 
            }
            // InternalKEffects.g:3896:1: ( rule__BitwiseOrExpression__Group_1_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==17) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalKEffects.g:3896:2: rule__BitwiseOrExpression__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_23);
            	    rule__BitwiseOrExpression__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBitwiseOrExpressionAccess().getGroup_1_1()); 
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
    // $ANTLR end "rule__BitwiseOrExpression__Group_1__1__Impl"


    // $ANTLR start "rule__BitwiseOrExpression__Group_1_1__0"
    // InternalKEffects.g:3911:1: rule__BitwiseOrExpression__Group_1_1__0 : rule__BitwiseOrExpression__Group_1_1__0__Impl rule__BitwiseOrExpression__Group_1_1__1 ;
    public final void rule__BitwiseOrExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3915:1: ( rule__BitwiseOrExpression__Group_1_1__0__Impl rule__BitwiseOrExpression__Group_1_1__1 )
            // InternalKEffects.g:3916:2: rule__BitwiseOrExpression__Group_1_1__0__Impl rule__BitwiseOrExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
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
    // InternalKEffects.g:3923:1: rule__BitwiseOrExpression__Group_1_1__0__Impl : ( ( rule__BitwiseOrExpression__OperatorAssignment_1_1_0 ) ) ;
    public final void rule__BitwiseOrExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3927:1: ( ( ( rule__BitwiseOrExpression__OperatorAssignment_1_1_0 ) ) )
            // InternalKEffects.g:3928:1: ( ( rule__BitwiseOrExpression__OperatorAssignment_1_1_0 ) )
            {
            // InternalKEffects.g:3928:1: ( ( rule__BitwiseOrExpression__OperatorAssignment_1_1_0 ) )
            // InternalKEffects.g:3929:1: ( rule__BitwiseOrExpression__OperatorAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrExpressionAccess().getOperatorAssignment_1_1_0()); 
            }
            // InternalKEffects.g:3930:1: ( rule__BitwiseOrExpression__OperatorAssignment_1_1_0 )
            // InternalKEffects.g:3930:2: rule__BitwiseOrExpression__OperatorAssignment_1_1_0
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
    // InternalKEffects.g:3940:1: rule__BitwiseOrExpression__Group_1_1__1 : rule__BitwiseOrExpression__Group_1_1__1__Impl ;
    public final void rule__BitwiseOrExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3944:1: ( rule__BitwiseOrExpression__Group_1_1__1__Impl )
            // InternalKEffects.g:3945:2: rule__BitwiseOrExpression__Group_1_1__1__Impl
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
    // InternalKEffects.g:3951:1: rule__BitwiseOrExpression__Group_1_1__1__Impl : ( ( rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__BitwiseOrExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3955:1: ( ( ( rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1 ) ) )
            // InternalKEffects.g:3956:1: ( ( rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1 ) )
            {
            // InternalKEffects.g:3956:1: ( ( rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1 ) )
            // InternalKEffects.g:3957:1: ( rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }
            // InternalKEffects.g:3958:1: ( rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1 )
            // InternalKEffects.g:3958:2: rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1
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


    // $ANTLR start "rule__BitwiseAndExpression__Group__0"
    // InternalKEffects.g:3972:1: rule__BitwiseAndExpression__Group__0 : rule__BitwiseAndExpression__Group__0__Impl rule__BitwiseAndExpression__Group__1 ;
    public final void rule__BitwiseAndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3976:1: ( rule__BitwiseAndExpression__Group__0__Impl rule__BitwiseAndExpression__Group__1 )
            // InternalKEffects.g:3977:2: rule__BitwiseAndExpression__Group__0__Impl rule__BitwiseAndExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalKEffects.g:3984:1: rule__BitwiseAndExpression__Group__0__Impl : ( ruleCompareOperation ) ;
    public final void rule__BitwiseAndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3988:1: ( ( ruleCompareOperation ) )
            // InternalKEffects.g:3989:1: ( ruleCompareOperation )
            {
            // InternalKEffects.g:3989:1: ( ruleCompareOperation )
            // InternalKEffects.g:3990:1: ruleCompareOperation
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
    // InternalKEffects.g:4001:1: rule__BitwiseAndExpression__Group__1 : rule__BitwiseAndExpression__Group__1__Impl ;
    public final void rule__BitwiseAndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4005:1: ( rule__BitwiseAndExpression__Group__1__Impl )
            // InternalKEffects.g:4006:2: rule__BitwiseAndExpression__Group__1__Impl
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
    // InternalKEffects.g:4012:1: rule__BitwiseAndExpression__Group__1__Impl : ( ( rule__BitwiseAndExpression__Group_1__0 )? ) ;
    public final void rule__BitwiseAndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4016:1: ( ( ( rule__BitwiseAndExpression__Group_1__0 )? ) )
            // InternalKEffects.g:4017:1: ( ( rule__BitwiseAndExpression__Group_1__0 )? )
            {
            // InternalKEffects.g:4017:1: ( ( rule__BitwiseAndExpression__Group_1__0 )? )
            // InternalKEffects.g:4018:1: ( rule__BitwiseAndExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndExpressionAccess().getGroup_1()); 
            }
            // InternalKEffects.g:4019:1: ( rule__BitwiseAndExpression__Group_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==18) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalKEffects.g:4019:2: rule__BitwiseAndExpression__Group_1__0
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
    // InternalKEffects.g:4033:1: rule__BitwiseAndExpression__Group_1__0 : rule__BitwiseAndExpression__Group_1__0__Impl rule__BitwiseAndExpression__Group_1__1 ;
    public final void rule__BitwiseAndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4037:1: ( rule__BitwiseAndExpression__Group_1__0__Impl rule__BitwiseAndExpression__Group_1__1 )
            // InternalKEffects.g:4038:2: rule__BitwiseAndExpression__Group_1__0__Impl rule__BitwiseAndExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalKEffects.g:4045:1: rule__BitwiseAndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__BitwiseAndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4049:1: ( ( () ) )
            // InternalKEffects.g:4050:1: ( () )
            {
            // InternalKEffects.g:4050:1: ( () )
            // InternalKEffects.g:4051:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKEffects.g:4052:1: ()
            // InternalKEffects.g:4054:1: 
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
    // InternalKEffects.g:4064:1: rule__BitwiseAndExpression__Group_1__1 : rule__BitwiseAndExpression__Group_1__1__Impl ;
    public final void rule__BitwiseAndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4068:1: ( rule__BitwiseAndExpression__Group_1__1__Impl )
            // InternalKEffects.g:4069:2: rule__BitwiseAndExpression__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BitwiseAndExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalKEffects.g:4075:1: rule__BitwiseAndExpression__Group_1__1__Impl : ( ( ( rule__BitwiseAndExpression__Group_1_1__0 ) ) ( ( rule__BitwiseAndExpression__Group_1_1__0 )* ) ) ;
    public final void rule__BitwiseAndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4079:1: ( ( ( ( rule__BitwiseAndExpression__Group_1_1__0 ) ) ( ( rule__BitwiseAndExpression__Group_1_1__0 )* ) ) )
            // InternalKEffects.g:4080:1: ( ( ( rule__BitwiseAndExpression__Group_1_1__0 ) ) ( ( rule__BitwiseAndExpression__Group_1_1__0 )* ) )
            {
            // InternalKEffects.g:4080:1: ( ( ( rule__BitwiseAndExpression__Group_1_1__0 ) ) ( ( rule__BitwiseAndExpression__Group_1_1__0 )* ) )
            // InternalKEffects.g:4081:1: ( ( rule__BitwiseAndExpression__Group_1_1__0 ) ) ( ( rule__BitwiseAndExpression__Group_1_1__0 )* )
            {
            // InternalKEffects.g:4081:1: ( ( rule__BitwiseAndExpression__Group_1_1__0 ) )
            // InternalKEffects.g:4082:1: ( rule__BitwiseAndExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndExpressionAccess().getGroup_1_1()); 
            }
            // InternalKEffects.g:4083:1: ( rule__BitwiseAndExpression__Group_1_1__0 )
            // InternalKEffects.g:4083:2: rule__BitwiseAndExpression__Group_1_1__0
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__BitwiseAndExpression__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBitwiseAndExpressionAccess().getGroup_1_1()); 
            }

            }

            // InternalKEffects.g:4086:1: ( ( rule__BitwiseAndExpression__Group_1_1__0 )* )
            // InternalKEffects.g:4087:1: ( rule__BitwiseAndExpression__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndExpressionAccess().getGroup_1_1()); 
            }
            // InternalKEffects.g:4088:1: ( rule__BitwiseAndExpression__Group_1_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==18) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalKEffects.g:4088:2: rule__BitwiseAndExpression__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_25);
            	    rule__BitwiseAndExpression__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBitwiseAndExpressionAccess().getGroup_1_1()); 
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
    // $ANTLR end "rule__BitwiseAndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__BitwiseAndExpression__Group_1_1__0"
    // InternalKEffects.g:4103:1: rule__BitwiseAndExpression__Group_1_1__0 : rule__BitwiseAndExpression__Group_1_1__0__Impl rule__BitwiseAndExpression__Group_1_1__1 ;
    public final void rule__BitwiseAndExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4107:1: ( rule__BitwiseAndExpression__Group_1_1__0__Impl rule__BitwiseAndExpression__Group_1_1__1 )
            // InternalKEffects.g:4108:2: rule__BitwiseAndExpression__Group_1_1__0__Impl rule__BitwiseAndExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
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
    // InternalKEffects.g:4115:1: rule__BitwiseAndExpression__Group_1_1__0__Impl : ( ( rule__BitwiseAndExpression__OperatorAssignment_1_1_0 ) ) ;
    public final void rule__BitwiseAndExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4119:1: ( ( ( rule__BitwiseAndExpression__OperatorAssignment_1_1_0 ) ) )
            // InternalKEffects.g:4120:1: ( ( rule__BitwiseAndExpression__OperatorAssignment_1_1_0 ) )
            {
            // InternalKEffects.g:4120:1: ( ( rule__BitwiseAndExpression__OperatorAssignment_1_1_0 ) )
            // InternalKEffects.g:4121:1: ( rule__BitwiseAndExpression__OperatorAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndExpressionAccess().getOperatorAssignment_1_1_0()); 
            }
            // InternalKEffects.g:4122:1: ( rule__BitwiseAndExpression__OperatorAssignment_1_1_0 )
            // InternalKEffects.g:4122:2: rule__BitwiseAndExpression__OperatorAssignment_1_1_0
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
    // InternalKEffects.g:4132:1: rule__BitwiseAndExpression__Group_1_1__1 : rule__BitwiseAndExpression__Group_1_1__1__Impl ;
    public final void rule__BitwiseAndExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4136:1: ( rule__BitwiseAndExpression__Group_1_1__1__Impl )
            // InternalKEffects.g:4137:2: rule__BitwiseAndExpression__Group_1_1__1__Impl
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
    // InternalKEffects.g:4143:1: rule__BitwiseAndExpression__Group_1_1__1__Impl : ( ( rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__BitwiseAndExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4147:1: ( ( ( rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1 ) ) )
            // InternalKEffects.g:4148:1: ( ( rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1 ) )
            {
            // InternalKEffects.g:4148:1: ( ( rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1 ) )
            // InternalKEffects.g:4149:1: ( rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }
            // InternalKEffects.g:4150:1: ( rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1 )
            // InternalKEffects.g:4150:2: rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1
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


    // $ANTLR start "rule__CompareOperation__Group__0"
    // InternalKEffects.g:4164:1: rule__CompareOperation__Group__0 : rule__CompareOperation__Group__0__Impl rule__CompareOperation__Group__1 ;
    public final void rule__CompareOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4168:1: ( rule__CompareOperation__Group__0__Impl rule__CompareOperation__Group__1 )
            // InternalKEffects.g:4169:2: rule__CompareOperation__Group__0__Impl rule__CompareOperation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_26);
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
    // InternalKEffects.g:4176:1: rule__CompareOperation__Group__0__Impl : ( ruleNotOrValuedExpression ) ;
    public final void rule__CompareOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4180:1: ( ( ruleNotOrValuedExpression ) )
            // InternalKEffects.g:4181:1: ( ruleNotOrValuedExpression )
            {
            // InternalKEffects.g:4181:1: ( ruleNotOrValuedExpression )
            // InternalKEffects.g:4182:1: ruleNotOrValuedExpression
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
    // InternalKEffects.g:4193:1: rule__CompareOperation__Group__1 : rule__CompareOperation__Group__1__Impl ;
    public final void rule__CompareOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4197:1: ( rule__CompareOperation__Group__1__Impl )
            // InternalKEffects.g:4198:2: rule__CompareOperation__Group__1__Impl
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
    // InternalKEffects.g:4204:1: rule__CompareOperation__Group__1__Impl : ( ( rule__CompareOperation__Group_1__0 )? ) ;
    public final void rule__CompareOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4208:1: ( ( ( rule__CompareOperation__Group_1__0 )? ) )
            // InternalKEffects.g:4209:1: ( ( rule__CompareOperation__Group_1__0 )? )
            {
            // InternalKEffects.g:4209:1: ( ( rule__CompareOperation__Group_1__0 )? )
            // InternalKEffects.g:4210:1: ( rule__CompareOperation__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGroup_1()); 
            }
            // InternalKEffects.g:4211:1: ( rule__CompareOperation__Group_1__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=36 && LA37_0<=41)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalKEffects.g:4211:2: rule__CompareOperation__Group_1__0
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
    // InternalKEffects.g:4225:1: rule__CompareOperation__Group_1__0 : rule__CompareOperation__Group_1__0__Impl rule__CompareOperation__Group_1__1 ;
    public final void rule__CompareOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4229:1: ( rule__CompareOperation__Group_1__0__Impl rule__CompareOperation__Group_1__1 )
            // InternalKEffects.g:4230:2: rule__CompareOperation__Group_1__0__Impl rule__CompareOperation__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_26);
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
    // InternalKEffects.g:4237:1: rule__CompareOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__CompareOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4241:1: ( ( () ) )
            // InternalKEffects.g:4242:1: ( () )
            {
            // InternalKEffects.g:4242:1: ( () )
            // InternalKEffects.g:4243:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKEffects.g:4244:1: ()
            // InternalKEffects.g:4246:1: 
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
    // InternalKEffects.g:4256:1: rule__CompareOperation__Group_1__1 : rule__CompareOperation__Group_1__1__Impl rule__CompareOperation__Group_1__2 ;
    public final void rule__CompareOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4260:1: ( rule__CompareOperation__Group_1__1__Impl rule__CompareOperation__Group_1__2 )
            // InternalKEffects.g:4261:2: rule__CompareOperation__Group_1__1__Impl rule__CompareOperation__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_6);
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
    // InternalKEffects.g:4268:1: rule__CompareOperation__Group_1__1__Impl : ( ( rule__CompareOperation__OperatorAssignment_1_1 ) ) ;
    public final void rule__CompareOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4272:1: ( ( ( rule__CompareOperation__OperatorAssignment_1_1 ) ) )
            // InternalKEffects.g:4273:1: ( ( rule__CompareOperation__OperatorAssignment_1_1 ) )
            {
            // InternalKEffects.g:4273:1: ( ( rule__CompareOperation__OperatorAssignment_1_1 ) )
            // InternalKEffects.g:4274:1: ( rule__CompareOperation__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKEffects.g:4275:1: ( rule__CompareOperation__OperatorAssignment_1_1 )
            // InternalKEffects.g:4275:2: rule__CompareOperation__OperatorAssignment_1_1
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
    // InternalKEffects.g:4285:1: rule__CompareOperation__Group_1__2 : rule__CompareOperation__Group_1__2__Impl ;
    public final void rule__CompareOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4289:1: ( rule__CompareOperation__Group_1__2__Impl )
            // InternalKEffects.g:4290:2: rule__CompareOperation__Group_1__2__Impl
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
    // InternalKEffects.g:4296:1: rule__CompareOperation__Group_1__2__Impl : ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__CompareOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4300:1: ( ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) ) )
            // InternalKEffects.g:4301:1: ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) )
            {
            // InternalKEffects.g:4301:1: ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) )
            // InternalKEffects.g:4302:1: ( rule__CompareOperation__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // InternalKEffects.g:4303:1: ( rule__CompareOperation__SubExpressionsAssignment_1_2 )
            // InternalKEffects.g:4303:2: rule__CompareOperation__SubExpressionsAssignment_1_2
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
    // InternalKEffects.g:4319:1: rule__NotExpression__Group_0__0 : rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1 ;
    public final void rule__NotExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4323:1: ( rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1 )
            // InternalKEffects.g:4324:2: rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_27);
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
    // InternalKEffects.g:4331:1: rule__NotExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__NotExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4335:1: ( ( () ) )
            // InternalKEffects.g:4336:1: ( () )
            {
            // InternalKEffects.g:4336:1: ( () )
            // InternalKEffects.g:4337:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // InternalKEffects.g:4338:1: ()
            // InternalKEffects.g:4340:1: 
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
    // InternalKEffects.g:4350:1: rule__NotExpression__Group_0__1 : rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2 ;
    public final void rule__NotExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4354:1: ( rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2 )
            // InternalKEffects.g:4355:2: rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_6);
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
    // InternalKEffects.g:4362:1: rule__NotExpression__Group_0__1__Impl : ( ( rule__NotExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__NotExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4366:1: ( ( ( rule__NotExpression__OperatorAssignment_0_1 ) ) )
            // InternalKEffects.g:4367:1: ( ( rule__NotExpression__OperatorAssignment_0_1 ) )
            {
            // InternalKEffects.g:4367:1: ( ( rule__NotExpression__OperatorAssignment_0_1 ) )
            // InternalKEffects.g:4368:1: ( rule__NotExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // InternalKEffects.g:4369:1: ( rule__NotExpression__OperatorAssignment_0_1 )
            // InternalKEffects.g:4369:2: rule__NotExpression__OperatorAssignment_0_1
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
    // InternalKEffects.g:4379:1: rule__NotExpression__Group_0__2 : rule__NotExpression__Group_0__2__Impl ;
    public final void rule__NotExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4383:1: ( rule__NotExpression__Group_0__2__Impl )
            // InternalKEffects.g:4384:2: rule__NotExpression__Group_0__2__Impl
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
    // InternalKEffects.g:4390:1: rule__NotExpression__Group_0__2__Impl : ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) ) ;
    public final void rule__NotExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4394:1: ( ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) ) )
            // InternalKEffects.g:4395:1: ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) )
            {
            // InternalKEffects.g:4395:1: ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) )
            // InternalKEffects.g:4396:1: ( rule__NotExpression__SubExpressionsAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubExpressionsAssignment_0_2()); 
            }
            // InternalKEffects.g:4397:1: ( rule__NotExpression__SubExpressionsAssignment_0_2 )
            // InternalKEffects.g:4397:2: rule__NotExpression__SubExpressionsAssignment_0_2
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
    // InternalKEffects.g:4413:1: rule__AddExpression__Group__0 : rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 ;
    public final void rule__AddExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4417:1: ( rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 )
            // InternalKEffects.g:4418:2: rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_28);
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
    // InternalKEffects.g:4425:1: rule__AddExpression__Group__0__Impl : ( ruleSubExpression ) ;
    public final void rule__AddExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4429:1: ( ( ruleSubExpression ) )
            // InternalKEffects.g:4430:1: ( ruleSubExpression )
            {
            // InternalKEffects.g:4430:1: ( ruleSubExpression )
            // InternalKEffects.g:4431:1: ruleSubExpression
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
    // InternalKEffects.g:4442:1: rule__AddExpression__Group__1 : rule__AddExpression__Group__1__Impl ;
    public final void rule__AddExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4446:1: ( rule__AddExpression__Group__1__Impl )
            // InternalKEffects.g:4447:2: rule__AddExpression__Group__1__Impl
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
    // InternalKEffects.g:4453:1: rule__AddExpression__Group__1__Impl : ( ( rule__AddExpression__Group_1__0 )? ) ;
    public final void rule__AddExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4457:1: ( ( ( rule__AddExpression__Group_1__0 )? ) )
            // InternalKEffects.g:4458:1: ( ( rule__AddExpression__Group_1__0 )? )
            {
            // InternalKEffects.g:4458:1: ( ( rule__AddExpression__Group_1__0 )? )
            // InternalKEffects.g:4459:1: ( rule__AddExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1()); 
            }
            // InternalKEffects.g:4460:1: ( rule__AddExpression__Group_1__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==20) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalKEffects.g:4460:2: rule__AddExpression__Group_1__0
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
    // InternalKEffects.g:4474:1: rule__AddExpression__Group_1__0 : rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 ;
    public final void rule__AddExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4478:1: ( rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 )
            // InternalKEffects.g:4479:2: rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_28);
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
    // InternalKEffects.g:4486:1: rule__AddExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AddExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4490:1: ( ( () ) )
            // InternalKEffects.g:4491:1: ( () )
            {
            // InternalKEffects.g:4491:1: ( () )
            // InternalKEffects.g:4492:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKEffects.g:4493:1: ()
            // InternalKEffects.g:4495:1: 
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
    // InternalKEffects.g:4505:1: rule__AddExpression__Group_1__1 : rule__AddExpression__Group_1__1__Impl ;
    public final void rule__AddExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4509:1: ( rule__AddExpression__Group_1__1__Impl )
            // InternalKEffects.g:4510:2: rule__AddExpression__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AddExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalKEffects.g:4516:1: rule__AddExpression__Group_1__1__Impl : ( ( ( rule__AddExpression__Group_1_1__0 ) ) ( ( rule__AddExpression__Group_1_1__0 )* ) ) ;
    public final void rule__AddExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4520:1: ( ( ( ( rule__AddExpression__Group_1_1__0 ) ) ( ( rule__AddExpression__Group_1_1__0 )* ) ) )
            // InternalKEffects.g:4521:1: ( ( ( rule__AddExpression__Group_1_1__0 ) ) ( ( rule__AddExpression__Group_1_1__0 )* ) )
            {
            // InternalKEffects.g:4521:1: ( ( ( rule__AddExpression__Group_1_1__0 ) ) ( ( rule__AddExpression__Group_1_1__0 )* ) )
            // InternalKEffects.g:4522:1: ( ( rule__AddExpression__Group_1_1__0 ) ) ( ( rule__AddExpression__Group_1_1__0 )* )
            {
            // InternalKEffects.g:4522:1: ( ( rule__AddExpression__Group_1_1__0 ) )
            // InternalKEffects.g:4523:1: ( rule__AddExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1_1()); 
            }
            // InternalKEffects.g:4524:1: ( rule__AddExpression__Group_1_1__0 )
            // InternalKEffects.g:4524:2: rule__AddExpression__Group_1_1__0
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__AddExpression__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getGroup_1_1()); 
            }

            }

            // InternalKEffects.g:4527:1: ( ( rule__AddExpression__Group_1_1__0 )* )
            // InternalKEffects.g:4528:1: ( rule__AddExpression__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1_1()); 
            }
            // InternalKEffects.g:4529:1: ( rule__AddExpression__Group_1_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==20) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalKEffects.g:4529:2: rule__AddExpression__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_29);
            	    rule__AddExpression__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getGroup_1_1()); 
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
    // $ANTLR end "rule__AddExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AddExpression__Group_1_1__0"
    // InternalKEffects.g:4544:1: rule__AddExpression__Group_1_1__0 : rule__AddExpression__Group_1_1__0__Impl rule__AddExpression__Group_1_1__1 ;
    public final void rule__AddExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4548:1: ( rule__AddExpression__Group_1_1__0__Impl rule__AddExpression__Group_1_1__1 )
            // InternalKEffects.g:4549:2: rule__AddExpression__Group_1_1__0__Impl rule__AddExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_30);
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
    // InternalKEffects.g:4556:1: rule__AddExpression__Group_1_1__0__Impl : ( ( rule__AddExpression__OperatorAssignment_1_1_0 ) ) ;
    public final void rule__AddExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4560:1: ( ( ( rule__AddExpression__OperatorAssignment_1_1_0 ) ) )
            // InternalKEffects.g:4561:1: ( ( rule__AddExpression__OperatorAssignment_1_1_0 ) )
            {
            // InternalKEffects.g:4561:1: ( ( rule__AddExpression__OperatorAssignment_1_1_0 ) )
            // InternalKEffects.g:4562:1: ( rule__AddExpression__OperatorAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorAssignment_1_1_0()); 
            }
            // InternalKEffects.g:4563:1: ( rule__AddExpression__OperatorAssignment_1_1_0 )
            // InternalKEffects.g:4563:2: rule__AddExpression__OperatorAssignment_1_1_0
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
    // InternalKEffects.g:4573:1: rule__AddExpression__Group_1_1__1 : rule__AddExpression__Group_1_1__1__Impl ;
    public final void rule__AddExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4577:1: ( rule__AddExpression__Group_1_1__1__Impl )
            // InternalKEffects.g:4578:2: rule__AddExpression__Group_1_1__1__Impl
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
    // InternalKEffects.g:4584:1: rule__AddExpression__Group_1_1__1__Impl : ( ( rule__AddExpression__SubExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__AddExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4588:1: ( ( ( rule__AddExpression__SubExpressionsAssignment_1_1_1 ) ) )
            // InternalKEffects.g:4589:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_1_1 ) )
            {
            // InternalKEffects.g:4589:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_1_1 ) )
            // InternalKEffects.g:4590:1: ( rule__AddExpression__SubExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }
            // InternalKEffects.g:4591:1: ( rule__AddExpression__SubExpressionsAssignment_1_1_1 )
            // InternalKEffects.g:4591:2: rule__AddExpression__SubExpressionsAssignment_1_1_1
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


    // $ANTLR start "rule__SubExpression__Group__0"
    // InternalKEffects.g:4605:1: rule__SubExpression__Group__0 : rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 ;
    public final void rule__SubExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4609:1: ( rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 )
            // InternalKEffects.g:4610:2: rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_31);
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
    // InternalKEffects.g:4617:1: rule__SubExpression__Group__0__Impl : ( ruleMultExpression ) ;
    public final void rule__SubExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4621:1: ( ( ruleMultExpression ) )
            // InternalKEffects.g:4622:1: ( ruleMultExpression )
            {
            // InternalKEffects.g:4622:1: ( ruleMultExpression )
            // InternalKEffects.g:4623:1: ruleMultExpression
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
    // InternalKEffects.g:4634:1: rule__SubExpression__Group__1 : rule__SubExpression__Group__1__Impl ;
    public final void rule__SubExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4638:1: ( rule__SubExpression__Group__1__Impl )
            // InternalKEffects.g:4639:2: rule__SubExpression__Group__1__Impl
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
    // InternalKEffects.g:4645:1: rule__SubExpression__Group__1__Impl : ( ( rule__SubExpression__Group_1__0 )? ) ;
    public final void rule__SubExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4649:1: ( ( ( rule__SubExpression__Group_1__0 )? ) )
            // InternalKEffects.g:4650:1: ( ( rule__SubExpression__Group_1__0 )? )
            {
            // InternalKEffects.g:4650:1: ( ( rule__SubExpression__Group_1__0 )? )
            // InternalKEffects.g:4651:1: ( rule__SubExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup_1()); 
            }
            // InternalKEffects.g:4652:1: ( rule__SubExpression__Group_1__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==21) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalKEffects.g:4652:2: rule__SubExpression__Group_1__0
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
    // InternalKEffects.g:4666:1: rule__SubExpression__Group_1__0 : rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 ;
    public final void rule__SubExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4670:1: ( rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 )
            // InternalKEffects.g:4671:2: rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_31);
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
    // InternalKEffects.g:4678:1: rule__SubExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__SubExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4682:1: ( ( () ) )
            // InternalKEffects.g:4683:1: ( () )
            {
            // InternalKEffects.g:4683:1: ( () )
            // InternalKEffects.g:4684:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKEffects.g:4685:1: ()
            // InternalKEffects.g:4687:1: 
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
    // InternalKEffects.g:4697:1: rule__SubExpression__Group_1__1 : rule__SubExpression__Group_1__1__Impl ;
    public final void rule__SubExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4701:1: ( rule__SubExpression__Group_1__1__Impl )
            // InternalKEffects.g:4702:2: rule__SubExpression__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SubExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalKEffects.g:4708:1: rule__SubExpression__Group_1__1__Impl : ( ( ( rule__SubExpression__Group_1_1__0 ) ) ( ( rule__SubExpression__Group_1_1__0 )* ) ) ;
    public final void rule__SubExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4712:1: ( ( ( ( rule__SubExpression__Group_1_1__0 ) ) ( ( rule__SubExpression__Group_1_1__0 )* ) ) )
            // InternalKEffects.g:4713:1: ( ( ( rule__SubExpression__Group_1_1__0 ) ) ( ( rule__SubExpression__Group_1_1__0 )* ) )
            {
            // InternalKEffects.g:4713:1: ( ( ( rule__SubExpression__Group_1_1__0 ) ) ( ( rule__SubExpression__Group_1_1__0 )* ) )
            // InternalKEffects.g:4714:1: ( ( rule__SubExpression__Group_1_1__0 ) ) ( ( rule__SubExpression__Group_1_1__0 )* )
            {
            // InternalKEffects.g:4714:1: ( ( rule__SubExpression__Group_1_1__0 ) )
            // InternalKEffects.g:4715:1: ( rule__SubExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup_1_1()); 
            }
            // InternalKEffects.g:4716:1: ( rule__SubExpression__Group_1_1__0 )
            // InternalKEffects.g:4716:2: rule__SubExpression__Group_1_1__0
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__SubExpression__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubExpressionAccess().getGroup_1_1()); 
            }

            }

            // InternalKEffects.g:4719:1: ( ( rule__SubExpression__Group_1_1__0 )* )
            // InternalKEffects.g:4720:1: ( rule__SubExpression__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup_1_1()); 
            }
            // InternalKEffects.g:4721:1: ( rule__SubExpression__Group_1_1__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==21) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalKEffects.g:4721:2: rule__SubExpression__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_32);
            	    rule__SubExpression__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubExpressionAccess().getGroup_1_1()); 
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
    // $ANTLR end "rule__SubExpression__Group_1__1__Impl"


    // $ANTLR start "rule__SubExpression__Group_1_1__0"
    // InternalKEffects.g:4736:1: rule__SubExpression__Group_1_1__0 : rule__SubExpression__Group_1_1__0__Impl rule__SubExpression__Group_1_1__1 ;
    public final void rule__SubExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4740:1: ( rule__SubExpression__Group_1_1__0__Impl rule__SubExpression__Group_1_1__1 )
            // InternalKEffects.g:4741:2: rule__SubExpression__Group_1_1__0__Impl rule__SubExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_30);
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
    // InternalKEffects.g:4748:1: rule__SubExpression__Group_1_1__0__Impl : ( ( rule__SubExpression__OperatorAssignment_1_1_0 ) ) ;
    public final void rule__SubExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4752:1: ( ( ( rule__SubExpression__OperatorAssignment_1_1_0 ) ) )
            // InternalKEffects.g:4753:1: ( ( rule__SubExpression__OperatorAssignment_1_1_0 ) )
            {
            // InternalKEffects.g:4753:1: ( ( rule__SubExpression__OperatorAssignment_1_1_0 ) )
            // InternalKEffects.g:4754:1: ( rule__SubExpression__OperatorAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorAssignment_1_1_0()); 
            }
            // InternalKEffects.g:4755:1: ( rule__SubExpression__OperatorAssignment_1_1_0 )
            // InternalKEffects.g:4755:2: rule__SubExpression__OperatorAssignment_1_1_0
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
    // InternalKEffects.g:4765:1: rule__SubExpression__Group_1_1__1 : rule__SubExpression__Group_1_1__1__Impl ;
    public final void rule__SubExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4769:1: ( rule__SubExpression__Group_1_1__1__Impl )
            // InternalKEffects.g:4770:2: rule__SubExpression__Group_1_1__1__Impl
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
    // InternalKEffects.g:4776:1: rule__SubExpression__Group_1_1__1__Impl : ( ( rule__SubExpression__SubExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__SubExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4780:1: ( ( ( rule__SubExpression__SubExpressionsAssignment_1_1_1 ) ) )
            // InternalKEffects.g:4781:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_1_1 ) )
            {
            // InternalKEffects.g:4781:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_1_1 ) )
            // InternalKEffects.g:4782:1: ( rule__SubExpression__SubExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }
            // InternalKEffects.g:4783:1: ( rule__SubExpression__SubExpressionsAssignment_1_1_1 )
            // InternalKEffects.g:4783:2: rule__SubExpression__SubExpressionsAssignment_1_1_1
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


    // $ANTLR start "rule__MultExpression__Group__0"
    // InternalKEffects.g:4797:1: rule__MultExpression__Group__0 : rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 ;
    public final void rule__MultExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4801:1: ( rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 )
            // InternalKEffects.g:4802:2: rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_33);
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
    // InternalKEffects.g:4809:1: rule__MultExpression__Group__0__Impl : ( ruleDivExpression ) ;
    public final void rule__MultExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4813:1: ( ( ruleDivExpression ) )
            // InternalKEffects.g:4814:1: ( ruleDivExpression )
            {
            // InternalKEffects.g:4814:1: ( ruleDivExpression )
            // InternalKEffects.g:4815:1: ruleDivExpression
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
    // InternalKEffects.g:4826:1: rule__MultExpression__Group__1 : rule__MultExpression__Group__1__Impl ;
    public final void rule__MultExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4830:1: ( rule__MultExpression__Group__1__Impl )
            // InternalKEffects.g:4831:2: rule__MultExpression__Group__1__Impl
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
    // InternalKEffects.g:4837:1: rule__MultExpression__Group__1__Impl : ( ( rule__MultExpression__Group_1__0 )? ) ;
    public final void rule__MultExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4841:1: ( ( ( rule__MultExpression__Group_1__0 )? ) )
            // InternalKEffects.g:4842:1: ( ( rule__MultExpression__Group_1__0 )? )
            {
            // InternalKEffects.g:4842:1: ( ( rule__MultExpression__Group_1__0 )? )
            // InternalKEffects.g:4843:1: ( rule__MultExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getGroup_1()); 
            }
            // InternalKEffects.g:4844:1: ( rule__MultExpression__Group_1__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==22) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalKEffects.g:4844:2: rule__MultExpression__Group_1__0
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
    // InternalKEffects.g:4858:1: rule__MultExpression__Group_1__0 : rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 ;
    public final void rule__MultExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4862:1: ( rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 )
            // InternalKEffects.g:4863:2: rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_33);
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
    // InternalKEffects.g:4870:1: rule__MultExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4874:1: ( ( () ) )
            // InternalKEffects.g:4875:1: ( () )
            {
            // InternalKEffects.g:4875:1: ( () )
            // InternalKEffects.g:4876:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKEffects.g:4877:1: ()
            // InternalKEffects.g:4879:1: 
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
    // InternalKEffects.g:4889:1: rule__MultExpression__Group_1__1 : rule__MultExpression__Group_1__1__Impl ;
    public final void rule__MultExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4893:1: ( rule__MultExpression__Group_1__1__Impl )
            // InternalKEffects.g:4894:2: rule__MultExpression__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalKEffects.g:4900:1: rule__MultExpression__Group_1__1__Impl : ( ( ( rule__MultExpression__Group_1_1__0 ) ) ( ( rule__MultExpression__Group_1_1__0 )* ) ) ;
    public final void rule__MultExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4904:1: ( ( ( ( rule__MultExpression__Group_1_1__0 ) ) ( ( rule__MultExpression__Group_1_1__0 )* ) ) )
            // InternalKEffects.g:4905:1: ( ( ( rule__MultExpression__Group_1_1__0 ) ) ( ( rule__MultExpression__Group_1_1__0 )* ) )
            {
            // InternalKEffects.g:4905:1: ( ( ( rule__MultExpression__Group_1_1__0 ) ) ( ( rule__MultExpression__Group_1_1__0 )* ) )
            // InternalKEffects.g:4906:1: ( ( rule__MultExpression__Group_1_1__0 ) ) ( ( rule__MultExpression__Group_1_1__0 )* )
            {
            // InternalKEffects.g:4906:1: ( ( rule__MultExpression__Group_1_1__0 ) )
            // InternalKEffects.g:4907:1: ( rule__MultExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getGroup_1_1()); 
            }
            // InternalKEffects.g:4908:1: ( rule__MultExpression__Group_1_1__0 )
            // InternalKEffects.g:4908:2: rule__MultExpression__Group_1_1__0
            {
            pushFollow(FollowSets000.FOLLOW_34);
            rule__MultExpression__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultExpressionAccess().getGroup_1_1()); 
            }

            }

            // InternalKEffects.g:4911:1: ( ( rule__MultExpression__Group_1_1__0 )* )
            // InternalKEffects.g:4912:1: ( rule__MultExpression__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getGroup_1_1()); 
            }
            // InternalKEffects.g:4913:1: ( rule__MultExpression__Group_1_1__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==22) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalKEffects.g:4913:2: rule__MultExpression__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_34);
            	    rule__MultExpression__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultExpressionAccess().getGroup_1_1()); 
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
    // $ANTLR end "rule__MultExpression__Group_1__1__Impl"


    // $ANTLR start "rule__MultExpression__Group_1_1__0"
    // InternalKEffects.g:4928:1: rule__MultExpression__Group_1_1__0 : rule__MultExpression__Group_1_1__0__Impl rule__MultExpression__Group_1_1__1 ;
    public final void rule__MultExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4932:1: ( rule__MultExpression__Group_1_1__0__Impl rule__MultExpression__Group_1_1__1 )
            // InternalKEffects.g:4933:2: rule__MultExpression__Group_1_1__0__Impl rule__MultExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_30);
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
    // InternalKEffects.g:4940:1: rule__MultExpression__Group_1_1__0__Impl : ( ( rule__MultExpression__OperatorAssignment_1_1_0 ) ) ;
    public final void rule__MultExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4944:1: ( ( ( rule__MultExpression__OperatorAssignment_1_1_0 ) ) )
            // InternalKEffects.g:4945:1: ( ( rule__MultExpression__OperatorAssignment_1_1_0 ) )
            {
            // InternalKEffects.g:4945:1: ( ( rule__MultExpression__OperatorAssignment_1_1_0 ) )
            // InternalKEffects.g:4946:1: ( rule__MultExpression__OperatorAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorAssignment_1_1_0()); 
            }
            // InternalKEffects.g:4947:1: ( rule__MultExpression__OperatorAssignment_1_1_0 )
            // InternalKEffects.g:4947:2: rule__MultExpression__OperatorAssignment_1_1_0
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
    // InternalKEffects.g:4957:1: rule__MultExpression__Group_1_1__1 : rule__MultExpression__Group_1_1__1__Impl ;
    public final void rule__MultExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4961:1: ( rule__MultExpression__Group_1_1__1__Impl )
            // InternalKEffects.g:4962:2: rule__MultExpression__Group_1_1__1__Impl
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
    // InternalKEffects.g:4968:1: rule__MultExpression__Group_1_1__1__Impl : ( ( rule__MultExpression__SubExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__MultExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4972:1: ( ( ( rule__MultExpression__SubExpressionsAssignment_1_1_1 ) ) )
            // InternalKEffects.g:4973:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_1_1 ) )
            {
            // InternalKEffects.g:4973:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_1_1 ) )
            // InternalKEffects.g:4974:1: ( rule__MultExpression__SubExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }
            // InternalKEffects.g:4975:1: ( rule__MultExpression__SubExpressionsAssignment_1_1_1 )
            // InternalKEffects.g:4975:2: rule__MultExpression__SubExpressionsAssignment_1_1_1
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


    // $ANTLR start "rule__DivExpression__Group__0"
    // InternalKEffects.g:4989:1: rule__DivExpression__Group__0 : rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1 ;
    public final void rule__DivExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4993:1: ( rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1 )
            // InternalKEffects.g:4994:2: rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_35);
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
    // InternalKEffects.g:5001:1: rule__DivExpression__Group__0__Impl : ( ruleModExpression ) ;
    public final void rule__DivExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5005:1: ( ( ruleModExpression ) )
            // InternalKEffects.g:5006:1: ( ruleModExpression )
            {
            // InternalKEffects.g:5006:1: ( ruleModExpression )
            // InternalKEffects.g:5007:1: ruleModExpression
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
    // InternalKEffects.g:5018:1: rule__DivExpression__Group__1 : rule__DivExpression__Group__1__Impl ;
    public final void rule__DivExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5022:1: ( rule__DivExpression__Group__1__Impl )
            // InternalKEffects.g:5023:2: rule__DivExpression__Group__1__Impl
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
    // InternalKEffects.g:5029:1: rule__DivExpression__Group__1__Impl : ( ( rule__DivExpression__Group_1__0 )? ) ;
    public final void rule__DivExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5033:1: ( ( ( rule__DivExpression__Group_1__0 )? ) )
            // InternalKEffects.g:5034:1: ( ( rule__DivExpression__Group_1__0 )? )
            {
            // InternalKEffects.g:5034:1: ( ( rule__DivExpression__Group_1__0 )? )
            // InternalKEffects.g:5035:1: ( rule__DivExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getGroup_1()); 
            }
            // InternalKEffects.g:5036:1: ( rule__DivExpression__Group_1__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==24) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalKEffects.g:5036:2: rule__DivExpression__Group_1__0
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
    // InternalKEffects.g:5050:1: rule__DivExpression__Group_1__0 : rule__DivExpression__Group_1__0__Impl rule__DivExpression__Group_1__1 ;
    public final void rule__DivExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5054:1: ( rule__DivExpression__Group_1__0__Impl rule__DivExpression__Group_1__1 )
            // InternalKEffects.g:5055:2: rule__DivExpression__Group_1__0__Impl rule__DivExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_35);
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
    // InternalKEffects.g:5062:1: rule__DivExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__DivExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5066:1: ( ( () ) )
            // InternalKEffects.g:5067:1: ( () )
            {
            // InternalKEffects.g:5067:1: ( () )
            // InternalKEffects.g:5068:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKEffects.g:5069:1: ()
            // InternalKEffects.g:5071:1: 
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
    // InternalKEffects.g:5081:1: rule__DivExpression__Group_1__1 : rule__DivExpression__Group_1__1__Impl ;
    public final void rule__DivExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5085:1: ( rule__DivExpression__Group_1__1__Impl )
            // InternalKEffects.g:5086:2: rule__DivExpression__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DivExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalKEffects.g:5092:1: rule__DivExpression__Group_1__1__Impl : ( ( ( rule__DivExpression__Group_1_1__0 ) ) ( ( rule__DivExpression__Group_1_1__0 )* ) ) ;
    public final void rule__DivExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5096:1: ( ( ( ( rule__DivExpression__Group_1_1__0 ) ) ( ( rule__DivExpression__Group_1_1__0 )* ) ) )
            // InternalKEffects.g:5097:1: ( ( ( rule__DivExpression__Group_1_1__0 ) ) ( ( rule__DivExpression__Group_1_1__0 )* ) )
            {
            // InternalKEffects.g:5097:1: ( ( ( rule__DivExpression__Group_1_1__0 ) ) ( ( rule__DivExpression__Group_1_1__0 )* ) )
            // InternalKEffects.g:5098:1: ( ( rule__DivExpression__Group_1_1__0 ) ) ( ( rule__DivExpression__Group_1_1__0 )* )
            {
            // InternalKEffects.g:5098:1: ( ( rule__DivExpression__Group_1_1__0 ) )
            // InternalKEffects.g:5099:1: ( rule__DivExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getGroup_1_1()); 
            }
            // InternalKEffects.g:5100:1: ( rule__DivExpression__Group_1_1__0 )
            // InternalKEffects.g:5100:2: rule__DivExpression__Group_1_1__0
            {
            pushFollow(FollowSets000.FOLLOW_36);
            rule__DivExpression__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivExpressionAccess().getGroup_1_1()); 
            }

            }

            // InternalKEffects.g:5103:1: ( ( rule__DivExpression__Group_1_1__0 )* )
            // InternalKEffects.g:5104:1: ( rule__DivExpression__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getGroup_1_1()); 
            }
            // InternalKEffects.g:5105:1: ( rule__DivExpression__Group_1_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==24) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalKEffects.g:5105:2: rule__DivExpression__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_36);
            	    rule__DivExpression__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivExpressionAccess().getGroup_1_1()); 
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
    // $ANTLR end "rule__DivExpression__Group_1__1__Impl"


    // $ANTLR start "rule__DivExpression__Group_1_1__0"
    // InternalKEffects.g:5120:1: rule__DivExpression__Group_1_1__0 : rule__DivExpression__Group_1_1__0__Impl rule__DivExpression__Group_1_1__1 ;
    public final void rule__DivExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5124:1: ( rule__DivExpression__Group_1_1__0__Impl rule__DivExpression__Group_1_1__1 )
            // InternalKEffects.g:5125:2: rule__DivExpression__Group_1_1__0__Impl rule__DivExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_30);
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
    // InternalKEffects.g:5132:1: rule__DivExpression__Group_1_1__0__Impl : ( ( rule__DivExpression__OperatorAssignment_1_1_0 ) ) ;
    public final void rule__DivExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5136:1: ( ( ( rule__DivExpression__OperatorAssignment_1_1_0 ) ) )
            // InternalKEffects.g:5137:1: ( ( rule__DivExpression__OperatorAssignment_1_1_0 ) )
            {
            // InternalKEffects.g:5137:1: ( ( rule__DivExpression__OperatorAssignment_1_1_0 ) )
            // InternalKEffects.g:5138:1: ( rule__DivExpression__OperatorAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorAssignment_1_1_0()); 
            }
            // InternalKEffects.g:5139:1: ( rule__DivExpression__OperatorAssignment_1_1_0 )
            // InternalKEffects.g:5139:2: rule__DivExpression__OperatorAssignment_1_1_0
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
    // InternalKEffects.g:5149:1: rule__DivExpression__Group_1_1__1 : rule__DivExpression__Group_1_1__1__Impl ;
    public final void rule__DivExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5153:1: ( rule__DivExpression__Group_1_1__1__Impl )
            // InternalKEffects.g:5154:2: rule__DivExpression__Group_1_1__1__Impl
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
    // InternalKEffects.g:5160:1: rule__DivExpression__Group_1_1__1__Impl : ( ( rule__DivExpression__SubExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__DivExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5164:1: ( ( ( rule__DivExpression__SubExpressionsAssignment_1_1_1 ) ) )
            // InternalKEffects.g:5165:1: ( ( rule__DivExpression__SubExpressionsAssignment_1_1_1 ) )
            {
            // InternalKEffects.g:5165:1: ( ( rule__DivExpression__SubExpressionsAssignment_1_1_1 ) )
            // InternalKEffects.g:5166:1: ( rule__DivExpression__SubExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }
            // InternalKEffects.g:5167:1: ( rule__DivExpression__SubExpressionsAssignment_1_1_1 )
            // InternalKEffects.g:5167:2: rule__DivExpression__SubExpressionsAssignment_1_1_1
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


    // $ANTLR start "rule__ModExpression__Group__0"
    // InternalKEffects.g:5181:1: rule__ModExpression__Group__0 : rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1 ;
    public final void rule__ModExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5185:1: ( rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1 )
            // InternalKEffects.g:5186:2: rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_37);
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
    // InternalKEffects.g:5193:1: rule__ModExpression__Group__0__Impl : ( ruleNegExpression ) ;
    public final void rule__ModExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5197:1: ( ( ruleNegExpression ) )
            // InternalKEffects.g:5198:1: ( ruleNegExpression )
            {
            // InternalKEffects.g:5198:1: ( ruleNegExpression )
            // InternalKEffects.g:5199:1: ruleNegExpression
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
    // InternalKEffects.g:5210:1: rule__ModExpression__Group__1 : rule__ModExpression__Group__1__Impl ;
    public final void rule__ModExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5214:1: ( rule__ModExpression__Group__1__Impl )
            // InternalKEffects.g:5215:2: rule__ModExpression__Group__1__Impl
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
    // InternalKEffects.g:5221:1: rule__ModExpression__Group__1__Impl : ( ( rule__ModExpression__Group_1__0 )? ) ;
    public final void rule__ModExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5225:1: ( ( ( rule__ModExpression__Group_1__0 )? ) )
            // InternalKEffects.g:5226:1: ( ( rule__ModExpression__Group_1__0 )? )
            {
            // InternalKEffects.g:5226:1: ( ( rule__ModExpression__Group_1__0 )? )
            // InternalKEffects.g:5227:1: ( rule__ModExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getGroup_1()); 
            }
            // InternalKEffects.g:5228:1: ( rule__ModExpression__Group_1__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==23) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalKEffects.g:5228:2: rule__ModExpression__Group_1__0
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
    // InternalKEffects.g:5242:1: rule__ModExpression__Group_1__0 : rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1 ;
    public final void rule__ModExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5246:1: ( rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1 )
            // InternalKEffects.g:5247:2: rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_37);
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
    // InternalKEffects.g:5254:1: rule__ModExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ModExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5258:1: ( ( () ) )
            // InternalKEffects.g:5259:1: ( () )
            {
            // InternalKEffects.g:5259:1: ( () )
            // InternalKEffects.g:5260:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKEffects.g:5261:1: ()
            // InternalKEffects.g:5263:1: 
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
    // InternalKEffects.g:5273:1: rule__ModExpression__Group_1__1 : rule__ModExpression__Group_1__1__Impl ;
    public final void rule__ModExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5277:1: ( rule__ModExpression__Group_1__1__Impl )
            // InternalKEffects.g:5278:2: rule__ModExpression__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ModExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalKEffects.g:5284:1: rule__ModExpression__Group_1__1__Impl : ( ( ( rule__ModExpression__Group_1_1__0 ) ) ( ( rule__ModExpression__Group_1_1__0 )* ) ) ;
    public final void rule__ModExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5288:1: ( ( ( ( rule__ModExpression__Group_1_1__0 ) ) ( ( rule__ModExpression__Group_1_1__0 )* ) ) )
            // InternalKEffects.g:5289:1: ( ( ( rule__ModExpression__Group_1_1__0 ) ) ( ( rule__ModExpression__Group_1_1__0 )* ) )
            {
            // InternalKEffects.g:5289:1: ( ( ( rule__ModExpression__Group_1_1__0 ) ) ( ( rule__ModExpression__Group_1_1__0 )* ) )
            // InternalKEffects.g:5290:1: ( ( rule__ModExpression__Group_1_1__0 ) ) ( ( rule__ModExpression__Group_1_1__0 )* )
            {
            // InternalKEffects.g:5290:1: ( ( rule__ModExpression__Group_1_1__0 ) )
            // InternalKEffects.g:5291:1: ( rule__ModExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getGroup_1_1()); 
            }
            // InternalKEffects.g:5292:1: ( rule__ModExpression__Group_1_1__0 )
            // InternalKEffects.g:5292:2: rule__ModExpression__Group_1_1__0
            {
            pushFollow(FollowSets000.FOLLOW_38);
            rule__ModExpression__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModExpressionAccess().getGroup_1_1()); 
            }

            }

            // InternalKEffects.g:5295:1: ( ( rule__ModExpression__Group_1_1__0 )* )
            // InternalKEffects.g:5296:1: ( rule__ModExpression__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getGroup_1_1()); 
            }
            // InternalKEffects.g:5297:1: ( rule__ModExpression__Group_1_1__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==23) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalKEffects.g:5297:2: rule__ModExpression__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_38);
            	    rule__ModExpression__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModExpressionAccess().getGroup_1_1()); 
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
    // $ANTLR end "rule__ModExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ModExpression__Group_1_1__0"
    // InternalKEffects.g:5312:1: rule__ModExpression__Group_1_1__0 : rule__ModExpression__Group_1_1__0__Impl rule__ModExpression__Group_1_1__1 ;
    public final void rule__ModExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5316:1: ( rule__ModExpression__Group_1_1__0__Impl rule__ModExpression__Group_1_1__1 )
            // InternalKEffects.g:5317:2: rule__ModExpression__Group_1_1__0__Impl rule__ModExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_30);
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
    // InternalKEffects.g:5324:1: rule__ModExpression__Group_1_1__0__Impl : ( ( rule__ModExpression__OperatorAssignment_1_1_0 ) ) ;
    public final void rule__ModExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5328:1: ( ( ( rule__ModExpression__OperatorAssignment_1_1_0 ) ) )
            // InternalKEffects.g:5329:1: ( ( rule__ModExpression__OperatorAssignment_1_1_0 ) )
            {
            // InternalKEffects.g:5329:1: ( ( rule__ModExpression__OperatorAssignment_1_1_0 ) )
            // InternalKEffects.g:5330:1: ( rule__ModExpression__OperatorAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorAssignment_1_1_0()); 
            }
            // InternalKEffects.g:5331:1: ( rule__ModExpression__OperatorAssignment_1_1_0 )
            // InternalKEffects.g:5331:2: rule__ModExpression__OperatorAssignment_1_1_0
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
    // InternalKEffects.g:5341:1: rule__ModExpression__Group_1_1__1 : rule__ModExpression__Group_1_1__1__Impl ;
    public final void rule__ModExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5345:1: ( rule__ModExpression__Group_1_1__1__Impl )
            // InternalKEffects.g:5346:2: rule__ModExpression__Group_1_1__1__Impl
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
    // InternalKEffects.g:5352:1: rule__ModExpression__Group_1_1__1__Impl : ( ( rule__ModExpression__SubExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__ModExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5356:1: ( ( ( rule__ModExpression__SubExpressionsAssignment_1_1_1 ) ) )
            // InternalKEffects.g:5357:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_1_1 ) )
            {
            // InternalKEffects.g:5357:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_1_1 ) )
            // InternalKEffects.g:5358:1: ( rule__ModExpression__SubExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }
            // InternalKEffects.g:5359:1: ( rule__ModExpression__SubExpressionsAssignment_1_1_1 )
            // InternalKEffects.g:5359:2: rule__ModExpression__SubExpressionsAssignment_1_1_1
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


    // $ANTLR start "rule__NegExpression__Group_0__0"
    // InternalKEffects.g:5373:1: rule__NegExpression__Group_0__0 : rule__NegExpression__Group_0__0__Impl rule__NegExpression__Group_0__1 ;
    public final void rule__NegExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5377:1: ( rule__NegExpression__Group_0__0__Impl rule__NegExpression__Group_0__1 )
            // InternalKEffects.g:5378:2: rule__NegExpression__Group_0__0__Impl rule__NegExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_31);
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
    // InternalKEffects.g:5385:1: rule__NegExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__NegExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5389:1: ( ( () ) )
            // InternalKEffects.g:5390:1: ( () )
            {
            // InternalKEffects.g:5390:1: ( () )
            // InternalKEffects.g:5391:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // InternalKEffects.g:5392:1: ()
            // InternalKEffects.g:5394:1: 
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
    // InternalKEffects.g:5404:1: rule__NegExpression__Group_0__1 : rule__NegExpression__Group_0__1__Impl rule__NegExpression__Group_0__2 ;
    public final void rule__NegExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5408:1: ( rule__NegExpression__Group_0__1__Impl rule__NegExpression__Group_0__2 )
            // InternalKEffects.g:5409:2: rule__NegExpression__Group_0__1__Impl rule__NegExpression__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_30);
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
    // InternalKEffects.g:5416:1: rule__NegExpression__Group_0__1__Impl : ( ( rule__NegExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__NegExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5420:1: ( ( ( rule__NegExpression__OperatorAssignment_0_1 ) ) )
            // InternalKEffects.g:5421:1: ( ( rule__NegExpression__OperatorAssignment_0_1 ) )
            {
            // InternalKEffects.g:5421:1: ( ( rule__NegExpression__OperatorAssignment_0_1 ) )
            // InternalKEffects.g:5422:1: ( rule__NegExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // InternalKEffects.g:5423:1: ( rule__NegExpression__OperatorAssignment_0_1 )
            // InternalKEffects.g:5423:2: rule__NegExpression__OperatorAssignment_0_1
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
    // InternalKEffects.g:5433:1: rule__NegExpression__Group_0__2 : rule__NegExpression__Group_0__2__Impl ;
    public final void rule__NegExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5437:1: ( rule__NegExpression__Group_0__2__Impl )
            // InternalKEffects.g:5438:2: rule__NegExpression__Group_0__2__Impl
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
    // InternalKEffects.g:5444:1: rule__NegExpression__Group_0__2__Impl : ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) ) ;
    public final void rule__NegExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5448:1: ( ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) ) )
            // InternalKEffects.g:5449:1: ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) )
            {
            // InternalKEffects.g:5449:1: ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) )
            // InternalKEffects.g:5450:1: ( rule__NegExpression__SubExpressionsAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getSubExpressionsAssignment_0_2()); 
            }
            // InternalKEffects.g:5451:1: ( rule__NegExpression__SubExpressionsAssignment_0_2 )
            // InternalKEffects.g:5451:2: rule__NegExpression__SubExpressionsAssignment_0_2
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
    // InternalKEffects.g:5467:1: rule__AtomicExpression__Group_2__0 : rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 ;
    public final void rule__AtomicExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5471:1: ( rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 )
            // InternalKEffects.g:5472:2: rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
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
    // InternalKEffects.g:5479:1: rule__AtomicExpression__Group_2__0__Impl : ( '(' ) ;
    public final void rule__AtomicExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5483:1: ( ( '(' ) )
            // InternalKEffects.g:5484:1: ( '(' )
            {
            // InternalKEffects.g:5484:1: ( '(' )
            // InternalKEffects.g:5485:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:5498:1: rule__AtomicExpression__Group_2__1 : rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2 ;
    public final void rule__AtomicExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5502:1: ( rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2 )
            // InternalKEffects.g:5503:2: rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_7);
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
    // InternalKEffects.g:5510:1: rule__AtomicExpression__Group_2__1__Impl : ( ruleBoolExpression ) ;
    public final void rule__AtomicExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5514:1: ( ( ruleBoolExpression ) )
            // InternalKEffects.g:5515:1: ( ruleBoolExpression )
            {
            // InternalKEffects.g:5515:1: ( ruleBoolExpression )
            // InternalKEffects.g:5516:1: ruleBoolExpression
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
    // InternalKEffects.g:5527:1: rule__AtomicExpression__Group_2__2 : rule__AtomicExpression__Group_2__2__Impl ;
    public final void rule__AtomicExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5531:1: ( rule__AtomicExpression__Group_2__2__Impl )
            // InternalKEffects.g:5532:2: rule__AtomicExpression__Group_2__2__Impl
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
    // InternalKEffects.g:5538:1: rule__AtomicExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__AtomicExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5542:1: ( ( ')' ) )
            // InternalKEffects.g:5543:1: ( ')' )
            {
            // InternalKEffects.g:5543:1: ( ')' )
            // InternalKEffects.g:5544:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:5563:1: rule__AtomicValuedExpression__Group_3__0 : rule__AtomicValuedExpression__Group_3__0__Impl rule__AtomicValuedExpression__Group_3__1 ;
    public final void rule__AtomicValuedExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5567:1: ( rule__AtomicValuedExpression__Group_3__0__Impl rule__AtomicValuedExpression__Group_3__1 )
            // InternalKEffects.g:5568:2: rule__AtomicValuedExpression__Group_3__0__Impl rule__AtomicValuedExpression__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_30);
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
    // InternalKEffects.g:5575:1: rule__AtomicValuedExpression__Group_3__0__Impl : ( '(' ) ;
    public final void rule__AtomicValuedExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5579:1: ( ( '(' ) )
            // InternalKEffects.g:5580:1: ( '(' )
            {
            // InternalKEffects.g:5580:1: ( '(' )
            // InternalKEffects.g:5581:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:5594:1: rule__AtomicValuedExpression__Group_3__1 : rule__AtomicValuedExpression__Group_3__1__Impl rule__AtomicValuedExpression__Group_3__2 ;
    public final void rule__AtomicValuedExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5598:1: ( rule__AtomicValuedExpression__Group_3__1__Impl rule__AtomicValuedExpression__Group_3__2 )
            // InternalKEffects.g:5599:2: rule__AtomicValuedExpression__Group_3__1__Impl rule__AtomicValuedExpression__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_7);
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
    // InternalKEffects.g:5606:1: rule__AtomicValuedExpression__Group_3__1__Impl : ( ruleValuedExpression ) ;
    public final void rule__AtomicValuedExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5610:1: ( ( ruleValuedExpression ) )
            // InternalKEffects.g:5611:1: ( ruleValuedExpression )
            {
            // InternalKEffects.g:5611:1: ( ruleValuedExpression )
            // InternalKEffects.g:5612:1: ruleValuedExpression
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
    // InternalKEffects.g:5623:1: rule__AtomicValuedExpression__Group_3__2 : rule__AtomicValuedExpression__Group_3__2__Impl ;
    public final void rule__AtomicValuedExpression__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5627:1: ( rule__AtomicValuedExpression__Group_3__2__Impl )
            // InternalKEffects.g:5628:2: rule__AtomicValuedExpression__Group_3__2__Impl
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
    // InternalKEffects.g:5634:1: rule__AtomicValuedExpression__Group_3__2__Impl : ( ')' ) ;
    public final void rule__AtomicValuedExpression__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5638:1: ( ( ')' ) )
            // InternalKEffects.g:5639:1: ( ')' )
            {
            // InternalKEffects.g:5639:1: ( ')' )
            // InternalKEffects.g:5640:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:5659:1: rule__ValuedObjectTestExpression__Group_0__0 : rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1 ;
    public final void rule__ValuedObjectTestExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5663:1: ( rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1 )
            // InternalKEffects.g:5664:2: rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_39);
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
    // InternalKEffects.g:5671:1: rule__ValuedObjectTestExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5675:1: ( ( () ) )
            // InternalKEffects.g:5676:1: ( () )
            {
            // InternalKEffects.g:5676:1: ( () )
            // InternalKEffects.g:5677:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // InternalKEffects.g:5678:1: ()
            // InternalKEffects.g:5680:1: 
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
    // InternalKEffects.g:5690:1: rule__ValuedObjectTestExpression__Group_0__1 : rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2 ;
    public final void rule__ValuedObjectTestExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5694:1: ( rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2 )
            // InternalKEffects.g:5695:2: rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
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
    // InternalKEffects.g:5702:1: rule__ValuedObjectTestExpression__Group_0__1__Impl : ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5706:1: ( ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) ) )
            // InternalKEffects.g:5707:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) )
            {
            // InternalKEffects.g:5707:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) )
            // InternalKEffects.g:5708:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // InternalKEffects.g:5709:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 )
            // InternalKEffects.g:5709:2: rule__ValuedObjectTestExpression__OperatorAssignment_0_1
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
    // InternalKEffects.g:5719:1: rule__ValuedObjectTestExpression__Group_0__2 : rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3 ;
    public final void rule__ValuedObjectTestExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5723:1: ( rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3 )
            // InternalKEffects.g:5724:2: rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3
            {
            pushFollow(FollowSets000.FOLLOW_40);
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
    // InternalKEffects.g:5731:1: rule__ValuedObjectTestExpression__Group_0__2__Impl : ( '(' ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5735:1: ( ( '(' ) )
            // InternalKEffects.g:5736:1: ( '(' )
            {
            // InternalKEffects.g:5736:1: ( '(' )
            // InternalKEffects.g:5737:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2()); 
            }
            match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:5750:1: rule__ValuedObjectTestExpression__Group_0__3 : rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4 ;
    public final void rule__ValuedObjectTestExpression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5754:1: ( rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4 )
            // InternalKEffects.g:5755:2: rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4
            {
            pushFollow(FollowSets000.FOLLOW_7);
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
    // InternalKEffects.g:5762:1: rule__ValuedObjectTestExpression__Group_0__3__Impl : ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5766:1: ( ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) ) )
            // InternalKEffects.g:5767:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) )
            {
            // InternalKEffects.g:5767:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) )
            // InternalKEffects.g:5768:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsAssignment_0_3()); 
            }
            // InternalKEffects.g:5769:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 )
            // InternalKEffects.g:5769:2: rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3
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
    // InternalKEffects.g:5779:1: rule__ValuedObjectTestExpression__Group_0__4 : rule__ValuedObjectTestExpression__Group_0__4__Impl ;
    public final void rule__ValuedObjectTestExpression__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5783:1: ( rule__ValuedObjectTestExpression__Group_0__4__Impl )
            // InternalKEffects.g:5784:2: rule__ValuedObjectTestExpression__Group_0__4__Impl
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
    // InternalKEffects.g:5790:1: rule__ValuedObjectTestExpression__Group_0__4__Impl : ( ')' ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5794:1: ( ( ')' ) )
            // InternalKEffects.g:5795:1: ( ')' )
            {
            // InternalKEffects.g:5795:1: ( ')' )
            // InternalKEffects.g:5796:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:5819:1: rule__ValuedObjectReference__Group__0 : rule__ValuedObjectReference__Group__0__Impl rule__ValuedObjectReference__Group__1 ;
    public final void rule__ValuedObjectReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5823:1: ( rule__ValuedObjectReference__Group__0__Impl rule__ValuedObjectReference__Group__1 )
            // InternalKEffects.g:5824:2: rule__ValuedObjectReference__Group__0__Impl rule__ValuedObjectReference__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_41);
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
    // InternalKEffects.g:5831:1: rule__ValuedObjectReference__Group__0__Impl : ( ( rule__ValuedObjectReference__ValuedObjectAssignment_0 ) ) ;
    public final void rule__ValuedObjectReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5835:1: ( ( ( rule__ValuedObjectReference__ValuedObjectAssignment_0 ) ) )
            // InternalKEffects.g:5836:1: ( ( rule__ValuedObjectReference__ValuedObjectAssignment_0 ) )
            {
            // InternalKEffects.g:5836:1: ( ( rule__ValuedObjectReference__ValuedObjectAssignment_0 ) )
            // InternalKEffects.g:5837:1: ( rule__ValuedObjectReference__ValuedObjectAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectAssignment_0()); 
            }
            // InternalKEffects.g:5838:1: ( rule__ValuedObjectReference__ValuedObjectAssignment_0 )
            // InternalKEffects.g:5838:2: rule__ValuedObjectReference__ValuedObjectAssignment_0
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
    // InternalKEffects.g:5848:1: rule__ValuedObjectReference__Group__1 : rule__ValuedObjectReference__Group__1__Impl ;
    public final void rule__ValuedObjectReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5852:1: ( rule__ValuedObjectReference__Group__1__Impl )
            // InternalKEffects.g:5853:2: rule__ValuedObjectReference__Group__1__Impl
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
    // InternalKEffects.g:5859:1: rule__ValuedObjectReference__Group__1__Impl : ( ( rule__ValuedObjectReference__Group_1__0 )* ) ;
    public final void rule__ValuedObjectReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5863:1: ( ( ( rule__ValuedObjectReference__Group_1__0 )* ) )
            // InternalKEffects.g:5864:1: ( ( rule__ValuedObjectReference__Group_1__0 )* )
            {
            // InternalKEffects.g:5864:1: ( ( rule__ValuedObjectReference__Group_1__0 )* )
            // InternalKEffects.g:5865:1: ( rule__ValuedObjectReference__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getGroup_1()); 
            }
            // InternalKEffects.g:5866:1: ( rule__ValuedObjectReference__Group_1__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==44) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalKEffects.g:5866:2: rule__ValuedObjectReference__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    rule__ValuedObjectReference__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop48;
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
    // InternalKEffects.g:5880:1: rule__ValuedObjectReference__Group_1__0 : rule__ValuedObjectReference__Group_1__0__Impl rule__ValuedObjectReference__Group_1__1 ;
    public final void rule__ValuedObjectReference__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5884:1: ( rule__ValuedObjectReference__Group_1__0__Impl rule__ValuedObjectReference__Group_1__1 )
            // InternalKEffects.g:5885:2: rule__ValuedObjectReference__Group_1__0__Impl rule__ValuedObjectReference__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
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
    // InternalKEffects.g:5892:1: rule__ValuedObjectReference__Group_1__0__Impl : ( '[' ) ;
    public final void rule__ValuedObjectReference__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5896:1: ( ( '[' ) )
            // InternalKEffects.g:5897:1: ( '[' )
            {
            // InternalKEffects.g:5897:1: ( '[' )
            // InternalKEffects.g:5898:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getLeftSquareBracketKeyword_1_0()); 
            }
            match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:5911:1: rule__ValuedObjectReference__Group_1__1 : rule__ValuedObjectReference__Group_1__1__Impl rule__ValuedObjectReference__Group_1__2 ;
    public final void rule__ValuedObjectReference__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5915:1: ( rule__ValuedObjectReference__Group_1__1__Impl rule__ValuedObjectReference__Group_1__2 )
            // InternalKEffects.g:5916:2: rule__ValuedObjectReference__Group_1__1__Impl rule__ValuedObjectReference__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_10);
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
    // InternalKEffects.g:5923:1: rule__ValuedObjectReference__Group_1__1__Impl : ( ( rule__ValuedObjectReference__IndicesAssignment_1_1 ) ) ;
    public final void rule__ValuedObjectReference__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5927:1: ( ( ( rule__ValuedObjectReference__IndicesAssignment_1_1 ) ) )
            // InternalKEffects.g:5928:1: ( ( rule__ValuedObjectReference__IndicesAssignment_1_1 ) )
            {
            // InternalKEffects.g:5928:1: ( ( rule__ValuedObjectReference__IndicesAssignment_1_1 ) )
            // InternalKEffects.g:5929:1: ( rule__ValuedObjectReference__IndicesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getIndicesAssignment_1_1()); 
            }
            // InternalKEffects.g:5930:1: ( rule__ValuedObjectReference__IndicesAssignment_1_1 )
            // InternalKEffects.g:5930:2: rule__ValuedObjectReference__IndicesAssignment_1_1
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
    // InternalKEffects.g:5940:1: rule__ValuedObjectReference__Group_1__2 : rule__ValuedObjectReference__Group_1__2__Impl ;
    public final void rule__ValuedObjectReference__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5944:1: ( rule__ValuedObjectReference__Group_1__2__Impl )
            // InternalKEffects.g:5945:2: rule__ValuedObjectReference__Group_1__2__Impl
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
    // InternalKEffects.g:5951:1: rule__ValuedObjectReference__Group_1__2__Impl : ( ']' ) ;
    public final void rule__ValuedObjectReference__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5955:1: ( ( ']' ) )
            // InternalKEffects.g:5956:1: ( ']' )
            {
            // InternalKEffects.g:5956:1: ( ']' )
            // InternalKEffects.g:5957:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getRightSquareBracketKeyword_1_2()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:5976:1: rule__FunctionCall__Group__0 : rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 ;
    public final void rule__FunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5980:1: ( rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 )
            // InternalKEffects.g:5981:2: rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
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
    // InternalKEffects.g:5988:1: rule__FunctionCall__Group__0__Impl : ( '<' ) ;
    public final void rule__FunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5992:1: ( ( '<' ) )
            // InternalKEffects.g:5993:1: ( '<' )
            {
            // InternalKEffects.g:5993:1: ( '<' )
            // InternalKEffects.g:5994:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getLessThanSignKeyword_0()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:6007:1: rule__FunctionCall__Group__1 : rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 ;
    public final void rule__FunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6011:1: ( rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 )
            // InternalKEffects.g:6012:2: rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_14);
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
    // InternalKEffects.g:6019:1: rule__FunctionCall__Group__1__Impl : ( ( rule__FunctionCall__FunctionNameAssignment_1 ) ) ;
    public final void rule__FunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6023:1: ( ( ( rule__FunctionCall__FunctionNameAssignment_1 ) ) )
            // InternalKEffects.g:6024:1: ( ( rule__FunctionCall__FunctionNameAssignment_1 ) )
            {
            // InternalKEffects.g:6024:1: ( ( rule__FunctionCall__FunctionNameAssignment_1 ) )
            // InternalKEffects.g:6025:1: ( rule__FunctionCall__FunctionNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFunctionNameAssignment_1()); 
            }
            // InternalKEffects.g:6026:1: ( rule__FunctionCall__FunctionNameAssignment_1 )
            // InternalKEffects.g:6026:2: rule__FunctionCall__FunctionNameAssignment_1
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
    // InternalKEffects.g:6036:1: rule__FunctionCall__Group__2 : rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 ;
    public final void rule__FunctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6040:1: ( rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 )
            // InternalKEffects.g:6041:2: rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_14);
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
    // InternalKEffects.g:6048:1: rule__FunctionCall__Group__2__Impl : ( ( rule__FunctionCall__Alternatives_2 )? ) ;
    public final void rule__FunctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6052:1: ( ( ( rule__FunctionCall__Alternatives_2 )? ) )
            // InternalKEffects.g:6053:1: ( ( rule__FunctionCall__Alternatives_2 )? )
            {
            // InternalKEffects.g:6053:1: ( ( rule__FunctionCall__Alternatives_2 )? )
            // InternalKEffects.g:6054:1: ( rule__FunctionCall__Alternatives_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getAlternatives_2()); 
            }
            // InternalKEffects.g:6055:1: ( rule__FunctionCall__Alternatives_2 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==28||LA49_0==42) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalKEffects.g:6055:2: rule__FunctionCall__Alternatives_2
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
    // InternalKEffects.g:6065:1: rule__FunctionCall__Group__3 : rule__FunctionCall__Group__3__Impl ;
    public final void rule__FunctionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6069:1: ( rule__FunctionCall__Group__3__Impl )
            // InternalKEffects.g:6070:2: rule__FunctionCall__Group__3__Impl
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
    // InternalKEffects.g:6076:1: rule__FunctionCall__Group__3__Impl : ( '>' ) ;
    public final void rule__FunctionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6080:1: ( ( '>' ) )
            // InternalKEffects.g:6081:1: ( '>' )
            {
            // InternalKEffects.g:6081:1: ( '>' )
            // InternalKEffects.g:6082:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGreaterThanSignKeyword_3()); 
            }
            match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:6103:1: rule__FunctionCall__Group_2_0__0 : rule__FunctionCall__Group_2_0__0__Impl rule__FunctionCall__Group_2_0__1 ;
    public final void rule__FunctionCall__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6107:1: ( rule__FunctionCall__Group_2_0__0__Impl rule__FunctionCall__Group_2_0__1 )
            // InternalKEffects.g:6108:2: rule__FunctionCall__Group_2_0__0__Impl rule__FunctionCall__Group_2_0__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
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
    // InternalKEffects.g:6115:1: rule__FunctionCall__Group_2_0__0__Impl : ( '(' ) ;
    public final void rule__FunctionCall__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6119:1: ( ( '(' ) )
            // InternalKEffects.g:6120:1: ( '(' )
            {
            // InternalKEffects.g:6120:1: ( '(' )
            // InternalKEffects.g:6121:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2_0_0()); 
            }
            match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:6134:1: rule__FunctionCall__Group_2_0__1 : rule__FunctionCall__Group_2_0__1__Impl rule__FunctionCall__Group_2_0__2 ;
    public final void rule__FunctionCall__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6138:1: ( rule__FunctionCall__Group_2_0__1__Impl rule__FunctionCall__Group_2_0__2 )
            // InternalKEffects.g:6139:2: rule__FunctionCall__Group_2_0__1__Impl rule__FunctionCall__Group_2_0__2
            {
            pushFollow(FollowSets000.FOLLOW_16);
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
    // InternalKEffects.g:6146:1: rule__FunctionCall__Group_2_0__1__Impl : ( ( rule__FunctionCall__ParametersAssignment_2_0_1 ) ) ;
    public final void rule__FunctionCall__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6150:1: ( ( ( rule__FunctionCall__ParametersAssignment_2_0_1 ) ) )
            // InternalKEffects.g:6151:1: ( ( rule__FunctionCall__ParametersAssignment_2_0_1 ) )
            {
            // InternalKEffects.g:6151:1: ( ( rule__FunctionCall__ParametersAssignment_2_0_1 ) )
            // InternalKEffects.g:6152:1: ( rule__FunctionCall__ParametersAssignment_2_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getParametersAssignment_2_0_1()); 
            }
            // InternalKEffects.g:6153:1: ( rule__FunctionCall__ParametersAssignment_2_0_1 )
            // InternalKEffects.g:6153:2: rule__FunctionCall__ParametersAssignment_2_0_1
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
    // InternalKEffects.g:6163:1: rule__FunctionCall__Group_2_0__2 : rule__FunctionCall__Group_2_0__2__Impl rule__FunctionCall__Group_2_0__3 ;
    public final void rule__FunctionCall__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6167:1: ( rule__FunctionCall__Group_2_0__2__Impl rule__FunctionCall__Group_2_0__3 )
            // InternalKEffects.g:6168:2: rule__FunctionCall__Group_2_0__2__Impl rule__FunctionCall__Group_2_0__3
            {
            pushFollow(FollowSets000.FOLLOW_16);
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
    // InternalKEffects.g:6175:1: rule__FunctionCall__Group_2_0__2__Impl : ( ( rule__FunctionCall__Group_2_0_2__0 )* ) ;
    public final void rule__FunctionCall__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6179:1: ( ( ( rule__FunctionCall__Group_2_0_2__0 )* ) )
            // InternalKEffects.g:6180:1: ( ( rule__FunctionCall__Group_2_0_2__0 )* )
            {
            // InternalKEffects.g:6180:1: ( ( rule__FunctionCall__Group_2_0_2__0 )* )
            // InternalKEffects.g:6181:1: ( rule__FunctionCall__Group_2_0_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGroup_2_0_2()); 
            }
            // InternalKEffects.g:6182:1: ( rule__FunctionCall__Group_2_0_2__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==46) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalKEffects.g:6182:2: rule__FunctionCall__Group_2_0_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_17);
            	    rule__FunctionCall__Group_2_0_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop50;
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
    // InternalKEffects.g:6192:1: rule__FunctionCall__Group_2_0__3 : rule__FunctionCall__Group_2_0__3__Impl ;
    public final void rule__FunctionCall__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6196:1: ( rule__FunctionCall__Group_2_0__3__Impl )
            // InternalKEffects.g:6197:2: rule__FunctionCall__Group_2_0__3__Impl
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
    // InternalKEffects.g:6203:1: rule__FunctionCall__Group_2_0__3__Impl : ( ')' ) ;
    public final void rule__FunctionCall__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6207:1: ( ( ')' ) )
            // InternalKEffects.g:6208:1: ( ')' )
            {
            // InternalKEffects.g:6208:1: ( ')' )
            // InternalKEffects.g:6209:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_2_0_3()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:6230:1: rule__FunctionCall__Group_2_0_2__0 : rule__FunctionCall__Group_2_0_2__0__Impl rule__FunctionCall__Group_2_0_2__1 ;
    public final void rule__FunctionCall__Group_2_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6234:1: ( rule__FunctionCall__Group_2_0_2__0__Impl rule__FunctionCall__Group_2_0_2__1 )
            // InternalKEffects.g:6235:2: rule__FunctionCall__Group_2_0_2__0__Impl rule__FunctionCall__Group_2_0_2__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
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
    // InternalKEffects.g:6242:1: rule__FunctionCall__Group_2_0_2__0__Impl : ( ',' ) ;
    public final void rule__FunctionCall__Group_2_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6246:1: ( ( ',' ) )
            // InternalKEffects.g:6247:1: ( ',' )
            {
            // InternalKEffects.g:6247:1: ( ',' )
            // InternalKEffects.g:6248:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getCommaKeyword_2_0_2_0()); 
            }
            match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:6261:1: rule__FunctionCall__Group_2_0_2__1 : rule__FunctionCall__Group_2_0_2__1__Impl ;
    public final void rule__FunctionCall__Group_2_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6265:1: ( rule__FunctionCall__Group_2_0_2__1__Impl )
            // InternalKEffects.g:6266:2: rule__FunctionCall__Group_2_0_2__1__Impl
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
    // InternalKEffects.g:6272:1: rule__FunctionCall__Group_2_0_2__1__Impl : ( ( rule__FunctionCall__ParametersAssignment_2_0_2_1 ) ) ;
    public final void rule__FunctionCall__Group_2_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6276:1: ( ( ( rule__FunctionCall__ParametersAssignment_2_0_2_1 ) ) )
            // InternalKEffects.g:6277:1: ( ( rule__FunctionCall__ParametersAssignment_2_0_2_1 ) )
            {
            // InternalKEffects.g:6277:1: ( ( rule__FunctionCall__ParametersAssignment_2_0_2_1 ) )
            // InternalKEffects.g:6278:1: ( rule__FunctionCall__ParametersAssignment_2_0_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getParametersAssignment_2_0_2_1()); 
            }
            // InternalKEffects.g:6279:1: ( rule__FunctionCall__ParametersAssignment_2_0_2_1 )
            // InternalKEffects.g:6279:2: rule__FunctionCall__ParametersAssignment_2_0_2_1
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
    // InternalKEffects.g:6293:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6297:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalKEffects.g:6298:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
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
    // InternalKEffects.g:6305:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__Group_0__0 )? ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6309:1: ( ( ( rule__Parameter__Group_0__0 )? ) )
            // InternalKEffects.g:6310:1: ( ( rule__Parameter__Group_0__0 )? )
            {
            // InternalKEffects.g:6310:1: ( ( rule__Parameter__Group_0__0 )? )
            // InternalKEffects.g:6311:1: ( rule__Parameter__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getGroup_0()); 
            }
            // InternalKEffects.g:6312:1: ( rule__Parameter__Group_0__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==19) ) {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==18) ) {
                    alt51=1;
                }
            }
            else if ( (LA51_0==18) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalKEffects.g:6312:2: rule__Parameter__Group_0__0
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
    // InternalKEffects.g:6322:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6326:1: ( rule__Parameter__Group__1__Impl )
            // InternalKEffects.g:6327:2: rule__Parameter__Group__1__Impl
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
    // InternalKEffects.g:6333:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__ExpressionAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6337:1: ( ( ( rule__Parameter__ExpressionAssignment_1 ) ) )
            // InternalKEffects.g:6338:1: ( ( rule__Parameter__ExpressionAssignment_1 ) )
            {
            // InternalKEffects.g:6338:1: ( ( rule__Parameter__ExpressionAssignment_1 ) )
            // InternalKEffects.g:6339:1: ( rule__Parameter__ExpressionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getExpressionAssignment_1()); 
            }
            // InternalKEffects.g:6340:1: ( rule__Parameter__ExpressionAssignment_1 )
            // InternalKEffects.g:6340:2: rule__Parameter__ExpressionAssignment_1
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
    // InternalKEffects.g:6354:1: rule__Parameter__Group_0__0 : rule__Parameter__Group_0__0__Impl rule__Parameter__Group_0__1 ;
    public final void rule__Parameter__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6358:1: ( rule__Parameter__Group_0__0__Impl rule__Parameter__Group_0__1 )
            // InternalKEffects.g:6359:2: rule__Parameter__Group_0__0__Impl rule__Parameter__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_42);
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
    // InternalKEffects.g:6366:1: rule__Parameter__Group_0__0__Impl : ( ( rule__Parameter__PureOutputAssignment_0_0 )? ) ;
    public final void rule__Parameter__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6370:1: ( ( ( rule__Parameter__PureOutputAssignment_0_0 )? ) )
            // InternalKEffects.g:6371:1: ( ( rule__Parameter__PureOutputAssignment_0_0 )? )
            {
            // InternalKEffects.g:6371:1: ( ( rule__Parameter__PureOutputAssignment_0_0 )? )
            // InternalKEffects.g:6372:1: ( rule__Parameter__PureOutputAssignment_0_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getPureOutputAssignment_0_0()); 
            }
            // InternalKEffects.g:6373:1: ( rule__Parameter__PureOutputAssignment_0_0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==19) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalKEffects.g:6373:2: rule__Parameter__PureOutputAssignment_0_0
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
    // InternalKEffects.g:6383:1: rule__Parameter__Group_0__1 : rule__Parameter__Group_0__1__Impl ;
    public final void rule__Parameter__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6387:1: ( rule__Parameter__Group_0__1__Impl )
            // InternalKEffects.g:6388:2: rule__Parameter__Group_0__1__Impl
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
    // InternalKEffects.g:6394:1: rule__Parameter__Group_0__1__Impl : ( ( rule__Parameter__CallByReferenceAssignment_0_1 ) ) ;
    public final void rule__Parameter__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6398:1: ( ( ( rule__Parameter__CallByReferenceAssignment_0_1 ) ) )
            // InternalKEffects.g:6399:1: ( ( rule__Parameter__CallByReferenceAssignment_0_1 ) )
            {
            // InternalKEffects.g:6399:1: ( ( rule__Parameter__CallByReferenceAssignment_0_1 ) )
            // InternalKEffects.g:6400:1: ( rule__Parameter__CallByReferenceAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getCallByReferenceAssignment_0_1()); 
            }
            // InternalKEffects.g:6401:1: ( rule__Parameter__CallByReferenceAssignment_0_1 )
            // InternalKEffects.g:6401:2: rule__Parameter__CallByReferenceAssignment_0_1
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
    // InternalKEffects.g:6415:1: rule__TagAnnotation__Group__0 : rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 ;
    public final void rule__TagAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6419:1: ( rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 )
            // InternalKEffects.g:6420:2: rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
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
    // InternalKEffects.g:6427:1: rule__TagAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TagAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6431:1: ( ( '@' ) )
            // InternalKEffects.g:6432:1: ( '@' )
            {
            // InternalKEffects.g:6432:1: ( '@' )
            // InternalKEffects.g:6433:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:6446:1: rule__TagAnnotation__Group__1 : rule__TagAnnotation__Group__1__Impl ;
    public final void rule__TagAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6450:1: ( rule__TagAnnotation__Group__1__Impl )
            // InternalKEffects.g:6451:2: rule__TagAnnotation__Group__1__Impl
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
    // InternalKEffects.g:6457:1: rule__TagAnnotation__Group__1__Impl : ( ( rule__TagAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TagAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6461:1: ( ( ( rule__TagAnnotation__NameAssignment_1 ) ) )
            // InternalKEffects.g:6462:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            {
            // InternalKEffects.g:6462:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            // InternalKEffects.g:6463:1: ( rule__TagAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKEffects.g:6464:1: ( rule__TagAnnotation__NameAssignment_1 )
            // InternalKEffects.g:6464:2: rule__TagAnnotation__NameAssignment_1
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
    // InternalKEffects.g:6478:1: rule__KeyStringValueAnnotation__Group__0 : rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 ;
    public final void rule__KeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6482:1: ( rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 )
            // InternalKEffects.g:6483:2: rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
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
    // InternalKEffects.g:6490:1: rule__KeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6494:1: ( ( '@' ) )
            // InternalKEffects.g:6495:1: ( '@' )
            {
            // InternalKEffects.g:6495:1: ( '@' )
            // InternalKEffects.g:6496:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:6509:1: rule__KeyStringValueAnnotation__Group__1 : rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 ;
    public final void rule__KeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6513:1: ( rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 )
            // InternalKEffects.g:6514:2: rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_43);
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
    // InternalKEffects.g:6521:1: rule__KeyStringValueAnnotation__Group__1__Impl : ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6525:1: ( ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKEffects.g:6526:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKEffects.g:6526:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKEffects.g:6527:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKEffects.g:6528:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            // InternalKEffects.g:6528:2: rule__KeyStringValueAnnotation__NameAssignment_1
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
    // InternalKEffects.g:6538:1: rule__KeyStringValueAnnotation__Group__2 : rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 ;
    public final void rule__KeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6542:1: ( rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 )
            // InternalKEffects.g:6543:2: rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_44);
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
    // InternalKEffects.g:6550:1: rule__KeyStringValueAnnotation__Group__2__Impl : ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6554:1: ( ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalKEffects.g:6555:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalKEffects.g:6555:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalKEffects.g:6556:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            }
            // InternalKEffects.g:6557:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalKEffects.g:6557:2: rule__KeyStringValueAnnotation__ValuesAssignment_2
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
    // InternalKEffects.g:6567:1: rule__KeyStringValueAnnotation__Group__3 : rule__KeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__KeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6571:1: ( rule__KeyStringValueAnnotation__Group__3__Impl )
            // InternalKEffects.g:6572:2: rule__KeyStringValueAnnotation__Group__3__Impl
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
    // InternalKEffects.g:6578:1: rule__KeyStringValueAnnotation__Group__3__Impl : ( ( rule__KeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__KeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6582:1: ( ( ( rule__KeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalKEffects.g:6583:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalKEffects.g:6583:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )* )
            // InternalKEffects.g:6584:1: ( rule__KeyStringValueAnnotation__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // InternalKEffects.g:6585:1: ( rule__KeyStringValueAnnotation__Group_3__0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==46) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalKEffects.g:6585:2: rule__KeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_17);
            	    rule__KeyStringValueAnnotation__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop53;
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
    // InternalKEffects.g:6603:1: rule__KeyStringValueAnnotation__Group_3__0 : rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 ;
    public final void rule__KeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6607:1: ( rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 )
            // InternalKEffects.g:6608:2: rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_43);
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
    // InternalKEffects.g:6615:1: rule__KeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6619:1: ( ( ',' ) )
            // InternalKEffects.g:6620:1: ( ',' )
            {
            // InternalKEffects.g:6620:1: ( ',' )
            // InternalKEffects.g:6621:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            }
            match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:6634:1: rule__KeyStringValueAnnotation__Group_3__1 : rule__KeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__KeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6638:1: ( rule__KeyStringValueAnnotation__Group_3__1__Impl )
            // InternalKEffects.g:6639:2: rule__KeyStringValueAnnotation__Group_3__1__Impl
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
    // InternalKEffects.g:6645:1: rule__KeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6649:1: ( ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalKEffects.g:6650:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalKEffects.g:6650:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalKEffects.g:6651:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            }
            // InternalKEffects.g:6652:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalKEffects.g:6652:2: rule__KeyStringValueAnnotation__ValuesAssignment_3_1
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
    // InternalKEffects.g:6666:1: rule__TypedKeyStringValueAnnotation__Group__0 : rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6670:1: ( rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 )
            // InternalKEffects.g:6671:2: rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
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
    // InternalKEffects.g:6678:1: rule__TypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6682:1: ( ( '@' ) )
            // InternalKEffects.g:6683:1: ( '@' )
            {
            // InternalKEffects.g:6683:1: ( '@' )
            // InternalKEffects.g:6684:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:6697:1: rule__TypedKeyStringValueAnnotation__Group__1 : rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6701:1: ( rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 )
            // InternalKEffects.g:6702:2: rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2
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
    // InternalKEffects.g:6709:1: rule__TypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6713:1: ( ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKEffects.g:6714:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKEffects.g:6714:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKEffects.g:6715:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKEffects.g:6716:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKEffects.g:6716:2: rule__TypedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKEffects.g:6726:1: rule__TypedKeyStringValueAnnotation__Group__2 : rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6730:1: ( rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 )
            // InternalKEffects.g:6731:2: rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_3);
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
    // InternalKEffects.g:6738:1: rule__TypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6742:1: ( ( '[' ) )
            // InternalKEffects.g:6743:1: ( '[' )
            {
            // InternalKEffects.g:6743:1: ( '[' )
            // InternalKEffects.g:6744:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:6757:1: rule__TypedKeyStringValueAnnotation__Group__3 : rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6761:1: ( rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 )
            // InternalKEffects.g:6762:2: rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_10);
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
    // InternalKEffects.g:6769:1: rule__TypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6773:1: ( ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalKEffects.g:6774:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalKEffects.g:6774:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalKEffects.g:6775:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // InternalKEffects.g:6776:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalKEffects.g:6776:2: rule__TypedKeyStringValueAnnotation__TypeAssignment_3
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
    // InternalKEffects.g:6786:1: rule__TypedKeyStringValueAnnotation__Group__4 : rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6790:1: ( rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 )
            // InternalKEffects.g:6791:2: rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_45);
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
    // InternalKEffects.g:6798:1: rule__TypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6802:1: ( ( ']' ) )
            // InternalKEffects.g:6803:1: ( ']' )
            {
            // InternalKEffects.g:6803:1: ( ']' )
            // InternalKEffects.g:6804:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:6817:1: rule__TypedKeyStringValueAnnotation__Group__5 : rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6821:1: ( rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 )
            // InternalKEffects.g:6822:2: rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_44);
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
    // InternalKEffects.g:6829:1: rule__TypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6833:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalKEffects.g:6834:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalKEffects.g:6834:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalKEffects.g:6835:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            }
            // InternalKEffects.g:6836:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalKEffects.g:6836:2: rule__TypedKeyStringValueAnnotation__ValuesAssignment_5
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
    // InternalKEffects.g:6846:1: rule__TypedKeyStringValueAnnotation__Group__6 : rule__TypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6850:1: ( rule__TypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalKEffects.g:6851:2: rule__TypedKeyStringValueAnnotation__Group__6__Impl
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
    // InternalKEffects.g:6857:1: rule__TypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6861:1: ( ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalKEffects.g:6862:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalKEffects.g:6862:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalKEffects.g:6863:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // InternalKEffects.g:6864:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==46) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalKEffects.g:6864:2: rule__TypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_17);
            	    rule__TypedKeyStringValueAnnotation__Group_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop54;
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
    // InternalKEffects.g:6888:1: rule__TypedKeyStringValueAnnotation__Group_6__0 : rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6892:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 )
            // InternalKEffects.g:6893:2: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_45);
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
    // InternalKEffects.g:6900:1: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6904:1: ( ( ',' ) )
            // InternalKEffects.g:6905:1: ( ',' )
            {
            // InternalKEffects.g:6905:1: ( ',' )
            // InternalKEffects.g:6906:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            }
            match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:6919:1: rule__TypedKeyStringValueAnnotation__Group_6__1 : rule__TypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6923:1: ( rule__TypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalKEffects.g:6924:2: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl
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
    // InternalKEffects.g:6930:1: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6934:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalKEffects.g:6935:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalKEffects.g:6935:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalKEffects.g:6936:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            }
            // InternalKEffects.g:6937:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalKEffects.g:6937:2: rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1
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
    // InternalKEffects.g:6951:1: rule__QuotedKeyStringValueAnnotation__Group__0 : rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6955:1: ( rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1 )
            // InternalKEffects.g:6956:2: rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
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
    // InternalKEffects.g:6963:1: rule__QuotedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6967:1: ( ( '@' ) )
            // InternalKEffects.g:6968:1: ( '@' )
            {
            // InternalKEffects.g:6968:1: ( '@' )
            // InternalKEffects.g:6969:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:6982:1: rule__QuotedKeyStringValueAnnotation__Group__1 : rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6986:1: ( rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2 )
            // InternalKEffects.g:6987:2: rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_46);
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
    // InternalKEffects.g:6994:1: rule__QuotedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6998:1: ( ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKEffects.g:6999:1: ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKEffects.g:6999:1: ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKEffects.g:7000:1: ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKEffects.g:7001:1: ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKEffects.g:7001:2: rule__QuotedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKEffects.g:7011:1: rule__QuotedKeyStringValueAnnotation__Group__2 : rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7015:1: ( rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3 )
            // InternalKEffects.g:7016:2: rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_44);
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
    // InternalKEffects.g:7023:1: rule__QuotedKeyStringValueAnnotation__Group__2__Impl : ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7027:1: ( ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalKEffects.g:7028:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalKEffects.g:7028:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalKEffects.g:7029:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            }
            // InternalKEffects.g:7030:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalKEffects.g:7030:2: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2
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
    // InternalKEffects.g:7040:1: rule__QuotedKeyStringValueAnnotation__Group__3 : rule__QuotedKeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7044:1: ( rule__QuotedKeyStringValueAnnotation__Group__3__Impl )
            // InternalKEffects.g:7045:2: rule__QuotedKeyStringValueAnnotation__Group__3__Impl
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
    // InternalKEffects.g:7051:1: rule__QuotedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7055:1: ( ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalKEffects.g:7056:1: ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalKEffects.g:7056:1: ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* )
            // InternalKEffects.g:7057:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // InternalKEffects.g:7058:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==46) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalKEffects.g:7058:2: rule__QuotedKeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_17);
            	    rule__QuotedKeyStringValueAnnotation__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop55;
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
    // InternalKEffects.g:7076:1: rule__QuotedKeyStringValueAnnotation__Group_3__0 : rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7080:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1 )
            // InternalKEffects.g:7081:2: rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_46);
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
    // InternalKEffects.g:7088:1: rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7092:1: ( ( ',' ) )
            // InternalKEffects.g:7093:1: ( ',' )
            {
            // InternalKEffects.g:7093:1: ( ',' )
            // InternalKEffects.g:7094:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            }
            match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:7107:1: rule__QuotedKeyStringValueAnnotation__Group_3__1 : rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7111:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl )
            // InternalKEffects.g:7112:2: rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl
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
    // InternalKEffects.g:7118:1: rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7122:1: ( ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalKEffects.g:7123:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalKEffects.g:7123:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalKEffects.g:7124:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            }
            // InternalKEffects.g:7125:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalKEffects.g:7125:2: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1
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
    // InternalKEffects.g:7139:1: rule__QuotedTypedKeyStringValueAnnotation__Group__0 : rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7143:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1 )
            // InternalKEffects.g:7144:2: rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
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
    // InternalKEffects.g:7151:1: rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7155:1: ( ( '@' ) )
            // InternalKEffects.g:7156:1: ( '@' )
            {
            // InternalKEffects.g:7156:1: ( '@' )
            // InternalKEffects.g:7157:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:7170:1: rule__QuotedTypedKeyStringValueAnnotation__Group__1 : rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7174:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2 )
            // InternalKEffects.g:7175:2: rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2
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
    // InternalKEffects.g:7182:1: rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7186:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKEffects.g:7187:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKEffects.g:7187:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKEffects.g:7188:1: ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKEffects.g:7189:1: ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKEffects.g:7189:2: rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKEffects.g:7199:1: rule__QuotedTypedKeyStringValueAnnotation__Group__2 : rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7203:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3 )
            // InternalKEffects.g:7204:2: rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_3);
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
    // InternalKEffects.g:7211:1: rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7215:1: ( ( '[' ) )
            // InternalKEffects.g:7216:1: ( '[' )
            {
            // InternalKEffects.g:7216:1: ( '[' )
            // InternalKEffects.g:7217:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:7230:1: rule__QuotedTypedKeyStringValueAnnotation__Group__3 : rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7234:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4 )
            // InternalKEffects.g:7235:2: rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_10);
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
    // InternalKEffects.g:7242:1: rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7246:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalKEffects.g:7247:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalKEffects.g:7247:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalKEffects.g:7248:1: ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // InternalKEffects.g:7249:1: ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalKEffects.g:7249:2: rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3
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
    // InternalKEffects.g:7259:1: rule__QuotedTypedKeyStringValueAnnotation__Group__4 : rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7263:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5 )
            // InternalKEffects.g:7264:2: rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_46);
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
    // InternalKEffects.g:7271:1: rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7275:1: ( ( ']' ) )
            // InternalKEffects.g:7276:1: ( ']' )
            {
            // InternalKEffects.g:7276:1: ( ']' )
            // InternalKEffects.g:7277:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:7290:1: rule__QuotedTypedKeyStringValueAnnotation__Group__5 : rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7294:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6 )
            // InternalKEffects.g:7295:2: rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_44);
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
    // InternalKEffects.g:7302:1: rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7306:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalKEffects.g:7307:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalKEffects.g:7307:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalKEffects.g:7308:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            }
            // InternalKEffects.g:7309:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalKEffects.g:7309:2: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5
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
    // InternalKEffects.g:7319:1: rule__QuotedTypedKeyStringValueAnnotation__Group__6 : rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7323:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalKEffects.g:7324:2: rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl
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
    // InternalKEffects.g:7330:1: rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7334:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalKEffects.g:7335:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalKEffects.g:7335:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalKEffects.g:7336:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // InternalKEffects.g:7337:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==46) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalKEffects.g:7337:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_17);
            	    rule__QuotedTypedKeyStringValueAnnotation__Group_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop56;
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
    // InternalKEffects.g:7361:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 : rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7365:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 )
            // InternalKEffects.g:7366:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_46);
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
    // InternalKEffects.g:7373:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7377:1: ( ( ',' ) )
            // InternalKEffects.g:7378:1: ( ',' )
            {
            // InternalKEffects.g:7378:1: ( ',' )
            // InternalKEffects.g:7379:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            }
            match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:7392:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 : rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7396:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalKEffects.g:7397:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl
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
    // InternalKEffects.g:7403:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7407:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalKEffects.g:7408:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalKEffects.g:7408:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalKEffects.g:7409:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            }
            // InternalKEffects.g:7410:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalKEffects.g:7410:2: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1
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
    // InternalKEffects.g:7424:1: rule__KeyBooleanValueAnnotation__Group__0 : rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1 ;
    public final void rule__KeyBooleanValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7428:1: ( rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1 )
            // InternalKEffects.g:7429:2: rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
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
    // InternalKEffects.g:7436:1: rule__KeyBooleanValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7440:1: ( ( '@' ) )
            // InternalKEffects.g:7441:1: ( '@' )
            {
            // InternalKEffects.g:7441:1: ( '@' )
            // InternalKEffects.g:7442:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:7455:1: rule__KeyBooleanValueAnnotation__Group__1 : rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2 ;
    public final void rule__KeyBooleanValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7459:1: ( rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2 )
            // InternalKEffects.g:7460:2: rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_47);
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
    // InternalKEffects.g:7467:1: rule__KeyBooleanValueAnnotation__Group__1__Impl : ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7471:1: ( ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) ) )
            // InternalKEffects.g:7472:1: ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKEffects.g:7472:1: ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) )
            // InternalKEffects.g:7473:1: ( rule__KeyBooleanValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKEffects.g:7474:1: ( rule__KeyBooleanValueAnnotation__NameAssignment_1 )
            // InternalKEffects.g:7474:2: rule__KeyBooleanValueAnnotation__NameAssignment_1
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
    // InternalKEffects.g:7484:1: rule__KeyBooleanValueAnnotation__Group__2 : rule__KeyBooleanValueAnnotation__Group__2__Impl ;
    public final void rule__KeyBooleanValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7488:1: ( rule__KeyBooleanValueAnnotation__Group__2__Impl )
            // InternalKEffects.g:7489:2: rule__KeyBooleanValueAnnotation__Group__2__Impl
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
    // InternalKEffects.g:7495:1: rule__KeyBooleanValueAnnotation__Group__2__Impl : ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7499:1: ( ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) ) )
            // InternalKEffects.g:7500:1: ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) )
            {
            // InternalKEffects.g:7500:1: ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) )
            // InternalKEffects.g:7501:1: ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getValueAssignment_2()); 
            }
            // InternalKEffects.g:7502:1: ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 )
            // InternalKEffects.g:7502:2: rule__KeyBooleanValueAnnotation__ValueAssignment_2
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
    // InternalKEffects.g:7518:1: rule__KeyIntValueAnnotation__Group__0 : rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1 ;
    public final void rule__KeyIntValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7522:1: ( rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1 )
            // InternalKEffects.g:7523:2: rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
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
    // InternalKEffects.g:7530:1: rule__KeyIntValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyIntValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7534:1: ( ( '@' ) )
            // InternalKEffects.g:7535:1: ( '@' )
            {
            // InternalKEffects.g:7535:1: ( '@' )
            // InternalKEffects.g:7536:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:7549:1: rule__KeyIntValueAnnotation__Group__1 : rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2 ;
    public final void rule__KeyIntValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7553:1: ( rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2 )
            // InternalKEffects.g:7554:2: rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_48);
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
    // InternalKEffects.g:7561:1: rule__KeyIntValueAnnotation__Group__1__Impl : ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyIntValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7565:1: ( ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) ) )
            // InternalKEffects.g:7566:1: ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKEffects.g:7566:1: ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) )
            // InternalKEffects.g:7567:1: ( rule__KeyIntValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKEffects.g:7568:1: ( rule__KeyIntValueAnnotation__NameAssignment_1 )
            // InternalKEffects.g:7568:2: rule__KeyIntValueAnnotation__NameAssignment_1
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
    // InternalKEffects.g:7578:1: rule__KeyIntValueAnnotation__Group__2 : rule__KeyIntValueAnnotation__Group__2__Impl ;
    public final void rule__KeyIntValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7582:1: ( rule__KeyIntValueAnnotation__Group__2__Impl )
            // InternalKEffects.g:7583:2: rule__KeyIntValueAnnotation__Group__2__Impl
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
    // InternalKEffects.g:7589:1: rule__KeyIntValueAnnotation__Group__2__Impl : ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyIntValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7593:1: ( ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) ) )
            // InternalKEffects.g:7594:1: ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) )
            {
            // InternalKEffects.g:7594:1: ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) )
            // InternalKEffects.g:7595:1: ( rule__KeyIntValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getValueAssignment_2()); 
            }
            // InternalKEffects.g:7596:1: ( rule__KeyIntValueAnnotation__ValueAssignment_2 )
            // InternalKEffects.g:7596:2: rule__KeyIntValueAnnotation__ValueAssignment_2
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
    // InternalKEffects.g:7612:1: rule__KeyFloatValueAnnotation__Group__0 : rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1 ;
    public final void rule__KeyFloatValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7616:1: ( rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1 )
            // InternalKEffects.g:7617:2: rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
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
    // InternalKEffects.g:7624:1: rule__KeyFloatValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyFloatValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7628:1: ( ( '@' ) )
            // InternalKEffects.g:7629:1: ( '@' )
            {
            // InternalKEffects.g:7629:1: ( '@' )
            // InternalKEffects.g:7630:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:7643:1: rule__KeyFloatValueAnnotation__Group__1 : rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2 ;
    public final void rule__KeyFloatValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7647:1: ( rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2 )
            // InternalKEffects.g:7648:2: rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_49);
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
    // InternalKEffects.g:7655:1: rule__KeyFloatValueAnnotation__Group__1__Impl : ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyFloatValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7659:1: ( ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) ) )
            // InternalKEffects.g:7660:1: ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKEffects.g:7660:1: ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) )
            // InternalKEffects.g:7661:1: ( rule__KeyFloatValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKEffects.g:7662:1: ( rule__KeyFloatValueAnnotation__NameAssignment_1 )
            // InternalKEffects.g:7662:2: rule__KeyFloatValueAnnotation__NameAssignment_1
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
    // InternalKEffects.g:7672:1: rule__KeyFloatValueAnnotation__Group__2 : rule__KeyFloatValueAnnotation__Group__2__Impl ;
    public final void rule__KeyFloatValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7676:1: ( rule__KeyFloatValueAnnotation__Group__2__Impl )
            // InternalKEffects.g:7677:2: rule__KeyFloatValueAnnotation__Group__2__Impl
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
    // InternalKEffects.g:7683:1: rule__KeyFloatValueAnnotation__Group__2__Impl : ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyFloatValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7687:1: ( ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) ) )
            // InternalKEffects.g:7688:1: ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) )
            {
            // InternalKEffects.g:7688:1: ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) )
            // InternalKEffects.g:7689:1: ( rule__KeyFloatValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getValueAssignment_2()); 
            }
            // InternalKEffects.g:7690:1: ( rule__KeyFloatValueAnnotation__ValueAssignment_2 )
            // InternalKEffects.g:7690:2: rule__KeyFloatValueAnnotation__ValueAssignment_2
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
    // InternalKEffects.g:7706:1: rule__ExtendedID__Group__0 : rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 ;
    public final void rule__ExtendedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7710:1: ( rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 )
            // InternalKEffects.g:7711:2: rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_50);
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
    // InternalKEffects.g:7718:1: rule__ExtendedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7722:1: ( ( RULE_ID ) )
            // InternalKEffects.g:7723:1: ( RULE_ID )
            {
            // InternalKEffects.g:7723:1: ( RULE_ID )
            // InternalKEffects.g:7724:1: RULE_ID
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
    // InternalKEffects.g:7735:1: rule__ExtendedID__Group__1 : rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2 ;
    public final void rule__ExtendedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7739:1: ( rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2 )
            // InternalKEffects.g:7740:2: rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_50);
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
    // InternalKEffects.g:7747:1: rule__ExtendedID__Group__1__Impl : ( ( rule__ExtendedID__Group_1__0 )* ) ;
    public final void rule__ExtendedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7751:1: ( ( ( rule__ExtendedID__Group_1__0 )* ) )
            // InternalKEffects.g:7752:1: ( ( rule__ExtendedID__Group_1__0 )* )
            {
            // InternalKEffects.g:7752:1: ( ( rule__ExtendedID__Group_1__0 )* )
            // InternalKEffects.g:7753:1: ( rule__ExtendedID__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup_1()); 
            }
            // InternalKEffects.g:7754:1: ( rule__ExtendedID__Group_1__0 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==48) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalKEffects.g:7754:2: rule__ExtendedID__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_51);
            	    rule__ExtendedID__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop57;
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
    // InternalKEffects.g:7764:1: rule__ExtendedID__Group__2 : rule__ExtendedID__Group__2__Impl ;
    public final void rule__ExtendedID__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7768:1: ( rule__ExtendedID__Group__2__Impl )
            // InternalKEffects.g:7769:2: rule__ExtendedID__Group__2__Impl
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
    // InternalKEffects.g:7775:1: rule__ExtendedID__Group__2__Impl : ( ( rule__ExtendedID__Group_2__0 )? ) ;
    public final void rule__ExtendedID__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7779:1: ( ( ( rule__ExtendedID__Group_2__0 )? ) )
            // InternalKEffects.g:7780:1: ( ( rule__ExtendedID__Group_2__0 )? )
            {
            // InternalKEffects.g:7780:1: ( ( rule__ExtendedID__Group_2__0 )? )
            // InternalKEffects.g:7781:1: ( rule__ExtendedID__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup_2()); 
            }
            // InternalKEffects.g:7782:1: ( rule__ExtendedID__Group_2__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==49) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalKEffects.g:7782:2: rule__ExtendedID__Group_2__0
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
    // InternalKEffects.g:7798:1: rule__ExtendedID__Group_1__0 : rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 ;
    public final void rule__ExtendedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7802:1: ( rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 )
            // InternalKEffects.g:7803:2: rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
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
    // InternalKEffects.g:7810:1: rule__ExtendedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__ExtendedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7814:1: ( ( '.' ) )
            // InternalKEffects.g:7815:1: ( '.' )
            {
            // InternalKEffects.g:7815:1: ( '.' )
            // InternalKEffects.g:7816:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            }
            match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:7829:1: rule__ExtendedID__Group_1__1 : rule__ExtendedID__Group_1__1__Impl ;
    public final void rule__ExtendedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7833:1: ( rule__ExtendedID__Group_1__1__Impl )
            // InternalKEffects.g:7834:2: rule__ExtendedID__Group_1__1__Impl
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
    // InternalKEffects.g:7840:1: rule__ExtendedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7844:1: ( ( RULE_ID ) )
            // InternalKEffects.g:7845:1: ( RULE_ID )
            {
            // InternalKEffects.g:7845:1: ( RULE_ID )
            // InternalKEffects.g:7846:1: RULE_ID
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
    // InternalKEffects.g:7861:1: rule__ExtendedID__Group_2__0 : rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1 ;
    public final void rule__ExtendedID__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7865:1: ( rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1 )
            // InternalKEffects.g:7866:2: rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_52);
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
    // InternalKEffects.g:7873:1: rule__ExtendedID__Group_2__0__Impl : ( '#' ) ;
    public final void rule__ExtendedID__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7877:1: ( ( '#' ) )
            // InternalKEffects.g:7878:1: ( '#' )
            {
            // InternalKEffects.g:7878:1: ( '#' )
            // InternalKEffects.g:7879:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getNumberSignKeyword_2_0()); 
            }
            match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:7892:1: rule__ExtendedID__Group_2__1 : rule__ExtendedID__Group_2__1__Impl ;
    public final void rule__ExtendedID__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7896:1: ( rule__ExtendedID__Group_2__1__Impl )
            // InternalKEffects.g:7897:2: rule__ExtendedID__Group_2__1__Impl
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
    // InternalKEffects.g:7903:1: rule__ExtendedID__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__ExtendedID__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7907:1: ( ( RULE_INT ) )
            // InternalKEffects.g:7908:1: ( RULE_INT )
            {
            // InternalKEffects.g:7908:1: ( RULE_INT )
            // InternalKEffects.g:7909:1: RULE_INT
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
    // InternalKEffects.g:7924:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7928:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // InternalKEffects.g:7929:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
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
    // InternalKEffects.g:7936:1: rule__Integer__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7940:1: ( ( ( '-' )? ) )
            // InternalKEffects.g:7941:1: ( ( '-' )? )
            {
            // InternalKEffects.g:7941:1: ( ( '-' )? )
            // InternalKEffects.g:7942:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalKEffects.g:7943:1: ( '-' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==21) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalKEffects.g:7944:2: '-'
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
    // InternalKEffects.g:7955:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7959:1: ( rule__Integer__Group__1__Impl )
            // InternalKEffects.g:7960:2: rule__Integer__Group__1__Impl
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
    // InternalKEffects.g:7966:1: rule__Integer__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7970:1: ( ( RULE_INT ) )
            // InternalKEffects.g:7971:1: ( RULE_INT )
            {
            // InternalKEffects.g:7971:1: ( RULE_INT )
            // InternalKEffects.g:7972:1: RULE_INT
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
    // InternalKEffects.g:7987:1: rule__Floateger__Group__0 : rule__Floateger__Group__0__Impl rule__Floateger__Group__1 ;
    public final void rule__Floateger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7991:1: ( rule__Floateger__Group__0__Impl rule__Floateger__Group__1 )
            // InternalKEffects.g:7992:2: rule__Floateger__Group__0__Impl rule__Floateger__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_49);
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
    // InternalKEffects.g:7999:1: rule__Floateger__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Floateger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8003:1: ( ( ( '-' )? ) )
            // InternalKEffects.g:8004:1: ( ( '-' )? )
            {
            // InternalKEffects.g:8004:1: ( ( '-' )? )
            // InternalKEffects.g:8005:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloategerAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalKEffects.g:8006:1: ( '-' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==21) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalKEffects.g:8007:2: '-'
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
    // InternalKEffects.g:8018:1: rule__Floateger__Group__1 : rule__Floateger__Group__1__Impl ;
    public final void rule__Floateger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8022:1: ( rule__Floateger__Group__1__Impl )
            // InternalKEffects.g:8023:2: rule__Floateger__Group__1__Impl
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
    // InternalKEffects.g:8029:1: rule__Floateger__Group__1__Impl : ( RULE_FLOAT ) ;
    public final void rule__Floateger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8033:1: ( ( RULE_FLOAT ) )
            // InternalKEffects.g:8034:1: ( RULE_FLOAT )
            {
            // InternalKEffects.g:8034:1: ( RULE_FLOAT )
            // InternalKEffects.g:8035:1: RULE_FLOAT
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


    // $ANTLR start "rule__Emission__AnnotationsAssignment_0"
    // InternalKEffects.g:8051:1: rule__Emission__AnnotationsAssignment_0 : ( ruleRestrictedAnnotation ) ;
    public final void rule__Emission__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8055:1: ( ( ruleRestrictedAnnotation ) )
            // InternalKEffects.g:8056:1: ( ruleRestrictedAnnotation )
            {
            // InternalKEffects.g:8056:1: ( ruleRestrictedAnnotation )
            // InternalKEffects.g:8057:1: ruleRestrictedAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getAnnotationsRestrictedAnnotationParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleRestrictedAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getAnnotationsRestrictedAnnotationParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Emission__AnnotationsAssignment_0"


    // $ANTLR start "rule__Emission__ValuedObjectAssignment_1"
    // InternalKEffects.g:8066:1: rule__Emission__ValuedObjectAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Emission__ValuedObjectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8070:1: ( ( ( RULE_ID ) ) )
            // InternalKEffects.g:8071:1: ( ( RULE_ID ) )
            {
            // InternalKEffects.g:8071:1: ( ( RULE_ID ) )
            // InternalKEffects.g:8072:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
            }
            // InternalKEffects.g:8073:1: ( RULE_ID )
            // InternalKEffects.g:8074:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getValuedObjectValuedObjectIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getValuedObjectValuedObjectIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Emission__ValuedObjectAssignment_1"


    // $ANTLR start "rule__Emission__NewValueAssignment_2_1"
    // InternalKEffects.g:8085:1: rule__Emission__NewValueAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__Emission__NewValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8089:1: ( ( ruleExpression ) )
            // InternalKEffects.g:8090:1: ( ruleExpression )
            {
            // InternalKEffects.g:8090:1: ( ruleExpression )
            // InternalKEffects.g:8091:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getNewValueExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getNewValueExpressionParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Emission__NewValueAssignment_2_1"


    // $ANTLR start "rule__Assignment__AnnotationsAssignment_0"
    // InternalKEffects.g:8100:1: rule__Assignment__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Assignment__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8104:1: ( ( ruleAnnotation ) )
            // InternalKEffects.g:8105:1: ( ruleAnnotation )
            {
            // InternalKEffects.g:8105:1: ( ruleAnnotation )
            // InternalKEffects.g:8106:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__AnnotationsAssignment_0"


    // $ANTLR start "rule__Assignment__ValuedObjectAssignment_1"
    // InternalKEffects.g:8115:1: rule__Assignment__ValuedObjectAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Assignment__ValuedObjectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8119:1: ( ( ( RULE_ID ) ) )
            // InternalKEffects.g:8120:1: ( ( RULE_ID ) )
            {
            // InternalKEffects.g:8120:1: ( ( RULE_ID ) )
            // InternalKEffects.g:8121:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
            }
            // InternalKEffects.g:8122:1: ( RULE_ID )
            // InternalKEffects.g:8123:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValuedObjectValuedObjectIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getValuedObjectValuedObjectIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__ValuedObjectAssignment_1"


    // $ANTLR start "rule__Assignment__IndicesAssignment_2_1"
    // InternalKEffects.g:8134:1: rule__Assignment__IndicesAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__Assignment__IndicesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8138:1: ( ( ruleExpression ) )
            // InternalKEffects.g:8139:1: ( ruleExpression )
            {
            // InternalKEffects.g:8139:1: ( ruleExpression )
            // InternalKEffects.g:8140:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getIndicesExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getIndicesExpressionParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__IndicesAssignment_2_1"


    // $ANTLR start "rule__Assignment__OperatorAssignment_3"
    // InternalKEffects.g:8149:1: rule__Assignment__OperatorAssignment_3 : ( ruleAssignOperator ) ;
    public final void rule__Assignment__OperatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8153:1: ( ( ruleAssignOperator ) )
            // InternalKEffects.g:8154:1: ( ruleAssignOperator )
            {
            // InternalKEffects.g:8154:1: ( ruleAssignOperator )
            // InternalKEffects.g:8155:1: ruleAssignOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getOperatorAssignOperatorEnumRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAssignOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getOperatorAssignOperatorEnumRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__OperatorAssignment_3"


    // $ANTLR start "rule__Assignment__ExpressionAssignment_4"
    // InternalKEffects.g:8164:1: rule__Assignment__ExpressionAssignment_4 : ( ruleExpression ) ;
    public final void rule__Assignment__ExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8168:1: ( ( ruleExpression ) )
            // InternalKEffects.g:8169:1: ( ruleExpression )
            {
            // InternalKEffects.g:8169:1: ( ruleExpression )
            // InternalKEffects.g:8170:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__ExpressionAssignment_4"


    // $ANTLR start "rule__PostfixEffect__AnnotationsAssignment_0"
    // InternalKEffects.g:8179:1: rule__PostfixEffect__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__PostfixEffect__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8183:1: ( ( ruleAnnotation ) )
            // InternalKEffects.g:8184:1: ( ruleAnnotation )
            {
            // InternalKEffects.g:8184:1: ( ruleAnnotation )
            // InternalKEffects.g:8185:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPostfixEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPostfixEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostfixEffect__AnnotationsAssignment_0"


    // $ANTLR start "rule__PostfixEffect__ValuedObjectAssignment_1"
    // InternalKEffects.g:8194:1: rule__PostfixEffect__ValuedObjectAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__PostfixEffect__ValuedObjectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8198:1: ( ( ( RULE_ID ) ) )
            // InternalKEffects.g:8199:1: ( ( RULE_ID ) )
            {
            // InternalKEffects.g:8199:1: ( ( RULE_ID ) )
            // InternalKEffects.g:8200:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPostfixEffectAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
            }
            // InternalKEffects.g:8201:1: ( RULE_ID )
            // InternalKEffects.g:8202:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPostfixEffectAccess().getValuedObjectValuedObjectIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPostfixEffectAccess().getValuedObjectValuedObjectIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPostfixEffectAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostfixEffect__ValuedObjectAssignment_1"


    // $ANTLR start "rule__PostfixEffect__IndicesAssignment_2_1"
    // InternalKEffects.g:8213:1: rule__PostfixEffect__IndicesAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__PostfixEffect__IndicesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8217:1: ( ( ruleExpression ) )
            // InternalKEffects.g:8218:1: ( ruleExpression )
            {
            // InternalKEffects.g:8218:1: ( ruleExpression )
            // InternalKEffects.g:8219:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPostfixEffectAccess().getIndicesExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPostfixEffectAccess().getIndicesExpressionParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostfixEffect__IndicesAssignment_2_1"


    // $ANTLR start "rule__PostfixEffect__OperatorAssignment_3"
    // InternalKEffects.g:8228:1: rule__PostfixEffect__OperatorAssignment_3 : ( rulePostfixOperator ) ;
    public final void rule__PostfixEffect__OperatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8232:1: ( ( rulePostfixOperator ) )
            // InternalKEffects.g:8233:1: ( rulePostfixOperator )
            {
            // InternalKEffects.g:8233:1: ( rulePostfixOperator )
            // InternalKEffects.g:8234:1: rulePostfixOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPostfixEffectAccess().getOperatorPostfixOperatorEnumRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            rulePostfixOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPostfixEffectAccess().getOperatorPostfixOperatorEnumRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostfixEffect__OperatorAssignment_3"


    // $ANTLR start "rule__HostcodeEffect__AnnotationsAssignment_0"
    // InternalKEffects.g:8243:1: rule__HostcodeEffect__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__HostcodeEffect__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8247:1: ( ( ruleAnnotation ) )
            // InternalKEffects.g:8248:1: ( ruleAnnotation )
            {
            // InternalKEffects.g:8248:1: ( ruleAnnotation )
            // InternalKEffects.g:8249:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHostcodeEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHostcodeEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HostcodeEffect__AnnotationsAssignment_0"


    // $ANTLR start "rule__HostcodeEffect__TextAssignment_1"
    // InternalKEffects.g:8258:1: rule__HostcodeEffect__TextAssignment_1 : ( RULE_HOSTCODE ) ;
    public final void rule__HostcodeEffect__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8262:1: ( ( RULE_HOSTCODE ) )
            // InternalKEffects.g:8263:1: ( RULE_HOSTCODE )
            {
            // InternalKEffects.g:8263:1: ( RULE_HOSTCODE )
            // InternalKEffects.g:8264:1: RULE_HOSTCODE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHostcodeEffectAccess().getTextHOSTCODETerminalRuleCall_1_0()); 
            }
            match(input,RULE_HOSTCODE,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHostcodeEffectAccess().getTextHOSTCODETerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HostcodeEffect__TextAssignment_1"


    // $ANTLR start "rule__FunctionCallEffect__AnnotationsAssignment_0"
    // InternalKEffects.g:8273:1: rule__FunctionCallEffect__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__FunctionCallEffect__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8277:1: ( ( ruleAnnotation ) )
            // InternalKEffects.g:8278:1: ( ruleAnnotation )
            {
            // InternalKEffects.g:8278:1: ( ruleAnnotation )
            // InternalKEffects.g:8279:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallEffect__AnnotationsAssignment_0"


    // $ANTLR start "rule__FunctionCallEffect__FunctionNameAssignment_2"
    // InternalKEffects.g:8288:1: rule__FunctionCallEffect__FunctionNameAssignment_2 : ( ruleExtendedID ) ;
    public final void rule__FunctionCallEffect__FunctionNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8292:1: ( ( ruleExtendedID ) )
            // InternalKEffects.g:8293:1: ( ruleExtendedID )
            {
            // InternalKEffects.g:8293:1: ( ruleExtendedID )
            // InternalKEffects.g:8294:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallEffectAccess().getFunctionNameExtendedIDParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallEffectAccess().getFunctionNameExtendedIDParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallEffect__FunctionNameAssignment_2"


    // $ANTLR start "rule__FunctionCallEffect__ParametersAssignment_3_0_1"
    // InternalKEffects.g:8303:1: rule__FunctionCallEffect__ParametersAssignment_3_0_1 : ( ruleParameter ) ;
    public final void rule__FunctionCallEffect__ParametersAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8307:1: ( ( ruleParameter ) )
            // InternalKEffects.g:8308:1: ( ruleParameter )
            {
            // InternalKEffects.g:8308:1: ( ruleParameter )
            // InternalKEffects.g:8309:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallEffectAccess().getParametersParameterParserRuleCall_3_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallEffectAccess().getParametersParameterParserRuleCall_3_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallEffect__ParametersAssignment_3_0_1"


    // $ANTLR start "rule__FunctionCallEffect__ParametersAssignment_3_0_2_1"
    // InternalKEffects.g:8318:1: rule__FunctionCallEffect__ParametersAssignment_3_0_2_1 : ( ruleParameter ) ;
    public final void rule__FunctionCallEffect__ParametersAssignment_3_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8322:1: ( ( ruleParameter ) )
            // InternalKEffects.g:8323:1: ( ruleParameter )
            {
            // InternalKEffects.g:8323:1: ( ruleParameter )
            // InternalKEffects.g:8324:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallEffectAccess().getParametersParameterParserRuleCall_3_0_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallEffectAccess().getParametersParameterParserRuleCall_3_0_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCallEffect__ParametersAssignment_3_0_2_1"


    // $ANTLR start "rule__LogicalOrExpression__OperatorAssignment_1_1_0"
    // InternalKEffects.g:8333:1: rule__LogicalOrExpression__OperatorAssignment_1_1_0 : ( ruleLogicalOrOperator ) ;
    public final void rule__LogicalOrExpression__OperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8337:1: ( ( ruleLogicalOrOperator ) )
            // InternalKEffects.g:8338:1: ( ruleLogicalOrOperator )
            {
            // InternalKEffects.g:8338:1: ( ruleLogicalOrOperator )
            // InternalKEffects.g:8339:1: ruleLogicalOrOperator
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
    // InternalKEffects.g:8348:1: rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1 : ( ruleLogicalAndExpression ) ;
    public final void rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8352:1: ( ( ruleLogicalAndExpression ) )
            // InternalKEffects.g:8353:1: ( ruleLogicalAndExpression )
            {
            // InternalKEffects.g:8353:1: ( ruleLogicalAndExpression )
            // InternalKEffects.g:8354:1: ruleLogicalAndExpression
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


    // $ANTLR start "rule__LogicalAndExpression__OperatorAssignment_1_1_0"
    // InternalKEffects.g:8363:1: rule__LogicalAndExpression__OperatorAssignment_1_1_0 : ( ruleLogicalAndOperator ) ;
    public final void rule__LogicalAndExpression__OperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8367:1: ( ( ruleLogicalAndOperator ) )
            // InternalKEffects.g:8368:1: ( ruleLogicalAndOperator )
            {
            // InternalKEffects.g:8368:1: ( ruleLogicalAndOperator )
            // InternalKEffects.g:8369:1: ruleLogicalAndOperator
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
    // InternalKEffects.g:8378:1: rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1 : ( ruleBitwiseOrExpression ) ;
    public final void rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8382:1: ( ( ruleBitwiseOrExpression ) )
            // InternalKEffects.g:8383:1: ( ruleBitwiseOrExpression )
            {
            // InternalKEffects.g:8383:1: ( ruleBitwiseOrExpression )
            // InternalKEffects.g:8384:1: ruleBitwiseOrExpression
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


    // $ANTLR start "rule__BitwiseOrExpression__OperatorAssignment_1_1_0"
    // InternalKEffects.g:8393:1: rule__BitwiseOrExpression__OperatorAssignment_1_1_0 : ( ruleBitwiseOrOperator ) ;
    public final void rule__BitwiseOrExpression__OperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8397:1: ( ( ruleBitwiseOrOperator ) )
            // InternalKEffects.g:8398:1: ( ruleBitwiseOrOperator )
            {
            // InternalKEffects.g:8398:1: ( ruleBitwiseOrOperator )
            // InternalKEffects.g:8399:1: ruleBitwiseOrOperator
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
    // InternalKEffects.g:8408:1: rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1 : ( ruleBitwiseAndExpression ) ;
    public final void rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8412:1: ( ( ruleBitwiseAndExpression ) )
            // InternalKEffects.g:8413:1: ( ruleBitwiseAndExpression )
            {
            // InternalKEffects.g:8413:1: ( ruleBitwiseAndExpression )
            // InternalKEffects.g:8414:1: ruleBitwiseAndExpression
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


    // $ANTLR start "rule__BitwiseAndExpression__OperatorAssignment_1_1_0"
    // InternalKEffects.g:8423:1: rule__BitwiseAndExpression__OperatorAssignment_1_1_0 : ( ruleBitwiseAndOperator ) ;
    public final void rule__BitwiseAndExpression__OperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8427:1: ( ( ruleBitwiseAndOperator ) )
            // InternalKEffects.g:8428:1: ( ruleBitwiseAndOperator )
            {
            // InternalKEffects.g:8428:1: ( ruleBitwiseAndOperator )
            // InternalKEffects.g:8429:1: ruleBitwiseAndOperator
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
    // InternalKEffects.g:8438:1: rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1 : ( ruleCompareOperation ) ;
    public final void rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8442:1: ( ( ruleCompareOperation ) )
            // InternalKEffects.g:8443:1: ( ruleCompareOperation )
            {
            // InternalKEffects.g:8443:1: ( ruleCompareOperation )
            // InternalKEffects.g:8444:1: ruleCompareOperation
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


    // $ANTLR start "rule__CompareOperation__OperatorAssignment_1_1"
    // InternalKEffects.g:8453:1: rule__CompareOperation__OperatorAssignment_1_1 : ( ruleCompareOperator ) ;
    public final void rule__CompareOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8457:1: ( ( ruleCompareOperator ) )
            // InternalKEffects.g:8458:1: ( ruleCompareOperator )
            {
            // InternalKEffects.g:8458:1: ( ruleCompareOperator )
            // InternalKEffects.g:8459:1: ruleCompareOperator
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
    // InternalKEffects.g:8468:1: rule__CompareOperation__SubExpressionsAssignment_1_2 : ( ruleNotOrValuedExpression ) ;
    public final void rule__CompareOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8472:1: ( ( ruleNotOrValuedExpression ) )
            // InternalKEffects.g:8473:1: ( ruleNotOrValuedExpression )
            {
            // InternalKEffects.g:8473:1: ( ruleNotOrValuedExpression )
            // InternalKEffects.g:8474:1: ruleNotOrValuedExpression
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
    // InternalKEffects.g:8483:1: rule__NotExpression__OperatorAssignment_0_1 : ( ruleNotOperator ) ;
    public final void rule__NotExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8487:1: ( ( ruleNotOperator ) )
            // InternalKEffects.g:8488:1: ( ruleNotOperator )
            {
            // InternalKEffects.g:8488:1: ( ruleNotOperator )
            // InternalKEffects.g:8489:1: ruleNotOperator
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
    // InternalKEffects.g:8498:1: rule__NotExpression__SubExpressionsAssignment_0_2 : ( ruleNotExpression ) ;
    public final void rule__NotExpression__SubExpressionsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8502:1: ( ( ruleNotExpression ) )
            // InternalKEffects.g:8503:1: ( ruleNotExpression )
            {
            // InternalKEffects.g:8503:1: ( ruleNotExpression )
            // InternalKEffects.g:8504:1: ruleNotExpression
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
    // InternalKEffects.g:8513:1: rule__AddExpression__OperatorAssignment_1_1_0 : ( ruleAddOperator ) ;
    public final void rule__AddExpression__OperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8517:1: ( ( ruleAddOperator ) )
            // InternalKEffects.g:8518:1: ( ruleAddOperator )
            {
            // InternalKEffects.g:8518:1: ( ruleAddOperator )
            // InternalKEffects.g:8519:1: ruleAddOperator
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
    // InternalKEffects.g:8528:1: rule__AddExpression__SubExpressionsAssignment_1_1_1 : ( ruleSubExpression ) ;
    public final void rule__AddExpression__SubExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8532:1: ( ( ruleSubExpression ) )
            // InternalKEffects.g:8533:1: ( ruleSubExpression )
            {
            // InternalKEffects.g:8533:1: ( ruleSubExpression )
            // InternalKEffects.g:8534:1: ruleSubExpression
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


    // $ANTLR start "rule__SubExpression__OperatorAssignment_1_1_0"
    // InternalKEffects.g:8543:1: rule__SubExpression__OperatorAssignment_1_1_0 : ( ruleSubOperator ) ;
    public final void rule__SubExpression__OperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8547:1: ( ( ruleSubOperator ) )
            // InternalKEffects.g:8548:1: ( ruleSubOperator )
            {
            // InternalKEffects.g:8548:1: ( ruleSubOperator )
            // InternalKEffects.g:8549:1: ruleSubOperator
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
    // InternalKEffects.g:8558:1: rule__SubExpression__SubExpressionsAssignment_1_1_1 : ( ruleMultExpression ) ;
    public final void rule__SubExpression__SubExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8562:1: ( ( ruleMultExpression ) )
            // InternalKEffects.g:8563:1: ( ruleMultExpression )
            {
            // InternalKEffects.g:8563:1: ( ruleMultExpression )
            // InternalKEffects.g:8564:1: ruleMultExpression
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


    // $ANTLR start "rule__MultExpression__OperatorAssignment_1_1_0"
    // InternalKEffects.g:8573:1: rule__MultExpression__OperatorAssignment_1_1_0 : ( ruleMultOperator ) ;
    public final void rule__MultExpression__OperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8577:1: ( ( ruleMultOperator ) )
            // InternalKEffects.g:8578:1: ( ruleMultOperator )
            {
            // InternalKEffects.g:8578:1: ( ruleMultOperator )
            // InternalKEffects.g:8579:1: ruleMultOperator
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
    // InternalKEffects.g:8588:1: rule__MultExpression__SubExpressionsAssignment_1_1_1 : ( ruleDivExpression ) ;
    public final void rule__MultExpression__SubExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8592:1: ( ( ruleDivExpression ) )
            // InternalKEffects.g:8593:1: ( ruleDivExpression )
            {
            // InternalKEffects.g:8593:1: ( ruleDivExpression )
            // InternalKEffects.g:8594:1: ruleDivExpression
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


    // $ANTLR start "rule__DivExpression__OperatorAssignment_1_1_0"
    // InternalKEffects.g:8603:1: rule__DivExpression__OperatorAssignment_1_1_0 : ( ruleDivOperator ) ;
    public final void rule__DivExpression__OperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8607:1: ( ( ruleDivOperator ) )
            // InternalKEffects.g:8608:1: ( ruleDivOperator )
            {
            // InternalKEffects.g:8608:1: ( ruleDivOperator )
            // InternalKEffects.g:8609:1: ruleDivOperator
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
    // InternalKEffects.g:8618:1: rule__DivExpression__SubExpressionsAssignment_1_1_1 : ( ruleModExpression ) ;
    public final void rule__DivExpression__SubExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8622:1: ( ( ruleModExpression ) )
            // InternalKEffects.g:8623:1: ( ruleModExpression )
            {
            // InternalKEffects.g:8623:1: ( ruleModExpression )
            // InternalKEffects.g:8624:1: ruleModExpression
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


    // $ANTLR start "rule__ModExpression__OperatorAssignment_1_1_0"
    // InternalKEffects.g:8633:1: rule__ModExpression__OperatorAssignment_1_1_0 : ( ruleModOperator ) ;
    public final void rule__ModExpression__OperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8637:1: ( ( ruleModOperator ) )
            // InternalKEffects.g:8638:1: ( ruleModOperator )
            {
            // InternalKEffects.g:8638:1: ( ruleModOperator )
            // InternalKEffects.g:8639:1: ruleModOperator
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
    // InternalKEffects.g:8648:1: rule__ModExpression__SubExpressionsAssignment_1_1_1 : ( ruleAtomicValuedExpression ) ;
    public final void rule__ModExpression__SubExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8652:1: ( ( ruleAtomicValuedExpression ) )
            // InternalKEffects.g:8653:1: ( ruleAtomicValuedExpression )
            {
            // InternalKEffects.g:8653:1: ( ruleAtomicValuedExpression )
            // InternalKEffects.g:8654:1: ruleAtomicValuedExpression
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


    // $ANTLR start "rule__NegExpression__OperatorAssignment_0_1"
    // InternalKEffects.g:8663:1: rule__NegExpression__OperatorAssignment_0_1 : ( ruleSubOperator ) ;
    public final void rule__NegExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8667:1: ( ( ruleSubOperator ) )
            // InternalKEffects.g:8668:1: ( ruleSubOperator )
            {
            // InternalKEffects.g:8668:1: ( ruleSubOperator )
            // InternalKEffects.g:8669:1: ruleSubOperator
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
    // InternalKEffects.g:8678:1: rule__NegExpression__SubExpressionsAssignment_0_2 : ( ruleNegExpression ) ;
    public final void rule__NegExpression__SubExpressionsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8682:1: ( ( ruleNegExpression ) )
            // InternalKEffects.g:8683:1: ( ruleNegExpression )
            {
            // InternalKEffects.g:8683:1: ( ruleNegExpression )
            // InternalKEffects.g:8684:1: ruleNegExpression
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
    // InternalKEffects.g:8693:1: rule__ValuedObjectTestExpression__OperatorAssignment_0_1 : ( ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 ) ) ;
    public final void rule__ValuedObjectTestExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8697:1: ( ( ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 ) ) )
            // InternalKEffects.g:8698:1: ( ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 ) )
            {
            // InternalKEffects.g:8698:1: ( ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 ) )
            // InternalKEffects.g:8699:1: ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorAlternatives_0_1_0()); 
            }
            // InternalKEffects.g:8700:1: ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 )
            // InternalKEffects.g:8700:2: rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0
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
    // InternalKEffects.g:8709:1: rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 : ( ruleValuedObjectTestExpression ) ;
    public final void rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8713:1: ( ( ruleValuedObjectTestExpression ) )
            // InternalKEffects.g:8714:1: ( ruleValuedObjectTestExpression )
            {
            // InternalKEffects.g:8714:1: ( ruleValuedObjectTestExpression )
            // InternalKEffects.g:8715:1: ruleValuedObjectTestExpression
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
    // InternalKEffects.g:8724:1: rule__ValuedObjectReference__ValuedObjectAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ValuedObjectReference__ValuedObjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8728:1: ( ( ( RULE_ID ) ) )
            // InternalKEffects.g:8729:1: ( ( RULE_ID ) )
            {
            // InternalKEffects.g:8729:1: ( ( RULE_ID ) )
            // InternalKEffects.g:8730:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
            }
            // InternalKEffects.g:8731:1: ( RULE_ID )
            // InternalKEffects.g:8732:1: RULE_ID
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
    // InternalKEffects.g:8743:1: rule__ValuedObjectReference__IndicesAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__ValuedObjectReference__IndicesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8747:1: ( ( ruleExpression ) )
            // InternalKEffects.g:8748:1: ( ruleExpression )
            {
            // InternalKEffects.g:8748:1: ( ruleExpression )
            // InternalKEffects.g:8749:1: ruleExpression
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
    // InternalKEffects.g:8758:1: rule__FunctionCall__FunctionNameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__FunctionCall__FunctionNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8762:1: ( ( ruleExtendedID ) )
            // InternalKEffects.g:8763:1: ( ruleExtendedID )
            {
            // InternalKEffects.g:8763:1: ( ruleExtendedID )
            // InternalKEffects.g:8764:1: ruleExtendedID
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
    // InternalKEffects.g:8773:1: rule__FunctionCall__ParametersAssignment_2_0_1 : ( ruleParameter ) ;
    public final void rule__FunctionCall__ParametersAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8777:1: ( ( ruleParameter ) )
            // InternalKEffects.g:8778:1: ( ruleParameter )
            {
            // InternalKEffects.g:8778:1: ( ruleParameter )
            // InternalKEffects.g:8779:1: ruleParameter
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
    // InternalKEffects.g:8788:1: rule__FunctionCall__ParametersAssignment_2_0_2_1 : ( ruleParameter ) ;
    public final void rule__FunctionCall__ParametersAssignment_2_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8792:1: ( ( ruleParameter ) )
            // InternalKEffects.g:8793:1: ( ruleParameter )
            {
            // InternalKEffects.g:8793:1: ( ruleParameter )
            // InternalKEffects.g:8794:1: ruleParameter
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
    // InternalKEffects.g:8803:1: rule__Parameter__PureOutputAssignment_0_0 : ( ( '!' ) ) ;
    public final void rule__Parameter__PureOutputAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8807:1: ( ( ( '!' ) ) )
            // InternalKEffects.g:8808:1: ( ( '!' ) )
            {
            // InternalKEffects.g:8808:1: ( ( '!' ) )
            // InternalKEffects.g:8809:1: ( '!' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getPureOutputExclamationMarkKeyword_0_0_0()); 
            }
            // InternalKEffects.g:8810:1: ( '!' )
            // InternalKEffects.g:8811:1: '!'
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
    // InternalKEffects.g:8826:1: rule__Parameter__CallByReferenceAssignment_0_1 : ( ( '&' ) ) ;
    public final void rule__Parameter__CallByReferenceAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8830:1: ( ( ( '&' ) ) )
            // InternalKEffects.g:8831:1: ( ( '&' ) )
            {
            // InternalKEffects.g:8831:1: ( ( '&' ) )
            // InternalKEffects.g:8832:1: ( '&' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getCallByReferenceAmpersandKeyword_0_1_0()); 
            }
            // InternalKEffects.g:8833:1: ( '&' )
            // InternalKEffects.g:8834:1: '&'
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
    // InternalKEffects.g:8849:1: rule__Parameter__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__Parameter__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8853:1: ( ( ruleExpression ) )
            // InternalKEffects.g:8854:1: ( ruleExpression )
            {
            // InternalKEffects.g:8854:1: ( ruleExpression )
            // InternalKEffects.g:8855:1: ruleExpression
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
    // InternalKEffects.g:8864:1: rule__TextExpression__TextAssignment : ( RULE_HOSTCODE ) ;
    public final void rule__TextExpression__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8868:1: ( ( RULE_HOSTCODE ) )
            // InternalKEffects.g:8869:1: ( RULE_HOSTCODE )
            {
            // InternalKEffects.g:8869:1: ( RULE_HOSTCODE )
            // InternalKEffects.g:8870:1: RULE_HOSTCODE
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
    // InternalKEffects.g:8879:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8883:1: ( ( RULE_INT ) )
            // InternalKEffects.g:8884:1: ( RULE_INT )
            {
            // InternalKEffects.g:8884:1: ( RULE_INT )
            // InternalKEffects.g:8885:1: RULE_INT
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
    // InternalKEffects.g:8894:1: rule__FloatValue__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8898:1: ( ( RULE_FLOAT ) )
            // InternalKEffects.g:8899:1: ( RULE_FLOAT )
            {
            // InternalKEffects.g:8899:1: ( RULE_FLOAT )
            // InternalKEffects.g:8900:1: RULE_FLOAT
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
    // InternalKEffects.g:8909:1: rule__BoolValue__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BoolValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8913:1: ( ( RULE_BOOLEAN ) )
            // InternalKEffects.g:8914:1: ( RULE_BOOLEAN )
            {
            // InternalKEffects.g:8914:1: ( RULE_BOOLEAN )
            // InternalKEffects.g:8915:1: RULE_BOOLEAN
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
    // InternalKEffects.g:8924:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8928:1: ( ( RULE_STRING ) )
            // InternalKEffects.g:8929:1: ( RULE_STRING )
            {
            // InternalKEffects.g:8929:1: ( RULE_STRING )
            // InternalKEffects.g:8930:1: RULE_STRING
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
    // InternalKEffects.g:8939:1: rule__CommentAnnotation__ValuesAssignment : ( RULE_COMMENT_ANNOTATION ) ;
    public final void rule__CommentAnnotation__ValuesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8943:1: ( ( RULE_COMMENT_ANNOTATION ) )
            // InternalKEffects.g:8944:1: ( RULE_COMMENT_ANNOTATION )
            {
            // InternalKEffects.g:8944:1: ( RULE_COMMENT_ANNOTATION )
            // InternalKEffects.g:8945:1: RULE_COMMENT_ANNOTATION
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
    // InternalKEffects.g:8954:1: rule__TagAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TagAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8958:1: ( ( ruleExtendedID ) )
            // InternalKEffects.g:8959:1: ( ruleExtendedID )
            {
            // InternalKEffects.g:8959:1: ( ruleExtendedID )
            // InternalKEffects.g:8960:1: ruleExtendedID
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
    // InternalKEffects.g:8969:1: rule__KeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8973:1: ( ( ruleExtendedID ) )
            // InternalKEffects.g:8974:1: ( ruleExtendedID )
            {
            // InternalKEffects.g:8974:1: ( ruleExtendedID )
            // InternalKEffects.g:8975:1: ruleExtendedID
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
    // InternalKEffects.g:8984:1: rule__KeyStringValueAnnotation__ValuesAssignment_2 : ( ruleEString ) ;
    public final void rule__KeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8988:1: ( ( ruleEString ) )
            // InternalKEffects.g:8989:1: ( ruleEString )
            {
            // InternalKEffects.g:8989:1: ( ruleEString )
            // InternalKEffects.g:8990:1: ruleEString
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
    // InternalKEffects.g:8999:1: rule__KeyStringValueAnnotation__ValuesAssignment_3_1 : ( ruleEString ) ;
    public final void rule__KeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9003:1: ( ( ruleEString ) )
            // InternalKEffects.g:9004:1: ( ruleEString )
            {
            // InternalKEffects.g:9004:1: ( ruleEString )
            // InternalKEffects.g:9005:1: ruleEString
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
    // InternalKEffects.g:9014:1: rule__TypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9018:1: ( ( ruleExtendedID ) )
            // InternalKEffects.g:9019:1: ( ruleExtendedID )
            {
            // InternalKEffects.g:9019:1: ( ruleExtendedID )
            // InternalKEffects.g:9020:1: ruleExtendedID
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
    // InternalKEffects.g:9029:1: rule__TypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9033:1: ( ( ruleExtendedID ) )
            // InternalKEffects.g:9034:1: ( ruleExtendedID )
            {
            // InternalKEffects.g:9034:1: ( ruleExtendedID )
            // InternalKEffects.g:9035:1: ruleExtendedID
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
    // InternalKEffects.g:9044:1: rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 : ( ruleEStringBoolean ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9048:1: ( ( ruleEStringBoolean ) )
            // InternalKEffects.g:9049:1: ( ruleEStringBoolean )
            {
            // InternalKEffects.g:9049:1: ( ruleEStringBoolean )
            // InternalKEffects.g:9050:1: ruleEStringBoolean
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
    // InternalKEffects.g:9059:1: rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( ruleEStringBoolean ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9063:1: ( ( ruleEStringBoolean ) )
            // InternalKEffects.g:9064:1: ( ruleEStringBoolean )
            {
            // InternalKEffects.g:9064:1: ( ruleEStringBoolean )
            // InternalKEffects.g:9065:1: ruleEStringBoolean
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
    // InternalKEffects.g:9074:1: rule__QuotedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__QuotedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9078:1: ( ( ruleExtendedID ) )
            // InternalKEffects.g:9079:1: ( ruleExtendedID )
            {
            // InternalKEffects.g:9079:1: ( ruleExtendedID )
            // InternalKEffects.g:9080:1: ruleExtendedID
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
    // InternalKEffects.g:9089:1: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 : ( RULE_STRING ) ;
    public final void rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9093:1: ( ( RULE_STRING ) )
            // InternalKEffects.g:9094:1: ( RULE_STRING )
            {
            // InternalKEffects.g:9094:1: ( RULE_STRING )
            // InternalKEffects.g:9095:1: RULE_STRING
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
    // InternalKEffects.g:9104:1: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9108:1: ( ( RULE_STRING ) )
            // InternalKEffects.g:9109:1: ( RULE_STRING )
            {
            // InternalKEffects.g:9109:1: ( RULE_STRING )
            // InternalKEffects.g:9110:1: RULE_STRING
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
    // InternalKEffects.g:9119:1: rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9123:1: ( ( ruleExtendedID ) )
            // InternalKEffects.g:9124:1: ( ruleExtendedID )
            {
            // InternalKEffects.g:9124:1: ( ruleExtendedID )
            // InternalKEffects.g:9125:1: ruleExtendedID
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
    // InternalKEffects.g:9134:1: rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9138:1: ( ( ruleExtendedID ) )
            // InternalKEffects.g:9139:1: ( ruleExtendedID )
            {
            // InternalKEffects.g:9139:1: ( ruleExtendedID )
            // InternalKEffects.g:9140:1: ruleExtendedID
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
    // InternalKEffects.g:9149:1: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 : ( RULE_STRING ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9153:1: ( ( RULE_STRING ) )
            // InternalKEffects.g:9154:1: ( RULE_STRING )
            {
            // InternalKEffects.g:9154:1: ( RULE_STRING )
            // InternalKEffects.g:9155:1: RULE_STRING
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
    // InternalKEffects.g:9164:1: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9168:1: ( ( RULE_STRING ) )
            // InternalKEffects.g:9169:1: ( RULE_STRING )
            {
            // InternalKEffects.g:9169:1: ( RULE_STRING )
            // InternalKEffects.g:9170:1: RULE_STRING
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
    // InternalKEffects.g:9179:1: rule__KeyBooleanValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyBooleanValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9183:1: ( ( ruleExtendedID ) )
            // InternalKEffects.g:9184:1: ( ruleExtendedID )
            {
            // InternalKEffects.g:9184:1: ( ruleExtendedID )
            // InternalKEffects.g:9185:1: ruleExtendedID
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
    // InternalKEffects.g:9194:1: rule__KeyBooleanValueAnnotation__ValueAssignment_2 : ( RULE_BOOLEAN ) ;
    public final void rule__KeyBooleanValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9198:1: ( ( RULE_BOOLEAN ) )
            // InternalKEffects.g:9199:1: ( RULE_BOOLEAN )
            {
            // InternalKEffects.g:9199:1: ( RULE_BOOLEAN )
            // InternalKEffects.g:9200:1: RULE_BOOLEAN
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
    // InternalKEffects.g:9209:1: rule__KeyIntValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyIntValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9213:1: ( ( ruleExtendedID ) )
            // InternalKEffects.g:9214:1: ( ruleExtendedID )
            {
            // InternalKEffects.g:9214:1: ( ruleExtendedID )
            // InternalKEffects.g:9215:1: ruleExtendedID
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
    // InternalKEffects.g:9224:1: rule__KeyIntValueAnnotation__ValueAssignment_2 : ( ruleInteger ) ;
    public final void rule__KeyIntValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9228:1: ( ( ruleInteger ) )
            // InternalKEffects.g:9229:1: ( ruleInteger )
            {
            // InternalKEffects.g:9229:1: ( ruleInteger )
            // InternalKEffects.g:9230:1: ruleInteger
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
    // InternalKEffects.g:9239:1: rule__KeyFloatValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyFloatValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9243:1: ( ( ruleExtendedID ) )
            // InternalKEffects.g:9244:1: ( ruleExtendedID )
            {
            // InternalKEffects.g:9244:1: ( ruleExtendedID )
            // InternalKEffects.g:9245:1: ruleExtendedID
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
    // InternalKEffects.g:9254:1: rule__KeyFloatValueAnnotation__ValueAssignment_2 : ( ruleFloateger ) ;
    public final void rule__KeyFloatValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9258:1: ( ( ruleFloateger ) )
            // InternalKEffects.g:9259:1: ( ruleFloateger )
            {
            // InternalKEffects.g:9259:1: ( ruleFloateger )
            // InternalKEffects.g:9260:1: ruleFloateger
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

    // $ANTLR start synpred1_InternalKEffects
    public final void synpred1_InternalKEffects_fragment() throws RecognitionException {   
        // InternalKEffects.g:1753:1: ( ( ruleAssignment ) )
        // InternalKEffects.g:1753:1: ( ruleAssignment )
        {
        // InternalKEffects.g:1753:1: ( ruleAssignment )
        // InternalKEffects.g:1754:1: ruleAssignment
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getEffectAccess().getAssignmentParserRuleCall_0()); 
        }
        pushFollow(FollowSets000.FOLLOW_2);
        ruleAssignment();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalKEffects

    // $ANTLR start synpred2_InternalKEffects
    public final void synpred2_InternalKEffects_fragment() throws RecognitionException {   
        // InternalKEffects.g:1759:6: ( ( rulePostfixEffect ) )
        // InternalKEffects.g:1759:6: ( rulePostfixEffect )
        {
        // InternalKEffects.g:1759:6: ( rulePostfixEffect )
        // InternalKEffects.g:1760:1: rulePostfixEffect
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getEffectAccess().getPostfixEffectParserRuleCall_1()); 
        }
        pushFollow(FollowSets000.FOLLOW_2);
        rulePostfixEffect();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalKEffects

    // $ANTLR start synpred3_InternalKEffects
    public final void synpred3_InternalKEffects_fragment() throws RecognitionException {   
        // InternalKEffects.g:1765:6: ( ( ruleEmission ) )
        // InternalKEffects.g:1765:6: ( ruleEmission )
        {
        // InternalKEffects.g:1765:6: ( ruleEmission )
        // InternalKEffects.g:1766:1: ruleEmission
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getEffectAccess().getEmissionParserRuleCall_2()); 
        }
        pushFollow(FollowSets000.FOLLOW_2);
        ruleEmission();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalKEffects

    // $ANTLR start synpred4_InternalKEffects
    public final void synpred4_InternalKEffects_fragment() throws RecognitionException {   
        // InternalKEffects.g:1771:6: ( ( ruleHostcodeEffect ) )
        // InternalKEffects.g:1771:6: ( ruleHostcodeEffect )
        {
        // InternalKEffects.g:1771:6: ( ruleHostcodeEffect )
        // InternalKEffects.g:1772:1: ruleHostcodeEffect
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getEffectAccess().getHostcodeEffectParserRuleCall_3()); 
        }
        pushFollow(FollowSets000.FOLLOW_2);
        ruleHostcodeEffect();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalKEffects

    // $ANTLR start synpred6_InternalKEffects
    public final void synpred6_InternalKEffects_fragment() throws RecognitionException {   
        // InternalKEffects.g:1817:1: ( ( ruleBoolExpression ) )
        // InternalKEffects.g:1817:1: ( ruleBoolExpression )
        {
        // InternalKEffects.g:1817:1: ( ruleBoolExpression )
        // InternalKEffects.g:1818:1: ruleBoolExpression
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
    // $ANTLR end synpred6_InternalKEffects

    // $ANTLR start synpred7_InternalKEffects
    public final void synpred7_InternalKEffects_fragment() throws RecognitionException {   
        // InternalKEffects.g:1839:1: ( ( ruleValuedExpression ) )
        // InternalKEffects.g:1839:1: ( ruleValuedExpression )
        {
        // InternalKEffects.g:1839:1: ( ruleValuedExpression )
        // InternalKEffects.g:1840:1: ruleValuedExpression
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
    // $ANTLR end synpred7_InternalKEffects

    // $ANTLR start synpred17_InternalKEffects
    public final void synpred17_InternalKEffects_fragment() throws RecognitionException {   
        // InternalKEffects.g:1963:6: ( ( ( rule__AtomicValuedExpression__Group_3__0 ) ) )
        // InternalKEffects.g:1963:6: ( ( rule__AtomicValuedExpression__Group_3__0 ) )
        {
        // InternalKEffects.g:1963:6: ( ( rule__AtomicValuedExpression__Group_3__0 ) )
        // InternalKEffects.g:1964:1: ( rule__AtomicValuedExpression__Group_3__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_3()); 
        }
        // InternalKEffects.g:1965:1: ( rule__AtomicValuedExpression__Group_3__0 )
        // InternalKEffects.g:1965:2: rule__AtomicValuedExpression__Group_3__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__AtomicValuedExpression__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred17_InternalKEffects

    // Delegated rules

    public final boolean synpred17_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalKEffects_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalKEffects_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalKEffects_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalKEffects_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalKEffects_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalKEffects_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalKEffects_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA13 dfa13 = new DFA13(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\4\13\0\2\uffff";
    static final String dfa_3s = "\1\52\13\0\2\uffff";
    static final String dfa_4s = "\14\uffff\1\1\1\2";
    static final String dfa_5s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\1\6\1\11\1\2\1\3\1\13\6\uffff\1\7\2\uffff\1\14\1\uffff\1\1\3\uffff\1\10\13\uffff\1\12\4\uffff\1\5",
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

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1812:1: rule__Expression__Alternatives : ( ( ruleBoolExpression ) | ( ruleValuedExpression ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_1 = input.LA(1);

                         
                        int index3_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalKEffects()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index3_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_2 = input.LA(1);

                         
                        int index3_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalKEffects()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index3_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA3_3 = input.LA(1);

                         
                        int index3_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalKEffects()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index3_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA3_4 = input.LA(1);

                         
                        int index3_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalKEffects()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index3_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA3_5 = input.LA(1);

                         
                        int index3_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalKEffects()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index3_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA3_6 = input.LA(1);

                         
                        int index3_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalKEffects()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index3_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA3_7 = input.LA(1);

                         
                        int index3_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalKEffects()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index3_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA3_8 = input.LA(1);

                         
                        int index3_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalKEffects()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index3_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA3_9 = input.LA(1);

                         
                        int index3_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalKEffects()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index3_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA3_10 = input.LA(1);

                         
                        int index3_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalKEffects()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index3_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA3_11 = input.LA(1);

                         
                        int index3_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalKEffects()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
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
    static final String dfa_7s = "\15\uffff";
    static final String dfa_8s = "\1\4\4\uffff\7\0\1\uffff";
    static final String dfa_9s = "\1\52\4\uffff\7\0\1\uffff";
    static final String dfa_10s = "\1\uffff\1\1\12\uffff\1\2";
    static final String dfa_11s = "\5\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\1\6\1\11\2\1\1\13\6\uffff\1\7\2\uffff\1\14\1\uffff\1\1\3\uffff\1\10\13\uffff\1\12\4\uffff\1\5",
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

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1834:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_5 = input.LA(1);

                         
                        int index4_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index4_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_6 = input.LA(1);

                         
                        int index4_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index4_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA4_7 = input.LA(1);

                         
                        int index4_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index4_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA4_8 = input.LA(1);

                         
                        int index4_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index4_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA4_9 = input.LA(1);

                         
                        int index4_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index4_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA4_10 = input.LA(1);

                         
                        int index4_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index4_10);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA4_11 = input.LA(1);

                         
                        int index4_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index4_11);
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
    static final String dfa_13s = "\14\uffff";
    static final String dfa_14s = "\1\4\3\uffff\1\0\7\uffff";
    static final String dfa_15s = "\1\52\3\uffff\1\0\7\uffff";
    static final String dfa_16s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\5\uffff\1\4";
    static final String dfa_17s = "\4\uffff\1\0\7\uffff}>";
    static final String[] dfa_18s = {
            "\1\3\2\5\1\1\1\2\1\5\6\uffff\1\5\10\uffff\1\5\13\uffff\1\5\4\uffff\1\4",
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

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "1940:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleStringValue ) | ( ( rule__AtomicValuedExpression__Group_3__0 ) ) | ( ruleAtomicExpression ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_4 = input.LA(1);

                         
                        int index8_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalKEffects()) ) {s = 11;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index8_4);
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
    static final String dfa_19s = "\20\uffff";
    static final String dfa_20s = "\3\uffff\1\14\6\uffff\1\11\3\uffff\2\14";
    static final String dfa_21s = "\1\12\1\uffff\1\6\1\4\1\6\2\7\3\uffff\1\6\3\uffff\2\4";
    static final String dfa_22s = "\1\57\1\uffff\1\6\1\61\1\6\1\7\1\10\3\uffff\1\61\3\uffff\1\61\1\57";
    static final String dfa_23s = "\1\uffff\1\1\5\uffff\1\6\1\2\1\3\1\uffff\1\4\1\7\1\5\2\uffff";
    static final String dfa_24s = "\20\uffff}>";
    static final String[] dfa_25s = {
            "\1\1\44\uffff\1\2",
            "",
            "\1\3",
            "\1\11\1\10\1\12\1\15\1\7\2\14\12\uffff\1\6\17\uffff\1\14\6\uffff\1\13\2\uffff\1\14\1\4\1\5",
            "\1\16",
            "\1\17",
            "\1\15\1\7",
            "",
            "",
            "",
            "\1\11\2\uffff\2\11\22\uffff\7\14\1\uffff\1\11\6\uffff\1\14\1\uffff\4\11",
            "",
            "",
            "",
            "\1\11\1\10\1\12\1\15\1\7\2\14\12\uffff\1\6\17\uffff\1\14\6\uffff\1\13\2\uffff\1\14\1\4\1\5",
            "\1\11\1\10\1\12\1\15\1\7\2\14\12\uffff\1\6\17\uffff\1\14\6\uffff\1\13\2\uffff\1\14"
    };

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_19;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "2050:1: rule__Annotation__Alternatives : ( ( ruleCommentAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) | ( ruleTagAnnotation ) );";
        }
    }
    static final String dfa_26s = "\17\uffff";
    static final String dfa_27s = "\3\uffff\1\11\11\uffff\2\11";
    static final String dfa_28s = "\1\12\1\uffff\1\6\1\4\1\6\1\7\4\uffff\1\7\2\uffff\2\4";
    static final String dfa_29s = "\1\57\1\uffff\1\6\1\61\1\6\1\7\4\uffff\1\10\2\uffff\1\61\1\57";
    static final String dfa_30s = "\1\uffff\1\1\4\uffff\1\3\1\4\1\2\1\7\1\uffff\1\5\1\6\2\uffff";
    static final String dfa_31s = "\17\uffff}>";
    static final String[] dfa_32s = {
            "\1\1\44\uffff\1\2",
            "",
            "\1\3",
            "\1\10\1\7\1\11\1\13\1\14\1\uffff\1\11\12\uffff\1\12\26\uffff\1\6\2\uffff\1\11\1\4\1\5",
            "\1\15",
            "\1\16",
            "",
            "",
            "",
            "",
            "\1\13\1\14",
            "",
            "",
            "\1\10\1\7\1\11\1\13\1\14\1\uffff\1\11\12\uffff\1\12\26\uffff\1\6\2\uffff\1\11\1\4\1\5",
            "\1\10\1\7\1\11\1\13\1\14\1\uffff\1\11\12\uffff\1\12\26\uffff\1\6\2\uffff\1\11"
    };

    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[][] dfa_32 = unpackEncodedStringArray(dfa_32s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_26;
            this.eof = dfa_27;
            this.min = dfa_28;
            this.max = dfa_29;
            this.accept = dfa_30;
            this.special = dfa_31;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "2103:1: rule__RestrictedAnnotation__Alternatives : ( ( ruleCommentAnnotation ) | ( ruleQuotedKeyStringValueAnnotation ) | ( ruleQuotedTypedKeyStringValueAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) | ( ruleTagAnnotation ) );";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000800000000402L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000420022903F0L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00001003E0000000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000100C00000000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000048010000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000420022D03F0L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000480000000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000400000000002L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000003F000000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000420022103F0L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000002010000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000002010040L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000200080L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000200100L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0003000000000000L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0001000000000002L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000080L});
    }


}