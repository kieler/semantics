package de.cau.cs.kieler.core.kexpressions.keffects.ui.contentassist.antlr.internal; 

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
import de.cau.cs.kieler.core.kexpressions.keffects.services.KEffectsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalKEffectsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_BOOLEAN", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_HOSTCODE", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'pre'", "'|'", "'&'", "'!'", "'+'", "'-'", "'*'", "'%'", "'/'", "'val'", "'||'", "'&&'", "'()'", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'&='", "'|='", "'^='", "'++'", "'--'", "'=='", "'<'", "'<='", "'>'", "'>='", "'!='", "'('", "')'", "'['", "']'", "','", "'.'", "'@'", "'#'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=5;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
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
    // InternalKEffects.g:989:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // InternalKEffects.g:990:1: ( ruleAnnotation EOF )
            // InternalKEffects.g:991:1: ruleAnnotation EOF
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
    // InternalKEffects.g:998:1: ruleAnnotation : ( ( rule__Annotation__Alternatives ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1002:2: ( ( ( rule__Annotation__Alternatives ) ) )
            // InternalKEffects.g:1003:1: ( ( rule__Annotation__Alternatives ) )
            {
            // InternalKEffects.g:1003:1: ( ( rule__Annotation__Alternatives ) )
            // InternalKEffects.g:1004:1: ( rule__Annotation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getAlternatives()); 
            }
            // InternalKEffects.g:1005:1: ( rule__Annotation__Alternatives )
            // InternalKEffects.g:1005:2: rule__Annotation__Alternatives
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


    // $ANTLR start "entryRuleQuotedStringAnnotation"
    // InternalKEffects.g:1021:1: entryRuleQuotedStringAnnotation : ruleQuotedStringAnnotation EOF ;
    public final void entryRuleQuotedStringAnnotation() throws RecognitionException {
        try {
            // InternalKEffects.g:1022:1: ( ruleQuotedStringAnnotation EOF )
            // InternalKEffects.g:1023:1: ruleQuotedStringAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedStringAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleQuotedStringAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuotedStringAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuotedStringAnnotation"


    // $ANTLR start "ruleQuotedStringAnnotation"
    // InternalKEffects.g:1030:1: ruleQuotedStringAnnotation : ( ( rule__QuotedStringAnnotation__Alternatives ) ) ;
    public final void ruleQuotedStringAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1034:2: ( ( ( rule__QuotedStringAnnotation__Alternatives ) ) )
            // InternalKEffects.g:1035:1: ( ( rule__QuotedStringAnnotation__Alternatives ) )
            {
            // InternalKEffects.g:1035:1: ( ( rule__QuotedStringAnnotation__Alternatives ) )
            // InternalKEffects.g:1036:1: ( rule__QuotedStringAnnotation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedStringAnnotationAccess().getAlternatives()); 
            }
            // InternalKEffects.g:1037:1: ( rule__QuotedStringAnnotation__Alternatives )
            // InternalKEffects.g:1037:2: rule__QuotedStringAnnotation__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedStringAnnotation__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuotedStringAnnotationAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuotedStringAnnotation"


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


    // $ANTLR start "entryRuleRestrictedKeyStringValueAnnotation"
    // InternalKEffects.g:1133:1: entryRuleRestrictedKeyStringValueAnnotation : ruleRestrictedKeyStringValueAnnotation EOF ;
    public final void entryRuleRestrictedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKEffects.g:1134:1: ( ruleRestrictedKeyStringValueAnnotation EOF )
            // InternalKEffects.g:1135:1: ruleRestrictedKeyStringValueAnnotation EOF
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
    // InternalKEffects.g:1142:1: ruleRestrictedKeyStringValueAnnotation : ( ( rule__RestrictedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleRestrictedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1146:2: ( ( ( rule__RestrictedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKEffects.g:1147:1: ( ( rule__RestrictedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKEffects.g:1147:1: ( ( rule__RestrictedKeyStringValueAnnotation__Group__0 ) )
            // InternalKEffects.g:1148:1: ( rule__RestrictedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKEffects.g:1149:1: ( rule__RestrictedKeyStringValueAnnotation__Group__0 )
            // InternalKEffects.g:1149:2: rule__RestrictedKeyStringValueAnnotation__Group__0
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
    // InternalKEffects.g:1161:1: entryRuleTypedKeyStringValueAnnotation : ruleTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKEffects.g:1162:1: ( ruleTypedKeyStringValueAnnotation EOF )
            // InternalKEffects.g:1163:1: ruleTypedKeyStringValueAnnotation EOF
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
    // InternalKEffects.g:1170:1: ruleTypedKeyStringValueAnnotation : ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1174:2: ( ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKEffects.g:1175:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKEffects.g:1175:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            // InternalKEffects.g:1176:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKEffects.g:1177:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            // InternalKEffects.g:1177:2: rule__TypedKeyStringValueAnnotation__Group__0
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
    // InternalKEffects.g:1189:1: entryRuleRestrictedTypedKeyStringValueAnnotation : ruleRestrictedTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleRestrictedTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKEffects.g:1190:1: ( ruleRestrictedTypedKeyStringValueAnnotation EOF )
            // InternalKEffects.g:1191:1: ruleRestrictedTypedKeyStringValueAnnotation EOF
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
    // InternalKEffects.g:1198:1: ruleRestrictedTypedKeyStringValueAnnotation : ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleRestrictedTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1202:2: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKEffects.g:1203:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKEffects.g:1203:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 ) )
            // InternalKEffects.g:1204:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKEffects.g:1205:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 )
            // InternalKEffects.g:1205:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__0
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
    // InternalKEffects.g:1217:1: entryRuleQuotedKeyStringValueAnnotation : ruleQuotedKeyStringValueAnnotation EOF ;
    public final void entryRuleQuotedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKEffects.g:1218:1: ( ruleQuotedKeyStringValueAnnotation EOF )
            // InternalKEffects.g:1219:1: ruleQuotedKeyStringValueAnnotation EOF
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
    // InternalKEffects.g:1226:1: ruleQuotedKeyStringValueAnnotation : ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleQuotedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1230:2: ( ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKEffects.g:1231:1: ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKEffects.g:1231:1: ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) )
            // InternalKEffects.g:1232:1: ( rule__QuotedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKEffects.g:1233:1: ( rule__QuotedKeyStringValueAnnotation__Group__0 )
            // InternalKEffects.g:1233:2: rule__QuotedKeyStringValueAnnotation__Group__0
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
    // InternalKEffects.g:1245:1: entryRuleQuotedTypedKeyStringValueAnnotation : ruleQuotedTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKEffects.g:1246:1: ( ruleQuotedTypedKeyStringValueAnnotation EOF )
            // InternalKEffects.g:1247:1: ruleQuotedTypedKeyStringValueAnnotation EOF
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
    // InternalKEffects.g:1254:1: ruleQuotedTypedKeyStringValueAnnotation : ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1258:2: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKEffects.g:1259:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKEffects.g:1259:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) )
            // InternalKEffects.g:1260:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKEffects.g:1261:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 )
            // InternalKEffects.g:1261:2: rule__QuotedTypedKeyStringValueAnnotation__Group__0
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
    // InternalKEffects.g:1275:1: entryRuleEStringBoolean : ruleEStringBoolean EOF ;
    public final void entryRuleEStringBoolean() throws RecognitionException {
        try {
            // InternalKEffects.g:1276:1: ( ruleEStringBoolean EOF )
            // InternalKEffects.g:1277:1: ruleEStringBoolean EOF
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
    // InternalKEffects.g:1284:1: ruleEStringBoolean : ( ( rule__EStringBoolean__Alternatives ) ) ;
    public final void ruleEStringBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1288:2: ( ( ( rule__EStringBoolean__Alternatives ) ) )
            // InternalKEffects.g:1289:1: ( ( rule__EStringBoolean__Alternatives ) )
            {
            // InternalKEffects.g:1289:1: ( ( rule__EStringBoolean__Alternatives ) )
            // InternalKEffects.g:1290:1: ( rule__EStringBoolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringBooleanAccess().getAlternatives()); 
            }
            // InternalKEffects.g:1291:1: ( rule__EStringBoolean__Alternatives )
            // InternalKEffects.g:1291:2: rule__EStringBoolean__Alternatives
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
    // InternalKEffects.g:1303:1: entryRuleEStringAllTypes : ruleEStringAllTypes EOF ;
    public final void entryRuleEStringAllTypes() throws RecognitionException {
        try {
            // InternalKEffects.g:1304:1: ( ruleEStringAllTypes EOF )
            // InternalKEffects.g:1305:1: ruleEStringAllTypes EOF
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
    // InternalKEffects.g:1312:1: ruleEStringAllTypes : ( ( rule__EStringAllTypes__Alternatives ) ) ;
    public final void ruleEStringAllTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1316:2: ( ( ( rule__EStringAllTypes__Alternatives ) ) )
            // InternalKEffects.g:1317:1: ( ( rule__EStringAllTypes__Alternatives ) )
            {
            // InternalKEffects.g:1317:1: ( ( rule__EStringAllTypes__Alternatives ) )
            // InternalKEffects.g:1318:1: ( rule__EStringAllTypes__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAllTypesAccess().getAlternatives()); 
            }
            // InternalKEffects.g:1319:1: ( rule__EStringAllTypes__Alternatives )
            // InternalKEffects.g:1319:2: rule__EStringAllTypes__Alternatives
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
    // InternalKEffects.g:1331:1: entryRuleExtendedID : ruleExtendedID EOF ;
    public final void entryRuleExtendedID() throws RecognitionException {
        try {
            // InternalKEffects.g:1332:1: ( ruleExtendedID EOF )
            // InternalKEffects.g:1333:1: ruleExtendedID EOF
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
    // InternalKEffects.g:1340:1: ruleExtendedID : ( ( rule__ExtendedID__Group__0 ) ) ;
    public final void ruleExtendedID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1344:2: ( ( ( rule__ExtendedID__Group__0 ) ) )
            // InternalKEffects.g:1345:1: ( ( rule__ExtendedID__Group__0 ) )
            {
            // InternalKEffects.g:1345:1: ( ( rule__ExtendedID__Group__0 ) )
            // InternalKEffects.g:1346:1: ( rule__ExtendedID__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup()); 
            }
            // InternalKEffects.g:1347:1: ( rule__ExtendedID__Group__0 )
            // InternalKEffects.g:1347:2: rule__ExtendedID__Group__0
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
    // InternalKEffects.g:1361:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // InternalKEffects.g:1362:1: ( ruleInteger EOF )
            // InternalKEffects.g:1363:1: ruleInteger EOF
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
    // InternalKEffects.g:1370:1: ruleInteger : ( ( rule__Integer__Group__0 ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1374:2: ( ( ( rule__Integer__Group__0 ) ) )
            // InternalKEffects.g:1375:1: ( ( rule__Integer__Group__0 ) )
            {
            // InternalKEffects.g:1375:1: ( ( rule__Integer__Group__0 ) )
            // InternalKEffects.g:1376:1: ( rule__Integer__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getGroup()); 
            }
            // InternalKEffects.g:1377:1: ( rule__Integer__Group__0 )
            // InternalKEffects.g:1377:2: rule__Integer__Group__0
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
    // InternalKEffects.g:1389:1: entryRuleFloateger : ruleFloateger EOF ;
    public final void entryRuleFloateger() throws RecognitionException {
        try {
            // InternalKEffects.g:1390:1: ( ruleFloateger EOF )
            // InternalKEffects.g:1391:1: ruleFloateger EOF
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
    // InternalKEffects.g:1398:1: ruleFloateger : ( ( rule__Floateger__Group__0 ) ) ;
    public final void ruleFloateger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1402:2: ( ( ( rule__Floateger__Group__0 ) ) )
            // InternalKEffects.g:1403:1: ( ( rule__Floateger__Group__0 ) )
            {
            // InternalKEffects.g:1403:1: ( ( rule__Floateger__Group__0 ) )
            // InternalKEffects.g:1404:1: ( rule__Floateger__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloategerAccess().getGroup()); 
            }
            // InternalKEffects.g:1405:1: ( rule__Floateger__Group__0 )
            // InternalKEffects.g:1405:2: rule__Floateger__Group__0
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
    // InternalKEffects.g:1418:1: ruleAssignOperator : ( ( rule__AssignOperator__Alternatives ) ) ;
    public final void ruleAssignOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1422:1: ( ( ( rule__AssignOperator__Alternatives ) ) )
            // InternalKEffects.g:1423:1: ( ( rule__AssignOperator__Alternatives ) )
            {
            // InternalKEffects.g:1423:1: ( ( rule__AssignOperator__Alternatives ) )
            // InternalKEffects.g:1424:1: ( rule__AssignOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignOperatorAccess().getAlternatives()); 
            }
            // InternalKEffects.g:1425:1: ( rule__AssignOperator__Alternatives )
            // InternalKEffects.g:1425:2: rule__AssignOperator__Alternatives
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
    // InternalKEffects.g:1437:1: rulePostfixOperator : ( ( rule__PostfixOperator__Alternatives ) ) ;
    public final void rulePostfixOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1441:1: ( ( ( rule__PostfixOperator__Alternatives ) ) )
            // InternalKEffects.g:1442:1: ( ( rule__PostfixOperator__Alternatives ) )
            {
            // InternalKEffects.g:1442:1: ( ( rule__PostfixOperator__Alternatives ) )
            // InternalKEffects.g:1443:1: ( rule__PostfixOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPostfixOperatorAccess().getAlternatives()); 
            }
            // InternalKEffects.g:1444:1: ( rule__PostfixOperator__Alternatives )
            // InternalKEffects.g:1444:2: rule__PostfixOperator__Alternatives
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
    // InternalKEffects.g:1456:1: ruleCompareOperator : ( ( rule__CompareOperator__Alternatives ) ) ;
    public final void ruleCompareOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1460:1: ( ( ( rule__CompareOperator__Alternatives ) ) )
            // InternalKEffects.g:1461:1: ( ( rule__CompareOperator__Alternatives ) )
            {
            // InternalKEffects.g:1461:1: ( ( rule__CompareOperator__Alternatives ) )
            // InternalKEffects.g:1462:1: ( rule__CompareOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            }
            // InternalKEffects.g:1463:1: ( rule__CompareOperator__Alternatives )
            // InternalKEffects.g:1463:2: rule__CompareOperator__Alternatives
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
    // InternalKEffects.g:1475:1: rulePreOperator : ( ( 'pre' ) ) ;
    public final void rulePreOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1479:1: ( ( ( 'pre' ) ) )
            // InternalKEffects.g:1480:1: ( ( 'pre' ) )
            {
            // InternalKEffects.g:1480:1: ( ( 'pre' ) )
            // InternalKEffects.g:1481:1: ( 'pre' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreOperatorAccess().getPREEnumLiteralDeclaration()); 
            }
            // InternalKEffects.g:1482:1: ( 'pre' )
            // InternalKEffects.g:1482:3: 'pre'
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
    // InternalKEffects.g:1495:1: ruleBitwiseOrOperator : ( ( '|' ) ) ;
    public final void ruleBitwiseOrOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1499:1: ( ( ( '|' ) ) )
            // InternalKEffects.g:1500:1: ( ( '|' ) )
            {
            // InternalKEffects.g:1500:1: ( ( '|' ) )
            // InternalKEffects.g:1501:1: ( '|' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrOperatorAccess().getBITWISE_OREnumLiteralDeclaration()); 
            }
            // InternalKEffects.g:1502:1: ( '|' )
            // InternalKEffects.g:1502:3: '|'
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
    // InternalKEffects.g:1515:1: ruleBitwiseAndOperator : ( ( '&' ) ) ;
    public final void ruleBitwiseAndOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1519:1: ( ( ( '&' ) ) )
            // InternalKEffects.g:1520:1: ( ( '&' ) )
            {
            // InternalKEffects.g:1520:1: ( ( '&' ) )
            // InternalKEffects.g:1521:1: ( '&' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndOperatorAccess().getBITWISE_ANDEnumLiteralDeclaration()); 
            }
            // InternalKEffects.g:1522:1: ( '&' )
            // InternalKEffects.g:1522:3: '&'
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
    // InternalKEffects.g:1535:1: ruleNotOperator : ( ( '!' ) ) ;
    public final void ruleNotOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1539:1: ( ( ( '!' ) ) )
            // InternalKEffects.g:1540:1: ( ( '!' ) )
            {
            // InternalKEffects.g:1540:1: ( ( '!' ) )
            // InternalKEffects.g:1541:1: ( '!' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration()); 
            }
            // InternalKEffects.g:1542:1: ( '!' )
            // InternalKEffects.g:1542:3: '!'
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
    // InternalKEffects.g:1555:1: ruleAddOperator : ( ( '+' ) ) ;
    public final void ruleAddOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1559:1: ( ( ( '+' ) ) )
            // InternalKEffects.g:1560:1: ( ( '+' ) )
            {
            // InternalKEffects.g:1560:1: ( ( '+' ) )
            // InternalKEffects.g:1561:1: ( '+' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddOperatorAccess().getADDEnumLiteralDeclaration()); 
            }
            // InternalKEffects.g:1562:1: ( '+' )
            // InternalKEffects.g:1562:3: '+'
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
    // InternalKEffects.g:1575:1: ruleSubOperator : ( ( '-' ) ) ;
    public final void ruleSubOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1579:1: ( ( ( '-' ) ) )
            // InternalKEffects.g:1580:1: ( ( '-' ) )
            {
            // InternalKEffects.g:1580:1: ( ( '-' ) )
            // InternalKEffects.g:1581:1: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubOperatorAccess().getSUBEnumLiteralDeclaration()); 
            }
            // InternalKEffects.g:1582:1: ( '-' )
            // InternalKEffects.g:1582:3: '-'
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
    // InternalKEffects.g:1595:1: ruleMultOperator : ( ( '*' ) ) ;
    public final void ruleMultOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1599:1: ( ( ( '*' ) ) )
            // InternalKEffects.g:1600:1: ( ( '*' ) )
            {
            // InternalKEffects.g:1600:1: ( ( '*' ) )
            // InternalKEffects.g:1601:1: ( '*' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration()); 
            }
            // InternalKEffects.g:1602:1: ( '*' )
            // InternalKEffects.g:1602:3: '*'
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
    // InternalKEffects.g:1615:1: ruleModOperator : ( ( '%' ) ) ;
    public final void ruleModOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1619:1: ( ( ( '%' ) ) )
            // InternalKEffects.g:1620:1: ( ( '%' ) )
            {
            // InternalKEffects.g:1620:1: ( ( '%' ) )
            // InternalKEffects.g:1621:1: ( '%' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModOperatorAccess().getMODEnumLiteralDeclaration()); 
            }
            // InternalKEffects.g:1622:1: ( '%' )
            // InternalKEffects.g:1622:3: '%'
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
    // InternalKEffects.g:1635:1: ruleDivOperator : ( ( '/' ) ) ;
    public final void ruleDivOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1639:1: ( ( ( '/' ) ) )
            // InternalKEffects.g:1640:1: ( ( '/' ) )
            {
            // InternalKEffects.g:1640:1: ( ( '/' ) )
            // InternalKEffects.g:1641:1: ( '/' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivOperatorAccess().getDIVEnumLiteralDeclaration()); 
            }
            // InternalKEffects.g:1642:1: ( '/' )
            // InternalKEffects.g:1642:3: '/'
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
    // InternalKEffects.g:1655:1: ruleValOperator : ( ( 'val' ) ) ;
    public final void ruleValOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1659:1: ( ( ( 'val' ) ) )
            // InternalKEffects.g:1660:1: ( ( 'val' ) )
            {
            // InternalKEffects.g:1660:1: ( ( 'val' ) )
            // InternalKEffects.g:1661:1: ( 'val' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValOperatorAccess().getVALEnumLiteralDeclaration()); 
            }
            // InternalKEffects.g:1662:1: ( 'val' )
            // InternalKEffects.g:1662:3: 'val'
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
    // InternalKEffects.g:1675:1: ruleLogicalOrOperator : ( ( '||' ) ) ;
    public final void ruleLogicalOrOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1679:1: ( ( ( '||' ) ) )
            // InternalKEffects.g:1680:1: ( ( '||' ) )
            {
            // InternalKEffects.g:1680:1: ( ( '||' ) )
            // InternalKEffects.g:1681:1: ( '||' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrOperatorAccess().getLOGICAL_OREnumLiteralDeclaration()); 
            }
            // InternalKEffects.g:1682:1: ( '||' )
            // InternalKEffects.g:1682:3: '||'
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
    // InternalKEffects.g:1695:1: ruleLogicalAndOperator : ( ( '&&' ) ) ;
    public final void ruleLogicalAndOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1699:1: ( ( ( '&&' ) ) )
            // InternalKEffects.g:1700:1: ( ( '&&' ) )
            {
            // InternalKEffects.g:1700:1: ( ( '&&' ) )
            // InternalKEffects.g:1701:1: ( '&&' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndOperatorAccess().getLOGICAL_ANDEnumLiteralDeclaration()); 
            }
            // InternalKEffects.g:1702:1: ( '&&' )
            // InternalKEffects.g:1702:3: '&&'
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
    // InternalKEffects.g:1724:1: rule__Effect__Alternatives : ( ( ruleAssignment ) | ( rulePostfixEffect ) | ( ruleEmission ) | ( ruleHostcodeEffect ) | ( ruleFunctionCallEffect ) );
    public final void rule__Effect__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1728:1: ( ( ruleAssignment ) | ( rulePostfixEffect ) | ( ruleEmission ) | ( ruleHostcodeEffect ) | ( ruleFunctionCallEffect ) )
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
            case 52:
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
            case 41:
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
                    // InternalKEffects.g:1729:1: ( ruleAssignment )
                    {
                    // InternalKEffects.g:1729:1: ( ruleAssignment )
                    // InternalKEffects.g:1730:1: ruleAssignment
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
                    // InternalKEffects.g:1735:6: ( rulePostfixEffect )
                    {
                    // InternalKEffects.g:1735:6: ( rulePostfixEffect )
                    // InternalKEffects.g:1736:1: rulePostfixEffect
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
                    // InternalKEffects.g:1741:6: ( ruleEmission )
                    {
                    // InternalKEffects.g:1741:6: ( ruleEmission )
                    // InternalKEffects.g:1742:1: ruleEmission
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
                    // InternalKEffects.g:1747:6: ( ruleHostcodeEffect )
                    {
                    // InternalKEffects.g:1747:6: ( ruleHostcodeEffect )
                    // InternalKEffects.g:1748:1: ruleHostcodeEffect
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
                    // InternalKEffects.g:1753:6: ( ruleFunctionCallEffect )
                    {
                    // InternalKEffects.g:1753:6: ( ruleFunctionCallEffect )
                    // InternalKEffects.g:1754:1: ruleFunctionCallEffect
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
    // InternalKEffects.g:1764:1: rule__FunctionCallEffect__Alternatives_3 : ( ( ( rule__FunctionCallEffect__Group_3_0__0 ) ) | ( '()' ) );
    public final void rule__FunctionCallEffect__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1768:1: ( ( ( rule__FunctionCallEffect__Group_3_0__0 ) ) | ( '()' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==46) ) {
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
                    // InternalKEffects.g:1769:1: ( ( rule__FunctionCallEffect__Group_3_0__0 ) )
                    {
                    // InternalKEffects.g:1769:1: ( ( rule__FunctionCallEffect__Group_3_0__0 ) )
                    // InternalKEffects.g:1770:1: ( rule__FunctionCallEffect__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctionCallEffectAccess().getGroup_3_0()); 
                    }
                    // InternalKEffects.g:1771:1: ( rule__FunctionCallEffect__Group_3_0__0 )
                    // InternalKEffects.g:1771:2: rule__FunctionCallEffect__Group_3_0__0
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
                    // InternalKEffects.g:1775:6: ( '()' )
                    {
                    // InternalKEffects.g:1775:6: ( '()' )
                    // InternalKEffects.g:1776:1: '()'
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
    // InternalKEffects.g:1788:1: rule__Expression__Alternatives : ( ( ruleBoolExpression ) | ( ruleValuedExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1792:1: ( ( ruleBoolExpression ) | ( ruleValuedExpression ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalKEffects.g:1793:1: ( ruleBoolExpression )
                    {
                    // InternalKEffects.g:1793:1: ( ruleBoolExpression )
                    // InternalKEffects.g:1794:1: ruleBoolExpression
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
                    // InternalKEffects.g:1799:6: ( ruleValuedExpression )
                    {
                    // InternalKEffects.g:1799:6: ( ruleValuedExpression )
                    // InternalKEffects.g:1800:1: ruleValuedExpression
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
    // InternalKEffects.g:1810:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );
    public final void rule__NotOrValuedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1814:1: ( ( ruleValuedExpression ) | ( ruleNotExpression ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalKEffects.g:1815:1: ( ruleValuedExpression )
                    {
                    // InternalKEffects.g:1815:1: ( ruleValuedExpression )
                    // InternalKEffects.g:1816:1: ruleValuedExpression
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
                    // InternalKEffects.g:1821:6: ( ruleNotExpression )
                    {
                    // InternalKEffects.g:1821:6: ( ruleNotExpression )
                    // InternalKEffects.g:1822:1: ruleNotExpression
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
    // InternalKEffects.g:1832:1: rule__NotExpression__Alternatives : ( ( ( rule__NotExpression__Group_0__0 ) ) | ( ruleAtomicExpression ) );
    public final void rule__NotExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1836:1: ( ( ( rule__NotExpression__Group_0__0 ) ) | ( ruleAtomicExpression ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=RULE_BOOLEAN && LA5_0<=RULE_ID)||LA5_0==RULE_HOSTCODE||LA5_0==16||LA5_0==25||LA5_0==41||LA5_0==46) ) {
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
                    // InternalKEffects.g:1837:1: ( ( rule__NotExpression__Group_0__0 ) )
                    {
                    // InternalKEffects.g:1837:1: ( ( rule__NotExpression__Group_0__0 ) )
                    // InternalKEffects.g:1838:1: ( rule__NotExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNotExpressionAccess().getGroup_0()); 
                    }
                    // InternalKEffects.g:1839:1: ( rule__NotExpression__Group_0__0 )
                    // InternalKEffects.g:1839:2: rule__NotExpression__Group_0__0
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
                    // InternalKEffects.g:1843:6: ( ruleAtomicExpression )
                    {
                    // InternalKEffects.g:1843:6: ( ruleAtomicExpression )
                    // InternalKEffects.g:1844:1: ruleAtomicExpression
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
    // InternalKEffects.g:1854:1: rule__NegExpression__Alternatives : ( ( ( rule__NegExpression__Group_0__0 ) ) | ( ruleAtomicValuedExpression ) );
    public final void rule__NegExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1858:1: ( ( ( rule__NegExpression__Group_0__0 ) ) | ( ruleAtomicValuedExpression ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_HOSTCODE)||LA6_0==16||LA6_0==25||LA6_0==41||LA6_0==46) ) {
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
                    // InternalKEffects.g:1859:1: ( ( rule__NegExpression__Group_0__0 ) )
                    {
                    // InternalKEffects.g:1859:1: ( ( rule__NegExpression__Group_0__0 ) )
                    // InternalKEffects.g:1860:1: ( rule__NegExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNegExpressionAccess().getGroup_0()); 
                    }
                    // InternalKEffects.g:1861:1: ( rule__NegExpression__Group_0__0 )
                    // InternalKEffects.g:1861:2: rule__NegExpression__Group_0__0
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
                    // InternalKEffects.g:1865:6: ( ruleAtomicValuedExpression )
                    {
                    // InternalKEffects.g:1865:6: ( ruleAtomicValuedExpression )
                    // InternalKEffects.g:1866:1: ruleAtomicValuedExpression
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
    // InternalKEffects.g:1876:1: rule__AtomicExpression__Alternatives : ( ( ruleBoolValue ) | ( ruleValuedObjectTestExpression ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ruleFunctionCall ) | ( ruleTextExpression ) );
    public final void rule__AtomicExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1880:1: ( ( ruleBoolValue ) | ( ruleValuedObjectTestExpression ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ruleFunctionCall ) | ( ruleTextExpression ) )
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
            case 46:
                {
                alt7=3;
                }
                break;
            case 41:
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
                    // InternalKEffects.g:1881:1: ( ruleBoolValue )
                    {
                    // InternalKEffects.g:1881:1: ( ruleBoolValue )
                    // InternalKEffects.g:1882:1: ruleBoolValue
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
                    // InternalKEffects.g:1887:6: ( ruleValuedObjectTestExpression )
                    {
                    // InternalKEffects.g:1887:6: ( ruleValuedObjectTestExpression )
                    // InternalKEffects.g:1888:1: ruleValuedObjectTestExpression
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
                    // InternalKEffects.g:1893:6: ( ( rule__AtomicExpression__Group_2__0 ) )
                    {
                    // InternalKEffects.g:1893:6: ( ( rule__AtomicExpression__Group_2__0 ) )
                    // InternalKEffects.g:1894:1: ( rule__AtomicExpression__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getGroup_2()); 
                    }
                    // InternalKEffects.g:1895:1: ( rule__AtomicExpression__Group_2__0 )
                    // InternalKEffects.g:1895:2: rule__AtomicExpression__Group_2__0
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
                    // InternalKEffects.g:1899:6: ( ruleFunctionCall )
                    {
                    // InternalKEffects.g:1899:6: ( ruleFunctionCall )
                    // InternalKEffects.g:1900:1: ruleFunctionCall
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
                    // InternalKEffects.g:1905:6: ( ruleTextExpression )
                    {
                    // InternalKEffects.g:1905:6: ( ruleTextExpression )
                    // InternalKEffects.g:1906:1: ruleTextExpression
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
    // InternalKEffects.g:1916:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleStringValue ) | ( ( rule__AtomicValuedExpression__Group_3__0 ) ) | ( ruleAtomicExpression ) );
    public final void rule__AtomicValuedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1920:1: ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleStringValue ) | ( ( rule__AtomicValuedExpression__Group_3__0 ) ) | ( ruleAtomicExpression ) )
            int alt8=5;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalKEffects.g:1921:1: ( ruleIntValue )
                    {
                    // InternalKEffects.g:1921:1: ( ruleIntValue )
                    // InternalKEffects.g:1922:1: ruleIntValue
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
                    // InternalKEffects.g:1927:6: ( ruleFloatValue )
                    {
                    // InternalKEffects.g:1927:6: ( ruleFloatValue )
                    // InternalKEffects.g:1928:1: ruleFloatValue
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
                    // InternalKEffects.g:1933:6: ( ruleStringValue )
                    {
                    // InternalKEffects.g:1933:6: ( ruleStringValue )
                    // InternalKEffects.g:1934:1: ruleStringValue
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
                    // InternalKEffects.g:1939:6: ( ( rule__AtomicValuedExpression__Group_3__0 ) )
                    {
                    // InternalKEffects.g:1939:6: ( ( rule__AtomicValuedExpression__Group_3__0 ) )
                    // InternalKEffects.g:1940:1: ( rule__AtomicValuedExpression__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_3()); 
                    }
                    // InternalKEffects.g:1941:1: ( rule__AtomicValuedExpression__Group_3__0 )
                    // InternalKEffects.g:1941:2: rule__AtomicValuedExpression__Group_3__0
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
                    // InternalKEffects.g:1945:6: ( ruleAtomicExpression )
                    {
                    // InternalKEffects.g:1945:6: ( ruleAtomicExpression )
                    // InternalKEffects.g:1946:1: ruleAtomicExpression
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
    // InternalKEffects.g:1956:1: rule__ValuedObjectTestExpression__Alternatives : ( ( ( rule__ValuedObjectTestExpression__Group_0__0 ) ) | ( ruleValuedObjectReference ) );
    public final void rule__ValuedObjectTestExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1960:1: ( ( ( rule__ValuedObjectTestExpression__Group_0__0 ) ) | ( ruleValuedObjectReference ) )
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
                    // InternalKEffects.g:1961:1: ( ( rule__ValuedObjectTestExpression__Group_0__0 ) )
                    {
                    // InternalKEffects.g:1961:1: ( ( rule__ValuedObjectTestExpression__Group_0__0 ) )
                    // InternalKEffects.g:1962:1: ( rule__ValuedObjectTestExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getGroup_0()); 
                    }
                    // InternalKEffects.g:1963:1: ( rule__ValuedObjectTestExpression__Group_0__0 )
                    // InternalKEffects.g:1963:2: rule__ValuedObjectTestExpression__Group_0__0
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
                    // InternalKEffects.g:1967:6: ( ruleValuedObjectReference )
                    {
                    // InternalKEffects.g:1967:6: ( ruleValuedObjectReference )
                    // InternalKEffects.g:1968:1: ruleValuedObjectReference
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
    // InternalKEffects.g:1978:1: rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 : ( ( rulePreOperator ) | ( ruleValOperator ) );
    public final void rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:1982:1: ( ( rulePreOperator ) | ( ruleValOperator ) )
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
                    // InternalKEffects.g:1983:1: ( rulePreOperator )
                    {
                    // InternalKEffects.g:1983:1: ( rulePreOperator )
                    // InternalKEffects.g:1984:1: rulePreOperator
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
                    // InternalKEffects.g:1989:6: ( ruleValOperator )
                    {
                    // InternalKEffects.g:1989:6: ( ruleValOperator )
                    // InternalKEffects.g:1990:1: ruleValOperator
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
    // InternalKEffects.g:2000:1: rule__FunctionCall__Alternatives_2 : ( ( ( rule__FunctionCall__Group_2_0__0 ) ) | ( '()' ) );
    public final void rule__FunctionCall__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2004:1: ( ( ( rule__FunctionCall__Group_2_0__0 ) ) | ( '()' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==46) ) {
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
                    // InternalKEffects.g:2005:1: ( ( rule__FunctionCall__Group_2_0__0 ) )
                    {
                    // InternalKEffects.g:2005:1: ( ( rule__FunctionCall__Group_2_0__0 ) )
                    // InternalKEffects.g:2006:1: ( rule__FunctionCall__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctionCallAccess().getGroup_2_0()); 
                    }
                    // InternalKEffects.g:2007:1: ( rule__FunctionCall__Group_2_0__0 )
                    // InternalKEffects.g:2007:2: rule__FunctionCall__Group_2_0__0
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
                    // InternalKEffects.g:2011:6: ( '()' )
                    {
                    // InternalKEffects.g:2011:6: ( '()' )
                    // InternalKEffects.g:2012:1: '()'
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
    // InternalKEffects.g:2025:1: rule__Annotation__Alternatives : ( ( ruleCommentAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleTagAnnotation ) );
    public final void rule__Annotation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2029:1: ( ( ruleCommentAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleTagAnnotation ) )
            int alt12=4;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalKEffects.g:2030:1: ( ruleCommentAnnotation )
                    {
                    // InternalKEffects.g:2030:1: ( ruleCommentAnnotation )
                    // InternalKEffects.g:2031:1: ruleCommentAnnotation
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
                    // InternalKEffects.g:2036:6: ( ruleKeyStringValueAnnotation )
                    {
                    // InternalKEffects.g:2036:6: ( ruleKeyStringValueAnnotation )
                    // InternalKEffects.g:2037:1: ruleKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleKeyStringValueAnnotation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKEffects.g:2042:6: ( ruleTypedKeyStringValueAnnotation )
                    {
                    // InternalKEffects.g:2042:6: ( ruleTypedKeyStringValueAnnotation )
                    // InternalKEffects.g:2043:1: ruleTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTypedKeyStringValueAnnotation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKEffects.g:2048:6: ( ruleTagAnnotation )
                    {
                    // InternalKEffects.g:2048:6: ( ruleTagAnnotation )
                    // InternalKEffects.g:2049:1: ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTagAnnotation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_3()); 
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


    // $ANTLR start "rule__QuotedStringAnnotation__Alternatives"
    // InternalKEffects.g:2061:1: rule__QuotedStringAnnotation__Alternatives : ( ( ruleCommentAnnotation ) | ( ruleQuotedKeyStringValueAnnotation ) | ( ruleQuotedTypedKeyStringValueAnnotation ) | ( ruleTagAnnotation ) );
    public final void rule__QuotedStringAnnotation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2065:1: ( ( ruleCommentAnnotation ) | ( ruleQuotedKeyStringValueAnnotation ) | ( ruleQuotedTypedKeyStringValueAnnotation ) | ( ruleTagAnnotation ) )
            int alt13=4;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalKEffects.g:2066:1: ( ruleCommentAnnotation )
                    {
                    // InternalKEffects.g:2066:1: ( ruleCommentAnnotation )
                    // InternalKEffects.g:2067:1: ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQuotedStringAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleCommentAnnotation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getQuotedStringAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKEffects.g:2072:6: ( ruleQuotedKeyStringValueAnnotation )
                    {
                    // InternalKEffects.g:2072:6: ( ruleQuotedKeyStringValueAnnotation )
                    // InternalKEffects.g:2073:1: ruleQuotedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQuotedStringAnnotationAccess().getQuotedKeyStringValueAnnotationParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleQuotedKeyStringValueAnnotation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getQuotedStringAnnotationAccess().getQuotedKeyStringValueAnnotationParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKEffects.g:2078:6: ( ruleQuotedTypedKeyStringValueAnnotation )
                    {
                    // InternalKEffects.g:2078:6: ( ruleQuotedTypedKeyStringValueAnnotation )
                    // InternalKEffects.g:2079:1: ruleQuotedTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQuotedStringAnnotationAccess().getQuotedTypedKeyStringValueAnnotationParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleQuotedTypedKeyStringValueAnnotation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getQuotedStringAnnotationAccess().getQuotedTypedKeyStringValueAnnotationParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKEffects.g:2084:6: ( ruleTagAnnotation )
                    {
                    // InternalKEffects.g:2084:6: ( ruleTagAnnotation )
                    // InternalKEffects.g:2085:1: ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQuotedStringAnnotationAccess().getTagAnnotationParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTagAnnotation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getQuotedStringAnnotationAccess().getTagAnnotationParserRuleCall_3()); 
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
    // $ANTLR end "rule__QuotedStringAnnotation__Alternatives"


    // $ANTLR start "rule__EStringBoolean__Alternatives"
    // InternalKEffects.g:2096:1: rule__EStringBoolean__Alternatives : ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) );
    public final void rule__EStringBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2100:1: ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) )
            int alt14=3;
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
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalKEffects.g:2101:1: ( RULE_STRING )
                    {
                    // InternalKEffects.g:2101:1: ( RULE_STRING )
                    // InternalKEffects.g:2102:1: RULE_STRING
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
                    // InternalKEffects.g:2107:6: ( ruleExtendedID )
                    {
                    // InternalKEffects.g:2107:6: ( ruleExtendedID )
                    // InternalKEffects.g:2108:1: ruleExtendedID
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
                    // InternalKEffects.g:2113:6: ( RULE_BOOLEAN )
                    {
                    // InternalKEffects.g:2113:6: ( RULE_BOOLEAN )
                    // InternalKEffects.g:2114:1: RULE_BOOLEAN
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
    // InternalKEffects.g:2124:1: rule__EStringAllTypes__Alternatives : ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) | ( ruleInteger ) | ( ruleFloateger ) );
    public final void rule__EStringAllTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2128:1: ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) | ( ruleInteger ) | ( ruleFloateger ) )
            int alt15=5;
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
            case 21:
                {
                int LA15_4 = input.LA(2);

                if ( (LA15_4==RULE_FLOAT) ) {
                    alt15=5;
                }
                else if ( (LA15_4==RULE_INT) ) {
                    alt15=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt15=4;
                }
                break;
            case RULE_FLOAT:
                {
                alt15=5;
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
                    // InternalKEffects.g:2129:1: ( RULE_STRING )
                    {
                    // InternalKEffects.g:2129:1: ( RULE_STRING )
                    // InternalKEffects.g:2130:1: RULE_STRING
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
                    // InternalKEffects.g:2135:6: ( ruleExtendedID )
                    {
                    // InternalKEffects.g:2135:6: ( ruleExtendedID )
                    // InternalKEffects.g:2136:1: ruleExtendedID
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
                    // InternalKEffects.g:2141:6: ( RULE_BOOLEAN )
                    {
                    // InternalKEffects.g:2141:6: ( RULE_BOOLEAN )
                    // InternalKEffects.g:2142:1: RULE_BOOLEAN
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
                    // InternalKEffects.g:2147:6: ( ruleInteger )
                    {
                    // InternalKEffects.g:2147:6: ( ruleInteger )
                    // InternalKEffects.g:2148:1: ruleInteger
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
                    // InternalKEffects.g:2153:6: ( ruleFloateger )
                    {
                    // InternalKEffects.g:2153:6: ( ruleFloateger )
                    // InternalKEffects.g:2154:1: ruleFloateger
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


    // $ANTLR start "rule__AssignOperator__Alternatives"
    // InternalKEffects.g:2164:1: rule__AssignOperator__Alternatives : ( ( ( '=' ) ) | ( ( '+=' ) ) | ( ( '-=' ) ) | ( ( '*=' ) ) | ( ( '/=' ) ) | ( ( '%=' ) ) | ( ( '&=' ) ) | ( ( '|=' ) ) | ( ( '^=' ) ) );
    public final void rule__AssignOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2168:1: ( ( ( '=' ) ) | ( ( '+=' ) ) | ( ( '-=' ) ) | ( ( '*=' ) ) | ( ( '/=' ) ) | ( ( '%=' ) ) | ( ( '&=' ) ) | ( ( '|=' ) ) | ( ( '^=' ) ) )
            int alt16=9;
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
            case 34:
                {
                alt16=6;
                }
                break;
            case 35:
                {
                alt16=7;
                }
                break;
            case 36:
                {
                alt16=8;
                }
                break;
            case 37:
                {
                alt16=9;
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
                    // InternalKEffects.g:2169:1: ( ( '=' ) )
                    {
                    // InternalKEffects.g:2169:1: ( ( '=' ) )
                    // InternalKEffects.g:2170:1: ( '=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0()); 
                    }
                    // InternalKEffects.g:2171:1: ( '=' )
                    // InternalKEffects.g:2171:3: '='
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
                    // InternalKEffects.g:2176:6: ( ( '+=' ) )
                    {
                    // InternalKEffects.g:2176:6: ( ( '+=' ) )
                    // InternalKEffects.g:2177:1: ( '+=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssignOperatorAccess().getASSIGNADDEnumLiteralDeclaration_1()); 
                    }
                    // InternalKEffects.g:2178:1: ( '+=' )
                    // InternalKEffects.g:2178:3: '+='
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
                    // InternalKEffects.g:2183:6: ( ( '-=' ) )
                    {
                    // InternalKEffects.g:2183:6: ( ( '-=' ) )
                    // InternalKEffects.g:2184:1: ( '-=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssignOperatorAccess().getASSIGNSUBEnumLiteralDeclaration_2()); 
                    }
                    // InternalKEffects.g:2185:1: ( '-=' )
                    // InternalKEffects.g:2185:3: '-='
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
                    // InternalKEffects.g:2190:6: ( ( '*=' ) )
                    {
                    // InternalKEffects.g:2190:6: ( ( '*=' ) )
                    // InternalKEffects.g:2191:1: ( '*=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssignOperatorAccess().getASSIGNMULEnumLiteralDeclaration_3()); 
                    }
                    // InternalKEffects.g:2192:1: ( '*=' )
                    // InternalKEffects.g:2192:3: '*='
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
                    // InternalKEffects.g:2197:6: ( ( '/=' ) )
                    {
                    // InternalKEffects.g:2197:6: ( ( '/=' ) )
                    // InternalKEffects.g:2198:1: ( '/=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssignOperatorAccess().getASSIGNDIVEnumLiteralDeclaration_4()); 
                    }
                    // InternalKEffects.g:2199:1: ( '/=' )
                    // InternalKEffects.g:2199:3: '/='
                    {
                    match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAssignOperatorAccess().getASSIGNDIVEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKEffects.g:2204:6: ( ( '%=' ) )
                    {
                    // InternalKEffects.g:2204:6: ( ( '%=' ) )
                    // InternalKEffects.g:2205:1: ( '%=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssignOperatorAccess().getASSIGNMODEnumLiteralDeclaration_5()); 
                    }
                    // InternalKEffects.g:2206:1: ( '%=' )
                    // InternalKEffects.g:2206:3: '%='
                    {
                    match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAssignOperatorAccess().getASSIGNMODEnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalKEffects.g:2211:6: ( ( '&=' ) )
                    {
                    // InternalKEffects.g:2211:6: ( ( '&=' ) )
                    // InternalKEffects.g:2212:1: ( '&=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssignOperatorAccess().getASSIGNANDEnumLiteralDeclaration_6()); 
                    }
                    // InternalKEffects.g:2213:1: ( '&=' )
                    // InternalKEffects.g:2213:3: '&='
                    {
                    match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAssignOperatorAccess().getASSIGNANDEnumLiteralDeclaration_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalKEffects.g:2218:6: ( ( '|=' ) )
                    {
                    // InternalKEffects.g:2218:6: ( ( '|=' ) )
                    // InternalKEffects.g:2219:1: ( '|=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssignOperatorAccess().getASSIGNOREnumLiteralDeclaration_7()); 
                    }
                    // InternalKEffects.g:2220:1: ( '|=' )
                    // InternalKEffects.g:2220:3: '|='
                    {
                    match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAssignOperatorAccess().getASSIGNOREnumLiteralDeclaration_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalKEffects.g:2225:6: ( ( '^=' ) )
                    {
                    // InternalKEffects.g:2225:6: ( ( '^=' ) )
                    // InternalKEffects.g:2226:1: ( '^=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssignOperatorAccess().getASSIGNXOREnumLiteralDeclaration_8()); 
                    }
                    // InternalKEffects.g:2227:1: ( '^=' )
                    // InternalKEffects.g:2227:3: '^='
                    {
                    match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAssignOperatorAccess().getASSIGNXOREnumLiteralDeclaration_8()); 
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
    // InternalKEffects.g:2237:1: rule__PostfixOperator__Alternatives : ( ( ( '++' ) ) | ( ( '--' ) ) );
    public final void rule__PostfixOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2241:1: ( ( ( '++' ) ) | ( ( '--' ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==38) ) {
                alt17=1;
            }
            else if ( (LA17_0==39) ) {
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
                    // InternalKEffects.g:2242:1: ( ( '++' ) )
                    {
                    // InternalKEffects.g:2242:1: ( ( '++' ) )
                    // InternalKEffects.g:2243:1: ( '++' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPostfixOperatorAccess().getPOSTFIXADDEnumLiteralDeclaration_0()); 
                    }
                    // InternalKEffects.g:2244:1: ( '++' )
                    // InternalKEffects.g:2244:3: '++'
                    {
                    match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPostfixOperatorAccess().getPOSTFIXADDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKEffects.g:2249:6: ( ( '--' ) )
                    {
                    // InternalKEffects.g:2249:6: ( ( '--' ) )
                    // InternalKEffects.g:2250:1: ( '--' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPostfixOperatorAccess().getPOSTFIXSUBEnumLiteralDeclaration_1()); 
                    }
                    // InternalKEffects.g:2251:1: ( '--' )
                    // InternalKEffects.g:2251:3: '--'
                    {
                    match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalKEffects.g:2261:1: rule__CompareOperator__Alternatives : ( ( ( '==' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '!=' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2265:1: ( ( ( '==' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '!=' ) ) )
            int alt18=6;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt18=1;
                }
                break;
            case 41:
                {
                alt18=2;
                }
                break;
            case 42:
                {
                alt18=3;
                }
                break;
            case 43:
                {
                alt18=4;
                }
                break;
            case 44:
                {
                alt18=5;
                }
                break;
            case 45:
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
                    // InternalKEffects.g:2266:1: ( ( '==' ) )
                    {
                    // InternalKEffects.g:2266:1: ( ( '==' ) )
                    // InternalKEffects.g:2267:1: ( '==' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // InternalKEffects.g:2268:1: ( '==' )
                    // InternalKEffects.g:2268:3: '=='
                    {
                    match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKEffects.g:2273:6: ( ( '<' ) )
                    {
                    // InternalKEffects.g:2273:6: ( ( '<' ) )
                    // InternalKEffects.g:2274:1: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }
                    // InternalKEffects.g:2275:1: ( '<' )
                    // InternalKEffects.g:2275:3: '<'
                    {
                    match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKEffects.g:2280:6: ( ( '<=' ) )
                    {
                    // InternalKEffects.g:2280:6: ( ( '<=' ) )
                    // InternalKEffects.g:2281:1: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }
                    // InternalKEffects.g:2282:1: ( '<=' )
                    // InternalKEffects.g:2282:3: '<='
                    {
                    match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKEffects.g:2287:6: ( ( '>' ) )
                    {
                    // InternalKEffects.g:2287:6: ( ( '>' ) )
                    // InternalKEffects.g:2288:1: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }
                    // InternalKEffects.g:2289:1: ( '>' )
                    // InternalKEffects.g:2289:3: '>'
                    {
                    match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKEffects.g:2294:6: ( ( '>=' ) )
                    {
                    // InternalKEffects.g:2294:6: ( ( '>=' ) )
                    // InternalKEffects.g:2295:1: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }
                    // InternalKEffects.g:2296:1: ( '>=' )
                    // InternalKEffects.g:2296:3: '>='
                    {
                    match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKEffects.g:2301:6: ( ( '!=' ) )
                    {
                    // InternalKEffects.g:2301:6: ( ( '!=' ) )
                    // InternalKEffects.g:2302:1: ( '!=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_5()); 
                    }
                    // InternalKEffects.g:2303:1: ( '!=' )
                    // InternalKEffects.g:2303:3: '!='
                    {
                    match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalKEffects.g:2317:1: rule__Emission__Group__0 : rule__Emission__Group__0__Impl rule__Emission__Group__1 ;
    public final void rule__Emission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2321:1: ( rule__Emission__Group__0__Impl rule__Emission__Group__1 )
            // InternalKEffects.g:2322:2: rule__Emission__Group__0__Impl rule__Emission__Group__1
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
    // InternalKEffects.g:2329:1: rule__Emission__Group__0__Impl : ( ( rule__Emission__AnnotationsAssignment_0 )* ) ;
    public final void rule__Emission__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2333:1: ( ( ( rule__Emission__AnnotationsAssignment_0 )* ) )
            // InternalKEffects.g:2334:1: ( ( rule__Emission__AnnotationsAssignment_0 )* )
            {
            // InternalKEffects.g:2334:1: ( ( rule__Emission__AnnotationsAssignment_0 )* )
            // InternalKEffects.g:2335:1: ( rule__Emission__AnnotationsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getAnnotationsAssignment_0()); 
            }
            // InternalKEffects.g:2336:1: ( rule__Emission__AnnotationsAssignment_0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_COMMENT_ANNOTATION||LA19_0==52) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalKEffects.g:2336:2: rule__Emission__AnnotationsAssignment_0
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
    // InternalKEffects.g:2346:1: rule__Emission__Group__1 : rule__Emission__Group__1__Impl rule__Emission__Group__2 ;
    public final void rule__Emission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2350:1: ( rule__Emission__Group__1__Impl rule__Emission__Group__2 )
            // InternalKEffects.g:2351:2: rule__Emission__Group__1__Impl rule__Emission__Group__2
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
    // InternalKEffects.g:2358:1: rule__Emission__Group__1__Impl : ( ( rule__Emission__ValuedObjectAssignment_1 ) ) ;
    public final void rule__Emission__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2362:1: ( ( ( rule__Emission__ValuedObjectAssignment_1 ) ) )
            // InternalKEffects.g:2363:1: ( ( rule__Emission__ValuedObjectAssignment_1 ) )
            {
            // InternalKEffects.g:2363:1: ( ( rule__Emission__ValuedObjectAssignment_1 ) )
            // InternalKEffects.g:2364:1: ( rule__Emission__ValuedObjectAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getValuedObjectAssignment_1()); 
            }
            // InternalKEffects.g:2365:1: ( rule__Emission__ValuedObjectAssignment_1 )
            // InternalKEffects.g:2365:2: rule__Emission__ValuedObjectAssignment_1
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
    // InternalKEffects.g:2375:1: rule__Emission__Group__2 : rule__Emission__Group__2__Impl ;
    public final void rule__Emission__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2379:1: ( rule__Emission__Group__2__Impl )
            // InternalKEffects.g:2380:2: rule__Emission__Group__2__Impl
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
    // InternalKEffects.g:2386:1: rule__Emission__Group__2__Impl : ( ( rule__Emission__Group_2__0 )? ) ;
    public final void rule__Emission__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2390:1: ( ( ( rule__Emission__Group_2__0 )? ) )
            // InternalKEffects.g:2391:1: ( ( rule__Emission__Group_2__0 )? )
            {
            // InternalKEffects.g:2391:1: ( ( rule__Emission__Group_2__0 )? )
            // InternalKEffects.g:2392:1: ( rule__Emission__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getGroup_2()); 
            }
            // InternalKEffects.g:2393:1: ( rule__Emission__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==46) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalKEffects.g:2393:2: rule__Emission__Group_2__0
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
    // InternalKEffects.g:2409:1: rule__Emission__Group_2__0 : rule__Emission__Group_2__0__Impl rule__Emission__Group_2__1 ;
    public final void rule__Emission__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2413:1: ( rule__Emission__Group_2__0__Impl rule__Emission__Group_2__1 )
            // InternalKEffects.g:2414:2: rule__Emission__Group_2__0__Impl rule__Emission__Group_2__1
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
    // InternalKEffects.g:2421:1: rule__Emission__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Emission__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2425:1: ( ( '(' ) )
            // InternalKEffects.g:2426:1: ( '(' )
            {
            // InternalKEffects.g:2426:1: ( '(' )
            // InternalKEffects.g:2427:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:2440:1: rule__Emission__Group_2__1 : rule__Emission__Group_2__1__Impl rule__Emission__Group_2__2 ;
    public final void rule__Emission__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2444:1: ( rule__Emission__Group_2__1__Impl rule__Emission__Group_2__2 )
            // InternalKEffects.g:2445:2: rule__Emission__Group_2__1__Impl rule__Emission__Group_2__2
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
    // InternalKEffects.g:2452:1: rule__Emission__Group_2__1__Impl : ( ( rule__Emission__NewValueAssignment_2_1 ) ) ;
    public final void rule__Emission__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2456:1: ( ( ( rule__Emission__NewValueAssignment_2_1 ) ) )
            // InternalKEffects.g:2457:1: ( ( rule__Emission__NewValueAssignment_2_1 ) )
            {
            // InternalKEffects.g:2457:1: ( ( rule__Emission__NewValueAssignment_2_1 ) )
            // InternalKEffects.g:2458:1: ( rule__Emission__NewValueAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getNewValueAssignment_2_1()); 
            }
            // InternalKEffects.g:2459:1: ( rule__Emission__NewValueAssignment_2_1 )
            // InternalKEffects.g:2459:2: rule__Emission__NewValueAssignment_2_1
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
    // InternalKEffects.g:2469:1: rule__Emission__Group_2__2 : rule__Emission__Group_2__2__Impl ;
    public final void rule__Emission__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2473:1: ( rule__Emission__Group_2__2__Impl )
            // InternalKEffects.g:2474:2: rule__Emission__Group_2__2__Impl
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
    // InternalKEffects.g:2480:1: rule__Emission__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Emission__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2484:1: ( ( ')' ) )
            // InternalKEffects.g:2485:1: ( ')' )
            {
            // InternalKEffects.g:2485:1: ( ')' )
            // InternalKEffects.g:2486:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:2505:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2509:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalKEffects.g:2510:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
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
    // InternalKEffects.g:2517:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__AnnotationsAssignment_0 )* ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2521:1: ( ( ( rule__Assignment__AnnotationsAssignment_0 )* ) )
            // InternalKEffects.g:2522:1: ( ( rule__Assignment__AnnotationsAssignment_0 )* )
            {
            // InternalKEffects.g:2522:1: ( ( rule__Assignment__AnnotationsAssignment_0 )* )
            // InternalKEffects.g:2523:1: ( rule__Assignment__AnnotationsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getAnnotationsAssignment_0()); 
            }
            // InternalKEffects.g:2524:1: ( rule__Assignment__AnnotationsAssignment_0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_COMMENT_ANNOTATION||LA21_0==52) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalKEffects.g:2524:2: rule__Assignment__AnnotationsAssignment_0
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
    // InternalKEffects.g:2534:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2538:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalKEffects.g:2539:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
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
    // InternalKEffects.g:2546:1: rule__Assignment__Group__1__Impl : ( ( rule__Assignment__ValuedObjectAssignment_1 ) ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2550:1: ( ( ( rule__Assignment__ValuedObjectAssignment_1 ) ) )
            // InternalKEffects.g:2551:1: ( ( rule__Assignment__ValuedObjectAssignment_1 ) )
            {
            // InternalKEffects.g:2551:1: ( ( rule__Assignment__ValuedObjectAssignment_1 ) )
            // InternalKEffects.g:2552:1: ( rule__Assignment__ValuedObjectAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValuedObjectAssignment_1()); 
            }
            // InternalKEffects.g:2553:1: ( rule__Assignment__ValuedObjectAssignment_1 )
            // InternalKEffects.g:2553:2: rule__Assignment__ValuedObjectAssignment_1
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
    // InternalKEffects.g:2563:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl rule__Assignment__Group__3 ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2567:1: ( rule__Assignment__Group__2__Impl rule__Assignment__Group__3 )
            // InternalKEffects.g:2568:2: rule__Assignment__Group__2__Impl rule__Assignment__Group__3
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
    // InternalKEffects.g:2575:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__Group_2__0 )* ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2579:1: ( ( ( rule__Assignment__Group_2__0 )* ) )
            // InternalKEffects.g:2580:1: ( ( rule__Assignment__Group_2__0 )* )
            {
            // InternalKEffects.g:2580:1: ( ( rule__Assignment__Group_2__0 )* )
            // InternalKEffects.g:2581:1: ( rule__Assignment__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup_2()); 
            }
            // InternalKEffects.g:2582:1: ( rule__Assignment__Group_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==48) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalKEffects.g:2582:2: rule__Assignment__Group_2__0
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
    // InternalKEffects.g:2592:1: rule__Assignment__Group__3 : rule__Assignment__Group__3__Impl rule__Assignment__Group__4 ;
    public final void rule__Assignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2596:1: ( rule__Assignment__Group__3__Impl rule__Assignment__Group__4 )
            // InternalKEffects.g:2597:2: rule__Assignment__Group__3__Impl rule__Assignment__Group__4
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
    // InternalKEffects.g:2604:1: rule__Assignment__Group__3__Impl : ( ( rule__Assignment__OperatorAssignment_3 ) ) ;
    public final void rule__Assignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2608:1: ( ( ( rule__Assignment__OperatorAssignment_3 ) ) )
            // InternalKEffects.g:2609:1: ( ( rule__Assignment__OperatorAssignment_3 ) )
            {
            // InternalKEffects.g:2609:1: ( ( rule__Assignment__OperatorAssignment_3 ) )
            // InternalKEffects.g:2610:1: ( rule__Assignment__OperatorAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getOperatorAssignment_3()); 
            }
            // InternalKEffects.g:2611:1: ( rule__Assignment__OperatorAssignment_3 )
            // InternalKEffects.g:2611:2: rule__Assignment__OperatorAssignment_3
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
    // InternalKEffects.g:2621:1: rule__Assignment__Group__4 : rule__Assignment__Group__4__Impl ;
    public final void rule__Assignment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2625:1: ( rule__Assignment__Group__4__Impl )
            // InternalKEffects.g:2626:2: rule__Assignment__Group__4__Impl
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
    // InternalKEffects.g:2632:1: rule__Assignment__Group__4__Impl : ( ( rule__Assignment__ExpressionAssignment_4 ) ) ;
    public final void rule__Assignment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2636:1: ( ( ( rule__Assignment__ExpressionAssignment_4 ) ) )
            // InternalKEffects.g:2637:1: ( ( rule__Assignment__ExpressionAssignment_4 ) )
            {
            // InternalKEffects.g:2637:1: ( ( rule__Assignment__ExpressionAssignment_4 ) )
            // InternalKEffects.g:2638:1: ( rule__Assignment__ExpressionAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getExpressionAssignment_4()); 
            }
            // InternalKEffects.g:2639:1: ( rule__Assignment__ExpressionAssignment_4 )
            // InternalKEffects.g:2639:2: rule__Assignment__ExpressionAssignment_4
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
    // InternalKEffects.g:2659:1: rule__Assignment__Group_2__0 : rule__Assignment__Group_2__0__Impl rule__Assignment__Group_2__1 ;
    public final void rule__Assignment__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2663:1: ( rule__Assignment__Group_2__0__Impl rule__Assignment__Group_2__1 )
            // InternalKEffects.g:2664:2: rule__Assignment__Group_2__0__Impl rule__Assignment__Group_2__1
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
    // InternalKEffects.g:2671:1: rule__Assignment__Group_2__0__Impl : ( '[' ) ;
    public final void rule__Assignment__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2675:1: ( ( '[' ) )
            // InternalKEffects.g:2676:1: ( '[' )
            {
            // InternalKEffects.g:2676:1: ( '[' )
            // InternalKEffects.g:2677:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getLeftSquareBracketKeyword_2_0()); 
            }
            match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:2690:1: rule__Assignment__Group_2__1 : rule__Assignment__Group_2__1__Impl rule__Assignment__Group_2__2 ;
    public final void rule__Assignment__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2694:1: ( rule__Assignment__Group_2__1__Impl rule__Assignment__Group_2__2 )
            // InternalKEffects.g:2695:2: rule__Assignment__Group_2__1__Impl rule__Assignment__Group_2__2
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
    // InternalKEffects.g:2702:1: rule__Assignment__Group_2__1__Impl : ( ( rule__Assignment__IndicesAssignment_2_1 ) ) ;
    public final void rule__Assignment__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2706:1: ( ( ( rule__Assignment__IndicesAssignment_2_1 ) ) )
            // InternalKEffects.g:2707:1: ( ( rule__Assignment__IndicesAssignment_2_1 ) )
            {
            // InternalKEffects.g:2707:1: ( ( rule__Assignment__IndicesAssignment_2_1 ) )
            // InternalKEffects.g:2708:1: ( rule__Assignment__IndicesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getIndicesAssignment_2_1()); 
            }
            // InternalKEffects.g:2709:1: ( rule__Assignment__IndicesAssignment_2_1 )
            // InternalKEffects.g:2709:2: rule__Assignment__IndicesAssignment_2_1
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
    // InternalKEffects.g:2719:1: rule__Assignment__Group_2__2 : rule__Assignment__Group_2__2__Impl ;
    public final void rule__Assignment__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2723:1: ( rule__Assignment__Group_2__2__Impl )
            // InternalKEffects.g:2724:2: rule__Assignment__Group_2__2__Impl
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
    // InternalKEffects.g:2730:1: rule__Assignment__Group_2__2__Impl : ( ']' ) ;
    public final void rule__Assignment__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2734:1: ( ( ']' ) )
            // InternalKEffects.g:2735:1: ( ']' )
            {
            // InternalKEffects.g:2735:1: ( ']' )
            // InternalKEffects.g:2736:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getRightSquareBracketKeyword_2_2()); 
            }
            match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:2755:1: rule__PostfixEffect__Group__0 : rule__PostfixEffect__Group__0__Impl rule__PostfixEffect__Group__1 ;
    public final void rule__PostfixEffect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2759:1: ( rule__PostfixEffect__Group__0__Impl rule__PostfixEffect__Group__1 )
            // InternalKEffects.g:2760:2: rule__PostfixEffect__Group__0__Impl rule__PostfixEffect__Group__1
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
    // InternalKEffects.g:2767:1: rule__PostfixEffect__Group__0__Impl : ( ( rule__PostfixEffect__AnnotationsAssignment_0 )* ) ;
    public final void rule__PostfixEffect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2771:1: ( ( ( rule__PostfixEffect__AnnotationsAssignment_0 )* ) )
            // InternalKEffects.g:2772:1: ( ( rule__PostfixEffect__AnnotationsAssignment_0 )* )
            {
            // InternalKEffects.g:2772:1: ( ( rule__PostfixEffect__AnnotationsAssignment_0 )* )
            // InternalKEffects.g:2773:1: ( rule__PostfixEffect__AnnotationsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPostfixEffectAccess().getAnnotationsAssignment_0()); 
            }
            // InternalKEffects.g:2774:1: ( rule__PostfixEffect__AnnotationsAssignment_0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_COMMENT_ANNOTATION||LA23_0==52) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalKEffects.g:2774:2: rule__PostfixEffect__AnnotationsAssignment_0
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
    // InternalKEffects.g:2784:1: rule__PostfixEffect__Group__1 : rule__PostfixEffect__Group__1__Impl rule__PostfixEffect__Group__2 ;
    public final void rule__PostfixEffect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2788:1: ( rule__PostfixEffect__Group__1__Impl rule__PostfixEffect__Group__2 )
            // InternalKEffects.g:2789:2: rule__PostfixEffect__Group__1__Impl rule__PostfixEffect__Group__2
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
    // InternalKEffects.g:2796:1: rule__PostfixEffect__Group__1__Impl : ( ( rule__PostfixEffect__ValuedObjectAssignment_1 ) ) ;
    public final void rule__PostfixEffect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2800:1: ( ( ( rule__PostfixEffect__ValuedObjectAssignment_1 ) ) )
            // InternalKEffects.g:2801:1: ( ( rule__PostfixEffect__ValuedObjectAssignment_1 ) )
            {
            // InternalKEffects.g:2801:1: ( ( rule__PostfixEffect__ValuedObjectAssignment_1 ) )
            // InternalKEffects.g:2802:1: ( rule__PostfixEffect__ValuedObjectAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPostfixEffectAccess().getValuedObjectAssignment_1()); 
            }
            // InternalKEffects.g:2803:1: ( rule__PostfixEffect__ValuedObjectAssignment_1 )
            // InternalKEffects.g:2803:2: rule__PostfixEffect__ValuedObjectAssignment_1
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
    // InternalKEffects.g:2813:1: rule__PostfixEffect__Group__2 : rule__PostfixEffect__Group__2__Impl rule__PostfixEffect__Group__3 ;
    public final void rule__PostfixEffect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2817:1: ( rule__PostfixEffect__Group__2__Impl rule__PostfixEffect__Group__3 )
            // InternalKEffects.g:2818:2: rule__PostfixEffect__Group__2__Impl rule__PostfixEffect__Group__3
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
    // InternalKEffects.g:2825:1: rule__PostfixEffect__Group__2__Impl : ( ( rule__PostfixEffect__Group_2__0 )* ) ;
    public final void rule__PostfixEffect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2829:1: ( ( ( rule__PostfixEffect__Group_2__0 )* ) )
            // InternalKEffects.g:2830:1: ( ( rule__PostfixEffect__Group_2__0 )* )
            {
            // InternalKEffects.g:2830:1: ( ( rule__PostfixEffect__Group_2__0 )* )
            // InternalKEffects.g:2831:1: ( rule__PostfixEffect__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPostfixEffectAccess().getGroup_2()); 
            }
            // InternalKEffects.g:2832:1: ( rule__PostfixEffect__Group_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==48) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalKEffects.g:2832:2: rule__PostfixEffect__Group_2__0
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
    // InternalKEffects.g:2842:1: rule__PostfixEffect__Group__3 : rule__PostfixEffect__Group__3__Impl ;
    public final void rule__PostfixEffect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2846:1: ( rule__PostfixEffect__Group__3__Impl )
            // InternalKEffects.g:2847:2: rule__PostfixEffect__Group__3__Impl
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
    // InternalKEffects.g:2853:1: rule__PostfixEffect__Group__3__Impl : ( ( rule__PostfixEffect__OperatorAssignment_3 ) ) ;
    public final void rule__PostfixEffect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2857:1: ( ( ( rule__PostfixEffect__OperatorAssignment_3 ) ) )
            // InternalKEffects.g:2858:1: ( ( rule__PostfixEffect__OperatorAssignment_3 ) )
            {
            // InternalKEffects.g:2858:1: ( ( rule__PostfixEffect__OperatorAssignment_3 ) )
            // InternalKEffects.g:2859:1: ( rule__PostfixEffect__OperatorAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPostfixEffectAccess().getOperatorAssignment_3()); 
            }
            // InternalKEffects.g:2860:1: ( rule__PostfixEffect__OperatorAssignment_3 )
            // InternalKEffects.g:2860:2: rule__PostfixEffect__OperatorAssignment_3
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
    // InternalKEffects.g:2878:1: rule__PostfixEffect__Group_2__0 : rule__PostfixEffect__Group_2__0__Impl rule__PostfixEffect__Group_2__1 ;
    public final void rule__PostfixEffect__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2882:1: ( rule__PostfixEffect__Group_2__0__Impl rule__PostfixEffect__Group_2__1 )
            // InternalKEffects.g:2883:2: rule__PostfixEffect__Group_2__0__Impl rule__PostfixEffect__Group_2__1
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
    // InternalKEffects.g:2890:1: rule__PostfixEffect__Group_2__0__Impl : ( '[' ) ;
    public final void rule__PostfixEffect__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2894:1: ( ( '[' ) )
            // InternalKEffects.g:2895:1: ( '[' )
            {
            // InternalKEffects.g:2895:1: ( '[' )
            // InternalKEffects.g:2896:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPostfixEffectAccess().getLeftSquareBracketKeyword_2_0()); 
            }
            match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:2909:1: rule__PostfixEffect__Group_2__1 : rule__PostfixEffect__Group_2__1__Impl rule__PostfixEffect__Group_2__2 ;
    public final void rule__PostfixEffect__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2913:1: ( rule__PostfixEffect__Group_2__1__Impl rule__PostfixEffect__Group_2__2 )
            // InternalKEffects.g:2914:2: rule__PostfixEffect__Group_2__1__Impl rule__PostfixEffect__Group_2__2
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
    // InternalKEffects.g:2921:1: rule__PostfixEffect__Group_2__1__Impl : ( ( rule__PostfixEffect__IndicesAssignment_2_1 ) ) ;
    public final void rule__PostfixEffect__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2925:1: ( ( ( rule__PostfixEffect__IndicesAssignment_2_1 ) ) )
            // InternalKEffects.g:2926:1: ( ( rule__PostfixEffect__IndicesAssignment_2_1 ) )
            {
            // InternalKEffects.g:2926:1: ( ( rule__PostfixEffect__IndicesAssignment_2_1 ) )
            // InternalKEffects.g:2927:1: ( rule__PostfixEffect__IndicesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPostfixEffectAccess().getIndicesAssignment_2_1()); 
            }
            // InternalKEffects.g:2928:1: ( rule__PostfixEffect__IndicesAssignment_2_1 )
            // InternalKEffects.g:2928:2: rule__PostfixEffect__IndicesAssignment_2_1
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
    // InternalKEffects.g:2938:1: rule__PostfixEffect__Group_2__2 : rule__PostfixEffect__Group_2__2__Impl ;
    public final void rule__PostfixEffect__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2942:1: ( rule__PostfixEffect__Group_2__2__Impl )
            // InternalKEffects.g:2943:2: rule__PostfixEffect__Group_2__2__Impl
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
    // InternalKEffects.g:2949:1: rule__PostfixEffect__Group_2__2__Impl : ( ']' ) ;
    public final void rule__PostfixEffect__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2953:1: ( ( ']' ) )
            // InternalKEffects.g:2954:1: ( ']' )
            {
            // InternalKEffects.g:2954:1: ( ']' )
            // InternalKEffects.g:2955:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPostfixEffectAccess().getRightSquareBracketKeyword_2_2()); 
            }
            match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:2974:1: rule__HostcodeEffect__Group__0 : rule__HostcodeEffect__Group__0__Impl rule__HostcodeEffect__Group__1 ;
    public final void rule__HostcodeEffect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2978:1: ( rule__HostcodeEffect__Group__0__Impl rule__HostcodeEffect__Group__1 )
            // InternalKEffects.g:2979:2: rule__HostcodeEffect__Group__0__Impl rule__HostcodeEffect__Group__1
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
    // InternalKEffects.g:2986:1: rule__HostcodeEffect__Group__0__Impl : ( ( rule__HostcodeEffect__AnnotationsAssignment_0 )* ) ;
    public final void rule__HostcodeEffect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:2990:1: ( ( ( rule__HostcodeEffect__AnnotationsAssignment_0 )* ) )
            // InternalKEffects.g:2991:1: ( ( rule__HostcodeEffect__AnnotationsAssignment_0 )* )
            {
            // InternalKEffects.g:2991:1: ( ( rule__HostcodeEffect__AnnotationsAssignment_0 )* )
            // InternalKEffects.g:2992:1: ( rule__HostcodeEffect__AnnotationsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHostcodeEffectAccess().getAnnotationsAssignment_0()); 
            }
            // InternalKEffects.g:2993:1: ( rule__HostcodeEffect__AnnotationsAssignment_0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_COMMENT_ANNOTATION||LA25_0==52) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalKEffects.g:2993:2: rule__HostcodeEffect__AnnotationsAssignment_0
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
    // InternalKEffects.g:3003:1: rule__HostcodeEffect__Group__1 : rule__HostcodeEffect__Group__1__Impl ;
    public final void rule__HostcodeEffect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3007:1: ( rule__HostcodeEffect__Group__1__Impl )
            // InternalKEffects.g:3008:2: rule__HostcodeEffect__Group__1__Impl
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
    // InternalKEffects.g:3014:1: rule__HostcodeEffect__Group__1__Impl : ( ( rule__HostcodeEffect__TextAssignment_1 ) ) ;
    public final void rule__HostcodeEffect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3018:1: ( ( ( rule__HostcodeEffect__TextAssignment_1 ) ) )
            // InternalKEffects.g:3019:1: ( ( rule__HostcodeEffect__TextAssignment_1 ) )
            {
            // InternalKEffects.g:3019:1: ( ( rule__HostcodeEffect__TextAssignment_1 ) )
            // InternalKEffects.g:3020:1: ( rule__HostcodeEffect__TextAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHostcodeEffectAccess().getTextAssignment_1()); 
            }
            // InternalKEffects.g:3021:1: ( rule__HostcodeEffect__TextAssignment_1 )
            // InternalKEffects.g:3021:2: rule__HostcodeEffect__TextAssignment_1
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
    // InternalKEffects.g:3035:1: rule__FunctionCallEffect__Group__0 : rule__FunctionCallEffect__Group__0__Impl rule__FunctionCallEffect__Group__1 ;
    public final void rule__FunctionCallEffect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3039:1: ( rule__FunctionCallEffect__Group__0__Impl rule__FunctionCallEffect__Group__1 )
            // InternalKEffects.g:3040:2: rule__FunctionCallEffect__Group__0__Impl rule__FunctionCallEffect__Group__1
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
    // InternalKEffects.g:3047:1: rule__FunctionCallEffect__Group__0__Impl : ( ( rule__FunctionCallEffect__AnnotationsAssignment_0 )* ) ;
    public final void rule__FunctionCallEffect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3051:1: ( ( ( rule__FunctionCallEffect__AnnotationsAssignment_0 )* ) )
            // InternalKEffects.g:3052:1: ( ( rule__FunctionCallEffect__AnnotationsAssignment_0 )* )
            {
            // InternalKEffects.g:3052:1: ( ( rule__FunctionCallEffect__AnnotationsAssignment_0 )* )
            // InternalKEffects.g:3053:1: ( rule__FunctionCallEffect__AnnotationsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallEffectAccess().getAnnotationsAssignment_0()); 
            }
            // InternalKEffects.g:3054:1: ( rule__FunctionCallEffect__AnnotationsAssignment_0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_COMMENT_ANNOTATION||LA26_0==52) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalKEffects.g:3054:2: rule__FunctionCallEffect__AnnotationsAssignment_0
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
    // InternalKEffects.g:3064:1: rule__FunctionCallEffect__Group__1 : rule__FunctionCallEffect__Group__1__Impl rule__FunctionCallEffect__Group__2 ;
    public final void rule__FunctionCallEffect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3068:1: ( rule__FunctionCallEffect__Group__1__Impl rule__FunctionCallEffect__Group__2 )
            // InternalKEffects.g:3069:2: rule__FunctionCallEffect__Group__1__Impl rule__FunctionCallEffect__Group__2
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
    // InternalKEffects.g:3076:1: rule__FunctionCallEffect__Group__1__Impl : ( '<' ) ;
    public final void rule__FunctionCallEffect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3080:1: ( ( '<' ) )
            // InternalKEffects.g:3081:1: ( '<' )
            {
            // InternalKEffects.g:3081:1: ( '<' )
            // InternalKEffects.g:3082:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallEffectAccess().getLessThanSignKeyword_1()); 
            }
            match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:3095:1: rule__FunctionCallEffect__Group__2 : rule__FunctionCallEffect__Group__2__Impl rule__FunctionCallEffect__Group__3 ;
    public final void rule__FunctionCallEffect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3099:1: ( rule__FunctionCallEffect__Group__2__Impl rule__FunctionCallEffect__Group__3 )
            // InternalKEffects.g:3100:2: rule__FunctionCallEffect__Group__2__Impl rule__FunctionCallEffect__Group__3
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
    // InternalKEffects.g:3107:1: rule__FunctionCallEffect__Group__2__Impl : ( ( rule__FunctionCallEffect__FunctionNameAssignment_2 ) ) ;
    public final void rule__FunctionCallEffect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3111:1: ( ( ( rule__FunctionCallEffect__FunctionNameAssignment_2 ) ) )
            // InternalKEffects.g:3112:1: ( ( rule__FunctionCallEffect__FunctionNameAssignment_2 ) )
            {
            // InternalKEffects.g:3112:1: ( ( rule__FunctionCallEffect__FunctionNameAssignment_2 ) )
            // InternalKEffects.g:3113:1: ( rule__FunctionCallEffect__FunctionNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallEffectAccess().getFunctionNameAssignment_2()); 
            }
            // InternalKEffects.g:3114:1: ( rule__FunctionCallEffect__FunctionNameAssignment_2 )
            // InternalKEffects.g:3114:2: rule__FunctionCallEffect__FunctionNameAssignment_2
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
    // InternalKEffects.g:3124:1: rule__FunctionCallEffect__Group__3 : rule__FunctionCallEffect__Group__3__Impl rule__FunctionCallEffect__Group__4 ;
    public final void rule__FunctionCallEffect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3128:1: ( rule__FunctionCallEffect__Group__3__Impl rule__FunctionCallEffect__Group__4 )
            // InternalKEffects.g:3129:2: rule__FunctionCallEffect__Group__3__Impl rule__FunctionCallEffect__Group__4
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
    // InternalKEffects.g:3136:1: rule__FunctionCallEffect__Group__3__Impl : ( ( rule__FunctionCallEffect__Alternatives_3 )? ) ;
    public final void rule__FunctionCallEffect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3140:1: ( ( ( rule__FunctionCallEffect__Alternatives_3 )? ) )
            // InternalKEffects.g:3141:1: ( ( rule__FunctionCallEffect__Alternatives_3 )? )
            {
            // InternalKEffects.g:3141:1: ( ( rule__FunctionCallEffect__Alternatives_3 )? )
            // InternalKEffects.g:3142:1: ( rule__FunctionCallEffect__Alternatives_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallEffectAccess().getAlternatives_3()); 
            }
            // InternalKEffects.g:3143:1: ( rule__FunctionCallEffect__Alternatives_3 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==28||LA27_0==46) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalKEffects.g:3143:2: rule__FunctionCallEffect__Alternatives_3
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
    // InternalKEffects.g:3153:1: rule__FunctionCallEffect__Group__4 : rule__FunctionCallEffect__Group__4__Impl ;
    public final void rule__FunctionCallEffect__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3157:1: ( rule__FunctionCallEffect__Group__4__Impl )
            // InternalKEffects.g:3158:2: rule__FunctionCallEffect__Group__4__Impl
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
    // InternalKEffects.g:3164:1: rule__FunctionCallEffect__Group__4__Impl : ( '>' ) ;
    public final void rule__FunctionCallEffect__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3168:1: ( ( '>' ) )
            // InternalKEffects.g:3169:1: ( '>' )
            {
            // InternalKEffects.g:3169:1: ( '>' )
            // InternalKEffects.g:3170:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallEffectAccess().getGreaterThanSignKeyword_4()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:3193:1: rule__FunctionCallEffect__Group_3_0__0 : rule__FunctionCallEffect__Group_3_0__0__Impl rule__FunctionCallEffect__Group_3_0__1 ;
    public final void rule__FunctionCallEffect__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3197:1: ( rule__FunctionCallEffect__Group_3_0__0__Impl rule__FunctionCallEffect__Group_3_0__1 )
            // InternalKEffects.g:3198:2: rule__FunctionCallEffect__Group_3_0__0__Impl rule__FunctionCallEffect__Group_3_0__1
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
    // InternalKEffects.g:3205:1: rule__FunctionCallEffect__Group_3_0__0__Impl : ( '(' ) ;
    public final void rule__FunctionCallEffect__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3209:1: ( ( '(' ) )
            // InternalKEffects.g:3210:1: ( '(' )
            {
            // InternalKEffects.g:3210:1: ( '(' )
            // InternalKEffects.g:3211:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisKeyword_3_0_0()); 
            }
            match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:3224:1: rule__FunctionCallEffect__Group_3_0__1 : rule__FunctionCallEffect__Group_3_0__1__Impl rule__FunctionCallEffect__Group_3_0__2 ;
    public final void rule__FunctionCallEffect__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3228:1: ( rule__FunctionCallEffect__Group_3_0__1__Impl rule__FunctionCallEffect__Group_3_0__2 )
            // InternalKEffects.g:3229:2: rule__FunctionCallEffect__Group_3_0__1__Impl rule__FunctionCallEffect__Group_3_0__2
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
    // InternalKEffects.g:3236:1: rule__FunctionCallEffect__Group_3_0__1__Impl : ( ( rule__FunctionCallEffect__ParametersAssignment_3_0_1 ) ) ;
    public final void rule__FunctionCallEffect__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3240:1: ( ( ( rule__FunctionCallEffect__ParametersAssignment_3_0_1 ) ) )
            // InternalKEffects.g:3241:1: ( ( rule__FunctionCallEffect__ParametersAssignment_3_0_1 ) )
            {
            // InternalKEffects.g:3241:1: ( ( rule__FunctionCallEffect__ParametersAssignment_3_0_1 ) )
            // InternalKEffects.g:3242:1: ( rule__FunctionCallEffect__ParametersAssignment_3_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallEffectAccess().getParametersAssignment_3_0_1()); 
            }
            // InternalKEffects.g:3243:1: ( rule__FunctionCallEffect__ParametersAssignment_3_0_1 )
            // InternalKEffects.g:3243:2: rule__FunctionCallEffect__ParametersAssignment_3_0_1
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
    // InternalKEffects.g:3253:1: rule__FunctionCallEffect__Group_3_0__2 : rule__FunctionCallEffect__Group_3_0__2__Impl rule__FunctionCallEffect__Group_3_0__3 ;
    public final void rule__FunctionCallEffect__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3257:1: ( rule__FunctionCallEffect__Group_3_0__2__Impl rule__FunctionCallEffect__Group_3_0__3 )
            // InternalKEffects.g:3258:2: rule__FunctionCallEffect__Group_3_0__2__Impl rule__FunctionCallEffect__Group_3_0__3
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
    // InternalKEffects.g:3265:1: rule__FunctionCallEffect__Group_3_0__2__Impl : ( ( rule__FunctionCallEffect__Group_3_0_2__0 )* ) ;
    public final void rule__FunctionCallEffect__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3269:1: ( ( ( rule__FunctionCallEffect__Group_3_0_2__0 )* ) )
            // InternalKEffects.g:3270:1: ( ( rule__FunctionCallEffect__Group_3_0_2__0 )* )
            {
            // InternalKEffects.g:3270:1: ( ( rule__FunctionCallEffect__Group_3_0_2__0 )* )
            // InternalKEffects.g:3271:1: ( rule__FunctionCallEffect__Group_3_0_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallEffectAccess().getGroup_3_0_2()); 
            }
            // InternalKEffects.g:3272:1: ( rule__FunctionCallEffect__Group_3_0_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==50) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalKEffects.g:3272:2: rule__FunctionCallEffect__Group_3_0_2__0
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
    // InternalKEffects.g:3282:1: rule__FunctionCallEffect__Group_3_0__3 : rule__FunctionCallEffect__Group_3_0__3__Impl ;
    public final void rule__FunctionCallEffect__Group_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3286:1: ( rule__FunctionCallEffect__Group_3_0__3__Impl )
            // InternalKEffects.g:3287:2: rule__FunctionCallEffect__Group_3_0__3__Impl
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
    // InternalKEffects.g:3293:1: rule__FunctionCallEffect__Group_3_0__3__Impl : ( ')' ) ;
    public final void rule__FunctionCallEffect__Group_3_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3297:1: ( ( ')' ) )
            // InternalKEffects.g:3298:1: ( ')' )
            {
            // InternalKEffects.g:3298:1: ( ')' )
            // InternalKEffects.g:3299:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallEffectAccess().getRightParenthesisKeyword_3_0_3()); 
            }
            match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:3320:1: rule__FunctionCallEffect__Group_3_0_2__0 : rule__FunctionCallEffect__Group_3_0_2__0__Impl rule__FunctionCallEffect__Group_3_0_2__1 ;
    public final void rule__FunctionCallEffect__Group_3_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3324:1: ( rule__FunctionCallEffect__Group_3_0_2__0__Impl rule__FunctionCallEffect__Group_3_0_2__1 )
            // InternalKEffects.g:3325:2: rule__FunctionCallEffect__Group_3_0_2__0__Impl rule__FunctionCallEffect__Group_3_0_2__1
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
    // InternalKEffects.g:3332:1: rule__FunctionCallEffect__Group_3_0_2__0__Impl : ( ',' ) ;
    public final void rule__FunctionCallEffect__Group_3_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3336:1: ( ( ',' ) )
            // InternalKEffects.g:3337:1: ( ',' )
            {
            // InternalKEffects.g:3337:1: ( ',' )
            // InternalKEffects.g:3338:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallEffectAccess().getCommaKeyword_3_0_2_0()); 
            }
            match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:3351:1: rule__FunctionCallEffect__Group_3_0_2__1 : rule__FunctionCallEffect__Group_3_0_2__1__Impl ;
    public final void rule__FunctionCallEffect__Group_3_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3355:1: ( rule__FunctionCallEffect__Group_3_0_2__1__Impl )
            // InternalKEffects.g:3356:2: rule__FunctionCallEffect__Group_3_0_2__1__Impl
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
    // InternalKEffects.g:3362:1: rule__FunctionCallEffect__Group_3_0_2__1__Impl : ( ( rule__FunctionCallEffect__ParametersAssignment_3_0_2_1 ) ) ;
    public final void rule__FunctionCallEffect__Group_3_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3366:1: ( ( ( rule__FunctionCallEffect__ParametersAssignment_3_0_2_1 ) ) )
            // InternalKEffects.g:3367:1: ( ( rule__FunctionCallEffect__ParametersAssignment_3_0_2_1 ) )
            {
            // InternalKEffects.g:3367:1: ( ( rule__FunctionCallEffect__ParametersAssignment_3_0_2_1 ) )
            // InternalKEffects.g:3368:1: ( rule__FunctionCallEffect__ParametersAssignment_3_0_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallEffectAccess().getParametersAssignment_3_0_2_1()); 
            }
            // InternalKEffects.g:3369:1: ( rule__FunctionCallEffect__ParametersAssignment_3_0_2_1 )
            // InternalKEffects.g:3369:2: rule__FunctionCallEffect__ParametersAssignment_3_0_2_1
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
    // InternalKEffects.g:3383:1: rule__LogicalOrExpression__Group__0 : rule__LogicalOrExpression__Group__0__Impl rule__LogicalOrExpression__Group__1 ;
    public final void rule__LogicalOrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3387:1: ( rule__LogicalOrExpression__Group__0__Impl rule__LogicalOrExpression__Group__1 )
            // InternalKEffects.g:3388:2: rule__LogicalOrExpression__Group__0__Impl rule__LogicalOrExpression__Group__1
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
    // InternalKEffects.g:3395:1: rule__LogicalOrExpression__Group__0__Impl : ( ruleLogicalAndExpression ) ;
    public final void rule__LogicalOrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3399:1: ( ( ruleLogicalAndExpression ) )
            // InternalKEffects.g:3400:1: ( ruleLogicalAndExpression )
            {
            // InternalKEffects.g:3400:1: ( ruleLogicalAndExpression )
            // InternalKEffects.g:3401:1: ruleLogicalAndExpression
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
    // InternalKEffects.g:3412:1: rule__LogicalOrExpression__Group__1 : rule__LogicalOrExpression__Group__1__Impl ;
    public final void rule__LogicalOrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3416:1: ( rule__LogicalOrExpression__Group__1__Impl )
            // InternalKEffects.g:3417:2: rule__LogicalOrExpression__Group__1__Impl
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
    // InternalKEffects.g:3423:1: rule__LogicalOrExpression__Group__1__Impl : ( ( rule__LogicalOrExpression__Group_1__0 )? ) ;
    public final void rule__LogicalOrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3427:1: ( ( ( rule__LogicalOrExpression__Group_1__0 )? ) )
            // InternalKEffects.g:3428:1: ( ( rule__LogicalOrExpression__Group_1__0 )? )
            {
            // InternalKEffects.g:3428:1: ( ( rule__LogicalOrExpression__Group_1__0 )? )
            // InternalKEffects.g:3429:1: ( rule__LogicalOrExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExpressionAccess().getGroup_1()); 
            }
            // InternalKEffects.g:3430:1: ( rule__LogicalOrExpression__Group_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==26) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalKEffects.g:3430:2: rule__LogicalOrExpression__Group_1__0
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
    // InternalKEffects.g:3444:1: rule__LogicalOrExpression__Group_1__0 : rule__LogicalOrExpression__Group_1__0__Impl rule__LogicalOrExpression__Group_1__1 ;
    public final void rule__LogicalOrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3448:1: ( rule__LogicalOrExpression__Group_1__0__Impl rule__LogicalOrExpression__Group_1__1 )
            // InternalKEffects.g:3449:2: rule__LogicalOrExpression__Group_1__0__Impl rule__LogicalOrExpression__Group_1__1
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
    // InternalKEffects.g:3456:1: rule__LogicalOrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__LogicalOrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3460:1: ( ( () ) )
            // InternalKEffects.g:3461:1: ( () )
            {
            // InternalKEffects.g:3461:1: ( () )
            // InternalKEffects.g:3462:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKEffects.g:3463:1: ()
            // InternalKEffects.g:3465:1: 
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
    // InternalKEffects.g:3475:1: rule__LogicalOrExpression__Group_1__1 : rule__LogicalOrExpression__Group_1__1__Impl ;
    public final void rule__LogicalOrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3479:1: ( rule__LogicalOrExpression__Group_1__1__Impl )
            // InternalKEffects.g:3480:2: rule__LogicalOrExpression__Group_1__1__Impl
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
    // InternalKEffects.g:3486:1: rule__LogicalOrExpression__Group_1__1__Impl : ( ( ( rule__LogicalOrExpression__Group_1_1__0 ) ) ( ( rule__LogicalOrExpression__Group_1_1__0 )* ) ) ;
    public final void rule__LogicalOrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3490:1: ( ( ( ( rule__LogicalOrExpression__Group_1_1__0 ) ) ( ( rule__LogicalOrExpression__Group_1_1__0 )* ) ) )
            // InternalKEffects.g:3491:1: ( ( ( rule__LogicalOrExpression__Group_1_1__0 ) ) ( ( rule__LogicalOrExpression__Group_1_1__0 )* ) )
            {
            // InternalKEffects.g:3491:1: ( ( ( rule__LogicalOrExpression__Group_1_1__0 ) ) ( ( rule__LogicalOrExpression__Group_1_1__0 )* ) )
            // InternalKEffects.g:3492:1: ( ( rule__LogicalOrExpression__Group_1_1__0 ) ) ( ( rule__LogicalOrExpression__Group_1_1__0 )* )
            {
            // InternalKEffects.g:3492:1: ( ( rule__LogicalOrExpression__Group_1_1__0 ) )
            // InternalKEffects.g:3493:1: ( rule__LogicalOrExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExpressionAccess().getGroup_1_1()); 
            }
            // InternalKEffects.g:3494:1: ( rule__LogicalOrExpression__Group_1_1__0 )
            // InternalKEffects.g:3494:2: rule__LogicalOrExpression__Group_1_1__0
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

            // InternalKEffects.g:3497:1: ( ( rule__LogicalOrExpression__Group_1_1__0 )* )
            // InternalKEffects.g:3498:1: ( rule__LogicalOrExpression__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExpressionAccess().getGroup_1_1()); 
            }
            // InternalKEffects.g:3499:1: ( rule__LogicalOrExpression__Group_1_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==26) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalKEffects.g:3499:2: rule__LogicalOrExpression__Group_1_1__0
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
    // InternalKEffects.g:3514:1: rule__LogicalOrExpression__Group_1_1__0 : rule__LogicalOrExpression__Group_1_1__0__Impl rule__LogicalOrExpression__Group_1_1__1 ;
    public final void rule__LogicalOrExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3518:1: ( rule__LogicalOrExpression__Group_1_1__0__Impl rule__LogicalOrExpression__Group_1_1__1 )
            // InternalKEffects.g:3519:2: rule__LogicalOrExpression__Group_1_1__0__Impl rule__LogicalOrExpression__Group_1_1__1
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
    // InternalKEffects.g:3526:1: rule__LogicalOrExpression__Group_1_1__0__Impl : ( ( rule__LogicalOrExpression__OperatorAssignment_1_1_0 ) ) ;
    public final void rule__LogicalOrExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3530:1: ( ( ( rule__LogicalOrExpression__OperatorAssignment_1_1_0 ) ) )
            // InternalKEffects.g:3531:1: ( ( rule__LogicalOrExpression__OperatorAssignment_1_1_0 ) )
            {
            // InternalKEffects.g:3531:1: ( ( rule__LogicalOrExpression__OperatorAssignment_1_1_0 ) )
            // InternalKEffects.g:3532:1: ( rule__LogicalOrExpression__OperatorAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExpressionAccess().getOperatorAssignment_1_1_0()); 
            }
            // InternalKEffects.g:3533:1: ( rule__LogicalOrExpression__OperatorAssignment_1_1_0 )
            // InternalKEffects.g:3533:2: rule__LogicalOrExpression__OperatorAssignment_1_1_0
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
    // InternalKEffects.g:3543:1: rule__LogicalOrExpression__Group_1_1__1 : rule__LogicalOrExpression__Group_1_1__1__Impl ;
    public final void rule__LogicalOrExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3547:1: ( rule__LogicalOrExpression__Group_1_1__1__Impl )
            // InternalKEffects.g:3548:2: rule__LogicalOrExpression__Group_1_1__1__Impl
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
    // InternalKEffects.g:3554:1: rule__LogicalOrExpression__Group_1_1__1__Impl : ( ( rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__LogicalOrExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3558:1: ( ( ( rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1 ) ) )
            // InternalKEffects.g:3559:1: ( ( rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1 ) )
            {
            // InternalKEffects.g:3559:1: ( ( rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1 ) )
            // InternalKEffects.g:3560:1: ( rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }
            // InternalKEffects.g:3561:1: ( rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1 )
            // InternalKEffects.g:3561:2: rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1
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
    // InternalKEffects.g:3575:1: rule__LogicalAndExpression__Group__0 : rule__LogicalAndExpression__Group__0__Impl rule__LogicalAndExpression__Group__1 ;
    public final void rule__LogicalAndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3579:1: ( rule__LogicalAndExpression__Group__0__Impl rule__LogicalAndExpression__Group__1 )
            // InternalKEffects.g:3580:2: rule__LogicalAndExpression__Group__0__Impl rule__LogicalAndExpression__Group__1
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
    // InternalKEffects.g:3587:1: rule__LogicalAndExpression__Group__0__Impl : ( ruleBitwiseOrExpression ) ;
    public final void rule__LogicalAndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3591:1: ( ( ruleBitwiseOrExpression ) )
            // InternalKEffects.g:3592:1: ( ruleBitwiseOrExpression )
            {
            // InternalKEffects.g:3592:1: ( ruleBitwiseOrExpression )
            // InternalKEffects.g:3593:1: ruleBitwiseOrExpression
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
    // InternalKEffects.g:3604:1: rule__LogicalAndExpression__Group__1 : rule__LogicalAndExpression__Group__1__Impl ;
    public final void rule__LogicalAndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3608:1: ( rule__LogicalAndExpression__Group__1__Impl )
            // InternalKEffects.g:3609:2: rule__LogicalAndExpression__Group__1__Impl
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
    // InternalKEffects.g:3615:1: rule__LogicalAndExpression__Group__1__Impl : ( ( rule__LogicalAndExpression__Group_1__0 )? ) ;
    public final void rule__LogicalAndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3619:1: ( ( ( rule__LogicalAndExpression__Group_1__0 )? ) )
            // InternalKEffects.g:3620:1: ( ( rule__LogicalAndExpression__Group_1__0 )? )
            {
            // InternalKEffects.g:3620:1: ( ( rule__LogicalAndExpression__Group_1__0 )? )
            // InternalKEffects.g:3621:1: ( rule__LogicalAndExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExpressionAccess().getGroup_1()); 
            }
            // InternalKEffects.g:3622:1: ( rule__LogicalAndExpression__Group_1__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==27) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalKEffects.g:3622:2: rule__LogicalAndExpression__Group_1__0
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
    // InternalKEffects.g:3636:1: rule__LogicalAndExpression__Group_1__0 : rule__LogicalAndExpression__Group_1__0__Impl rule__LogicalAndExpression__Group_1__1 ;
    public final void rule__LogicalAndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3640:1: ( rule__LogicalAndExpression__Group_1__0__Impl rule__LogicalAndExpression__Group_1__1 )
            // InternalKEffects.g:3641:2: rule__LogicalAndExpression__Group_1__0__Impl rule__LogicalAndExpression__Group_1__1
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
    // InternalKEffects.g:3648:1: rule__LogicalAndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__LogicalAndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3652:1: ( ( () ) )
            // InternalKEffects.g:3653:1: ( () )
            {
            // InternalKEffects.g:3653:1: ( () )
            // InternalKEffects.g:3654:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKEffects.g:3655:1: ()
            // InternalKEffects.g:3657:1: 
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
    // InternalKEffects.g:3667:1: rule__LogicalAndExpression__Group_1__1 : rule__LogicalAndExpression__Group_1__1__Impl ;
    public final void rule__LogicalAndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3671:1: ( rule__LogicalAndExpression__Group_1__1__Impl )
            // InternalKEffects.g:3672:2: rule__LogicalAndExpression__Group_1__1__Impl
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
    // InternalKEffects.g:3678:1: rule__LogicalAndExpression__Group_1__1__Impl : ( ( ( rule__LogicalAndExpression__Group_1_1__0 ) ) ( ( rule__LogicalAndExpression__Group_1_1__0 )* ) ) ;
    public final void rule__LogicalAndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3682:1: ( ( ( ( rule__LogicalAndExpression__Group_1_1__0 ) ) ( ( rule__LogicalAndExpression__Group_1_1__0 )* ) ) )
            // InternalKEffects.g:3683:1: ( ( ( rule__LogicalAndExpression__Group_1_1__0 ) ) ( ( rule__LogicalAndExpression__Group_1_1__0 )* ) )
            {
            // InternalKEffects.g:3683:1: ( ( ( rule__LogicalAndExpression__Group_1_1__0 ) ) ( ( rule__LogicalAndExpression__Group_1_1__0 )* ) )
            // InternalKEffects.g:3684:1: ( ( rule__LogicalAndExpression__Group_1_1__0 ) ) ( ( rule__LogicalAndExpression__Group_1_1__0 )* )
            {
            // InternalKEffects.g:3684:1: ( ( rule__LogicalAndExpression__Group_1_1__0 ) )
            // InternalKEffects.g:3685:1: ( rule__LogicalAndExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExpressionAccess().getGroup_1_1()); 
            }
            // InternalKEffects.g:3686:1: ( rule__LogicalAndExpression__Group_1_1__0 )
            // InternalKEffects.g:3686:2: rule__LogicalAndExpression__Group_1_1__0
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

            // InternalKEffects.g:3689:1: ( ( rule__LogicalAndExpression__Group_1_1__0 )* )
            // InternalKEffects.g:3690:1: ( rule__LogicalAndExpression__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExpressionAccess().getGroup_1_1()); 
            }
            // InternalKEffects.g:3691:1: ( rule__LogicalAndExpression__Group_1_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==27) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalKEffects.g:3691:2: rule__LogicalAndExpression__Group_1_1__0
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
    // InternalKEffects.g:3706:1: rule__LogicalAndExpression__Group_1_1__0 : rule__LogicalAndExpression__Group_1_1__0__Impl rule__LogicalAndExpression__Group_1_1__1 ;
    public final void rule__LogicalAndExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3710:1: ( rule__LogicalAndExpression__Group_1_1__0__Impl rule__LogicalAndExpression__Group_1_1__1 )
            // InternalKEffects.g:3711:2: rule__LogicalAndExpression__Group_1_1__0__Impl rule__LogicalAndExpression__Group_1_1__1
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
    // InternalKEffects.g:3718:1: rule__LogicalAndExpression__Group_1_1__0__Impl : ( ( rule__LogicalAndExpression__OperatorAssignment_1_1_0 ) ) ;
    public final void rule__LogicalAndExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3722:1: ( ( ( rule__LogicalAndExpression__OperatorAssignment_1_1_0 ) ) )
            // InternalKEffects.g:3723:1: ( ( rule__LogicalAndExpression__OperatorAssignment_1_1_0 ) )
            {
            // InternalKEffects.g:3723:1: ( ( rule__LogicalAndExpression__OperatorAssignment_1_1_0 ) )
            // InternalKEffects.g:3724:1: ( rule__LogicalAndExpression__OperatorAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExpressionAccess().getOperatorAssignment_1_1_0()); 
            }
            // InternalKEffects.g:3725:1: ( rule__LogicalAndExpression__OperatorAssignment_1_1_0 )
            // InternalKEffects.g:3725:2: rule__LogicalAndExpression__OperatorAssignment_1_1_0
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
    // InternalKEffects.g:3735:1: rule__LogicalAndExpression__Group_1_1__1 : rule__LogicalAndExpression__Group_1_1__1__Impl ;
    public final void rule__LogicalAndExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3739:1: ( rule__LogicalAndExpression__Group_1_1__1__Impl )
            // InternalKEffects.g:3740:2: rule__LogicalAndExpression__Group_1_1__1__Impl
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
    // InternalKEffects.g:3746:1: rule__LogicalAndExpression__Group_1_1__1__Impl : ( ( rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__LogicalAndExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3750:1: ( ( ( rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1 ) ) )
            // InternalKEffects.g:3751:1: ( ( rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1 ) )
            {
            // InternalKEffects.g:3751:1: ( ( rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1 ) )
            // InternalKEffects.g:3752:1: ( rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }
            // InternalKEffects.g:3753:1: ( rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1 )
            // InternalKEffects.g:3753:2: rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1
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
    // InternalKEffects.g:3767:1: rule__BitwiseOrExpression__Group__0 : rule__BitwiseOrExpression__Group__0__Impl rule__BitwiseOrExpression__Group__1 ;
    public final void rule__BitwiseOrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3771:1: ( rule__BitwiseOrExpression__Group__0__Impl rule__BitwiseOrExpression__Group__1 )
            // InternalKEffects.g:3772:2: rule__BitwiseOrExpression__Group__0__Impl rule__BitwiseOrExpression__Group__1
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
    // InternalKEffects.g:3779:1: rule__BitwiseOrExpression__Group__0__Impl : ( ruleBitwiseAndExpression ) ;
    public final void rule__BitwiseOrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3783:1: ( ( ruleBitwiseAndExpression ) )
            // InternalKEffects.g:3784:1: ( ruleBitwiseAndExpression )
            {
            // InternalKEffects.g:3784:1: ( ruleBitwiseAndExpression )
            // InternalKEffects.g:3785:1: ruleBitwiseAndExpression
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
    // InternalKEffects.g:3796:1: rule__BitwiseOrExpression__Group__1 : rule__BitwiseOrExpression__Group__1__Impl ;
    public final void rule__BitwiseOrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3800:1: ( rule__BitwiseOrExpression__Group__1__Impl )
            // InternalKEffects.g:3801:2: rule__BitwiseOrExpression__Group__1__Impl
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
    // InternalKEffects.g:3807:1: rule__BitwiseOrExpression__Group__1__Impl : ( ( rule__BitwiseOrExpression__Group_1__0 )? ) ;
    public final void rule__BitwiseOrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3811:1: ( ( ( rule__BitwiseOrExpression__Group_1__0 )? ) )
            // InternalKEffects.g:3812:1: ( ( rule__BitwiseOrExpression__Group_1__0 )? )
            {
            // InternalKEffects.g:3812:1: ( ( rule__BitwiseOrExpression__Group_1__0 )? )
            // InternalKEffects.g:3813:1: ( rule__BitwiseOrExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrExpressionAccess().getGroup_1()); 
            }
            // InternalKEffects.g:3814:1: ( rule__BitwiseOrExpression__Group_1__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==17) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalKEffects.g:3814:2: rule__BitwiseOrExpression__Group_1__0
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
    // InternalKEffects.g:3828:1: rule__BitwiseOrExpression__Group_1__0 : rule__BitwiseOrExpression__Group_1__0__Impl rule__BitwiseOrExpression__Group_1__1 ;
    public final void rule__BitwiseOrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3832:1: ( rule__BitwiseOrExpression__Group_1__0__Impl rule__BitwiseOrExpression__Group_1__1 )
            // InternalKEffects.g:3833:2: rule__BitwiseOrExpression__Group_1__0__Impl rule__BitwiseOrExpression__Group_1__1
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
    // InternalKEffects.g:3840:1: rule__BitwiseOrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__BitwiseOrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3844:1: ( ( () ) )
            // InternalKEffects.g:3845:1: ( () )
            {
            // InternalKEffects.g:3845:1: ( () )
            // InternalKEffects.g:3846:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKEffects.g:3847:1: ()
            // InternalKEffects.g:3849:1: 
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
    // InternalKEffects.g:3859:1: rule__BitwiseOrExpression__Group_1__1 : rule__BitwiseOrExpression__Group_1__1__Impl ;
    public final void rule__BitwiseOrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3863:1: ( rule__BitwiseOrExpression__Group_1__1__Impl )
            // InternalKEffects.g:3864:2: rule__BitwiseOrExpression__Group_1__1__Impl
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
    // InternalKEffects.g:3870:1: rule__BitwiseOrExpression__Group_1__1__Impl : ( ( ( rule__BitwiseOrExpression__Group_1_1__0 ) ) ( ( rule__BitwiseOrExpression__Group_1_1__0 )* ) ) ;
    public final void rule__BitwiseOrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3874:1: ( ( ( ( rule__BitwiseOrExpression__Group_1_1__0 ) ) ( ( rule__BitwiseOrExpression__Group_1_1__0 )* ) ) )
            // InternalKEffects.g:3875:1: ( ( ( rule__BitwiseOrExpression__Group_1_1__0 ) ) ( ( rule__BitwiseOrExpression__Group_1_1__0 )* ) )
            {
            // InternalKEffects.g:3875:1: ( ( ( rule__BitwiseOrExpression__Group_1_1__0 ) ) ( ( rule__BitwiseOrExpression__Group_1_1__0 )* ) )
            // InternalKEffects.g:3876:1: ( ( rule__BitwiseOrExpression__Group_1_1__0 ) ) ( ( rule__BitwiseOrExpression__Group_1_1__0 )* )
            {
            // InternalKEffects.g:3876:1: ( ( rule__BitwiseOrExpression__Group_1_1__0 ) )
            // InternalKEffects.g:3877:1: ( rule__BitwiseOrExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrExpressionAccess().getGroup_1_1()); 
            }
            // InternalKEffects.g:3878:1: ( rule__BitwiseOrExpression__Group_1_1__0 )
            // InternalKEffects.g:3878:2: rule__BitwiseOrExpression__Group_1_1__0
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

            // InternalKEffects.g:3881:1: ( ( rule__BitwiseOrExpression__Group_1_1__0 )* )
            // InternalKEffects.g:3882:1: ( rule__BitwiseOrExpression__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrExpressionAccess().getGroup_1_1()); 
            }
            // InternalKEffects.g:3883:1: ( rule__BitwiseOrExpression__Group_1_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==17) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalKEffects.g:3883:2: rule__BitwiseOrExpression__Group_1_1__0
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
    // InternalKEffects.g:3898:1: rule__BitwiseOrExpression__Group_1_1__0 : rule__BitwiseOrExpression__Group_1_1__0__Impl rule__BitwiseOrExpression__Group_1_1__1 ;
    public final void rule__BitwiseOrExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3902:1: ( rule__BitwiseOrExpression__Group_1_1__0__Impl rule__BitwiseOrExpression__Group_1_1__1 )
            // InternalKEffects.g:3903:2: rule__BitwiseOrExpression__Group_1_1__0__Impl rule__BitwiseOrExpression__Group_1_1__1
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
    // InternalKEffects.g:3910:1: rule__BitwiseOrExpression__Group_1_1__0__Impl : ( ( rule__BitwiseOrExpression__OperatorAssignment_1_1_0 ) ) ;
    public final void rule__BitwiseOrExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3914:1: ( ( ( rule__BitwiseOrExpression__OperatorAssignment_1_1_0 ) ) )
            // InternalKEffects.g:3915:1: ( ( rule__BitwiseOrExpression__OperatorAssignment_1_1_0 ) )
            {
            // InternalKEffects.g:3915:1: ( ( rule__BitwiseOrExpression__OperatorAssignment_1_1_0 ) )
            // InternalKEffects.g:3916:1: ( rule__BitwiseOrExpression__OperatorAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrExpressionAccess().getOperatorAssignment_1_1_0()); 
            }
            // InternalKEffects.g:3917:1: ( rule__BitwiseOrExpression__OperatorAssignment_1_1_0 )
            // InternalKEffects.g:3917:2: rule__BitwiseOrExpression__OperatorAssignment_1_1_0
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
    // InternalKEffects.g:3927:1: rule__BitwiseOrExpression__Group_1_1__1 : rule__BitwiseOrExpression__Group_1_1__1__Impl ;
    public final void rule__BitwiseOrExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3931:1: ( rule__BitwiseOrExpression__Group_1_1__1__Impl )
            // InternalKEffects.g:3932:2: rule__BitwiseOrExpression__Group_1_1__1__Impl
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
    // InternalKEffects.g:3938:1: rule__BitwiseOrExpression__Group_1_1__1__Impl : ( ( rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__BitwiseOrExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3942:1: ( ( ( rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1 ) ) )
            // InternalKEffects.g:3943:1: ( ( rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1 ) )
            {
            // InternalKEffects.g:3943:1: ( ( rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1 ) )
            // InternalKEffects.g:3944:1: ( rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }
            // InternalKEffects.g:3945:1: ( rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1 )
            // InternalKEffects.g:3945:2: rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1
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
    // InternalKEffects.g:3959:1: rule__BitwiseAndExpression__Group__0 : rule__BitwiseAndExpression__Group__0__Impl rule__BitwiseAndExpression__Group__1 ;
    public final void rule__BitwiseAndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3963:1: ( rule__BitwiseAndExpression__Group__0__Impl rule__BitwiseAndExpression__Group__1 )
            // InternalKEffects.g:3964:2: rule__BitwiseAndExpression__Group__0__Impl rule__BitwiseAndExpression__Group__1
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
    // InternalKEffects.g:3971:1: rule__BitwiseAndExpression__Group__0__Impl : ( ruleCompareOperation ) ;
    public final void rule__BitwiseAndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3975:1: ( ( ruleCompareOperation ) )
            // InternalKEffects.g:3976:1: ( ruleCompareOperation )
            {
            // InternalKEffects.g:3976:1: ( ruleCompareOperation )
            // InternalKEffects.g:3977:1: ruleCompareOperation
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
    // InternalKEffects.g:3988:1: rule__BitwiseAndExpression__Group__1 : rule__BitwiseAndExpression__Group__1__Impl ;
    public final void rule__BitwiseAndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:3992:1: ( rule__BitwiseAndExpression__Group__1__Impl )
            // InternalKEffects.g:3993:2: rule__BitwiseAndExpression__Group__1__Impl
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
    // InternalKEffects.g:3999:1: rule__BitwiseAndExpression__Group__1__Impl : ( ( rule__BitwiseAndExpression__Group_1__0 )? ) ;
    public final void rule__BitwiseAndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4003:1: ( ( ( rule__BitwiseAndExpression__Group_1__0 )? ) )
            // InternalKEffects.g:4004:1: ( ( rule__BitwiseAndExpression__Group_1__0 )? )
            {
            // InternalKEffects.g:4004:1: ( ( rule__BitwiseAndExpression__Group_1__0 )? )
            // InternalKEffects.g:4005:1: ( rule__BitwiseAndExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndExpressionAccess().getGroup_1()); 
            }
            // InternalKEffects.g:4006:1: ( rule__BitwiseAndExpression__Group_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==18) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalKEffects.g:4006:2: rule__BitwiseAndExpression__Group_1__0
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
    // InternalKEffects.g:4020:1: rule__BitwiseAndExpression__Group_1__0 : rule__BitwiseAndExpression__Group_1__0__Impl rule__BitwiseAndExpression__Group_1__1 ;
    public final void rule__BitwiseAndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4024:1: ( rule__BitwiseAndExpression__Group_1__0__Impl rule__BitwiseAndExpression__Group_1__1 )
            // InternalKEffects.g:4025:2: rule__BitwiseAndExpression__Group_1__0__Impl rule__BitwiseAndExpression__Group_1__1
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
    // InternalKEffects.g:4032:1: rule__BitwiseAndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__BitwiseAndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4036:1: ( ( () ) )
            // InternalKEffects.g:4037:1: ( () )
            {
            // InternalKEffects.g:4037:1: ( () )
            // InternalKEffects.g:4038:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKEffects.g:4039:1: ()
            // InternalKEffects.g:4041:1: 
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
    // InternalKEffects.g:4051:1: rule__BitwiseAndExpression__Group_1__1 : rule__BitwiseAndExpression__Group_1__1__Impl ;
    public final void rule__BitwiseAndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4055:1: ( rule__BitwiseAndExpression__Group_1__1__Impl )
            // InternalKEffects.g:4056:2: rule__BitwiseAndExpression__Group_1__1__Impl
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
    // InternalKEffects.g:4062:1: rule__BitwiseAndExpression__Group_1__1__Impl : ( ( ( rule__BitwiseAndExpression__Group_1_1__0 ) ) ( ( rule__BitwiseAndExpression__Group_1_1__0 )* ) ) ;
    public final void rule__BitwiseAndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4066:1: ( ( ( ( rule__BitwiseAndExpression__Group_1_1__0 ) ) ( ( rule__BitwiseAndExpression__Group_1_1__0 )* ) ) )
            // InternalKEffects.g:4067:1: ( ( ( rule__BitwiseAndExpression__Group_1_1__0 ) ) ( ( rule__BitwiseAndExpression__Group_1_1__0 )* ) )
            {
            // InternalKEffects.g:4067:1: ( ( ( rule__BitwiseAndExpression__Group_1_1__0 ) ) ( ( rule__BitwiseAndExpression__Group_1_1__0 )* ) )
            // InternalKEffects.g:4068:1: ( ( rule__BitwiseAndExpression__Group_1_1__0 ) ) ( ( rule__BitwiseAndExpression__Group_1_1__0 )* )
            {
            // InternalKEffects.g:4068:1: ( ( rule__BitwiseAndExpression__Group_1_1__0 ) )
            // InternalKEffects.g:4069:1: ( rule__BitwiseAndExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndExpressionAccess().getGroup_1_1()); 
            }
            // InternalKEffects.g:4070:1: ( rule__BitwiseAndExpression__Group_1_1__0 )
            // InternalKEffects.g:4070:2: rule__BitwiseAndExpression__Group_1_1__0
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

            // InternalKEffects.g:4073:1: ( ( rule__BitwiseAndExpression__Group_1_1__0 )* )
            // InternalKEffects.g:4074:1: ( rule__BitwiseAndExpression__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndExpressionAccess().getGroup_1_1()); 
            }
            // InternalKEffects.g:4075:1: ( rule__BitwiseAndExpression__Group_1_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==18) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalKEffects.g:4075:2: rule__BitwiseAndExpression__Group_1_1__0
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
    // InternalKEffects.g:4090:1: rule__BitwiseAndExpression__Group_1_1__0 : rule__BitwiseAndExpression__Group_1_1__0__Impl rule__BitwiseAndExpression__Group_1_1__1 ;
    public final void rule__BitwiseAndExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4094:1: ( rule__BitwiseAndExpression__Group_1_1__0__Impl rule__BitwiseAndExpression__Group_1_1__1 )
            // InternalKEffects.g:4095:2: rule__BitwiseAndExpression__Group_1_1__0__Impl rule__BitwiseAndExpression__Group_1_1__1
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
    // InternalKEffects.g:4102:1: rule__BitwiseAndExpression__Group_1_1__0__Impl : ( ( rule__BitwiseAndExpression__OperatorAssignment_1_1_0 ) ) ;
    public final void rule__BitwiseAndExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4106:1: ( ( ( rule__BitwiseAndExpression__OperatorAssignment_1_1_0 ) ) )
            // InternalKEffects.g:4107:1: ( ( rule__BitwiseAndExpression__OperatorAssignment_1_1_0 ) )
            {
            // InternalKEffects.g:4107:1: ( ( rule__BitwiseAndExpression__OperatorAssignment_1_1_0 ) )
            // InternalKEffects.g:4108:1: ( rule__BitwiseAndExpression__OperatorAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndExpressionAccess().getOperatorAssignment_1_1_0()); 
            }
            // InternalKEffects.g:4109:1: ( rule__BitwiseAndExpression__OperatorAssignment_1_1_0 )
            // InternalKEffects.g:4109:2: rule__BitwiseAndExpression__OperatorAssignment_1_1_0
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
    // InternalKEffects.g:4119:1: rule__BitwiseAndExpression__Group_1_1__1 : rule__BitwiseAndExpression__Group_1_1__1__Impl ;
    public final void rule__BitwiseAndExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4123:1: ( rule__BitwiseAndExpression__Group_1_1__1__Impl )
            // InternalKEffects.g:4124:2: rule__BitwiseAndExpression__Group_1_1__1__Impl
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
    // InternalKEffects.g:4130:1: rule__BitwiseAndExpression__Group_1_1__1__Impl : ( ( rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__BitwiseAndExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4134:1: ( ( ( rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1 ) ) )
            // InternalKEffects.g:4135:1: ( ( rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1 ) )
            {
            // InternalKEffects.g:4135:1: ( ( rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1 ) )
            // InternalKEffects.g:4136:1: ( rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }
            // InternalKEffects.g:4137:1: ( rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1 )
            // InternalKEffects.g:4137:2: rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1
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
    // InternalKEffects.g:4151:1: rule__CompareOperation__Group__0 : rule__CompareOperation__Group__0__Impl rule__CompareOperation__Group__1 ;
    public final void rule__CompareOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4155:1: ( rule__CompareOperation__Group__0__Impl rule__CompareOperation__Group__1 )
            // InternalKEffects.g:4156:2: rule__CompareOperation__Group__0__Impl rule__CompareOperation__Group__1
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
    // InternalKEffects.g:4163:1: rule__CompareOperation__Group__0__Impl : ( ruleNotOrValuedExpression ) ;
    public final void rule__CompareOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4167:1: ( ( ruleNotOrValuedExpression ) )
            // InternalKEffects.g:4168:1: ( ruleNotOrValuedExpression )
            {
            // InternalKEffects.g:4168:1: ( ruleNotOrValuedExpression )
            // InternalKEffects.g:4169:1: ruleNotOrValuedExpression
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
    // InternalKEffects.g:4180:1: rule__CompareOperation__Group__1 : rule__CompareOperation__Group__1__Impl ;
    public final void rule__CompareOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4184:1: ( rule__CompareOperation__Group__1__Impl )
            // InternalKEffects.g:4185:2: rule__CompareOperation__Group__1__Impl
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
    // InternalKEffects.g:4191:1: rule__CompareOperation__Group__1__Impl : ( ( rule__CompareOperation__Group_1__0 )? ) ;
    public final void rule__CompareOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4195:1: ( ( ( rule__CompareOperation__Group_1__0 )? ) )
            // InternalKEffects.g:4196:1: ( ( rule__CompareOperation__Group_1__0 )? )
            {
            // InternalKEffects.g:4196:1: ( ( rule__CompareOperation__Group_1__0 )? )
            // InternalKEffects.g:4197:1: ( rule__CompareOperation__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGroup_1()); 
            }
            // InternalKEffects.g:4198:1: ( rule__CompareOperation__Group_1__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=40 && LA37_0<=45)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalKEffects.g:4198:2: rule__CompareOperation__Group_1__0
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
    // InternalKEffects.g:4212:1: rule__CompareOperation__Group_1__0 : rule__CompareOperation__Group_1__0__Impl rule__CompareOperation__Group_1__1 ;
    public final void rule__CompareOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4216:1: ( rule__CompareOperation__Group_1__0__Impl rule__CompareOperation__Group_1__1 )
            // InternalKEffects.g:4217:2: rule__CompareOperation__Group_1__0__Impl rule__CompareOperation__Group_1__1
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
    // InternalKEffects.g:4224:1: rule__CompareOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__CompareOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4228:1: ( ( () ) )
            // InternalKEffects.g:4229:1: ( () )
            {
            // InternalKEffects.g:4229:1: ( () )
            // InternalKEffects.g:4230:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKEffects.g:4231:1: ()
            // InternalKEffects.g:4233:1: 
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
    // InternalKEffects.g:4243:1: rule__CompareOperation__Group_1__1 : rule__CompareOperation__Group_1__1__Impl rule__CompareOperation__Group_1__2 ;
    public final void rule__CompareOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4247:1: ( rule__CompareOperation__Group_1__1__Impl rule__CompareOperation__Group_1__2 )
            // InternalKEffects.g:4248:2: rule__CompareOperation__Group_1__1__Impl rule__CompareOperation__Group_1__2
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
    // InternalKEffects.g:4255:1: rule__CompareOperation__Group_1__1__Impl : ( ( rule__CompareOperation__OperatorAssignment_1_1 ) ) ;
    public final void rule__CompareOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4259:1: ( ( ( rule__CompareOperation__OperatorAssignment_1_1 ) ) )
            // InternalKEffects.g:4260:1: ( ( rule__CompareOperation__OperatorAssignment_1_1 ) )
            {
            // InternalKEffects.g:4260:1: ( ( rule__CompareOperation__OperatorAssignment_1_1 ) )
            // InternalKEffects.g:4261:1: ( rule__CompareOperation__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKEffects.g:4262:1: ( rule__CompareOperation__OperatorAssignment_1_1 )
            // InternalKEffects.g:4262:2: rule__CompareOperation__OperatorAssignment_1_1
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
    // InternalKEffects.g:4272:1: rule__CompareOperation__Group_1__2 : rule__CompareOperation__Group_1__2__Impl ;
    public final void rule__CompareOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4276:1: ( rule__CompareOperation__Group_1__2__Impl )
            // InternalKEffects.g:4277:2: rule__CompareOperation__Group_1__2__Impl
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
    // InternalKEffects.g:4283:1: rule__CompareOperation__Group_1__2__Impl : ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__CompareOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4287:1: ( ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) ) )
            // InternalKEffects.g:4288:1: ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) )
            {
            // InternalKEffects.g:4288:1: ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) )
            // InternalKEffects.g:4289:1: ( rule__CompareOperation__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // InternalKEffects.g:4290:1: ( rule__CompareOperation__SubExpressionsAssignment_1_2 )
            // InternalKEffects.g:4290:2: rule__CompareOperation__SubExpressionsAssignment_1_2
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
    // InternalKEffects.g:4306:1: rule__NotExpression__Group_0__0 : rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1 ;
    public final void rule__NotExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4310:1: ( rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1 )
            // InternalKEffects.g:4311:2: rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1
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
    // InternalKEffects.g:4318:1: rule__NotExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__NotExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4322:1: ( ( () ) )
            // InternalKEffects.g:4323:1: ( () )
            {
            // InternalKEffects.g:4323:1: ( () )
            // InternalKEffects.g:4324:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // InternalKEffects.g:4325:1: ()
            // InternalKEffects.g:4327:1: 
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
    // InternalKEffects.g:4337:1: rule__NotExpression__Group_0__1 : rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2 ;
    public final void rule__NotExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4341:1: ( rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2 )
            // InternalKEffects.g:4342:2: rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2
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
    // InternalKEffects.g:4349:1: rule__NotExpression__Group_0__1__Impl : ( ( rule__NotExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__NotExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4353:1: ( ( ( rule__NotExpression__OperatorAssignment_0_1 ) ) )
            // InternalKEffects.g:4354:1: ( ( rule__NotExpression__OperatorAssignment_0_1 ) )
            {
            // InternalKEffects.g:4354:1: ( ( rule__NotExpression__OperatorAssignment_0_1 ) )
            // InternalKEffects.g:4355:1: ( rule__NotExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // InternalKEffects.g:4356:1: ( rule__NotExpression__OperatorAssignment_0_1 )
            // InternalKEffects.g:4356:2: rule__NotExpression__OperatorAssignment_0_1
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
    // InternalKEffects.g:4366:1: rule__NotExpression__Group_0__2 : rule__NotExpression__Group_0__2__Impl ;
    public final void rule__NotExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4370:1: ( rule__NotExpression__Group_0__2__Impl )
            // InternalKEffects.g:4371:2: rule__NotExpression__Group_0__2__Impl
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
    // InternalKEffects.g:4377:1: rule__NotExpression__Group_0__2__Impl : ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) ) ;
    public final void rule__NotExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4381:1: ( ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) ) )
            // InternalKEffects.g:4382:1: ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) )
            {
            // InternalKEffects.g:4382:1: ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) )
            // InternalKEffects.g:4383:1: ( rule__NotExpression__SubExpressionsAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubExpressionsAssignment_0_2()); 
            }
            // InternalKEffects.g:4384:1: ( rule__NotExpression__SubExpressionsAssignment_0_2 )
            // InternalKEffects.g:4384:2: rule__NotExpression__SubExpressionsAssignment_0_2
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
    // InternalKEffects.g:4400:1: rule__AddExpression__Group__0 : rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 ;
    public final void rule__AddExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4404:1: ( rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 )
            // InternalKEffects.g:4405:2: rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1
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
    // InternalKEffects.g:4412:1: rule__AddExpression__Group__0__Impl : ( ruleSubExpression ) ;
    public final void rule__AddExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4416:1: ( ( ruleSubExpression ) )
            // InternalKEffects.g:4417:1: ( ruleSubExpression )
            {
            // InternalKEffects.g:4417:1: ( ruleSubExpression )
            // InternalKEffects.g:4418:1: ruleSubExpression
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
    // InternalKEffects.g:4429:1: rule__AddExpression__Group__1 : rule__AddExpression__Group__1__Impl ;
    public final void rule__AddExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4433:1: ( rule__AddExpression__Group__1__Impl )
            // InternalKEffects.g:4434:2: rule__AddExpression__Group__1__Impl
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
    // InternalKEffects.g:4440:1: rule__AddExpression__Group__1__Impl : ( ( rule__AddExpression__Group_1__0 )? ) ;
    public final void rule__AddExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4444:1: ( ( ( rule__AddExpression__Group_1__0 )? ) )
            // InternalKEffects.g:4445:1: ( ( rule__AddExpression__Group_1__0 )? )
            {
            // InternalKEffects.g:4445:1: ( ( rule__AddExpression__Group_1__0 )? )
            // InternalKEffects.g:4446:1: ( rule__AddExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1()); 
            }
            // InternalKEffects.g:4447:1: ( rule__AddExpression__Group_1__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==20) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalKEffects.g:4447:2: rule__AddExpression__Group_1__0
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
    // InternalKEffects.g:4461:1: rule__AddExpression__Group_1__0 : rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 ;
    public final void rule__AddExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4465:1: ( rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 )
            // InternalKEffects.g:4466:2: rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1
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
    // InternalKEffects.g:4473:1: rule__AddExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AddExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4477:1: ( ( () ) )
            // InternalKEffects.g:4478:1: ( () )
            {
            // InternalKEffects.g:4478:1: ( () )
            // InternalKEffects.g:4479:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKEffects.g:4480:1: ()
            // InternalKEffects.g:4482:1: 
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
    // InternalKEffects.g:4492:1: rule__AddExpression__Group_1__1 : rule__AddExpression__Group_1__1__Impl ;
    public final void rule__AddExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4496:1: ( rule__AddExpression__Group_1__1__Impl )
            // InternalKEffects.g:4497:2: rule__AddExpression__Group_1__1__Impl
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
    // InternalKEffects.g:4503:1: rule__AddExpression__Group_1__1__Impl : ( ( ( rule__AddExpression__Group_1_1__0 ) ) ( ( rule__AddExpression__Group_1_1__0 )* ) ) ;
    public final void rule__AddExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4507:1: ( ( ( ( rule__AddExpression__Group_1_1__0 ) ) ( ( rule__AddExpression__Group_1_1__0 )* ) ) )
            // InternalKEffects.g:4508:1: ( ( ( rule__AddExpression__Group_1_1__0 ) ) ( ( rule__AddExpression__Group_1_1__0 )* ) )
            {
            // InternalKEffects.g:4508:1: ( ( ( rule__AddExpression__Group_1_1__0 ) ) ( ( rule__AddExpression__Group_1_1__0 )* ) )
            // InternalKEffects.g:4509:1: ( ( rule__AddExpression__Group_1_1__0 ) ) ( ( rule__AddExpression__Group_1_1__0 )* )
            {
            // InternalKEffects.g:4509:1: ( ( rule__AddExpression__Group_1_1__0 ) )
            // InternalKEffects.g:4510:1: ( rule__AddExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1_1()); 
            }
            // InternalKEffects.g:4511:1: ( rule__AddExpression__Group_1_1__0 )
            // InternalKEffects.g:4511:2: rule__AddExpression__Group_1_1__0
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

            // InternalKEffects.g:4514:1: ( ( rule__AddExpression__Group_1_1__0 )* )
            // InternalKEffects.g:4515:1: ( rule__AddExpression__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1_1()); 
            }
            // InternalKEffects.g:4516:1: ( rule__AddExpression__Group_1_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==20) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalKEffects.g:4516:2: rule__AddExpression__Group_1_1__0
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
    // InternalKEffects.g:4531:1: rule__AddExpression__Group_1_1__0 : rule__AddExpression__Group_1_1__0__Impl rule__AddExpression__Group_1_1__1 ;
    public final void rule__AddExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4535:1: ( rule__AddExpression__Group_1_1__0__Impl rule__AddExpression__Group_1_1__1 )
            // InternalKEffects.g:4536:2: rule__AddExpression__Group_1_1__0__Impl rule__AddExpression__Group_1_1__1
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
    // InternalKEffects.g:4543:1: rule__AddExpression__Group_1_1__0__Impl : ( ( rule__AddExpression__OperatorAssignment_1_1_0 ) ) ;
    public final void rule__AddExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4547:1: ( ( ( rule__AddExpression__OperatorAssignment_1_1_0 ) ) )
            // InternalKEffects.g:4548:1: ( ( rule__AddExpression__OperatorAssignment_1_1_0 ) )
            {
            // InternalKEffects.g:4548:1: ( ( rule__AddExpression__OperatorAssignment_1_1_0 ) )
            // InternalKEffects.g:4549:1: ( rule__AddExpression__OperatorAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorAssignment_1_1_0()); 
            }
            // InternalKEffects.g:4550:1: ( rule__AddExpression__OperatorAssignment_1_1_0 )
            // InternalKEffects.g:4550:2: rule__AddExpression__OperatorAssignment_1_1_0
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
    // InternalKEffects.g:4560:1: rule__AddExpression__Group_1_1__1 : rule__AddExpression__Group_1_1__1__Impl ;
    public final void rule__AddExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4564:1: ( rule__AddExpression__Group_1_1__1__Impl )
            // InternalKEffects.g:4565:2: rule__AddExpression__Group_1_1__1__Impl
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
    // InternalKEffects.g:4571:1: rule__AddExpression__Group_1_1__1__Impl : ( ( rule__AddExpression__SubExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__AddExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4575:1: ( ( ( rule__AddExpression__SubExpressionsAssignment_1_1_1 ) ) )
            // InternalKEffects.g:4576:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_1_1 ) )
            {
            // InternalKEffects.g:4576:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_1_1 ) )
            // InternalKEffects.g:4577:1: ( rule__AddExpression__SubExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }
            // InternalKEffects.g:4578:1: ( rule__AddExpression__SubExpressionsAssignment_1_1_1 )
            // InternalKEffects.g:4578:2: rule__AddExpression__SubExpressionsAssignment_1_1_1
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
    // InternalKEffects.g:4592:1: rule__SubExpression__Group__0 : rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 ;
    public final void rule__SubExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4596:1: ( rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 )
            // InternalKEffects.g:4597:2: rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1
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
    // InternalKEffects.g:4604:1: rule__SubExpression__Group__0__Impl : ( ruleMultExpression ) ;
    public final void rule__SubExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4608:1: ( ( ruleMultExpression ) )
            // InternalKEffects.g:4609:1: ( ruleMultExpression )
            {
            // InternalKEffects.g:4609:1: ( ruleMultExpression )
            // InternalKEffects.g:4610:1: ruleMultExpression
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
    // InternalKEffects.g:4621:1: rule__SubExpression__Group__1 : rule__SubExpression__Group__1__Impl ;
    public final void rule__SubExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4625:1: ( rule__SubExpression__Group__1__Impl )
            // InternalKEffects.g:4626:2: rule__SubExpression__Group__1__Impl
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
    // InternalKEffects.g:4632:1: rule__SubExpression__Group__1__Impl : ( ( rule__SubExpression__Group_1__0 )? ) ;
    public final void rule__SubExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4636:1: ( ( ( rule__SubExpression__Group_1__0 )? ) )
            // InternalKEffects.g:4637:1: ( ( rule__SubExpression__Group_1__0 )? )
            {
            // InternalKEffects.g:4637:1: ( ( rule__SubExpression__Group_1__0 )? )
            // InternalKEffects.g:4638:1: ( rule__SubExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup_1()); 
            }
            // InternalKEffects.g:4639:1: ( rule__SubExpression__Group_1__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==21) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalKEffects.g:4639:2: rule__SubExpression__Group_1__0
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
    // InternalKEffects.g:4653:1: rule__SubExpression__Group_1__0 : rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 ;
    public final void rule__SubExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4657:1: ( rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 )
            // InternalKEffects.g:4658:2: rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1
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
    // InternalKEffects.g:4665:1: rule__SubExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__SubExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4669:1: ( ( () ) )
            // InternalKEffects.g:4670:1: ( () )
            {
            // InternalKEffects.g:4670:1: ( () )
            // InternalKEffects.g:4671:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKEffects.g:4672:1: ()
            // InternalKEffects.g:4674:1: 
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
    // InternalKEffects.g:4684:1: rule__SubExpression__Group_1__1 : rule__SubExpression__Group_1__1__Impl ;
    public final void rule__SubExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4688:1: ( rule__SubExpression__Group_1__1__Impl )
            // InternalKEffects.g:4689:2: rule__SubExpression__Group_1__1__Impl
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
    // InternalKEffects.g:4695:1: rule__SubExpression__Group_1__1__Impl : ( ( ( rule__SubExpression__Group_1_1__0 ) ) ( ( rule__SubExpression__Group_1_1__0 )* ) ) ;
    public final void rule__SubExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4699:1: ( ( ( ( rule__SubExpression__Group_1_1__0 ) ) ( ( rule__SubExpression__Group_1_1__0 )* ) ) )
            // InternalKEffects.g:4700:1: ( ( ( rule__SubExpression__Group_1_1__0 ) ) ( ( rule__SubExpression__Group_1_1__0 )* ) )
            {
            // InternalKEffects.g:4700:1: ( ( ( rule__SubExpression__Group_1_1__0 ) ) ( ( rule__SubExpression__Group_1_1__0 )* ) )
            // InternalKEffects.g:4701:1: ( ( rule__SubExpression__Group_1_1__0 ) ) ( ( rule__SubExpression__Group_1_1__0 )* )
            {
            // InternalKEffects.g:4701:1: ( ( rule__SubExpression__Group_1_1__0 ) )
            // InternalKEffects.g:4702:1: ( rule__SubExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup_1_1()); 
            }
            // InternalKEffects.g:4703:1: ( rule__SubExpression__Group_1_1__0 )
            // InternalKEffects.g:4703:2: rule__SubExpression__Group_1_1__0
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

            // InternalKEffects.g:4706:1: ( ( rule__SubExpression__Group_1_1__0 )* )
            // InternalKEffects.g:4707:1: ( rule__SubExpression__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup_1_1()); 
            }
            // InternalKEffects.g:4708:1: ( rule__SubExpression__Group_1_1__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==21) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalKEffects.g:4708:2: rule__SubExpression__Group_1_1__0
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
    // InternalKEffects.g:4723:1: rule__SubExpression__Group_1_1__0 : rule__SubExpression__Group_1_1__0__Impl rule__SubExpression__Group_1_1__1 ;
    public final void rule__SubExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4727:1: ( rule__SubExpression__Group_1_1__0__Impl rule__SubExpression__Group_1_1__1 )
            // InternalKEffects.g:4728:2: rule__SubExpression__Group_1_1__0__Impl rule__SubExpression__Group_1_1__1
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
    // InternalKEffects.g:4735:1: rule__SubExpression__Group_1_1__0__Impl : ( ( rule__SubExpression__OperatorAssignment_1_1_0 ) ) ;
    public final void rule__SubExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4739:1: ( ( ( rule__SubExpression__OperatorAssignment_1_1_0 ) ) )
            // InternalKEffects.g:4740:1: ( ( rule__SubExpression__OperatorAssignment_1_1_0 ) )
            {
            // InternalKEffects.g:4740:1: ( ( rule__SubExpression__OperatorAssignment_1_1_0 ) )
            // InternalKEffects.g:4741:1: ( rule__SubExpression__OperatorAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorAssignment_1_1_0()); 
            }
            // InternalKEffects.g:4742:1: ( rule__SubExpression__OperatorAssignment_1_1_0 )
            // InternalKEffects.g:4742:2: rule__SubExpression__OperatorAssignment_1_1_0
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
    // InternalKEffects.g:4752:1: rule__SubExpression__Group_1_1__1 : rule__SubExpression__Group_1_1__1__Impl ;
    public final void rule__SubExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4756:1: ( rule__SubExpression__Group_1_1__1__Impl )
            // InternalKEffects.g:4757:2: rule__SubExpression__Group_1_1__1__Impl
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
    // InternalKEffects.g:4763:1: rule__SubExpression__Group_1_1__1__Impl : ( ( rule__SubExpression__SubExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__SubExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4767:1: ( ( ( rule__SubExpression__SubExpressionsAssignment_1_1_1 ) ) )
            // InternalKEffects.g:4768:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_1_1 ) )
            {
            // InternalKEffects.g:4768:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_1_1 ) )
            // InternalKEffects.g:4769:1: ( rule__SubExpression__SubExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }
            // InternalKEffects.g:4770:1: ( rule__SubExpression__SubExpressionsAssignment_1_1_1 )
            // InternalKEffects.g:4770:2: rule__SubExpression__SubExpressionsAssignment_1_1_1
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
    // InternalKEffects.g:4784:1: rule__MultExpression__Group__0 : rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 ;
    public final void rule__MultExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4788:1: ( rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 )
            // InternalKEffects.g:4789:2: rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1
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
    // InternalKEffects.g:4796:1: rule__MultExpression__Group__0__Impl : ( ruleDivExpression ) ;
    public final void rule__MultExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4800:1: ( ( ruleDivExpression ) )
            // InternalKEffects.g:4801:1: ( ruleDivExpression )
            {
            // InternalKEffects.g:4801:1: ( ruleDivExpression )
            // InternalKEffects.g:4802:1: ruleDivExpression
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
    // InternalKEffects.g:4813:1: rule__MultExpression__Group__1 : rule__MultExpression__Group__1__Impl ;
    public final void rule__MultExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4817:1: ( rule__MultExpression__Group__1__Impl )
            // InternalKEffects.g:4818:2: rule__MultExpression__Group__1__Impl
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
    // InternalKEffects.g:4824:1: rule__MultExpression__Group__1__Impl : ( ( rule__MultExpression__Group_1__0 )? ) ;
    public final void rule__MultExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4828:1: ( ( ( rule__MultExpression__Group_1__0 )? ) )
            // InternalKEffects.g:4829:1: ( ( rule__MultExpression__Group_1__0 )? )
            {
            // InternalKEffects.g:4829:1: ( ( rule__MultExpression__Group_1__0 )? )
            // InternalKEffects.g:4830:1: ( rule__MultExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getGroup_1()); 
            }
            // InternalKEffects.g:4831:1: ( rule__MultExpression__Group_1__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==22) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalKEffects.g:4831:2: rule__MultExpression__Group_1__0
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
    // InternalKEffects.g:4845:1: rule__MultExpression__Group_1__0 : rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 ;
    public final void rule__MultExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4849:1: ( rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 )
            // InternalKEffects.g:4850:2: rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1
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
    // InternalKEffects.g:4857:1: rule__MultExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4861:1: ( ( () ) )
            // InternalKEffects.g:4862:1: ( () )
            {
            // InternalKEffects.g:4862:1: ( () )
            // InternalKEffects.g:4863:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKEffects.g:4864:1: ()
            // InternalKEffects.g:4866:1: 
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
    // InternalKEffects.g:4876:1: rule__MultExpression__Group_1__1 : rule__MultExpression__Group_1__1__Impl ;
    public final void rule__MultExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4880:1: ( rule__MultExpression__Group_1__1__Impl )
            // InternalKEffects.g:4881:2: rule__MultExpression__Group_1__1__Impl
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
    // InternalKEffects.g:4887:1: rule__MultExpression__Group_1__1__Impl : ( ( ( rule__MultExpression__Group_1_1__0 ) ) ( ( rule__MultExpression__Group_1_1__0 )* ) ) ;
    public final void rule__MultExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4891:1: ( ( ( ( rule__MultExpression__Group_1_1__0 ) ) ( ( rule__MultExpression__Group_1_1__0 )* ) ) )
            // InternalKEffects.g:4892:1: ( ( ( rule__MultExpression__Group_1_1__0 ) ) ( ( rule__MultExpression__Group_1_1__0 )* ) )
            {
            // InternalKEffects.g:4892:1: ( ( ( rule__MultExpression__Group_1_1__0 ) ) ( ( rule__MultExpression__Group_1_1__0 )* ) )
            // InternalKEffects.g:4893:1: ( ( rule__MultExpression__Group_1_1__0 ) ) ( ( rule__MultExpression__Group_1_1__0 )* )
            {
            // InternalKEffects.g:4893:1: ( ( rule__MultExpression__Group_1_1__0 ) )
            // InternalKEffects.g:4894:1: ( rule__MultExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getGroup_1_1()); 
            }
            // InternalKEffects.g:4895:1: ( rule__MultExpression__Group_1_1__0 )
            // InternalKEffects.g:4895:2: rule__MultExpression__Group_1_1__0
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

            // InternalKEffects.g:4898:1: ( ( rule__MultExpression__Group_1_1__0 )* )
            // InternalKEffects.g:4899:1: ( rule__MultExpression__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getGroup_1_1()); 
            }
            // InternalKEffects.g:4900:1: ( rule__MultExpression__Group_1_1__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==22) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalKEffects.g:4900:2: rule__MultExpression__Group_1_1__0
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
    // InternalKEffects.g:4915:1: rule__MultExpression__Group_1_1__0 : rule__MultExpression__Group_1_1__0__Impl rule__MultExpression__Group_1_1__1 ;
    public final void rule__MultExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4919:1: ( rule__MultExpression__Group_1_1__0__Impl rule__MultExpression__Group_1_1__1 )
            // InternalKEffects.g:4920:2: rule__MultExpression__Group_1_1__0__Impl rule__MultExpression__Group_1_1__1
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
    // InternalKEffects.g:4927:1: rule__MultExpression__Group_1_1__0__Impl : ( ( rule__MultExpression__OperatorAssignment_1_1_0 ) ) ;
    public final void rule__MultExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4931:1: ( ( ( rule__MultExpression__OperatorAssignment_1_1_0 ) ) )
            // InternalKEffects.g:4932:1: ( ( rule__MultExpression__OperatorAssignment_1_1_0 ) )
            {
            // InternalKEffects.g:4932:1: ( ( rule__MultExpression__OperatorAssignment_1_1_0 ) )
            // InternalKEffects.g:4933:1: ( rule__MultExpression__OperatorAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorAssignment_1_1_0()); 
            }
            // InternalKEffects.g:4934:1: ( rule__MultExpression__OperatorAssignment_1_1_0 )
            // InternalKEffects.g:4934:2: rule__MultExpression__OperatorAssignment_1_1_0
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
    // InternalKEffects.g:4944:1: rule__MultExpression__Group_1_1__1 : rule__MultExpression__Group_1_1__1__Impl ;
    public final void rule__MultExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4948:1: ( rule__MultExpression__Group_1_1__1__Impl )
            // InternalKEffects.g:4949:2: rule__MultExpression__Group_1_1__1__Impl
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
    // InternalKEffects.g:4955:1: rule__MultExpression__Group_1_1__1__Impl : ( ( rule__MultExpression__SubExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__MultExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4959:1: ( ( ( rule__MultExpression__SubExpressionsAssignment_1_1_1 ) ) )
            // InternalKEffects.g:4960:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_1_1 ) )
            {
            // InternalKEffects.g:4960:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_1_1 ) )
            // InternalKEffects.g:4961:1: ( rule__MultExpression__SubExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }
            // InternalKEffects.g:4962:1: ( rule__MultExpression__SubExpressionsAssignment_1_1_1 )
            // InternalKEffects.g:4962:2: rule__MultExpression__SubExpressionsAssignment_1_1_1
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
    // InternalKEffects.g:4976:1: rule__DivExpression__Group__0 : rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1 ;
    public final void rule__DivExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4980:1: ( rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1 )
            // InternalKEffects.g:4981:2: rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1
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
    // InternalKEffects.g:4988:1: rule__DivExpression__Group__0__Impl : ( ruleModExpression ) ;
    public final void rule__DivExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:4992:1: ( ( ruleModExpression ) )
            // InternalKEffects.g:4993:1: ( ruleModExpression )
            {
            // InternalKEffects.g:4993:1: ( ruleModExpression )
            // InternalKEffects.g:4994:1: ruleModExpression
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
    // InternalKEffects.g:5005:1: rule__DivExpression__Group__1 : rule__DivExpression__Group__1__Impl ;
    public final void rule__DivExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5009:1: ( rule__DivExpression__Group__1__Impl )
            // InternalKEffects.g:5010:2: rule__DivExpression__Group__1__Impl
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
    // InternalKEffects.g:5016:1: rule__DivExpression__Group__1__Impl : ( ( rule__DivExpression__Group_1__0 )? ) ;
    public final void rule__DivExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5020:1: ( ( ( rule__DivExpression__Group_1__0 )? ) )
            // InternalKEffects.g:5021:1: ( ( rule__DivExpression__Group_1__0 )? )
            {
            // InternalKEffects.g:5021:1: ( ( rule__DivExpression__Group_1__0 )? )
            // InternalKEffects.g:5022:1: ( rule__DivExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getGroup_1()); 
            }
            // InternalKEffects.g:5023:1: ( rule__DivExpression__Group_1__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==24) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalKEffects.g:5023:2: rule__DivExpression__Group_1__0
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
    // InternalKEffects.g:5037:1: rule__DivExpression__Group_1__0 : rule__DivExpression__Group_1__0__Impl rule__DivExpression__Group_1__1 ;
    public final void rule__DivExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5041:1: ( rule__DivExpression__Group_1__0__Impl rule__DivExpression__Group_1__1 )
            // InternalKEffects.g:5042:2: rule__DivExpression__Group_1__0__Impl rule__DivExpression__Group_1__1
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
    // InternalKEffects.g:5049:1: rule__DivExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__DivExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5053:1: ( ( () ) )
            // InternalKEffects.g:5054:1: ( () )
            {
            // InternalKEffects.g:5054:1: ( () )
            // InternalKEffects.g:5055:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKEffects.g:5056:1: ()
            // InternalKEffects.g:5058:1: 
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
    // InternalKEffects.g:5068:1: rule__DivExpression__Group_1__1 : rule__DivExpression__Group_1__1__Impl ;
    public final void rule__DivExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5072:1: ( rule__DivExpression__Group_1__1__Impl )
            // InternalKEffects.g:5073:2: rule__DivExpression__Group_1__1__Impl
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
    // InternalKEffects.g:5079:1: rule__DivExpression__Group_1__1__Impl : ( ( ( rule__DivExpression__Group_1_1__0 ) ) ( ( rule__DivExpression__Group_1_1__0 )* ) ) ;
    public final void rule__DivExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5083:1: ( ( ( ( rule__DivExpression__Group_1_1__0 ) ) ( ( rule__DivExpression__Group_1_1__0 )* ) ) )
            // InternalKEffects.g:5084:1: ( ( ( rule__DivExpression__Group_1_1__0 ) ) ( ( rule__DivExpression__Group_1_1__0 )* ) )
            {
            // InternalKEffects.g:5084:1: ( ( ( rule__DivExpression__Group_1_1__0 ) ) ( ( rule__DivExpression__Group_1_1__0 )* ) )
            // InternalKEffects.g:5085:1: ( ( rule__DivExpression__Group_1_1__0 ) ) ( ( rule__DivExpression__Group_1_1__0 )* )
            {
            // InternalKEffects.g:5085:1: ( ( rule__DivExpression__Group_1_1__0 ) )
            // InternalKEffects.g:5086:1: ( rule__DivExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getGroup_1_1()); 
            }
            // InternalKEffects.g:5087:1: ( rule__DivExpression__Group_1_1__0 )
            // InternalKEffects.g:5087:2: rule__DivExpression__Group_1_1__0
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

            // InternalKEffects.g:5090:1: ( ( rule__DivExpression__Group_1_1__0 )* )
            // InternalKEffects.g:5091:1: ( rule__DivExpression__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getGroup_1_1()); 
            }
            // InternalKEffects.g:5092:1: ( rule__DivExpression__Group_1_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==24) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalKEffects.g:5092:2: rule__DivExpression__Group_1_1__0
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
    // InternalKEffects.g:5107:1: rule__DivExpression__Group_1_1__0 : rule__DivExpression__Group_1_1__0__Impl rule__DivExpression__Group_1_1__1 ;
    public final void rule__DivExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5111:1: ( rule__DivExpression__Group_1_1__0__Impl rule__DivExpression__Group_1_1__1 )
            // InternalKEffects.g:5112:2: rule__DivExpression__Group_1_1__0__Impl rule__DivExpression__Group_1_1__1
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
    // InternalKEffects.g:5119:1: rule__DivExpression__Group_1_1__0__Impl : ( ( rule__DivExpression__OperatorAssignment_1_1_0 ) ) ;
    public final void rule__DivExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5123:1: ( ( ( rule__DivExpression__OperatorAssignment_1_1_0 ) ) )
            // InternalKEffects.g:5124:1: ( ( rule__DivExpression__OperatorAssignment_1_1_0 ) )
            {
            // InternalKEffects.g:5124:1: ( ( rule__DivExpression__OperatorAssignment_1_1_0 ) )
            // InternalKEffects.g:5125:1: ( rule__DivExpression__OperatorAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorAssignment_1_1_0()); 
            }
            // InternalKEffects.g:5126:1: ( rule__DivExpression__OperatorAssignment_1_1_0 )
            // InternalKEffects.g:5126:2: rule__DivExpression__OperatorAssignment_1_1_0
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
    // InternalKEffects.g:5136:1: rule__DivExpression__Group_1_1__1 : rule__DivExpression__Group_1_1__1__Impl ;
    public final void rule__DivExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5140:1: ( rule__DivExpression__Group_1_1__1__Impl )
            // InternalKEffects.g:5141:2: rule__DivExpression__Group_1_1__1__Impl
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
    // InternalKEffects.g:5147:1: rule__DivExpression__Group_1_1__1__Impl : ( ( rule__DivExpression__SubExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__DivExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5151:1: ( ( ( rule__DivExpression__SubExpressionsAssignment_1_1_1 ) ) )
            // InternalKEffects.g:5152:1: ( ( rule__DivExpression__SubExpressionsAssignment_1_1_1 ) )
            {
            // InternalKEffects.g:5152:1: ( ( rule__DivExpression__SubExpressionsAssignment_1_1_1 ) )
            // InternalKEffects.g:5153:1: ( rule__DivExpression__SubExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }
            // InternalKEffects.g:5154:1: ( rule__DivExpression__SubExpressionsAssignment_1_1_1 )
            // InternalKEffects.g:5154:2: rule__DivExpression__SubExpressionsAssignment_1_1_1
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
    // InternalKEffects.g:5168:1: rule__ModExpression__Group__0 : rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1 ;
    public final void rule__ModExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5172:1: ( rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1 )
            // InternalKEffects.g:5173:2: rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1
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
    // InternalKEffects.g:5180:1: rule__ModExpression__Group__0__Impl : ( ruleNegExpression ) ;
    public final void rule__ModExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5184:1: ( ( ruleNegExpression ) )
            // InternalKEffects.g:5185:1: ( ruleNegExpression )
            {
            // InternalKEffects.g:5185:1: ( ruleNegExpression )
            // InternalKEffects.g:5186:1: ruleNegExpression
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
    // InternalKEffects.g:5197:1: rule__ModExpression__Group__1 : rule__ModExpression__Group__1__Impl ;
    public final void rule__ModExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5201:1: ( rule__ModExpression__Group__1__Impl )
            // InternalKEffects.g:5202:2: rule__ModExpression__Group__1__Impl
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
    // InternalKEffects.g:5208:1: rule__ModExpression__Group__1__Impl : ( ( rule__ModExpression__Group_1__0 )? ) ;
    public final void rule__ModExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5212:1: ( ( ( rule__ModExpression__Group_1__0 )? ) )
            // InternalKEffects.g:5213:1: ( ( rule__ModExpression__Group_1__0 )? )
            {
            // InternalKEffects.g:5213:1: ( ( rule__ModExpression__Group_1__0 )? )
            // InternalKEffects.g:5214:1: ( rule__ModExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getGroup_1()); 
            }
            // InternalKEffects.g:5215:1: ( rule__ModExpression__Group_1__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==23) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalKEffects.g:5215:2: rule__ModExpression__Group_1__0
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
    // InternalKEffects.g:5229:1: rule__ModExpression__Group_1__0 : rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1 ;
    public final void rule__ModExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5233:1: ( rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1 )
            // InternalKEffects.g:5234:2: rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1
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
    // InternalKEffects.g:5241:1: rule__ModExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ModExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5245:1: ( ( () ) )
            // InternalKEffects.g:5246:1: ( () )
            {
            // InternalKEffects.g:5246:1: ( () )
            // InternalKEffects.g:5247:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKEffects.g:5248:1: ()
            // InternalKEffects.g:5250:1: 
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
    // InternalKEffects.g:5260:1: rule__ModExpression__Group_1__1 : rule__ModExpression__Group_1__1__Impl ;
    public final void rule__ModExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5264:1: ( rule__ModExpression__Group_1__1__Impl )
            // InternalKEffects.g:5265:2: rule__ModExpression__Group_1__1__Impl
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
    // InternalKEffects.g:5271:1: rule__ModExpression__Group_1__1__Impl : ( ( ( rule__ModExpression__Group_1_1__0 ) ) ( ( rule__ModExpression__Group_1_1__0 )* ) ) ;
    public final void rule__ModExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5275:1: ( ( ( ( rule__ModExpression__Group_1_1__0 ) ) ( ( rule__ModExpression__Group_1_1__0 )* ) ) )
            // InternalKEffects.g:5276:1: ( ( ( rule__ModExpression__Group_1_1__0 ) ) ( ( rule__ModExpression__Group_1_1__0 )* ) )
            {
            // InternalKEffects.g:5276:1: ( ( ( rule__ModExpression__Group_1_1__0 ) ) ( ( rule__ModExpression__Group_1_1__0 )* ) )
            // InternalKEffects.g:5277:1: ( ( rule__ModExpression__Group_1_1__0 ) ) ( ( rule__ModExpression__Group_1_1__0 )* )
            {
            // InternalKEffects.g:5277:1: ( ( rule__ModExpression__Group_1_1__0 ) )
            // InternalKEffects.g:5278:1: ( rule__ModExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getGroup_1_1()); 
            }
            // InternalKEffects.g:5279:1: ( rule__ModExpression__Group_1_1__0 )
            // InternalKEffects.g:5279:2: rule__ModExpression__Group_1_1__0
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

            // InternalKEffects.g:5282:1: ( ( rule__ModExpression__Group_1_1__0 )* )
            // InternalKEffects.g:5283:1: ( rule__ModExpression__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getGroup_1_1()); 
            }
            // InternalKEffects.g:5284:1: ( rule__ModExpression__Group_1_1__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==23) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalKEffects.g:5284:2: rule__ModExpression__Group_1_1__0
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
    // InternalKEffects.g:5299:1: rule__ModExpression__Group_1_1__0 : rule__ModExpression__Group_1_1__0__Impl rule__ModExpression__Group_1_1__1 ;
    public final void rule__ModExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5303:1: ( rule__ModExpression__Group_1_1__0__Impl rule__ModExpression__Group_1_1__1 )
            // InternalKEffects.g:5304:2: rule__ModExpression__Group_1_1__0__Impl rule__ModExpression__Group_1_1__1
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
    // InternalKEffects.g:5311:1: rule__ModExpression__Group_1_1__0__Impl : ( ( rule__ModExpression__OperatorAssignment_1_1_0 ) ) ;
    public final void rule__ModExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5315:1: ( ( ( rule__ModExpression__OperatorAssignment_1_1_0 ) ) )
            // InternalKEffects.g:5316:1: ( ( rule__ModExpression__OperatorAssignment_1_1_0 ) )
            {
            // InternalKEffects.g:5316:1: ( ( rule__ModExpression__OperatorAssignment_1_1_0 ) )
            // InternalKEffects.g:5317:1: ( rule__ModExpression__OperatorAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorAssignment_1_1_0()); 
            }
            // InternalKEffects.g:5318:1: ( rule__ModExpression__OperatorAssignment_1_1_0 )
            // InternalKEffects.g:5318:2: rule__ModExpression__OperatorAssignment_1_1_0
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
    // InternalKEffects.g:5328:1: rule__ModExpression__Group_1_1__1 : rule__ModExpression__Group_1_1__1__Impl ;
    public final void rule__ModExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5332:1: ( rule__ModExpression__Group_1_1__1__Impl )
            // InternalKEffects.g:5333:2: rule__ModExpression__Group_1_1__1__Impl
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
    // InternalKEffects.g:5339:1: rule__ModExpression__Group_1_1__1__Impl : ( ( rule__ModExpression__SubExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__ModExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5343:1: ( ( ( rule__ModExpression__SubExpressionsAssignment_1_1_1 ) ) )
            // InternalKEffects.g:5344:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_1_1 ) )
            {
            // InternalKEffects.g:5344:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_1_1 ) )
            // InternalKEffects.g:5345:1: ( rule__ModExpression__SubExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }
            // InternalKEffects.g:5346:1: ( rule__ModExpression__SubExpressionsAssignment_1_1_1 )
            // InternalKEffects.g:5346:2: rule__ModExpression__SubExpressionsAssignment_1_1_1
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
    // InternalKEffects.g:5360:1: rule__NegExpression__Group_0__0 : rule__NegExpression__Group_0__0__Impl rule__NegExpression__Group_0__1 ;
    public final void rule__NegExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5364:1: ( rule__NegExpression__Group_0__0__Impl rule__NegExpression__Group_0__1 )
            // InternalKEffects.g:5365:2: rule__NegExpression__Group_0__0__Impl rule__NegExpression__Group_0__1
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
    // InternalKEffects.g:5372:1: rule__NegExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__NegExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5376:1: ( ( () ) )
            // InternalKEffects.g:5377:1: ( () )
            {
            // InternalKEffects.g:5377:1: ( () )
            // InternalKEffects.g:5378:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // InternalKEffects.g:5379:1: ()
            // InternalKEffects.g:5381:1: 
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
    // InternalKEffects.g:5391:1: rule__NegExpression__Group_0__1 : rule__NegExpression__Group_0__1__Impl rule__NegExpression__Group_0__2 ;
    public final void rule__NegExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5395:1: ( rule__NegExpression__Group_0__1__Impl rule__NegExpression__Group_0__2 )
            // InternalKEffects.g:5396:2: rule__NegExpression__Group_0__1__Impl rule__NegExpression__Group_0__2
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
    // InternalKEffects.g:5403:1: rule__NegExpression__Group_0__1__Impl : ( ( rule__NegExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__NegExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5407:1: ( ( ( rule__NegExpression__OperatorAssignment_0_1 ) ) )
            // InternalKEffects.g:5408:1: ( ( rule__NegExpression__OperatorAssignment_0_1 ) )
            {
            // InternalKEffects.g:5408:1: ( ( rule__NegExpression__OperatorAssignment_0_1 ) )
            // InternalKEffects.g:5409:1: ( rule__NegExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // InternalKEffects.g:5410:1: ( rule__NegExpression__OperatorAssignment_0_1 )
            // InternalKEffects.g:5410:2: rule__NegExpression__OperatorAssignment_0_1
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
    // InternalKEffects.g:5420:1: rule__NegExpression__Group_0__2 : rule__NegExpression__Group_0__2__Impl ;
    public final void rule__NegExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5424:1: ( rule__NegExpression__Group_0__2__Impl )
            // InternalKEffects.g:5425:2: rule__NegExpression__Group_0__2__Impl
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
    // InternalKEffects.g:5431:1: rule__NegExpression__Group_0__2__Impl : ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) ) ;
    public final void rule__NegExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5435:1: ( ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) ) )
            // InternalKEffects.g:5436:1: ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) )
            {
            // InternalKEffects.g:5436:1: ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) )
            // InternalKEffects.g:5437:1: ( rule__NegExpression__SubExpressionsAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getSubExpressionsAssignment_0_2()); 
            }
            // InternalKEffects.g:5438:1: ( rule__NegExpression__SubExpressionsAssignment_0_2 )
            // InternalKEffects.g:5438:2: rule__NegExpression__SubExpressionsAssignment_0_2
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
    // InternalKEffects.g:5454:1: rule__AtomicExpression__Group_2__0 : rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 ;
    public final void rule__AtomicExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5458:1: ( rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 )
            // InternalKEffects.g:5459:2: rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1
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
    // InternalKEffects.g:5466:1: rule__AtomicExpression__Group_2__0__Impl : ( '(' ) ;
    public final void rule__AtomicExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5470:1: ( ( '(' ) )
            // InternalKEffects.g:5471:1: ( '(' )
            {
            // InternalKEffects.g:5471:1: ( '(' )
            // InternalKEffects.g:5472:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:5485:1: rule__AtomicExpression__Group_2__1 : rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2 ;
    public final void rule__AtomicExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5489:1: ( rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2 )
            // InternalKEffects.g:5490:2: rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2
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
    // InternalKEffects.g:5497:1: rule__AtomicExpression__Group_2__1__Impl : ( ruleBoolExpression ) ;
    public final void rule__AtomicExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5501:1: ( ( ruleBoolExpression ) )
            // InternalKEffects.g:5502:1: ( ruleBoolExpression )
            {
            // InternalKEffects.g:5502:1: ( ruleBoolExpression )
            // InternalKEffects.g:5503:1: ruleBoolExpression
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
    // InternalKEffects.g:5514:1: rule__AtomicExpression__Group_2__2 : rule__AtomicExpression__Group_2__2__Impl ;
    public final void rule__AtomicExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5518:1: ( rule__AtomicExpression__Group_2__2__Impl )
            // InternalKEffects.g:5519:2: rule__AtomicExpression__Group_2__2__Impl
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
    // InternalKEffects.g:5525:1: rule__AtomicExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__AtomicExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5529:1: ( ( ')' ) )
            // InternalKEffects.g:5530:1: ( ')' )
            {
            // InternalKEffects.g:5530:1: ( ')' )
            // InternalKEffects.g:5531:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:5550:1: rule__AtomicValuedExpression__Group_3__0 : rule__AtomicValuedExpression__Group_3__0__Impl rule__AtomicValuedExpression__Group_3__1 ;
    public final void rule__AtomicValuedExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5554:1: ( rule__AtomicValuedExpression__Group_3__0__Impl rule__AtomicValuedExpression__Group_3__1 )
            // InternalKEffects.g:5555:2: rule__AtomicValuedExpression__Group_3__0__Impl rule__AtomicValuedExpression__Group_3__1
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
    // InternalKEffects.g:5562:1: rule__AtomicValuedExpression__Group_3__0__Impl : ( '(' ) ;
    public final void rule__AtomicValuedExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5566:1: ( ( '(' ) )
            // InternalKEffects.g:5567:1: ( '(' )
            {
            // InternalKEffects.g:5567:1: ( '(' )
            // InternalKEffects.g:5568:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:5581:1: rule__AtomicValuedExpression__Group_3__1 : rule__AtomicValuedExpression__Group_3__1__Impl rule__AtomicValuedExpression__Group_3__2 ;
    public final void rule__AtomicValuedExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5585:1: ( rule__AtomicValuedExpression__Group_3__1__Impl rule__AtomicValuedExpression__Group_3__2 )
            // InternalKEffects.g:5586:2: rule__AtomicValuedExpression__Group_3__1__Impl rule__AtomicValuedExpression__Group_3__2
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
    // InternalKEffects.g:5593:1: rule__AtomicValuedExpression__Group_3__1__Impl : ( ruleValuedExpression ) ;
    public final void rule__AtomicValuedExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5597:1: ( ( ruleValuedExpression ) )
            // InternalKEffects.g:5598:1: ( ruleValuedExpression )
            {
            // InternalKEffects.g:5598:1: ( ruleValuedExpression )
            // InternalKEffects.g:5599:1: ruleValuedExpression
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
    // InternalKEffects.g:5610:1: rule__AtomicValuedExpression__Group_3__2 : rule__AtomicValuedExpression__Group_3__2__Impl ;
    public final void rule__AtomicValuedExpression__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5614:1: ( rule__AtomicValuedExpression__Group_3__2__Impl )
            // InternalKEffects.g:5615:2: rule__AtomicValuedExpression__Group_3__2__Impl
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
    // InternalKEffects.g:5621:1: rule__AtomicValuedExpression__Group_3__2__Impl : ( ')' ) ;
    public final void rule__AtomicValuedExpression__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5625:1: ( ( ')' ) )
            // InternalKEffects.g:5626:1: ( ')' )
            {
            // InternalKEffects.g:5626:1: ( ')' )
            // InternalKEffects.g:5627:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:5646:1: rule__ValuedObjectTestExpression__Group_0__0 : rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1 ;
    public final void rule__ValuedObjectTestExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5650:1: ( rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1 )
            // InternalKEffects.g:5651:2: rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1
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
    // InternalKEffects.g:5658:1: rule__ValuedObjectTestExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5662:1: ( ( () ) )
            // InternalKEffects.g:5663:1: ( () )
            {
            // InternalKEffects.g:5663:1: ( () )
            // InternalKEffects.g:5664:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // InternalKEffects.g:5665:1: ()
            // InternalKEffects.g:5667:1: 
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
    // InternalKEffects.g:5677:1: rule__ValuedObjectTestExpression__Group_0__1 : rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2 ;
    public final void rule__ValuedObjectTestExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5681:1: ( rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2 )
            // InternalKEffects.g:5682:2: rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2
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
    // InternalKEffects.g:5689:1: rule__ValuedObjectTestExpression__Group_0__1__Impl : ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5693:1: ( ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) ) )
            // InternalKEffects.g:5694:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) )
            {
            // InternalKEffects.g:5694:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) )
            // InternalKEffects.g:5695:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // InternalKEffects.g:5696:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 )
            // InternalKEffects.g:5696:2: rule__ValuedObjectTestExpression__OperatorAssignment_0_1
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
    // InternalKEffects.g:5706:1: rule__ValuedObjectTestExpression__Group_0__2 : rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3 ;
    public final void rule__ValuedObjectTestExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5710:1: ( rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3 )
            // InternalKEffects.g:5711:2: rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3
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
    // InternalKEffects.g:5718:1: rule__ValuedObjectTestExpression__Group_0__2__Impl : ( '(' ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5722:1: ( ( '(' ) )
            // InternalKEffects.g:5723:1: ( '(' )
            {
            // InternalKEffects.g:5723:1: ( '(' )
            // InternalKEffects.g:5724:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2()); 
            }
            match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:5737:1: rule__ValuedObjectTestExpression__Group_0__3 : rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4 ;
    public final void rule__ValuedObjectTestExpression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5741:1: ( rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4 )
            // InternalKEffects.g:5742:2: rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4
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
    // InternalKEffects.g:5749:1: rule__ValuedObjectTestExpression__Group_0__3__Impl : ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5753:1: ( ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) ) )
            // InternalKEffects.g:5754:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) )
            {
            // InternalKEffects.g:5754:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) )
            // InternalKEffects.g:5755:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsAssignment_0_3()); 
            }
            // InternalKEffects.g:5756:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 )
            // InternalKEffects.g:5756:2: rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3
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
    // InternalKEffects.g:5766:1: rule__ValuedObjectTestExpression__Group_0__4 : rule__ValuedObjectTestExpression__Group_0__4__Impl ;
    public final void rule__ValuedObjectTestExpression__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5770:1: ( rule__ValuedObjectTestExpression__Group_0__4__Impl )
            // InternalKEffects.g:5771:2: rule__ValuedObjectTestExpression__Group_0__4__Impl
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
    // InternalKEffects.g:5777:1: rule__ValuedObjectTestExpression__Group_0__4__Impl : ( ')' ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5781:1: ( ( ')' ) )
            // InternalKEffects.g:5782:1: ( ')' )
            {
            // InternalKEffects.g:5782:1: ( ')' )
            // InternalKEffects.g:5783:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4()); 
            }
            match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:5806:1: rule__ValuedObjectReference__Group__0 : rule__ValuedObjectReference__Group__0__Impl rule__ValuedObjectReference__Group__1 ;
    public final void rule__ValuedObjectReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5810:1: ( rule__ValuedObjectReference__Group__0__Impl rule__ValuedObjectReference__Group__1 )
            // InternalKEffects.g:5811:2: rule__ValuedObjectReference__Group__0__Impl rule__ValuedObjectReference__Group__1
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
    // InternalKEffects.g:5818:1: rule__ValuedObjectReference__Group__0__Impl : ( ( rule__ValuedObjectReference__ValuedObjectAssignment_0 ) ) ;
    public final void rule__ValuedObjectReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5822:1: ( ( ( rule__ValuedObjectReference__ValuedObjectAssignment_0 ) ) )
            // InternalKEffects.g:5823:1: ( ( rule__ValuedObjectReference__ValuedObjectAssignment_0 ) )
            {
            // InternalKEffects.g:5823:1: ( ( rule__ValuedObjectReference__ValuedObjectAssignment_0 ) )
            // InternalKEffects.g:5824:1: ( rule__ValuedObjectReference__ValuedObjectAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectAssignment_0()); 
            }
            // InternalKEffects.g:5825:1: ( rule__ValuedObjectReference__ValuedObjectAssignment_0 )
            // InternalKEffects.g:5825:2: rule__ValuedObjectReference__ValuedObjectAssignment_0
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
    // InternalKEffects.g:5835:1: rule__ValuedObjectReference__Group__1 : rule__ValuedObjectReference__Group__1__Impl rule__ValuedObjectReference__Group__2 ;
    public final void rule__ValuedObjectReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5839:1: ( rule__ValuedObjectReference__Group__1__Impl rule__ValuedObjectReference__Group__2 )
            // InternalKEffects.g:5840:2: rule__ValuedObjectReference__Group__1__Impl rule__ValuedObjectReference__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_41);
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
    // InternalKEffects.g:5847:1: rule__ValuedObjectReference__Group__1__Impl : ( ( rule__ValuedObjectReference__Group_1__0 )? ) ;
    public final void rule__ValuedObjectReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5851:1: ( ( ( rule__ValuedObjectReference__Group_1__0 )? ) )
            // InternalKEffects.g:5852:1: ( ( rule__ValuedObjectReference__Group_1__0 )? )
            {
            // InternalKEffects.g:5852:1: ( ( rule__ValuedObjectReference__Group_1__0 )? )
            // InternalKEffects.g:5853:1: ( rule__ValuedObjectReference__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getGroup_1()); 
            }
            // InternalKEffects.g:5854:1: ( rule__ValuedObjectReference__Group_1__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==51) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalKEffects.g:5854:2: rule__ValuedObjectReference__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ValuedObjectReference__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

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
    // InternalKEffects.g:5864:1: rule__ValuedObjectReference__Group__2 : rule__ValuedObjectReference__Group__2__Impl ;
    public final void rule__ValuedObjectReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5868:1: ( rule__ValuedObjectReference__Group__2__Impl )
            // InternalKEffects.g:5869:2: rule__ValuedObjectReference__Group__2__Impl
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
    // InternalKEffects.g:5875:1: rule__ValuedObjectReference__Group__2__Impl : ( ( rule__ValuedObjectReference__Group_2__0 )* ) ;
    public final void rule__ValuedObjectReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5879:1: ( ( ( rule__ValuedObjectReference__Group_2__0 )* ) )
            // InternalKEffects.g:5880:1: ( ( rule__ValuedObjectReference__Group_2__0 )* )
            {
            // InternalKEffects.g:5880:1: ( ( rule__ValuedObjectReference__Group_2__0 )* )
            // InternalKEffects.g:5881:1: ( rule__ValuedObjectReference__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getGroup_2()); 
            }
            // InternalKEffects.g:5882:1: ( rule__ValuedObjectReference__Group_2__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==48) ) {
                    int LA49_2 = input.LA(2);

                    if ( (synpred77_InternalKEffects()) ) {
                        alt49=1;
                    }


                }


                switch (alt49) {
            	case 1 :
            	    // InternalKEffects.g:5882:2: rule__ValuedObjectReference__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    rule__ValuedObjectReference__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

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
    // InternalKEffects.g:5898:1: rule__ValuedObjectReference__Group_1__0 : rule__ValuedObjectReference__Group_1__0__Impl rule__ValuedObjectReference__Group_1__1 ;
    public final void rule__ValuedObjectReference__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5902:1: ( rule__ValuedObjectReference__Group_1__0__Impl rule__ValuedObjectReference__Group_1__1 )
            // InternalKEffects.g:5903:2: rule__ValuedObjectReference__Group_1__0__Impl rule__ValuedObjectReference__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_40);
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
    // InternalKEffects.g:5910:1: rule__ValuedObjectReference__Group_1__0__Impl : ( '.' ) ;
    public final void rule__ValuedObjectReference__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5914:1: ( ( '.' ) )
            // InternalKEffects.g:5915:1: ( '.' )
            {
            // InternalKEffects.g:5915:1: ( '.' )
            // InternalKEffects.g:5916:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getFullStopKeyword_1_0()); 
            }
            match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuedObjectReferenceAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
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
    // InternalKEffects.g:5929:1: rule__ValuedObjectReference__Group_1__1 : rule__ValuedObjectReference__Group_1__1__Impl ;
    public final void rule__ValuedObjectReference__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5933:1: ( rule__ValuedObjectReference__Group_1__1__Impl )
            // InternalKEffects.g:5934:2: rule__ValuedObjectReference__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ValuedObjectReference__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalKEffects.g:5940:1: rule__ValuedObjectReference__Group_1__1__Impl : ( ( rule__ValuedObjectReference__SubReferenceAssignment_1_1 ) ) ;
    public final void rule__ValuedObjectReference__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5944:1: ( ( ( rule__ValuedObjectReference__SubReferenceAssignment_1_1 ) ) )
            // InternalKEffects.g:5945:1: ( ( rule__ValuedObjectReference__SubReferenceAssignment_1_1 ) )
            {
            // InternalKEffects.g:5945:1: ( ( rule__ValuedObjectReference__SubReferenceAssignment_1_1 ) )
            // InternalKEffects.g:5946:1: ( rule__ValuedObjectReference__SubReferenceAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getSubReferenceAssignment_1_1()); 
            }
            // InternalKEffects.g:5947:1: ( rule__ValuedObjectReference__SubReferenceAssignment_1_1 )
            // InternalKEffects.g:5947:2: rule__ValuedObjectReference__SubReferenceAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ValuedObjectReference__SubReferenceAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuedObjectReferenceAccess().getSubReferenceAssignment_1_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__ValuedObjectReference__Group_2__0"
    // InternalKEffects.g:5961:1: rule__ValuedObjectReference__Group_2__0 : rule__ValuedObjectReference__Group_2__0__Impl rule__ValuedObjectReference__Group_2__1 ;
    public final void rule__ValuedObjectReference__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5965:1: ( rule__ValuedObjectReference__Group_2__0__Impl rule__ValuedObjectReference__Group_2__1 )
            // InternalKEffects.g:5966:2: rule__ValuedObjectReference__Group_2__0__Impl rule__ValuedObjectReference__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
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
    // InternalKEffects.g:5973:1: rule__ValuedObjectReference__Group_2__0__Impl : ( '[' ) ;
    public final void rule__ValuedObjectReference__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5977:1: ( ( '[' ) )
            // InternalKEffects.g:5978:1: ( '[' )
            {
            // InternalKEffects.g:5978:1: ( '[' )
            // InternalKEffects.g:5979:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getLeftSquareBracketKeyword_2_0()); 
            }
            match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuedObjectReferenceAccess().getLeftSquareBracketKeyword_2_0()); 
            }

            }


            }

        }
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
    // InternalKEffects.g:5992:1: rule__ValuedObjectReference__Group_2__1 : rule__ValuedObjectReference__Group_2__1__Impl rule__ValuedObjectReference__Group_2__2 ;
    public final void rule__ValuedObjectReference__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:5996:1: ( rule__ValuedObjectReference__Group_2__1__Impl rule__ValuedObjectReference__Group_2__2 )
            // InternalKEffects.g:5997:2: rule__ValuedObjectReference__Group_2__1__Impl rule__ValuedObjectReference__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__ValuedObjectReference__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ValuedObjectReference__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalKEffects.g:6004:1: rule__ValuedObjectReference__Group_2__1__Impl : ( ( rule__ValuedObjectReference__IndicesAssignment_2_1 ) ) ;
    public final void rule__ValuedObjectReference__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6008:1: ( ( ( rule__ValuedObjectReference__IndicesAssignment_2_1 ) ) )
            // InternalKEffects.g:6009:1: ( ( rule__ValuedObjectReference__IndicesAssignment_2_1 ) )
            {
            // InternalKEffects.g:6009:1: ( ( rule__ValuedObjectReference__IndicesAssignment_2_1 ) )
            // InternalKEffects.g:6010:1: ( rule__ValuedObjectReference__IndicesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getIndicesAssignment_2_1()); 
            }
            // InternalKEffects.g:6011:1: ( rule__ValuedObjectReference__IndicesAssignment_2_1 )
            // InternalKEffects.g:6011:2: rule__ValuedObjectReference__IndicesAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ValuedObjectReference__IndicesAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuedObjectReferenceAccess().getIndicesAssignment_2_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__ValuedObjectReference__Group_2__2"
    // InternalKEffects.g:6021:1: rule__ValuedObjectReference__Group_2__2 : rule__ValuedObjectReference__Group_2__2__Impl ;
    public final void rule__ValuedObjectReference__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6025:1: ( rule__ValuedObjectReference__Group_2__2__Impl )
            // InternalKEffects.g:6026:2: rule__ValuedObjectReference__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ValuedObjectReference__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValuedObjectReference__Group_2__2"


    // $ANTLR start "rule__ValuedObjectReference__Group_2__2__Impl"
    // InternalKEffects.g:6032:1: rule__ValuedObjectReference__Group_2__2__Impl : ( ']' ) ;
    public final void rule__ValuedObjectReference__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6036:1: ( ( ']' ) )
            // InternalKEffects.g:6037:1: ( ']' )
            {
            // InternalKEffects.g:6037:1: ( ']' )
            // InternalKEffects.g:6038:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getRightSquareBracketKeyword_2_2()); 
            }
            match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuedObjectReferenceAccess().getRightSquareBracketKeyword_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValuedObjectReference__Group_2__2__Impl"


    // $ANTLR start "rule__FunctionCall__Group__0"
    // InternalKEffects.g:6057:1: rule__FunctionCall__Group__0 : rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 ;
    public final void rule__FunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6061:1: ( rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 )
            // InternalKEffects.g:6062:2: rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1
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
    // InternalKEffects.g:6069:1: rule__FunctionCall__Group__0__Impl : ( '<' ) ;
    public final void rule__FunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6073:1: ( ( '<' ) )
            // InternalKEffects.g:6074:1: ( '<' )
            {
            // InternalKEffects.g:6074:1: ( '<' )
            // InternalKEffects.g:6075:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getLessThanSignKeyword_0()); 
            }
            match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:6088:1: rule__FunctionCall__Group__1 : rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 ;
    public final void rule__FunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6092:1: ( rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 )
            // InternalKEffects.g:6093:2: rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2
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
    // InternalKEffects.g:6100:1: rule__FunctionCall__Group__1__Impl : ( ( rule__FunctionCall__FunctionNameAssignment_1 ) ) ;
    public final void rule__FunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6104:1: ( ( ( rule__FunctionCall__FunctionNameAssignment_1 ) ) )
            // InternalKEffects.g:6105:1: ( ( rule__FunctionCall__FunctionNameAssignment_1 ) )
            {
            // InternalKEffects.g:6105:1: ( ( rule__FunctionCall__FunctionNameAssignment_1 ) )
            // InternalKEffects.g:6106:1: ( rule__FunctionCall__FunctionNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFunctionNameAssignment_1()); 
            }
            // InternalKEffects.g:6107:1: ( rule__FunctionCall__FunctionNameAssignment_1 )
            // InternalKEffects.g:6107:2: rule__FunctionCall__FunctionNameAssignment_1
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
    // InternalKEffects.g:6117:1: rule__FunctionCall__Group__2 : rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 ;
    public final void rule__FunctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6121:1: ( rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 )
            // InternalKEffects.g:6122:2: rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3
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
    // InternalKEffects.g:6129:1: rule__FunctionCall__Group__2__Impl : ( ( rule__FunctionCall__Alternatives_2 )? ) ;
    public final void rule__FunctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6133:1: ( ( ( rule__FunctionCall__Alternatives_2 )? ) )
            // InternalKEffects.g:6134:1: ( ( rule__FunctionCall__Alternatives_2 )? )
            {
            // InternalKEffects.g:6134:1: ( ( rule__FunctionCall__Alternatives_2 )? )
            // InternalKEffects.g:6135:1: ( rule__FunctionCall__Alternatives_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getAlternatives_2()); 
            }
            // InternalKEffects.g:6136:1: ( rule__FunctionCall__Alternatives_2 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==28||LA50_0==46) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalKEffects.g:6136:2: rule__FunctionCall__Alternatives_2
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
    // InternalKEffects.g:6146:1: rule__FunctionCall__Group__3 : rule__FunctionCall__Group__3__Impl ;
    public final void rule__FunctionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6150:1: ( rule__FunctionCall__Group__3__Impl )
            // InternalKEffects.g:6151:2: rule__FunctionCall__Group__3__Impl
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
    // InternalKEffects.g:6157:1: rule__FunctionCall__Group__3__Impl : ( '>' ) ;
    public final void rule__FunctionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6161:1: ( ( '>' ) )
            // InternalKEffects.g:6162:1: ( '>' )
            {
            // InternalKEffects.g:6162:1: ( '>' )
            // InternalKEffects.g:6163:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGreaterThanSignKeyword_3()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:6184:1: rule__FunctionCall__Group_2_0__0 : rule__FunctionCall__Group_2_0__0__Impl rule__FunctionCall__Group_2_0__1 ;
    public final void rule__FunctionCall__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6188:1: ( rule__FunctionCall__Group_2_0__0__Impl rule__FunctionCall__Group_2_0__1 )
            // InternalKEffects.g:6189:2: rule__FunctionCall__Group_2_0__0__Impl rule__FunctionCall__Group_2_0__1
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
    // InternalKEffects.g:6196:1: rule__FunctionCall__Group_2_0__0__Impl : ( '(' ) ;
    public final void rule__FunctionCall__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6200:1: ( ( '(' ) )
            // InternalKEffects.g:6201:1: ( '(' )
            {
            // InternalKEffects.g:6201:1: ( '(' )
            // InternalKEffects.g:6202:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2_0_0()); 
            }
            match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:6215:1: rule__FunctionCall__Group_2_0__1 : rule__FunctionCall__Group_2_0__1__Impl rule__FunctionCall__Group_2_0__2 ;
    public final void rule__FunctionCall__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6219:1: ( rule__FunctionCall__Group_2_0__1__Impl rule__FunctionCall__Group_2_0__2 )
            // InternalKEffects.g:6220:2: rule__FunctionCall__Group_2_0__1__Impl rule__FunctionCall__Group_2_0__2
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
    // InternalKEffects.g:6227:1: rule__FunctionCall__Group_2_0__1__Impl : ( ( rule__FunctionCall__ParametersAssignment_2_0_1 ) ) ;
    public final void rule__FunctionCall__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6231:1: ( ( ( rule__FunctionCall__ParametersAssignment_2_0_1 ) ) )
            // InternalKEffects.g:6232:1: ( ( rule__FunctionCall__ParametersAssignment_2_0_1 ) )
            {
            // InternalKEffects.g:6232:1: ( ( rule__FunctionCall__ParametersAssignment_2_0_1 ) )
            // InternalKEffects.g:6233:1: ( rule__FunctionCall__ParametersAssignment_2_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getParametersAssignment_2_0_1()); 
            }
            // InternalKEffects.g:6234:1: ( rule__FunctionCall__ParametersAssignment_2_0_1 )
            // InternalKEffects.g:6234:2: rule__FunctionCall__ParametersAssignment_2_0_1
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
    // InternalKEffects.g:6244:1: rule__FunctionCall__Group_2_0__2 : rule__FunctionCall__Group_2_0__2__Impl rule__FunctionCall__Group_2_0__3 ;
    public final void rule__FunctionCall__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6248:1: ( rule__FunctionCall__Group_2_0__2__Impl rule__FunctionCall__Group_2_0__3 )
            // InternalKEffects.g:6249:2: rule__FunctionCall__Group_2_0__2__Impl rule__FunctionCall__Group_2_0__3
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
    // InternalKEffects.g:6256:1: rule__FunctionCall__Group_2_0__2__Impl : ( ( rule__FunctionCall__Group_2_0_2__0 )* ) ;
    public final void rule__FunctionCall__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6260:1: ( ( ( rule__FunctionCall__Group_2_0_2__0 )* ) )
            // InternalKEffects.g:6261:1: ( ( rule__FunctionCall__Group_2_0_2__0 )* )
            {
            // InternalKEffects.g:6261:1: ( ( rule__FunctionCall__Group_2_0_2__0 )* )
            // InternalKEffects.g:6262:1: ( rule__FunctionCall__Group_2_0_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGroup_2_0_2()); 
            }
            // InternalKEffects.g:6263:1: ( rule__FunctionCall__Group_2_0_2__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==50) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalKEffects.g:6263:2: rule__FunctionCall__Group_2_0_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_17);
            	    rule__FunctionCall__Group_2_0_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop51;
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
    // InternalKEffects.g:6273:1: rule__FunctionCall__Group_2_0__3 : rule__FunctionCall__Group_2_0__3__Impl ;
    public final void rule__FunctionCall__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6277:1: ( rule__FunctionCall__Group_2_0__3__Impl )
            // InternalKEffects.g:6278:2: rule__FunctionCall__Group_2_0__3__Impl
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
    // InternalKEffects.g:6284:1: rule__FunctionCall__Group_2_0__3__Impl : ( ')' ) ;
    public final void rule__FunctionCall__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6288:1: ( ( ')' ) )
            // InternalKEffects.g:6289:1: ( ')' )
            {
            // InternalKEffects.g:6289:1: ( ')' )
            // InternalKEffects.g:6290:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_2_0_3()); 
            }
            match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:6311:1: rule__FunctionCall__Group_2_0_2__0 : rule__FunctionCall__Group_2_0_2__0__Impl rule__FunctionCall__Group_2_0_2__1 ;
    public final void rule__FunctionCall__Group_2_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6315:1: ( rule__FunctionCall__Group_2_0_2__0__Impl rule__FunctionCall__Group_2_0_2__1 )
            // InternalKEffects.g:6316:2: rule__FunctionCall__Group_2_0_2__0__Impl rule__FunctionCall__Group_2_0_2__1
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
    // InternalKEffects.g:6323:1: rule__FunctionCall__Group_2_0_2__0__Impl : ( ',' ) ;
    public final void rule__FunctionCall__Group_2_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6327:1: ( ( ',' ) )
            // InternalKEffects.g:6328:1: ( ',' )
            {
            // InternalKEffects.g:6328:1: ( ',' )
            // InternalKEffects.g:6329:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getCommaKeyword_2_0_2_0()); 
            }
            match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:6342:1: rule__FunctionCall__Group_2_0_2__1 : rule__FunctionCall__Group_2_0_2__1__Impl ;
    public final void rule__FunctionCall__Group_2_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6346:1: ( rule__FunctionCall__Group_2_0_2__1__Impl )
            // InternalKEffects.g:6347:2: rule__FunctionCall__Group_2_0_2__1__Impl
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
    // InternalKEffects.g:6353:1: rule__FunctionCall__Group_2_0_2__1__Impl : ( ( rule__FunctionCall__ParametersAssignment_2_0_2_1 ) ) ;
    public final void rule__FunctionCall__Group_2_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6357:1: ( ( ( rule__FunctionCall__ParametersAssignment_2_0_2_1 ) ) )
            // InternalKEffects.g:6358:1: ( ( rule__FunctionCall__ParametersAssignment_2_0_2_1 ) )
            {
            // InternalKEffects.g:6358:1: ( ( rule__FunctionCall__ParametersAssignment_2_0_2_1 ) )
            // InternalKEffects.g:6359:1: ( rule__FunctionCall__ParametersAssignment_2_0_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getParametersAssignment_2_0_2_1()); 
            }
            // InternalKEffects.g:6360:1: ( rule__FunctionCall__ParametersAssignment_2_0_2_1 )
            // InternalKEffects.g:6360:2: rule__FunctionCall__ParametersAssignment_2_0_2_1
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
    // InternalKEffects.g:6374:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6378:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalKEffects.g:6379:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
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
    // InternalKEffects.g:6386:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__Group_0__0 )? ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6390:1: ( ( ( rule__Parameter__Group_0__0 )? ) )
            // InternalKEffects.g:6391:1: ( ( rule__Parameter__Group_0__0 )? )
            {
            // InternalKEffects.g:6391:1: ( ( rule__Parameter__Group_0__0 )? )
            // InternalKEffects.g:6392:1: ( rule__Parameter__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getGroup_0()); 
            }
            // InternalKEffects.g:6393:1: ( rule__Parameter__Group_0__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==19) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==18) ) {
                    alt52=1;
                }
            }
            else if ( (LA52_0==18) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalKEffects.g:6393:2: rule__Parameter__Group_0__0
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
    // InternalKEffects.g:6403:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6407:1: ( rule__Parameter__Group__1__Impl )
            // InternalKEffects.g:6408:2: rule__Parameter__Group__1__Impl
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
    // InternalKEffects.g:6414:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__ExpressionAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6418:1: ( ( ( rule__Parameter__ExpressionAssignment_1 ) ) )
            // InternalKEffects.g:6419:1: ( ( rule__Parameter__ExpressionAssignment_1 ) )
            {
            // InternalKEffects.g:6419:1: ( ( rule__Parameter__ExpressionAssignment_1 ) )
            // InternalKEffects.g:6420:1: ( rule__Parameter__ExpressionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getExpressionAssignment_1()); 
            }
            // InternalKEffects.g:6421:1: ( rule__Parameter__ExpressionAssignment_1 )
            // InternalKEffects.g:6421:2: rule__Parameter__ExpressionAssignment_1
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
    // InternalKEffects.g:6435:1: rule__Parameter__Group_0__0 : rule__Parameter__Group_0__0__Impl rule__Parameter__Group_0__1 ;
    public final void rule__Parameter__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6439:1: ( rule__Parameter__Group_0__0__Impl rule__Parameter__Group_0__1 )
            // InternalKEffects.g:6440:2: rule__Parameter__Group_0__0__Impl rule__Parameter__Group_0__1
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
    // InternalKEffects.g:6447:1: rule__Parameter__Group_0__0__Impl : ( ( rule__Parameter__PureOutputAssignment_0_0 )? ) ;
    public final void rule__Parameter__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6451:1: ( ( ( rule__Parameter__PureOutputAssignment_0_0 )? ) )
            // InternalKEffects.g:6452:1: ( ( rule__Parameter__PureOutputAssignment_0_0 )? )
            {
            // InternalKEffects.g:6452:1: ( ( rule__Parameter__PureOutputAssignment_0_0 )? )
            // InternalKEffects.g:6453:1: ( rule__Parameter__PureOutputAssignment_0_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getPureOutputAssignment_0_0()); 
            }
            // InternalKEffects.g:6454:1: ( rule__Parameter__PureOutputAssignment_0_0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==19) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalKEffects.g:6454:2: rule__Parameter__PureOutputAssignment_0_0
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
    // InternalKEffects.g:6464:1: rule__Parameter__Group_0__1 : rule__Parameter__Group_0__1__Impl ;
    public final void rule__Parameter__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6468:1: ( rule__Parameter__Group_0__1__Impl )
            // InternalKEffects.g:6469:2: rule__Parameter__Group_0__1__Impl
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
    // InternalKEffects.g:6475:1: rule__Parameter__Group_0__1__Impl : ( ( rule__Parameter__CallByReferenceAssignment_0_1 ) ) ;
    public final void rule__Parameter__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6479:1: ( ( ( rule__Parameter__CallByReferenceAssignment_0_1 ) ) )
            // InternalKEffects.g:6480:1: ( ( rule__Parameter__CallByReferenceAssignment_0_1 ) )
            {
            // InternalKEffects.g:6480:1: ( ( rule__Parameter__CallByReferenceAssignment_0_1 ) )
            // InternalKEffects.g:6481:1: ( rule__Parameter__CallByReferenceAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getCallByReferenceAssignment_0_1()); 
            }
            // InternalKEffects.g:6482:1: ( rule__Parameter__CallByReferenceAssignment_0_1 )
            // InternalKEffects.g:6482:2: rule__Parameter__CallByReferenceAssignment_0_1
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
    // InternalKEffects.g:6496:1: rule__TagAnnotation__Group__0 : rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 ;
    public final void rule__TagAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6500:1: ( rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 )
            // InternalKEffects.g:6501:2: rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1
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
    // InternalKEffects.g:6508:1: rule__TagAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TagAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6512:1: ( ( '@' ) )
            // InternalKEffects.g:6513:1: ( '@' )
            {
            // InternalKEffects.g:6513:1: ( '@' )
            // InternalKEffects.g:6514:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:6527:1: rule__TagAnnotation__Group__1 : rule__TagAnnotation__Group__1__Impl ;
    public final void rule__TagAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6531:1: ( rule__TagAnnotation__Group__1__Impl )
            // InternalKEffects.g:6532:2: rule__TagAnnotation__Group__1__Impl
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
    // InternalKEffects.g:6538:1: rule__TagAnnotation__Group__1__Impl : ( ( rule__TagAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TagAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6542:1: ( ( ( rule__TagAnnotation__NameAssignment_1 ) ) )
            // InternalKEffects.g:6543:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            {
            // InternalKEffects.g:6543:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            // InternalKEffects.g:6544:1: ( rule__TagAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKEffects.g:6545:1: ( rule__TagAnnotation__NameAssignment_1 )
            // InternalKEffects.g:6545:2: rule__TagAnnotation__NameAssignment_1
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
    // InternalKEffects.g:6559:1: rule__KeyStringValueAnnotation__Group__0 : rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 ;
    public final void rule__KeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6563:1: ( rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 )
            // InternalKEffects.g:6564:2: rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1
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
    // InternalKEffects.g:6571:1: rule__KeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6575:1: ( ( '@' ) )
            // InternalKEffects.g:6576:1: ( '@' )
            {
            // InternalKEffects.g:6576:1: ( '@' )
            // InternalKEffects.g:6577:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:6590:1: rule__KeyStringValueAnnotation__Group__1 : rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 ;
    public final void rule__KeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6594:1: ( rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 )
            // InternalKEffects.g:6595:2: rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2
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
    // InternalKEffects.g:6602:1: rule__KeyStringValueAnnotation__Group__1__Impl : ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6606:1: ( ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKEffects.g:6607:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKEffects.g:6607:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKEffects.g:6608:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKEffects.g:6609:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            // InternalKEffects.g:6609:2: rule__KeyStringValueAnnotation__NameAssignment_1
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
    // InternalKEffects.g:6619:1: rule__KeyStringValueAnnotation__Group__2 : rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 ;
    public final void rule__KeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6623:1: ( rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 )
            // InternalKEffects.g:6624:2: rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3
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
    // InternalKEffects.g:6631:1: rule__KeyStringValueAnnotation__Group__2__Impl : ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6635:1: ( ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalKEffects.g:6636:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalKEffects.g:6636:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalKEffects.g:6637:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            }
            // InternalKEffects.g:6638:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalKEffects.g:6638:2: rule__KeyStringValueAnnotation__ValuesAssignment_2
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
    // InternalKEffects.g:6648:1: rule__KeyStringValueAnnotation__Group__3 : rule__KeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__KeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6652:1: ( rule__KeyStringValueAnnotation__Group__3__Impl )
            // InternalKEffects.g:6653:2: rule__KeyStringValueAnnotation__Group__3__Impl
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
    // InternalKEffects.g:6659:1: rule__KeyStringValueAnnotation__Group__3__Impl : ( ( rule__KeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__KeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6663:1: ( ( ( rule__KeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalKEffects.g:6664:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalKEffects.g:6664:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )* )
            // InternalKEffects.g:6665:1: ( rule__KeyStringValueAnnotation__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // InternalKEffects.g:6666:1: ( rule__KeyStringValueAnnotation__Group_3__0 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==50) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalKEffects.g:6666:2: rule__KeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_17);
            	    rule__KeyStringValueAnnotation__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop54;
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
    // InternalKEffects.g:6684:1: rule__KeyStringValueAnnotation__Group_3__0 : rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 ;
    public final void rule__KeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6688:1: ( rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 )
            // InternalKEffects.g:6689:2: rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1
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
    // InternalKEffects.g:6696:1: rule__KeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6700:1: ( ( ',' ) )
            // InternalKEffects.g:6701:1: ( ',' )
            {
            // InternalKEffects.g:6701:1: ( ',' )
            // InternalKEffects.g:6702:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            }
            match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:6715:1: rule__KeyStringValueAnnotation__Group_3__1 : rule__KeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__KeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6719:1: ( rule__KeyStringValueAnnotation__Group_3__1__Impl )
            // InternalKEffects.g:6720:2: rule__KeyStringValueAnnotation__Group_3__1__Impl
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
    // InternalKEffects.g:6726:1: rule__KeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6730:1: ( ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalKEffects.g:6731:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalKEffects.g:6731:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalKEffects.g:6732:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            }
            // InternalKEffects.g:6733:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalKEffects.g:6733:2: rule__KeyStringValueAnnotation__ValuesAssignment_3_1
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
    // InternalKEffects.g:6747:1: rule__RestrictedKeyStringValueAnnotation__Group__0 : rule__RestrictedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedKeyStringValueAnnotation__Group__1 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6751:1: ( rule__RestrictedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedKeyStringValueAnnotation__Group__1 )
            // InternalKEffects.g:6752:2: rule__RestrictedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
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
    // InternalKEffects.g:6759:1: rule__RestrictedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6763:1: ( ( '@' ) )
            // InternalKEffects.g:6764:1: ( '@' )
            {
            // InternalKEffects.g:6764:1: ( '@' )
            // InternalKEffects.g:6765:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:6778:1: rule__RestrictedKeyStringValueAnnotation__Group__1 : rule__RestrictedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedKeyStringValueAnnotation__Group__2 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6782:1: ( rule__RestrictedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedKeyStringValueAnnotation__Group__2 )
            // InternalKEffects.g:6783:2: rule__RestrictedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_45);
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
    // InternalKEffects.g:6790:1: rule__RestrictedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6794:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKEffects.g:6795:1: ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKEffects.g:6795:1: ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKEffects.g:6796:1: ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKEffects.g:6797:1: ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKEffects.g:6797:2: rule__RestrictedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKEffects.g:6807:1: rule__RestrictedKeyStringValueAnnotation__Group__2 : rule__RestrictedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedKeyStringValueAnnotation__Group__3 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6811:1: ( rule__RestrictedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedKeyStringValueAnnotation__Group__3 )
            // InternalKEffects.g:6812:2: rule__RestrictedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_44);
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
    // InternalKEffects.g:6819:1: rule__RestrictedKeyStringValueAnnotation__Group__2__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6823:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalKEffects.g:6824:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalKEffects.g:6824:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalKEffects.g:6825:1: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            }
            // InternalKEffects.g:6826:1: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalKEffects.g:6826:2: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2
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
    // InternalKEffects.g:6836:1: rule__RestrictedKeyStringValueAnnotation__Group__3 : rule__RestrictedKeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6840:1: ( rule__RestrictedKeyStringValueAnnotation__Group__3__Impl )
            // InternalKEffects.g:6841:2: rule__RestrictedKeyStringValueAnnotation__Group__3__Impl
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
    // InternalKEffects.g:6847:1: rule__RestrictedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6851:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalKEffects.g:6852:1: ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalKEffects.g:6852:1: ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* )
            // InternalKEffects.g:6853:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // InternalKEffects.g:6854:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==50) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalKEffects.g:6854:2: rule__RestrictedKeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_17);
            	    rule__RestrictedKeyStringValueAnnotation__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop55;
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
    // InternalKEffects.g:6872:1: rule__RestrictedKeyStringValueAnnotation__Group_3__0 : rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl rule__RestrictedKeyStringValueAnnotation__Group_3__1 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6876:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl rule__RestrictedKeyStringValueAnnotation__Group_3__1 )
            // InternalKEffects.g:6877:2: rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl rule__RestrictedKeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_45);
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
    // InternalKEffects.g:6884:1: rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6888:1: ( ( ',' ) )
            // InternalKEffects.g:6889:1: ( ',' )
            {
            // InternalKEffects.g:6889:1: ( ',' )
            // InternalKEffects.g:6890:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            }
            match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:6903:1: rule__RestrictedKeyStringValueAnnotation__Group_3__1 : rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6907:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl )
            // InternalKEffects.g:6908:2: rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl
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
    // InternalKEffects.g:6914:1: rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6918:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalKEffects.g:6919:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalKEffects.g:6919:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalKEffects.g:6920:1: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            }
            // InternalKEffects.g:6921:1: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalKEffects.g:6921:2: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1
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
    // InternalKEffects.g:6935:1: rule__TypedKeyStringValueAnnotation__Group__0 : rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6939:1: ( rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 )
            // InternalKEffects.g:6940:2: rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1
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
    // InternalKEffects.g:6947:1: rule__TypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6951:1: ( ( '@' ) )
            // InternalKEffects.g:6952:1: ( '@' )
            {
            // InternalKEffects.g:6952:1: ( '@' )
            // InternalKEffects.g:6953:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:6966:1: rule__TypedKeyStringValueAnnotation__Group__1 : rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6970:1: ( rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 )
            // InternalKEffects.g:6971:2: rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_46);
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
    // InternalKEffects.g:6978:1: rule__TypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6982:1: ( ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKEffects.g:6983:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKEffects.g:6983:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKEffects.g:6984:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKEffects.g:6985:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKEffects.g:6985:2: rule__TypedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKEffects.g:6995:1: rule__TypedKeyStringValueAnnotation__Group__2 : rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:6999:1: ( rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 )
            // InternalKEffects.g:7000:2: rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3
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
    // InternalKEffects.g:7007:1: rule__TypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7011:1: ( ( '[' ) )
            // InternalKEffects.g:7012:1: ( '[' )
            {
            // InternalKEffects.g:7012:1: ( '[' )
            // InternalKEffects.g:7013:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:7026:1: rule__TypedKeyStringValueAnnotation__Group__3 : rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7030:1: ( rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 )
            // InternalKEffects.g:7031:2: rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4
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
    // InternalKEffects.g:7038:1: rule__TypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7042:1: ( ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalKEffects.g:7043:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalKEffects.g:7043:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalKEffects.g:7044:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // InternalKEffects.g:7045:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalKEffects.g:7045:2: rule__TypedKeyStringValueAnnotation__TypeAssignment_3
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
    // InternalKEffects.g:7055:1: rule__TypedKeyStringValueAnnotation__Group__4 : rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7059:1: ( rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 )
            // InternalKEffects.g:7060:2: rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5
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
    // InternalKEffects.g:7067:1: rule__TypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7071:1: ( ( ']' ) )
            // InternalKEffects.g:7072:1: ( ']' )
            {
            // InternalKEffects.g:7072:1: ( ']' )
            // InternalKEffects.g:7073:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:7086:1: rule__TypedKeyStringValueAnnotation__Group__5 : rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7090:1: ( rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 )
            // InternalKEffects.g:7091:2: rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6
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
    // InternalKEffects.g:7098:1: rule__TypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7102:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalKEffects.g:7103:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalKEffects.g:7103:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalKEffects.g:7104:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            }
            // InternalKEffects.g:7105:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalKEffects.g:7105:2: rule__TypedKeyStringValueAnnotation__ValuesAssignment_5
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
    // InternalKEffects.g:7115:1: rule__TypedKeyStringValueAnnotation__Group__6 : rule__TypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7119:1: ( rule__TypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalKEffects.g:7120:2: rule__TypedKeyStringValueAnnotation__Group__6__Impl
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
    // InternalKEffects.g:7126:1: rule__TypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7130:1: ( ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalKEffects.g:7131:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalKEffects.g:7131:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalKEffects.g:7132:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // InternalKEffects.g:7133:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==50) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalKEffects.g:7133:2: rule__TypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_17);
            	    rule__TypedKeyStringValueAnnotation__Group_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop56;
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
    // InternalKEffects.g:7157:1: rule__TypedKeyStringValueAnnotation__Group_6__0 : rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7161:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 )
            // InternalKEffects.g:7162:2: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1
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
    // InternalKEffects.g:7169:1: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7173:1: ( ( ',' ) )
            // InternalKEffects.g:7174:1: ( ',' )
            {
            // InternalKEffects.g:7174:1: ( ',' )
            // InternalKEffects.g:7175:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            }
            match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:7188:1: rule__TypedKeyStringValueAnnotation__Group_6__1 : rule__TypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7192:1: ( rule__TypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalKEffects.g:7193:2: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl
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
    // InternalKEffects.g:7199:1: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7203:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalKEffects.g:7204:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalKEffects.g:7204:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalKEffects.g:7205:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            }
            // InternalKEffects.g:7206:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalKEffects.g:7206:2: rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1
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
    // InternalKEffects.g:7220:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__0 : rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7224:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__1 )
            // InternalKEffects.g:7225:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
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
    // InternalKEffects.g:7232:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7236:1: ( ( '@' ) )
            // InternalKEffects.g:7237:1: ( '@' )
            {
            // InternalKEffects.g:7237:1: ( '@' )
            // InternalKEffects.g:7238:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:7251:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__1 : rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7255:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__2 )
            // InternalKEffects.g:7256:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_46);
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
    // InternalKEffects.g:7263:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7267:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKEffects.g:7268:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKEffects.g:7268:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKEffects.g:7269:1: ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKEffects.g:7270:1: ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKEffects.g:7270:2: rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKEffects.g:7280:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__2 : rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7284:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__3 )
            // InternalKEffects.g:7285:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_3);
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
    // InternalKEffects.g:7292:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7296:1: ( ( '[' ) )
            // InternalKEffects.g:7297:1: ( '[' )
            {
            // InternalKEffects.g:7297:1: ( '[' )
            // InternalKEffects.g:7298:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:7311:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__3 : rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7315:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__4 )
            // InternalKEffects.g:7316:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_10);
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
    // InternalKEffects.g:7323:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7327:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalKEffects.g:7328:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalKEffects.g:7328:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalKEffects.g:7329:1: ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // InternalKEffects.g:7330:1: ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalKEffects.g:7330:2: rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3
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
    // InternalKEffects.g:7340:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__4 : rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7344:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__5 )
            // InternalKEffects.g:7345:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_45);
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
    // InternalKEffects.g:7352:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7356:1: ( ( ']' ) )
            // InternalKEffects.g:7357:1: ( ']' )
            {
            // InternalKEffects.g:7357:1: ( ']' )
            // InternalKEffects.g:7358:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:7371:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__5 : rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7375:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__6 )
            // InternalKEffects.g:7376:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_44);
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
    // InternalKEffects.g:7383:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7387:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalKEffects.g:7388:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalKEffects.g:7388:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalKEffects.g:7389:1: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            }
            // InternalKEffects.g:7390:1: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalKEffects.g:7390:2: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5
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
    // InternalKEffects.g:7400:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__6 : rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7404:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalKEffects.g:7405:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl
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
    // InternalKEffects.g:7411:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7415:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalKEffects.g:7416:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalKEffects.g:7416:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalKEffects.g:7417:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // InternalKEffects.g:7418:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==50) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalKEffects.g:7418:2: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_17);
            	    rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop57;
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
    // InternalKEffects.g:7442:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 : rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7446:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1 )
            // InternalKEffects.g:7447:2: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_45);
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
    // InternalKEffects.g:7454:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7458:1: ( ( ',' ) )
            // InternalKEffects.g:7459:1: ( ',' )
            {
            // InternalKEffects.g:7459:1: ( ',' )
            // InternalKEffects.g:7460:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            }
            match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:7473:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1 : rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7477:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalKEffects.g:7478:2: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl
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
    // InternalKEffects.g:7484:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7488:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalKEffects.g:7489:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalKEffects.g:7489:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalKEffects.g:7490:1: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            }
            // InternalKEffects.g:7491:1: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalKEffects.g:7491:2: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1
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
    // InternalKEffects.g:7505:1: rule__QuotedKeyStringValueAnnotation__Group__0 : rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7509:1: ( rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1 )
            // InternalKEffects.g:7510:2: rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1
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
    // InternalKEffects.g:7517:1: rule__QuotedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7521:1: ( ( '@' ) )
            // InternalKEffects.g:7522:1: ( '@' )
            {
            // InternalKEffects.g:7522:1: ( '@' )
            // InternalKEffects.g:7523:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:7536:1: rule__QuotedKeyStringValueAnnotation__Group__1 : rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7540:1: ( rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2 )
            // InternalKEffects.g:7541:2: rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_47);
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
    // InternalKEffects.g:7548:1: rule__QuotedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7552:1: ( ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKEffects.g:7553:1: ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKEffects.g:7553:1: ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKEffects.g:7554:1: ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKEffects.g:7555:1: ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKEffects.g:7555:2: rule__QuotedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKEffects.g:7565:1: rule__QuotedKeyStringValueAnnotation__Group__2 : rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7569:1: ( rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3 )
            // InternalKEffects.g:7570:2: rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3
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
    // InternalKEffects.g:7577:1: rule__QuotedKeyStringValueAnnotation__Group__2__Impl : ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7581:1: ( ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalKEffects.g:7582:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalKEffects.g:7582:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalKEffects.g:7583:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            }
            // InternalKEffects.g:7584:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalKEffects.g:7584:2: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2
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
    // InternalKEffects.g:7594:1: rule__QuotedKeyStringValueAnnotation__Group__3 : rule__QuotedKeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7598:1: ( rule__QuotedKeyStringValueAnnotation__Group__3__Impl )
            // InternalKEffects.g:7599:2: rule__QuotedKeyStringValueAnnotation__Group__3__Impl
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
    // InternalKEffects.g:7605:1: rule__QuotedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7609:1: ( ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalKEffects.g:7610:1: ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalKEffects.g:7610:1: ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* )
            // InternalKEffects.g:7611:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // InternalKEffects.g:7612:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==50) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalKEffects.g:7612:2: rule__QuotedKeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_17);
            	    rule__QuotedKeyStringValueAnnotation__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop58;
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
    // InternalKEffects.g:7630:1: rule__QuotedKeyStringValueAnnotation__Group_3__0 : rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7634:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1 )
            // InternalKEffects.g:7635:2: rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_47);
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
    // InternalKEffects.g:7642:1: rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7646:1: ( ( ',' ) )
            // InternalKEffects.g:7647:1: ( ',' )
            {
            // InternalKEffects.g:7647:1: ( ',' )
            // InternalKEffects.g:7648:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            }
            match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:7661:1: rule__QuotedKeyStringValueAnnotation__Group_3__1 : rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7665:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl )
            // InternalKEffects.g:7666:2: rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl
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
    // InternalKEffects.g:7672:1: rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7676:1: ( ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalKEffects.g:7677:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalKEffects.g:7677:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalKEffects.g:7678:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            }
            // InternalKEffects.g:7679:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalKEffects.g:7679:2: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1
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
    // InternalKEffects.g:7693:1: rule__QuotedTypedKeyStringValueAnnotation__Group__0 : rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7697:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1 )
            // InternalKEffects.g:7698:2: rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1
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
    // InternalKEffects.g:7705:1: rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7709:1: ( ( '@' ) )
            // InternalKEffects.g:7710:1: ( '@' )
            {
            // InternalKEffects.g:7710:1: ( '@' )
            // InternalKEffects.g:7711:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:7724:1: rule__QuotedTypedKeyStringValueAnnotation__Group__1 : rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7728:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2 )
            // InternalKEffects.g:7729:2: rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_46);
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
    // InternalKEffects.g:7736:1: rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7740:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKEffects.g:7741:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKEffects.g:7741:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKEffects.g:7742:1: ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKEffects.g:7743:1: ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKEffects.g:7743:2: rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKEffects.g:7753:1: rule__QuotedTypedKeyStringValueAnnotation__Group__2 : rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7757:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3 )
            // InternalKEffects.g:7758:2: rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3
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
    // InternalKEffects.g:7765:1: rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7769:1: ( ( '[' ) )
            // InternalKEffects.g:7770:1: ( '[' )
            {
            // InternalKEffects.g:7770:1: ( '[' )
            // InternalKEffects.g:7771:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:7784:1: rule__QuotedTypedKeyStringValueAnnotation__Group__3 : rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7788:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4 )
            // InternalKEffects.g:7789:2: rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4
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
    // InternalKEffects.g:7796:1: rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7800:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalKEffects.g:7801:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalKEffects.g:7801:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalKEffects.g:7802:1: ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // InternalKEffects.g:7803:1: ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalKEffects.g:7803:2: rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3
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
    // InternalKEffects.g:7813:1: rule__QuotedTypedKeyStringValueAnnotation__Group__4 : rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7817:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5 )
            // InternalKEffects.g:7818:2: rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_47);
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
    // InternalKEffects.g:7825:1: rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7829:1: ( ( ']' ) )
            // InternalKEffects.g:7830:1: ( ']' )
            {
            // InternalKEffects.g:7830:1: ( ']' )
            // InternalKEffects.g:7831:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:7844:1: rule__QuotedTypedKeyStringValueAnnotation__Group__5 : rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7848:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6 )
            // InternalKEffects.g:7849:2: rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6
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
    // InternalKEffects.g:7856:1: rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7860:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalKEffects.g:7861:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalKEffects.g:7861:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalKEffects.g:7862:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            }
            // InternalKEffects.g:7863:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalKEffects.g:7863:2: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5
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
    // InternalKEffects.g:7873:1: rule__QuotedTypedKeyStringValueAnnotation__Group__6 : rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7877:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalKEffects.g:7878:2: rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl
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
    // InternalKEffects.g:7884:1: rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7888:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalKEffects.g:7889:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalKEffects.g:7889:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalKEffects.g:7890:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // InternalKEffects.g:7891:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==50) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalKEffects.g:7891:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_17);
            	    rule__QuotedTypedKeyStringValueAnnotation__Group_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop59;
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
    // InternalKEffects.g:7915:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 : rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7919:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 )
            // InternalKEffects.g:7920:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_47);
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
    // InternalKEffects.g:7927:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7931:1: ( ( ',' ) )
            // InternalKEffects.g:7932:1: ( ',' )
            {
            // InternalKEffects.g:7932:1: ( ',' )
            // InternalKEffects.g:7933:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            }
            match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:7946:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 : rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7950:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalKEffects.g:7951:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl
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
    // InternalKEffects.g:7957:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7961:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalKEffects.g:7962:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalKEffects.g:7962:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalKEffects.g:7963:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            }
            // InternalKEffects.g:7964:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalKEffects.g:7964:2: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1
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
    // InternalKEffects.g:7978:1: rule__ExtendedID__Group__0 : rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 ;
    public final void rule__ExtendedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7982:1: ( rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 )
            // InternalKEffects.g:7983:2: rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1
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
    // InternalKEffects.g:7990:1: rule__ExtendedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:7994:1: ( ( RULE_ID ) )
            // InternalKEffects.g:7995:1: ( RULE_ID )
            {
            // InternalKEffects.g:7995:1: ( RULE_ID )
            // InternalKEffects.g:7996:1: RULE_ID
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
    // InternalKEffects.g:8007:1: rule__ExtendedID__Group__1 : rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2 ;
    public final void rule__ExtendedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8011:1: ( rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2 )
            // InternalKEffects.g:8012:2: rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2
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
    // InternalKEffects.g:8019:1: rule__ExtendedID__Group__1__Impl : ( ( rule__ExtendedID__Group_1__0 )* ) ;
    public final void rule__ExtendedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8023:1: ( ( ( rule__ExtendedID__Group_1__0 )* ) )
            // InternalKEffects.g:8024:1: ( ( rule__ExtendedID__Group_1__0 )* )
            {
            // InternalKEffects.g:8024:1: ( ( rule__ExtendedID__Group_1__0 )* )
            // InternalKEffects.g:8025:1: ( rule__ExtendedID__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup_1()); 
            }
            // InternalKEffects.g:8026:1: ( rule__ExtendedID__Group_1__0 )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==51) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalKEffects.g:8026:2: rule__ExtendedID__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_49);
            	    rule__ExtendedID__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop60;
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
    // InternalKEffects.g:8036:1: rule__ExtendedID__Group__2 : rule__ExtendedID__Group__2__Impl ;
    public final void rule__ExtendedID__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8040:1: ( rule__ExtendedID__Group__2__Impl )
            // InternalKEffects.g:8041:2: rule__ExtendedID__Group__2__Impl
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
    // InternalKEffects.g:8047:1: rule__ExtendedID__Group__2__Impl : ( ( rule__ExtendedID__Group_2__0 )? ) ;
    public final void rule__ExtendedID__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8051:1: ( ( ( rule__ExtendedID__Group_2__0 )? ) )
            // InternalKEffects.g:8052:1: ( ( rule__ExtendedID__Group_2__0 )? )
            {
            // InternalKEffects.g:8052:1: ( ( rule__ExtendedID__Group_2__0 )? )
            // InternalKEffects.g:8053:1: ( rule__ExtendedID__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup_2()); 
            }
            // InternalKEffects.g:8054:1: ( rule__ExtendedID__Group_2__0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==53) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalKEffects.g:8054:2: rule__ExtendedID__Group_2__0
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
    // InternalKEffects.g:8070:1: rule__ExtendedID__Group_1__0 : rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 ;
    public final void rule__ExtendedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8074:1: ( rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 )
            // InternalKEffects.g:8075:2: rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1
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
    // InternalKEffects.g:8082:1: rule__ExtendedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__ExtendedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8086:1: ( ( '.' ) )
            // InternalKEffects.g:8087:1: ( '.' )
            {
            // InternalKEffects.g:8087:1: ( '.' )
            // InternalKEffects.g:8088:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            }
            match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:8101:1: rule__ExtendedID__Group_1__1 : rule__ExtendedID__Group_1__1__Impl ;
    public final void rule__ExtendedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8105:1: ( rule__ExtendedID__Group_1__1__Impl )
            // InternalKEffects.g:8106:2: rule__ExtendedID__Group_1__1__Impl
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
    // InternalKEffects.g:8112:1: rule__ExtendedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8116:1: ( ( RULE_ID ) )
            // InternalKEffects.g:8117:1: ( RULE_ID )
            {
            // InternalKEffects.g:8117:1: ( RULE_ID )
            // InternalKEffects.g:8118:1: RULE_ID
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
    // InternalKEffects.g:8133:1: rule__ExtendedID__Group_2__0 : rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1 ;
    public final void rule__ExtendedID__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8137:1: ( rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1 )
            // InternalKEffects.g:8138:2: rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1
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
    // InternalKEffects.g:8145:1: rule__ExtendedID__Group_2__0__Impl : ( '#' ) ;
    public final void rule__ExtendedID__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8149:1: ( ( '#' ) )
            // InternalKEffects.g:8150:1: ( '#' )
            {
            // InternalKEffects.g:8150:1: ( '#' )
            // InternalKEffects.g:8151:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getNumberSignKeyword_2_0()); 
            }
            match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKEffects.g:8164:1: rule__ExtendedID__Group_2__1 : rule__ExtendedID__Group_2__1__Impl ;
    public final void rule__ExtendedID__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8168:1: ( rule__ExtendedID__Group_2__1__Impl )
            // InternalKEffects.g:8169:2: rule__ExtendedID__Group_2__1__Impl
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
    // InternalKEffects.g:8175:1: rule__ExtendedID__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__ExtendedID__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8179:1: ( ( RULE_INT ) )
            // InternalKEffects.g:8180:1: ( RULE_INT )
            {
            // InternalKEffects.g:8180:1: ( RULE_INT )
            // InternalKEffects.g:8181:1: RULE_INT
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
    // InternalKEffects.g:8198:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8202:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // InternalKEffects.g:8203:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
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
    // InternalKEffects.g:8210:1: rule__Integer__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8214:1: ( ( ( '-' )? ) )
            // InternalKEffects.g:8215:1: ( ( '-' )? )
            {
            // InternalKEffects.g:8215:1: ( ( '-' )? )
            // InternalKEffects.g:8216:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalKEffects.g:8217:1: ( '-' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==21) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalKEffects.g:8218:2: '-'
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
    // InternalKEffects.g:8229:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8233:1: ( rule__Integer__Group__1__Impl )
            // InternalKEffects.g:8234:2: rule__Integer__Group__1__Impl
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
    // InternalKEffects.g:8240:1: rule__Integer__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8244:1: ( ( RULE_INT ) )
            // InternalKEffects.g:8245:1: ( RULE_INT )
            {
            // InternalKEffects.g:8245:1: ( RULE_INT )
            // InternalKEffects.g:8246:1: RULE_INT
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
    // InternalKEffects.g:8261:1: rule__Floateger__Group__0 : rule__Floateger__Group__0__Impl rule__Floateger__Group__1 ;
    public final void rule__Floateger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8265:1: ( rule__Floateger__Group__0__Impl rule__Floateger__Group__1 )
            // InternalKEffects.g:8266:2: rule__Floateger__Group__0__Impl rule__Floateger__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_43);
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
    // InternalKEffects.g:8273:1: rule__Floateger__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Floateger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8277:1: ( ( ( '-' )? ) )
            // InternalKEffects.g:8278:1: ( ( '-' )? )
            {
            // InternalKEffects.g:8278:1: ( ( '-' )? )
            // InternalKEffects.g:8279:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloategerAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalKEffects.g:8280:1: ( '-' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==21) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalKEffects.g:8281:2: '-'
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
    // InternalKEffects.g:8292:1: rule__Floateger__Group__1 : rule__Floateger__Group__1__Impl ;
    public final void rule__Floateger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8296:1: ( rule__Floateger__Group__1__Impl )
            // InternalKEffects.g:8297:2: rule__Floateger__Group__1__Impl
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
    // InternalKEffects.g:8303:1: rule__Floateger__Group__1__Impl : ( RULE_FLOAT ) ;
    public final void rule__Floateger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8307:1: ( ( RULE_FLOAT ) )
            // InternalKEffects.g:8308:1: ( RULE_FLOAT )
            {
            // InternalKEffects.g:8308:1: ( RULE_FLOAT )
            // InternalKEffects.g:8309:1: RULE_FLOAT
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
    // InternalKEffects.g:8325:1: rule__Emission__AnnotationsAssignment_0 : ( ruleQuotedStringAnnotation ) ;
    public final void rule__Emission__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8329:1: ( ( ruleQuotedStringAnnotation ) )
            // InternalKEffects.g:8330:1: ( ruleQuotedStringAnnotation )
            {
            // InternalKEffects.g:8330:1: ( ruleQuotedStringAnnotation )
            // InternalKEffects.g:8331:1: ruleQuotedStringAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getAnnotationsQuotedStringAnnotationParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleQuotedStringAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getAnnotationsQuotedStringAnnotationParserRuleCall_0_0()); 
            }

            }


            }

        }
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
    // InternalKEffects.g:8340:1: rule__Emission__ValuedObjectAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Emission__ValuedObjectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8344:1: ( ( ( RULE_ID ) ) )
            // InternalKEffects.g:8345:1: ( ( RULE_ID ) )
            {
            // InternalKEffects.g:8345:1: ( ( RULE_ID ) )
            // InternalKEffects.g:8346:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
            }
            // InternalKEffects.g:8347:1: ( RULE_ID )
            // InternalKEffects.g:8348:1: RULE_ID
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
    // InternalKEffects.g:8359:1: rule__Emission__NewValueAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__Emission__NewValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8363:1: ( ( ruleExpression ) )
            // InternalKEffects.g:8364:1: ( ruleExpression )
            {
            // InternalKEffects.g:8364:1: ( ruleExpression )
            // InternalKEffects.g:8365:1: ruleExpression
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
    // InternalKEffects.g:8374:1: rule__Assignment__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Assignment__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8378:1: ( ( ruleAnnotation ) )
            // InternalKEffects.g:8379:1: ( ruleAnnotation )
            {
            // InternalKEffects.g:8379:1: ( ruleAnnotation )
            // InternalKEffects.g:8380:1: ruleAnnotation
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
    // InternalKEffects.g:8389:1: rule__Assignment__ValuedObjectAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Assignment__ValuedObjectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8393:1: ( ( ( RULE_ID ) ) )
            // InternalKEffects.g:8394:1: ( ( RULE_ID ) )
            {
            // InternalKEffects.g:8394:1: ( ( RULE_ID ) )
            // InternalKEffects.g:8395:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
            }
            // InternalKEffects.g:8396:1: ( RULE_ID )
            // InternalKEffects.g:8397:1: RULE_ID
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
    // InternalKEffects.g:8408:1: rule__Assignment__IndicesAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__Assignment__IndicesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8412:1: ( ( ruleExpression ) )
            // InternalKEffects.g:8413:1: ( ruleExpression )
            {
            // InternalKEffects.g:8413:1: ( ruleExpression )
            // InternalKEffects.g:8414:1: ruleExpression
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
    // InternalKEffects.g:8423:1: rule__Assignment__OperatorAssignment_3 : ( ruleAssignOperator ) ;
    public final void rule__Assignment__OperatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8427:1: ( ( ruleAssignOperator ) )
            // InternalKEffects.g:8428:1: ( ruleAssignOperator )
            {
            // InternalKEffects.g:8428:1: ( ruleAssignOperator )
            // InternalKEffects.g:8429:1: ruleAssignOperator
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
    // InternalKEffects.g:8438:1: rule__Assignment__ExpressionAssignment_4 : ( ruleExpression ) ;
    public final void rule__Assignment__ExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8442:1: ( ( ruleExpression ) )
            // InternalKEffects.g:8443:1: ( ruleExpression )
            {
            // InternalKEffects.g:8443:1: ( ruleExpression )
            // InternalKEffects.g:8444:1: ruleExpression
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
    // InternalKEffects.g:8453:1: rule__PostfixEffect__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__PostfixEffect__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8457:1: ( ( ruleAnnotation ) )
            // InternalKEffects.g:8458:1: ( ruleAnnotation )
            {
            // InternalKEffects.g:8458:1: ( ruleAnnotation )
            // InternalKEffects.g:8459:1: ruleAnnotation
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
    // InternalKEffects.g:8468:1: rule__PostfixEffect__ValuedObjectAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__PostfixEffect__ValuedObjectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8472:1: ( ( ( RULE_ID ) ) )
            // InternalKEffects.g:8473:1: ( ( RULE_ID ) )
            {
            // InternalKEffects.g:8473:1: ( ( RULE_ID ) )
            // InternalKEffects.g:8474:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPostfixEffectAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
            }
            // InternalKEffects.g:8475:1: ( RULE_ID )
            // InternalKEffects.g:8476:1: RULE_ID
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
    // InternalKEffects.g:8487:1: rule__PostfixEffect__IndicesAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__PostfixEffect__IndicesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8491:1: ( ( ruleExpression ) )
            // InternalKEffects.g:8492:1: ( ruleExpression )
            {
            // InternalKEffects.g:8492:1: ( ruleExpression )
            // InternalKEffects.g:8493:1: ruleExpression
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
    // InternalKEffects.g:8502:1: rule__PostfixEffect__OperatorAssignment_3 : ( rulePostfixOperator ) ;
    public final void rule__PostfixEffect__OperatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8506:1: ( ( rulePostfixOperator ) )
            // InternalKEffects.g:8507:1: ( rulePostfixOperator )
            {
            // InternalKEffects.g:8507:1: ( rulePostfixOperator )
            // InternalKEffects.g:8508:1: rulePostfixOperator
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
    // InternalKEffects.g:8517:1: rule__HostcodeEffect__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__HostcodeEffect__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8521:1: ( ( ruleAnnotation ) )
            // InternalKEffects.g:8522:1: ( ruleAnnotation )
            {
            // InternalKEffects.g:8522:1: ( ruleAnnotation )
            // InternalKEffects.g:8523:1: ruleAnnotation
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
    // InternalKEffects.g:8532:1: rule__HostcodeEffect__TextAssignment_1 : ( RULE_HOSTCODE ) ;
    public final void rule__HostcodeEffect__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8536:1: ( ( RULE_HOSTCODE ) )
            // InternalKEffects.g:8537:1: ( RULE_HOSTCODE )
            {
            // InternalKEffects.g:8537:1: ( RULE_HOSTCODE )
            // InternalKEffects.g:8538:1: RULE_HOSTCODE
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
    // InternalKEffects.g:8547:1: rule__FunctionCallEffect__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__FunctionCallEffect__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8551:1: ( ( ruleAnnotation ) )
            // InternalKEffects.g:8552:1: ( ruleAnnotation )
            {
            // InternalKEffects.g:8552:1: ( ruleAnnotation )
            // InternalKEffects.g:8553:1: ruleAnnotation
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
    // InternalKEffects.g:8562:1: rule__FunctionCallEffect__FunctionNameAssignment_2 : ( ruleExtendedID ) ;
    public final void rule__FunctionCallEffect__FunctionNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8566:1: ( ( ruleExtendedID ) )
            // InternalKEffects.g:8567:1: ( ruleExtendedID )
            {
            // InternalKEffects.g:8567:1: ( ruleExtendedID )
            // InternalKEffects.g:8568:1: ruleExtendedID
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
    // InternalKEffects.g:8577:1: rule__FunctionCallEffect__ParametersAssignment_3_0_1 : ( ruleParameter ) ;
    public final void rule__FunctionCallEffect__ParametersAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8581:1: ( ( ruleParameter ) )
            // InternalKEffects.g:8582:1: ( ruleParameter )
            {
            // InternalKEffects.g:8582:1: ( ruleParameter )
            // InternalKEffects.g:8583:1: ruleParameter
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
    // InternalKEffects.g:8592:1: rule__FunctionCallEffect__ParametersAssignment_3_0_2_1 : ( ruleParameter ) ;
    public final void rule__FunctionCallEffect__ParametersAssignment_3_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8596:1: ( ( ruleParameter ) )
            // InternalKEffects.g:8597:1: ( ruleParameter )
            {
            // InternalKEffects.g:8597:1: ( ruleParameter )
            // InternalKEffects.g:8598:1: ruleParameter
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
    // InternalKEffects.g:8607:1: rule__LogicalOrExpression__OperatorAssignment_1_1_0 : ( ruleLogicalOrOperator ) ;
    public final void rule__LogicalOrExpression__OperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8611:1: ( ( ruleLogicalOrOperator ) )
            // InternalKEffects.g:8612:1: ( ruleLogicalOrOperator )
            {
            // InternalKEffects.g:8612:1: ( ruleLogicalOrOperator )
            // InternalKEffects.g:8613:1: ruleLogicalOrOperator
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
    // InternalKEffects.g:8622:1: rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1 : ( ruleLogicalAndExpression ) ;
    public final void rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8626:1: ( ( ruleLogicalAndExpression ) )
            // InternalKEffects.g:8627:1: ( ruleLogicalAndExpression )
            {
            // InternalKEffects.g:8627:1: ( ruleLogicalAndExpression )
            // InternalKEffects.g:8628:1: ruleLogicalAndExpression
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
    // InternalKEffects.g:8637:1: rule__LogicalAndExpression__OperatorAssignment_1_1_0 : ( ruleLogicalAndOperator ) ;
    public final void rule__LogicalAndExpression__OperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8641:1: ( ( ruleLogicalAndOperator ) )
            // InternalKEffects.g:8642:1: ( ruleLogicalAndOperator )
            {
            // InternalKEffects.g:8642:1: ( ruleLogicalAndOperator )
            // InternalKEffects.g:8643:1: ruleLogicalAndOperator
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
    // InternalKEffects.g:8652:1: rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1 : ( ruleBitwiseOrExpression ) ;
    public final void rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8656:1: ( ( ruleBitwiseOrExpression ) )
            // InternalKEffects.g:8657:1: ( ruleBitwiseOrExpression )
            {
            // InternalKEffects.g:8657:1: ( ruleBitwiseOrExpression )
            // InternalKEffects.g:8658:1: ruleBitwiseOrExpression
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
    // InternalKEffects.g:8667:1: rule__BitwiseOrExpression__OperatorAssignment_1_1_0 : ( ruleBitwiseOrOperator ) ;
    public final void rule__BitwiseOrExpression__OperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8671:1: ( ( ruleBitwiseOrOperator ) )
            // InternalKEffects.g:8672:1: ( ruleBitwiseOrOperator )
            {
            // InternalKEffects.g:8672:1: ( ruleBitwiseOrOperator )
            // InternalKEffects.g:8673:1: ruleBitwiseOrOperator
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
    // InternalKEffects.g:8682:1: rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1 : ( ruleBitwiseAndExpression ) ;
    public final void rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8686:1: ( ( ruleBitwiseAndExpression ) )
            // InternalKEffects.g:8687:1: ( ruleBitwiseAndExpression )
            {
            // InternalKEffects.g:8687:1: ( ruleBitwiseAndExpression )
            // InternalKEffects.g:8688:1: ruleBitwiseAndExpression
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
    // InternalKEffects.g:8697:1: rule__BitwiseAndExpression__OperatorAssignment_1_1_0 : ( ruleBitwiseAndOperator ) ;
    public final void rule__BitwiseAndExpression__OperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8701:1: ( ( ruleBitwiseAndOperator ) )
            // InternalKEffects.g:8702:1: ( ruleBitwiseAndOperator )
            {
            // InternalKEffects.g:8702:1: ( ruleBitwiseAndOperator )
            // InternalKEffects.g:8703:1: ruleBitwiseAndOperator
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
    // InternalKEffects.g:8712:1: rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1 : ( ruleCompareOperation ) ;
    public final void rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8716:1: ( ( ruleCompareOperation ) )
            // InternalKEffects.g:8717:1: ( ruleCompareOperation )
            {
            // InternalKEffects.g:8717:1: ( ruleCompareOperation )
            // InternalKEffects.g:8718:1: ruleCompareOperation
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
    // InternalKEffects.g:8727:1: rule__CompareOperation__OperatorAssignment_1_1 : ( ruleCompareOperator ) ;
    public final void rule__CompareOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8731:1: ( ( ruleCompareOperator ) )
            // InternalKEffects.g:8732:1: ( ruleCompareOperator )
            {
            // InternalKEffects.g:8732:1: ( ruleCompareOperator )
            // InternalKEffects.g:8733:1: ruleCompareOperator
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
    // InternalKEffects.g:8742:1: rule__CompareOperation__SubExpressionsAssignment_1_2 : ( ruleNotOrValuedExpression ) ;
    public final void rule__CompareOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8746:1: ( ( ruleNotOrValuedExpression ) )
            // InternalKEffects.g:8747:1: ( ruleNotOrValuedExpression )
            {
            // InternalKEffects.g:8747:1: ( ruleNotOrValuedExpression )
            // InternalKEffects.g:8748:1: ruleNotOrValuedExpression
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
    // InternalKEffects.g:8757:1: rule__NotExpression__OperatorAssignment_0_1 : ( ruleNotOperator ) ;
    public final void rule__NotExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8761:1: ( ( ruleNotOperator ) )
            // InternalKEffects.g:8762:1: ( ruleNotOperator )
            {
            // InternalKEffects.g:8762:1: ( ruleNotOperator )
            // InternalKEffects.g:8763:1: ruleNotOperator
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
    // InternalKEffects.g:8772:1: rule__NotExpression__SubExpressionsAssignment_0_2 : ( ruleNotExpression ) ;
    public final void rule__NotExpression__SubExpressionsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8776:1: ( ( ruleNotExpression ) )
            // InternalKEffects.g:8777:1: ( ruleNotExpression )
            {
            // InternalKEffects.g:8777:1: ( ruleNotExpression )
            // InternalKEffects.g:8778:1: ruleNotExpression
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
    // InternalKEffects.g:8787:1: rule__AddExpression__OperatorAssignment_1_1_0 : ( ruleAddOperator ) ;
    public final void rule__AddExpression__OperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8791:1: ( ( ruleAddOperator ) )
            // InternalKEffects.g:8792:1: ( ruleAddOperator )
            {
            // InternalKEffects.g:8792:1: ( ruleAddOperator )
            // InternalKEffects.g:8793:1: ruleAddOperator
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
    // InternalKEffects.g:8802:1: rule__AddExpression__SubExpressionsAssignment_1_1_1 : ( ruleSubExpression ) ;
    public final void rule__AddExpression__SubExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8806:1: ( ( ruleSubExpression ) )
            // InternalKEffects.g:8807:1: ( ruleSubExpression )
            {
            // InternalKEffects.g:8807:1: ( ruleSubExpression )
            // InternalKEffects.g:8808:1: ruleSubExpression
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
    // InternalKEffects.g:8817:1: rule__SubExpression__OperatorAssignment_1_1_0 : ( ruleSubOperator ) ;
    public final void rule__SubExpression__OperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8821:1: ( ( ruleSubOperator ) )
            // InternalKEffects.g:8822:1: ( ruleSubOperator )
            {
            // InternalKEffects.g:8822:1: ( ruleSubOperator )
            // InternalKEffects.g:8823:1: ruleSubOperator
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
    // InternalKEffects.g:8832:1: rule__SubExpression__SubExpressionsAssignment_1_1_1 : ( ruleMultExpression ) ;
    public final void rule__SubExpression__SubExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8836:1: ( ( ruleMultExpression ) )
            // InternalKEffects.g:8837:1: ( ruleMultExpression )
            {
            // InternalKEffects.g:8837:1: ( ruleMultExpression )
            // InternalKEffects.g:8838:1: ruleMultExpression
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
    // InternalKEffects.g:8847:1: rule__MultExpression__OperatorAssignment_1_1_0 : ( ruleMultOperator ) ;
    public final void rule__MultExpression__OperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8851:1: ( ( ruleMultOperator ) )
            // InternalKEffects.g:8852:1: ( ruleMultOperator )
            {
            // InternalKEffects.g:8852:1: ( ruleMultOperator )
            // InternalKEffects.g:8853:1: ruleMultOperator
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
    // InternalKEffects.g:8862:1: rule__MultExpression__SubExpressionsAssignment_1_1_1 : ( ruleDivExpression ) ;
    public final void rule__MultExpression__SubExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8866:1: ( ( ruleDivExpression ) )
            // InternalKEffects.g:8867:1: ( ruleDivExpression )
            {
            // InternalKEffects.g:8867:1: ( ruleDivExpression )
            // InternalKEffects.g:8868:1: ruleDivExpression
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
    // InternalKEffects.g:8877:1: rule__DivExpression__OperatorAssignment_1_1_0 : ( ruleDivOperator ) ;
    public final void rule__DivExpression__OperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8881:1: ( ( ruleDivOperator ) )
            // InternalKEffects.g:8882:1: ( ruleDivOperator )
            {
            // InternalKEffects.g:8882:1: ( ruleDivOperator )
            // InternalKEffects.g:8883:1: ruleDivOperator
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
    // InternalKEffects.g:8892:1: rule__DivExpression__SubExpressionsAssignment_1_1_1 : ( ruleModExpression ) ;
    public final void rule__DivExpression__SubExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8896:1: ( ( ruleModExpression ) )
            // InternalKEffects.g:8897:1: ( ruleModExpression )
            {
            // InternalKEffects.g:8897:1: ( ruleModExpression )
            // InternalKEffects.g:8898:1: ruleModExpression
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
    // InternalKEffects.g:8907:1: rule__ModExpression__OperatorAssignment_1_1_0 : ( ruleModOperator ) ;
    public final void rule__ModExpression__OperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8911:1: ( ( ruleModOperator ) )
            // InternalKEffects.g:8912:1: ( ruleModOperator )
            {
            // InternalKEffects.g:8912:1: ( ruleModOperator )
            // InternalKEffects.g:8913:1: ruleModOperator
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
    // InternalKEffects.g:8922:1: rule__ModExpression__SubExpressionsAssignment_1_1_1 : ( ruleAtomicValuedExpression ) ;
    public final void rule__ModExpression__SubExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8926:1: ( ( ruleAtomicValuedExpression ) )
            // InternalKEffects.g:8927:1: ( ruleAtomicValuedExpression )
            {
            // InternalKEffects.g:8927:1: ( ruleAtomicValuedExpression )
            // InternalKEffects.g:8928:1: ruleAtomicValuedExpression
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
    // InternalKEffects.g:8937:1: rule__NegExpression__OperatorAssignment_0_1 : ( ruleSubOperator ) ;
    public final void rule__NegExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8941:1: ( ( ruleSubOperator ) )
            // InternalKEffects.g:8942:1: ( ruleSubOperator )
            {
            // InternalKEffects.g:8942:1: ( ruleSubOperator )
            // InternalKEffects.g:8943:1: ruleSubOperator
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
    // InternalKEffects.g:8952:1: rule__NegExpression__SubExpressionsAssignment_0_2 : ( ruleNegExpression ) ;
    public final void rule__NegExpression__SubExpressionsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8956:1: ( ( ruleNegExpression ) )
            // InternalKEffects.g:8957:1: ( ruleNegExpression )
            {
            // InternalKEffects.g:8957:1: ( ruleNegExpression )
            // InternalKEffects.g:8958:1: ruleNegExpression
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
    // InternalKEffects.g:8967:1: rule__ValuedObjectTestExpression__OperatorAssignment_0_1 : ( ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 ) ) ;
    public final void rule__ValuedObjectTestExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8971:1: ( ( ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 ) ) )
            // InternalKEffects.g:8972:1: ( ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 ) )
            {
            // InternalKEffects.g:8972:1: ( ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 ) )
            // InternalKEffects.g:8973:1: ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorAlternatives_0_1_0()); 
            }
            // InternalKEffects.g:8974:1: ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 )
            // InternalKEffects.g:8974:2: rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0
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
    // InternalKEffects.g:8983:1: rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 : ( ruleValuedObjectTestExpression ) ;
    public final void rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:8987:1: ( ( ruleValuedObjectTestExpression ) )
            // InternalKEffects.g:8988:1: ( ruleValuedObjectTestExpression )
            {
            // InternalKEffects.g:8988:1: ( ruleValuedObjectTestExpression )
            // InternalKEffects.g:8989:1: ruleValuedObjectTestExpression
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
    // InternalKEffects.g:8998:1: rule__ValuedObjectReference__ValuedObjectAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ValuedObjectReference__ValuedObjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9002:1: ( ( ( RULE_ID ) ) )
            // InternalKEffects.g:9003:1: ( ( RULE_ID ) )
            {
            // InternalKEffects.g:9003:1: ( ( RULE_ID ) )
            // InternalKEffects.g:9004:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
            }
            // InternalKEffects.g:9005:1: ( RULE_ID )
            // InternalKEffects.g:9006:1: RULE_ID
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


    // $ANTLR start "rule__ValuedObjectReference__SubReferenceAssignment_1_1"
    // InternalKEffects.g:9017:1: rule__ValuedObjectReference__SubReferenceAssignment_1_1 : ( ruleValuedObjectReference ) ;
    public final void rule__ValuedObjectReference__SubReferenceAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9021:1: ( ( ruleValuedObjectReference ) )
            // InternalKEffects.g:9022:1: ( ruleValuedObjectReference )
            {
            // InternalKEffects.g:9022:1: ( ruleValuedObjectReference )
            // InternalKEffects.g:9023:1: ruleValuedObjectReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getSubReferenceValuedObjectReferenceParserRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValuedObjectReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuedObjectReferenceAccess().getSubReferenceValuedObjectReferenceParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValuedObjectReference__SubReferenceAssignment_1_1"


    // $ANTLR start "rule__ValuedObjectReference__IndicesAssignment_2_1"
    // InternalKEffects.g:9032:1: rule__ValuedObjectReference__IndicesAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__ValuedObjectReference__IndicesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9036:1: ( ( ruleExpression ) )
            // InternalKEffects.g:9037:1: ( ruleExpression )
            {
            // InternalKEffects.g:9037:1: ( ruleExpression )
            // InternalKEffects.g:9038:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getIndicesExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuedObjectReferenceAccess().getIndicesExpressionParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValuedObjectReference__IndicesAssignment_2_1"


    // $ANTLR start "rule__FunctionCall__FunctionNameAssignment_1"
    // InternalKEffects.g:9047:1: rule__FunctionCall__FunctionNameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__FunctionCall__FunctionNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9051:1: ( ( ruleExtendedID ) )
            // InternalKEffects.g:9052:1: ( ruleExtendedID )
            {
            // InternalKEffects.g:9052:1: ( ruleExtendedID )
            // InternalKEffects.g:9053:1: ruleExtendedID
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
    // InternalKEffects.g:9062:1: rule__FunctionCall__ParametersAssignment_2_0_1 : ( ruleParameter ) ;
    public final void rule__FunctionCall__ParametersAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9066:1: ( ( ruleParameter ) )
            // InternalKEffects.g:9067:1: ( ruleParameter )
            {
            // InternalKEffects.g:9067:1: ( ruleParameter )
            // InternalKEffects.g:9068:1: ruleParameter
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
    // InternalKEffects.g:9077:1: rule__FunctionCall__ParametersAssignment_2_0_2_1 : ( ruleParameter ) ;
    public final void rule__FunctionCall__ParametersAssignment_2_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9081:1: ( ( ruleParameter ) )
            // InternalKEffects.g:9082:1: ( ruleParameter )
            {
            // InternalKEffects.g:9082:1: ( ruleParameter )
            // InternalKEffects.g:9083:1: ruleParameter
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
    // InternalKEffects.g:9092:1: rule__Parameter__PureOutputAssignment_0_0 : ( ( '!' ) ) ;
    public final void rule__Parameter__PureOutputAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9096:1: ( ( ( '!' ) ) )
            // InternalKEffects.g:9097:1: ( ( '!' ) )
            {
            // InternalKEffects.g:9097:1: ( ( '!' ) )
            // InternalKEffects.g:9098:1: ( '!' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getPureOutputExclamationMarkKeyword_0_0_0()); 
            }
            // InternalKEffects.g:9099:1: ( '!' )
            // InternalKEffects.g:9100:1: '!'
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
    // InternalKEffects.g:9115:1: rule__Parameter__CallByReferenceAssignment_0_1 : ( ( '&' ) ) ;
    public final void rule__Parameter__CallByReferenceAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9119:1: ( ( ( '&' ) ) )
            // InternalKEffects.g:9120:1: ( ( '&' ) )
            {
            // InternalKEffects.g:9120:1: ( ( '&' ) )
            // InternalKEffects.g:9121:1: ( '&' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getCallByReferenceAmpersandKeyword_0_1_0()); 
            }
            // InternalKEffects.g:9122:1: ( '&' )
            // InternalKEffects.g:9123:1: '&'
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
    // InternalKEffects.g:9138:1: rule__Parameter__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__Parameter__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9142:1: ( ( ruleExpression ) )
            // InternalKEffects.g:9143:1: ( ruleExpression )
            {
            // InternalKEffects.g:9143:1: ( ruleExpression )
            // InternalKEffects.g:9144:1: ruleExpression
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
    // InternalKEffects.g:9153:1: rule__TextExpression__TextAssignment : ( RULE_HOSTCODE ) ;
    public final void rule__TextExpression__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9157:1: ( ( RULE_HOSTCODE ) )
            // InternalKEffects.g:9158:1: ( RULE_HOSTCODE )
            {
            // InternalKEffects.g:9158:1: ( RULE_HOSTCODE )
            // InternalKEffects.g:9159:1: RULE_HOSTCODE
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
    // InternalKEffects.g:9168:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9172:1: ( ( RULE_INT ) )
            // InternalKEffects.g:9173:1: ( RULE_INT )
            {
            // InternalKEffects.g:9173:1: ( RULE_INT )
            // InternalKEffects.g:9174:1: RULE_INT
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
    // InternalKEffects.g:9183:1: rule__FloatValue__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9187:1: ( ( RULE_FLOAT ) )
            // InternalKEffects.g:9188:1: ( RULE_FLOAT )
            {
            // InternalKEffects.g:9188:1: ( RULE_FLOAT )
            // InternalKEffects.g:9189:1: RULE_FLOAT
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
    // InternalKEffects.g:9198:1: rule__BoolValue__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BoolValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9202:1: ( ( RULE_BOOLEAN ) )
            // InternalKEffects.g:9203:1: ( RULE_BOOLEAN )
            {
            // InternalKEffects.g:9203:1: ( RULE_BOOLEAN )
            // InternalKEffects.g:9204:1: RULE_BOOLEAN
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
    // InternalKEffects.g:9213:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9217:1: ( ( RULE_STRING ) )
            // InternalKEffects.g:9218:1: ( RULE_STRING )
            {
            // InternalKEffects.g:9218:1: ( RULE_STRING )
            // InternalKEffects.g:9219:1: RULE_STRING
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
    // InternalKEffects.g:9228:1: rule__CommentAnnotation__ValuesAssignment : ( RULE_COMMENT_ANNOTATION ) ;
    public final void rule__CommentAnnotation__ValuesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9232:1: ( ( RULE_COMMENT_ANNOTATION ) )
            // InternalKEffects.g:9233:1: ( RULE_COMMENT_ANNOTATION )
            {
            // InternalKEffects.g:9233:1: ( RULE_COMMENT_ANNOTATION )
            // InternalKEffects.g:9234:1: RULE_COMMENT_ANNOTATION
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
    // InternalKEffects.g:9243:1: rule__TagAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TagAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9247:1: ( ( ruleExtendedID ) )
            // InternalKEffects.g:9248:1: ( ruleExtendedID )
            {
            // InternalKEffects.g:9248:1: ( ruleExtendedID )
            // InternalKEffects.g:9249:1: ruleExtendedID
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
    // InternalKEffects.g:9258:1: rule__KeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9262:1: ( ( ruleExtendedID ) )
            // InternalKEffects.g:9263:1: ( ruleExtendedID )
            {
            // InternalKEffects.g:9263:1: ( ruleExtendedID )
            // InternalKEffects.g:9264:1: ruleExtendedID
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
    // InternalKEffects.g:9273:1: rule__KeyStringValueAnnotation__ValuesAssignment_2 : ( ruleEStringAllTypes ) ;
    public final void rule__KeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9277:1: ( ( ruleEStringAllTypes ) )
            // InternalKEffects.g:9278:1: ( ruleEStringAllTypes )
            {
            // InternalKEffects.g:9278:1: ( ruleEStringAllTypes )
            // InternalKEffects.g:9279:1: ruleEStringAllTypes
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
    // InternalKEffects.g:9288:1: rule__KeyStringValueAnnotation__ValuesAssignment_3_1 : ( ruleEStringAllTypes ) ;
    public final void rule__KeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9292:1: ( ( ruleEStringAllTypes ) )
            // InternalKEffects.g:9293:1: ( ruleEStringAllTypes )
            {
            // InternalKEffects.g:9293:1: ( ruleEStringAllTypes )
            // InternalKEffects.g:9294:1: ruleEStringAllTypes
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
    // InternalKEffects.g:9303:1: rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9307:1: ( ( ruleExtendedID ) )
            // InternalKEffects.g:9308:1: ( ruleExtendedID )
            {
            // InternalKEffects.g:9308:1: ( ruleExtendedID )
            // InternalKEffects.g:9309:1: ruleExtendedID
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
    // InternalKEffects.g:9318:1: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9322:1: ( ( ruleEStringBoolean ) )
            // InternalKEffects.g:9323:1: ( ruleEStringBoolean )
            {
            // InternalKEffects.g:9323:1: ( ruleEStringBoolean )
            // InternalKEffects.g:9324:1: ruleEStringBoolean
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
    // InternalKEffects.g:9333:1: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9337:1: ( ( ruleEStringBoolean ) )
            // InternalKEffects.g:9338:1: ( ruleEStringBoolean )
            {
            // InternalKEffects.g:9338:1: ( ruleEStringBoolean )
            // InternalKEffects.g:9339:1: ruleEStringBoolean
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
    // InternalKEffects.g:9348:1: rule__TypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9352:1: ( ( ruleExtendedID ) )
            // InternalKEffects.g:9353:1: ( ruleExtendedID )
            {
            // InternalKEffects.g:9353:1: ( ruleExtendedID )
            // InternalKEffects.g:9354:1: ruleExtendedID
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
    // InternalKEffects.g:9363:1: rule__TypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9367:1: ( ( ruleExtendedID ) )
            // InternalKEffects.g:9368:1: ( ruleExtendedID )
            {
            // InternalKEffects.g:9368:1: ( ruleExtendedID )
            // InternalKEffects.g:9369:1: ruleExtendedID
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
    // InternalKEffects.g:9378:1: rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 : ( ruleEStringAllTypes ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9382:1: ( ( ruleEStringAllTypes ) )
            // InternalKEffects.g:9383:1: ( ruleEStringAllTypes )
            {
            // InternalKEffects.g:9383:1: ( ruleEStringAllTypes )
            // InternalKEffects.g:9384:1: ruleEStringAllTypes
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
    // InternalKEffects.g:9393:1: rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( ruleEStringAllTypes ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9397:1: ( ( ruleEStringAllTypes ) )
            // InternalKEffects.g:9398:1: ( ruleEStringAllTypes )
            {
            // InternalKEffects.g:9398:1: ( ruleEStringAllTypes )
            // InternalKEffects.g:9399:1: ruleEStringAllTypes
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
    // InternalKEffects.g:9408:1: rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9412:1: ( ( ruleExtendedID ) )
            // InternalKEffects.g:9413:1: ( ruleExtendedID )
            {
            // InternalKEffects.g:9413:1: ( ruleExtendedID )
            // InternalKEffects.g:9414:1: ruleExtendedID
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
    // InternalKEffects.g:9423:1: rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9427:1: ( ( ruleExtendedID ) )
            // InternalKEffects.g:9428:1: ( ruleExtendedID )
            {
            // InternalKEffects.g:9428:1: ( ruleExtendedID )
            // InternalKEffects.g:9429:1: ruleExtendedID
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
    // InternalKEffects.g:9438:1: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9442:1: ( ( ruleEStringBoolean ) )
            // InternalKEffects.g:9443:1: ( ruleEStringBoolean )
            {
            // InternalKEffects.g:9443:1: ( ruleEStringBoolean )
            // InternalKEffects.g:9444:1: ruleEStringBoolean
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
    // InternalKEffects.g:9453:1: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9457:1: ( ( ruleEStringBoolean ) )
            // InternalKEffects.g:9458:1: ( ruleEStringBoolean )
            {
            // InternalKEffects.g:9458:1: ( ruleEStringBoolean )
            // InternalKEffects.g:9459:1: ruleEStringBoolean
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
    // InternalKEffects.g:9468:1: rule__QuotedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__QuotedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9472:1: ( ( ruleExtendedID ) )
            // InternalKEffects.g:9473:1: ( ruleExtendedID )
            {
            // InternalKEffects.g:9473:1: ( ruleExtendedID )
            // InternalKEffects.g:9474:1: ruleExtendedID
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
    // InternalKEffects.g:9483:1: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 : ( RULE_STRING ) ;
    public final void rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9487:1: ( ( RULE_STRING ) )
            // InternalKEffects.g:9488:1: ( RULE_STRING )
            {
            // InternalKEffects.g:9488:1: ( RULE_STRING )
            // InternalKEffects.g:9489:1: RULE_STRING
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
    // InternalKEffects.g:9498:1: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9502:1: ( ( RULE_STRING ) )
            // InternalKEffects.g:9503:1: ( RULE_STRING )
            {
            // InternalKEffects.g:9503:1: ( RULE_STRING )
            // InternalKEffects.g:9504:1: RULE_STRING
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
    // InternalKEffects.g:9513:1: rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9517:1: ( ( ruleExtendedID ) )
            // InternalKEffects.g:9518:1: ( ruleExtendedID )
            {
            // InternalKEffects.g:9518:1: ( ruleExtendedID )
            // InternalKEffects.g:9519:1: ruleExtendedID
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
    // InternalKEffects.g:9528:1: rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9532:1: ( ( ruleExtendedID ) )
            // InternalKEffects.g:9533:1: ( ruleExtendedID )
            {
            // InternalKEffects.g:9533:1: ( ruleExtendedID )
            // InternalKEffects.g:9534:1: ruleExtendedID
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
    // InternalKEffects.g:9543:1: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 : ( RULE_STRING ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9547:1: ( ( RULE_STRING ) )
            // InternalKEffects.g:9548:1: ( RULE_STRING )
            {
            // InternalKEffects.g:9548:1: ( RULE_STRING )
            // InternalKEffects.g:9549:1: RULE_STRING
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
    // InternalKEffects.g:9558:1: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKEffects.g:9562:1: ( ( RULE_STRING ) )
            // InternalKEffects.g:9563:1: ( RULE_STRING )
            {
            // InternalKEffects.g:9563:1: ( RULE_STRING )
            // InternalKEffects.g:9564:1: RULE_STRING
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

    // $ANTLR start synpred1_InternalKEffects
    public final void synpred1_InternalKEffects_fragment() throws RecognitionException {   
        // InternalKEffects.g:1729:1: ( ( ruleAssignment ) )
        // InternalKEffects.g:1729:1: ( ruleAssignment )
        {
        // InternalKEffects.g:1729:1: ( ruleAssignment )
        // InternalKEffects.g:1730:1: ruleAssignment
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
        // InternalKEffects.g:1735:6: ( ( rulePostfixEffect ) )
        // InternalKEffects.g:1735:6: ( rulePostfixEffect )
        {
        // InternalKEffects.g:1735:6: ( rulePostfixEffect )
        // InternalKEffects.g:1736:1: rulePostfixEffect
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
        // InternalKEffects.g:1741:6: ( ( ruleEmission ) )
        // InternalKEffects.g:1741:6: ( ruleEmission )
        {
        // InternalKEffects.g:1741:6: ( ruleEmission )
        // InternalKEffects.g:1742:1: ruleEmission
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
        // InternalKEffects.g:1747:6: ( ( ruleHostcodeEffect ) )
        // InternalKEffects.g:1747:6: ( ruleHostcodeEffect )
        {
        // InternalKEffects.g:1747:6: ( ruleHostcodeEffect )
        // InternalKEffects.g:1748:1: ruleHostcodeEffect
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
        // InternalKEffects.g:1793:1: ( ( ruleBoolExpression ) )
        // InternalKEffects.g:1793:1: ( ruleBoolExpression )
        {
        // InternalKEffects.g:1793:1: ( ruleBoolExpression )
        // InternalKEffects.g:1794:1: ruleBoolExpression
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
        // InternalKEffects.g:1815:1: ( ( ruleValuedExpression ) )
        // InternalKEffects.g:1815:1: ( ruleValuedExpression )
        {
        // InternalKEffects.g:1815:1: ( ruleValuedExpression )
        // InternalKEffects.g:1816:1: ruleValuedExpression
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
        // InternalKEffects.g:1939:6: ( ( ( rule__AtomicValuedExpression__Group_3__0 ) ) )
        // InternalKEffects.g:1939:6: ( ( rule__AtomicValuedExpression__Group_3__0 ) )
        {
        // InternalKEffects.g:1939:6: ( ( rule__AtomicValuedExpression__Group_3__0 ) )
        // InternalKEffects.g:1940:1: ( rule__AtomicValuedExpression__Group_3__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_3()); 
        }
        // InternalKEffects.g:1941:1: ( rule__AtomicValuedExpression__Group_3__0 )
        // InternalKEffects.g:1941:2: rule__AtomicValuedExpression__Group_3__0
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

    // $ANTLR start synpred77_InternalKEffects
    public final void synpred77_InternalKEffects_fragment() throws RecognitionException {   
        // InternalKEffects.g:5882:2: ( rule__ValuedObjectReference__Group_2__0 )
        // InternalKEffects.g:5882:2: rule__ValuedObjectReference__Group_2__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__ValuedObjectReference__Group_2__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred77_InternalKEffects

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
    public final boolean synpred77_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred77_InternalKEffects_fragment(); // can never throw exception
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
    static final String dfa_3s = "\1\56\13\0\2\uffff";
    static final String dfa_4s = "\14\uffff\1\1\1\2";
    static final String dfa_5s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\1\6\1\11\1\2\1\3\1\13\6\uffff\1\7\2\uffff\1\14\1\uffff\1\1\3\uffff\1\10\17\uffff\1\12\4\uffff\1\5",
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
            return "1788:1: rule__Expression__Alternatives : ( ( ruleBoolExpression ) | ( ruleValuedExpression ) );";
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
    static final String dfa_9s = "\1\56\4\uffff\7\0\1\uffff";
    static final String dfa_10s = "\1\uffff\1\1\12\uffff\1\2";
    static final String dfa_11s = "\5\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\1\6\1\11\2\1\1\13\6\uffff\1\7\2\uffff\1\14\1\uffff\1\1\3\uffff\1\10\17\uffff\1\12\4\uffff\1\5",
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
            return "1810:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );";
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
    static final String dfa_15s = "\1\56\3\uffff\1\0\7\uffff";
    static final String dfa_16s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\5\uffff\1\4";
    static final String dfa_17s = "\4\uffff\1\0\7\uffff}>";
    static final String[] dfa_18s = {
            "\1\3\2\5\1\1\1\2\1\5\6\uffff\1\5\10\uffff\1\5\17\uffff\1\5\4\uffff\1\4",
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
            return "1916:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleStringValue ) | ( ( rule__AtomicValuedExpression__Group_3__0 ) ) | ( ruleAtomicExpression ) );";
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
    static final String dfa_19s = "\3\uffff\1\7\4\uffff\1\11\1\uffff\2\7";
    static final String dfa_20s = "\1\12\1\uffff\1\6\1\4\1\6\1\7\2\uffff\1\6\1\uffff\2\4";
    static final String dfa_21s = "\1\64\1\uffff\1\6\1\65\1\6\1\7\2\uffff\1\65\1\uffff\1\65\1\64";
    static final String dfa_22s = "\1\uffff\1\1\4\uffff\1\3\1\4\1\uffff\1\2\2\uffff";
    static final String dfa_23s = "\14\uffff}>";
    static final String[] dfa_24s = {
            "\1\1\51\uffff\1\2",
            "",
            "\1\3",
            "\2\11\1\10\2\11\2\7\12\uffff\1\11\23\uffff\1\7\6\uffff\1\6\2\uffff\1\4\1\7\1\5",
            "\1\12",
            "\1\13",
            "",
            "",
            "\1\11\2\uffff\2\11\22\uffff\13\7\1\uffff\1\11\6\uffff\1\7\1\uffff\4\11",
            "",
            "\2\11\1\10\2\11\2\7\12\uffff\1\11\23\uffff\1\7\6\uffff\1\6\2\uffff\1\4\1\7\1\5",
            "\2\11\1\10\2\11\2\7\12\uffff\1\11\23\uffff\1\7\6\uffff\1\6\3\uffff\1\7"
    };
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_13;
            this.eof = dfa_19;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_23;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "2025:1: rule__Annotation__Alternatives : ( ( ruleCommentAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleTagAnnotation ) );";
        }
    }
    static final String dfa_25s = "\13\uffff";
    static final String dfa_26s = "\3\uffff\1\10\5\uffff\2\10";
    static final String dfa_27s = "\1\12\1\uffff\1\6\1\4\1\6\1\7\3\uffff\2\4";
    static final String dfa_28s = "\1\64\1\uffff\1\6\1\65\1\6\1\7\3\uffff\1\65\1\64";
    static final String dfa_29s = "\1\uffff\1\1\4\uffff\1\3\1\2\1\4\2\uffff";
    static final String dfa_30s = "\13\uffff}>";
    static final String[] dfa_31s = {
            "\1\1\51\uffff\1\2",
            "",
            "\1\3",
            "\1\7\1\uffff\1\10\3\uffff\1\10\45\uffff\1\6\2\uffff\1\4\1\10\1\5",
            "\1\11",
            "\1\12",
            "",
            "",
            "",
            "\1\7\1\uffff\1\10\3\uffff\1\10\45\uffff\1\6\2\uffff\1\4\1\10\1\5",
            "\1\7\1\uffff\1\10\3\uffff\1\10\45\uffff\1\6\3\uffff\1\10"
    };

    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[][] dfa_31 = unpackEncodedStringArray(dfa_31s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_25;
            this.eof = dfa_26;
            this.min = dfa_27;
            this.max = dfa_28;
            this.accept = dfa_29;
            this.special = dfa_30;
            this.transition = dfa_31;
        }
        public String getDescription() {
            return "2061:1: rule__QuotedStringAnnotation__Alternatives : ( ( ruleCommentAnnotation ) | ( ruleQuotedKeyStringValueAnnotation ) | ( ruleQuotedTypedKeyStringValueAnnotation ) | ( ruleTagAnnotation ) );";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0010000000000402L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00004200022903F0L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0001003FE0000000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0001000000000002L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000100C000000000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000480010000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00004200022D03F0L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0004800000000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00003F0000000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00004200022103F0L});
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
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0009000000000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00000000002001F0L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0028000000000000L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0008000000000002L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000200080L});
    }


}