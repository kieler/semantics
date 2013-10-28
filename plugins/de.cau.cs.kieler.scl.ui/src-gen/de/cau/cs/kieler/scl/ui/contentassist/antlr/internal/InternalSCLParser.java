package de.cau.cs.kieler.scl.ui.contentassist.antlr.internal; 

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
import de.cau.cs.kieler.scl.services.SCLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSCLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_HOSTCODE", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'pre'", "'|'", "'&'", "'!'", "'+'", "'-'", "'*'", "'mod'", "'/'", "'val'", "'=='", "'<'", "'<='", "'>'", "'>='", "'<>'", "'module'", "'('", "')'", "'@'", "'['", "']'", "'.'"
    };
    public static final int RULE_BOOLEAN=9;
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_FLOAT=8;
    public static final int RULE_SL_COMMENT=13;
    public static final int EOF=-1;
    public static final int RULE_HOSTCODE=6;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int RULE_NUMBER=12;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int RULE_INT=7;
    public static final int RULE_WS=14;
    public static final int RULE_COMMENT_ANNOTATION=10;

    // delegates
    // delegators


        public InternalSCLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSCLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSCLParser.tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g"; }


     
     	private SCLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SCLGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModule"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:61:1: entryRuleModule : ruleModule EOF ;
    public final void entryRuleModule() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:62:1: ( ruleModule EOF )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:63:1: ruleModule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModule_in_entryRuleModule67);
            ruleModule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuleRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModule74); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:70:1: ruleModule : ( ( rule__Module__Group__0 ) ) ;
    public final void ruleModule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:74:2: ( ( ( rule__Module__Group__0 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:75:1: ( ( rule__Module__Group__0 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:75:1: ( ( rule__Module__Group__0 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:76:1: ( rule__Module__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:77:1: ( rule__Module__Group__0 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:77:2: rule__Module__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Module__Group__0_in_ruleModule100);
            rule__Module__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleExpression"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:91:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:92:1: ( ruleExpression EOF )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:93:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression129);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression136); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:100:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:104:2: ( ( ( rule__Expression__Alternatives ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:105:1: ( ( rule__Expression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:105:1: ( ( rule__Expression__Alternatives ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:106:1: ( rule__Expression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:107:1: ( rule__Expression__Alternatives )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:107:2: rule__Expression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Alternatives_in_ruleExpression162);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:119:1: entryRuleBoolExpression : ruleBoolExpression EOF ;
    public final void entryRuleBoolExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:120:1: ( ruleBoolExpression EOF )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:121:1: ruleBoolExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression189);
            ruleBoolExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolExpression196); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:128:1: ruleBoolExpression : ( ruleOrExpression ) ;
    public final void ruleBoolExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:132:2: ( ( ruleOrExpression ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:133:1: ( ruleOrExpression )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:133:1: ( ruleOrExpression )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:134:1: ruleOrExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolExpressionAccess().getOrExpressionParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_ruleBoolExpression222);
            ruleOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolExpressionAccess().getOrExpressionParserRuleCall()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleOrExpression"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:147:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:148:1: ( ruleOrExpression EOF )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:149:1: ruleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_entryRuleOrExpression248);
            ruleOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrExpression255); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:156:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:160:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:161:1: ( ( rule__OrExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:161:1: ( ( rule__OrExpression__Group__0 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:162:1: ( rule__OrExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:163:1: ( rule__OrExpression__Group__0 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:163:2: rule__OrExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group__0_in_ruleOrExpression281);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:175:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:176:1: ( ruleAndExpression EOF )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:177:1: ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_entryRuleAndExpression308);
            ruleAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAndExpression315); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:184:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:188:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:189:1: ( ( rule__AndExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:189:1: ( ( rule__AndExpression__Group__0 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:190:1: ( rule__AndExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:191:1: ( rule__AndExpression__Group__0 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:191:2: rule__AndExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group__0_in_ruleAndExpression341);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:203:1: entryRuleCompareOperation : ruleCompareOperation EOF ;
    public final void entryRuleCompareOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:204:1: ( ruleCompareOperation EOF )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:205:1: ruleCompareOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation368);
            ruleCompareOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompareOperation375); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:212:1: ruleCompareOperation : ( ( rule__CompareOperation__Alternatives ) ) ;
    public final void ruleCompareOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:216:2: ( ( ( rule__CompareOperation__Alternatives ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:217:1: ( ( rule__CompareOperation__Alternatives ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:217:1: ( ( rule__CompareOperation__Alternatives ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:218:1: ( rule__CompareOperation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:219:1: ( rule__CompareOperation__Alternatives )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:219:2: rule__CompareOperation__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Alternatives_in_ruleCompareOperation401);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:231:1: entryRuleNotOrValuedExpression : ruleNotOrValuedExpression EOF ;
    public final void entryRuleNotOrValuedExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:232:1: ( ruleNotOrValuedExpression EOF )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:233:1: ruleNotOrValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotOrValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression428);
            ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotOrValuedExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNotOrValuedExpression435); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:240:1: ruleNotOrValuedExpression : ( ( rule__NotOrValuedExpression__Alternatives ) ) ;
    public final void ruleNotOrValuedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:244:2: ( ( ( rule__NotOrValuedExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:245:1: ( ( rule__NotOrValuedExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:245:1: ( ( rule__NotOrValuedExpression__Alternatives ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:246:1: ( rule__NotOrValuedExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotOrValuedExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:247:1: ( rule__NotOrValuedExpression__Alternatives )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:247:2: rule__NotOrValuedExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotOrValuedExpression__Alternatives_in_ruleNotOrValuedExpression461);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:259:1: entryRuleNotExpression : ruleNotExpression EOF ;
    public final void entryRuleNotExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:260:1: ( ruleNotExpression EOF )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:261:1: ruleNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_entryRuleNotExpression488);
            ruleNotExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNotExpression495); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:268:1: ruleNotExpression : ( ( rule__NotExpression__Alternatives ) ) ;
    public final void ruleNotExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:272:2: ( ( ( rule__NotExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:273:1: ( ( rule__NotExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:273:1: ( ( rule__NotExpression__Alternatives ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:274:1: ( rule__NotExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:275:1: ( rule__NotExpression__Alternatives )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:275:2: rule__NotExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Alternatives_in_ruleNotExpression521);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:287:1: entryRuleValuedExpression : ruleValuedExpression EOF ;
    public final void entryRuleValuedExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:288:1: ( ruleValuedExpression EOF )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:289:1: ruleValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression548);
            ruleValuedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuedExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedExpression555); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:296:1: ruleValuedExpression : ( ruleAddExpression ) ;
    public final void ruleValuedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:300:2: ( ( ruleAddExpression ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:301:1: ( ruleAddExpression )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:301:1: ( ruleAddExpression )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:302:1: ruleAddExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedExpressionAccess().getAddExpressionParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_ruleValuedExpression581);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:315:1: entryRuleAddExpression : ruleAddExpression EOF ;
    public final void entryRuleAddExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:316:1: ( ruleAddExpression EOF )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:317:1: ruleAddExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_entryRuleAddExpression607);
            ruleAddExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAddExpression614); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:324:1: ruleAddExpression : ( ( rule__AddExpression__Group__0 ) ) ;
    public final void ruleAddExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:328:2: ( ( ( rule__AddExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:329:1: ( ( rule__AddExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:329:1: ( ( rule__AddExpression__Group__0 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:330:1: ( rule__AddExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:331:1: ( rule__AddExpression__Group__0 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:331:2: rule__AddExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__0_in_ruleAddExpression640);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:343:1: entryRuleSubExpression : ruleSubExpression EOF ;
    public final void entryRuleSubExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:344:1: ( ruleSubExpression EOF )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:345:1: ruleSubExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_entryRuleSubExpression667);
            ruleSubExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubExpression674); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:352:1: ruleSubExpression : ( ( rule__SubExpression__Group__0 ) ) ;
    public final void ruleSubExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:356:2: ( ( ( rule__SubExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:357:1: ( ( rule__SubExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:357:1: ( ( rule__SubExpression__Group__0 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:358:1: ( rule__SubExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:359:1: ( rule__SubExpression__Group__0 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:359:2: rule__SubExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group__0_in_ruleSubExpression700);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:371:1: entryRuleMultExpression : ruleMultExpression EOF ;
    public final void entryRuleMultExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:372:1: ( ruleMultExpression EOF )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:373:1: ruleMultExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_entryRuleMultExpression727);
            ruleMultExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultExpression734); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:380:1: ruleMultExpression : ( ( rule__MultExpression__Group__0 ) ) ;
    public final void ruleMultExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:384:2: ( ( ( rule__MultExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:385:1: ( ( rule__MultExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:385:1: ( ( rule__MultExpression__Group__0 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:386:1: ( rule__MultExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:387:1: ( rule__MultExpression__Group__0 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:387:2: rule__MultExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__0_in_ruleMultExpression760);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:399:1: entryRuleDivExpression : ruleDivExpression EOF ;
    public final void entryRuleDivExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:400:1: ( ruleDivExpression EOF )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:401:1: ruleDivExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_entryRuleDivExpression787);
            ruleDivExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDivExpression794); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:408:1: ruleDivExpression : ( ( rule__DivExpression__Group__0 ) ) ;
    public final void ruleDivExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:412:2: ( ( ( rule__DivExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:413:1: ( ( rule__DivExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:413:1: ( ( rule__DivExpression__Group__0 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:414:1: ( rule__DivExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:415:1: ( rule__DivExpression__Group__0 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:415:2: rule__DivExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group__0_in_ruleDivExpression820);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:427:1: entryRuleModExpression : ruleModExpression EOF ;
    public final void entryRuleModExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:428:1: ( ruleModExpression EOF )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:429:1: ruleModExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_entryRuleModExpression847);
            ruleModExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModExpression854); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:436:1: ruleModExpression : ( ( rule__ModExpression__Group__0 ) ) ;
    public final void ruleModExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:440:2: ( ( ( rule__ModExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:441:1: ( ( rule__ModExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:441:1: ( ( rule__ModExpression__Group__0 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:442:1: ( rule__ModExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:443:1: ( rule__ModExpression__Group__0 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:443:2: rule__ModExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group__0_in_ruleModExpression880);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:455:1: entryRuleNegExpression : ruleNegExpression EOF ;
    public final void entryRuleNegExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:456:1: ( ruleNegExpression EOF )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:457:1: ruleNegExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_entryRuleNegExpression907);
            ruleNegExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNegExpression914); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:464:1: ruleNegExpression : ( ( rule__NegExpression__Alternatives ) ) ;
    public final void ruleNegExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:468:2: ( ( ( rule__NegExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:469:1: ( ( rule__NegExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:469:1: ( ( rule__NegExpression__Alternatives ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:470:1: ( rule__NegExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:471:1: ( rule__NegExpression__Alternatives )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:471:2: rule__NegExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__Alternatives_in_ruleNegExpression940);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:483:1: entryRuleAtomicExpression : ruleAtomicExpression EOF ;
    public final void entryRuleAtomicExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:484:1: ( ruleAtomicExpression EOF )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:485:1: ruleAtomicExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression967);
            ruleAtomicExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicExpression974); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:492:1: ruleAtomicExpression : ( ( rule__AtomicExpression__Alternatives ) ) ;
    public final void ruleAtomicExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:496:2: ( ( ( rule__AtomicExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:497:1: ( ( rule__AtomicExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:497:1: ( ( rule__AtomicExpression__Alternatives ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:498:1: ( rule__AtomicExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:499:1: ( rule__AtomicExpression__Alternatives )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:499:2: rule__AtomicExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Alternatives_in_ruleAtomicExpression1000);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:511:1: entryRuleAtomicValuedExpression : ruleAtomicValuedExpression EOF ;
    public final void entryRuleAtomicValuedExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:512:1: ( ruleAtomicValuedExpression EOF )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:513:1: ruleAtomicValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression1027);
            ruleAtomicValuedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicValuedExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicValuedExpression1034); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:520:1: ruleAtomicValuedExpression : ( ( rule__AtomicValuedExpression__Alternatives ) ) ;
    public final void ruleAtomicValuedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:524:2: ( ( ( rule__AtomicValuedExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:525:1: ( ( rule__AtomicValuedExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:525:1: ( ( rule__AtomicValuedExpression__Alternatives ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:526:1: ( rule__AtomicValuedExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:527:1: ( rule__AtomicValuedExpression__Alternatives )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:527:2: rule__AtomicValuedExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Alternatives_in_ruleAtomicValuedExpression1060);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:539:1: entryRuleValuedObjectTestExpression : ruleValuedObjectTestExpression EOF ;
    public final void entryRuleValuedObjectTestExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:540:1: ( ruleValuedObjectTestExpression EOF )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:541:1: ruleValuedObjectTestExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression1087);
            ruleValuedObjectTestExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuedObjectTestExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedObjectTestExpression1094); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:548:1: ruleValuedObjectTestExpression : ( ( rule__ValuedObjectTestExpression__Alternatives ) ) ;
    public final void ruleValuedObjectTestExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:552:2: ( ( ( rule__ValuedObjectTestExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:553:1: ( ( rule__ValuedObjectTestExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:553:1: ( ( rule__ValuedObjectTestExpression__Alternatives ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:554:1: ( rule__ValuedObjectTestExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:555:1: ( rule__ValuedObjectTestExpression__Alternatives )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:555:2: rule__ValuedObjectTestExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Alternatives_in_ruleValuedObjectTestExpression1120);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:567:1: entryRuleValuedObjectReference : ruleValuedObjectReference EOF ;
    public final void entryRuleValuedObjectReference() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:568:1: ( ruleValuedObjectReference EOF )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:569:1: ruleValuedObjectReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference1147);
            ruleValuedObjectReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuedObjectReferenceRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedObjectReference1154); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:576:1: ruleValuedObjectReference : ( ( rule__ValuedObjectReference__ValuedObjectAssignment ) ) ;
    public final void ruleValuedObjectReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:580:2: ( ( ( rule__ValuedObjectReference__ValuedObjectAssignment ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:581:1: ( ( rule__ValuedObjectReference__ValuedObjectAssignment ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:581:1: ( ( rule__ValuedObjectReference__ValuedObjectAssignment ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:582:1: ( rule__ValuedObjectReference__ValuedObjectAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectAssignment()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:583:1: ( rule__ValuedObjectReference__ValuedObjectAssignment )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:583:2: rule__ValuedObjectReference__ValuedObjectAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectReference__ValuedObjectAssignment_in_ruleValuedObjectReference1180);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:595:1: entryRuleTextExpression : ruleTextExpression EOF ;
    public final void entryRuleTextExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:596:1: ( ruleTextExpression EOF )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:597:1: ruleTextExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_entryRuleTextExpression1207);
            ruleTextExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextExpression1214); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:604:1: ruleTextExpression : ( ( rule__TextExpression__TextAssignment ) ) ;
    public final void ruleTextExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:608:2: ( ( ( rule__TextExpression__TextAssignment ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:609:1: ( ( rule__TextExpression__TextAssignment ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:609:1: ( ( rule__TextExpression__TextAssignment ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:610:1: ( rule__TextExpression__TextAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getTextAssignment()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:611:1: ( rule__TextExpression__TextAssignment )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:611:2: rule__TextExpression__TextAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__TextAssignment_in_ruleTextExpression1240);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:623:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:624:1: ( ruleIntValue EOF )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:625:1: ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIntValue_in_entryRuleIntValue1267);
            ruleIntValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntValueRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntValue1274); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:632:1: ruleIntValue : ( ( rule__IntValue__ValueAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:636:2: ( ( ( rule__IntValue__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:637:1: ( ( rule__IntValue__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:637:1: ( ( rule__IntValue__ValueAssignment ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:638:1: ( rule__IntValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:639:1: ( rule__IntValue__ValueAssignment )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:639:2: rule__IntValue__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue1300);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:651:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:652:1: ( ruleFloatValue EOF )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:653:1: ruleFloatValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_entryRuleFloatValue1327);
            ruleFloatValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatValueRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloatValue1334); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:660:1: ruleFloatValue : ( ( rule__FloatValue__ValueAssignment ) ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:664:2: ( ( ( rule__FloatValue__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:665:1: ( ( rule__FloatValue__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:665:1: ( ( rule__FloatValue__ValueAssignment ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:666:1: ( rule__FloatValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:667:1: ( rule__FloatValue__ValueAssignment )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:667:2: rule__FloatValue__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue1360);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:679:1: entryRuleBoolValue : ruleBoolValue EOF ;
    public final void entryRuleBoolValue() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:680:1: ( ruleBoolValue EOF )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:681:1: ruleBoolValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBoolValue_in_entryRuleBoolValue1387);
            ruleBoolValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolValueRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolValue1394); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:688:1: ruleBoolValue : ( ( rule__BoolValue__ValueAssignment ) ) ;
    public final void ruleBoolValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:692:2: ( ( ( rule__BoolValue__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:693:1: ( ( rule__BoolValue__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:693:1: ( ( rule__BoolValue__ValueAssignment ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:694:1: ( rule__BoolValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:695:1: ( rule__BoolValue__ValueAssignment )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:695:2: rule__BoolValue__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoolValue__ValueAssignment_in_ruleBoolValue1420);
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


    // $ANTLR start "entryRuleDoubleValue"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:707:1: entryRuleDoubleValue : ruleDoubleValue EOF ;
    public final void entryRuleDoubleValue() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:708:1: ( ruleDoubleValue EOF )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:709:1: ruleDoubleValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDoubleValue_in_entryRuleDoubleValue1447);
            ruleDoubleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleValueRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDoubleValue1454); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDoubleValue"


    // $ANTLR start "ruleDoubleValue"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:716:1: ruleDoubleValue : ( ( rule__DoubleValue__ValueAssignment ) ) ;
    public final void ruleDoubleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:720:2: ( ( ( rule__DoubleValue__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:721:1: ( ( rule__DoubleValue__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:721:1: ( ( rule__DoubleValue__ValueAssignment ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:722:1: ( rule__DoubleValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:723:1: ( rule__DoubleValue__ValueAssignment )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:723:2: rule__DoubleValue__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__DoubleValue__ValueAssignment_in_ruleDoubleValue1480);
            rule__DoubleValue__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleValueAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDoubleValue"


    // $ANTLR start "entryRuleAnnotation"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:737:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:738:1: ( ruleAnnotation EOF )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:739:1: ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_entryRuleAnnotation1509);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotation1516); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:746:1: ruleAnnotation : ( ( rule__Annotation__Alternatives ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:750:2: ( ( ( rule__Annotation__Alternatives ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:751:1: ( ( rule__Annotation__Alternatives ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:751:1: ( ( rule__Annotation__Alternatives ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:752:1: ( rule__Annotation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:753:1: ( rule__Annotation__Alternatives )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:753:2: rule__Annotation__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Alternatives_in_ruleAnnotation1542);
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


    // $ANTLR start "entryRuleCommentAnnotation"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:767:1: entryRuleCommentAnnotation : ruleCommentAnnotation EOF ;
    public final void entryRuleCommentAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:768:1: ( ruleCommentAnnotation EOF )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:769:1: ruleCommentAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation1571);
            ruleCommentAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommentAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCommentAnnotation1578); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:776:1: ruleCommentAnnotation : ( ( rule__CommentAnnotation__ValueAssignment ) ) ;
    public final void ruleCommentAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:780:2: ( ( ( rule__CommentAnnotation__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:781:1: ( ( rule__CommentAnnotation__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:781:1: ( ( rule__CommentAnnotation__ValueAssignment ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:782:1: ( rule__CommentAnnotation__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:783:1: ( rule__CommentAnnotation__ValueAssignment )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:783:2: rule__CommentAnnotation__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__CommentAnnotation__ValueAssignment_in_ruleCommentAnnotation1604);
            rule__CommentAnnotation__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
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
    // $ANTLR end "ruleCommentAnnotation"


    // $ANTLR start "entryRuleTagAnnotation"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:795:1: entryRuleTagAnnotation : ruleTagAnnotation EOF ;
    public final void entryRuleTagAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:796:1: ( ruleTagAnnotation EOF )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:797:1: ruleTagAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation1631);
            ruleTagAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTagAnnotation1638); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:804:1: ruleTagAnnotation : ( ( rule__TagAnnotation__Group__0 ) ) ;
    public final void ruleTagAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:808:2: ( ( ( rule__TagAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:809:1: ( ( rule__TagAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:809:1: ( ( rule__TagAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:810:1: ( rule__TagAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:811:1: ( rule__TagAnnotation__Group__0 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:811:2: rule__TagAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__0_in_ruleTagAnnotation1664);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:823:1: entryRuleKeyStringValueAnnotation : ruleKeyStringValueAnnotation EOF ;
    public final void entryRuleKeyStringValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:824:1: ( ruleKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:825:1: ruleKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation1691);
            ruleKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation1698); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:832:1: ruleKeyStringValueAnnotation : ( ( rule__KeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:836:2: ( ( ( rule__KeyStringValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:837:1: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:837:1: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:838:1: ( rule__KeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:839:1: ( rule__KeyStringValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:839:2: rule__KeyStringValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__0_in_ruleKeyStringValueAnnotation1724);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:851:1: entryRuleTypedKeyStringValueAnnotation : ruleTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:852:1: ( ruleTypedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:853:1: ruleTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation1751);
            ruleTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation1758); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:860:1: ruleTypedKeyStringValueAnnotation : ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:864:2: ( ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:865:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:865:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:866:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:867:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:867:2: rule__TypedKeyStringValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0_in_ruleTypedKeyStringValueAnnotation1784);
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


    // $ANTLR start "entryRuleKeyBooleanValueAnnotation"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:879:1: entryRuleKeyBooleanValueAnnotation : ruleKeyBooleanValueAnnotation EOF ;
    public final void entryRuleKeyBooleanValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:880:1: ( ruleKeyBooleanValueAnnotation EOF )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:881:1: ruleKeyBooleanValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation1811);
            ruleKeyBooleanValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation1818); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:888:1: ruleKeyBooleanValueAnnotation : ( ( rule__KeyBooleanValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyBooleanValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:892:2: ( ( ( rule__KeyBooleanValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:893:1: ( ( rule__KeyBooleanValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:893:1: ( ( rule__KeyBooleanValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:894:1: ( rule__KeyBooleanValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:895:1: ( rule__KeyBooleanValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:895:2: rule__KeyBooleanValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__0_in_ruleKeyBooleanValueAnnotation1844);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:907:1: entryRuleKeyIntValueAnnotation : ruleKeyIntValueAnnotation EOF ;
    public final void entryRuleKeyIntValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:908:1: ( ruleKeyIntValueAnnotation EOF )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:909:1: ruleKeyIntValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation1871);
            ruleKeyIntValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation1878); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:916:1: ruleKeyIntValueAnnotation : ( ( rule__KeyIntValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyIntValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:920:2: ( ( ( rule__KeyIntValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:921:1: ( ( rule__KeyIntValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:921:1: ( ( rule__KeyIntValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:922:1: ( rule__KeyIntValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:923:1: ( rule__KeyIntValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:923:2: rule__KeyIntValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__0_in_ruleKeyIntValueAnnotation1904);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:935:1: entryRuleKeyFloatValueAnnotation : ruleKeyFloatValueAnnotation EOF ;
    public final void entryRuleKeyFloatValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:936:1: ( ruleKeyFloatValueAnnotation EOF )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:937:1: ruleKeyFloatValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation1931);
            ruleKeyFloatValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation1938); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:944:1: ruleKeyFloatValueAnnotation : ( ( rule__KeyFloatValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyFloatValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:948:2: ( ( ( rule__KeyFloatValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:949:1: ( ( rule__KeyFloatValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:949:1: ( ( rule__KeyFloatValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:950:1: ( rule__KeyFloatValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:951:1: ( rule__KeyFloatValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:951:2: rule__KeyFloatValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__0_in_ruleKeyFloatValueAnnotation1964);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:965:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:966:1: ( ruleEString EOF )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:967:1: ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1993);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString2000); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:974:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:978:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:979:1: ( ( rule__EString__Alternatives ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:979:1: ( ( rule__EString__Alternatives ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:980:1: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:981:1: ( rule__EString__Alternatives )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:981:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString2026);
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


    // $ANTLR start "entryRuleExtendedID"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:993:1: entryRuleExtendedID : ruleExtendedID EOF ;
    public final void entryRuleExtendedID() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:994:1: ( ruleExtendedID EOF )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:995:1: ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_entryRuleExtendedID2053);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendedIDRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtendedID2060); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1002:1: ruleExtendedID : ( ( rule__ExtendedID__Group__0 ) ) ;
    public final void ruleExtendedID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1006:2: ( ( ( rule__ExtendedID__Group__0 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1007:1: ( ( rule__ExtendedID__Group__0 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1007:1: ( ( rule__ExtendedID__Group__0 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1008:1: ( rule__ExtendedID__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1009:1: ( rule__ExtendedID__Group__0 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1009:2: rule__ExtendedID__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__0_in_ruleExtendedID2086);
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


    // $ANTLR start "ruleCompareOperator"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1022:1: ruleCompareOperator : ( ( rule__CompareOperator__Alternatives ) ) ;
    public final void ruleCompareOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1026:1: ( ( ( rule__CompareOperator__Alternatives ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1027:1: ( ( rule__CompareOperator__Alternatives ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1027:1: ( ( rule__CompareOperator__Alternatives ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1028:1: ( rule__CompareOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1029:1: ( rule__CompareOperator__Alternatives )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1029:2: rule__CompareOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperator__Alternatives_in_ruleCompareOperator2123);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1041:1: rulePreOperator : ( ( 'pre' ) ) ;
    public final void rulePreOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1045:1: ( ( ( 'pre' ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1046:1: ( ( 'pre' ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1046:1: ( ( 'pre' ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1047:1: ( 'pre' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreOperatorAccess().getPREEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1048:1: ( 'pre' )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1048:3: 'pre'
            {
            match(input,16,FollowSets000.FOLLOW_16_in_rulePreOperator2160); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1061:1: ruleOrOperator : ( ( '|' ) ) ;
    public final void ruleOrOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1065:1: ( ( ( '|' ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1066:1: ( ( '|' ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1066:1: ( ( '|' ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1067:1: ( '|' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrOperatorAccess().getOREnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1068:1: ( '|' )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1068:3: '|'
            {
            match(input,17,FollowSets000.FOLLOW_17_in_ruleOrOperator2199); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1081:1: ruleAndOperator : ( ( '&' ) ) ;
    public final void ruleAndOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1085:1: ( ( ( '&' ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1086:1: ( ( '&' ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1086:1: ( ( '&' ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1087:1: ( '&' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndOperatorAccess().getANDEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1088:1: ( '&' )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1088:3: '&'
            {
            match(input,18,FollowSets000.FOLLOW_18_in_ruleAndOperator2238); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1101:1: ruleNotOperator : ( ( '!' ) ) ;
    public final void ruleNotOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1105:1: ( ( ( '!' ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1106:1: ( ( '!' ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1106:1: ( ( '!' ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1107:1: ( '!' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1108:1: ( '!' )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1108:3: '!'
            {
            match(input,19,FollowSets000.FOLLOW_19_in_ruleNotOperator2277); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1121:1: ruleAddOperator : ( ( '+' ) ) ;
    public final void ruleAddOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1125:1: ( ( ( '+' ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1126:1: ( ( '+' ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1126:1: ( ( '+' ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1127:1: ( '+' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddOperatorAccess().getADDEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1128:1: ( '+' )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1128:3: '+'
            {
            match(input,20,FollowSets000.FOLLOW_20_in_ruleAddOperator2316); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1141:1: ruleSubOperator : ( ( '-' ) ) ;
    public final void ruleSubOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1145:1: ( ( ( '-' ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1146:1: ( ( '-' ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1146:1: ( ( '-' ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1147:1: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubOperatorAccess().getSUBEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1148:1: ( '-' )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1148:3: '-'
            {
            match(input,21,FollowSets000.FOLLOW_21_in_ruleSubOperator2355); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1161:1: ruleMultOperator : ( ( '*' ) ) ;
    public final void ruleMultOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1165:1: ( ( ( '*' ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1166:1: ( ( '*' ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1166:1: ( ( '*' ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1167:1: ( '*' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1168:1: ( '*' )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1168:3: '*'
            {
            match(input,22,FollowSets000.FOLLOW_22_in_ruleMultOperator2394); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1181:1: ruleModOperator : ( ( 'mod' ) ) ;
    public final void ruleModOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1185:1: ( ( ( 'mod' ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1186:1: ( ( 'mod' ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1186:1: ( ( 'mod' ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1187:1: ( 'mod' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModOperatorAccess().getMODEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1188:1: ( 'mod' )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1188:3: 'mod'
            {
            match(input,23,FollowSets000.FOLLOW_23_in_ruleModOperator2433); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1201:1: ruleDivOperator : ( ( '/' ) ) ;
    public final void ruleDivOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1205:1: ( ( ( '/' ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1206:1: ( ( '/' ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1206:1: ( ( '/' ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1207:1: ( '/' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivOperatorAccess().getDIVEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1208:1: ( '/' )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1208:3: '/'
            {
            match(input,24,FollowSets000.FOLLOW_24_in_ruleDivOperator2472); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1221:1: ruleValOperator : ( ( 'val' ) ) ;
    public final void ruleValOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1225:1: ( ( ( 'val' ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1226:1: ( ( 'val' ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1226:1: ( ( 'val' ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1227:1: ( 'val' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValOperatorAccess().getVALEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1228:1: ( 'val' )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1228:3: 'val'
            {
            match(input,25,FollowSets000.FOLLOW_25_in_ruleValOperator2511); if (state.failed) return ;

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


    // $ANTLR start "rule__Expression__Alternatives"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1244:1: rule__Expression__Alternatives : ( ( ( ruleBoolExpression ) ) | ( ruleValuedExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1248:1: ( ( ( ruleBoolExpression ) ) | ( ruleValuedExpression ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1249:1: ( ( ruleBoolExpression ) )
                    {
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1249:1: ( ( ruleBoolExpression ) )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1250:1: ( ruleBoolExpression )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getBoolExpressionParserRuleCall_0()); 
                    }
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1251:1: ( ruleBoolExpression )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1251:3: ruleBoolExpression
                    {
                    pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_rule__Expression__Alternatives2553);
                    ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getBoolExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1255:6: ( ruleValuedExpression )
                    {
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1255:6: ( ruleValuedExpression )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1256:1: ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_rule__Expression__Alternatives2571);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1266:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );
    public final void rule__CompareOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1270:1: ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1271:1: ( ( rule__CompareOperation__Group_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1271:1: ( ( rule__CompareOperation__Group_0__0 ) )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1272:1: ( rule__CompareOperation__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperationAccess().getGroup_0()); 
                    }
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1273:1: ( rule__CompareOperation__Group_0__0 )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1273:2: rule__CompareOperation__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0__0_in_rule__CompareOperation__Alternatives2603);
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
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1277:6: ( ruleNotExpression )
                    {
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1277:6: ( ruleNotExpression )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1278:1: ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperationAccess().getNotExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_rule__CompareOperation__Alternatives2621);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1288:1: rule__NotOrValuedExpression__Alternatives : ( ( ( ruleValuedExpression ) ) | ( ruleNotExpression ) );
    public final void rule__NotOrValuedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1292:1: ( ( ( ruleValuedExpression ) ) | ( ruleNotExpression ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1293:1: ( ( ruleValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1293:1: ( ( ruleValuedExpression ) )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1294:1: ( ruleValuedExpression )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
                    }
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1295:1: ( ruleValuedExpression )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1295:3: ruleValuedExpression
                    {
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_rule__NotOrValuedExpression__Alternatives2654);
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
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1299:6: ( ruleNotExpression )
                    {
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1299:6: ( ruleNotExpression )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1300:1: ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNotOrValuedExpressionAccess().getNotExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_rule__NotOrValuedExpression__Alternatives2672);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1310:1: rule__NotExpression__Alternatives : ( ( ( rule__NotExpression__Group_0__0 ) ) | ( ruleAtomicExpression ) );
    public final void rule__NotExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1314:1: ( ( ( rule__NotExpression__Group_0__0 ) ) | ( ruleAtomicExpression ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_HOSTCODE)||LA4_0==RULE_BOOLEAN||LA4_0==16||LA4_0==25||LA4_0==33) ) {
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
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1315:1: ( ( rule__NotExpression__Group_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1315:1: ( ( rule__NotExpression__Group_0__0 ) )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1316:1: ( rule__NotExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNotExpressionAccess().getGroup_0()); 
                    }
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1317:1: ( rule__NotExpression__Group_0__0 )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1317:2: rule__NotExpression__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__0_in_rule__NotExpression__Alternatives2704);
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
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1321:6: ( ruleAtomicExpression )
                    {
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1321:6: ( ruleAtomicExpression )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1322:1: ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNotExpressionAccess().getAtomicExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_rule__NotExpression__Alternatives2722);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1332:1: rule__NegExpression__Alternatives : ( ( ( rule__NegExpression__Group_0__0 ) ) | ( ruleAtomicValuedExpression ) );
    public final void rule__NegExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1336:1: ( ( ( rule__NegExpression__Group_0__0 ) ) | ( ruleAtomicValuedExpression ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_BOOLEAN)||LA5_0==16||LA5_0==25||LA5_0==33) ) {
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
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1337:1: ( ( rule__NegExpression__Group_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1337:1: ( ( rule__NegExpression__Group_0__0 ) )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1338:1: ( rule__NegExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNegExpressionAccess().getGroup_0()); 
                    }
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1339:1: ( rule__NegExpression__Group_0__0 )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1339:2: rule__NegExpression__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__NegExpression__Group_0__0_in_rule__NegExpression__Alternatives2754);
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
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1343:6: ( ruleAtomicValuedExpression )
                    {
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1343:6: ( ruleAtomicValuedExpression )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1344:1: ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNegExpressionAccess().getAtomicValuedExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_rule__NegExpression__Alternatives2772);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1354:1: rule__AtomicExpression__Alternatives : ( ( ruleBoolValue ) | ( ruleValuedObjectTestExpression ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ruleTextExpression ) );
    public final void rule__AtomicExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1358:1: ( ( ruleBoolValue ) | ( ruleValuedObjectTestExpression ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ruleTextExpression ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt6=1;
                }
                break;
            case RULE_ID:
            case 16:
            case 25:
                {
                alt6=2;
                }
                break;
            case 33:
                {
                alt6=3;
                }
                break;
            case RULE_HOSTCODE:
                {
                alt6=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1359:1: ( ruleBoolValue )
                    {
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1359:1: ( ruleBoolValue )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1360:1: ruleBoolValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getBoolValueParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolValue_in_rule__AtomicExpression__Alternatives2804);
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
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1365:6: ( ruleValuedObjectTestExpression )
                    {
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1365:6: ( ruleValuedObjectTestExpression )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1366:1: ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getValuedObjectTestExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_rule__AtomicExpression__Alternatives2821);
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
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1371:6: ( ( rule__AtomicExpression__Group_2__0 ) )
                    {
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1371:6: ( ( rule__AtomicExpression__Group_2__0 ) )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1372:1: ( rule__AtomicExpression__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getGroup_2()); 
                    }
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1373:1: ( rule__AtomicExpression__Group_2__0 )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1373:2: rule__AtomicExpression__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__0_in_rule__AtomicExpression__Alternatives2838);
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
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1377:6: ( ruleTextExpression )
                    {
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1377:6: ( ruleTextExpression )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1378:1: ruleTextExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_rule__AtomicExpression__Alternatives2856);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1388:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleDoubleValue ) | ( ( rule__AtomicValuedExpression__Group_3__0 ) ) | ( ruleAtomicExpression ) );
    public final void rule__AtomicValuedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1392:1: ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleDoubleValue ) | ( ( rule__AtomicValuedExpression__Group_3__0 ) ) | ( ruleAtomicExpression ) )
            int alt7=5;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1393:1: ( ruleIntValue )
                    {
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1393:1: ( ruleIntValue )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1394:1: ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getIntValueParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIntValue_in_rule__AtomicValuedExpression__Alternatives2888);
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
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1399:6: ( ruleFloatValue )
                    {
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1399:6: ( ruleFloatValue )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1400:1: ruleFloatValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_rule__AtomicValuedExpression__Alternatives2905);
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
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1405:6: ( ruleDoubleValue )
                    {
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1405:6: ( ruleDoubleValue )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1406:1: ruleDoubleValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getDoubleValueParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDoubleValue_in_rule__AtomicValuedExpression__Alternatives2922);
                    ruleDoubleValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicValuedExpressionAccess().getDoubleValueParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1411:6: ( ( rule__AtomicValuedExpression__Group_3__0 ) )
                    {
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1411:6: ( ( rule__AtomicValuedExpression__Group_3__0 ) )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1412:1: ( rule__AtomicValuedExpression__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_3()); 
                    }
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1413:1: ( rule__AtomicValuedExpression__Group_3__0 )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1413:2: rule__AtomicValuedExpression__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_3__0_in_rule__AtomicValuedExpression__Alternatives2939);
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
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1417:6: ( ruleAtomicExpression )
                    {
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1417:6: ( ruleAtomicExpression )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1418:1: ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getAtomicExpressionParserRuleCall_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_rule__AtomicValuedExpression__Alternatives2957);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1428:1: rule__ValuedObjectTestExpression__Alternatives : ( ( ( rule__ValuedObjectTestExpression__Group_0__0 ) ) | ( ruleValuedObjectReference ) );
    public final void rule__ValuedObjectTestExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1432:1: ( ( ( rule__ValuedObjectTestExpression__Group_0__0 ) ) | ( ruleValuedObjectReference ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16||LA8_0==25) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
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
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1433:1: ( ( rule__ValuedObjectTestExpression__Group_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1433:1: ( ( rule__ValuedObjectTestExpression__Group_0__0 ) )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1434:1: ( rule__ValuedObjectTestExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getGroup_0()); 
                    }
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1435:1: ( rule__ValuedObjectTestExpression__Group_0__0 )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1435:2: rule__ValuedObjectTestExpression__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__0_in_rule__ValuedObjectTestExpression__Alternatives2989);
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
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1439:6: ( ruleValuedObjectReference )
                    {
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1439:6: ( ruleValuedObjectReference )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1440:1: ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getValuedObjectReferenceParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectReference_in_rule__ValuedObjectTestExpression__Alternatives3007);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1450:1: rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 : ( ( rulePreOperator ) | ( ruleValOperator ) );
    public final void rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1454:1: ( ( rulePreOperator ) | ( ruleValOperator ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            else if ( (LA9_0==25) ) {
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
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1455:1: ( rulePreOperator )
                    {
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1455:1: ( rulePreOperator )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1456:1: rulePreOperator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePreOperator_in_rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_03039);
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
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1461:6: ( ruleValOperator )
                    {
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1461:6: ( ruleValOperator )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1462:1: ruleValOperator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValOperatorEnumRuleCall_0_1_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValOperator_in_rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_03056);
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


    // $ANTLR start "rule__Annotation__Alternatives"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1473:1: rule__Annotation__Alternatives : ( ( ruleCommentAnnotation ) | ( ruleTagAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) );
    public final void rule__Annotation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1477:1: ( ( ruleCommentAnnotation ) | ( ruleTagAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) )
            int alt10=7;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1478:1: ( ruleCommentAnnotation )
                    {
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1478:1: ( ruleCommentAnnotation )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1479:1: ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_rule__Annotation__Alternatives3089);
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
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1484:6: ( ruleTagAnnotation )
                    {
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1484:6: ( ruleTagAnnotation )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1485:1: ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_rule__Annotation__Alternatives3106);
                    ruleTagAnnotation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1490:6: ( ruleKeyStringValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1490:6: ( ruleKeyStringValueAnnotation )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1491:1: ruleKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_rule__Annotation__Alternatives3123);
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
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1496:6: ( ruleTypedKeyStringValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1496:6: ( ruleTypedKeyStringValueAnnotation )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1497:1: ruleTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_rule__Annotation__Alternatives3140);
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
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1502:6: ( ruleKeyBooleanValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1502:6: ( ruleKeyBooleanValueAnnotation )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1503:1: ruleKeyBooleanValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_rule__Annotation__Alternatives3157);
                    ruleKeyBooleanValueAnnotation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1508:6: ( ruleKeyIntValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1508:6: ( ruleKeyIntValueAnnotation )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1509:1: ruleKeyIntValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_5()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_rule__Annotation__Alternatives3174);
                    ruleKeyIntValueAnnotation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1514:6: ( ruleKeyFloatValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1514:6: ( ruleKeyFloatValueAnnotation )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1515:1: ruleKeyFloatValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_6()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyFloatValueAnnotation_in_rule__Annotation__Alternatives3191);
                    ruleKeyFloatValueAnnotation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_6()); 
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


    // $ANTLR start "rule__EString__Alternatives"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1526:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1530:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
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
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1531:1: ( RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1531:1: ( RULE_STRING )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1532:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives3224); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1537:6: ( RULE_ID )
                    {
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1537:6: ( RULE_ID )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1538:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives3241); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__CompareOperator__Alternatives"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1548:1: rule__CompareOperator__Alternatives : ( ( ( '==' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1552:1: ( ( ( '==' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) )
            int alt12=6;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt12=1;
                }
                break;
            case 27:
                {
                alt12=2;
                }
                break;
            case 28:
                {
                alt12=3;
                }
                break;
            case 29:
                {
                alt12=4;
                }
                break;
            case 30:
                {
                alt12=5;
                }
                break;
            case 31:
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
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1553:1: ( ( '==' ) )
                    {
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1553:1: ( ( '==' ) )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1554:1: ( '==' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1555:1: ( '==' )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1555:3: '=='
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_rule__CompareOperator__Alternatives3274); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1560:6: ( ( '<' ) )
                    {
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1560:6: ( ( '<' ) )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1561:1: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1562:1: ( '<' )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1562:3: '<'
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_rule__CompareOperator__Alternatives3295); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1567:6: ( ( '<=' ) )
                    {
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1567:6: ( ( '<=' ) )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1568:1: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1569:1: ( '<=' )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1569:3: '<='
                    {
                    match(input,28,FollowSets000.FOLLOW_28_in_rule__CompareOperator__Alternatives3316); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1574:6: ( ( '>' ) )
                    {
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1574:6: ( ( '>' ) )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1575:1: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1576:1: ( '>' )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1576:3: '>'
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_rule__CompareOperator__Alternatives3337); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1581:6: ( ( '>=' ) )
                    {
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1581:6: ( ( '>=' ) )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1582:1: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1583:1: ( '>=' )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1583:3: '>='
                    {
                    match(input,30,FollowSets000.FOLLOW_30_in_rule__CompareOperator__Alternatives3358); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1588:6: ( ( '<>' ) )
                    {
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1588:6: ( ( '<>' ) )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1589:1: ( '<>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_5()); 
                    }
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1590:1: ( '<>' )
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1590:3: '<>'
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_rule__CompareOperator__Alternatives3379); if (state.failed) return ;

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


    // $ANTLR start "rule__Module__Group__0"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1604:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1608:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1609:2: rule__Module__Group__0__Impl rule__Module__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__03414);
            rule__Module__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Module__Group__1_in_rule__Module__Group__03417);
            rule__Module__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__0"


    // $ANTLR start "rule__Module__Group__0__Impl"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1616:1: rule__Module__Group__0__Impl : ( 'module' ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1620:1: ( ( 'module' ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1621:1: ( 'module' )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1621:1: ( 'module' )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1622:1: 'module'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleAccess().getModuleKeyword_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Module__Group__0__Impl3445); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuleAccess().getModuleKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__0__Impl"


    // $ANTLR start "rule__Module__Group__1"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1635:1: rule__Module__Group__1 : rule__Module__Group__1__Impl ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1639:1: ( rule__Module__Group__1__Impl )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1640:2: rule__Module__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__13476);
            rule__Module__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__1"


    // $ANTLR start "rule__Module__Group__1__Impl"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1646:1: rule__Module__Group__1__Impl : ( ( rule__Module__NameAssignment_1 ) ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1650:1: ( ( ( rule__Module__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1651:1: ( ( rule__Module__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1651:1: ( ( rule__Module__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1652:1: ( rule__Module__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1653:1: ( rule__Module__NameAssignment_1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1653:2: rule__Module__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Module__NameAssignment_1_in_rule__Module__Group__1__Impl3503);
            rule__Module__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuleAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__1__Impl"


    // $ANTLR start "rule__OrExpression__Group__0"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1667:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1671:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1672:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__03537);
            rule__OrExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__03540);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1679:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1683:1: ( ( ruleAndExpression ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1684:1: ( ruleAndExpression )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1684:1: ( ruleAndExpression )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1685:1: ruleAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_rule__OrExpression__Group__0__Impl3567);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1696:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1700:1: ( rule__OrExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1701:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__13596);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1707:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1711:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1712:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1712:1: ( ( rule__OrExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1713:1: ( rule__OrExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1714:1: ( rule__OrExpression__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==17) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1714:2: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl3623);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1728:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1732:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1733:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__03658);
            rule__OrExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__03661);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1740:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1744:1: ( ( () ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1745:1: ( () )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1745:1: ( () )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1746:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1747:1: ()
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1749:1: 
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1759:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1763:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1764:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__13719);
            rule__OrExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__2_in_rule__OrExpression__Group_1__13722);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1771:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1775:1: ( ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1776:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1776:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1777:1: ( rule__OrExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1778:1: ( rule__OrExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1778:2: rule__OrExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__OperatorAssignment_1_1_in_rule__OrExpression__Group_1__1__Impl3749);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1788:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1792:1: ( rule__OrExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1793:2: rule__OrExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__2__Impl_in_rule__OrExpression__Group_1__23779);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1799:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1803:1: ( ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1804:1: ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1804:1: ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1805:1: ( rule__OrExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1806:1: ( rule__OrExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1806:2: rule__OrExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__SubExpressionsAssignment_1_2_in_rule__OrExpression__Group_1__2__Impl3806);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1822:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1826:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1827:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__03842);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__03845);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1834:1: rule__AndExpression__Group__0__Impl : ( ruleCompareOperation ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1838:1: ( ( ruleCompareOperation ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1839:1: ( ruleCompareOperation )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1839:1: ( ruleCompareOperation )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1840:1: ruleCompareOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getCompareOperationParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_rule__AndExpression__Group__0__Impl3872);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1851:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1855:1: ( rule__AndExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1856:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__13901);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1862:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1866:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1867:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1867:1: ( ( rule__AndExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1868:1: ( rule__AndExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1869:1: ( rule__AndExpression__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==18) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1869:2: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl3928);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1883:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1887:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1888:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__03963);
            rule__AndExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__03966);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1895:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1899:1: ( ( () ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1900:1: ( () )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1900:1: ( () )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1901:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1902:1: ()
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1904:1: 
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1914:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1918:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1919:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__14024);
            rule__AndExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__2_in_rule__AndExpression__Group_1__14027);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1926:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1930:1: ( ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1931:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1931:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1932:1: ( rule__AndExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1933:1: ( rule__AndExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1933:2: rule__AndExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__OperatorAssignment_1_1_in_rule__AndExpression__Group_1__1__Impl4054);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1943:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1947:1: ( rule__AndExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1948:2: rule__AndExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__2__Impl_in_rule__AndExpression__Group_1__24084);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1954:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1958:1: ( ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1959:1: ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1959:1: ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1960:1: ( rule__AndExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1961:1: ( rule__AndExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1961:2: rule__AndExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__SubExpressionsAssignment_1_2_in_rule__AndExpression__Group_1__2__Impl4111);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1977:1: rule__CompareOperation__Group_0__0 : rule__CompareOperation__Group_0__0__Impl rule__CompareOperation__Group_0__1 ;
    public final void rule__CompareOperation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1981:1: ( rule__CompareOperation__Group_0__0__Impl rule__CompareOperation__Group_0__1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1982:2: rule__CompareOperation__Group_0__0__Impl rule__CompareOperation__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0__0__Impl_in_rule__CompareOperation__Group_0__04147);
            rule__CompareOperation__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0__1_in_rule__CompareOperation__Group_0__04150);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1989:1: rule__CompareOperation__Group_0__0__Impl : ( ( ruleNotOrValuedExpression ) ) ;
    public final void rule__CompareOperation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1993:1: ( ( ( ruleNotOrValuedExpression ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1994:1: ( ( ruleNotOrValuedExpression ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1994:1: ( ( ruleNotOrValuedExpression ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1995:1: ( ruleNotOrValuedExpression )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0_0()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1996:1: ( ruleNotOrValuedExpression )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1996:3: ruleNotOrValuedExpression
            {
            pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_rule__CompareOperation__Group_0__0__Impl4178);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2006:1: rule__CompareOperation__Group_0__1 : rule__CompareOperation__Group_0__1__Impl ;
    public final void rule__CompareOperation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2010:1: ( rule__CompareOperation__Group_0__1__Impl )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2011:2: rule__CompareOperation__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0__1__Impl_in_rule__CompareOperation__Group_0__14208);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2017:1: rule__CompareOperation__Group_0__1__Impl : ( ( rule__CompareOperation__Group_0_1__0 ) ) ;
    public final void rule__CompareOperation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2021:1: ( ( ( rule__CompareOperation__Group_0_1__0 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2022:1: ( ( rule__CompareOperation__Group_0_1__0 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2022:1: ( ( rule__CompareOperation__Group_0_1__0 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2023:1: ( rule__CompareOperation__Group_0_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGroup_0_1()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2024:1: ( rule__CompareOperation__Group_0_1__0 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2024:2: rule__CompareOperation__Group_0_1__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__0_in_rule__CompareOperation__Group_0__1__Impl4235);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2038:1: rule__CompareOperation__Group_0_1__0 : rule__CompareOperation__Group_0_1__0__Impl rule__CompareOperation__Group_0_1__1 ;
    public final void rule__CompareOperation__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2042:1: ( rule__CompareOperation__Group_0_1__0__Impl rule__CompareOperation__Group_0_1__1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2043:2: rule__CompareOperation__Group_0_1__0__Impl rule__CompareOperation__Group_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__0__Impl_in_rule__CompareOperation__Group_0_1__04269);
            rule__CompareOperation__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__1_in_rule__CompareOperation__Group_0_1__04272);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2050:1: rule__CompareOperation__Group_0_1__0__Impl : ( () ) ;
    public final void rule__CompareOperation__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2054:1: ( ( () ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2055:1: ( () )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2055:1: ( () )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2056:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_0_1_0()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2057:1: ()
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2059:1: 
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2069:1: rule__CompareOperation__Group_0_1__1 : rule__CompareOperation__Group_0_1__1__Impl rule__CompareOperation__Group_0_1__2 ;
    public final void rule__CompareOperation__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2073:1: ( rule__CompareOperation__Group_0_1__1__Impl rule__CompareOperation__Group_0_1__2 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2074:2: rule__CompareOperation__Group_0_1__1__Impl rule__CompareOperation__Group_0_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__1__Impl_in_rule__CompareOperation__Group_0_1__14330);
            rule__CompareOperation__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__2_in_rule__CompareOperation__Group_0_1__14333);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2081:1: rule__CompareOperation__Group_0_1__1__Impl : ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) ) ;
    public final void rule__CompareOperation__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2085:1: ( ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2086:1: ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2086:1: ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2087:1: ( rule__CompareOperation__OperatorAssignment_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorAssignment_0_1_1()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2088:1: ( rule__CompareOperation__OperatorAssignment_0_1_1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2088:2: rule__CompareOperation__OperatorAssignment_0_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__OperatorAssignment_0_1_1_in_rule__CompareOperation__Group_0_1__1__Impl4360);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2098:1: rule__CompareOperation__Group_0_1__2 : rule__CompareOperation__Group_0_1__2__Impl ;
    public final void rule__CompareOperation__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2102:1: ( rule__CompareOperation__Group_0_1__2__Impl )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2103:2: rule__CompareOperation__Group_0_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__2__Impl_in_rule__CompareOperation__Group_0_1__24390);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2109:1: rule__CompareOperation__Group_0_1__2__Impl : ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) ) ;
    public final void rule__CompareOperation__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2113:1: ( ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2114:1: ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2114:1: ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2115:1: ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsAssignment_0_1_2()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2116:1: ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2116:2: rule__CompareOperation__SubExpressionsAssignment_0_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__SubExpressionsAssignment_0_1_2_in_rule__CompareOperation__Group_0_1__2__Impl4417);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2132:1: rule__NotExpression__Group_0__0 : rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1 ;
    public final void rule__NotExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2136:1: ( rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2137:2: rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__0__Impl_in_rule__NotExpression__Group_0__04453);
            rule__NotExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__1_in_rule__NotExpression__Group_0__04456);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2144:1: rule__NotExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__NotExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2148:1: ( ( () ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2149:1: ( () )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2149:1: ( () )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2150:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2151:1: ()
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2153:1: 
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2163:1: rule__NotExpression__Group_0__1 : rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2 ;
    public final void rule__NotExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2167:1: ( rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2168:2: rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__1__Impl_in_rule__NotExpression__Group_0__14514);
            rule__NotExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__2_in_rule__NotExpression__Group_0__14517);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2175:1: rule__NotExpression__Group_0__1__Impl : ( ( rule__NotExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__NotExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2179:1: ( ( ( rule__NotExpression__OperatorAssignment_0_1 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2180:1: ( ( rule__NotExpression__OperatorAssignment_0_1 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2180:1: ( ( rule__NotExpression__OperatorAssignment_0_1 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2181:1: ( rule__NotExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2182:1: ( rule__NotExpression__OperatorAssignment_0_1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2182:2: rule__NotExpression__OperatorAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__OperatorAssignment_0_1_in_rule__NotExpression__Group_0__1__Impl4544);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2192:1: rule__NotExpression__Group_0__2 : rule__NotExpression__Group_0__2__Impl ;
    public final void rule__NotExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2196:1: ( rule__NotExpression__Group_0__2__Impl )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2197:2: rule__NotExpression__Group_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__2__Impl_in_rule__NotExpression__Group_0__24574);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2203:1: rule__NotExpression__Group_0__2__Impl : ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) ) ;
    public final void rule__NotExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2207:1: ( ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2208:1: ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2208:1: ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2209:1: ( rule__NotExpression__SubExpressionsAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubExpressionsAssignment_0_2()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2210:1: ( rule__NotExpression__SubExpressionsAssignment_0_2 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2210:2: rule__NotExpression__SubExpressionsAssignment_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__SubExpressionsAssignment_0_2_in_rule__NotExpression__Group_0__2__Impl4601);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2226:1: rule__AddExpression__Group__0 : rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 ;
    public final void rule__AddExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2230:1: ( rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2231:2: rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__0__Impl_in_rule__AddExpression__Group__04637);
            rule__AddExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__1_in_rule__AddExpression__Group__04640);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2238:1: rule__AddExpression__Group__0__Impl : ( ruleSubExpression ) ;
    public final void rule__AddExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2242:1: ( ( ruleSubExpression ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2243:1: ( ruleSubExpression )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2243:1: ( ruleSubExpression )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2244:1: ruleSubExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_rule__AddExpression__Group__0__Impl4667);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2255:1: rule__AddExpression__Group__1 : rule__AddExpression__Group__1__Impl ;
    public final void rule__AddExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2259:1: ( rule__AddExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2260:2: rule__AddExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__1__Impl_in_rule__AddExpression__Group__14696);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2266:1: rule__AddExpression__Group__1__Impl : ( ( rule__AddExpression__Group_1__0 )* ) ;
    public final void rule__AddExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2270:1: ( ( ( rule__AddExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2271:1: ( ( rule__AddExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2271:1: ( ( rule__AddExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2272:1: ( rule__AddExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2273:1: ( rule__AddExpression__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==20) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2273:2: rule__AddExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__0_in_rule__AddExpression__Group__1__Impl4723);
            	    rule__AddExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2287:1: rule__AddExpression__Group_1__0 : rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 ;
    public final void rule__AddExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2291:1: ( rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2292:2: rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__0__Impl_in_rule__AddExpression__Group_1__04758);
            rule__AddExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__1_in_rule__AddExpression__Group_1__04761);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2299:1: rule__AddExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AddExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2303:1: ( ( () ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2304:1: ( () )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2304:1: ( () )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2305:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2306:1: ()
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2308:1: 
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2318:1: rule__AddExpression__Group_1__1 : rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2 ;
    public final void rule__AddExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2322:1: ( rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2323:2: rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__1__Impl_in_rule__AddExpression__Group_1__14819);
            rule__AddExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__2_in_rule__AddExpression__Group_1__14822);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2330:1: rule__AddExpression__Group_1__1__Impl : ( ( rule__AddExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AddExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2334:1: ( ( ( rule__AddExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2335:1: ( ( rule__AddExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2335:1: ( ( rule__AddExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2336:1: ( rule__AddExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2337:1: ( rule__AddExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2337:2: rule__AddExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__OperatorAssignment_1_1_in_rule__AddExpression__Group_1__1__Impl4849);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2347:1: rule__AddExpression__Group_1__2 : rule__AddExpression__Group_1__2__Impl ;
    public final void rule__AddExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2351:1: ( rule__AddExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2352:2: rule__AddExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__2__Impl_in_rule__AddExpression__Group_1__24879);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2358:1: rule__AddExpression__Group_1__2__Impl : ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__AddExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2362:1: ( ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2363:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2363:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2364:1: ( rule__AddExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2365:1: ( rule__AddExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2365:2: rule__AddExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__SubExpressionsAssignment_1_2_in_rule__AddExpression__Group_1__2__Impl4906);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2381:1: rule__SubExpression__Group__0 : rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 ;
    public final void rule__SubExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2385:1: ( rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2386:2: rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group__0__Impl_in_rule__SubExpression__Group__04942);
            rule__SubExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group__1_in_rule__SubExpression__Group__04945);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2393:1: rule__SubExpression__Group__0__Impl : ( ruleMultExpression ) ;
    public final void rule__SubExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2397:1: ( ( ruleMultExpression ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2398:1: ( ruleMultExpression )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2398:1: ( ruleMultExpression )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2399:1: ruleMultExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_rule__SubExpression__Group__0__Impl4972);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2410:1: rule__SubExpression__Group__1 : rule__SubExpression__Group__1__Impl ;
    public final void rule__SubExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2414:1: ( rule__SubExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2415:2: rule__SubExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group__1__Impl_in_rule__SubExpression__Group__15001);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2421:1: rule__SubExpression__Group__1__Impl : ( ( rule__SubExpression__Group_1__0 )* ) ;
    public final void rule__SubExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2425:1: ( ( ( rule__SubExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2426:1: ( ( rule__SubExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2426:1: ( ( rule__SubExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2427:1: ( rule__SubExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2428:1: ( rule__SubExpression__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==21) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2428:2: rule__SubExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__0_in_rule__SubExpression__Group__1__Impl5028);
            	    rule__SubExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2442:1: rule__SubExpression__Group_1__0 : rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 ;
    public final void rule__SubExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2446:1: ( rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2447:2: rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__0__Impl_in_rule__SubExpression__Group_1__05063);
            rule__SubExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__1_in_rule__SubExpression__Group_1__05066);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2454:1: rule__SubExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__SubExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2458:1: ( ( () ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2459:1: ( () )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2459:1: ( () )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2460:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2461:1: ()
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2463:1: 
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2473:1: rule__SubExpression__Group_1__1 : rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2 ;
    public final void rule__SubExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2477:1: ( rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2478:2: rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__1__Impl_in_rule__SubExpression__Group_1__15124);
            rule__SubExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__2_in_rule__SubExpression__Group_1__15127);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2485:1: rule__SubExpression__Group_1__1__Impl : ( ( rule__SubExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__SubExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2489:1: ( ( ( rule__SubExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2490:1: ( ( rule__SubExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2490:1: ( ( rule__SubExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2491:1: ( rule__SubExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2492:1: ( rule__SubExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2492:2: rule__SubExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__OperatorAssignment_1_1_in_rule__SubExpression__Group_1__1__Impl5154);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2502:1: rule__SubExpression__Group_1__2 : rule__SubExpression__Group_1__2__Impl ;
    public final void rule__SubExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2506:1: ( rule__SubExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2507:2: rule__SubExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__2__Impl_in_rule__SubExpression__Group_1__25184);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2513:1: rule__SubExpression__Group_1__2__Impl : ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__SubExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2517:1: ( ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2518:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2518:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2519:1: ( rule__SubExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2520:1: ( rule__SubExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2520:2: rule__SubExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__SubExpressionsAssignment_1_2_in_rule__SubExpression__Group_1__2__Impl5211);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2536:1: rule__MultExpression__Group__0 : rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 ;
    public final void rule__MultExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2540:1: ( rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2541:2: rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__0__Impl_in_rule__MultExpression__Group__05247);
            rule__MultExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__1_in_rule__MultExpression__Group__05250);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2548:1: rule__MultExpression__Group__0__Impl : ( ruleDivExpression ) ;
    public final void rule__MultExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2552:1: ( ( ruleDivExpression ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2553:1: ( ruleDivExpression )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2553:1: ( ruleDivExpression )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2554:1: ruleDivExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getDivExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_rule__MultExpression__Group__0__Impl5277);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2565:1: rule__MultExpression__Group__1 : rule__MultExpression__Group__1__Impl ;
    public final void rule__MultExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2569:1: ( rule__MultExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2570:2: rule__MultExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__1__Impl_in_rule__MultExpression__Group__15306);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2576:1: rule__MultExpression__Group__1__Impl : ( ( rule__MultExpression__Group_1__0 )* ) ;
    public final void rule__MultExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2580:1: ( ( ( rule__MultExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2581:1: ( ( rule__MultExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2581:1: ( ( rule__MultExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2582:1: ( rule__MultExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2583:1: ( rule__MultExpression__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==22) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2583:2: rule__MultExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__0_in_rule__MultExpression__Group__1__Impl5333);
            	    rule__MultExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2597:1: rule__MultExpression__Group_1__0 : rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 ;
    public final void rule__MultExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2601:1: ( rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2602:2: rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__0__Impl_in_rule__MultExpression__Group_1__05368);
            rule__MultExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__1_in_rule__MultExpression__Group_1__05371);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2609:1: rule__MultExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2613:1: ( ( () ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2614:1: ( () )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2614:1: ( () )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2615:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2616:1: ()
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2618:1: 
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2628:1: rule__MultExpression__Group_1__1 : rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2 ;
    public final void rule__MultExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2632:1: ( rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2633:2: rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__1__Impl_in_rule__MultExpression__Group_1__15429);
            rule__MultExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__2_in_rule__MultExpression__Group_1__15432);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2640:1: rule__MultExpression__Group_1__1__Impl : ( ( rule__MultExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2644:1: ( ( ( rule__MultExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2645:1: ( ( rule__MultExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2645:1: ( ( rule__MultExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2646:1: ( rule__MultExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2647:1: ( rule__MultExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2647:2: rule__MultExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__OperatorAssignment_1_1_in_rule__MultExpression__Group_1__1__Impl5459);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2657:1: rule__MultExpression__Group_1__2 : rule__MultExpression__Group_1__2__Impl ;
    public final void rule__MultExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2661:1: ( rule__MultExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2662:2: rule__MultExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__2__Impl_in_rule__MultExpression__Group_1__25489);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2668:1: rule__MultExpression__Group_1__2__Impl : ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__MultExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2672:1: ( ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2673:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2673:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2674:1: ( rule__MultExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2675:1: ( rule__MultExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2675:2: rule__MultExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__SubExpressionsAssignment_1_2_in_rule__MultExpression__Group_1__2__Impl5516);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2691:1: rule__DivExpression__Group__0 : rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1 ;
    public final void rule__DivExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2695:1: ( rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2696:2: rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group__0__Impl_in_rule__DivExpression__Group__05552);
            rule__DivExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group__1_in_rule__DivExpression__Group__05555);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2703:1: rule__DivExpression__Group__0__Impl : ( ruleModExpression ) ;
    public final void rule__DivExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2707:1: ( ( ruleModExpression ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2708:1: ( ruleModExpression )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2708:1: ( ruleModExpression )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2709:1: ruleModExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getModExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_rule__DivExpression__Group__0__Impl5582);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2720:1: rule__DivExpression__Group__1 : rule__DivExpression__Group__1__Impl ;
    public final void rule__DivExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2724:1: ( rule__DivExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2725:2: rule__DivExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group__1__Impl_in_rule__DivExpression__Group__15611);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2731:1: rule__DivExpression__Group__1__Impl : ( ( rule__DivExpression__Group_1__0 )? ) ;
    public final void rule__DivExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2735:1: ( ( ( rule__DivExpression__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2736:1: ( ( rule__DivExpression__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2736:1: ( ( rule__DivExpression__Group_1__0 )? )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2737:1: ( rule__DivExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2738:1: ( rule__DivExpression__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2738:2: rule__DivExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group_1__0_in_rule__DivExpression__Group__1__Impl5638);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2752:1: rule__DivExpression__Group_1__0 : rule__DivExpression__Group_1__0__Impl rule__DivExpression__Group_1__1 ;
    public final void rule__DivExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2756:1: ( rule__DivExpression__Group_1__0__Impl rule__DivExpression__Group_1__1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2757:2: rule__DivExpression__Group_1__0__Impl rule__DivExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group_1__0__Impl_in_rule__DivExpression__Group_1__05673);
            rule__DivExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group_1__1_in_rule__DivExpression__Group_1__05676);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2764:1: rule__DivExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__DivExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2768:1: ( ( () ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2769:1: ( () )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2769:1: ( () )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2770:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2771:1: ()
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2773:1: 
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2783:1: rule__DivExpression__Group_1__1 : rule__DivExpression__Group_1__1__Impl rule__DivExpression__Group_1__2 ;
    public final void rule__DivExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2787:1: ( rule__DivExpression__Group_1__1__Impl rule__DivExpression__Group_1__2 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2788:2: rule__DivExpression__Group_1__1__Impl rule__DivExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group_1__1__Impl_in_rule__DivExpression__Group_1__15734);
            rule__DivExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group_1__2_in_rule__DivExpression__Group_1__15737);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2795:1: rule__DivExpression__Group_1__1__Impl : ( ( rule__DivExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__DivExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2799:1: ( ( ( rule__DivExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2800:1: ( ( rule__DivExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2800:1: ( ( rule__DivExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2801:1: ( rule__DivExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2802:1: ( rule__DivExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2802:2: rule__DivExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__OperatorAssignment_1_1_in_rule__DivExpression__Group_1__1__Impl5764);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2812:1: rule__DivExpression__Group_1__2 : rule__DivExpression__Group_1__2__Impl ;
    public final void rule__DivExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2816:1: ( rule__DivExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2817:2: rule__DivExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group_1__2__Impl_in_rule__DivExpression__Group_1__25794);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2823:1: rule__DivExpression__Group_1__2__Impl : ( ( rule__DivExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__DivExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2827:1: ( ( ( rule__DivExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2828:1: ( ( rule__DivExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2828:1: ( ( rule__DivExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2829:1: ( rule__DivExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2830:1: ( rule__DivExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2830:2: rule__DivExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__SubExpressionsAssignment_1_2_in_rule__DivExpression__Group_1__2__Impl5821);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2846:1: rule__ModExpression__Group__0 : rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1 ;
    public final void rule__ModExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2850:1: ( rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2851:2: rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group__0__Impl_in_rule__ModExpression__Group__05857);
            rule__ModExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group__1_in_rule__ModExpression__Group__05860);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2858:1: rule__ModExpression__Group__0__Impl : ( ruleNegExpression ) ;
    public final void rule__ModExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2862:1: ( ( ruleNegExpression ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2863:1: ( ruleNegExpression )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2863:1: ( ruleNegExpression )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2864:1: ruleNegExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getNegExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_rule__ModExpression__Group__0__Impl5887);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2875:1: rule__ModExpression__Group__1 : rule__ModExpression__Group__1__Impl ;
    public final void rule__ModExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2879:1: ( rule__ModExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2880:2: rule__ModExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group__1__Impl_in_rule__ModExpression__Group__15916);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2886:1: rule__ModExpression__Group__1__Impl : ( ( rule__ModExpression__Group_1__0 )? ) ;
    public final void rule__ModExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2890:1: ( ( ( rule__ModExpression__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2891:1: ( ( rule__ModExpression__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2891:1: ( ( rule__ModExpression__Group_1__0 )? )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2892:1: ( rule__ModExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2893:1: ( rule__ModExpression__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2893:2: rule__ModExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__0_in_rule__ModExpression__Group__1__Impl5943);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2907:1: rule__ModExpression__Group_1__0 : rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1 ;
    public final void rule__ModExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2911:1: ( rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2912:2: rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__0__Impl_in_rule__ModExpression__Group_1__05978);
            rule__ModExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__1_in_rule__ModExpression__Group_1__05981);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2919:1: rule__ModExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ModExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2923:1: ( ( () ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2924:1: ( () )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2924:1: ( () )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2925:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2926:1: ()
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2928:1: 
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2938:1: rule__ModExpression__Group_1__1 : rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2 ;
    public final void rule__ModExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2942:1: ( rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2943:2: rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__1__Impl_in_rule__ModExpression__Group_1__16039);
            rule__ModExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__2_in_rule__ModExpression__Group_1__16042);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2950:1: rule__ModExpression__Group_1__1__Impl : ( ( rule__ModExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ModExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2954:1: ( ( ( rule__ModExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2955:1: ( ( rule__ModExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2955:1: ( ( rule__ModExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2956:1: ( rule__ModExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2957:1: ( rule__ModExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2957:2: rule__ModExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__OperatorAssignment_1_1_in_rule__ModExpression__Group_1__1__Impl6069);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2967:1: rule__ModExpression__Group_1__2 : rule__ModExpression__Group_1__2__Impl ;
    public final void rule__ModExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2971:1: ( rule__ModExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2972:2: rule__ModExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__2__Impl_in_rule__ModExpression__Group_1__26099);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2978:1: rule__ModExpression__Group_1__2__Impl : ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__ModExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2982:1: ( ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2983:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2983:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2984:1: ( rule__ModExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2985:1: ( rule__ModExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:2985:2: rule__ModExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__SubExpressionsAssignment_1_2_in_rule__ModExpression__Group_1__2__Impl6126);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3001:1: rule__NegExpression__Group_0__0 : rule__NegExpression__Group_0__0__Impl rule__NegExpression__Group_0__1 ;
    public final void rule__NegExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3005:1: ( rule__NegExpression__Group_0__0__Impl rule__NegExpression__Group_0__1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3006:2: rule__NegExpression__Group_0__0__Impl rule__NegExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__Group_0__0__Impl_in_rule__NegExpression__Group_0__06162);
            rule__NegExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__Group_0__1_in_rule__NegExpression__Group_0__06165);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3013:1: rule__NegExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__NegExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3017:1: ( ( () ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3018:1: ( () )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3018:1: ( () )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3019:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3020:1: ()
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3022:1: 
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3032:1: rule__NegExpression__Group_0__1 : rule__NegExpression__Group_0__1__Impl rule__NegExpression__Group_0__2 ;
    public final void rule__NegExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3036:1: ( rule__NegExpression__Group_0__1__Impl rule__NegExpression__Group_0__2 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3037:2: rule__NegExpression__Group_0__1__Impl rule__NegExpression__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__Group_0__1__Impl_in_rule__NegExpression__Group_0__16223);
            rule__NegExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__Group_0__2_in_rule__NegExpression__Group_0__16226);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3044:1: rule__NegExpression__Group_0__1__Impl : ( ( rule__NegExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__NegExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3048:1: ( ( ( rule__NegExpression__OperatorAssignment_0_1 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3049:1: ( ( rule__NegExpression__OperatorAssignment_0_1 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3049:1: ( ( rule__NegExpression__OperatorAssignment_0_1 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3050:1: ( rule__NegExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3051:1: ( rule__NegExpression__OperatorAssignment_0_1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3051:2: rule__NegExpression__OperatorAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__OperatorAssignment_0_1_in_rule__NegExpression__Group_0__1__Impl6253);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3061:1: rule__NegExpression__Group_0__2 : rule__NegExpression__Group_0__2__Impl ;
    public final void rule__NegExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3065:1: ( rule__NegExpression__Group_0__2__Impl )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3066:2: rule__NegExpression__Group_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__Group_0__2__Impl_in_rule__NegExpression__Group_0__26283);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3072:1: rule__NegExpression__Group_0__2__Impl : ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) ) ;
    public final void rule__NegExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3076:1: ( ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3077:1: ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3077:1: ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3078:1: ( rule__NegExpression__SubExpressionsAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getSubExpressionsAssignment_0_2()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3079:1: ( rule__NegExpression__SubExpressionsAssignment_0_2 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3079:2: rule__NegExpression__SubExpressionsAssignment_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__SubExpressionsAssignment_0_2_in_rule__NegExpression__Group_0__2__Impl6310);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3095:1: rule__AtomicExpression__Group_2__0 : rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 ;
    public final void rule__AtomicExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3099:1: ( rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3100:2: rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__0__Impl_in_rule__AtomicExpression__Group_2__06346);
            rule__AtomicExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__1_in_rule__AtomicExpression__Group_2__06349);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3107:1: rule__AtomicExpression__Group_2__0__Impl : ( '(' ) ;
    public final void rule__AtomicExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3111:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3112:1: ( '(' )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3112:1: ( '(' )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3113:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__AtomicExpression__Group_2__0__Impl6377); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3126:1: rule__AtomicExpression__Group_2__1 : rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2 ;
    public final void rule__AtomicExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3130:1: ( rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3131:2: rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__1__Impl_in_rule__AtomicExpression__Group_2__16408);
            rule__AtomicExpression__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__2_in_rule__AtomicExpression__Group_2__16411);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3138:1: rule__AtomicExpression__Group_2__1__Impl : ( ruleBoolExpression ) ;
    public final void rule__AtomicExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3142:1: ( ( ruleBoolExpression ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3143:1: ( ruleBoolExpression )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3143:1: ( ruleBoolExpression )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3144:1: ruleBoolExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getBoolExpressionParserRuleCall_2_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_rule__AtomicExpression__Group_2__1__Impl6438);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3155:1: rule__AtomicExpression__Group_2__2 : rule__AtomicExpression__Group_2__2__Impl ;
    public final void rule__AtomicExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3159:1: ( rule__AtomicExpression__Group_2__2__Impl )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3160:2: rule__AtomicExpression__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__2__Impl_in_rule__AtomicExpression__Group_2__26467);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3166:1: rule__AtomicExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__AtomicExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3170:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3171:1: ( ')' )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3171:1: ( ')' )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3172:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__AtomicExpression__Group_2__2__Impl6495); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3191:1: rule__AtomicValuedExpression__Group_3__0 : rule__AtomicValuedExpression__Group_3__0__Impl rule__AtomicValuedExpression__Group_3__1 ;
    public final void rule__AtomicValuedExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3195:1: ( rule__AtomicValuedExpression__Group_3__0__Impl rule__AtomicValuedExpression__Group_3__1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3196:2: rule__AtomicValuedExpression__Group_3__0__Impl rule__AtomicValuedExpression__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_3__0__Impl_in_rule__AtomicValuedExpression__Group_3__06532);
            rule__AtomicValuedExpression__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_3__1_in_rule__AtomicValuedExpression__Group_3__06535);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3203:1: rule__AtomicValuedExpression__Group_3__0__Impl : ( ( '(' ) ) ;
    public final void rule__AtomicValuedExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3207:1: ( ( ( '(' ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3208:1: ( ( '(' ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3208:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3209:1: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3210:1: ( '(' )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3211:2: '('
            {
            match(input,33,FollowSets000.FOLLOW_33_in_rule__AtomicValuedExpression__Group_3__0__Impl6564); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3222:1: rule__AtomicValuedExpression__Group_3__1 : rule__AtomicValuedExpression__Group_3__1__Impl rule__AtomicValuedExpression__Group_3__2 ;
    public final void rule__AtomicValuedExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3226:1: ( rule__AtomicValuedExpression__Group_3__1__Impl rule__AtomicValuedExpression__Group_3__2 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3227:2: rule__AtomicValuedExpression__Group_3__1__Impl rule__AtomicValuedExpression__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_3__1__Impl_in_rule__AtomicValuedExpression__Group_3__16596);
            rule__AtomicValuedExpression__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_3__2_in_rule__AtomicValuedExpression__Group_3__16599);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3234:1: rule__AtomicValuedExpression__Group_3__1__Impl : ( ruleValuedExpression ) ;
    public final void rule__AtomicValuedExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3238:1: ( ( ruleValuedExpression ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3239:1: ( ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3239:1: ( ruleValuedExpression )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3240:1: ruleValuedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_3_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_rule__AtomicValuedExpression__Group_3__1__Impl6626);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3251:1: rule__AtomicValuedExpression__Group_3__2 : rule__AtomicValuedExpression__Group_3__2__Impl ;
    public final void rule__AtomicValuedExpression__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3255:1: ( rule__AtomicValuedExpression__Group_3__2__Impl )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3256:2: rule__AtomicValuedExpression__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_3__2__Impl_in_rule__AtomicValuedExpression__Group_3__26655);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3262:1: rule__AtomicValuedExpression__Group_3__2__Impl : ( ')' ) ;
    public final void rule__AtomicValuedExpression__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3266:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3267:1: ( ')' )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3267:1: ( ')' )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3268:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__AtomicValuedExpression__Group_3__2__Impl6683); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3287:1: rule__ValuedObjectTestExpression__Group_0__0 : rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1 ;
    public final void rule__ValuedObjectTestExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3291:1: ( rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3292:2: rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__0__Impl_in_rule__ValuedObjectTestExpression__Group_0__06720);
            rule__ValuedObjectTestExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__1_in_rule__ValuedObjectTestExpression__Group_0__06723);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3299:1: rule__ValuedObjectTestExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3303:1: ( ( () ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3304:1: ( () )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3304:1: ( () )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3305:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3306:1: ()
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3308:1: 
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3318:1: rule__ValuedObjectTestExpression__Group_0__1 : rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2 ;
    public final void rule__ValuedObjectTestExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3322:1: ( rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3323:2: rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__1__Impl_in_rule__ValuedObjectTestExpression__Group_0__16781);
            rule__ValuedObjectTestExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__2_in_rule__ValuedObjectTestExpression__Group_0__16784);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3330:1: rule__ValuedObjectTestExpression__Group_0__1__Impl : ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3334:1: ( ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3335:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3335:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3336:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3337:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3337:2: rule__ValuedObjectTestExpression__OperatorAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__OperatorAssignment_0_1_in_rule__ValuedObjectTestExpression__Group_0__1__Impl6811);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3347:1: rule__ValuedObjectTestExpression__Group_0__2 : rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3 ;
    public final void rule__ValuedObjectTestExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3351:1: ( rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3352:2: rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__2__Impl_in_rule__ValuedObjectTestExpression__Group_0__26841);
            rule__ValuedObjectTestExpression__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__3_in_rule__ValuedObjectTestExpression__Group_0__26844);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3359:1: rule__ValuedObjectTestExpression__Group_0__2__Impl : ( '(' ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3363:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3364:1: ( '(' )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3364:1: ( '(' )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3365:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__ValuedObjectTestExpression__Group_0__2__Impl6872); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3378:1: rule__ValuedObjectTestExpression__Group_0__3 : rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4 ;
    public final void rule__ValuedObjectTestExpression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3382:1: ( rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3383:2: rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__3__Impl_in_rule__ValuedObjectTestExpression__Group_0__36903);
            rule__ValuedObjectTestExpression__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__4_in_rule__ValuedObjectTestExpression__Group_0__36906);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3390:1: rule__ValuedObjectTestExpression__Group_0__3__Impl : ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3394:1: ( ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3395:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3395:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3396:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsAssignment_0_3()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3397:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3397:2: rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3_in_rule__ValuedObjectTestExpression__Group_0__3__Impl6933);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3407:1: rule__ValuedObjectTestExpression__Group_0__4 : rule__ValuedObjectTestExpression__Group_0__4__Impl ;
    public final void rule__ValuedObjectTestExpression__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3411:1: ( rule__ValuedObjectTestExpression__Group_0__4__Impl )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3412:2: rule__ValuedObjectTestExpression__Group_0__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__4__Impl_in_rule__ValuedObjectTestExpression__Group_0__46963);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3418:1: rule__ValuedObjectTestExpression__Group_0__4__Impl : ( ')' ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3422:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3423:1: ( ')' )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3423:1: ( ')' )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3424:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__ValuedObjectTestExpression__Group_0__4__Impl6991); if (state.failed) return ;
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


    // $ANTLR start "rule__TagAnnotation__Group__0"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3447:1: rule__TagAnnotation__Group__0 : rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 ;
    public final void rule__TagAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3451:1: ( rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3452:2: rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__0__Impl_in_rule__TagAnnotation__Group__07032);
            rule__TagAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__1_in_rule__TagAnnotation__Group__07035);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3459:1: rule__TagAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TagAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3463:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3464:1: ( '@' )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3464:1: ( '@' )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3465:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__TagAnnotation__Group__0__Impl7063); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3478:1: rule__TagAnnotation__Group__1 : rule__TagAnnotation__Group__1__Impl rule__TagAnnotation__Group__2 ;
    public final void rule__TagAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3482:1: ( rule__TagAnnotation__Group__1__Impl rule__TagAnnotation__Group__2 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3483:2: rule__TagAnnotation__Group__1__Impl rule__TagAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__1__Impl_in_rule__TagAnnotation__Group__17094);
            rule__TagAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__2_in_rule__TagAnnotation__Group__17097);
            rule__TagAnnotation__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3490:1: rule__TagAnnotation__Group__1__Impl : ( ( rule__TagAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TagAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3494:1: ( ( ( rule__TagAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3495:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3495:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3496:1: ( rule__TagAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3497:1: ( rule__TagAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3497:2: rule__TagAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__NameAssignment_1_in_rule__TagAnnotation__Group__1__Impl7124);
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


    // $ANTLR start "rule__TagAnnotation__Group__2"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3507:1: rule__TagAnnotation__Group__2 : rule__TagAnnotation__Group__2__Impl ;
    public final void rule__TagAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3511:1: ( rule__TagAnnotation__Group__2__Impl )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3512:2: rule__TagAnnotation__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__2__Impl_in_rule__TagAnnotation__Group__27154);
            rule__TagAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagAnnotation__Group__2"


    // $ANTLR start "rule__TagAnnotation__Group__2__Impl"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3518:1: rule__TagAnnotation__Group__2__Impl : ( ( rule__TagAnnotation__Group_2__0 )? ) ;
    public final void rule__TagAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3522:1: ( ( ( rule__TagAnnotation__Group_2__0 )? ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3523:1: ( ( rule__TagAnnotation__Group_2__0 )? )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3523:1: ( ( rule__TagAnnotation__Group_2__0 )? )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3524:1: ( rule__TagAnnotation__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getGroup_2()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3525:1: ( rule__TagAnnotation__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3525:2: rule__TagAnnotation__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__0_in_rule__TagAnnotation__Group__2__Impl7181);
                    rule__TagAnnotation__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagAnnotationAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagAnnotation__Group__2__Impl"


    // $ANTLR start "rule__TagAnnotation__Group_2__0"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3541:1: rule__TagAnnotation__Group_2__0 : rule__TagAnnotation__Group_2__0__Impl rule__TagAnnotation__Group_2__1 ;
    public final void rule__TagAnnotation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3545:1: ( rule__TagAnnotation__Group_2__0__Impl rule__TagAnnotation__Group_2__1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3546:2: rule__TagAnnotation__Group_2__0__Impl rule__TagAnnotation__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__0__Impl_in_rule__TagAnnotation__Group_2__07218);
            rule__TagAnnotation__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__1_in_rule__TagAnnotation__Group_2__07221);
            rule__TagAnnotation__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagAnnotation__Group_2__0"


    // $ANTLR start "rule__TagAnnotation__Group_2__0__Impl"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3553:1: rule__TagAnnotation__Group_2__0__Impl : ( '(' ) ;
    public final void rule__TagAnnotation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3557:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3558:1: ( '(' )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3558:1: ( '(' )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3559:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__TagAnnotation__Group_2__0__Impl7249); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagAnnotationAccess().getLeftParenthesisKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagAnnotation__Group_2__0__Impl"


    // $ANTLR start "rule__TagAnnotation__Group_2__1"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3572:1: rule__TagAnnotation__Group_2__1 : rule__TagAnnotation__Group_2__1__Impl rule__TagAnnotation__Group_2__2 ;
    public final void rule__TagAnnotation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3576:1: ( rule__TagAnnotation__Group_2__1__Impl rule__TagAnnotation__Group_2__2 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3577:2: rule__TagAnnotation__Group_2__1__Impl rule__TagAnnotation__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__1__Impl_in_rule__TagAnnotation__Group_2__17280);
            rule__TagAnnotation__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__2_in_rule__TagAnnotation__Group_2__17283);
            rule__TagAnnotation__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagAnnotation__Group_2__1"


    // $ANTLR start "rule__TagAnnotation__Group_2__1__Impl"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3584:1: rule__TagAnnotation__Group_2__1__Impl : ( ( rule__TagAnnotation__AnnotationsAssignment_2_1 )* ) ;
    public final void rule__TagAnnotation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3588:1: ( ( ( rule__TagAnnotation__AnnotationsAssignment_2_1 )* ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3589:1: ( ( rule__TagAnnotation__AnnotationsAssignment_2_1 )* )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3589:1: ( ( rule__TagAnnotation__AnnotationsAssignment_2_1 )* )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3590:1: ( rule__TagAnnotation__AnnotationsAssignment_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getAnnotationsAssignment_2_1()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3591:1: ( rule__TagAnnotation__AnnotationsAssignment_2_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_COMMENT_ANNOTATION||LA21_0==35) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3591:2: rule__TagAnnotation__AnnotationsAssignment_2_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__AnnotationsAssignment_2_1_in_rule__TagAnnotation__Group_2__1__Impl7310);
            	    rule__TagAnnotation__AnnotationsAssignment_2_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagAnnotationAccess().getAnnotationsAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagAnnotation__Group_2__1__Impl"


    // $ANTLR start "rule__TagAnnotation__Group_2__2"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3601:1: rule__TagAnnotation__Group_2__2 : rule__TagAnnotation__Group_2__2__Impl ;
    public final void rule__TagAnnotation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3605:1: ( rule__TagAnnotation__Group_2__2__Impl )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3606:2: rule__TagAnnotation__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__2__Impl_in_rule__TagAnnotation__Group_2__27341);
            rule__TagAnnotation__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagAnnotation__Group_2__2"


    // $ANTLR start "rule__TagAnnotation__Group_2__2__Impl"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3612:1: rule__TagAnnotation__Group_2__2__Impl : ( ')' ) ;
    public final void rule__TagAnnotation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3616:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3617:1: ( ')' )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3617:1: ( ')' )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3618:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__TagAnnotation__Group_2__2__Impl7369); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagAnnotationAccess().getRightParenthesisKeyword_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagAnnotation__Group_2__2__Impl"


    // $ANTLR start "rule__KeyStringValueAnnotation__Group__0"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3637:1: rule__KeyStringValueAnnotation__Group__0 : rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 ;
    public final void rule__KeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3641:1: ( rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3642:2: rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__0__Impl_in_rule__KeyStringValueAnnotation__Group__07406);
            rule__KeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__1_in_rule__KeyStringValueAnnotation__Group__07409);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3649:1: rule__KeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3653:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3654:1: ( '@' )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3654:1: ( '@' )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3655:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__KeyStringValueAnnotation__Group__0__Impl7437); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3668:1: rule__KeyStringValueAnnotation__Group__1 : rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 ;
    public final void rule__KeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3672:1: ( rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3673:2: rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__1__Impl_in_rule__KeyStringValueAnnotation__Group__17468);
            rule__KeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__2_in_rule__KeyStringValueAnnotation__Group__17471);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3680:1: rule__KeyStringValueAnnotation__Group__1__Impl : ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3684:1: ( ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3685:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3685:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3686:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3687:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3687:2: rule__KeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__NameAssignment_1_in_rule__KeyStringValueAnnotation__Group__1__Impl7498);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3697:1: rule__KeyStringValueAnnotation__Group__2 : rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 ;
    public final void rule__KeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3701:1: ( rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3702:2: rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__2__Impl_in_rule__KeyStringValueAnnotation__Group__27528);
            rule__KeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__3_in_rule__KeyStringValueAnnotation__Group__27531);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3709:1: rule__KeyStringValueAnnotation__Group__2__Impl : ( ( rule__KeyStringValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3713:1: ( ( ( rule__KeyStringValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3714:1: ( ( rule__KeyStringValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3714:1: ( ( rule__KeyStringValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3715:1: ( rule__KeyStringValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValueAssignment_2()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3716:1: ( rule__KeyStringValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3716:2: rule__KeyStringValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__ValueAssignment_2_in_rule__KeyStringValueAnnotation__Group__2__Impl7558);
            rule__KeyStringValueAnnotation__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationAccess().getValueAssignment_2()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3726:1: rule__KeyStringValueAnnotation__Group__3 : rule__KeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__KeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3730:1: ( rule__KeyStringValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3731:2: rule__KeyStringValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__3__Impl_in_rule__KeyStringValueAnnotation__Group__37588);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3737:1: rule__KeyStringValueAnnotation__Group__3__Impl : ( ( rule__KeyStringValueAnnotation__Group_3__0 )? ) ;
    public final void rule__KeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3741:1: ( ( ( rule__KeyStringValueAnnotation__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3742:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3742:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )? )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3743:1: ( rule__KeyStringValueAnnotation__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3744:1: ( rule__KeyStringValueAnnotation__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3744:2: rule__KeyStringValueAnnotation__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__0_in_rule__KeyStringValueAnnotation__Group__3__Impl7615);
                    rule__KeyStringValueAnnotation__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3762:1: rule__KeyStringValueAnnotation__Group_3__0 : rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 ;
    public final void rule__KeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3766:1: ( rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3767:2: rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__0__Impl_in_rule__KeyStringValueAnnotation__Group_3__07654);
            rule__KeyStringValueAnnotation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__1_in_rule__KeyStringValueAnnotation__Group_3__07657);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3774:1: rule__KeyStringValueAnnotation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3778:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3779:1: ( '(' )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3779:1: ( '(' )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3780:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__KeyStringValueAnnotation__Group_3__0__Impl7685); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3793:1: rule__KeyStringValueAnnotation__Group_3__1 : rule__KeyStringValueAnnotation__Group_3__1__Impl rule__KeyStringValueAnnotation__Group_3__2 ;
    public final void rule__KeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3797:1: ( rule__KeyStringValueAnnotation__Group_3__1__Impl rule__KeyStringValueAnnotation__Group_3__2 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3798:2: rule__KeyStringValueAnnotation__Group_3__1__Impl rule__KeyStringValueAnnotation__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__1__Impl_in_rule__KeyStringValueAnnotation__Group_3__17716);
            rule__KeyStringValueAnnotation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__2_in_rule__KeyStringValueAnnotation__Group_3__17719);
            rule__KeyStringValueAnnotation__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3805:1: rule__KeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )* ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3809:1: ( ( ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )* ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3810:1: ( ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )* )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3810:1: ( ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )* )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3811:1: ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3812:1: ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_COMMENT_ANNOTATION||LA23_0==35) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3812:2: rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyStringValueAnnotation__Group_3__1__Impl7746);
            	    rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__KeyStringValueAnnotation__Group_3__2"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3822:1: rule__KeyStringValueAnnotation__Group_3__2 : rule__KeyStringValueAnnotation__Group_3__2__Impl ;
    public final void rule__KeyStringValueAnnotation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3826:1: ( rule__KeyStringValueAnnotation__Group_3__2__Impl )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3827:2: rule__KeyStringValueAnnotation__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__2__Impl_in_rule__KeyStringValueAnnotation__Group_3__27777);
            rule__KeyStringValueAnnotation__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringValueAnnotation__Group_3__2"


    // $ANTLR start "rule__KeyStringValueAnnotation__Group_3__2__Impl"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3833:1: rule__KeyStringValueAnnotation__Group_3__2__Impl : ( ')' ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3837:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3838:1: ( ')' )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3838:1: ( ')' )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3839:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__KeyStringValueAnnotation__Group_3__2__Impl7805); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringValueAnnotation__Group_3__2__Impl"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group__0"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3858:1: rule__TypedKeyStringValueAnnotation__Group__0 : rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3862:1: ( rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3863:2: rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group__07842);
            rule__TypedKeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1_in_rule__TypedKeyStringValueAnnotation__Group__07845);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3870:1: rule__TypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3874:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3875:1: ( '@' )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3875:1: ( '@' )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3876:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__TypedKeyStringValueAnnotation__Group__0__Impl7873); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3889:1: rule__TypedKeyStringValueAnnotation__Group__1 : rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3893:1: ( rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3894:2: rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group__17904);
            rule__TypedKeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2_in_rule__TypedKeyStringValueAnnotation__Group__17907);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3901:1: rule__TypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3905:1: ( ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3906:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3906:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3907:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3908:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3908:2: rule__TypedKeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__NameAssignment_1_in_rule__TypedKeyStringValueAnnotation__Group__1__Impl7934);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3918:1: rule__TypedKeyStringValueAnnotation__Group__2 : rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3922:1: ( rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3923:2: rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group__27964);
            rule__TypedKeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3_in_rule__TypedKeyStringValueAnnotation__Group__27967);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3930:1: rule__TypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3934:1: ( ( '[' ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3935:1: ( '[' )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3935:1: ( '[' )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3936:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,36,FollowSets000.FOLLOW_36_in_rule__TypedKeyStringValueAnnotation__Group__2__Impl7995); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3949:1: rule__TypedKeyStringValueAnnotation__Group__3 : rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3953:1: ( rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3954:2: rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3__Impl_in_rule__TypedKeyStringValueAnnotation__Group__38026);
            rule__TypedKeyStringValueAnnotation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4_in_rule__TypedKeyStringValueAnnotation__Group__38029);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3961:1: rule__TypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3965:1: ( ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3966:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3966:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3967:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3968:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3968:2: rule__TypedKeyStringValueAnnotation__TypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__TypeAssignment_3_in_rule__TypedKeyStringValueAnnotation__Group__3__Impl8056);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3978:1: rule__TypedKeyStringValueAnnotation__Group__4 : rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3982:1: ( rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3983:2: rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4__Impl_in_rule__TypedKeyStringValueAnnotation__Group__48086);
            rule__TypedKeyStringValueAnnotation__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5_in_rule__TypedKeyStringValueAnnotation__Group__48089);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3990:1: rule__TypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3994:1: ( ( ']' ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3995:1: ( ']' )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3995:1: ( ']' )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:3996:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,37,FollowSets000.FOLLOW_37_in_rule__TypedKeyStringValueAnnotation__Group__4__Impl8117); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4009:1: rule__TypedKeyStringValueAnnotation__Group__5 : rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4013:1: ( rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4014:2: rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5__Impl_in_rule__TypedKeyStringValueAnnotation__Group__58148);
            rule__TypedKeyStringValueAnnotation__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6_in_rule__TypedKeyStringValueAnnotation__Group__58151);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4021:1: rule__TypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4025:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4026:1: ( ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4026:1: ( ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4027:1: ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValueAssignment_5()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4028:1: ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4028:2: rule__TypedKeyStringValueAnnotation__ValueAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__ValueAssignment_5_in_rule__TypedKeyStringValueAnnotation__Group__5__Impl8178);
            rule__TypedKeyStringValueAnnotation__ValueAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValueAssignment_5()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4038:1: rule__TypedKeyStringValueAnnotation__Group__6 : rule__TypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4042:1: ( rule__TypedKeyStringValueAnnotation__Group__6__Impl )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4043:2: rule__TypedKeyStringValueAnnotation__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6__Impl_in_rule__TypedKeyStringValueAnnotation__Group__68208);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4049:1: rule__TypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )? ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4053:1: ( ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )? ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4054:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )? )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4054:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )? )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4055:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4056:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4056:2: rule__TypedKeyStringValueAnnotation__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0_in_rule__TypedKeyStringValueAnnotation__Group__6__Impl8235);
                    rule__TypedKeyStringValueAnnotation__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4080:1: rule__TypedKeyStringValueAnnotation__Group_6__0 : rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4084:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4085:2: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__08280);
            rule__TypedKeyStringValueAnnotation__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1_in_rule__TypedKeyStringValueAnnotation__Group_6__08283);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4092:1: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl : ( '(' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4096:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4097:1: ( '(' )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4097:1: ( '(' )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4098:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_6_0()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl8311); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_6_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4111:1: rule__TypedKeyStringValueAnnotation__Group_6__1 : rule__TypedKeyStringValueAnnotation__Group_6__1__Impl rule__TypedKeyStringValueAnnotation__Group_6__2 ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4115:1: ( rule__TypedKeyStringValueAnnotation__Group_6__1__Impl rule__TypedKeyStringValueAnnotation__Group_6__2 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4116:2: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl rule__TypedKeyStringValueAnnotation__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__18342);
            rule__TypedKeyStringValueAnnotation__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__2_in_rule__TypedKeyStringValueAnnotation__Group_6__18345);
            rule__TypedKeyStringValueAnnotation__Group_6__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4123:1: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )* ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4127:1: ( ( ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )* ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4128:1: ( ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )* )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4128:1: ( ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )* )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4129:1: ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getAnnotationsAssignment_6_1()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4130:1: ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_COMMENT_ANNOTATION||LA25_0==35) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4130:2: rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1_in_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl8372);
            	    rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getAnnotationsAssignment_6_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group_6__2"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4140:1: rule__TypedKeyStringValueAnnotation__Group_6__2 : rule__TypedKeyStringValueAnnotation__Group_6__2__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4144:1: ( rule__TypedKeyStringValueAnnotation__Group_6__2__Impl )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4145:2: rule__TypedKeyStringValueAnnotation__Group_6__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__28403);
            rule__TypedKeyStringValueAnnotation__Group_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__Group_6__2"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group_6__2__Impl"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4151:1: rule__TypedKeyStringValueAnnotation__Group_6__2__Impl : ( ')' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4155:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4156:1: ( ')' )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4156:1: ( ')' )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4157:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightParenthesisKeyword_6_2()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__TypedKeyStringValueAnnotation__Group_6__2__Impl8431); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightParenthesisKeyword_6_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__Group_6__2__Impl"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__Group__0"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4176:1: rule__KeyBooleanValueAnnotation__Group__0 : rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1 ;
    public final void rule__KeyBooleanValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4180:1: ( rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4181:2: rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__0__Impl_in_rule__KeyBooleanValueAnnotation__Group__08468);
            rule__KeyBooleanValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__1_in_rule__KeyBooleanValueAnnotation__Group__08471);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4188:1: rule__KeyBooleanValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4192:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4193:1: ( '@' )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4193:1: ( '@' )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4194:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__KeyBooleanValueAnnotation__Group__0__Impl8499); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4207:1: rule__KeyBooleanValueAnnotation__Group__1 : rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2 ;
    public final void rule__KeyBooleanValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4211:1: ( rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4212:2: rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__1__Impl_in_rule__KeyBooleanValueAnnotation__Group__18530);
            rule__KeyBooleanValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__2_in_rule__KeyBooleanValueAnnotation__Group__18533);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4219:1: rule__KeyBooleanValueAnnotation__Group__1__Impl : ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4223:1: ( ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4224:1: ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4224:1: ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4225:1: ( rule__KeyBooleanValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4226:1: ( rule__KeyBooleanValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4226:2: rule__KeyBooleanValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__NameAssignment_1_in_rule__KeyBooleanValueAnnotation__Group__1__Impl8560);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4236:1: rule__KeyBooleanValueAnnotation__Group__2 : rule__KeyBooleanValueAnnotation__Group__2__Impl rule__KeyBooleanValueAnnotation__Group__3 ;
    public final void rule__KeyBooleanValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4240:1: ( rule__KeyBooleanValueAnnotation__Group__2__Impl rule__KeyBooleanValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4241:2: rule__KeyBooleanValueAnnotation__Group__2__Impl rule__KeyBooleanValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__2__Impl_in_rule__KeyBooleanValueAnnotation__Group__28590);
            rule__KeyBooleanValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__3_in_rule__KeyBooleanValueAnnotation__Group__28593);
            rule__KeyBooleanValueAnnotation__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4248:1: rule__KeyBooleanValueAnnotation__Group__2__Impl : ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4252:1: ( ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4253:1: ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4253:1: ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4254:1: ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getValueAssignment_2()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4255:1: ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4255:2: rule__KeyBooleanValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__ValueAssignment_2_in_rule__KeyBooleanValueAnnotation__Group__2__Impl8620);
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


    // $ANTLR start "rule__KeyBooleanValueAnnotation__Group__3"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4265:1: rule__KeyBooleanValueAnnotation__Group__3 : rule__KeyBooleanValueAnnotation__Group__3__Impl ;
    public final void rule__KeyBooleanValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4269:1: ( rule__KeyBooleanValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4270:2: rule__KeyBooleanValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__3__Impl_in_rule__KeyBooleanValueAnnotation__Group__38650);
            rule__KeyBooleanValueAnnotation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyBooleanValueAnnotation__Group__3"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__Group__3__Impl"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4276:1: rule__KeyBooleanValueAnnotation__Group__3__Impl : ( ( rule__KeyBooleanValueAnnotation__Group_3__0 )? ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4280:1: ( ( ( rule__KeyBooleanValueAnnotation__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4281:1: ( ( rule__KeyBooleanValueAnnotation__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4281:1: ( ( rule__KeyBooleanValueAnnotation__Group_3__0 )? )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4282:1: ( rule__KeyBooleanValueAnnotation__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getGroup_3()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4283:1: ( rule__KeyBooleanValueAnnotation__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==33) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4283:2: rule__KeyBooleanValueAnnotation__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__0_in_rule__KeyBooleanValueAnnotation__Group__3__Impl8677);
                    rule__KeyBooleanValueAnnotation__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyBooleanValueAnnotationAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyBooleanValueAnnotation__Group__3__Impl"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__Group_3__0"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4301:1: rule__KeyBooleanValueAnnotation__Group_3__0 : rule__KeyBooleanValueAnnotation__Group_3__0__Impl rule__KeyBooleanValueAnnotation__Group_3__1 ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4305:1: ( rule__KeyBooleanValueAnnotation__Group_3__0__Impl rule__KeyBooleanValueAnnotation__Group_3__1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4306:2: rule__KeyBooleanValueAnnotation__Group_3__0__Impl rule__KeyBooleanValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__0__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__08716);
            rule__KeyBooleanValueAnnotation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__1_in_rule__KeyBooleanValueAnnotation__Group_3__08719);
            rule__KeyBooleanValueAnnotation__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyBooleanValueAnnotation__Group_3__0"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__Group_3__0__Impl"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4313:1: rule__KeyBooleanValueAnnotation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4317:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4318:1: ( '(' )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4318:1: ( '(' )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4319:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__KeyBooleanValueAnnotation__Group_3__0__Impl8747); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyBooleanValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyBooleanValueAnnotation__Group_3__0__Impl"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__Group_3__1"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4332:1: rule__KeyBooleanValueAnnotation__Group_3__1 : rule__KeyBooleanValueAnnotation__Group_3__1__Impl rule__KeyBooleanValueAnnotation__Group_3__2 ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4336:1: ( rule__KeyBooleanValueAnnotation__Group_3__1__Impl rule__KeyBooleanValueAnnotation__Group_3__2 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4337:2: rule__KeyBooleanValueAnnotation__Group_3__1__Impl rule__KeyBooleanValueAnnotation__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__1__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__18778);
            rule__KeyBooleanValueAnnotation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__2_in_rule__KeyBooleanValueAnnotation__Group_3__18781);
            rule__KeyBooleanValueAnnotation__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyBooleanValueAnnotation__Group_3__1"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__Group_3__1__Impl"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4344:1: rule__KeyBooleanValueAnnotation__Group_3__1__Impl : ( ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )* ) ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4348:1: ( ( ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )* ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4349:1: ( ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )* )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4349:1: ( ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )* )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4350:1: ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4351:1: ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_COMMENT_ANNOTATION||LA27_0==35) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4351:2: rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyBooleanValueAnnotation__Group_3__1__Impl8808);
            	    rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyBooleanValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyBooleanValueAnnotation__Group_3__1__Impl"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__Group_3__2"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4361:1: rule__KeyBooleanValueAnnotation__Group_3__2 : rule__KeyBooleanValueAnnotation__Group_3__2__Impl ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4365:1: ( rule__KeyBooleanValueAnnotation__Group_3__2__Impl )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4366:2: rule__KeyBooleanValueAnnotation__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__2__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__28839);
            rule__KeyBooleanValueAnnotation__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyBooleanValueAnnotation__Group_3__2"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__Group_3__2__Impl"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4372:1: rule__KeyBooleanValueAnnotation__Group_3__2__Impl : ( ')' ) ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4376:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4377:1: ( ')' )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4377:1: ( ')' )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4378:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__KeyBooleanValueAnnotation__Group_3__2__Impl8867); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyBooleanValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyBooleanValueAnnotation__Group_3__2__Impl"


    // $ANTLR start "rule__KeyIntValueAnnotation__Group__0"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4397:1: rule__KeyIntValueAnnotation__Group__0 : rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1 ;
    public final void rule__KeyIntValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4401:1: ( rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4402:2: rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__0__Impl_in_rule__KeyIntValueAnnotation__Group__08904);
            rule__KeyIntValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__1_in_rule__KeyIntValueAnnotation__Group__08907);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4409:1: rule__KeyIntValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyIntValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4413:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4414:1: ( '@' )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4414:1: ( '@' )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4415:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__KeyIntValueAnnotation__Group__0__Impl8935); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4428:1: rule__KeyIntValueAnnotation__Group__1 : rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2 ;
    public final void rule__KeyIntValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4432:1: ( rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4433:2: rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__1__Impl_in_rule__KeyIntValueAnnotation__Group__18966);
            rule__KeyIntValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__2_in_rule__KeyIntValueAnnotation__Group__18969);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4440:1: rule__KeyIntValueAnnotation__Group__1__Impl : ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyIntValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4444:1: ( ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4445:1: ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4445:1: ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4446:1: ( rule__KeyIntValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4447:1: ( rule__KeyIntValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4447:2: rule__KeyIntValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__NameAssignment_1_in_rule__KeyIntValueAnnotation__Group__1__Impl8996);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4457:1: rule__KeyIntValueAnnotation__Group__2 : rule__KeyIntValueAnnotation__Group__2__Impl rule__KeyIntValueAnnotation__Group__3 ;
    public final void rule__KeyIntValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4461:1: ( rule__KeyIntValueAnnotation__Group__2__Impl rule__KeyIntValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4462:2: rule__KeyIntValueAnnotation__Group__2__Impl rule__KeyIntValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__2__Impl_in_rule__KeyIntValueAnnotation__Group__29026);
            rule__KeyIntValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__3_in_rule__KeyIntValueAnnotation__Group__29029);
            rule__KeyIntValueAnnotation__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4469:1: rule__KeyIntValueAnnotation__Group__2__Impl : ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyIntValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4473:1: ( ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4474:1: ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4474:1: ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4475:1: ( rule__KeyIntValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getValueAssignment_2()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4476:1: ( rule__KeyIntValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4476:2: rule__KeyIntValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__ValueAssignment_2_in_rule__KeyIntValueAnnotation__Group__2__Impl9056);
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


    // $ANTLR start "rule__KeyIntValueAnnotation__Group__3"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4486:1: rule__KeyIntValueAnnotation__Group__3 : rule__KeyIntValueAnnotation__Group__3__Impl ;
    public final void rule__KeyIntValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4490:1: ( rule__KeyIntValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4491:2: rule__KeyIntValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__3__Impl_in_rule__KeyIntValueAnnotation__Group__39086);
            rule__KeyIntValueAnnotation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyIntValueAnnotation__Group__3"


    // $ANTLR start "rule__KeyIntValueAnnotation__Group__3__Impl"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4497:1: rule__KeyIntValueAnnotation__Group__3__Impl : ( ( rule__KeyIntValueAnnotation__Group_3__0 )? ) ;
    public final void rule__KeyIntValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4501:1: ( ( ( rule__KeyIntValueAnnotation__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4502:1: ( ( rule__KeyIntValueAnnotation__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4502:1: ( ( rule__KeyIntValueAnnotation__Group_3__0 )? )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4503:1: ( rule__KeyIntValueAnnotation__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getGroup_3()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4504:1: ( rule__KeyIntValueAnnotation__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==33) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4504:2: rule__KeyIntValueAnnotation__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__0_in_rule__KeyIntValueAnnotation__Group__3__Impl9113);
                    rule__KeyIntValueAnnotation__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyIntValueAnnotation__Group__3__Impl"


    // $ANTLR start "rule__KeyIntValueAnnotation__Group_3__0"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4522:1: rule__KeyIntValueAnnotation__Group_3__0 : rule__KeyIntValueAnnotation__Group_3__0__Impl rule__KeyIntValueAnnotation__Group_3__1 ;
    public final void rule__KeyIntValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4526:1: ( rule__KeyIntValueAnnotation__Group_3__0__Impl rule__KeyIntValueAnnotation__Group_3__1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4527:2: rule__KeyIntValueAnnotation__Group_3__0__Impl rule__KeyIntValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__0__Impl_in_rule__KeyIntValueAnnotation__Group_3__09152);
            rule__KeyIntValueAnnotation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__1_in_rule__KeyIntValueAnnotation__Group_3__09155);
            rule__KeyIntValueAnnotation__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyIntValueAnnotation__Group_3__0"


    // $ANTLR start "rule__KeyIntValueAnnotation__Group_3__0__Impl"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4534:1: rule__KeyIntValueAnnotation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__KeyIntValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4538:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4539:1: ( '(' )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4539:1: ( '(' )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4540:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__KeyIntValueAnnotation__Group_3__0__Impl9183); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyIntValueAnnotation__Group_3__0__Impl"


    // $ANTLR start "rule__KeyIntValueAnnotation__Group_3__1"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4553:1: rule__KeyIntValueAnnotation__Group_3__1 : rule__KeyIntValueAnnotation__Group_3__1__Impl rule__KeyIntValueAnnotation__Group_3__2 ;
    public final void rule__KeyIntValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4557:1: ( rule__KeyIntValueAnnotation__Group_3__1__Impl rule__KeyIntValueAnnotation__Group_3__2 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4558:2: rule__KeyIntValueAnnotation__Group_3__1__Impl rule__KeyIntValueAnnotation__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__1__Impl_in_rule__KeyIntValueAnnotation__Group_3__19214);
            rule__KeyIntValueAnnotation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__2_in_rule__KeyIntValueAnnotation__Group_3__19217);
            rule__KeyIntValueAnnotation__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyIntValueAnnotation__Group_3__1"


    // $ANTLR start "rule__KeyIntValueAnnotation__Group_3__1__Impl"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4565:1: rule__KeyIntValueAnnotation__Group_3__1__Impl : ( ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )* ) ;
    public final void rule__KeyIntValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4569:1: ( ( ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )* ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4570:1: ( ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )* )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4570:1: ( ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )* )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4571:1: ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4572:1: ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_COMMENT_ANNOTATION||LA29_0==35) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4572:2: rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyIntValueAnnotation__Group_3__1__Impl9244);
            	    rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyIntValueAnnotation__Group_3__1__Impl"


    // $ANTLR start "rule__KeyIntValueAnnotation__Group_3__2"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4582:1: rule__KeyIntValueAnnotation__Group_3__2 : rule__KeyIntValueAnnotation__Group_3__2__Impl ;
    public final void rule__KeyIntValueAnnotation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4586:1: ( rule__KeyIntValueAnnotation__Group_3__2__Impl )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4587:2: rule__KeyIntValueAnnotation__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__2__Impl_in_rule__KeyIntValueAnnotation__Group_3__29275);
            rule__KeyIntValueAnnotation__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyIntValueAnnotation__Group_3__2"


    // $ANTLR start "rule__KeyIntValueAnnotation__Group_3__2__Impl"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4593:1: rule__KeyIntValueAnnotation__Group_3__2__Impl : ( ')' ) ;
    public final void rule__KeyIntValueAnnotation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4597:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4598:1: ( ')' )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4598:1: ( ')' )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4599:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__KeyIntValueAnnotation__Group_3__2__Impl9303); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyIntValueAnnotation__Group_3__2__Impl"


    // $ANTLR start "rule__KeyFloatValueAnnotation__Group__0"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4618:1: rule__KeyFloatValueAnnotation__Group__0 : rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1 ;
    public final void rule__KeyFloatValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4622:1: ( rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4623:2: rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__0__Impl_in_rule__KeyFloatValueAnnotation__Group__09340);
            rule__KeyFloatValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__1_in_rule__KeyFloatValueAnnotation__Group__09343);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4630:1: rule__KeyFloatValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyFloatValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4634:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4635:1: ( '@' )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4635:1: ( '@' )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4636:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__KeyFloatValueAnnotation__Group__0__Impl9371); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4649:1: rule__KeyFloatValueAnnotation__Group__1 : rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2 ;
    public final void rule__KeyFloatValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4653:1: ( rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4654:2: rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__1__Impl_in_rule__KeyFloatValueAnnotation__Group__19402);
            rule__KeyFloatValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__2_in_rule__KeyFloatValueAnnotation__Group__19405);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4661:1: rule__KeyFloatValueAnnotation__Group__1__Impl : ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyFloatValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4665:1: ( ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4666:1: ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4666:1: ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4667:1: ( rule__KeyFloatValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4668:1: ( rule__KeyFloatValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4668:2: rule__KeyFloatValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__NameAssignment_1_in_rule__KeyFloatValueAnnotation__Group__1__Impl9432);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4678:1: rule__KeyFloatValueAnnotation__Group__2 : rule__KeyFloatValueAnnotation__Group__2__Impl rule__KeyFloatValueAnnotation__Group__3 ;
    public final void rule__KeyFloatValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4682:1: ( rule__KeyFloatValueAnnotation__Group__2__Impl rule__KeyFloatValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4683:2: rule__KeyFloatValueAnnotation__Group__2__Impl rule__KeyFloatValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__2__Impl_in_rule__KeyFloatValueAnnotation__Group__29462);
            rule__KeyFloatValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__3_in_rule__KeyFloatValueAnnotation__Group__29465);
            rule__KeyFloatValueAnnotation__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4690:1: rule__KeyFloatValueAnnotation__Group__2__Impl : ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyFloatValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4694:1: ( ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4695:1: ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4695:1: ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4696:1: ( rule__KeyFloatValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getValueAssignment_2()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4697:1: ( rule__KeyFloatValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4697:2: rule__KeyFloatValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__ValueAssignment_2_in_rule__KeyFloatValueAnnotation__Group__2__Impl9492);
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


    // $ANTLR start "rule__KeyFloatValueAnnotation__Group__3"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4707:1: rule__KeyFloatValueAnnotation__Group__3 : rule__KeyFloatValueAnnotation__Group__3__Impl ;
    public final void rule__KeyFloatValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4711:1: ( rule__KeyFloatValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4712:2: rule__KeyFloatValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__3__Impl_in_rule__KeyFloatValueAnnotation__Group__39522);
            rule__KeyFloatValueAnnotation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyFloatValueAnnotation__Group__3"


    // $ANTLR start "rule__KeyFloatValueAnnotation__Group__3__Impl"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4718:1: rule__KeyFloatValueAnnotation__Group__3__Impl : ( ( rule__KeyFloatValueAnnotation__Group_3__0 )? ) ;
    public final void rule__KeyFloatValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4722:1: ( ( ( rule__KeyFloatValueAnnotation__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4723:1: ( ( rule__KeyFloatValueAnnotation__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4723:1: ( ( rule__KeyFloatValueAnnotation__Group_3__0 )? )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4724:1: ( rule__KeyFloatValueAnnotation__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getGroup_3()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4725:1: ( rule__KeyFloatValueAnnotation__Group_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==33) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4725:2: rule__KeyFloatValueAnnotation__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__0_in_rule__KeyFloatValueAnnotation__Group__3__Impl9549);
                    rule__KeyFloatValueAnnotation__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyFloatValueAnnotation__Group__3__Impl"


    // $ANTLR start "rule__KeyFloatValueAnnotation__Group_3__0"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4743:1: rule__KeyFloatValueAnnotation__Group_3__0 : rule__KeyFloatValueAnnotation__Group_3__0__Impl rule__KeyFloatValueAnnotation__Group_3__1 ;
    public final void rule__KeyFloatValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4747:1: ( rule__KeyFloatValueAnnotation__Group_3__0__Impl rule__KeyFloatValueAnnotation__Group_3__1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4748:2: rule__KeyFloatValueAnnotation__Group_3__0__Impl rule__KeyFloatValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__0__Impl_in_rule__KeyFloatValueAnnotation__Group_3__09588);
            rule__KeyFloatValueAnnotation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__1_in_rule__KeyFloatValueAnnotation__Group_3__09591);
            rule__KeyFloatValueAnnotation__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyFloatValueAnnotation__Group_3__0"


    // $ANTLR start "rule__KeyFloatValueAnnotation__Group_3__0__Impl"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4755:1: rule__KeyFloatValueAnnotation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__KeyFloatValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4759:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4760:1: ( '(' )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4760:1: ( '(' )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4761:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__KeyFloatValueAnnotation__Group_3__0__Impl9619); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyFloatValueAnnotation__Group_3__0__Impl"


    // $ANTLR start "rule__KeyFloatValueAnnotation__Group_3__1"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4774:1: rule__KeyFloatValueAnnotation__Group_3__1 : rule__KeyFloatValueAnnotation__Group_3__1__Impl rule__KeyFloatValueAnnotation__Group_3__2 ;
    public final void rule__KeyFloatValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4778:1: ( rule__KeyFloatValueAnnotation__Group_3__1__Impl rule__KeyFloatValueAnnotation__Group_3__2 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4779:2: rule__KeyFloatValueAnnotation__Group_3__1__Impl rule__KeyFloatValueAnnotation__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__1__Impl_in_rule__KeyFloatValueAnnotation__Group_3__19650);
            rule__KeyFloatValueAnnotation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__2_in_rule__KeyFloatValueAnnotation__Group_3__19653);
            rule__KeyFloatValueAnnotation__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyFloatValueAnnotation__Group_3__1"


    // $ANTLR start "rule__KeyFloatValueAnnotation__Group_3__1__Impl"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4786:1: rule__KeyFloatValueAnnotation__Group_3__1__Impl : ( ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )* ) ;
    public final void rule__KeyFloatValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4790:1: ( ( ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )* ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4791:1: ( ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )* )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4791:1: ( ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )* )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4792:1: ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4793:1: ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_COMMENT_ANNOTATION||LA31_0==35) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4793:2: rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyFloatValueAnnotation__Group_3__1__Impl9680);
            	    rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyFloatValueAnnotation__Group_3__1__Impl"


    // $ANTLR start "rule__KeyFloatValueAnnotation__Group_3__2"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4803:1: rule__KeyFloatValueAnnotation__Group_3__2 : rule__KeyFloatValueAnnotation__Group_3__2__Impl ;
    public final void rule__KeyFloatValueAnnotation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4807:1: ( rule__KeyFloatValueAnnotation__Group_3__2__Impl )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4808:2: rule__KeyFloatValueAnnotation__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__2__Impl_in_rule__KeyFloatValueAnnotation__Group_3__29711);
            rule__KeyFloatValueAnnotation__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyFloatValueAnnotation__Group_3__2"


    // $ANTLR start "rule__KeyFloatValueAnnotation__Group_3__2__Impl"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4814:1: rule__KeyFloatValueAnnotation__Group_3__2__Impl : ( ')' ) ;
    public final void rule__KeyFloatValueAnnotation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4818:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4819:1: ( ')' )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4819:1: ( ')' )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4820:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__KeyFloatValueAnnotation__Group_3__2__Impl9739); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyFloatValueAnnotation__Group_3__2__Impl"


    // $ANTLR start "rule__ExtendedID__Group__0"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4840:1: rule__ExtendedID__Group__0 : rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 ;
    public final void rule__ExtendedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4844:1: ( rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4845:2: rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__0__Impl_in_rule__ExtendedID__Group__09777);
            rule__ExtendedID__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__1_in_rule__ExtendedID__Group__09780);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4852:1: rule__ExtendedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4856:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4857:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4857:1: ( RULE_ID )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4858:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ExtendedID__Group__0__Impl9807); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4869:1: rule__ExtendedID__Group__1 : rule__ExtendedID__Group__1__Impl ;
    public final void rule__ExtendedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4873:1: ( rule__ExtendedID__Group__1__Impl )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4874:2: rule__ExtendedID__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__1__Impl_in_rule__ExtendedID__Group__19836);
            rule__ExtendedID__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4880:1: rule__ExtendedID__Group__1__Impl : ( ( rule__ExtendedID__Group_1__0 )* ) ;
    public final void rule__ExtendedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4884:1: ( ( ( rule__ExtendedID__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4885:1: ( ( rule__ExtendedID__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4885:1: ( ( rule__ExtendedID__Group_1__0 )* )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4886:1: ( rule__ExtendedID__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4887:1: ( rule__ExtendedID__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==38) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4887:2: rule__ExtendedID__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_1__0_in_rule__ExtendedID__Group__1__Impl9863);
            	    rule__ExtendedID__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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


    // $ANTLR start "rule__ExtendedID__Group_1__0"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4901:1: rule__ExtendedID__Group_1__0 : rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 ;
    public final void rule__ExtendedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4905:1: ( rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4906:2: rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_1__0__Impl_in_rule__ExtendedID__Group_1__09898);
            rule__ExtendedID__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_1__1_in_rule__ExtendedID__Group_1__09901);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4913:1: rule__ExtendedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__ExtendedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4917:1: ( ( '.' ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4918:1: ( '.' )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4918:1: ( '.' )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4919:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            }
            match(input,38,FollowSets000.FOLLOW_38_in_rule__ExtendedID__Group_1__0__Impl9929); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4932:1: rule__ExtendedID__Group_1__1 : rule__ExtendedID__Group_1__1__Impl ;
    public final void rule__ExtendedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4936:1: ( rule__ExtendedID__Group_1__1__Impl )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4937:2: rule__ExtendedID__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_1__1__Impl_in_rule__ExtendedID__Group_1__19960);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4943:1: rule__ExtendedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4947:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4948:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4948:1: ( RULE_ID )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4949:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ExtendedID__Group_1__1__Impl9987); if (state.failed) return ;
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


    // $ANTLR start "rule__Module__NameAssignment_1"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4965:1: rule__Module__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Module__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4969:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4970:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4970:1: ( RULE_ID )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4971:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Module__NameAssignment_110025); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__NameAssignment_1"


    // $ANTLR start "rule__OrExpression__OperatorAssignment_1_1"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4980:1: rule__OrExpression__OperatorAssignment_1_1 : ( ruleOrOperator ) ;
    public final void rule__OrExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4984:1: ( ( ruleOrOperator ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4985:1: ( ruleOrOperator )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4985:1: ( ruleOrOperator )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4986:1: ruleOrOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrOperator_in_rule__OrExpression__OperatorAssignment_1_110056);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4995:1: rule__OrExpression__SubExpressionsAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:4999:1: ( ( ruleAndExpression ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5000:1: ( ruleAndExpression )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5000:1: ( ruleAndExpression )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5001:1: ruleAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getSubExpressionsAndExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_rule__OrExpression__SubExpressionsAssignment_1_210087);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5010:1: rule__AndExpression__OperatorAssignment_1_1 : ( ruleAndOperator ) ;
    public final void rule__AndExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5014:1: ( ( ruleAndOperator ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5015:1: ( ruleAndOperator )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5015:1: ( ruleAndOperator )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5016:1: ruleAndOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndOperator_in_rule__AndExpression__OperatorAssignment_1_110118);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5025:1: rule__AndExpression__SubExpressionsAssignment_1_2 : ( ruleCompareOperation ) ;
    public final void rule__AndExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5029:1: ( ( ruleCompareOperation ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5030:1: ( ruleCompareOperation )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5030:1: ( ruleCompareOperation )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5031:1: ruleCompareOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_rule__AndExpression__SubExpressionsAssignment_1_210149);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5040:1: rule__CompareOperation__OperatorAssignment_0_1_1 : ( ruleCompareOperator ) ;
    public final void rule__CompareOperation__OperatorAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5044:1: ( ( ruleCompareOperator ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5045:1: ( ruleCompareOperator )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5045:1: ( ruleCompareOperator )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5046:1: ruleCompareOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_0_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperator_in_rule__CompareOperation__OperatorAssignment_0_1_110180);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5055:1: rule__CompareOperation__SubExpressionsAssignment_0_1_2 : ( ruleNotOrValuedExpression ) ;
    public final void rule__CompareOperation__SubExpressionsAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5059:1: ( ( ruleNotOrValuedExpression ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5060:1: ( ruleNotOrValuedExpression )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5060:1: ( ruleNotOrValuedExpression )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5061:1: ruleNotOrValuedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_0_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_rule__CompareOperation__SubExpressionsAssignment_0_1_210211);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5070:1: rule__NotExpression__OperatorAssignment_0_1 : ( ruleNotOperator ) ;
    public final void rule__NotExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5074:1: ( ( ruleNotOperator ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5075:1: ( ruleNotOperator )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5075:1: ( ruleNotOperator )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5076:1: ruleNotOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotOperator_in_rule__NotExpression__OperatorAssignment_0_110242);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5085:1: rule__NotExpression__SubExpressionsAssignment_0_2 : ( ruleNotExpression ) ;
    public final void rule__NotExpression__SubExpressionsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5089:1: ( ( ruleNotExpression ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5090:1: ( ruleNotExpression )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5090:1: ( ruleNotExpression )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5091:1: ruleNotExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_rule__NotExpression__SubExpressionsAssignment_0_210273);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5100:1: rule__AddExpression__OperatorAssignment_1_1 : ( ruleAddOperator ) ;
    public final void rule__AddExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5104:1: ( ( ruleAddOperator ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5105:1: ( ruleAddOperator )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5105:1: ( ruleAddOperator )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5106:1: ruleAddOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddOperator_in_rule__AddExpression__OperatorAssignment_1_110304);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5115:1: rule__AddExpression__SubExpressionsAssignment_1_2 : ( ruleSubExpression ) ;
    public final void rule__AddExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5119:1: ( ( ruleSubExpression ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5120:1: ( ruleSubExpression )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5120:1: ( ruleSubExpression )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5121:1: ruleSubExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_rule__AddExpression__SubExpressionsAssignment_1_210335);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5130:1: rule__SubExpression__OperatorAssignment_1_1 : ( ruleSubOperator ) ;
    public final void rule__SubExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5134:1: ( ( ruleSubOperator ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5135:1: ( ruleSubOperator )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5135:1: ( ruleSubOperator )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5136:1: ruleSubOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubOperator_in_rule__SubExpression__OperatorAssignment_1_110366);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5145:1: rule__SubExpression__SubExpressionsAssignment_1_2 : ( ruleMultExpression ) ;
    public final void rule__SubExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5149:1: ( ( ruleMultExpression ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5150:1: ( ruleMultExpression )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5150:1: ( ruleMultExpression )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5151:1: ruleMultExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_rule__SubExpression__SubExpressionsAssignment_1_210397);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5160:1: rule__MultExpression__OperatorAssignment_1_1 : ( ruleMultOperator ) ;
    public final void rule__MultExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5164:1: ( ( ruleMultOperator ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5165:1: ( ruleMultOperator )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5165:1: ( ruleMultOperator )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5166:1: ruleMultOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultOperator_in_rule__MultExpression__OperatorAssignment_1_110428);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5175:1: rule__MultExpression__SubExpressionsAssignment_1_2 : ( ruleDivExpression ) ;
    public final void rule__MultExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5179:1: ( ( ruleDivExpression ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5180:1: ( ruleDivExpression )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5180:1: ( ruleDivExpression )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5181:1: ruleDivExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_rule__MultExpression__SubExpressionsAssignment_1_210459);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5190:1: rule__DivExpression__OperatorAssignment_1_1 : ( ruleDivOperator ) ;
    public final void rule__DivExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5194:1: ( ( ruleDivOperator ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5195:1: ( ruleDivOperator )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5195:1: ( ruleDivOperator )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5196:1: ruleDivOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivOperator_in_rule__DivExpression__OperatorAssignment_1_110490);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5205:1: rule__DivExpression__SubExpressionsAssignment_1_2 : ( ruleModExpression ) ;
    public final void rule__DivExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5209:1: ( ( ruleModExpression ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5210:1: ( ruleModExpression )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5210:1: ( ruleModExpression )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5211:1: ruleModExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_rule__DivExpression__SubExpressionsAssignment_1_210521);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5220:1: rule__ModExpression__OperatorAssignment_1_1 : ( ruleModOperator ) ;
    public final void rule__ModExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5224:1: ( ( ruleModOperator ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5225:1: ( ruleModOperator )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5225:1: ( ruleModOperator )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5226:1: ruleModOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModOperator_in_rule__ModExpression__OperatorAssignment_1_110552);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5235:1: rule__ModExpression__SubExpressionsAssignment_1_2 : ( ruleAtomicValuedExpression ) ;
    public final void rule__ModExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5239:1: ( ( ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5240:1: ( ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5240:1: ( ruleAtomicValuedExpression )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5241:1: ruleAtomicValuedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_rule__ModExpression__SubExpressionsAssignment_1_210583);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5250:1: rule__NegExpression__OperatorAssignment_0_1 : ( ruleSubOperator ) ;
    public final void rule__NegExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5254:1: ( ( ruleSubOperator ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5255:1: ( ruleSubOperator )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5255:1: ( ruleSubOperator )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5256:1: ruleSubOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getOperatorSubOperatorEnumRuleCall_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubOperator_in_rule__NegExpression__OperatorAssignment_0_110614);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5265:1: rule__NegExpression__SubExpressionsAssignment_0_2 : ( ruleNegExpression ) ;
    public final void rule__NegExpression__SubExpressionsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5269:1: ( ( ruleNegExpression ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5270:1: ( ruleNegExpression )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5270:1: ( ruleNegExpression )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5271:1: ruleNegExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_rule__NegExpression__SubExpressionsAssignment_0_210645);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5280:1: rule__ValuedObjectTestExpression__OperatorAssignment_0_1 : ( ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 ) ) ;
    public final void rule__ValuedObjectTestExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5284:1: ( ( ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5285:1: ( ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5285:1: ( ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5286:1: ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorAlternatives_0_1_0()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5287:1: ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5287:2: rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0_in_rule__ValuedObjectTestExpression__OperatorAssignment_0_110676);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5296:1: rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 : ( ruleValuedObjectTestExpression ) ;
    public final void rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5300:1: ( ( ruleValuedObjectTestExpression ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5301:1: ( ruleValuedObjectTestExpression )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5301:1: ( ruleValuedObjectTestExpression )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5302:1: ruleValuedObjectTestExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_310709);
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


    // $ANTLR start "rule__ValuedObjectReference__ValuedObjectAssignment"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5311:1: rule__ValuedObjectReference__ValuedObjectAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ValuedObjectReference__ValuedObjectAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5315:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5316:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5316:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5317:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0()); 
            }
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5318:1: ( RULE_ID )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5319:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ValuedObjectReference__ValuedObjectAssignment10744); if (state.failed) return ;
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


    // $ANTLR start "rule__TextExpression__TextAssignment"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5330:1: rule__TextExpression__TextAssignment : ( RULE_HOSTCODE ) ;
    public final void rule__TextExpression__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5334:1: ( ( RULE_HOSTCODE ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5335:1: ( RULE_HOSTCODE )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5335:1: ( RULE_HOSTCODE )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5336:1: RULE_HOSTCODE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getTextHOSTCODETerminalRuleCall_0()); 
            }
            match(input,RULE_HOSTCODE,FollowSets000.FOLLOW_RULE_HOSTCODE_in_rule__TextExpression__TextAssignment10779); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5345:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5349:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5350:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5350:1: ( RULE_INT )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5351:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment10810); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5360:1: rule__FloatValue__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5364:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5365:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5365:1: ( RULE_FLOAT )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5366:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueFLOATTerminalRuleCall_0()); 
            }
            match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_rule__FloatValue__ValueAssignment10841); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5375:1: rule__BoolValue__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BoolValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5379:1: ( ( RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5380:1: ( RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5380:1: ( RULE_BOOLEAN )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5381:1: RULE_BOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolValueAccess().getValueBOOLEANTerminalRuleCall_0()); 
            }
            match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_rule__BoolValue__ValueAssignment10872); if (state.failed) return ;
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


    // $ANTLR start "rule__DoubleValue__ValueAssignment"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5390:1: rule__DoubleValue__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__DoubleValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5394:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5395:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5395:1: ( RULE_FLOAT )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5396:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleValueAccess().getValueFLOATTerminalRuleCall_0()); 
            }
            match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_rule__DoubleValue__ValueAssignment10903); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleValueAccess().getValueFLOATTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleValue__ValueAssignment"


    // $ANTLR start "rule__CommentAnnotation__ValueAssignment"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5405:1: rule__CommentAnnotation__ValueAssignment : ( RULE_COMMENT_ANNOTATION ) ;
    public final void rule__CommentAnnotation__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5409:1: ( ( RULE_COMMENT_ANNOTATION ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5410:1: ( RULE_COMMENT_ANNOTATION )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5410:1: ( RULE_COMMENT_ANNOTATION )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5411:1: RULE_COMMENT_ANNOTATION
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationAccess().getValueCOMMENT_ANNOTATIONTerminalRuleCall_0()); 
            }
            match(input,RULE_COMMENT_ANNOTATION,FollowSets000.FOLLOW_RULE_COMMENT_ANNOTATION_in_rule__CommentAnnotation__ValueAssignment10934); if (state.failed) return ;
            if ( state.backtracking==0 ) {
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
    // $ANTLR end "rule__CommentAnnotation__ValueAssignment"


    // $ANTLR start "rule__TagAnnotation__NameAssignment_1"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5420:1: rule__TagAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TagAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5424:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5425:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5425:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5426:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__TagAnnotation__NameAssignment_110965);
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


    // $ANTLR start "rule__TagAnnotation__AnnotationsAssignment_2_1"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5435:1: rule__TagAnnotation__AnnotationsAssignment_2_1 : ( ruleAnnotation ) ;
    public final void rule__TagAnnotation__AnnotationsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5439:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5440:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5440:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5441:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getAnnotationsAnnotationParserRuleCall_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__TagAnnotation__AnnotationsAssignment_2_110996);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagAnnotationAccess().getAnnotationsAnnotationParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagAnnotation__AnnotationsAssignment_2_1"


    // $ANTLR start "rule__KeyStringValueAnnotation__NameAssignment_1"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5450:1: rule__KeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5454:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5455:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5455:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5456:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__KeyStringValueAnnotation__NameAssignment_111027);
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


    // $ANTLR start "rule__KeyStringValueAnnotation__ValueAssignment_2"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5465:1: rule__KeyStringValueAnnotation__ValueAssignment_2 : ( ruleEString ) ;
    public final void rule__KeyStringValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5469:1: ( ( ruleEString ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5470:1: ( ruleEString )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5470:1: ( ruleEString )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5471:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__KeyStringValueAnnotation__ValueAssignment_211058);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringValueAnnotation__ValueAssignment_2"


    // $ANTLR start "rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5480:1: rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5484:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5485:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5485:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5486:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__KeyStringValueAnnotation__AnnotationsAssignment_3_111089);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__NameAssignment_1"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5495:1: rule__TypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5499:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5500:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5500:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5501:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__NameAssignment_111120);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5510:1: rule__TypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5514:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5515:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5515:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5516:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__TypeAssignment_311151);
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


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__ValueAssignment_5"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5525:1: rule__TypedKeyStringValueAnnotation__ValueAssignment_5 : ( ruleEString ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5529:1: ( ( ruleEString ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5530:1: ( ruleEString )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5530:1: ( ruleEString )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5531:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TypedKeyStringValueAnnotation__ValueAssignment_511182);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__ValueAssignment_5"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5540:1: rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 : ( ruleAnnotation ) ;
    public final void rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5544:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5545:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5545:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5546:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_6_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_111213);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__NameAssignment_1"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5555:1: rule__KeyBooleanValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyBooleanValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5559:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5560:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5560:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5561:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__KeyBooleanValueAnnotation__NameAssignment_111244);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5570:1: rule__KeyBooleanValueAnnotation__ValueAssignment_2 : ( RULE_BOOLEAN ) ;
    public final void rule__KeyBooleanValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5574:1: ( ( RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5575:1: ( RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5575:1: ( RULE_BOOLEAN )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5576:1: RULE_BOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getValueBOOLEANTerminalRuleCall_2_0()); 
            }
            match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_rule__KeyBooleanValueAnnotation__ValueAssignment_211275); if (state.failed) return ;
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


    // $ANTLR start "rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5585:1: rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5589:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5590:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5590:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5591:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_111306);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyBooleanValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1"


    // $ANTLR start "rule__KeyIntValueAnnotation__NameAssignment_1"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5600:1: rule__KeyIntValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyIntValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5604:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5605:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5605:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5606:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__KeyIntValueAnnotation__NameAssignment_111337);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5615:1: rule__KeyIntValueAnnotation__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__KeyIntValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5619:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5620:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5620:1: ( RULE_INT )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5621:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getValueINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__KeyIntValueAnnotation__ValueAssignment_211368); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationAccess().getValueINTTerminalRuleCall_2_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5630:1: rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5634:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5635:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5635:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5636:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__KeyIntValueAnnotation__AnnotationsAssignment_3_111399);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1"


    // $ANTLR start "rule__KeyFloatValueAnnotation__NameAssignment_1"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5645:1: rule__KeyFloatValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyFloatValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5649:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5650:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5650:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5651:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__KeyFloatValueAnnotation__NameAssignment_111430);
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
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5660:1: rule__KeyFloatValueAnnotation__ValueAssignment_2 : ( RULE_FLOAT ) ;
    public final void rule__KeyFloatValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5664:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5665:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5665:1: ( RULE_FLOAT )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5666:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getValueFLOATTerminalRuleCall_2_0()); 
            }
            match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_rule__KeyFloatValueAnnotation__ValueAssignment_211461); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationAccess().getValueFLOATTerminalRuleCall_2_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1"
    // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5675:1: rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5679:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5680:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5680:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:5681:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_111492);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1"

    // $ANTLR start synpred1_InternalSCL
    public final void synpred1_InternalSCL_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1249:1: ( ( ( ruleBoolExpression ) ) )
        // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1249:1: ( ( ruleBoolExpression ) )
        {
        // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1249:1: ( ( ruleBoolExpression ) )
        // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1250:1: ( ruleBoolExpression )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExpressionAccess().getBoolExpressionParserRuleCall_0()); 
        }
        // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1251:1: ( ruleBoolExpression )
        // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1251:3: ruleBoolExpression
        {
        pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_synpred1_InternalSCL2553);
        ruleBoolExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred1_InternalSCL

    // $ANTLR start synpred2_InternalSCL
    public final void synpred2_InternalSCL_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1271:1: ( ( ( rule__CompareOperation__Group_0__0 ) ) )
        // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1271:1: ( ( rule__CompareOperation__Group_0__0 ) )
        {
        // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1271:1: ( ( rule__CompareOperation__Group_0__0 ) )
        // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1272:1: ( rule__CompareOperation__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCompareOperationAccess().getGroup_0()); 
        }
        // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1273:1: ( rule__CompareOperation__Group_0__0 )
        // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1273:2: rule__CompareOperation__Group_0__0
        {
        pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0__0_in_synpred2_InternalSCL2603);
        rule__CompareOperation__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred2_InternalSCL

    // $ANTLR start synpred3_InternalSCL
    public final void synpred3_InternalSCL_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1293:1: ( ( ( ruleValuedExpression ) ) )
        // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1293:1: ( ( ruleValuedExpression ) )
        {
        // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1293:1: ( ( ruleValuedExpression ) )
        // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1294:1: ( ruleValuedExpression )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
        }
        // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1295:1: ( ruleValuedExpression )
        // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1295:3: ruleValuedExpression
        {
        pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_synpred3_InternalSCL2654);
        ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred3_InternalSCL

    // $ANTLR start synpred10_InternalSCL
    public final void synpred10_InternalSCL_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1399:6: ( ( ruleFloatValue ) )
        // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1399:6: ( ruleFloatValue )
        {
        // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1399:6: ( ruleFloatValue )
        // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1400:1: ruleFloatValue
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1()); 
        }
        pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_synpred10_InternalSCL2905);
        ruleFloatValue();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalSCL

    // $ANTLR start synpred11_InternalSCL
    public final void synpred11_InternalSCL_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1405:6: ( ( ruleDoubleValue ) )
        // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1405:6: ( ruleDoubleValue )
        {
        // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1405:6: ( ruleDoubleValue )
        // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1406:1: ruleDoubleValue
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getAtomicValuedExpressionAccess().getDoubleValueParserRuleCall_2()); 
        }
        pushFollow(FollowSets000.FOLLOW_ruleDoubleValue_in_synpred11_InternalSCL2922);
        ruleDoubleValue();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalSCL

    // $ANTLR start synpred12_InternalSCL
    public final void synpred12_InternalSCL_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1411:6: ( ( ( rule__AtomicValuedExpression__Group_3__0 ) ) )
        // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1411:6: ( ( rule__AtomicValuedExpression__Group_3__0 ) )
        {
        // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1411:6: ( ( rule__AtomicValuedExpression__Group_3__0 ) )
        // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1412:1: ( rule__AtomicValuedExpression__Group_3__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_3()); 
        }
        // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1413:1: ( rule__AtomicValuedExpression__Group_3__0 )
        // ../de.cau.cs.kieler.scl.ui/src-gen/de/cau/cs/kieler/scl/ui/contentassist/antlr/internal/InternalSCL.g:1413:2: rule__AtomicValuedExpression__Group_3__0
        {
        pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_3__0_in_synpred12_InternalSCL2939);
        rule__AtomicValuedExpression__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred12_InternalSCL

    // Delegated rules

    public final boolean synpred2_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalSCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalSCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalSCL_fragment(); // can never throw exception
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
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA1_eotS =
        "\14\uffff";
    static final String DFA1_eofS =
        "\14\uffff";
    static final String DFA1_minS =
        "\1\5\11\0\2\uffff";
    static final String DFA1_maxS =
        "\1\41\11\0\2\uffff";
    static final String DFA1_acceptS =
        "\12\uffff\1\1\1\2";
    static final String DFA1_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\10\1\11\1\2\1\3\1\5\6\uffff\1\6\2\uffff\1\12\1\uffff\1\1"+
            "\3\uffff\1\7\7\uffff\1\4",
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
            return "1244:1: rule__Expression__Alternatives : ( ( ( ruleBoolExpression ) ) | ( ruleValuedExpression ) );";
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
                        if ( (synpred1_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index1_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_2 = input.LA(1);

                         
                        int index1_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index1_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_3 = input.LA(1);

                         
                        int index1_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index1_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA1_4 = input.LA(1);

                         
                        int index1_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index1_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA1_5 = input.LA(1);

                         
                        int index1_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index1_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA1_6 = input.LA(1);

                         
                        int index1_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index1_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA1_7 = input.LA(1);

                         
                        int index1_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index1_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA1_8 = input.LA(1);

                         
                        int index1_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index1_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA1_9 = input.LA(1);

                         
                        int index1_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSCL()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index1_9);
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
    static final String DFA2_eotS =
        "\14\uffff";
    static final String DFA2_eofS =
        "\14\uffff";
    static final String DFA2_minS =
        "\1\5\3\uffff\7\0\1\uffff";
    static final String DFA2_maxS =
        "\1\41\3\uffff\7\0\1\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\11\uffff\1\2";
    static final String DFA2_specialS =
        "\4\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\10\1\11\2\1\1\5\6\uffff\1\6\2\uffff\1\12\1\uffff\1\1\3\uffff"+
            "\1\7\7\uffff\1\4",
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

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "1266:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_4 = input.LA(1);

                         
                        int index2_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index2_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_5 = input.LA(1);

                         
                        int index2_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index2_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_6 = input.LA(1);

                         
                        int index2_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index2_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA2_7 = input.LA(1);

                         
                        int index2_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index2_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA2_8 = input.LA(1);

                         
                        int index2_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index2_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA2_9 = input.LA(1);

                         
                        int index2_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index2_9);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA2_10 = input.LA(1);

                         
                        int index2_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
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
    static final String DFA3_eotS =
        "\13\uffff";
    static final String DFA3_eofS =
        "\13\uffff";
    static final String DFA3_minS =
        "\1\5\3\uffff\6\0\1\uffff";
    static final String DFA3_maxS =
        "\1\41\3\uffff\6\0\1\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\10\uffff\1\2";
    static final String DFA3_specialS =
        "\4\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\10\1\11\2\1\1\5\6\uffff\1\6\2\uffff\1\12\1\uffff\1\1\3\uffff"+
            "\1\7\7\uffff\1\4",
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

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "1288:1: rule__NotOrValuedExpression__Alternatives : ( ( ( ruleValuedExpression ) ) | ( ruleNotExpression ) );";
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
                        if ( (synpred3_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index3_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_5 = input.LA(1);

                         
                        int index3_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index3_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA3_6 = input.LA(1);

                         
                        int index3_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index3_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA3_7 = input.LA(1);

                         
                        int index3_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index3_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA3_8 = input.LA(1);

                         
                        int index3_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index3_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA3_9 = input.LA(1);

                         
                        int index3_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalSCL()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index3_9);
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
    static final String DFA7_eotS =
        "\14\uffff";
    static final String DFA7_eofS =
        "\14\uffff";
    static final String DFA7_minS =
        "\1\5\1\uffff\2\0\10\uffff";
    static final String DFA7_maxS =
        "\1\41\1\uffff\2\0\10\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\2\uffff\1\5\4\uffff\1\2\1\3\1\4";
    static final String DFA7_specialS =
        "\2\uffff\1\0\1\1\10\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\4\1\1\1\2\1\4\6\uffff\1\4\10\uffff\1\4\7\uffff\1\3",
            "",
            "\1\uffff",
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

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1388:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleDoubleValue ) | ( ( rule__AtomicValuedExpression__Group_3__0 ) ) | ( ruleAtomicExpression ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_2 = input.LA(1);

                         
                        int index7_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalSCL()) ) {s = 9;}

                        else if ( (synpred11_InternalSCL()) ) {s = 10;}

                         
                        input.seek(index7_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_3 = input.LA(1);

                         
                        int index7_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalSCL()) ) {s = 11;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index7_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA10_eotS =
        "\14\uffff";
    static final String DFA10_eofS =
        "\3\uffff\1\6\7\uffff\1\6";
    static final String DFA10_minS =
        "\1\12\1\uffff\1\5\1\4\1\5\6\uffff\1\4";
    static final String DFA10_maxS =
        "\1\43\1\uffff\1\5\1\46\1\5\6\uffff\1\46";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\3\uffff\1\7\1\2\1\6\1\4\1\3\1\5\1\uffff";
    static final String DFA10_specialS =
        "\14\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\1\30\uffff\1\2",
            "",
            "\1\3",
            "\2\11\1\uffff\1\7\1\5\1\12\1\6\26\uffff\3\6\1\10\1\uffff\1"+
            "\4",
            "\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\11\1\uffff\1\7\1\5\1\12\1\6\26\uffff\3\6\1\10\1\uffff\1"+
            "\4"
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1473:1: rule__Annotation__Alternatives : ( ( ruleCommentAnnotation ) | ( ruleTagAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) );";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModule_in_entryRuleModule67 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModule74 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Module__Group__0_in_ruleModule100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression129 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Alternatives_in_ruleExpression162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression189 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolExpression196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_ruleBoolExpression222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression248 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group__0_in_ruleOrExpression281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression308 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group__0_in_ruleAndExpression341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation368 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Alternatives_in_ruleCompareOperation401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression428 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNotOrValuedExpression435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotOrValuedExpression__Alternatives_in_ruleNotOrValuedExpression461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_entryRuleNotExpression488 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNotExpression495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__Alternatives_in_ruleNotExpression521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression548 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedExpression555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_ruleValuedExpression581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_entryRuleAddExpression607 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAddExpression614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__0_in_ruleAddExpression640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubExpression_in_entryRuleSubExpression667 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubExpression674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group__0_in_ruleSubExpression700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_entryRuleMultExpression727 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultExpression734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__0_in_ruleMultExpression760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivExpression_in_entryRuleDivExpression787 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDivExpression794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group__0_in_ruleDivExpression820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_entryRuleModExpression847 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModExpression854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group__0_in_ruleModExpression880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegExpression_in_entryRuleNegExpression907 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNegExpression914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NegExpression__Alternatives_in_ruleNegExpression940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression967 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpression974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Alternatives_in_ruleAtomicExpression1000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression1027 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicValuedExpression1034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Alternatives_in_ruleAtomicValuedExpression1060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression1087 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectTestExpression1094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Alternatives_in_ruleValuedObjectTestExpression1120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference1147 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectReference1154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectReference__ValuedObjectAssignment_in_ruleValuedObjectReference1180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_entryRuleTextExpression1207 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextExpression1214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__TextAssignment_in_ruleTextExpression1240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue1267 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntValue1274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue1300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue1327 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue1334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue1360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolValue_in_entryRuleBoolValue1387 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolValue1394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoolValue__ValueAssignment_in_ruleBoolValue1420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoubleValue_in_entryRuleDoubleValue1447 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDoubleValue1454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DoubleValue__ValueAssignment_in_ruleDoubleValue1480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation1509 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation1516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__Alternatives_in_ruleAnnotation1542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation1571 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCommentAnnotation1578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CommentAnnotation__ValueAssignment_in_ruleCommentAnnotation1604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation1631 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTagAnnotation1638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__0_in_ruleTagAnnotation1664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation1691 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation1698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__0_in_ruleKeyStringValueAnnotation1724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation1751 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation1758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0_in_ruleTypedKeyStringValueAnnotation1784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation1811 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation1818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__0_in_ruleKeyBooleanValueAnnotation1844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation1871 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation1878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__0_in_ruleKeyIntValueAnnotation1904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation1931 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation1938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__0_in_ruleKeyFloatValueAnnotation1964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1993 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString2000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString2026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID2053 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID2060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__0_in_ruleExtendedID2086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperator__Alternatives_in_ruleCompareOperator2123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rulePreOperator2160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleOrOperator2199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleAndOperator2238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleNotOperator2277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleAddOperator2316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleSubOperator2355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleMultOperator2394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleModOperator2433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleDivOperator2472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleValOperator2511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_rule__Expression__Alternatives2553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_rule__Expression__Alternatives2571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0__0_in_rule__CompareOperation__Alternatives2603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_rule__CompareOperation__Alternatives2621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_rule__NotOrValuedExpression__Alternatives2654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_rule__NotOrValuedExpression__Alternatives2672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__0_in_rule__NotExpression__Alternatives2704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_rule__NotExpression__Alternatives2722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NegExpression__Group_0__0_in_rule__NegExpression__Alternatives2754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_rule__NegExpression__Alternatives2772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolValue_in_rule__AtomicExpression__Alternatives2804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_rule__AtomicExpression__Alternatives2821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__0_in_rule__AtomicExpression__Alternatives2838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_rule__AtomicExpression__Alternatives2856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValue_in_rule__AtomicValuedExpression__Alternatives2888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_rule__AtomicValuedExpression__Alternatives2905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoubleValue_in_rule__AtomicValuedExpression__Alternatives2922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_3__0_in_rule__AtomicValuedExpression__Alternatives2939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_rule__AtomicValuedExpression__Alternatives2957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__0_in_rule__ValuedObjectTestExpression__Alternatives2989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectReference_in_rule__ValuedObjectTestExpression__Alternatives3007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePreOperator_in_rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_03039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValOperator_in_rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_03056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_rule__Annotation__Alternatives3089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_rule__Annotation__Alternatives3106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_rule__Annotation__Alternatives3123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_rule__Annotation__Alternatives3140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_rule__Annotation__Alternatives3157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_rule__Annotation__Alternatives3174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_rule__Annotation__Alternatives3191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives3224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives3241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__CompareOperator__Alternatives3274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__CompareOperator__Alternatives3295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__CompareOperator__Alternatives3316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__CompareOperator__Alternatives3337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__CompareOperator__Alternatives3358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__CompareOperator__Alternatives3379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__03414 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Module__Group__1_in_rule__Module__Group__03417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Module__Group__0__Impl3445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__13476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Module__NameAssignment_1_in_rule__Module__Group__1__Impl3503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__03537 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__03540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__Group__0__Impl3567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__13596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl3623 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__03658 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__03661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__13719 = new BitSet(new long[]{0x00000002022903E0L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__2_in_rule__OrExpression__Group_1__13722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__OperatorAssignment_1_1_in_rule__OrExpression__Group_1__1__Impl3749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__2__Impl_in_rule__OrExpression__Group_1__23779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__SubExpressionsAssignment_1_2_in_rule__OrExpression__Group_1__2__Impl3806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__03842 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__03845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_rule__AndExpression__Group__0__Impl3872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__13901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl3928 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__03963 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__03966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__14024 = new BitSet(new long[]{0x00000002022903E0L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__2_in_rule__AndExpression__Group_1__14027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__OperatorAssignment_1_1_in_rule__AndExpression__Group_1__1__Impl4054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__2__Impl_in_rule__AndExpression__Group_1__24084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__SubExpressionsAssignment_1_2_in_rule__AndExpression__Group_1__2__Impl4111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0__0__Impl_in_rule__CompareOperation__Group_0__04147 = new BitSet(new long[]{0x00000000FC000000L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0__1_in_rule__CompareOperation__Group_0__04150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_rule__CompareOperation__Group_0__0__Impl4178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0__1__Impl_in_rule__CompareOperation__Group_0__14208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__0_in_rule__CompareOperation__Group_0__1__Impl4235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__0__Impl_in_rule__CompareOperation__Group_0_1__04269 = new BitSet(new long[]{0x00000000FC000000L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__1_in_rule__CompareOperation__Group_0_1__04272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__1__Impl_in_rule__CompareOperation__Group_0_1__14330 = new BitSet(new long[]{0x00000002022903E0L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__2_in_rule__CompareOperation__Group_0_1__14333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__OperatorAssignment_0_1_1_in_rule__CompareOperation__Group_0_1__1__Impl4360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__2__Impl_in_rule__CompareOperation__Group_0_1__24390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__SubExpressionsAssignment_0_1_2_in_rule__CompareOperation__Group_0_1__2__Impl4417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__0__Impl_in_rule__NotExpression__Group_0__04453 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__1_in_rule__NotExpression__Group_0__04456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__1__Impl_in_rule__NotExpression__Group_0__14514 = new BitSet(new long[]{0x00000002022903E0L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__2_in_rule__NotExpression__Group_0__14517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__OperatorAssignment_0_1_in_rule__NotExpression__Group_0__1__Impl4544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__2__Impl_in_rule__NotExpression__Group_0__24574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__SubExpressionsAssignment_0_2_in_rule__NotExpression__Group_0__2__Impl4601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__0__Impl_in_rule__AddExpression__Group__04637 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__1_in_rule__AddExpression__Group__04640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubExpression_in_rule__AddExpression__Group__0__Impl4667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__1__Impl_in_rule__AddExpression__Group__14696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__0_in_rule__AddExpression__Group__1__Impl4723 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__0__Impl_in_rule__AddExpression__Group_1__04758 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__1_in_rule__AddExpression__Group_1__04761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__1__Impl_in_rule__AddExpression__Group_1__14819 = new BitSet(new long[]{0x00000002022103E0L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__2_in_rule__AddExpression__Group_1__14822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__OperatorAssignment_1_1_in_rule__AddExpression__Group_1__1__Impl4849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__2__Impl_in_rule__AddExpression__Group_1__24879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__SubExpressionsAssignment_1_2_in_rule__AddExpression__Group_1__2__Impl4906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group__0__Impl_in_rule__SubExpression__Group__04942 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__SubExpression__Group__1_in_rule__SubExpression__Group__04945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_rule__SubExpression__Group__0__Impl4972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group__1__Impl_in_rule__SubExpression__Group__15001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__0_in_rule__SubExpression__Group__1__Impl5028 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__0__Impl_in_rule__SubExpression__Group_1__05063 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__1_in_rule__SubExpression__Group_1__05066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__1__Impl_in_rule__SubExpression__Group_1__15124 = new BitSet(new long[]{0x00000002022103E0L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__2_in_rule__SubExpression__Group_1__15127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__OperatorAssignment_1_1_in_rule__SubExpression__Group_1__1__Impl5154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__2__Impl_in_rule__SubExpression__Group_1__25184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__SubExpressionsAssignment_1_2_in_rule__SubExpression__Group_1__2__Impl5211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__0__Impl_in_rule__MultExpression__Group__05247 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__1_in_rule__MultExpression__Group__05250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivExpression_in_rule__MultExpression__Group__0__Impl5277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__1__Impl_in_rule__MultExpression__Group__15306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__0_in_rule__MultExpression__Group__1__Impl5333 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__0__Impl_in_rule__MultExpression__Group_1__05368 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__1_in_rule__MultExpression__Group_1__05371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__1__Impl_in_rule__MultExpression__Group_1__15429 = new BitSet(new long[]{0x00000002022103E0L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__2_in_rule__MultExpression__Group_1__15432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__OperatorAssignment_1_1_in_rule__MultExpression__Group_1__1__Impl5459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__2__Impl_in_rule__MultExpression__Group_1__25489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__SubExpressionsAssignment_1_2_in_rule__MultExpression__Group_1__2__Impl5516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group__0__Impl_in_rule__DivExpression__Group__05552 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__DivExpression__Group__1_in_rule__DivExpression__Group__05555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_rule__DivExpression__Group__0__Impl5582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group__1__Impl_in_rule__DivExpression__Group__15611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group_1__0_in_rule__DivExpression__Group__1__Impl5638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group_1__0__Impl_in_rule__DivExpression__Group_1__05673 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__DivExpression__Group_1__1_in_rule__DivExpression__Group_1__05676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group_1__1__Impl_in_rule__DivExpression__Group_1__15734 = new BitSet(new long[]{0x00000002022103E0L});
        public static final BitSet FOLLOW_rule__DivExpression__Group_1__2_in_rule__DivExpression__Group_1__15737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__OperatorAssignment_1_1_in_rule__DivExpression__Group_1__1__Impl5764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group_1__2__Impl_in_rule__DivExpression__Group_1__25794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__SubExpressionsAssignment_1_2_in_rule__DivExpression__Group_1__2__Impl5821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group__0__Impl_in_rule__ModExpression__Group__05857 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__ModExpression__Group__1_in_rule__ModExpression__Group__05860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegExpression_in_rule__ModExpression__Group__0__Impl5887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group__1__Impl_in_rule__ModExpression__Group__15916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__0_in_rule__ModExpression__Group__1__Impl5943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__0__Impl_in_rule__ModExpression__Group_1__05978 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__1_in_rule__ModExpression__Group_1__05981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__1__Impl_in_rule__ModExpression__Group_1__16039 = new BitSet(new long[]{0x00000002022103E0L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__2_in_rule__ModExpression__Group_1__16042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__OperatorAssignment_1_1_in_rule__ModExpression__Group_1__1__Impl6069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__2__Impl_in_rule__ModExpression__Group_1__26099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__SubExpressionsAssignment_1_2_in_rule__ModExpression__Group_1__2__Impl6126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NegExpression__Group_0__0__Impl_in_rule__NegExpression__Group_0__06162 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__NegExpression__Group_0__1_in_rule__NegExpression__Group_0__06165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NegExpression__Group_0__1__Impl_in_rule__NegExpression__Group_0__16223 = new BitSet(new long[]{0x00000002022103E0L});
        public static final BitSet FOLLOW_rule__NegExpression__Group_0__2_in_rule__NegExpression__Group_0__16226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NegExpression__OperatorAssignment_0_1_in_rule__NegExpression__Group_0__1__Impl6253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NegExpression__Group_0__2__Impl_in_rule__NegExpression__Group_0__26283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NegExpression__SubExpressionsAssignment_0_2_in_rule__NegExpression__Group_0__2__Impl6310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__0__Impl_in_rule__AtomicExpression__Group_2__06346 = new BitSet(new long[]{0x00000002022903E0L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__1_in_rule__AtomicExpression__Group_2__06349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__AtomicExpression__Group_2__0__Impl6377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__1__Impl_in_rule__AtomicExpression__Group_2__16408 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__2_in_rule__AtomicExpression__Group_2__16411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_rule__AtomicExpression__Group_2__1__Impl6438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__2__Impl_in_rule__AtomicExpression__Group_2__26467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__AtomicExpression__Group_2__2__Impl6495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_3__0__Impl_in_rule__AtomicValuedExpression__Group_3__06532 = new BitSet(new long[]{0x00000002022103E0L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_3__1_in_rule__AtomicValuedExpression__Group_3__06535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__AtomicValuedExpression__Group_3__0__Impl6564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_3__1__Impl_in_rule__AtomicValuedExpression__Group_3__16596 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_3__2_in_rule__AtomicValuedExpression__Group_3__16599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_rule__AtomicValuedExpression__Group_3__1__Impl6626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_3__2__Impl_in_rule__AtomicValuedExpression__Group_3__26655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__AtomicValuedExpression__Group_3__2__Impl6683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__0__Impl_in_rule__ValuedObjectTestExpression__Group_0__06720 = new BitSet(new long[]{0x0000000002010000L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__1_in_rule__ValuedObjectTestExpression__Group_0__06723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__1__Impl_in_rule__ValuedObjectTestExpression__Group_0__16781 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__2_in_rule__ValuedObjectTestExpression__Group_0__16784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__OperatorAssignment_0_1_in_rule__ValuedObjectTestExpression__Group_0__1__Impl6811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__2__Impl_in_rule__ValuedObjectTestExpression__Group_0__26841 = new BitSet(new long[]{0x0000000002010020L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__3_in_rule__ValuedObjectTestExpression__Group_0__26844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__ValuedObjectTestExpression__Group_0__2__Impl6872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__3__Impl_in_rule__ValuedObjectTestExpression__Group_0__36903 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__4_in_rule__ValuedObjectTestExpression__Group_0__36906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3_in_rule__ValuedObjectTestExpression__Group_0__3__Impl6933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__4__Impl_in_rule__ValuedObjectTestExpression__Group_0__46963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__ValuedObjectTestExpression__Group_0__4__Impl6991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__0__Impl_in_rule__TagAnnotation__Group__07032 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__1_in_rule__TagAnnotation__Group__07035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__TagAnnotation__Group__0__Impl7063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__1__Impl_in_rule__TagAnnotation__Group__17094 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__2_in_rule__TagAnnotation__Group__17097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__NameAssignment_1_in_rule__TagAnnotation__Group__1__Impl7124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__2__Impl_in_rule__TagAnnotation__Group__27154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__0_in_rule__TagAnnotation__Group__2__Impl7181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__0__Impl_in_rule__TagAnnotation__Group_2__07218 = new BitSet(new long[]{0x0000000C00000400L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__1_in_rule__TagAnnotation__Group_2__07221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__TagAnnotation__Group_2__0__Impl7249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__1__Impl_in_rule__TagAnnotation__Group_2__17280 = new BitSet(new long[]{0x0000000C00000400L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__2_in_rule__TagAnnotation__Group_2__17283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__AnnotationsAssignment_2_1_in_rule__TagAnnotation__Group_2__1__Impl7310 = new BitSet(new long[]{0x0000000800000402L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__2__Impl_in_rule__TagAnnotation__Group_2__27341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__TagAnnotation__Group_2__2__Impl7369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__0__Impl_in_rule__KeyStringValueAnnotation__Group__07406 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__1_in_rule__KeyStringValueAnnotation__Group__07409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__KeyStringValueAnnotation__Group__0__Impl7437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__1__Impl_in_rule__KeyStringValueAnnotation__Group__17468 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__2_in_rule__KeyStringValueAnnotation__Group__17471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__NameAssignment_1_in_rule__KeyStringValueAnnotation__Group__1__Impl7498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__2__Impl_in_rule__KeyStringValueAnnotation__Group__27528 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__3_in_rule__KeyStringValueAnnotation__Group__27531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__ValueAssignment_2_in_rule__KeyStringValueAnnotation__Group__2__Impl7558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__3__Impl_in_rule__KeyStringValueAnnotation__Group__37588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__0_in_rule__KeyStringValueAnnotation__Group__3__Impl7615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__0__Impl_in_rule__KeyStringValueAnnotation__Group_3__07654 = new BitSet(new long[]{0x0000000C00000400L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__1_in_rule__KeyStringValueAnnotation__Group_3__07657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__KeyStringValueAnnotation__Group_3__0__Impl7685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__1__Impl_in_rule__KeyStringValueAnnotation__Group_3__17716 = new BitSet(new long[]{0x0000000C00000400L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__2_in_rule__KeyStringValueAnnotation__Group_3__17719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyStringValueAnnotation__Group_3__1__Impl7746 = new BitSet(new long[]{0x0000000800000402L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__2__Impl_in_rule__KeyStringValueAnnotation__Group_3__27777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__KeyStringValueAnnotation__Group_3__2__Impl7805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group__07842 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1_in_rule__TypedKeyStringValueAnnotation__Group__07845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__TypedKeyStringValueAnnotation__Group__0__Impl7873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group__17904 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2_in_rule__TypedKeyStringValueAnnotation__Group__17907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__NameAssignment_1_in_rule__TypedKeyStringValueAnnotation__Group__1__Impl7934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group__27964 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3_in_rule__TypedKeyStringValueAnnotation__Group__27967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__TypedKeyStringValueAnnotation__Group__2__Impl7995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3__Impl_in_rule__TypedKeyStringValueAnnotation__Group__38026 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4_in_rule__TypedKeyStringValueAnnotation__Group__38029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__TypeAssignment_3_in_rule__TypedKeyStringValueAnnotation__Group__3__Impl8056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4__Impl_in_rule__TypedKeyStringValueAnnotation__Group__48086 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5_in_rule__TypedKeyStringValueAnnotation__Group__48089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__TypedKeyStringValueAnnotation__Group__4__Impl8117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5__Impl_in_rule__TypedKeyStringValueAnnotation__Group__58148 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6_in_rule__TypedKeyStringValueAnnotation__Group__58151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__ValueAssignment_5_in_rule__TypedKeyStringValueAnnotation__Group__5__Impl8178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6__Impl_in_rule__TypedKeyStringValueAnnotation__Group__68208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0_in_rule__TypedKeyStringValueAnnotation__Group__6__Impl8235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__08280 = new BitSet(new long[]{0x0000000C00000400L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1_in_rule__TypedKeyStringValueAnnotation__Group_6__08283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl8311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__18342 = new BitSet(new long[]{0x0000000C00000400L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__2_in_rule__TypedKeyStringValueAnnotation__Group_6__18345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1_in_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl8372 = new BitSet(new long[]{0x0000000800000402L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__28403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__TypedKeyStringValueAnnotation__Group_6__2__Impl8431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__0__Impl_in_rule__KeyBooleanValueAnnotation__Group__08468 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__1_in_rule__KeyBooleanValueAnnotation__Group__08471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__KeyBooleanValueAnnotation__Group__0__Impl8499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__1__Impl_in_rule__KeyBooleanValueAnnotation__Group__18530 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__2_in_rule__KeyBooleanValueAnnotation__Group__18533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__NameAssignment_1_in_rule__KeyBooleanValueAnnotation__Group__1__Impl8560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__2__Impl_in_rule__KeyBooleanValueAnnotation__Group__28590 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__3_in_rule__KeyBooleanValueAnnotation__Group__28593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__ValueAssignment_2_in_rule__KeyBooleanValueAnnotation__Group__2__Impl8620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__3__Impl_in_rule__KeyBooleanValueAnnotation__Group__38650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__0_in_rule__KeyBooleanValueAnnotation__Group__3__Impl8677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__0__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__08716 = new BitSet(new long[]{0x0000000C00000400L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__1_in_rule__KeyBooleanValueAnnotation__Group_3__08719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__KeyBooleanValueAnnotation__Group_3__0__Impl8747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__1__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__18778 = new BitSet(new long[]{0x0000000C00000400L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__2_in_rule__KeyBooleanValueAnnotation__Group_3__18781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyBooleanValueAnnotation__Group_3__1__Impl8808 = new BitSet(new long[]{0x0000000800000402L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__2__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__28839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__KeyBooleanValueAnnotation__Group_3__2__Impl8867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__0__Impl_in_rule__KeyIntValueAnnotation__Group__08904 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__1_in_rule__KeyIntValueAnnotation__Group__08907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__KeyIntValueAnnotation__Group__0__Impl8935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__1__Impl_in_rule__KeyIntValueAnnotation__Group__18966 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__2_in_rule__KeyIntValueAnnotation__Group__18969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__NameAssignment_1_in_rule__KeyIntValueAnnotation__Group__1__Impl8996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__2__Impl_in_rule__KeyIntValueAnnotation__Group__29026 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__3_in_rule__KeyIntValueAnnotation__Group__29029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__ValueAssignment_2_in_rule__KeyIntValueAnnotation__Group__2__Impl9056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__3__Impl_in_rule__KeyIntValueAnnotation__Group__39086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__0_in_rule__KeyIntValueAnnotation__Group__3__Impl9113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__0__Impl_in_rule__KeyIntValueAnnotation__Group_3__09152 = new BitSet(new long[]{0x0000000C00000400L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__1_in_rule__KeyIntValueAnnotation__Group_3__09155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__KeyIntValueAnnotation__Group_3__0__Impl9183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__1__Impl_in_rule__KeyIntValueAnnotation__Group_3__19214 = new BitSet(new long[]{0x0000000C00000400L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__2_in_rule__KeyIntValueAnnotation__Group_3__19217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyIntValueAnnotation__Group_3__1__Impl9244 = new BitSet(new long[]{0x0000000800000402L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__2__Impl_in_rule__KeyIntValueAnnotation__Group_3__29275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__KeyIntValueAnnotation__Group_3__2__Impl9303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__0__Impl_in_rule__KeyFloatValueAnnotation__Group__09340 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__1_in_rule__KeyFloatValueAnnotation__Group__09343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__KeyFloatValueAnnotation__Group__0__Impl9371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__1__Impl_in_rule__KeyFloatValueAnnotation__Group__19402 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__2_in_rule__KeyFloatValueAnnotation__Group__19405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__NameAssignment_1_in_rule__KeyFloatValueAnnotation__Group__1__Impl9432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__2__Impl_in_rule__KeyFloatValueAnnotation__Group__29462 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__3_in_rule__KeyFloatValueAnnotation__Group__29465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__ValueAssignment_2_in_rule__KeyFloatValueAnnotation__Group__2__Impl9492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__3__Impl_in_rule__KeyFloatValueAnnotation__Group__39522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__0_in_rule__KeyFloatValueAnnotation__Group__3__Impl9549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__0__Impl_in_rule__KeyFloatValueAnnotation__Group_3__09588 = new BitSet(new long[]{0x0000000C00000400L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__1_in_rule__KeyFloatValueAnnotation__Group_3__09591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__KeyFloatValueAnnotation__Group_3__0__Impl9619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__1__Impl_in_rule__KeyFloatValueAnnotation__Group_3__19650 = new BitSet(new long[]{0x0000000C00000400L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__2_in_rule__KeyFloatValueAnnotation__Group_3__19653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyFloatValueAnnotation__Group_3__1__Impl9680 = new BitSet(new long[]{0x0000000800000402L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__2__Impl_in_rule__KeyFloatValueAnnotation__Group_3__29711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__KeyFloatValueAnnotation__Group_3__2__Impl9739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__0__Impl_in_rule__ExtendedID__Group__09777 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__1_in_rule__ExtendedID__Group__09780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ExtendedID__Group__0__Impl9807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__1__Impl_in_rule__ExtendedID__Group__19836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_1__0_in_rule__ExtendedID__Group__1__Impl9863 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_1__0__Impl_in_rule__ExtendedID__Group_1__09898 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_1__1_in_rule__ExtendedID__Group_1__09901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__ExtendedID__Group_1__0__Impl9929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_1__1__Impl_in_rule__ExtendedID__Group_1__19960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ExtendedID__Group_1__1__Impl9987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Module__NameAssignment_110025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrOperator_in_rule__OrExpression__OperatorAssignment_1_110056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__SubExpressionsAssignment_1_210087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndOperator_in_rule__AndExpression__OperatorAssignment_1_110118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_rule__AndExpression__SubExpressionsAssignment_1_210149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperator_in_rule__CompareOperation__OperatorAssignment_0_1_110180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_rule__CompareOperation__SubExpressionsAssignment_0_1_210211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOperator_in_rule__NotExpression__OperatorAssignment_0_110242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_rule__NotExpression__SubExpressionsAssignment_0_210273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddOperator_in_rule__AddExpression__OperatorAssignment_1_110304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubExpression_in_rule__AddExpression__SubExpressionsAssignment_1_210335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubOperator_in_rule__SubExpression__OperatorAssignment_1_110366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_rule__SubExpression__SubExpressionsAssignment_1_210397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultOperator_in_rule__MultExpression__OperatorAssignment_1_110428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivExpression_in_rule__MultExpression__SubExpressionsAssignment_1_210459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivOperator_in_rule__DivExpression__OperatorAssignment_1_110490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_rule__DivExpression__SubExpressionsAssignment_1_210521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModOperator_in_rule__ModExpression__OperatorAssignment_1_110552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_rule__ModExpression__SubExpressionsAssignment_1_210583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubOperator_in_rule__NegExpression__OperatorAssignment_0_110614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegExpression_in_rule__NegExpression__SubExpressionsAssignment_0_210645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0_in_rule__ValuedObjectTestExpression__OperatorAssignment_0_110676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_310709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ValuedObjectReference__ValuedObjectAssignment10744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_HOSTCODE_in_rule__TextExpression__TextAssignment10779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment10810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_rule__FloatValue__ValueAssignment10841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__BoolValue__ValueAssignment10872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_rule__DoubleValue__ValueAssignment10903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_COMMENT_ANNOTATION_in_rule__CommentAnnotation__ValueAssignment10934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__TagAnnotation__NameAssignment_110965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__TagAnnotation__AnnotationsAssignment_2_110996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyStringValueAnnotation__NameAssignment_111027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__KeyStringValueAnnotation__ValueAssignment_211058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__KeyStringValueAnnotation__AnnotationsAssignment_3_111089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__NameAssignment_111120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__TypeAssignment_311151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TypedKeyStringValueAnnotation__ValueAssignment_511182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_111213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyBooleanValueAnnotation__NameAssignment_111244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__KeyBooleanValueAnnotation__ValueAssignment_211275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_111306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyIntValueAnnotation__NameAssignment_111337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__KeyIntValueAnnotation__ValueAssignment_211368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__KeyIntValueAnnotation__AnnotationsAssignment_3_111399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyFloatValueAnnotation__NameAssignment_111430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_rule__KeyFloatValueAnnotation__ValueAssignment_211461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_111492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_synpred1_InternalSCL2553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0__0_in_synpred2_InternalSCL2603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_synpred3_InternalSCL2654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_synpred10_InternalSCL2905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoubleValue_in_synpred11_InternalSCL2922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_3__0_in_synpred12_InternalSCL2939 = new BitSet(new long[]{0x0000000000000002L});
    }


}